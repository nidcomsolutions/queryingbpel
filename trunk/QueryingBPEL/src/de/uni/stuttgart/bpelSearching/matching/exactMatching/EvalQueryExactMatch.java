/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.datastructure.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.datastructure.Predecessors2;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtension;
import de.uni.stuttgart.bpelSearching.util.DepthFirstTraverseExtensionSSPI;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;
import de.uni.stuttgart.bpelSearching.util.GraphType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraphFactory;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;
import de.uni.stuttgart.gerlacdt.bpel.database.DatabaseConfiguration;

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
	private String filterProcesses;
	private List<ProcessFlowGraph> processgraphs;
	private List<ExactMatchingResult> exactMatchingResults;

	/**
	 * Creates a new matching instance with the specified query graph, filter criteria 
	 * of BPEL-processes to be searched.
	 * 
	 * @param querygraph the query graph
	 * @param filterProcesses filter criteria of BPEL-processes to be searched
	 * 
	 * @throws IllegalArgumentException if <code>querygraph==null</code>
	 * 
	 */
	public EvalQueryExactMatch(QueryGraph querygraph, String filterProcesses) {
		super();
    	if ((querygraph == null) || ((querygraph != null) && 
    			(querygraph.getQueryGraph() == null))) {
            throw new IllegalArgumentException("query graph must not be null");
        }
		this.querygraph = querygraph;
		this.filterProcesses = filterProcesses;
		this.processgraphs = new ArrayList<ProcessFlowGraph>();
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
    	TwigStackDAlgorithmForDAGProcess2 twigStDAGquery;
    	DagStackDAlgorithm dagStackD;
   
		DatabaseConfiguration dbConfig = DbGraphPropertiesFactory.getInstance()
		.getDBConfiguration();
		final SessionFactory sessionFactory = dbConfig.getSessionFactory();
		final Session session = sessionFactory.openSession();
		// start Transaction
		session.beginTransaction();	
		Query query;
		if (filterProcesses == "") {
			query = session.createQuery("FROM Process");
		} else {
			// To Do: parse SQL query, exception handling
			query = session.createQuery(filterProcesses);
		}
		List<Process> processes = query.list();
		
		// de.uni.stuttgart.bpelSearching.matching.test if processes are loaded correctly
		for (int i = 0; i < processes.size(); i++) {
			Process process = processes.get(i);
			logger.debug("Load Process name: " + process.getName());
			ProcessFlowGraphFactory graphFactory = DbGraphPropertiesFactory
					.getInstance().getProcessFlowGraphFactory(process);
			ProcessFlowGraph graph = graphFactory
					.createProcessFlowGraph(process);
			processgraphs.add(graph);
		}
		
		session.getTransaction().commit();
		session.close();
		
		for (ProcessFlowGraph procGraph : processgraphs) {
			ga = new GraphAnalyse(procGraph.getProcessGraph(), 
					procGraph.getStartActivity());
	    	if(procGraph.getStartActivity() == null){
	    		procGraph.setStartActivity(ga.getStartVertex());   		  		
	    	}
	    	    	
	    	procGraph.setProcessGraphType(ga.checkGraphType());
	    	
			if ((procGraph.getProcessGraphType() == GraphType.TREE)
					&& (querygraph.getQueryGraphType() == GraphType.TREE)) {
				calculateNodeRegionEncoding(procGraph);
	    		twigStB = new TwigStackAlgorithmBasic(querygraph, procGraph);
	    		twigStB.twigStackExactMatch(querygraph.getStartVertex());
	    		if ((twigStB.hasExactMatch()) && (twigStB.getExactMatchingResults() != null)) {
	    			this.exactMatchingResults.add(twigStB.getExactMatchingResults());
	    		}
			} else if ((procGraph.getProcessGraphType() == GraphType.ROOTED_DAG)
					&& (querygraph.getQueryGraphType() == GraphType.TREE)) {
				calculateNodeRegionEncodingAndSSPI(procGraph);
	    		twigStDAGquery = new TwigStackDAlgorithmForDAGProcess2(querygraph, procGraph);
	    		twigStDAGquery.twigStackExactMatch(querygraph.getStartVertex());
	    		if ((twigStDAGquery.hasExactMatch()) && (twigStDAGquery.getExactMatchingResults() != null)) {
	    			this.exactMatchingResults.add(twigStDAGquery.getExactMatchingResults());
	    		}
			} else if ((procGraph.getProcessGraphType() == GraphType.ROOTED_DAG)
					&& (querygraph.getQueryGraphType() == GraphType.ROOTED_DAG)) {
				calculateNodeRegionEncodingAndSSPI(procGraph);
				dagStackD = new DagStackDAlgorithm(querygraph, procGraph);
				dagStackD.twigStackExactMatch(querygraph.getStartVertex());
	    		if ((dagStackD.hasExactMatch()) && (dagStackD.getExactMatchingResults() != null)) {
	    			this.exactMatchingResults.add(dagStackD.getExactMatchingResults());
	    		}
			} 
		}
	}
	
	
    /**
     * Calculate node region encoding (start, end, level)for each node in the 
     * process graph.
     *  
     * @param querygraph pg the process graph
     *  
     */
    public void calculateNodeRegionEncoding(ProcessFlowGraph pg){
    	Map<ActivityNode, Integer> preMap, postMap, lMap;
    	NodeRegionEncoding nre;
    	
    	DepthFirstTraverseExtension dft = 
    		new DepthFirstTraverseExtension(pg.getProcessGraph(), pg.getStartActivity());
    	
    	dft.traverse();
    	
    	lMap = dft.getLevelMap();
    	postMap = dft.getPostorderMap();
    	preMap = dft.getPreorderMap();
    	
    	Set<ActivityNode> vertexSetPg = pg.getProcessGraph().vertexSet();

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
     public void calculateNodeRegionEncodingAndSSPI(ProcessFlowGraph pg){
     	Map<ActivityNode, Integer> preMap, postMap, lMap;
     	Map<ActivityNode, Set<String>> predecessorsMap;
     	NodeRegionEncoding nre;
     	Set<String> predecessorsQ;
     	
     	DepthFirstTraverseExtensionSSPI dft = 
     		new DepthFirstTraverseExtensionSSPI(pg.getProcessGraph(), 
     				pg.getStartActivity());   	
     	dft.traverse();
     	
     	lMap = dft.getLevelMap();
     	postMap = dft.getPostorderMap();
     	preMap = dft.getPreorderMap();
     	predecessorsMap = dft.getPredecessorsMap();
     	 
     	Set<ActivityNode> vertexSetPg = pg.getProcessGraph().vertexSet();

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
    
	
	public QueryGraph getQuerygraph() {
		return querygraph;
	}
	public void setQuerygraph(QueryGraph querygraph) {
		this.querygraph = querygraph;
	}
	
	public String getFilterProcesses() {
		return filterProcesses;
	}

	public void setFilterProcesses(String filterProcesses) {
		this.filterProcesses = filterProcesses;
	}

	public List<ProcessFlowGraph> getProcessgraph() {
		return processgraphs;
	}
	public void setProcessgraph(List<ProcessFlowGraph> processgraphs) {
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
