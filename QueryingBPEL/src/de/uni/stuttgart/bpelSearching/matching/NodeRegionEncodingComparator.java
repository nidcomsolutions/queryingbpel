package de.uni.stuttgart.bpelSearching.matching;

import java.util.Comparator;

import de.uni.stuttgart.bpelSearching.datastructure.*;

/**
 * The NodeRegionEncodingComparator compares two Nodes with the region encoding format.
 * 
 * @author Wei Lu
 * 
 */

public class NodeRegionEncodingComparator implements Comparator<NodeRegionEncoding>  {

	@Override
	public int compare(NodeRegionEncoding nodeRegion1, NodeRegionEncoding nodeRegion2) {
		
		int node1PreOrder = nodeRegion1.getStart();
		int node2PreOrder = nodeRegion2.getStart();		
				
		return (node1PreOrder - node2PreOrder);
	}

}
