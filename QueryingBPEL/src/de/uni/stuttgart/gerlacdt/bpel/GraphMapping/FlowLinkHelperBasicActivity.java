package de.uni.stuttgart.gerlacdt.bpel.GraphMapping;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * Implements the FlowLinkHelper interface. It is used in the
 * ProcessFlowGraphFactories to create all flow links. This class references a
 * basic activity.
 * 
 * @author Daniel Gerlach
 * 
 */
public class FlowLinkHelperBasicActivity implements FlowLinkHelper {

	private ActivityNode basicActivityNode;
	private boolean activityIsSource;

	public FlowLinkHelperBasicActivity(ActivityNode basicActivity,
			boolean activityIsSource) {

		this.basicActivityNode = basicActivity;
		this.activityIsSource = activityIsSource;
	}

	public ActivityNode getBasicActivityNode() {
		return basicActivityNode;
	}

	public void setBasicActivityNode(ActivityNode basicActivityNode) {
		this.basicActivityNode = basicActivityNode;
	}

	public void setActivityIsSource(boolean activityIsSource) {
		this.activityIsSource = activityIsSource;
	}

	/**
	 * Returns true if referenced activity is a source of a link in the process.
	 * Returns false if activity is the target of the link.
	 */
	@Override
	public boolean isSource() {
		return activityIsSource;
	}

}
