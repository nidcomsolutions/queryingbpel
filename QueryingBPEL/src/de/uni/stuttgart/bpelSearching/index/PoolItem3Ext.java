/**
 * 
 */
package de.uni.stuttgart.bpelSearching.index;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * PoolItem3Ext class represents an element in the partial solution pool associated 
 * with a query node. Each pool element consists of three components: query node, 
 * data node (which matches the query node), a map which matches a query child node 
 * and references to the child pool elements.
 * 
 * @author luwei
 *
 */
public class PoolItem3Ext {
	
	static Logger logger = Logger.getLogger(PoolItem3Ext.class);
	
	private ActivityNode querynode;
	private NodeRegionEncoding datanode;
	private Map<ActivityNode, PoolItem3ChildReference> childrenReferencesMap;	
	
	/**
	 * Creates a new pool element with the given query node and process node 
	 * and childrenReferencesMap.
	 *  
	 * @param querynode
	 * @param datanode
	 * @param childrenReferencesMap
	 */
	public PoolItem3Ext(ActivityNode querynode, NodeRegionEncoding datanode,
			Map<ActivityNode, PoolItem3ChildReference> childrenReferencesMap) {
		super();
		this.querynode = querynode;
		this.datanode = datanode;
		this.childrenReferencesMap = childrenReferencesMap;
	}

	/**
	 * Creates a new pool element with the given query node and process node.
	 * 
	 * @param querynode
	 * @param datanode
	 */
	public PoolItem3Ext(ActivityNode querynode, NodeRegionEncoding datanode) {
		super();
		this.querynode = querynode;
		this.datanode = datanode;
		childrenReferencesMap = new HashMap<ActivityNode, PoolItem3ChildReference>();
	}
	
	
	public String toString() {
		String tempStr = "";
		Set<PoolItem3Ext> children = getChildren();
		if (children.isEmpty()) {
			tempStr += (datanode.getActivityID() + " - Null" );
		} else {
			for (PoolItem3Ext child : children) {
				tempStr += (datanode.getActivityID() + " - " + child.getDatanode().getActivityID() + " || ");
			}		
		}		
		return tempStr;
	}
	
    /**
     * Adds the specified child pool element to its child references.
     * 
     * @param childPI child pool element to be added to its child references.
     * 
     * @return <tt>true</tt> if the specified child pool element has been successfully added in 
     * the children references map; <tt>false</tt> otherwise.
     */
	public boolean addChild(PoolItem3Ext childPI) {
		PoolItem3ChildReference cPIRef;
		
		if (childPI != null) {
			ActivityNode cNode = childPI.getQuerynode();
			if ((cPIRef = childrenReferencesMap.get(cNode)) != null) {
				cPIRef.addChildReference(childPI);		
			} else {
				childrenReferencesMap.put(cNode, new PoolItem3ChildReference(childPI));
			}
			return true;
		} else {
			return false;
		}
	}
	
    /**
     * Returns all referenced elements in its children pools.
     * 
     * @return all referenced elements in its children pools.
     */
	public Set<PoolItem3Ext> getChildren() {
		Set<PoolItem3Ext> result = new HashSet<PoolItem3Ext>();
		if (childrenReferencesMap != null) {
			Iterator<PoolItem3ChildReference> childrenReferencesIter = childrenReferencesMap.
			values().iterator();		
			while (childrenReferencesIter.hasNext()) {
				PoolItem3ChildReference cRef = childrenReferencesIter.next();
				result.addAll(cRef.getChildrenReferences());
			}
		}
		return result;
	}
	
    /**
     * Gets the next to be processed child pool element associated with <code>childQ</code>.
     * 
     * @param childQ a child node of <code>querynode</code>
     * 
     * @return the next processing child pool element associated with <code>childQ</code>.
     */
	public PoolItem3Ext getNextChild(ActivityNode childQ) {
		if (childrenReferencesMap.get(childQ) == null) {
			return null;
		} else {
			return childrenReferencesMap.get(childQ).getNext();
		}
	}
	
    /**
     * Determines whether this pool element has unprocessed child pool element associated 
     * with <code>childQ</code>.
     * 
     * @param childQ a child node of <code>querynode</code>
     * 
     * @return <tt>true</tt> if it has at least one unprocessed child pool element associated 
     * with <code>childQ</code>; <tt>false</tt> otherwise.
     */
	public boolean hasNextChild(ActivityNode childQ) {
		PoolItem3ChildReference childQRef = childrenReferencesMap.get(childQ);
		if (childQRef == null) {
			return false;
		} else {
			return childQRef.hasNext();
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

	public Map<ActivityNode, PoolItem3ChildReference> getChildrenReferencesMap() {
		return childrenReferencesMap;
	}

	public void setChildrenReferencesMap(
			Map<ActivityNode, PoolItem3ChildReference> childrenReferencesMap) {
		this.childrenReferencesMap = childrenReferencesMap;
	}
	
	//~ Inner Class ----------------------------------------------------------
    /**
     * A data structure used to store references to child pool elements for a 
     * specified child node.
     */
	private class PoolItem3ChildReference {
		private int currentPosition;
		private List<PoolItem3Ext> childrenReferences;
		
		/**
		 * Creates a new references object of a child node.
		 * 
		 */
		public PoolItem3ChildReference() {
			super();
			this.currentPosition = 0;
			this.childrenReferences = new ArrayList<PoolItem3Ext>();
		}
		
		public PoolItem3ChildReference(PoolItem3Ext childPI) {
			super();
			this.currentPosition = 0;
			this.childrenReferences = new ArrayList<PoolItem3Ext>();
			this.childrenReferences.add(childPI);
		}
		
		public String toString() {
			String tempStr = "";

			for (PoolItem3Ext childRef : childrenReferences) {
				tempStr += (childRef.getDatanode().getActivityID() + " || ");
			}		
		
			return tempStr;
		}
				
		public void addChildReference(PoolItem3Ext childPI) {
			boolean alreadyExist = false;
			for (PoolItem3Ext childRef : childrenReferences) {
				if(childRef == childPI) {
					alreadyExist = true;
					break;
				}
			}
			
			if(!alreadyExist) {
				this.childrenReferences.add(childPI);
			}
		}
		
		public void incrementCurrentPosition() {
			this.currentPosition++;
		}
		
		public PoolItem3Ext getNext() {
			int tempPosition;
			if(currentPosition < childrenReferences.size()) {
				tempPosition = currentPosition;
				if(childrenReferences.size() > 1) {
					currentPosition++;
				}
				return childrenReferences.get(tempPosition);
			} else {
				return null;
			}
		}
		
		public boolean hasNext() {
			int tempSize = childrenReferences.size();
			if((tempSize > 1) && (currentPosition < tempSize)) {
				return true;
			} else {
				return false;
			}
		}

		public int getCurrentPosition() {
			return currentPosition;
		}

		public void setCurrentPosition(int currentPosition) {
			this.currentPosition = currentPosition;
		}

		public List<PoolItem3Ext> getChildrenReferences() {
			return childrenReferences;
		}

		public void setChildrenReferences(List<PoolItem3Ext> childrenReferences) {
			this.childrenReferences = childrenReferences;
		}
		
		
	}
}
