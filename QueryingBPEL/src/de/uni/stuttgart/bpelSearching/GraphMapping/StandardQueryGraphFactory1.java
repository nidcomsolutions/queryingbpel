/**
 * 
 */
package de.uni.stuttgart.bpelSearching.GraphMapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityNode;

/**
 * @author luwei
 *
 */
public class StandardQueryGraphFactory1 extends QueryGraphFactory1 {

	public StandardQueryGraphFactory1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see de.uni.stuttgart.bpelSearching.GraphMapping.GraphFactory1#handleIfActivity(org.open.oasis.docs.wsbpel._2._0.process.executable.If, de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode, de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode)
	 */
	@Override
	protected void handleIfActivity(If ifActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(ifActivity);

		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(ifActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		EList<Elseif> elseifActivityList = ifActivity.getElseif();
		ActivityContainer elseActivity = ifActivity.getElse();

		// process if branch
		for (EObject eobj : ifActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivityInIf = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivityInIf,
						startEndNodes[0], startEndNodes[1]);
			}
		}

		// process all elseif branches
		for (Elseif elseifObject : elseifActivityList) {
			for (EObject eobj : elseifObject.eContents()) {
				if (eobj instanceof Activity) {
					Activity containedActivityInElseif = (Activity) eobj;
					decideActivityTypeAndFurtherProcessing(
							containedActivityInElseif, startEndNodes[0],
							startEndNodes[1]);
				}
			}
		}

		// process else branch
		for (EObject eobj : elseActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivityInIf = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivityInIf,
						startEndNodes[0], startEndNodes[1]);
			}
		}

		// set lastAddNode to ifEndNode
		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(ifActivity, startEndNodes[0],
				startEndNodes[1]);

	}

	/* (non-Javadoc)
	 * @see de.uni.stuttgart.bpelSearching.GraphMapping.GraphFactory1#handlePickActivity(org.open.oasis.docs.wsbpel._2._0.process.executable.Pick, de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode, de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode)
	 */
	@Override
	protected void handlePickActivity(Pick pickActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(pickActivity);

		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(pickActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		EList<OnMessage> onMessageList = pickActivity.getOnMessage();
		EList<OnAlarmPick> onAlarmPickList = pickActivity.getOnAlarm();

		for (OnMessage onMessage : onMessageList) {
			for (EObject eobj : onMessage.eContents()) {
				if (eobj instanceof Activity) {
					Activity activityInOnMessage = (Activity) eobj;
					decideActivityTypeAndFurtherProcessing(activityInOnMessage,
							startEndNodes[0], startEndNodes[1]);
				}
			}

		}

		for (OnAlarmPick onAlarmPick : onAlarmPickList) {
			for (EObject eobj : onAlarmPick.eContents()) {
				Activity activityInOnAlarmPick = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(activityInOnAlarmPick,
						startEndNodes[0], startEndNodes[1]);
			}
		}

		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(pickActivity, startEndNodes[0],
				startEndNodes[1]);
	}
}
