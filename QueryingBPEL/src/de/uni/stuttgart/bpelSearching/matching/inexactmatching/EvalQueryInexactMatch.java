/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.inexactmatching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.SolutionStream;
import de.uni.stuttgart.bpelSearching.datastructure.StreamItem;
import de.uni.stuttgart.bpelSearching.matching.NodesComparator;
import de.uni.stuttgart.bpelSearching.util.GraphType;

/**
 * The EvalQueryExactMatch class matches a given query graph against a set of process graphs 
 * under inexact matching semantic.
 * 
 * @author luwei
 *
 */
public class EvalQueryInexactMatch {
	static Logger logger = Logger.getLogger(EvalQueryInexactMatch.class);
	private QueryGraph querygraph;
	private List<ProcessGraph> processgraphs;
	private List<InexactMatchingResult> inexactMatchingResults;

	/**
	 * Creates a new inexact matching instance with the specified query graph, 
	 * processgraphs.
	 * 
	 * @param querygraph the query graph
	 * @param processgraphs processgraphs to be compared
	 * 
	 * @throws IllegalArgumentException if <code>querygraph==null</code> or <code>querygraph.
	 * getQueryGraph()==null</code> or <code>processgraphs==null</code>
	 * 
	 */
	public EvalQueryInexactMatch(QueryGraph querygraph,
			List<ProcessGraph> processgraphs) {
		super();
    	if ((querygraph == null) || ((querygraph != null) && 
    			(querygraph.getGraph() == null))) {
            throw new IllegalArgumentException("query graph must not be null");
        }	
    	if (processgraphs == null) {
            throw new IllegalArgumentException("process graphs must not be null");
        }
		this.querygraph = querygraph;
		this.processgraphs = processgraphs;
		inexactMatchingResults = new ArrayList<InexactMatchingResult>();
	}
	
	/**
	 * Performs inexact matching. It goes through all BPEL processes to be matched, 
	 * transforms each BPEL-process to a directed graph, and performs graph matching 
	 * between the query graph to each process graph under inexact matching semantic.
	 * 
	 */
	public void doInexactMatch(){
		InexactMatchAlgorithms evalQInexactMatchAlgorithms;
		String processInfo;
		InexactMatchingResult tempResult;
		int lengthOfResults, i;
		if ((querygraph.getGraphType() == GraphType.TREE) || 
				(querygraph.getGraphType() == GraphType.ROOTED_DAG)) {
			if (!processgraphs.isEmpty()) {
				initStaticVariablesForInexactMatchAlgorithms();
				for (ProcessGraph procGraph : processgraphs) {
					processInfo = "The process to be compared >> process ID: " + procGraph.getProcessID() + 
					"  process namespace: " + procGraph.getProcessNamespace()+ 
					"  process name: " + procGraph.getProcessName();
					logger.warn(processInfo);
//					if (procGraph.getProcessName().equals("NestedFlow")) {
						evalQInexactMatchAlgorithms = new InexactMatchAlgorithms(procGraph);
						evalQInexactMatchAlgorithms.doInexactMatch();
						tempResult = evalQInexactMatchAlgorithms.getInexactMatchingResult();
						if ((tempResult != null) && (!tempResult.getMatchings().isEmpty())) {
							lengthOfResults = inexactMatchingResults.size();
							for (i = 0; i < lengthOfResults; i++) {
								if (tempResult.getMatchingSimilarity() >= inexactMatchingResults.get(i).getMatchingSimilarity()) {
									break;
								}
							}
							inexactMatchingResults.add(i, tempResult);
						}
//					}
				}
				printSolutions();
			}
		}
	}
	
	/**
	 * Initializes static variables for the InexactMatchAlgorithms.
	 * 
	 */
	private void initStaticVariablesForInexactMatchAlgorithms() {
		InexactMatchAlgorithms.setQuerygraph(querygraph);
		InexactMatchAlgorithms.getQuerygraph().setQueryNodesSortedByLevelOrder();
		if (querygraph.getGraphType() == GraphType.TREE) {
			querygraph.setSubgraphNodesMapForQueryTree();
		} else if (querygraph.getGraphType() == GraphType.ROOTED_DAG) {
			querygraph.setSubgraphNodesMapForQueryDAG();
		}
		InexactMatchAlgorithms.setSolutionStreamMap(new HashMap<String, SolutionStream>());
		InexactMatchAlgorithms.setMaxAssignListMap(new HashMap<String, List<Assignment>>());
		InexactMatchAlgorithms.setTempMaxAssignSetMap(new HashMap<String, List<Assignment>>());
		
		InexactMatchAlgorithms.setAllProcNodesIds(new HashSet<String>());
		InexactMatchAlgorithms.setAllProcessedProcNodesIds(new HashSet<String>());
		InexactMatchAlgorithms.setPIDsInMatch(new HashSet<String>());
		InexactMatchAlgorithms.setSeQcMaxList(new ArrayList<StreamItem>());
		InexactMatchAlgorithms.setQchildren(new HashSet<ActivityNode>());
		InexactMatchAlgorithms.setNodesCompare(new NodesComparator());
		
		if (querygraph.getGraphType() == GraphType.TREE) {
			InexactMatchAlgorithms.setSubTreeNodesIDsQiComplement(new HashSet<String>());
		} else if (querygraph.getGraphType() == GraphType.ROOTED_DAG) {
			InexactMatchAlgorithms.setProcessedChildrenSubgraphNodesIDs(new HashSet<String>());
			InexactMatchAlgorithms.setCommonNodesIDs(new HashSet<String>());
			InexactMatchAlgorithms.setQcSubgraphNodesMinusCommonNodesIDs(new HashSet<String>());
			InexactMatchAlgorithms.setQueryIDPairsForNonCommonNodes(new ArrayList<String>());
			InexactMatchAlgorithms.setQChildrenSorted(new LinkedList<ActivityNode>());
			int maxChildrenSize = querygraph.getMaxChildrenSize();
			InexactMatchAlgorithms.setQChildrenMaxRefSize(new int[maxChildrenSize]);
			InexactMatchAlgorithms.setQiSubgraphNIDsComplement(new HashSet<String>());
			InexactMatchAlgorithms.setUmQIDs(new HashSet<String>());
		}
	}
		
    /**
     * Prints the matching results.
     * 
     */
	public void printSolutions(){
		logger.warn("************** Print sorted inexact matching results for the given query *****************");
		String resultForOutput;
		List<Matching> matchList;
		for (InexactMatchingResult result : inexactMatchingResults) {
			matchList = result.getMatchings();
			resultForOutput = "process ID: " + result.getProcessID() + 
			"  process namespace: " + result.getProcessNamespace() + 
			"  process name: " + result.getProcessName() + 
			" matches query with matchingsimilarity " + result.getMatchingSimilarity()
			+ " has " + matchList.size() + " matchs: ";		
			for (Matching match : matchList) {
				resultForOutput += match.toString();
			}
			logger.warn(resultForOutput);
		}
	}

	public QueryGraph getQuerygraph() {
		return querygraph;
	}

	public void setQuerygraph(QueryGraph querygraph) {
		this.querygraph = querygraph;
	}

	public List<ProcessGraph> getProcessgraphs() {
		return processgraphs;
	}

	public void setProcessgraphs(List<ProcessGraph> processgraphs) {
		this.processgraphs = processgraphs;
	}

	public List<InexactMatchingResult> getExactMatchingResults() {
		return inexactMatchingResults;
	}

	public void setExactMatchingResults(
			List<InexactMatchingResult> exactMatchingResults) {
		this.inexactMatchingResults = exactMatchingResults;
	}

}
