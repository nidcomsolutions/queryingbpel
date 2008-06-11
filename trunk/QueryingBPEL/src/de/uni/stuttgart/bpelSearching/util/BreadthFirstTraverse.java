package de.uni.stuttgart.bpelSearching.util;

import org.jgrapht.*;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

import java.util.*;

/**
 * A breadth-first traverse class for a directed and an undirected graph. 
 *
 * @author Wei Lu
 */

public class BreadthFirstTraverse extends AbstractGraphTraverse {
    
    /**
     * Queue, which supports breadth first traverse
     */
    protected Queue<ActivityNode> theQueue;
    
    /**
     * Stores nodes with breadth first traverse order
     */
    protected LinkedList<ActivityNode> nodesBreadthFirstTraverseOrder = new 
    	LinkedList<ActivityNode>();
        	
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
    	// begin at start vertex
    	setWasVisited(startVertex, true);
    	//displayVertex(startVertex);
    	nodesBreadthFirstTraverseOrder.add(startVertex);
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

	public LinkedList<ActivityNode> getNodesBreadthFirstTraverseOrder() {
		return nodesBreadthFirstTraverseOrder;
	}

	public void setNodesBreadthFirstTraverseOrder(
			LinkedList<ActivityNode> nodesBreadthFirstTraverseOrder) {
		this.nodesBreadthFirstTraverseOrder = nodesBreadthFirstTraverseOrder;
	}
    
}

 

