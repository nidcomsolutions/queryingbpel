package test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni.stuttgart.bpelSearching.index.NodeInStack;
import de.uni.stuttgart.bpelSearching.index.NodeRegionEncoding;
import de.uni.stuttgart.bpelSearching.matching.MatchingBPEL;
import de.uni.stuttgart.bpelSearching.matching.NodePair;
import de.uni.stuttgart.bpelSearching.matching.TwigStackAlgorithm;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityType;

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
	private static ProcessFlowGraph processGraph1;
	
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
		
		// query1
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
		
		// solution1	
		// process1
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
//		process1.addVertex(process1D2);
//		process1.addVertex(process1D3);
//		process1.addVertex(process1D4);
		process1.addVertex(process1E1);
		process1.addVertex(process1E2);
		process1.addVertex(process1E4);
		process1.addVertex(process1E5);

		process1.addEdge(process1Root, process1A2);
		process1.addEdge(process1A2, process1B2);
		process1.addEdge(process1A2, process1B3);
		process1.addEdge(process1A2, process1C2);
//		process1.addEdge(process1C2, process1D2);
		process1.addEdge(process1C2, process1E1);
		process1.addEdge(process1C2, process1E2);
		process1.addEdge(process1Root, process1A4);
		process1.addEdge(process1A4, process1B4);
		process1.addEdge(process1A4, process1C4);
		process1.addEdge(process1A4, process1C5);
//		process1.addEdge(process1C4, process1D3);
		process1.addEdge(process1C4, process1E4);
//		process1.addEdge(process1C5, process1D4);
		process1.addEdge(process1C5, process1E5);		
		
		processGraph1 = new ProcessFlowGraph("processMergeJoinTest", "www", "100", process1);
		queryGraph1 = new QueryGraph(query1);
	}

	//@Test
//	public void testMergeAllPathSolutions() {
//		
//		setUp();
//		
//		TwigStackAlgorithm ta = new TwigStackAlgorithm(queryGraph1);
		
//		Set<ActivityNode> vertexSetQuery = queryGraph1.getQueryGraph().vertexSet();
//		
//		for (ActivityNode queryNode : vertexSetQuery) {			
//			ta.solutionStackMap.put(queryNode, new Stack<NodePair>());
//		}
//		
//		ta.solutionStackMap.get(query1A).push(new NodePair(process1A2, process1Root, 
//				new LinkedList<StringBuffer>(), false, 0)); 
//		ta.solutionStackMap.get(query1A).push(new NodePair(process1A4, process1Root, 
//				new LinkedList<StringBuffer>(), false, 0)); 
//		
//		ta.solutionStackMap.get(query1B).push(new NodePair(process1B4, process1A4, 
//				new LinkedList<StringBuffer>(), false, 0)); 
//		ta.solutionStackMap.get(query1B).push(new NodePair(process1B3, process1A2, 
//				new LinkedList<StringBuffer>(), true, 0)); 
//		ta.solutionStackMap.get(query1B).push(new NodePair(process1B2, process1A2, 
//				new LinkedList<StringBuffer>(), true, 0)); 
//		
//		ta.solutionStackMap.get(query1C).push(new NodePair(process1C5, process1A4, 
//				new LinkedList<StringBuffer>(), true, 0)); 
//		ta.solutionStackMap.get(query1C).push(new NodePair(process1C4, process1A4, 
//				new LinkedList<StringBuffer>(), true, 0)); 
//		ta.solutionStackMap.get(query1C).push(new NodePair(process1C2, process1A2, 
//				new LinkedList<StringBuffer>(), false, 0));
//		
//		ta.solutionStackMap.get(query1D).push(new NodePair(process1D4, process1C5, 
//				new LinkedList<StringBuffer>(), false, 0)); 
//		ta.solutionStackMap.get(query1D).push(new NodePair(process1D3, process1C4, 
//				new LinkedList<StringBuffer>(), false, 0)); 
//		ta.solutionStackMap.get(query1D).push(new NodePair(process1D2, process1C2, 
//				new LinkedList<StringBuffer>(), false, 0));
//		
//		ta.solutionStackMap.get(query1E).push(new NodePair(process1E5, process1C5, 
//				new LinkedList<StringBuffer>(), false, 0)); 
//		ta.solutionStackMap.get(query1E).push(new NodePair(process1E4, process1C4, 
//				new LinkedList<StringBuffer>(), false, 0)); 
//		ta.solutionStackMap.get(query1E).push(new NodePair(process1E2, process1C2, 
//				new LinkedList<StringBuffer>(), true, 0)); 
//		ta.solutionStackMap.get(query1E).push(new NodePair(process1E1, process1C2, 
//				new LinkedList<StringBuffer>(), true, 0)); 
//		
//		ta.mergeAllPathSolutions(query1A);
//		ta.printSolutions(query1A);		
//	}
	
	
//	public static void main(String[] args) {		
//		MergeJoinTest mjt = new MergeJoinTest();
//		mjt.testMergeAllPathSolutions();
//		System.exit(0);
//	}
	
	
	public static void main(String[] args) {
//		setUp();
//		MatchingBPEL matchBPEL = new MatchingBPEL(queryGraph1, processGraph1);
//		matchBPEL.match();
//		System.exit(0);
		
		setUp();
		MatchingBPEL matchBPEL = new MatchingBPEL(queryGraph1, processGraph1, false);
		matchBPEL.match();
		System.exit(0);
	}

}
