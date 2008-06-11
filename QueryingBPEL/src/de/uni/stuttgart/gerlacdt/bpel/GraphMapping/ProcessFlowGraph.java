package de.uni.stuttgart.gerlacdt.bpel.GraphMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.index.PathCount;
import de.uni.stuttgart.bpelSearching.util.GraphType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * The ProcessFlowGraph class represents a graph view on a BPEL process. It
 * contains the flow-graph of the BPEL process and its associated
 * data(processName, processNamespace, processID).
 * 
 * @author Daniel Gerlach
 * 
 */

public class ProcessFlowGraph {

	static Logger logger = Logger.getLogger(ProcessFlowGraph.class);

	private String processName;
	private String processNamespace;
	private String processID;
	private DirectedGraph<ActivityNode, DefaultEdge> processGraph = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
			DefaultEdge.class);

	private ActivityNode startActivity;
	
	private GraphType processGraphType;
	
	private int maxPostOrder;
	
	public Map<String, NodeRegionEncoding> nodesRegionEncoding = new HashMap<String, NodeRegionEncoding>();
	
	public HashMap<String, SortedSet<NodeRegionEncoding>> predecessors = new HashMap<String, SortedSet<NodeRegionEncoding>>();
	
	public HashMap<String, Predecessors2> predecessors2 = new HashMap<String, Predecessors2>();
	
	public Map<String, PathCount> pathCountMap = new HashMap<String, PathCount>();
	
	//private IsomorphismTestStrategy isoTestStrategy;

	/**
	 * Initializes a ProcessFlowGraph with the processName, processNamespace and
	 * the processID.
	 * 
	 * @param processName
	 *            A processName
	 * @param processNamespace
	 *            A processNamespace
	 * @param processID
	 *            A processID
	 */

	public ProcessFlowGraph(String processName, String processNamespace, String processID) { 
		//IsomorphismTestStrategy isoTestStrategy) {
		this.processName = processName;
		this.processNamespace = processNamespace;
		this.processID = processID;
		//this.isoTestStrategy = isoTestStrategy;
	}

	/**
	 * Create an instance of a ProcessFlowGraph with the processName,
	 * processNamespace, processID and the given processGraph.
	 * 
	 * @param processName
	 * @param processNamespace
	 * @param processID
	 * @param processGraph
	 */
	public ProcessFlowGraph(String processName, String processNamespace,
			String processID,
			DirectedGraph<ActivityNode, DefaultEdge> processGraph) {
			//IsomorphismTestStrategy isoTestStrategy) {
		this.processName = processName;
		this.processNamespace = processNamespace;
		this.processID = processID;
		this.processGraph = processGraph;
		//this.isoTestStrategy = isoTestStrategy;		
	}
	
	/**
	 * Create an instance of a ProcessFlowGraph with the processName,
	 * processNamespace, processID and the given processGraph, startActivity, graphType.
	 * 
	 * @param processName
	 * @param processNamespace
	 * @param processID
	 * @param processGraph
	 * @param startActivity
	 * @param graphType
	 */
	public ProcessFlowGraph(String processName, String processNamespace,
			String processID,
			DirectedGraph<ActivityNode, DefaultEdge> processGraph,
			ActivityNode startActivity, GraphType graphType) {
			//IsomorphismTestStrategy isoTestStrategy) {
		this.processName = processName;
		this.processNamespace = processNamespace;
		this.processID = processID;
		this.processGraph = processGraph;
		this.startActivity = startActivity;
		this.processGraphType = graphType;
		//this.isoTestStrategy = isoTestStrategy;
	}
	
	
    /**
     * Returns the vertex name with the given vertex id.
     * 
     * @param id id of the vertex in question
     * 
     * @return the vertex name or <code> "" </code> if vertex does not exist.
     * 
     */
	
	public String getActivityName(String id) {
		
		Set<ActivityNode> vSet = processGraph.vertexSet();
		
		for (ActivityNode v : vSet) {
			if (v.getActivityID().compareTo(id) == 0)
				return v.getActivityName();			
		}
		
		return "";
	}
	
	
    /**
     * Returns the vertex with the given vertex id.
     * 
     * @param id id of the vertex in question
     * 
     * @return the vertex or <code> null</code> if vertex does not exist.
     * 
     */
	
	public ActivityNode getActivity(String id) {
		
		Set<ActivityNode> vSet = processGraph.vertexSet();
		
		for (ActivityNode v : vSet) {
			if (v.getActivityID().compareTo(id) == 0)
				return v;			
		}
		
		return null;
	}
	
	

	/**
	 * Returns true if this and the given ProcessFlowGraph are isomorphic.
	 * 
	 * 
	 * @param otherGraph
	 *            the referenced ProcessFlowGraph with which to compare.
	 * @param filterGraphIndexThis
	 *            an ActivityTypeGraphIndex of this ProcessFlowGraph.
	 * @return
	 */

	/*
	public boolean isIsomorphTo(ProcessFlowGraph otherGraph,
			ActivityTypeGraphIndex filterGraphIndexThis) {

		return isoTestStrategy.isIsomorphicTo(otherGraph, this,
				filterGraphIndexThis);
	}
	*/

	/**
	 * Indicates whether two subgraphs of the same ProcessFlowGraph are equal.
	 * Warning!! Method only considers graph-nodes, not edges.
	 * 
	 * @param otherProcessFlowSubgraph
	 *            the reference ProcessFlowGraph with which to compare.
	 * @return true is the two subgraphs are equal
	 */

	public boolean compareSubgraphsOfSameGraph(
			ProcessFlowGraph otherProcessFlowSubgraph) {

		// get all activityIds from all contained nodes in both subgraphs
		Set<ActivityNode> vertexSetThis = processGraph.vertexSet();
		Set<ActivityNode> vertexSetOther = otherProcessFlowSubgraph
				.getProcessGraph().vertexSet();

		// created an array with all activityIds
		String[] thisActivityIds = new String[vertexSetThis.size()];
		String[] otherActivityIds = new String[vertexSetOther.size()];

		int index = 0;
		for (ActivityNode nodeThis : vertexSetThis) {
			thisActivityIds[index] = nodeThis.getActivityID();
			index++;
		}
		index = 0;
		for (ActivityNode nodeOther : vertexSetOther) {
			otherActivityIds[index] = nodeOther.getActivityID();
			index++;
		}

		// sort both array and use them as a unique key for the subgraphs
		Arrays.sort(thisActivityIds);
		Arrays.sort(otherActivityIds);

		// return true is both arrays are equal
		boolean result = Arrays.equals(thisActivityIds, otherActivityIds);

		return result;
	}

	/**
	 * Returns a list of all possible subgraphs, when you remove an edge from
	 * the given graph. The returned subgraphs are connected. Returns an empty
	 * list if the processGraph has less only 1 vertex.
	 * 
	 * @param graph
	 *            which should be decomposed in subgraphs.
	 * @return a list of all subgraphs which all have decrease their edgeSet by
	 *         exactly one .
	 */
	/*
	public List<ProcessFlowGraph> decomposeProcessGraph() {

		List<ProcessFlowGraph> subgraphResultList = new ArrayList<ProcessFlowGraph>();

		DirectedGraph<ActivityNode, DefaultEdge> graph = this.processGraph;

		if (graph.vertexSet().size() < 2) {
			return subgraphResultList;
		}

		Set<DefaultEdge> allEdges = graph.edgeSet();
		for (DefaultEdge edge : allEdges) {

			DirectedSubgraph<ActivityNode, DefaultEdge> decomposedGraph = new DirectedSubgraph<ActivityNode, DefaultEdge>(
					graph, null, null);

			ActivityNode sourceNode = decomposedGraph.getEdgeSource(edge);
			ActivityNode targetNode = decomposedGraph.getEdgeTarget(edge);

			// if there are only 2 vertices left and one edge between them, then
			// two subgraphs emerge from removing one edge from a graph. These
			// subgraphs are added to the subgraphResultList. These subgraphs
			// actually consist only of one node.
			if (decomposedGraph.vertexSet().size() == 2
					&& decomposedGraph.edgeSet().size() == 1) {

				// bring the decomposedGraph to completion. Now it has on one
				// node, the targetNode. Add it to the subgraphResultList.
				decomposedGraph.removeEdge(edge);
				decomposedGraph.removeVertex(sourceNode);
				ProcessFlowGraph processSubgraph = new ProcessFlowGraph(
						this.processName, this.processNamespace,
						this.processID, decomposedGraph, this.isoTestStrategy);
				subgraphResultList.add(processSubgraph);

				// add another subgraph with one a vertex, the sourceNode.
				DirectedSubgraph<ActivityNode, DefaultEdge> decomposedGraph2 = new DirectedSubgraph<ActivityNode, DefaultEdge>(
						graph, null, null);
				decomposedGraph2.removeEdge(edge);
				decomposedGraph2.removeVertex(targetNode);
				ProcessFlowGraph processSubgraph2 = new ProcessFlowGraph(
						this.processName, this.processNamespace,
						this.processID, decomposedGraph2, this.isoTestStrategy);
				subgraphResultList.add(processSubgraph2);

			} else {
				// the graph has more than one edge. By removing one specific
				// edge from a graph, only one subgraph is builded.
				decomposedGraph.removeEdge(edge);
				Set<DefaultEdge> sourceNodeEdges = decomposedGraph
						.edgesOf(sourceNode);
				Set<DefaultEdge> targetNodeEdges = decomposedGraph
						.edgesOf(targetNode);

				// remove nodes if they havn't got any edges left.
				if (sourceNodeEdges.size() == 0) {
					decomposedGraph.removeVertex(sourceNode);
				}

				if (targetNodeEdges.size() == 0) {
					decomposedGraph.removeVertex(targetNode);
				}

				// test if subgraph is connected. If true subgraph is added to
				// subgraphResultList otherwise nothing happens.
				ConnectivityInspector<ActivityNode, DefaultEdge> connectivityInspector = new ConnectivityInspector<ActivityNode, DefaultEdge>(
						decomposedGraph);
				if (connectivityInspector.isGraphConnected()) {
					ProcessFlowGraph processSubgraph = new ProcessFlowGraph(
							this.processName, this.processNamespace,
							this.processID, decomposedGraph, this.isoTestStrategy);
					subgraphResultList.add(processSubgraph);
				}

			}

		}

		return subgraphResultList;
	}
	*/

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessNamespace() {
		return processNamespace;
	}

	public void setProcessNamespace(String processNamespace) {
		this.processNamespace = processNamespace;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

	public DirectedGraph<ActivityNode, DefaultEdge> getProcessGraph() {
		return processGraph;
	}

	public void setProcessGraph(
			DirectedGraph<ActivityNode, DefaultEdge> processGraph) {
		this.processGraph = processGraph;
	}

//	public int getMarginLevel() {
//		return processGraph.edgeSet().size() + 1;
//	}

	public ActivityNode getStartActivity() {
		return startActivity;
	}

	public void setStartActivity(ActivityNode startActivity) {
		this.startActivity = startActivity;
	}

	public GraphType getProcessGraphType() {
		return processGraphType;
	}

	public void setProcessGraphType(GraphType processGraphType) {
		this.processGraphType = processGraphType;
	}
	

	public int getMaxPostOrder() {
		return maxPostOrder;
	}

	public void setMaxPostOrder(int maxPostOrder) {
		this.maxPostOrder = maxPostOrder;
	}
	
	public NodeRegionEncoding getNodeRegionEncoding(String nodeID) {
		return nodesRegionEncoding.get(nodeID);
	}
	
	public SortedSet<NodeRegionEncoding> getPredecessors(String nodeID) {
		return predecessors.get(nodeID);
	}
	
	public Predecessors2 getPredecessors2(String nodeID) {
		return predecessors2.get(nodeID);
	}
	
	public void removePredecessors(String nodeID) {
		predecessors.remove(nodeID);
	}
	
}
