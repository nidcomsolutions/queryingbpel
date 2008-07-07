/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.index.NodeInStack;
import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.index.PoolItem3Ext;
import de.uni.stuttgart.bpelSearching.index.Predecessors2;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Implements the TwigStackD algorithm (Modified Version) for matching query tree against 
 * directed acyclic graph. Compare with original TwigStackD algorithm a different data 
 * structure for partial solution pools is used here: Each pool element consists of three 
 * components: query node, data node (which matches the query node), a list of references 
 * to the pool elements in its children pools.
 * 
 * @author luwei
 *
 */
public class TwigStackAlgorithmForDAGQuery3 extends TwigStackAlgorithm {
	
    /**
     * A data structure to temporarily hold the stack popped nodes to be grown from 
     * intermediate partial solutions to full solutions in a bottom-up fashion.
     * 
     */		
	protected HashMap<ActivityNode, Set<PoolItem3Ext>> partialSolutionPoolMap = 
		new HashMap<ActivityNode, Set<PoolItem3Ext>>();
	
	// Temporary hold the next processing children nodes returned by function getNextExtForExactMatch 
	// or function getNextExtForInexactMatch
//	Set<QueryNodeDataNodeRegionEncoding> childrenNextQueryDataNodes = new 
//		HashSet<QueryNodeDataNodeRegionEncoding>();
	

	/**
	 * Creates a new TwigStackAlgorithmForDAGQuery2 object for the specified query tree 
	 * and process graph, initialize stream, solution stack, partial solution pool for 
	 * each query node.
	 * 
	 * @param qg the query graph.
	 * @param pg the process graph.
	 */
	public TwigStackAlgorithmForDAGQuery3(QueryGraph qg, ProcessFlowGraph pg) {
		super(qg, pg);
		Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
		for (ActivityNode queryNode : vertexSetQuery) {	
			partialSolutionPoolMap.put(queryNode, new HashSet<PoolItem3Ext>());
		}
	}

    /**
     * @see TwigStackAlgorithm#twigStackExactMatch(ActivityNode q)
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
				// **** Change ****
				//qact = getMinSource(q);
				qact = getNextExtForExactMatch(q);
				parentQact = querygraph.parent(qact);
				tqactFirst = queryNodeStreamMap.get(qact).getFirst();
		
				streamqact = queryNodeStreamMap.get(qact);
				sqact = queryNodeStackMap.get(qact);
		
				streamParentQact = queryNodeStreamMap.get(parentQact);
//				logger.warn(streamParentQact);
				sParentQact = queryNodeStackMap.get(parentQact);
		
				streamRoot = queryNodeStreamMap.get(root);
				sRoot = queryNodeStackMap.get(root);
				
				isQactStreamEmpty = streamqact.isEmpty();
				if (!querygraph.isRoot(qact) && !isQactStreamEmpty) {
					cleanStack(parentQact, tqactFirst.getPreorderRank());
				}
				
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
					if (!isQactStreamEmpty) {
						cleanStack(qact, tqactFirst.getPreorderRank());
					}
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
					if (!isQactStreamEmpty) {
						
						// *** Change ***
						// Before remove it, check ancestor-descendant relationship with nodes 
						// from parent stream and pool
//						createPoolItemFlag = false;
//						for (NodeRegionEncoding tParentQact : streamParentQact) {
//							if (checkContainment2(tParentQact, tqactFirst)) {
//								createPoolItemFlag = true;
//								break;
//							}
//						}
//						
//						if (!createPoolItemFlag) {
//							poolparentQact = partialSolutionPoolMap.get(parentQact);
//							for (PoolItem3Ext poolParentQactItem : poolparentQact) {
//				 				if (checkContainment2(poolParentQactItem.getDatanode(), tqactFirst)) {
//				 					createPoolItemFlag = true;
//				 					break;
//				 				}
//							}
//						}
//				 		
//				 		if (createPoolItemFlag) {
//							  tqactFirstPI = new PoolItem3Ext(qact, tqactFirst);
//							  partialSolutionPoolMap.get(qact).add(tqactFirstPI);
//				 		}
				 		
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
     * @see TwigStackAlgorithm#twigStackInExactMatch(ActivityNode q)
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
			parentQact = querygraph.parent(qact);
			tqactFirst = queryNodeStreamMap.get(qact).getFirst();
		
			streamqact = queryNodeStreamMap.get(qact);
			sqact = queryNodeStackMap.get(qact);
		
			streamParentQact = queryNodeStreamMap.get(parentQact);
			sParentQact = queryNodeStackMap.get(parentQact);
		
			streamRoot = queryNodeStreamMap.get(root);
			sRoot = queryNodeStackMap.get(root);
			
			isQactStreamEmpty = streamqact.isEmpty();
			
			if (!querygraph.isRoot(qact) && !isQactStreamEmpty) {
				cleanStack(parentQact, tqactFirst.getPreorderRank());
			}
				
			if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
				if (!isQactStreamEmpty) {
					cleanStack(qact, tqactFirst.getPreorderRank());
				}
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
				if (!isQactStreamEmpty) {	
					// *** Change ***
					// Before remove it, check nodes from parent stream
//					for (NodeRegionEncoding tParentQact : streamParentQact) {
//						if (checkContainment2(tParentQact, tqactFirst)) {
//							  tqactFirstPI = new PoolItem3Ext(qact, tqactFirst);
//							  partialSolutionPoolMap.get(qact).add(tqactFirstPI);
//							  break;
//						}
//					}
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
    * The modified version to check whether a process node is descendant of another process node 
    * in process graph by recursively looking up predecessors in SSPI.
    *
    * @param tq current node region encoding of query node q's stream.
    * @param h  positional representation of a node in Pool[child(q)].
    *
    * @return <code>true</code> if <code>h</code> is descendant of <code>tq</code>,
    * otherwise <code>false</code>.
   */
   protected boolean checkContainment2(NodeRegionEncoding tq, NodeRegionEncoding h) {
	   boolean found;
	   Predecessors2 predecessorsH, predecessorsfirstPLh;
	   
	   NodeRegionEncoding firstPLh;
	   int tqNREstart, tqNREend;
	   
	   tqNREstart = tq.getPreorderRank();
	   tqNREend = tq.getPostorderRank();

	   if ((h.getPreorderRank() >= tqNREstart) && (h.getPostorderRank() <= tqNREend)) {
		   return true;
	   } else {
		   found = false;
		   predecessorsH = processgraph.getPredecessors2(h.getActivityID()); 
		   if (predecessorsH != null) {
			   if (!predecessorsH.isOriginal()) {
				   predecessorsH.getCurrentPredecessors().clear();
			  	 // ? Not Sure
			  	 predecessorsH.getCurrentPredecessors().addAll(predecessorsH.getOriginalPredecessors());
			  	 predecessorsH.setOriginal(true);
			   }
		   
			   while (!predecessorsH.getCurrentPredecessors().isEmpty() && !found) {
				   firstPLh = predecessorsH.getCurrentPredecessors().first();
				   if ((firstPLh.getPreorderRank() >= tqNREstart) && (firstPLh.getPostorderRank() <= tqNREend)) {
					   return true;
				   } else if (firstPLh.getPreorderRank() > tqNREend) {
					   return false;
				   } else if (((predecessorsfirstPLh = processgraph.getPredecessors2(firstPLh.getActivityID())) == null)
						   || predecessorsfirstPLh.getOriginalPredecessors().isEmpty()) {
					   predecessorsH.getCurrentPredecessors().remove(firstPLh);
					   if (predecessorsH.isOriginal()) {
						   predecessorsH.setOriginal(false);
					   }
				   } else if ((found = checkContainment2(tq, firstPLh)) == false) {
					   predecessorsH.getCurrentPredecessors().addAll(predecessorsfirstPLh.getCurrentPredecessors());
					   predecessorsH.getCurrentPredecessors().remove(firstPLh);
					   if (predecessorsH.isOriginal()) {
						   predecessorsH.setOriginal(false);
					   }
				   } 		   
			   }		   
		   }
		 return found;
	   }
   }
   	
   
   /**
    * Gets the next highest possible query node with a solution extension, 
    * unlike function getNextExt(q) in super class TwigStackAlgorithm, the returned
    * node is not necessary to have minimal pre-order rank among all remaining
    * streams.
    *
    * @param q a query node.
    *
    * @return the next processing node.
    * 
    */  
   protected ActivityNode getNextExtForExactMatch(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL;
		boolean containsAll;
		//boolean existGetNextChildStreamEmpty = false;
		NodeRegionEncoding nextQ;
		
		minL = processgraph.getMaxPostOrder();
		maxL = 0;
		niL = 0;
		nmin = q;

		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.children(q);
		// *** Change ***
		// Hold the first elements of returned stream nodes
		Set<QueryNodeDataNodeRegionEncoding> childrenNextQueryDataNodes = new HashSet<QueryNodeDataNodeRegionEncoding>();
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
				childrenNextQueryDataNodes.add(new QueryNodeDataNodeRegionEncoding(ni, queryNodeStreamMap.get(ni).getFirst()));
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
				for (QueryNodeDataNodeRegionEncoding childNext : childrenNextQueryDataNodes) {
					if (nextQ.getPreorderRank() > childNext.getDataNodeRegionEncoding().getPreorderRank()) {
						if (!checkContainment2(nextQ, childNext.getDataNodeRegionEncoding())) {
							containsAll = false;
							returnChildNode = childNext.getQueryNode();
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
    * Gets the next highest possible query node with a solution extension, 
    * unlike function getNextExt(q) in super class TwigStackAlgorithm, the returned
    * node is not necessary to have minimal pre-order rank among all remaining
    * streams.
    *
    * @param q a query node.
    *
    * @return the next processing node.
    * 
    */  
   protected ActivityNode getNextExtForInexactMatch(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL;
		boolean containsAll;
		NodeRegionEncoding nextQ;
		
		minL = processgraph.getMaxPostOrder();
		maxL = 0;
		niL = 0;
		nmin = q;		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.children(q);
		// *** Change ***
		// Hold the first elements of returned stream nodes
		Set<QueryNodeDataNodeRegionEncoding> childrenNextQueryDataNodes = new HashSet<QueryNodeDataNodeRegionEncoding>();
//		childrenNextQueryDataNodes.clear();
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExtForInexactMatch(childQi);
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				// *** Change ***
				childrenNextQueryDataNodes.add(new QueryNodeDataNodeRegionEncoding(ni, queryNodeStreamMap.get(ni).getFirst()));
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
				for (QueryNodeDataNodeRegionEncoding childNext : childrenNextQueryDataNodes) {
					if (nextQ.getPreorderRank() > childNext.getDataNodeRegionEncoding().getPreorderRank()) {
						if (!checkContainment2(nextQ, childNext.getDataNodeRegionEncoding())) {
							containsAll = false;
							returnChildNode = childNext.getQueryNode();
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
   * Create a new pool element tqPI with tq and put it in the pool, check tqPI with each element 
   * in its children pools, in case of ancestor-descendant relationship, link both elements and 
   * process the new emerging paths. 
   *
   * @param q query node q.
   * @param tq current element of q's stream.
   * 
   */
  protected void sweepPartialSolutionsTSD2(ActivityNode q, NodeRegionEncoding tq) { 
//	  PoolItem3 tqPI = new PoolItem3(q, tq);
	  PoolItem3Ext tqPI = new PoolItem3Ext(q, tq);
	  partialSolutionPoolMap.get(q).add(tqPI);
	  
	  Set<ActivityNode> childrenQ = querygraph.children(q);
	  boolean hasExtendedSolutions = false;
	  String qSolution;
	  int stackPos;
	  
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
   * Outputs expanded solutions rooted at tqPI in partial solution pools in root-to-leaf order.
   * 
   * @param q query node q.
   * @param stackpos the position in q's stack that we are interested in for the current solution.
   * @param tqPI last created pool element with tq.
   * @param partialPath partial path from expanded node to q.
   * 
   */ 
	protected void showExpandedSolutions(ActivityNode q, int stackpos, PoolItem3Ext tqPI, String partialPath) {
		ActivityNode temp;
		Stack<NodeInStack> tempStack;
		String tempID = "";
		int parentStackIndex;
		
		if (querygraph.isRoot(q)) {
			outputPoolSolutionsRootedAtTqPI(tqPI, partialPath);
		} else {			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			temp = querygraph.parent(q);
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
	 * Output path solutions rooted at pool element tqPI with the given
	 * partial path solution. 
	 *
	 * @param tqPI pool element created with tq and q.
	 * @param partialPath partial path from root to tq.
	 * 
	 */
	protected void outputPoolSolutionsRootedAtTqPI(PoolItem3Ext tqPI, String partialPath) {
		String tqPIChildID;
//		List<PoolItem3Ext> tqPIChildren;
		Set<PoolItem3Ext> tqPIChildren;
		ActivityNode q = tqPI.getQuerynode();

		if (querygraph.isLeaf(q)) {
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
    * Output path solutions with certain leaf node encoded in partial solution stacks 
    * in root-to-leaf order and store these path solutions in partial solution pools, 
    * expand solutions for every processed node tq by sweeping its parent pool.
    * 
    * @param q query node q.
    * @param stackpos the position in q's stack that we are interested in for the current solution.
    * @param tchildq positional representation of childq (a process node matches q's child)
    * @param childPI pool element in q's child pool.
    * @param partialPath partial path from leaf node to tq.
    *
    */ 
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
 			temp = querygraph.parent(q);
 			tempStack = queryNodeStackMap.get(temp);
 			parentStackIndex = tempStack.indexOf(parentNodeInStack);
 			
 			for (int i = 0; i <= parentStackIndex; i++) {
 				showSolutions2Ext(temp, i, tq, cPI, partialPath);				
 			}			
 		}		
 	}

 	 /**
 	  * A operation associated with the partial solution pool. This operation is called during 
 	  * the processing of output the path solution, whose order is from leaf to root. For each 
 	  * node tq along the path we find corresponding pool item tpPI in the partial solution pool. 
 	  * Except that, if we find, that tqPI has a parent tpPI in the parent partial solution pool, 
 	  * which will not be output in current path, then we build a parent pointer from tqPI to tpPI.
 	  *
 	  * @param q query node q.
 	  * @param tq current element of q's stream.
 	  * @param tchildq positional representation of a node from childq's stream.
 	  * @param childPI pool element in q's child pool.
 	  * @param partialPathQ partial path from leaf node to q 
 	  * 
 	  * @return the new created pool element for tq
 	  * 
 	  */   
 	  protected PoolItem3Ext expandStackPathSolution(ActivityNode q, NodeRegionEncoding tq, NodeRegionEncoding tchildq, PoolItem3Ext childPI, String partialPathQ) {
 		 // Alternative 2: direction is from parent to child
 		 // Create a new pool element for tq, we have created tqPI in function sweepPartialSolutionTSD2
 		 // and added it in the pool, so we don't add it in pool this time.
 		 PoolItem3Ext tqPI = new PoolItem3Ext(q, tq);
 		
 		 // Retrieve tqPI from the Pool[q]
// 		 List<PoolItem3> qPoolItems = partialSolutionPoolMap.get(q);
 		 Set<PoolItem3Ext> qPoolItems = partialSolutionPoolMap.get(q);
 		 for (PoolItem3Ext qPoolItem : qPoolItems) {
 			if (qPoolItem.getDatanode().getActivityID().compareTo(tq.getActivityID()) == 0) {
 				 tqPI = qPoolItem;
 				 break;
 			}				  
 		 }
 		 
	 	if (childPI != null) {
	 		//childPI.addParent(tqPI);
			tqPI.addChild(childPI);
		}
 			  	  
 		if(!querygraph.isLeaf(q)) {
 			sweepPartialSolutionsReverse(q, tchildq, childPI, partialPathQ);  
 		}
 			  
 		 return tqPI;
 	   }
	  
 	/**
 	 * Check a pool element with each element from parent pool (which is not from
 	 * partial solution stacks), in case of descendant-ancestor relationship, 
 	 * link both elements and process the new emerging paths. 
 	 *
 	 * @param q query node q.
 	 * @param tchildq positional representation of childq (a process node matches q's child)
 	 * @param childPI last created pool element in q's child pool.
 	 * @param partialPathQ partial path from leaf node to q.
 	 * 
 	 */
 	 protected void sweepPartialSolutionsReverse(ActivityNode q, NodeRegionEncoding tchildq, PoolItem3Ext childPI, String partialPathQ) {		   
// 		List<PoolItem3> poolQ = partialSolutionPoolMap.get(q);
 		Set<PoolItem3Ext> poolQ = partialSolutionPoolMap.get(q);
 		Stack<NodeInStack> stackQ = queryNodeStackMap.get(q);
 		boolean belongsToCurrentPaths;
 		String tempID, tempPartialPath;
 		for (PoolItem3Ext poolQItem : poolQ) {
 			// Check whether pool item 
 			belongsToCurrentPaths = false;		
 			for (NodeInStack stackQitem: stackQ) {
 				if (poolQItem.getDatanode().getActivityID().compareTo(stackQitem.getNode().getActivityID()) == 0) {
 					belongsToCurrentPaths = true;
 					break;
 				}				
 			}
 			
 			if (!belongsToCurrentPaths) {
 				if (checkContainment2(poolQItem.getDatanode(), tchildq)) {
 					//childPI.addParent(poolQItem);
 					poolQItem.addChild(childPI);
 					tempID = poolQItem.getDatanode().getActivityID();
 					tempPartialPath = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ partialPathQ;
 					outputPoolSolutions(poolQItem, tempPartialPath);
 				}
 			}
 		}	    
 	}
 	   
 	/**
 	  * Output path solutions started at pool element tqPI with the given
 	  * partial path solution. 
 	  *
 	  * @param tqPI q's pool element.
 	  * @param partialPath partial path from leaf node to q.
 	  * 
 	  */
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
 			poolParentQ = partialSolutionPoolMap.get(querygraph.parent(q));
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
     * After processing all path solutions, we output all exact matching results stored in 
     * partial solution pools.
     *
     */
 	protected void outputAllExactMatchingSolutionsInPartialSolutionPools() {
		String resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
		"  process namespace: " + processgraph.getProcessNamespace() + 
		"  process name: " + processgraph.getProcessName();
		
		logger.warn(resultProcessInfo);
		
		logger.warn("It has following exact matching results: ");		
 		Set<PoolItem3Ext> queryRootPool = partialSolutionPoolMap.get(querygraph.getStartVertex());	
 		for (PoolItem3Ext queryRootPoolItem : queryRootPool) {
 			outputSolutionsForSpecificElementInRootPool(queryRootPoolItem);
 		}		
 	}
 	
    /**
     * After processing all path solutions, we output all inexact matching results stored in 
     * partial solution pools.
     *
     * @param similarity similarity between query graph and matching part of data graph.
     *
     */
 	protected void outputAllInexactMatchingSolutionsInPartialSolutionPools(float similarity) {
		String resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
		"  process namespace: " + processgraph.getProcessNamespace() + 
		"  process name: " + processgraph.getProcessName();
		
		logger.warn(resultProcessInfo);
		
		logger.warn("Has matching Similarity: " + similarity + " with following matching results: ");
		
 		Set<PoolItem3Ext> queryRootPool = partialSolutionPoolMap.get(querygraph.getStartVertex());		
 		for (PoolItem3Ext queryRootPoolItem : queryRootPool) {
 			outputSolutionsForSpecificElementInRootPool(queryRootPoolItem);
 		}		
 	}
 	 	
 	
    /**
     * Output solutions for a specific element in root pool.
     * 
     * @param rootPoolItem a element from query root pool.
     *
     */
 	protected void outputSolutionsForSpecificElementInRootPool(PoolItem3Ext rootPoolItem) {
 		Queue<PoolItem3Ext> theQueue = new LinkedList<PoolItem3Ext>();
 		PoolItem3Ext currentPoolItem, currentChildPoolItem;
 		Set<ActivityNode> queryChildrenNodes;
 		String currentChildPoolItemID, poolItemID, solution;
 		boolean hasSolutionsToOutput = false;

 		theQueue.add(rootPoolItem);
 		poolItemID = rootPoolItem.getDatanode().getActivityID();
 		solution = processgraph.getActivityName(poolItemID) + ": " + poolItemID + "  ||  ";
 		
 		while (!theQueue.isEmpty()) {
 			currentPoolItem = theQueue.remove();
 			if ((queryChildrenNodes = querygraph.children(currentPoolItem.getQuerynode())) != null) {
 				for (ActivityNode queryChildNode : queryChildrenNodes) {
 					if ((currentChildPoolItem = currentPoolItem.getNextChild(queryChildNode)) != null) {
 						currentChildPoolItemID = currentChildPoolItem.getDatanode().getActivityID();
 						solution += processgraph.getActivityName(currentChildPoolItemID) + ": " + currentChildPoolItemID + "  ||  ";
 						theQueue.add(currentChildPoolItem);
 						if(currentPoolItem.hasNextChild(queryChildNode)) {
 							hasSolutionsToOutput = true;
 						}						
 					}					
 				}
 			}
 		}
 		
 		logger.warn(solution);
 		if(hasSolutionsToOutput) {
 			outputSolutionsForSpecificElementInRootPool(rootPoolItem);
 		}
 		//return hasSolutionsToOutput;
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
}

