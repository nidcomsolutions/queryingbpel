package de.uni.stuttgart.bpelSearching.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityType;
import de.uni.stuttgart.bpelSearching.matching.exactMatching.EvalQueryExactMatch;
import de.uni.stuttgart.bpelSearching.matching.inexactmatching.EvalQueryInexactMatch;

public class TwigStackAlgorithmTest {

	static Logger logger = Logger.getLogger(TwigStackAlgorithmTest.class);

	private static DirectedGraph<ActivityNode, DefaultEdge> process1;
	private static DirectedGraph<ActivityNode, DefaultEdge> query1;
	private static DirectedGraph<ActivityNode, DefaultEdge> query1b;
	
	private static ProcessGraph processGraph1;
	private static QueryGraph queryGraph1;
	private static QueryGraph queryGraph1b;
	
	private static DirectedGraph<ActivityNode, DefaultEdge> process2;
	private static DirectedGraph<ActivityNode, DefaultEdge> query2;
	
	private static ProcessGraph processGraph2;
	private static QueryGraph queryGraph2;
	
	private static ActivityNode process1FlowA_start;
	private static ActivityNode process1FlowA_end;
	private static ActivityNode process1ReceiveB;
	private static ActivityNode process1InvokeC;
	private static ActivityNode process1InvokeD;
	private static ActivityNode process1InvokeE;
	private static ActivityNode process1AssignF;
	private static ActivityNode process1ReceiveG;
	private static ActivityNode process1SeqH_start;
	private static ActivityNode process1SeqH_end;
	private static ActivityNode process1EmptyI;
	private static ActivityNode process1AssignJ;
	private static ActivityNode process1ReplyK;
	private static ActivityNode process1SeqL_start;
	private static ActivityNode process1SeqL_end;
	private static ActivityNode process1WaitM;
	private static ActivityNode process1AssignN;
	private static ActivityNode process1ReceiveO;
	private static ActivityNode process1SeqP_start;
	private static ActivityNode process1SeqP_end;
	private static ActivityNode process1WaitQ;

	private static ActivityNode query1FlowA_start;
	private static ActivityNode query1FlowA_end;
	private static ActivityNode query1InvokeE;	
	private static ActivityNode query1AssignN;
	private static ActivityNode query1ReceiveO;	
	private static ActivityNode query1SeqP_start;
	private static ActivityNode query1SeqP_end;
	private static ActivityNode query1WaitQ;
		
	private static ActivityNode query1Invoke;
	private static ActivityNode query1Invoke2;
	private static ActivityNode query1Assign;
	private static ActivityNode query1Seq_start;
	private static ActivityNode query1Seq_end;
	private static ActivityNode query1Receive;
	private static ActivityNode query1ReceiveB;
	private static ActivityNode query1FlowA;
		
	private static ActivityNode process2Root;
	private static ActivityNode process2A1;
	private static ActivityNode process2A2;
	private static ActivityNode process2A3;
	private static ActivityNode process2A4;
	private static ActivityNode process2A5;
	private static ActivityNode process2A6;
	private static ActivityNode process2A7;
	private static ActivityNode process2A8;
	private static ActivityNode process2B1;
	private static ActivityNode process2B2;
	private static ActivityNode process2B3;
	private static ActivityNode process2B4;
	private static ActivityNode process2B5;
	private static ActivityNode process2C1;
	private static ActivityNode process2C2;
	private static ActivityNode process2C3;
	private static ActivityNode process2C4;
	private static ActivityNode process2C5;
	private static ActivityNode process2C6;
	private static ActivityNode process2C7;
	private static ActivityNode process2C8;
	private static ActivityNode process2C9;
	private static ActivityNode process2C10;
	private static ActivityNode process2C11;
	private static ActivityNode process2C12;
	
	private static ActivityNode query2A;
	private static ActivityNode query2B;
	private static ActivityNode query2B1;
	private static ActivityNode query2B2;
	private static ActivityNode query2C1;
	private static ActivityNode query2C2;
	private static ActivityNode query2C3;


	//@BeforeClass
	public static void setUp() {		
		// ********* process1 ***********
		process1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
		DefaultEdge.class);
		
		process1FlowA_start = new ActivityNode("P1", "FlowAp1_start",
		ActivityType.FLOW);
		process1FlowA_end = new ActivityNode("P2", "FlowAp1_end",
		ActivityType.FLOW);	
		// *********
		process1ReceiveB = new ActivityNode("P3", "ReceiveBp1",
		ActivityType.RECEIVE);
		process1InvokeC = new ActivityNode("P4", "InvokeCp1",
		ActivityType.INVOKE);
		process1InvokeD = new ActivityNode("P5", "InvokeDp1",
				ActivityType.INVOKE);
		process1InvokeE = new ActivityNode("P6", "InvokeEp1",
				ActivityType.INVOKE);
		process1AssignF = new ActivityNode("P7", "AssignFp1",
				ActivityType.ASSIGN);
		process1ReceiveG = new ActivityNode("P8", "ReceiveGp1",
				ActivityType.RECEIVE);
		process1SeqH_start = new ActivityNode("P9", "SeqHp1_start",
		ActivityType.SEQUENCE);
		process1SeqH_end = new ActivityNode("P10", "SeqHp1_end",
		ActivityType.SEQUENCE);
		process1EmptyI = new ActivityNode("P11", "EmptyIp1",
				ActivityType.EMPTY);
		process1AssignJ = new ActivityNode("P12", "AssignJp1",
				ActivityType.ASSIGN);
		process1ReplyK = new ActivityNode("P13", "ReplyKp1",
				ActivityType.REPLY);		
		process1SeqL_start = new ActivityNode("P14", "SeqLp1_start",
				ActivityType.SEQUENCE);
		process1SeqL_end = new ActivityNode("P15", "SeqLp1_end",
				ActivityType.SEQUENCE);
		process1WaitM = new ActivityNode("P16", "WaitMp1",
				ActivityType.WAIT);
		process1AssignN = new ActivityNode("P17", "AssignNp1",
				ActivityType.ASSIGN);
		process1ReceiveO = new ActivityNode("P18", "ReceiveOp1",
				ActivityType.RECEIVE);
		process1SeqP_start = new ActivityNode("P19", "SeqPp1_start",
				ActivityType.SEQUENCE);
		process1SeqP_end = new ActivityNode("P20", "SeqPp1_end",
				ActivityType.SEQUENCE);
		process1WaitQ = new ActivityNode("P21", "WaitQp1",
				ActivityType.WAIT);
		
		process1.addVertex(process1FlowA_start);
		process1.addVertex(process1FlowA_end);
		process1.addVertex(process1ReceiveB);
		process1.addVertex(process1InvokeC);
		
		process1.addVertex(process1InvokeD);
		
		process1.addVertex(process1InvokeE);
		process1.addVertex(process1AssignF);
		process1.addVertex(process1ReceiveG);
		process1.addVertex(process1SeqH_start);
		process1.addVertex(process1SeqH_end);
		process1.addVertex(process1EmptyI);
		
		process1.addVertex(process1AssignJ);
		process1.addVertex(process1ReplyK);
		process1.addVertex(process1SeqL_start);		
		process1.addVertex(process1SeqL_end);
		process1.addVertex(process1WaitM);
		
		process1.addVertex(process1AssignN);
		process1.addVertex(process1ReceiveO);
		process1.addVertex(process1SeqP_start);
		
		process1.addVertex(process1SeqP_end);
		
		process1.addVertex(process1WaitQ);
		
		process1.addEdge(process1FlowA_start, process1FlowA_end);
		process1.addEdge(process1FlowA_start, process1ReceiveB);
		process1.addEdge(process1ReceiveB, process1InvokeC);
		
		process1.addEdge(process1ReceiveB, process1InvokeD);
		
		process1.addEdge(process1ReceiveB, process1InvokeE);
		process1.addEdge(process1InvokeC, process1AssignF);
		process1.addEdge(process1AssignF, process1ReceiveG);
		process1.addEdge(process1InvokeC, process1SeqH_start);
		process1.addEdge(process1SeqH_start, process1EmptyI);
		process1.addEdge(process1EmptyI, process1SeqH_end);
		
		process1.addEdge(process1InvokeD, process1AssignJ);
		process1.addEdge(process1AssignJ, process1ReplyK);
		process1.addEdge(process1InvokeD, process1SeqL_start);
		process1.addEdge(process1SeqL_start, process1WaitM);
		process1.addEdge(process1WaitM, process1SeqL_end);
		
		process1.addEdge(process1InvokeE, process1AssignN);
		process1.addEdge(process1AssignN, process1ReceiveO);
		process1.addEdge(process1InvokeE, process1SeqP_start);
		process1.addEdge(process1SeqP_start, process1WaitQ);
		
		process1.addEdge(process1WaitQ, process1SeqP_end);
		
		processGraph1 = new ProcessGraph("processTwigStackTest", "www", "100", process1);
		
		//******** DAG Test **********		
		process1.addEdge(process1InvokeD, process1SeqH_start);
		
		process1.addEdge(process1InvokeE, process1SeqH_start);
		process1.addEdge(process1FlowA_end, process1InvokeE);
		//******** End DAG Test **********

//		query1FlowA_start = new ActivityNode("q1", "FlowAp1_start", ActivityType.FLOW);
//		query1FlowA_end = new ActivityNode("q2", "FlowAp1_end", ActivityType.FLOW);
//		query1InvokeE = new ActivityNode("q3", "InvokeEp1", ActivityType.INVOKE);
//		query1AssignN = new ActivityNode("q4", "AssignNp1", ActivityType.ASSIGN);
//		query1ReceiveO = new ActivityNode("q5", "ReceiveOp1", ActivityType.RECEIVE);
//		query1SeqP_start = new ActivityNode("q6", "SeqPp1_start", ActivityType.SEQUENCE);
//		query1SeqP_end = new ActivityNode("q7", "SeqPp1_end", ActivityType.SEQUENCE);
//		query1WaitQ = new ActivityNode("q8", "WaitQp1", ActivityType.WAIT);		
//		query1.addVertex(query1FlowA_start);
//		query1.addVertex(query1FlowA_end);
//		query1.addVertex(query1InvokeE);
//		query1.addVertex(query1AssignN);
//		query1.addVertex(query1ReceiveO);
//		query1.addVertex(query1SeqP_start);
//		query1.addVertex(query1SeqP_end);
//		query1.addVertex(query1WaitQ);		
//		query1.addEdge(query1FlowA_start, query1FlowA_end);
//		query1.addEdge(query1FlowA_start, query1InvokeE);
//		query1.addEdge(query1InvokeE, query1AssignN);
//		query1.addEdge(query1AssignN, query1ReceiveO);
//		query1.addEdge(query1InvokeE, query1SeqP_start);
//		query1.addEdge(query1SeqP_start, query1WaitQ);
//		query1.addEdge(query1WaitQ, query1SeqP_end);
		
		// ******* query1 ******* Twig pattern query *********
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		query1Invoke = new ActivityNode("q1Invoke", "Invoke*", ActivityType.INVOKE);
		query1Assign = new ActivityNode("q1Assign", "Assign*", ActivityType.ASSIGN);
//		query1Seq_start = new ActivityNode("q1SeqStart", "SeqHp1_start", ActivityType.SEQUENCE);
//		query1Seq_end = new ActivityNode("q1SeqEnd", "SeqHp1_end", ActivityType.SEQUENCE);
		query1Seq_start = new ActivityNode("q1SeqStart", "Seq*", ActivityType.SEQUENCE);
		query1Seq_end = new ActivityNode("q1SeqEnd", "Seq*", ActivityType.SEQUENCE);
		query1Receive = new ActivityNode("q1Receive", "Receive*", ActivityType.RECEIVE);
//		query1ReceiveB = new ActivityNode("q1ReceiveB", "ReceiveBp1", ActivityType.RECEIVE);
		query1ReceiveB = new ActivityNode("q1ReceiveB", "Receive*", ActivityType.RECEIVE);
		query1FlowA = new ActivityNode("q1FlowA", "Flow*", ActivityType.FLOW);
			
		query1.addVertex(query1Invoke);
		query1.addVertex(query1Assign);
		query1.addVertex(query1Seq_start);
		query1.addVertex(query1Seq_end);
		query1.addVertex(query1Receive);
		query1.addVertex(query1ReceiveB);
		query1.addVertex(query1FlowA);
		
		query1.addEdge(query1Invoke, query1Assign);
		query1.addEdge(query1Invoke, query1Seq_start);
		query1.addEdge(query1Seq_start, query1Seq_end);
		query1.addEdge(query1Assign, query1Receive);
		query1.addEdge(query1ReceiveB, query1Invoke);
		query1.addEdge(query1FlowA, query1ReceiveB);

		queryGraph1 = new QueryGraph(query1);
		
		// ******* query1b ******* DAG pattern query *********
		query1b = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		query1Invoke2 = new ActivityNode("q1Invoke2", "Invoke*", ActivityType.INVOKE);
		query1b.addVertex(query1ReceiveB);
		query1b.addVertex(query1Invoke);
		query1b.addVertex(query1Invoke2);
		query1b.addVertex(query1Seq_start);
		
		query1b.addEdge(query1ReceiveB, query1Invoke);
		query1b.addEdge(query1ReceiveB, query1Invoke2);
		query1b.addEdge(query1Invoke, query1Seq_start);
		query1b.addEdge(query1Invoke2, query1Seq_start);
		
		queryGraph1b = new QueryGraph(query1b);

		
		// ********** process2 ************
		// This graph is taken from article "Holistic Twig Joins on Indexed 
		// XML Documents"
		process2 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
		DefaultEdge.class);
		
		process2Root = new ActivityNode("0", "R", ActivityType.INVOKE);		
//		process2A1 = new ActivityNode("A1", "A", ActivityType.INVOKE);
//		process2A2 = new ActivityNode("A2", "A", ActivityType.INVOKE);
//		process2A3 = new ActivityNode("A3", "A", ActivityType.INVOKE);
//		process2A4 = new ActivityNode("A4", "A", ActivityType.INVOKE);
//		process2A5 = new ActivityNode("A5", "A", ActivityType.INVOKE);
//		process2A6 = new ActivityNode("A6", "A", ActivityType.INVOKE);
		process2A7 = new ActivityNode("A7", "A", ActivityType.INVOKE);
//		process2A8 = new ActivityNode("A8", "A", ActivityType.INVOKE);
//		process2B1 = new ActivityNode("B1", "B", ActivityType.INVOKE);
//		process2B2 = new ActivityNode("B2", "B", ActivityType.INVOKE);
//		process2B3 = new ActivityNode("B3", "B", ActivityType.INVOKE);
		process2B4 = new ActivityNode("B4", "B", ActivityType.INVOKE);
		process2B5 = new ActivityNode("B5", "B", ActivityType.INVOKE);
//		process2C1 = new ActivityNode("C1", "C", ActivityType.INVOKE);
//		process2C2 = new ActivityNode("C2", "C", ActivityType.INVOKE);
//		process2C3 = new ActivityNode("C3", "C", ActivityType.INVOKE);
//		process2C4 = new ActivityNode("C4", "C", ActivityType.INVOKE);
//		process2C5 = new ActivityNode("C5", "C", ActivityType.INVOKE);
//		process2C6 = new ActivityNode("C6", "C", ActivityType.INVOKE);
//		process2C7 = new ActivityNode("C7", "C", ActivityType.INVOKE);
		process2C8 = new ActivityNode("C8", "C", ActivityType.INVOKE);
		process2C9 = new ActivityNode("C9", "C", ActivityType.INVOKE);
		process2C10 = new ActivityNode("C10", "C", ActivityType.INVOKE);
		process2C11 = new ActivityNode("C11", "C", ActivityType.INVOKE);
		process2C12 = new ActivityNode("C12", "C", ActivityType.INVOKE);
		
		process2.addVertex(process2Root);
//		process2.addVertex(process2A1);
//		process2.addVertex(process2A2);
//		process2.addVertex(process2A3);
//		process2.addVertex(process2A4);
//		process2.addVertex(process2A5);
//		process2.addVertex(process2A6);
		process2.addVertex(process2A7);
//		process2.addVertex(process2A8);
//		process2.addVertex(process2B1);
//		process2.addVertex(process2B2);
//		process2.addVertex(process2B3);
		process2.addVertex(process2B4);
		process2.addVertex(process2B5);
//		process2.addVertex(process2C1);
//		process2.addVertex(process2C2);
//		process2.addVertex(process2C3);
//		process2.addVertex(process2C4);
//		process2.addVertex(process2C5);
//		process2.addVertex(process2C6);
//		process2.addVertex(process2C7);
		process2.addVertex(process2C8);
		process2.addVertex(process2C9);
		process2.addVertex(process2C10);
		process2.addVertex(process2C11);
		process2.addVertex(process2C12);

		
//		process2.addEdge(process2Root, process2A1);
//		process2.addEdge(process2A1, process2A2);
//		process2.addEdge(process2A2, process2C1);
//		process2.addEdge(process2C1, process2A3);
//		process2.addEdge(process2A1, process2C2);
//		process2.addEdge(process2C2, process2C3);
//		process2.addEdge(process2C3, process2A4);
//		
//		process2.addEdge(process2Root, process2C4);
//		process2.addEdge(process2C4, process2B1);
//		process2.addEdge(process2B1, process2C5);
//		process2.addEdge(process2C4, process2B2);
//		process2.addEdge(process2B2, process2B3);
//		process2.addEdge(process2B3, process2C6);
		
//		process2.addEdge(process2Root, process2A5);
//		process2.addEdge(process2A5, process2A6);
//		process2.addEdge(process2A6, process2C7);
		
		process2.addEdge(process2Root, process2A7);
//		process2.addEdge(process2A8, process2A7);
		process2.addEdge(process2A7, process2C8);
		process2.addEdge(process2C8, process2B4);
		process2.addEdge(process2B4, process2C9);
		process2.addEdge(process2B4, process2C10);
		process2.addEdge(process2A7, process2C11);
		process2.addEdge(process2C11, process2B5);
		process2.addEdge(process2B5, process2C12);
		
		processGraph2 = new ProcessGraph("processTwigStackTest", "www", "100", process2);

		// ******* query2 ******* Twig pattern query *********
		query2 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		
		query2A = new ActivityNode("q2A", "A", ActivityType.INVOKE);
		query2B = new ActivityNode("q2B", "B", ActivityType.INVOKE);
		query2C1 = new ActivityNode("q2C1", "C", ActivityType.INVOKE);
		query2C2 = new ActivityNode("q2C2", "C", ActivityType.INVOKE);
		//query2C3 = new ActivityNode("q2C3", "C", ActivityType.INVOKE);
		
		query2.addVertex(query2A);
		query2.addVertex(query2B);
		query2.addVertex(query2C1);
		query2.addVertex(query2C2);
		//query2.addVertex(query2C3);
		
		query2.addEdge(query2A, query2B);
		query2.addEdge(query2B, query2C1);
		query2.addEdge(query2A, query2C2);
		//query2.addEdge(query2A, query2C3);
		
		// ******* query2b ******* Twig pattern query *********
//		query2bA = new ActivityNode("q2A", "A", ActivityType.INVOKE);
//		query2bB1 = new ActivityNode("q2B1", "B", ActivityType.INVOKE);
//		query2bB2 = new ActivityNode("q2B2", "B", ActivityType.INVOKE);
//		query2bC1 = new ActivityNode("q2C1", "C", ActivityType.INVOKE);
//		query2bC2 = new ActivityNode("q2C2", "C", ActivityType.INVOKE);
//		
//		query2b.addVertex(query2bA);
//		query2b.addVertex(query2bB1);
//		query2b.addVertex(query2bB2);
//		query2b.addVertex(query2bC1);
//		query2b.addVertex(query2bC2);
//		
//		query2b.addEdge(query2bA, query2bB1);
//		query2b.addEdge(query2bB1, query2bC1);
//		query2b.addEdge(query2bB1, query2bB2);
//		query2b.addEdge(query2bA, query2bC2);
		
		queryGraph2 = new QueryGraph(query2);		
	}


//	@Test
//	public void twigStackTest() {		
//		TwigStackAlgorithm twig = new TwigStackAlgorithm(queryGraph1, processGraph1);
//
//		GraphAnalyse<ActivityNode, DefaultEdge> ga = new GraphAnalyse<ActivityNode, DefaultEdge>(processGraph1.getProcessGraph(), null);
//    	
//    	if(processGraph1.getStartActivity() == null){
//    		processGraph1.setStartActivity(ga.getStartVertex());
//    		}
//    	    	
//    	processGraph1.setProcessGraphType(ga.checkGraphType());
    	
//		logger.warn("query graph type: ");
//		logger.warn(queryGraph1.getQueryGraphType().toString());
//		logger.warn("process graph type: ");
//		logger.warn(processGraph1.getProcessGraphType().toString());
//		logger.warn("process graph start vertex: ");
//		logger.warn(processGraph1.getStartActivity().toString());
    	
//		twig.twigStack(queryGraph1.getStartVertex());
//	}
	
	
//	@Test
//	public void matchinBPELTest() {		
//		MatchBPELForTestOfTwigStackAlgorithm matchBPEL = new MatchBPELForTestOfTwigStackAlgorithm(queryGraph1, processGraph1);
//		matchBPEL.match();
//	}
	
	public static void main(String[] args) {			
		setUp();
		List<ProcessGraph> pGraphs = new ArrayList<ProcessGraph>();
		pGraphs.add(processGraph2);
//		EvalQueryExactMatch evalQueryExact = new EvalQueryExactMatch(queryGraph1b, pGraphs);
//		evalQueryExact.doExactMatch();
		EvalQueryInexactMatch evalQueryInexact = new EvalQueryInexactMatch(queryGraph2, pGraphs);
		evalQueryInexact.doInexactMatch();	
		System.exit(0);		
	}	
}
