/**
 * 
 */
package de.uni.stuttgart.bpelSearching.datastructure;

import java.util.ArrayList;
import java.util.List;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * PoolItem3 class represents an element in the partial solution pool associated 
 * with a query node. Each pool element consists of three components: query node, 
 * data node (which matches the query node), a list of references to the pool 
 * elements in its children pools.
 * 
 * @author luwei
 *
 */
public class PoolItem3 {

	private ActivityNode querynode;
	private NodeRegionEncoding datanode;
	private List<PoolItem3> children;

	
	/**
	 * Creates a new pool element with the given query node and process node.
	 * 
	 * @param querynode
	 * @param datanode
	 */
	public PoolItem3(ActivityNode querynode, NodeRegionEncoding datanode) {
		super();
		this.querynode = querynode;
		this.datanode = datanode;
		this.children = new ArrayList<PoolItem3>();
	}

	/**
	 * Creates a new pool element with the given query node and process node 
	 * and children.
	 * 
	 * @param querynode
	 * @param datanode
	 * @param children
	 */
	public PoolItem3(ActivityNode querynode, NodeRegionEncoding datanode,
			List<PoolItem3> children) {
		super();
		this.querynode = querynode;
		this.datanode = datanode;
		this.children = children;
	}

	public String toString() {
		String tempStr = "";
		
		if ((children == null) || (children.isEmpty())) {
			tempStr += (datanode.getActivityID() + " - Null" );
		} else {
			for (PoolItem3 child : children) {
				tempStr += (datanode.getActivityID() + " - " + child.getDatanode().getActivityID() + " || ");
			}		
		}		
		return tempStr;
	}
	
    /**
     * Adds a reference to the child pool element.
     *
     * @param child an element stored in child pool
     */
	public void addChild(PoolItem3 child) {
		this.children.add(child);	
	}
	
    /**
     * Adds a reference to the child pool element.
     *
     * @param child an element stored in child pool
     * 
     * @return the ith item in the child pool
     * 
     * @throws ArrayIndexOutOfBoundsException if <code>i >= this.children.size()</code> 
     * 
     */
	public PoolItem3 getChild(int i) {
		if (i >= this.children.size()) {
			throw new ArrayIndexOutOfBoundsException(i);		
		} else {
			return this.children.get(i);
		}
	}
	
    /**
     * Adds a reference to the child pool element.
     *
     * @param child an element stored in child pool
     * 
     * @return number of children
     * 
     */
	public int getChildrenSize() {
		if(children == null) {
			return 0;
		} else {
			return children.size();
		}	
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

	public List<PoolItem3> getChildren() {
		return children;
	}

	public void setChildren(List<PoolItem3> children) {
		this.children = children;
	}



}
