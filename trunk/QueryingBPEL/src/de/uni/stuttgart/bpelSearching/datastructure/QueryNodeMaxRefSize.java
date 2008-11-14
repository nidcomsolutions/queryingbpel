/**
 * 
 */
package de.uni.stuttgart.bpelSearching.datastructure;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public class QueryNodeMaxRefSize {
	private ActivityNode queryNode;
	private int maxRefSize;
	
	/**
	 * @param queryNode
	 * @param maxRefSize
	 */
	public QueryNodeMaxRefSize(ActivityNode queryNode, int maxRefSize) {
		super();
		this.queryNode = queryNode;
		this.maxRefSize = maxRefSize;
	}
	
	public ActivityNode getQueryNode() {
		return queryNode;
	}
	public void setQueryNode(ActivityNode queryNode) {
		this.queryNode = queryNode;
	}
	public int getMaxRefSize() {
		return maxRefSize;
	}
	public void setMaxRefSize(int maxRefSize) {
		this.maxRefSize = maxRefSize;
	}
}
