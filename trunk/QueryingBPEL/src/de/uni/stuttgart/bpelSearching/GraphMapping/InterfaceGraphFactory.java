package de.uni.stuttgart.bpelSearching.GraphMapping;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;

public interface InterfaceGraphFactory {
	
	/**
	 * Builds the directed graph for the given process
	 * 
	 * @param process
	 * 
	 * @return the directed graph created from the given process
	 * 
	 */
	DirectedGraph<ActivityNode, DefaultEdge> createGraphFromProcess(Process process);
}
