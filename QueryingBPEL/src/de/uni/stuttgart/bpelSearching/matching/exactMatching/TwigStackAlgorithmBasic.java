/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.matching.ProcessNodePair;

/**
 * An implementation of the Twigstack algorithm.
 * 
 * @author luwei
 *
 */
public class TwigStackAlgorithmBasic extends TwigStackAlgorithm {	
	/**
	 * Creates a new TwigStackAlgorithmBasic object for the specified query tree 
	 * and process tree, initialize stream and solution stack for each query node.
	 * 
	 * @param pg the process graph.
	 */
	public TwigStackAlgorithmBasic(ProcessGraph pg) {
		super(pg);
	}
	
    /**
     * @see TwigStackAlgorithm#twigStackExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackExactMatch(ActivityNode q){
		
		ActivityNode qact, parentQact;
		LinkedList<NodeRegionEncoding> streamqact, streamParentQact;
		Stack<NodeInStack> sqact, sParentQact;
		
		if (allQuerySubtreeNodesStreamsNotEmpty(q)) {		
			// Phase 1: Some (but not all) solutions to individual
			// query root-to-leaf paths are computed.
			while (!end(q)) {			
				qact = getNextForExactMatch(q);			
				parentQact = querygraph.getParent(qact);
				
				streamqact = queryNodeStreamMap.get(qact);
				sqact = queryNodeStackMap.get(qact);
		
				streamParentQact = queryNodeStreamMap.get(parentQact);
				sParentQact = queryNodeStackMap.get(parentQact);
				
				if (!querygraph.isRoot(qact) && !queryNodeStreamMap.get(qact).isEmpty()) {
					cleanStack(querygraph.getParent(qact), 
							queryNodeStreamMap.get(qact).getFirst().getStart());
				}
			
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
					if (!queryNodeStreamMap.get(qact).isEmpty()) {
						cleanStack(qact, queryNodeStreamMap.get(qact).getFirst().getStart());
					}
					moveStreamToStack(qact);
				
					if (querygraph.isLeaf(qact)) {
						actLeafNode = qact;
						queryLeafNodesSolution.add(qact);
						//showSolutions(qact, 0);
						processSolutions(qact, 0);
						queryNodeStackMap.get(qact).pop();					
					}				
					//queryNodeStackMap.put(qact, sqact);				
				} else {
					if (!queryNodeStreamMap.get(qact).isEmpty()) {
						queryNodeStreamMap.get(qact).removeFirst();
					}
				}			
				//queryNodeStreamMap.put(qact, tqact);			
			}
			
			// Phase 2: These solutions are merge joined to computer the answers to 
			// the query twig pattern.
			if (getMatchPathRatio() == 1.0) {
				this.hasExactMatch = true;
				mergeAllPathSolutions(q);		
				printSolutionsForExactMatch(q);	
			}
		}		
	}
	
	
    /**
     * @see TwigStackAlgorithm#twigStackInExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackInExactMatch(ActivityNode q, float threshold){		
		ActivityNode qact, parentQact, root;
		LinkedList<NodeRegionEncoding> tqact;
		Stack<NodeInStack> sqact;
		LinkedList<NodeRegionEncoding> tParentQact;
		Stack<NodeInStack> sParentQact;
		LinkedList<NodeRegionEncoding> tRoot;
		Stack<NodeInStack> sRoot;
		Stack<NodeInStack> sA, sB, sC1, sC2;
		ActivityNode query2A, query2B, query2C1, query2C2;

//			root = querygraph.getStartVertex();
		
			// Phase 1: Some (but not all) solutions to individual
			// query root-to-leaf paths are computed.
			while (!end(q)) {			
				qact = getNextForInexactMatch(q);			
				parentQact = querygraph.getParent(qact);
			
				tqact = queryNodeStreamMap.get(qact);
				sqact = queryNodeStackMap.get(qact);
			
				tParentQact = queryNodeStreamMap.get(parentQact);
				sParentQact = queryNodeStackMap.get(parentQact);
//			
//				tRoot = queryNodeStreamMap.get(root);
//				sRoot = queryNodeStackMap.get(root);
			
//				sA = queryNodeStackMap.get(querygraph.getActivityNode("q2A"));
//				sB = queryNodeStackMap.get(querygraph.getActivityNode("q2B"));
//				sC1 = queryNodeStackMap.get(querygraph.getActivityNode("q2C1"));
//				sC2 = queryNodeStackMap.get(querygraph.getActivityNode("q2C2"));
			
			
				if (!querygraph.isRoot(qact) && !queryNodeStreamMap.get(qact).isEmpty()) {
					cleanStack(querygraph.getParent(qact), 
							queryNodeStreamMap.get(qact).getFirst().getStart());
				}
			
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
					if (!queryNodeStreamMap.get(qact).isEmpty()) {
						cleanStack(qact, queryNodeStreamMap.get(qact).getFirst().getStart());
					}
					moveStreamToStack(qact);
				
					if (querygraph.isLeaf(qact)) {
						actLeafNode = qact;
						queryLeafNodesSolution.add(qact);
						//showSolutions(qact, 0);
						processSolutions(qact, 0);
						queryNodeStackMap.get(qact).pop();					
					}							
				} else {
					if (!queryNodeStreamMap.get(qact).isEmpty()) {
						queryNodeStreamMap.get(qact).removeFirst();
					}
				}					
			}
			
			// **** for debug ****
//			Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
//			ActivityNode cNode;
//			Stack<ProcessNodePair> sNPair;
//			for (ActivityNode queryNode : vertexSetQuery) { 			
//				sNPair = solutionStackMap.get(queryNode);
//				if (sNPair.size() > 0) {
//					cNode = sNPair.get(0).getNode();
//				}
//			}
			// **** end debug ****
			
			// Phase 2: These solutions are merge joined to computer the answers to 
			// the query twig pattern.		
			mergeAllPathSolutions(q);		
			printSolutionsForInExactMatch(q, threshold);
	}
	
    /**
     * Gets the next node to be processed, which has a minimal solution extension,
     * for the exact matching algorithm.
     *
     * @param q a query node
     *
     * @return the next node to be processed
     */
	protected ActivityNode getNextForExactMatch(ActivityNode q)
	{
		ActivityNode ni, nmin;
		int minL, maxL, niL;
		boolean existGetNextChildStreamEmpty = false;
		
		minL = processgraph.getMaxEnd();
		maxL = 0;
		niL = 0;
		nmin = q;
		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextForExactMatch(childQi);
			//if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				if ((ni.getActivityID().compareTo(childQi.getActivityID()) != 0) 
						|| existGetNextChildStreamEmpty) {
						return ni;
					}
				niL = queryNodeStreamMap.get(ni).getFirst().getStart();			
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}		
				if (niL > maxL) {
					maxL = niL;
				}
			} else {
				// There is a child solution whose data stream is empty
				existGetNextChildStreamEmpty = true;				
			}
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			
		// For inexact matching
		//if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getPreorderRank() < minL)) {
		// For exact matching, but still has problem if sibling nodes the same are
		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getStart()
				< minL) && !existGetNextChildStreamEmpty) {
			return q;			
		} else {
			return nmin;			
		}
	}
	
    /**
     * Gets the next node to be processed, which has a minimal solution extension, 
     * for the inexact matching algorithm.
     *
     * @param q a query node
     *
     * @return the next node to be processed
     */
	protected ActivityNode getNextForInexactMatch(ActivityNode q)
	{
		ActivityNode ni, nmin;
		int minL, maxL, niL;
		//boolean existGetNextChildStreamEmpty;
		
		minL = processgraph.getMaxEnd();
		maxL = 0;
		niL = 0;
		nmin = q;
		//existGetNextChildStreamEmpty = false;
		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextForInexactMatch(childQi);
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
			//if ((ni.getActivityID().compareTo(childQi.getActivityID()) != 0) 
			//	|| existGetNextChildStreamEmpty) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				niL = queryNodeStreamMap.get(ni).getFirst().getStart();			
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}			
				if (niL > maxL) {
					maxL = niL;
				}
			} 
			//else {
				// There is a child solution whose data stream is empty
				//existGetNextChildStreamEmpty = true;				
			//}
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && 
				(queryNodeStreamMap.get(q).getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
		
		// For exact matching, but still has problem if sibling nodes the same are
//		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
//			getFirst().getPreorderRank() < minL) && !existGetNextChildStreamEmpty) {		
		// For inexact matching
		if (!queryNodeStreamMap.get(q).isEmpty() && 
				(queryNodeStreamMap.get(q).getFirst().getStart() < minL)) {
			return q;			
		} else {
			return nmin;			
		}
	}
	
    /**
     * Outputs solutions to individual query paths in root-to-leaf order.
     * 
     * @param q query node q.
     * @param stackpos the position in current stack that we are interested in 
     * 					for the current solution.
     *
     */	
	protected void showSolutions(ActivityNode q, int stackpos) {
		ActivityNode temp;
		Stack<NodeInStack> tempStack;
		String tempString = " ";
		String tempID = " ";
		int parentStackIndex, tempIndex;
		
		queryNodeStackPositionMap.put(q, new Integer(stackpos));
		
		if (querygraph.isRoot(q)) {
			logger.warn("Output path solution");
			temp = actLeafNode;
			
			while (temp != null) {
				tempStack = queryNodeStackMap.get(temp);
				tempIndex = queryNodeStackPositionMap.get(temp).intValue();
				tempID = tempStack.get(tempIndex).getNode().getActivityID();
				tempString = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ tempString;
				temp = querygraph.getParent(temp);
			}
			//System.out.println(tempString);
			logger.warn(tempString);
			
		} else {			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			temp = querygraph.getParent(q);
			tempStack = queryNodeStackMap.get(querygraph.getParent(q));
			parentStackIndex = tempStack.indexOf(parentNodeInStack);
			
			for (int i = 0; i <= parentStackIndex; i++) {
				showSolutions(temp, i);				
			}			
		}		
	}
	
    /**
     * Process each query path solution, store them in final solution stack.
     * 
     * @param q query node q.
     * @param stackpos the stack position that we are interested in to compute the solution.
     *
     */	
	protected void processSolutions(ActivityNode q, int stackpos) {
		ActivityNode temp, tempParent;
		Stack<NodeInStack> parentStack;
		String tempID = "";
		String tempParentID = "";
		int parentStackIndex, tempIndex, tempParentIndex;
		NodeInStack parentNodeInStack;
		ProcessNodePair nPair;
		boolean nodePairExist, nodeParentExist;
		
		queryNodeStackPositionMap.put(q, new Integer(stackpos));
		
		if (querygraph.isRoot(q)) {
			temp = actLeafNode;			
			while (temp != null) {				
				tempIndex = queryNodeStackPositionMap.get(temp).intValue();
				tempID = queryNodeStackMap.get(temp).get(tempIndex).getNode().getActivityID();
				
				Iterator<ProcessNodePair> stackIter = solutionStackMap.get(temp).iterator();
				nodePairExist = false;
				nodeParentExist = false;				
				tempParent = querygraph.getParent(temp);
				if (tempParent == null) {
					tempParentID = "";
					while (stackIter.hasNext() && !nodePairExist) {
						nPair = stackIter.next();						
						if (tempID.compareTo(nPair.getNodeID()) == 0) {
								nodePairExist = true;
								//nodeParentExist = true;
								//nPair.setExistMultipleParentsInStack(true);
							}										
					}														
				} else {
					tempParentIndex = queryNodeStackPositionMap.get(tempParent).intValue();
					tempParentID = queryNodeStackMap.get(tempParent).get(tempParentIndex).
									getNode().getActivityID();
					
					while (stackIter.hasNext() && !nodePairExist) {
						nPair = stackIter.next();						
						if (tempParentID.compareTo(nPair.getParentNodeID()) == 0) {
							nodeParentExist = true;
							if (!nPair.getExistMultipleParentsInStack()) {
								nPair.setExistMultipleParentsInStack(true);
							}
							
							if (tempID.compareTo(nPair.getNodeID()) == 0) {
								nodePairExist = true;
							}						
						}				
					}					
				}
				
				if (!nodePairExist) {
					solutionStackMap.get(temp).push(new ProcessNodePair(tempID, 
							tempParentID, new LinkedList<StringBuffer>(), nodeParentExist, 0)); 
					}
				temp = querygraph.getParent(temp);				
			}			
		} else {			
			parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			parentStack = queryNodeStackMap.get(querygraph.getParent(q));
			parentStackIndex = parentStack.indexOf(parentNodeInStack);
			
			for (int i = 0; i <= parentStackIndex; i++) {
				processSolutions(querygraph.getParent(q), i);				
			}			
		}		
	}
		
    /**
     * Outputs solutions to individual query paths in root-to-leaf order with blocking.
     * 
     * @param q query node q.
     * @param stackpos the position in current stack that we are interested in for the current solution.
     *
     */	
	protected void showSolutionsWithBlocking(ActivityNode q, int stackpos) {
					
	}
}
