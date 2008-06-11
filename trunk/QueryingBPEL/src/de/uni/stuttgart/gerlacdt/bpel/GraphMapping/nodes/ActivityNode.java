package de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;

/**
 * The ActivityNode class represents the content of a vertex of a
 * {@link ProcessFlowGraph}. The content is a basic activity.
 * 
 * @author Daniel Gerlach
 * 
 */

public class ActivityNode {

	private String activityID;
	private String activityName;
	private int activityType;
	private String containerId;

	/**
	 * Initializes a newly created ActivityNode with the given activityID,
	 * processID, activityName, activityType.
	 * 
	 * @param activityID
	 *            an activityID
	 * @param processID
	 *            a processID
	 * @param activityName
	 *            an activityName
	 * @param activityType
	 *            an activityType
	 */
	public ActivityNode(String activityID, String activityName,
			int activityType, String containerId) {
		this.activityID = activityID;
		this.activityName = activityName;
		this.activityType = activityType;
		this.containerId = containerId;
	}
	
	public ActivityNode(String activityID, String activityName,
			int activityType) {
		this.activityID = activityID;
		this.activityName = activityName;
		this.activityType = activityType;
	}
	
	public String toString() {
		return activityID + ": " + activityName;
		
	}

	public String getActivityID() {
		return activityID;
	}

	public void setActivityID(String activityID) {
		this.activityID = activityID;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public int getActivityType() {
		return activityType;
	}

	public void setActivityType(int activityType) {
		this.activityType = activityType;
	}

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

}
