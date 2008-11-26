/**
 * 
 */
package de.uni.stuttgart.bpelSearching.GraphMapping;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;

/**
 * @author luwei
 *
 */
public abstract class QueryGraphFactory1 extends GraphFactory1 {
	protected QueryGraph queryGraph;
	protected int idCount = 0; 
	protected Map<EObject, String> structuredActivityIDMap = 
		new HashMap<EObject, String>();

	/**
	 * Initialize the QueryGraphFactory1.
	 */
	public QueryGraphFactory1() {
		super();
	}
	
	/**
	 * Starts the building of the query graph for the given process.
	 * 
	 * @param process
	 */
	public QueryGraph createQueryGraph(Process process) {
		DirectedGraph<ActivityNode, DefaultEdge> qGraph = createGraphFromProcess(process);
		this.queryGraph = new QueryGraph(qGraph);
		return this.queryGraph;
	}
	
	public QueryGraph getQueryGraph() {
		return queryGraph;
	}

	public void setQueryGraph(QueryGraph queryGraph) {
		this.queryGraph = queryGraph;
	}
	
    /**
     * @see GraphFactory1#createBasicActivityNode(activity)
     */
	protected ActivityNode createBasicActivityNode(Activity activity) {
		idCount++;
		String actID = "Qbasic" + idCount;
		String activityContainerID;
		
		if (activity.eContainer() == null) {
			activityContainerID = "";				
		} else {
			EObject container = activity.eContainer();
//			if (container instanceof Activity) {
//				conActivity = (Activity) container;
//				activityContainerID = structuredActivityIDMap.get(conActivity);
//				if (activityContainerID == null) {
//					activityContainerID = "";
//				}
//			} else {
//				activityContainerID = "";
//			}
			activityContainerID = structuredActivityIDMap.get(container);
			if (activityContainerID == null) {
				activityContainerID = "";
			}
		}
		return DbGraphPropertiesFactory.getInstance().createActivityNodeForQueryGraph(activity, actID, activityContainerID);
	}
	
    /**
     * @see GraphFactory1#createStructuredActivityNode(activity)
     */
	protected StructuredActivityNode[] createStructuredActivityNode(
			Activity activity) {
		String activityContainerID;
		
		if (activity.eContainer() == null) {
			activityContainerID = "";				
		} else {
			EObject container = activity.eContainer();
			activityContainerID = structuredActivityIDMap.get(container);
			if (activityContainerID == null) {
				activityContainerID = "";
			}
		}
		
		idCount++;
		String actID = "Qstructured" + idCount;
		StructuredActivityNode startNode = DbGraphPropertiesFactory.getInstance()
				.createStructuredActivityNodeForQueryGraph(activity, true, actID, activityContainerID);
		
//		actID = "Qstructured" + idCount + "End";
		StructuredActivityNode endNode = DbGraphPropertiesFactory.getInstance()
				.createStructuredActivityNodeForQueryGraph(activity, false, actID, activityContainerID);

		structuredActivityIDMap.put(activity, actID);
		// first one is startNode, second endNode
		StructuredActivityNode[] resultNodes = { startNode, endNode };

		return resultNodes;
	}
	
    /**
     * @see GraphFactory1#setStartActivityID(startAct, isStructured)
     */
	protected void setStartActivityID(Activity startAct, boolean isStructured) {
		// TODO Auto-generated method stub
		startActivityID = "" + idCount;
		if (isStructured) {
			startActivityID += "Start";
		}
	}
}
