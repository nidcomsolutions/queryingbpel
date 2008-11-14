package de.uni.stuttgart.gerlacdt.bpel.database;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;
import org.open.oasis.docs.wsbpel._2._0.process.executable.util.ExecutableResourceFactoryImpl;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraphFactory2;
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
