package de.uni.stuttgart.gerlacdt.bpel.controller;

import java.io.File;
import java.util.List;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;

import de.uni.stuttgart.bpelSearching.GraphMapping.QueryGraphFactory1;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.matching.exactMatching.EvalQueryExactMatch;
import de.uni.stuttgart.bpelSearching.matching.inexactmatching.EvalQueryInexactMatch;
import de.uni.stuttgart.gerlacdt.bpel.database.DatabaseConfiguration;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtils;
import de.uni.stuttgart.gerlacdt.bpel.database.ProcessUtilsNormal;

/**
 * Class SearchBPEL is the entry point (or interface) of the query evaluation component. 
 * Its method search implements the algorithm ProcessQueryEvaluation. It is the Start 
 * class for Apache ANT. 
 * 
 * @author Wei Lu
 * 
 */
public class SearchBPEL {
	private static ProcessUtils processUtils = new ProcessUtilsNormal();

	/**
	 * Starts the given action from command line.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		if (args[0].equals("save")) {
			saveProcess(args[1]);
		} else if (args[0].endsWith("clean")) {
			cleanDatabase();
		} else if (args[0].equals("search")) {
			if (args.length == 3) {
				search(args[1], args[2], "");
			} else if (args.length == 4) {
				search(args[1], args[2], args[3]);
			} else {
				System.out.println("Usage: java SearchBPEL - search - option 2 -option 3 - option 4,  " +
						"where option 2 specifies whether exact or inexact searching is performed, " +
						"option 3 is the path to a query file (.bpel format), option 4 specifies a SQL " +
						"query for the BPEL-processes to be searched. Option 4 is optional. If it is not " +
						"specified, all BPEL-Processes in the database are considered. ");
			}
		} else if (args[0].equals("export")) {
			exportDatabase();
		}

	}

	/**
	 * Saves given .bpel file in database. If given path is a directory then it
	 * saves all contained .bpel files.
	 * 
	 * @param path
	 *            Path which contains the .bpel files which should be saved.
	 */
	private static void saveProcess(String path) {
		System.out.println("start run saveProcess");
		if (!(path.equals("${arg2}"))) {
			File file = new File(path);
			if (file.isFile()) {
				processUtils.persistProcessWithoutAnyTypesFromFile(file);
			} else if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (File fileTemp : files) {
					if (fileTemp.isFile()) {
						processUtils
								.persistProcessWithoutAnyTypesFromFile(fileTemp);
					}
				}
			}
		}
	}

	private static void cleanDatabase() {
		processUtils.deleteAllProcessesFromDB();
	}

	/**
	 * Performs the searching by using exact or inexact matching algorithms.
	 * 
	 * @param isExact
	 *            exact or inexact
	 * @param queryFilePath
	 *            path to a .bpel query file.
	 * @param query
	 *            defines which processes should be considered in the searching.
	 *            If query is empty, all processes in database are considered.
	 */
	private static void search(String isExact, String queryFilePath, String query) {
		File queryFileTemp, queryFile;
		boolean isFile;
		List<ProcessGraph> processFlowGraphs;
		Process queryProcess;
		QueryGraphFactory1 queryGraphFactory;
		QueryGraph querygraph;
		EvalQueryExactMatch evalExactMatch;
		EvalQueryInexactMatch evalInexactMatch;
		
		if (!(isExact.equals("${arg2}")) && !(queryFilePath.equals("${arg3}"))) {			
			queryFileTemp = new File(queryFilePath);
			queryFile = queryFileTemp;
			isFile = false;
			if (queryFileTemp.isDirectory()) {
				File[] files = queryFileTemp.listFiles();
				for (File fileTemp : files) {
					if (fileTemp.isFile()) {
						queryFile = fileTemp;
						isFile = true;
						break;
					}
				}
			} else if (queryFileTemp.isFile()) {
				isFile = true;
			}
			
			if (isFile) {
				queryProcess = processUtils.loadProcessFromFile(queryFile);
				queryGraphFactory = DbGraphPropertiesFactory.getInstance().getQueryGraphFactory();
				querygraph = queryGraphFactory.createQueryGraph(queryProcess);
				if (!query.equals("${arg4}")) {
					if (query.equals("")) {
						System.out.println("Compare all processes from DB");
						processFlowGraphs = processUtils.getAllProcessFlowGraphsFromDB();
					} else {
						processFlowGraphs = processUtils.getAllProcessFlowGraphsFromDBWithQuery(query);
					}	
					if ((processFlowGraphs != null) && (querygraph != null)) {
						System.out.println("How many processes are searched: " + processFlowGraphs.size());				
						if (isExact.equalsIgnoreCase("exact")) {
							evalExactMatch = new EvalQueryExactMatch(querygraph, processFlowGraphs);
							evalExactMatch.doExactMatch();
						} else {
							evalInexactMatch = new EvalQueryInexactMatch(querygraph, processFlowGraphs);
							evalInexactMatch.doInexactMatch();
						}
					}
				}
			}
		}
	}

	/**
	 * Generates the bpel relational schema in database.
	 */

	private static void exportDatabase() {
		DatabaseConfiguration dbConf = DbGraphPropertiesFactory.getInstance()
				.getDBConfiguration();
		dbConf.exportSchema();
	}
}
