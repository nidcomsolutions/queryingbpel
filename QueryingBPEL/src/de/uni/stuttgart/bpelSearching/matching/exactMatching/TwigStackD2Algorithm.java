/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.PoolItem3Ext;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;

/**
 * Implements the TwigStackD algorithm (Modified Version) for matching a query 
 * tree against a rooted DAG pattern process graph. Compare with the original 
 * TwigStackD algorithm, a different data structure named solution pools is 
 * used. Each pool element stored in solution pools consists of three components: 
 * query node, process node (which matches the query node), a list of references 
 * to the pool elements in its children pools.
 * 
 * @author luwei
 *
 */
public class TwigStackD2Algorithm extends TwigStackAlgorithm {
	
    /**
     * A data structure to temporarily hold the processed nodes to be grown from 
     * intermediate partial solutions to full solutions.
     * 
     */		
	protected HashMap<ActivityNode, Set<PoolItem3Ext>> solutionPoolMap = 
		new HashMap<ActivityNode, Set<PoolItem3Ext>>();
	
    /**
     * Stores current position of the stack from queryNodeStackMap.
     */
	protected Map<ActivityNode, Integer> queryNodeStreamPositionMap = 
		new HashMap<ActivityNode, Integer>();
	
	/**
	 * Creates a new TwigStackD2Algorithm object for the specified  
	 * process graph, initialize streams, solution stacks, solution pools.
	 * 
	 * @param pg the process graph.
	 */
	public TwigStackD2Algorithm(ProcessGraph pg) {
		super(pg);
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		for (ActivityNode queryNode : vertexSetQuery) {	
			solutionPoolMap.put(queryNode, new HashSet<PoolItem3Ext>());
			queryNodeStreamPositionMap.put(queryNode, new Integer(0));
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
		float matchPathRatio;
		NodeRegionEncoding tqactFirst, tqactCurrent;
		int tqactPos;

		logger.warn("***run TwigStackD2Algorithm ***");
		if (allQuerySubtreeNodesStreamsNotEmpty(q)) {
			root = querygraph.getStartActivity();		
			while (!end(q)) {
				// **** Change ****
				//qact = getMinSource(q);
				resetStreamPositionMap();
				qact = getNextExtForExactMatch(q);
				parentQact = querygraph.getParent(qact);
				
				streamqact = queryNodeStreamMap.get(qact);
				sqact = queryNodeStackMap.get(qact);
		
				streamParentQact = queryNodeStreamMap.get(parentQact);
				sParentQact = queryNodeStackMap.get(parentQact);
		
				streamRoot = queryNodeStreamMap.get(root);
				sRoot = queryNodeStackMap.get(root);
				
				if (streamqact.isEmpty()) {
					logger.warn("Stop processing the given process graph!");
					break;
				} else {
					tqactPos = queryNodeStreamPositionMap.get(qact).intValue();
					tqactCurrent = queryNodeStreamMap.get(qact).get(tqactPos);
					if (checkSubtreeStreams(qact)) {
						queryNodeStreamMap.get(qact).remove(tqactPos);
					} else {
						if (!querygraph.isRoot(qact)) {
							cleanStack(parentQact, tqactCurrent.getStart());
						}
							
						if (querygraph.isRoot(qact) || !queryNodeStackMap.get
								(parentQact).isEmpty()) {
							cleanStack(qact, tqactCurrent.getStart());
							moveStreamToStack(qact);
							sweepPartialSolutionsTSD2(qact, tqactCurrent);
								
							if (querygraph.isLeaf(qact)) {
								actLeafNode = qact;					
								//showSolutions2Ext(qact, 0, null, null, "");
								//processSolutions(qact, 0, null, 0);
								queryLeafNodesSolution.add(qact);
								queryNodeStackMap.get(qact).pop();										
							} 						
						} else {										 			
							queryNodeStreamMap.get(qact).remove(tqactPos);
						}
					}	
				}
			}
		
			// Phase 2: output all exact matchings stored in the solution pools
			matchPathRatio = getMatchPathRatio();
			if (matchPathRatio == 1.0) {
				outputAllExactMatchingSolutionsInSolutionPools();
			}
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
		
		root = querygraph.getStartActivity();
		
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
			if (isQactStreamEmpty) {
				tqactFirst = queryNodeStreamMap.get(qact).getFirst();
				if (!querygraph.isRoot(qact)) {
					cleanStack(parentQact, tqactFirst.getStart());
				}
					
				if (querygraph.isRoot(qact) || !queryNodeStackMap.get(parentQact).isEmpty()) {
					cleanStack(qact, tqactFirst.getStart());
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
//								  solutionPoolMap.get(qact).add(tqactFirstPI);
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
		matchSimilarity = getMatchPathRatio();
		if (matchSimilarity > threshold) {
			outputAllInexactMatchingSolutionsInSolutionPools(matchSimilarity);
		}		
	}

	
  /**
    * Check whether a process node is descendant of another process node 
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
	   
	   tqNREstart = tq.getStart();
	   tqNREend = tq.getEnd();

	   if ((h.getStart() > tqNREstart) && (h.getEnd() < tqNREend)) {
		   return true;
	   } else {
		   found = false;
		   predecessorsH = processgraph.getPredecessors2(h.getActivityID()); 
		   if (predecessorsH != null) {
			   if (!predecessorsH.isOriginal()) {
				   predecessorsH.getCurrentPredecessors().clear();
			  	 // ? Not Sure
			  	 predecessorsH.getCurrentPredecessors().addAll
			  	 	(predecessorsH.getOriginalPredecessors());
			  	 predecessorsH.setOriginal(true);
			   }
		   
			   while (!predecessorsH.getCurrentPredecessors().isEmpty() && !found) {
				   firstPLh = predecessorsH.getCurrentPredecessors().first();
				   if ((firstPLh.getStart() >= tqNREstart) && (firstPLh.getEnd() <= tqNREend)) {
					   return true;
				   } else if (firstPLh.getStart() > tqNREend) {
					   return false;
				   } else if (((predecessorsfirstPLh = processgraph.
						   getPredecessors2(firstPLh.getActivityID())) == null)
						   || predecessorsfirstPLh.getOriginalPredecessors().isEmpty()) {
					   predecessorsH.getCurrentPredecessors().remove(firstPLh);
					   if (predecessorsH.isOriginal()) {
						   predecessorsH.setOriginal(false);
					   }
				   } else if ((found = checkContainment2(tq, firstPLh)) == false) {
					   predecessorsH.getCurrentPredecessors().addAll
					   		(predecessorsfirstPLh.getCurrentPredecessors());
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
    * unlike function getNextExt(q) in super class TwigStackAlgorithm, the 
    * returned node is not necessary to have a minimal start value among 
    * all remaining stream nodes.
    *
    * @param q a query node.
    *
    * @return the next processing node.
    * 
    */  
   protected ActivityNode getNextExtForExactMatch(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL, tempPos, streamSize, tempPosC;
		boolean containsAll, foundReturnChild;
		NodeRegionEncoding nextQ, tchildQNext;
		
		minL = processgraph.getMaxEnd() + 1;
		maxL = 0;
		niL = 0;
		nmin = q;
		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);
		List<NodeRegionEncoding> tchildrenNext = new ArrayList<NodeRegionEncoding>();
		List<String> childrenNextIDs = new ArrayList<String>();
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExtForExactMatch(childQi);		
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
					return ni;
				}
				tempPosC = queryNodeStreamPositionMap.get(ni).intValue();
				tchildQNext = queryNodeStreamMap.get(ni).get(tempPosC);
				tchildrenNext.add(tchildQNext);
				childrenNextIDs.add(ni.getActivityID());
				niL = tchildQNext.getStart();
				//niR = tchildQNext.getEnd();
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}		
				if (niL > maxL) {
					maxL = niL;
				}
				//if (niR < minR) {
					//minR = niR;
				//}
			}
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			
		returnChildNode = nmin;
		
		if (tchildrenNext.isEmpty() || (!queryNodeStreamMap.get(q).isEmpty()&& 
				(queryNodeStreamMap.get(q).getFirst().getStart() < minL))) {
			return q;			
		} else {
			//while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				//	getFirst().getStart() < minR)) {			
				//queryNodeStreamMap.get(q).removeFirst();
			//}				
			if (queryNodeStreamMap.get(q).isEmpty()) {
				return returnChildNode;
			} else {
				tempPos = 0;
				streamSize = queryNodeStreamMap.get(q).size();
				containsAll = false;
				foundReturnChild = false;
				while ((tempPos < streamSize) && !containsAll) {
					nextQ = queryNodeStreamMap.get(q).get(tempPos);
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
					queryNodeStreamPositionMap.put(q, new Integer(tempPos-1));
					return q;
				} else {
					return returnChildNode;
				}
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
   protected ActivityNode getNextExtForExactMatch2(ActivityNode q){
		ActivityNode ni, nmin, returnChildNode;
		int minL, maxL, niL;
		boolean containsAll;
//		boolean existGetNextChildStreamEmpty = false;
		NodeRegionEncoding nextQ, tchildQNext;
		
		minL = processgraph.getMaxEnd();
		maxL = 0;
		niL = 0;
		nmin = q;

		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);
		Set<ActivityNode> childrenNextQueryNodes = new HashSet<ActivityNode>();
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextExtForExactMatch2(childQi);
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
//					|| existGetNextChildStreamEmpty) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				childrenNextQueryNodes.add(ni);
				niL = queryNodeStreamMap.get(ni).getFirst().getStart();			
				if (niL < minL) {
					minL = niL;
					nmin = ni;
				}			
				if (niL > maxL) {
					maxL = niL;
				}
			} 
//			else {
				 //There is a child solution whose data stream is empty
//				existGetNextChildStreamEmpty = true;
//			}
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			
		returnChildNode = nmin;
		
		// For inexact matching
		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).
				getFirst().getStart() < minL)) {
		// For exact matching, but still has problem if sibling nodes the same are
//		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().
//				getStart() < minL) && !existGetNextChildStreamEmpty) {
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
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				// *** Change ***
				childrenNextQueryNodes.add(ni);
				niL = queryNodeStreamMap.get(ni).getFirst().getStart();			
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
				getFirst().getEnd() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			
		returnChildNode = nmin;
		
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
    * Set all stream positions to 0 that means position of the first element 
    * in the stream.
    *
    */
   protected void resetStreamPositionMap() {
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		queryNodeStreamPositionMap.clear();
		for (ActivityNode queryNode : vertexSetQuery) {	
			queryNodeStreamPositionMap.put(queryNode, new Integer(0));
		}
   }
   
   /**
    * Extend the partial solution encoded in the stack by pushing a new stream 
    * node in the stack.
    * 
    * @param q  actual query node, whose stream and stack have to be updated.
    *
    */
	protected void moveStreamToStack(ActivityNode  q) 
	{
		// The new pushed element consists: the next element of q's stream, 
		// Pointer to the top element of parent(q)'s stack
		int tqPos = queryNodeStreamPositionMap.get(q).intValue();
		NodeRegionEncoding tqCurrent = queryNodeStreamMap.get(q).get(tqPos);
		if (querygraph.isRoot(q)) {
			queryNodeStackMap.get(q).push(new NodeInStack
					(tqCurrent, null));
		} else {
			queryNodeStackMap.get(q).push(new NodeInStack(tqCurrent, 
					queryNodeStackMap.get(querygraph.getParent(q)).lastElement()));
		}
		queryNodeStreamMap.get(q).remove(tqPos);		
	}
	
  /**
   * Create a new pool element tqPI with tq and put it in the solution pool, 
   * check tqPI with each element in its children pools, in case of ancestor
   * -descendant relationship, link both pool elements. 
   *
   * @param q query node q.
   * @param tq current process node in q's stream.
   * 
   */
  protected void sweepPartialSolutionsTSD2(ActivityNode q, NodeRegionEncoding tq) {
	  ActivityNode parentQ = querygraph.getParent(q);
	  Set<PoolItem3Ext> poolParentQ;
	  Set<ActivityNode> childrenQ = querygraph.getChildren(q);

	  PoolItem3Ext tqPI = new PoolItem3Ext(q, tq, null);
	  solutionPoolMap.get(q).add(tqPI);
	  
	  if (parentQ != null) {
		poolParentQ = solutionPoolMap.get(parentQ);
			for (PoolItem3Ext poolItemParentQ : poolParentQ) {
				if (checkContainment2(poolItemParentQ.getProcessnode(), tq)) {
					poolItemParentQ.addChild(tqPI);
				} 				
			}
	  }
	  
	  for (ActivityNode childQi : childrenQ) {
		 for (PoolItem3Ext h : solutionPoolMap.get(childQi)) {
			if (checkContainment2(tq, h.getProcessnode())) {
				//h.addParent(tqPI);
				tqPI.addChild(h);
				//hasExtendedSolutions = true;
			} 			
		 }		 
	 }
	  
//	 if(hasExtendedSolutions) {
//		 stackPos = queryNodeStackMap.get(q).size() - 1;
//		 qSolution = processgraph.getActivityName(tq.getActivityID()) 
//		 	+ ": " + tq.getActivityID() + "  ||  ";
//		 showExpandedSolutions(q, stackPos, tqPI, qSolution);		 
//	 }
  }
  
  /**
   * Outputs expanded solutions rooted at tqPI in solution pools in root-to-leaf order.
   * 
   * @param q query node q.
   * @param stackpos the position in q's stack that we are interested in for the current solution.
   * @param tqPI last created pool element with tq.
   * @param partialPath partial path from expanded node to q.
   * 
   */ 
	protected void showExpandedSolutions(ActivityNode q, int stackpos, PoolItem3Ext tqPI,
			String partialPath) {
		ActivityNode temp;
		Stack<NodeInStack> tempStack;
		String tempID = "";
		int parentStackIndex;
		
		if (querygraph.isRoot(q)) {
			outputPoolSolutionsRootedAtTqPI(tqPI, partialPath);
		} else {			
			NodeInStack parentNodeInStack = queryNodeStackMap.get(q).get(stackpos).getNext();
			temp = querygraph.getParent(q);
			tempStack = queryNodeStackMap.get(temp);
			parentStackIndex = tempStack.indexOf(parentNodeInStack);
			
			for (int i = 0; i <= parentStackIndex; i++) {
				tempID = tempStack.get(i).getNode().getActivityID();
				partialPath = processgraph.getActivityName(tempID) + ": " + tempID
					+ "  ||  "+ partialPath;
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
		Set<PoolItem3Ext> tqPIChildren;
		ActivityNode q = tqPI.getQuerynode();

		if (querygraph.isLeaf(q)) {
			logger.warn(partialPath);
		} else {			
			if ((tqPIChildren = tqPI.getChildren()) != null) {
				for (PoolItem3Ext tqPIChild : tqPIChildren) {
					tqPIChildID = tqPIChild.getProcessnode().getActivityID();
					partialPath += processgraph.getActivityName(tqPIChildID) + ": " 
						+ tqPIChildID + "  ||  ";
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
 	protected void showSolutions2Ext(ActivityNode q, int stackpos, NodeRegionEncoding tchildq,
 			PoolItem3Ext childPI, String partialPath) {
 		ActivityNode temp;
 		Stack<NodeInStack> tempStack;
 		int parentStackIndex;
 		PoolItem3Ext cPI;
 	
 		NodeRegionEncoding tq = queryNodeStackMap.get(q).get(stackpos).getNode();
 		cPI = expandStackPathSolution(q, tq, tchildq, childPI, partialPath);
 		partialPath = processgraph.getActivityName(tq.getActivityID()) + ": " 
 			+ tq.getActivityID() + "  ||  "+ partialPath;
 		
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
 	  * A operation associated with the partial solution pool. This operation is 
 	  * called during the processing of output the path solution, whose order is 
 	  * from leaf to root. For each node tq along the path we find corresponding 
 	  * pool item tpPI in the partial solution pool. Except that, if we find, that 
 	  * tqPI has a parent tpPI in the parent partial solution pool, which will not 
 	  * be output in current path, then we build a parent pointer from tqPI to tpPI.
 	  *
 	  * @param q query node q.
 	  * @param tq current element of q's stream.
 	  * @param tchildq positional representation of a node from childq's stream.
 	  * @param childPI pool element in q's child pool.
 	  * @param partialPathQ partial path from leaf node to q 
 	  * 
 	  * @return the pool element associated with q and tq
 	  * 
 	  */  
	  // Alternative 2: direction is from parent to child
 	  protected PoolItem3Ext expandStackPathSolution(ActivityNode q, NodeRegionEncoding tq,
 			  NodeRegionEncoding tchildq, PoolItem3Ext childPI, String partialPathQ) {
 		 // Create a new pool element for tq, we have created tqPI in function 
 		 // sweepPartialSolutionTSD2 and added it in the pool, so we don't add 
 		 // it in the solution pool this time.
 		 PoolItem3Ext tqPI = new PoolItem3Ext(q, tq, null);
 		
 		 // Retrieve tqPI from the Pool[q]
 		 Set<PoolItem3Ext> qPoolItems = solutionPoolMap.get(q);
 		 for (PoolItem3Ext qPoolItem : qPoolItems) {
 			if (qPoolItem.getProcessnode().getActivityID().
 					compareTo(tq.getActivityID()) == 0) {
 				 tqPI = qPoolItem;
 				 break;
 			}				  
 		 } 		
 		// ******** change *********
//	 	if (childPI != null) {
//			tqPI.addChild(childPI);
//		}
// 		if(!querygraph.isLeaf(q)) {
// 			sweepPartialSolutionsReverse(q, tchildq, childPI, partialPathQ);  
// 		}			  
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
 	 protected void sweepPartialSolutionsReverse(ActivityNode q, NodeRegionEncoding tchildq,
 			 PoolItem3Ext childPI, String partialPathQ) {		   
 		Set<PoolItem3Ext> poolQ = solutionPoolMap.get(q);
 		Stack<NodeInStack> stackQ = queryNodeStackMap.get(q);
 		boolean belongsToCurrentPaths;
 		String poolQItemDataNodeID, tempPartialPath;
 		for (PoolItem3Ext poolQItem : poolQ) {
 			// Check whether pool item 
 			belongsToCurrentPaths = false;
 			poolQItemDataNodeID = poolQItem.getProcessnode().getActivityID();
 			for (NodeInStack stackQitem: stackQ) {
 				if (poolQItemDataNodeID.compareTo(stackQitem.getNode()
 						.getActivityID()) == 0) {
 					belongsToCurrentPaths = true;
 					break;
 				}				
 			}
 			
 			if (!belongsToCurrentPaths) {
 				if (checkContainment2(poolQItem.getProcessnode(), tchildq)) {
 					poolQItem.addChild(childPI);	
 					tempPartialPath = processgraph.getActivityName(poolQItemDataNodeID)
 						+ ": " + poolQItemDataNodeID + "  ||  "+ partialPathQ;
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
 			tqID = tqPI.getProcessnode().getActivityID();
 			poolParentQ = solutionPoolMap.get(querygraph.getParent(q));
 			for (PoolItem3Ext poolItemParentQ : poolParentQ) {
 				if ((childrenpoolParentQ = poolItemParentQ.getChildren()) != null) {
 					for (PoolItem3Ext childpoolParentQ : childrenpoolParentQ) {
 						if (childpoolParentQ.getProcessnode().getActivityID().compareTo(tqID) == 0) {
 	 						tempID = poolItemParentQ.getProcessnode().getActivityID();
 	 						partialPath = processgraph.getActivityName(tempID) + ": " + tempID 
 	 							+ "  ||  "+ partialPath;
 	 						outputPoolSolutions(poolItemParentQ, partialPath);
 							break;
 						}						
 					}
 				} 				
 			}			
 		}	
 	}
 	
 	
    /**
     * Determines whether there is at least one q's subtree node, whose stream   
     * is empty.
     *
     * @param q a query node.
     *
     * @return <code>true</code> if there is at least one q's subtree node, 
     * whose stream is empty, otherwise <code>false</code>.
     */	
 	protected boolean checkSubtreeStreams(ActivityNode q) {
 		Set<ActivityNode> subtreeNodesQ = querygraph.getSubtreeNodes(q);		
 		for (ActivityNode subtreeNodeQ : subtreeNodesQ) {
 			if (queryNodeStreamMap.get(subtreeNodeQ).isEmpty()) {
 				return true;
 			}
 		}	
 		return false;
 	}
 	
 	
    /**
     * After processing all path solutions, all exact matching results stored in 
     * solution pools are output.
     *
     */
 	protected void outputAllExactMatchingSolutionsInSolutionPools() {
 		ArrayList<String> visitedQueryNodeIDs, tempMatch, tempMatch2;
 		List<ArrayList<String>> exactMatchs, tempMatchs;
 		Queue<ActivityNode> queryNodesQueue;
 		Set<PoolItem3Ext> rootPIs, currentPIs, childPIs;
 		ActivityNode queryroot, currentQueryNode;
 		Set<ActivityNode> queryChildrenNodes;
 		int size, currentQueryNodePos = 0;
 		String tempID, processNodeID;
 		boolean hasExactMatch, firstVisit, existProcNode;
 		
 		queryroot = querygraph.getStartActivity();
 		rootPIs = solutionPoolMap.get(queryroot);	
 		if (!rootPIs.isEmpty()) {
 			visitedQueryNodeIDs = new ArrayList<String>();
 			visitedQueryNodeIDs.add(queryroot.getActivityID());
 			exactMatchs = new LinkedList<ArrayList<String>>();
 			tempMatchs = new LinkedList<ArrayList<String>>();
 			for (PoolItem3Ext rootPI : rootPIs) {
 				tempMatch = new ArrayList<String>();
 				tempMatch.add(rootPI.getProcessnode().getActivityID());
 				exactMatchs.add(tempMatch);
 			}
 			queryNodesQueue = new LinkedList<ActivityNode>();
 			queryNodesQueue.add(queryroot);
 			hasExactMatch = true;
 	 		while (!queryNodesQueue.isEmpty()) {
 	 			currentQueryNode = queryNodesQueue.remove();	 			
 	 			currentPIs = solutionPoolMap.get(currentQueryNode);
 	 			if (currentPIs.isEmpty()) {
 	 				hasExactMatch = false;
 	 				break;
 	 			}
 	 			queryChildrenNodes = querygraph.getChildren(currentQueryNode);
 	 			
 	 			if (!queryChildrenNodes.isEmpty()) {
 	 	 			tempID = currentQueryNode.getActivityID();
 	 	 			for (int i = 0; i < visitedQueryNodeIDs.size(); i++) {
 	 	 				if ((visitedQueryNodeIDs.get(i).compareTo(tempID)) == 0) {
 	 	 					currentQueryNodePos = i;
 	 	 					break;
 	 	 				}
 	 	 			}
 	 			}
 	 			
 	 			firstVisit = true;
 	 			for (PoolItem3Ext currentPI : currentPIs) {
 	 				if (queryChildrenNodes.isEmpty()) {
 	 					break;
 	 				} else {
 	 	 				tempMatchs.clear();
 	 	 				tempID = currentPI.getProcessnode().getActivityID();
 	 	 				for (ArrayList<String> exactMatch : exactMatchs) {
 	 	 					if (exactMatch.get(currentQueryNodePos).compareTo
 	 	 							(tempID) == 0) {
 	 	 						tempMatch = new ArrayList<String>();
 	 	 						tempMatch.addAll(exactMatch);
 	 	 						tempMatchs.add(tempMatch);	 	 						
 	 	 					}
 	 	 				}
 	 	 				exactMatchs.removeAll(tempMatchs);
 	 	 	 			for (ActivityNode queryChildNode : queryChildrenNodes) {
 	 	 	 				if (firstVisit) {
 	 	 	 					queryNodesQueue.add(queryChildNode);
 	 	 	 					tempID = queryChildNode.getActivityID();
 	 	 	 					visitedQueryNodeIDs.add(tempID);	
 	 	 	 				}
 	 	 	 				childPIs = currentPI.getChildren(queryChildNode);
 	 	 	 				if (childPIs.isEmpty()) {
 	 	 	 					tempMatchs.clear();
 	 	 	 					break;
 	 	 	 				} else { 	 					
 	 	 	 					size = tempMatchs.size();
 	 	 	 	 	 			for (PoolItem3Ext childPI : childPIs) {
 	 	 	 	 	 				processNodeID = childPI.getProcessnode().getActivityID();
 	 	 	 		 				for (int i = 0; i < size; i++) {
 	 	 	 		 					tempMatch2 = tempMatchs.get(i);
 	 	 	 		 					existProcNode = false;
 	 	 	 		 					for (String tempID2 : tempMatch2) {
 	 	 	 		 						if (tempID2.compareTo(processNodeID)
 	 	 	 		 								== 0) {
 	 	 	 		 							existProcNode = true;
 	 	 	 		 							break;
 	 	 	 		 						}
 	 	 	 		 					}
 	 	 	 		 					if (!existProcNode) {
 	 	 	 	 		 					tempMatch = new ArrayList<String>();
 	 	 	 	 		 					tempMatch.addAll(tempMatchs.get(i));
 	 	 	 	 		 					tempMatch.add(processNodeID);
 	 	 	 	 		 					tempMatchs.add(tempMatch);
 	 	 	 		 					}
 	 	 	 		 				}
 	 	 	 	 				}	 	 	 	 			
 		 	 			 		for (int i = 0; i < size; i++) {
 		 	 			 			tempMatchs.remove(0);
 	 	 	 			 	 	}
 	 	 	 				}
 	 	 	 			}	 	 			
 	 	 	 			exactMatchs.addAll(tempMatchs);
 	 	 	 			firstVisit = false;
 	 				}
 	 			}	
 	 		}
 	 		
 	 		if (hasExactMatch) {
 				for (ArrayList<String> exactMatch : exactMatchs) {
 					String solution = "";
 					for (String em : exactMatch) {
 						solution += (em + " ");
 					}
// 					logger.warn(solution);
 		 		}
 				this.exactMatchingResults = new ExactMatchingResult(
 						processgraph.getProcessID(), processgraph.getProcessNamespace(), 
 						processgraph.getProcessName(), exactMatchs);
 				this.hasExactMatch = true;
 	 		}
 		}
 	}
 	
    /**
     * The second method for output all exact matching results stored in 
     * solution pools. 
     *
     */
 	protected void outputAllExactMatchingSolutionsInSolutionPools2() {
		String resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
		"  process namespace: " + processgraph.getProcessNamespace() + 
		"  process name: " + processgraph.getProcessName();	
		logger.warn(resultProcessInfo);	
		logger.warn("It has following exact matching results: ");	
 		Set<PoolItem3Ext> queryRootPool = solutionPoolMap.get(querygraph.getStartActivity());	
 		for (PoolItem3Ext queryRootPoolItem : queryRootPool) {
 			outputSolutionsForSpecificElementInRootPool(queryRootPoolItem);
 		}		
 	}
 	
    /**
     * After processing all path solutions, we output all inexact matching results stored in 
     * solution pools.
     *
     * @param similarity similarity between query graph and matching part of data graph.
     *
     */
 	protected void outputAllInexactMatchingSolutionsInSolutionPools(float similarity) {
		String resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
		"  process namespace: " + processgraph.getProcessNamespace() + 
		"  process name: " + processgraph.getProcessName();
		
		logger.warn(resultProcessInfo);
		
		logger.warn("Has matching Similarity: " + similarity + " with following matching results: ");
		
 		Set<PoolItem3Ext> queryRootPool = solutionPoolMap.get(querygraph.getStartActivity());		
 		for (PoolItem3Ext queryRootPoolItem : queryRootPool) {
 			outputSolutionsForSpecificElementInRootPool(queryRootPoolItem);
 		}		
 	}
 	 	
 	
    /**
     * Output solutions rooted at a specific pool element in root pool.
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
 		poolItemID = rootPoolItem.getProcessnode().getActivityID();
 		solution = processgraph.getActivityName(poolItemID) + ": " + poolItemID + "  ||  ";
 		
 		while (!theQueue.isEmpty()) {
 			currentPoolItem = theQueue.remove();
 			if ((queryChildrenNodes = querygraph.getChildren
 					(currentPoolItem.getQuerynode())) != null) {
 				for (ActivityNode queryChildNode : queryChildrenNodes) {
 					// ****** Problem **********
 					//currentChildPoolItem = currentPoolItem.getCurrentChild(queryChildNode);
 					currentChildPoolItem = currentPoolItem.
 						getCurrentChildAndMoveToNext(queryChildNode);
 					if (currentChildPoolItem != null) {
 						currentChildPoolItemID = currentChildPoolItem.
 							getProcessnode().getActivityID();
 						solution += processgraph.getActivityName(currentChildPoolItemID) 
 							+ ": " + currentChildPoolItemID + "  ||  ";
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
 	}
}

