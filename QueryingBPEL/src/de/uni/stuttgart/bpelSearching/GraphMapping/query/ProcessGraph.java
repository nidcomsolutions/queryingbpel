package de.uni.stuttgart.bpelSearching.GraphMapping.graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;

/**
 * The ProcessGraph class represents a graph view on a BPEL process. It
 * contains the graph representation of the BPEL process and its associated
 * data(processName, processNamespace, processID).
 * 
 * @author Wei Lu
 * 
 */
public class ProcessGraph extends BasisGraph {

	static Logger logger = Logger.getLogger(ProcessGraph.class);

	private String processName;
	private String processNamespace;
	private String processID;
	
	private int maxEnd;
	
	public Map<String, NodeRegionEncoding> nodesRegionEncoding;
	
	public HashMap<String, Predecessors2> predecessors2;
	
	private ActivityNode[] processNodesArray;
	
	private int processNodesSize = 0;
	
	private boolean[][] transClosure;

	/**
	 * Initializes a ProcessGraph with the processName, processNamespace and
	 * the processID.
	 * 
	 * @param processName
	 *            A processName
	 * @param processNamespace
	 *            A processNamespace
	 * @param processID
	 *            A processID
	 */

	public ProcessGraph(String processName, String processNamespace, String processID) { 
		this.processName = processName;
		this.processNamespace = processNamespace;
		this.processID = processID;
	}

	/**
	 * Create an instance of a ProcessGraph with the processName,
	 * processNamespace, processID and the given graph.
	 * 
	 * @param processName
	 * @param processNamespace
	 * @param processID
	 * @param graph
	 */
	public ProcessGraph(String processName, String processNamespace,
			String processID,
			DirectedGraph<ActivityNode, DefaultEdge> processGraph) {
		this.processName = processName;
		this.processNamespace = processNamespace;
		this.processID = processID;
		this.graph = processGraph;		
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
		
		Set<ActivityNode> vSet = graph.vertexSet();
		
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
		Set<ActivityNode> vSet = graph.vertexSet();
		for (ActivityNode v : vSet) {
			if (v.getActivityID().compareTo(id) == 0)
				return v;			
		}		
		return null;
	}
	
    /**
     * Returns the index of the activity node in the array of nodes.
     * 
     * @param node the activity node
     * 
     * @return the index of the activity node in the array of nodes, if the node 
     * exists, -1, otherwise.
     * 
     */
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
	
    /**
     * Computes the transitive closure for the process graph with 
     * Floyd–Warshall algorithm.
     * 
     */
	public void computeTransitiveClosure() {
		int i, j, k;
		this.processNodesSize = graph.vertexSet().size();	
		// Not Sure
		this.processNodesArray = (ActivityNode[])(graph.vertexSet().
			toArray(new ActivityNode[processNodesSize]));	
		transClosure = new boolean[processNodesSize][processNodesSize];
		for (i = 0; i < processNodesSize; i++ ) {
			for (j = 0; j < processNodesSize; j++ ) {
				if (graph.containsEdge(processNodesArray[i], processNodesArray[j])) {
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
	
    /**
     * Returns a boolean value which indicates whether the given end node is 
     * reachable from the start node. 
     * 
     * @param startNode the start node
     * @param endNode the end node
     * 
     * @return true, if the given end node is reachable from the start node, 
     * false, otherwise.
     * 
     */
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
	
    /**
     * Returns a boolean value which indicates whether the end node with the given 
     * index is reachable from the start node with the given index. 
     * 
     * @param x the index of the start node
     * @param y the index of the end node
     * 
     * @return true, if the given end node with the given index is reachable from 
     * the start node with the given index, false, otherwise.
     * 
     */
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
	
	public int getMaxEnd() {
		return maxEnd;
	}

	public void setMaxEnd(int maxEnd) {
		this.maxEnd = maxEnd;
	}
	
	public NodeRegionEncoding getNodeRegionEncoding(String nodeID) {
		return nodesRegionEncoding.get(nodeID);
	}
	
	public Predecessors2 getPredecessors2(String nodeID) {
		return predecessors2.get(nodeID);
	}
	

}
