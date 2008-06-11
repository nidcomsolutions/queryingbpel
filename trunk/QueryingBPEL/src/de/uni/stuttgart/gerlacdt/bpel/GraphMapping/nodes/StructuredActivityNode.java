package de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;

/**
 * The StructuredActivityNode class represents the content of a vertex of a
 * {@link ProcessFlowGraph}. The content is a structured activity.
 * 
 * @author Daniel Gerlach
 * 
 */
public class StructuredActivityNode extends ActivityNode {

	/**
	 * startNode specifies if the structured activity node is beginning or the
	 * end of the activity. If it is true then it is the beginning otherwise the
	 * end of the structured activity.
	 */
	private boolean startNode;

	/**
	 * Initializes a newly created StructuredActivityNode with the given
	 * activityID, processID, activityName, activityType. The boolean field
	 * startNode specifies if the structured activity node is beginning or the
	 * end of the activity.
	 * 
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 * @param startNode
	 */
	public StructuredActivityNode(String activityID, String activityName,
			int activityType, String containerId, boolean startNode) {
		super(activityID, activityName, activityType, containerId);
		this.startNode = startNode;
	}

	public boolean isStartNode() {
		return startNode;
	}

	public void setStartNode(boolean startNode) {
		this.startNode = startNode;
	}

}
