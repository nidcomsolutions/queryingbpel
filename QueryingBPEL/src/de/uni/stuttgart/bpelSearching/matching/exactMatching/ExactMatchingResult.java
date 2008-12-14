/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.List;

import de.uni.stuttgart.bpelSearching.matching.MatchingResult;

/**
 * Class ExactMatchingResult represents a exact matching result.
 * 
 * @author luwei
 *
 */
public class ExactMatchingResult extends MatchingResult {
	
	protected List<ArrayList<String>> exactMatchings;
	protected List<String> queryIDsTobeAssigned;
	
	/**
	 * Creates a new ExactMatchingResult instance.
	 * 
	 * @param processID
	 * @param processNamespace
	 * @param processName
	 */
	public ExactMatchingResult(String processID, String processNamespace,
			String processName) {
		super(processID, processNamespace, processName);
		this.exactMatchings = new ArrayList<ArrayList<String>>();
		this.queryIDsTobeAssigned = new ArrayList<String>();
	}

	/**
	 * Creates a new ExactMatchingResult instance.
	 * 
	 * @param processID
	 * @param processNamespace
	 * @param processName
	 * @param exactMatchings
	 * @param queryIDsTobeAssigned
	 * 
	 */
	public ExactMatchingResult(String processID, String processNamespace,
			String processName, List<ArrayList<String>> exactMatchings, 
			List<String> queryIDsTobeAssigned) {
		super(processID, processNamespace, processName);
		this.exactMatchings = exactMatchings;
		this.queryIDsTobeAssigned = queryIDsTobeAssigned;
	}

	public List<ArrayList<String>> getExactMatchings() {
		return exactMatchings;
	}

	public void setExactMatchings(List<ArrayList<String>> exactMatchings) {
		this.exactMatchings = exactMatchings;
	}

	public List<String> getQueryIDsTobeAssigned() {
		return queryIDsTobeAssigned;
	}

	public void setQueryIDsTobeAssigned(List<String> queryIDsTobeAssigned) {
		this.queryIDsTobeAssigned = queryIDsTobeAssigned;
	}
}
