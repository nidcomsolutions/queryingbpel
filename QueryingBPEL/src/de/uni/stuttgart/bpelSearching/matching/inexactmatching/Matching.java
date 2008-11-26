/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.inexactmatching;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author luwei
 *
 */
public class Matching {
	private float matchingSimilarity;
	private List<Assignment> assignments;

	/**
	 * @param matchingSimilarity
	 * @param assignments
	 */
	public Matching(float matchingSimilarity, List<Assignment> assignments) {
		super();
		this.matchingSimilarity = matchingSimilarity;
		this.assignments = assignments;
	}
	
	/**
	 * @param matchingSimilarity
	 * @param assignments
	 */
	public Matching(float matchingSimilarity, Assignment assignment) {
		super();
		this.matchingSimilarity = matchingSimilarity;
		this.assignments = new ArrayList<Assignment>();
		this.assignments.add(assignment);
	}

	/**
	 * @param matchingSimilarity
	 */
	public Matching() {
		super();
		this.matchingSimilarity = 0;
		this.assignments = new ArrayList<Assignment>();
	}
	
	public String toString() {
		String tempStr = "";
		tempStr += (" Matching with Size " + matchingSimilarity + " : " );
		if (assignments != null) {
			for (Assignment ass : assignments) {
				tempStr += ass.toString();
			}
		} 
		return tempStr;
	}
	
	/**
	 * Returns the number of different assigned process nodes between 
	 * the matching and the input matching
	 * 
	 * @param inputMac the input matching to be compared
	 * 
	 * @return the number of different assigned process nodes between 
	 *  the matching and the input matching 
	 */
	public int getNumberOfDiffProcessNode (Matching inputMac) {
		int numberOfDiffAssignedProcNode = 0;
		List<Assignment> inputAssignms = inputMac.getAssignments();
		for (Assignment iassm : inputAssignms) {
			numberOfDiffAssignedProcNode += iassm.getNumberOfDiffProcessNode(assignments);
		}
		return numberOfDiffAssignedProcNode;
	}
	
	/**
	 * Returns the number of different ids between the ids of the process nodes 
	 * assigned by the matching and the input ids
	 * 
	 * @param existPIDs the ids of the process nodes to be compared
	 * @param pidsOfMatch the ids of the process nodes assigned by the match
	 * 
	 * @return the number of different ids between the ids of the process nodes 
	 * assigned by the matching and the input ids 
	 */
	public int getNumberOfDiffProcessNode (Set<String> existPIDs, Set<String> pidsOfMatch) {
		int numberOfDiffAssignedProcNode = 0;
		if (!pidsOfMatch.isEmpty()) {
			pidsOfMatch.clear();
		}
		addAllProcessNodeIDs(pidsOfMatch);
		for (String pidOfMatch : pidsOfMatch) {
			if (!existPIDs.contains(pidOfMatch)) {
				numberOfDiffAssignedProcNode++;
			}
		}
//		for (Assignment assm : assignments) {
//			numberOfDiffAssignedProcNode += assm.getNumberOfDiffProcessNode(existPIDs);
//		}
		return numberOfDiffAssignedProcNode;
	}
	
	/**
	 * Adds all process ids, which appear in the matching, in the input ids.
	 * 
	 * @param existPIDs the ids to be added
	 */
	public void addAllProcessNodeIDs(Set<String> existPIDs) {
		for (Assignment assm : assignments) {
			assm.addAllProcessNodeIDs(existPIDs);
		}
	}
	
	/**
	 * Removes all process ids, which appear in the matching, from the input ids.
	 * 
	 * @param existPIDs the ids to be removed
	 */
	public void removeAllProcessNodeIDs(Set<String> existPIDs) {
		for (Assignment assm : assignments) {
			assm.removeAllProcessNodeIDs(existPIDs);
		}
	}
	
    /**
     * Adds a given assignment to the assignment list.
     * 
     * @param assm the assignment to be added.
     *
     * @return <code>true</code> if the assignment has been successfully added,
     * otherwise <code>false</code>.
     */
	public boolean addAssignment(Assignment assm) {
		if (assignments != null) {
			assignments.add(assm);
			return true;
		}	
		return false;
	}

	public float getMatchingSimilarity() {
		return matchingSimilarity;
	}

	public void setMatchingSimilarity(float matchingSimilarity) {
		this.matchingSimilarity = matchingSimilarity;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
}
