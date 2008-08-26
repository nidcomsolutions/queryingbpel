/**
 * 
 */
package de.uni.stuttgart.bpelSearching.query;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public class QueryParentChildNodesPair {
	
	private ActivityNode parentNode;
	private ActivityNode childNode;

	/**
	 * @param parentNode
	 * @param childNode
	 */
	public QueryParentChildNodesPair(ActivityNode parentNode,
			ActivityNode childNode) {
		super();
		this.parentNode = parentNode;
		this.childNode = childNode;
	}

	public ActivityNode getParentNode() {
		return parentNode;
	}

	public void setParentNode(ActivityNode parentNode) {
		this.parentNode = parentNode;
	}

	public ActivityNode getChildNode() {
		return childNode;
	}

	public void setChildNode(ActivityNode childNode) {
		this.childNode = childNode;
	}

}
