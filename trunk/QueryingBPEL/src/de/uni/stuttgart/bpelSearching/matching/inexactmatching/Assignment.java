/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.inexactmatching;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;

/**
 * An assignment consists a list of assigns, which assigns a query subgraph to a substructure 
 * of process graph.
 * 
 * @author luwei
 *
 */
public class Assignment {
	private float assignSize;
	private int numberOfAssignedQueryNodes;
	private List<Assign> assigns;
	
	/**
	 * Creates an assignment with the given list of assignments and size of the assignment.
	 * 
	 * @param assignSize size of the assignment
	 * @param numberOfAssignedQueryNodes number of query nodes that are assigned by non-empty value
	 * @param assigns the list of assignments to be added in the new created assignment
	 * 
	 */
	public Assignment(float assignSize, int numberOfAssignedQueryNodes, List<Assign> assigns) {
		super();
		this.assignSize = assignSize;
		this.numberOfAssignedQueryNodes = numberOfAssignedQueryNodes;
		if (assigns == null) {
			this.assigns = new LinkedList<Assign>();
		} else {
			this.assigns = assigns;
		}
	}
	
	/**
	 * Creates an assignment with the given list of assignments.
	 * 
	 * @param assigns the list of assignments to be added in the new created assignment
	 * 
	 */
	public Assignment(List<Assign> assigns) {
		super();
		if (assigns == null) {
			this.assigns = new LinkedList<Assign>();
		} else {
			this.assigns = assigns;
		}
		this.assignSize = 0.0f;
		this.numberOfAssignedQueryNodes = 0;
	}

	/**
	 * Creates an assignment.
	 * 
	 */
	public Assignment() {
		super();
		this.assignSize = 0.0f;
		this.numberOfAssignedQueryNodes = 0;
		this.assigns = new LinkedList<Assign>();
	}
	
	public String toString() {
		String tempStr = "";
		tempStr += (" Assignment with Size " + assignSize + "  numberOfAssignedQueryNodes: " + 
				numberOfAssignedQueryNodes + " : {" );
		for (Assign ass : assigns) {
			tempStr += ass.toString();
		}
		tempStr += "}";
		return tempStr;
	}
	
    /**
     * Adds an assign to the assignment that assign id of the given query node to undefined.
     *
     * @param queryNode query node, whose id to be assigned and to be added to the assignment
     * 
     */
	public void addAssign(ActivityNode queryNode) {
		this.assigns.add(new Assign(queryNode.getActivityID()));
	}
	
    /**
     * Adds an assign to the assignment that assign id of the given query node to id of 
     * the given process node.
     *
     * @param queryNode query node, whose id to be assigned and to be added to the assignment
     * @param processNode process node, whose id is assigned to the query node
     * 
     */
	public void addAssign(ActivityNode queryNode, ActivityNode processNode) {
		this.assigns.add(new Assign(queryNode.getActivityID(), processNode.getActivityID()));
	}
	
    /**
     * Adds assigns to the assignment that assign ids of the given query nodes to undefined.
     *
     * @param queryNodes query nodes, whose ids to be assigned and to be added to the assignment
     * 
     */
	public void addAssignsByQueryNodes(Set<ActivityNode> queryNodes) {
		for (ActivityNode qNode : queryNodes) {
			this.assigns.add(new Assign(qNode.getActivityID()));
		}
	}
	
    /**
     * Adds assigns to the assignment that assign the given ids of query nodes to undefined.
     *
     * @param queryNodeIDs ids of query nodes to be assigned and to be added to the assignment
     * 
     */
	public void addAssignsByQueryNodesIDs(Set<String> queryNodeIDs) {
		for (String qNodeID : queryNodeIDs) {
			this.assigns.add(new Assign(qNodeID));
		}
	}
	
    /**
     * Adds assigns contained in the given assignment to the assignment.
     *
     * @param assm assignment whose assigns to be added
     * 
     */
	public void addAssignment(Assignment assm) {
		this.assigns.addAll(assm.getAssigns());
	}
	
    /**
     * Adds assigns of the given assignment that are not contained in the current 
     * assignment to the current assignment.
     *
     * @param assm assignment whose assigns to be added
     * 
     */
	public void addAssignmentComplement(Assignment assm) {
		boolean isComplement;
		List<Assign> assList = assm.getAssigns();
		for (Assign ass1 : assList) {
			isComplement = true;
			for (Assign ass2 : assigns) {
				if (ass1.getQuerynodeID().compareTo
						(ass2.getQuerynodeID()) == 0) {
					isComplement = false;
					break;
				}	
			}
			if (isComplement) {
				this.assigns.add(ass1);
			}	
		}
	}
	
    /**
     * Returns all ids of query nodes in the assignment.
     *
     * @return all ids of query nodes in the assignment
     */
	public List<String> getQueryNodesIDs() {
		List<String> qIDs = new ArrayList<String>();
		for (Assign ass : assigns) {
			qIDs.add(ass.getQuerynodeID());
		}
		return qIDs;
	}
	
    /**
     * Stores all ids of query nodes in the assignment in the parameter.
     *
     * @param qIDs all ids of query nodes in the assignment
     * 
     */
	public void getQueryNodesIDs(Set<String> qIDs) {
		if (!qIDs.isEmpty()) {
			qIDs.clear();
		}
		for (Assign ass : assigns) {
			qIDs.add(ass.getQuerynodeID());
		}
	}
	
    /**
     * Check whether the given query node id is contained in the assignment.
     * 
     * @param qID the query node id to be checked.
     *
     * @return <code>true</code> if the given query node id is contained in the assignment,
     * otherwise <code>false</code>.
     */
	public boolean containQueryNode(String qID) {
		for (Assign ass : assigns) {
			if (ass.getQuerynodeID().compareTo(qID)== 0) {
				return true;
			}
		}
		return false;
	}
	
    /**
     * Returns the process node id assigned by the given query node id.
     * 
     * @param qID query node id
     *
     * @return the process node id assigned by the given query node id
     */
	public String getProcessNodeID (String qID) {
		for (Assign ass : assigns) {
			if (ass.getQuerynodeID().compareTo(qID)== 0) {
				return ass.getProcessNodeID();
			}
		}
		return null;
	}
	
    /**
     * Returns all ids of process nodes in the assignment.
     *
     * @return all ids of process nodes in the assignment
     */
	public Set<String> getProcessNodesIDs() {
		Set<String> pIDs = new HashSet<String>();
		for (Assign ass : assigns) {
			if(ass.getProcessNodeID() != null) {
				pIDs.add(ass.getProcessNodeID());
			}
		}
		return pIDs;
	}
	
	/**
	 * Adds all process ids, which appear in the assignment, in the input ids.
	 * 
	 * @param existPIDs the ids to be added
	 */
	public void addAllProcessNodeIDs(Set<String> existPIDs) {
		for (Assign ass : assigns) {
			if(ass.getProcessNodeID() != null) {
				existPIDs.add(ass.getProcessNodeID());
			}	
		}
	}
	
	/**
	 * Removes all process ids, which appear in the assignment, from the input ids.
	 * 
	 * @param existPIDs the ids to be removed
	 */
	public void removeAllProcessNodeIDs(Set<String> existPIDs) {
		for (Assign ass : assigns) {
			if (ass.getProcessNodeID() != null) {
				existPIDs.remove(ass.getProcessNodeID());
			}	
		}
	}
	
	/**
	 * Returns the number of different assigned process nodes of the 
	 * current assignment
	 * 
	 * @return the number of different assigned process nodes of the 
	 * current assignment
	 */
	public int getNumberOfDiffProcessNodes () {
		int numberOfDiffAssignedProcNodes = 0;
		int assignsLength = assigns.size();
		String assiPID, assjPID;
		boolean isDiff;
		for (int i = 0; i < assignsLength; i++) {
			if ((assiPID = assigns.get(i).getProcessNodeID()) != null) {
				isDiff = true;
				for (int j = 0; j < i; j++) {
					if ((assjPID = assigns.get(j).getProcessNodeID()) != null) {
						if (assiPID.compareTo(assjPID) == 0) {
							isDiff = false;
							break;
						}
					}
				}
				
				if (isDiff) {
					numberOfDiffAssignedProcNodes++;
				}
			}
		}
		return numberOfDiffAssignedProcNodes;
	}
	
	
	/**
	 * Returns the number of different ids between the ids of the process nodes 
	 * assigned by the assignment and the input ids
	 * 
	 * @param existPIDs the ids of the process nodes to be compared
	 * 
	 * @return the number of different ids between the ids of the process nodes 
	 * assigned by the assignment and the input ids 
	 */
	public int getNumberOfDiffProcessNodes(Set<String> existPIDs) {
		int numberOfDiffProcIDs = 0;
		for (Assign ass : assigns) {
			if (ass.getProcessNodeID() != null) { 
				if (!existPIDs.contains(ass.getProcessNodeID())) {
					numberOfDiffProcIDs++;
				}
			}
		}
		return numberOfDiffProcIDs;
	}


	/**
	 * Returns a new assignment which contains assigns of the exist assignment and their query nodes 
	 * are not appeared in the given set of query nodes.
	 * 
	 * @param queryNodes set of query nodes
	 * @param restPartSize matching size of the new assignment
	 * 
	 * @return a new assignment which contains assigns of the exist assignment and their query nodes 
	 * are not appeared in the given set of query nodes 
	 */
	public Assignment getRestPartOfAssignmentByQueryNodes(Set<ActivityNode> queryNodes, 
			float restPartSize) {
		String qID;
		Set<ActivityNode> tempQNodes = new HashSet<ActivityNode>();
		tempQNodes.addAll(queryNodes);
		List<Assign> resultList = new LinkedList<Assign>();
		resultList.addAll(assigns);
		for (Iterator<Assign> itAss = resultList.iterator(); itAss.hasNext();) {
			qID = itAss.next().getQuerynodeID();
			for (Iterator<ActivityNode> itQ = tempQNodes.iterator(); 
				itQ.hasNext();) {
				if (qID.compareTo(itQ.next().getActivityID())
						== 0) {
					itAss.remove();
					itQ.remove();
					break;
				}
			}
		}
		Assignment resultAss = new Assignment(restPartSize, 0, resultList);
		return resultAss;
	}
	
	/**
	 * Returns a new assignment which contains assigns of the exist assignment and their ids of query nodes 
	 * are not appeared in the given set of ids of query nodes.
	 * 
	 * @param queryNodesIDs set of ids of query nodes
	 * @param restPartSize matching size of the new assignment to be returned
	 * 
	 * @return a new assignment which contains assigns of the exist assignment and their ids of query nodes 
	 * are not appeared in the given set of ids of query nodes 
	 */
	public Assignment getRestPartOfAssignmentByQueryNodesIDs(Set<String> queryNodesIDs, 
			float restPartSize) {
		String qIDAssign;
		List<Assign> resultList = new LinkedList<Assign>();
		for (Assign ass : assigns) {
			qIDAssign = ass.getQuerynodeID();
			if (!queryNodesIDs.contains(qIDAssign)) {
				resultList.add(ass);
			}
		}
		Assignment resultAss = new Assignment(restPartSize, 0, resultList);
		return resultAss;
	}
	
	
	/**
	 * Returns a new assignment which contains assigns of current assignment and their ids of query nodes 
	 * are appeared in the given set of ids of query nodes.
	 * 
	 * @param queryNodesIDs set of ids of query nodes
	 * @param size matching size of the new assignment
	 * 
	 * @return a new assignment which contains assigns of the exist assignment and their ids of query nodes 
	 * are appeared in the given set of ids of query nodes 
	 */
	public Assignment getPartOfAssignmentByQueryNodesIDs(Set<String> queryNodesIDs, float size) {
		String qIDAssign;
		List<Assign> resultList = new LinkedList<Assign>();
		for (Assign ass : assigns) {
			qIDAssign = ass.getQuerynodeID();
			if (queryNodesIDs.contains(qIDAssign)) {
				resultList.add(ass);
			}
		}
		Assignment resultAss = new Assignment(size, 0, resultList);
		return resultAss;
	}
	
	
	/**
	 * Returns the number of different assigned process nodes between 
	 * the assignment and the input assignment
	 * 
	 * @param inputAss the input assignment to be compared
	 * 
	 * @return the number of different assigned process nodes between 
	 *  the assignment and the input assignment 
	 */
	public int getNumberOfDiffProcessNodes (Assignment inputAss) {
		int numberOfDiffAssignedProcNode = 0;
		List<Assign> inputAssigns = inputAss.getAssigns();
		for (Assign ass : assigns) {
			for (Assign iass : inputAssigns) {
				if (ass.getQuerynodeID().compareTo(iass.getQuerynodeID())
						== 0) {
					if ((ass.processNodeID != null) && (iass.processNodeID != null)) {
						if (ass.processNodeID.compareTo(iass.processNodeID)!= 0) {
							numberOfDiffAssignedProcNode++;
						}
					} else if ((ass.processNodeID == null) && (iass.processNodeID != null)) {
						numberOfDiffAssignedProcNode++;
					} else if ((ass.processNodeID != null) && (iass.processNodeID == null)) {
						numberOfDiffAssignedProcNode++;
					}
					break;
				}
			}
		}
		return numberOfDiffAssignedProcNode;
	}
	
	/**
	 * Returns the number of different assigned process nodes between 
	 * the assignment and the input list of assignments
	 * 
	 * @param inputAssmList the input list of assignments to be compared
	 * 
	 * @return the number of different assigned process nodes between 
	 *  the assignment and the input list of assignments 
	 */
	public int getNumberOfDiffProcessNode (List<Assignment> inputAssmList) {
		int numberOfDiffAssignedProcNode = 0;
		List<Assign> inputAssignList;
		boolean found;
		for (Assign ass : assigns) {
			found = false;
			for (Assignment iassm : inputAssmList) {
				inputAssignList = iassm.getAssigns();
				for (Assign iass : inputAssignList) {
					if (ass.getQuerynodeID().compareTo(iass.getQuerynodeID())
							== 0) {
						if ((ass.processNodeID != null) && (iass.processNodeID != null)) {
							if (ass.processNodeID.compareTo(iass.processNodeID)!= 0) {
								numberOfDiffAssignedProcNode++;
							}
						} else if ((ass.processNodeID == null) && (iass.processNodeID != null)) {
							numberOfDiffAssignedProcNode++;
						} else if ((ass.processNodeID != null) && (iass.processNodeID == null)) {
							numberOfDiffAssignedProcNode++;
						}
						found = true;
						break;
					}
				}
				if (found) {
					break;
				}
			}
		}
		return numberOfDiffAssignedProcNode;
	}
	
	
	/**
	 * Returns number of assigned query nodes of the assignment except the given query nodes.
	 * 
	 * @param nodeIDs ids of query nodes that are not counted for the number of assigned query nodes
	 * 
	 * @return number of assigned query nodes of the assignment
	 *  
	 */
	public int getNumberOfComplementAssignedQueryNodes (Set<String> nodeIDs) {
		int numberOfAssignedQueryNodes = 0;
		for (Assign ass : assigns) {
			if ((ass.getProcessNodeID() != null) && (!nodeIDs.contains(ass.getQuerynodeID()))) {
				numberOfAssignedQueryNodes++;
			}
		}
		return numberOfAssignedQueryNodes;
	}
	
	
	/**
	 * Returns number of assigned query nodes which also appear in the given 
	 * list of query ids
	 * 
	 * @param qIDList a list of query ids
	 * 
	 * @return number of assigned query nodes which also appear in the given 
	 * list of query ids
	 *  
	 */
//	public int getNumberOfAssignedQueryNodes (List<String> qIDList) {
//		int numberOfAssignedQueryNodes = 0;
//		for (Assign ass : assigns) {
//			if ((ass.getProcessNodeID() != null) && (qIDList.contains(ass.getQuerynodeID()))) {
//				numberOfAssignedQueryNodes++;
//			}
//		}
//		return numberOfAssignedQueryNodes;
//	}
	
	/**
	 * Returns number of assigned query nodes which also appear in the given 
	 * set of query ids
	 * 
	 * @param qIDSet a set of query ids
	 * 
	 * @return number of assigned query nodes which also appear in the given 
	 * set of query ids
	 *  
	 */
	public int getNumberOfAssignedQueryNodes (Set<String> qIDSet) {
		int numberOfAssignedQueryNodes = 0;
		for (Assign ass : assigns) {
			if ((ass.getProcessNodeID() != null) && (qIDSet.contains(ass.getQuerynodeID()))) {
				numberOfAssignedQueryNodes++;
			}
		}
		return numberOfAssignedQueryNodes;
	}
	
	/**
	 * Returns number of assigned query nodes of the assignment.
	 * 
	 * @return number of assigned query nodes of the assignment
	 *  
	 */
	public int computeNumberOfAssignedQueryNodes () {
		int numberOfAssignedQueryNodes = 0;
		for (Assign ass : assigns) {
			if (ass.getProcessNodeID() != null) {
				numberOfAssignedQueryNodes++;
			}
		}
		setNumberOfAssignedQueryNodes(numberOfAssignedQueryNodes);
		return numberOfAssignedQueryNodes;
	}
	
	public int getNumberOfAssignedQueryNodes() {
		return numberOfAssignedQueryNodes;
	}

	public void setNumberOfAssignedQueryNodes(int numberOfAssignedQueryNodes) {
		this.numberOfAssignedQueryNodes = numberOfAssignedQueryNodes;
	}
	
	public float getAssignSize() {
		return assignSize;
	}

	public void setAssignSize(float assignSize) {
		this.assignSize = assignSize;
	}

	public List<Assign> getAssigns() {
		return assigns;
	}

	public void setAssigns(List<Assign> assigns) {
		this.assigns = assigns;
	}
	
	//~ Inner Class ----------------------------------------------------------
    /**
     * It represents an assign in a assignment. An assign assigns a query node to 
     * a process node.
     * 
     */
	private class Assign {
		private String querynodeID;
		private String processNodeID;

		/**
		 * @param querynode
		 * @param processNode
		 */
		public Assign(ActivityNode querynode, ActivityNode processNode) {
			super();
			this.querynodeID = querynode.getActivityID();
			this.processNodeID = processNode.getActivityID();
		}
		
		/**
		 * @param querynodeID
		 * @param processNodeID
		 */
		public Assign(String querynodeID, String processNodeID) {
			super();
			this.querynodeID = querynodeID;
			this.processNodeID = processNodeID;
		}

		/**
		 * @param querynode
		 */
		public Assign(ActivityNode querynode) {
			super();
			this.querynodeID = querynode.getActivityID();
		}
		
		/**
		 * @param querynodeID
		 */
		public Assign(String querynodeID) {
			super();
			this.querynodeID = querynodeID;
		}

		
		public String toString() {
			String tempStr = "";
			if (querynodeID != null) {
				if (processNodeID == null) {
					tempStr += (" [" + querynodeID + " - " + "null] " );
				} else {
					tempStr += (" [" + querynodeID + " - " + processNodeID + "] " );
				}
			}		
			return tempStr;
		}
		
		public String getQuerynodeID() {
			return querynodeID;
		}

		public void setQuerynodeID(String querynodeID) {
			this.querynodeID = querynodeID;
		}

		public String getProcessNodeID() {
			return processNodeID;
		}

		public void setProcessNodeID(String processNodeID) {
			this.processNodeID = processNodeID;
		}
	}
}
