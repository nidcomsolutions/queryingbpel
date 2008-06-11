package de.uni.stuttgart.bpelSearching.matching;

import java.util.Comparator;
import de.uni.stuttgart.bpelSearching.index.*;

/**
 * The NodeRegionEncodingComparator compares two Nodes with the RegionEncoding.
 * 
 * @author Wei Lu
 * 
 */

public class NodeRegionEncodingComparator implements Comparator<NodeRegionEncoding>  {

	@Override
	public int compare(NodeRegionEncoding nodeRegion1, NodeRegionEncoding nodeRegion2) {
		
		int node1PreOrder = nodeRegion1.getPreorderRank();
		int node2PreOrder = nodeRegion2.getPreorderRank();		
				
		return (node1PreOrder - node2PreOrder);
	}

}
