package de.uni.stuttgart.gerlacdt.bpel.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

	private static PropertyLoader instance = new PropertyLoader();
	private Properties dbProperties = new Properties();
	private Properties userProperties = new Properties();

	private PropertyLoader() {
		try {
			dbProperties.load(new FileReader(
					new File("./src/dbConf.properties")));
//			dbProperties.load(new FileReader(
//			new File("./dbConf.properties")));
			userProperties.load(new FileReader(new File(
					"./src/userConf.properties")));
//			userProperties.load(new FileReader(new File(
//			"./userConf.properties")));
		} catch (FileNotFoundException e) {
			System.out
					.println("File not found, could not load property files.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static PropertyLoader getInstance() {
		return instance;
	}

	public  Properties getDbProperties() {
		return dbProperties;
	}

	public Properties getUserProperties() {
		return userProperties;
	}
}
