/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.bpelSearching.util.GraphType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.QueryGraphFactory;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

/**
 * @author luwei
 *
 */
public class ProcessQueryEvaluation {

//	private Query query;
	private String filterProcesses;
	private SearchType searchType;
	private float minMatchingSimilarity = 0.2f;
	
	/**
	 * @param filterProcesses
	 * @param searchType
	 * @param minMatchingSimilarity
	 */
	public ProcessQueryEvaluation(String filterProcesses, SearchType searchType, 
			float minMatchingSimilarity) {
		super();
		this.filterProcesses = filterProcesses;
		this.searchType = searchType;
		this.minMatchingSimilarity = minMatchingSimilarity;
	}
		
	/**
	 * @param query
	 * @param filterProcesses
	 * @param searchType
	 */
	public ProcessQueryEvaluation(String filterProcesses, SearchType searchType) {
		super();
		this.filterProcesses = filterProcesses;
		this.searchType = searchType;
	}

	
	public List<MatchingResult> evaluateProcessQuery(File queryFile) {
		LinkedList<MatchingResult> matchingResults;
		
		QueryGraph qGraph = loadQuery(queryFile);
		if (qGraph.getQueryGraphType()  == GraphType.OTHER_GRAPH) {
			throw new IllegalArgumentException("query graph must be a directed acyclic graph");
		} else if (qGraph.getQueryGraphType()  == GraphType.UNROOTED_DAG) {
			qGraph.transformQueryToRootedDAG();
		}
		
		if (searchType == SearchType.EXACTSEARCH) {
			
		} else if (searchType == SearchType.INEXACTSEARCH) {
			
		}

		return new LinkedList<MatchingResult>();
	}
	
	public QueryGraph loadQuery(File queryFile) {
		ProcessUtilsNormal processUtils = new ProcessUtilsNormal();
		Process queryProcess = processUtils.loadProcessFromFile(queryFile);
		QueryGraphFactory queryGraphFactory = DbGraphPropertiesFactory
		.getInstance().getQueryGraphFactory();
		QueryGraph queryGraph = queryGraphFactory.createQueryGraph(queryProcess);
		return queryGraph;
	}

	public String getFilterProcesses() {
		return filterProcesses;
	}

	public void setFilterProcesses(String filterProcesses) {
		this.filterProcesses = filterProcesses;
	}

	public SearchType getSearchType() {
		return searchType;
	}

	public void setSearchTypeg(SearchType searchType) {
		this.searchType = searchType;
	}

	public float getMinMatchingSimilarity() {
		return minMatchingSimilarity;
	}

	public void setMinMatchingSimilarity(float minMatchingSimilarity) {
		this.minMatchingSimilarity = minMatchingSimilarity;
	}



}
