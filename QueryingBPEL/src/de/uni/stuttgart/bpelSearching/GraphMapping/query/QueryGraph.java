package de.uni.stuttgart.bpelSearching.GraphMapping.graphs;

import java.util.ArrayList;
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

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.util.BreadthFirstTraverse;
import de.uni.stuttgart.bpelSearching.util.BuildMinimalSpanningTree;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;

/**
 * Analysis a given query graph.
 *
 *
 * @author Wei Lu
 */

public class QueryGraph extends BasisGraph {
	static Logger logger = Logger.getLogger(QueryGraph.class);	
	private DirectedGraph<ActivityNode, DefaultEdge> minimalSpanningTreeOfQueryGraph;
	private List<ActivityNode> queryNodesSortedByLevelOrder;
	private Set<String> subgraphNodesForLeafOrRoot;
	private int numberOfEdges;
	private int numberOfVertexes;
	private Map<ActivityNode, Integer> levelMap;
	private Map<String, Set<String>> subgraphNodesIDsMap;
	private Map<String, Set<ActivityNode>> childrenNodesMap;
	private Map<String, Set<ActivityNode>> childrenNodesInMSTMap;
	private Set<ActivityNode> emptyNodesSet;
	private Map<String, Set<ActivityNode>> parentsNodesMap;
	private List<Set<Integer>> parentsIndexesList;
	private BreadthFirstTraverse bfs;
	
    /**
     * Creates a new query graph.
     *
     * @param graph the query graph.
     * @param startActivity the start vertex of the query graph
     * 
     * @throws IllegalArgumentException if <code>graph==null</code> or does not
     * contain <code>startActivity</code> or <code>graph</code> is not acylic
     *
     */ 
    public QueryGraph(DirectedGraph<ActivityNode, DefaultEdge> graph, 
    		ActivityNode startVertex){
    	super();
    	if (graph == null) {
            throw new IllegalArgumentException("graph must not be null");
        } 	
       	this.graph = graph;
    	GraphAnalyse ga = new GraphAnalyse(graph, startVertex);
    	this.startActivity = ga.getStartVertex();  		  		 	    	
    	this.graphType = ga.checkGraphType();
    	this.numberOfEdges = graph.edgeSet().size();
    	this.numberOfVertexes = graph.vertexSet().size();
    	this.subgraphNodesForLeafOrRoot = new HashSet<String>();
    	setChildrenNodesMap();
    }
    
    /**
     * Creates a new query graph.
     *
     * @param graph the query graph.
     * 
     * @throws IllegalArgumentException if <code>graph==null</code> or does not
     * contain <code>startActivity</code> or <code>graph</code> is not acylic
     *
     */  
    public QueryGraph(DirectedGraph<ActivityNode, DefaultEdge> graph){
    	super();
    	if (graph == null) {
            throw new IllegalArgumentException("graph must not be null");
        }  	
       	this.graph = graph;     	
    	GraphAnalyse ga = new GraphAnalyse(graph, null);    	
    	this.startActivity = ga.getStartVertex();   	    	
    	this.graphType = ga.checkGraphType();
    	this.numberOfEdges = graph.edgeSet().size();
    	this.numberOfVertexes = graph.vertexSet().size();
    	this.subgraphNodesForLeafOrRoot = new HashSet<String>();
    	setChildrenNodesMap();
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
    	return ((node.getActivityID()).compareTo(startActivity.getActivityID()) == 0);
    }
    
    /**
     * Tests whether the given node is leaf of the query graph.
     * 
     * @param node the node to be checked.
     *
     * @return <code>true</code> if the node is leaf, otherwise <code>false</code>.
     */
    public boolean isLeaf(ActivityNode node){    	
    	return (graph.outgoingEdgesOf(node).size() == 0);
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
    	Set<ActivityNode> vertexSetQuery = graph.vertexSet();   	
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
    	Set<ActivityNode> vertexSetQuery = graph.vertexSet();   	
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
    		graph.incomingEdgesOf(node).iterator();
    	
        if (queryEdgeIter.hasNext()) {
            return graph.getEdgeSource(queryEdgeIter.next());
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
    		graph.incomingEdgesOf(node).iterator();
    	Set<ActivityNode> parentsSet = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	parentsSet.add(graph.getEdgeSource(queryEdgeIter.next()));
        } 
        
    	return parentsSet;
    }
    
    /**
     * Returns parents nodes of the given node in the given query graph.
     * 
     * @param node the node whose parents to be returned.
     *
     * @return parents of the given node.
     */
    public Set<ActivityNode> getParentsFromMap(ActivityNode node){
    	if (isRoot(node)) {
    		if (!emptyNodesSet.isEmpty()) {
    			emptyNodesSet.clear();
    		}
    		return emptyNodesSet;
    	} else {
    		return parentsNodesMap.get(node.getActivityID());
    	}	
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
    		graph.incomingEdgesOf(joinedNode).iterator();
    	Iterator<DefaultEdge> queryMSTEdgeIter = 
    		minimalSpanningTreeOfQueryGraph.incomingEdgesOf(joinedNode).iterator();
    	Set<ActivityNode> parentsSet = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	parentsSet.add(graph.getEdgeSource(queryEdgeIter.next()));
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
        		graph.incomingEdgesOf(node).iterator();
            while (queryEdgeIter.hasNext()) {
            	pNode = graph.getEdgeSource(queryEdgeIter.next());
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
     * Returns positions of the parents for the given node position in 
     * <code>queryNodesSortedByLevelOrder</code>.
     * 
     * @param nodeIndex the node position in <code>queryNodesSortedByLevelOrder</code>
     *
     * @return positions of the parents.
     */
    public Set<Integer> getParentsIndexesFromList(int nodeIndex){
    	if (nodeIndex < this.parentsIndexesList.size()) {
    		return this.parentsIndexesList.get(nodeIndex);
    	} else {
    		return null;
    	}
    }
    
    /**
     * Returns all children nodes of the given node in the given query graph.
     * 
     * @param node the node whose children to be returned.
     *
     * @return children of the given node.
     */
    public Set<ActivityNode> getChildren(ActivityNode node){
    	Iterator<DefaultEdge> queryEdgeIter = 
    		graph.outgoingEdgesOf(node).iterator();
    	Set<ActivityNode> results = new HashSet<ActivityNode>();
    	
        while (queryEdgeIter.hasNext()) {
        	results.add(graph.getEdgeTarget(queryEdgeIter.next()));
        }
        
        return results;  	
    }
    
    /**
     * Computes all children nodes of the given node in the given query graph.
     * 
     * @param node the node whose children to be returned.
     * @param children stores the computed children nodes
     */
    public void getChildren(ActivityNode node, Set<ActivityNode> children){
    	if (children == null) {
    		children = new HashSet<ActivityNode>();
    	} else if (!children.isEmpty()) {
    		children.clear();
    	}
    	Iterator<DefaultEdge> queryEdgeIter = 
    		graph.outgoingEdgesOf(node).iterator(); 	
        while (queryEdgeIter.hasNext()) {
        	children.add(graph.getEdgeTarget(queryEdgeIter.next()));
        }	
    }
    
    /**
     * Returns children nodes of the given node in the given query graph.
     * 
     * @param node the node whose children to be returned.
     *
     * @return children of the given node.
     */
    public Set<ActivityNode> getChildrenFromMap(ActivityNode node){
    	if (isLeaf(node)) {
    		if (!emptyNodesSet.isEmpty()) {
    			emptyNodesSet.clear();
    		}
    		return emptyNodesSet;
    	} else {
    		return childrenNodesMap.get(node.getActivityID());
    	}	
    }
    
    /**
     * Returns number of children of the given node.
     * 
     * @param node the node whose number of children to be returned.
     *
     * @return number of children of the given node.
     */
    public int getChildrenSize(ActivityNode node){
        return graph.outDegreeOf(node);  	
    }
    
    /**
     * Returns the maximal number of children in the given query graph.
     *
     * @return the maximal number of children in the given query graph.
     */
    public int getMaxChildrenSize(){
    	int tempDegree;
    	int maxDegree = 0;
    	Set<ActivityNode> queryNodes = graph.vertexSet();
    	for (ActivityNode queryNode : queryNodes) {
    		if ((tempDegree = graph.outDegreeOf(queryNode)) > maxDegree) {
    			maxDegree = tempDegree;
    		}
    	}
        return maxDegree;  	
    }
    
    
    /**
     * Returns children nodes of the given node in the minimal spanning tree of 
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
     * Returns children nodes of the given node in the minimal spanning tree of 
     * the given query graph.
     * 
     * @param node the node whose children to be returned.
     *
     * @return children of the given node in the minimal spanning tree.
     */
    public Set<ActivityNode> getChildrenInMSTFromMap(ActivityNode node){
    	if (isLeaf(node)) {
    		if (!emptyNodesSet.isEmpty()) {
    			emptyNodesSet.clear();
    		}
    		return emptyNodesSet;
    	} else {
    		return childrenNodesInMSTMap.get(node.getActivityID());
    	}	
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
    		 queryEdgeIter = graph.outgoingEdgesOf(node).iterator();
    	      while (queryEdgeIter.hasNext()) {
    	    	  temp = graph.getEdgeTarget(queryEdgeIter.next());
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
    		 queryEdgeIter = graph.outgoingEdgesOf(node).iterator();
    	      while (queryEdgeIter.hasNext()) {
    	    	  temp = graph.getEdgeTarget(queryEdgeIter.next());
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
        	Set<ActivityNode> vertexSetQuery = graph.vertexSet();   	
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
		Set<ActivityNode> queryNodes = graph.vertexSet();
		
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
		return (graph.inDegreeOf(node) > 1);
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
		return (graph.outDegreeOf(node) > 1);
	}
	
    /**
     * Computes a list of nodes ids from the input set of nodes ids. In the list each 
     * node id with even index is the parent of the next node id with odd index. The 
     * result is stored in the second parameter.
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
					queryEdgeIter = graph.outgoingEdgesOf(node).iterator();
			        while (queryEdgeIter.hasNext()) {
			        	targetNID = graph.getEdgeTarget(queryEdgeIter.next()).getActivityID();
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
     * Computes a list of nodes ids from two sets of nodes ids. In the list each node 
     * id with even index(from source id set)is the parent of the next node id with 
     * odd index(from target id set). The result is stored in the third parameter.
     * 
     * @param sourceNIDSet the ids of nodes
     * @param targetNIDSet the ids of nodes
     * @param idPairsList the computed id list
     */
	public void computeNodeIDPairs(Set<String> sourceNIDSet, Set<String> targetNIDSet, 
			List<String> idPairsList) {
		ActivityNode sourceNode;
		Iterator<DefaultEdge> queryEdgeIter;
		String targetNID;
		if (!idPairsList.isEmpty()) {
			idPairsList.clear();
		}
		if ((sourceNIDSet.size() > 0) && (targetNIDSet.size() > 0)) {
			for (String sourceNID : sourceNIDSet) {
				if ((sourceNode = getActivityNode(sourceNID)) != null) {
					queryEdgeIter = graph.outgoingEdgesOf(sourceNode).iterator();
			        while (queryEdgeIter.hasNext()) {
			        	targetNID = graph.getEdgeTarget(queryEdgeIter.next()).getActivityID();
			        	if (targetNIDSet.contains(targetNID)) {
			        		idPairsList.add(sourceNID);
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
		BuildMinimalSpanningTree mst = new BuildMinimalSpanningTree(graph, startActivity);
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
			bfs = new BreadthFirstTraverse(graph, startActivity);
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
			bfs = new BreadthFirstTraverse(graph, startActivity);
		}		
		if (subgraphNodesIDsMap == null) {
			subgraphNodesIDsMap = new HashMap<String, Set<String>>();
		}
		Set<ActivityNode> qNodes = graph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if ((!qNode.equals(startActivity)) && (!isLeaf(qNode))) {
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
		Set<ActivityNode> qNodes = graph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if ((!qNode.equals(startActivity)) && (!isLeaf(qNode))) {
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
		Set<ActivityNode> qNodes = graph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if (qNode.getActivityID().compareTo(nodeID) == 0) {
				return qNode;
			}
		}
		return null;
	}

	public int getNumberOfVertexes() {
		return numberOfVertexes;
	}

	public void setNumberOfVertexes(int numberOfVertexes) {
		this.numberOfVertexes = numberOfVertexes;
	}

	public Map<String, Set<ActivityNode>> getChildrenNodesMap() {
		return childrenNodesMap;
	}

	public void setChildrenNodesMap(Map<String, Set<ActivityNode>> childrenNodesMap) {
		this.childrenNodesMap = childrenNodesMap;
	}
	
	/**
	 * Fill the childrenNodes map for the query graph.
	 * 
	 */
	public void setChildrenNodesMap() {
		this.childrenNodesMap = new HashMap<String, Set<ActivityNode>>();
		if (this.emptyNodesSet == null) {
			this.emptyNodesSet = new HashSet<ActivityNode>();
		}	
		Iterator<DefaultEdge> queryEdgeIter;
		Set<ActivityNode> cSet;
		Set<ActivityNode> qNodes = graph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if (!isLeaf(qNode)) {
		    	queryEdgeIter = graph.outgoingEdgesOf(qNode).iterator();
		    	cSet = new HashSet<ActivityNode>();    	
		        while (queryEdgeIter.hasNext()) {
		        	cSet.add(graph.getEdgeTarget(queryEdgeIter.next()));
		        }
		        childrenNodesMap.put(qNode.getActivityID(), cSet);
			}
		}
	}
	
	/**
	 * Fill the childrenNodes map for the minimal spanning tree of the query graph.
	 * 
	 */
	public void setChildrenNodesInMSTMap() {
		this.childrenNodesInMSTMap = new HashMap<String, Set<ActivityNode>>();
		if (this.emptyNodesSet == null) {
			this.emptyNodesSet = new HashSet<ActivityNode>();
		}	
		Iterator<DefaultEdge> queryMSTEdgeIter;
		Set<ActivityNode> cSet;
		Set<ActivityNode> qNodes = graph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if (!isLeaf(qNode)) {
				queryMSTEdgeIter = minimalSpanningTreeOfQueryGraph.outgoingEdgesOf(qNode).iterator();
		    	cSet = new HashSet<ActivityNode>();    	
		        while (queryMSTEdgeIter.hasNext()) {
		        	cSet.add(minimalSpanningTreeOfQueryGraph.getEdgeTarget(queryMSTEdgeIter.next()));
		        }
		        this.childrenNodesInMSTMap.put(qNode.getActivityID(), cSet);
			}
		}
	}
	
	/**
	 * Fill the parentsNodes map for the query graph.
	 * 
	 */
	public void setParentsNodesMap() {
		this.parentsNodesMap = new HashMap<String, Set<ActivityNode>>();
		if (this.emptyNodesSet == null) {
			this.emptyNodesSet = new HashSet<ActivityNode>();
		}	
		Iterator<DefaultEdge> queryEdgeIter;
		Set<ActivityNode> pSet;
		Set<ActivityNode> qNodes = graph.vertexSet();		
		for (ActivityNode qNode : qNodes) {
			if (!isRoot(qNode)) {
		    	queryEdgeIter = graph.incomingEdgesOf(qNode).iterator();
		    	pSet = new HashSet<ActivityNode>();    	
		        while (queryEdgeIter.hasNext()) {
		        	pSet.add(graph.getEdgeSource(queryEdgeIter.next()));
		        }
		        parentsNodesMap.put(qNode.getActivityID(), pSet);
			}
		}
	}
	
	/**
	 * Fill the list with indexes of parents.
	 * 
	 */
	public void setParentsIndexesList() {
		int qNodesSortedLength;
		Iterator<DefaultEdge> queryEdgeIter;
		ActivityNode parent, qNode;
		Set<Integer> pIndexes;
		if (this.queryNodesSortedByLevelOrder != null) {		
			qNodesSortedLength = queryNodesSortedByLevelOrder.size();
			if (qNodesSortedLength == graph.vertexSet().size()) {
				this.parentsIndexesList = new ArrayList<Set<Integer>>();
				for (int i = 0; i < qNodesSortedLength; i++) {
					qNode = queryNodesSortedByLevelOrder.get(i);
		        	queryEdgeIter = graph.incomingEdgesOf(qNode).iterator();
		        	pIndexes = new HashSet<Integer>();
		            while (queryEdgeIter.hasNext()) {
		            	parent = graph.getEdgeSource(queryEdgeIter.next());
		            	for (int j = 0; j < qNodesSortedLength; j++) {
		            		if (queryNodesSortedByLevelOrder.get(j).getActivityID().
		            				compareTo(parent.getActivityID()) == 0){
		            			pIndexes.add(new Integer(j));
		            			break;
		            		}
		            	}
		            }
		            this.parentsIndexesList.add(pIndexes);				
				}
			}
		}
	}

}
