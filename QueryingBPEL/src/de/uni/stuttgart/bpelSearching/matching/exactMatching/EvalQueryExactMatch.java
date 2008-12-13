/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.GraphType;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeInStack;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.PoolItem3Ext;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;
import de.uni.stuttgart.bpelSearching.datastructure.ProcessNodePair;
import de.uni.stuttgart.bpelSearching.matching.NodeRegionEncodingComparator;
import de.uni.stuttgart.bpelSearching.matching.NodesComparator;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtension;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtensionSSPI;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;

/**
 * The EvalQueryExactMatch class matches a given query graph against a set of process graphs 
 * under exact matching semantic.
 * 
 * @author luwei
 *
 */
public class EvalQueryExactMatch {
	static Logger logger = Logger.getLogger(EvalQueryExactMatch.class);
	private QueryGraph querygraph;
	private List<ProcessGraph> processgraphs;
	private List<ExactMatchingResult> exactMatchingResults;

	/**
	 * Creates a new matching instance with the specified query graph, filter criteria 
	 * of BPEL-processes to be searched.
	 * 
	 * @param querygraph the query graph
	 * @param processgraphs processgraphs to be compared
	 * 
	 * @throws IllegalArgumentException if <code>querygraph==null</code> or <code>querygraph.
	 * getQueryGraph()==null</code> or <code>processgraphs==null</code>
	 * 
	 */
	public EvalQueryExactMatch(QueryGraph querygraph, List<ProcessGraph> processgraphs) {
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
		this.exactMatchingResults = new ArrayList<ExactMatchingResult>();
	}

	/**
	 * Performs exact matching. It goes through all BPEL processes to be matched, 
	 * transforms each BPEL-process to a directed graph, and performs graph matching 
	 * between the query graph to each process graph, in doing so it dispatches to 
	 * an adequate twig join algorithm according to query graph type, process graph 
	 * type.
	 * 
	 */
	public void doExactMatch(){
		GraphAnalyse ga;
    	TwigStackAlgorithmBasic twigStB; 
    	TwigStackD2Algorithm twigStDAGquery;
    	DagStackDAlgorithm dagStackD;
    	String processInfo;
    	
    	initStaticVariablesForExactMatchAlgorithms();
		for (ProcessGraph procGraph : processgraphs) {
			processInfo = "The process to be compared >> process ID: " + procGraph.getProcessID() + 
			"  process namespace: " + procGraph.getProcessNamespace()+ 
			"  process name: " + procGraph.getProcessName();
			logger.warn(processInfo);
//			if (procGraph.getProcessName().equals("Switch")) {
				ga = new GraphAnalyse(procGraph.getGraph(), 
						procGraph.getStartActivity());
		    	if(procGraph.getStartActivity() == null){
		    		procGraph.setStartActivity(ga.getStartVertex());   		  		
		    	}	    	    	
		    	procGraph.setGraphType(ga.checkGraphType());	    	
				if ((procGraph.getGraphType() == GraphType.TREE)
						&& (querygraph.getGraphType() == GraphType.TREE)) {
					calculateNodeRegionEncoding(procGraph);
		    		twigStB = new TwigStackAlgorithmBasic(procGraph);
		    		twigStB.twigStackExactMatch(querygraph.getStartActivity());
		    		if ((twigStB.hasExactMatch()) && (twigStB.getExactMatchingResults() != null)) {
		    			this.exactMatchingResults.add(twigStB.getExactMatchingResults());
		    		}
				} else if ((procGraph.getGraphType() == GraphType.ROOTED_DAG)
						&& (querygraph.getGraphType() == GraphType.TREE)) {
					calculateNodeRegionEncodingAndSSPI(procGraph);
		    		twigStDAGquery = new TwigStackD2Algorithm(procGraph);
		    		twigStDAGquery.twigStackExactMatch(querygraph.getStartActivity());
		    		if ((twigStDAGquery.hasExactMatch()) && (twigStDAGquery.getExactMatchingResults() != null)) {
		    			this.exactMatchingResults.add(twigStDAGquery.getExactMatchingResults());
		    		}
				} else if ((procGraph.getGraphType() == GraphType.ROOTED_DAG)
						&& (querygraph.getGraphType() == GraphType.ROOTED_DAG)) {
					calculateNodeRegionEncodingAndSSPI(procGraph);
					dagStackD = new DagStackDAlgorithm(procGraph);
					dagStackD.twigStackExactMatch(querygraph.getStartActivity());
		    		if ((dagStackD.hasExactMatch()) && (dagStackD.getExactMatchingResults() != null)) {
		    			this.exactMatchingResults.add(dagStackD.getExactMatchingResults());
		    		}
				}
//			}
		}
		
		if (!this.exactMatchingResults.isEmpty()) {
			printSolutions();
		}
	}
	
	/**
	 * Initializes static variables for the InexactMatchAlgorithms.
	 * 
	 */
	private void initStaticVariablesForExactMatchAlgorithms() {
		if (querygraph.getGraphType() == GraphType.ROOTED_DAG) {		
			querygraph.setQueryNodesSortedByLevelOrder();
			querygraph.setParentsIndexesList();
			querygraph.setMinimalSpanningTreeOfQueryGraph();
			querygraph.setChildrenNodesInMSTMap();
			querygraph.setParentsNodesMap();
		}
		TwigStackAlgorithm.setQuerygraph(querygraph);	
		TwigStackAlgorithm.setNodesCompare(new NodesComparator());
		TwigStackAlgorithm.setNodeRegionCompare(new NodeRegionEncodingComparator());
		TwigStackAlgorithm.setQueryNodeStackMap(new HashMap<String, Stack<NodeInStack>>());
		TwigStackAlgorithm.setQueryNodeStreamMap(new HashMap<String, LinkedList<NodeRegionEncoding>>());
		TwigStackAlgorithm.setQueryLeafNodesSolution(new HashSet<ActivityNode>());
		
		TwigStackAlgorithmBasic.setSolutionStackMap(new HashMap<String, Stack<ProcessNodePair>>());
		TwigStackAlgorithmBasic.setQueryNodeStackPositionMap(new HashMap<String, Integer>());
		TwigStackAlgorithmBasic.setJoinedResultsChildrenNodesMap(new HashMap<StringBuffer, LinkedList<NodeRegionEncoding>>());

		TwigStackD2Algorithm.setSolutionPoolMap(new HashMap<String, Set<PoolItem3Ext>>());
		TwigStackD2Algorithm.setQueryNodeStreamPositionMap(new HashMap<String, Integer>());
		
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		for (ActivityNode queryNode : vertexSetQuery) {	
			TwigStackAlgorithm.getQueryNodeStackMap().put(queryNode.getActivityID(), new Stack<NodeInStack>());
			TwigStackAlgorithmBasic.getSolutionStackMap().put(queryNode.getActivityID(), new Stack<ProcessNodePair>());
			TwigStackD2Algorithm.getSolutionPoolMap().put(queryNode.getActivityID(), new HashSet<PoolItem3Ext>());
		}
	}
	
	
    /**
     * Calculate node region encoding (start, end, level)for each node in the 
     * process graph.
     *  
     * @param querygraph pg the process graph
     *  
     */
    public void calculateNodeRegionEncoding(ProcessGraph pg){
    	Map<ActivityNode, Integer> preMap, postMap, lMap;
    	NodeRegionEncoding nre;
    	
    	pg.nodesRegionEncoding = new HashMap<String, NodeRegionEncoding>();
    	DepthFirstTraverseExtension dft = 
    		new DepthFirstTraverseExtension(pg.getGraph(), pg.getStartActivity());   	
    	dft.traverse();
    	
    	lMap = dft.getLevelMap();
    	postMap = dft.getPostorderMap();
    	preMap = dft.getPreorderMap();
    	
    	Set<ActivityNode> vertexSetPg = pg.getGraph().vertexSet();
    	for (ActivityNode vertexPg : vertexSetPg) {
    		nre = new NodeRegionEncoding(vertexPg.getActivityID(), preMap.get(vertexPg).intValue(), 
    				postMap.get(vertexPg).intValue(), lMap.get(vertexPg).intValue());
    		
    		pg.nodesRegionEncoding.put(vertexPg.getActivityID(), nre);
    	}
    	
    	pg.setMaxEnd(dft.getMaxCount());
    }
    
    /**
     * Calculate node region encoding (start, end, level)and surrogate&surplus predecessor 
     * index for each node in the process graph.
     * 
     * @param querygraph pg the process graph
     * 
     */
     public void calculateNodeRegionEncodingAndSSPI(ProcessGraph pg){
     	Map<ActivityNode, Integer> preMap, postMap, lMap;
     	Map<ActivityNode, Set<String>> predecessorsMap;
     	NodeRegionEncoding nre;
     	Set<String> predecessorsQ;
     	pg.nodesRegionEncoding = new HashMap<String, NodeRegionEncoding>();
     	pg.predecessors2 = new HashMap<String, Predecessors2>();
     	DepthFirstTraverseExtensionSSPI dft = 
     		new DepthFirstTraverseExtensionSSPI(pg.getGraph(), 
     				pg.getStartActivity());   	
     	dft.traverse();
     	
     	lMap = dft.getLevelMap();
     	postMap = dft.getPostorderMap();
     	preMap = dft.getPreorderMap();
     	predecessorsMap = dft.getPredecessorsMap();
     	 
     	Set<ActivityNode> vertexSetPg = pg.getGraph().vertexSet();
     	for (ActivityNode vertexPg : vertexSetPg) {
     		nre = new NodeRegionEncoding(vertexPg.getActivityID(), preMap.get(vertexPg).intValue(), 
     				postMap.get(vertexPg).intValue(), lMap.get(vertexPg).intValue());
     		pg.nodesRegionEncoding.put(vertexPg.getActivityID(), nre);
     	}
     	
     	for (ActivityNode vertexPg : vertexSetPg) {
     		predecessorsQ = predecessorsMap.get(vertexPg);
     		if (!predecessorsQ.isEmpty()) {
         		pg.predecessors2.put(vertexPg.getActivityID(), new Predecessors2());
     			for (String preQ : predecessorsQ) {
     				pg.predecessors2.get(vertexPg.getActivityID()).getOriginalPredecessors()
     				.add(pg.getNodeRegionEncoding(preQ));    				
     			}
     		}
     	}	   	
     	pg.setMaxEnd(dft.getMaxCount());	
     }
     
     
     /**
      * Prints the matching results.
      * 
      */
 	public void printSolutions(){
 		logger.warn("************** Print exact matching results for the given query *****************");
 		String resultForOutput;
 		List<ArrayList<String>> matchList;
 		int qNodesSize;
 		for (ExactMatchingResult result : exactMatchingResults) {
 			matchList = result.getExactMatchings();
 			resultForOutput = "process ID: " + result.getProcessID() + 
 			"  process namespace: " + result.getProcessNamespace() + 
 			"  process name: " + result.getProcessName() + 
 			" has " + matchList.size();
 			if (matchList.size() > 1) {
 				resultForOutput += " matchs: ";
 			} else {
 				resultForOutput += " match: ";
 			}
 			qNodesSize = result.getQueryIDsTobeAssigned().size();
 			for (ArrayList<String> match : matchList) {
// 				resultForOutput += "  Match Result: " + match.toString();
 				if (match.size() == qNodesSize) {
 	 				resultForOutput += "  Match Result: ";
 	 				for (int i = 0; i < qNodesSize; i++) {
 	 					resultForOutput += " [" +  result.getQueryIDsTobeAssigned().get(i) + "-" + 
 	 										match.get(i)+ "]";
 	 				}
 				}		
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

	public List<ProcessGraph> getProcessgraph() {
		return processgraphs;
	}
	public void setProcessgraph(List<ProcessGraph> processgraphs) {
		this.processgraphs = processgraphs;
	}

	public List<ExactMatchingResult> getExactMatchingResults() {
		return exactMatchingResults;
	}

	public void setExactMatchingResults(
			List<ExactMatchingResult> exactMatchingResults) {
		this.exactMatchingResults = exactMatchingResults;
	}

}
