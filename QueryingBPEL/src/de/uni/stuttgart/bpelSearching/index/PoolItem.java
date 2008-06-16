/**
 * 
 */
package de.uni.stuttgart.bpelSearching.index;

import java.util.ArrayList;
import java.util.List;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * 
 * The PoolItem class represents an element in the partial solution pool 
 * of a query node.
 * 
 * @author luwei
 *
 */
public class PoolItem {

	private ActivityNode querynode;
	private NodeRegionEncoding processnode;
	private List<PoolItem> parents;

	
	/**
	 * @param querynode
	 * @param processnode
	 */
	public PoolItem(ActivityNode querynode, NodeRegionEncoding processnode) {
		super();
		this.querynode = querynode;
		this.processnode = processnode;
		this.parents = new ArrayList<PoolItem>();
	}

	/**
	 * @param querynode
	 * @param processnode
	 * @param parents
	 */
	public PoolItem(ActivityNode querynode, NodeRegionEncoding processnode,
			List<PoolItem> parents) {
		super();
		this.querynode = querynode;
		this.processnode = processnode;
		this.parents = parents;
	}

	public String toString() {
		String tempStr = "";
		
		if ((parents == null) || (parents.isEmpty())) {
			tempStr += (processnode.getActivityID() + " - Null" );
		} else {
			for (PoolItem parent : parents) {
				tempStr += (processnode.getActivityID() + " - " + parent.getProcessnode().getActivityID() + " || ");
			}		
		}		
		return tempStr;
	}
	
	public void addParent(PoolItem parent) {
		this.parents.add(parent);	
	}

	public ActivityNode getQuerynode() {
		return querynode;
	}

	public void setQuerynode(ActivityNode querynode) {
		this.querynode = querynode;
	}

	public NodeRegionEncoding getProcessnode() {
		return processnode;
	}

	public void setProcessnode(NodeRegionEncoding processnode) {
		this.processnode = processnode;
	}

	public List<PoolItem> getParents() {
		return parents;
	}

	public void setParents(List<PoolItem> parents) {
		this.parents = parents;
	}

}
