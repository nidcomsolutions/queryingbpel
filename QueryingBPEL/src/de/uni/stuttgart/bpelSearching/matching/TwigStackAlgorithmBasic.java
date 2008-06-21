/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.index.NodeInStack;
import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Implements the Twigstack algorithm for query tree and process tree.
 * 
 * @author luwei
 *
 */
public class TwigStackAlgorithmBasic extends TwigStackAlgorithm {
	
	/**
	 * Creates a new TwigStackAlgorithmBasic object for the specified query tree 
	 * and process tree, initialize stream and solution stack for each query
	 * node.
	 * 
	 * @param qg the query graph.
	 * @param pg the process graph.
	 */
	public TwigStackAlgorithmBasic(QueryGraph qg, ProcessFlowGraph pg) {
		super(qg, pg);
		// TODO Auto-generated constructor stub
	}
	
	
    /**
     * @see TwigStackAlgorithm#twigStackExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackExactMatch(ActivityNode q){
		
		ActivityNode qact, parentQact;
		
		if (allQuerySubtreeNodesStreamsNotEmpty(q)) {		
			// Phase 1: Some (but not all) solutions to individual
			// query root-to-leaf paths are computed.
			while (!end(q)) {			
				qact = getNext(q);			
				parentQact = querygraph.parent(qact);
						
				if (!querygraph.isRoot(qact) && !queryNodeStreamMap.get(qact).isEmpty()) {
					cleanStack(querygraph.parent(qact), queryNodeStreamMap.get(qact).getFirst().getPreorderRank());
				}
			
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
					if (!queryNodeStreamMap.get(qact).isEmpty()) {
						cleanStack(qact, queryNodeStreamMap.get(qact).getFirst().getPreorderRank());
					}
					moveStreamToStack(qact);
				
					if (querygraph.isLeaf(qact)) {
						actLeafNode = qact;
						//queryLeafNodesSolution.add(qact);
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
		
			mergeAllPathSolutions(q);		
			printSolutionsForExactMatch(q);
		}		
	}
	
	
    /**
     * @see TwigStackAlgorithm#twigStackInExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackInExactMatch(ActivityNode q){		
		ActivityNode qact, parentQact, root;
		LinkedList<NodeRegionEncoding> tqact;
		Stack<NodeInStack> sqact;
		LinkedList<NodeRegionEncoding> tParentQact;
		Stack<NodeInStack> sParentQact;
		LinkedList<NodeRegionEncoding> tRoot;
		Stack<NodeInStack> sRoot;
		Stack<NodeInStack> sA, sB, sC1, sC2;
		ActivityNode query2A, query2B, query2C1, query2C2;
		
//		if (allQuerySubtreeNodesStreamsNotEmpty(q)) {

//			root = querygraph.getStartVertex();
		
			// Phase 1: Some (but not all) solutions to individual
			// query root-to-leaf paths are computed.
			while (!end(q)) {			
				qact = getNext(q);			
				parentQact = querygraph.parent(qact);
			
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
					cleanStack(querygraph.parent(qact), queryNodeStreamMap.get(qact).getFirst().getPreorderRank());
				}
			
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
					if (!queryNodeStreamMap.get(qact).isEmpty()) {
						cleanStack(qact, queryNodeStreamMap.get(qact).getFirst().getPreorderRank());
					}
					//moveStreamToStack(tqact, sqact, queryNodeStackMap.get(parentQact).lastElement());
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
				
			// **** for debug ****
//			Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
//			ActivityNode cNode;
//			Stack<NodePair> sNPair;
//			for (ActivityNode queryNode : vertexSetQuery) { 			
//				sNPair = solutionStackMap.get(queryNode);
//				if (sNPair.size() > 0) {
//					cNode = sNPair.get(0).getNode();
//				}
//			}
			// **** end debug ****
		
			mergeAllPathSolutions(q);		
			printSolutionsForInExactMatch(q);
//		}		
	}
	
	
    /**
     * Outputs solutions to individual query paths in root-to-leaf order.
     * 
     * @param q query node q.
     * @param stackpos the position in current stack that we are interested in for the current solution.
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
				temp = querygraph.parent(temp);
			}
			//System.out.println(tempString);
			logger.warn(tempString);
			
		} else {
			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			temp = querygraph.parent(q);
			tempStack = queryNodeStackMap.get(querygraph.parent(q));
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
		ActivityNode temp, tempParent, tempSolutionNode,tempSolutionParentNode;
		Stack<NodeInStack> parentStack;
		String tempID = " ";
		String tempParentID = " ";
		int parentStackIndex, tempIndex, tempParentIndex;
		NodeInStack parentNodeInStack;
		NodePair nPair;
		boolean nodePairExist, nodeParentExist;
		
		queryNodeStackPositionMap.put(q, new Integer(stackpos));
		
		if (querygraph.isRoot(q)) {

			temp = actLeafNode;
			
			while (temp != null) {
				
				tempIndex = queryNodeStackPositionMap.get(temp).intValue();
				tempID = queryNodeStackMap.get(temp).get(tempIndex).getNode().getActivityID();
				tempSolutionNode = processgraph.getActivity(tempID);
				
				Iterator<NodePair> stackIter = solutionStackMap.get(temp).iterator();
				nodePairExist = false;
				nodeParentExist = false;
				
				tempParent = querygraph.parent(temp);
				if (tempParent == null) {
					tempSolutionParentNode  = null;
					while (stackIter.hasNext() && !nodePairExist) {
						nPair = stackIter.next();						
						if (tempID.compareTo(nPair.getNode().getActivityID()) == 0) {
								nodePairExist = true;
								//nodeParentExist = true;
								//nPair.setExistMultipleParentsInStack(true);
							}										
					}										
					
				} else {
					tempParentIndex = queryNodeStackPositionMap.get(tempParent).intValue();
					tempParentID = queryNodeStackMap.get(tempParent).get(tempParentIndex).getNode().getActivityID();
					tempSolutionParentNode  = processgraph.getActivity(tempParentID);
					
					while (stackIter.hasNext() && !nodePairExist) {
						nPair = stackIter.next();						
						if (tempParentID.compareTo(nPair.getParentNode().getActivityID()) == 0) {
							nodeParentExist = true;
							if (!nPair.getExistMultipleParentsInStack()) {
								nPair.setExistMultipleParentsInStack(true);
							}
							
							if (tempID.compareTo(nPair.getNode().getActivityID()) == 0) {
								nodePairExist = true;
							}						
						}				
					}
					
				}
				

				if (!nodePairExist) {
					solutionStackMap.get(temp).push(new NodePair(tempSolutionNode, tempSolutionParentNode, 
							new LinkedList<StringBuffer>(), nodeParentExist, 0)); 
					}
				temp = querygraph.parent(temp);				
			}
			
		} else {
			
			parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			parentStack = queryNodeStackMap.get(querygraph.parent(q));
			parentStackIndex = parentStack.indexOf(parentNodeInStack);
			
			for (int i = 0; i <= parentStackIndex; i++) {
				processSolutions(querygraph.parent(q), i);				
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
