package de.uni.stuttgart.bpelSearching.matching;

/**
 * Provides 2 constants for graph types.
 *
 * @author Wei Lu
 */

public class SearchType {
	
	private String sType;

    /**
     * Creates a new search type.
     * @param st the search type.
     */
	private SearchType(String st){
		sType = st;
	}
	
	public String toString(){
		return sType;
	}
	
	public static final SearchType 
		EXACTSEARCH = new SearchType("exact search"),
		INEXACTSEARCH = new SearchType("inexact search");
	
	public static final SearchType[] searchtype = {EXACTSEARCH, INEXACTSEARCH};
	
	public static final SearchType number(int ord){
		return searchtype[ord -1];
	}
	
}
