package de.uni.stuttgart.bpelSearching.matching;

import java.util.LinkedList;
import java.util.ListIterator;

import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * The NodePair class represents a pair of nodes (node, parent(node)) 
 * and its temporary results joined with its children, they are 
 * stored in final solution stack. 
 *
 * @author Wei Lu
 */
public class NodePair {

	private ActivityNode node;
	private ActivityNode parentNode;
	private LinkedList<StringBuffer> joinedResults;
	private boolean existMultipleParentsInStack;
	//private LinkedList<StringBuffer> originalJoinedResults;
	private int originalJoinedResultsSize;
	/**
	 * Initializes a newly created NodePair with the given node, parentNode.
	 * 
	 * @param node
	 *            an node which participates solution
	 * @param parentNode
	 *            the parent node
	 * @param joinedResults
	 *            the temporary results joined with its children
	 * @param existMultipleParentsInStack
	 *            indicates whether there are more than one NodePair with the same parentNode in the stack
	 * @param originalJoinedResultsSize
	 *            number of the old join results computed before the current join processing
	 */
	
	public NodePair(ActivityNode node, ActivityNode parentNode, LinkedList<StringBuffer> joinedResults, 
			boolean existMultipleParentsInStack, int originalJoinedResultsSize) {
		super();
		
		this.node = node;
		this.parentNode = parentNode;
		this.joinedResults = joinedResults;
		this.existMultipleParentsInStack = existMultipleParentsInStack;
		//this.originalJoinedResults = originalJoinedResults;
		this.originalJoinedResultsSize = originalJoinedResultsSize;
	}

	public String toString() {
		String temp = "";
		if (parentNode == null) {
			temp = node.getActivityID() + ": NULL  MultipleParents: "+ String.valueOf(existMultipleParentsInStack) + "  JoinedResults:  " ;
		} else {
			temp = node.getActivityID() + ": " + parentNode.getActivityID() + "  MultipleParents: "+ String.valueOf(existMultipleParentsInStack) + "  JoinedResults:  " ;
		}
		ListIterator< StringBuffer > iterator = joinedResults.listIterator();
		while (iterator.hasNext()) {	
			temp += " ||  " + iterator.next();
		}
		
		return temp;
		
	}

	public ActivityNode getNode() {
		return node;
	}


	public void setNode(ActivityNode node) {
		this.node = node;
	}


	public ActivityNode getParentNode() {
		return parentNode;
	}


	public void setParentNode(ActivityNode parentNode) {
		this.parentNode = parentNode;
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
