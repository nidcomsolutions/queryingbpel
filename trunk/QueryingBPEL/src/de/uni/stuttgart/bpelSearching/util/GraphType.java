package de.uni.stuttgart.bpelSearching.util;

/**
 * Provides several constants for graph types.
 *
 * @author Wei Lu
 */

public final class GraphType {
	
	private String gType;
	
    /**
     * Creates a new graph type.
     * @param gt the graph type.
     */
	private GraphType(String gt){
		gType = gt;
	}
	
	public String toString(){
		return gType;
	}

	public static final GraphType 
		TREE = new GraphType("Tree"),
		DAG_CONNECTED = new GraphType("DAG_Connected"),
		DAG_UNCONNECTED = new GraphType("DAG_Unconnected"),
		OTHER_GRAPH =  new GraphType("Other_Graph");
	
	public static final GraphType[] graphtype = {TREE, DAG_CONNECTED, 
		DAG_UNCONNECTED, OTHER_GRAPH};
	
	public static final GraphType number(int ord){
		return graphtype[ord -1];
	}
       
}
