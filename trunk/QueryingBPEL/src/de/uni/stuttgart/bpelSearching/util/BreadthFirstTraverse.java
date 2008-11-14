package de.uni.stuttgart.bpelSearching.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * A breadth-first traverse class for a directed and an undirected graph. 
 *
 * @author Wei Lu
 */

public class BreadthFirstTraverse extends AbstractGraphTraverse {
    
	static Logger logger = Logger.getLogger(BreadthFirstTraverse.class);
	
    /**
     * Queue, which supports breadth first traverse
     */
    protected Queue<ActivityNode> theQueue;
    
    /**
     * Stores nodes with breadth first traverse order
     */
    protected List<ActivityNode> nodesBreadthFirstTraverseOrder = new 
    	LinkedList<ActivityNode>();
    
    /**
     * Stores nodes sorted by level order
     */
    protected List<ActivityNode> nodesSortedByLevelOrder = new 
    	LinkedList<ActivityNode>();
    
    /**
     * Stores level number for each vertices.
     */
    protected Map<ActivityNode, Integer> maxLevelMap = new HashMap<ActivityNode, Integer>();
        	
    /**
     * Creates a new breadth-first traverse for the specified graph. Traverse
     * will start at the specified start vertex and will be limited to the
     * connected component that includes that vertex. If the specified start
     * vertex is <code>null</code>, traverse will start at an arbitrary vertex.
     *
     * @param g the graph to be traversed.
     * @param startVertex the vertex traverse to be started.
     */
    @SuppressWarnings("unchecked")
	public BreadthFirstTraverse(DirectedGraph<ActivityNode, DefaultEdge> g, ActivityNode startVertex)
    {
    	super(g, startVertex);        
        theQueue = new LinkedList<ActivityNode>();        
    }
 
    /**
     * Perform the breadth first traverse.
     *      
     */   
    public void traverse()
    {   
    	Iterator<DefaultEdge> queryEdgeIter;
    	ActivityNode parent;
    	Integer pLevel;
    	int maxPLevel, tempMaxLevel, listLength;
    	
    	// begin at start vertex
    	setWasVisited(startVertex, true);
    	//displayVertex(startVertex);
    	
    	nodesBreadthFirstTraverseOrder.add(startVertex);
    	nodesSortedByLevelOrder.add(startVertex);
    	maxLevelMap.put(startVertex, new Integer(0));
    	tempMaxLevel = 0;
    	theQueue.clear();
    	theQueue.add(startVertex);  	
    	ActivityNode v1, v2;
    	
    	while( !theQueue.isEmpty() )
    	{
    		// remove vertex at head
    		v1 = theQueue.remove();   		
    		// until it has no unvisited neighbors
    		while((v2 = getAdjUnvisitedVertex(v1)) != null)
    		{    			            	           	           	
    			setWasVisited(v2, true);
    			//displayVertex(v2);
    			
    			nodesBreadthFirstTraverseOrder.add(v2);
    	    	queryEdgeIter = graph.incomingEdgesOf(v2).iterator();
    	    	maxPLevel = 0;
    	    	while (queryEdgeIter.hasNext()) {
    	    		parent = graph.getEdgeSource(queryEdgeIter.next());
    	    		if (((pLevel = maxLevelMap.get(parent)) != null) 
    	    				&& (pLevel.intValue() > maxPLevel)) {
    	    			maxPLevel = pLevel.intValue();
    	    		}
    	    	}
    	    	maxPLevel = maxPLevel + 1;
    	    	if (maxPLevel >= tempMaxLevel) {
        	    	if (maxPLevel > tempMaxLevel) {
        	    		tempMaxLevel = maxPLevel;
        	    	}
    	    		nodesSortedByLevelOrder.add(v2);
    	    	} else {
        	    	listLength = nodesSortedByLevelOrder.size();
        	    	for (int i = 0; i < listLength; i++) {
        	    		if (maxPLevel <= maxLevelMap.get(nodesSortedByLevelOrder.get(i)).intValue()) {
        	    			nodesSortedByLevelOrder.add(i, v2);
        	    			break;
        	    		}
        	    	}
    	    	}
    	    	maxLevelMap.put(v2, new Integer(maxPLevel));
    	    	
    	    	//logger.warn("NodeID: " + v2.toString() + "  Level: " + maxPLevel);
    			theQueue.add(v2);           	            	
    		}
    	}

    	// queue is empty, so we're done    
    	Set<ActivityNode> vertexSetGraph = graph.vertexSet();
	
    	setConnected(true);
    	for (ActivityNode vertexGraph : vertexSetGraph) {
    		if(!getWasVisited(vertexGraph) && isConnected()){
    			setConnected(false);
    		}
    		setWasVisited(vertexGraph, false);
    	}	
    }
    
    
    /**
     * Return the subgraph nodes ids of the given node.
     * 
     * @param node start node
     * 
     * @return the subgraph nodes ids of the given node
     * 
     */   
    public Set<String> getSubgraphNodesIDs(ActivityNode node)
    {   
    	Set<String> result = new HashSet<String>(); 	
    	// begin at start vertex
    	setWasVisited(node, true);
    	//displayVertex(node);
    	result.add(node.getActivityID());	
    	theQueue.clear();
    	theQueue.add(node);  	
    	ActivityNode v1, v2;
    	
    	while( !theQueue.isEmpty() )
    	{
    		// remove vertex at head
    		v1 = theQueue.remove();   		
    		// until it has no unvisited neighbors
    		while((v2 = getAdjUnvisitedVertex(v1)) != null)
    		{    			            	           	           	
    			setWasVisited(v2, true);
    			//displayVertex(v2);
    			result.add(v2.getActivityID());	    	
    	    	//logger.warn("NodeID: " + v2.toString() + "  Level: " + maxPLevel);
    			theQueue.add(v2);           	            	
    		}
    	}

    	// queue is empty, so we're done    
    	Set<ActivityNode> vertexSetGraph = graph.vertexSet();
    	for (ActivityNode vertexGraph : vertexSetGraph) {
    		setWasVisited(vertexGraph, false);
    	}
    	
    	return result;
    }

	public List<ActivityNode> getNodesBreadthFirstTraverseOrder() {
		return nodesBreadthFirstTraverseOrder;
	}

	public void setNodesBreadthFirstTraverseOrder(
			LinkedList<ActivityNode> nodesBreadthFirstTraverseOrder) {
		this.nodesBreadthFirstTraverseOrder = nodesBreadthFirstTraverseOrder;
	}

	public List<ActivityNode> getNodesSortedByLevelOrder() {
		return nodesSortedByLevelOrder;
	}

	public void setNodesSortedByLevelOrder(
			List<ActivityNode> nodesSortedByLevelOrder) {
		this.nodesSortedByLevelOrder = nodesSortedByLevelOrder;
	}
    
}

 

