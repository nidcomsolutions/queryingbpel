/**
 * 
 */
package de.uni.stuttgart.bpelSearching.datastructure;

import java.util.LinkedList;
import java.util.List;

/**
 * @author luwei
 *
 */
public class SolutionStream {
	private List<StreamItem> streamList;
	private int maxMatchSize;
	private int maxNumberOfAssignments;
	
	/**
	 * @param maxMatchSize
	 */
	public SolutionStream(int maxMatchSize) {
		super();
		this.streamList = new LinkedList<StreamItem>();
		this.maxMatchSize = maxMatchSize;
		this.maxNumberOfAssignments = 0;
	}
	
	/**
	 * @param streamList
	 * @param maxMatchSize
	 */
	public SolutionStream(List<StreamItem> streamList, int maxMatchSize) {
		super();
		this.streamList = streamList;
		this.maxMatchSize = maxMatchSize;
		this.maxNumberOfAssignments = 0;
	}
	
	
	public String toString() {
		String tempStr = "Solution Stream: with maxMatchSize " + maxMatchSize + "  maxNumberOfAssignments: "
			 + maxNumberOfAssignments + "  Stream Items: ";
		for (StreamItem se : streamList) {
			tempStr += se.toString();
		}
		return tempStr;
	}
	
	/**
	 * Gets the maximal match size associated with the stream item 
	 * with the given process node id
	 * 
	 * @param pID process node id
	 * 
	 * @return the maximal match size associated with the stream item 
	 * with the given process node id
	 */
	public int getMaxMatchSizeOfStreamItem(String pID) {
		for (StreamItem se : streamList) {
			if (se.getProcessnode().getActivityID().compareTo(pID) == 0) {
				return se.getMaxMatchSize();
			}
		}
		return 0;
	}
	
	/**
	 * Gets the stream item corresponding to the given process node id, if 
	 * any. Null, otherwise.
	 * 
	 * @param pID process node id
	 * 
	 * @return the stream item corresponding to the given process node id
	 */
	public StreamItem getStreamItem(String pID) {
		for (StreamItem se : streamList) {
			if (se.getProcessnode().getActivityID().compareTo(pID) == 0) {
				return se;
			}
		}
		return null;
	}
	
	public List<StreamItem> getStreamList() {
		return streamList;
	}
	public void setStreamList(List<StreamItem> streamList) {
		this.streamList = streamList;
	}
	public int getMaxMatchSize() {
		return maxMatchSize;
	}
	public void setMaxMatchSize(int maxMatchSize) {
		this.maxMatchSize = maxMatchSize;
	}

	public int getMaxNumberOfAssignments() {
		return maxNumberOfAssignments;
	}

	public void setMaxNumberOfAssignments(int maxNumberOfAssignments) {
		this.maxNumberOfAssignments = maxNumberOfAssignments;
	}

}
