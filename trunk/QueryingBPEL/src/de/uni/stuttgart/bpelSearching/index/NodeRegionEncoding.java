package de.uni.stuttgart.bpelSearching.index;


/**
 * The NodeRegionEncoding class represents the positional information of a vertex of a.
 * 
 * @author Wei Lu
 * 
 */

public class NodeRegionEncoding{
	
	private String activityID;
	
	private int preorderRank;
	
	private int postorderRank;
	
	private int level;
	
	
	/**
	 * Initializes a newly created NodeRegionEncoding with the given activityID,
	 * preorderRank, postorderRank, level.
	 * 
	 * @param activityID
	 *            an activityID
	 * @param preorderRank
	 *            a preorderRank represent the start position of vertex
	 * @param postorderRank
	 *            a postorderRank represent the end position of vertex
	 * @param level
	 *            level number of the vertex
	 */
	public NodeRegionEncoding(String activityID, int preorderRank, int postorderRank, int level) {
		this.activityID = activityID;
		this.preorderRank = preorderRank;
		this.postorderRank = postorderRank;
		this.level = level;
	}

	public String toString() {
		String temp = "";
		temp += activityID + " (" + preorderRank + ", " + postorderRank+ ", " + level + ")  ";
		return temp;		
	}

	public String getActivityID() {
		return activityID;
	}


	public void setActivityID(String activityID) {
		this.activityID = activityID;
	}


	public int getPreorderRank() {
		return preorderRank;
	}


	public void setPreorderRank(int preorderRank) {
		this.preorderRank = preorderRank;
	}


	public int getPostorderRank() {
		return postorderRank;
	}


	public void setPostorderRank(int postorderRank) {
		this.postorderRank = postorderRank;
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
