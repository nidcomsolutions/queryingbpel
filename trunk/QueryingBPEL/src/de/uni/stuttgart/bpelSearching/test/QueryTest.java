package de.uni.stuttgart.bpelSearching.test;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.BeforeClass;
import org.junit.Test;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.GraphMapping.ProcessGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.QueryGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;
import de.uni.stuttgart.gerlacdt.bpel.database.DatabaseConfiguration;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

public class QueryTest {
	static Logger logger = Logger.getLogger(GraphBuildTest.class);
	static File BPELdir = new File("BPELFiles/QueryFile");
	private static ProcessUtilsNormal processUtils;

	@BeforeClass
	public static void setUp() {
		processUtils = new ProcessUtilsNormal();
	}
	
	/**
	 * Generate query graph from bpel file.
	 */
	@Test
	public void generateStructuredQueryGraph() {
		File[] fileArray = BPELdir.listFiles();
		File fileTemp;
		if (fileArray.length > 0) {			
			for (int i = 0; i < fileArray.length; i++) {
				fileTemp = fileArray[i];
				logger.warn("Query File Name: " + fileTemp.getName());
				if ((!fileTemp.isDirectory()) && (fileTemp.getName().equals("NestedFlow.bpel"))) {
					logger.warn("Query TestCase: " + fileTemp.getPath());
					Process processTest = processUtils
							.loadProcessFromFile(fileTemp);
					QueryGraphFactory1 graphFactory = DbGraphPropertiesFactory
					.getInstance().getQueryGraphFactory();
					DirectedGraph<ActivityNode, DefaultEdge> qGraph = 
						graphFactory.createGraphFromProcess(processTest);
					logger.warn("start node id: " + graphFactory.getStartActivityID());
					Set<ActivityNode> queryNodes = qGraph.vertexSet();
					for (ActivityNode qNode : queryNodes) {
						logger.warn("query node: " + qNode.toString() + 
								" ContainerId: " + qNode.getContainerId());
					}
					break;
				}
			}
		}
	}
	
	/**
	 * Generate all StructuredProcessFlowGraphs of all bpel processes in the
	 * database. This de.uni.stuttgart.bpelSearching.test contains loading the bpel processes from the
	 * database, processing them and generating the graphs.
	 */
	@Test
	public void generateStructuredProcessGraph() {
//		processUtils.deleteAllProcessesFromDB();
		File[] fileArray = BPELdir.listFiles();
		for (int i = 0; i < fileArray.length; i++) {
			File fileTemp = fileArray[i];
			if (!fileTemp.isDirectory()&& fileTemp.getName().equals("NestedFlow.bpel")) {
				logger.warn("Persist TestCase: " + fileTemp.getPath());
				Process processTest = processUtils
						.loadProcessFromFile(fileTemp);
				processUtils.persistProcess(processTest);
			}
		}
		
		DatabaseConfiguration dbConfig = DbGraphPropertiesFactory.getInstance()
				.getDBConfiguration();
		final SessionFactory sessionFactory = dbConfig.getSessionFactory();

		// final SessionFactory sessionFactory = TeneoUtils
		// .getSessionFactory(DatabaseType.POSTGRESQL);
		final Session session = sessionFactory.openSession();
		// start Transaction
		session.beginTransaction();
		String name = "NestedFlow";
		Query query = session.createQuery("FROM Process process WHERE " +
				"process.name='" + name + "'");
		List<Process> processes = query.list();
//		String resultString = "";
		// de.uni.stuttgart.bpelSearching.test if processes are loaded correctly
		for (int i = 0; i < processes.size(); i++) {
			Process process = processes.get(i);
			ProcessGraphFactory1 graphFactory = DbGraphPropertiesFactory
					.getInstance().getProcessGraphFactory(process);
			ProcessGraph pGraph = graphFactory
					.createProcessFlowGraph(process);
			Set<ActivityNode> pNodes = pGraph.getGraph().vertexSet();
			logger.warn("Print the process graph info: ");
			for (ActivityNode pNode : pNodes) {
				logger.warn("process node: " + pNode.toString() + 
						" ContainerId: " + pNode.getContainerId());
			}
//			resultString += PrintClass.printProcessFlowGraphString(graph);
		}

		session.getTransaction().commit();
		session.close();

//		 create reference string output for regression de.uni.stuttgart.bpelSearching.test
//		 PrintClass.writeStringInFile(resultString,
//		 "./TestRegressionFiles/myBpelTestCasesGraphBuildStructured.txt");
	}
	
}
