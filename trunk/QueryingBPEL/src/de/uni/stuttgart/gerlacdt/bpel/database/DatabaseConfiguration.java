package de.uni.stuttgart.gerlacdt.bpel.database;

import org.hibernate.SessionFactory;

public abstract class DatabaseConfiguration {

	public abstract void exportSchema();

	public abstract SessionFactory getSessionFactory();
	
	public abstract void createMappingFile();
}
