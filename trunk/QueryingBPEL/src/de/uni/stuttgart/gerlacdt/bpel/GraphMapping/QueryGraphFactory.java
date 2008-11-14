/**
 * 
 */
package de.uni.stuttgart.gerlacdt.bpel.GraphMapping;

import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public abstract class QueryGraphFactory extends GraphFactory {
	protected QueryGraph queryGraph;

	/**
	 * @param queryGraph
	 */
	public QueryGraphFactory() {
		super();
	}
	
	/**
	 * Starts the building of the query graph for the given process.
	 * 
	 * @param process
	 */
	public QueryGraph createQueryGraph(Process process) {
		//this.queryGraph.setQueryGraph(createGraphFromProcess(process));
		DirectedGraph<ActivityNode, DefaultEdge> qGraph = 
			createGraphFromProcess(process);
		// Set start activity of the process.
		Set<ActivityNode> nodes = queryGraph.getQueryGraph().vertexSet();
		for (ActivityNode node : nodes) {
			if(node.getActivityID().compareTo(startActivityID) == 0) {
				this.setQueryGraph(new QueryGraph(qGraph, node));
				break;
			}			
		}	
		return this.queryGraph;
	}
	
	public QueryGraph getQueryGraph() {
		return queryGraph;
	}

	public void setQueryGraph(QueryGraph queryGraph) {
		this.queryGraph = queryGraph;
	}
	
	
}
