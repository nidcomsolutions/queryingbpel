/**
 * 
 */
package de.uni.stuttgart.bpelSearching.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * A depth-first traverse class for a directed graph. During traverse,
 * it calculates and stores additional information about node position (level, breadth).
 * 
 * @author luwei
 *
 */
public class BreadthFirstTraverseExtension extends BreadthFirstTraverse {
	
    /**
     * Stores level number for each vertices.
     */
    protected Map<ActivityNode, Integer> levelMap = new HashMap<ActivityNode, Integer>();

    /**
     * Stores breath number for each vertices.
     */
    protected Map<ActivityNode, Integer> breadthMap = new HashMap<ActivityNode, Integer>();
 
    /**
     * Stores the current level number.
     */
    protected int currentLevel;
    
    /**    
    * Stores the current breadth number.
    */
    protected int currentBreadth;
      
   /**
    * Stores the maximal depth of the graph.
    */
    protected int maxDepth;
   
   /**
    * Stores the maximal breadth of the graph.
    */
    protected int maxBreadth;

	/**
	 * Creates a new breadth-first traverse for the specified graph, initialize node position
     * and traverse order. Traverse will start at the specified start vertex and will be 
     * limited to the connected component that includes that vertex. If the specified start
     * vertex is <code>null</code>, traverse will start at an arbitrary vertex.
     * 
	 * @param g the graph to be traversed.
	 * @param startVertex the vertex traverse to be started.
	 */
	public BreadthFirstTraverseExtension(DirectedGraph<ActivityNode, DefaultEdge> g, ActivityNode startVertex) {
		super(g, startVertex);

        // set all vertex as unvisited
        Set<ActivityNode> vertexSetG = graph.vertexSet();
		for (ActivityNode vertexG : vertexSetG) {
			levelMap.put(vertexG, new Integer(0));
			breadthMap.put(vertexG, new Integer(0));
		}
		
        // initializing position information of node
        currentLevel = 0;
        
        currentBreadth = 0;
        
        maxBreadth = 1;
        
        maxDepth = 1;
	}
	
    /**
     * Perform the breadth first traverse.
     *      
     */
    @Override
    public void traverse()
    {   
    	// begin at start vertex
    	setWasVisited(startVertex, true);
    	displayVertex(startVertex);
    	theQueue.add(startVertex);
    	
    	ActivityNode v1;
    	ActivityNode v2;
    	int levelParent;

    	while( !theQueue.isEmpty() )
    	{
    		// remove vertex at head
    		v1 = theQueue.remove();

    		levelParent = levelMap.get(v1).intValue();
    		
        	if(levelParent > currentLevel) {
        		currentBreadth = 0;
        		currentLevel = levelParent;
        		maxDepth = levelParent;
        	}
    		
    		// until it has no unvisited neighbors
    		while((v2 = getAdjUnvisitedVertex(v1)) != null)
    		{    			            	           	
            	levelMap.put(v2, new Integer(levelParent + 1));
            	breadthMap.put(v2, currentBreadth);
            	
            	if(currentBreadth > maxBreadth){
            		maxBreadth = currentBreadth;
            	}
            	currentBreadth++;
            	
    			setWasVisited(v2, true);
    			displayVertex(v2);
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
     * Output the vertex and its position
     *
     * @param v the vertex to be printed.
     *      
     */
    public void displayVertex(ActivityNode v)
    {
    	System.out.println("Vertex: " + v.toString() + "  Level: " + getVertexLevel(v) 
    			+ "  Breadth: " + getVertexBreadth(v));
    }
    
    
    /**
     * Get the depth of the Vertex
     * 
     * @param vertex the input vertex.
     */
    public int getVertexLevel(ActivityNode vertex)
    {       	
    	return levelMap.get(vertex).intValue();  	
    }

    /**
     * Get the breadth of the Vertex
     * 
     * @param vertex the input vertex.
     */
    public int getVertexBreadth(ActivityNode vertex)
    {       	
    	return breadthMap.get(vertex).intValue();  	
    }	
        
    /**
     * Get the maximal depth of the graph
     */
    public int getMaxLevel()
    {       	
    	return maxDepth;  	
    }
    
    /**
     * Get the maximal breadth of the graph
     */
    public int getMaxBreadth()
    {       	
    	return maxBreadth;  	
    }

	public Map<ActivityNode, Integer> getLevelMap() {
		return levelMap;
	}

	public void setLevelMap(Map<ActivityNode, Integer> levelMap) {
		this.levelMap = levelMap;
	}
}
