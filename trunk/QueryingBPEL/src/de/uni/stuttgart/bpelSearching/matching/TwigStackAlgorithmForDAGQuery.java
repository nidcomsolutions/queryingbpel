/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.index.NodeInStack;
import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Implements the TwigStackD algorithm for directed acyclic process graph  
 * and query tree.
 * 
 * @author luwei
 *
 */
public class TwigStackAlgorithmForDAGQuery extends TwigStackAlgorithm {
	
    /**
     * A data structure to temporarily hold the stack popped nodes to be grown from 
     * intermediate partial solutions to full solutions in a bottom-up fashion.
     * 
     */
	protected HashMap<ActivityNode, Set<NodeInStack>> partialSolutionPoolMap = 
			new HashMap<ActivityNode, Set<NodeInStack>>();
	
	
    /**
     * A data structure to temporarily hold partial solution pool nodes which can
     * be expanded as partial solutions.
     * 
     */
	protected HashMap<ActivityNode, Set<NodeInStack>> candidateSetMap = 
			new HashMap<ActivityNode, Set<NodeInStack>>();

	/**
	 * Creates a new TwigStackAlgorithmForDAGQuery object for the specified query tree 
	 * and process graph, initialize stream and solution stack for each query
	 * node.
	 * 
	 * @param qg the query graph.
	 * @param pg the process graph.
	 */
	public TwigStackAlgorithmForDAGQuery(QueryGraph qg, ProcessFlowGraph pg) {
		super(qg, pg);
		
		Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
		
		for (ActivityNode queryNode : vertexSetQuery) {	
			partialSolutionPoolMap.put(queryNode, new HashSet<NodeInStack>());
			candidateSetMap.put(queryNode, new HashSet<NodeInStack>());
		}	
	}

    /**
     * @see TwigStackAlgorithm#twigStackExactMatch(ActivityNode q)
     */
	@Override
	public void twigStackExactMatch(ActivityNode q) {
		ActivityNode qmin, parentQmin, root;
		LinkedList<NodeRegionEncoding> tqmin;
		Stack<NodeInStack> sqmin;
		LinkedList<NodeRegionEncoding> tParentQmin;
		Stack<NodeInStack> sParentQmin;
		LinkedList<NodeRegionEncoding> tRoot;
		Stack<NodeInStack> sRoot;
		Stack<NodeInStack> sA, sB, sC1, sC2;
		ActivityNode query2A, query2B, query2C1, query2C2;
		NodeRegionEncoding tqminFirst;
		
		NodeInStack tempNIS;
		Set<ActivityNode> missingNodes, emptyMissings;
		emptyMissings = new HashSet<ActivityNode>();
		boolean queryhasOneNode = (querygraph.getQueryGraph().vertexSet().size() == 1);
		
		while (!end(q)) {			
			qmin = getMinSource(q);			
			parentQmin = querygraph.parent(qmin);
		
			tqmin = queryNodeStreamMap.get(qmin);
			sqmin = queryNodeStackMap.get(qmin);
		
			tParentQmin = queryNodeStreamMap.get(parentQmin);
			sParentQmin = queryNodeStackMap.get(parentQmin);
//		
//			tRoot = queryNodeStreamMap.get(root);
//			sRoot = queryNodeStackMap.get(root);
		
//			sA = queryNodeStackMap.get(querygraph.getActivityNode("q2A"));
//			sB = queryNodeStackMap.get(querygraph.getActivityNode("q2B"));
//			sC1 = queryNodeStackMap.get(querygraph.getActivityNode("q2C1"));
//			sC2 = queryNodeStackMap.get(querygraph.getActivityNode("q2C2"));
		
			missingNodes = getMissings(qmin, queryNodeStreamMap.get(qmin).getFirst());
			if (!querygraph.isRoot(qmin) && !queryNodeStreamMap.get(qmin).isEmpty()) {
				cleanStack(querygraph.parent(qmin), queryNodeStreamMap.get(qmin).getFirst().getPreorderRank());
			}
			
			if (sweepPartialSolutions(qmin, missingNodes)) {
				if (!queryNodeStreamMap.get(qmin).isEmpty()) {
					cleanStack(qmin, queryNodeStreamMap.get(qmin).getFirst().getPreorderRank());
				}
				
				if (querygraph.isRoot(qmin) || !queryNodeStackMap.get(parentQmin).isEmpty()) {
					moveStreamToStack(qmin);			
					if (querygraph.isLeaf(qmin)) {
						actLeafNode = qmin;
						showSolutions(qmin, 0, null, 0);
						//processSolutions(qmin, 0, null, 0);
						queryNodeStackMap.get(qmin).pop();					
					}							
				} else {
					if (!queryNodeStreamMap.get(qmin).isEmpty()) {
						
						// Modification to original algorithm: before remove it 
						// from query node's stream, put it in partial solution pool
						tqminFirst = queryNodeStreamMap.get(qmin).getFirst();
						if (querygraph.isLeaf(qmin)) {
							  tempNIS = new NodeInStack(tqminFirst);
							  partialSolutionPoolMap.get(qmin).add(tempNIS);
							  sweepParentsPartialSolutionsForLeafNode(qmin, tqminFirst, tempNIS);
						} else {
							  partialSolutionPoolMap.get(qmin).add(new NodeInStack(tqminFirst));
						}
						
						if (queryhasOneNode)	{
							// Print it, if there is only one node in query graph
							logger.warn(tqminFirst.toString());
						}
						queryNodeStreamMap.get(qmin).removeFirst();
					}
				}
			} else {
				if (!queryNodeStreamMap.get(qmin).isEmpty()) {
					// ??? Modification to original algorithm:
					partialSolutionPoolMap.get(qmin).add(new NodeInStack(queryNodeStreamMap.get(qmin).getFirst()));
					
					queryNodeStreamMap.get(qmin).removeFirst();
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
     * Check whether process node h is descendant of process node tq by
     * recursively looking up predecessors of h in SSPI.
     *
     * @param tq current node region encoding of query node q's stream.
     * @param h  node region encoding in Pool[child(q)].
     *
     * @return <code>true</code> if <code>h</code> is descendant of <code>tq</code>,
     * otherwise <code>false</code>.
     */
   protected boolean checkContainment(NodeRegionEncoding tq, NodeRegionEncoding h) {
	   boolean found = false;
	   SortedSet<NodeRegionEncoding> predecessorsH, predecessorsfirstPLh;
	   NodeRegionEncoding firstPLh;
	   int tqNREstart, tqNREend;
	   
	   tqNREstart = tq.getPreorderRank();
	   tqNREend = tq.getPostorderRank();
	   predecessorsH = processgraph.getPredecessors(h.getActivityID());
	   if (predecessorsH != null) {
		   while (!predecessorsH.isEmpty() && !found) {
			   firstPLh = predecessorsH.first();
			   if ((firstPLh.getPreorderRank() >= tqNREstart) && (firstPLh.getPostorderRank() <= tqNREend)) {
				   return true;
			   } else if (firstPLh.getPreorderRank() > tqNREend) {
				   return false;
			   } else if (((predecessorsfirstPLh = processgraph.getPredecessors(firstPLh.getActivityID())) == null)
					   || predecessorsfirstPLh.isEmpty()) {
				   predecessorsH.remove(firstPLh);
			   } else if ((found = checkContainment(tq, firstPLh)) == false) {
				   predecessorsH.addAll(predecessorsfirstPLh);
				   predecessorsH.remove(firstPLh);
			   } 		   
		   }		   
		   if (predecessorsH.isEmpty()) {
			   processgraph.removePredecessors(h.getActivityID());				   
		   }
	   }
	   return found;
   }
   	
   
   /**
    * Check whether the stream Tchildq has any "inSync" node with respect to Tparent
    *  starting from the position marker pos.
    *
    * @param childq child node of q.
    * @param pos current position of q's stream.
    * @param tparent current node region encoding of q's stream.
    * 
    * @return <code>true</code> if stream of <code>childq</code> has at least one 
    * "inSync" node with respect to stream <code>tparent</code> starting from 
    * the position marker <code>pos</code>, otherwise <code>false</code>.
    * 
    */
  protected boolean checkInSync(ActivityNode childq, int pos, NodeRegionEncoding tparent) {
	  
	  int tchildqSize = queryNodeStreamMap.get(childq).size();
	  LinkedList<NodeRegionEncoding> childqStream = queryNodeStreamMap.get(childq);
	  
	  while ((pos < tchildqSize) && (childqStream.get(pos).getPreorderRank()
			  < tparent.getPreorderRank())) {
		  pos++;		  
	  }
	  
	  //logger.warn("pos: " + pos);
	  
	  if ((pos < tchildqSize) && (childqStream.get(pos).getPreorderRank()
			  < tparent.getPostorderRank())) {		  
		  return true;
	  } else {
		  return false; 		  
	  }	  
  }
  
  
  /**
   * Collects all the child streams which miss any of the required "inSync" children nodes 
   * or their descendant streams miss the required "inSync" descendants.
   *
   * @param q query node q.
   * @param tq current node region encoding of q's stream.
   * 
   * @return children nodes which miss "inSync" children/descendants.
   * 
   */
 protected Set<ActivityNode> getMissings(ActivityNode q, NodeRegionEncoding tq) {
	 int pos, tQiSize;
	 boolean allInSync;
	 Set<ActivityNode> missingNodes = new HashSet<ActivityNode>();
	 Set<ActivityNode> childrenQ = querygraph.children(q);
	 Set<ActivityNode> mi;
	 
	 for (ActivityNode childQi : childrenQ) {
		 pos = 0;
		 if (checkInSync(childQi, pos, tq)) {
			 allInSync = false;
			 tQiSize = queryNodeStreamMap.get(childQi).size();
			 while ((pos < tQiSize) && (queryNodeStreamMap.get(childQi).get(pos).getPreorderRank()
					 < tq.getPostorderRank()) && !allInSync) {
				 mi = getMissings(childQi, queryNodeStreamMap.get(childQi).get(pos));
				 if (!mi.isEmpty()) {
					 pos++;					 
				 } else {
					 allInSync = true;
				 }
			 }
			 if(!allInSync) {
				 missingNodes.add(childQi);
			 }			 
		 } else {
			 missingNodes.add(childQi);		 
		 }		 
	 }	 
	 return missingNodes;	 
 }
 
 /**
  * A operation associated with the partial solution pool. When pushing a node tq
  * into its stack, if we find, that it has a node h in the child partial solution pool
  * which is descendant of tq, then we build a parent pointer from it to tq to expand
  * the partial solutions headed by h to those headed by tq.
  *
  * @param q query node q.
  * @param tq current node region encoding of q's stream.
  * @param h current node region encoding of q's child pool.
  * 
  */
  protected void expand(ActivityNode q, NodeRegionEncoding tq, NodeInStack h) {
	  // Alternative 1: direction is from child to parent
//	  NodeInStack qNIS = new NodeInStack(tq);
//	  partialSolutionPoolMap.get(q).add(qNIS);
//	  h.setNext(qNIS);
	  // Alternative 2: direction is from parent to child
	  NodeInStack qNIS = new NodeInStack(tq, h);
	  partialSolutionPoolMap.get(q).add(qNIS);
	  
	  if (querygraph.isRoot(q)) {
		  processSolutionsInRootPool(qNIS);
//		  processSolutionsInRootPool(q, tq);
	  }  
  }
  
  /**
   * Process solutions headed by tq in the root pool.
   * 
   * @param poolItem an element stored in partial solution pool.
   * 
   */ 
  
  // Alternative 1: direction is from child to parent
//  protected void processSolutionsInRootPool(ActivityNode q, NodeRegionEncoding tq) {
//	  String tempID;
//	  String solution = "";
//	  Set<ActivityNode> childrenQ = querygraph.children(q);
//	  boolean found;
//	  if (querygraph.isLeaf(q)) {
//		  tempID = tq.getActivityID();
//		  solution += processgraph.getActivityName(tempID) + ": " + tempID;
//		  logger.warn(solution);
//	  } else {
//		  found = false;
//		  for (ActivityNode childQ: childrenQ) {
//			  Set<NodeInStack> childQsolutionSet = partialSolutionPoolMap.get(childQ);
//			  for (NodeInStack childQsolution : childQsolutionSet) {
//				  if (childQsolution.getNext().getNode() == tq) {
//					  tempID = tq.getActivityID();
//					  solution += processgraph.getActivityName(tempID) + ": " + tempID + "  ||  ";
//					  processSolutionsInRootPool(childQ, childQsolution.getNode());
//					  found = true;
//					  break;
//				  }	  				  
//			  }
//			  if (found) {
//				  break;
//			  }
//		  }
//	  }
//  }
  
//Alternative 2: direction is from parent to child
  protected void processSolutionsInRootPool(NodeInStack poolItem) {
	  NodeInStack tempPoolItem = poolItem;
	  String tempID;
	  String solution = "";

	  tempID = poolItem.getNode().getActivityID();
	  solution += processgraph.getActivityName(tempID) + ": " + tempID + "  ||  ";
	  tempPoolItem = poolItem.getNext();
	  poolItem.setNext(null);
	  
	  while (tempPoolItem != null) {
		  tempID = tempPoolItem.getNode().getActivityID();
		  solution += processgraph.getActivityName(tempID) + ": " + tempID + "  ||  ";
		  tempPoolItem = tempPoolItem.getNext();
	  }
	  
	  logger.warn(solution);
  }
  
 /**
  * Check whether every missing child can be complemented by at least one node
  * in the corresponding partial solution pool.
  *
  * @param q query node q.
  * @param missings q's children which miss "inSync" children/descendants.
  * 
  * @return <code>true</code> if <code>missings</code> can be complemented 
  * by at least one node in the corresponding partial solution pool.
  * otherwise <code>false</code>.
  * 
  */
 protected boolean sweepPartialSolutions(ActivityNode q, Set<ActivityNode> missings) {
	 
	 Set<ActivityNode> childrenQ = querygraph.children(q);
	 NodeRegionEncoding nextTq = queryNodeStreamMap.get(q).getFirst();
	 	 
	 for (ActivityNode childQi : childrenQ) {
		 for (NodeInStack h : partialSolutionPoolMap.get(childQi)) {
			if (checkContainment(nextTq, h.getNode())) {
				candidateSetMap.get(childQi).add(h);
				if (missings.contains(childQi)) {
					missings.remove(childQi);
				}
			} 			
		 }		 
	 }
	 
	if (missings.isEmpty()) {
		 for (ActivityNode childQi : childrenQ) {
			 for (NodeInStack h : candidateSetMap.get(childQi)) {
				 expand(q, nextTq, h);
			 }
		 }
		 return true;
	} else {
		return false;
	}
 }
 
 /**
  * Sweep every partial solution of partial solution pool associated with q' parents, if check containment 
  * with q's current partial solution returns true, the point the partial solution pool of q' parent
  * to q's current partial solution.
  *
  * @param q query leaf node q.
  * @param qFirstNRE first node region encoding of stream associated with the query leaf node q.
  * @param qNIS the newly pushed partial solution item for query node q.
  * 
  */
 protected void sweepParentsPartialSolutionsForLeafNode(ActivityNode q, NodeRegionEncoding qFirstNRE, NodeInStack qNIS) {
	Set<ActivityNode> parentsq = querygraph.parents(q);
	for (ActivityNode parentq : parentsq) {		
		for (NodeInStack h : partialSolutionPoolMap.get(parentq)) {
			if (checkContainment(h.getNode(), qFirstNRE)) {
				h.setNext(qNIS);
			}		
		}
	}  
 }
 
 
 /**
  * Outputs solutions to individual query paths in root-to-leaf order.
  * 
  * @param q query node q.
  * @param stackpos the position in current stack that we are interested in for the current solution.
  * @param childq child node of the node q.
  * @param childStackPos the position of child stack.
  *
  */	
	protected void showSolutions(ActivityNode q, int stackpos, ActivityNode childq, int childStackPos) {
		ActivityNode temp;
		Stack<NodeInStack> tempStack;
		String tempString = " ";
		String tempID = " ";
		int parentStackIndex, tempIndex;
		Set<NodeInStack> childqPool;
		
		queryNodeStackPositionMap.put(q, new Integer(stackpos));
		// Modification to original algorithm: 
		if (!querygraph.isRoot(q)) {
			if (querygraph.isLeaf(q)) {
				expand(q, queryNodeStackMap.get(q).get(stackpos).getNode(), null);
			} else {
				// Modification to original algorithm:
				childqPool = partialSolutionPoolMap.get(childq);
				for (NodeInStack childqNIS : childqPool) {
					if (childqNIS.getNode().getActivityID().compareTo
							(queryNodeStackMap.get(childq).get(childStackPos).getNode().getActivityID()) == 0) {
						expand(q, queryNodeStackMap.get(q).get(stackpos).getNode(), childqNIS);
						break;
					}				
				}
				
			}
		}
		
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
				showSolutions(temp, i, q, stackpos);				
			}			
		}				
	}
	
    /**
     * Process each query path solution, store them in final solution stack.
     * 
     * @param q query node q.
     * @param stackpos the stack position that we are interested in to compute the solution.
     * @param childStackPos the position of child stack.
     *
     */	
	protected void processSolutions(ActivityNode q, int stackpos, int childStackPos) {
		
		
	}
    	
}
