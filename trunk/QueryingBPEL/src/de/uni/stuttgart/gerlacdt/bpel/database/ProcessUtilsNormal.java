package de.uni.stuttgart.gerlacdt.bpel.database;

import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;

/**
 * ProcessUtils offers operations to handle the persisted processes in the
 * database. This encompasses save, delete, deleteAll and load process from
 * database etc..
 * 
 * @author Daniel Gerlach
 * 
 */
public class ProcessUtilsNormal extends ProcessUtils {

	public ProcessUtilsNormal() {
		DatabaseConfiguration dbConfig = DbGraphPropertiesFactory.getInstance()
				.getDBConfiguration();
		sessionFactory = dbConfig.getSessionFactory();
	}
}
