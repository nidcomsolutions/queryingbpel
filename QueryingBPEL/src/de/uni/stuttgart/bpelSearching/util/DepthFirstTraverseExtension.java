package de.uni.stuttgart.bpelSearching.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;

/**
 * A depth-first traverse class for a directed graph. During traverse, it calculates 
 * and stores additional information about traverse order (pre-order number,
 *  post-order number)and node position (level, breadth)for each node.
 * 
 * @author Wei Lu
 */
public class DepthFirstTraverseExtension extends DepthFirstTraverse {

    /**
     * Stores breath number for each vertices.
     */
    protected Map<ActivityNode, Integer> breadthMap = new HashMap<ActivityNode, Integer>();
    
    /**
     * Stores level number for each vertices.
     */
    protected Map<ActivityNode, Integer> levelMap = new HashMap<ActivityNode, Integer>();
    
    /**
     * Stores preorder number for each vertices.
     */
    protected Map<ActivityNode, Integer> preorderMap = new HashMap<ActivityNode, Integer>();
    
    /**
     * Stores postorder number for each vertices.
     */
    protected Map<ActivityNode, Integer> postorderMap = new HashMap<ActivityNode, Integer>();
       
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
        
    protected int traverseCount;
    
    protected int maxCount;
    
	
    /**
     * Creates a new depth-first traverse for the specified graph, initialize node position
     * and traverse order. Traverse will start at the specified start vertex and will be 
     * limited to the connected component that includes that vertex. If the specified start
     * vertex is <code>null</code>, traverse will start at an arbitrary vertex.
     *
     * @param g the graph to be traversed.
     * @param startVertex the vertex traverse to be started.
     */
    @SuppressWarnings("unchecked")
	public DepthFirstTraverseExtension(DirectedGraph<ActivityNode, DefaultEdge> g, ActivityNode startVertex)
    {
    	super(g, startVertex);

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
        
		traverseCount = 1;
		
		maxCount = 1;
		
    }

    
 
    /**
     * Perform the depth first search, calculate and store positional information
     * for each node.     
     */
    @Override
    public void traverse()
    {   
    	int levelParent;
    	int breadthCount;
    	ActivityNode popedNode;
    	
    	// begin at start vertex
    	setWasVisited(startVertex, true);
    	//displayVertex(startVertex);
    	theStack.push(startVertex);
    	preorderMap.put(startVertex, new Integer(1));

    	while( !theStack.isEmpty() )
    	{
    		levelParent = levelMap.get(theStack.peek()).intValue();
    		    		    		
    		// get an unvisited vertex adjacent to stack top
    		ActivityNode v = getAdjUnvisitedVertex(theStack.peek());

    		if(v == null){
    			popedNode = theStack.pop();
    			
    			if(!(isLeaf(popedNode))){
    				//System.out.println("Not Leaf Node: " + popedNode.toString());
    				traverseCount++;    				
    				}
    			
    			if(popedNode == startVertex){
    				traverseCount++; 
    			}
    			
    			postorderMap.put(popedNode, new Integer(traverseCount));
    			    			
    		} else {
    			setWasVisited(v, true);
    			//displayVertex(v);
    			theStack.push(v);
    			
    			traverseCount++;
    			preorderMap.put(v, new Integer(traverseCount));
    			
    			
    			// calculate level for the visited node
    			currentLevel =  levelParent + 1;   
            	if(currentLevel > maxDepth) {
            		maxDepth = currentLevel;
            	}
    			levelMap.put(v, new Integer(currentLevel));
    			
    			// calculate how many node with the same level have been visited.
    			breadthCount = 0;
        		Iterator<Integer> levelValuesItr = levelMap.values().iterator();        		
        		while (levelValuesItr.hasNext()) { 
        			if(currentLevel == levelValuesItr.next().intValue()){
        				breadthCount++;        				
        			}        			        			
        		}
        		
            	if(breadthCount > maxBreadth) {
            		maxBreadth = breadthCount;
            	}
            	
        		breadthMap.put(v, new Integer(breadthCount - 1));   
        		
         	 }
    	}
    	
    	maxCount = traverseCount;

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

	public Map<ActivityNode, Integer> getPreorderMap() {
		return preorderMap;
	}

	public void setPreorderMap(Map<ActivityNode, Integer> preorderMap) {
		this.preorderMap = preorderMap;
	}

	public Map<ActivityNode, Integer> getPostorderMap() {
		return postorderMap;
	}

	public void setPostorderMap(Map<ActivityNode, Integer> postorderMap) {
		this.postorderMap = postorderMap;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}   
}




