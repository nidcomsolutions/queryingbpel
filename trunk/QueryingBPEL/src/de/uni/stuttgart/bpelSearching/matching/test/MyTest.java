package de.uni.stuttgart.bpelSearching.matching.test;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtils;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

public class MyTest {

	static File testFile0 = new File("BPELFiles\\AuctionHouse.bpel");
	static File testFile1 = new File("BPELFiles\\daniTest.bpel");
	static File testFile2 = new File("BPELFiles\\loanapproval.bpel");
	static File testFile3 = new File("BPELFiles\\loanapprovalOASIS.bpel");
	static File testFile4 = new File(
			"BPELFiles\\BPEL_Samples\\BPEL\\loan_approval\\loan_approval.bpel");
	static File testFile5 = new File(
			"BPELFiles\\BPEL_Samples\\BPEL\\while\\while.bpel");
	static File testFile6 = new File(
			"BPELFiles\\BPEL_Samples\\BPEL\\scope\\scope.bpel");
	static File testFile7 = new File(
			"BPELFiles\\BPEL_Samples\\BPEL\\rethrow\\rethrow.bpel");
	static File testFile8 = new File("BPELFiles\\tutorial.bpel");
	static File testFile9 = new File("BPELFiles\\tutorial2.bpel");

	List<File> fileList = new ArrayList<File>();

	public static void main(String[] args) {

		 //TeneoUtils.createDatabase(DatabaseType.POSTGRESQL);
		 //DatabaseTest1 dbtest = new DatabaseTest1();
		 //dbtest.createPostgresqlDB();
		 //dbtest.persistAllProcessFromDirectory();
		 testPersist();
		 // testDelete();
		 // testWriteMapping();
//		 GraphBuildTest gTest = new GraphBuildTest();
//		 gTest.generateGraph();

	}

	public static void testPersist() {
		//ProcessUtils processUtils = new ProcessUtils(new PostgresqlConfigurationFactory());
		ProcessUtils processUtils = new ProcessUtilsNormal();
		Process process0 = processUtils.loadProcessFromFile(testFile8);
		Process process1 = processUtils.loadProcessFromFile(testFile9);
		/* Process process0 = processUtils.loadProcessFromFile(testFile2);
		Process process1 = processUtils.loadProcessFromFile(testFile0);
		Process process2 = processUtils.loadProcessFromFile(testFile1);
		Process process3 = processUtils.loadProcessFromFile(testFile5); */
		processUtils.persistProcess(process0);
		processUtils.persistProcess(process1);
		/*  processUtils.persistProcess(process0);
		processUtils.persistProcess(process1);
		processUtils.persistProcess(process2);
		processUtils.persistProcess(process3);  */
		
	}

	public static void testDelete() {
//		ProcessUtils processUtils = new ProcessUtils(
//				new PostgresqlConfigurationFactory());
		ProcessUtils processUtils = new ProcessUtilsNormal();
		processUtils.deleteAllProcessesFromDB();
	}

//	public static void testWriteMapping() {
//		Properties persistenceOptions = TeneoConfiguration
//				.generatePersistenceOptionsForWritingHibernateFile();
//		TeneoUtils.createHibernateMappingFile(
//				new EPackage[] { ExecutablePackage.eINSTANCE },
//				persistenceOptions);
//	}

}

