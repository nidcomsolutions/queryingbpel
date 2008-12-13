package de.uni.stuttgart.bpelSearching.datastructure;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * The ProcessNodePair class represents an element stored in final solution stack,
 * that consists a pair of process nodes ID and the temporary 
 * results by joining the descendant results. 
 *
 * @author Wei Lu
 */
public class ProcessNodePair {
	private String nodeID;
	private String parentNodeID;
	private LinkedList<StringBuffer> joinedResults;
	private boolean existMultipleParentsInStack;
	private int originalJoinedResultsSize;
	
	/**
	 * Initializes a newly created ProcessNodePair with the given nodeID, parentNodeID.
	 * 
	 * @param nodeID
	 *            ID of a process node which participates solution
	 * @param parentNodeID
	 *            ID of the parent node
	 * @param joinedResults
	 *            the temporary results joined with its children
	 * @param existMultipleParentsInStack
	 *            indicates whether there are more than one ProcessNodePair with the same parentNodeID in the stack
	 * @param originalJoinedResultsSize
	 *            number of the old join results computed before the current join processing
	 */
	public ProcessNodePair(String nodeID, String parentNodeID, LinkedList<StringBuffer> joinedResults, 
			boolean existMultipleParentsInStack, int originalJoinedResultsSize) {
		super();
		
		this.nodeID = nodeID;
		this.parentNodeID = parentNodeID;
		this.joinedResults = joinedResults;
		this.existMultipleParentsInStack = existMultipleParentsInStack;
		//this.originalJoinedResults = originalJoinedResults;
		this.originalJoinedResultsSize = originalJoinedResultsSize;
	}

	public String toString() {
		String temp = "";
		if (parentNodeID == "") {
			temp = nodeID + ": NULL  MultipleParents: "+ String.valueOf(existMultipleParentsInStack) + "  JoinedResults:  " ;
		} else {
			temp = nodeID + ": " + parentNodeID + "  MultipleParents: "+ String.valueOf(existMultipleParentsInStack) + "  JoinedResults:  " ;
		}
		ListIterator< StringBuffer > iterator = joinedResults.listIterator();
		while (iterator.hasNext()) {	
			temp += " ||  " + iterator.next();
		}
		
		return temp;
		
	}

	public String getNodeID() {
		return nodeID;
	}


	public void setNodeID(String nodeID) {
		this.nodeID = nodeID;
	}


	public String getParentNodeID() {
		return parentNodeID;
	}


	public void setParentNodeID(String parentNodeID) {
		this.parentNodeID = parentNodeID;
	}


	public LinkedList<StringBuffer> getJoinedResults() {
		return joinedResults;
	}


	public void setJoinedResults(LinkedList<StringBuffer> joinedResults) {
		this.joinedResults = joinedResults;
	}


	public boolean getExistMultipleParentsInStack() {
		return existMultipleParentsInStack;
	}


	public void setExistMultipleParentsInStack(boolean existMultipleParentsInStack) {
		this.existMultipleParentsInStack = existMultipleParentsInStack;
	}

	public int getOriginalJoinedResultsSize() {
		return originalJoinedResultsSize;
	}

	public void setOriginalJoinedResultsSize(int originalJoinedResultsSize) {
		this.originalJoinedResultsSize = originalJoinedResultsSize;
	}	
}
