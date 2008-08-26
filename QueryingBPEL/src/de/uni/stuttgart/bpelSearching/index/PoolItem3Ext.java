/**
 * 
 */
package de.uni.stuttgart.bpelSearching.index;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
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
	private Map<ActivityNode, PoolItem3ExtChildReferences> childrenReferencesMap;	
	
	/**
	 * Creates a new pool element with the given query node and process node 
	 * and childrenReferencesMap.
	 *  
	 * @param querynode
	 * @param datanode
	 * @param childrenReferencesMap
	 */
	public PoolItem3Ext(ActivityNode querynode, NodeRegionEncoding datanode,
			Map<ActivityNode, PoolItem3ExtChildReferences> childrenReferencesMap) {
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
		childrenReferencesMap = new HashMap<ActivityNode, PoolItem3ExtChildReferences>();
	}
	
	
	public String toString() {
		String tempStr = "";
		if ((querynode != null) && (datanode != null)) {
			tempStr += ("Q: " + querynode.getActivityID() + " D: " + datanode.getActivityID());
			Set<PoolItem3Ext> children = getChildren();
			if (children.isEmpty()) {
				tempStr += " - Null";
			} else {
				tempStr += "  children: ";
				for (PoolItem3Ext child : children) {
					tempStr += ("CQ: " + child.getQuerynode().getActivityID() + " CD: " +
							child.getDatanode().getActivityID() + " || ");
				}		
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
		PoolItem3ExtChildReferences cPIRef;
		
		if (childPI != null) {
			ActivityNode cNode = childPI.getQuerynode();
			if ((cPIRef = childrenReferencesMap.get(cNode)) != null) {
				cPIRef.addChildReference(childPI);		
			} else {
				childrenReferencesMap.put(cNode, new PoolItem3ExtChildReferences(childPI));
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
			Iterator<PoolItem3ExtChildReferences> childrenReferencesIter = childrenReferencesMap.
			values().iterator();		
			while (childrenReferencesIter.hasNext()) {
				PoolItem3ExtChildReferences cRef = childrenReferencesIter.next();
				result.addAll(cRef.getChildReferences());
			}
		}
		return result;
	}
	
    /**
     * Gets the current child pool element to be processed associated with <code>childQ</code>.
     * 
     * @param childQ a child node of <code>querynode</code>
     * 
     * @return the current child pool element associated with <code>childQ</code>.
     */
	public PoolItem3Ext getCurrentChild(ActivityNode childQ) {
		if (childrenReferencesMap.get(childQ) == null) {
			return null;
		} else {
			return childrenReferencesMap.get(childQ).getCurrentItem();
		}
	}
	
	
    /**
     * Gets the current child pool element to be processed associated with <code>childQ</code>, 
     * and move cursor to the next child pool element (if any).
     * 
     * @param childQ a child node of <code>querynode</code>
     * 
     * @return the current child pool element associated with <code>childQ</code>.
     */
	public PoolItem3Ext getCurrentChildAndMoveToNext(ActivityNode childQ) {
		if (childrenReferencesMap.get(childQ) == null) {
			return null;
		} else {
			return childrenReferencesMap.get(childQ).getCurrentItemAndMoveToNext();
		}
	}
	
    /**
     * Move cursor to the next child pool element (if any)associated with <code>childQ</code>.
     * 
     * @param childQ a child node of <code>querynode</code>
     * 
     * @return return <tt>true</tt> if the cursor has been moved to the next child pool 
     * element associated with <code>childQ</code>; <tt>false</tt> otherwise.
     * 
     */
	public boolean moveToNext(ActivityNode childQ) {
		if (childrenReferencesMap.get(childQ) == null) {
			return false;
		} else {	
			return childrenReferencesMap.get(childQ).moveToNext();
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
		PoolItem3ExtChildReferences childQRef = childrenReferencesMap.get(childQ);
		if (childQRef == null) {
			return false;
		} else {
			return childQRef.hasNext();
		}	
	}

    /**
     * Gets all referenced elements.
     * 
     * @return all referenced elements.
     */
	public List<PoolItem3Ext> getAllChildrenReferences() {
		List<PoolItem3Ext> childrenPIlist = new LinkedList<PoolItem3Ext>();
		Iterator<PoolItem3ExtChildReferences> iter = childrenReferencesMap.values().iterator();
		while (iter.hasNext()) {
			childrenPIlist.addAll(iter.next().getChildReferences());
		}
		return childrenPIlist;
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

	public Map<ActivityNode, PoolItem3ExtChildReferences> getChildrenReferencesMap() {
		return childrenReferencesMap;
	}

	public void setChildrenReferencesMap(
			Map<ActivityNode, PoolItem3ExtChildReferences> childrenReferencesMap) {
		this.childrenReferencesMap = childrenReferencesMap;
	}
	
	//~ Inner Class ----------------------------------------------------------
    /**
     * A data structure used to store references to child pool elements for a 
     * specified child node.
     */
	private class PoolItem3ExtChildReferences {
		private int currentPosition;
		private List<PoolItem3Ext> childReferences;
		
		/**
		 * Creates a new child references object for a query child node.
		 * 
		 */
		public PoolItem3ExtChildReferences() {
			super();
			this.currentPosition = 0;
			this.childReferences = new ArrayList<PoolItem3Ext>();
		}
		
		/**
		 * Creates a new child references object for a query child node, 
		 * add <code>childPI</code> to references.
		 * 
		 * @param childPI a child pool element
		 * 
		 */
		public PoolItem3ExtChildReferences(PoolItem3Ext childPI) {
			super();
			this.currentPosition = 0;
			this.childReferences = new ArrayList<PoolItem3Ext>();
			this.childReferences.add(childPI);
		}
		
		public String toString() {
			String tempStr = "";

			for (PoolItem3Ext childRef : childReferences) {
				tempStr += (childRef.getDatanode().getActivityID() + " || ");
			}		
		
			return tempStr;
		}
		
	    /**
	     * Adds the specified child pool element, childPI, to this child references object 
	     * if it contains no reference childPI2 such that childPI2.equals(childPI). If this 
	     * object already contains such reference, the call leaves it unchanged and returns 
	     * false. In combination with the restriction on constructors, this ensures that child 
	     * references object never contain duplicate references.
	     * 
	     * @param childPI a child pool element
	     * 
	     * @return true if this child references did not already contain the specified child 
	     * pool element.
	     * 
	     */
		public boolean addChildReference(PoolItem3Ext childPI) {
			boolean alreadyExist = false;
			for (PoolItem3Ext childRef : childReferences) {
				if(childRef == childPI) {
					alreadyExist = true;
					break;
				}
			}
			
			if(!alreadyExist) {
				this.childReferences.add(childPI);
			}
			
			return (!alreadyExist);
		}		
		
//		public void incrementCurrentPosition() {
//			this.currentPosition++;
//		}
		
		
	    /**
	     * Returns the next to be processed element in the child pool, if current position is 
	     * not out of bound, otherwise null.
	     * 
	     * @return the next to be processed element in the child pool, if current position is 
	     * not out of bound, otherwise null.
	     * 
	     */
		public PoolItem3Ext getCurrentItem() {
			int tempPosition;
			tempPosition = currentPosition;
			tempPosition++;
			if(currentPosition < childReferences.size()) {
				return childReferences.get(currentPosition);
			} else {
				return null;
			}
		}
		
		
	    /**
	     * Returns the next to be processed element in the child pool, if current position is 
	     * not out of bound, otherwise null.
	     * 
	     * @return the next to be processed element in the child pool, if current position is 
	     * not out of bound, otherwise null.
	     * 
	     */
		public PoolItem3Ext getCurrentItemAndMoveToNext() {
			int tempPosition;
			if(currentPosition < childReferences.size()) {
				tempPosition = currentPosition;
				if(childReferences.size() > 1) {
					currentPosition++;
				}
				return childReferences.get(tempPosition);
			} else {
				return null;
			}
		}
		
		
	    /**
	     * Move cursor to the next child pool element, if the next position is not out of bound.
	     * 
	     * @return <tt>true</tt> if the next position is not out of bound; <tt>false</tt> otherwise.
	     * 
	     */
		public boolean moveToNext() {
			int tempPosition;
			tempPosition = currentPosition;
			tempPosition++;
			int cRefsize = childReferences.size();
			if ((cRefsize > 1) && (currentPosition < (cRefsize))) {
				currentPosition++;
				return true;
			} else {
				return false;
			}
		}
		
	
	    /**
	     * Determines whether the child references has more elements to be processed.
	     * 
	     * @return <tt>true</tt> if there are more elements in the child references to be
	     * processed; <tt>false</tt> otherwise.
	     * 
	     */
		public boolean hasNext() {
			int tempSize = childReferences.size();
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

		public List<PoolItem3Ext> getChildReferences() {
			return childReferences;
		}

		public void setChildReferences(List<PoolItem3Ext> childReferences) {
			this.childReferences = childReferences;
		}
		
		
	}
}
