/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.inexactmatching;

import java.util.ArrayList;
import java.util.List;

import de.uni.stuttgart.bpelSearching.matching.MatchingResult;

/**
 * @author luwei
 *
 */
public class InexactMatchingResult extends MatchingResult {
	private List<Match> matchings;
	private float matchingSimilarity;
	
	/**
	 * @param processID
	 * @param processNamespace
	 * @param processName
	 * @param matchings
	 * @param matchingSimilarity
	 */
	public InexactMatchingResult(String processID, String processNamespace,
			String processName, List<Match> matchings,
			float matchingSimilarity) {
		super(processID, processNamespace, processName);
		this.matchings = matchings;
		this.matchingSimilarity = matchingSimilarity;
	}
	
	
	/**
	 * @param processID
	 * @param processNamespace
	 * @param processName
	 * @param matchingSimilarity
	 */
	public InexactMatchingResult(String processID, String processNamespace,
			String processName, float matchingSimilarity) {
		super(processID, processNamespace, processName);
		this.matchings = new ArrayList<Match>();
		this.matchingSimilarity = matchingSimilarity;
	}
	
	public List<Match> getMatchings() {
		return matchings;
	}

	public void setMatchings(List<Match> matchings) {
		this.matchings = matchings;
	}

	public float getMatchingSimilarity() {
		return matchingSimilarity;
	}

	public void setMatchingSimilarity(float matchingSimilarity) {
		this.matchingSimilarity = matchingSimilarity;
	}
}
