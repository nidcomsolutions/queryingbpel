package de.uni.stuttgart.bpelSearching.query;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.util.BuildMinimalSpanningTree;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;
import de.uni.stuttgart.bpelSearching.util.GraphType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Analysis a given query graph.
 *
 *
 * @author Wei Lu
 */

public class QueryGraph {
	static Logger logger = Logger.getLogger(QueryGraph.class);
	
	private DirectedGraph<ActivityNode, DefaultEdge> queryGraph = 
		new DefaultDirectedGraph<ActivityNode, DefaultEdge>(DefaultEdge.class);
	
	private DirectedGraph<ActivityNode, DefaultEdge> minimalSpanningTreeOfQueryGraph;
	
	private ActivityNode startVertex;
	private GraphType queryGraphType;
	private boolean isExactMatch;
	
    /**
     * Stores the parent node from spanning tree of query graph for each join node of query graph. 
     */
//	private HashMap<ActivityNode, Boolean> isJoinedNodeMap = 
//			new HashMap<ActivityNode, Boolean>();
	private HashMap<ActivityNode, ActivityNode> joinedNodeParentNodeMap = 
		new HashMap<ActivityNode, ActivityNode>();
//	Set<ActivityNode> joinedNodeParentNodeSet = new HashSet<ActivityNode>();
	
	private Map<ActivityNode, Integer> levelMap;
	
    /**
     * Creates a new query graph.
     *
     * @param queryGraph the query graph.
     * 
     * @throws IllegalArgumentException if <code>queryGraph==null</code> or does not
     * contain <code>startVertex</code> or <code>queryGraph</code> is not acylic
     *
     */
    
    public QueryGraph(DirectedGraph<ActivityNode, DefaultEdge> queryGraph){
    	
    	if (queryGraph == null) {
            throw new IllegalArgumentException("graph must not be null");
        }
    	
       	this.queryGraph = queryGraph;     	
    	GraphAnalyse ga = new GraphAnalyse(queryGraph, null);    	
    	this.startVertex = ga.getStartVertex();   	    	
    	this.queryGraphType = ga.checkGraphType();
    	
    	if(queryGraphType == GraphType.DAG_CONNECTED){
    		 minimalSpanningTreeOfQueryGraph = 
    				new DefaultDirectedGraph<ActivityNode, DefaultEdge>(DefaultEdge.class);
    		//fillparentOfJoinedNodeMap();
    		BuildMinimalSpanningTree mst = new BuildMinimalSpanningTree(queryGraph, startVertex);
    		mst.traverse();
    		setMinimalSpanningTreeOfQueryGraph(mst.getMinimalSpanningTree());
    		setLevelMap(mst.getLevelMap());
    	}   	    	
    }
    
    /**
     * Test whether the given node is root of the query graph.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is root,
     * otherwise <code>false</code>.
     */
    public boolean isRoot(ActivityNode node){    	
    	return ((node.getActivityID()).compareTo(startVertex.getActivityID()) == 0);
    }
    
    /**
     * Test whether the given node is leaf of the query graph.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is leaf,
     * otherwise <code>false</code>.
     */
    public boolean isLeaf(ActivityNode node){    	
    	return (queryGraph.outgoingEdgesOf(node).size() == 0);
    }
    
    /**
     * Test whether the given node is leaf node of the minimal spanning tree of 
     * the query graph.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is leaf,
     * otherwise <code>false</code>.
     */
    public boolean isLeafInMST(ActivityNode node){ 
//    	boolean isLeafNode = false;
//    	if (queryGraph.outgoingEdgesOf(node).size() == 0) {
//    		isLeafNode = true;   		
//    	}
//    	return isLeafNode;
    	return (minimalSpanningTreeOfQueryGraph.outgoingEdgesOf(node).size() == 0);
    }
    
    /**
     * Returns number of the leaf nodes of the query graph in the minimal spanning 
     * tree of the query graph.
     *
     * @return number of leaf nodes in the minimal spanning tree.
     */
    public int getNumberOfLeafNodes(){    	
    	Set<ActivityNode> vertexSetQuery = queryGraph.vertexSet();   	
    	int leafCount = 0; 
		for (ActivityNode queryNode : vertexSetQuery) {
			if (isLeaf(queryNode)) {
				leafCount++;
			}
		}
    	return leafCount;
    }
    
    /**
     * Returns number of the leaf nodes of the query graph.
     *
     * @return number of leaf nodes .
     */
    public int getNumberOfLeafNodesInMST(){    	
    	Set<ActivityNode> vertexSetQuery = queryGraph.vertexSet();   	
    	int leafCount = 0; 
		for (ActivityNode queryNode : vertexSetQuery) {
			if (isLeafInMST(queryNode)) {
				leafCount++;
			}
		}
    	return leafCount;
    }
    
    /**
     * Returns the parent of the given node. Usually it is used for tree,
     * Since tree node has at most one parent node.
     * 
     * @param node the node whose parents to be returned.
     *
     * @return the parent node of the given node.
     */
    public ActivityNode getParent(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter = 
    		queryGraph.incomingEdgesOf(node).iterator();
    	
        if (queryEdgeIter.hasNext()) {
            return queryGraph.getEdgeSource(queryEdgeIter.next());
        } else {
            return null;
        }   	
    }
    
    /**
     * Returns parents of the given node.
     * 
     * @param node the node whose parent to be returned.
     *
     * @return the parent nodes of the given node.
     */
    public Set<ActivityNode> getParents(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter = 
    		queryGraph.incomingEdgesOf(node).iterator();
    	Set<ActivityNode> parentsSet = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	parentsSet.add(queryGraph.getEdgeSource(queryEdgeIter.next()));
        } 
        
    	return parentsSet;
    }
    
    /**
     * Returns the parent node of the given joined node in the minimal spanning 
     * tree of the given query graph.
     * 
     * @param joinedNode joined node whose parent to be returned.
     *
     * @return the parent node of the given node.
     */
    public ActivityNode getParentNodeInMST(ActivityNode joinedNode){
    	//return (joinedNodeParentNodeMap.get(joinedNode)); 
    	Iterator<DefaultEdge> queryEdgeIter = 
    		minimalSpanningTreeOfQueryGraph.incomingEdgesOf(joinedNode).iterator();
    	
        if (queryEdgeIter.hasNext()) {
            return minimalSpanningTreeOfQueryGraph.getEdgeSource(queryEdgeIter.next());
        } else {
            return null;
        } 
    }
    
    /**
     * Returns parents of the given node except the one in the minimal spanning tree.
     * 
     * @param joinedNode the joined node whose parents to be returned.
     *
     * @return the parent nodes of the given node except the one in spanning tree.
     */
    public Set<ActivityNode> getParentsOfJoinedNodeNotInMST(ActivityNode joinedNode){
//    	ActivityNode parentInSpanningTree;
//    	Iterator<DefaultEdge> queryEdgeIter = 
//    		queryGraph.incomingEdgesOf(joinedNode).iterator();
//    	Set<ActivityNode> parentsSet = new HashSet<ActivityNode>();
//    	
//        while (queryEdgeIter.hasNext()) {
//        	parentsSet.add(queryGraph.getEdgeSource(queryEdgeIter.next()));
//        }
//        
//        if ((parentInSpanningTree = joinedNodeParentNodeMap.get(joinedNode)) != null) {
//        	parentsSet.remove(parentInSpanningTree);
//        }
//        
//    	return parentsSet;
    	
    	Iterator<DefaultEdge> queryEdgeIter = 
    		queryGraph.incomingEdgesOf(joinedNode).iterator();
    	Iterator<DefaultEdge> queryMSTEdgeIter = 
    		minimalSpanningTreeOfQueryGraph.incomingEdgesOf(joinedNode).iterator();
    	Set<ActivityNode> parentsSet = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	parentsSet.add(queryGraph.getEdgeSource(queryEdgeIter.next()));
        }
        
        while (queryMSTEdgeIter.hasNext()) {
        	parentsSet.remove(minimalSpanningTreeOfQueryGraph.getEdgeSource
        			(queryMSTEdgeIter.next()));
        }
        
    	return parentsSet;
    }
       
    /**
     * Returns all child nodes of the given node in the minimal spanning 
     * tree of the given query graph.
     * 
     * @param node the node whose children to be returned.
     *
     * @return children of the given node.
     */
    public Set<ActivityNode> getChildren(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter = 
    		queryGraph.outgoingEdgesOf(node).iterator();
    	Set<ActivityNode> results = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	results.add(queryGraph.getEdgeTarget(queryEdgeIter.next()));
        }
        
        return results;  	
    }
    
    
    /**
     * Returns all child nodes of the given node in the minimal spanning tree of 
     * the given query graph.
     * 
     * @param node the node whose children to be returned.
     *
     * @return children of the given node in the minimal spanning tree.
     */
    public Set<ActivityNode> getChildrenInMST(ActivityNode node){
    	Iterator<DefaultEdge> queryMSTEdgeIter = 
    		minimalSpanningTreeOfQueryGraph.outgoingEdgesOf(node).iterator();
    	Set<ActivityNode> results = new HashSet<ActivityNode>();
    	
        while (queryMSTEdgeIter.hasNext()) {
        	results.add(minimalSpanningTreeOfQueryGraph.getEdgeTarget(queryMSTEdgeIter.next()));
        }
        
        return results;  
        
//    	ActivityNode childNode, parentNode;
//    	Iterator<DefaultEdge> queryEdgeIter = 
//    		queryGraph.outgoingEdgesOf(node).iterator();
//    	Set<ActivityNode> results = new HashSet<ActivityNode>();
//    	
//        while (queryEdgeIter.hasNext()) {
//        	childNode = queryGraph.getEdgeTarget(queryEdgeIter.next());
//        	if (isJoinedNode(childNode)) {
//        		if ((parentNode = (joinedNodeParentNodeMap.get(childNode))) != null) {
//        			if (parentNode.getActivityID().compareTo(node.getActivityID()) == 0) {
//        				results.add(childNode);
//        			}
//        		}
//        	} else {
//        		results.add(childNode);
//        	}       	
//        }
//        
//        return results; 
    }
       
    /**
     * Returns the given node and all its descendants.
     * 
     * @param node the node whose subtree nodes be returned.
     *
     * @return the given node and all its descendants.
     */
    public Set<ActivityNode> getSubtreeNodes(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter;
    	Set<ActivityNode> results = new HashSet<ActivityNode>();
    	ActivityNode temp;
    	
    	results.add(node);

    	if(isLeaf(node)){
        	return results;    		
    	} else {
    		 queryEdgeIter = queryGraph.outgoingEdgesOf(node).iterator();
    	      while (queryEdgeIter.hasNext()) {
    	    	  temp = queryGraph.getEdgeTarget(queryEdgeIter.next());
//    	    	  results.add(temp);
    	    	  results.addAll(getSubtreeNodes(temp));
    	        }
    	      return results;
    	}    	    	
    }
    
    /**
     * Returns the given node and all its descendants.
     * 
     * @param node the node whose subtree nodes be returned.
     *
     * @return the given node and all its descendants.
     */
    public Set<ActivityNode> getSubtreeNodesInMST(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter;
    	Set<ActivityNode> results = new HashSet<ActivityNode>();
    	ActivityNode temp;
    	
    	results.add(node);
    	
    	if(isLeaf(node)){
        	return results;    		
    	} else {
    		 queryEdgeIter = minimalSpanningTreeOfQueryGraph.outgoingEdgesOf(node).iterator();
    	      while (queryEdgeIter.hasNext()) {
    	    	  temp = minimalSpanningTreeOfQueryGraph.getEdgeTarget(queryEdgeIter.next());
    	    	  //results.add(temp);
    	    	  results.addAll(getSubtreeNodesInMST(temp));
    	        }
    	      return results;
    	}    	    	
    }
    
    /**
     * Returns the node with the given activity id.
     * 
     * @param qID the node id.
     *
     * @return the node with the given id, if it exists. otherwise <code>null</code>.
     */
	public ActivityNode getActivityNode(String qID) {
		Set<ActivityNode> queryNodes = queryGraph.vertexSet();
		
		for (ActivityNode queryNode : queryNodes){
			if (queryNode.getActivityID().compareTo(qID) ==  0)
				return queryNode;
		}
		return null;
	}
	
	public boolean isJoinedNode(ActivityNode vertex) {
		return (queryGraph.inDegreeOf(vertex) > 1);
	}
	
    /**
     * Returns joined nodes stored in <code>joinedNodeParentNodeMap</code>.
     *
     * @return joined nodes stored in <code>joinedNodeParentNodeMap</code>.
     */
//	public Set<ActivityNode> getJoinedNodes() {
//		return joinedNodeParentNodeMap.keySet();	
//	}
	
    /**
     * Perform depth first traverse for DAG pattern query, find out the spanning tree and put 
     * the parent node for each join node in the spanning tree in parentNodeForJoinedNodeMap.
     * 
     */
    public void fillparentOfJoinedNodeMap()
    {
    	Stack<ActivityNode> theStack = new Stack<ActivityNode>(); 
		ActivityNode adjOfCurrentVertex, adjUnvisitedVertex;
    	Map<ActivityNode, Boolean> wasVisitedMap = new HashMap<ActivityNode, Boolean>();
    	Set<ActivityNode> vertexSetQ = queryGraph.vertexSet();
    	Set<DefaultEdge> edgeSetOfCurrentVertex;
    	
    	for (ActivityNode vertexQ : vertexSetQ) {
			wasVisitedMap.put(vertexQ, new Boolean(false));
		} 
    	// begin at start vertex
    	wasVisitedMap.put(startVertex, new Boolean(true));
    	//displayVertex(startVertex);
    	theStack.push(startVertex);

    	while( !theStack.isEmpty() )
    	{
    		// *** minimum spanning tree
    		ActivityNode currentVertex = theStack.peek();
    		
    		// get an unvisited vertex adjacent to stack top
    		//ActivityNode v = getAdjUnvisitedVertex(theStack.peek());
        	edgeSetOfCurrentVertex = queryGraph.outgoingEdgesOf(currentVertex);
        	adjUnvisitedVertex = null;   	
        	for (DefaultEdge edgeOfCurrentVertex : edgeSetOfCurrentVertex) {
    			adjOfCurrentVertex = queryGraph.getEdgeTarget(edgeOfCurrentVertex);
    			if(!(wasVisitedMap.get(adjOfCurrentVertex).booleanValue())) {
    				adjUnvisitedVertex = adjOfCurrentVertex;
    				break;
    			}
    		}    	
        	
    		if(adjUnvisitedVertex == null){
    			theStack.pop();
    		} else {
    			wasVisitedMap.put(adjUnvisitedVertex, new Boolean(true));
    			//displayVertex(v);
    			theStack.push(adjUnvisitedVertex);    			
    			// *** minimum spanning tree
    			//mstEdgeSet.add(graph.getEdge(currentVertex, v));
    			if (isJoinedNode(adjUnvisitedVertex)) {
    				joinedNodeParentNodeMap.put(adjUnvisitedVertex, currentVertex);
//    				logger.warn("Joined node: " + adjUnvisitedVertex.toString() + "   parent: " + currentVertex.toString());
    			}
         	 }
    	}
    }

	public int getNodeLevel(ActivityNode node) {
		if (levelMap.get(node) == null) {
			return 0;
		} else {
			return levelMap.get(node).intValue();
		}
	}
	
	public ActivityNode getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(ActivityNode startVertex) {
		this.startVertex = startVertex;
	}

	public GraphType getQueryGraphType() {
		return queryGraphType;
	}

	public void setQueryGraphType(GraphType queryGraphType) {
		this.queryGraphType = queryGraphType;
	}


	public boolean isExactMatch() {
		return isExactMatch;
	}


	public void setExactMatch(boolean isExactMatch) {
		this.isExactMatch = isExactMatch;
	}


	public DirectedGraph<ActivityNode, DefaultEdge> getQueryGraph() {
		return queryGraph;
	}


	public void setQueryGraph(DirectedGraph<ActivityNode, DefaultEdge> queryGraph) {
		this.queryGraph = queryGraph;
	}

	public HashMap<ActivityNode, ActivityNode> getJoinedNodeParentNodeMap() {
		return joinedNodeParentNodeMap;
	}

	public void setJoinedNodeParentNodeMap(
			HashMap<ActivityNode, ActivityNode> joinedNodeParentNodeMap) {
		this.joinedNodeParentNodeMap = joinedNodeParentNodeMap;
	}

	public DirectedGraph<ActivityNode, DefaultEdge> getMinimalSpanningTreeOfQueryGraph() {
		return minimalSpanningTreeOfQueryGraph;
	}

	public void setMinimalSpanningTreeOfQueryGraph(
			DirectedGraph<ActivityNode, DefaultEdge> minimalSpanningTreeOfQueryGraph) {
		this.minimalSpanningTreeOfQueryGraph = minimalSpanningTreeOfQueryGraph;
	}
	
	public Map<ActivityNode, Integer> getLevelMap() {
		return levelMap;
	}

	public void setLevelMap(Map<ActivityNode, Integer> levelMap) {
		this.levelMap = levelMap;
	}

}
