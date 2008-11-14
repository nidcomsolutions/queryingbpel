package de.uni.stuttgart.bpelSearching.datastructure;


/**
 * The NodeRegionEncoding class represents region encoding of a node in a graph.
 * 
 * @author Wei Lu
 * 
 */
public class NodeRegionEncoding{
	
	private String activityID;
	
	private int start;
	
	private int end;
	
	private int level;
	
	
	/**
	 * Initializes a newly created NodeRegionEncoding with the given activityID,
	 * start, end, level.
	 * 
	 * @param activityID
	 *            activityID of the node
	 * @param start
	 *            the start position of the node
	 * @param end
	 *            the end position of the node
	 * @param level
	 *            level of the node
	 */
	public NodeRegionEncoding(String activityID, int start, int end, int level) {
		this.activityID = activityID;
		this.start = start;
		this.end = end;
		this.level = level;
	}

	public String toString() {
		String temp = (activityID + " (" + start + ": " + end+ ", " + level + ")  ");
		return temp;		
	}

	public String getActivityID() {
		return activityID;
	}


	public void setActivityID(String activityID) {
		this.activityID = activityID;
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}

//	@Override
//	public int compareTo(Object anotherNode) throws ClassCastException {
//	    if (!(anotherNode instanceof NodeRegionEncoding))
//	        throw new ClassCastException("A NodeRegionEncoding object expected.");
//	    
//	    int anotherNodePreorderRank = ((NodeRegionEncoding)anotherNode).getPreorderRank();
//		return (this.preorderRank - anotherNodePreorderRank);
//	}
}
