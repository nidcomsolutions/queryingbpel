package de.uni.stuttgart.bpelSearching.test;

import junit.framework.JUnit4TestAdapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { GraphBuildTest.class })
public class AllTestSuite {
	
	public static Test suite(){
		return (Test) new JUnit4TestAdapter(AllTestSuite.class);
	}

}
