package de.uni.stuttgart.bpelSearching.test;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityType;

public class MergeJoinTest {
	
	static Logger logger = Logger.getLogger(QueryGraphTest.class);
	
	private static DirectedGraph<ActivityNode, DefaultEdge> query1;
	
	private static QueryGraph queryGraph1;
	
	private static ActivityNode query1A;
	private static ActivityNode query1B;
	private static ActivityNode query1C;
	private static ActivityNode query1D;
	private static ActivityNode query1E;
	
	
	private static DirectedGraph<ActivityNode, DefaultEdge> process1;
	private static ProcessGraph processGraph1;
	
	private static ActivityNode process1Root;
	private static ActivityNode process1A2;
	private static ActivityNode process1A4;
	private static ActivityNode process1B2;
	private static ActivityNode process1B3;
	private static ActivityNode process1B4;
	private static ActivityNode process1C2;
	private static ActivityNode process1C4;
	private static ActivityNode process1C5;
	private static ActivityNode process1D2;
	private static ActivityNode process1D3;
	private static ActivityNode process1D4;
	private static ActivityNode process1E1;
	private static ActivityNode process1E2;
	private static ActivityNode process1E4;
	private static ActivityNode process1E5;
	
	

	//@BeforeClass
	public static void setUp() {	
		// ******* query1 ******* Twig pattern query *********
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		
		query1A = new ActivityNode("q1A", "A", ActivityType.INVOKE);
		query1B = new ActivityNode("q1B", "B", ActivityType.INVOKE);
		query1C = new ActivityNode("q1C", "C", ActivityType.INVOKE);
		query1D = new ActivityNode("q1D", "D", ActivityType.INVOKE);
		query1E = new ActivityNode("q1E", "E", ActivityType.INVOKE);
		
		query1.addVertex(query1A);
		query1.addVertex(query1B);
		query1.addVertex(query1C);
		query1.addVertex(query1D);
		query1.addVertex(query1E);
		
		query1.addEdge(query1A, query1B);
		query1.addEdge(query1A, query1C);
		query1.addEdge(query1C, query1D);
		query1.addEdge(query1C, query1E);
		
		queryGraph1 = new QueryGraph(query1);
		
		// ********** process1 ************
		// This graph is taken from article "A Fast Tree Pattern Matching Algorithm 
		// for XML Documents"
		process1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
		DefaultEdge.class);
		
		process1Root = new ActivityNode("Root", "R", ActivityType.INVOKE);		
		process1A2 = new ActivityNode("A2", "A", ActivityType.INVOKE);
		process1A4 = new ActivityNode("A4", "A", ActivityType.INVOKE);
		process1B2 = new ActivityNode("B2", "B", ActivityType.INVOKE);
		process1B3 = new ActivityNode("B3", "B", ActivityType.INVOKE);
		process1B4 = new ActivityNode("B4", "B", ActivityType.INVOKE);
		process1C2 = new ActivityNode("C2", "C", ActivityType.INVOKE);
		process1C4 = new ActivityNode("C4", "C", ActivityType.INVOKE);
		process1C5 = new ActivityNode("C5", "C", ActivityType.INVOKE);
		process1D2 = new ActivityNode("D2", "D", ActivityType.INVOKE);
		process1D3 = new ActivityNode("D3", "D", ActivityType.INVOKE);
		process1D4 = new ActivityNode("D4", "D", ActivityType.INVOKE);
		process1E1 = new ActivityNode("E1", "E", ActivityType.INVOKE);
		process1E2 = new ActivityNode("E2", "E", ActivityType.INVOKE);
		process1E4 = new ActivityNode("E4", "E", ActivityType.INVOKE);
		process1E5 = new ActivityNode("E5", "E", ActivityType.INVOKE);
		
		process1.addVertex(process1Root);
		process1.addVertex(process1A2);
		process1.addVertex(process1A4);
		process1.addVertex(process1B2);
		process1.addVertex(process1B3);
		process1.addVertex(process1B4);
		process1.addVertex(process1C2);
		process1.addVertex(process1C4);		
		process1.addVertex(process1C5);
		process1.addVertex(process1D2);
		process1.addVertex(process1D3);
		process1.addVertex(process1D4);
		process1.addVertex(process1E1);
		process1.addVertex(process1E2);
		process1.addVertex(process1E4);
		process1.addVertex(process1E5);

		process1.addEdge(process1Root, process1A2);
		process1.addEdge(process1A2, process1B2);
		process1.addEdge(process1A2, process1B3);
		process1.addEdge(process1A2, process1C2);
		process1.addEdge(process1C2, process1D2);
		process1.addEdge(process1C2, process1E1);
		process1.addEdge(process1C2, process1E2);
		process1.addEdge(process1Root, process1A4);
		process1.addEdge(process1A4, process1B4);
		process1.addEdge(process1A4, process1C4);
		process1.addEdge(process1A4, process1C5);
		process1.addEdge(process1C4, process1D3);
		process1.addEdge(process1C4, process1E4);
		process1.addEdge(process1C5, process1D4);
		process1.addEdge(process1C5, process1E5);		
		
		processGraph1 = new ProcessGraph("processMergeJoinTest", "www", "100", process1);
	}
		
	public static void main(String[] args) {		
		setUp();
		MatchBPELForTestOfTwigStackAlgorithm matchBPEL = new MatchBPELForTestOfTwigStackAlgorithm(queryGraph1, processGraph1, true);
		matchBPEL.match();
		System.exit(0);
	}

}
