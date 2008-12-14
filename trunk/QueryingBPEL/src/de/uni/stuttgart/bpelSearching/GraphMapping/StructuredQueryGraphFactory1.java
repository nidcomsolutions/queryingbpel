/**
 * 
 */
package de.uni.stuttgart.bpelSearching.GraphMapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityType;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityOnMessageNode;

/**
 * The StructuredQueryGraphFactory1 class is a creator for QueryGraph
 * object from a loaded BPEL process from a .bpel file.
 * 
 * @author luwei
 *
 */
public class StructuredQueryGraphFactory1 extends QueryGraphFactory1 {

	/**
	 * @param queryProcess
	 */
	public StructuredQueryGraphFactory1() {
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

		// process all elseif branches, create their vertices and add their
		// edges in the graph
		for (Elseif elseifObject : elseifActivityList) {
			ActivityNode elseIfNodeStart = createStructureHelperNode(
					elseifObject, startEndNodes[0].getActivityName(), true);
			ActivityNode elseIfNodeEnd = createStructureHelperNode(
					elseifObject, startEndNodes[0].getActivityName(), false);
			directedGraph.addVertex(elseIfNodeStart);
			directedGraph.addVertex(elseIfNodeEnd);
			directedGraph.addEdge(startEndNodes[0],
					elseIfNodeStart);
			
			// *** New version ***
//			directedGraph.addEdge(elseIfNodeEnd,
//					startEndNodes[1]);
			lastAddedNode = elseIfNodeStart;

			for (EObject eobj : elseifObject.eContents()) {
				if (eobj instanceof Activity) {
					Activity containedActivityInElseif = (Activity) eobj;
					decideActivityTypeAndFurtherProcessing(
							containedActivityInElseif, null, null);
				}
			}
			directedGraph.addEdge(lastAddedNode, elseIfNodeEnd);
		}

		// process else branch, create their vertices and add their
		// edges in the graph
		ActivityNode elseNodeStart = createStructureHelperNode(elseActivity,
				startEndNodes[0].getActivityName(), true);
		ActivityNode elseNodeEnd = createStructureHelperNode(elseActivity,
				startEndNodes[0].getActivityName(), false);
		directedGraph.addVertex(elseNodeStart);
		directedGraph.addVertex(elseNodeEnd);
		directedGraph.addEdge(startEndNodes[0],
				elseNodeStart);
		
		// *** New version ***
//		directedGraph.addEdge(elseNodeEnd, startEndNodes[1]);
		lastAddedNode = elseNodeStart;

		for (EObject eobj : elseActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivityInIf = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivityInIf,
						null, null);
			}
		}
		directedGraph.addEdge(lastAddedNode, elseNodeEnd);
		
		directedGraph.addEdge(lastAddedNode, elseNodeEnd);

		lastAddedNode = startEndNodes[1];
		
		// *** New version ***
		directedGraph.addEdge(startEndNodes[0], startEndNodes[1]);
		
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

		// process all onMessages and create vertices and edges in the graph
		for (OnMessage onMessage : onMessageList) {
			ActivityNode onMessageStartNode = createStructureHelperNode(
					onMessage, startEndNodes[0].getActivityName(), true);
			ActivityNode onMessageEndNode = createStructureHelperNode(
					onMessage, startEndNodes[0].getActivityName(), false);
			directedGraph.addVertex(onMessageStartNode);
			directedGraph.addVertex(onMessageEndNode);
			directedGraph.addEdge(startEndNodes[0],
					onMessageStartNode);
			// *** New version ***
//			directedGraph.addEdge(onMessageEndNode,
//					startEndNodes[1]);
			lastAddedNode = onMessageStartNode;

			for (EObject eobj : onMessage.eContents()) {
				if (eobj instanceof Activity) {
					Activity activityInOnMessage = (Activity) eobj;
					decideActivityTypeAndFurtherProcessing(activityInOnMessage,
							null, null);
				}
			}
			directedGraph.addEdge(lastAddedNode, onMessageEndNode);

		}

		// process all onAlarm in pick activity and create vertices and edges in
		// the graph
		for (OnAlarmPick onAlarmPick : onAlarmPickList) {
			ActivityNode onAlarmPickStartNode = createStructureHelperNode(
					onAlarmPick, startEndNodes[0].getActivityName(), true);
			ActivityNode onAlarmPickEndNode = createStructureHelperNode(
					onAlarmPick, startEndNodes[0].getActivityName(), false);
			directedGraph.addVertex(onAlarmPickStartNode);
			directedGraph.addVertex(onAlarmPickEndNode);
			directedGraph.addEdge(startEndNodes[0],
					onAlarmPickStartNode);
			
			// *** New version ***
//			directedGraph.addEdge(onAlarmPickEndNode,
//					startEndNodes[1]);
			lastAddedNode = onAlarmPickStartNode;
			for (EObject eobj : onAlarmPick.eContents()) {
				Activity activityInOnAlarmPick = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(activityInOnAlarmPick,
						null, null);
			}
			directedGraph.addEdge(lastAddedNode, onAlarmPickEndNode);
		}

		lastAddedNode = startEndNodes[1];

		// *** New version ***
		directedGraph.addEdge(startEndNodes[0], startEndNodes[1]);
		
		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(pickActivity, startEndNodes[0],
				startEndNodes[1]);
	}

	
	/**
	 * Returns an ActivityNode which indicates the structure of the bpel process
	 * in an IF or Pick activity. The appropriate ActivityType can be OnMessage,
	 * OnAlarmPick, ElseIf and Else.
	 * 
	 * @param structureHelper
	 *            structureHelper element.
	 * @param containerName
	 *            name of structured activity which contains structureHelper.
	 * @param isStart
	 *            true if start-structuredNode, otherwise false.
	 * @return an ActivityNode with an appropriate ActivtiyType
	 */
	private ActivityNode createStructureHelperNode(
			ExtensibleElements structureHelper, String containerName,
			boolean isStart) {
		
		String operationAttr, variableAttr, partnerlinkAttr, porttypeAttr;
		ActivityNode node;
		
//		String containerID = IdentifierCacheHandler.getID(structureHelper.eContainer()).toString();
		
		String containerID;
		if (structureHelper.eContainer() == null) {
			containerID = "";				
		} else {
			EObject container = structureHelper.eContainer();
			containerID = structuredActivityIDMap.get(container);
			if (containerID == null) {
				containerID = "";
			}
		}
		
		// get structureHelper type
		int structureHelperType = ActivityType
				.getStuctureHelperType(structureHelper);
		// set name to onMessage, onAlarm etc.
		// concatenate the container name with the structureHelperType name
		String structureHelperName, structureHelperID;
		if (containerName != null) {
			structureHelperName = containerName
					+ ActivityType.getStructureHelperName(structureHelperType);
		} else {
			structureHelperName = ActivityType
					.getStructureHelperName(structureHelperType);
		}
		
//		structureHelperID = IdentifierCacheHandler.getID(structureHelper).toString();
		if (isStart) {
			idCount++;
		}	
		structureHelperID = "QstructureHelper" + idCount;	
		structuredActivityIDMap.put(structureHelper, structureHelperID);
		
		// *** New Version ***
		// Give different name and id for start and end nodes
		if (isStart) {
			structureHelperName += "Start";	
			structureHelperID += "Start";
		} else {
			structureHelperName += "End";
			structureHelperID += "End";
		}
		
		// Create activity node according to its type
		if (structureHelper instanceof OnMessage) {
			if (((OnMessage)structureHelper).getVariable() == null) {
				variableAttr =	"";
			} else {
				variableAttr =	((OnMessage)structureHelper).getVariable();
			}
			
			if (((OnMessage)structureHelper).getOperation() == null) {
				operationAttr =	"";
			} else {
				operationAttr =	((OnMessage)structureHelper).getOperation();
			}
			
			if (((OnMessage)structureHelper).getPortType() == null) {
				porttypeAttr =	"";
			} else {
				porttypeAttr =	((OnMessage)structureHelper).getPortType().toString();
			}
			
			if (((OnMessage)structureHelper).getPartnerLink() == null) {
				partnerlinkAttr =	"";
			} else {
				partnerlinkAttr =	((OnMessage)structureHelper).getPartnerLink();
			}
			
			node = new StructuredActivityOnMessageNode(structureHelperID, 
					structureHelperName, structureHelperType, containerID, isStart, 
					partnerlinkAttr, porttypeAttr, operationAttr, variableAttr);				
		} else {	
			node = new StructuredActivityNode(structureHelperID, structureHelperName, 
					structureHelperType, containerID, isStart);
		}
		
		return node;
	}
}
