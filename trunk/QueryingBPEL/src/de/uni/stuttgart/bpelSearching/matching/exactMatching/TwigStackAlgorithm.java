package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.matching.NodeRegionEncodingComparator;
import de.uni.stuttgart.bpelSearching.matching.NodesComparator;
import de.uni.stuttgart.bpelSearching.matching.ProcessNodePair;

/**
 * A superclass for classes, which implement twig join algorithms. It implements 
 * sub-procedures and sub-funcitons of TwigStack Algorithm.
 *
 * @author Wei Lu
 */

public abstract class TwigStackAlgorithm {
	
	static Logger logger = Logger.getLogger(TwigStackAlgorithm.class);
	
	protected static QueryGraph querygraph;
	protected ProcessGraph processgraph;
	
    /**
     * A chain of stacks for each query node to encode the partial result.
     */
	protected Map<ActivityNode, Stack<NodeInStack>> queryNodeStackMap = 
			new HashMap<ActivityNode, Stack<NodeInStack>>();
	
    /**
     * A chain of stacks for each query node to encode the final results.
     */
	public Map<ActivityNode, Stack<ProcessNodePair>> solutionStackMap = 
		new HashMap<ActivityNode, Stack<ProcessNodePair>>();
	
    /**
     * Stores current position of the stack from queryNodeStackMap.
     */
	protected Map<ActivityNode, Integer> queryNodeStackPositionMap = 
		new HashMap<ActivityNode, Integer>();	

    /**
     * A chain of streams for each query node. The stream is a list of sorted process nodes, 
     * which match the predicate of the query node.
     */
	protected HashMap<ActivityNode, LinkedList<NodeRegionEncoding>> queryNodeStreamMap = 
			new HashMap<ActivityNode, LinkedList<NodeRegionEncoding>>();
	
    /**
     * Stores all query leaf nodes, which participate path solutions. 
     */
	protected Set<ActivityNode> queryLeafNodesSolution;
	
    /**
     * Stores the region encoding of children nodes for each joined results of joined node. 
     */
	protected HashMap<StringBuffer, LinkedList<NodeRegionEncoding>> joinedResultsChildrenNodesMap = 
		new HashMap<StringBuffer, LinkedList<NodeRegionEncoding>>();	
	
	protected ActivityNode actLeafNode;
	
	protected char idSeparator = ' ';
	
	protected ExactMatchingResult exactMatchingResults;
	
	protected boolean hasExactMatch;
	
	protected static NodesComparator nodesCompare;
	
	protected static NodeRegionEncodingComparator nodeRegionCompare;
	
	/**
	 * Creates a TwigStackAlgorithm object for the specified query graph and 
	 * process graph, initialize stream and solution stack for each query node.
	 * 
     * @param pg the process graph.
	 */
	public TwigStackAlgorithm(ProcessGraph pg) 
	{
//		this.querygraph = qg;
		this.processgraph = pg;	
		hasExactMatch = false;
		init();
	}
	
	
	/**
	 * Do the pre-processing step for the TwigStackAlgorithm, associate a stream Tq 
	 * and a stack Sq to every query node q. The stream contains the positional 
	 * representations of the process nodes that match the node predicate at the 
	 * query node q. The nodes in the stream are sorted by their start values. Each 
	 * query node q is also associated with a stack Sq. Each element in the stack 
	 * consists of a pair:(positional representation of a node from Tq, pointer to 
	 * a node in Sparent(q)).
	 * 
	 */
	protected void init()
	{	
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		Set<ActivityNode> vertexSetProcess = processgraph.getGraph().vertexSet();
		LinkedList <NodeRegionEncoding> streamList;
		
//		NodesComparator nodesCompare = new NodesComparator();
//		NodeRegionEncodingComparator nodeRegionCompare = new NodeRegionEncodingComparator();
				
		for (ActivityNode queryNode : vertexSetQuery) {				
			streamList = new LinkedList<NodeRegionEncoding>();
			for (ActivityNode processNode : vertexSetProcess) {				
				if(nodesCompare.compare(queryNode, processNode) == 0){
					streamList.addFirst(processgraph.getNodeRegionEncoding
							(processNode.getActivityID()));
				}				
			}								
			Collections.sort(streamList, nodeRegionCompare);
			queryNodeStreamMap.put(queryNode, streamList);
			queryNodeStackMap.put(queryNode, new Stack<NodeInStack>());
			solutionStackMap.put(queryNode, new Stack<ProcessNodePair>());			
		}
		queryLeafNodesSolution = new HashSet<ActivityNode>();
		
		// For debug
//		logger.warn("Output stream list");
//		for (ActivityNode queryNode : vertexSetQuery) {
//			streamList = queryNodeStreamMap.get(queryNode);
//			logger.warn(streamList);
//		}		
	}
	
	
    /**
     * Implements TwigStack algorithm or its extended algorithm under exact matching 
     * semantic, which computes answers to a query tree or a query rooted DAG.
     *
     * @param q a query node.
     */
	public abstract void twigStackExactMatch(ActivityNode q);
	
	
    /**
     * Implements TwigStack algorithm or its extended algorithm under inexact matching 
     * semantic, which computes answers to a query tree or a query rooted DAG.
     *
     * @param q a query node.
     * @param threshold the below threshold for returning of inexact matching results.
     * 
     */
	public abstract void twigStackInExactMatch(ActivityNode q, float threshold);
	
    /**
     * Determines whether all streams of q's subtree nodes are not empty.
     *
     * @param q a query node.
     *
     * @return <code>true</code> if all streams of q's subtree nodes are not empty,
     * otherwise <code>false</code>.
     */	
	protected boolean allQuerySubtreeNodesStreamsNotEmpty(ActivityNode q) 
	{	
		Set<ActivityNode> subtreeNodesQ = querygraph.getSubtreeNodes(q);		
		for (ActivityNode nodeQ : subtreeNodesQ) {			
			if (queryNodeStreamMap.get(nodeQ).isEmpty()) {
				return false;
			}
		}
		return true;
	}	
		
    /**
     * Gets the next query node to be processed, whose first stream element has 
     * a minimal start value among all steam nodes.
     *
     * @param q a query node
     *
     * @return the next processing node
     */
	protected ActivityNode getMinSource(ActivityNode q)
	{
		ActivityNode nmin = q;
		int tempL, minL;
		minL = processgraph.getMaxEnd();
		
		Set<ActivityNode> subtreeNodesQ = querygraph.getSubtreeNodes(q);		
		for (ActivityNode subtreeNodeQi : subtreeNodesQ) {
			if(!queryNodeStreamMap.get(subtreeNodeQi).isEmpty()) {
				tempL = queryNodeStreamMap.get(subtreeNodeQi).getFirst().getStart();
				if (tempL < minL) {
					minL = tempL;
					nmin = subtreeNodeQi;
				}
			}
		}
		
		return nmin;
	}
	
    /**
     * Tests for the given query node whether there is at least one leaf node in the 
     * subtree nodes of the given query node that has unprocessed nodes in stream.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if all streams of leaf nodes are empty,
     * otherwise <code>false</code>.
     */
	protected boolean end(ActivityNode n)
	{
		Set<ActivityNode> subNodes = querygraph.getSubtreeNodes(n);		
//		if (queryNodeStreamMap.get(n).isEmpty())
//			return true;
		for (ActivityNode subNode : subNodes) {
			if(querygraph.isLeaf(subNode) && !(queryNodeStreamMap.
					get(subNode).isEmpty())) {
				return false;
			}
		}		
		return true;		
	}
	
    /**
     * Extend the partial solution encoded in the stack by
     * pushing a new stream node in the stack.
     * 
     * @param q  actual query node, whose stream and stack have to be updated.
     *
     */
	protected void moveStreamToStack(ActivityNode  q) 
	{
		// The new pushed element consists: the next element of q's stream, 
		// Pointer to the top element of parent(q)'s stack	
		if (querygraph.isRoot(q)) {
			queryNodeStackMap.get(q).push(new NodeInStack
					(queryNodeStreamMap.get(q).getFirst(), null));
		} else {
			queryNodeStackMap.get(q).push(new NodeInStack
					(queryNodeStreamMap.get(q).getFirst(), queryNodeStackMap.
							get(querygraph.getParent(q)).lastElement()));
		}
		queryNodeStreamMap.get(q).removeFirst();		
	}
	
    /**
     * Pop all elements from node q's stack that are not ancestors of node p.
     * 
     * @param q the query node, whose stack is cleaned
     * @param actL start value of the positional representation of node p
     *
     */	
	protected void cleanStack(ActivityNode q, int actL)
	{	
		while(!queryNodeStackMap.get(q).isEmpty() && ((queryNodeStackMap.
				get(q).lastElement().getNode().getEnd()) < actL)) {
			queryNodeStackMap.get(q).pop();
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
		Set<ActivityNode> childrenQ = querygraph.getChildren(q);		
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
		
		Stack<ProcessNodePair> parentqStack = solutionStackMap.get(nodeParent);
		Stack<ProcessNodePair> childqStack = solutionStackMap.get(node);
		
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
		String resultProcessInfo;
		this.exactMatchingResults = new ExactMatchingResult(processgraph.getProcessID(), 
				processgraph.getProcessNamespace(), processgraph.getProcessName());
		ArrayList<String> tempMatch;
		StringTokenizer st;
		
		// Means query graph contains only one node, if query graph connected is 
		boolean qHasNoChild = (querygraph.getChildren(q).size() == 0);
		
		Stack<ProcessNodePair> qStack = solutionStackMap.get(q);
		
		resultProcessInfo = "Exact matching process >> process ID: " + processgraph.getProcessID() + 
		"  process namespace: " + processgraph.getProcessNamespace() + 
		"  process name: " + processgraph.getProcessName();
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
		boolean qHasNoChild = (querygraph.getChildren(q).size() == 0);
		
		if (matchSimilarity > threshold) {
			
			resultProcessInfo = "process ID: " + processgraph.getProcessID() + 
			"  process namespace: " + processgraph.getProcessNamespace() + 
			"  process name: " + processgraph.getProcessName();
			
			logger.warn(resultProcessInfo);

			
			Stack<ProcessNodePair> qStack = solutionStackMap.get(q);
			
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
     * Gets the quotient of the query paths, which have matching paths in the 
     * given process graph, to the total query paths.
     *
     */	
	public float getMatchPathRatio() {		
		return (queryLeafNodesSolution.size() * 1.00f)/
			querygraph.getNumberOfLeafNodes();
	}

	
	public static QueryGraph getQuerygraph() {
		return querygraph;
	}

	public static void setQuerygraph(QueryGraph querygraph) {
		TwigStackAlgorithm.querygraph = querygraph;
	}

	public ProcessGraph getProcessgraph() {
		return processgraph;
	}

	public void setProcessgraph(ProcessGraph processgraph) {
		this.processgraph = processgraph;
	}

	public HashMap<StringBuffer, LinkedList<NodeRegionEncoding>> getJoinedResultsChildrenNodesMap() {
		return joinedResultsChildrenNodesMap;
	}

	public void setJoinedResultsChildrenNodesMap(
			HashMap<StringBuffer, LinkedList<NodeRegionEncoding>> joinedResultsChildrenNodesMap) {
		this.joinedResultsChildrenNodesMap = joinedResultsChildrenNodesMap;
	}


	public ExactMatchingResult getExactMatchingResults() {
		return exactMatchingResults;
	}


	public void setExactMatchingResults(ExactMatchingResult exactMatchingResults) {
		this.exactMatchingResults = exactMatchingResults;
	}


	public boolean hasExactMatch() {
		return hasExactMatch;
	}


	public void setHasExactMatch(boolean hasExactMatch) {
		this.hasExactMatch = hasExactMatch;
	}


	public static NodesComparator getNodesCompare() {
		return nodesCompare;
	}


	public static void setNodesCompare(NodesComparator nodesCompare) {
		TwigStackAlgorithm.nodesCompare = nodesCompare;
	}


	public static NodeRegionEncodingComparator getNodeRegionCompare() {
		return nodeRegionCompare;
	}


	public static void setNodeRegionCompare(
			NodeRegionEncodingComparator nodeRegionCompare) {
		TwigStackAlgorithm.nodeRegionCompare = nodeRegionCompare;
	}
	

}



