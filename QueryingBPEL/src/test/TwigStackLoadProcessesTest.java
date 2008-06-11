package test;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.matching.MatchingBPEL;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraphFactory;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityInvokeNode;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityReceiveNode;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityType;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

public class TwigStackLoadProcessesTest {
	
	static Logger logger = Logger.getLogger(TwigStackLoadProcessesTest.class);
	static File BPELdirTreeMatchingTests = new File("BPELFiles/SmallTest");
	private static ProcessUtilsNormal processUtils;
	private static List<Process> processList;
	private static List<ProcessFlowGraph> processGraphs, matchedProcessGraphs;
	private static QueryGraph queryGraph1;
	private static DirectedGraph<ActivityNode, DefaultEdge> query1;
	private static ActivityNode query1If, query1Seq_start;
	private static ActivityInvokeNode query1Invoke;
	private static ActivityReceiveNode query1Receive;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		processUtils = new ProcessUtilsNormal();
//		processUtils.deleteAllProcessesFromDB();
//		File[] fileArray = BPELdirTreeMatchingTests.listFiles();
//		 
//		// persist all process from directory/*.bpel
//		for (int i = 0; i < fileArray.length; i++) {
//
//			File fileTemp = fileArray[i];
//			if (!fileTemp.isDirectory()) {
//				logger.warn("Persist TestCase: " + fileTemp.getPath());
//				Process processTest = processUtils
//						.loadProcessFromFile(fileTemp);
//				processUtils.persistProcess(processTest);
//			}
//		}
		
		
		// get processes for test cases
		processList = processUtils.getAllProcessesFromDB();	
		
		query1If = new ActivityNode("q1If", "IfA*", ActivityType.IF);
		//query1Invoke = new ActivityNode("q1Invoke", "InvokeA", ActivityType.INVOKE);
		query1Invoke = new ActivityInvokeNode("q1Invoke", "InvokeA", ActivityType.INVOKE, "",
				"riskAssessmentLT", "", "check", "creditInformationMessage", "riskAssessmentMessage");
		query1Seq_start = new ActivityNode("q1Seq", "Seq*", ActivityType.SEQUENCE);
		query1Receive = new ActivityReceiveNode("q1Receive", "Receive*", ActivityType.RECEIVE);
		
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		query1.addVertex(query1If);
		query1.addVertex(query1Invoke);
		query1.addVertex(query1Seq_start);
		query1.addVertex(query1Receive);
		query1.addEdge(query1If, query1Seq_start);
		query1.addEdge(query1Seq_start, query1Receive);
		query1.addEdge(query1If, query1Invoke);
		
		queryGraph1 = new QueryGraph(query1);
		 
		matchedProcessGraphs = new ArrayList<ProcessFlowGraph>();
		
		//logger.warn("Before SetUp ");
	}

	@Before
	public void setUp() throws Exception {	
			
	}
	
	
	
	@Test
	public void treeMatchingTest() {
		MatchingBPEL matchBPEL;
		for (Process process : processList) {
			ProcessFlowGraphFactory processFlowGraphFactory = DbGraphPropertiesFactory
					.getInstance().getProcessFlowGraphFactory(process);
//			ProcessFlowGraphFactory processFlowGraphFactory = new NewStructuredProcessFlowGraphFactory(
//					process);

			// create processFlowGraph from bpel process
			ProcessFlowGraph processFlowGraph = processFlowGraphFactory
					.createProcessFlowGraph(process);
			
			matchBPEL = new MatchingBPEL(queryGraph1, processFlowGraph, false);
			matchBPEL.match();			
		}
				
	}

}
