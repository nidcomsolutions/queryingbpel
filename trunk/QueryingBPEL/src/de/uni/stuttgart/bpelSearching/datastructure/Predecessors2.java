package de.uni.stuttgart.bpelSearching.datastructure;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import de.uni.stuttgart.bpelSearching.matching.NodeRegionEncodingComparator;

/**
 * The PredecessorItem class represents an item in predecessor list associated with 
 * process node. It consists of 2 predecessor sets:  One set stores the original 
 * predecessors (it is unchangeable), the other one stores changeable predecessors 
 * for computation.
 *
 * @author Wei Lu
 */

public class Predecessors2 {
	
	private SortedSet<NodeRegionEncoding> originalPredecessors;
	private SortedSet<NodeRegionEncoding> currentPredecessors;
	private boolean isOriginal;
		
	/**
	 * 
	 */
	public Predecessors2() {
		super();
    	NodeRegionEncodingComparator nodeRegionCompare = new NodeRegionEncodingComparator();
		originalPredecessors = new TreeSet<NodeRegionEncoding>(nodeRegionCompare);
		currentPredecessors = new TreeSet<NodeRegionEncoding>(nodeRegionCompare);
		isOriginal = false;
	}

	/**
	 * @param originalPredecessors
	 * @param currentPredecessors
	 * @param isOriginal
	 */
	public Predecessors2(SortedSet<NodeRegionEncoding> originalPredecessors,
			SortedSet<NodeRegionEncoding> currentPredecessors,
			boolean isOriginal) {
		super();
		this.originalPredecessors = originalPredecessors;
		this.currentPredecessors = currentPredecessors;
		this.isOriginal = isOriginal;
	}
	
	
	public String toString() {
		String tempStr = "Original Predecessors [";
		if (originalPredecessors != null) {
			for (NodeRegionEncoding originalPredecessor : originalPredecessors) {
				tempStr += (originalPredecessor.toString() + " , " );
			}	
			if (isOriginal)  {
				tempStr += " ] " + " Current predecessors equals original predecessors";
			} else {
				tempStr += " ] " + " Current predecessors differs original predecessors";
			}
		} else {
			tempStr = " Null";	
		}		
		return tempStr;
	}

	
	public SortedSet<NodeRegionEncoding> getOriginalPredecessors() {
		return originalPredecessors;
	}

	public void setOriginalPredecessors(
			SortedSet<NodeRegionEncoding> originalPredecessors) {
		this.originalPredecessors = originalPredecessors;
	}

	public SortedSet<NodeRegionEncoding> getCurrentPredecessors() {
		return currentPredecessors;
	}

	public void setCurrentPredecessors(
			SortedSet<NodeRegionEncoding> currentPredecessors) {
		this.currentPredecessors = currentPredecessors;
	}

	public boolean isOriginal() {
		return isOriginal;
	}

	public void setOriginal(boolean isOriginal) {
		this.isOriginal = isOriginal;
	}
	

}
