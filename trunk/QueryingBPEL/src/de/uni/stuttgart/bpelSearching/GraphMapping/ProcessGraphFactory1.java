/**
 * 
 */
package de.uni.stuttgart.bpelSearching.GraphMapping;

import java.util.Set;

import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.StructuredActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;

/**
 * @author luwei
 *
 */
public abstract class ProcessGraphFactory1 extends GraphFactory1 {
	/**
	 * the generated BPEL process
	 */
	protected ProcessGraph processFlowGraph;
	protected String processId;
	
	/**
	 * Initialize the ProcessGraphFactory1 with the given BPEL process.
	 * 
	 * @param process
	 *            Input BPEL process from which a {@link ProcessGraph} will
	 *            be generated.
	 */
	public ProcessGraphFactory1(Process process) {
		super();
		this.processId = IdentifierCacheHandler.getID(process).toString();
		processFlowGraph = new ProcessGraph(process.getName(), process
				.getTargetNamespace(), processId);
				//new ActivityTypeIsomorphismTestStrategy());
	}
	
	/**
	 * Starts the building of the process graph for the given process.
	 * 
	 * @param process
	 */
	public ProcessGraph createProcessFlowGraph(Process process) {
		this.processFlowGraph.setGraph(createGraphFromProcess(process));		
		// Set start activity of the process.
		Set<ActivityNode> nodes = processFlowGraph.getGraph().vertexSet();
		for (ActivityNode node : nodes) {
			if(node.getActivityID().compareTo(startActivityID) == 0) {
				processFlowGraph.setStartActivity(node);
				break;
			}			
		}	
		return this.processFlowGraph;
	}
	
    /**
     * @see GraphFactory1#createBasicActivityNode(activity)
     */
	protected ActivityNode createBasicActivityNode(Activity activity) {
		return DbGraphPropertiesFactory.getInstance().createActivityNodeForProcessGraph(activity);
	}
	
    /**
     * @see GraphFactory1#createStructuredActivityNode(activity)
     */
	protected StructuredActivityNode[] createStructuredActivityNode(
			Activity activity) {

		StructuredActivityNode startNode = DbGraphPropertiesFactory.getInstance()
				.createStructuredActivityNodeForProcessGraph(activity, true);
		StructuredActivityNode endNode = DbGraphPropertiesFactory.getInstance()
				.createStructuredActivityNodeForProcessGraph(activity, false);

		// first one is startNode, second endNode
		StructuredActivityNode[] resultNodes = { startNode, endNode };

		return resultNodes;
	}
	
    /**
     * @see GraphFactory1#setStartActivityID(startAct, isStructured)
     */
	protected void setStartActivityID(Activity startAct, boolean isStructured) {
		// TODO Auto-generated method stub
		startActivityID = IdentifierCacheHandler.getID(startAct).toString();
		if (isStructured) {
			startActivityID += "Start";
		}
	}
}
