/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.PoolItem3Ext;

/**
 * Implements the DagStackD algorithm for matching a rooted DAG pattern query against 
 * a rooted DAG pattern process graph. The implementation is based on the modified 
 * TwigStackD algorithm.
 * 
 * @author luwei
 *
 */
public class DagStackDAlgorithm extends TwigStackD2Algorithm {
	
	/**
	 * Creates a new DagStackDAlgorithm object for the specified process graph, initialize stream, 
	 * solution stack, partial solution pool for each query node.
	 * 
	 * @param pg the process graph.
	 */
	public DagStackDAlgorithm(ProcessGraph pg) {
		super(pg);
	}

    /**
     * @see TwigStackD2Algorithm#twigStackExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackExactMatch(ActivityNode q) {
		ActivityNode qact, parentQact;
		LinkedList<NodeRegionEncoding> streamqact;
		float matchPathsRatio;
		NodeRegionEncoding tqactCurrent;
		int tqactPos;

		logger.warn("***run modified DAGStackD***");
		if (allQuerySubtreeNodesStreamsNotEmpty(q)) {	
			while (!end(q)) {
				resetStreamPositionMap();
				qact = getNextExtForExactMatch(q);
				parentQact = querygraph.getParentNodeInMST(qact);		
				streamqact = queryNodeStreamMap.get(qact.getActivityID());
				
				if (streamqact.isEmpty()) {
					logger.warn("Stop processing the given process graph!");
					break;
				} else {
					tqactPos = queryNodeStreamPositionMap.get(qact.getActivityID()).intValue();
					if (checkSubtreeStreams(qact)) {
						queryNodeStreamMap.get(qact.getActivityID()).remove(tqactPos);
					} else {
						tqactCurrent = queryNodeStreamMap.get(qact.getActivityID()).get(tqactPos);
						if (!querygraph.isRoot(qact)) {
							cleanStack(parentQact, tqactCurrent.getStart());
						}
							
						if (querygraph.isRoot(qact) || !queryNodeStackMap.get
								(parentQact.getActivityID()).isEmpty()) {
							cleanStack(qact, tqactCurrent.getStart());
							moveStreamToStack(qact);
							sweepPartialSolutionsTSD2(qact, tqactCurrent);
								
							if (querygraph.isLeafInMST(qact)) {
								actLeafNode = qact;					
								//showSolutions2Ext(qact, 0, null, null, "");
								queryLeafNodesSolution.add(qact);
								queryNodeStackMap.get(qact.getActivityID()).pop();										
							} 						
						} else {										 			
							queryNodeStreamMap.get(qact.getActivityID()).remove(tqactPos);
						}
					}	
				}
			}
		
			matchPathsRatio = getMatchPathRatio();
			if (matchPathsRatio == 1.0) {
				outputAllExactMatchingSolutionsInSolutionPools();
			}
		}
	}

	
    /**
     * @see TwigStackD2Algorithm#twigStackInExactMatch(ActivityNode, float)
     */
	@Override
	public void twigStackInExactMatch(ActivityNode q, float threshold) {
		ActivityNode qact, parentQact, root;
		LinkedList<NodeRegionEncoding> streamqact, streamParentQact, streamRoot;
		Stack<NodeInStack> sqact, sParentQact, sRoot;
		float matchSimilarity;
		NodeRegionEncoding tqactFirst;
		PoolItem3Ext tqactFirstPI;
		boolean isQactStreamEmpty;
		
		root = querygraph.getStartActivity();
		
		while (!end(q)) {
			// **** Change ****
			//qact = getMinSource(q);
			qact = getNextExtForInexactMatch(q);
			parentQact = querygraph.getParent(qact);
		
			streamqact = queryNodeStreamMap.get(qact.getActivityID());
			sqact = queryNodeStackMap.get(qact.getActivityID());
		
//			streamParentQact = queryNodeStreamMap.get(parentQact.getActivityID());
//			sParentQact = queryNodeStackMap.get(parentQact.getActivityID());	
//			streamRoot = queryNodeStreamMap.get(root.getActivityID());
//			sRoot = queryNodeStackMap.get(root.getActivityID());
			
			isQactStreamEmpty = streamqact.isEmpty();
			if (!isQactStreamEmpty) {
				tqactFirst = queryNodeStreamMap.get(qact.getActivityID()).getFirst();
				if (!querygraph.isRoot(qact)) {
					cleanStack(parentQact, tqactFirst.getStart());
				}
					
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact.getActivityID()).isEmpty()) {
					cleanStack(qact, tqactFirst.getStart());
					moveStreamToStack(qact);
					sweepPartialSolutionsTSD2(qact, tqactFirst);
					
					if (querygraph.isLeaf(qact)) {
						actLeafNode = qact;					
						showSolutions2Ext(qact, 0, null, null, "");
						//processSolutions(qact, 0, null, 0);
						queryLeafNodesSolution.add(qact);
						queryNodeStackMap.get(qact.getActivityID()).pop();										
					} 						
				} else {
						// *** Change ***
						// Before remove it, check nodes from parent stream
//						for (NodeRegionEncoding tParentQact : streamParentQact) {
//							if (checkContainment2(tParentQact, tqactFirst)) {
//								  tqactFirstPI = new PoolItem3Ext(qact, tqactFirst);
//								  solutionPoolMap.get(qact).add(tqactFirstPI);
//								  break;
//							}
//						}
					queryNodeStreamMap.get(qact.getActivityID()).removeFirst();
				}
			}
		}
		
		// Phase 2: These solutions are merge joined to computer the answers to 
		// the query twig pattern.
		
		//mergeAllPathSolutions(q);
		matchSimilarity = getMatchPathRatio();
		if (matchSimilarity > threshold) {
			outputAllInexactMatchingSolutionsInSolutionPools(matchSimilarity);
		}		
	}

	
	/**
	 * @see TwigStackD2Algorithm#getNextExtForExactMatch(ActivityNode)
	 */
	@Override 
	protected ActivityNode getNextExtForExactMatch(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL, tempPos, streamSize, tempPosC;
		boolean containsAll, foundReturnChild;
		NodeRegionEncoding nextQ, tchildQNext;
			
		minL = processgraph.getMaxEnd() + 1;
		maxL = 0;
		niL = 0;
		nmin = q;
			
		if (querygraph.isLeafInMST(q)) {
			return q;
		}
			
		Set<ActivityNode> childrenQ = querygraph.getChildrenInMSTFromMap(q);
		List<NodeRegionEncoding> tchildrenNext = new ArrayList<NodeRegionEncoding>();
		List<String> childrenNextIDs = new ArrayList<String>();
			
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExtForExactMatch(childQi);		
			if (!queryNodeStreamMap.get(ni.getActivityID()).isEmpty()) {
				if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
					return ni;
				}
				tempPosC = queryNodeStreamPositionMap.get(ni.getActivityID()).intValue();
				tchildQNext = queryNodeStreamMap.get(ni.getActivityID()).get(tempPosC);
				tchildrenNext.add(tchildQNext);
				childrenNextIDs.add(ni.getActivityID());
				niL = tchildQNext.getStart();
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}		
				if (niL > maxL) {
					maxL = niL;
				}
			}
		}
			
		while (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).
				getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q.getActivityID()).removeFirst();
		}
				
		returnChildNode = nmin;
			
		if (tchildrenNext.isEmpty() || (!queryNodeStreamMap.get(q.getActivityID()).isEmpty()&& 
				(queryNodeStreamMap.get(q.getActivityID()).getFirst().getStart() < minL))) {
			return q;			
		} else {	
			if (queryNodeStreamMap.get(q.getActivityID()).isEmpty()) {
				return returnChildNode;
			} else {
				tempPos = 0;
				streamSize = queryNodeStreamMap.get(q.getActivityID()).size();
				containsAll = false;
				foundReturnChild = false;
				while ((tempPos < streamSize) && !containsAll) {
					nextQ = queryNodeStreamMap.get(q.getActivityID()).get(tempPos);
					containsAll = true;
					tempPos++;
					for (int j = 0; j < tchildrenNext.size(); j++) {
						if (!checkContainment2(nextQ, tchildrenNext.get(j))) {
							containsAll = false;
							if (!foundReturnChild) {						
								returnChildNode = querygraph.getActivityNode
									(childrenNextIDs.get(j));
								foundReturnChild = true;
							}
							break;
						}				
					}				
				}				
				if(containsAll) {
					queryNodeStreamPositionMap.put(q.getActivityID(), new Integer(tempPos-1));
					return q;
				} else {
					return returnChildNode;
				}
			}
		}
	}
	   
	   
	/**
	 * @see TwigStackD2Algorithm#getNextExtForExactMatch2(ActivityNode)
	 */
	@Override
   protected ActivityNode getNextExtForExactMatch2(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL;
		boolean containsAll;
		NodeRegionEncoding nextQ, tchildQNext;
		
		minL = processgraph.getMaxEnd();
		maxL = 0;
		niL = 0;
		nmin = q;

		
		if (querygraph.isLeafInMST(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.getChildrenInMSTFromMap(q);
		Set<ActivityNode> childrenNextQueryNodes = new HashSet<ActivityNode>();
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExtForExactMatch2(childQi);
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni.getActivityID()).isEmpty()) {
				childrenNextQueryNodes.add(ni);
				niL = queryNodeStreamMap.get(ni.getActivityID()).getFirst().getStart();			
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}			
				if (niL > maxL) {
					maxL = niL;
				}
			} 
		}
		
		while (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).
				getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q.getActivityID()).removeFirst();
		}
			
		returnChildNode = nmin;
		
		// For inexact matching
		if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).
				getFirst().getStart() < minL)) {
			return q;			
		} else {
			// Check whether q's first stream node is ancestor of other returned stream nodes
			if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty()) {
				containsAll = true;
				nextQ = queryNodeStreamMap.get(q.getActivityID()).getFirst();
				for (ActivityNode childQNext : childrenNextQueryNodes) {
					if (!queryNodeStreamMap.get(childQNext.getActivityID()).isEmpty()) {
						tchildQNext = queryNodeStreamMap.get(childQNext.getActivityID()).getFirst();
						if (!checkContainment2(nextQ, tchildQNext)) {
							containsAll = false;
							returnChildNode = childQNext;
							break;
						}
					}
				}					
				if(containsAll) {
					return q;
				} else {
					return returnChildNode;
				}
			} else {
				return returnChildNode;
			}
		}
	}
	
   
	/**
	 * @see TwigStackD2Algorithm#getNextExtForInexactMatch(ActivityNode)
	 */
	@Override
   protected ActivityNode getNextExtForInexactMatch(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL;
		boolean containsAll;
		NodeRegionEncoding nextQ, tchildQNext;
		
		minL = processgraph.getMaxEnd();
		maxL = 0;
		niL = 0;
		nmin = q;		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);
		// *** Change ***
		// Hold the first elements of returned stream nodes
		Set<ActivityNode> childrenNextQueryNodes = new HashSet<ActivityNode>();
//		childrenNextQueryDataNodes.clear();
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExtForInexactMatch(childQi);
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni.getActivityID()).isEmpty()) {
				// *** Change ***
				childrenNextQueryNodes.add(ni);
				niL = queryNodeStreamMap.get(ni.getActivityID()).getFirst().getStart();			
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}			
				if (niL > maxL) {
					maxL = niL;
				}
			} 
		}
		
		while (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).
				getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q.getActivityID()).removeFirst();
		}
			
		returnChildNode = nmin;
		
		// For inexact matching
		if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty() && (queryNodeStreamMap.get(q.getActivityID()).
				getFirst().getStart() < minL)) {
			return q;			
		} else {
			// *** Change ***
			// Check whether q's first stream node is ancestor of other returned stream nodes
			if (!queryNodeStreamMap.get(q.getActivityID()).isEmpty()) {
				containsAll = true;
				nextQ = queryNodeStreamMap.get(q.getActivityID()).getFirst();				
				for (ActivityNode childQNext : childrenNextQueryNodes) {
					if (!queryNodeStreamMap.get(childQNext.getActivityID()).isEmpty()) {
						tchildQNext = queryNodeStreamMap.get(childQNext.getActivityID()).getFirst();
//						if (nextQ.getPreorderRank() > tchildQNext.getPreorderRank()) {
							if (!checkContainment2(nextQ, tchildQNext)) {
								containsAll = false;
								returnChildNode = childQNext;
								break;
//							}
						}
					}
				}
							
				if(containsAll) {
					return q;
				} else {
					return returnChildNode;
				}
			} else {
				return returnChildNode;
			}
		}
	}
   
   
   /**
    * @see TwigStackD2Algorithm#sweepPartialSolutionsTSD2(ActivityNode, NodeRegionEncoding)
    */
	@Override
	protected void sweepPartialSolutionsTSD2(ActivityNode q, NodeRegionEncoding tq) {
		Set<ActivityNode> parentsQ = querygraph.getParentsFromMap(q);
		Set<PoolItem3Ext> poolParentQ;
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);

		PoolItem3Ext tqPI = new PoolItem3Ext(q, tq, null);
		solutionPoolMap.get(q.getActivityID()).add(tqPI);
		  
		for (ActivityNode parentQ : parentsQ) {
			poolParentQ = solutionPoolMap.get(parentQ.getActivityID());
			for (PoolItem3Ext poolItemParentQ : poolParentQ) {
				if (checkContainment2(poolItemParentQ.getProcessnode(), tq)) {
					poolItemParentQ.addChild(tqPI);
				} 				
			}
		 }
		  
		for (ActivityNode childQi : childrenQ) {
			 for (PoolItem3Ext h : solutionPoolMap.get(childQi.getActivityID())) {
				if (checkContainment2(tq, h.getProcessnode())) {
					tqPI.addChild(h);
				} 			
			 }		 
		}
	}


	/**
	 * @see TwigStackAlgorithm#getMatchPathRatio()
	 */
	@Override
	public float getMatchPathRatio() {		
		return (queryLeafNodesSolution.size() * 1.00f)/querygraph.getNumberOfLeafNodesInMST();
	}
	
    /**
     * After processing all path solutions, we output all exact matching results stored in 
     * partial solution pools.
     *
     */
 	protected boolean checkAndSemanticsForPoolItem(PoolItem3Ext poolItemOfJoinedQueryNode, 
 			LinkedList<PoolItem3Ext> theQueue) {
 		boolean fulfillAndSemantics = true;
 		ActivityNode qNode = poolItemOfJoinedQueryNode.getQuerynode();
 		NodeRegionEncoding dNode = poolItemOfJoinedQueryNode.getProcessnode();
 		Set<ActivityNode> qNodeParents = querygraph.getParentsOfJoinedNodeNotInMST(qNode);

 		for (PoolItem3Ext poolItemToBeChecked : theQueue) {
 			if (qNodeParents.contains(poolItemToBeChecked.getQuerynode())) {
	 			if (checkContainment2(poolItemToBeChecked.getProcessnode(), dNode)) {
	 				poolItemToBeChecked.addChild(poolItemOfJoinedQueryNode);
	 			} else {
	 				fulfillAndSemantics = false;
	 				break;
	 			}
 			}
 		}				
 		return fulfillAndSemantics;
 	}
 	
	/**
	 * @see TwigStackD2Algorithm#outputAllExactMatchingSolutionsInSolutionPools()
	 */
	@Override
 	protected void outputAllExactMatchingSolutionsInSolutionPools() {
		ActivityNode queryroot, currentQueryNode;
		List<ArrayList<NodeRegionEncoding>> exactMatchs;
		ArrayList<NodeRegionEncoding> tempMatch, newMatch;
		Set<PoolItem3Ext> rootPIs, currentPIs;
		boolean fulfillAnd, existProcNode;
		int qNodesLength, matchsLength;
		Set<Integer> parentsPos;
		NodeRegionEncoding pNode, cNode;
		String cID;
		ArrayList<String> tempMatchResult;
		
//		Iterator<ActivityNode> iter = new TopologicalOrderIterator
//	   		<ActivityNode, DefaultEdge>(querygraph.getGraph());
//		ArrayList<ActivityNode> sortedNodes = new ArrayList<ActivityNode>();
//		while (iter.hasNext()) {
//			sortedNodes.add(iter.next());
//		}
//		querygraph.setQueryNodesSortedByLevelOrder(sortedNodes);
		List<ActivityNode> sortedNodes = querygraph.getQueryNodesSortedByLevelOrder();
		qNodesLength = sortedNodes.size();		
 		queryroot = querygraph.getStartActivity();
 		rootPIs = solutionPoolMap.get(queryroot.getActivityID());	
 		if (!rootPIs.isEmpty()) {
 			exactMatchs = new LinkedList<ArrayList<NodeRegionEncoding>>();
 			for (PoolItem3Ext rootPI : rootPIs) {
 				tempMatch = new ArrayList<NodeRegionEncoding>();
 				tempMatch.add(rootPI.getProcessnode());
 				exactMatchs.add(tempMatch);
 			}

 			for (int i = 1; i < qNodesLength; i++) {
 				currentQueryNode = sortedNodes.get(i);
 				matchsLength = exactMatchs.size();
 				parentsPos = querygraph.getParentsIndexesFromList(i);
 				currentPIs = solutionPoolMap.get(currentQueryNode.getActivityID());
 				for (PoolItem3Ext currentPI : currentPIs) {
 					cNode = currentPI.getProcessnode();
 					cID = cNode.getActivityID();
 	 				for (int j = 0; j < matchsLength; j++) {
 	 					tempMatch = exactMatchs.get(j);
 	 					existProcNode = false;
 	 					for (int k = 1; k < i; k++) {
 	 						if (cID.compareTo(tempMatch.get(k).
 	 								getActivityID()) == 0) {
 	 							existProcNode = true;
 	 							break;
 	 						}
 	 					}
 	 					
 	 					if (!existProcNode) {
 	 	 					fulfillAnd = true;
 	 	 					for (Integer pPos : parentsPos) {
 	 	 						pNode = tempMatch.get(pPos.intValue());
 	 	 						if (!checkContainment2(pNode, cNode)) {
 	 	 							fulfillAnd = false;
 	 	 							break;
 	 	 						}
 	 	 					}
 	 	 					if (fulfillAnd) {
 	 	 						newMatch = new ArrayList<NodeRegionEncoding>();
 	 	 						newMatch.addAll(tempMatch);
 	 	 						newMatch.add(cNode);
 	 	 						exactMatchs.add(newMatch);
 	 	 					}
 	 					}
 	 				}
 				}
 				
 				for (int k = 0; k < matchsLength; k++) {
 					exactMatchs.remove(0);
 				}
 				if (exactMatchs.isEmpty()) {
 					break;
 				}
 			}
 			
 			if (!exactMatchs.isEmpty()) {
 				this.hasExactMatch = true;
 				this.exactMatchingResults = new ExactMatchingResult(processgraph.getProcessID(), 
 						processgraph.getProcessNamespace(), processgraph.getProcessName());
 				for (ActivityNode sortedNode : sortedNodes) {
 					this.exactMatchingResults.getQueryIDsTobeAssigned().add(sortedNode.getActivityID());
 				}
 				for (ArrayList<NodeRegionEncoding> exactMatch : exactMatchs) {
 	 				String solution = "";
 	 				tempMatchResult = new ArrayList<String>();
 	 				for (NodeRegionEncoding em : exactMatch) {
 	 					tempMatchResult.add(em.getActivityID());
 	 					solution += (em.getActivityID() + " ");
 	 				}
 	 				this.exactMatchingResults.getExactMatchings().add(tempMatchResult);
// 	 				logger.warn(solution);
 	 		 	}
 			}
 		}
 	}
}