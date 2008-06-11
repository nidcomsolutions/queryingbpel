package de.uni.stuttgart.gerlacdt.bpel.GraphMapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.StructuredActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.StructuredActivityOnMessageNode;

/**
 * The NewStructuredProcessFlowGraphFactory class is a creator for ProcessFlowGraph
 * objects from a loaded BPEL process from the database. This class is
 * responsible for the correct mapping of a BPEL process to a ProcessFlowGraph.
 * Thereby, it supports all BPEL activities (Invoke, Reply, Sequence, Flow ...).
 * <p>
 * It maps also the structure in an If or in a Pick activity (onMessage,
 * onAlarm, if, else if, else branches are considered as well as the normal
 * activities).
 * 
 * @author Wei Lu
 * 
 */

public class NewStructuredProcessFlowGraphFactory extends ProcessFlowGraphFactory {
	/**
	 * Initialize the GraphBuilding class with the given BPEL process.
	 * 
	 * @param process
	 *            Input BPEL process from which a {@link ProcessFlowGraph} will
	 *            be generated.
	 */
	public NewStructuredProcessFlowGraphFactory(Process process) {
		super(process);
	}

	/**
	 * Processes an If activity and creates appropriate nodes (start and end
	 * nodes) in the process graph. Contained activities will be created too.
	 * 
	 * @param ifActivity
	 *            The If activity for which nodes will be generated and added in
	 *            the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
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
			processFlowGraph.getProcessGraph().addVertex(elseIfNodeStart);
			processFlowGraph.getProcessGraph().addVertex(elseIfNodeEnd);
			processFlowGraph.getProcessGraph().addEdge(startEndNodes[0],
					elseIfNodeStart);
			
			// *** New version ***
//			processFlowGraph.getProcessGraph().addEdge(elseIfNodeEnd,
//					startEndNodes[1]);
			lastAddedNode = elseIfNodeStart;

			for (EObject eobj : elseifObject.eContents()) {
				if (eobj instanceof Activity) {
					Activity containedActivityInElseif = (Activity) eobj;
					decideActivityTypeAndFurtherProcessing(
							containedActivityInElseif, null, null);
				}
			}
			processFlowGraph.getProcessGraph().addEdge(lastAddedNode,
					elseIfNodeEnd);
		}

		// process else branch, create their vertices and add their
		// edges in the graph
		ActivityNode elseNodeStart = createStructureHelperNode(elseActivity,
				startEndNodes[0].getActivityName(), true);
		ActivityNode elseNodeEnd = createStructureHelperNode(elseActivity,
				startEndNodes[0].getActivityName(), false);
		processFlowGraph.getProcessGraph().addVertex(elseNodeStart);
		processFlowGraph.getProcessGraph().addVertex(elseNodeEnd);
		processFlowGraph.getProcessGraph().addEdge(startEndNodes[0],
				elseNodeStart);
		
		// *** New version ***
//		processFlowGraph.getProcessGraph().addEdge(elseNodeEnd,
//				startEndNodes[1]);
		lastAddedNode = elseNodeStart;

		for (EObject eobj : elseActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivityInIf = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivityInIf,
						null, null);
			}
		}
		processFlowGraph.getProcessGraph().addEdge(lastAddedNode, elseNodeEnd);
		
		processFlowGraph.getProcessGraph().addEdge(lastAddedNode, elseNodeEnd);

		lastAddedNode = startEndNodes[1];
		
		// *** New version ***
		processFlowGraph.getProcessGraph().addEdge(startEndNodes[0], startEndNodes[1]);
		
		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(ifActivity, startEndNodes[0],
				startEndNodes[1]);

	}

	/**
	 * Processes a pick activity and creates appropriate nodes (start and end
	 * nodes) in the process graph. Contained activities will be created too.
	 * 
	 * @param pickActivity
	 *            The pick activity for which nodes will be generated and added
	 *            in the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
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
			processFlowGraph.getProcessGraph().addVertex(onMessageStartNode);
			processFlowGraph.getProcessGraph().addVertex(onMessageEndNode);
			processFlowGraph.getProcessGraph().addEdge(startEndNodes[0],
					onMessageStartNode);
			// *** New version ***
//			processFlowGraph.getProcessGraph().addEdge(onMessageEndNode,
//					startEndNodes[1]);
			lastAddedNode = onMessageStartNode;

			for (EObject eobj : onMessage.eContents()) {
				if (eobj instanceof Activity) {
					Activity activityInOnMessage = (Activity) eobj;
					decideActivityTypeAndFurtherProcessing(activityInOnMessage,
							null, null);
				}
			}
			processFlowGraph.getProcessGraph().addEdge(lastAddedNode,
					onMessageEndNode);

		}

		// process all onAlarm in pick activity and create vertices and edges in
		// the graph
		for (OnAlarmPick onAlarmPick : onAlarmPickList) {
			ActivityNode onAlarmPickStartNode = createStructureHelperNode(
					onAlarmPick, startEndNodes[0].getActivityName(), true);
			ActivityNode onAlarmPickEndNode = createStructureHelperNode(
					onAlarmPick, startEndNodes[0].getActivityName(), false);
			processFlowGraph.getProcessGraph().addVertex(onAlarmPickStartNode);
			processFlowGraph.getProcessGraph().addVertex(onAlarmPickEndNode);
			processFlowGraph.getProcessGraph().addEdge(startEndNodes[0],
					onAlarmPickStartNode);
			
			// *** New version ***
//			processFlowGraph.getProcessGraph().addEdge(onAlarmPickEndNode,
//					startEndNodes[1]);
			lastAddedNode = onAlarmPickStartNode;
			for (EObject eobj : onAlarmPick.eContents()) {
				Activity activityInOnAlarmPick = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(activityInOnAlarmPick,
						null, null);
			}
			processFlowGraph.getProcessGraph().addEdge(lastAddedNode,
					onAlarmPickEndNode);
		}

		lastAddedNode = startEndNodes[1];

		// *** New version ***
		processFlowGraph.getProcessGraph().addEdge(startEndNodes[0], startEndNodes[1]);
		
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
		String containerID = IdentifierCacheHandler.getID(structureHelper.eContainer()).toString();

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
		
		structureHelperID = IdentifierCacheHandler.getID(structureHelper).toString();
		
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

