/**
 * 
 */
package de.uni.stuttgart.bpelSearching.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * A depth-first traverse class for a directed graph. During traverse, it calculates 
 *  and stores additional information about traverse order (pre-order number,
 *  post-order number), node position (level, breadth), surrogate&surplus predecessor 
 *  for each node.
 * 
 * @author luwei
 *
 */

public class DepthFirstTraverseExtensionSSPI extends
		DepthFirstTraverse {
	
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
     * Stores preorder number for each vertices.
     */
    protected Map<ActivityNode, Integer> preorderMap = new HashMap<ActivityNode, Integer>();
    
    /**
     * Stores postorder number for each vertices.
     */
    protected Map<ActivityNode, Integer> postorderMap = new HashMap<ActivityNode, Integer>();
    
    protected int traverseCount;
    
    protected int maxCount;
	
    /**
     * Edge set covered by minimal spanning tree of the given graph.
     */
    protected Set<DefaultEdge> mstEdgeSet;
    
    /**
     * Stores level number for each vertices.
     */
    protected Map<ActivityNode, Set<String>> predecessorsMap = new HashMap<ActivityNode, Set<String>>();

	/**
     * Creates a new depth-first traverse for the specified graph, initialize positional
     * information, predecessor for each node. Traverse will start at the specified start 
     * vertex and will be limited to the connected component that includes that vertex. 
     * If the specified start vertex is <code>null</code>, traverse will start at an 
     * arbitrary vertex.
     * 
	 * @param g the graph to be traversed.
	 * @param startVertex the vertex traverse to be started.
	 */
	public DepthFirstTraverseExtensionSSPI(DirectedGraph<ActivityNode, DefaultEdge> g, ActivityNode startVertex) {
		super(g, startVertex);
		
        Set<ActivityNode> vertexSetG = graph.vertexSet();
		for (ActivityNode vertexG : vertexSetG) {
			levelMap.put(vertexG, new Integer(0));
			breadthMap.put(vertexG, new Integer(0));
			predecessorsMap.put(vertexG, new HashSet<String>());
		}
		
        // initializing position information of node
        currentLevel = 0;
        
		traverseCount = 1;
		
		maxCount = 1;

        mstEdgeSet = new HashSet<DefaultEdge>();
	}
	
	
    /**
     * Perform the depth first search, calculate and store positional information,
     * minimal spanning tree and surrogate&surplus predecessor for each node.     
     *      
     */
    @Override
    public void traverse()
    {   
    	int levelParent;
    	int breadthCount;
    	ActivityNode popedNode, currentVertex, v;
    	Set<DefaultEdge> incomingEdgesV;
    	
    	// begin at start vertex
    	setWasVisited(startVertex, true);
    	//displayVertex(startVertex);
    	theStack.push(startVertex);
    	preorderMap.put(startVertex, new Integer(1));

    	while( !theStack.isEmpty() )
    	{
    		currentVertex = theStack.peek();  		
    		levelParent = levelMap.get(currentVertex).intValue();   		
    		// get an unvisited vertex adjacent to stack top
    		v = getAdjUnvisitedVertex(currentVertex);

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
    			   			
    			// Add the visited edge to the edge set of minimal spanning tree 
    			mstEdgeSet.add(graph.getEdge(currentVertex, v));
    			
    			// Store surrogate&surplus predecessors for the node
    			incomingEdgesV = graph.incomingEdgesOf(v);
    			if (incomingEdgesV.size() > 1) {
    				for(DefaultEdge incomingEdge : incomingEdgesV) {
    					//if (!graph.getEdgeSource(incomingEdge).equals(currentVertex)) {
    					predecessorsMap.get(v).add(graph.getEdgeSource(incomingEdge).getActivityID());
    					//} 
    				}
    				predecessorsMap.get(v).remove(currentVertex.getActivityID());
    			} 
    			
    			if (!predecessorsMap.get(currentVertex).isEmpty()) {
    				predecessorsMap.get(v).add(currentVertex.getActivityID());
    			}

    			// *** for debug ***
//    			Set<String> pres = predecessorsMap.get(v);
//    			pres.size();
    			
    			traverseCount++;
    			preorderMap.put(v, new Integer(traverseCount));
    			
    			
    			// calculate level for the visited node
    			currentLevel =  levelParent + 1;   
    			levelMap.put(v, new Integer(currentLevel));
    			
    			// calculate how many node with the same level have been visited.
    			breadthCount = 0;
        		Iterator<Integer> levelValuesItr = levelMap.values().iterator();        		
        		while (levelValuesItr.hasNext()) { 
        			if(currentLevel == levelValuesItr.next().intValue()){
        				breadthCount++;        				
        			}        			        			
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
	
	public Set<DefaultEdge> getMstEdgeSet() {
		return mstEdgeSet;
	}


	public void setMstEdgeSet(Set<DefaultEdge> mstEdgeSet) {
		this.mstEdgeSet = mstEdgeSet;
	}


	public Map<ActivityNode, Set<String>> getPredecessorsMap() {
		return predecessorsMap;
	}


	public void setPredecessorsMap(
			Map<ActivityNode, Set<String>> predecessorsMap) {
		this.predecessorsMap = predecessorsMap;
	}

}
