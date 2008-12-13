/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.ProcessNodePair;

/**
 * An implementation of the Twigstack algorithm.
 * 
 * @author luwei
 *
 */
public class TwigStackAlgorithmBasic extends TwigStackAlgorithm {
	
    /**
     * A chain of stacks for each query node to encode the final results.
     */
	protected static Map<String, Stack<ProcessNodePair>> solutionStackMap;
	
    /**
     * Stores current position of the stack from queryNodeStackMap.
     */
	protected static Map<String, Integer> queryNodeStackPositionMap;	
	
    /**
     * Stores the region encoding of children nodes for each joined results of joined node. 
     */
	protected static Map<StringBuffer, LinkedList<NodeRegionEncoding>> joinedResultsChildrenNodesMap;	
	
	/**
	 * Creates a new TwigStackAlgorithmBasic object for the specified query tree 
	 * and process tree, initialize stream and solution stack for each query node.
	 * 
	 * @param pg the process graph.
	 */
	public TwigStackAlgorithmBasic(ProcessGraph pg) {
		super(pg);
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		for (ActivityNode queryNode : vertexSetQuery) {	
//			solutionStackMap.put(queryNode.getActivityID(), new Stack<ProcessNodePair>());
			if (!solutionStackMap.get(queryNode.getActivityID()).isEmpty()) {
				solutionStackMap.get(queryNode.getActivityID()).clear();
			}
		}
		if (!queryNodeStackPositionMap.isEmpty()) {
			queryNodeStackPositionMap.clear();
		}
		if (!joinedResultsChildrenNodesMap.isEmpty()) {
			joinedResultsChildrenNodesMap.clear();
		}
	}
	
    /**
     * @see TwigStackAlgorithm#twigStackExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackExactMatch(ActivityNode q){
		
		ActivityNode qact, parentQact;
		LinkedList<NodeRegionEncoding> streamqact, streamParentQact;
		Stack<NodeInStack> sqact, sParentQact;
		logger.warn("*** run TwigStackAlgorithmBasic ***");
		if (allQuerySubtreeNodesStreamsNotEmpty(q)) {		
			// Phase 1: Some (but not all) solutions to individual
			// query root-to-leaf paths are computed.
			while (!end(q)) {			
				qact = getNextForExactMatch(q);			
				parentQact = querygraph.getParent(qact);
				
				streamqact = queryNodeStreamMap.get(qact.getActivityID());
				sqact = queryNodeStackMap.get(qact.getActivityID());
		
//				streamParentQact = queryNodeStreamMap.get(parentQact.getActivityID());
//				sParentQact = queryNodeStackMap.get(parentQact.getActivityID());
				
				if (!querygraph.isRoot(qact) && !queryNodeStreamMap.get(qact.getActivityID()).isEmpty()) {
					cleanStack(querygraph.getParent(qact), 
							queryNodeStreamMap.get(qact.getActivityID()).getFirst().getStart());
				}
			
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact.getActivityID()).isEmpty()) {
					if (!queryNodeStreamMap.get(qact.getActivityID()).isEmpty()) {
						cleanStack(qact, queryNodeStreamMap.get(qact.getActivityID()).getFirst().getStart());
					}
					moveStreamToStack(qact);
				
					if (querygraph.isLeaf(qact)) {
						actLeafNode = qact;
						queryLeafNodesSolution.add(qact);
						//showSolutions(qact, 0);
						processSolutions(qact, 0);
						queryNodeStackMap.get(qact.getActivityID()).pop();					
					}				
					//queryNodeStackMap.put(qact, sqact);				
				} else {
					if (!queryNodeStreamMap.get(qact.getActivityID()).isEmpty()) {
						queryNodeStreamMap.get(qact.getActivityID()).removeFirst();
					}
				}			
				//queryNodeStreamMap.put(qact.getActivityID(), tqact);			
			}
			
			// Phase 2: These solutions are merge joined to computer the answers to 
			// the query twig pattern.
			if (getMatchPathRatio() == 1.0) {
				this.hasExactMatch = true;
				queryIDsTobeAssigned = new ArrayList<String>();
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
			
				tqact = queryNodeStreamMap.get(qact.getActivityID());
				sqact = queryNodeStackMap.get(qact.getActivityID());		
//				tParentQact = queryNodeStreamMap.get(parentQact.getActivityID());
//				sParentQact = queryNodeStackMap.get(parentQact.getActivityID());	
//				tRoot = queryNodeStreamMap.get(root.getActivityID());
//				sRoot = queryNodeStackMap.get(root.getActivityID());			
				if (!querygraph.isRoot(qact) && !queryNodeStreamMap.get(qact.getActivityID()).isEmpty()) {
					cleanStack(querygraph.getParent(qact), 
							queryNodeStreamMap.get(qact.getActivityID()).getFirst().getStart());
				}
			
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact.getActivityID()).isEmpty()) {
					if (!queryNodeStreamMap.get(qact.getActivityID()).isEmpty()) {
						cleanStack(qact, queryNodeStreamMap.get(qact.getActivityID()).getFirst().getStart());
					}
					moveStreamToStack(qact);
				
					if (querygraph.isLeaf(qact)) {
						actLeafNode = qact;
						queryLeafNodesSolution.add(qact);
						//showSolutions(qact, 0);
						processSolutions(qact, 0);
						queryNodeStackMap.get(qact.getActivityID()).pop();					
					}							
				} else {
					if (!queryNodeStreamMap.get(qact.getActivityID()).isEmpty()) {
						queryNodeStreamMap.get(qact.getActivityID()).removeFirst();
					}
				}					
			}
			
			// **** for debug ****
//			Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
//			ActivityNode cNode;
//			Stack<ProcessNodePair> sNPair;
//			for (ActivityNode queryNode : vertexSetQuery) { 			
//				sNPair = solutionStackMap.get(queryNode.getActivityID());
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
			if (!queryNodeStreamMap.get(ni.getActivityID()).isEmpty()) {
				if ((ni.getActivityID().compareTo(childQi.getActivityID()) != 0) 
						|| existGetNextChildStreamEmpty) {
						return ni;
					}
				niL = queryNodeStreamMap.get(ni.getActivityID()).getFirst().getStart();			
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
		
		while (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q.getActivityID()).removeFirst();
		}
			
		// For inexact matching
		//if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).getFirst().getPreorderRank() < minL)) {
		// For exact matching, but still has problem if sibling nodes the same are
		if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).getFirst().getStart()
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
			
			if (!queryNodeStreamMap.get(ni.getActivityID()).isEmpty()) {
				niL = queryNodeStreamMap.get(ni.getActivityID()).getFirst().getStart();			
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
		
		while (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && 
				(queryNodeStreamMap.get(q.getActivityID()).getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q.getActivityID()).removeFirst();
		}
		
		// For exact matching, but still has problem if sibling nodes the same are
//		if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).
//			getFirst().getPreorderRank() < minL) && !existGetNextChildStreamEmpty) {		
		// For inexact matching
		if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && 
				(queryNodeStreamMap.get(q.getActivityID()).getFirst().getStart() < minL)) {
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
		
		queryNodeStackPositionMap.put(q.getActivityID(), new Integer(stackpos));
		
		if (querygraph.isRoot(q)) {
			logger.warn("Output path solution");
			temp = actLeafNode;
			
			while (temp != null) {
				tempStack = queryNodeStackMap.get(temp.getActivityID());
				tempIndex = queryNodeStackPositionMap.get(temp.getActivityID()).intValue();
				tempID = tempStack.get(tempIndex).getNode().getActivityID();
				tempString = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ tempString;
				temp = querygraph.getParent(temp);
			}
			//System.out.println(tempString);
			logger.warn(tempString);
			
		} else {			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q.getActivityID()).get(stackpos).getNext();
			temp = querygraph.getParent(q);
			tempStack = queryNodeStackMap.get(querygraph.getParent(q).getActivityID());
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
		
		queryNodeStackPositionMap.put(q.getActivityID(), new Integer(stackpos));
		
		if (querygraph.isRoot(q)) {
			temp = actLeafNode;			
			while (temp != null) {				
				tempIndex = queryNodeStackPositionMap.get(temp.getActivityID()).intValue();
				tempID = queryNodeStackMap.get(temp.getActivityID()).get(tempIndex).getNode().getActivityID();
				
				Iterator<ProcessNodePair> stackIter = solutionStackMap.get(temp.getActivityID()).iterator();
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
					tempParentIndex = queryNodeStackPositionMap.get(tempParent.getActivityID()).intValue();
					tempParentID = queryNodeStackMap.get(tempParent.getActivityID()).get(tempParentIndex).
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
					solutionStackMap.get(temp.getActivityID()).push(new ProcessNodePair(tempID, 
							tempParentID, new LinkedList<StringBuffer>(), nodeParentExist, 0)); 
					}
				temp = querygraph.getParent(temp);				
			}			
		} else {			
			parentNodeInStack = queryNodeStackMap.get(q.getActivityID()).get(stackpos).getNext();
			parentStack = queryNodeStackMap.get(querygraph.getParent(q).getActivityID());
			parentStackIndex = parentStack.indexOf(parentNodeInStack);
			
			for (int i = 0; i <= parentStackIndex; i++) {
				processSolutions(querygraph.getParent(q), i);				
			}			
		}		
	}
	
    /**
     * Merge all path solutions to form a final solution for the given twig pattern query. 
     *
     * @param q root node of the query graph
     *
     */	
	public void mergeAllPathSolutions(ActivityNode q) 
	{	
		int i, childrenQSize;
		boolean lastChild;
		Set<ActivityNode> childrenQ = querygraph.getChildrenFromMap(q);		
		i = 0;
		childrenQSize =  childrenQ.size();
		queryIDsTobeAssigned.add(q.getActivityID());
		for (ActivityNode childQi : childrenQ) {
			i++;		
			if (i == childrenQSize) {
				lastChild = true;
			} else {
				lastChild = false;
			}
			
			mergeAllPathSolutions(childQi);
			joinParentChildSolutions(q, childQi, lastChild);						
		}
				
	}

    /**
     * Join the encoded solutions for a parent query node and a child query node. 
     *
     * @param nodeParent query parent node.
     * @param node query child node.
     * @param isLastChild indicate whether the child node is the last child of nodeParent.
     * 
     */	
	protected void joinParentChildSolutions(ActivityNode nodeParent, ActivityNode node, boolean isLastChild) 
	{
		int i, j, k, l, m, pSize, cSize, listLengthToProcessP, listLengthC, 
			listLengthChildrenSolutionP, originalJoinedResultsSizeP, indexOfIDSep;
		StringBuffer strbuf1, tempStrbuf;
		String ppNodeID, pNodeID, cNodeID, tempStr;
		boolean hasParentJoinedResults, hasChildJoinedResults, isJoinable, 
			hasMultipleChildrenP, hasChildrenSolutionPList;
		ListIterator<StringBuffer> iterator;
		LinkedList<StringBuffer> joinedResultsParentNode;
		LinkedList<NodeRegionEncoding> childrenSolutionPList, joinedResultsChildrenNodesList;
		NodeRegionEncoding cNRE, tempNRE;
		
		Stack<ProcessNodePair> parentqStack = solutionStackMap.get(nodeParent.getActivityID());
		Stack<ProcessNodePair> childqStack = solutionStackMap.get(node.getActivityID());
		
		if ((parentqStack != null) && (childqStack != null)) {		
			pSize = parentqStack.size();
			cSize = childqStack.size();
			hasMultipleChildrenP = querygraph.isForkNode(nodeParent);
		
			for (i = 0; i < pSize; i++) {			
				joinedResultsParentNode = parentqStack.get(i).getJoinedResults();		
				originalJoinedResultsSizeP = parentqStack.get(i).getOriginalJoinedResultsSize();
				hasParentJoinedResults = (joinedResultsParentNode.size() > 0);	
				ppNodeID = parentqStack.get(i).getParentNodeID();
				pNodeID = parentqStack.get(i).getNodeID();
				
				for (j = 0; j < cSize; j++) {					
					cNodeID = childqStack.get(j).getNodeID();
					cNRE = processgraph.getNodeRegionEncoding(cNodeID);
					
					if (pNodeID.compareTo(childqStack.get(j).getParentNodeID()) == 0) {
						
						hasChildJoinedResults = (childqStack.get(j).getJoinedResults().size() > 0);
						
						if (!hasParentJoinedResults && !hasChildJoinedResults) {
							strbuf1 = new StringBuffer();
							if (ppNodeID != "") {
								strbuf1.append(ppNodeID).append(idSeparator);
							}
							strbuf1.append(pNodeID).append(idSeparator).append(cNodeID);
							joinedResultsParentNode.add(strbuf1);
							
							if(hasMultipleChildrenP) {
								joinedResultsChildrenNodesList = new LinkedList<NodeRegionEncoding>();
								joinedResultsChildrenNodesList.add(cNRE);
								joinedResultsChildrenNodesMap.put(strbuf1, joinedResultsChildrenNodesList);
							}
							
						} else if (hasParentJoinedResults && !hasChildJoinedResults) {					
							if (childqStack.get(j).getExistMultipleParentsInStack()) {								
								if (originalJoinedResultsSizeP == 0 ) {
									originalJoinedResultsSizeP = joinedResultsParentNode.size();
								}
								listLengthToProcessP = originalJoinedResultsSizeP;
							} else {
								listLengthToProcessP = joinedResultsParentNode.size();
							}
							
							for (k = 0; k < listLengthToProcessP; k++) {									
								isJoinable = true;
								childrenSolutionPList = joinedResultsChildrenNodesMap.get(joinedResultsParentNode.get(k));
								if (childrenSolutionPList != null ) {
									listLengthChildrenSolutionP = childrenSolutionPList.size();
									for (l = 0; l < listLengthChildrenSolutionP; l++) { 
										tempNRE = childrenSolutionPList.get(l);
										if(((cNRE.getStart() < tempNRE.getStart()) && (cNRE.getEnd() > tempNRE.getEnd()))
										|| ((cNRE.getStart() > tempNRE.getStart()) && (cNRE.getEnd() < tempNRE.getEnd()))) {
											isJoinable = false;
											break;
										}																		
									}																										
								}
								
								if(isJoinable){
									strbuf1 = new StringBuffer();
									strbuf1.append(joinedResultsParentNode.get(k)).append(idSeparator).append(cNodeID);
									joinedResultsParentNode.add(strbuf1);

									if(!isLastChild) {
										joinedResultsChildrenNodesList = new LinkedList<NodeRegionEncoding>();
										joinedResultsChildrenNodesList.addAll(childrenSolutionPList);
										joinedResultsChildrenNodesList.add(cNRE);
										joinedResultsChildrenNodesMap.put(strbuf1, joinedResultsChildrenNodesList);	
									}
								}								
							}
							
							if (!(childqStack.get(j).getExistMultipleParentsInStack())) {
								for (k = 0; k < listLengthToProcessP; k++) {
									joinedResultsChildrenNodesMap.remove(joinedResultsParentNode.removeFirst());
								}
							}							
						} else if (!hasParentJoinedResults && hasChildJoinedResults) {														
							iterator = childqStack.get(j).getJoinedResults().listIterator();
							while (iterator.hasNext()) {									
								strbuf1 = new StringBuffer();
								if (ppNodeID != "") {
									strbuf1.append(ppNodeID).append(idSeparator);
								}
								strbuf1.append(iterator.next());
								joinedResultsParentNode.add(strbuf1);
																				
								if(hasMultipleChildrenP) {
									joinedResultsChildrenNodesList = new LinkedList<NodeRegionEncoding>();
									joinedResultsChildrenNodesList.add(cNRE);
									joinedResultsChildrenNodesMap.put(strbuf1, joinedResultsChildrenNodesList);
								}	
							}							
						} else {
							if (originalJoinedResultsSizeP == 0 ) {
								originalJoinedResultsSizeP = joinedResultsParentNode.size();															
							}
							listLengthC = childqStack.get(j).getJoinedResults().size();																					
							for (k = 0; k < originalJoinedResultsSizeP; k++) {	
								tempStrbuf = joinedResultsParentNode.get(k);
								isJoinable = true;
								childrenSolutionPList = joinedResultsChildrenNodesMap.get(tempStrbuf);
								hasChildrenSolutionPList = (childrenSolutionPList != null );
								if (hasChildrenSolutionPList) {
									listLengthChildrenSolutionP = childrenSolutionPList.size();
									for (l = 0; l < listLengthChildrenSolutionP; l++) { 
										tempNRE = childrenSolutionPList.get(l);
										if(((cNRE.getStart() < tempNRE.getStart()) && (cNRE.getEnd() > tempNRE.getEnd()))
										|| ((cNRE.getStart() > tempNRE.getStart()) && (cNRE.getEnd() < tempNRE.getEnd()))) {
											isJoinable = false;
											break;
										}																		
									}																										
								}

								if(isJoinable){
									for (m = 0; m < listLengthC; m++) {
										strbuf1 = new StringBuffer();
										tempStr = childqStack.get(j).getJoinedResults().get(m).toString();
										indexOfIDSep = tempStr.indexOf(idSeparator);
										
										strbuf1.append(tempStrbuf).append(idSeparator).append
											(tempStr.substring(indexOfIDSep+1));									
										joinedResultsParentNode.add(strbuf1);

										if(!isLastChild) {
											joinedResultsChildrenNodesList = new LinkedList<NodeRegionEncoding>();
											joinedResultsChildrenNodesList.add(cNRE);
											if (hasChildrenSolutionPList) {
												joinedResultsChildrenNodesList.addAll(childrenSolutionPList);	
											}
											joinedResultsChildrenNodesMap.put(strbuf1, joinedResultsChildrenNodesList);
										}
									}
								}								
							}																										
						}
					}					
				}				
				
				if (originalJoinedResultsSizeP > 0) {
					for (l = 0; l < originalJoinedResultsSizeP; l++) {					
						//parentqStack.get(i).getJoinedResults().removeFirst();
						joinedResultsChildrenNodesMap.remove(parentqStack.get(i).getJoinedResults().removeFirst());
					}
					parentqStack.get(i).setOriginalJoinedResultsSize(0);
				}
			}									
		}				
	}
	
	
    /**
     * Print exact matching solutions for the query subtree rooted at 
     * the given query node that are stored in the corresponding final 
     * solution stack. Store the exact matching solutions in attribute 
     * <code>exactMatchingResults</code>.
     *
     * @param q query root node.
     *
     */	
	public void printSolutionsForExactMatch(ActivityNode q) 
	{		
		ProcessNodePair nPair;
		ListIterator<StringBuffer> iterator;
		StringBuffer iterNext;
		this.exactMatchingResults = new ExactMatchingResult(processgraph.getProcessID(), 
				processgraph.getProcessNamespace(), processgraph.getProcessName());
		this.exactMatchingResults.setQueryIDsTobeAssigned(getQueryIDsTobeAssigned());
		ArrayList<String> tempMatch;
		StringTokenizer st;
		
		// Means query graph contains only one node, if query graph connected is 
		boolean qHasNoChild = (querygraph.getChildrenFromMap(q).size() == 0);
		
		Stack<ProcessNodePair> qStack = solutionStackMap.get(q.getActivityID());
		
//		String resultProcessInfo = "Exact matching process >> process ID: " + processgraph.getProcessID() + 
//		"  process namespace: " + processgraph.getProcessNamespace() + 
//		"  process name: " + processgraph.getProcessName();
//		logger.warn(resultProcessInfo);
//		logger.warn("Contains following exact matchings for the given query: ");
		if(qHasNoChild) {
			while (!qStack.isEmpty()) {
				nPair = qStack.pop();
//				logger.warn(nPair.getNodeID());
				tempMatch = new ArrayList<String>();
				tempMatch.add(nPair.getNodeID());
				this.exactMatchingResults.getExactMatchings().add(tempMatch);
			}						
		} else {
			while (!qStack.isEmpty()) {
				nPair = qStack.pop();
				iterator = nPair.getJoinedResults().listIterator(); 
				while (iterator.hasNext()) {
					iterNext = iterator.next();
//					logger.warn(iterNext);
					st = new StringTokenizer(iterNext.toString());
					tempMatch = new ArrayList<String>();
					while (st.hasMoreTokens()) {
						tempMatch.add(st.nextToken());
					}
					this.exactMatchingResults.getExactMatchings().add(tempMatch);
				}
			}
		}
	}
	
    /**
     * Print inexact matching solutions for the query subtree rooted at 
     * the given query node that are stored in the corresponding final 
     * solution stack.  
     *
     * @param q query root node.
     * @param threshold the below threshold for returning of inexact matching results.
     *
     */	
	public void printSolutionsForInExactMatch(ActivityNode q, float threshold) 
	{	
		ProcessNodePair nPair;
		ListIterator< StringBuffer > iterator;
		String resultProcessInfo, matchingResults = " ";
		float matchSimilarity = getMatchPathRatio();
		int matchingResultsCount = 0;
		// Means query graph contains only one node, if query graph connected is 
		boolean qHasNoChild = (querygraph.getChildrenFromMap(q).size() == 0);
		
		if (matchSimilarity > threshold) {
			
			resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
			"  process namespace: " + processgraph.getProcessNamespace() + 
			"  process name: " + processgraph.getProcessName();
			
			logger.warn(resultProcessInfo);

			
			Stack<ProcessNodePair> qStack = solutionStackMap.get(q.getActivityID());
			
			if(qHasNoChild) {
				while (!qStack.isEmpty()) {
					nPair = qStack.pop();
					//logger.warn(nPair.getNode());
					matchingResultsCount++;
					matchingResults += nPair.getNodeID() + " - ";
				}						
			} else {
				while (!qStack.isEmpty()) {
					nPair = qStack.pop();
					iterator = nPair.getJoinedResults().listIterator(); 
					while (iterator.hasNext()) {
						//logger.warn(iterator.next());	
						matchingResultsCount++;
						matchingResults += iterator.next() + " - ";
					}
				}
			}
			logger.warn("Has matching Similarity: " + matchSimilarity + "   Has " + matchingResultsCount + " matching results: " + matchingResults);
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

	public static Map<String, Stack<ProcessNodePair>> getSolutionStackMap() {
		return solutionStackMap;
	}

	public static void setSolutionStackMap(
			Map<String, Stack<ProcessNodePair>> solutionStackMap) {
		TwigStackAlgorithmBasic.solutionStackMap = solutionStackMap;
	}

	public static Map<String, Integer> getQueryNodeStackPositionMap() {
		return queryNodeStackPositionMap;
	}

	public static void setQueryNodeStackPositionMap(
			Map<String, Integer> queryNodeStackPositionMap) {
		TwigStackAlgorithmBasic.queryNodeStackPositionMap = queryNodeStackPositionMap;
	}

	public static Map<StringBuffer, LinkedList<NodeRegionEncoding>> getJoinedResultsChildrenNodesMap() {
		return joinedResultsChildrenNodesMap;
	}

	public static void setJoinedResultsChildrenNodesMap(
			Map<StringBuffer, LinkedList<NodeRegionEncoding>> joinedResultsChildrenNodesMap) {
		TwigStackAlgorithmBasic.joinedResultsChildrenNodesMap = joinedResultsChildrenNodesMap;
	}


}
