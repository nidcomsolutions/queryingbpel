/**
 * 
 */
package de.uni.stuttgart.bpelSearching.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityType;
import de.uni.stuttgart.bpelSearching.matching.inexactmatching.EvalQueryInexactMatch;
import de.uni.stuttgart.bpelSearching.matching.inexactmatching.InexactMatchAlgorithms;

/**
 * @author luwei
 *
 */
public class EvalQueryDAGInexactMatchTest {
	static Logger logger = Logger.getLogger(EvalQueryDAGInexactMatchTest.class);
	//*********** Process Graph 1 ******************
	private static DirectedGraph<ActivityNode, DefaultEdge> process1;
	private static DirectedGraph<ActivityNode, DefaultEdge> query1;
	private static ProcessGraph processGraph1;
	private static QueryGraph queryGraph1;
	
	private static ActivityNode process1R1;
	private static ActivityNode process1O1;
	private static ActivityNode process1O2;
	private static ActivityNode process1I1;
	private static ActivityNode process1A1;
	private static ActivityNode process1A2;
	private static ActivityNode process1K1;
	private static ActivityNode process1C1;
	private static ActivityNode process1C2;
	private static ActivityNode process1D1;
	private static ActivityNode process1E1;
	private static ActivityNode process1F1;
	private static ActivityNode process1F2;
	private static ActivityNode process1G1;
	private static ActivityNode process1H1;
	private static ActivityNode process1N1;
	private static ActivityNode process1N2;
	private static ActivityNode process1M1;
	private static ActivityNode process1T1;
	private static ActivityNode process1X1;
	private static ActivityNode process1X2;
	private static ActivityNode process1Y1;
	private static ActivityNode process1Y2;
	private static ActivityNode process1Y3;
	private static ActivityNode process1Z1;
	private static ActivityNode process1Z2;
	
	private static ActivityNode query1O;
	private static ActivityNode query1A;
	private static ActivityNode query1B;
	private static ActivityNode query1C;
	private static ActivityNode query1D;
	private static ActivityNode query1E;
	private static ActivityNode query1F;
	private static ActivityNode query1G;
	private static ActivityNode query1H;
	private static ActivityNode query1X;
	private static ActivityNode query1Y;
	private static ActivityNode query1Z;
	
	@BeforeClass
	public static void setUp() {
		//*********** Process Graph 1 ******************	
		process1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		process1R1 = new ActivityNode("R1", "R", ActivityType.INVOKE);
		process1O1 = new ActivityNode("O1", "O", ActivityType.INVOKE);
		process1O2 = new ActivityNode("O2", "O", ActivityType.INVOKE);
		process1I1 = new ActivityNode("I1", "I", ActivityType.INVOKE);
		process1A1 = new ActivityNode("A1", "A", ActivityType.INVOKE);
		process1A2 = new ActivityNode("A2", "A", ActivityType.INVOKE);
		process1K1 = new ActivityNode("K1", "K", ActivityType.INVOKE);
		process1C1 = new ActivityNode("C1", "C", ActivityType.INVOKE);
		process1C2 = new ActivityNode("C2", "C", ActivityType.INVOKE);
		process1D1 = new ActivityNode("D1", "D", ActivityType.INVOKE);
		process1E1 = new ActivityNode("E1", "E", ActivityType.INVOKE);
		process1F1 = new ActivityNode("F1", "F", ActivityType.INVOKE);
		process1F2 = new ActivityNode("F2", "F", ActivityType.INVOKE);
		process1G1 = new ActivityNode("G1", "G", ActivityType.INVOKE);
		process1H1 = new ActivityNode("H1", "H", ActivityType.INVOKE);
		process1N1 = new ActivityNode("N1", "N", ActivityType.INVOKE);
		process1N2 = new ActivityNode("N2", "N", ActivityType.INVOKE);
		process1M1 = new ActivityNode("M1", "M", ActivityType.INVOKE);
		process1T1 = new ActivityNode("T1", "T", ActivityType.INVOKE);
		process1X1 = new ActivityNode("X1", "X", ActivityType.INVOKE);
		process1X2 = new ActivityNode("X2", "X", ActivityType.INVOKE);
		process1Y1 = new ActivityNode("Y1", "Y", ActivityType.INVOKE);
		process1Y2 = new ActivityNode("Y2", "Y", ActivityType.INVOKE);
		process1Y3 = new ActivityNode("Y3", "Y", ActivityType.INVOKE);
		process1Z1 = new ActivityNode("Z1", "Z", ActivityType.INVOKE);
		process1Z2 = new ActivityNode("Z2", "Z", ActivityType.INVOKE);
		
		process1.addVertex(process1R1);
		process1.addVertex(process1O1);
		process1.addVertex(process1O2);
		process1.addVertex(process1I1);
		process1.addVertex(process1A1);
		process1.addVertex(process1A2);
		process1.addVertex(process1K1);
		process1.addVertex(process1C1);
		process1.addVertex(process1C2);
		process1.addVertex(process1D1);
		process1.addVertex(process1E1);
		process1.addVertex(process1F1);
		process1.addVertex(process1F2);
		process1.addVertex(process1G1);
		process1.addVertex(process1H1);
		process1.addVertex(process1N1);
		process1.addVertex(process1N2);
		process1.addVertex(process1M1);
		process1.addVertex(process1T1);
		process1.addVertex(process1X1);
		process1.addVertex(process1X2);
		process1.addVertex(process1Y1);
		process1.addVertex(process1Y2);
		process1.addVertex(process1Y3);
		process1.addVertex(process1Z1);
		process1.addVertex(process1Z2);
		
		process1.addEdge(process1R1, process1O1);
		process1.addEdge(process1R1, process1I1);
		process1.addEdge(process1O1, process1A1);
		process1.addEdge(process1O1, process1X1);
		process1.addEdge(process1O1, process1K1);
		process1.addEdge(process1I1, process1K1);
		process1.addEdge(process1I1, process1O2);
		process1.addEdge(process1A1, process1C1);
		process1.addEdge(process1A1, process1N1);
		process1.addEdge(process1X1, process1N1);
		process1.addEdge(process1K1, process1X2);
		process1.addEdge(process1K1, process1T1);
		process1.addEdge(process1K1, process1A2);
		process1.addEdge(process1O2, process1A2);
		process1.addEdge(process1C1, process1F1);
		process1.addEdge(process1F1, process1N2);
		process1.addEdge(process1F1, process1M1);
		process1.addEdge(process1N1, process1Y1);
		process1.addEdge(process1Y1, process1Z1);
		process1.addEdge(process1X2, process1Y2);
		process1.addEdge(process1T1, process1C2);
		process1.addEdge(process1C2, process1E1);
		process1.addEdge(process1C2, process1D1);
		process1.addEdge(process1C2, process1F2);
		process1.addEdge(process1E1, process1G1);
		process1.addEdge(process1E1, process1H1);
		process1.addEdge(process1A2, process1Y3);
		process1.addEdge(process1Y3, process1Z2);
		
		processGraph1 = new ProcessGraph("processDAGInexactTest1", "www", "100", process1);
		
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		query1O = new ActivityNode("q1O", "O", ActivityType.INVOKE);
		query1A = new ActivityNode("q1A", "A", ActivityType.INVOKE);
		query1B = new ActivityNode("q1B", "B", ActivityType.INVOKE);
		query1C = new ActivityNode("q1C", "C", ActivityType.INVOKE);
		query1D = new ActivityNode("q1D", "D", ActivityType.INVOKE);
		query1E = new ActivityNode("q1E", "E", ActivityType.INVOKE);
		query1F = new ActivityNode("q1F", "F", ActivityType.INVOKE);
		query1G = new ActivityNode("q1G", "G", ActivityType.INVOKE);
		query1H = new ActivityNode("q1H", "H", ActivityType.INVOKE);
		query1X = new ActivityNode("q1X", "X", ActivityType.INVOKE);
		query1Y = new ActivityNode("q1Y", "Y", ActivityType.INVOKE);
		query1Z = new ActivityNode("q1Z", "Z", ActivityType.INVOKE);
		
		query1.addVertex(query1O);
		query1.addVertex(query1A);
		query1.addVertex(query1B);
		query1.addVertex(query1C);
		query1.addVertex(query1D);
		query1.addVertex(query1E);
		query1.addVertex(query1F);
		query1.addVertex(query1G);
		query1.addVertex(query1H);
		query1.addVertex(query1X);
		query1.addVertex(query1Y);
		query1.addVertex(query1Z);
		
		query1.addEdge(query1O, query1A);
		query1.addEdge(query1O, query1B);
		query1.addEdge(query1O, query1X);
		query1.addEdge(query1X, query1Y);
		query1.addEdge(query1Y, query1Z);
		query1.addEdge(query1A, query1Y);
		query1.addEdge(query1A, query1C);
		query1.addEdge(query1B, query1C);
		query1.addEdge(query1C, query1D);
		query1.addEdge(query1C, query1E);
		query1.addEdge(query1C, query1F);
		query1.addEdge(query1E, query1G);
		query1.addEdge(query1E, query1H);
		
		queryGraph1 = new QueryGraph(query1);
	}
	
	/**
	 * Test query tree.
	 */
	 @Test
	 public void testQueryTreeMatch() {
//		 InexactMatchAlgorithms.setQuerygraph(queryGraph1);
//		 InexactMatchAlgorithms evalQInexactMatch = new InexactMatchAlgorithms(processGraph1);
//		 evalQInexactMatch.initSolutionStreams();
//		 evalQInexactMatch.computeMaxAssignForDAGNodes();
//		 evalQInexactMatch.maxMatchsOfQueryDAG();
		 List<ProcessGraph> pGraphs = new ArrayList<ProcessGraph>();
		 pGraphs.add(processGraph1);
		 EvalQueryInexactMatch evalQueryInexact = new EvalQueryInexactMatch(queryGraph1, pGraphs);
		 evalQueryInexact.doInexactMatch();	 
	 }	
	
}
