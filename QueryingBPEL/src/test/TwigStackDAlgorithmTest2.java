/**
 * 
 */
package test;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.BeforeClass;

import de.uni.stuttgart.bpelSearching.matching.MatchingBPEL;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author Wei Lu
 *
 */
public class TwigStackDAlgorithmTest2 {
	
	static Logger logger = Logger.getLogger(TwigStackDAlgorithmTest2.class);
	
	private static DirectedGraph<ActivityNode, DefaultEdge> processDAG1;
	private static DirectedGraph<ActivityNode, DefaultEdge> query1;
	
	private static ProcessFlowGraph processFlowGraph1;
	private static QueryGraph queryGraph1;

	private static ActivityNode process1A1;
	private static ActivityNode process1B1;
	private static ActivityNode process1C1;
	private static ActivityNode process1C2;
	private static ActivityNode process1C4;
	private static ActivityNode process1E1;
	private static ActivityNode process1E2;
	private static ActivityNode process1P1;
	private static ActivityNode process1M1;
	private static ActivityNode process1M2;
	
	private static ActivityNode query1C;
	private static ActivityNode query1B;
	private static ActivityNode query1E;
	
	@BeforeClass
	public static void setUp() {
		// processDAG1
		processDAG1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);

		process1A1 = new ActivityNode("a1", "a", 1);
		process1B1 = new ActivityNode("b1", "b", 1);
		process1C1 = new ActivityNode("c1", "c", 1);
		process1C2 = new ActivityNode("c2", "c", 1);
		process1C4 = new ActivityNode("c4", "c", 1);
		process1E1 = new ActivityNode("e1", "e", 1);
		process1E2 = new ActivityNode("e2", "e", 1);
		process1P1 = new ActivityNode("p1", "p", 1);
		process1M1 = new ActivityNode("m1", "m", 1);
		process1M2 = new ActivityNode("m2", "m", 1);
		
		processDAG1.addVertex(process1A1);
		processDAG1.addVertex(process1B1);
		processDAG1.addVertex(process1C1);
		processDAG1.addVertex(process1C2);
		processDAG1.addVertex(process1C4);
		processDAG1.addVertex(process1E1);
		processDAG1.addVertex(process1E2);
		processDAG1.addVertex(process1P1);
		processDAG1.addVertex(process1M1);
		processDAG1.addVertex(process1M2);

		processDAG1.addEdge(process1M1, process1C1);
		processDAG1.addEdge(process1M1, process1P1);
		processDAG1.addEdge(process1M1, process1C4);
		processDAG1.addEdge(process1C1, process1C2);
		processDAG1.addEdge(process1C1, process1B1);
		processDAG1.addEdge(process1C2, process1B1);
		processDAG1.addEdge(process1C2, process1E1);
		processDAG1.addEdge(process1P1, process1A1);
		processDAG1.addEdge(process1C4, process1A1);
		processDAG1.addEdge(process1A1, process1B1);
		processDAG1.addEdge(process1A1, process1E2);
		processDAG1.addEdge(process1A1, process1M2);
		
		// process graph 1
		processFlowGraph1 = new ProcessFlowGraph("processDAG1", "namespace1", "id1",
				processDAG1);
		
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		
		query1C = new ActivityNode("q1C", "c", 1);
		query1B = new ActivityNode("q1B", "b", 1);
		query1E = new ActivityNode("q1E", "e", 1);
		
		query1.addVertex(query1C);
		query1.addVertex(query1B);
		query1.addVertex(query1E);
		
		query1.addEdge(query1C, query1B);
		query1.addEdge(query1C, query1E);
		
		queryGraph1 = new QueryGraph(query1);
	}
	
	
	public static void main(String[] args) {		
		setUp();
		MatchingBPEL matchBPEL = new MatchingBPEL(queryGraph1, processFlowGraph1, true);
		matchBPEL.match();
		System.exit(0);		
	}
	
}
