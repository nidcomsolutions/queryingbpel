/**
 * 
 */
package de.uni.stuttgart.gerlacdt.bpel.GraphMapping;

import java.util.Set;

import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public abstract class ProcessFlowGraphFactory extends GraphFactory {
	/**
	 * the generated BPEL process
	 */
	protected ProcessFlowGraph processFlowGraph;
	protected String processId;
	
	/**
	 * Initialize the StandardProcessFlowGraphFactory with the given BPEL
	 * process.
	 * 
	 * @param process
	 *            Input BPEL process from which a {@link ProcessFlowGraph} will
	 *            be generated.
	 */
	public ProcessFlowGraphFactory(Process process) {
		super();
		this.processId = IdentifierCacheHandler.getID(process).toString();
		processFlowGraph = new ProcessFlowGraph(process.getName(), process
				.getTargetNamespace(), processId);
				//new ActivityTypeIsomorphismTestStrategy());
	}
	
	/**
	 * Starts the building of the process graph for the given process.
	 * 
	 * @param process
	 */
	public ProcessFlowGraph createProcessFlowGraph(Process process) {
		this.processFlowGraph.setProcessGraph(createGraphFromProcess(process));		
		// Set start activity of the process.
		Set<ActivityNode> nodes = processFlowGraph.getProcessGraph().vertexSet();
		for (ActivityNode node : nodes) {
			if(node.getActivityID().compareTo(startActivityID) == 0) {
				processFlowGraph.setStartActivity(node);
				break;
			}			
		}
		
		return this.processFlowGraph;
	}
}
