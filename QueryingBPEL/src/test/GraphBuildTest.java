package test;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraphFactory;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;
import de.uni.stuttgart.gerlacdt.bpel.database.DatabaseConfiguration;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

/**
 * GraphBuildTest test the building of process graphs of the given bpel process
 * in the database.
 * 
 * @author Daniel Gerlach
 * 
 */
public class GraphBuildTest {

	static Logger logger = Logger.getLogger(GraphBuildTest.class);
	static File BPELdir = new File("BPELFiles/MyTestCases");
	private static ProcessUtilsNormal processUtils;

	@BeforeClass
	public static void setUp() {

		processUtils = new ProcessUtilsNormal();

		// delete all processes from DB
		processUtils.deleteAllProcessesFromDB();
		File[] fileArray = BPELdir.listFiles();

		// persist all process from /MyTestCases/*.bpel
		for (int i = 0; i < fileArray.length; i++) {

			File fileTemp = fileArray[i];
			if (!fileTemp.isDirectory()) {
				logger.warn("Persist TestCase: " + fileTemp.getPath());
				Process processTest = processUtils
						.loadProcessFromFile(fileTemp);
				processUtils.persistProcess(processTest);
			}
		}
	}

	/**
	 * Generate all StructuredProcessFlowGraphs of all bpel processes in the
	 * database. This test contains loading the bpel processes from the
	 * database, processing them and generating the graphs.
	 */
	@Test
	public void generateStructuredGraph() {

		DatabaseConfiguration dbConfig = DbGraphPropertiesFactory.getInstance()
				.getDBConfiguration();
		final SessionFactory sessionFactory = dbConfig.getSessionFactory();

		// final SessionFactory sessionFactory = TeneoUtils
		// .getSessionFactory(DatabaseType.POSTGRESQL);
		final Session session = sessionFactory.openSession();
		// start Transaction
		session.beginTransaction();

		Query query = session.createQuery("FROM Process");
		List<Process> processes = query.list();

		String resultString = "";
		// test if processes are loaded correctly
		for (int i = 0; i < processes.size(); i++) {
			Process process = processes.get(i);
			ProcessFlowGraphFactory graphFactory = DbGraphPropertiesFactory
					.getInstance().getProcessFlowGraphFactory(process);
			ProcessFlowGraph graph = graphFactory
					.createProcessFlowGraph(process);
			resultString += PrintClass.printProcessFlowGraphString(graph);
		}

		session.getTransaction().commit();
		session.close();

//		 create reference string output for regression test
		 PrintClass.writeStringInFile(resultString,
		 "./TestRegressionFiles/myBpelTestCasesGraphBuildStructured.txt");

//		String temp = PrintClass
//				.getStringFromFile(new File(
//						"./TestRegressionFiles/myBpelTestCasesGraphBuildStructured.txt"));
//		Assert.assertEquals(temp, resultString);
	}

	/**
	 * Generate all StandardProcessFlowGraphs of all bpel processes in the
	 * database. This test contains loading the bpel processes from the
	 * database, processing them and generating the graphs.
	 */
//	@Test
//	public void generateGraph() {
//
//		DatabaseConfiguration dbConfig = DbGraphPropertiesFactory.getInstance()
//				.getDBConfiguration();
//		final SessionFactory sessionFactory = dbConfig.getSessionFactory();
//
//		// final SessionFactory sessionFactory = TeneoUtils
//		// .getSessionFactory(DatabaseType.POSTGRESQL);
//		final Session session = sessionFactory.openSession();
//		// start Transaction
//		session.beginTransaction();
//
//		Query query = session.createQuery("FROM Process");
//		List<Process> processes = query.list();
//
//		String resultString = "";
//		// test if processes are loaded correctly
//		for (int i = 0; i < processes.size(); i++) {
//			Process process = processes.get(i);
//			ProcessFlowGraphFactory graphFactory = new StandardProcessFlowGraphFactory(
//					process);
//			ProcessFlowGraph graph = graphFactory
//					.createProcessFlowGraph(process);
//			resultString += PrintClass.printProcessFlowGraphString(graph);
//		}
//
//		session.getTransaction().commit();
//		session.close();
//
//		// create reference string output for regression test
//  	 PrintClass.writeStringInFile(resultString,
//	  	 "./TestRegressionFiles/myBpelTestCasesGraphBuildStandard.txt");
//		
//		
//		//String temp = PrintClass.getStringFromFile(new File(
//		//		"./TestRegressionFiles/myBpelTestCasesGraphBuildStandard.txt"));
//		//Assert.assertEquals(temp, resultString);
//		
//	}

}
