/**
 * 
 */
package de.uni.stuttgart.bpelSearching.GraphMapping.nodes;

/**
 * This class represents Invoke Activity Node.
 * @author luwei
 *
 */
public class ActivityInvokeNode extends ActivityNode {
	
	private String partnerLink;
	private String portType;
	private String operation;
	private String inputVariable;
	private String outputVariable;	


	/**
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 * @param containerId
	 */
	public ActivityInvokeNode(String activityID, String activityName,
			int activityType, String containerId) {
		super(activityID, activityName, activityType, containerId);
		// TODO Auto-generated constructor stub	
		this.partnerLink = "";
		this.portType = "";
		this.operation = "";
		this.inputVariable = "";
		this.outputVariable = "";
	}
	
	/**
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 */
	public ActivityInvokeNode(String activityID, String activityName,
			int activityType) {
		super(activityID, activityName, activityType);
		// TODO Auto-generated constructor stub
		this.partnerLink = "";
		this.portType = "";
		this.operation = "";
		this.inputVariable = "";
		this.outputVariable = "";
	}
	
	/**
	 * Creates a new invoke node and assign the attributes of invoke activity.
	 * 
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 * @param containerId
	 * @param partnerLink
	 * @param portType
	 * @param operation
	 * @param inputVariable
	 * @param outputVariable
	 */
	public ActivityInvokeNode(String activityID, String activityName,
			int activityType, String containerId, String partnerLink,
			String portType, String operation, String inputVariable,
			String outputVariable) {
		super(activityID, activityName, activityType, containerId);
		this.partnerLink = partnerLink;
		this.portType = portType;
		this.operation = operation;
		this.inputVariable = inputVariable;
		this.outputVariable = outputVariable;
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

	public String getInputVariable() {
		return inputVariable;
	}

	public void setInputVariable(String inputVariable) {
		this.inputVariable = inputVariable;
	}

	public String getOutputVariable() {
		return outputVariable;
	}

	public void setOutputVariable(String outputVariable) {
		this.outputVariable = outputVariable;
	}





}
