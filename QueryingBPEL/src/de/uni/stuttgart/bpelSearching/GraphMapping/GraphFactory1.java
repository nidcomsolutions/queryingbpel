package de.uni.stuttgart.bpelSearching.GraphMapping;

import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Assign;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Empty;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Exit;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Flow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Receive;
import org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Reply;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Scope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Source;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sources;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Target;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Targets;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Throw;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Wait;
import org.open.oasis.docs.wsbpel._2._0.process.executable.While;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityType;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityNode;


/**
 * The abstract GraphFactory1 class is a creator class for Graph objects from a loaded BPEL process 
 * from the database. This class is responsible for the correct mapping of a BPEL process to a
 * ProcessGraph object. Thereby, it supports all BPEL activities (Invoke, Reply, Sequence, Flow ...).
 * 
 * @author Daniel Gerlach
 * 
 */

public abstract class GraphFactory1 implements InterfaceGraphFactory {

	/**
	 * the generated graph
	 */
	protected DirectedGraph<ActivityNode, DefaultEdge> directedGraph;

	/**
	 * holds the last added node of the graph
	 */
	protected ActivityNode lastAddedNode = null;
	
	/**
	 * holds the first added node ID of the graph
	 */
	protected String startActivityID = "";

	
	/**
	 * holds as key the linkname and as value an ActivityNode. The node matches
	 * with a source or the target of the link. An entry will be deleted if the
	 * corresponding source or target would be added to the Hashtable.
	 */
	protected Map<String, FlowLinkHelper> flowLinkMap = new Hashtable<String, FlowLinkHelper>();

	/**
	 * Initialize the GraphFactory1.
	 */
	public GraphFactory1() {
		directedGraph = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
	}

	/**
	 * Starts the building of the process graph for the given process.
	 * 
	 * @param process
	 */
	public DirectedGraph<ActivityNode, DefaultEdge> createGraphFromProcess(Process process) {
		for (EObject eobj : process.eContents()) {
			if (eobj instanceof Activity) {								
				Activity activity = (Activity) eobj;
				if (startActivityID.equalsIgnoreCase("")) {
//					startActivityID = IdentifierCacheHandler.getID(activity).toString();
					 if (activity instanceof Sequence || activity instanceof If || activity instanceof While
								|| activity instanceof RepeatUntil || activity instanceof Flow 
								|| activity instanceof Pick || activity instanceof ForEach 
								|| activity instanceof Scope){
						 			setStartActivityID(activity, true);
//						 			startActivityID += "Start";
								} else {
									setStartActivityID(activity, false);
								}
				}
				decideActivityTypeAndFurtherProcessing(activity, null, null);
			}
		}
		return this.directedGraph;
	}

	/**
	 * Creates for the given basic activity a appropriate graph node and add the
	 * vertex to the graph. The appropriate edges will also be added.
	 * 
	 * @param activity
	 *            The basic activity for which has to be added in the graph.
	 * @param containerActivityStart
	 *            The container start (structured) activity node in which the
	 *            given activity is in.
	 * @param containerActivityEnd
	 *            The container end (structured) activity node in which the
	 *            given activity is in.
	 */
	protected void handleBasicActivity(Activity activity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// create basic activity node
		ActivityNode activityNode = createBasicActivityNode(activity);
		// add the node to the process graph
		directedGraph.addVertex(activityNode);

		handleBasicActivityInSpecialContainer(activity, containerActivityStart,
				containerActivityEnd, activityNode);

		// set the edges for the corresponding links in a flow activity
		handleFlowLinksInBasicActivity(activity, activityNode);
	}

	/**
	 * Processes a sequence activity and creates appropriate nodes (start and
	 * end nodes) in the process graph. Contained activities will be created
	 * too.
	 * 
	 * @param sequenceActivity
	 *            The sequence for which nodes will be generated and added in
	 *            the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
	protected void handleSequenceActivity(Sequence sequenceActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(sequenceActivity);

		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(sequenceActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		for (EObject eobj : sequenceActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivity = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivity,
						startEndNodes[0], startEndNodes[1]);
			}
		}

		// add Edge between lastAddedNode and startEndNodes[1]
		directedGraph.addEdge(lastAddedNode, startEndNodes[1]);
		// set lastAddNode to startEndNodes[1]
		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(sequenceActivity,
				startEndNodes[0], startEndNodes[1]);

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
	protected abstract void handleIfActivity(If ifActivity,
			ActivityNode ContainerActivityStart,
			ActivityNode ContainerActivityEnd);

	/**
	 * Processes a while activity and creates appropriate nodes (start and end
	 * nodes) in the process graph. Contained activities will be created too.
	 * 
	 * @param whileActivity
	 *            The while activity for which nodes will be generated and added
	 *            in the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
	protected void handleWhileActivity(While whileActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(whileActivity);

		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(whileActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		for (EObject eobj : whileActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivity = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivity,
						startEndNodes[0], startEndNodes[1]);
			}
		}

		// add Edge between lastAddedNode and startEndNodes[1]
		directedGraph.addEdge(lastAddedNode, startEndNodes[1]);
		// set lastAddNode to startEndNodes[1]
		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(whileActivity, startEndNodes[0],
				startEndNodes[1]);
	}

	/**
	 * Processes a repeatUntil activity and creates appropriate nodes (start and
	 * end nodes) in the process graph. Contained activities will be created
	 * too.
	 * 
	 * @param repeatUntilActivity
	 *            The repeatUntil activity for which nodes will be generated and
	 *            added in the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
	protected void handleRepeatUntilActivity(RepeatUntil repeatUntilActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(repeatUntilActivity);

		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(repeatUntilActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		for (EObject eobj : repeatUntilActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivity = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivity,
						startEndNodes[0], startEndNodes[1]);
			}
		}

		// add Edge between lastAddedNode and startEndNodes[1]
		directedGraph.addEdge(lastAddedNode, startEndNodes[1]);
		// set lastAddNode to startEndNodes[1]
		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(repeatUntilActivity,
				startEndNodes[0], startEndNodes[1]);
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
	protected abstract void handlePickActivity(Pick pickActivity,
			ActivityNode ContainerActivityStart,
			ActivityNode ContainerActivityEnd);

	/**
	 * Processes a forEach activity and creates appropriate nodes (start and end
	 * nodes) in the process graph. Contained activities will be created too.
	 * 
	 * @param forEachActivity
	 *            The forEach activity for which nodes will be generated and
	 *            added in the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
	protected void handleForEachActivity(ForEach forEachActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(forEachActivity);

		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(forEachActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		Scope scopeInForEach = forEachActivity.getScope();
		handleScopeActivity(scopeInForEach, startEndNodes[0], startEndNodes[1]);

		// add Edge between lastAddedNode and startEndNodes[1]
		directedGraph.addEdge(lastAddedNode, startEndNodes[1]);

		// set lastAddNode to startEndNodes[1]
		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(forEachActivity,
				startEndNodes[0], startEndNodes[1]);
	}

	/**
	 * Processes a scope activity and creates appropriate nodes (start and end
	 * nodes) in the process graph. Contained activities will be created too.
	 * 
	 * @param scopeActivity
	 *            The scope activity for which nodes will be generated and added
	 *            in the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
	protected void handleScopeActivity(Scope scopeActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(scopeActivity);

		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(scopeActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		for (EObject eobj : scopeActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity activity = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(activity,
						startEndNodes[0], startEndNodes[1]);
			}
		}

		// add Edge between lastAddedNode and startEndNodes[1]
		directedGraph.addEdge(lastAddedNode, startEndNodes[1]);
		// set lastAddNode to startEndNodes[1]
		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(scopeActivity, startEndNodes[0],
				startEndNodes[1]);

	}

	/**
	 * Processes a flow activity and creates appropriate nodes (start and end
	 * nodes) in the process graph. Contained activities will be created too.
	 * 
	 * @param flowActivity
	 *            The flow activity for which nodes will be generated and added
	 *            in the process graph.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
	protected void handleFlowActivity(Flow flowActivity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// startEndNodes[0] == startNode, startEndNodes[1] == endNode
		StructuredActivityNode[] startEndNodes = createAndAddStructureActivityNode(flowActivity);
		
		// handle the additional edges when this activity is contained in a
		// flow, if,
		// of pick activity
		handleStructuredActivityInSpecialContainer(flowActivity,
				containerActivityStart, containerActivityEnd, startEndNodes);

		// further processing of contained activities
		for (EObject eobj : flowActivity.eContents()) {
			if (eobj instanceof Activity) {
				Activity containedActivity = (Activity) eobj;
				decideActivityTypeAndFurtherProcessing(containedActivity,
						startEndNodes[0], startEndNodes[1]);
			}
		}
		
		// *** New Version ***		
		directedGraph.addEdge(startEndNodes[0], startEndNodes[1]);

		// set lastAddNode to startEndNodes[1]
		lastAddedNode = startEndNodes[1];

		// handle flowLinks and add them to the graph
		handleFlowLinksInStructuredActivities(flowActivity, startEndNodes[0],
				startEndNodes[1]);
	}

	/**
	 * Returns a created activity node from the given activity. The given
	 * activity must be a basic activity. Does not add node to processGraph!!!
	 * 
	 * @param activity
	 *            Activity form which a graph node will be created.
	 * 
	 * @return the created activity node.
	 */
	protected ActivityNode createBasicActivityNode(Activity activity) {
//		return DbGraphPropertiesFactory.getInstance().createActivityNode(activity);
		return null;
	}

	/**
	 * Returns the two created SturcturedActivityNodes (startNode, endNode) in
	 * an array form the given bpel activity. The first one in the array is the
	 * startNode, the second the endNode. Does not add node to processGraph!!!
	 * 
	 * @param activity
	 *            the activity form which a graph node will be generated.
	 * @return a StructuredActivity object.
	 */
	protected StructuredActivityNode[] createStructuredActivityNode(
			Activity activity) {

//		StructuredActivityNode startNode = DbGraphPropertiesFactory.getInstance()
//				.createStructuredActivityNode(activity, true);
//		StructuredActivityNode endNode = DbGraphPropertiesFactory.getInstance()
//				.createStructuredActivityNode(activity, false);
//
//		// first one is startNode, second endNode
//		StructuredActivityNode[] resultNodes = { startNode, endNode };
//
//		return resultNodes;
		
		return null;
	}

	/**
	 * Add the given StructuredActivityNodes to the
	 * <code>this.processGraph<code>.
	 * 
	 * @param startNode the startNode of a structure activity
	 * @param endNode the endNode of a structure activity
	 */
	protected void addStructuredStartEndNodeToProcessGraph(
			StructuredActivityNode startNode, StructuredActivityNode endNode) {

		// add startNode to processGraph
		directedGraph.addVertex(startNode);

		// add endNode to processGraph
		directedGraph.addVertex(endNode);
	}

	/**
	 * Creates start/end-StructuredActivityNodes and add them to the
	 * processGraph. Returns the created structuredActivityNodes.
	 */
	protected StructuredActivityNode[] createAndAddStructureActivityNode(
			Activity activity) {
		StructuredActivityNode[] nodes = new StructuredActivityNode[2];
		nodes = createStructuredActivityNode(activity);
		addStructuredStartEndNodeToProcessGraph(nodes[0], nodes[1]);

		return nodes;
	}

	/**
	 * Handles the edges in the processGraph for special structured bpel
	 * activities. That is the flow (special here are
	 * <code>Links<code>), IF (special here are <code>ElseIf, Else<code> branches)
	 *  and pick (special here are <code>OnMessage<code> container) activity.
	 * 
	 * @param activity
	 *            a structured bpel activity.
	 * @param ContainerActivityStart
	 *            a startNode StructuredActivityNode which contains the given
	 *            activity.
	 * @param containerActivityEnd
	 *            an endNode StructuredActivityNode which contains the given
	 *            activity.
	 * @param startEndNodes
	 *            the start/end StructuredActivityNodes for the given bpel
	 *            activity.
	 */
	protected void handleStructuredActivityInSpecialContainer(
			Activity activity, ActivityNode ContainerActivityStart,
			ActivityNode containerActivityEnd,
			StructuredActivityNode[] startEndNodes) {
		// if activity is in a pick or IF container, add Edges from
		// pickStart to activity and activity to PickEnd
		if (ContainerActivityStart != null
				&& containerActivityEnd != null
				&& (ContainerActivityStart.getActivityType() == ActivityType.IF || ContainerActivityStart
						.getActivityType() == ActivityType.PICK)) {

			directedGraph.addEdge(ContainerActivityStart, startEndNodes[0]);
			
			// *** New version ***
			// processFlowGraph.getProcessGraph().addEdge(startEndNodes[1],
			//					containerActivityEnd);
			// set lastAddedNode to the new node
			lastAddedNode = startEndNodes[0];

			// if activity is in Flow container, de.uni.stuttgart.bpelSearching.test if activity should
			// have an edge between flowStart and flowEnd node. Create these
			// edges if Sources or Targets or both == null
		} else if (ContainerActivityStart != null
				&& containerActivityEnd != null
				&& (ContainerActivityStart.getActivityType() == ActivityType.FLOW)) {
			Sources sources = activity.getSources();
			Targets targets = activity.getTargets();

			// activity has not any outgoing edges, create edge with flowEnd
			// activity node
			// *** New version ***
			// if (sources == null) {
			//		processFlowGraph.getProcessGraph().addEdge(startEndNodes[1],
			//						containerActivityEnd);
			//	}
			// activity has not any incoming edges, create edge with flowStart
			// activity node
			if (targets == null) {
				directedGraph.addEdge(ContainerActivityStart, startEndNodes[0]);
			}
			// set lastAddedNode to the new node
			lastAddedNode = startEndNodes[0];

			// container activity is not a special container and graph can be
			// build with the information in lastAddedNode
		} else {
			if (lastAddedNode != null) {
				// add Edge between lastAddedNode and startNode
				directedGraph.addEdge(lastAddedNode, startEndNodes[0]);

				// set sartNode to lastAddedNode
				lastAddedNode = startEndNodes[0];
			} else {
				lastAddedNode = startEndNodes[0];
			}
		}
	}

	/**
	 * Handles the edges in the processGraph for special structured bpel
	 * activities. That is the flow (special here are
	 * <code>Links<code>), IF (special here are <code>ElseIf, Else<code> branches)
	 *  and pick (special here are <code>OnMessage<code> container) activity.
	 * 
	 * @param activity
	 *            a basic bpel activity.
	 * @param ContainerActivityStart
	 *            a startNode StructuredActivityNode which contains the given
	 *            activity.
	 * @param containerActivityEnd
	 *            an endNode StructuredActivityNode which contains the given
	 *            activity.
	 * @param startEndNodes
	 *            the start/end StructuredActivityNodes for the given bpel
	 *            activity.
	 */
	protected void handleBasicActivityInSpecialContainer(Activity activity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd, ActivityNode activityNode) {
		// if activity is in a pick or IF container, add Edges from
		// pickStart to activity and activity to PickEnd
		if (containerActivityStart != null
				&& containerActivityEnd != null
				&& (containerActivityStart.getActivityType() == ActivityType.IF || containerActivityStart
						.getActivityType() == ActivityType.PICK)) {

			directedGraph.addEdge(containerActivityStart, activityNode);
			// *** New version ***
//			processFlowGraph.getProcessGraph().addEdge(activityNode,
//					containerActivityEnd);
			// set lastAddedNode to the new node
			lastAddedNode = activityNode;

			// if activity is in Flow container, de.uni.stuttgart.bpelSearching.test if activity should
			// have an edge between flowStart and flowEnd node. Create these
			// edges if Sources or Targets or both == null
		} else if (containerActivityStart != null
				&& containerActivityEnd != null
				&& (containerActivityStart.getActivityType() == ActivityType.FLOW)) {
			Sources sources = activity.getSources();
			Targets targets = activity.getTargets();

			// activity has not any outgoing edges, create edge with flowEnd
			// activity node
			
			// *** New version ***
//			if (sources == null) {
//				processFlowGraph.getProcessGraph().addEdge(activityNode,
//						containerActivityEnd);
//			}
			
			// activity has not any incoming edges, create edge with flowStart
			// activity node
			if (targets == null) {
				directedGraph.addEdge(containerActivityStart, activityNode);
			}
			// set lastAddedNode to the new node
			lastAddedNode = activityNode;

		} else {
			if (lastAddedNode != null) {
				// add edge between lastAddedNode and new node
				directedGraph.addEdge(lastAddedNode, activityNode);
				// set lastAddedNode to the new node
				lastAddedNode = activityNode;
			} else {
				// lastAddedNode == null, no edge has to be added
				// set lastAddedNode to the new node
				lastAddedNode = activityNode;
			}
		}
	}

	protected void handleFlowLinksInBasicActivity(Activity activity,
			ActivityNode activityNode) {
		// get all links from flow in which this activity is source or target
		Sources sourcesFlow = activity.getSources();
		Targets targetsFlow = activity.getTargets();

		if (sourcesFlow != null) {
			EList<Source> sourcesList = sourcesFlow.getSource();
			// go through all sources and get the contained linknames, then add
			// the linkname with the appropriate FlowLinkHelper object in the
			// flowLinkMap if it does not contain the linkname already.
			// Otherwise create edge and add edge to the graph.
			for (Source source : sourcesList) {

				String linkName = source.getLinkName();
				if (!flowLinkMap.containsKey(linkName)) {
					FlowLinkHelper flowLinkHelperBasic = new FlowLinkHelperBasicActivity(
							activityNode, true);
					flowLinkMap.put(linkName, flowLinkHelperBasic);
					// linkname is already in flowLinkMap, create edge and add
					// it to the graph, remove the entry from the flowLinkMap
				} else {
					FlowLinkHelper flowLinkHelperObj = flowLinkMap
							.get(linkName);
					if (flowLinkHelperObj instanceof FlowLinkHelperBasicActivity) {
						FlowLinkHelperBasicActivity flowLinkHelperBasicActivity = (FlowLinkHelperBasicActivity) flowLinkHelperObj;
						ActivityNode targetNode = flowLinkHelperBasicActivity
								.getBasicActivityNode();
						directedGraph.addEdge(activityNode, targetNode);
					} else if (flowLinkHelperObj instanceof FlowLinkHelperStructuredActivity) {
						FlowLinkHelperStructuredActivity flowLinkHelperStructuredActivity = (FlowLinkHelperStructuredActivity) flowLinkHelperObj;
						ActivityNode targetNode = flowLinkHelperStructuredActivity
								.getNodeStart();
						directedGraph.addEdge(activityNode, targetNode);
					}
					// remove entry from flowLinkMap
					flowLinkMap.remove(linkName);
				}
			}
		}

		if (targetsFlow != null) {
			EList<Target> targetsList = targetsFlow.getTarget();
			for (Target target : targetsList) {

				// add linkName and activityNode to flowLinkMap
				String linkName = target.getLinkName();
				if (!flowLinkMap.containsKey(linkName)) {
					FlowLinkHelper flowLinkHelperBasic = new FlowLinkHelperBasicActivity(
							activityNode, false);
					flowLinkMap.put(linkName, flowLinkHelperBasic);
					// linkName is already in flowLinkMap, create edge and add
					// it to the graph, remove entry from flowLinkMap
				} else {
					FlowLinkHelper flowLinkHelperObj = flowLinkMap
							.get(linkName);
					if (flowLinkHelperObj instanceof FlowLinkHelperBasicActivity) {
						FlowLinkHelperBasicActivity flowLinkHelperBasicActivity = (FlowLinkHelperBasicActivity) flowLinkHelperObj;
						ActivityNode sourceNode = flowLinkHelperBasicActivity
								.getBasicActivityNode();
						directedGraph.addEdge(sourceNode, activityNode);
					} else if (flowLinkHelperObj instanceof FlowLinkHelperStructuredActivity) {
						FlowLinkHelperStructuredActivity flowLinkHelperStructuredActivity = (FlowLinkHelperStructuredActivity) flowLinkHelperObj;
						ActivityNode sourceNode = flowLinkHelperStructuredActivity
								.getNodeEnd();
						directedGraph.addEdge(sourceNode, activityNode);
					}
					// remove entry from flowLinkMap
					flowLinkMap.remove(linkName);
				}
			}

		}
	}

	/**
	 * Adds all corresponding links to the ProcessGraph for the given
	 * structured activity. The method sets the appropriate links.
	 * <p>
	 * If the given structured activity is a target of a link then an edge is
	 * added to the start-StructuredActivityNode. If the given structured
	 * activity is source of a link then an edge is added to the
	 * end-StructuredActivityNode.
	 * 
	 * @param activity
	 *            the structured activity which will be handled
	 * @param startNode
	 *            the generated start-StructuredActivityNode of the given
	 *            structured activity
	 * @param endNode
	 *            the generated end-StructuredActivityNode of the given
	 *            structured activity
	 */

	protected void handleFlowLinksInStructuredActivities(Activity activity,
			ActivityNode startNode, ActivityNode endNode) {

		// get all links from flow in which this activity is source or target
		Sources sourcesFlow = activity.getSources();
		Targets targetsFlow = activity.getTargets();

		if (sourcesFlow != null) {
			EList<Source> sourcesList = sourcesFlow.getSource();
			// go through all sources and get the contained linknames, then add
			// the linkname with the appropriate FlowLinkHelper object in the
			// flowLinkMap if it does not contain the linkname already.
			// Otherwise create edge and add edge to the graph.
			for (Source source : sourcesList) {

				String linkName = source.getLinkName();
				if (!flowLinkMap.containsKey(linkName)) {
					FlowLinkHelper flowLinkHelperBasic = new FlowLinkHelperStructuredActivity(
							startNode, endNode, true);
					flowLinkMap.put(linkName, flowLinkHelperBasic);
					// linkname is already in flowLinkMap, create edge and add
					// it to the graph, remove the entry from the flowLinkMap
				} else {
					FlowLinkHelper flowLinkHelperObj = flowLinkMap
							.get(linkName);
					if (flowLinkHelperObj instanceof FlowLinkHelperBasicActivity) {
						FlowLinkHelperBasicActivity flowLinkHelperBasicActivity = (FlowLinkHelperBasicActivity) flowLinkHelperObj;
						ActivityNode targetNode = flowLinkHelperBasicActivity
								.getBasicActivityNode();
						directedGraph.addEdge(endNode,targetNode);
					} else if (flowLinkHelperObj instanceof FlowLinkHelperStructuredActivity) {
						FlowLinkHelperStructuredActivity flowLinkHelperStructuredActivity = (FlowLinkHelperStructuredActivity) flowLinkHelperObj;
						ActivityNode targetNode = flowLinkHelperStructuredActivity
								.getNodeStart();
						directedGraph.addEdge(endNode, targetNode);
					}
					// remove entry from flowLinkMap
					flowLinkMap.remove(linkName);
				}
			}
		}

		if (targetsFlow != null) {
			EList<Target> targetsList = targetsFlow.getTarget();
			for (Target target : targetsList) {

				// add linkName and activityNode to flowLinkMap
				String linkName = target.getLinkName();
				if (!flowLinkMap.containsKey(linkName)) {
					FlowLinkHelper flowLinkHelperBasic = new FlowLinkHelperStructuredActivity(
							startNode, endNode, false);
					flowLinkMap.put(linkName, flowLinkHelperBasic);
					// linkName is already in flowLinkMap, create edge and add
					// it to the graph, remove entry from flowLinkMap
				} else {
					FlowLinkHelper flowLinkHelperObj = flowLinkMap
							.get(linkName);
					if (flowLinkHelperObj instanceof FlowLinkHelperBasicActivity) {
						FlowLinkHelperBasicActivity flowLinkHelperBasicActivity = (FlowLinkHelperBasicActivity) flowLinkHelperObj;
						ActivityNode sourceNode = flowLinkHelperBasicActivity
								.getBasicActivityNode();
						directedGraph.addEdge(sourceNode, startNode);
					} else if (flowLinkHelperObj instanceof FlowLinkHelperStructuredActivity) {
						FlowLinkHelperStructuredActivity flowLinkHelperStructuredActivity = (FlowLinkHelperStructuredActivity) flowLinkHelperObj;
						ActivityNode sourceNode = flowLinkHelperStructuredActivity
								.getNodeEnd();
						directedGraph.addEdge(sourceNode, startNode);
					}
					// remove entry from flowLinkMap
					flowLinkMap.remove(linkName);
				}
			}

		}
	}

	/**
	 * Decides type of given activity and start further processing of the
	 * activity.
	 * 
	 * @param activity
	 *            Activity whose type should be detected.
	 * @param containerActivityStart
	 *            the start-StructuredActivityNode from a structured bpel
	 *            activity which contains the given activity
	 * @param containerActivityEnd
	 *            the end-StructuredActivityNode from a structured bpel activity
	 *            which contains the given activity
	 */
	protected void decideActivityTypeAndFurtherProcessing(Activity activity,
			ActivityNode containerActivityStart,
			ActivityNode containerActivityEnd) {

		// basic activities
		if (activity instanceof Invoke || activity instanceof Receive
				|| activity instanceof Reply || activity instanceof Assign
				|| activity instanceof Throw || activity instanceof Wait
				|| activity instanceof Empty || activity instanceof Rethrow
				|| activity instanceof Exit
				|| activity instanceof ExtensionActivity) {

			// create basic activity nodes add them in the graph and set edges
			// in the graph
			handleBasicActivity(activity, containerActivityStart,
					containerActivityEnd);

			// structured activities
		} else if (activity instanceof Sequence) {
			Sequence sequenceActivity = (Sequence) activity;
			handleSequenceActivity(sequenceActivity, containerActivityStart,
					containerActivityEnd);
		} else if (activity instanceof If) {
			If ifActivity = (If) activity;
			handleIfActivity(ifActivity, containerActivityStart,
					containerActivityEnd);
		} else if (activity instanceof While) {
			While whileActivity = (While) activity;
			handleWhileActivity(whileActivity, containerActivityStart,
					containerActivityEnd);
		} else if (activity instanceof RepeatUntil) {
			RepeatUntil repeatUntilActivity = (RepeatUntil) activity;
			handleRepeatUntilActivity(repeatUntilActivity,
					containerActivityStart, containerActivityEnd);
		} else if (activity instanceof Pick) {
			Pick pickActivity = (Pick) activity;
			handlePickActivity(pickActivity, containerActivityStart,
					containerActivityEnd);
		} else if (activity instanceof Flow) {
			Flow flowActivity = (Flow) activity;
			handleFlowActivity(flowActivity, containerActivityStart,
					containerActivityEnd);
		} else if (activity instanceof ForEach) {
			ForEach forEachActivity = (ForEach) activity;
			handleForEachActivity(forEachActivity, containerActivityStart,
					containerActivityEnd);
		} else if (activity instanceof Scope) {
			Scope scopeActivity = (Scope) activity;
			handleScopeActivity(scopeActivity, containerActivityStart,
					containerActivityEnd);
		} else {
			// TODO throw no activity exist exception
		}
	}

	public String getStartActivityID() {
		return startActivityID;
	}

	public void setStartActivityID(String startActivityID) {
		this.startActivityID = startActivityID;
	}
	
	/**
	 * Sets the start activity id. The concrete implementation is in sub-classes.
	 * 
	 * @param startAct the start activity
	 * @param isStructured indicates whether it is a start activity
	 */
	protected void setStartActivityID(Activity startAct, boolean isStructured) {
		
	}
}

