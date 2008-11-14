package de.uni.stuttgart.bpelSearching.util;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.TopologicalOrderIterator;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;


/**
 * Provides an utility class to analyze characteristics of a given graph. 
 *
 * @author Wei Lu
 */

public class GraphAnalyse {
	
	static Logger logger = Logger.getLogger(GraphAnalyse.class);
	private final DirectedGraph<ActivityNode, DefaultEdge> digraph;
    private ActivityNode startVertex;
    private boolean hasRoot;
     
    /**
     * Creates a analyze class for the given graph and start vertex. If the specified start vertex is <code>
     * null</code>, we choose an arbitrary graph vertex as start vertex.
     *
     * @param g the graph to be iterated.
     * @param startVertex the vertex iteration to be started.
     *
     * @throws IllegalArgumentException if <code>g==null</code> or does not
     * contain <code>startVertex</code>
     */
    public GraphAnalyse(DirectedGraph<ActivityNode, DefaultEdge> g, ActivityNode startVertex)
    {
    	Iterator<ActivityNode> vertexIterator;
    	if (g == null) {
    		throw new IllegalArgumentException("graph must not be null");
    	}      
        digraph = g;
           
        if ((startVertex != null) && g.containsVertex(startVertex)
        		&& isConnected(startVertex)) {
            hasRoot = true;
            this.startVertex = startVertex;
         } else {
        	 // pick a start vertex
        	 if (chooseRoot()) {
        		 hasRoot = true;
              }else{            	  
            	  hasRoot = false;
                  vertexIterator = g.vertexSet().iterator();
            	  // pick a start vertex if graph not empty
                  if (vertexIterator.hasNext()) {
                	  this.startVertex = vertexIterator.next();
                  } else {
                	  throw new IllegalArgumentException("graph must contain the start vertex," +
                	  	" and every node is reachable from the start vertex");
                 }
             }
        }
    }
  
    /**
     * Determines whether a graph is acyclic.
     *
     * @return <tt>true</tt> if graph is acyclic.
     */    
   public boolean  checkAcyclic(){
	   CycleDetector<ActivityNode, DefaultEdge> cycleD = new CycleDetector<ActivityNode, DefaultEdge>(digraph);
	   return (!(cycleD.detectCycles()));	   
   }

   
   /**
    * Determines whether a graph is connected, which means every node is reachable from the given start node.
    *
    * @param start the start vertex.
    *
    * @return <tt>true</tt> if graph is connected.
    */  
   public boolean isConnected(ActivityNode start){
	   DepthFirstTraverse dft = new DepthFirstTraverse(digraph, start);
	   dft.traverse();
	   return dft.isConnected();
   }

   
   /**
    * Choose root for the given directed graph.
    *
    * @return <tt>true</tt> if a vertex as root is selected <tt>false</tt> if 
    * no such vertex exist.
    */   
   public boolean chooseRoot(){   
	   Iterator<ActivityNode> iter = new TopologicalOrderIterator
	   		<ActivityNode, DefaultEdge>(digraph);	   
       while (iter.hasNext()) {
    	   ActivityNode nextNode = iter.next();     	   
    	   if(digraph.incomingEdgesOf(nextNode).isEmpty()){   		   
    		   if(isConnected(nextNode)){   			   
    			   this.startVertex = nextNode;
    			   return true;
    		   } else {
        		   this.startVertex = null;
        		   return false;
        	   }
    	   }
       }  
       this.startVertex = null;
       return false;   
   }
   
   
   /**
    * Determines type for a given graph: tree, rooted dag, unrooted dag, other.
    *
    * @return the graph type.
    */    
  public GraphType checkGraphType(){
	  
	   if(hasRoot){
			Set<ActivityNode> vertexSetG = digraph.vertexSet();			
			for (ActivityNode vertexG : vertexSetG) {
				if (digraph.incomingEdgesOf(vertexG).size() > 1){
					return GraphType.ROOTED_DAG;
				}
			}			
			return GraphType.TREE;		   
	   }
	   
	  if(checkAcyclic()){
		  return GraphType.UNROOTED_DAG;
	  } else {
		  return GraphType.OTHER_GRAPH;
	  }   
  }

public ActivityNode getStartVertex() {
	return startVertex;
}

public void setStartVertex(ActivityNode startVertex) {
	this.startVertex = startVertex;
}

public boolean isHasRoot() {
	return hasRoot;
}

public void setHasRoot(boolean hasRoot) {
	this.hasRoot = hasRoot;
}

}
