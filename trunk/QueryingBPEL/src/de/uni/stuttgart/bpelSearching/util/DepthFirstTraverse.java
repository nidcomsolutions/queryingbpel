package de.uni.stuttgart.bpelSearching.util;

import org.jgrapht.*;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;

import java.util.*;

/**
 * A depth-first traverse class for a directed graph.
 * 
 * @author Wei Lu
 */
public class DepthFirstTraverse extends AbstractGraphTraverse {

	/**
     * Stack, which supports depth first traverse.
     */	
    protected Stack<ActivityNode> theStack;
       	
    /**
     * Creates a new depth-first traverse for the specified graph. Traverse
     * will start at the specified start vertex and will be limited to the
     * connected component that includes that vertex. If the specified start
     * vertex is <code>null</code>, traverse will start at an arbitrary vertex.
     *
     * @param g the graph to be traversed.
     * @param startVertex the vertex traverse to be started.
     */
    @SuppressWarnings("unchecked")
	public DepthFirstTraverse(DirectedGraph<ActivityNode, DefaultEdge> g, ActivityNode startVertex)
    {
    	super(g, startVertex);    	
        theStack = new Stack();
    }

    /**
     * Perform the depth first search
     *      
     */
    public void traverse()
    {       	
    	// begin at start vertex
    	setWasVisited(startVertex, true);
    	//displayVertex(startVertex);
    	if (!theStack.isEmpty()) {
    		theStack.clear();
    	}   	
    	theStack.push(startVertex);

    	while( !theStack.isEmpty() )
    	{
    		// *** minimum spanning tree
    		//ActivityNode currentVertex = theStack.peek();  		
    		// get an unvisited vertex adjacent to stack top
    		ActivityNode v = getAdjUnvisitedVertex(theStack.peek());
    		if(v == null){
    			theStack.pop();
    		} else {
    			setWasVisited(v, true);
    			//displayVertex(v);
    			theStack.push(v);    			
    			// *** minimum spanning tree
    			//mstEdgeSet.add(graph.getEdge(currentVertex, v));   			
         	 }
    	}

    	// stack is empty, so we're done    
    	Set<ActivityNode> vertexSetGraph = graph.vertexSet();
    	
    	setConnected(true);
    	for (ActivityNode vertexGraph : vertexSetGraph) {
    		if(!getWasVisited(vertexGraph) && isConnected()){
    			setConnected(false);
    		}
    		setWasVisited(vertexGraph, false);
    	}	
    }   
}



