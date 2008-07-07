package de.uni.stuttgart.bpelSearching.matching;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.index.NodeInStack;
import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Provides twigstack algorithm help functions for its
 * subclasses.
 *
 * @author Wei Lu
 */

public abstract class TwigStackAlgorithm {
	
	static Logger logger = Logger.getLogger(TwigStackAlgorithm.class);
	
	protected QueryGraph querygraph;
	protected ProcessFlowGraph processgraph;
	
    /**
     * A chain of stacks for each query node to encode the partial result.
     */
	protected Map<ActivityNode, Stack<NodeInStack>> queryNodeStackMap = 
			new HashMap<ActivityNode, Stack<NodeInStack>>();
	
    /**
     * A chain of stacks for each query node to encode the final result.
     */
	public Map<ActivityNode, Stack<NodePair>> solutionStackMap = 
		new HashMap<ActivityNode, Stack<NodePair>>();
	
    /**
     * Stores current position of the stack from queryNodeStackMap.
     */
	protected Map<ActivityNode, Integer> queryNodeStackPositionMap = 
		new HashMap<ActivityNode, Integer>();	

    /**
     * A chain of streams for each query node. The stream is a list of sorted process nodes, 
     * who match the predicate of a particular query node.
     */
	protected HashMap<ActivityNode, LinkedList<NodeRegionEncoding>> queryNodeStreamMap = 
			new HashMap<ActivityNode, LinkedList<NodeRegionEncoding>>();
	
    /**
     * Stores all query leaf nodes which have associated path solutions. 
     */
	protected Set<ActivityNode> queryLeafNodesSolution;
	
    /**
     * Stores the node region encoding of children nodes for each joined results of joined node. 
     */
	protected HashMap<StringBuffer, LinkedList<NodeRegionEncoding>> joinedResultsChildrenNodesMap = 
		new HashMap<StringBuffer, LinkedList<NodeRegionEncoding>>();
	
	
	
	protected ActivityNode actLeafNode;
	


	
	/**
	 * Creates a new TwigStackAlgorithm object for the specified query graph 
	 * and process graph, initialize stream and solution stack for each query
	 * node.
	 * 
     * @param qg the query graph.
     * @param pg the process graph.
	 */
	public TwigStackAlgorithm(QueryGraph qg, ProcessFlowGraph pg) {
		this.querygraph = qg;
		this.processgraph = pg;		
		init();
	}
	
	
	/**
	 * Do the pre-processing for the TwigStackAlgorithm, associate a stream Tq and a stack Sq to every query node q.
	 * The stream contains the positional representations of the database nodes that match the node predicate
	 * at the twig pattern node q. The nodes in the stream are sorted by their (process id, preorder number) values.
	 * Each query node q is also associated with a stack Sq. Each element in the stack consists of a pair:
	 * (positional representation of a node from Tq, pointer to a node in Sparent(q)).
	 * 
	 */
	protected void init(){
		
		Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
		Set<ActivityNode> vertexSetProcess = processgraph.getProcessGraph().vertexSet();
		LinkedList <NodeRegionEncoding> streamList;
		
		NodesComparator nodesCompare = new NodesComparator();
		NodeRegionEncodingComparator nodeRegionCompare = new NodeRegionEncodingComparator();
				
		for (ActivityNode queryNode : vertexSetQuery) {				
			streamList = new LinkedList<NodeRegionEncoding>();
			for (ActivityNode processNode : vertexSetProcess) {				
				if(nodesCompare.compare(queryNode, processNode) == 0){
					streamList.addFirst(processgraph.getNodeRegionEncoding(processNode.getActivityID()));
				}				
			}
									
			Collections.sort(streamList, nodeRegionCompare);
			queryNodeStreamMap.put(queryNode, streamList);

			queryNodeStackMap.put(queryNode, new Stack<NodeInStack>());

			solutionStackMap.put(queryNode, new Stack<NodePair>());			
		}
		
		queryLeafNodesSolution = new HashSet<ActivityNode>();
		
		// Only for debug
//		logger.warn("Output stream list");
//		for (ActivityNode queryNode : vertexSetQuery) {
//			streamList = queryNodeStreamMap.get(queryNode);
//			logger.warn(streamList);
//		}
		
		
	}
	
	
    /**
     * Implements TwigStack algorithm for exact matching, which computes answers 
     * to a query twig pattern.
     *
     * @param q a query node.
     */
	public abstract void twigStackExactMatch(ActivityNode q);
	
	
    /**
     * Implements TwigStack algorithm for inexact matching, which computes answers 
     * to a query graph.
     *
     * @param q a query node.
     * @param threshold the below threshold for returning of inexact matching results.
     * 
     */
	public abstract void twigStackInExactMatch(ActivityNode q, float threshold);
	
    /**
     * Determine whether all streams of q's subtree nodes are not empty.
     *
     * @param q a query node.
     *
     * @return <code>true</code> if all streams of q's subtree nodes are not empty,
     * otherwise <code>false</code>.
     */	
	protected boolean allQuerySubtreeNodesStreamsNotEmpty(ActivityNode q) {
		
		Set<ActivityNode> subtreeNodesQ = querygraph.subtreeNodes(q);
		
		for (ActivityNode nodeQ : subtreeNodesQ) {			
			if (queryNodeStreamMap.get(nodeQ).isEmpty()) {
				return false;
			}
		}
		return true;
	}	
	
	
    /**
     * Gets the next node to be processed, which has a minimal solution extension,
     * for exact matching.
     *
     * @param q a query node.
     *
     * @return the next processing node.
     */
	protected ActivityNode getNextForExactMatch(ActivityNode q){
		ActivityNode ni, nmin;
		int minL, maxL, niL;
		boolean existGetNextChildStreamEmpty = false;
		
		minL = processgraph.getMaxPostOrder();
		maxL = 0;
		niL = 0;
		nmin = q;
		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.children(q);
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextForExactMatch(childQi);
			//if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
			if ((ni.getActivityID().compareTo(childQi.getActivityID()) != 0) 
				|| existGetNextChildStreamEmpty) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
				niL = queryNodeStreamMap.get(ni).getFirst().getPreorderRank();			
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
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getPostorderRank() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
			
		// For inexact matching
		//if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getPreorderRank() < minL)) {
		// For exact matching, but still has problem if sibling nodes the same are
		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getPreorderRank()
				< minL) && !existGetNextChildStreamEmpty) {
			return q;			
		} else {
			return nmin;			
		}
	}
	
    /**
     * Gets the next node to be processed, which has a minimal solution extension, 
     * for inexact matching.
     *
     * @param q a query node.
     *
     * @return the next processing node.
     */
	protected ActivityNode getNextForInexactMatch(ActivityNode q){
		ActivityNode ni, nmin;
		int minL, maxL, niL;
		//boolean existGetNextChildStreamEmpty;
		
		minL = processgraph.getMaxPostOrder();
		maxL = 0;
		niL = 0;
		nmin = q;
		//existGetNextChildStreamEmpty = false;
		
		if (querygraph.isLeaf(q)) {
			return q;
		}
		
		Set<ActivityNode> childrenQ = querygraph.children(q);
		
		for (ActivityNode childQi : childrenQ) {
			ni = getNextForInexactMatch(childQi);
			if (ni.getActivityID().compareTo(childQi.getActivityID()) != 0) {
			//if ((ni.getActivityID().compareTo(childQi.getActivityID()) != 0) 
			//	|| existGetNextChildStreamEmpty) {
				return ni;
			}
			
			if (!queryNodeStreamMap.get(ni).isEmpty()) {
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
				// There is a child solution whose data stream is empty
				//existGetNextChildStreamEmpty = true;				
			//}
		}
		
		while (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getPostorderRank() < maxL)) {			
			queryNodeStreamMap.get(q).removeFirst();
		}
		
		// For exact matching, but still has problem if sibling nodes the same are
//		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getPreorderRank()
//				< minL) && !existGetNextChildStreamEmpty) {		
		// For inexact matching
		if (!queryNodeStreamMap.get(q).isEmpty() && (queryNodeStreamMap.get(q).getFirst().getPreorderRank() < minL)) {
			return q;			
		} else {
			return nmin;			
		}
	}
	

	
    /**
     * Gets the next node to be processed, whose first stream element has a minimal pre-order rank.
     *
     * @param q a query node.
     *
     * @return the next processing node.
     */
	protected ActivityNode getMinSource(ActivityNode q){
		ActivityNode nmin = q;
		int tempL, minL;
		minL = processgraph.getMaxPostOrder();
		
		Set<ActivityNode> subtreeNodesQ = querygraph.subtreeNodes(q);		
		for (ActivityNode subtreeNodeQi : subtreeNodesQ) {
			if(!queryNodeStreamMap.get(subtreeNodeQi).isEmpty()) {
				tempL = queryNodeStreamMap.get(subtreeNodeQi).getFirst().getPreorderRank();
				if (tempL < minL) {
					minL = tempL;
					nmin = subtreeNodeQi;
				}
			}
		}
		
		return nmin;
	}
	
    /**
     * Test whether the given node have at least one leaf node as its descendant,
     * which has unprocessed node in stream.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if all leaf nodes have been processed,
     * otherwise <code>false</code>.
     */
	protected boolean end(ActivityNode n){
		Set<ActivityNode> subNodes = querygraph.subtreeNodes(n);
		
//		if (queryNodeStreamMap.get(n).isEmpty())
//			return true;

		for (ActivityNode subNode : subNodes) {
			if(querygraph.isLeaf(subNode) && !(queryNodeStreamMap.get(subNode).isEmpty())) {
				return false;
			}
		}
		
		return true;		
	}
	
	
    /**
     * Extend the partial solution encoded in the stack by
     * pushing a new stream node in the stack.
     * 
     * @param q the actual node, whose stream and stack have to be updated.
     *
     */
	protected void moveStreamToStack(ActivityNode  q) {
		// The new pushed element consists: the next element of q's stream, Pointer to the top element of parent(q)'s stack	
		if (querygraph.isRoot(q)) {
			queryNodeStackMap.get(q).push(new NodeInStack(queryNodeStreamMap.get(q).getFirst(), null));
		} else {
			queryNodeStackMap.get(q).push(new NodeInStack(queryNodeStreamMap.get(q).getFirst(), queryNodeStackMap.get(querygraph.parent(q)).lastElement()));
		}
		queryNodeStreamMap.get(q).removeFirst();		
	}
	
    /**
     * Pop all elements from node q's stack that are not ancestors of node p.
     * 
     * @param sq stack for node q.
     * @param actL Leftpos coordinate(preorder rank)in the positional representation of node p.
     *
     */	
	protected void cleanStack(ActivityNode q, int actL){
		
		while(!queryNodeStackMap.get(q).isEmpty() && ((queryNodeStackMap.get(q).lastElement().getNode().getPostorderRank()) < actL)) {
			queryNodeStackMap.get(q).pop();
		}
	}
	
    /**
     * Merge all path solutions to form a final solution for the given twig pattern query. 
     *
     * @param q root node q of the query graph.
     *
     */	
	public void mergeAllPathSolutions(ActivityNode q) {	
		int i, childrenQSize;
		boolean lastChild;
		Set<ActivityNode> childrenQ = querygraph.children(q);		
		i = 0;
		childrenQSize =  childrenQ.size();
		
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
     * Merge encoded solutions of a parent query node and child query node. 
     *
     * @param nodeParent parent node.
     * @param node child node.
     * @param isLastChild indicate whether node is the last child of nodeParent.
     * 
     */	
	protected void joinParentChildSolutions(ActivityNode nodeParent, ActivityNode node, boolean isLastChild) {
		int i, j, k, l, m, pSize, cSize, listLengthP, listLengthC, listLengthChildrenSolutionP, originalJoinedResultsSizeP;
		StringBuffer strbuf1, strbuf2, tempStrbuf;
		String pNodeID, cNodeID;
		Stack<NodePair> parentqStack = solutionStackMap.get(nodeParent);
		Stack<NodePair> childqStack = solutionStackMap.get(node);
		boolean hasParentJoinedResults, hasChildJoinedResults, isJoinable, hasMultipleChildrenP, hasChildrenSolutionPList;
		ListIterator<StringBuffer> iterator;
		LinkedList<StringBuffer> joinedResultsParentNode;
		LinkedList<NodeRegionEncoding> childrenSolutionPList, joinedResultsChildrenNodesList;
		NodeRegionEncoding cNRE, tempNRE;
		ActivityNode ppNode;
		
		if ((parentqStack != null) && (childqStack != null)) {
		
			pSize = parentqStack.size();
			cSize = childqStack.size();
			hasMultipleChildrenP = querygraph.getIsJoined(nodeParent);
		
			for (i = 0; i < pSize; i++) {
				
				joinedResultsParentNode = parentqStack.get(i).getJoinedResults();		
				originalJoinedResultsSizeP = parentqStack.get(i).getOriginalJoinedResultsSize();
				hasParentJoinedResults = (joinedResultsParentNode.size() > 0);	
				ppNode = parentqStack.get(i).getParentNode();
				pNodeID = parentqStack.get(i).getNode().getActivityID();
				
				for (j = 0; j < cSize; j++) {
					
					cNodeID = childqStack.get(j).getNode().getActivityID();
					cNRE = processgraph.getNodeRegionEncoding(cNodeID);
					
					if (pNodeID.compareTo(childqStack.get(j).getParentNode().getActivityID()) == 0) {
						
						hasChildJoinedResults = (childqStack.get(j).getJoinedResults().size() > 0);
						
						if (!hasParentJoinedResults && !hasChildJoinedResults) {
							strbuf1 = new StringBuffer();
							if (ppNode != null) {
								strbuf1.append(ppNode.getActivityID());
							}
							strbuf1.append(pNodeID).append(cNodeID);
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
									for (k = 0; k < originalJoinedResultsSizeP; k++) {										
										isJoinable = true;
										childrenSolutionPList = joinedResultsChildrenNodesMap.get(joinedResultsParentNode.get(k));
										if (childrenSolutionPList != null ) {
											listLengthChildrenSolutionP = childrenSolutionPList.size();
											for (l = 0; l < listLengthChildrenSolutionP; l++) { 
												tempNRE = childrenSolutionPList.get(l);
												if(((cNRE.getPreorderRank() < tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() > tempNRE.getPostorderRank()))
												|| ((cNRE.getPreorderRank() > tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() < tempNRE.getPostorderRank()))) {
													isJoinable = false;
													break;
												}																		
											}																										
										}
										
										if (isJoinable) {
											strbuf2 = new StringBuffer();
											strbuf2.append(joinedResultsParentNode.get(k)).append(cNodeID);										
											joinedResultsParentNode.add(strbuf2);
											
											if (!isLastChild) {
												joinedResultsChildrenNodesList = new LinkedList<NodeRegionEncoding>();
												joinedResultsChildrenNodesList.addAll(childrenSolutionPList);
												joinedResultsChildrenNodesList.add(cNRE);
												joinedResultsChildrenNodesMap.put(strbuf2, joinedResultsChildrenNodesList);	
											}
										}										
									}
																		
								} else {
									for (k = 0; k < originalJoinedResultsSizeP; k++) {															
										isJoinable = true;
										childrenSolutionPList = joinedResultsChildrenNodesMap.get(joinedResultsParentNode.get(k));
										if (childrenSolutionPList != null ) {
											listLengthChildrenSolutionP = childrenSolutionPList.size();
											for (l = 0; l < listLengthChildrenSolutionP; l++) { 
												tempNRE = childrenSolutionPList.get(l);
												if(((cNRE.getPreorderRank() < tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() > tempNRE.getPostorderRank()))
												|| ((cNRE.getPreorderRank() > tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() < tempNRE.getPostorderRank()))) {
													isJoinable = false;
													break;
												}																		
											}																										
										}
										
										if(isJoinable) {
											strbuf1 = new StringBuffer();
											strbuf1.append(joinedResultsParentNode.get(k)).append(cNodeID);
											joinedResultsParentNode.add(strbuf1);
											
											if(!isLastChild) {
												joinedResultsChildrenNodesList = new LinkedList<NodeRegionEncoding>();
												joinedResultsChildrenNodesList.addAll(childrenSolutionPList);
												joinedResultsChildrenNodesList.add(cNRE);
												joinedResultsChildrenNodesMap.put(strbuf1, joinedResultsChildrenNodesList);
											}
										}
									}								
								}
								
								
							} else {								
								listLengthP = joinedResultsParentNode.size();
								for (k = 0; k < listLengthP; k++) {									
									isJoinable = true;
									childrenSolutionPList = joinedResultsChildrenNodesMap.get(joinedResultsParentNode.get(k));
									if (childrenSolutionPList != null ) {
										listLengthChildrenSolutionP = childrenSolutionPList.size();
										for (l = 0; l < listLengthChildrenSolutionP; l++) { 
											tempNRE = childrenSolutionPList.get(l);
											if(((cNRE.getPreorderRank() < tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() > tempNRE.getPostorderRank()))
											|| ((cNRE.getPreorderRank() > tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() < tempNRE.getPostorderRank()))) {
												isJoinable = false;
												break;
											}																		
										}																										
									}
									
									if(isJoinable){
										strbuf1 = new StringBuffer();
										strbuf1.append(joinedResultsParentNode.get(k)).append(cNodeID);
										joinedResultsParentNode.add(strbuf1);

										if(!isLastChild) {
											joinedResultsChildrenNodesList = new LinkedList<NodeRegionEncoding>();
											joinedResultsChildrenNodesList.addAll(childrenSolutionPList);
											joinedResultsChildrenNodesList.add(cNRE);
											joinedResultsChildrenNodesMap.put(strbuf1, joinedResultsChildrenNodesList);	
										}
									}
									

								}
								
								for (k = 0; k < listLengthP; k++) {
									joinedResultsChildrenNodesMap.remove(joinedResultsParentNode.removeFirst());
								}
								
							}
												
						} else if (!hasParentJoinedResults && hasChildJoinedResults) {														
							iterator = childqStack.get(j).getJoinedResults().listIterator();
							while (iterator.hasNext()) {									
								strbuf1 = new StringBuffer();
								if (ppNode != null) {
									strbuf1.append(ppNode.getActivityID());
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
										if(((cNRE.getPreorderRank() < tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() > tempNRE.getPostorderRank()))
										|| ((cNRE.getPreorderRank() > tempNRE.getPreorderRank()) && (cNRE.getPostorderRank() < tempNRE.getPostorderRank()))) {
											isJoinable = false;
											break;
										}																		
									}																										
								} 
																
								if(isJoinable){
									for (m = 0; m < listLengthC; m++) {
										strbuf1 = new StringBuffer();
										strbuf1.append(tempStrbuf).append(childqStack.get(j).getJoinedResults().get(m).substring(1));									
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
     * Print encoded exact match solutions of the query root node. 
     *
     * @param q query root node.
     *
     */	
	public void printSolutionsForExactMatch(ActivityNode q) {
		
		NodePair nPair;
		ListIterator< StringBuffer > iterator;
		String resultProcessInfo;
		
		// Means query graph contains only one node, if query graph connected is 
		boolean qHasNoChild = (querygraph.children(q).size() == 0);
		
		Stack<NodePair> qStack = solutionStackMap.get(q);
		
		resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
		"  process namespace: " + processgraph.getProcessNamespace() + 
		"  process name: " + processgraph.getProcessName();
		logger.warn(resultProcessInfo);
		logger.warn("Has following matching paths: ");
		if(qHasNoChild) {
			while (!qStack.isEmpty()) {
				nPair = qStack.pop();
				logger.warn(nPair.getNode());
			}						
		} else {
			while (!qStack.isEmpty()) {
				nPair = qStack.pop();
				iterator = nPair.getJoinedResults().listIterator(); 
				while (iterator.hasNext()) {
					logger.warn(iterator.next());	
				}
			}
		}
	}
	
	
    /**
     * Print encoded inexact match solutions of the query root node. 
     *
     * @param q query root node.
     * @param threshold the below threshold for returning of inexact matching results.
     *
     */	
	public void printSolutionsForInExactMatch(ActivityNode q, float threshold) {
		
		NodePair nPair;
		ListIterator< StringBuffer > iterator;
		String resultProcessInfo, matchingResults = " ";
		float matchSimilarity = getMatchingSimilarity();
		int matchingResultsCount = 0;
		// Means query graph contains only one node, if query graph connected is 
		boolean qHasNoChild = (querygraph.children(q).size() == 0);
		
		if (matchSimilarity > threshold) {
			
			resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
			"  process namespace: " + processgraph.getProcessNamespace() + 
			"  process name: " + processgraph.getProcessName();
			
			logger.warn(resultProcessInfo);

			
			Stack<NodePair> qStack = solutionStackMap.get(q);
			
			if(qHasNoChild) {
				while (!qStack.isEmpty()) {
					nPair = qStack.pop();
					//logger.warn(nPair.getNode());
					matchingResultsCount++;
					matchingResults += nPair.getNode() + " - ";
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
     * Print encoded solutions of the query root node. 
     *
     * @param q query root node.
     *
     */	
	public float getMatchingSimilarity() {		
		return (queryLeafNodesSolution.size() * 1.00f)/querygraph.getNumberOfLeafNodes();
	}

	
	public QueryGraph getQuerygraph() {
		return querygraph;
	}

	public void setQuerygraph(QueryGraph querygraph) {
		this.querygraph = querygraph;
	}

	public ProcessFlowGraph getProcessgraph() {
		return processgraph;
	}

	public void setProcessgraph(ProcessFlowGraph processgraph) {
		this.processgraph = processgraph;
	}

	public HashMap<StringBuffer, LinkedList<NodeRegionEncoding>> getJoinedResultsChildrenNodesMap() {
		return joinedResultsChildrenNodesMap;
	}

	public void setJoinedResultsChildrenNodesMap(
			HashMap<StringBuffer, LinkedList<NodeRegionEncoding>> joinedResultsChildrenNodesMap) {
		this.joinedResultsChildrenNodesMap = joinedResultsChildrenNodesMap;
	}
	

}



