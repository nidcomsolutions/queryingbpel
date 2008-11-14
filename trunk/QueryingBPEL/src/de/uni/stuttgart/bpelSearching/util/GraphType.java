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
		ROOTED_DAG = new GraphType("Rooted_DAG"),
		UNROOTED_DAG = new GraphType("Unrooted_DAG"),
		OTHER_GRAPH =  new GraphType("Other_Graph");
	
	public static final GraphType[] graphtype = {TREE, ROOTED_DAG, 
		UNROOTED_DAG, OTHER_GRAPH};
	
	public static final GraphType number(int ord){
		return graphtype[ord -1];
	}
       
}
