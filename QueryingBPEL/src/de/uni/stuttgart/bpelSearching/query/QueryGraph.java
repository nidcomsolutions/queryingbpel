package de.uni.stuttgart.bpelSearching.query;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

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
		
	private DirectedGraph<ActivityNode, DefaultEdge> queryGraph = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
			DefaultEdge.class);
	private ActivityNode startVertex;
	private GraphType queryGraphType;
	private boolean isExactMatch;
	
    /**
     * Stores joined node information for each query node. 
     */
	private HashMap<ActivityNode, Boolean> isJoinedNodeMap = 
			new HashMap<ActivityNode, Boolean>();
	
    
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
    	
    	
    	// *** to be modified ***
    	if(queryGraphType != GraphType.TREE){
    	    	throw new IllegalArgumentException("graph must be a tree");
    	}
    	
    	Set<ActivityNode> vertexSetQuery = queryGraph.vertexSet();   	
    	boolean isJoined; 
		for (ActivityNode queryNode : vertexSetQuery) {
			isJoined = ((queryGraph.outDegreeOf(queryNode) > 1));
			isJoinedNodeMap.put(queryNode, new Boolean(isJoined));			
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
     * Returns number of the leaf nodes of the query graph.
     *
     * @return number of leaf nodes.
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
     * Returns the parent of the given node. Usually it is used for tree,
     * Since tree node has at most one parent node.
     * 
     * @param node the node whose parent to be returned.
     *
     * @return the parent node of the given node.
     */
    public ActivityNode parent(ActivityNode node){
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
    public Set<ActivityNode> parents(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter = 
    		queryGraph.incomingEdgesOf(node).iterator();
    	Set<ActivityNode> parentsSet = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	parentsSet.add(queryGraph.getEdgeSource(queryEdgeIter.next()));
        } 
        
    	return parentsSet;
    }
    
    /**
     * Returns all child nodes of the given node.
     * 
     * @param node the node whose children to be returned.
     *
     * @return children of the given node.
     */
    public Set<ActivityNode> children(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter = 
    		queryGraph.outgoingEdgesOf(node).iterator();
    	Set<ActivityNode> results = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	if(!results.add(queryGraph.getEdgeTarget(queryEdgeIter.next())))
        	{
        		System.out.println("Duplicate child detected: " 
        				+ (queryGraph.getEdgeTarget(queryEdgeIter.next())).getActivityID());
        	}
        }
        
        return results;
    	
    }
    
    
    /**
     * Returns the given node and all its descendants.
     * 
     * @param node the node whose subtree nodes be returned.
     *
     * @return the given node and all its descendants.
     */
    public Set<ActivityNode> subtreeNodes(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter;
    	Set<ActivityNode> results = new HashSet<ActivityNode>();
    	ActivityNode temp;
    	
    	if(!results.add(node))
    	{
    		System.out.println("Duplicate child detected: " 
    				+ (node.getActivityID()));
    	} 
    	
    	if(isLeaf(node)){
        	return results;    		
    	} else {
    		 queryEdgeIter = queryGraph.outgoingEdgesOf(node).iterator();
    	      while (queryEdgeIter.hasNext()) {
    	    	  temp = queryGraph.getEdgeTarget(queryEdgeIter.next());
    	    	  results.add(temp);
    	    	  results.addAll(subtreeNodes(temp));
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
	
	public boolean getIsJoined(ActivityNode vertex) {
		return isJoinedNodeMap.get(vertex).booleanValue();
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

	public HashMap<ActivityNode, Boolean> getIsJoinedNodeMap() {
		return isJoinedNodeMap;
	}

	public void setIsJoinedNodeMap(HashMap<ActivityNode, Boolean> isJoinedNodeMap) {
		this.isJoinedNodeMap = isJoinedNodeMap;
	}

}
