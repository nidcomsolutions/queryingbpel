package de.uni.stuttgart.bpelSearching.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;
import de.uni.stuttgart.bpelSearching.matching.NodeRegionEncodingComparator;
import de.uni.stuttgart.bpelSearching.matching.NodesComparator;
import de.uni.stuttgart.bpelSearching.matching.exactMatching.DagStackDAlgorithm;
import de.uni.stuttgart.bpelSearching.matching.exactMatching.ExactMatchingResult;
import de.uni.stuttgart.bpelSearching.matching.exactMatching.TwigStackAlgorithm;
import de.uni.stuttgart.bpelSearching.matching.exactMatching.TwigStackAlgorithmBasic;
import de.uni.stuttgart.bpelSearching.matching.exactMatching.TwigStackD2Algorithm;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtension;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtensionSSPI;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;
import de.uni.stuttgart.bpelSearching.util.GraphType;

/**
 * 	The Matching class matches a given query to a data graph, in doing so it dispatches
 *  to adequate algorithm according to query and data graph type
 *
 * @author Wei Lu
 */

public class MatchBPELForTestOfTwigStackAlgorithm {
	
	static Logger logger = Logger.getLogger(MatchBPELForTestOfTwigStackAlgorithm.class);
	
	private QueryGraph querygraph;
	private ProcessGraph processgraph;
	private boolean isExactMatching;
	private float minMatchingSimilarity = 0.2f;
	
    /**
     * Creates a new matching instance with the specified query graph, process graph, a parameter indicates 
     * whether exact matching is, minimal matching similarity.
     *
     * @param qg the query graph.
     * @param pg the process graph.
     * @param isExactMatching indicate whether perform exact search.
     * @param minMatchingSimilarity the minimal allowable similarity between data graph and query graph
     * 
     * @throws IllegalArgumentException if <code>pg==null</code> or <code>qg==null</code>
     * or <code>pg</code> <code>qg</code> is not of type <code>GraphType.TREE</code> or 
     * <code>GraphType.ROOTED_DAG</code>
     */
    @SuppressWarnings("unchecked")
	public MatchBPELForTestOfTwigStackAlgorithm(QueryGraph qg, ProcessGraph pg, boolean isExactMatching, float minMatchingSimilarity)
    { 	
    	if ((pg == null) || (qg == null)) {
            throw new IllegalArgumentException("graph must not be null");
        }
    	
    	querygraph = qg;  
    	
        processgraph = pg;
                        
    	GraphAnalyse ga = new GraphAnalyse(processgraph.getGraph(), processgraph.getStartActivity());
    	
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}
    	    	
    	processgraph.setGraphType(ga.checkGraphType());
    	
    	if(processgraph.getGraphType() == GraphType.TREE) {
    		calculateNodeRegionEncoding();
    	} else if (processgraph.getGraphType() == GraphType.ROOTED_DAG) {
    		//calculateNodeRegionEncodingAndSSPI(); 
    		//calculatePathCount();
    		calculateNodeRegionEncodingAndSSPI();
    	} else {
    		logger.warn(processgraph.getProcessName());
    		throw new IllegalArgumentException("graph must be a tree or connected directed acyclic graph");
    	}
    	
    	this.isExactMatching = isExactMatching;
    	this.minMatchingSimilarity = minMatchingSimilarity;
    }
    
    /**
     * Creates a new matching instance with the specified query graph, process graph, a parameter indicates 
     * whether exact matching is.
     *
     * @param qg the query graph.
     * @param pg the process graph.
     * @param isExactMatching indicate whether perform exact search.
     * 
     * @throws IllegalArgumentException if <code>pg==null</code> or <code>qg==null</code>
     * or <code>pg</code> <code>qg</code> is not of type <code>GraphType.TREE</code> or 
     * <code>GraphType.ROOTED_DAG</code>
     */
    @SuppressWarnings("unchecked")
	public MatchBPELForTestOfTwigStackAlgorithm(QueryGraph qg, ProcessGraph pg, boolean isExactMatching)
    {
    	querygraph = qg;
    	
    	if ((pg == null) || (qg == null)) {
            throw new IllegalArgumentException("graph must not be null");
        }
    	
        processgraph = pg;
                        
    	GraphAnalyse ga = new GraphAnalyse(processgraph.getGraph(), 
    			processgraph.getStartActivity());
    	
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}
    	    	
    	processgraph.setGraphType(ga.checkGraphType());
    	
    	if(processgraph.getGraphType() == GraphType.TREE) {
    		calculateNodeRegionEncoding();
    	} else if (processgraph.getGraphType() == GraphType.ROOTED_DAG) {
    		//calculateNodeRegionEncodingAndSSPI(); 
    		//calculatePathCount();
    		calculateNodeRegionEncodingAndSSPI();
    	} else {
    		logger.warn(processgraph.getProcessName());
    		throw new IllegalArgumentException("graph must be a tree or connected directed acyclic graph");
    	}
    	
    	this.isExactMatching = isExactMatching;
    	this.minMatchingSimilarity = 0.2f;
    }
    
    
    /**
     * Creates a new matching instance with the specified query graph, process graph.
     *
     * @param qg the query graph.
     * @param pg the process graph.
     * 
     * @throws IllegalArgumentException if <code>pg==null</code> or <code>qg==null</code>
     * or <code>pg</code> <code>qg</code> is not of type <code>GraphType.TREE</code> or 
     * <code>GraphType.ROOTED_DAG</code>
     */
    @SuppressWarnings("unchecked")
	public MatchBPELForTestOfTwigStackAlgorithm(QueryGraph qg, ProcessGraph pg)
    {
    	querygraph = qg;
    	
    	if ((pg == null) || (qg == null)) {
            throw new IllegalArgumentException("graph must not be null");
        }
    	
        processgraph = pg;
                        
    	GraphAnalyse ga = new GraphAnalyse(processgraph.getGraph(), processgraph.getStartActivity());
    	
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}
    	    	
    	processgraph.setGraphType(ga.checkGraphType());
    	
    	if(processgraph.getGraphType() == GraphType.TREE) {
    		calculateNodeRegionEncoding();
    	} else if (processgraph.getGraphType() == GraphType.ROOTED_DAG) {
    		//calculateNodeRegionEncodingAndSSPI(); 
    		//calculatePathCount();
    		calculateNodeRegionEncodingAndSSPI();
    	} else {
    		logger.warn(processgraph.getProcessName());
    		throw new IllegalArgumentException("graph must be a tree or connected directed acyclic graph");
    	}
    	
    	this.isExactMatching = false;
    	this.minMatchingSimilarity = 0.2f;
    }
    
	/**
	 * Initializes static variables for the InexactMatchAlgorithms.
	 * 
	 */
	private void initStaticVariablesForInexactMatchAlgorithms() {
		TwigStackAlgorithm.setQuerygraph(querygraph);
		TwigStackAlgorithm.setNodesCompare(new NodesComparator());
		TwigStackAlgorithm.setNodeRegionCompare(new NodeRegionEncodingComparator());
	}
    

    /**
     * Match the query graph against the process graph by using appropriate algorithm
     * according to search type and process/query graph type. 
     */
    public void match(){
    	TwigStackAlgorithmBasic twigStB; 
    	TwigStackD2Algorithm twigStDAGquery;
    	DagStackDAlgorithm dagStackD;
    	initStaticVariablesForInexactMatchAlgorithms();
    	if((querygraph.getGraphType() == GraphType.TREE) && (processgraph.getGraphType() == GraphType.TREE)) {
    		twigStB = new TwigStackAlgorithmBasic(processgraph);
    		if (isExactMatching) {
    			twigStB.twigStackExactMatch(querygraph.getStartActivity());
    		} else {
    			twigStB.twigStackInExactMatch(querygraph.getStartActivity(), minMatchingSimilarity);
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
    		}  		
    		if ((twigStB.hasExactMatch()) && (twigStB.getExactMatchingResults() != null)) {
    			printSolutions(twigStB.getExactMatchingResults());
    		}
    	} else if ((querygraph.getGraphType() == GraphType.TREE) && (processgraph.getGraphType() == GraphType.ROOTED_DAG)) {
    		twigStDAGquery = new TwigStackD2Algorithm(processgraph);
    		if (isExactMatching) {
    			twigStDAGquery.twigStackExactMatch(querygraph.getStartActivity());
    		} else {
    			twigStDAGquery.twigStackInExactMatch(querygraph.getStartActivity(), minMatchingSimilarity);
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
    		}
    		if ((twigStDAGquery.hasExactMatch()) && (twigStDAGquery.getExactMatchingResults() != null)) {
    			printSolutions(twigStDAGquery.getExactMatchingResults());
    		}
    	} else if ((querygraph.getGraphType() == GraphType.ROOTED_DAG) && (processgraph.getGraphType() == GraphType.ROOTED_DAG)) {
    		dagStackD = new DagStackDAlgorithm(processgraph);
    		if (isExactMatching) {
    			dagStackD.twigStackExactMatch(querygraph.getStartActivity());
    		} else {
    			dagStackD.twigStackInExactMatch(querygraph.getStartActivity(), minMatchingSimilarity);
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
    		}
    		if ((dagStackD.hasExactMatch()) && (dagStackD.getExactMatchingResults() != null)) {
    			printSolutions(dagStackD.getExactMatchingResults());
    		}
    	}
    	
    	
    }
    
    /**
     * Calculate node region encoding (start, end, level)for each process graph node.
     */
    public void calculateNodeRegionEncoding(){
    	Map<ActivityNode, Integer> preMap, postMap, lMap;
    	NodeRegionEncoding nre;
    	
    	DepthFirstTraverseExtension dft = 
    		new DepthFirstTraverseExtension(processgraph.getGraph(), processgraph.getStartActivity());
    	
    	dft.traverse();
    	
    	lMap = dft.getLevelMap();
    	postMap = dft.getPostorderMap();
    	preMap = dft.getPreorderMap();
    	
    	Set<ActivityNode> vertexSetPg = processgraph.getGraph().vertexSet();

    	for (ActivityNode vertexPg : vertexSetPg) {
    		nre = new NodeRegionEncoding(vertexPg.getActivityID(), preMap.get(vertexPg).intValue(), 
    				postMap.get(vertexPg).intValue(), lMap.get(vertexPg).intValue());
    		
    		processgraph.nodesRegionEncoding.put(vertexPg.getActivityID(), nre);
    	}
    	
    	processgraph.setMaxEnd(dft.getMaxCount());
    }
    
    /**
     * Calculate node region encoding (start, end, level)and surrogate&surplus predecessor 
     * index for each node in the process graph.
     * 
     */
     public void calculateNodeRegionEncodingAndSSPI(){
     	Map<ActivityNode, Integer> preMap, postMap, lMap;
     	Map<ActivityNode, Set<String>> predecessorsMap;
     	NodeRegionEncoding nre;
     	Set<String> predecessorsQ;
     	
     	DepthFirstTraverseExtensionSSPI dft = 
     		new DepthFirstTraverseExtensionSSPI(processgraph.getGraph(), 
     				processgraph.getStartActivity());   	
     	dft.traverse();
     	
     	lMap = dft.getLevelMap();
     	postMap = dft.getPostorderMap();
     	preMap = dft.getPreorderMap();
     	predecessorsMap = dft.getPredecessorsMap();
     	 
     	Set<ActivityNode> vertexSetPg = processgraph.getGraph().vertexSet();

     	for (ActivityNode vertexPg : vertexSetPg) {
     		nre = new NodeRegionEncoding(vertexPg.getActivityID(), preMap.get(vertexPg).intValue(), 
     				postMap.get(vertexPg).intValue(), lMap.get(vertexPg).intValue());
     		processgraph.nodesRegionEncoding.put(vertexPg.getActivityID(), nre);
     	}
     	
     	for (ActivityNode vertexPg : vertexSetPg) {
     		predecessorsQ = predecessorsMap.get(vertexPg);
     		if (!predecessorsQ.isEmpty()) {
         		processgraph.predecessors2.put(vertexPg.getActivityID(), new Predecessors2());
//         		logger.warn("Node: " + vertexPg.getActivityName() + ":" + vertexPg.getActivityID() + "   Predecessors: " + predecessorsQ);
     			for (String preQ : predecessorsQ) {
     				processgraph.predecessors2.get(vertexPg.getActivityID()).getOriginalPredecessors()
     				.add(processgraph.getNodeRegionEncoding(preQ));    				
     			}
     		}
     	}
     	   	
     	processgraph.setMaxEnd(dft.getMaxCount());
     	
     	// **** for debug ****
//     	Set<DefaultEdge> mstEdgeSet = dft.getMstEdgeSet();
//     	Set<DefaultEdge> edgeSetP = processgraph.getProcessGraph().edgeSet();   	
//     	for (DefaultEdge edgeP : edgeSetP) {
//     		if (!mstEdgeSet.contains(edgeP)) {
//     			logger.warn("Remaining Edge: " +  processgraph.getProcessGraph().getEdgeSource(edgeP).getActivityName()
//     					+ " : " + processgraph.getProcessGraph().getEdgeTarget(edgeP).getActivityName());
//     		}
//     	}
//     	
//     	logger.warn("Predecessors");
//     	for (ActivityNode vertexPg : vertexSetPg) {
//     		Predecessors2 pre2 = processgraph.predecessors2.get(vertexPg.getActivityID());   		
//     		if (pre2 != null) {
//     			SortedSet<NodeRegionEncoding> pres = pre2.getOriginalPredecessors();
//     			logger.warn(vertexPg.getActivityID() + " : " + vertexPg.getActivityName() + "Has the following predecessors: ");
//     			for (NodeRegionEncoding pre : pres) {
//     				logger.warn(pre.toString());
//     			}
//     		}
//     	}
     	// **** for debug ****   	
     }

     
     /**
      * The old version to calculate node region encoding (start, end, level)and 
      * surrogate&surplus predecessor index for each node in the process graph.
      * 
      */
//    public void calculateNodeRegionEncodingAndSSPIOldVersion(){
//    	Map<ActivityNode, Integer> preMap, postMap, lMap;
//    	Map<ActivityNode, Set<String>> predecessorsMap;
//    	NodeRegionEncoding nre;
//    	NodeRegionEncodingComparator nodeRegionCompare = new NodeRegionEncodingComparator();
//    	Set<String> predecessorsQ;
//    	
//    	DepthFirstTraverseExtensionSSPI dft = 
//    		new DepthFirstTraverseExtensionSSPI(processgraph.getGraph(), 
//    				processgraph.getStartActivity());   	
//    	dft.traverse();
//    	
//    	lMap = dft.getLevelMap();
//    	postMap = dft.getPostorderMap();
//    	preMap = dft.getPreorderMap();
//    	predecessorsMap = dft.getPredecessorsMap();
//    	 
//    	Set<ActivityNode> vertexSetPg = processgraph.getGraph().vertexSet();
//
////    	logger.warn("Predecessors: ");
//    	for (ActivityNode vertexPg : vertexSetPg) {
//    		nre = new NodeRegionEncoding(vertexPg.getActivityID(), preMap.get(vertexPg).intValue(), 
//    				postMap.get(vertexPg).intValue(), lMap.get(vertexPg).intValue());
//    		processgraph.nodesRegionEncoding.put(vertexPg.getActivityID(), nre);
////    		logger.warn(nre);
//    	}
//    	
//    	for (ActivityNode vertexPg : vertexSetPg) {
//    		predecessorsQ = predecessorsMap.get(vertexPg);
//    		if (!predecessorsQ.isEmpty()) {
//        		processgraph.predecessors.put(vertexPg.getActivityID(), 
//        				new TreeSet<NodeRegionEncoding>(nodeRegionCompare));
////        		logger.warn("Node: " + vertexPg.getActivityName() + "   Predecessors: " + predecessorsQ);
//    			for (String preQ : predecessorsQ) {
//    				processgraph.predecessors.get(vertexPg.getActivityID()).add(processgraph.getNodeRegionEncoding(preQ));    				
//    			}
//    		}
//    	}
//    	processgraph.setMaxEnd(dft.getMaxCount()); 	
//    }
     
     /**
      * Prints the matching results.
      * 
      */
 	public void printSolutions(ExactMatchingResult result){
 		logger.warn("************** Print exact matching results for the given query *****************");
 		String resultForOutput;
 		List<ArrayList<String>> matchList;

 		matchList = result.getExactMatchings();
 		resultForOutput = "process ID: " + result.getProcessID() + 
 			"  process namespace: " + result.getProcessNamespace() + 
 			"  process name: " + result.getProcessName() + 
 			" has " + matchList.size() + " matchs: ";		
 		for (ArrayList<String> match : matchList) {
 			resultForOutput += "  Matching Result: " + match.toString();
 		}
 		logger.warn(resultForOutput);
 	}
      
	public boolean isExactMatching() {
		return isExactMatching;
	}

	public void setExactMatching(boolean isExactMatching) {
		this.isExactMatching = isExactMatching;
	}

	public QueryGraph getQuerygraph() {
		return querygraph;
	}

	public void setQuerygraph(QueryGraph querygraph) {
		this.querygraph = querygraph;
	}

	public ProcessGraph getProcessgraph() {
		return processgraph;
	}

	public void setProcessgraph(ProcessGraph processgraph) {
		this.processgraph = processgraph;
	}


	public float getMinMatchingSimilarity() {
		return minMatchingSimilarity;
	}


	public void setMinMatchingSimilarity(float minMatchingSimilarity) {
		this.minMatchingSimilarity = minMatchingSimilarity;
	}
	
	

}
