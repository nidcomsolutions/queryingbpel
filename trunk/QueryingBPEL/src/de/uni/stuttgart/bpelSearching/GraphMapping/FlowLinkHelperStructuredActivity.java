package de.uni.stuttgart.bpelSearching.GraphMapping;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;

/**
 * Implements the FlowLinkHelper interface. It is used in the
 * ProcessFlowGraphFactory2 classes to create all flow links. This class
 * references a structured activity.
 * <p>
 * The distinction of structured and normal activities is necessary because if a
 * structured activity is a source of a link then the endNode of the structured
 * activity get an outgoing edge. And if the structured activity is a target
 * then the startNode of the structured activity get an incoming edge.
 * 
 * @author Daniel Gerlach
 * 
 */
public class FlowLinkHelperStructuredActivity implements FlowLinkHelper {

	private ActivityNode nodeStart;
	private ActivityNode nodeEnd;
	private boolean activityIsSource;

	public FlowLinkHelperStructuredActivity(ActivityNode nodeStart,
			ActivityNode nodeEnd, boolean activityIsSource) {

		this.nodeStart = nodeStart;
		this.nodeEnd = nodeEnd;
		this.activityIsSource = activityIsSource;
	}

	public ActivityNode getNodeStart() {
		return nodeStart;
	}

	public void setNodeStart(ActivityNode nodeStart) {
		this.nodeStart = nodeStart;
	}

	public ActivityNode getNodeEnd() {
		return nodeEnd;
	}

	public void setNodeEnd(ActivityNode nodeEnd) {
		this.nodeEnd = nodeEnd;
	}

	public void setLinkIsSource(boolean linkIsSource) {
		this.activityIsSource = linkIsSource;
	}

	/**
	 * Returns true if structured activity is a source of a flow link in the
	 * process. Returns false if structured activity is a target of a link.
	 */
	@Override
	public boolean isSource() {
		return activityIsSource;
	}

}
