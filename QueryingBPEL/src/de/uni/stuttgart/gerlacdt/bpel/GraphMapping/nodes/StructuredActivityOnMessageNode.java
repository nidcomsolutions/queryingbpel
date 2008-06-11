/**
 * 
 */
package de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes;

/**
 * This class represents OnMessage Activity Node.
 * @author luwei
 *
 */
public class StructuredActivityOnMessageNode extends StructuredActivityNode {
	
	private String partnerLink;
	private String portType;
	private String operation;
	private String variable;
	
	/**
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 * @param containerId
	 * @param startNode
	 */
	public StructuredActivityOnMessageNode(String activityID,
			String activityName, int activityType, String containerId,
			boolean startNode) {
		super(activityID, activityName, activityType, containerId, startNode);
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 * @param containerId
	 * @param startNode
	 * @param partnerLink
	 * @param portType
	 * @param operation
	 * @param variable
	 */
	public StructuredActivityOnMessageNode(String activityID,
			String activityName, int activityType, String containerId,
			boolean startNode, String partnerLink, String portType,
			String operation, String variable) {
		super(activityID, activityName, activityType, containerId, startNode);
		this.partnerLink = partnerLink;
		this.portType = portType;
		this.operation = operation;
		this.variable = variable;
	}


	public String getPartnerLink() {
		return partnerLink;
	}
	public void setPartnerLink(String partnerLink) {
		this.partnerLink = partnerLink;
	}
	public String getPortType() {
		return portType;
	}
	public void setPortType(String portType) {
		this.portType = portType;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}



}
