package de.uni.stuttgart.bpelSearching.query;

import java.io.File;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraphFactory;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

public class Query {
	private QueryGraph queryGraph;
	
	/**
	 * @param queryGraph
	 */
	public Query(QueryGraph queryGraph) {
		super();
		this.queryGraph = queryGraph;
	}


	public QueryGraph parserQuery(File file) {
		ProcessUtilsNormal processUtils = new ProcessUtilsNormal();
		Process queryProcess = processUtils.loadProcessFromFile(file);
		ProcessFlowGraphFactory processFlowGraphFactory = DbGraphPropertiesFactory
		.getInstance().getProcessFlowGraphFactory(queryProcess);
		ProcessFlowGraph queryFlowGraph = processFlowGraphFactory
		.createProcessFlowGraph(queryProcess);

		return new QueryGraph(null);
	}


	public QueryGraph getQueryGraph() {
		return queryGraph;
	}


	public void setQueryGraph(QueryGraph queryGraph) {
		this.queryGraph = queryGraph;
	}
}
