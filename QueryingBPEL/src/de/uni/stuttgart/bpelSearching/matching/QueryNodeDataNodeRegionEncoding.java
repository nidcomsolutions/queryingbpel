/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;

import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.index.PoolItem3;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public class QueryNodeDataNodeRegionEncoding {
	
	private ActivityNode queryNode;
	
	private NodeRegionEncoding dataNodeRegionEncoding;
	
	/**
	 * @param queryNode
	 * @param dataNodeRegionEncoding
	 */
	public QueryNodeDataNodeRegionEncoding(ActivityNode queryNode,
			NodeRegionEncoding dataNodeRegionEncoding) {
		super();
		this.queryNode = queryNode;
		this.dataNodeRegionEncoding = dataNodeRegionEncoding;
	}
	
	public String toString() {
		String tempStr;
		
		if ((queryNode == null) || (dataNodeRegionEncoding == null)) {
			tempStr = (" Null" );
		} else {
			tempStr = (queryNode.getActivityID() + " | " + dataNodeRegionEncoding.getActivityID());		
		}		
		return tempStr;
	}

	public ActivityNode getQueryNode() {
		return queryNode;
	}

	public void setQueryNode(ActivityNode queryNode) {
		this.queryNode = queryNode;
	}

	public NodeRegionEncoding getDataNodeRegionEncoding() {
		return dataNodeRegionEncoding;
	}

	public void setDataNodeRegionEncoding(NodeRegionEncoding dataNodeRegionEncoding) {
		this.dataNodeRegionEncoding = dataNodeRegionEncoding;
	}

}
