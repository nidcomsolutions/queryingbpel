package de.uni.stuttgart.gerlacdt.bpel.GraphMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;
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
//	private DirectedGraph<ActivityNode, DefaultEdge> processGraph = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
//			DefaultEdge.class);
	private DirectedGraph<ActivityNode, DefaultEdge> processGraph;
	
	private ActivityNode startActivity;
	
	private GraphType processGraphType;
	
	private int maxEnd;
	
	public Map<String, NodeRegionEncoding> nodesRegionEncoding = new HashMap<String, NodeRegionEncoding>();
	
	public HashMap<String, SortedSet<NodeRegionEncoding>> predecessors = new HashMap
		<String, SortedSet<NodeRegionEncoding>>();
	
	public HashMap<String, Predecessors2> predecessors2 = new HashMap<String, Predecessors2>();
	
	private ActivityNode[] processNodesArray;
	
	private int processNodesSize = 0;
	
	//private TransitiveClosure2 transitiveClosurePGraph;
	
	private boolean[][] transClosure;

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
	
	public int getArrayIndexOfProcessNode(ActivityNode node) {
		if (processNodesArray != null) {
			for (int i = 0; i < processNodesSize; i++) {
				if (processNodesArray[i].equals(node)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public void computeTransitiveClosure() {
		int i, j, k;
		this.processNodesSize = processGraph.vertexSet().size();	
		// Not Sure
		this.processNodesArray = (ActivityNode[])(processGraph.vertexSet().
			toArray(new ActivityNode[processNodesSize]));
		// this.transitiveClosurePGraph = new TransitiveClosure2(processGraph, processNodesArray);		
		transClosure = new boolean[processNodesSize][processNodesSize];
		for (i = 0; i < processNodesSize; i++ ) {
			for (j = 0; j < processNodesSize; j++ ) {
				if (processGraph.containsEdge(processNodesArray[i], processNodesArray[j])) {
					this.transClosure[i][j]= true;
				} else {
					this.transClosure[i][j]= false;
				}		
			}
		}
		
		for (k = 0; k < processNodesSize; k++ ) {
			for (i = 0; i < processNodesSize; i++ ) {
				for (j = 0; j < processNodesSize; j++ ) {
					transClosure[i][j] = (transClosure[i][j] || 
						(transClosure[i][k] && transClosure[k][j]));
				}
			}
		}
		
	}
	
	public boolean isReachable(ActivityNode startNode, ActivityNode endNode) {
		int i, m, n;
		m = -1;
		for (i = 0; i < processNodesSize; i++ ) {
			if (processNodesArray[i].equals(startNode)) {
				m = i;
				break;
			}
		}
		
		n = -1;
		for (i = 0; i < processNodesSize; i++ ) {
			if (processNodesArray[i].equals(endNode)) {
				n = i;
				break;
			}
		}
		
		if ((m > -1) && (n > -1)) {
			return transClosure[m][n];
		} else {
			return false;
		}		
	}
	
	public boolean isReachable(int x, int y) {		
		if (((x >= 0) && (x < processNodesSize)) && 
				((y >= 0) && (y < processNodesSize))) {
			return transClosure[x][y];
		} else {
			return false;
		}		
	}

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
	

	public int getMaxEnd() {
		return maxEnd;
	}

	public void setMaxEnd(int maxEnd) {
		this.maxEnd = maxEnd;
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
