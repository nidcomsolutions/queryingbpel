/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.inexactmatching;
/**
 * This class defines some constants of similarity measure type.
 * 
 * @author luwei
 *
 */
public class SimilarityMeasureType {
	private String simMeasureType;
	
    /**
     * Creates a new similarity measure type.
     * 
     * @param st the search type.
     */
	private SimilarityMeasureType(String st){
		simMeasureType = st;
	}
	
	public String toString(){
		return simMeasureType;
	}
	
	public static final SimilarityMeasureType 
		STRUCTRUREDONLY = new SimilarityMeasureType("structured only"),
		MATCHINGNODESONLY = new SimilarityMeasureType("matching nodes only"),
		MIXED = new SimilarityMeasureType("mixed");
	
	public static final SimilarityMeasureType[] metrictype = {STRUCTRUREDONLY, 
		MATCHINGNODESONLY, MIXED};
	
	public static final SimilarityMeasureType getSimilarityMeasureType(int ord){
		return metrictype[ord -1];
	}

}
