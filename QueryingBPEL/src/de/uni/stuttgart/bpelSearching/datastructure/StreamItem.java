/**
 * 
 */
package de.uni.stuttgart.bpelSearching.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public class StreamItem {
	private ActivityNode processnode;
	private int arrayIndexOfProcessnode;
	private float maxMatchSize;
	private Map<ActivityNode, StreamItemChildReferences> childrenReferencesMap;

	/**
	 * @param processnode
	 * @param arrayIndexOfProcessnode
	 * @param maxMatchSize
	 * @param childrenReferencesMap
	 */
	public StreamItem(ActivityNode processnode, int arrayIndexOfProcessnode,
			float maxMatchSize, Map<ActivityNode, StreamItemChildReferences> childrenReferencesMap) {
		super();
		this.processnode = processnode;
		this.arrayIndexOfProcessnode = arrayIndexOfProcessnode;
		this.maxMatchSize = maxMatchSize;
		if (childrenReferencesMap == null) {
			this.childrenReferencesMap = new HashMap<ActivityNode, StreamItemChildReferences>();
		} else {
			this.childrenReferencesMap = childrenReferencesMap;
		}
	}
	
	public String toString() {
		String tempStr = "";
		if (processnode != null) {
			tempStr += (" ProcessNode id: " + processnode.getActivityID() + 
					"  arrayIndexOfProcessnode: " + arrayIndexOfProcessnode + 
					"  maxMatchSize: " + maxMatchSize);
			Set<StreamItem> children = getChildren();
			if (children.isEmpty()) {
				tempStr += " - Null";
			} else {
				tempStr += "  children: ";
				for (StreamItem child : children) {
					tempStr += (" Descendant pid: " + child.getProcessnode().
							getActivityID() + " || ");
				}		
			}
		}
		return tempStr;
	}
	
	
    /**
     * Returns all referenced elements in its children streams.
     * 
     * @return all referenced elements in its children streams.
     */
	public Set<StreamItem> getChildren() {
		Set<StreamItem> result = new HashSet<StreamItem>();
		if (childrenReferencesMap != null) {
			Iterator<StreamItemChildReferences> childrenReferencesIter = childrenReferencesMap.
			values().iterator();		
			while (childrenReferencesIter.hasNext()) {
				StreamItemChildReferences cRef = childrenReferencesIter.next();
				result.addAll(cRef.getChildReferences());
			}
		}
		return result;
	}
	
    /**
     * Determines the specified child stream element is referenced by the children 
     * references map of the current stream element
     * 
     * @param childSI stream element to be checked
     * 
     * @return <tt>true</tt> if the specified child stream element is referenced by  
     * the children references map; <tt>false</tt> otherwise.
     * 
     */
	public boolean isChild(StreamItem childSI) {
		if (childrenReferencesMap != null) {
			Iterator<StreamItemChildReferences> childrenReferencesIter = childrenReferencesMap.
			values().iterator();		
			while (childrenReferencesIter.hasNext()) {
				StreamItemChildReferences cRef = childrenReferencesIter.next();
				for (StreamItem cSE : cRef.getChildReferences()) {
					if (cSE.equals(childSI)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
    /**
     * Adds the specified child stream element to the child references.
     * 
     * @param childSI child stream element to be added to the child references.
     * @param childNode query child node
     * 
     * @return <tt>true</tt> if the specified child stream element has been successfully added in 
     * the children references map; <tt>false</tt> otherwise.
     */
	public boolean addChild(StreamItem childSI, ActivityNode childNode) {
		StreamItemChildReferences cSIRef;	
		if (childSI != null) {
			if ((cSIRef = childrenReferencesMap.get(childNode)) != null) {
				cSIRef.addChildReference(childSI);		
			} else {
				childrenReferencesMap.put(childNode, new StreamItemChildReferences(childSI));
			}
			return true;
		} else {
			return false;
		}
	}
	
    /**
     * Computes a list of referenced stream elements, whose maximal matching size is maximal 
     * among the stream elements stored in the solution stream of <code>childNode</code>. 
     * The input value of <code>maxRefStreamItems</code> must not be null. The result is 
     * stored in parameter <code>maxRefStreamItems</code>.
     * 
     * @param childNode query child node
     * @param maxRefStreamItems a list of maximal referenced stream elements
     * 
     */
	public void getMaxReferencedStreamItems(ActivityNode childNode, 
			List<StreamItem> maxRefStreamItems) {
		StreamItemChildReferences cSIRef;
		float maxMatchSize;
		if (maxRefStreamItems == null) {
			maxRefStreamItems = new ArrayList<StreamItem>();
		} else if (!maxRefStreamItems.isEmpty()) {
			maxRefStreamItems.clear();
		}
		if ((cSIRef = childrenReferencesMap.get(childNode)) != null) {
			maxMatchSize = 0.0f;
			List<StreamItem> seList = cSIRef.getChildReferences();
			for (StreamItem se : seList) {
				if (se.getMaxMatchSize() > maxMatchSize) {
					if (!maxRefStreamItems.isEmpty()) {
						maxRefStreamItems.clear();
					}
					maxRefStreamItems.add(se);
					maxMatchSize = se.getMaxMatchSize();
				} else if (se.getMaxMatchSize() == maxMatchSize) {
					maxRefStreamItems.add(se);
				}
			}
		}
	}
	
    /**
     * Gets the maximal matching size among referenced stream elements associated 
     * with the input child node. If their is no reference to the child node, -1 is 
     * returned.
     * 
     * @param childNode query child node
     * 
     * @return the maximal matching size among referenced stream elements associated 
     * with the input child node.
     */
	public float getMaxRefSize(ActivityNode childNode) {
		float maxRefSize = -1.0f;
		StreamItemChildReferences cSIRef;
		if ((cSIRef = childrenReferencesMap.get(childNode)) != null) {
			List<StreamItem> seList = cSIRef.getChildReferences();
			for (StreamItem se : seList) {
				if (se.getMaxMatchSize() > maxRefSize) {
					maxRefSize = se.getMaxMatchSize();
				}		
			}
		}
		return maxRefSize;
	}
	
	public ActivityNode getProcessnode() {
		return processnode;
	}

	public void setProcessnode(ActivityNode processnode) {
		this.processnode = processnode;
	}


	public float getMaxMatchSize() {
		return maxMatchSize;
	}


	public void setMaxMatchSize(float maxMatchSize) {
		this.maxMatchSize = maxMatchSize;
	}


	public Map<ActivityNode, StreamItemChildReferences> getChildrenReferencesMap() {
		return childrenReferencesMap;
	}


	public void setChildrenReferencesMap(
			Map<ActivityNode, StreamItemChildReferences> childrenReferencesMap) {
		this.childrenReferencesMap = childrenReferencesMap;
	}
	
	//~ Inner Class ----------------------------------------------------------
    /**
     * A data structure used to store references to child pool elements for a 
     * specified child node.
     */
	private class StreamItemChildReferences {
		private int currentPosition;
		private List<StreamItem> childReferences;
		
		/**
		 * Creates a new child references object for a query child node.
		 * 
		 */
		public StreamItemChildReferences() {
			super();
			this.currentPosition = 0;
			this.childReferences = new ArrayList<StreamItem>();
		}
		
		/**
		 * Creates a new child references object for a query child node, 
		 * add <code>childPI</code> to references.
		 * 
		 * @param childSI a child pool element
		 * 
		 */
		public StreamItemChildReferences(StreamItem childSI) {
			super();
			this.currentPosition = 0;
			this.childReferences = new ArrayList<StreamItem>();
			this.childReferences.add(childSI);
		}
		
		public String toString() {
			String tempStr = "";

			for (StreamItem childRef : childReferences) {
				tempStr += (childRef.getProcessnode().getActivityID() + " || ");
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
		public boolean addChildReference(StreamItem childPI) {
			boolean alreadyExist = false;
			for (StreamItem childRef : childReferences) {
				if(childRef.equals(childPI)) {
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
		public StreamItem getCurrentItem() {
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
		public StreamItem getCurrentItemAndMoveToNext() {
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

		public List<StreamItem> getChildReferences() {
			return childReferences;
		}

		public void setChildReferences(List<StreamItem> childReferences) {
			this.childReferences = childReferences;
		}	
	}

	public int getArrayIndexOfProcessnode() {
		return arrayIndexOfProcessnode;
	}

	public void setArrayIndexOfProcessnode(int arrayIndexOfProcessnode) {
		this.arrayIndexOfProcessnode = arrayIndexOfProcessnode;
	}
}
