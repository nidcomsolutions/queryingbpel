package de.uni.stuttgart.bpelSearching.matching.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import de.uni.stuttgart.gerlacdt.bpel.database.DatabaseConfiguration;
import de.uni.stuttgart.gerlacdt.bpel.database.PostgresqlConfiguration;

public class DatabaseCreationTest {

	static Logger logger = Logger.getLogger(DatabaseCreationTest.class);

	/**
	 * Create all tables, the complete schema in database.
	 */
	@Test
	public void createPostgresqlDB() {
		DatabaseConfiguration dbConf = new PostgresqlConfiguration();
		dbConf.exportSchema();
	}

	/**
	 * Create all tables, the complete schema in fragment database.
	 */
//	@Test
//	public void createFragmentsTables() {
//		DatabaseConfiguration dbConf = new PostgresqlConfigurationFragments();
//		dbConf.exportSchema();
//	}

}
