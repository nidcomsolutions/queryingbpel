/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.index.NodeInStack;
import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.index.PoolItem3Ext;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Implements the DagStackD algorithm for matching query dag pattern against 
 * directed acyclic graph. The implementation is based on modified version of 
 * 
 * 
 * @author luwei
 *
 */
public class DagStackDAlgorithm extends TwigStackAlgorithmForDAGQuery2 {
	
	/**
	 * Creates a new TwigStackAlgorithmForDAGQuery1 object for the specified query tree 
	 * and process graph, initialize stream, solution stack, partial solution pool for 
	 * each query node.
	 * 
	 * @param qg the query graph.
	 * @param pg the process graph.
	 */
	public DagStackDAlgorithm(QueryGraph qg, ProcessFlowGraph pg) {
		super(qg, pg);
	}

    /**
     * @see TwigStackAlgorithmForDAGQuery2#twigStackExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackExactMatch(ActivityNode q) {
		ActivityNode qact, parentQact, root;
		LinkedList<NodeRegionEncoding> streamqact, streamParentQact, streamRoot;
		Stack<NodeInStack> sqact, sParentQact, sRoot;
		float matchSimilarity;
		NodeRegionEncoding tqactFirst;
		PoolItem3Ext tqactFirstPI;
		Set<PoolItem3Ext> poolparentQact;
		boolean isQactStreamEmpty, createPoolItemFlag;

		if (allQuerySubtreeNodesStreamsNotEmpty(q)) {
			root = querygraph.getStartVertex();		
			while (!end(q)) {
				qact = getNextExtForExactMatch(q);
//				if (querygraph.isJoinedNode(qact)) {
					parentQact = querygraph.getParentNodeInMST(qact);					
//				} else {
//					parentQact = querygraph.getParent(qact);
//				}
				
				streamqact = queryNodeStreamMap.get(qact);
				sqact = queryNodeStackMap.get(qact);
		
				streamParentQact = queryNodeStreamMap.get(parentQact);
				sParentQact = queryNodeStackMap.get(parentQact);
		
				streamRoot = queryNodeStreamMap.get(root);
				sRoot = queryNodeStackMap.get(root);
				
				isQactStreamEmpty = streamqact.isEmpty();
				if (!isQactStreamEmpty) {
					tqactFirst = queryNodeStreamMap.get(qact).getFirst();
					if (!querygraph.isRoot(qact)) {
						cleanStack(parentQact, tqactFirst.getPreorderRank());
					}
					
					if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
						cleanStack(qact, tqactFirst.getPreorderRank());
						moveStreamToStack(qact);
						sweepPartialSolutionsTSD2(qact, tqactFirst);
						
						if (querygraph.isLeafInMST(qact)) {
							actLeafNode = qact;					
							showSolutions2Ext(qact, 0, null, null, "");
							//processSolutions(qact, 0, null, 0);
							queryLeafNodesSolution.add(qact);
							queryNodeStackMap.get(qact).pop();										
						} 						
					} else {						
							queryNodeStreamMap.get(qact).removeFirst();	
					}
				}
			}
		
			// Phase 2: These solutions are merge joined to computer the answers to 
			// the query twig pattern.
		
			//mergeAllPathSolutions(q);
			matchSimilarity = getMatchingSimilarity();
			if (matchSimilarity == 1.0) {				
				outputAllExactMatchingSolutionsInPartialSolutionPools();
			}
			
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
		
//			Set<PoolItem3Ext> q1ReceiveBPool = partialSolutionPoolMap.get(querygraph.getActivityNode("q1ReceiveB"));
//			logger.warn("Show q1ReceiveBPool's pool: ");
//			for (PoolItem3Ext q1PoolItem : q1ReceiveBPool) {
//				logger.warn(q1PoolItem);
//			}
			// **** end debug ****
		}
	}

	
    /**
     * @see TwigStackAlgorithmForDAGQuery2#twigStackInExactMatch(ActivityNode, float)
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
		
		root = querygraph.getStartVertex();
		
		while (!end(q)) {
			// **** Change ****
			//qact = getMinSource(q);
			qact = getNextExtForInexactMatch(q);
			parentQact = querygraph.getParent(qact);
		
			streamqact = queryNodeStreamMap.get(qact);
			sqact = queryNodeStackMap.get(qact);
		
			streamParentQact = queryNodeStreamMap.get(parentQact);
			sParentQact = queryNodeStackMap.get(parentQact);
		
			streamRoot = queryNodeStreamMap.get(root);
			sRoot = queryNodeStackMap.get(root);
			
			isQactStreamEmpty = streamqact.isEmpty();
			if (!isQactStreamEmpty) {
				tqactFirst = queryNodeStreamMap.get(qact).getFirst();
				if (!querygraph.isRoot(qact)) {
					cleanStack(parentQact, tqactFirst.getPreorderRank());
				}
					
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
					cleanStack(qact, tqactFirst.getPreorderRank());
					moveStreamToStack(qact);
					sweepPartialSolutionsTSD2(qact, tqactFirst);
					
					if (querygraph.isLeaf(qact)) {
						actLeafNode = qact;					
						showSolutions2Ext(qact, 0, null, null, "");
						//processSolutions(qact, 0, null, 0);
						queryLeafNodesSolution.add(qact);
						queryNodeStackMap.get(qact).pop();										
					} 						
				} else {
						// *** Change ***
						// Before remove it, check nodes from parent stream
//						for (NodeRegionEncoding tParentQact : streamParentQact) {
//							if (checkContainment2(tParentQact, tqactFirst)) {
//								  tqactFirstPI = new PoolItem3Ext(qact, tqactFirst);
//								  partialSolutionPoolMap.get(qact).add(tqactFirstPI);
//								  break;
//							}
//						}
					queryNodeStreamMap.get(qact).removeFirst();
				}
			}
		}
		
		// Phase 2: These solutions are merge joined to computer the answers to 
		// the query twig pattern.
		
		//mergeAllPathSolutions(q);
		matchSimilarity = getMatchingSimilarity();
		if (matchSimilarity > threshold) {
			outputAllInexactMatchingSolutionsInPartialSolutionPools(matchSimilarity);
		}		
	}

	

	/**
	 * @see TwigStackAlgorithmForDAGQuery2#getNextExtForExactMatch(ActivityNode)
	 */
	@Override
   protected ActivityNode getNextExtForExactMatch(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL;
		boolean containsAll;
		//boolean existGetNextChildStreamEmpty = false;
		NodeRegionEncoding nextQ, tchildQNext;
		
		minL = processgraph.getMaxPostOrder();
		maxL = 0;
		niL = 0;
		nmin = q;

		
		if (querygraph.isLeafInMST(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.getChildrenInMST(q);
		// *** Change ***
		// Hold the first elements of returned stream nodes
//		Set<QueryNodeDataNodeRegionEncoding> childrenNextQueryDataNodes = new HashSet<QueryNodeDataNodeRegionEncoding>();
		Set<ActivityNode> childrenNextQueryNodes = new HashSet<ActivityNode>();
//		childrenNextQueryDataNodes.clear();
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExtForExactMatch(childQi);
			// *** Change ***
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
					//|| existGetNextChildStreamEmpty) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				// *** Change ***
//				childrenNextQueryDataNodes.add(new QueryNodeDataNodeRegionEncoding(ni, queryNodeStreamMap.get(ni).getFirst()));
				childrenNextQueryNodes.add(ni);
				niL = queryNodeStreamMap.get(ni).getFirst().getPreorderRank();			
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}			
				if (niL > maxL) {
					maxL = niL;
				}
			} 
			//else {
				 //There is a child solution whose data stream is empty
				//existGetNextChildStreamEmpty = true;				
			//}
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getPostorderRank() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			
		returnChildNode = nmin;
		
		// For inexact matching
		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getPreorderRank() < minL)) {
		// For exact matching, but still has problem if sibling nodes the same are
		//if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().
				//getPreorderRank() < minL) && !existGetNextChildStreamEmpty) {
			return q;			
		} else {
			// *** Change ***
			// Check whether q's first stream node is ancestor of other returned stream nodes
			if (!queryNodeStreamMap.get(q).isEmpty()) {
				containsAll = true;
				nextQ = queryNodeStreamMap.get(q).getFirst();
//				logger.warn("q: " + q.getActivityID() + "  childrenNextQueryDataNodes: " + childrenNextQueryDataNodes);
				for (ActivityNode childQNext : childrenNextQueryNodes) {
					if (!queryNodeStreamMap.get(childQNext).isEmpty()) {
						tchildQNext = queryNodeStreamMap.get(childQNext).getFirst();
//						if (nextQ.getPreorderRank() > tchildQNext.getPreorderRank()) {
							if (!checkContainment2(nextQ, tchildQNext)) {
								containsAll = false;
								returnChildNode = childQNext;
								break;
							}
//						}
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
	 * @see TwigStackAlgorithmForDAGQuery2#getNextExtForInexactMatch(ActivityNode)
	 */
	@Override
   protected ActivityNode getNextExtForInexactMatch(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL;
		boolean containsAll;
		NodeRegionEncoding nextQ, tchildQNext;
		
		minL = processgraph.getMaxPostOrder();
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
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				// *** Change ***
				childrenNextQueryNodes.add(ni);
				niL = queryNodeStreamMap.get(ni).getFirst().getPreorderRank();			
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}			
				if (niL > maxL) {
					maxL = niL;
				}
			} 
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getPostorderRank() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			
		returnChildNode = nmin;
		
		// For inexact matching
		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getPreorderRank() < minL)) {
			return q;			
		} else {
			// *** Change ***
			// Check whether q's first stream node is ancestor of other returned stream nodes
			if (!queryNodeStreamMap.get(q).isEmpty()) {
				containsAll = true;
				nextQ = queryNodeStreamMap.get(q).getFirst();				
				for (ActivityNode childQNext : childrenNextQueryNodes) {
					if (!queryNodeStreamMap.get(childQNext).isEmpty()) {
						tchildQNext = queryNodeStreamMap.get(childQNext).getFirst();
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
    * @see TwigStackAlgorithmForDAGQuery2#sweepPartialSolutionsTSD2(ActivityNode, NodeRegionEncoding)
    */
	@Override
	protected void sweepPartialSolutionsTSD2(ActivityNode q, NodeRegionEncoding tq) {
		Set<ActivityNode> parentsQ = querygraph.getParents(q);
		Set<PoolItem3Ext> poolParentQ;
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);
		boolean hasExtendedSolutions = false;
		String qSolution;
		int stackPos;

		PoolItem3Ext tqPI = new PoolItem3Ext(q, tq);
		partialSolutionPoolMap.get(q).add(tqPI);
		  
		// ****** Change ******
		for (ActivityNode parentQ : parentsQ) {
			poolParentQ = partialSolutionPoolMap.get(parentQ);
			for (PoolItem3Ext poolItemParentQ : poolParentQ) {
				if (checkContainment2(poolItemParentQ.getDatanode(), tq)) {
					poolItemParentQ.addChild(tqPI);
				} 				
			}
		 }
		  
		for (ActivityNode childQi : childrenQ) {
			 for (PoolItem3Ext h : partialSolutionPoolMap.get(childQi)) {
				if (checkContainment2(tq, h.getDatanode())) {
					//h.addParent(tqPI);
					tqPI.addChild(h);
					hasExtendedSolutions = true;
				} 			
			 }		 
		}
		  
		if(hasExtendedSolutions) {
			stackPos = queryNodeStackMap.get(q).size() - 1;
			qSolution = processgraph.getActivityName(tq.getActivityID()) + ": " + tq.getActivityID() + "  ||  ";
			showExpandedSolutions(q, stackPos, tqPI, qSolution);		 
		 }
	}
  
	/**
	 * @see TwigStackAlgorithmForDAGQuery2#showExpandedSolutions(ActivityNode, int, PoolItem3Ext, String)
	 */
	@Override
	protected void showExpandedSolutions(ActivityNode q, int stackpos, PoolItem3Ext tqPI, String partialPath) {
		ActivityNode temp;
		Stack<NodeInStack> tempStack;
		String tempID = "";
		int parentStackIndex;
		
		if (querygraph.isRoot(q)) {
			outputPoolSolutionsRootedAtTqPI(tqPI, partialPath);
		} else {			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			temp = querygraph.getParentNodeInMST(q);
			tempStack = queryNodeStackMap.get(temp);
			parentStackIndex = tempStack.indexOf(parentNodeInStack);
			
			for (int i = 0; i <= parentStackIndex; i++) {
				tempID = tempStack.get(i).getNode().getActivityID();
				partialPath = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ partialPath;
				showExpandedSolutions(temp, i, tqPI, partialPath);				
			}			
		}		
	}
 
	
	/**
	 * @see TwigStackAlgorithmForDAGQuery2#outputPoolSolutionsRootedAtTqPI(PoolItem3Ext, String)
	 */
	@Override
	protected void outputPoolSolutionsRootedAtTqPI(PoolItem3Ext tqPI, String partialPath) {
		String tqPIChildID;
		Set<PoolItem3Ext> tqPIChildren;
		ActivityNode q = tqPI.getQuerynode();

		if (querygraph.isLeafInMST(q)) {
			logger.warn(partialPath);
		} else {			
			if ((tqPIChildren = tqPI.getChildren()) != null) {
				for (PoolItem3Ext tqPIChild : tqPIChildren) {
					tqPIChildID = tqPIChild.getDatanode().getActivityID();
					partialPath += processgraph.getActivityName(tqPIChildID) + ": " + tqPIChildID + "  ||  ";
					outputPoolSolutionsRootedAtTqPI(tqPIChild, partialPath);
				}		
			}		
		}
	}

	
	/**
	 * @see TwigStackAlgorithmForDAGQuery2#showSolutions2Ext(ActivityNode, int, NodeRegionEncoding, PoolItem3Ext, String)
	 */
	@Override
    // Direction from parent to child
 	protected void showSolutions2Ext(ActivityNode q, int stackpos, NodeRegionEncoding tchildq, PoolItem3Ext childPI, String partialPath) {
 		ActivityNode temp;
 		Stack<NodeInStack> tempStack;
 		int parentStackIndex;
 		PoolItem3Ext cPI;
 	
 		NodeRegionEncoding tq = queryNodeStackMap.get(q).get(stackpos).getNode();
 		cPI = expandStackPathSolution(q, tq, tchildq, childPI, partialPath);
 		partialPath = processgraph.getActivityName(tq.getActivityID()) + ": " + tq.getActivityID() + "  ||  "+ partialPath;
 		
 		if (querygraph.isRoot(q)) {
 			logger.warn("Output path solution in partial solution stack");
 			logger.warn(partialPath);			
 		} else { 						
 			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
 			//temp = querygraph.parent(q);
// 			if (querygraph.isJoinedNode(q)) {
 				temp = querygraph.getParentNodeInMST(q);
// 			} else {
// 				temp = querygraph.getParent(q);
// 			}
 			
 			if (temp == null) {
 				throw new NullPointerException("Parent Node of a non-root node " + q.toString() + " returns null ");
 			}
	 		tempStack = queryNodeStackMap.get(temp);
	 		parentStackIndex = tempStack.indexOf(parentNodeInStack);
	 			
	 		for (int i = 0; i <= parentStackIndex; i++) {
	 			showSolutions2Ext(temp, i, tq, cPI, partialPath);				
	 		}
 		}		
 	}

	/**
	 * @see TwigStackAlgorithmForDAGQuery2#expandStackPathSolution(ActivityNode, NodeRegionEncoding, NodeRegionEncoding, PoolItem3Ext, String)
	 */
	@Override  
 	protected PoolItem3Ext expandStackPathSolution(ActivityNode q, NodeRegionEncoding tq, NodeRegionEncoding tchildq, PoolItem3Ext childPI, String partialPathQ) {
		// Alternative 2: direction is from parent to child
		// Create a new pool element for tq, we have created tqPI in function sweepPartialSolutionTSD2
		// and added it in the pool, so we don't add it in pool this time.
		PoolItem3Ext tqPI = new PoolItem3Ext(q, tq);
 		
		// Retrieve tqPI from the Pool[q]
		Set<PoolItem3Ext> qPoolItems = partialSolutionPoolMap.get(q);
		for (PoolItem3Ext qPoolItem : qPoolItems) {
			if (qPoolItem.getDatanode().getActivityID().compareTo(tq.getActivityID()) == 0) {
				tqPI = qPoolItem;
				break;
			}				  
		}
 		
 		// ******** change *********
//	 	if (childPI != null) {
//			tqPI.addChild(childPI);
//		}
 		
		// ******** change *********
// 		if(!querygraph.isLeafInMST(q)) {
// 			sweepPartialSolutionsReverse(q, tchildq, childPI, partialPathQ);  
// 		}
 			  
		return tqPI;
	}
 	   
	/**
	 * @see TwigStackAlgorithmForDAGQuery2#outputPoolSolutions(PoolItem3Ext, String)
	 */
	@Override
 	protected void outputPoolSolutions(PoolItem3Ext tqPI, String partialPath) {
 		String tempID = "";
 		String tqID;
 		Set<PoolItem3Ext> childrenpoolParentQ;
 		Set<PoolItem3Ext> poolParentQ;
 		ActivityNode q = tqPI.getQuerynode();

 		if (querygraph.isRoot(q)) {
 			logger.warn(partialPath);
 		} else {
 			tqID = tqPI.getDatanode().getActivityID();
 			poolParentQ = partialSolutionPoolMap.get(querygraph.getParentNodeInMST(q));
 			for (PoolItem3Ext poolItemParentQ : poolParentQ) {
 				if ((childrenpoolParentQ = poolItemParentQ.getChildren()) != null) {
 					for (PoolItem3Ext childpoolParentQ : childrenpoolParentQ) {
 						if (childpoolParentQ.getDatanode().getActivityID().compareTo(tqID) == 0) {
 	 						tempID = poolItemParentQ.getDatanode().getActivityID();
 	 						partialPath = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ partialPath;
 	 						outputPoolSolutions(poolItemParentQ, partialPath);
 							break;
 						}						
 					}
 				} 				
 			}			
 		}	
 	}

	/**
	 * @see TwigStackAlgorithm#getMatchingSimilarity()
	 */
	@Override
	public float getMatchingSimilarity() {		
		return (queryLeafNodesSolution.size() * 1.00f)/querygraph.getNumberOfLeafNodesInMST();
	}
	
    /**
     * After processing all path solutions, we output all exact matching results stored in 
     * partial solution pools.
     *
     */
 	protected boolean checkAndSemanticsForSpecificPoolItem(PoolItem3Ext poolItemOfJoinedQueryNode, LinkedList<PoolItem3Ext> theQueue) {
 		boolean fulfillAndSemantics = true;
 		ActivityNode qNode = poolItemOfJoinedQueryNode.getQuerynode();
 		NodeRegionEncoding dNode = poolItemOfJoinedQueryNode.getDatanode();
 		Set<ActivityNode> qNodeParents = querygraph.getParentsOfJoinedNodeNotInMST(qNode);

 		for (PoolItem3Ext poolItemToBeChecked : theQueue) {
 			if (qNodeParents.contains(poolItemToBeChecked.getQuerynode())) {
	 			if (checkContainment2(poolItemToBeChecked.getDatanode(), dNode)) {
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
	 * @see TwigStackAlgorithmForDAGQuery2#outputSolutionsForSpecificElementInRootPool(PoolItem3Ext)
	 */
	@Override
 	protected void outputSolutionsForSpecificElementInRootPool(PoolItem3Ext rootPoolItem) {
 		Queue<PoolItem3Ext> theQueue = new LinkedList<PoolItem3Ext>();
 		PoolItem3Ext currentPoolItem, currentChildPoolItem;
 		Set<ActivityNode> queryChildrenNodes;
 		String currentChildPoolItemID, poolItemID, solution;
 		boolean hasSolutionsToOutput, fulfillAllAndSemantics;
 		ActivityNode queryNodeOfCurrentPoolItem;
 		int levelOfCurrentPoolItem, currentLevel;
 		//Map<ActivityNode, Integer> levelMap = new HashMap<ActivityNode, Integer>();
 		Set<PoolItem3Ext> currentPoolItemSet = new HashSet<PoolItem3Ext>();
 		LinkedList<PoolItem3Ext> poolItemListToCheckAndSemantic = new LinkedList<PoolItem3Ext>();
 		
 		hasSolutionsToOutput = false;
 		fulfillAllAndSemantics = true;
 		theQueue.add(rootPoolItem);
 		currentPoolItemSet.add(rootPoolItem);
 		
 		//levelMap.put(rootPoolItem.getQuerynode(), new Integer(0));
 		currentLevel = 0;
 		poolItemID = rootPoolItem.getDatanode().getActivityID();
 		solution = processgraph.getActivityName(poolItemID) + ": " + poolItemID + "  ||  ";
 		
 		while (!theQueue.isEmpty()) {
 			currentPoolItem = theQueue.remove();			
 			queryNodeOfCurrentPoolItem = currentPoolItem.getQuerynode();
 			//levelOfCurrentPoolItem = levelMap.get(queryNodeOfCurrentPoolItem).intValue();
 			levelOfCurrentPoolItem = querygraph.getNodeLevel(queryNodeOfCurrentPoolItem);
 			
 			if (levelOfCurrentPoolItem > currentLevel) {
				currentLevel = levelOfCurrentPoolItem;
				ListIterator<PoolItem3Ext> iterator = poolItemListToCheckAndSemantic.listIterator();
				while (iterator.hasNext()) {
					if (querygraph.getNodeLevel(iterator.next().getQuerynode()) <  (levelOfCurrentPoolItem - 1)) {
						iterator.remove();
					}
				}
			}
 			
			if (querygraph.isJoinedNode(queryNodeOfCurrentPoolItem)) {
				//if (fulfillAllAndSemantics && !checkAndSemanticsForSpecificPoolItem(currentChildPoolItem, currentPoolItemSet)) {
				if (fulfillAllAndSemantics && !checkAndSemanticsForSpecificPoolItem(currentPoolItem, poolItemListToCheckAndSemantic)) {
					fulfillAllAndSemantics = false;
				}
			}
	
 			queryChildrenNodes = querygraph.getChildrenInMST(queryNodeOfCurrentPoolItem);
 			for (ActivityNode queryChildNode : queryChildrenNodes) {
 				if ((currentChildPoolItem = currentPoolItem.getCurrentChildAndMoveToNext(queryChildNode)) != null) {
 					currentChildPoolItemID = currentChildPoolItem.getDatanode().getActivityID();
 					solution += processgraph.getActivityName(currentChildPoolItemID) + ": " + currentChildPoolItemID + "  ||  ";
 					// *** Problem ***
// 					if (querygraph.isJoinedNode(currentChildPoolItem.getQuerynode())) {
// 		 				//if (fulfillAllAndSemantics && !checkAndSemanticsForSpecificPoolItem(currentChildPoolItem, currentPoolItemSet)) {
// 		 				if (fulfillAllAndSemantics && !checkAndSemanticsForSpecificPoolItem(currentChildPoolItem, theQueue)) {
// 		 					fulfillAllAndSemantics = false;
// 		 				}
// 		 			}
 		 			
 					theQueue.add(currentChildPoolItem);
 					currentPoolItemSet.add(currentChildPoolItem);
 					
 					//levelMap.put(currentChildPoolItem.getQuerynode(), new Integer(levelOfCurrentPoolItem + 1));
 					

 					if(currentPoolItem.hasNextChild(queryChildNode)) {
 						hasSolutionsToOutput = true;
 					}						
 				}					
 			}
 			
 			// Not Sure
// 			if (levelOfCurrentPoolItem > (currentLevel + 1)) {
// 				currentLevel = levelOfCurrentPoolItem;
// 				currentPoolItemSet.clear();
// 			}
 		}
 		
 		if (fulfillAllAndSemantics) {
 			logger.warn(solution);
 		}
 		
 		if(hasSolutionsToOutput) {
 			outputSolutionsForSpecificElementInRootPool(rootPoolItem);
 		}
 		//return hasSolutionsToOutput;
 	}
}