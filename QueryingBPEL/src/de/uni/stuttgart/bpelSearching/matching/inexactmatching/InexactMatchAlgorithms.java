/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.inexactmatching;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.GraphType;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.ProcessGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.graphs.QueryGraph;
import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;
import de.uni.stuttgart.bpelSearching.datastructure.SolutionStream;
import de.uni.stuttgart.bpelSearching.datastructure.StreamItem;
import de.uni.stuttgart.bpelSearching.matching.NodesComparator;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;

/**
 * Class InexactMatchAlgorithms implements the inexact matching algorithms for 
 * tree or DAG pattern query/process graphs.
 * 
 * @author luwei
 *
 */
public class InexactMatchAlgorithms {
	static Logger logger = Logger.getLogger(InexactMatchAlgorithms.class);
	private static QueryGraph querygraph;
	private ProcessGraph processgraph;
	private static float minMatchingSimilarity;
	private static float connectivityFactor;
	private static SimilarityMeasureType typeOfSimilarityMeasure;
	private static boolean isStructuredOnly;
	private static float structuredFactor;
	private static float discreteFactor;
	private int numberOfDiscreteMatchQEdges = 0;
	private int numberOfMatchQNodes = 0;
	private int thresholdOfNumberOfMaxMatch = 0;
	private InexactMatchingResult inexactMatchings;
	
	private static Map<String, SolutionStream> solutionStreamMap;
	private static Map<String, List<Assignment>> tempMaxAssignListMap;
	private static Map<String, List<Assignment>> maxAssignListMap;
	
	private static Set<String> allProcNodesIds;
	private static Set<String> allProcessedProcNodesIds;
	private static Set<String> pIDsInMatch;
	private static Set<String> subTreeNodesIDsQiComplement;
	private static Set<String> processedChildrenSubgraphNodesIDs;
	private static Set<String> commonNodesIDs;
	private static Set<String> qcSubgraphNodesMinusCommonNodesIDs;
	private static List<String> queryIDPairsForNonCommonNodes;
	private static List<String> queryIDPairsForCrossEdges;
	private static List<ActivityNode> qChildrenSorted;
	private static float[] qChildrenMaxRefSize;
	private static Set<String> qiSubgraphNIDsComplement;
	private static Set<String> umQIDs;
	private static Set<String> umjQIDs;
	private static boolean[] isCombined;
	private static List<ActivityNode> qNodesSortedByMatchSize;
	private static List<StreamItem> seQcMaxList;
	private static Set<ActivityNode> qchildren;
	private static NodesComparator nodesCompare;
	
	/**
	 * Creates a new instance of inexact match algorithms with a given query graph and 
	 * a process graph.
	 * 
	 * @param processgraph the process graph
	 * 
	 * @throws IllegalArgumentException if <code>processgraph==null</code> or 
	 * <code>processgraph.getProcessGraph()==null</code>
	 */
	public InexactMatchAlgorithms(ProcessGraph processgraph) {
		GraphAnalyse ga;
    	if ((processgraph == null) || ((processgraph != null) && 
    			(processgraph.getGraph() == null))) {
            throw new IllegalArgumentException("query graph must not be null");
        } 	
		this.processgraph = processgraph;	
		ga = new GraphAnalyse(processgraph.getGraph(), 
				processgraph.getStartActivity());
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}   	    	
    	processgraph.setGraphType(ga.checkGraphType());
	}
	
	
	/**
	 * Performs inexact graph matching between the query graph to each process graph under 
	 * inexact matching semantic.
	 * 
	 */
	public void doInexactMatch(){
		float discreteMatchRatio;
		int numberOfQueryEdges, numberOfQueryNodes;	
		List<Match> maxMatchingList;
		ActivityNode q0;
		List<StreamItem> streamListQ0;
		Assignment tempAssQ0;
		if ((processgraph.getGraphType() == GraphType.TREE)
				|| (processgraph.getGraphType() == GraphType.ROOTED_DAG)) {
			if (typeOfSimilarityMeasure == SimilarityMeasureType.MATCHINGNODESONLY) {
				computeMatchsForMatchNodesOnlyBasedMetric();
			} else {
				initSolutionStreams();
				if ((numberOfQueryEdges = querygraph.getNumberOfEdges()) == 0) {
					q0 = querygraph.getStartActivity();
					if (!(streamListQ0 = solutionStreamMap.get(q0.getActivityID()).getStreamList()).isEmpty()) {
						maxMatchingList = new ArrayList<Match>();
						for (StreamItem seq0 : streamListQ0) {
							tempAssQ0 = new Assignment();
							tempAssQ0.addAssign(q0, seq0.getProcessnode());
							maxMatchingList.add(new Match(1.0f, tempAssQ0));
						}
						inexactMatchings = new InexactMatchingResult(processgraph.getProcessID(), 
								processgraph.getProcessNamespace(), processgraph.getProcessName(), 
								maxMatchingList, 1.0f);
//						printSolutions();
					}	
				} else {
					numberOfQueryNodes = querygraph.getGraph().vertexSet().size();
					if (isStructuredOnly) {
						discreteMatchRatio = (((float)numberOfDiscreteMatchQEdges)/((float)numberOfQueryEdges));
					} else { // "mixed" similarity measure	
						discreteMatchRatio = ((structuredFactor*((float)numberOfDiscreteMatchQEdges) + discreteFactor*
								((float)numberOfMatchQNodes)) / (structuredFactor*((float)numberOfQueryEdges) + 
								discreteFactor*((float)numberOfQueryNodes)));
					}		
					if (discreteMatchRatio >= minMatchingSimilarity) {
						if (querygraph.getGraphType() == GraphType.TREE) {
							computeMaxAssignForTreeNodes();
							maxMatchsOfQueryTree();
						} else if (querygraph.getGraphType() == GraphType.ROOTED_DAG) {
							computeMaxAssignForDAGNodes();
							maxMatchsOfQueryDAG();
						}
					}
				}
			}
		}
	}
	
	/**
	 * Computes inexact matching results. “matching nodes only” connected components based similarity metric is used. 
	 * Simply, for a given query graph and a given process graph, find matching process nodes for each query node, then 
	 * compute a set of maximal matchings that covers all matching process nodes.
	 * 
	 */
	public void computeMatchsForMatchNodesOnlyBasedMetric() {
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		Set<ActivityNode> vertexSetProcess = processgraph.getGraph().vertexSet();
		String qNodeID;
		StreamItem streamElement, seqi;
		int numberOfQueryNodes, numberOfMatchQNodesTemp, maxStreamListLength, tempStreamListLength;
		float similarity, similarityTemp;
		List<Match> maxMatchingList;
		List<StreamItem> streamListQi;
		Assignment tempAssmI;
		
		clearStaticVariables();
		maxStreamListLength = 0;
		numberOfMatchQNodes = 0;
		for (ActivityNode queryNode : vertexSetQuery) {
			qNodeID = queryNode.getActivityID();
			solutionStreamMap.put(qNodeID, new SolutionStream(0));
			for (ActivityNode procNode : vertexSetProcess) {
				if(nodesCompare.compare(queryNode, procNode) == 0){
					streamElement = new StreamItem(procNode, 0, 1, null);
					solutionStreamMap.get(qNodeID).getStreamList().add(streamElement);
				}
			}
			if ((tempStreamListLength = solutionStreamMap.get(qNodeID).getStreamList().size()) > 0) {
				numberOfMatchQNodes++;
				if (tempStreamListLength > maxStreamListLength) {
					maxStreamListLength = tempStreamListLength;
				}
			}
		}
		
		if ((numberOfQueryNodes = vertexSetQuery.size()) > 0) {
			similarity = ((float)numberOfMatchQNodes) / ((float)numberOfQueryNodes);
			if (similarity >= minMatchingSimilarity) {
				maxMatchingList = new ArrayList<Match>();
				for (int i = 0; i < maxStreamListLength; i++) {
					tempAssmI = new Assignment();
					numberOfMatchQNodesTemp = 0;
					for (ActivityNode qi : vertexSetQuery) {
						streamListQi = solutionStreamMap.get(qi.getActivityID()).getStreamList();
						if (streamListQi.size() <= i){
							tempAssmI.addAssign(qi);
						} else {
							seqi = streamListQi.get(i);
							tempAssmI.addAssign(qi, seqi.getProcessnode());
							numberOfMatchQNodesTemp++;
						}					
					}
					similarityTemp = ((float)numberOfMatchQNodesTemp) / ((float)numberOfQueryNodes);
					maxMatchingList.add(new Match(similarityTemp, tempAssmI));
				}
				inexactMatchings = new InexactMatchingResult(processgraph.getProcessID(), 
						processgraph.getProcessNamespace(), processgraph.getProcessName(), 
						maxMatchingList, similarity);
			}
		}
	}
	
	/**
	 * Do the pre-processing step for the inexact matching, associate a solution 
	 * stream Rq to every query node q. The solution stream contains a stream list,
	 * and size of the maximal level-i OR-matchings for query subgraph rooted at q.
	 * 
	 * @param pfGraph the process graph.
	 * 
	 */
	public void initSolutionStreams() {
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		Set<ActivityNode> vertexSetProcess = processgraph.getGraph().vertexSet();
		String qNodeID;
		int tempArrayPos, pPos, cPos, tempMaxNumberOfAssigns;
		float initMaxSize;
		StreamItem streamElement;
		SolutionStream streamQ;
		List<StreamItem> seList, seCList;
		boolean hasMatchQEdge;
		Set<String> qSubGraphIDs;
		
		clearStaticVariables();
		
		processgraph.computeTransitiveClosure();
		numberOfMatchQNodes = 0;
		for (ActivityNode queryNode : vertexSetQuery) {
			if (querygraph.isLeaf(queryNode)) {
				if (isStructuredOnly) {
					initMaxSize = 0.0f;
				} else {
					initMaxSize = discreteFactor;
				}				
			} else {
				initMaxSize = -1.0f;
			}
			qNodeID = queryNode.getActivityID();
//			solutionStreamMap.put(qNodeID, new SolutionStream(initMaxSize));
			streamQ = solutionStreamMap.get(qNodeID);
			streamQ.setMaxMatchSize(initMaxSize);
			for (ActivityNode procNode : vertexSetProcess) {
				if(nodesCompare.compare(queryNode, procNode) == 0){
					tempArrayPos = processgraph.getArrayIndexOfProcessNode(procNode);
					if (tempArrayPos == -1) {
						logger.warn("There is no corresponding process node: " + 
								procNode.toString() + " in the nodes array of the process graph.");
					}
					streamElement = new StreamItem(procNode, tempArrayPos, initMaxSize, null);
					streamQ.getStreamList().add(streamElement);
					thresholdOfNumberOfMaxMatch++;
				}
			}
			if (streamQ.getStreamList().isEmpty()) {
				if (!isStructuredOnly) {
					streamQ.setMaxMatchSize(0.0f);
				}
			} else {
				numberOfMatchQNodes++;
			}
		}
		
		if (thresholdOfNumberOfMaxMatch > vertexSetProcess.size()) {
			thresholdOfNumberOfMaxMatch = vertexSetProcess.size();
		}		
		
		for (ActivityNode qNode : vertexSetQuery) {
			qNodeID = qNode.getActivityID();
			querygraph.getChildren(qNode, qchildren);			
			if (!qchildren.isEmpty()) {			
				seList = solutionStreamMap.get(qNodeID).getStreamList();
				for (ActivityNode cNode : qchildren) {
					hasMatchQEdge = false;
					seCList  = solutionStreamMap.get(cNode.getActivityID()).getStreamList();
					for (StreamItem se : seList) {
						pPos = se.getArrayIndexOfProcessnode();
						for (StreamItem sec : seCList) {
							cPos = sec.getArrayIndexOfProcessnode();
							if (processgraph.isReachable(pPos, cPos)) {
								se.addChild(sec, cNode);
								hasMatchQEdge = true;
							}													
						}
					}
					if (hasMatchQEdge) {
						numberOfDiscreteMatchQEdges++;
					}
				}
			}
		}
					
		// compute value for the attribute maxNumberOfAssignments of solution stream
		for (ActivityNode qNode : vertexSetQuery) {
			qNodeID = qNode.getActivityID();
			if (querygraph.isRoot(qNode)) {
				solutionStreamMap.get(qNodeID).setMaxNumberOfAssignments(thresholdOfNumberOfMaxMatch);
			} else if (querygraph.isLeaf(qNode)) {
				tempMaxNumberOfAssigns = solutionStreamMap.get(qNodeID).getStreamList().size();
				solutionStreamMap.get(qNodeID).setMaxNumberOfAssignments(tempMaxNumberOfAssigns);
			} else {
				tempMaxNumberOfAssigns = 0;
				qSubGraphIDs = querygraph.getSubgraphNodesIDsFromMap(qNode);
				for (String qSubNodeID : qSubGraphIDs) {
						tempMaxNumberOfAssigns += solutionStreamMap.get(qSubNodeID).getStreamList().size();
				}
				solutionStreamMap.get(qNodeID).setMaxNumberOfAssignments(tempMaxNumberOfAssigns);	
			}		
		}	
		// ********* For Debugg *********
//		logger.warn("Output solution streams: ");
//		for (ActivityNode qNode : vertexSetQuery) {
//			logger.warn(qNode.toString() + " " + solutionStreamMap.get(qNode.getActivityID()).toString());
//		}
//		logger.warn("numberOfDiscreteMatchQEdges: " + numberOfDiscreteMatchQEdges);
	}
	
	/**
	 * Lets the static containers be empty. 
	 * 
	 */
	public void clearStaticVariables() {
		SolutionStream streamQ;
		Set<ActivityNode> vertexSetQuery = querygraph.getGraph().vertexSet();
		for (ActivityNode queryNode : vertexSetQuery) {
			streamQ = solutionStreamMap.get(queryNode.getActivityID());
			if (!streamQ.getStreamList().isEmpty()) {
				streamQ.getStreamList().clear();
			}
		}
		if (!maxAssignListMap.isEmpty()) {
			maxAssignListMap.clear();
		}
		if (!tempMaxAssignListMap.isEmpty()) {
			tempMaxAssignListMap.clear();
		}		
	} 
	
	
	/**
	 * Compute maximal level-i matchings and the number of edges of each of 
	 * these maximal matchings for all stream elements associated with the 
	 * given query tree.
	 * 
	 */
	public void computeMaxAssignForTreeNodes() {
		int i, j, oldListLength, qNodesSize;
		float maxSizePx;
		ActivityNode qi, px, pcm;
		SolutionStream solutionStreamQi;
		List<StreamItem> streamListQi;
		Assignment upx, upxupcm;
		String qiID, qipxID, qcpcmID, debuggerString;
		List<Assignment> tempMaxAssList, tempMaxAssignListQcPcm, maxAssignListQi;
		Set<String> qcSubtreeNodesIDs;
		qNodesSize = querygraph.getQueryNodesSortedByLevelOrder().size();
	
		// query nodes are processed in bottom-up order (from leaf to root)
		for (i = (qNodesSize - 1); i >= 0; i--) {
			qi = querygraph.getQueryNodesSortedByLevelOrder().get(i);
			qiID = qi.getActivityID();
			solutionStreamQi = solutionStreamMap.get(qiID);
			streamListQi = solutionStreamQi.getStreamList();
			if (!streamListQi.isEmpty()) {
				maxAssignListQi = new ArrayList<Assignment>();
				maxAssignListMap.put(qiID, maxAssignListQi);
				if (querygraph.isLeaf(qi)) {
					for (StreamItem seqi : streamListQi) {
						px = seqi.getProcessnode();
						upx = new Assignment();
						upx.addAssign(qi, px);
						if (isStructuredOnly) {
							seqi.setMaxMatchSize(0.0f);
						} else {
							upx.setAssignSize(discreteFactor);
							upx.setNumberOfAssignedQueryNodes(1);
							seqi.setMaxMatchSize(discreteFactor);
						}
						qipxID = "q" + qi.getActivityID() + "p" + px.getActivityID();
						tempMaxAssList = new ArrayList<Assignment>();
						tempMaxAssList.add(upx);
						tempMaxAssignListMap.put(qipxID, tempMaxAssList);
						maxAssignListQi.add(upx);
					}
				} else {
					querygraph.getChildren(qi, qchildren);
					for (StreamItem seqi : streamListQi) {
						px = seqi.getProcessnode();
						upx = new Assignment();
						// the start assign
						upx.addAssign(qi, px);
						// Count the number of edges of the maximal assignment, whose start assign is [qi / px]					
						if (isStructuredOnly) {
							maxSizePx = 0.0f;
						} else {
							maxSizePx = discreteFactor;
//							upx.setAssignSize(maxSizePx);
						}
						qipxID = "q" + qi.getActivityID() + "p" + px.getActivityID();
						tempMaxAssList = new ArrayList<Assignment>();
						tempMaxAssList.add(upx);
						tempMaxAssignListMap.put(qipxID, tempMaxAssList);
						// iterate through children nodes to calculate assignments for qi through combine
						// children assignments
						for (ActivityNode qc : qchildren) {	
							seqi.getMaxReferencedStreamItems(qc, seQcMaxList);
							// seQcMaxList is a list of stream elements referenced by seqi.childrenRefMap.get(qc), 
							// each of these stream elements has a maximal value m for attribute “maxMatchSize” 
							// among all referenced stream elements in seqi.childrenRefMap.get(qc)
							if (seQcMaxList.isEmpty()) { // No references to any stream elements stored in solution stream of qc
								// Expand each assignment with undefined for each query node in qc’s substree, replace
								// the old assignment with the expanded one.
								qcSubtreeNodesIDs = querygraph.getSubgraphNodesIDsFromMap(qc);														
								// for (Assignment ass : tempMaxAssignListMap.get(qipxID)) {
								for (Assignment ass : tempMaxAssList) {
									ass.addAssignsByQueryNodesIDs(qcSubtreeNodesIDs);
								}	
							} else {
								oldListLength = tempMaxAssList.size();
								if (isStructuredOnly) {
									maxSizePx += seQcMaxList.get(0).getMaxMatchSize() + 1.0f;
								} else {
									maxSizePx += seQcMaxList.get(0).getMaxMatchSize() + structuredFactor;
								}				
								for (j = 0; j < oldListLength; j++) {
									upx = tempMaxAssList.get(j);
									for (StreamItem seQcMax : seQcMaxList) {
										pcm = seQcMax.getProcessnode();
										qcpcmID = "q" + qc.getActivityID() + "p" + pcm.getActivityID();
										tempMaxAssignListQcPcm = tempMaxAssignListMap.get(qcpcmID);
										for (Assignment upcm : tempMaxAssignListQcPcm) {
											upxupcm = new Assignment();
											upxupcm.addAssignment(upx);
											upxupcm.addAssignment(upcm);
											upxupcm.setAssignSize(maxSizePx);
											tempMaxAssList.add(upxupcm);
										}
									}	
								}
								
								for (j = 0; j < oldListLength; j++) {
									tempMaxAssList.remove(0);
								}		
								if (tempMaxAssList.size() > solutionStreamQi.getMaxNumberOfAssignments()) {
//									logger.warn("call reduce assignments");
									reduceAssignments(tempMaxAssList, allProcNodesIds, allProcessedProcNodesIds);
								}
							}
						}
						// maximal assignments with start assign [qi / px], where px = seqi.processNode 
						// have been computed
						seqi.setMaxMatchSize(maxSizePx);
						
						// maximal assignments with start assign [qi / px] is larger than the existing maximal 
						// assignments for qi 
						if (solutionStreamQi.getMaxMatchSize() < maxSizePx) {
							solutionStreamQi.setMaxMatchSize(maxSizePx);
							maxAssignListQi.clear();
							maxAssignListQi.addAll(tempMaxAssList);
						} else if (solutionStreamQi.getMaxMatchSize() == maxSizePx) {
							maxAssignListQi.addAll(tempMaxAssList);
						}					
//						debuggerString = "tempMaxAssList[" + "q: " + qi.getActivityID() + "  p: " + px.getActivityID() 
//										+ "] with size " + tempMaxAssList.size() + " = ";
//						for (Assignment uqi : tempMaxAssList) {
//							debuggerString += uqi.toString();
//						}
//						logger.warn(debuggerString);
					}
					
					if (maxAssignListQi.size() > solutionStreamQi.getMaxNumberOfAssignments()) {
//						logger.warn("call reduce assignments");
						reduceAssignments(maxAssignListQi, allProcNodesIds, allProcessedProcNodesIds);
					}
					
					for (Assignment uqi : maxAssignListQi) {
						uqi.setAssignSize(solutionStreamQi.getMaxMatchSize());
					}
					if (!isStructuredOnly) {
						for (Assignment uqi : maxAssignListQi) {
							uqi.computeNumberOfAssignedQueryNodes();
						}
					}
				}			
				// ******** For Debug ********
//				debuggerString = "maxAssignListQi[" + qi.toString() + "] with size " + maxAssignListQi.size() + " = ";
//				for (Assignment uqi : maxAssignListQi) {
//					debuggerString += uqi.toString();
//				}
//				logger.warn(debuggerString);
			}
		}
	}

	
	/**
	 * Finds maximal matchings between the query tree and the process graph as combinations of 
	 * maximal level-i assignments. The results are stored in attribute <code> maxMatchingList 
	 * </code>.
	 * 
	 */
	public void maxMatchsOfQueryTree() {
		ActivityNode qi;
		String qiID, qiParentID, qjID, umqiPID;
		List<Assignment> assMmaxList, maxAssListQi, newmaxAssList;
		Set<String> subTreeNodesIDsQi;
		Assignment um2, umqi;
		int qNodesSize, numberOfQueryEdges, maxNumOfAssQNodes, totalNumOfAssQNodes, qiNumOfAssQNodes, um2NumOfAssQNodes, umNumOfAssQNodes;
		float maxSimilarity, denominatorOfSim, maxAssignSize, maxMatchSizeQi, sizeUm1, sizeUm2, newMatchSimilarity, tempNewMatchSize;
		boolean isMaxUm1, isEmptyMaxMatchingList, maxMatchingListChanged;
		SolutionStream solutionStreamQi;
		// Store all maximal level-1 assignments in maxMatchList, which is a set used to store maximal matchings
		List<Match> maxMatchList = new ArrayList<Match>();
		List<Match> tempMaxMatchList;
		Match newMatch;
		
		// logger.warn("call max matchs of query tree");	
		maxSimilarity = 0.0f;
		numberOfQueryEdges = querygraph.getNumberOfEdges();
		qNodesSize = querygraph.getQueryNodesSortedByLevelOrder().size();
		tempMaxMatchList = new ArrayList<Match>();
		denominatorOfSim = structuredFactor*((float)numberOfQueryEdges) + discreteFactor*((float)qNodesSize);
		isEmptyMaxMatchingList = true;
		qiNumOfAssQNodes = 0;
		um2NumOfAssQNodes = 0;
		// iterate through query tree nodes
		for (int i = 0; i < qNodesSize; i++) {
			qi = querygraph.getQueryNodesSortedByLevelOrder().get(i);
			qiID = qi.getActivityID();
			solutionStreamQi = solutionStreamMap.get(qiID);
			maxAssListQi = maxAssignListMap.get(qiID);
			// Store the first not empty MaxAssignList[qi] in maxMatchingList
			if (isEmptyMaxMatchingList && (maxAssListQi != null) && (!maxAssListQi.isEmpty())) {
				if (isStructuredOnly) {
					maxSimilarity = (solutionStreamQi.getMaxMatchSize())/((float)numberOfQueryEdges);
				} else {
					maxSimilarity = (solutionStreamQi.getMaxMatchSize())/denominatorOfSim;
				}		
				isEmptyMaxMatchingList = false;
				if (querygraph.isRoot(qi)) {
					for (Assignment ass : maxAssListQi) {
						maxMatchList.add(new Match(maxSimilarity, ass));
					}
				} else {
					if (!subTreeNodesIDsQiComplement.isEmpty()) {
						subTreeNodesIDsQiComplement.clear();
					}
					subTreeNodesIDsQi = querygraph.getSubgraphNodesIDsFromMap(qi);
					for (int j = 0; j < qNodesSize; j++) {
						qjID = querygraph.getQueryNodesSortedByLevelOrder().get(j).getActivityID();
						if (!subTreeNodesIDsQi.contains(qjID)) {
							subTreeNodesIDsQiComplement.add(qjID);
						}
					}
					for (Assignment ass : maxAssListQi) {
						ass.addAssignsByQueryNodesIDs(subTreeNodesIDsQiComplement);
						maxMatchList.add(new Match(maxSimilarity, ass));
					}
				}
			} else if ((maxAssListQi != null) && (!maxAssListQi.isEmpty())) {
				qiParentID = querygraph.getParent(qi).getActivityID();
				subTreeNodesIDsQi = querygraph.getSubgraphNodesIDsFromMap(qi);
				tempMaxMatchList.clear();
				tempMaxMatchList.addAll(maxMatchList);
				maxMatchSizeQi = solutionStreamQi.getMaxMatchSize();	
				maxMatchingListChanged = false;
				for (Match mmax : maxMatchList) {
					assMmaxList = mmax.getAssignments();
					tempNewMatchSize = 0.0f;
					maxAssignSize = 0.0f;
					isMaxUm1 = false;
					umqi = null;
					sizeUm2 = 0.0f;
					maxNumOfAssQNodes = 0;
					totalNumOfAssQNodes = 0;
					for (Assignment um : assMmaxList) {
						// If parent node of qi is one of the query nodes assigned by um, 
						// then we try to combine um with maximal assignments for qi stored 
						// in MaxAssignSet[qi].
						if (um.containQueryNode(qiParentID)) {
							umqiPID = um.getProcessNodeID(qiID);
							if (umqiPID == null) {
								sizeUm1 = 0.0f;
							} else {
								sizeUm1 = solutionStreamQi.getMaxMatchSizeOfStreamItem(umqiPID);	
							}
			
							if (sizeUm1 < maxMatchSizeQi) {
								if (umqiPID == null) {
									sizeUm2 = um.getAssignSize() - sizeUm1;
								} else {
									if (isStructuredOnly) {
										sizeUm2 = um.getAssignSize() - sizeUm1 - 1.0f;
									} else {
										sizeUm2 = um.getAssignSize() - sizeUm1 - structuredFactor;
									}
								}
								
								if (maxMatchSizeQi >= sizeUm2) {
									if (maxMatchSizeQi > maxAssignSize) {
										maxAssignSize = maxMatchSizeQi;
									}
								} else {
									if (sizeUm2 > maxAssignSize) {
										maxAssignSize = sizeUm2;
									}
								}
								umqi = um;							
								tempNewMatchSize += (maxMatchSizeQi + sizeUm2);
								
								if (!isStructuredOnly) {
									qiNumOfAssQNodes = maxAssListQi.get(0).getNumberOfAssignedQueryNodes();
									um2NumOfAssQNodes = um.getNumberOfComplementAssignedQueryNodes(subTreeNodesIDsQi);
									if (qiNumOfAssQNodes >= um2NumOfAssQNodes) {
										if (qiNumOfAssQNodes > maxNumOfAssQNodes) {
											maxNumOfAssQNodes = qiNumOfAssQNodes;
										}
									} else {
										if (um2NumOfAssQNodes > maxNumOfAssQNodes) {
											maxNumOfAssQNodes = um2NumOfAssQNodes;
										}
									}
									totalNumOfAssQNodes += (qiNumOfAssQNodes + um2NumOfAssQNodes);
								}							
							} else {
								isMaxUm1 = true;
								break;
							}
						} else {	
							if (um.getAssignSize() > maxAssignSize) {
								maxAssignSize = um.getAssignSize();
							}
							tempNewMatchSize += um.getAssignSize();
							if (!isStructuredOnly) {
								umNumOfAssQNodes = um.getNumberOfAssignedQueryNodes();
								if (umNumOfAssQNodes > maxNumOfAssQNodes) {
									maxNumOfAssQNodes = umNumOfAssQNodes;
								}
								totalNumOfAssQNodes += umNumOfAssQNodes;
							}
						}
					}
						
					if ((!isMaxUm1) && (umqi != null)) {
						if (isStructuredOnly) {
							newMatchSimilarity = (maxAssignSize + connectivityFactor * (tempNewMatchSize - maxAssignSize))/numberOfQueryEdges;
						} else {						
							newMatchSimilarity = (maxAssignSize + connectivityFactor * ((tempNewMatchSize - discreteFactor * 
									((float)totalNumOfAssQNodes))- (maxAssignSize - discreteFactor * ((float)maxNumOfAssQNodes))) 
									+ discreteFactor*((float)(totalNumOfAssQNodes - maxNumOfAssQNodes)))/denominatorOfSim;
						}
						if (newMatchSimilarity > maxSimilarity) {
							maxSimilarity = newMatchSimilarity;
							tempMaxMatchList.clear();
						}
						if (newMatchSimilarity >= maxSimilarity) {
							um2 = umqi.getRestPartOfAssignmentByQueryNodesIDs(subTreeNodesIDsQi, sizeUm2);
							if (!isStructuredOnly) {
								um2.setNumberOfAssignedQueryNodes(um2NumOfAssQNodes);
							}
							for (Assignment maxAssQi : maxAssListQi) {
								newmaxAssList = new ArrayList<Assignment>();
								newmaxAssList.add(um2);
								for (Assignment assMmax : assMmaxList) {
									if (!assMmax.equals(umqi)) {
										newmaxAssList.add(assMmax);
									}
								}
								newmaxAssList.add(maxAssQi);
								newMatch = new Match(newMatchSimilarity, newmaxAssList);
								tempMaxMatchList.add(newMatch);
							}
							maxMatchingListChanged = true;
						}
					}
				}
				
				if (maxMatchingListChanged) {
					if (tempMaxMatchList.size() > thresholdOfNumberOfMaxMatch) {
//						logger.warn("call reduce matchings");
						reduceMatchings(tempMaxMatchList, allProcNodesIds, allProcessedProcNodesIds, pIDsInMatch);		
					}
					maxMatchList.clear();
					maxMatchList.addAll(tempMaxMatchList);
				}
			}
		}
		
		if (maxSimilarity >= minMatchingSimilarity) {
			// optional step
			if (maxMatchList.size() > 1) {
//				logger.warn("call reduce matchings at final step");
				reduceMatchings(maxMatchList, allProcNodesIds, allProcessedProcNodesIds, pIDsInMatch);
			}
			inexactMatchings = new InexactMatchingResult(processgraph.getProcessID(), 
					processgraph.getProcessNamespace(), processgraph.getProcessName(), 
					maxMatchList, maxSimilarity);
//			printSolutions();
		}
	}
	
	
	/**
	 * Compute maximal level-i matchings and the number of edges of each of 
	 * these maximal matchings for all stream elements associated with the 
	 * given query graph.
	 * 
	 */
	public void computeMaxAssignForDAGNodes() {
		int qNodesSize, i, j, k, l, tempPos, oldListLength, tempListLength, numberOfCrossEdges;
		float seqiQcMaxRefSize, maxSizePx, maxPartialAssignSize, upcm1Size, newAssigSize;
		ActivityNode qi, px, pcm;
		SolutionStream solutionStreamQi;
		List<StreamItem> streamListQi;
		Assignment upx, upxupcm, upcm1;
		String qiID, qipxID, qcpcmID, debuggerString;
		List<Assignment> tempMaxAssignsQiPx, tempMaxAssignListQcPcm, maxAssignListQi;
		Set<String> qcSubgraphNodesIDs;
		qNodesSize = querygraph.getQueryNodesSortedByLevelOrder().size();
	
		for (i = (qNodesSize - 1); i >= 0; i--) {
			qi = querygraph.getQueryNodesSortedByLevelOrder().get(i);
			qiID = qi.getActivityID();
			solutionStreamQi = solutionStreamMap.get(qiID);
			streamListQi = solutionStreamQi.getStreamList();
			if (!streamListQi.isEmpty()) {
				maxAssignListQi = new ArrayList<Assignment>();
				maxAssignListMap.put(qiID, maxAssignListQi);
				if (querygraph.isLeaf(qi)) {
					for (StreamItem seqi : streamListQi) {
						px = seqi.getProcessnode();
						upx = new Assignment();
						upx.addAssign(qi, px);
						if (isStructuredOnly) {
							seqi.setMaxMatchSize(0.0f);
						} else {
							seqi.setMaxMatchSize(discreteFactor);
							upx.setAssignSize(discreteFactor);
							upx.setNumberOfAssignedQueryNodes(1);
						}
						qipxID = "q" + qiID + "p" + px.getActivityID();
						tempMaxAssignsQiPx = new ArrayList<Assignment>();
						tempMaxAssignsQiPx.add(upx);
						tempMaxAssignListMap.put(qipxID, tempMaxAssignsQiPx);
						maxAssignListQi.add(upx);			
					}
				} else {				
					querygraph.getChildren(qi, qchildren);					
					for (StreamItem seqi : streamListQi) {
						px = seqi.getProcessnode();
						upx = new Assignment();
						// the start assign
						upx.addAssign(qi, px);
						// Count the number of edges of the maximal assignment, whose start assign is [qi / px]
						if (isStructuredOnly) {
							maxSizePx = 0.0f;
						} else {
							maxSizePx = discreteFactor;
							upx.setAssignSize(discreteFactor);
						}		
						qipxID = "q" + qiID + "p" + px.getActivityID();
						tempMaxAssignsQiPx = new ArrayList<Assignment>();
						tempMaxAssignsQiPx.add(upx);
						tempMaxAssignListMap.put(qipxID, tempMaxAssignsQiPx);
						if (!processedChildrenSubgraphNodesIDs.isEmpty()) {
							processedChildrenSubgraphNodesIDs.clear();	
						}
						// *********** Sort query children ********** 
						if (!qChildrenSorted.isEmpty()) {
							qChildrenSorted.clear();
						}	
						for (k = 0; k < qChildrenMaxRefSize.length; k++) {
							qChildrenMaxRefSize[k] = -2.0f;
						}				
						tempPos = -1;
						for (ActivityNode qc : qchildren) {
							seqiQcMaxRefSize = seqi.getMaxRefSize(qc);
							for (k = 0; k < qChildrenMaxRefSize.length; k++) {
								if (qChildrenMaxRefSize[k] < seqiQcMaxRefSize) {
									qChildrenSorted.add(k, qc);
									break;
								}
							}
							if (tempPos >= 0) {
								for (l = tempPos; l >= k; l--) {
									qChildrenMaxRefSize[l+1] = qChildrenMaxRefSize[l];
								}
							}
							qChildrenMaxRefSize[k] = seqiQcMaxRefSize;
							tempPos++;
						}
						
						// iterate through children nodes to calculate assignments for qi through combine
						// children assignments
						for (ActivityNode qc : qChildrenSorted) {	
							qcSubgraphNodesIDs = querygraph.getSubgraphNodesIDsFromMap(qc);
							// commonNodes are intersection of processed subtree nodes and nodes of subtree rooted at qc
							intersectionOfSets(processedChildrenSubgraphNodesIDs, qcSubgraphNodesIDs, commonNodesIDs);
							processedChildrenSubgraphNodesIDs.addAll(qcSubgraphNodesIDs);		
							seqi.getMaxReferencedStreamItems(qc, seQcMaxList);
							if (seQcMaxList.isEmpty()) { // No references to any stream elements stored in solution stream of qc
								// Expand each assignment with undefined for each query node in qc’s substree, replace
								// the old assignment with the expanded one.
								if (commonNodesIDs.isEmpty()) {								
									for (Assignment ass : tempMaxAssignsQiPx) {
										ass.addAssignsByQueryNodesIDs(qcSubgraphNodesIDs);
									}
								} else {
									if (!querygraph.isLeaf(qc)) {
										differenceOfSets(qcSubgraphNodesIDs, commonNodesIDs, qcSubgraphNodesMinusCommonNodesIDs);
										for (Assignment ass : tempMaxAssignsQiPx) {
											ass.addAssignsByQueryNodesIDs(qcSubgraphNodesMinusCommonNodesIDs);
										}
									}					
								}
							} else {
								// seQcMaxList is a list of stream elements referenced by seqi.childrenRefMap.get(qc), 
								// each of these stream elements has a maximal value m for attribute maxMatchSize 
								// among all referenced stream elements in seqi.childrenRefMap.get(qc)
								// assListQiPx = tempMaxAssignListMap.get(qipxID);
								oldListLength = tempMaxAssignsQiPx.size();
								if (commonNodesIDs.isEmpty()) {
									if (isStructuredOnly) {
										maxSizePx = maxSizePx + seQcMaxList.get(0).getMaxMatchSize() + 1.0f;
									} else {
										maxSizePx = maxSizePx + seQcMaxList.get(0).getMaxMatchSize() + structuredFactor;
									}
									for (j = 0; j < oldListLength; j++) {
										upx = tempMaxAssignsQiPx.get(j);
										for (StreamItem seQcMax : seQcMaxList) {
											pcm = seQcMax.getProcessnode();
											qcpcmID = "q" + qc.getActivityID() + "p" + pcm.getActivityID();
											tempMaxAssignListQcPcm = tempMaxAssignListMap.get(qcpcmID);
											for (Assignment upcm : tempMaxAssignListQcPcm) {
												upxupcm = new Assignment();
												upxupcm.addAssignment(upx);
												upxupcm.addAssignment(upcm);
												upxupcm.setAssignSize(maxSizePx);
												tempMaxAssignsQiPx.add(upxupcm);
											}
										}	
									}								
								} else {
									// in order to compute the size of upcm1
									differenceOfSets(qcSubgraphNodesIDs, commonNodesIDs, qcSubgraphNodesMinusCommonNodesIDs);
									querygraph.computeNodeIDPairs(qcSubgraphNodesMinusCommonNodesIDs, queryIDPairsForNonCommonNodes);
									querygraph.computeNodeIDPairs(qcSubgraphNodesMinusCommonNodesIDs, commonNodesIDs, queryIDPairsForCrossEdges);
									maxPartialAssignSize = 0.0f;							
									for (j = 0; j < oldListLength; j++) {
										upx = tempMaxAssignsQiPx.get(j);
										for (StreamItem seQcMax : seQcMaxList) {
											pcm = seQcMax.getProcessnode();
											qcpcmID = "q" + qc.getActivityID() + "p" + pcm.getActivityID();
											tempMaxAssignListQcPcm = tempMaxAssignListMap.get(qcpcmID);
											for (Assignment upcm : tempMaxAssignListQcPcm) {				
												// ****** ??? assignsize for upcm1 ???*****
												upcm1 = upcm.getRestPartOfAssignmentByQueryNodesIDs(commonNodesIDs, 0.0f);
												upcm1Size = getAssignmentSize(queryIDPairsForNonCommonNodes, qcSubgraphNodesMinusCommonNodesIDs, upcm1);
												upcm1.setAssignSize(upcm1Size);
												numberOfCrossEdges = getNumberOfCrossMatchEdges(queryIDPairsForCrossEdges, upcm1, upx);
												if (isStructuredOnly) {
													newAssigSize = upcm1Size + ((float)numberOfCrossEdges);
												} else {
													newAssigSize = upcm1Size + structuredFactor*((float)numberOfCrossEdges);
												}
												if (newAssigSize > maxPartialAssignSize) {
													maxPartialAssignSize = newAssigSize;
													upcm1.addAssignment(upx);
													tempListLength = tempMaxAssignsQiPx.size();
													for (k = oldListLength; k < tempListLength; k++) {
														tempMaxAssignsQiPx.remove(oldListLength);
													}
													tempMaxAssignsQiPx.add(upcm1);
												} else if (newAssigSize == maxPartialAssignSize) {
													upcm1.addAssignment(upx);
													tempMaxAssignsQiPx.add(upcm1);
												}
											}
										}
									}
									if (isStructuredOnly) {
										maxSizePx = maxSizePx + maxPartialAssignSize + 1.0f;
									} else {
										maxSizePx = maxSizePx + maxPartialAssignSize + structuredFactor;
									}		
								}
								
								for (j = 0; j < oldListLength; j++) {
									tempMaxAssignsQiPx.remove(0);
								}
								
								if (tempMaxAssignsQiPx.size() > solutionStreamQi.getMaxNumberOfAssignments()) {
//									logger.warn("call reduce assignments");
									reduceAssignments(tempMaxAssignsQiPx, allProcNodesIds, allProcessedProcNodesIds);
								}
							}
						}
						
						// maximal assignments with start assign [qi / px], where px = seqi.processNode 
						// have been computed
						seqi.setMaxMatchSize(maxSizePx);
						// maximal assignments with start assign [qi / px] is larger than the existing maximal 
						// assignments for qi 
						if (solutionStreamQi.getMaxMatchSize() < maxSizePx) {
							solutionStreamQi.setMaxMatchSize(maxSizePx);
							maxAssignListQi.clear();
							maxAssignListQi.addAll(tempMaxAssignsQiPx);
						} else if (solutionStreamQi.getMaxMatchSize() == maxSizePx) {
							maxAssignListQi.addAll(tempMaxAssignsQiPx);
						}
					}
					
					if (maxAssignListQi.size() > solutionStreamQi.getMaxNumberOfAssignments()) {
//						logger.warn("before call reduce assignments maxAssignListQi.size(): " + maxAssignListQi.size() + "  qi: " + qi.toString());
						reduceAssignments(maxAssignListQi, allProcNodesIds, allProcessedProcNodesIds);
//						logger.warn("after call reduce assignments maxAssignListQi.size(): " + maxAssignListQi.size());
					}
					for (Assignment uqi : maxAssignListQi) {
						uqi.setAssignSize(solutionStreamQi.getMaxMatchSize());
					}	
					if (!isStructuredOnly) {
						for (Assignment uqi : maxAssignListQi) {
							uqi.computeNumberOfAssignedQueryNodes();
						}
					}
				}
				
				// ******** For Debug ********
//				debuggerString = "maxAssignListQi[" + qi.toString() + "] with size " + maxAssignListQi.size() + " = ";
//				for (Assignment uqi : maxAssignListQi) {
//					debuggerString += uqi.toString();
//				}
//				logger.warn(debuggerString);
			}
		}
		
//		logger.warn("Output solution streams: ");
//		for (ActivityNode qNode : querygraph.getQueryGraph().vertexSet()) {
//			logger.warn(qNode.toString() + " " + solutionStreamMap.get(qNode.getActivityID()).toString());
//		}
//		logger.warn("numberOfDiscreteMatchQEdges: " + numberOfDiscreteMatchQEdges);
	}
	
	/**
	 * Finds maximal matches between the query graph and the process graph as combinations of 
	 * maximal level-i assignments. The results are stored in attribute <code> maxMatchingList 
	 * </code>.
	 * 
	 */
	public void maxMatchsOfQueryDAG() {
		String rootID, qID, q0ID, urq0PID, qiID, umqiPID;
		int i, j, tempSize, numberOfQueryEdges, qNodesSortedSize,numberOfCrossMatchEdges, assMmaxListLength;
		float matchSizeQ,maxMatchSizeQr, maxMatchSizeQ0, maxMatchSizeQi, maxSimilarity, newMatchSimilarity, 
			tempNewMatchSize, tempNewMatchSize2, urMinusQ0Size, uqr0Size, sizeQiPID, umqi1Size, maxAssignSize, 
			uqi1Size, maxAssignSize2, denominatorOfSim, discretePartU0, discretePartUrU0, 
			structuredPartU0, structuredPartUrU0, discretePartUm, structuredPartUm, discretePartUmqi1, 
			structuredPartUmqi1, maxStructuredPart, totalStructuredPart, totalDiscretePart, maxStructuredPart2, 
			totalStructuredPart2, totalDiscretePart2, uqi1DiscretePart, uqi1StructuredPart;
		List<Match> tempMaxMatchingList, maxMatchingList = new ArrayList<Match>();
		List<Assignment> maxAssListQr, maxAssListQ0, maxAssListQi, assMmaxList, newmaxAssList;
		SolutionStream solutionStreamQ0, solutionStreamQi;
		Set<String> q0SubgraphNIDs, qiSubgraphNIDs;
		Match newMatch;
		Assignment uqr0, urMinusu0, newAssm, umqi, umqi1, uqi1, umj;
		boolean isMaxUmQi, added, maxMatchingListChanged, isUmqi;
		
		List<ActivityNode> qNodesSortedByLevel = querygraph.getQueryNodesSortedByLevelOrder();	
		// qNodesSortedByMatchSize is an array on query nodes except the query root node that meet the 
		// following conditions: the MaxAssignSet[] for each of these query nodes is not empty. Query 
		// nodes are sorted in descending order of the “maxMatchSize”. 
		if (!qNodesSortedByMatchSize.isEmpty()) {
			qNodesSortedByMatchSize.clear();
		}
		qNodesSortedByMatchSize.add(qNodesSortedByLevel.get(1));
		for (i = 2; i < qNodesSortedByLevel.size(); i++) {
			qID = qNodesSortedByLevel.get(i).getActivityID();		
			if ((maxAssignListMap.get(qID) != null) && !maxAssignListMap.get(qID).isEmpty()) {
				matchSizeQ = solutionStreamMap.get(qID).getMaxMatchSize();
				tempSize = qNodesSortedByMatchSize.size();
				added = false;
				for (j = 0; j < tempSize; j++) {
					if (matchSizeQ >= solutionStreamMap.get(qNodesSortedByMatchSize.get(j).
							getActivityID()).getMaxMatchSize()) {
						qNodesSortedByMatchSize.add(j, qNodesSortedByLevel.get(i));
						added = true;
						break;
					}
				}
				if (!added) {
					qNodesSortedByMatchSize.add(qNodesSortedByLevel.get(i));
				}
			}
		}
		
		rootID = querygraph.getStartActivity().getActivityID();
		maxMatchSizeQr = solutionStreamMap.get(rootID).getMaxMatchSize();
		numberOfQueryEdges = querygraph.getGraph().edgeSet().size();
		maxAssListQr = maxAssignListMap.get(rootID);
		denominatorOfSim = structuredFactor*((float)numberOfQueryEdges) + discreteFactor*((float)qNodesSortedByLevel.size());
		
		if (maxMatchSizeQr <= 0.0f) {
			maxSimilarity = 0.0f;
		} else {
			if (isStructuredOnly) {
				maxSimilarity = (maxMatchSizeQr / ((float)numberOfQueryEdges));
			} else {
				maxSimilarity = (maxMatchSizeQr / denominatorOfSim);
			}	
		}
		
		// Combine maximal level-i assignments for query subgraph rooted at q0 with maximal level-1 
		// assignments, if any
		if ((qNodesSortedSize = qNodesSortedByMatchSize.size()) == 0) {
			if ((maxAssListQr != null) && (maxSimilarity >= minMatchingSimilarity)) {
				for (Assignment ass : maxAssListQr) {
					maxMatchingList.add(new Match(maxSimilarity, ass));
				}
			}
		} else { 	// there is at least one node whose MaxAssignList is not empty
			q0ID = qNodesSortedByMatchSize.get(0).getActivityID();
			solutionStreamQ0 = solutionStreamMap.get(q0ID);
			maxMatchSizeQ0 = solutionStreamQ0.getMaxMatchSize();
			maxAssListQ0 = maxAssignListMap.get(q0ID);			
			if (!qiSubgraphNIDsComplement.isEmpty()) {
				qiSubgraphNIDsComplement.clear();
			}
			q0SubgraphNIDs = querygraph.getSubgraphNodesIDsFromMap(qNodesSortedByMatchSize.get(0));			
			for (ActivityNode qNode : qNodesSortedByLevel) {
				if (!q0SubgraphNIDs.contains(qNode.getActivityID())) {
					qiSubgraphNIDsComplement.add(qNode.getActivityID());
				}
			}		
			if ((maxAssListQr == null) || maxAssListQr.isEmpty()) {
				if (isStructuredOnly) {
					maxSimilarity = maxMatchSizeQ0 / ((float)numberOfQueryEdges);
				} else {
					maxSimilarity = maxMatchSizeQ0 / denominatorOfSim;
				}
				for (Assignment ass : maxAssListQ0) {
					newMatch = new Match(maxSimilarity, ass);
					newAssm = new Assignment();
					newAssm.addAssignsByQueryNodesIDs(qiSubgraphNIDsComplement);
					newMatch.addAssignment(newAssm);
					maxMatchingList.add(newMatch);
				}	
			} else {
				for (Assignment ass : maxAssListQr) {
					maxMatchingList.add(new Match(maxSimilarity, ass));
				}
				querygraph.computeNodeIDPairs(qiSubgraphNIDsComplement, queryIDPairsForNonCommonNodes);
				querygraph.computeNodeIDPairs(qiSubgraphNIDsComplement, q0SubgraphNIDs, queryIDPairsForCrossEdges);
				structuredPartU0 = 0.0f;
				structuredPartUrU0 = 0.0f;
				discretePartUrU0 = 0.0f;
				discretePartU0 = 0.0f;
				for (Assignment ur : maxAssListQr) {
					if (((urq0PID = ur.getProcessNodeID(q0ID)) == null) || ((solutionStreamQ0.
							getStreamItem(urq0PID).getMaxMatchSize()) < maxMatchSizeQ0)) {			
						//********* Compute |ur minus subgraphNodes(q0)| *************	
						urMinusu0 = ur.getRestPartOfAssignmentByQueryNodesIDs(q0SubgraphNIDs, 0.0f);
						if (!isStructuredOnly) {
							discretePartUrU0 = discreteFactor*(urMinusu0.computeNumberOfAssignedQueryNodes());
						}
						urMinusQ0Size = getAssignmentSize(queryIDPairsForNonCommonNodes, discretePartUrU0, urMinusu0);
						urMinusu0.setAssignSize(urMinusQ0Size);
						if (!isStructuredOnly) {
							structuredPartUrU0 = urMinusQ0Size - discretePartUrU0;
						}
						for (Assignment u0 : maxAssListQ0) {
							if (!isStructuredOnly) {
								discretePartU0 = discreteFactor*(u0.getNumberOfAssignedQueryNodes());
								structuredPartU0 = maxMatchSizeQ0 - discretePartU0;
							}
							numberOfCrossMatchEdges = getNumberOfCrossMatchEdges(queryIDPairsForCrossEdges, ur, u0);
							if (numberOfCrossMatchEdges == 0) {
								if (isStructuredOnly) {
									if (maxMatchSizeQ0 > urMinusQ0Size) {
										newMatchSimilarity = ((maxMatchSizeQ0 + connectivityFactor * 
												urMinusQ0Size)/numberOfQueryEdges);
									} else {
										newMatchSimilarity = ((urMinusQ0Size + connectivityFactor * 
												maxMatchSizeQ0)/numberOfQueryEdges);
									}
								} else {
									if (structuredPartU0 > structuredPartUrU0) {
										newMatchSimilarity = (structuredPartU0 + connectivityFactor * structuredPartUrU0 
												+ discretePartUrU0 + discretePartU0)/denominatorOfSim;
									} else {
										newMatchSimilarity = (structuredPartUrU0 + connectivityFactor * structuredPartU0 
												+ discretePartUrU0 + discretePartU0)/denominatorOfSim;
									}
								}
		
								if (newMatchSimilarity > maxSimilarity) {
									maxSimilarity = newMatchSimilarity;
									maxMatchingList.clear();				
								}	
								if (newMatchSimilarity >= maxSimilarity) {
									newMatch = new Match(maxSimilarity, u0);
									newMatch.addAssignment(urMinusu0);
									maxMatchingList.add(newMatch);
								}
							} else {
								if (isStructuredOnly) {
									uqr0Size = (float)numberOfCrossMatchEdges + maxMatchSizeQ0 + urMinusQ0Size;
									newMatchSimilarity = uqr0Size/numberOfQueryEdges;
								} else {
									uqr0Size = ((float)numberOfCrossMatchEdges)*structuredFactor + maxMatchSizeQ0 + urMinusQ0Size;
									newMatchSimilarity = uqr0Size/denominatorOfSim;
								}
								if (newMatchSimilarity > maxSimilarity) {
									maxSimilarity = newMatchSimilarity;
									maxMatchingList.clear();
								} 
								if (newMatchSimilarity >= maxSimilarity) {
									uqr0 = new Assignment();
									uqr0.addAssignment(urMinusu0);
									uqr0.addAssignment(u0);
									uqr0.setAssignSize(uqr0Size);
									uqr0.computeNumberOfAssignedQueryNodes();
									newMatch = new Match(maxSimilarity, uqr0);
									maxMatchingList.add(newMatch);
								}
							}
						}		
					}
				}
				
				if (maxMatchingList.size() > thresholdOfNumberOfMaxMatch) {
					reduceMatchings(maxMatchingList, allProcNodesIds, allProcessedProcNodesIds, pIDsInMatch);		
				}
			}
			
			if (qNodesSortedSize > 1) {
				tempMaxMatchingList = new ArrayList<Match>();			
				discretePartUmqi1 = 0.0f;
				uqi1StructuredPart = 0.0f;
				uqi1DiscretePart = 0.0f;
				totalStructuredPart2 = 0.0f;
				maxStructuredPart2 = 0.0f;
				totalDiscretePart2 = 0.0f;
				umqi1Size = 0.0f;
				for (i = 1; i < qNodesSortedSize; i++) {
					qiID = qNodesSortedByMatchSize.get(i).getActivityID();
					qiSubgraphNIDs = querygraph.getSubgraphNodesIDsFromMap(qNodesSortedByLevel.get(i));
					tempMaxMatchingList.clear();
					tempMaxMatchingList.addAll(maxMatchingList);
					solutionStreamQi = solutionStreamMap.get(qiID);
					maxMatchSizeQi = solutionStreamQi.getMaxMatchSize();
					maxAssListQi = maxAssignListMap.get(qiID);
					maxMatchingListChanged = false;
					for (Match mmax : maxMatchingList) {
						assMmaxList = mmax.getAssignments();
						assMmaxListLength = assMmaxList.size();
						tempNewMatchSize = 0.0f;
						maxAssignSize = 0.0f;			
						umqi = null;
						totalDiscretePart = 0.0f;
						totalStructuredPart = 0.0f;
						maxStructuredPart = 0.0f;
						isMaxUmQi = false;
						for (Assignment um : assMmaxList) {
							if (um.containQueryNode(qiID)) {
								umqiPID = um.getProcessNodeID(qiID);
								if (umqiPID == null) {
									sizeQiPID = -1.0f;
								} else {
									sizeQiPID = solutionStreamQi.getMaxMatchSizeOfStreamItem(umqiPID);	
								}
								if (sizeQiPID < maxMatchSizeQi) {								
									um.getQueryNodesIDs(umQIDs);
									intersectionOfSets(umQIDs, qiSubgraphNIDs, commonNodesIDs);
									differenceOfSets(umQIDs, qiSubgraphNIDs, qiSubgraphNIDsComplement);
									querygraph.computeNodeIDPairs(qiSubgraphNIDsComplement, queryIDPairsForNonCommonNodes);
									umqi1Size = getAssignmentSize(queryIDPairsForNonCommonNodes, qiSubgraphNIDsComplement, um);					
									umqi = um;
									if (!isStructuredOnly) {
										discretePartUmqi1 = discreteFactor * um.getNumberOfAssignedQueryNodes(qiSubgraphNIDsComplement);
										structuredPartUmqi1 = umqi1Size - discretePartUmqi1;
										if (structuredPartUmqi1 > maxStructuredPart) {
											maxStructuredPart = structuredPartUmqi1;
										}
										totalDiscretePart += discretePartUmqi1;
										totalStructuredPart += structuredPartUmqi1;
									}
									if (umqi1Size > maxAssignSize) {
										maxAssignSize = umqi1Size;
									}
									tempNewMatchSize += umqi1Size;
								} else {
									isMaxUmQi = true;
									break;
								}
							} else {
								if (!isStructuredOnly) {
									discretePartUm = discreteFactor * um.getNumberOfAssignedQueryNodes();
									structuredPartUm = um.getAssignSize() - discretePartUm;
									if (structuredPartUm > maxStructuredPart) {
										maxStructuredPart = structuredPartUm;
									}
									totalDiscretePart += discretePartUm;
									totalStructuredPart += structuredPartUm;
								}
								if (um.getAssignSize() > maxAssignSize) {
									maxAssignSize = um.getAssignSize();
								}
								tempNewMatchSize += um.getAssignSize();
							}
						}
						
						if ((umqi != null) && (!isMaxUmQi)) {
							querygraph.computeNodeIDPairs(commonNodesIDs, queryIDPairsForNonCommonNodes);
							for (Assignment uqi : maxAssListQi) {					
								uqi1Size = getAssignmentSize(queryIDPairsForNonCommonNodes, commonNodesIDs, uqi);
								tempNewMatchSize2 = tempNewMatchSize + uqi1Size;
								maxAssignSize2 = maxAssignSize;
								if (!isStructuredOnly) {
									uqi1DiscretePart = discreteFactor * ((float)uqi.getNumberOfAssignedQueryNodes(commonNodesIDs));
									uqi1StructuredPart = uqi1Size - uqi1DiscretePart;
									totalDiscretePart2 = totalDiscretePart + uqi1DiscretePart;
									maxStructuredPart2 = maxStructuredPart;
									totalStructuredPart2 = totalStructuredPart + uqi1StructuredPart;
								}
								for (j = 0; j < assMmaxListLength; j++) {
									umj = assMmaxList.get(j);
									if (umj.equals(umqi)) {
										isUmqi = true;
									} else {
										isUmqi = false;
									}
									if (isUmqi) {
										querygraph.computeNodeIDPairs(qiSubgraphNIDsComplement, commonNodesIDs, queryIDPairsForCrossEdges);
										numberOfCrossMatchEdges = getNumberOfCrossMatchEdges(queryIDPairsForCrossEdges, umj, uqi);
										querygraph.computeNodeIDPairs(commonNodesIDs, qiSubgraphNIDsComplement, queryIDPairsForCrossEdges);
										numberOfCrossMatchEdges += getNumberOfCrossMatchEdges(queryIDPairsForCrossEdges, uqi, umj);
									} else {
										umj.getQueryNodesIDs(umjQIDs);
										querygraph.computeNodeIDPairs(umjQIDs, commonNodesIDs, queryIDPairsForCrossEdges);
										numberOfCrossMatchEdges = getNumberOfCrossMatchEdges(queryIDPairsForCrossEdges, umj, uqi);
										querygraph.computeNodeIDPairs(commonNodesIDs, umjQIDs, queryIDPairsForCrossEdges);
										numberOfCrossMatchEdges += getNumberOfCrossMatchEdges(queryIDPairsForCrossEdges, uqi, umj);
									}
									
									if (numberOfCrossMatchEdges > 0) {
										isCombined[j] = true;
										if (isStructuredOnly) {
											tempNewMatchSize2 += ((float)numberOfCrossMatchEdges);
											if (isUmqi) {
												uqi1Size += (umqi1Size + (float)numberOfCrossMatchEdges);
											} else {
												uqi1Size += (umj.getAssignSize() + (float)numberOfCrossMatchEdges);
											}
										} else {
											tempNewMatchSize2 += structuredFactor * ((float)numberOfCrossMatchEdges);
											totalStructuredPart2 += structuredFactor * ((float)numberOfCrossMatchEdges);
											if (isUmqi) {
												uqi1Size += (umqi1Size + structuredFactor * ((float)numberOfCrossMatchEdges));
												uqi1DiscretePart +=  discretePartUmqi1;
											} else {
												uqi1Size += (umj.getAssignSize() + structuredFactor * ((float)numberOfCrossMatchEdges));
												uqi1DiscretePart += discreteFactor * ((float)umj.getNumberOfAssignedQueryNodes());
											}
										}
									} else {
										isCombined[j] = false;
									}	
								}
								if (uqi1Size > maxAssignSize2) {
									maxAssignSize2 = uqi1Size;
								}
								if (isStructuredOnly) {
									newMatchSimilarity = ((maxAssignSize2 + connectivityFactor * (tempNewMatchSize2 - maxAssignSize2))/numberOfQueryEdges);
								} else {
									uqi1StructuredPart = uqi1Size - uqi1DiscretePart;
									if (uqi1StructuredPart > maxStructuredPart2) {
										maxStructuredPart2 = uqi1StructuredPart;
									}
									newMatchSimilarity = (maxStructuredPart2 + connectivityFactor * (totalStructuredPart2 - maxStructuredPart2)
											+ totalDiscretePart2)/denominatorOfSim;
								}
								if (newMatchSimilarity > maxSimilarity) {
									maxSimilarity = newMatchSimilarity;
									tempMaxMatchingList.clear();
								} 								
								if (newMatchSimilarity >= maxSimilarity) {
									umqi1 = umqi.getRestPartOfAssignmentByQueryNodesIDs(commonNodesIDs, umqi1Size);
									umqi1.computeNumberOfAssignedQueryNodes();
									uqi1 = uqi.getPartOfAssignmentByQueryNodesIDs(commonNodesIDs, uqi1Size);
									newmaxAssList = new ArrayList<Assignment>();
									for (j = 0; j < assMmaxListLength; j++) {
										umj = assMmaxList.get(j);
										if (umj.equals(umqi)) {
											if (isCombined[j]) {
												uqi1.addAssignment(umqi1);
											} else {
												newmaxAssList.add(umqi1);
											}
										} else {
											if (isCombined[j]) {
												uqi1.addAssignment(umj);
											} else {
												newmaxAssList.add(umj);
											}
										}
									}
									uqi1.computeNumberOfAssignedQueryNodes();
									newmaxAssList.add(uqi1);
									newMatch = new Match(newMatchSimilarity, newmaxAssList);
									tempMaxMatchingList.add(newMatch);
									maxMatchingListChanged = true;
								}				
							}					
						}		
					}				
					if (maxMatchingListChanged) {
						if (tempMaxMatchingList.size() > thresholdOfNumberOfMaxMatch) {
//							logger.warn("call reduce matchings");
							reduceMatchings(tempMaxMatchingList, allProcNodesIds, allProcessedProcNodesIds, pIDsInMatch);		
						}
						maxMatchingList.clear();
						maxMatchingList.addAll(tempMaxMatchingList);
					}
				}
			}
		}
		
		if (maxSimilarity >= minMatchingSimilarity) {
			// optional step
			if (maxMatchingList.size() > 1) {
//				logger.warn("call reduce matchings at final step");
				reduceMatchings(maxMatchingList, allProcNodesIds, allProcessedProcNodesIds, pIDsInMatch);
			}
			inexactMatchings = new InexactMatchingResult(processgraph.getProcessID(), 
					processgraph.getProcessNamespace(), processgraph.getProcessName(), 
					maxMatchingList, maxSimilarity);
//			printSolutions();
		}
	}
	
	/**
	 * Find the minimal number of assignments that cover cover all process nodes included in the parameter 
	 * <code> inoutputAssList </code>. The results is stored in <code> inoutputAssList </code>. All parameters
	 * must not be null.
	 * 
	 * @param inoutputAssList a list of assignments to be reduced
	 * @param pall all process node ids included in the list of assignments (initialized as an empty set)
	 * @param processedProcIDs all processed node ids (initialized as an empty set)
	 * 
	 */
	public void reduceAssignments(List<Assignment> inoutputAssList, Set<String> pall, Set<String> processedProcIDs) {	
		int i, indexCompared, oldListLength, indexU1, indexUi, tempDiff, maxDiff, assLength;
		Assignment assi;
		assLength = inoutputAssList.get(0).getAssigns().size();
		if (!pall.isEmpty()) {
			pall.clear();
		}
		if (!processedProcIDs.isEmpty()) {
			processedProcIDs.clear();
		}
		oldListLength = inoutputAssList.size();
		for (i = 0; i < oldListLength; i++) {
			assi = inoutputAssList.get(i);
			assi.addAllProcessNodeIDs(pall);
		}
		
		// find an assignment u1 whose number of different assigned process nodes is maximal in inoutputList
		maxDiff = -1;
		indexU1 = -1;
		for (i = 0; i < oldListLength; i++) {
			assi = inoutputAssList.get(i);
			if ((tempDiff = assi.getNumberOfDiffProcessNodes()) > maxDiff) {
				maxDiff = tempDiff;
				indexU1 = i;
				if (maxDiff == assLength) {
					break;
				}
			}
		}
		
		if (indexU1 != -1) {
			if (indexU1 > 0) {
				Collections.swap(inoutputAssList, 0, indexU1);
			}
			inoutputAssList.get(0).addAllProcessNodeIDs(processedProcIDs);
			pall.removeAll(processedProcIDs);	
			indexCompared = 0;
			while (!pall.isEmpty()) {	
				indexCompared++;
				if (indexCompared >= oldListLength) {
					break;
				}
				maxDiff = -1;
				indexUi = -1;
				for (i = (indexCompared); i < oldListLength; i++ ) {
					tempDiff = inoutputAssList.get(i).getNumberOfDiffProcessNodes(processedProcIDs);
					if (tempDiff > maxDiff) {
						maxDiff = tempDiff;
						indexUi = i;
						if (maxDiff == assLength) {
							break;
						}
					}
				}		
				if (indexUi != -1) {
					if (indexCompared != indexUi) {
						Collections.swap(inoutputAssList, indexCompared, indexUi);
					}		
					inoutputAssList.get(indexCompared).addAllProcessNodeIDs(processedProcIDs);
					inoutputAssList.get(indexCompared).removeAllProcessNodeIDs(pall);
				}
			}
			
			indexCompared++;
			for (i = indexCompared; i < oldListLength; i++ ) {
				inoutputAssList.remove(indexCompared);			
			}	
		}		
	}
	
	
	/**
	 * Find the minimal number of matchings that cover cover all process nodes included in the parameter 
	 * <code> inoutputMatchList </code>. The results is stored in <code> inoutputMatchList </code>. All 
	 * parameters must not be null.
	 * 
	 * @param inoutputMatchList a list of matchings to be reduced
	 * @param pall all process node ids included in the list of assignments (initialized as an empty set)
	 * @param processedProcIDs all processed node ids (initialized as an empty set)
	 * @param pidsOfMatch a variable used to hold all process ids appeared in Match
	 * 
	 */
	public void reduceMatchings(List<Match> inoutputMatchList, Set<String> pall, Set<String> processedProcIDs, 
			Set<String> pidsOfMatch) {
		int oldListLength = inoutputMatchList.size();
		int i, indexCompared, indexU1,indexUi, tempDiff, maxDiff;
		List<Assignment> assList;
		
		if (!pall.isEmpty()) {
			pall.clear();
		}
		if (!processedProcIDs.isEmpty()) {
			processedProcIDs.clear();
		}
			
		for (Match mac : inoutputMatchList) {
			assList = mac.getAssignments();
			for (Assignment ass : assList) {
				ass.addAllProcessNodeIDs(pall);
			}	
		}
		
		// find two assignments u1, u2 (their indexes in inoutputAssList are indexU1, indexU2) 
		// in AInputList that the number of different assigned process nodes is maximal in inoutputList
		maxDiff = -1;
		indexU1 = -1;
		for (i = 0; i < oldListLength; i++) {
			tempDiff = inoutputMatchList.get(i).getNumberOfDiffProcessNode(pidsOfMatch);
			if (tempDiff > maxDiff) {
				maxDiff = tempDiff;
				indexU1 = i;
			}
		}
		
		if (indexU1 != -1) {
			if (indexU1 > 0) {
				Collections.swap(inoutputMatchList, 0, indexU1);
			}	
			inoutputMatchList.get(0).addAllProcessNodeIDs(processedProcIDs);
			pall.removeAll(processedProcIDs);
			
			indexCompared = 0;
			while (!pall.isEmpty()) {
				indexCompared++;
				if (indexCompared >= oldListLength) {
					break;
				}
				maxDiff = -1;
				indexUi = -1;
				for (i = indexCompared; i < oldListLength; i++ ) {
					tempDiff = inoutputMatchList.get(i).getNumberOfDiffProcessNode(processedProcIDs, pidsOfMatch);
					if (tempDiff > maxDiff) {
						maxDiff = tempDiff;
						indexUi = i;
					}
				}
				
				if (indexUi != -1) {
					Collections.swap(inoutputMatchList, indexCompared, indexUi);
					inoutputMatchList.get(indexCompared).addAllProcessNodeIDs(processedProcIDs);
					inoutputMatchList.get(indexCompared).removeAllProcessNodeIDs(pall);
				}
			}
			
			indexCompared++;
			for (i = indexCompared; i < oldListLength; i++ ) {
				inoutputMatchList.remove(indexCompared);			
			}	
		}		
	}
	
	
    /**
     * Prints the matching results.
     * 
     */
	public void printSolutions(){
		String result;
		List<Match> matchList = inexactMatchings.getMatchings();
		result = "process ID: " + inexactMatchings.getProcessID() + 
		"  process namespace: " + inexactMatchings.getProcessNamespace() + 
		"  process name: " + inexactMatchings.getProcessName() + 
		" matches query with matchingsimilarity " + inexactMatchings.getMatchingSimilarity()
		+ " has " + matchList.size() + " matchings: ";		
		for (Match match : matchList) {
			result += match.toString();
		}
		logger.warn(result);
	}
	
    /**
     * Computes intersection of two input sets.
     * 
     * @param set1 the first input set
     * @param set2 the second input set
     * @param result the intersection of two input sets
     * 
     */
	public void intersectionOfSets(Set<String> set1, Set<String> set2, Set<String> result) {
		if (result == null) {
			result = new HashSet<String>();
		} else if (!result.isEmpty()) {
			result.clear();
		}	
		for (String n1ID : set1) {
			for (String n2ID : set2) {
				if (n1ID.compareTo(n2ID) == 0) {
					result.add(n2ID);
					break;
				}
			}
		}		
	}
	
    /**
     * Computes difference of two input sets.
     * 
     * @param set1 the first input set
     * @param set2 the second input set
     * @param result the difference of two input sets
     * 
     */
	public void differenceOfSets(Set<String> set1, Set<String> set2, Set<String> result) {
		boolean isCommonNode;
		if (result == null) {
			result = new HashSet<String>();
		} else {
			result.clear();
		}		
		for (String n1ID : set1) {
			isCommonNode = false;
			for (String n2ID : set2) {
				if (n1ID.compareTo(n2ID) == 0) {
					isCommonNode = true;
					break;
				}
			}
			if (!isCommonNode) {
				result.add(n1ID);
			}
		}	
	}
	
    /**
     * Gets size of the given assignment.
     * 
     * @param qIDPairsList a list of query id pairs, each query id pair represents a query edge, 
     * 						that should be considered by calculation of matching edges
     * @param qIDSet a set of query ids that should be considered by calculation of matching nodes.
     * 				If it is null, all query nodes in the assignment should be considered.
     * @param u assignment whose size to be computed
     * 
     * @return size of the given assignment
     * 
     */
	private float getAssignmentSize(List<String> qIDPairsList, Set<String> qIDSet, Assignment u) {
		String sourceQID, targetQID, sourcePID, targetPID;
		StreamItem sourceSE, targetSE;
		int uEdgeCount, qIDPairsListHalfLength, uNumOfAssQNodes;
		float assSize;
		uEdgeCount = 0;
		qIDPairsListHalfLength = qIDPairsList.size() / 2;
		for (int k = 0; k < qIDPairsListHalfLength; k++) {
			sourceQID = qIDPairsList.get(k*2);
			targetQID = qIDPairsList.get(k*2 + 1);
			if ((sourceQID != null) && (targetQID != null)) {
				sourcePID = u.getProcessNodeID(sourceQID);
				targetPID = u.getProcessNodeID(targetQID);
				if ((sourcePID != null) && (targetPID != null)) {
					sourceSE = solutionStreamMap.get(sourceQID).getStreamItem(sourcePID);
					targetSE = solutionStreamMap.get(targetQID).getStreamItem(targetPID);
					if ((sourceSE != null) && (targetSE != null)) {
						if (sourceSE.isChild(targetSE)) {
							uEdgeCount++;	
						}	
					}
				}
			}
		}
		
		if (isStructuredOnly) {
			assSize = (float)uEdgeCount;
		} else {
			if ((qIDSet == null) || (qIDSet.isEmpty())) {
				uNumOfAssQNodes = u.getNumberOfAssignedQueryNodes();
			} else {
				uNumOfAssQNodes = u.getNumberOfAssignedQueryNodes(qIDSet);
			}
			assSize = structuredFactor * ((float)uEdgeCount) + discreteFactor * 
				((float)uNumOfAssQNodes);
		}
		return assSize;		
	}
	
	
    /**
     * Gets size of the given assignment.
     * 
     * @param qIDPairsList a list of query id pairs, each query id pair represents a query edge
     * @param discreteMatchSize the discrete part of the match size (only used for mixed metric)
     * @param u assignment whose size to be computed
     * 
     * @return size of the given assignment
     * 
     */
	private float getAssignmentSize(List<String> qIDPairsList, float discreteMatchSize, Assignment u) {
		String sourceQID, targetQID, sourcePID, targetPID;
		StreamItem sourceSE, targetSE;
		int uEdgeCount, qIDPairsListHalfLength;
		float assSize;
		uEdgeCount = 0;
		qIDPairsListHalfLength = qIDPairsList.size() / 2;
		for (int k = 0; k < qIDPairsListHalfLength; k++) {
			sourceQID = qIDPairsList.get(k*2);
			targetQID = qIDPairsList.get(k*2 + 1);
			if ((sourceQID != null) && (targetQID != null)) {
				sourcePID = u.getProcessNodeID(sourceQID);
				targetPID = u.getProcessNodeID(targetQID);
				if ((sourcePID != null) && (targetPID != null)) {
					sourceSE = solutionStreamMap.get(sourceQID).getStreamItem(sourcePID);
					targetSE = solutionStreamMap.get(targetQID).getStreamItem(targetPID);
					if ((sourceSE != null) && (targetSE != null)) {
						if (sourceSE.isChild(targetSE)) {
							uEdgeCount++;	
						}	
					}
				}
			}
		}
		
		if (isStructuredOnly) {
			assSize = (float)uEdgeCount;
		} else {
			assSize = structuredFactor * ((float)uEdgeCount) + discreteMatchSize;
		}
		return assSize;		
	}
	
	
    /**
     * Gets number of the cross matching edges between two assignments.
     * 
     * @param qIDPairsList a list of query id pairs, each query id pair 
     * 						represents a query edge
     * @param u1 assignment whose query nodes are sources of the cross edges
     * @param u2 assignment whose query nodes are targets of the cross edges
     * 
     * @return number of the cross matching edges between two assignments
     * 
     */
	private int getNumberOfCrossMatchEdges(List<String> qIDPairsList, Assignment u1, Assignment u2) {
		String sourceQID, targetQID, sourcePID, targetPID;
		StreamItem sourceSE, targetSE;
		int numberOfCrossMatchEdges, qIDPairsListHalfLength;
		numberOfCrossMatchEdges = 0;
		qIDPairsListHalfLength = qIDPairsList.size() / 2;
		for (int k = 0; k < qIDPairsListHalfLength; k++) {
			sourceQID = qIDPairsList.get(k*2);
			targetQID = qIDPairsList.get(k*2 + 1);
			if ((sourceQID != null) && (targetQID != null)) {
				sourcePID = u1.getProcessNodeID(sourceQID);
				targetPID = u2.getProcessNodeID(targetQID);
				if ((sourcePID != null) && (targetPID != null)) {
					sourceSE = solutionStreamMap.get(sourceQID).getStreamItem(sourcePID);
					targetSE = solutionStreamMap.get(targetQID).getStreamItem(targetPID);
					if ((sourceSE != null) && (targetSE != null)) {
						if (sourceSE.isChild(targetSE)) {
							numberOfCrossMatchEdges++;	
						}	
					}
				}
			}
		}	
		return numberOfCrossMatchEdges;		
	}
	
	
	public static QueryGraph getQuerygraph() {
		return querygraph;
	}
	
	public static void setQuerygraph(QueryGraph querygraph) {
		InexactMatchAlgorithms.querygraph = querygraph;
	}
	
	public ProcessGraph getProcessgraph() {
		return processgraph;
	}
	
	public void setProcessgraph(ProcessGraph processgraph) {
		this.processgraph = processgraph;
	}

	public static float getMinMatchingSimilarity() {
		return minMatchingSimilarity;
	}

	public static void setMinMatchingSimilarity(float minMatchingSimilarity) {
		InexactMatchAlgorithms.minMatchingSimilarity = minMatchingSimilarity;
	}


	public InexactMatchingResult getInexactMatchingResult() {
		return inexactMatchings;
	}

	public void setInexactMatchingResult(InexactMatchingResult inexactMatchings) {
		this.inexactMatchings = inexactMatchings;
	}

	public static Map<String, List<Assignment>> getTempMaxAssignSetMap() {
		return tempMaxAssignListMap;
	}


	public static void setTempMaxAssignSetMap(
			Map<String, List<Assignment>> tempMaxAssignSetMap) {
		InexactMatchAlgorithms.tempMaxAssignListMap = tempMaxAssignSetMap;
	}


	public static Map<String, SolutionStream> getSolutionStreamMap() {
		return solutionStreamMap;
	}

	
	public static void setSolutionStreamMap(
			Map<String, SolutionStream> solutionStreamMap) {
		InexactMatchAlgorithms.solutionStreamMap = solutionStreamMap;
	}


	public static Map<String, List<Assignment>> getMaxAssignListMap() {
		return maxAssignListMap;
	}


	public static void setMaxAssignListMap(
			Map<String, List<Assignment>> maxAssignListMap) {
		InexactMatchAlgorithms.maxAssignListMap = maxAssignListMap;
	}


	public static Set<String> getAllProcNodesIds() {
		return allProcNodesIds;
	}


	public static void setAllProcNodesIds(Set<String> allProcNodesIds) {
		InexactMatchAlgorithms.allProcNodesIds = allProcNodesIds;
	}


	public static Set<String> getAllProcessedProcNodesIds() {
		return allProcessedProcNodesIds;
	}


	public static void setAllProcessedProcNodesIds(
			Set<String> allProcessedProcNodesIds) {
		InexactMatchAlgorithms.allProcessedProcNodesIds = allProcessedProcNodesIds;
	}


	public static Set<String> getPIDsInMatch() {
		return pIDsInMatch;
	}


	public static void setPIDsInMatch(Set<String> dsInMatch) {
		pIDsInMatch = dsInMatch;
	}


	public static Set<String> getSubTreeNodesIDsQiComplement() {
		return subTreeNodesIDsQiComplement;
	}


	public static void setSubTreeNodesIDsQiComplement(
			Set<String> subTreeNodesIDsQiComplement) {
		InexactMatchAlgorithms.subTreeNodesIDsQiComplement = subTreeNodesIDsQiComplement;
	}


	public static Set<String> getProcessedChildrenSubgraphNodesIDs() {
		return processedChildrenSubgraphNodesIDs;
	}


	public static void setProcessedChildrenSubgraphNodesIDs(
			Set<String> processedChildrenSubgraphNodesIDs) {
		InexactMatchAlgorithms.processedChildrenSubgraphNodesIDs = processedChildrenSubgraphNodesIDs;
	}


	public static Set<String> getCommonNodesIDs() {
		return commonNodesIDs;
	}


	public static void setCommonNodesIDs(Set<String> commonNodesIDs) {
		InexactMatchAlgorithms.commonNodesIDs = commonNodesIDs;
	}


	public static Set<String> getQcSubgraphNodesMinusCommonNodesIDs() {
		return qcSubgraphNodesMinusCommonNodesIDs;
	}


	public static void setQcSubgraphNodesMinusCommonNodesIDs(
			Set<String> qcSubgraphNodesMinusCommonNodesIDs) {
		InexactMatchAlgorithms.qcSubgraphNodesMinusCommonNodesIDs = qcSubgraphNodesMinusCommonNodesIDs;
	}


	public static List<String> getQueryIDPairsForNonCommonNodes() {
		return queryIDPairsForNonCommonNodes;
	}


	public static void setQueryIDPairsForNonCommonNodes(
			List<String> queryIDPairsForNonCommonNodes) {
		InexactMatchAlgorithms.queryIDPairsForNonCommonNodes = queryIDPairsForNonCommonNodes;
	}


	public static List<ActivityNode> getQChildrenSorted() {
		return qChildrenSorted;
	}


	public static void setQChildrenSorted(List<ActivityNode> childrenSorted) {
		qChildrenSorted = childrenSorted;
	}


	public static float[] getQChildrenMaxRefSize() {
		return qChildrenMaxRefSize;
	}


	public static void setQChildrenMaxRefSize(float[] childrenMaxRefSize) {
		qChildrenMaxRefSize = childrenMaxRefSize;
	}


	public static Set<String> getQiSubgraphNIDsComplement() {
		return qiSubgraphNIDsComplement;
	}


	public static void setQiSubgraphNIDsComplement(
			Set<String> qiSubgraphNIDsComplement) {
		InexactMatchAlgorithms.qiSubgraphNIDsComplement = qiSubgraphNIDsComplement;
	}


	public static Set<String> getUmQIDs() {
		return umQIDs;
	}


	public static void setUmQIDs(Set<String> umQIDs) {
		InexactMatchAlgorithms.umQIDs = umQIDs;
	}


	public static List<StreamItem> getSeQcMaxList() {
		return seQcMaxList;
	}


	public static void setSeQcMaxList(List<StreamItem> seQcMaxList) {
		InexactMatchAlgorithms.seQcMaxList = seQcMaxList;
	}


	public static Set<ActivityNode> getQchildren() {
		return qchildren;
	}


	public static void setQchildren(Set<ActivityNode> qchildren) {
		InexactMatchAlgorithms.qchildren = qchildren;
	}


	public static NodesComparator getNodesCompare() {
		return nodesCompare;
	}


	public static void setNodesCompare(NodesComparator nodesCompare) {
		InexactMatchAlgorithms.nodesCompare = nodesCompare;
	}


	public static List<String> getQueryIDPairsForCrossEdges() {
		return queryIDPairsForCrossEdges;
	}


	public static void setQueryIDPairsForCrossEdges(
			List<String> queryIDPairsForCrossEdges) {
		InexactMatchAlgorithms.queryIDPairsForCrossEdges = queryIDPairsForCrossEdges;
	}


	public static Set<String> getUmjQIDs() {
		return umjQIDs;
	}


	public static void setUmjQIDs(Set<String> umjQIDs) {
		InexactMatchAlgorithms.umjQIDs = umjQIDs;
	}


	public static boolean[] getIsCombined() {
		return isCombined;
	}


	public static void setIsCombined(boolean[] isCombined) {
		InexactMatchAlgorithms.isCombined = isCombined;
	}


	public static List<ActivityNode> getQNodesSortedByMatchSize() {
		return qNodesSortedByMatchSize;
	}


	public static void setQNodesSortedByMatchSize(
			List<ActivityNode> nodesSortedByMatchSize) {
		qNodesSortedByMatchSize = nodesSortedByMatchSize;
	}


	public static float getConnectivityFactor() {
		return connectivityFactor;
	}


	public static void setConnectivityFactor(float connectivityFactor) {
		InexactMatchAlgorithms.connectivityFactor = connectivityFactor;
	}


	public static float getStructuredFactor() {
		return structuredFactor;
	}


	public static void setStructuredFactor(float structuredFactor) {
		InexactMatchAlgorithms.structuredFactor = structuredFactor;
	}


	public static float getDiscreteFactor() {
		return discreteFactor;
	}


	public static void setDiscreteFactor(float discreteFactor) {
		InexactMatchAlgorithms.discreteFactor = discreteFactor;
	}


	public static SimilarityMeasureType getTypeOfSimilarityMeasure() {
		return typeOfSimilarityMeasure;
	}


	public static void setTypeOfSimilarityMeasure(
			SimilarityMeasureType typeOfSimilarityMeasure) {
		InexactMatchAlgorithms.typeOfSimilarityMeasure = typeOfSimilarityMeasure;
	}


	public static boolean isStructuredOnly() {
		return isStructuredOnly;
	}


	public static void setStructuredOnly(boolean isStructuredOnly) {
		InexactMatchAlgorithms.isStructuredOnly = isStructuredOnly;
	}

}
