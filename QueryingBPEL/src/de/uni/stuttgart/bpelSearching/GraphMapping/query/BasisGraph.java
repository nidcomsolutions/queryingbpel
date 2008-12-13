/**
 * 
 */
package de.uni.stuttgart.bpelSearching.GraphMapping.graphs;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public class BasisGraph {
	protected DirectedGraph<ActivityNode, DefaultEdge> graph;	
	protected ActivityNode startActivity;
	protected GraphType graphType;
	
	/**
	 * Creates a new graph object.
	 */
	public BasisGraph() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DirectedGraph<ActivityNode, DefaultEdge> getGraph() {
		return graph;
	}

	public void setGraph(DirectedGraph<ActivityNode, DefaultEdge> graph) {
		this.graph = graph;
	}

	public ActivityNode getStartActivity() {
		return startActivity;
	}

	public void setStartActivity(ActivityNode startActivity) {
		this.startActivity = startActivity;
	}

	public GraphType getGraphType() {
		return graphType;
	}

	public void setGraphType(GraphType graphType) {
		this.graphType = graphType;
	}
}
