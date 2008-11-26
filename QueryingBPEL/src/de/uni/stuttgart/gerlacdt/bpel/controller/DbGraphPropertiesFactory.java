package de.uni.stuttgart.gerlacdt.bpel.controller;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Receive;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Reply;

import de.uni.stuttgart.bpelSearching.GraphMapping.StructuredProcessGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.StructuredQueryGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.ProcessGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.QueryGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.StandardProcessGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.StandardQueryGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityInvokeNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityReceiveNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityReplyNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityType;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.database.DatabaseConfiguration;
import de.uni.stuttgart.gerlacdt.bpel.database.MysqlConfiguration;
import de.uni.stuttgart.gerlacdt.bpel.database.PostgresqlConfiguration;


public class DbGraphPropertiesFactory {

	private static DbGraphPropertiesFactory instance = new DbGraphPropertiesFactory();

	private DbGraphPropertiesFactory() {

	}

	public static DbGraphPropertiesFactory getInstance() {
		return instance;
	}

	public DatabaseConfiguration getDBConfiguration() {

		DatabaseConfiguration dbConfiguration = null;
		if (PropertyLoader.getInstance().getDbProperties()
				.getProperty("dbType").equals("postgresql")) {
			dbConfiguration = new PostgresqlConfiguration();
		} else if (PropertyLoader.getInstance().getDbProperties().getProperty(
				"dbType").equals("mysql")) {
			dbConfiguration = new MysqlConfiguration();
		}

		return dbConfiguration;
	}

	/**
	 * Returns a ProcessGraphFactory1 which corresponds to the properties in
	 * the user property file.
	 * 
	 * @param process
	 *            a given bpel process.
	 *            
	 * @return a ProcessGraphFactory1
	 */
	public ProcessGraphFactory1 getProcessGraphFactory(Process process) {

		ProcessGraphFactory1 processGraphFactory = null;
		if (PropertyLoader.getInstance().getUserProperties().getProperty(
				"processGraph").equals("standard")) {

			processGraphFactory = new StandardProcessGraphFactory1(
					process);
		} else if (PropertyLoader.getInstance().getUserProperties()
				.getProperty("processGraph").equals("structured")) {

			processGraphFactory = new StructuredProcessGraphFactory1(
					process);
		}
		return processGraphFactory;
	}
	
	/**
	 * Returns a QueryGraphFactory1 which corresponds to the properties in
	 * the user property file.
	 *            
	 * @return a QueryGraphFactory1
	 */
	public QueryGraphFactory1 getQueryGraphFactory() {
		QueryGraphFactory1 queryGraphFactory = null;
		if (PropertyLoader.getInstance().getUserProperties().getProperty(
				"processGraph").equals("standard")) {

			queryGraphFactory = new StandardQueryGraphFactory1();
		} else if (PropertyLoader.getInstance().getUserProperties()
				.getProperty("processGraph").equals("structured")) {

			queryGraphFactory = new StructuredQueryGraphFactory1();
		}
		return queryGraphFactory;
	}

	/**
	 * Creates an ActivityNode from the given bpel activity for the process graph.
	 * 
	 * @param activity
	 *            a bpel activity from which a ActivityNode is created.
	 * @return an ActivityNode
	 */
	public ActivityNode createActivityNodeForProcessGraph(Activity activity) {
		
		String inputVariableAttr, operationAttr, outputVariableAttr, variableAttr,
		partnerlinkAttr, porttypeAttr;

		ActivityNode node = null;

		// check properties which ActivityNode should be created; one can add
		// much more NodeTypes here.
		if (PropertyLoader.getInstance().getUserProperties().getProperty(
				"nodeType").equals("normal")) {
			// get activity type
			int activityType = ActivityType.getActivityType(activity);
			// get activity name
			String activityName;
			if (activity.getName() == null) {
				activityName = "";
			} else {
				activityName = activity.getName();
			}
			
			String activityContainerID;
			
			if (activity.eContainer() == null) {
				activityContainerID = "";				
			} else {
				EObject container = activity.eContainer();
				activityContainerID = IdentifierCacheHandler.getID(container).toString();
			}
				
			if (activity instanceof Invoke) {
				if (((Invoke)activity).getInputVariable() == null) {
					inputVariableAttr =	"";
				} else {
					inputVariableAttr =	((Invoke)activity).getInputVariable();
				}
				
				if (((Invoke)activity).getOutputVariable() == null) {
					outputVariableAttr = "";
				} else {
					outputVariableAttr = ((Invoke)activity).getOutputVariable();
				}
				
				if (((Invoke)activity).getOperation() == null) {
					operationAttr = "";
				} else {
					operationAttr = ((Invoke)activity).getOperation();
				}
				
				if (((Invoke)activity).getPortType() == null) {
					porttypeAttr = "";
				} else {
					porttypeAttr = ((Invoke)activity).getPortType().toString();
				}
				
				if (((Invoke)activity).getPartnerLink() == null) {
					partnerlinkAttr = "";
				} else {
					partnerlinkAttr = ((Invoke)activity).getPartnerLink();
				}
				
				node = new ActivityInvokeNode(IdentifierCacheHandler.getID(activity)
				.toString(), activityName, activityType, activityContainerID, partnerlinkAttr, 
				porttypeAttr, operationAttr, inputVariableAttr, outputVariableAttr);
				
			} else if (activity instanceof Receive) {
				if (((Receive)activity).getVariable() == null) {
					variableAttr = "";
				} else {
					variableAttr = ((Receive)activity).getVariable();
				}
				
				if (((Receive)activity).getOperation() == null) {
					operationAttr = "";
				} else {
					operationAttr = ((Receive)activity).getOperation();
				}
				
				if (((Receive)activity).getPortType() == null) {
					porttypeAttr = "";
				} else {
					porttypeAttr = ((Receive)activity).getPortType().toString();
				}
				
				if (((Receive)activity).getPartnerLink() == null) {
					partnerlinkAttr = "";
				} else {
					partnerlinkAttr = ((Receive)activity).getPartnerLink();
				}
				
				node = new ActivityReceiveNode(IdentifierCacheHandler.getID(activity)
						.toString(), activityName, activityType, activityContainerID, partnerlinkAttr, 
						porttypeAttr, operationAttr, variableAttr);
				
			} else if (activity instanceof Reply) {
				if (((Reply)activity).getVariable() == null) {
					variableAttr = "";
				} else {
					variableAttr = ((Reply)activity).getVariable();
				}
				
				if (((Reply)activity).getOperation() == null) {
					operationAttr = "";
				} else {
					operationAttr = ((Reply)activity).getOperation();
				}
				
				if (((Reply)activity).getPortType() == null) {
					porttypeAttr = "";
				} else {
					porttypeAttr = ((Reply)activity).getPortType().toString();
				}
				
				if (((Reply)activity).getPartnerLink() == null) {
					partnerlinkAttr = "";
				} else {
					partnerlinkAttr = ((Reply)activity).getPartnerLink();
				}
				
				node = new ActivityReplyNode(IdentifierCacheHandler.getID(activity)
						.toString(), activityName, activityType, activityContainerID, partnerlinkAttr, 
						porttypeAttr, operationAttr, variableAttr);				
			} else {
				node = new ActivityNode(IdentifierCacheHandler.getID(activity)
						.toString(), activityName, activityType, activityContainerID);				
			}
		}
		return node;
	}
	
	
	/**
	 * Creates an ActivityNode from the given bpel activity for the query graph.
	 * 
	 * @param activity
	 *            a bpel activity from which a ActivityNode is created.
	 * @param activityID
	 * 			  the activity id
	 * @param containerID
	 * 			  the container id
	 * 
	 * @return an ActivityNode
	 */
	public ActivityNode createActivityNodeForQueryGraph(Activity activity, 
			String activityID, String containerID) {
		
		String inputVariableAttr, operationAttr, outputVariableAttr, variableAttr,
		partnerlinkAttr, porttypeAttr;

		ActivityNode node = null;

		// check properties which ActivityNode should be created; one can add
		// much more NodeTypes here.
		if (PropertyLoader.getInstance().getUserProperties().getProperty(
				"nodeType").equals("normal")) {
			// get activity type
			int activityType = ActivityType.getActivityType(activity);
			// get activity name
			String activityName;
			if (activity.getName() == null) {
				activityName = "";
			} else {
				activityName = activity.getName();
			}
				
			if (activity instanceof Invoke) {
				if (((Invoke)activity).getInputVariable() == null) {
					inputVariableAttr =	"";
				} else {
					inputVariableAttr =	((Invoke)activity).getInputVariable();
				}
				
				if (((Invoke)activity).getOutputVariable() == null) {
					outputVariableAttr = "";
				} else {
					outputVariableAttr = ((Invoke)activity).getOutputVariable();
				}
				
				if (((Invoke)activity).getOperation() == null) {
					operationAttr = "";
				} else {
					operationAttr = ((Invoke)activity).getOperation();
				}
				
				if (((Invoke)activity).getPortType() == null) {
					porttypeAttr = "";
				} else {
					porttypeAttr = ((Invoke)activity).getPortType().toString();
				}
				
				if (((Invoke)activity).getPartnerLink() == null) {
					partnerlinkAttr = "";
				} else {
					partnerlinkAttr = ((Invoke)activity).getPartnerLink();
				}
				
				node = new ActivityInvokeNode(activityID, activityName, activityType, containerID, 
						partnerlinkAttr, porttypeAttr, operationAttr, inputVariableAttr, outputVariableAttr);
				
			} else if (activity instanceof Receive) {
				if (((Receive)activity).getVariable() == null) {
					variableAttr = "";
				} else {
					variableAttr = ((Receive)activity).getVariable();
				}
				
				if (((Receive)activity).getOperation() == null) {
					operationAttr = "";
				} else {
					operationAttr = ((Receive)activity).getOperation();
				}
				
				if (((Receive)activity).getPortType() == null) {
					porttypeAttr = "";
				} else {
					porttypeAttr = ((Receive)activity).getPortType().toString();
				}
				
				if (((Receive)activity).getPartnerLink() == null) {
					partnerlinkAttr = "";
				} else {
					partnerlinkAttr = ((Receive)activity).getPartnerLink();
				}
				
				node = new ActivityReceiveNode(activityID, activityName, activityType, containerID, 
						partnerlinkAttr, porttypeAttr, operationAttr, variableAttr);
				
			} else if (activity instanceof Reply) {
				if (((Reply)activity).getVariable() == null) {
					variableAttr = "";
				} else {
					variableAttr = ((Reply)activity).getVariable();
				}
				
				if (((Reply)activity).getOperation() == null) {
					operationAttr = "";
				} else {
					operationAttr = ((Reply)activity).getOperation();
				}
				
				if (((Reply)activity).getPortType() == null) {
					porttypeAttr = "";
				} else {
					porttypeAttr = ((Reply)activity).getPortType().toString();
				}
				
				if (((Reply)activity).getPartnerLink() == null) {
					partnerlinkAttr = "";
				} else {
					partnerlinkAttr = ((Reply)activity).getPartnerLink();
				}
				
				node = new ActivityReplyNode(activityID, activityName, activityType, 
						containerID, partnerlinkAttr, porttypeAttr, operationAttr, variableAttr);				
			} else {
				node = new ActivityNode(activityID, activityName, activityType, containerID);				
			}
		}
		return node;
	}

	/**
	 * Creates a StructuredActivityNode from the given bpel activity.
	 * 
	 * @param activity
	 *            a structured bpel activity from which a StructuredActivityNode
	 *            is generated.
	 * @param isStartNode
	 *            boolean value, if the ActivityNode which will be created, is a
	 *            startNode or an endNode.
	 *            
	 * @return a created StructuredActivityNode
	 */
	public StructuredActivityNode createStructuredActivityNodeForProcessGraph(
			Activity activity, boolean isStartNode) {

		StructuredActivityNode node = null;
		if (PropertyLoader.getInstance().getUserProperties().getProperty(
				"nodeType").equals("normal")) {
			// create attributes needed for the flow nodes like name, processId
			// activityId and activityType
			int activityType = ActivityType.getActivityType(activity);

			String id = IdentifierCacheHandler.getID(activity).toString();
			String name = null;
			if (activity.getName() == null) {
				name = "";
			} else {
				name = activity.getName();
			}
			
			// Give different name and id to distinguish between start end nodes
			// *** New Version ***
			if(isStartNode) {
				name = name + "Start";
				id = id + "Start";
			} else {
				name = name + "End";
				id = id + "End";
			}

			// create node
			if (activity.eContainer() != null) {
				// construct the activity node
				EObject container = activity.eContainer();

				node = new StructuredActivityNode(id, name, activityType,
						IdentifierCacheHandler.getID(container).toString(),
						isStartNode);
			} else {
				// construct the activity node
				node = new StructuredActivityNode(id, name, activityType, "",
						isStartNode);
			}
		}

		return node;
	}
	
	
	/**
	 * Creates a StructuredActivityNode from the given bpel activity.
	 * 
	 * @param activity
	 *            a structured bpel activity from which a StructuredActivityNode
	 *            is generated.
	 * @param isStartNode
	 *            boolean value, if the ActivityNode which will be created, is a
	 *            startNode or an endNode.
	 * @param activityID
	 * 			  the activity id
	 * @param containerID
	 * 			  the container id
	 * 
	 * @return a created StructuredActivityNode
	 */
	public StructuredActivityNode createStructuredActivityNodeForQueryGraph(Activity activity, 
			boolean isStartNode, String activityID, String containerID) {

		StructuredActivityNode node = null;
		if (PropertyLoader.getInstance().getUserProperties().getProperty(
				"nodeType").equals("normal")) {
			// create attributes needed for the flow nodes like name, processId
			// activityId and activityType
			int activityType = ActivityType.getActivityType(activity);
			String name = null;
			if (activity.getName() == null) {
				name = "";
			} else {
				name = activity.getName();
			}
			
			// Give different name and id to distinguish between start end nodes
			// *** New Version ***
			if(isStartNode) {
				name = name + "Start";
				activityID = activityID + "Start";
			} else {
				name = name + "End";
				activityID = activityID + "End";
			}

			// create node
			node = new StructuredActivityNode(activityID, name, activityType,
					containerID, isStartNode);
		}

		return node;
	}

}
