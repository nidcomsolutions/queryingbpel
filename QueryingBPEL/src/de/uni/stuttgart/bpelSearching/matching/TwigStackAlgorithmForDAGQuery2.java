/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.index.NodeInStack;
import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.index.PoolItem;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.Predecessors2;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Implements the TwigStackD algorithm (Modified Version) for matching query tree against 
 * directed acyclic graph.
 * 
 * @author luwei
 *
 */
public class TwigStackAlgorithmForDAGQuery2 extends TwigStackAlgorithm {
	
    /**
     * A data structure to temporarily hold the stack popped nodes to be grown from 
     * intermediate partial solutions to full solutions in a bottom-up fashion.
     * 
     */	
	protected HashMap<ActivityNode, Set<PoolItem>> partialSolutionPoolMap = 
		new HashMap<ActivityNode, Set<PoolItem>>();	
	//protected HashMap<ActivityNode, Set<NodeInStack>> partialSolutionPoolMap = 
	//new HashMap<ActivityNode, Set<NodeInStack>>();
	
    /**
     * Temporary store element from partial solution pool of query root node.
     */
	protected PoolItem rootPI;
	
    /**
     * Temporary store element from partial solution pool of query root child node.
     */
	protected PoolItem rootChildPI;
	
    /**
     * A data structure to temporarily hold partial solution pool nodes which can
     * be expanded as partial solutions.
     * 
     */
	//protected HashMap<ActivityNode, Set<NodeInStack>> candidateSetMap = 
			//new HashMap<ActivityNode, Set<NodeInStack>>();

	/**
	 * Creates a new TwigStackAlgorithmForDAGQuery2 object for the specified query tree 
	 * and process graph, initialize stream, solution stack, partial solution pool for 
	 * each query node.
	 * 
	 * @param qg the query graph.
	 * @param pg the process graph.
	 */
	public TwigStackAlgorithmForDAGQuery2(QueryGraph qg, ProcessFlowGraph pg) {
		super(qg, pg);
		Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
		for (ActivityNode queryNode : vertexSetQuery) {	
			partialSolutionPoolMap.put(queryNode, new HashSet<PoolItem>());
			//candidateSetMap.put(queryNode, new HashSet<NodeInStack>());
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
		//String leafStackID, leafSolution;
		//ArrayList<NodeRegionEncoding> partialPath;
		
		NodeRegionEncoding tqactFirst;		

		root = querygraph.getStartVertex();
		
		while (!end(q)) {
			// **** Change ****
			//qact = getMinSource(q);
			qact = getNextExt(q);
			parentQact = querygraph.parent(qact);
			tqactFirst = queryNodeStreamMap.get(qact).getFirst();
		
			tqact = queryNodeStreamMap.get(qact);
			sqact = queryNodeStackMap.get(qact);
		
			tParentQact = queryNodeStreamMap.get(parentQact);
			sParentQact = queryNodeStackMap.get(parentQact);
		
			tRoot = queryNodeStreamMap.get(root);
			sRoot = queryNodeStackMap.get(root);
					
			if (!querygraph.isRoot(qact) && !queryNodeStreamMap.get(qact).isEmpty()) {
				cleanStack(parentQact, tqactFirst.getPreorderRank());
			}
				
			if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
				if (!queryNodeStreamMap.get(qact).isEmpty()) {
					cleanStack(qact, tqactFirst.getPreorderRank());
				}
				moveStreamToStack(qact);
				// *** Change ***
				sweepPartialSolutionsTSD2(qact, tqactFirst);
				
				if (querygraph.isLeaf(qact)) {
					actLeafNode = qact;					
					// *** Change ***
					//leafStackID = queryNodeStackMap.get(qact).get(0).getNode().getActivityID();
					//leafSolution = processgraph.getActivityName(leafStackID) + ": " + leafStackID + "  ||  ";
					
					showSolutions2Ext(qact, 0, null, null, "");
					//processSolutions(qact, 0, null, 0);
					// To avoid output actual path solution twice, we link the root and its child in partial
					// solution pool after showing this path.
					if ((rootChildPI != null) && (rootPI != null)) {
						rootChildPI.addParent(rootPI);
					}
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
//		Stack<NodePair> sNPair;
//		for (ActivityNode queryNode : vertexSetQuery) { 			
//			sNPair = solutionStackMap.get(queryNode);
//			if (sNPair.size() > 0) {
//				cNode = sNPair.get(0).getNode();
//			}
//		}
		// **** end debug ****
	
		mergeAllPathSolutions(q);		
//		printSolutionsForExactMatch(q);
//	}		
	}

	
    /**
     * @see TwigStackAlgorithm#twigStackInExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackInExactMatch(ActivityNode q) {
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
	   
	   tqNREstart = tq.getPreorderRank();
	   tqNREend = tq.getPostorderRank();
	   predecessorsH = processgraph.getPredecessors2(h.getActivityID());  
	   
	   if (predecessorsH != null) {
		   if (!predecessorsH.isOriginal()) {
			   predecessorsH.getCurrentPredecessors().clear();
			   // ???
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
			

		// For exact matching, but still has problem if sibling nodes the same are
		//if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().
				//getPreorderRank() < minL) && !existGetNextChildStreamEmpty) {
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
				for (NodeRegionEncoding childNextQ : childrenNextQ) {
					if (nextQ.getPreorderRank() > childNextQ.getPreorderRank()) {
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
   * in its child pool, in case of ancestor-descendant relationship, link both elements and process 
   * the new emerging path. 
   *
   * @param q query node q.
   * @param tq current element of q's stream.
   * 
   */
  protected void sweepPartialSolutionsTSD2(ActivityNode q, NodeRegionEncoding tq) { 
	  PoolItem tqPI = new PoolItem(q, tq);
	  partialSolutionPoolMap.get(q).add(tqPI);
	  Set<ActivityNode> childrenQ = querygraph.children(q);
	  boolean hasExtendedSolutions = false;
	  String qSolution;
	  int stackPos;
	  
	  for (ActivityNode childQi : childrenQ) {
		 for (PoolItem h : partialSolutionPoolMap.get(childQi)) {
			if (checkContainment2(tq, h.getProcessnode())) {
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
   * Outputs expanded solutions rooted by q in partial solution pools in root-to-leaf order.
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
//		String tempString = "";
		String tempID = "";
		int parentStackIndex;
		
		queryNodeStackPositionMap.put(q, new Integer(stackpos));
		
		if (querygraph.isRoot(q)) {
//			logger.warn("Output path solution");
//			temp = actLeafNode;		
//			while (temp != null) {
//				tempStack = queryNodeStackMap.get(temp);
//				tempIndex = queryNodeStackPositionMap.get(temp).intValue();
//				tempID = tempStack.get(tempIndex).getNode().getActivityID();
//				tempString = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ tempString;
//				temp = querygraph.parent(temp);
//			}
//			logger.warn(tempString);
			
			//logger.warn(partialPath);
			
			// To do: output pool solutions rooted at tqPI
			//outputPoolSolutions(tqPI, partialPath);
			outputPoolSolutionsRootedAtTqPI(tqPI, partialPath);
		} else {			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			temp = querygraph.parent(q);
			tempStack = queryNodeStackMap.get(temp);
			parentStackIndex = tempStack.indexOf(parentNodeInStack);
			
			//qStackposID = queryNodeStackMap.get(q).get(stackpos).getNode().getActivityID();
			//partialPath = processgraph.getActivityName(qStackposID) + ": " + qStackposID + "  ||  "+ partialPath;
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
	 * @param tqPI q's pool element.
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
			Set<ActivityNode> childrenQ = querygraph.children(tqPI.getQuerynode());
			tqID = tqPI.getProcessnode().getActivityID();
			for (ActivityNode childQ : childrenQ) {
				for (PoolItem h : partialSolutionPoolMap.get(childQ)) {				
					if ((tempparents = h.getParents()) != null) {
						for (PoolItem tempparent : tempparents) {
							if (tempparent.getProcessnode().getActivityID().compareTo(tqID) == 0) {
								hID = h.getProcessnode().getActivityID();
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
    * @param childPI last created pool element in q's child pool.
    * @param partialPath partial path from leaf node to q.
    *
    */ 
    // Version 2: Direction from child to parent
 	protected void showSolutions2Ext(ActivityNode q, int stackpos, NodeRegionEncoding tchildq, PoolItem childPI, String partialPath) {
 		ActivityNode temp;
 		Stack<NodeInStack> tempStack;
// 		String tempString = "";
 		String tempID = "";
 		int parentStackIndex;
 		PoolItem cPI;
 		
 		queryNodeStackPositionMap.put(q, new Integer(stackpos));
 		
 		// Modification to original algorithm: Direction from child to parent
 		NodeRegionEncoding tq = queryNodeStackMap.get(q).get(stackpos).getNode();
 		cPI = expandStackPathSolution(q, tq, tchildq, childPI, partialPath);
 		partialPath = processgraph.getActivityName(tq.getActivityID()) + ": " + tq.getActivityID() + "  ||  "+ partialPath;
 		
 		if (querygraph.isRoot(q)) {
 			logger.warn("Output path solution in partial solution stack");
// 			temp = actLeafNode;		
// 			while (temp != null) {
// 				tempStack = queryNodeStackMap.get(temp);
// 				tempIndex = queryNodeStackPositionMap.get(temp).intValue();
// 				tempID = tempStack.get(tempIndex).getNode().getActivityID();
// 				tempString = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ tempString;
// 				temp = querygraph.parent(temp);
// 			}
// 			logger.warn(tempString);
 			logger.warn(partialPath);
 			
 		} else {
 						
 			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
 			temp = querygraph.parent(q);
 			tempStack = queryNodeStackMap.get(temp);
 			parentStackIndex = tempStack.indexOf(parentNodeInStack);
 			
 			//qStackposID = queryNodeStackMap.get(q).get(stackpos).getNode().getActivityID();
 			//partialPath = processgraph.getActivityName(qStackposID) + ": " + qStackposID + "  ||  "+ partialPath;
 			for (int i = 0; i <= parentStackIndex; i++) {
 				//tempID = tempStack.get(i).getNode().getActivityID();
 				//partialPath = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ partialPath;
 				showSolutions2Ext(temp, i, tq, cPI, partialPath);				
 			}			
 		}		
 	}

 	 /**
 	  * A operation associated with the partial solution pool. This operation is called during 
 	  * the processing of output the path solution, whose order is from leaf to root. For each 
 	  * node tq along the path we create a new item in associated partial solution pool. Except that, 
 	  * if we find, that tq has a node tp in the parent partial solution pool, which is ancestor 
 	  * of tq, then we build a parent pointer from it to tp .
 	  *
 	  * @param q query node q.
 	  * @param tq current element of q's stream.
 	  * @param tchildq positional representation of childq (a process node matches q's child)
 	  * @param childPI last created pool element in q's child pool.
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
 		 //partialSolutionPoolMap.get(q).add(tqPI);
 			  
 		 Set<PoolItem> qPoolItems = partialSolutionPoolMap.get(q);			  
 		 for (PoolItem qPoolItem : qPoolItems) {
 			if (qPoolItem.getProcessnode().getActivityID().compareTo(tq.getActivityID()) == 0) {
 				 tqPI = qPoolItem;
 				 break;
 			}				  
 		 }
 			  	  
 		if (childPI != null) {
 			if (querygraph.isRoot(q)) { 
 	 			 rootPI = tqPI;
 	 			 rootChildPI = childPI;		
 			} else {
 	 			// Add the new pool element to previous created element from child pool
 	 			childPI.addParent(tqPI);							
 			}
 		}
 		 //else {
 		 //  To Do: Sweep tq with parent pool
 		 if(!querygraph.isLeaf(q)) {
 			sweepPartialSolutionsReverse(q, tq, tchildq, childPI, partialPathQ);  
 		 }
 		 //}	
 			  
 		 return tqPI;
 	   }
 	   
 	/**
 	 * Check the new incoming pool element tqPI with each element from parent pool, in case
 	 * of descendant-ancestor relationship, link both elements and process the new emerging
 	 * path. 
 	 *
 	 * @param q query node q.
 	 * @param tq current element of q's stream.
 	 * @param tchildq positional representation of childq (a process node matches q's child)
 	 * @param childPI last created pool element in q's child pool.
 	 * @param pathQ partial path from leaf node to q.
 	 * 
 	 */
 	 protected void sweepPartialSolutionsReverse(ActivityNode q, NodeRegionEncoding tq, NodeRegionEncoding tchildq, PoolItem childPI, String pathQ) {
// 	 	  Set<PoolItem> poolParentQ = partialSolutionPoolMap.get(querygraph.parent(q));
// 	 	  if (poolParentQ != null) {
// 	 	    for (PoolItem poolParentQItem : poolParentQ) {	 	    		
// 	 	    	if (checkContainment2(poolParentQItem.getProcessnode(), tq)) {
// 	 	    		tqPI.addParent(poolParentQItem);
// 	 	    		outputPoolSolutions(tqPI, pathQ);		 
// 	 	    	}			 
// 	 	   }
// 	 	}		   
 		Set<PoolItem> poolQ = partialSolutionPoolMap.get(q); 
 		//if (poolQ != null) {
 		for (PoolItem poolQItem : poolQ) {
 			// Check whether pool item 
 			if (poolQItem.getProcessnode().getActivityID().compareTo(tq.getActivityID()) != 0) {
 				if (checkContainment2(poolQItem.getProcessnode(), tchildq)) {
 					childPI.addParent(poolQItem);
 					outputPoolSolutions(childPI, pathQ);
 				}
 			}
 		}	  
 		//}		  
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
 		String tempSolution = partialPath;
 		String tempID = "";
 		List<PoolItem> tempparents;
 			
 		if (querygraph.isRoot(tqPI.getQuerynode())) {
 			logger.warn(partialPath);
 		} else {
 			if ((tempparents = tqPI.getParents()) != null) {
 				for (PoolItem tempparent : tempparents) {
 					tempID = tempparent.getProcessnode().getActivityID();
 					tempSolution = processgraph.getActivityName(tempID) + ": " + tempID + "  ||  "+ partialPath;
 					outputPoolSolutions(tempparent, tempSolution);
 				}
 			}
 		}	
 	}
 	   
// 	  protected void expand2(ActivityNode q, NodeRegionEncoding tq, NodeInStack h) {
// 		  // Alternative 1: direction is from child to parent
//// 		  NodeInStack qNIS = new NodeInStack(tq);
//// 		  partialSolutionPoolMap.get(q).add(qNIS);
//// 		  h.setNext(qNIS);
// 		  // Alternative 2: direction is from parent to child
// 		  NodeInStack qNIS = new NodeInStack(tq, h);
// 		  partialSolutionPoolMap.get(q).add(qNIS);
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
// 				  Set<NodeInStack> childQsolutionSet = partialSolutionPoolMap.get(childQ);
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

