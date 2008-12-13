package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.matching.NodeRegionEncodingComparator;
import de.uni.stuttgart.bpelSearching.matching.NodesComparator;

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
	protected List<String> queryIDsTobeAssigned;
	
    /**
     * A chain of stacks for each query node to encode the partial result.
     */
	protected static Map<String, Stack<NodeInStack>> queryNodeStackMap;

    /**
     * A chain of streams for each query node. The stream is a list of sorted process nodes, 
     * which match the predicate of the query node.
     */
	protected static Map<String, LinkedList<NodeRegionEncoding>> queryNodeStreamMap;
	
    /**
     * Stores all query leaf nodes, which participate path solutions. 
     */
	protected static Set<ActivityNode> queryLeafNodesSolution;
	
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
			queryNodeStreamMap.put(queryNode.getActivityID(), streamList);
			if (!queryNodeStackMap.get(queryNode.getActivityID()).isEmpty()) {
				queryNodeStackMap.get(queryNode.getActivityID()).clear();
			}
//			queryNodeStackMap.put(queryNode.getActivityID(), new Stack<NodeInStack>());			
		}
//		queryLeafNodesSolution = new HashSet<ActivityNode>();
		if (!queryLeafNodesSolution.isEmpty()) {
			queryLeafNodesSolution.clear();
		}
		
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
			if (queryNodeStreamMap.get(nodeQ.getActivityID()).isEmpty()) {
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
			if(!queryNodeStreamMap.get(subtreeNodeQi.getActivityID()).isEmpty()) {
				tempL = queryNodeStreamMap.get(subtreeNodeQi.getActivityID()).getFirst().getStart();
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
//		if (queryNodeStreamMap.get(n.getActivityID()).isEmpty())
//			return true;
		for (ActivityNode subNode : subNodes) {
			if(querygraph.isLeaf(subNode) && !(queryNodeStreamMap.
					get(subNode.getActivityID()).isEmpty())) {
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
			queryNodeStackMap.get(q.getActivityID()).push(new NodeInStack
					(queryNodeStreamMap.get(q.getActivityID()).getFirst(), null));
		} else {
			queryNodeStackMap.get(q.getActivityID()).push(new NodeInStack
					(queryNodeStreamMap.get(q.getActivityID()).getFirst(), queryNodeStackMap.
							get(querygraph.getParent(q).getActivityID()).lastElement()));
		}
		queryNodeStreamMap.get(q.getActivityID()).removeFirst();		
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
		while(!queryNodeStackMap.get(q.getActivityID()).isEmpty() && ((queryNodeStackMap.
				get(q.getActivityID()).lastElement().getNode().getEnd()) < actL)) {
			queryNodeStackMap.get(q.getActivityID()).pop();
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


	public static Map<String, Stack<NodeInStack>> getQueryNodeStackMap() {
		return queryNodeStackMap;
	}


	public static void setQueryNodeStackMap(
			Map<String, Stack<NodeInStack>> queryNodeStackMap) {
		TwigStackAlgorithm.queryNodeStackMap = queryNodeStackMap;
	}


	public static Map<String, LinkedList<NodeRegionEncoding>> getQueryNodeStreamMap() {
		return queryNodeStreamMap;
	}


	public static void setQueryNodeStreamMap(
			Map<String, LinkedList<NodeRegionEncoding>> queryNodeStreamMap) {
		TwigStackAlgorithm.queryNodeStreamMap = queryNodeStreamMap;
	}


	public static Set<ActivityNode> getQueryLeafNodesSolution() {
		return queryLeafNodesSolution;
	}


	public static void setQueryLeafNodesSolution(
			Set<ActivityNode> queryLeafNodesSolution) {
		TwigStackAlgorithm.queryLeafNodesSolution = queryLeafNodesSolution;
	}


	public List<String> getQueryIDsTobeAssigned() {
		return queryIDsTobeAssigned;
	}


	public void setQueryIDsTobeAssigned(List<String> queryIDsTobeAssigned) {
		this.queryIDsTobeAssigned = queryIDsTobeAssigned;
	}

}



