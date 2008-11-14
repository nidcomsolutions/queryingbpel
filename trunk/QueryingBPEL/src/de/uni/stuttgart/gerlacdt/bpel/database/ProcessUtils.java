package de.uni.stuttgart.gerlacdt.bpel.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
import org.open.oasis.docs.wsbpel._2._0.process.executable.Flow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Process;
import org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence;
import org.open.oasis.docs.wsbpel._2._0.process.executable.While;
import org.open.oasis.docs.wsbpel._2._0.process.executable.util.ExecutableResourceFactoryImpl;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraphFactory;
import de.uni.stuttgart.gerlacdt.bpel.controller.DbGraphPropertiesFactory;

public abstract class ProcessUtils {

	static Logger logger = Logger.getLogger(ProcessUtils.class);
	// public DatabaseConfigurationFactory dbConfigFactory;
	protected SessionFactory sessionFactory;

	/**
	 * Persists the given process into the database.
	 * 
	 * @param process
	 */
	public void persistProcess(Process process) {

		final Session session = sessionFactory.openSession();

		// start Transaction
		session.beginTransaction();
		session.save(process);
		// commit Transaction
		session.getTransaction().commit();
		session.close();

	}

	/**
	 * Persists the given ExtensibleElements object into the database.
	 * 
	 * @param element
	 */
	public void persistExtensibleElements(ExtensibleElements element) {

		final Session session = sessionFactory.openSession();

		// start Transaction
		session.beginTransaction();
		session.save(element);
		// commit Transaction
		session.getTransaction().commit();
		session.close();

	}

	/**
	 * Updates the given detached process in the database.
	 * 
	 * @param process
	 */
	public void updateDetachedProcess(Process process) {

		final Session session = sessionFactory.openSession();

		// start Transaction
		session.beginTransaction();
		session.merge(process);
		// commit Transaction
		session.getTransaction().commit();
		session.close();

	}

	/**
	 * Returns the process from the database which has the given ID.
	 * LAZY_LOADING= false.
	 * 
	 * @param id
	 *            the given database ID
	 * @return the process which corresponds to the given ID.
	 */
	public Process getProcessFromDB(long id) {
		final Session session = sessionFactory.openSession();

		Process process = null;
		// start Transaction
		session.beginTransaction();
		// load BPEL-processes from repository with given id
		Query query = session
				.createQuery("FROM Process WHERE extensibleelements_e_id = "
						+ id);
		List<Process> processes = (List<Process>) query.list();
		process = processes.get(0);
		// commit Transaction
		session.getTransaction().commit();
		session.close();
		return process;
	}

	/**
	 * Returns all processes from the database which have the given name.
	 * LAZY_LOADING= false.
	 * 
	 * @param name
	 *            the given process name.
	 * @return all processes which have the appropriate name.
	 */
	public List<Process> getProcessesFromDB(String name) {
		final Session session = sessionFactory.openSession();

		Process process = null;
		// start Transaction
		session.beginTransaction();
		// load BPEL-processes from repository with given id
		Query query = session.createQuery("FROM Process WHERE name = '" + name
				+ "'");
		List<Process> processes = (List<Process>) query.list();
		// commit Transaction
		session.getTransaction().commit();
		session.close();
		return processes;
	}
	
	/**
	 * Returns all processes from the database with the given SQL query.
	 * LAZY_LOADING= false.
	 * 
	 * @param sqlQuery
	 *            the given SQL query.
	 * @return all processes which have the appropriate name.
	 */
	public List<Process> getProcessesFromDBviaSQL(String sqlQuery) {
		final Session session = sessionFactory.openSession();

		Process process = null;
		// start Transaction
		session.beginTransaction();
		// load BPEL-processes from repository with given id
		Query query = session.createQuery(sqlQuery);
		List<Process> processes = (List<Process>) query.list();
		// commit Transaction
		session.getTransaction().commit();
		session.close();
		return processes;
	}

	/**
	 * Returns a
	 * <code>ExtensibleElements<code> object from the database which has the given ID.
	 * LAZY_LOADING= false.
	 * 
	 * @param id
	 *            the given database ID
	 * @return the ExtensibleElement which corresponds to the given ID.
	 */
	public ExtensibleElements getExtensibleElementFromDB(long id) {
		final Session session = sessionFactory.openSession();

		ExtensibleElements element = null;
		// start Transaction
		session.beginTransaction();
		// load ExtensibleElement object from repository with the given ID
		Query query = session
				.createQuery("FROM ExtensibleElements WHERE e_id = " + id);
		List<ExtensibleElements> elements = (List<ExtensibleElements>) query
				.list();
		element = elements.get(0);
		// commit Transaction
		session.getTransaction().commit();
		session.close();
		return element;
	}

	/**
	 * Returns the activi< from the database which has the given ID.
	 * LAZY_LOADING= false.
	 * 
	 * @param id
	 *            the given database ID
	 * @return the activity which corresponds to the given ID.
	 */
	public Activity getActivityFromDB(long id) {
		final Session session = sessionFactory.openSession();

		Activity activity = null;
		// start Transaction
		session.beginTransaction();
		// load all BPEL-processes from repository
		Query query = session
				.createQuery("FROM ExtensibleElements WHERE e_id = " + id);
		List<Activity> activities = (List<Activity>) query.list();
		activity = activities.get(0);
		// commit Transaction
		session.getTransaction().commit();
		session.close();

		return activity;
	}

	/**
	 * Deletes a process from the database with the given name.
	 */
	public void deleteProcessFromDB(String name) {

		final Session session = sessionFactory.openSession();
		// start Transaction
		session.beginTransaction();

		Query query = session
				.createQuery("FROM Process process WHERE process.name='" + name
						+ "'");
		Process process = (Process) query.list().get(0);
		logger.debug("Process will be deleted: " + process.getName());
		session.delete(process);

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Deletes all process from the database. Use only if you want to have a
	 * clean database.
	 * <p>
	 * Not recommended to clean the database, preferred is to manually delete
	 * the database and generate a clean one with the given hibernate mapping
	 * file.
	 * 
	 */
	public void deleteAllProcessesFromDB() {
		final Session session = sessionFactory.openSession();
		// start Transaction
		session.beginTransaction();

		Query query = session.createQuery("FROM Process");
		List<Process> processes = (List<Process>) query.list();
		// de.uni.stuttgart.bpelSearching.matching.test if process is correct loaded
		for (Process process : processes) {

			session.delete(process);
		}

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Persist a bpel process from a given bpel file.
	 * 
	 * @param file
	 *            bpel file which contains the process.
	 */
	public void persistProcessFromFile(File file) {
		Process process = loadProcessFromFile(file);
		persistProcess(process);
	}

	/**
	 * Persist a bpel process from a given bpel file without its anyTypes.
	 * 
	 * @param file
	 *            bpel file which contains the process.
	 */
	public void persistProcessWithoutAnyTypesFromFile(File file) {
		Process process = loadProcessWithoutAnyTypesFromFile(file);
		persistProcess(process);
	}

	/**
	 * Returns a Process object that is contained in the given BPEL file.
	 * <p>
	 * The method processes the file and generates the appropriate Process
	 * object.
	 * 
	 * @param file
	 *            A BPEL file which contains a BPEL process.
	 * @return The process in the specified file.
	 */

	public Process loadProcessFromFile(File file) {
		Process process = null;
		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new ExecutableResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(ExecutablePackage.eNS_URI,
				ExecutablePackage.eINSTANCE);

		URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);
		logger.debug("Loaded " + uri);

		// Validate the contents of the loaded resource.
		for (EObject eObject : resource.getContents()) {

			logger.debug("Klasse des EObjects: " + eObject.getClass());

			DocumentRoot docuRoot = (DocumentRoot) eObject;

			// traverse all contained EObjects and prints out their classes
			for (TreeIterator<EObject> it = docuRoot.eAllContents(); it
					.hasNext();) {

				EObject eObject2 = it.next();
				if (eObject2 instanceof Process) {
					process = (Process) eObject2;
					logger.debug("Name of process: " + process.getName());
					
					// store process with its URI
//					final Session session = sessionFactory.openSession();
//					session.beginTransaction();					
//					ProcessURI procURI = new ProcessURI((Long) IdentifierCacheHandler.getID(process), uri.toString());
//					session.save(procURI);
//					session.getTransaction().commit();
//					session.close();
										
					return process;
				}
			}
		}

		return process;
	}

	/**
	 * Returns a Process object that is contained in the given BPEL file.
	 * <p>
	 * The method processes the file and generates the appropriate Process
	 * object.
	 * 
	 * @param file
	 *            A BPEL file which contains a BPEL process.
	 * @return The process in the specified file.
	 */
	public Process loadProcessWithoutAnyTypesFromFile(File file) {
		Process process = null;
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new ExecutableResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(ExecutablePackage.eNS_URI,
				ExecutablePackage.eINSTANCE);

		URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);
		logger.debug("Loaded " + uri);

		logger.debug("size of resouce.getContents(): "
				+ resource.getContents().size());

		// Validate the contents of the loaded resource.
		for (EObject eObject : resource.getContents()) {

			logger.debug("Klasse des EObjects: " + eObject.getClass());

			DocumentRoot docuRoot = (DocumentRoot) eObject;

			// traverse all contained EObjects and prints out their classes
			for (TreeIterator<EObject> it = docuRoot.eAllContents(); it
					.hasNext();) {

				EObject eObject2 = it.next();
				if (eObject2 instanceof Process) {
					process = (Process) eObject2;
					logger.debug("Name of process: " + process.getName());
					break;
				}
			}
			break;
		}

		process = removeAnyTypesFromProcess(process);
		return process;
	}

	/**
	 * Returns a bpel process form which all AnyTypes are removed. Now it can be
	 * stored in database.
	 * 
	 * @param process
	 *            a process from which the anyTypes should be removed.
	 * @return a process without anyTypes.
	 */
	protected Process removeAnyTypesFromProcess(Process process) {
		List<AnyType> list = new ArrayList<AnyType>();
		for (TreeIterator<EObject> it = process.eAllContents(); it.hasNext();) {
			EObject obj = it.next();

			if (obj instanceof AnyType) {

				AnyType any = (AnyType) obj;
				list.add(any);
			}
		}

		for (AnyType any : list) {
			EcoreUtil.delete(any);
		}

		return process;
	}

	/**
	 * Writes the given process in a temporary file and returns the newly
	 * generated file.
	 * 
	 * @throws FileNotFoundException
	 */

	public File serializeProcessToFile(Process process) {

		Resource resource = new ExecutableResourceFactoryImpl()
				.createResource(URI.createFileURI("tempProcess.xml"));
		resource.getContents().add(process);

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			resource.save(null);

			inputStream = new BufferedReader(new FileReader("tempProcess.xml"));
			outputStream = new PrintWriter(
					new FileWriter("processFragment.xml"));

			String line;
			while ((line = inputStream.readLine()) != null) {
				String resultString = line.replaceAll("tProcess", "process");
				outputStream.println(resultString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
					File tempFile = new File("tempProcess.xml");
					tempFile.delete();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

		return new File("processFragment.xml");
	}

	/**
	 * Writes the given process in a temporary file with the given filePath and
	 * returns the newly generated file.
	 * 
	 * @throws FileNotFoundException
	 */

	public File serializeProcessToFile(Process process, String filePath) {

		Resource resource = new ExecutableResourceFactoryImpl()
				.createResource(URI.createFileURI("tempProcess.xml"));
		resource.getContents().add(process);

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			resource.save(null);

			inputStream = new BufferedReader(new FileReader("tempProcess.xml"));
			outputStream = new PrintWriter(
					new FileWriter(filePath));

			String line;
			while ((line = inputStream.readLine()) != null) {
				String resultString = line.replaceAll("tProcess", "process");
				outputStream.println(resultString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
					File tempFile = new File("tempProcess.xml");
					tempFile.delete();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

		return new File(filePath);
	}

	/**
	 * Returns a list of
	 * <code>ProcessFlowGraphs<code> which are generated from the database.
	 * The returned list contains all ProcessFlowGraphs from all processes
	 * in the database.
	 * @return a list of
	 *         <code>ProcessFlowGraphs<code> which are retrieved from the database.
	 */
	public List<ProcessFlowGraph> getAllProcessFlowGraphsFromDB() {

		List<ProcessFlowGraph> resultList = new ArrayList<ProcessFlowGraph>();

		final Session session = sessionFactory.openSession();
		// start Transaction
		session.beginTransaction();

		// load all BPEL-processes from repository
		Query query = session.createQuery("FROM Process");
		List<Process> processes = (List<Process>) query.list();

		// add all loaded processes to the member-variable processGraphs
		for (Process process : processes) {

			ProcessFlowGraphFactory processFlowGraphFactory = DbGraphPropertiesFactory
					.getInstance().getProcessFlowGraphFactory(process);
			ProcessFlowGraph processFlowGraph = processFlowGraphFactory
					.createProcessFlowGraph(process);
			resultList.add(processFlowGraph);
		}

		session.getTransaction().commit();
		session.close();

		return resultList;

	}

	/**
	 * Returns a list of <code>Process<code> objects from the database.
	 * The returned list contains all Process objects
	 * in the database.
	 * @return a list of
	 *         <code>Process<code> objects which are retrieved from the database.
	 */
	public List<Process> getAllProcessesFromDB() {

		List<Process> resultList = new ArrayList<Process>();

		final Session session = sessionFactory.openSession();
		// start Transaction
		session.beginTransaction();

		// load all BPEL-processes from repository
		Query query = session.createQuery("FROM Process");
		List<Process> processes = (List<Process>) query.list();

		// add all loaded processes to the member-variable processGraphs
		for (Process process : processes) {

			resultList.add(process);
		}

		session.getTransaction().commit();
		session.close();

		return resultList;

	}

	/**
	 * Returns the root activtiy from the given process. It must be a stuctured
	 * activity, otherwise returns null.
	 * 
	 * @param process
	 *            a Process object
	 * @return the root activity in the given process
	 */
	public Activity getRootStructuredActivityFromProcess(Process process) {

		Activity rootActivity = null;

		// gets the root activity of process
		for (TreeIterator<EObject> it = process.eAllContents(); it.hasNext();) {
			EObject obj = it.next();

			if ((obj instanceof Sequence) || (obj instanceof Flow)
					|| (obj instanceof If) || (obj instanceof While)
					|| (obj instanceof RepeatUntil) || (obj instanceof Pick)
					|| (obj instanceof ForEach)) {
				rootActivity = (Activity) obj;
				break;
			}
		}

		return rootActivity;
	}
}
