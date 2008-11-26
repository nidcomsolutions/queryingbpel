package de.uni.stuttgart.bpelSearching.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityNode;


public class PrintClass {

	/*
	public static String printMarginLatticeString(
			DirectedGraph<LatticeNode, DefaultEdge> latticeGraph,
			boolean printTargets) {

		Set<LatticeNode> latticeNodes = latticeGraph.vertexSet();
		String resultString = "";
		resultString += "Amount of latticeNode in lattice: "
				+ latticeNodes.size() + "\n";
		for (LatticeNode node : latticeNodes) {

			resultString += printLatticeNodeString(latticeGraph, node,
					printTargets);
		}
		return resultString;
	}
	*/
	
	/**
	 * Prints the generated graphIndex.
	 * 
	 * @param index
	 *            the index to be printed
	 */
/*
	public static String printGraphIndexString(ActivityTypeGraphIndex index) {

		String resultString = "";
		List<EdgePairIndex> indexList = index.getGraphIndexEdgePairs();
		for (EdgePairIndex edgePair : indexList) {
			resultString += edgePair.toString() + " || ";
		}
		resultString += "\n";
		
		return resultString;
	}
*/
	/**
	 * Prints a latticeNode of the given LatticeGraph with their outDegree,
	 * marginLevel, frequency, latticeNodeId etc..
	 * 
	 * @param latticeGraph
	 *            the latticeGraph which contains the node.
	 * @param node
	 *            the latticeNode which should be printed
	 */
/*
	public static String printLatticeNodeString(
			DirectedGraph<LatticeNode, DefaultEdge> latticeGraph,
			LatticeNode node, boolean printTargets) {

		String resultString = "";
		// print activtyIndices
		if (node.getGraphIndex() != null) {
			resultString += printGraphIndexString(node.getGraphIndex());
		}
		resultString += "outDegree: " + latticeGraph.outDegreeOf(node) + "\n";
		resultString += "MarginLevel: " + node.getMarginLevel() + "\n";
		resultString += "Frequency: " + node.getFrequency() + "\n";
		resultString += "isFrequent: " + node.isFrequent() + "\n";
		resultString += "latticeNodeId: " + node.getLatticeNodeId() + "\n";
		if (node.getFirstAddedProcessGraph() != null) {
			resultString += printGraphString(node.getFirstAddedProcessGraph()
					.getProcessGraph());
		} else {
			resultString += "firstAddedGraph is null, wegen nullMarginLatticeNode"
					+ "\n";
		}

		Map<String, List<ProcessGraph>> graphMap = node
				.getContainedGraphsMap();

		resultString += "graphMap size: " + graphMap.size() + "\n";

		for (List<ProcessGraph> tempList : graphMap.values()) {
			resultString += "list.size(): " + tempList.size() + "\n";
		}

		// prints optional the targets of the given latticeNode

		if (printTargets) {
			Set<DefaultEdge> edges = latticeGraph.outgoingEdgesOf(node);
			resultString += "--------------Begin Targets------------------------------- "
					+ "\n";
			for (DefaultEdge edge : edges) {
				LatticeNode targetNode = latticeGraph.getEdgeTarget(edge);
				if (targetNode.getFirstAddedProcessGraph() != null) {
					resultString += printGraphString(targetNode
							.getFirstAddedProcessGraph().getProcessGraph());
					resultString += "-----------next Target----------------------------------"
							+ "\n";
				} else {
					resultString += "nullMarginNode" + "\n";
				}
			}
		}

		resultString += "\n";
		resultString += "End LatticeNode#############################End LatticeNode"
				+ "\n";

		return resultString;
	}
*/
	/**
	 * Print all vertices (their activityIDs) of the given ProcessGraph with
	 * targets.
	 */
	public static String printGraphString(
			DirectedGraph<ActivityNode, DefaultEdge> graph) {

		String resultString = "";
		Set<ActivityNode> vertexSet = graph.vertexSet();

		for (ActivityNode node : vertexSet) {
			Set<DefaultEdge> edges = graph.outgoingEdgesOf(node);
			resultString += node.getActivityID() + " targets: ";
			for (DefaultEdge edge : edges) {
				ActivityNode targetNode = graph.getEdgeTarget(edge);
				resultString += targetNode.getActivityID() + " ";
			}
			resultString += "\n";
		}

		return resultString;
	}

	public static String printProcessFlowGraphString(
			ProcessGraph processFlowGraph) {

		String resultString = "";
		resultString += "################New Process#######################"
				+ "\n";
		resultString += "ProcessName: " + processFlowGraph.getProcessName()
				+ "\n";
		Set<ActivityNode> vertexSet = processFlowGraph.getGraph()
				.vertexSet();
		for (ActivityNode vertex : vertexSet) {
			Set<DefaultEdge> edgeSet = processFlowGraph.getGraph()
					.outgoingEdgesOf(vertex);

			// print sourceVertex
			if (vertex instanceof StructuredActivityNode) {
				StructuredActivityNode stucNode = (StructuredActivityNode) vertex;
				if (stucNode.isStartNode()) {
					resultString += "VertexSource: " + vertex.getActivityName()
							+ "Start  " + " Targets: ";
				} else {
					resultString += "VertexSource: " + vertex.getActivityName()
							+ "End    " + " Targets: ";
				}
			} else {
				resultString += "VertexSource: " + vertex.getActivityName()
						+ "     " + " Targets: ";
			}

			// print targets of source vertex
			for (DefaultEdge edge : edgeSet) {
				ActivityNode targetNode = processFlowGraph.getGraph()
						.getEdgeTarget(edge);
				if (targetNode instanceof StructuredActivityNode) {
					StructuredActivityNode stucNode = (StructuredActivityNode) targetNode;
					if (stucNode.isStartNode()) {
						resultString += targetNode.getActivityName() + "Start ";
					} else {
						resultString += targetNode.getActivityName() + "End ";
					}
				} else {
					resultString += targetNode.getActivityName() + " ";
				}
			}
			resultString += "\n";

		}

		return resultString;
	}

	public static void writeStringInFile(String compareString, String path) {

		try {
			PrintWriter out = new PrintWriter(new FileWriter(path));
			out.write(compareString);
			out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getStringFromFile(File file) {

		String compareString = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));

			String tempString = "";
			while ((tempString = in.readLine()) != null) {
				compareString += tempString + "\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return compareString;
	}
}
