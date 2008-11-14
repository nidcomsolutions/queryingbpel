package de.uni.stuttgart.bpelSearching.matching.exactMatching;


import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;
import de.uni.stuttgart.bpelSearching.matching.NodeRegionEncodingComparator;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtension;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtensionSSPI;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;
import de.uni.stuttgart.bpelSearching.util.GraphType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * 	The Matching class matches a given query to a data graph, in doing so it dispatches
 *  to adequate algorithm according to query and data graph type
 *
 * @author Wei Lu
 */

public class MatchingBPEL {
	
	static Logger logger = Logger.getLogger(MatchingBPEL.class);
	
	private QueryGraph querygraph;
	private ProcessFlowGraph processgraph;
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
	public MatchingBPEL(QueryGraph qg, ProcessFlowGraph pg, boolean isExactMatching, float minMatchingSimilarity)
    { 	
    	if ((pg == null) || (qg == null)) {
            throw new IllegalArgumentException("graph must not be null");
        }
    	
    	querygraph = qg;  
    	
        processgraph = pg;
                        
    	GraphAnalyse ga = new GraphAnalyse(processgraph.getProcessGraph(), processgraph.getStartActivity());
    	
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}
    	    	
    	processgraph.setProcessGraphType(ga.checkGraphType());
    	
    	if(processgraph.getProcessGraphType() == GraphType.TREE) {
    		calculateNodeRegionEncoding();
    	} else if (processgraph.getProcessGraphType() == GraphType.ROOTED_DAG) {
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
	public MatchingBPEL(QueryGraph qg, ProcessFlowGraph pg, boolean isExactMatching)
    {
    	querygraph = qg;
    	
    	if ((pg == null) || (qg == null)) {
            throw new IllegalArgumentException("graph must not be null");
        }
    	
        processgraph = pg;
                        
    	GraphAnalyse ga = new GraphAnalyse(processgraph.getProcessGraph(), 
    			processgraph.getStartActivity());
    	
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}
    	    	
    	processgraph.setProcessGraphType(ga.checkGraphType());
    	
    	if(processgraph.getProcessGraphType() == GraphType.TREE) {
    		calculateNodeRegionEncoding();
    	} else if (processgraph.getProcessGraphType() == GraphType.ROOTED_DAG) {
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
	public MatchingBPEL(QueryGraph qg, ProcessFlowGraph pg)
    {
    	querygraph = qg;
    	
    	if ((pg == null) || (qg == null)) {
            throw new IllegalArgumentException("graph must not be null");
        }
    	
        processgraph = pg;
                        
    	GraphAnalyse ga = new GraphAnalyse(processgraph.getProcessGraph(), processgraph.getStartActivity());
    	
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}
    	    	
    	processgraph.setProcessGraphType(ga.checkGraphType());
    	
    	if(processgraph.getProcessGraphType() == GraphType.TREE) {
    		calculateNodeRegionEncoding();
    	} else if (processgraph.getProcessGraphType() == GraphType.ROOTED_DAG) {
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
     * Match the query graph against the process graph by using appropriate algorithm
     * according to search type and process/query graph type. 
     */
    public void match(){
    	TwigStackAlgorithmBasic twigStB; 
    	TwigStackDAlgorithmForDAGProcess2 twigStDAGquery;
    	DagStackDAlgorithm dagStackD;
    	if((querygraph.getQueryGraphType() == GraphType.TREE) && (processgraph.getProcessGraphType() == GraphType.TREE)) {
    		twigStB = new TwigStackAlgorithmBasic(querygraph, processgraph);
    		if (isExactMatching) {
    			twigStB.twigStackExactMatch(querygraph.getStartVertex());
    		} else {
    			twigStB.twigStackInExactMatch(querygraph.getStartVertex(), minMatchingSimilarity);
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
    		}   		
    	} else if ((querygraph.getQueryGraphType() == GraphType.TREE) && (processgraph.getProcessGraphType() == GraphType.ROOTED_DAG)) {
    		twigStDAGquery = new TwigStackDAlgorithmForDAGProcess2(querygraph, processgraph);
    		if (isExactMatching) {
    			twigStDAGquery.twigStackExactMatch(querygraph.getStartVertex());
    		} else {
    			twigStDAGquery.twigStackInExactMatch(querygraph.getStartVertex(), minMatchingSimilarity);
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
    		}	   		
    	} else if ((querygraph.getQueryGraphType() == GraphType.ROOTED_DAG) && (processgraph.getProcessGraphType() == GraphType.ROOTED_DAG)) {
    		dagStackD = new DagStackDAlgorithm(querygraph, processgraph);
    		if (isExactMatching) {
    			dagStackD.twigStackExactMatch(querygraph.getStartVertex());
    		} else {
    			dagStackD.twigStackInExactMatch(querygraph.getStartVertex(), minMatchingSimilarity);
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
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
    		new DepthFirstTraverseExtension(processgraph.getProcessGraph(), processgraph.getStartActivity());
    	
    	dft.traverse();
    	
    	lMap = dft.getLevelMap();
    	postMap = dft.getPostorderMap();
    	preMap = dft.getPreorderMap();
    	
    	Set<ActivityNode> vertexSetPg = processgraph.getProcessGraph().vertexSet();

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
     		new DepthFirstTraverseExtensionSSPI(processgraph.getProcessGraph(), 
     				processgraph.getStartActivity());   	
     	dft.traverse();
     	
     	lMap = dft.getLevelMap();
     	postMap = dft.getPostorderMap();
     	preMap = dft.getPreorderMap();
     	predecessorsMap = dft.getPredecessorsMap();
     	 
     	Set<ActivityNode> vertexSetPg = processgraph.getProcessGraph().vertexSet();

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
    public void calculateNodeRegionEncodingAndSSPIOldVersion(){
    	Map<ActivityNode, Integer> preMap, postMap, lMap;
    	Map<ActivityNode, Set<String>> predecessorsMap;
    	NodeRegionEncoding nre;
    	NodeRegionEncodingComparator nodeRegionCompare = new NodeRegionEncodingComparator();
    	Set<String> predecessorsQ;
    	
    	DepthFirstTraverseExtensionSSPI dft = 
    		new DepthFirstTraverseExtensionSSPI(processgraph.getProcessGraph(), 
    				processgraph.getStartActivity());   	
    	dft.traverse();
    	
    	lMap = dft.getLevelMap();
    	postMap = dft.getPostorderMap();
    	preMap = dft.getPreorderMap();
    	predecessorsMap = dft.getPredecessorsMap();
    	 
    	Set<ActivityNode> vertexSetPg = processgraph.getProcessGraph().vertexSet();

//    	logger.warn("Predecessors: ");
    	for (ActivityNode vertexPg : vertexSetPg) {
    		nre = new NodeRegionEncoding(vertexPg.getActivityID(), preMap.get(vertexPg).intValue(), 
    				postMap.get(vertexPg).intValue(), lMap.get(vertexPg).intValue());
    		processgraph.nodesRegionEncoding.put(vertexPg.getActivityID(), nre);
//    		logger.warn(nre);
    	}
    	
    	for (ActivityNode vertexPg : vertexSetPg) {
    		predecessorsQ = predecessorsMap.get(vertexPg);
    		if (!predecessorsQ.isEmpty()) {
        		processgraph.predecessors.put(vertexPg.getActivityID(), 
        				new TreeSet<NodeRegionEncoding>(nodeRegionCompare));
//        		logger.warn("Node: " + vertexPg.getActivityName() + "   Predecessors: " + predecessorsQ);
    			for (String preQ : predecessorsQ) {
    				processgraph.predecessors.get(vertexPg.getActivityID()).add(processgraph.getNodeRegionEncoding(preQ));    				
    			}
    		}
    	}
    	processgraph.setMaxEnd(dft.getMaxCount()); 	
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

	public ProcessFlowGraph getProcessgraph() {
		return processgraph;
	}

	public void setProcessgraph(ProcessFlowGraph processgraph) {
		this.processgraph = processgraph;
	}


	public float getMinMatchingSimilarity() {
		return minMatchingSimilarity;
	}


	public void setMinMatchingSimilarity(float minMatchingSimilarity) {
		this.minMatchingSimilarity = minMatchingSimilarity;
	}
	
	

}
