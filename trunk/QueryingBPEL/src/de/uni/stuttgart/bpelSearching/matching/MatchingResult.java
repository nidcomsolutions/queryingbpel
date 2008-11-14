/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching;


/**
 * @author luwei
 *
 */
public class MatchingResult {
	//private ProcessFlowGraph processGraph;
	protected String processID;
	protected String processNamespace;
	protected String processName;

	/**
	 * @param processID
	 * @param processNamespace
	 * @param processName
	 */
	public MatchingResult(String processID, String processNamespace,
			String processName) {
		super();
		this.processID = processID;
		this.processNamespace = processNamespace;
		this.processName = processName;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

	public String getProcessNamespace() {
		return processNamespace;
	}

	public void setProcessNamespace(String processNamespace) {
		this.processNamespace = processNamespace;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}
}
