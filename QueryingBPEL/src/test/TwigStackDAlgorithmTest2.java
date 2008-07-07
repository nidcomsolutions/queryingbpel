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
	private static ActivityNode query1Y;
	private static ActivityNode query1M;
	
	private static DirectedGraph<ActivityNode, DefaultEdge> processDAG2;
	private static DirectedGraph<ActivityNode, DefaultEdge> query2;
	
	private static ProcessFlowGraph processFlowGraph2;
	private static QueryGraph queryGraph2;
	
	private static ActivityNode process21;
	private static ActivityNode process22;
	private static ActivityNode process23;
	private static ActivityNode process24;
	private static ActivityNode process26;
	private static ActivityNode process27;
	private static ActivityNode process29;
	private static ActivityNode process210;
	private static ActivityNode process211;
	private static ActivityNode process216;
	private static ActivityNode process217;
	private static ActivityNode process218;
	private static ActivityNode process219;
	private static ActivityNode process220;
	private static ActivityNode process221;
	private static ActivityNode process226;
	private static ActivityNode process227;
	private static ActivityNode process228;
	private static ActivityNode process229;
	private static ActivityNode process230;
	private static ActivityNode process231;
	
	private static ActivityNode query21Department;
	private static ActivityNode query21Course;
	private static ActivityNode query21Name;
	private static ActivityNode query21Teacher;
	private static ActivityNode query21FirstName;
	private static ActivityNode query21FamilyName;

	@BeforeClass
	public static void setUp() {
		
		// processDAG1
		// This graph is taken from article "Stack-based Algorithms for Pattern 
		// Matching on DAGs"
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
		
		// query 1
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		
		query1C = new ActivityNode("q1C", "c", 1);
		query1B = new ActivityNode("q1B", "b", 1);
		query1E = new ActivityNode("q1E", "e", 1);
		query1Y = new ActivityNode("q1Y", "y", 1);
//		query1M = new ActivityNode("q1M", "m", 1);
		
		query1.addVertex(query1C);
		query1.addVertex(query1B);
		query1.addVertex(query1E);
//		query1.addVertex(query1Y);
//		query1.addVertex(query1M);
		
		query1.addEdge(query1C, query1B);
		query1.addEdge(query1C, query1E);
//		query1.addEdge(query1C, query1Y);
//		query1.addEdge(query1M, query1C);
		
		queryGraph1 = new QueryGraph(query1);
		
		
		// ********** graph 2 ******************
		// This graph is taken from article "Querying Incomplete Information 
		// in Semistructured Data"
		// processDAG2
		processDAG2 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		process21 = new ActivityNode("1", "university", 1);
		process22 = new ActivityNode("2", "name", 1);
		process23 = new ActivityNode("3", "department", 1);
		process24 = new ActivityNode("4", "department", 1);
		process26 = new ActivityNode("6", "name", 1);
		process27 = new ActivityNode("7", "name", 1);
		process29 = new ActivityNode("9", "course", 1);
		process210 = new ActivityNode("10", "lab", 1);
		process211 = new ActivityNode("11", "course", 1);
		process216 = new ActivityNode("16", "name", 1);
		process217 = new ActivityNode("17", "teacher", 1);
		process218 = new ActivityNode("18", "name", 1);
		process219 = new ActivityNode("19", "instructor", 1);
		process220 = new ActivityNode("20", "teacher", 1);
		process221 = new ActivityNode("21", "name", 1);
		process226 = new ActivityNode("26", "family name", 1);
		process227 = new ActivityNode("27", "seniority", 1);
		process228 = new ActivityNode("28", "family name", 1);
		process229 = new ActivityNode("29", "seniority", 1);
		process230 = new ActivityNode("30", "first name", 1);
		process231 = new ActivityNode("31", "family name", 1);
		
		processDAG2.addVertex(process21);
		processDAG2.addVertex(process22);
		processDAG2.addVertex(process23);
		processDAG2.addVertex(process24);
		processDAG2.addVertex(process26);
		processDAG2.addVertex(process27);
		processDAG2.addVertex(process29);
		processDAG2.addVertex(process210);
		processDAG2.addVertex(process211);
		processDAG2.addVertex(process216);
		processDAG2.addVertex(process217);
		processDAG2.addVertex(process218);
		processDAG2.addVertex(process219);
		processDAG2.addVertex(process220);
		processDAG2.addVertex(process221);
		processDAG2.addVertex(process226);
		processDAG2.addVertex(process227);
		processDAG2.addVertex(process228);
		processDAG2.addVertex(process229);
		processDAG2.addVertex(process230);
		processDAG2.addVertex(process231);

		processDAG2.addEdge(process21, process22);
		processDAG2.addEdge(process21, process23);
		processDAG2.addEdge(process21, process24);
		processDAG2.addEdge(process23, process26);
		processDAG2.addEdge(process23, process29);
		processDAG2.addEdge(process23, process210);
		processDAG2.addEdge(process23, process217);
		processDAG2.addEdge(process24, process27);
		processDAG2.addEdge(process24, process211);
		processDAG2.addEdge(process29, process216);
		processDAG2.addEdge(process29, process217);
		processDAG2.addEdge(process29, process219);
		processDAG2.addEdge(process210, process218);
		processDAG2.addEdge(process210, process219);
		processDAG2.addEdge(process210, process220);
		processDAG2.addEdge(process211, process220);
		processDAG2.addEdge(process211, process221);
		processDAG2.addEdge(process217, process226);
		processDAG2.addEdge(process217, process227);
		processDAG2.addEdge(process219, process228);
		processDAG2.addEdge(process219, process229);
		processDAG2.addEdge(process220, process230);
		processDAG2.addEdge(process220, process231);
		
		// process graph 2
		processFlowGraph2 = new ProcessFlowGraph("processDAG2", "namespace2", "id2",
				processDAG2);		
		// query 2
		query2 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		
		query21Department = new ActivityNode("query21Department", "department", 1);
		query21Course = new ActivityNode("query21Course", "course", 1);
		query21Name = new ActivityNode("query21Name", "name", 1);
		query21Teacher = new ActivityNode("query21Teacher", "teacher", 1);
		query21FirstName = new ActivityNode("query21Name", "first name", 1);
		query21FamilyName = new ActivityNode("query21Name", "family name", 1);
		
		query2.addVertex(query21Department);
		query2.addVertex(query21Course);
		query2.addVertex(query21Name);
		query2.addVertex(query21Teacher);
		query2.addVertex(query21FirstName);
		query2.addVertex(query21FamilyName);
		
		query2.addEdge(query21Department, query21Course);
		query2.addEdge(query21Course, query21Name);
		query2.addEdge(query21Course, query21Teacher);
		query2.addEdge(query21Teacher, query21FirstName);
		query2.addEdge(query21Teacher, query21FamilyName);
		
		queryGraph2 = new QueryGraph(query2);
		
	}
	
	
	public static void main(String[] args) {		
		setUp();
		MatchingBPEL matchBPEL = new MatchingBPEL(queryGraph2, processFlowGraph2, true);
		matchBPEL.match();
		System.exit(0);		
	}
	
}
