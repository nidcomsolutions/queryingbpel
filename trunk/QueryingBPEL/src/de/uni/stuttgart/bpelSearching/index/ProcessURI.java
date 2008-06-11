/**
 * 
 */
package de.uni.stuttgart.bpelSearching.index;

/**
 * ProcessURI matches table processFileURI.
 * @author luwei
 *
 */
public class ProcessURI {
	
	private Long processID;
	private String processFileURI;

	/**
	 * 
	 */
	public ProcessURI() {
		// TODO Auto-generated constructor stub
	}
	
	public ProcessURI(Long processID, String processFileURI) {
		super();
		this.processID = processID;
		this.processFileURI = processFileURI;
	}

	public Long getProcessID() {
		return processID;
	}

	public void setProcessID(Long processID) {
		this.processID = processID;
	}

	public String getProcessFileURI() {
		return processFileURI;
	}

	public void setProcessFileURI(String processFileURI) {
		this.processFileURI = processFileURI;
	}

}
