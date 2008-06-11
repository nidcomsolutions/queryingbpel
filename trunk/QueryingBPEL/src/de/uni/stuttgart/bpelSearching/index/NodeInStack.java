package de.uni.stuttgart.bpelSearching.index;


/**
 * The NodeInStack class represents an element in the partial solution stack 
 * of a query node.
 * 
 * @author Wei Lu
 * 
 */

public class NodeInStack {
	
	private NodeRegionEncoding node;
	private NodeInStack next;
	
    /**
     * Creates a new stack item e.g. for node q. Each item in the stack consists of a pair:
	 * (positional representation of a node from q's stream, pointer to a node in the parent stack of q).
     *
     * @param node positional representation of a node from stream q.
     * @param next pointer to a node in parent stack of q.
     *
     */
    public NodeInStack(NodeRegionEncoding node, NodeInStack next)
    {
    	this.node = node;
    	this.next = next;   	
    }
    
    /**
     * Creates a new stack item e.g. for node q. This item consists of a pair:
	 * (positional representation of a node from q's stream, a null pointer).
	 * 
     * @param node positional representation of a node from stream q.
     *
     */
    public NodeInStack(NodeRegionEncoding node)
    {
    	this.node = node;   	
    }
    
	public String toString() {
		if (next == null) {
			return (node.getActivityID() + " - Null" );
		} else {
			return (node.getActivityID() + " - " + next.getNode().getActivityID());
		}
	}

	public NodeRegionEncoding getNode() {
		return node;
	}

	public void setNode(NodeRegionEncoding node) {
		this.node = node;
	}

	public NodeInStack getNext() {
		return next;
	}

	public void setNext(NodeInStack next) {
		this.next = next;
	}

}
