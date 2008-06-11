/**
 * 
 */
package de.uni.stuttgart.bpelSearching.index;

/**
 * @author luwei
 *
 */
public class PathCount {
	private int numberOfPaths;
	private boolean changed;
	
	/**
	 * 
	 */
	public PathCount() {
		super();
		numberOfPaths = 1;
		changed = false;
	}
	
	/**
	 * @param numberOfPaths
	 * @param hasChanged
	 */
	public PathCount(int numberOfPaths, boolean changed) {
		super();
		this.numberOfPaths = numberOfPaths;
		this.changed = changed;
	}

	public int getNumberOfPaths() {
		return numberOfPaths;
	}

	public void setNumberOfPaths(int numberOfPaths) {
		this.numberOfPaths = numberOfPaths;
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean hasChanged) {
		this.changed = hasChanged;
	}
	

	
	
	
}
