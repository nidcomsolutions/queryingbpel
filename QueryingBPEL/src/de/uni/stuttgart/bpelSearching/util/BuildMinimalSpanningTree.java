/**
 * 
 */
package de.uni.stuttgart.bpelSearching.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public class BuildMinimalSpanningTree extends AbstractGraphTraverse {
	static Logger logger = Logger.getLogger(BuildMinimalSpanningTree.class);
	
	/**
     * Stack, which supports depth first traverse.
     */	
    protected Stack<ActivityNode> theStack;
    
	/**
     * The minimal spanning tree of the given graph.
     */	
	protected DirectedGraph<ActivityNode, DefaultEdge> minimalSpanningTree 
		= new DefaultDirectedGraph<ActivityNode, DefaultEdge>(DefaultEdge.class);
	
    /**
     * Stores level number for each vertices.
     */
    protected Map<ActivityNode, Integer> levelMap = new HashMap<ActivityNode, Integer>();
    
	/**
	 * @param g
	 * @param startVertex
	 */
	public BuildMinimalSpanningTree(DirectedGraph<ActivityNode, DefaultEdge> g,
			ActivityNode startVertex) {
		super(g, startVertex);
		theStack = new Stack<ActivityNode>();
	}

	/* (non-Javadoc)
	 * @see de.uni.stuttgart.bpelSearching.util.AbstractGraphTraverse#traverse()
	 */
	@Override
	public void traverse() {
		ActivityNode currentVertex;
		int levelParent;
		
    	// begin at start vertex
    	setWasVisited(startVertex, true);
    	//displayVertex(startVertex);
    	theStack.push(startVertex);
    	minimalSpanningTree.addVertex(startVertex);
    	levelMap.put(startVertex, new Integer(0));
    	
//    	logger.warn("Output edge set for minimal spanning tree");
    	while( !theStack.isEmpty() )
    	{
    		// *** minimum spanning tree
    		currentVertex = theStack.peek(); 
    		
    		levelParent = levelMap.get(currentVertex).intValue();
    		
    		// get an unvisited vertex adjacent to stack top
    		ActivityNode v = getAdjUnvisitedVertex(currentVertex);
    		
    		if(v == null){
    			theStack.pop();
    		} else {
    			setWasVisited(v, true);
    			//displayVertex(v);
    			theStack.push(v); 
    			levelMap.put(v, new Integer(levelParent + 1));
    			// *** minimum spanning tree
    			minimalSpanningTree.addVertex(v);
    			minimalSpanningTree.addEdge(currentVertex, v);
//    			logger.warn(currentVertex.toString() + " - " + v.toString());
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

	public DirectedGraph<ActivityNode, DefaultEdge> getMinimalSpanningTree() {
		return minimalSpanningTree;
	}

	public void setMinimalSpanningTree(
			DirectedGraph<ActivityNode, DefaultEdge> minimalSpanningTree) {
		this.minimalSpanningTree = minimalSpanningTree;
	}
	
	public Map<ActivityNode, Integer> getLevelMap() {
		return levelMap;
	}

	public void setLevelMap(Map<ActivityNode, Integer> levelMap) {
		this.levelMap = levelMap;
	}
}
