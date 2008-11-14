package de.uni.stuttgart.bpelSearching.matching.test;

import java.io.File;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

public class QueryTest {
	static Logger logger = Logger.getLogger(GraphBuildTest.class);
	static File BPELdir = new File("BPELFiles/QueryFile");
	private static ProcessUtilsNormal processUtils;

	@BeforeClass
	public static void setUp() {

		processUtils = new ProcessUtilsNormal();

		File[] fileArray = BPELdir.listFiles();

		// persist all process from /MyTestCases/*.bpel
		for (int i = 0; i < fileArray.length; i++) {

			File fileTemp = fileArray[i];
			if (!fileTemp.isDirectory()) {
				logger.warn("Query TestCase: " + fileTemp.getPath());
				Process processTest = processUtils
						.loadProcessFromFile(fileTemp);
			}
		}
	}
}
