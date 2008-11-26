/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.PoolItem;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;
import de.uni.stuttgart.bpelSearching.matching.ProcessNodePair;

/**
 * Implements the TwigStackD algorithm (Modified Version) for matching query tree against 
 * directed acyclic graph.
 * 
 * @author luwei
 *
 */
public class TwigStackD2AlgorithmUnusedVersion extends TwigStackAlgorithm {
	
    /**
     * A data structure to temporarily hold the stack popped nodes to be grown from 
     * intermediate partial solutions to full solutions in a bottom-up fashion.
     * 
     */	
	protected HashMap<ActivityNode, Set<PoolItem>> partialSolutionPoolMap = 
		new HashMap<ActivityNode, Set<PoolItem>>();	
	

	/**
	 * Creates a new TwigStackD2AlgorithmUnusedVersion object for the specified process graph, 
	 * initialize stream, solution stack, partial solution pool for each query node.
	 * 
	 * @param pg the process graph.
	 */
	public TwigStackD2AlgorithmUnusedVersion(ProcessGraph pg) {
		super(pg);
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		for (ActivityNode queryNode : vertexSetQuery) {	
			partialSolutionPoolMap.put(queryNode, new HashSet<PoolItem>());
		}
	}

    /**
     * @see TwigStackAlgorithm#twigStackExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackExactMatch(ActivityNode q) {
		ActivityNode qact, parentQact, root;
		LinkedList<NodeRegionEncoding> tqact, tParentQact, tRoot;
		Stack<NodeInStack> sqact, sParentQact, sRoot;
		
		NodeRegionEncoding tqactFirst;
		
		root = querygraph.getStartActivity();
		
		while (!end(q)) {
			// **** Change ****
			//qact = getMinSource(q);
			qact = getNextExt(q);
			parentQact = querygraph.getParent(qact);
			tqactFirst = queryNodeStreamMap.get(qact).getFirst();
		
			tqact = queryNodeStreamMap.get(qact);
			sqact = queryNodeStackMap.get(qact);
		
			tParentQact = queryNodeStreamMap.get(parentQact);
			sParentQact = queryNodeStackMap.get(parentQact);
		
			tRoot = queryNodeStreamMap.get(root);
			sRoot = queryNodeStackMap.get(root);
					
			if (!querygraph.isRoot(qact) && !queryNodeStreamMap.get(qact).isEmpty()) {
				cleanStack(parentQact, tqactFirst.getStart());
			}
				
			if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
				if (!queryNodeStreamMap.get(qact).isEmpty()) {
					cleanStack(qact, tqactFirst.getStart());
				}
				moveStreamToStack(qact);
				sweepPartialSolutionsTSD2(qact, tqactFirst);
				
				if (querygraph.isLeaf(qact)) {
					actLeafNode = qact;					
					showSolutions2Ext(qact, 0, null, null, "");
					//processSolutions(qact, 0, null, 0);
					queryNodeStackMap.get(qact).pop();										
				} 						
			} else {
				if (!queryNodeStreamMap.get(qact).isEmpty()) {						
					queryNodeStreamMap.get(qact).removeFirst();
				}
			}	
		}
		
		// Phase 2: These solutions are merge joined to computer the answers to 
		// the query twig pattern.
			
		// **** for debug ****
//		Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
//		ActivityNode cNode;
//		Stack<ProcessNodePair> sNPair;
//		for (ActivityNode queryNode : vertexSetQuery) { 			
//			sNPair = solutionStackMap.get(queryNode);
//			if (sNPair.size() > 0) {
//				cNode = sNPair.get(0).getNode();
//			}
//		}
		// **** end debug ****
	
		mergeAllPathSolutions(q);			
	}

	
    /**
     * @see TwigStackAlgorithm#twigStackInExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackInExactMatch(ActivityNode q, float threshold) {
		// TODO Auto-generated method stub

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
	   boolean found = false;
	   Predecessors2 predecessorsH, predecessorsfirstPLh;
	   
	   NodeRegionEncoding firstPLh;
	   int tqNREstart, tqNREend;
	   
	   tqNREstart = tq.getStart();
	   tqNREend = tq.getEnd();
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
			   if ((firstPLh.getStart() >= tqNREstart) && (firstPLh.getEnd() <= tqNREend)) {
				   return true;
			   } else if (firstPLh.getStart() > tqNREend) {
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
   protected ActivityNode getNextExt(ActivityNode q){
		ActivityNode ni, nmin;
		int minL, maxL, niL;
		boolean containsAll;
		//boolean existGetNextChildStreamEmpty = false;
		NodeRegionEncoding nextQ;
		
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
		Set<NodeRegionEncoding> childrenNextQ = new HashSet<NodeRegionEncoding>();
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExt(childQi);
			// *** Change ***
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) { 
					//|| existGetNextChildStreamEmpty) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				// *** Change ***
				childrenNextQ.add(queryNodeStreamMap.get(ni).getFirst());
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
				 //There is a child solution whose data stream is empty
				//existGetNextChildStreamEmpty = true;				
			//}
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			

		// For exact matching, but still has problem if sibling nodes the same are
		//if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().
				//getPreorderRank() < minL) && !existGetNextChildStreamEmpty) {
		// For inexact matching
		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getStart() < minL)) {
			return q;			
		} else {
			// *** Change ***
			// Check whether q's first stream node is ancestor of other returned stream nodes
			if (!queryNodeStreamMap.get(q).isEmpty()) {
				containsAll = true;
				nextQ = queryNodeStreamMap.get(q).getFirst();
				for (NodeRegionEncoding childNextQ : childrenNextQ) {
					if (nextQ.getStart() > childNextQ.getStart()) {
						if (!checkContainment2(nextQ, childNextQ)) {
							containsAll = false;
						}
					}				
				}
				
				if(containsAll) {
					return q;
				} else {
					return nmin;
				}
			} else {
				return nmin;
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
	  PoolItem tqPI = new PoolItem(q, tq);
	  partialSolutionPoolMap.get(q).add(tqPI);
	  
	  Set<ActivityNode> childrenQ = querygraph.getChildren(q);
	  boolean hasExtendedSolutions = false;
	  String qSolution;
	  int stackPos;
	  
	  for (ActivityNode childQi : childrenQ) {
		 for (PoolItem h : partialSolutionPoolMap.get(childQi)) {
			if (checkContainment2(tq, h.getDatanode())) {
				h.addParent(tqPI);
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
   * @param partialPath partial path from leaf node to q.
   * 
   */ 
	protected void showExpandedSolutions(ActivityNode q, int stackpos, PoolItem tqPI, String partialPath) {
		ActivityNode temp;
		Stack<NodeInStack> tempStack;
		String tempID = "";
		int parentStackIndex;
		
		queryNodeStackPositionMap.put(q, new Integer(stackpos));
		
		if (querygraph.isRoot(q)) {
			outputPoolSolutionsRootedAtTqPI(tqPI, partialPath);
		} else {			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			temp = querygraph.getParent(q);
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
	 * @param tqPI pool element created with tq.
	 * @param partialPath partial path from leaf node to q.
	 * 
	 */
	protected void outputPoolSolutionsRootedAtTqPI(PoolItem tqPI, String partialPath) {
		String tempSolution = partialPath;
		String tqID, hID;
		List<PoolItem> tempparents;
		
		if (querygraph.isLeaf(tqPI.getQuerynode())) {
			logger.warn(partialPath);
		} else {
			Set<ActivityNode> childrenQ = querygraph.getChildren(tqPI.getQuerynode());
			tqID = tqPI.getDatanode().getActivityID();
			for (ActivityNode childQ : childrenQ) {
				for (PoolItem h : partialSolutionPoolMap.get(childQ)) {				
					if ((tempparents = h.getParents()) != null) {
						for (PoolItem tempparent : tempparents) {
							if (tempparent.getDatanode().getActivityID().compareTo(tqID) == 0) {
								hID = h.getDatanode().getActivityID();
								tempSolution = partialPath + processgraph.getActivityName(hID) + ": " + hID + "  ||  ";
								outputPoolSolutionsRootedAtTqPI(h, tempSolution);
								break;
							}
						}
					}
				}
			}
		}
	}

	
   /**
    * Outputs solutions to individual query paths in root-to-leaf order.
    * 
    * @param q query node q.
    * @param stackpos the position in q's stack that we are interested in for the current solution.
    * @param tchildq positional representation of childq (a process node matches q's child)
    * @param childPI pool element in q's child pool.
    * @param partialPath partial path from leaf node to q.
    *
    */ 
    // Version 2: Direction from child to parent
 	protected void showSolutions2Ext(ActivityNode q, int stackpos, NodeRegionEncoding tchildq, PoolItem childPI, String partialPath) {
 		ActivityNode temp;
 		Stack<NodeInStack> tempStack;
 		int parentStackIndex;
 		PoolItem cPI;
 	
 		// Modification to original algorithm: Direction from child to parent
 		NodeRegionEncoding tq = queryNodeStackMap.get(q).get(stackpos).getNode();
 		cPI = expandStackPathSolution(q, tq, tchildq, childPI, partialPath);
 		partialPath = processgraph.getActivityName(tq.getActivityID()) + ": " + tq.getActivityID() + "  ||  "+ partialPath;
 		
 		if (querygraph.isRoot(q)) {
 			logger.warn("Output path solution in partial solution stack");
 			logger.warn(partialPath);			
 		} else { 						
 			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
 			temp = querygraph.getParent(q);
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
 	  protected PoolItem expandStackPathSolution(ActivityNode q, NodeRegionEncoding tq, NodeRegionEncoding tchildq, PoolItem childPI, String partialPathQ) {
 		 // Alternative 1: direction is from child to parent
 		 // Create a new pool element for tq, we have created tqPI in function sweepPartialSolutionTSD2
 		 // and added it in the pool, so we don't add it in pool this time.
 		 PoolItem tqPI = new PoolItem(q, tq);
 		
 		 // Retrieve tqPI from the Pool[q]
 		 Set<PoolItem> qPoolItems = partialSolutionPoolMap.get(q);			  
 		 for (PoolItem qPoolItem : qPoolItems) {
 			if (qPoolItem.getDatanode().getActivityID().compareTo(tq.getActivityID()) == 0) {
 				 tqPI = qPoolItem;
 				 break;
 			}				  
 		 }
 			  	  
 		if (childPI != null) {
 	 		childPI.addParent(tqPI);							
 		}

 		if(!querygraph.isLeaf(q)) {
 			sweepPartialSolutionsReverse(q, tchildq, childPI, partialPathQ);  
 		}
 			  
 		 return tqPI;
 	   }
	  
 	/**
 	 * Check the new incoming pool element tqPI with each element from parent pool, in case
 	 * of descendant-ancestor relationship, link both elements and process the new emerging
 	 * path. 
 	 *
 	 * @param q query node q.
 	 * @param tchildq positional representation of childq (a process node matches q's child)
 	 * @param childPI last created pool element in q's child pool.
 	 * @param pathQ partial path from leaf node to q.
 	 * 
 	 */
 	 protected void sweepPartialSolutionsReverse(ActivityNode q, NodeRegionEncoding tchildq, PoolItem childPI, String pathQ) {		   
 		Set<PoolItem> poolQ = partialSolutionPoolMap.get(q);
 		Stack<NodeInStack> stackQ = queryNodeStackMap.get(q);
 		boolean belongsToCurrentPaths;
 		String tempID = "";
 		for (PoolItem poolQItem : poolQ) {
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
 					childPI.addParent(poolQItem);
 					// *** Change ***
 					tempID = poolQItem.getDatanode().getActivityID();
 					pathQ = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ pathQ;
 					outputPoolSolutions(poolQItem, pathQ);
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
 	protected void outputPoolSolutions(PoolItem tqPI, String partialPath) {
 		String tempID = "";
 		List<PoolItem> tempparents;
 			
 		if (querygraph.isRoot(tqPI.getQuerynode())) {
 			logger.warn(partialPath);
 		} else {
 			if ((tempparents = tqPI.getParents()) != null) {
 				for (PoolItem tempparent : tempparents) {
 					tempID = tempparent.getDatanode().getActivityID();
 					partialPath = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ partialPath;
 					outputPoolSolutions(tempparent, partialPath);
 				}
 			}
 		}	
 	}
 	   
// 	  protected void expand2(ActivityNode q, NodeRegionEncoding tq, NodeInStack h) {
// 		  // Alternative 1: direction is from child to parent
//// 		  NodeInStack qNIS = new NodeInStack(tq);
//// 		  solutionPoolMap.get(q).add(qNIS);
//// 		  h.setNext(qNIS);
// 		  // Alternative 2: direction is from parent to child
// 		  NodeInStack qNIS = new NodeInStack(tq, h);
// 		  solutionPoolMap.get(q).add(qNIS);
// 		  
// 		  if (querygraph.isRoot(q)) {
// 			  processSolutionsInRootPool(qNIS);
//// 			  //processSolutionsInRootPool(q, tq);
// 		  } 
// 	  }
 	   
 	  /**
 	   * Process solutions headed by tq in the root pool.
 	   * 
 	   * @param poolItem an element stored in partial solution pool.
 	   * 
 	   */  
 	  // Alternative 1: direction is from child to parent
// 	  protected void processSolutionsInRootPool(ActivityNode q, NodeRegionEncoding tq) {
// 		  String tempID;
// 		  String solution = "";
// 		  Set<ActivityNode> childrenQ = querygraph.children(q);
// 		  boolean found;
// 		  if (querygraph.isLeaf(q)) {
// 			  tempID = tq.getActivityID();
// 			  solution += processgraph.getActivityName(tempID) + ": " + tempID;
// 			  logger.warn(solution);
// 		  } else {
// 			  found = false;
// 			  for (ActivityNode childQ: childrenQ) {
// 				  Set<NodeInStack> childQsolutionSet = solutionPoolMap.get(childQ);
// 				  for (NodeInStack childQsolution : childQsolutionSet) {
// 					  if (childQsolution.getNext().getNode() == tq) {
// 						  tempID = tq.getActivityID();
// 						  solution += processgraph.getActivityName(tempID) + ": " + tempID + "  ||  ";
// 						  processSolutionsInRootPool(childQ, childQsolution.getNode());
// 						  found = true;
// 						  break;
// 					  }	  				  
// 				  }
// 				  if (found) {
// 					  break;
// 				  }
// 			  }
// 		  }
 	//  }
 	   
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
					tempParentID = queryNodeStackMap.get(tempParent).get(tempParentIndex).getNode().getActivityID();
					
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
					solutionStackMap.get(temp).push(new ProcessNodePair(tempID, tempParentID, 
							new LinkedList<StringBuffer>(), nodeParentExist, 0)); 
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
    	
}

