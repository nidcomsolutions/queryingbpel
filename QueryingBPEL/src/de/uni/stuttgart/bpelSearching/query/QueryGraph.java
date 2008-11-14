package de.uni.stuttgart.bpelSearching.query;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.util.BreadthFirstTraverse;
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
	private List<ActivityNode> queryNodesSortedByLevelOrder;
	private Set<String> subgraphNodesForLeafOrRoot;
	private int numberOfEdges;
	private Map<ActivityNode, Integer> levelMap;
	private Map<String, Set<String>> subgraphNodesIDsMap;
	private BreadthFirstTraverse bfs;
	
    /**
     * Creates a new query graph.
     *
     * @param queryGraph the query graph.
     * @param startVertex the start vertex of the query graph
     * 
     * @throws IllegalArgumentException if <code>queryGraph==null</code> or does not
     * contain <code>startVertex</code> or <code>queryGraph</code> is not acylic
     *
     */ 
    public QueryGraph(DirectedGraph<ActivityNode, DefaultEdge> queryGraph, 
    		ActivityNode startVertex){   	
    	if (queryGraph == null) {
            throw new IllegalArgumentException("graph must not be null");
        } 	
       	this.queryGraph = queryGraph;     	
    	GraphAnalyse ga = new GraphAnalyse(queryGraph, startVertex);
    	this.startVertex = ga.getStartVertex();  		  		 	    	
    	this.queryGraphType = ga.checkGraphType();
    	this.numberOfEdges = queryGraph.edgeSet().size();
    	this.subgraphNodesForLeafOrRoot = new HashSet<String>();
    }
    
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
    	this.numberOfEdges = queryGraph.edgeSet().size();
    	this.subgraphNodesForLeafOrRoot = new HashSet<String>();
    }
    
    
    public void transformQueryToRootedDAG () {
    	
    }
    
    /**
     * Tests whether the given node is root of the query graph.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is root, otherwise <code>false</code>.
     */
    public boolean isRoot(ActivityNode node){    	
    	return ((node.getActivityID()).compareTo(startVertex.getActivityID()) == 0);
    }
    
    /**
     * Tests whether the given node is leaf of the query graph.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is leaf, otherwise <code>false</code>.
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
     * Returns positions of the parents for the given node position in 
     * <code>queryNodesSortedByLevelOrder</code>.
     * 
     * @param nodeIndex the node position in <code>queryNodesSortedByLevelOrder</code>
     *
     * @return positions of the parents.
     */
    public Set<Integer> getParentsIndexes(int nodeIndex){
    	Set<Integer> result = new HashSet<Integer>();
    	ActivityNode node, pNode;
    	if ((queryNodesSortedByLevelOrder != null) && 
    			((node = queryNodesSortedByLevelOrder.get(nodeIndex))!= null)) {
        	Iterator<DefaultEdge> queryEdgeIter = 
        		queryGraph.incomingEdgesOf(node).iterator();
            while (queryEdgeIter.hasNext()) {
            	pNode = queryGraph.getEdgeSource(queryEdgeIter.next());
            	for (int i = 0; i < nodeIndex; i++) {
            		if (queryNodesSortedByLevelOrder.get(i).getActivityID().
            				compareTo(pNode.getActivityID()) == 0){
            			result.add(new Integer(i));
            			break;
            		}
            	}
            }
    	}
    	return result;
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
     * Returns number of children of the given node.
     * 
     * @param node the node whose number of children to be returned.
     *
     * @return number of children of the given node.
     */
    public int getChildrenSize(ActivityNode node){
        return queryGraph.outDegreeOf(node);  	
    }
    
    /**
     * Returns the maximal number of children in the given query graph.
     *
     * @return the maximal number of children in the given query graph.
     */
    public int getMaxChildrenSize(){
    	int tempDegree;
    	int maxDegree = 0;
    	Set<ActivityNode> queryNodes = queryGraph.vertexSet();
    	for (ActivityNode queryNode : queryNodes) {
    		if ((tempDegree = queryGraph.outDegreeOf(queryNode)) > maxDegree) {
    			maxDegree = tempDegree;
    		}
    	}
        return maxDegree;  	
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
    }
       
    /**
     * Returns the given node and all its descendants in the query tree.
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
    	    	  results.addAll(getSubtreeNodes(temp));
    	        }
    	      return results;
    	}    	    	
    }
      
    /**
     * Returns the given node and all its descendants in the query tree.
     * 
     * @param node the node whose subtree nodes be returned.
     *
     * @return the given node and all its descendants.
     */
    public Set<String> getSubtreeNodesIDs(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter;
    	Set<String> results = new HashSet<String>();
    	ActivityNode temp; 	
    	results.add(node.getActivityID());
    	if(isLeaf(node)){
        	return results;    		
    	} else {
    		 queryEdgeIter = queryGraph.outgoingEdgesOf(node).iterator();
    	      while (queryEdgeIter.hasNext()) {
    	    	  temp = queryGraph.getEdgeTarget(queryEdgeIter.next());
    	    	  results.addAll(getSubtreeNodesIDs(temp));
    	        }
    	      return results;
    	}    	    	
    }
    
    /**
     * Returns ids of the given node and all its descendants in the query DAG 
     * or query tree.
     * 
     * @param node the node whose subgraph nodes are returned.
     *
     * @return ids of the given node and all its descendants.
     */
    public Set<String> getSubgraphNodesIDsFromMap(ActivityNode node){
    	if (isLeaf(node)) {
    		if (!subgraphNodesForLeafOrRoot.isEmpty()) {
    			subgraphNodesForLeafOrRoot.clear();
    		}
    		subgraphNodesForLeafOrRoot.add(node.getActivityID());
    		return subgraphNodesForLeafOrRoot;
    	} else if (isRoot(node)) {
    		if (!subgraphNodesForLeafOrRoot.isEmpty()) {
    			subgraphNodesForLeafOrRoot.clear();
    		}
        	Set<ActivityNode> vertexSetQuery = queryGraph.vertexSet();   	
    		for (ActivityNode queryNode : vertexSetQuery) {
    			subgraphNodesForLeafOrRoot.add(queryNode.getActivityID());
    		}
    		return subgraphNodesForLeafOrRoot;
    	} else {
    		return subgraphNodesIDsMap.get(node.getActivityID());
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
	
    /**
     * Tests whether the given node is a join node, that means the number of incoming 
     * edges is greater than 1.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is a join node, otherwise <code>false</code>.
     */
	public boolean isJoinNode(ActivityNode node) {
		return (queryGraph.inDegreeOf(node) > 1);
	}
	
    /**
     * Tests whether the given node is a fork node, that means the number of outgoing 
     * edges is greater than 1.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is a fork node, otherwise <code>false</code>.
     */
	public boolean isForkNode(ActivityNode node) {
		return (queryGraph.outDegreeOf(node) > 1);
	}
	
    /**
     * Computes a list of nodes from the input node id set. In the list each node 
     * with even index is the parent of the next node with odd index. The result is 
     * stored in the second parameter.
     * 
     * @param nodeIDSet the ids of nodes
     * @param idPairsList the computed id list
     */
	public void computeNodeIDPairs(Set<String> nodeIDSet, List<String> idPairsList) {
		ActivityNode node;
		Iterator<DefaultEdge> queryEdgeIter;
		String targetNID;
		if (!idPairsList.isEmpty()) {
			idPairsList.clear();
		}
		if (nodeIDSet.size() > 1) {
			for (String nID : nodeIDSet) {
				if ((node = getActivityNode(nID)) != null) {
					queryEdgeIter = queryGraph.outgoingEdgesOf(node).iterator();
			        while (queryEdgeIter.hasNext()) {
			        	targetNID = queryGraph.getEdgeTarget(queryEdgeIter.next()).getActivityID();
			        	if (nodeIDSet.contains(targetNID)) {
			        		idPairsList.add(nID);
			        		idPairsList.add(targetNID);
			        	}
			        } 
				}
			}
		}
	}

    /**
     * Gets the level for the given node in the query graph.
     * 
     * @param node the node
     *
     * @return the level for the given node in the query graph, 
     * 			if the node exists. otherwise 0 is returned.
     */
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

	public DirectedGraph<ActivityNode, DefaultEdge> getQueryGraph() {
		return queryGraph;
	}

	public void setQueryGraph(DirectedGraph<ActivityNode, DefaultEdge> queryGraph) {
		this.queryGraph = queryGraph;
	}

	public DirectedGraph<ActivityNode, DefaultEdge> getMinimalSpanningTreeOfQueryGraph() {
		return minimalSpanningTreeOfQueryGraph;
	}
	
	/**
	 * Computes the minimal spanning tree for the given query DAG, the minimal spanning tree is 
	 * stored in the corresponding attribute.
	 * 
	 */
	public void setMinimalSpanningTreeOfQueryGraph() {
  		minimalSpanningTreeOfQueryGraph = 
				new DefaultDirectedGraph<ActivityNode, DefaultEdge>(DefaultEdge.class);
		BuildMinimalSpanningTree mst = new BuildMinimalSpanningTree(queryGraph, startVertex);
		mst.traverse();
		this.minimalSpanningTreeOfQueryGraph = mst.getMinimalSpanningTree();
		setLevelMap(mst.getLevelMap());
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

	public List<ActivityNode> getQueryNodesSortedByLevelOrder() {
		return queryNodesSortedByLevelOrder;
	}

	public void setQueryNodesSortedByLevelOrder(List<ActivityNode> 
			sortedQueryNodesByLevelOrder) {
		this.queryNodesSortedByLevelOrder = sortedQueryNodesByLevelOrder;
	}
	
	/**
	 * Fill the query nodes list sorted by level order.
	 * 
	 */
	public void setQueryNodesSortedByLevelOrder() {
		if (bfs == null) {
			bfs = new BreadthFirstTraverse(queryGraph, startVertex);
		}
		bfs.traverse();
		this.queryNodesSortedByLevelOrder = bfs.getNodesSortedByLevelOrder();
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public void setNumberOfEdges(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
	}
	
	public Map<String, Set<String>> getSubgraphNodesIDsMap() {
		return subgraphNodesIDsMap;
	}

	public void setSubgraphNodesIDsMap(Map<String, Set<String>> subgraphNodesIDsMap) {
		this.subgraphNodesIDsMap = subgraphNodesIDsMap;
	}
	
	/**
	 * Fill the subgraphNodes map for the query DAG case.
	 * 
	 */
	public void setSubgraphNodesMapForQueryDAG() {
		if (bfs == null) {
			bfs = new BreadthFirstTraverse(queryGraph, startVertex);
		}		
		if (subgraphNodesIDsMap == null) {
			subgraphNodesIDsMap = new HashMap<String, Set<String>>();
		}
		Set<ActivityNode> qNodes = queryGraph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if ((!qNode.equals(startVertex)) && (!isLeaf(qNode))) {
				subgraphNodesIDsMap.put(qNode.getActivityID(), bfs.getSubgraphNodesIDs(qNode));
			}
		}
	}
	
	/**
	 * Fill the subgraphNodes map for the query tree case.
	 * 
	 */
	public void setSubgraphNodesMapForQueryTree() {
		if (subgraphNodesIDsMap == null) {
			subgraphNodesIDsMap = new HashMap<String, Set<String>>();
		}		
		Set<ActivityNode> qNodes = queryGraph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if ((!qNode.equals(startVertex)) && (!isLeaf(qNode))) {
				subgraphNodesIDsMap.put(qNode.getActivityID(), getSubtreeNodesIDs(qNode));
			}
		}
	}

	/**
	 * Gets the query node with the given query node id.
	 * 
	 * @param nodeID the node id
	 * 
	 * @return the corresponding query node
	 */
	public ActivityNode getQueryNode(String nodeID) {
		Set<ActivityNode> qNodes = queryGraph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if (qNode.getActivityID().compareTo(nodeID) == 0) {
				return qNode;
			}
		}
		return null;
	}
}
