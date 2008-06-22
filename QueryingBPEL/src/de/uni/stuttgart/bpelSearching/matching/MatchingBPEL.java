package de.uni.stuttgart.bpelSearching.matching;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.index.PathCount;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.bpelSearching.util.BreadthFirstTraverse;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtension;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtensionSSPI;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;
import de.uni.stuttgart.bpelSearching.util.GraphType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.Predecessors2;
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
	
    /**
     * Creates a new matching instance between query graph and process graph.
     *
     * @param qg the query graph.
     * @param pg the process graph.
     * @param isExactMatching indicate, whether perform exact search.
     *  
     * @throws IllegalArgumentException if <code>pg==null</code> or <code>qg==null</code>
     * or <code>pg</code> <code>qg</code> is not of type <code>GraphType.TREE</code> or 
     * <code>GraphType.DAG_CONNECTED</code>
     */
    @SuppressWarnings("unchecked")
	public MatchingBPEL(QueryGraph qg, ProcessFlowGraph pg, boolean isExactMatching)
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
    	} else if (processgraph.getProcessGraphType() == GraphType.DAG_CONNECTED) {
    		//calculateNodeRegionEncodingAndSSPI(); 
    		calculatePathCount();
    		calculateNodeRegionEncodingAndSSPI2();
    	} else {
    		logger.warn(processgraph.getProcessName());
    		throw new IllegalArgumentException("graph must be a tree or connected directed acyclic graph");
    	}
    	
    	this.isExactMatching = isExactMatching;       
    }
    

    /**
     * Match the query graph against the process graph by using appropriate algorithm
     * according to search type and process/query graph type. 
     */
    public void match(){
    	TwigStackAlgorithmBasic twigStB; 
    	TwigStackAlgorithmForDAGQuery3 twigStDAGquery;
    	if((querygraph.getQueryGraphType() == GraphType.TREE) && (processgraph.getProcessGraphType() == GraphType.TREE)) {
    		twigStB = new TwigStackAlgorithmBasic(querygraph, processgraph);
    		if (isExactMatching) {
    			twigStB.twigStackExactMatch(querygraph.getStartVertex());
    		} else {
    			twigStB.twigStackInExactMatch(querygraph.getStartVertex());
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
    		}   		
    	} else if ((querygraph.getQueryGraphType() == GraphType.TREE) && (processgraph.getProcessGraphType() == GraphType.DAG_CONNECTED)) {
    		twigStDAGquery = new TwigStackAlgorithmForDAGQuery3(querygraph, processgraph);
    		if (isExactMatching) {
    			twigStDAGquery.twigStackExactMatch(querygraph.getStartVertex());
    		} else {
    			twigStDAGquery.twigStackInExactMatch(querygraph.getStartVertex());
    			//logger.warn("Matching Similarity: " + twigSt.getMatchingSimilarity());
    		}	   		
    	}
    	
    	
    }
    
    /**
     * Calculate node region encoding (pre-order rank, post-order rank, level)
     *  for each process graph node.
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
    	
    	processgraph.setMaxPostOrder(dft.getMaxCount());
    }
    
    
    /**
     * Calculate node region encoding (pre-order rank, post-order rank, level)
     *  and surrogate&surplus predecessor index for each process graph node.
     */
    public void calculateNodeRegionEncodingAndSSPI(){
    	Map<ActivityNode, Integer> preMap, postMap, lMap;
    	Map<ActivityNode, Set<String>> predecessorsMap;
    	NodeRegionEncoding nre;
    	NodeRegionEncodingComparator nodeRegionCompare = new NodeRegionEncodingComparator();
    	Set<String> predecessorsQ;
    	
    	DepthFirstTraverseExtensionSSPI dft = 
    		new DepthFirstTraverseExtensionSSPI(processgraph.getProcessGraph(), processgraph.getStartActivity());   	
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
    	   	
    	processgraph.setMaxPostOrder(dft.getMaxCount());
    	
    	// **** for debug ****
//    	Set<DefaultEdge> mstEdgeSet = dft.getMstEdgeSet();
//    	Set<DefaultEdge> edgeSetP = processgraph.getProcessGraph().edgeSet();   	
//    	for (DefaultEdge edgeP : edgeSetP) {
//    		if (!mstEdgeSet.contains(edgeP)) {
//    			logger.warn("Remaining Edge: " +  processgraph.getProcessGraph().getEdgeSource(edgeP).getActivityName()
//    					+ " : " + processgraph.getProcessGraph().getEdgeTarget(edgeP).getActivityName());
//    		}
//    	}
//    	
//    	logger.warn("Predecessors");
//    	for (ActivityNode vertexPg : vertexSetPg) {
//    		SortedSet<NodeRegionEncoding> pres = processgraph.predecessors.get(vertexPg.getActivityID());
//    		if (pres != null) {
//    			logger.warn(vertexPg.getActivityID() + " : " + vertexPg.getActivityName() + "Has the following predecessors: ");
//    			for (NodeRegionEncoding pre : pres) {
//    				logger.warn(pre.toString());
//    			}
//    		}
//    	}
    	// **** for debug ****   	
    }
    
    
    /**
     * The second version to Calculate node region encoding (pre-order rank, post-order rank, 
     * level)and surrogate&surplus predecessor index for each process graph node.
     */
    public void calculateNodeRegionEncodingAndSSPI2(){
    	Map<ActivityNode, Integer> preMap, postMap, lMap;
    	Map<ActivityNode, Set<String>> predecessorsMap;
    	NodeRegionEncoding nre;
    	Set<String> predecessorsQ;
    	
    	DepthFirstTraverseExtensionSSPI dft = 
    		new DepthFirstTraverseExtensionSSPI(processgraph.getProcessGraph(), processgraph.getStartActivity());   	
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
        		processgraph.predecessors2.put(vertexPg.getActivityID(), new Predecessors2());
//        		logger.warn("Node: " + vertexPg.getActivityName() + "   Predecessors: " + predecessorsQ);
    			for (String preQ : predecessorsQ) {
    				processgraph.predecessors2.get(vertexPg.getActivityID()).getOriginalPredecessors()
    				.add(processgraph.getNodeRegionEncoding(preQ));    				
    			}
    		}
    	}
    	   	
    	processgraph.setMaxPostOrder(dft.getMaxCount());
    	
    	// **** for debug ****
//    	Set<DefaultEdge> mstEdgeSet = dft.getMstEdgeSet();
//    	Set<DefaultEdge> edgeSetP = processgraph.getProcessGraph().edgeSet();   	
//    	for (DefaultEdge edgeP : edgeSetP) {
//    		if (!mstEdgeSet.contains(edgeP)) {
//    			logger.warn("Remaining Edge: " +  processgraph.getProcessGraph().getEdgeSource(edgeP).getActivityName()
//    					+ " : " + processgraph.getProcessGraph().getEdgeTarget(edgeP).getActivityName());
//    		}
//    	}
//    	
//    	logger.warn("Predecessors");
//    	for (ActivityNode vertexPg : vertexSetPg) {
//    		Predecessors2 pre2 = processgraph.predecessors2.get(vertexPg.getActivityID());   		
//    		if (pre2 != null) {
//    			SortedSet<NodeRegionEncoding> pres = pre2.getOriginalPredecessors();
//    			logger.warn(vertexPg.getActivityID() + " : " + vertexPg.getActivityName() + "Has the following predecessors: ");
//    			for (NodeRegionEncoding pre : pres) {
//    				logger.warn(pre.toString());
//    			}
//    		}
//    	}
    	// **** for debug ****   	
    }
    
    /**
     * Calculate for each leaf node of process graph the number of paths 
     * from root to this leaf node.
     * 
     */
    public void calculatePathCount(){
    	int tempCount = 0;
    	DirectedGraph<ActivityNode, DefaultEdge> processGraph = processgraph.getProcessGraph();
    	
    	BreadthFirstTraverse bft = new BreadthFirstTraverse
    			(processgraph.getProcessGraph(), processgraph.getStartActivity());   	
    	bft.traverse();
    	
    	LinkedList<ActivityNode> bfsSortedNodes = bft.getNodesBreadthFirstTraverseOrder();
    	 
    	for (ActivityNode node : bfsSortedNodes) {
    		processgraph.pathCountMap.put(node.getActivityID(), new PathCount());   		
    	}
    	
    	//logger.warn("Output path count");
    	bfsSortedNodes.removeFirst();
    	for (ActivityNode node : bfsSortedNodes) {
    		Set<DefaultEdge> incommingEdgeSet = processGraph.incomingEdgesOf(node);
    		tempCount = 0;
    		for (DefaultEdge incommingEdge : incommingEdgeSet) {
    			tempCount += processgraph.pathCountMap.get(processGraph.getEdgeSource
    					(incommingEdge).getActivityID()).getNumberOfPaths();   			
    		}
    		processgraph.pathCountMap.put(node.getActivityID(), new PathCount(tempCount, false)); 
    		//logger.warn(node.getActivityID() + " : " + tempCount);
    	}
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
	
	

}
