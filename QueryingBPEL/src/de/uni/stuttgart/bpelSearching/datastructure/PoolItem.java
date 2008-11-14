/**
 * 
 */
package de.uni.stuttgart.bpelSearching.datastructure;

import java.util.ArrayList;
import java.util.List;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * 
 * PoolItem class represents an element in the partial solution pool associated 
 * with a query node. Each pool element consists of three components: query node, 
 * data node (which matches the query node), a list of references to the pool 
 * elements in its parent pool.
 * 
 * @author luwei
 *
 */
public class PoolItem {

	private ActivityNode querynode;
	private NodeRegionEncoding datanode;
	private List<PoolItem> parents;

	
	/**
	 * Create a new pool element with the given query node and process node. 
	 * 
	 * @param querynode
	 * @param datanode
	 */
	public PoolItem(ActivityNode querynode, NodeRegionEncoding datanode) {
		super();
		this.querynode = querynode;
		this.datanode = datanode;
		this.parents = new ArrayList<PoolItem>();
	}

	/**
	 * Create a new pool element with the given query node and process node 
	 * and parents.
	 * 
	 * @param querynode
	 * @param datanode
	 * @param parents
	 */
	public PoolItem(ActivityNode querynode, NodeRegionEncoding datanode,
			List<PoolItem> parents) {
		super();
		this.querynode = querynode;
		this.datanode = datanode;
		this.parents = parents;
	}

	public String toString() {
		String tempStr = "";
		
		if ((parents == null) || (parents.isEmpty())) {
			tempStr += (datanode.getActivityID() + " - Null" );
		} else {
			for (PoolItem parent : parents) {
				tempStr += (datanode.getActivityID() + " - " + parent.getDatanode().getActivityID() + " || ");
			}		
		}		
		return tempStr;
	}
	
    /**
     * Add a reference to the parent pool element.
     *
     * @param child an element stored in parent pool
     */
	public void addParent(PoolItem parent) {
		this.parents.add(parent);	
	}

	public ActivityNode getQuerynode() {
		return querynode;
	}

	public void setQuerynode(ActivityNode querynode) {
		this.querynode = querynode;
	}

	public NodeRegionEncoding getDatanode() {
		return datanode;
	}

	public void setDatanode(NodeRegionEncoding datanode) {
		this.datanode = datanode;
	}

	public List<PoolItem> getParents() {
		return parents;
	}

	public void setParents(List<PoolItem> parents) {
		this.parents = parents;
	}

}
