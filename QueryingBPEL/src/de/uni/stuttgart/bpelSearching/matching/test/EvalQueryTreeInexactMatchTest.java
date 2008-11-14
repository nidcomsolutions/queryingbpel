/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.test;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni.stuttgart.bpelSearching.matching.inexactmatching.EvalQueryInexactMatch;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityType;

/**
 * @author luwei
 *
 */
public class EvalQueryTreeInexactMatchTest {
	static Logger logger = Logger.getLogger(EvalQueryTreeInexactMatchTest.class);
	
	//*********** Process Graph 1 ******************
	private static DirectedGraph<ActivityNode, DefaultEdge> process1;
	private static DirectedGraph<ActivityNode, DefaultEdge> query1;
	
	private static ProcessFlowGraph processGraph1;
	private static QueryGraph queryGraph1;
	
	private static ActivityNode process1P1;
	private static ActivityNode process1R1;
	private static ActivityNode process1R2;
	private static ActivityNode process1A1;
	private static ActivityNode process1A2;
	private static ActivityNode process1B1;
	private static ActivityNode process1C1;
	private static ActivityNode process1D1;
	private static ActivityNode process1E1;
	private static ActivityNode process1F1;
	private static ActivityNode process1G1;
	private static ActivityNode process1H1;
	private static ActivityNode process1I1;
	private static ActivityNode process1K1;
	private static ActivityNode process1K2;
	private static ActivityNode process1M1;
	
	private static ActivityNode query1R;
	private static ActivityNode query1A;
	private static ActivityNode query1B;
	private static ActivityNode query1C;
	private static ActivityNode query1D;
	private static ActivityNode query1E;
	private static ActivityNode query1F;
	private static ActivityNode query1G;
	private static ActivityNode query1H;
	
	
	//*********** Process Graph 2 ******************
	private static DirectedGraph<ActivityNode, DefaultEdge> process2;
	private static DirectedGraph<ActivityNode, DefaultEdge> query2;
	private static ProcessFlowGraph processGraph2;
	private static QueryGraph queryGraph2;
	
	private static ActivityNode process2R1;
	private static ActivityNode process2A1;
	private static ActivityNode process2A2;
	private static ActivityNode process2B1;
	private static ActivityNode process2B2;
	private static ActivityNode process2C1;
	private static ActivityNode process2C2;
	private static ActivityNode process2D1;
	private static ActivityNode process2D2;
	private static ActivityNode process2E1;
	private static ActivityNode process2E2;
	private static ActivityNode process2F1;
	private static ActivityNode process2F2;
	private static ActivityNode process2G1;
	private static ActivityNode process2G2;
	
	private static ActivityNode query2A;
	private static ActivityNode query2B;
	private static ActivityNode query2C;
	private static ActivityNode query2D;
	private static ActivityNode query2E;
	private static ActivityNode query2F;
	private static ActivityNode query2G;
	
	
	@BeforeClass
	public static void setUp() {
		//*********** Process Graph 1 ******************	
		process1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		process1P1 = new ActivityNode("P1", "P", ActivityType.INVOKE);
		process1R1 = new ActivityNode("R1", "R", ActivityType.INVOKE);
		process1R2 = new ActivityNode("R2", "R", ActivityType.INVOKE);
		process1A1 = new ActivityNode("A1", "A", ActivityType.INVOKE);
		process1A2 = new ActivityNode("A2", "A", ActivityType.INVOKE);
		process1B1 = new ActivityNode("B1", "B", ActivityType.INVOKE);
		process1C1 = new ActivityNode("C1", "C", ActivityType.INVOKE);
		process1D1 = new ActivityNode("D1", "D", ActivityType.INVOKE);
		process1E1 = new ActivityNode("E1", "E", ActivityType.INVOKE);
		process1F1 = new ActivityNode("F1", "F", ActivityType.INVOKE);
		process1G1 = new ActivityNode("G1", "G", ActivityType.INVOKE);
		process1H1 = new ActivityNode("H1", "H", ActivityType.INVOKE);
		process1I1 = new ActivityNode("I1", "I", ActivityType.INVOKE);
		process1K1 = new ActivityNode("K1", "K", ActivityType.INVOKE);
		process1K2 = new ActivityNode("K2", "K", ActivityType.INVOKE);
		process1M1 = new ActivityNode("M1", "M", ActivityType.INVOKE);
		
		process1.addVertex(process1P1);
		process1.addVertex(process1R1);
		process1.addVertex(process1R2);
		process1.addVertex(process1A1);
		process1.addVertex(process1A2);
		process1.addVertex(process1B1);
		process1.addVertex(process1C1);
		process1.addVertex(process1D1);
		process1.addVertex(process1E1);
		process1.addVertex(process1F1);
		process1.addVertex(process1G1);
		process1.addVertex(process1H1);
		process1.addVertex(process1I1);
		process1.addVertex(process1K1);
		process1.addVertex(process1K2);
		process1.addVertex(process1M1);
		
		process1.addEdge(process1P1, process1R1);
		process1.addEdge(process1R1, process1A1);
		process1.addEdge(process1R1, process1K1);
		process1.addEdge(process1A1, process1B1);
		process1.addEdge(process1A1, process1M1);
		process1.addEdge(process1M1, process1C1);
		process1.addEdge(process1P1, process1R2);
		process1.addEdge(process1R2, process1D1);
		process1.addEdge(process1D1, process1E1);
		process1.addEdge(process1E1, process1F1);
		process1.addEdge(process1E1, process1G1);
		process1.addEdge(process1E1, process1H1);
		process1.addEdge(process1R2, process1A2);
		process1.addEdge(process1A2, process1I1);
		process1.addEdge(process1A2, process1K2);
		
		processGraph1 = new ProcessFlowGraph("processTreeInexactTest1", "www", "100", process1);
		
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		query1R = new ActivityNode("q1R", "R", ActivityType.INVOKE);
		query1A = new ActivityNode("q1A", "A", ActivityType.INVOKE);
		query1B = new ActivityNode("q1B", "B", ActivityType.INVOKE);
		query1C = new ActivityNode("q1C", "C", ActivityType.INVOKE);
		query1D = new ActivityNode("q1D", "D", ActivityType.INVOKE);
		query1E = new ActivityNode("q1E", "E", ActivityType.INVOKE);
		query1F = new ActivityNode("q1F", "F", ActivityType.INVOKE);
		query1G = new ActivityNode("q1G", "G", ActivityType.INVOKE);
		query1H = new ActivityNode("q1H", "H", ActivityType.INVOKE);
		
		query1.addVertex(query1R);
		query1.addVertex(query1A);
		query1.addVertex(query1B);
		query1.addVertex(query1C);
		query1.addVertex(query1D);
		query1.addVertex(query1E);
		query1.addVertex(query1F);
		query1.addVertex(query1G);
		query1.addVertex(query1H);
		
		query1.addEdge(query1R, query1A);
		query1.addEdge(query1A, query1B);
		query1.addEdge(query1A, query1C);
		query1.addEdge(query1R, query1D);
		query1.addEdge(query1D, query1E);
		query1.addEdge(query1E, query1F);
		query1.addEdge(query1E, query1G);
		query1.addEdge(query1E, query1H);
		
		queryGraph1 = new QueryGraph(query1);
		
		//*********** Process Graph 2 ******************
		process2 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		process2R1 = new ActivityNode("R1", "R", ActivityType.INVOKE);
		process2A1 = new ActivityNode("A1", "A", ActivityType.INVOKE);
		process2A2 = new ActivityNode("A2", "A", ActivityType.INVOKE);
		process2B1 = new ActivityNode("B1", "B", ActivityType.INVOKE);
		process2B2 = new ActivityNode("B2", "B", ActivityType.INVOKE);
		process2C1 = new ActivityNode("C1", "C", ActivityType.INVOKE);
		process2C2 = new ActivityNode("C2", "C", ActivityType.INVOKE);
		process2D1 = new ActivityNode("D1", "D", ActivityType.INVOKE);
		process2D2 = new ActivityNode("D2", "D", ActivityType.INVOKE);
		process2E1 = new ActivityNode("E1", "E", ActivityType.INVOKE);
		process2E2 = new ActivityNode("E2", "E", ActivityType.INVOKE);
		process2F1 = new ActivityNode("F1", "F", ActivityType.INVOKE);
		process2F2 = new ActivityNode("F2", "F", ActivityType.INVOKE);
		process2G1 = new ActivityNode("G1", "G", ActivityType.INVOKE);
		process2G2 = new ActivityNode("G2", "G", ActivityType.INVOKE);
		
		process2.addVertex(process2R1);
		process2.addVertex(process2A1);
		process2.addVertex(process2A2);
		process2.addVertex(process2B1);
		process2.addVertex(process2B2);
		process2.addVertex(process2C1);
		process2.addVertex(process2C2);
		process2.addVertex(process2D1);
		process2.addVertex(process2D2);
		process2.addVertex(process2E1);
		process2.addVertex(process2E2);
		process2.addVertex(process2F1);
		process2.addVertex(process2F2);
		process2.addVertex(process2G1);
		process2.addVertex(process2G2);
		
		process2.addEdge(process2R1, process2A1);
		process2.addEdge(process2R1, process2A2);
		process2.addEdge(process2A1, process2B1);
		process2.addEdge(process2A1, process2B2);
		process2.addEdge(process2A1, process2C1);
		process2.addEdge(process2A1, process2C2);
		process2.addEdge(process2A2, process2B1);
		process2.addEdge(process2A2, process2B2);
		process2.addEdge(process2A2, process2C1);
		process2.addEdge(process2A2, process2C2);
		process2.addEdge(process2B1, process2D1);
		process2.addEdge(process2B1, process2D2);
		process2.addEdge(process2B1, process2E1);
		process2.addEdge(process2B1, process2E2);
		process2.addEdge(process2B2, process2D1);
		process2.addEdge(process2B2, process2D2);
		process2.addEdge(process2B2, process2E1);
		process2.addEdge(process2B2, process2E2);
		process2.addEdge(process2C1, process2F1);
		process2.addEdge(process2C1, process2F2);
		process2.addEdge(process2C1, process2G1);
		process2.addEdge(process2C1, process2G2);
		process2.addEdge(process2C2, process2F1);
		process2.addEdge(process2C2, process2F2);
		process2.addEdge(process2C2, process2G1);
		process2.addEdge(process2C2, process2G2);
		
		processGraph2 = new ProcessFlowGraph("processTreeInexactTest2", "www", "200", process2);
		
		query2 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		query2A = new ActivityNode("q2A", "A", ActivityType.INVOKE);
		query2B = new ActivityNode("q2B", "B", ActivityType.INVOKE);
		query2C = new ActivityNode("q2C", "C", ActivityType.INVOKE);
		query2D = new ActivityNode("q2D", "D", ActivityType.INVOKE);
		query2E = new ActivityNode("q2E", "E", ActivityType.INVOKE);
		query2F = new ActivityNode("q2F", "F", ActivityType.INVOKE);
		query2G = new ActivityNode("q2G", "G", ActivityType.INVOKE);
		query2.addVertex(query2A);
		query2.addVertex(query2B);
		query2.addVertex(query2C);
		query2.addVertex(query2D);
		query2.addVertex(query2E);
		query2.addVertex(query2F);
		query2.addVertex(query2G);
		query2.addEdge(query2A, query2B);
		query2.addEdge(query2A, query2C);
		query2.addEdge(query2B, query2D);
		query2.addEdge(query2B, query2E);
		query2.addEdge(query2C, query2F);
		query2.addEdge(query2C, query2G);
		
		queryGraph2 = new QueryGraph(query2);
	}
	
	
	/**
	 * Test query tree.
	 */
	 @Test
	 public void testQueryTreeMatch() {
		 EvalQueryInexactMatch evalQInexactMatch = new EvalQueryInexactMatch(
				 queryGraph1, processGraph1);
		 evalQInexactMatch.initSolutionStreams();
		 evalQInexactMatch.computeMaxAssignForTreeNodes();
		 evalQInexactMatch.maxMatchsOfQueryTree();
		 
	 }	 
}
