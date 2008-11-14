/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.exactMatching;

import java.util.ArrayList;
import java.util.List;

import de.uni.stuttgart.bpelSearching.matching.MatchingResult;

/**
 * @author luwei
 *
 */
public class ExactMatchingResult extends MatchingResult {
	
	protected List<ArrayList<String>> exactMatchings;
	
	/**
	 * @param processID
	 * @param processNamespace
	 * @param processName
	 */
	public ExactMatchingResult(String processID, String processNamespace,
			String processName) {
		super(processID, processNamespace, processName);
		this.exactMatchings = new ArrayList<ArrayList<String>>();
	}

	/**
	 * @param processID
	 * @param processNamespace
	 * @param processName
	 * @param exactMatchings
	 */
	public ExactMatchingResult(String processID, String processNamespace,
			String processName, List<ArrayList<String>> exactMatchings) {
		super(processID, processNamespace, processName);
		this.exactMatchings = exactMatchings;
	}

	public List<ArrayList<String>> getExactMatchings() {
		return exactMatchings;
	}

	public void setExactMatchings(List<ArrayList<String>> exactMatchings) {
		this.exactMatchings = exactMatchings;
	}
}
