package de.uni.stuttgart.gerlacdt.bpel.database;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;

import de.uni.stuttgart.gerlacdt.bpel.controller.PropertyLoader;

public class PostgresqlConfiguration extends DatabaseConfiguration {

	static Logger logger = Logger.getLogger(PostgresqlConfiguration.class);
	final SessionFactory sessionFactory;

	public PostgresqlConfiguration() {
		sessionFactory = getHbDataStore(false).getSessionFactory();
	}

	@Override
	public SessionFactory getSessionFactory() {

		return sessionFactory;
	}

	/**
	 * Creates the hibernate mapping file and export the generated schema into
	 * the database.
	 */
	@Override
	public void exportSchema() {

		//createMappingFile();
		// initDataStore(true) because database schema will be exported
		HbDataStore dataStore = getHbDataStore(true);

		// Initialize the DataStore. This sets up the Hibernate mapping and, in
		// turn, creates the corresponding tables in the database.
		dataStore.initialize();
	}

	/**
	 * Creates the hibernate mapping and writes it to file. The mapping will be
	 * generated from the given ePackages (EMF model) and the persistanceOptions
	 * for the Teneo framework.
	 * 
	 * @param ePackages
	 *            An array of ePackages which should be considered in the
	 *            hibernate mapping.
	 * @param persistenceOptions
	 *            Define mapping strategies (eg. LazyLoading, JoinTables) for
	 *            the hibernate mapping.
	 */

	private HbDataStore getHbDataStore(boolean isDBCreation) {
		// Create the DataStore.
		final String dataStoreName = PropertyLoader.getInstance()
				.getDbProperties().getProperty("dbName");
		final HbDataStore dataStore = (HbDataStore) HbHelper.INSTANCE
				.createRegisterDataStore(dataStoreName);
		Properties hibernateProperties = generateHibernateProperties();

		// set Hibernate-Properies
		dataStore.setHibernateProperties(hibernateProperties);
		// set PersistenceOptions for Teneo-HbDataStore
		Properties persistenceOptions = new Properties();

		persistenceOptions = createPersistenceProperties(persistenceOptions,
				isDBCreation);
		// set persistenceOptions
		dataStore.setPersistenceProperties(persistenceOptions);

		// Configure the EPackages used by this DataStore.
		dataStore.setEPackages(new EPackage[] { ExecutablePackage.eINSTANCE });
		// }
		return dataStore;
	}

	/**
	 * Returns the appropriate properties for the database creation (e.g.
	 * Inheritance mapping, fetch strategies etc.).
	 * 
	 * @param persistenceOptions
	 * @param isDBCreation
	 *            true is schema should be exported, otherwise false
	 * @return
	 */
	private static Properties createPersistenceProperties(
			Properties persistenceOptions, boolean isDBCreation) {

		persistenceOptions.setProperty(PersistenceOptions.USE_MAPPING_FILE,
				"true");
		persistenceOptions.setProperty(PersistenceOptions.INHERITANCE_MAPPING,
				"JOINED");
		// lazy loading false, objects are fetched eagerly
		persistenceOptions.setProperty(
				PersistenceOptions.FETCH_CONTAINMENT_EAGERLY, "true");

		if (isDBCreation) {
			persistenceOptions.setProperty(PersistenceOptions.UPDATE_SCHEMA,
					"true");
		} else {
			// should be "true" for database schema export
			// for performance it should be "false"
			persistenceOptions.setProperty(PersistenceOptions.UPDATE_SCHEMA,
					"false");
		}

		return persistenceOptions;
	}

	/**
	 * Generates and returns the needed properties for hibernate to connect to a
	 * PostgreSQL database.
	 * 
	 * @return the properties for establishing a database connection with
	 *         hibernate.
	 */

	private static Properties generateHibernateProperties() {
		Properties hibernateProperties = new Properties();
		// for PostgreSQL
		hibernateProperties.setProperty(Environment.DRIVER, PropertyLoader
				.getInstance().getDbProperties().getProperty("dbDriver"));
		hibernateProperties.setProperty(Environment.USER, PropertyLoader
				.getInstance().getDbProperties().getProperty("dbUser"));
		hibernateProperties.setProperty(Environment.URL, PropertyLoader
				.getInstance().getDbProperties().getProperty("dbURL"));
		hibernateProperties.setProperty(Environment.PASS, PropertyLoader
				.getInstance().getDbProperties().getProperty("dbPassword"));
		hibernateProperties.setProperty(Environment.DIALECT, PropertyLoader
				.getInstance().getDbProperties().getProperty("dbDialect"));
		hibernateProperties.setProperty(Environment.MAX_FETCH_DEPTH, "0");
		return hibernateProperties;
	}

	/**
	 * Creates the hibernate mapping and writes it to file. The mapping will be
	 * generated from the given ePackages (EMF model) and the persistanceOptions
	 * for the Teneo framework.
	 * 
	 * @param ePackages
	 *            An array of ePackages which should be considered in the
	 *            hibernate mapping.
	 * @param persistenceOptions
	 *            Define mapping strategies (eg. LazyLoading, JoinTables) for
	 *            the hibernate mapping.
	 */
	public void createMappingFile() {

		Properties persistenceOptions = new Properties();
		persistenceOptions.setProperty(PersistenceOptions.INHERITANCE_MAPPING,
				"JOINED");
		persistenceOptions.setProperty(
				PersistenceOptions.FETCH_CONTAINMENT_EAGERLY, "true");

		EPackage[] ePackages = new EPackage[] { ExecutablePackage.eINSTANCE };

		// generate the mapping
		String mappingString = HbHelper.INSTANCE.generateMapping(ePackages,
				persistenceOptions);
		try {
			// write String in a file
			FileWriter f1 = new FileWriter("./src/hibernate.hbm.xml");
			logger.debug("hibernate mapping file created successfully.");
			f1.write(mappingString);
			f1.close();
		} catch (IOException e) {
			logger.debug("hibernate mapping file could not be created.");
			e.printStackTrace();
		}

	}

}
