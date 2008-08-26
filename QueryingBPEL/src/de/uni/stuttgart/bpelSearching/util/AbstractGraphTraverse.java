package de.uni.stuttgart.bpelSearching.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * The abstract AbstractGraphTraverse class traverse the given graph and 
 * perform some action during the traverse, for example: calculate level/breadth
 *  or other positional information for each vertex.
 * 
 * @author Wei Lu
 * 
 */

public abstract class AbstractGraphTraverse {
	
	static Logger logger = Logger.getLogger(AbstractGraphTraverse.class);
	
    protected DirectedGraph<ActivityNode, DefaultEdge> graph;
    
    protected ActivityNode startVertex;
    
    protected boolean isConnected;
    
    /**
     * Stores the information, whether the vertex was visited.
     */
    protected Map<ActivityNode, Boolean> wasVisitedMap = new HashMap<ActivityNode, Boolean>();
       
    /**
     * Creates a new traverse instance for the specified graph. Traverse
     * will start at the specified start vertex and will be limited to the
     * connected component that includes that vertex. If the specified start
     * vertex is <code>null</code>, traverse will start at an arbitrary vertex.
     *
     * @param g the graph to be traversed.
     * @param startVertex the vertex traverse to be started.
     */
    @SuppressWarnings("unchecked")
	public AbstractGraphTraverse(DirectedGraph<ActivityNode, DefaultEdge> g, ActivityNode startVertex)
    {
        if (g == null) {
            throw new IllegalArgumentException("graph must not be null");
        }
		                 
        if (startVertex == null) {
            // pick a start vertex if graph not empty
        	Iterator<ActivityNode> vertexIterator = g.vertexSet().iterator();
            if (vertexIterator.hasNext()) {
                this.startVertex = vertexIterator.next();
            } else {
                this.startVertex = null;
            }
        } else if (g.containsVertex(startVertex)) {
            this.startVertex = startVertex;
        } else {
            throw new IllegalArgumentException(
                "graph must contain the start vertex");
        }
      
        graph = g;       
        isConnected = false;
        
        // set all vertex as unvisited
        Set<ActivityNode> vertexSetG = graph.vertexSet();
		for (ActivityNode vertexG : vertexSetG) {
			wasVisitedMap.put(vertexG, new Boolean(false));
		}             
    }
    
    /**
     * traverse the graph.
     *
     */
    public abstract void traverse();
    
    
    /**
     * Gets an unvisited vertex adjacent to v
     *
     * @param v the vertex to be checked.
     * @return the unvisited vertex which is adjacent to v.
     *      
     */
    public ActivityNode getAdjUnvisitedVertex(ActivityNode v)
    {   	
		//Set<DefaultEdge> edgeSetForV = graph.edgesOf(v);
    	Set<DefaultEdge> edgeSetForV = graph.outgoingEdgesOf(v);
		ActivityNode targetForV;
    	    	
    	for (DefaultEdge edgeForV : edgeSetForV) {
			targetForV = graph.getEdgeTarget(edgeForV);
			if(!getWasVisited(targetForV))
				return targetForV;
		}    	
    	return null;   	
    }
    
    
    /**
     * get the information whether the vertex was visited.
     *
     * @param v the vertex to be checked.
     * @return whether the vertex was visited.
     *      
     */
    public boolean getWasVisited(ActivityNode v)
    {
    	return wasVisitedMap.get(v).booleanValue();
    }
    
    /**
     * set vertex as visited or as not visited.
     * @param v the vertex to be set.
     * @param visited .
     *      
     */
    public void setWasVisited(ActivityNode v, boolean visited)
    {
    	wasVisitedMap.put(v, new Boolean(visited));
    }
    
    
    
    /**
     * Output the vertex
     *
     * @param v the vertex to be printed.
     *      
     */
    public void displayVertex(ActivityNode v)
    {
    	System.out.println(v.toString());
    }
    
    /**
     * Determines whether a vertex is a leaf
     * 
     * @param v vertex in question.
     *
     * @return <tt>true</tt> if the vertex is a leaf; <tt>false</tt> otherwise.
     *      
     */
    public boolean isLeaf(ActivityNode v)
    {
    	for(DefaultEdge edgeV: graph.edgesOf(v)){
    		if(graph.getEdgeSource(edgeV) == v)
    			return false;    		
    	}
    	return true;   	
    }


	public boolean isConnected() {
		return isConnected;
	}

	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}
    

}


