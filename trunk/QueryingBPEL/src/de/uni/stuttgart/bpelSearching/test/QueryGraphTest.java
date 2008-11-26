package de.uni.stuttgart.bpelSearching.test;

import java.util.Set;

import org.apache.log4j.Logger;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityType;

public class QueryGraphTest {

	static Logger logger = Logger.getLogger(QueryGraphTest.class);

	private static DirectedGraph<ActivityNode, DefaultEdge> query1;
	private static DirectedGraph<ActivityNode, DefaultEdge> query5;
	private static DirectedGraph<ActivityNode, DefaultEdge> query6;

	private static QueryGraph queryGraph1;
	private static QueryGraph queryGraph6;

	private static ActivityNode query1SeqA_start;
	private static ActivityNode query1SeqA_end;
	private static ActivityNode query1ReceiveA;
	private static ActivityNode query1ReplyA;


	private static ActivityNode query6FlowA_start;
	private static ActivityNode query6FlowA_end;
	private static ActivityNode query6FlowB_start;
	private static ActivityNode query6FlowB_end;
	private static ActivityNode query6SeqA_start;
	private static ActivityNode query6SeqA_end;
	private static ActivityNode query6ReceiveA;
	private static ActivityNode query6ReplyA;
	private static ActivityNode query6EmptyA;
	private static ActivityNode query6ExitA;

	@BeforeClass
	public static void setUp() {

		// query1
		query1 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);
		query1SeqA_start = new ActivityNode("1", "SeqAp1_start",
				ActivityType.SEQUENCE);
		query1SeqA_end = new ActivityNode("2", "SeqAp1_end",
				ActivityType.SEQUENCE);
		query1ReceiveA = new ActivityNode("3", "ReceiveAp1",
				ActivityType.RECEIVE);
		query1ReplyA = new ActivityNode("4", "ReplyAp1", ActivityType.REPLY);

		query1.addVertex(query1SeqA_start);
		query1.addVertex(query1SeqA_end);
		query1.addVertex(query1ReceiveA);
		query1.addVertex(query1ReplyA);

		query1.addEdge(query1SeqA_start, query1ReceiveA);
		query1.addEdge(query1ReceiveA, query1ReplyA);
		query1.addEdge(query1ReplyA, query1SeqA_end);



		// query6
		query6 = new DefaultDirectedGraph<ActivityNode, DefaultEdge>(
				DefaultEdge.class);

		query6FlowA_start = new ActivityNode("1", "FlowAp6Start",
				ActivityType.FLOW);
		query6FlowA_end = new ActivityNode("2", "FlowAp6End",
				ActivityType.FLOW);
		query6FlowB_start = new ActivityNode("3", "FlowBp6Start",
				ActivityType.FLOW);
		query6FlowB_end = new ActivityNode("4", "FlowBp6End",
				ActivityType.FLOW);
		query6SeqA_start = new ActivityNode("5", "SeqAp6Start",
				ActivityType.SEQUENCE);
		query6SeqA_end = new ActivityNode("6", "SeqAp6Emd",
				ActivityType.SEQUENCE);
		query6ReceiveA = new ActivityNode("7", "ReceiveAp6",
				ActivityType.RECEIVE);
		query6ReplyA = new ActivityNode("8", "ReplyAp6", ActivityType.REPLY);
		query6EmptyA = new ActivityNode("9", "EmptyAp6", ActivityType.EMPTY);
		query6ExitA = new ActivityNode("10", "ExitAp6", ActivityType.EXIT);

	    query6.addVertex(query6FlowA_start);
		query6.addVertex(query6FlowA_end);
		query6.addVertex(query6FlowB_start);
		query6.addVertex(query6FlowB_end);
		query6.addVertex(query6SeqA_start);
		query6.addVertex(query6SeqA_end);
		query6.addVertex(query6ReceiveA);
		query6.addVertex(query6ReplyA);
		query6.addVertex(query6EmptyA);
		query6.addVertex(query6ExitA);

		query6.addEdge(query6FlowA_start, query6FlowB_start);
		query6.addEdge(query6FlowB_start, query6SeqA_start);
		query6.addEdge(query6SeqA_start, query6ReceiveA);
		query6.addEdge(query6ReceiveA, query6ReplyA);
		query6.addEdge(query6ReplyA, query6SeqA_end);
		query6.addEdge(query6SeqA_end, query6FlowB_end);
		query6.addEdge(query6FlowB_end, query6FlowA_end);
		query6.addEdge(query6ReceiveA, query6EmptyA);
		query6.addEdge(query6ReceiveA, query6ExitA);
		query6.addEdge(query6ExitA, query6FlowB_end);
		query6.addEdge(query6EmptyA, query6FlowA_end);

		queryGraph1 = new QueryGraph(query1);
		queryGraph6 = new QueryGraph(query6);

	}


	@Test
	public void getSubTreeNodesTest() {		
		Set<ActivityNode> subNodes = queryGraph6.getSubtreeNodes(query6SeqA_start);
		//Set<ActivityNode> childrenNodes = queryGraph6.children(query6ReceiveA);
		String resultString = " ";
		
//		for (ActivityNode childNode : childrenNodes) {			
//			resultString += childNode.getActivityName() + " \n";
//		}
		
		for (ActivityNode  subNode : subNodes) {			
		resultString += subNode.getActivityName() + " \n";
		}
		
		//logger.warn("Children nodes: ");
		logger.warn("Subtree nodes: ");
		logger.warn(resultString);
	}
}
