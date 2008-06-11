package de.uni.stuttgart.bpelSearching.traverse;


import java.util.*;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;

public class BreadthFirstIteratorNew1<V, E> extends BreadthFirstIterator<V, E>{
	
    
    /**
     * Stores the level number for each vertices
     */
    private Map<V, Integer> levelMap = new HashMap<V, Integer>();

    /**
     * Stores the breath number for each vertices
     */
    private Map<V, Integer> breadthMap = new HashMap<V, Integer>();
 
    /**
     * Stores the current level number
     */
    private int currentLevel;
    
    /**    
    * Stores the current breadth number
    */
   private int currentBreadth;
   
   
   /**
    * Stores the maximal depth of the graph
    */
   private int maxDepth;
   
   /**
    * Stores the maximal breadth of the graph
    */
   private int maxBreadth;
   
   /**

	
    /**
     * Creates a new version of breadth-first iterator for the specified graph.
     *
     * @param g the graph to be iterated.
     */
	public BreadthFirstIteratorNew1(Graph<V, E> g, V startVertex) {
		super(g, startVertex);
        
        currentLevel = 0;
        
        currentBreadth = 0;
        
        maxBreadth = 1;
        
        maxDepth = 1;
        
        while (vertexIterator.hasNext()) {
        	V tempV = vertexIterator.next();
        	levelMap.put(tempV, new Integer(1)); 
        	breadthMap.put(tempV, new Integer(0));
        }
      
	}
	
    protected void addUnseenChildrenOf(V vertex)
    {
    	int levelParent = levelMap.get(vertex).intValue();
    	
    	if(levelParent > currentLevel) {
    		currentBreadth = 0;
    		currentLevel = levelParent;
    		maxDepth = levelParent;
    	}
        for (E edge : specifics.edgesOf(vertex)) {
            fireEdgeTraversed(createEdgeTraversalEvent(edge));

            V oppositeV = Graphs.getOppositeVertex(graph, edge, vertex);

            if (isSeenVertex(oppositeV)) {
                encounterVertexAgain(oppositeV, edge);
            } else {
            	levelMap.put(oppositeV, new Integer(levelParent + 1));
            	breadthMap.put(oppositeV, currentBreadth);
            	currentBreadth++;
            	if(currentBreadth > maxBreadth){
            		maxBreadth = currentBreadth;
            	}
                encounterVertex(oppositeV, edge);
            }
        }
    }
    
    protected void encounterStartVertex()
    {
        encounterVertex(startVertex, null);
        startVertex = null;
        //levelMap.put(startVertex, new Integer(1));
    }
    



    /**
     * Get the depth of the Vertex
     * 
     * @param vertex the input vertex.
     */
    public int getVertexLevel(V vertex)
    {       	
    	return levelMap.get(vertex).intValue();  	
    }

    /**
     * Get the breadth of the Vertex
     * 
     * @param vertex the input vertex.
     */
    public int getVertexBreadth(V vertex)
    {       	
    	return breadthMap.get(vertex).intValue();  	

    }	
    
    
    
    /**
     * Get the maximal depth of the graph
     */
    public int getMaxLevel()
    {       	
    	return maxDepth + 1;  	
    }
    
    /**
     * Get the maximal breadth of the graph
     */
    public int getMaxBreadth()
    {       	
    	return maxBreadth + 1;  	
    }
    
	

}
