/**
 * 
 */
package de.uni.stuttgart.bpelSearching.matching.inexactmatching;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import de.uni.stuttgart.bpelSearching.datastructure.SolutionStream;
import de.uni.stuttgart.bpelSearching.datastructure.StreamItem;
import de.uni.stuttgart.bpelSearching.matching.NodesComparator;
import de.uni.stuttgart.bpelSearching.query.QueryGraph;
import de.uni.stuttgart.bpelSearching.util.GraphAnalyse;
import de.uni.stuttgart.bpelSearching.util.GraphType;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.ProcessFlowGraph;
import de.uni.stuttgart.gerlacdt.bpel.GraphMapping.nodes.ActivityNode;

/**
 * @author luwei
 *
 */
public class EvalQueryInexactMatch {
	static Logger logger = Logger.getLogger(EvalQueryInexactMatch.class);
	private QueryGraph querygraph;
	private ProcessFlowGraph processgraph;
	private float minMatchingSimilarity = 0.2f;
	private static final float connectivityFactor = 0.5f;
	private int numberOfDiscreteMatchQEdge = 0;
	private int thresholdOfNumberOfMaxMatch = 0;
	private Map<String, SolutionStream> solutionStreamMap = 
		new HashMap<String, SolutionStream>();
	private InexactMatchingResult inexactMatchings;
	private Map<String, List<Assignment>> tempMaxAssignSetMap = 
		new HashMap<String, List<Assignment>>();
	private Map<String, List<Assignment>> maxAssignListMap = 
		new HashMap<String, List<Assignment>>();
	
	/**
	 * @param querygraph
	 * @param processgraph
	 * 
	 * @throws IllegalArgumentException if <code>querygraph==null</code>
	 */
	public EvalQueryInexactMatch(QueryGraph querygraph,
			ProcessFlowGraph processgraph) {
		GraphAnalyse ga;
		int numberOfQueryEdges;
		
    	if ((querygraph == null) || ((querygraph != null) && 
    			(querygraph.getQueryGraph() == null))) {
            throw new IllegalArgumentException("query graph must not be null");
        }
    	
    	if ((processgraph == null) || ((processgraph != null) && 
    			(processgraph.getProcessGraph() == null))) {
            throw new IllegalArgumentException("query graph must not be null");
        }
    	
		this.querygraph = querygraph;
		this.processgraph = processgraph;
		
		ga = new GraphAnalyse(processgraph.getProcessGraph(), 
				processgraph.getStartActivity());
    	if(processgraph.getStartActivity() == null){
    		processgraph.setStartActivity(ga.getStartVertex());   		  		
    	}   	    	
    	processgraph.setProcessGraphType(ga.checkGraphType());
		
		if ((numberOfQueryEdges = querygraph.getNumberOfEdges()) > 0) {
			minMatchingSimilarity = (1.00f / ((float)numberOfQueryEdges));
		}
		
		querygraph.setQueryNodesSortedByLevelOrder();
		
//		BreadthFirstTraverse bfs = new BreadthFirstTraverse(querygraph.getQueryGraph(), 
//				querygraph.getStartVertex());
//		bfs.traverse();
//		sortedQueryNodesByLevelOrder = bfs.getNodesSortedByLevelOrder();
//		querygraph.setQueryNodesSortedByLevelOrder(sortedQueryNodesByLevelOrder);
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
		Set<ActivityNode> vertexSetQuery = querygraph.getQueryGraph().vertexSet();
		Set<ActivityNode> vertexSetProcess = processgraph.getProcessGraph().vertexSet();
		String qNodeID;
		NodesComparator nodesCompare = new NodesComparator();
		int initMaxSize, tempArrayPos, pPos, cPos, tempMaxNumberOfAssigns;
		StreamItem streamElement;
		Set<ActivityNode> queryChildren;
		List<StreamItem> seList, seCList;
		boolean hasMatchQEdge;
		Set<String> qSubGraphIDs;

		processgraph.computeTransitiveClosure();
		for (ActivityNode queryNode : vertexSetQuery) {
			if (querygraph.isLeaf(queryNode)) {
				initMaxSize = 0;
			} else {
				initMaxSize = -1;
			}
			qNodeID = queryNode.getActivityID();
			solutionStreamMap.put(qNodeID, new SolutionStream(initMaxSize));
			for (ActivityNode procNode : vertexSetProcess) {
				if(nodesCompare.compare(queryNode, procNode) == 0){
					tempArrayPos = processgraph.getArrayIndexOfProcessNode(procNode);
					if (tempArrayPos == -1) {
						logger.warn("There is no corresponding process node: " + 
								procNode.toString() + " in the nodes array of the process graph.");
					}
					streamElement = new StreamItem(procNode, tempArrayPos, initMaxSize, null);
					solutionStreamMap.get(qNodeID).getStreamList().add(streamElement);
					thresholdOfNumberOfMaxMatch++;
				}
			}
		}
		
		if (thresholdOfNumberOfMaxMatch > vertexSetProcess.size()) {
			thresholdOfNumberOfMaxMatch = vertexSetProcess.size();
		}
		
		thresholdOfNumberOfMaxMatch = thresholdOfNumberOfMaxMatch - vertexSetQuery.size() + 1;
		
		for (ActivityNode qNode : vertexSetQuery) {
			qNodeID = qNode.getActivityID();
			queryChildren = querygraph.getChildren(qNode);			
			if (!queryChildren.isEmpty()) {			
				seList = solutionStreamMap.get(qNodeID).getStreamList();
				for (ActivityNode cNode : queryChildren) {
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
						numberOfDiscreteMatchQEdge++;
					}
				}
			}
		}
			
		if (querygraph.getQueryGraphType() == GraphType.TREE) {
			querygraph.setSubgraphNodesMapForQueryTree();
		} else if (querygraph.getQueryGraphType() == GraphType.ROOTED_DAG) {
			querygraph.setSubgraphNodesMapForQueryDAG();
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
				tempMaxNumberOfAssigns = tempMaxNumberOfAssigns - qSubGraphIDs.size() + 1;
				if (tempMaxNumberOfAssigns > 0) {
					solutionStreamMap.get(qNodeID).setMaxNumberOfAssignments(tempMaxNumberOfAssigns);
				}	
			}		
		}
		
		// ********* For Debugg *********
//		logger.warn("Output solution streams: ");
//		for (ActivityNode qNode : vertexSetQuery) {
//			logger.warn(qNode.toString() + " " + solutionStreamMap.get(qNode.getActivityID()).toString());
//		}
//		logger.warn("numberOfDiscreteMatchQEdge: " + numberOfDiscreteMatchQEdge);
	}
	
	
	/**
	 * Performs inexact matching. It goes through all BPEL processes to be matched, 
	 * transforms each BPEL-process to a directed graph, and performs graph matching 
	 * between the query graph to each process graph under inexact matching semantic.
	 * 
	 */
	public void doInexactMatch(){
		float discreteMatchRatio;
		int numberOfQueryEdges;	
		List<Matching> maxMatchingList;
		ActivityNode q0;
		List<StreamItem> streamListQ0;
		Assignment tempAssQ0;
		if ((processgraph.getProcessGraphType() == GraphType.TREE)
				|| (processgraph.getProcessGraphType() == GraphType.ROOTED_DAG)) {				
			if ((querygraph.getQueryGraphType() == GraphType.TREE) || 
					(querygraph.getQueryGraphType() == GraphType.ROOTED_DAG)) {
				initSolutionStreams();
				if ((numberOfQueryEdges = querygraph.getNumberOfEdges()) == 0) {
					q0 = querygraph.getStartVertex();
					if (!(streamListQ0 = solutionStreamMap.get(q0.getActivityID()).getStreamList()).isEmpty()) {
						maxMatchingList = new ArrayList<Matching>();
						for (StreamItem seq0 : streamListQ0) {
							tempAssQ0 = new Assignment();
							tempAssQ0.addAssign(q0, seq0.getProcessnode());
							maxMatchingList.add(new Matching(1.0f, tempAssQ0));
						}
						inexactMatchings = new InexactMatchingResult(processgraph.getProcessID(), 
								processgraph.getProcessNamespace(), processgraph.getProcessName(), 
								maxMatchingList, 1.0f);
						printSolutions();
					}	
				} else {
					discreteMatchRatio = (((float)numberOfDiscreteMatchQEdge)/((float)numberOfQueryEdges));
					if (discreteMatchRatio >= minMatchingSimilarity) {
						if (querygraph.getQueryGraphType() == GraphType.TREE) {
							computeMaxAssignForTreeNodes();
							maxMatchsOfQueryTree();
						} else if (querygraph.getQueryGraphType() == GraphType.ROOTED_DAG) {
							computeMaxAssignForDAGNodes();
							maxMatchsOfQueryDAG();
						}
					}
				}			
			}
		}
	}
	
	/**
	 * Compute maximal level-i matchings and the number of edges of each of 
	 * these maximal matchings for all stream elements associated with the 
	 * given query tree.
	 * 
	 */
	public void computeMaxAssignForTreeNodes() {
		int i, j, maxSizePx, oldListLength, qNodesSize;
		ActivityNode qi, px, pcm;
		SolutionStream solutionStreamQi;
		List<StreamItem> streamListQi, seQcMaxList;
		seQcMaxList = new ArrayList<StreamItem>();
		Assignment upx, upxupcm;
		String qiID, qipxID, qcpcmID, debuggerString;
		List<Assignment> tempMaxAssList, tempMaxAssignListQcPcm, maxAssignListQi;
		Set<ActivityNode> qchildren;
		Set<String> qcSubtreeNodesIDs;
		Set<String> allProcNodesIds = new HashSet<String>();
		Set<String> allProcessedProcNodesIds = new HashSet<String>();
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
						qipxID = "q" + qi.getActivityID() + "p" + px.getActivityID();
						tempMaxAssList = new ArrayList<Assignment>();
						tempMaxAssList.add(upx);
						tempMaxAssignSetMap.put(qipxID, tempMaxAssList);
						maxAssignListQi.add(upx);
						seqi.setMaxMatchSize(0);
					}
				} else {
					qchildren = querygraph.getChildren(qi);
					for (StreamItem seqi : streamListQi) {
						px = seqi.getProcessnode();
						upx = new Assignment();
						// the start assign
						upx.addAssign(qi, px);
						// Count the number of edges of the maximal assignment, whose start assign is [qi / px]
						maxSizePx = 0;
						qipxID = "q" + qi.getActivityID() + "p" + px.getActivityID();
						tempMaxAssList = new ArrayList<Assignment>();
						tempMaxAssList.add(upx);
						tempMaxAssignSetMap.put(qipxID, tempMaxAssList);
						// iterate through children nodes to calculate assignments for qi through combine
						// children assignments
						for (ActivityNode qc : qchildren) {
							// No references to any stream elements stored in solution stream of qc
							seQcMaxList.clear();
							seqi.getMaxReferencedStreamItems(qc, seQcMaxList);
							if (seQcMaxList.isEmpty()) {
								// Expand each assignment with undefined for each query node in qc’s substree, replace
								// the old assignment with the expanded one.
								qcSubtreeNodesIDs = querygraph.getSubtreeNodesIDs(qc);														
								// for (Assignment ass : tempMaxAssignSetMap.get(qipxID)) {
								for (Assignment ass : tempMaxAssList) {
									ass.addAssignsByQueryNodesIDs(qcSubtreeNodesIDs);
								}	
							} else {
								// seQcMaxList is a list of stream elements referenced by seqi.childrenRefMap.get(qc), 
								// each of these stream elements has a maximal value m for attribute “maxMatchSize” 
								// among all referenced stream elements in seqi.childrenRefMap.get(qc)
								oldListLength = tempMaxAssList.size();
								maxSizePx = maxSizePx + seQcMaxList.get(0).getMaxMatchSize() + 1;
								for (j = 0; j < oldListLength; j++) {
									upx = tempMaxAssList.get(j);
									for (StreamItem seQcMax : seQcMaxList) {
										pcm = seQcMax.getProcessnode();
										qcpcmID = "q" + qc.getActivityID() + "p" + pcm.getActivityID();
										tempMaxAssignListQcPcm = tempMaxAssignSetMap.get(qcpcmID);
										for (Assignment upcm : tempMaxAssignListQcPcm) {
											upxupcm = new Assignment();
											upxupcm.addAssignment(upx);
											upxupcm.addAssignment(upcm);
											tempMaxAssList.add(upxupcm);
										}
									}	
								}
								
								for (j = 0; j < oldListLength; j++) {
									tempMaxAssList.remove(0);
								}
								
								if (tempMaxAssList.size() > solutionStreamQi.getMaxNumberOfAssignments()) {
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
						reduceAssignments(maxAssignListQi, allProcNodesIds, allProcessedProcNodesIds);
					}
				}
				
				for (Assignment uqi : maxAssignListQi) {
					uqi.setAssignSize(solutionStreamQi.getMaxMatchSize());
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
		Set<String> subTreeNodesIDsQiComplement, subTreeNodesIDsQi, 
					allProcNodesIds, allProcessedProcNodesIds;
		Assignment um2, tempUm;
		int qNodesSize, sizeUm1, sizeUm2, maxMatchSizeQi, maxAssignSize, numberOfQueryEdges;
		float maxSimilarity, newMatchSimilarity, tempNewMatchSize;
		boolean isMaxUm1, isEmptyMaxMatchingList, isSubComplement, maxMatchingListChanged;
		SolutionStream solutionStreamQi;
		List<Matching> maxMatchingList = new ArrayList<Matching>();
		List<Matching> tempMaxMatchingList;
		Matching newMatch;

		// Store all maximal level-1 assignments in Smax, which is a set used to store maximal matchings
//		List<Assignment> maxAssignListQ0;
		maxSimilarity = 0.0f;
		numberOfQueryEdges = querygraph.getNumberOfEdges();
		
//		if ((numberOfQueryEdges = querygraph.getNumberOfEdges()) == 0) {
//			maxAssignListQ0 = maxAssignListMap.get(querygraph.getQueryNodesSortedByLevelOrder().
//					get(0).getActivityID());
//			if ((maxAssignListQ0 != null) && (!(maxAssignListQ0.isEmpty()))) {
//				for (Assignment ass : maxAssignListQ0) {
//					maxMatchingList.add(new Matching(1.0f, ass));
//				}
//				maxSimilarity = 1.0f;
//			}
//		} else {
		tempMaxMatchingList = new ArrayList<Matching>();
		allProcNodesIds = new HashSet<String>();
		allProcessedProcNodesIds = new HashSet<String>();
		qNodesSize = querygraph.getQueryNodesSortedByLevelOrder().size();
		isEmptyMaxMatchingList = true;
		// iterate through query tree nodes
		for (int i = 0; i < qNodesSize; i++) {
			qi = querygraph.getQueryNodesSortedByLevelOrder().get(i);
			qiID = qi.getActivityID();
			solutionStreamQi = solutionStreamMap.get(qiID);
			maxAssListQi = maxAssignListMap.get(qiID);
			// Store the first not empty MaxAssignList[qi] in maxMatchingList
			if (isEmptyMaxMatchingList && (maxAssListQi != null) && (!maxAssListQi.isEmpty())) {
				maxSimilarity = ((float)(solutionStreamMap.get(qiID).getMaxMatchSize()))
					/((float)numberOfQueryEdges);
				isEmptyMaxMatchingList = false;
				if (querygraph.isRoot(qi)) {
					for (Assignment ass : maxAssListQi) {
						maxMatchingList.add(new Matching(maxSimilarity, ass));
					}
				} else {
					subTreeNodesIDsQiComplement = new HashSet<String>();			
					subTreeNodesIDsQi = querygraph.getSubtreeNodesIDs(qi);
					for (int j = 0; j < qNodesSize; j++) {
						qjID = querygraph.getQueryNodesSortedByLevelOrder().get(j).getActivityID();
						isSubComplement = true;
						for (String subQiID : subTreeNodesIDsQi) {
							if (qjID.compareTo(subQiID) == 0) {
								isSubComplement = false;
								break;
							}
						}
						if (isSubComplement) {
							subTreeNodesIDsQiComplement.add(qjID);
						}
					}
					for (Assignment ass : maxAssListQi) {
						ass.addAssignsByQueryNodesIDs(subTreeNodesIDsQiComplement);
						maxMatchingList.add(new Matching(maxSimilarity, ass));
					}
				}	
			} else if ((maxAssListQi != null) && (!maxAssListQi.isEmpty())) {			
				qiParentID = querygraph.getParent(qi).getActivityID();
				subTreeNodesIDsQi = querygraph.getSubtreeNodesIDs(qi);
				tempMaxMatchingList.clear();
				tempMaxMatchingList.addAll(maxMatchingList);
				maxMatchSizeQi = solutionStreamQi.getMaxMatchSize();	
				maxMatchingListChanged = false;
				for (Matching mmax : maxMatchingList) {
					assMmaxList = mmax.getAssignments();
					tempNewMatchSize = 0.0f;
					maxAssignSize = 0;
					isMaxUm1 = false;
					tempUm = null;
					sizeUm2 = 0;
					for (Assignment um : assMmaxList) {
						// If parent node of qi is one of the query nodes assigned by um, 
						// then we try to combine um with maximal assignments for qi stored 
						// in MaxAssignSet[qi].
						if (um.containQueryNode(qiParentID)) {
							umqiPID = um.getProcessNodeID(qiID);
							if (umqiPID == null) {
								sizeUm1 = 0;
							} else {
								sizeUm1 = solutionStreamQi.getMaxMatchSizeOfStreamItem(umqiPID);	
							}
			
							if (sizeUm1 < maxMatchSizeQi) {
								if (umqiPID == null) {
									sizeUm2 = um.getAssignSize() - sizeUm1;
								} else {
									sizeUm2 = um.getAssignSize() - sizeUm1 - 1;
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
								tempNewMatchSize += ((float)maxMatchSizeQi + (float)sizeUm2);
								tempUm = um;
							} else {
								isMaxUm1 = true;
								break;
							}
						} else {
							if (um.getAssignSize() > maxAssignSize) {
								maxAssignSize = um.getAssignSize();
							}
							tempNewMatchSize += ((float)(um.getAssignSize()));
						}
					}
						
					if (!isMaxUm1) {
						newMatchSimilarity = (((float)maxAssignSize + connectivityFactor * 
							(tempNewMatchSize - (float)maxAssignSize))/numberOfQueryEdges);
						if (tempUm != null) {
							if (newMatchSimilarity > maxSimilarity) {
								um2 = tempUm.getRestPartOfAssignmentByQueryNodesIDs(subTreeNodesIDsQi, sizeUm2);
								maxSimilarity = newMatchSimilarity;
								tempMaxMatchingList.clear();
								for (Assignment maxAssQi : maxAssListQi) {
									newmaxAssList = new ArrayList<Assignment>();
									newmaxAssList.add(um2);
									for (Assignment assMmax : assMmaxList) {
										if (!assMmax.equals(tempUm)) {
											newmaxAssList.add(assMmax);
										}
									}
									newmaxAssList.add(maxAssQi);
									newMatch = new Matching(newMatchSimilarity, newmaxAssList);
									tempMaxMatchingList.add(newMatch);
								}
								maxMatchingListChanged = true;
							} else if (newMatchSimilarity == maxSimilarity) {
								um2 = tempUm.getRestPartOfAssignmentByQueryNodesIDs(subTreeNodesIDsQi, sizeUm2);
								for (Assignment maxAssQi : maxAssListQi) {
									newmaxAssList = new ArrayList<Assignment>();
									newmaxAssList.add(um2);
									for (Assignment assMmax : assMmaxList) {
										if (!assMmax.equals(tempUm)) {
											newmaxAssList.add(assMmax);
										}
									}
									newmaxAssList.add(maxAssQi);
									newMatch = new Matching(newMatchSimilarity, newmaxAssList);
									tempMaxMatchingList.add(newMatch);
								}
								maxMatchingListChanged = true;
							}
						}
					}
				}
				
				if (maxMatchingListChanged) {
					if (tempMaxMatchingList.size() > thresholdOfNumberOfMaxMatch) {
						reduceMatchings(tempMaxMatchingList, allProcNodesIds, allProcessedProcNodesIds);		
					}
					maxMatchingList.clear();
					maxMatchingList.addAll(tempMaxMatchingList);
				}
			}
		}
//		}
		
		if (maxSimilarity >= minMatchingSimilarity) {
			inexactMatchings = new InexactMatchingResult(processgraph.getProcessID(), 
					processgraph.getProcessNamespace(), processgraph.getProcessName(), 
					maxMatchingList, maxSimilarity);
			printSolutions();
		}
	}
	
	
	/**
	 * Compute maximal level-i matchings and the number of edges of each of 
	 * these maximal matchings for all stream elements associated with the 
	 * given query graph.
	 * 
	 */
	public void computeMaxAssignForDAGNodes() {
		int qNodesSize, i, j, k, l, tempPos, maxSizePx, oldListLength, tempListLength, 
			maxChildrenSize,seqiQcMaxRefSize, maxPartialAssignSize, qIDpairsHalfLength,upcm1Size;
		ActivityNode qi, px, pcm;
		SolutionStream solutionStreamQi;
		List<StreamItem> streamListQi, seQcMaxList;
		seQcMaxList = new ArrayList<StreamItem>();
		Assignment upx, upxupcm, upcm1;
		String qiID, qipxID, qcpcmID, sourceQID, targetQID, sourcePID, targetPID, debuggerString;
		List<Assignment> tempMaxAssignsQiPx, tempMaxAssignListQcPcm, maxAssignListQi;
		Set<ActivityNode> qChildren;
		Set<String> qcSubgraphNodesIDs, processedChildrenSubtreeNodesIDs, commonNodesIDs, 
					qcSubgraphNodesMinusCommonNodesIDs;
		qNodesSize = querygraph.getQueryNodesSortedByLevelOrder().size();
		qcSubgraphNodesIDs = new HashSet<String>();
		processedChildrenSubtreeNodesIDs = new HashSet<String>();
		commonNodesIDs = new HashSet<String>();
		List<String> queryIDPairsForNonCommonNodes = new ArrayList<String>();
		qcSubgraphNodesMinusCommonNodesIDs = new HashSet<String>();
		List<ActivityNode> qChildrenSorted = new LinkedList<ActivityNode>();
		maxChildrenSize = querygraph.getMaxChildrenSize();
		int[] qChildrenMaxRefSize = new int[maxChildrenSize];
		StreamItem sourceSE, targetSE;
	
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
						qipxID = "q" + qiID + "p" + px.getActivityID();
						tempMaxAssignsQiPx = new ArrayList<Assignment>();
						tempMaxAssignsQiPx.add(upx);
						tempMaxAssignSetMap.put(qipxID, tempMaxAssignsQiPx);
						maxAssignListQi.add(upx);
						seqi.setMaxMatchSize(0);
					}
				} else {				
					qChildren = querygraph.getChildren(qi);					
					for (StreamItem seqi : streamListQi) {
						px = seqi.getProcessnode();
						upx = new Assignment();
						// the start assign
						upx.addAssign(qi, px);
						// Count the number of edges of the maximal assignment, whose start assign is [qi / px]
						maxSizePx = 0;
						qipxID = "q" + qiID + "p" + px.getActivityID();
						tempMaxAssignsQiPx = new ArrayList<Assignment>();
						tempMaxAssignsQiPx.add(upx);
						tempMaxAssignSetMap.put(qipxID, tempMaxAssignsQiPx);
						processedChildrenSubtreeNodesIDs.clear();			
						// *********** Sort query children ********** 
						qChildrenSorted.clear();
						for (k = 0; k < maxChildrenSize; k++) {
							qChildrenMaxRefSize[k] = -2;
						}				
						tempPos = -1;
						for (ActivityNode qc : qChildren) {
							seqiQcMaxRefSize = seqi.getMaxRefSize(qc);
							for (k = 0; k < maxChildrenSize; k++) {
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
							intersectionOfSets(processedChildrenSubtreeNodesIDs, qcSubgraphNodesIDs, commonNodesIDs);
							processedChildrenSubtreeNodesIDs.addAll(qcSubgraphNodesIDs);
							// No references to any stream elements stored in solution stream of qc
							seqi.getMaxReferencedStreamItems(qc, seQcMaxList);
							if (seQcMaxList.isEmpty()) {
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
								// assListQiPx = tempMaxAssignSetMap.get(qipxID);
								oldListLength = tempMaxAssignsQiPx.size();
								if (commonNodesIDs.isEmpty()) {								
									maxSizePx = maxSizePx + seQcMaxList.get(0).getMaxMatchSize() + 1;
									for (j = 0; j < oldListLength; j++) {
										upx = tempMaxAssignsQiPx.get(j);
										for (StreamItem seQcMax : seQcMaxList) {
											pcm = seQcMax.getProcessnode();
											qcpcmID = "q" + qc.getActivityID() + "p" + pcm.getActivityID();
											tempMaxAssignListQcPcm = tempMaxAssignSetMap.get(qcpcmID);
											for (Assignment upcm : tempMaxAssignListQcPcm) {
												upxupcm = new Assignment();
												upxupcm.addAssignment(upx);
												upxupcm.addAssignment(upcm);
												tempMaxAssignsQiPx.add(upxupcm);
											}
										}	
									}								
								} else {
									// in order to compute the size of upcm1
									differenceOfSets(qcSubgraphNodesIDs, commonNodesIDs, qcSubgraphNodesMinusCommonNodesIDs);
									querygraph.computeNodeIDPairs(qcSubgraphNodesMinusCommonNodesIDs, queryIDPairsForNonCommonNodes);
									qIDpairsHalfLength = queryIDPairsForNonCommonNodes.size()/2;
									maxPartialAssignSize = 0;							
									for (j = 0; j < oldListLength; j++) {
										upx = tempMaxAssignsQiPx.get(j);
										for (StreamItem seQcMax : seQcMaxList) {
											pcm = seQcMax.getProcessnode();
											qcpcmID = "q" + qc.getActivityID() + "p" + pcm.getActivityID();
											tempMaxAssignListQcPcm = tempMaxAssignSetMap.get(qcpcmID);
											for (Assignment upcm : tempMaxAssignListQcPcm) {				
												upcm1 = upcm.getRestPartOfAssignmentByQueryNodesIDs(commonNodesIDs, 0);
												// ****** ??? assignsize for upcm1 ???*****
												upcm1Size = 0;
												for (k = 0; k < qIDpairsHalfLength; k++) {
													sourceQID = queryIDPairsForNonCommonNodes.get(k*2);
													targetQID = queryIDPairsForNonCommonNodes.get(k*2 + 1);
													if ((sourceQID != null) && (targetQID != null)) {
														sourcePID = upcm1.getProcessNodeID(sourceQID);
														targetPID = upcm1.getProcessNodeID(targetQID);
														if ((sourcePID != null) && (targetPID != null)) {
															sourceSE = solutionStreamMap.get(sourceQID).getStreamItem(sourcePID);
															targetSE = solutionStreamMap.get(targetQID).getStreamItem(targetPID);
															if ((sourceSE != null) && (targetSE != null)) {
																if (sourceSE.isChild(targetSE)) {
																	upcm1Size++;	
																}	
															}
														}
													}
												}
												upcm1.setAssignSize(upcm1Size);
												if (upcm1.getAssignSize() > maxPartialAssignSize) {
													maxPartialAssignSize = upcm1.getAssignSize();
													upcm1.addAssignment(upx);
													tempListLength = tempMaxAssignsQiPx.size();
													for (k = oldListLength; k < tempListLength; k++) {
														tempMaxAssignsQiPx.remove(oldListLength);
													}
													tempMaxAssignsQiPx.add(upcm1);
												} else if (upcm1.getAssignSize() == maxPartialAssignSize) {
													upcm1.addAssignment(upx);
													tempMaxAssignsQiPx.add(upcm1);
												}
											}
										}
									}	
									maxSizePx = maxSizePx + maxPartialAssignSize + 1;
								}
								
								for (j = 0; j < oldListLength; j++) {
									tempMaxAssignsQiPx.remove(0);
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
					
					for (Assignment uqi : maxAssignListQi) {
						uqi.setAssignSize(solutionStreamQi.getMaxMatchSize());
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
//		logger.warn("numberOfDiscreteMatchQEdge: " + numberOfDiscreteMatchQEdge);
	}
	
	/**
	 * Finds maximal matchings between the query graph and the process graph as combinations of 
	 * maximal level-i assignments. The results are stored in attribute <code> maxMatchingList 
	 * </code>.
	 * 
	 */
	public void maxMatchsOfQueryDAG() {
		String rootID, qID, q0ID, urq0PID, qiID, umqiPID, sourceQID, targetQID, sourcePID, targetPID;
		int matchSizeQ, i, j, k, tempSize, maxMatchSizeQr, maxMatchSizeQi, numberOfQueryEdges, sizeQiPID,
			urMinusQ0Size, um1Size, qNodesSortedSize, qIDpairsHalfLength, maxAssignSize;
		float maxSimilarity, newMatchSimilarity, tempNewMatchSize;
		List<Matching> maxMatchingList = new ArrayList<Matching>();
		List<Matching> tempMaxMatchingList;
		List<Assignment> maxAssListQr, maxAssListQ0, maxAssListQi, assMmaxList, newmaxAssList;
		SolutionStream solutionStreamQ0, solutionStreamQi;
		Set<String> qiSubgraphNIDsComplement, qiSubgraphNIDs, umQIDs, allProcNodesIds, allProcessedProcNodesIds;
		Matching newMatch;
		Assignment newAssm, tempUm, um1;
		List<String> queryIDPairsForNonCommonNodes;
		StreamItem sourceSE, targetSE;
		boolean isMaxUmQi, added, maxMatchingListChanged;
		
		List<ActivityNode> qNodesSortedByLevel = querygraph.getQueryNodesSortedByLevelOrder();	
		// qNodesSortedByMatchSize is an array on query nodes except the query root node that meet the 
		// following conditions: the MaxAssignSet[] for each of these query nodes is not empty. Query 
		// nodes are sorted in descending order of the “maxMatchSize”. 
		List<ActivityNode> qNodesSortedByMatchSize = new ArrayList<ActivityNode>();
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
		
		rootID = querygraph.getStartVertex().getActivityID();
		maxMatchSizeQr = solutionStreamMap.get(rootID).getMaxMatchSize();
		numberOfQueryEdges = querygraph.getQueryGraph().edgeSet().size();
		maxAssListQr = maxAssignListMap.get(rootID);
		
		if (maxMatchSizeQr <= 0) {
			maxSimilarity = 0.0f;
		} else {
			maxSimilarity = ((float)maxMatchSizeQr) / ((float)numberOfQueryEdges);
		}
		
		// Combine maximal level-i assignments for query subgraph rooted at q0 with maximal level-1 
		// assignments, if any
		if ((qNodesSortedSize = qNodesSortedByMatchSize.size()) == 0) {
			if ((maxAssListQr != null) && (maxSimilarity >= minMatchingSimilarity)) {
				for (Assignment ass : maxAssListQr) {
					maxMatchingList.add(new Matching(maxSimilarity, ass));
				}
			}
		} else { 	// there is at least one node whose MaxAssignList is not empty
			q0ID = qNodesSortedByMatchSize.get(0).getActivityID();
			solutionStreamQ0 = solutionStreamMap.get(q0ID);
			maxMatchSizeQi = solutionStreamQ0.getMaxMatchSize();
			maxAssListQ0 = maxAssignListMap.get(q0ID);
			qiSubgraphNIDsComplement = new HashSet<String>();
			qiSubgraphNIDs = querygraph.getSubgraphNodesIDsFromMap(qNodesSortedByMatchSize.get(0));
			
			for (ActivityNode qNode : qNodesSortedByLevel) {
				if (!qiSubgraphNIDs.contains(qNode.getActivityID())) {
					qiSubgraphNIDsComplement.add(qNode.getActivityID());
				}
			}
			
			allProcNodesIds = new HashSet<String>();
			allProcessedProcNodesIds = new HashSet<String>();
			queryIDPairsForNonCommonNodes = new ArrayList<String>();
			
			if ((maxAssListQr == null) || maxAssListQr.isEmpty()) {
				maxSimilarity = ((float)maxMatchSizeQi) / ((float)numberOfQueryEdges);
				for (Assignment ass : maxAssListQ0) {
					newMatch = new Matching(maxSimilarity, ass);
					newAssm = new Assignment();
					newAssm.addAssignsByQueryNodesIDs(qiSubgraphNIDsComplement);
					newMatch.addAssignment(newAssm);
					maxMatchingList.add(newMatch);
				}		
			} else {
				querygraph.computeNodeIDPairs(qiSubgraphNIDsComplement, queryIDPairsForNonCommonNodes);
				qIDpairsHalfLength = queryIDPairsForNonCommonNodes.size()/2;
				for (Assignment ur : maxAssListQr) {
					if (((urq0PID = ur.getProcessNodeID(q0ID)) == null) || ((solutionStreamQ0.
							getStreamItem(urq0PID).getMaxMatchSize()) < maxMatchSizeQi)) {			
						// ********* Compute |ur minus subgraphNodes(q0)| *************
						urMinusQ0Size = 0;
						for (k = 0; k < qIDpairsHalfLength; k++) {
							sourceQID = queryIDPairsForNonCommonNodes.get(k*2);
							targetQID = queryIDPairsForNonCommonNodes.get(k*2 + 1);
							if ((sourceQID != null) && (targetQID != null)) {
								sourcePID = ur.getProcessNodeID(sourceQID);
								targetPID = ur.getProcessNodeID(targetQID);
								if ((sourcePID != null) && (targetPID != null)) {
									sourceSE = solutionStreamMap.get(sourceQID).getStreamItem(sourcePID);
									targetSE = solutionStreamMap.get(targetQID).getStreamItem(targetPID);
									if ((sourceSE != null) && (targetSE != null)) {
										if (sourceSE.isChild(targetSE)) {
											urMinusQ0Size++;	
										}	
									}
								}
							}
						}
						
						if (maxMatchSizeQi > urMinusQ0Size) {
							newMatchSimilarity = (((float)maxMatchSizeQi + connectivityFactor * 
									((float)urMinusQ0Size))/numberOfQueryEdges);
						} else {
							newMatchSimilarity = (((float)urMinusQ0Size + connectivityFactor * 
									((float)maxMatchSizeQi))/numberOfQueryEdges);
						}

						
						if (newMatchSimilarity > maxSimilarity) {
							maxSimilarity = newMatchSimilarity;
							maxMatchingList.clear();				
							for (Assignment ass : maxAssListQ0) {
								newMatch = new Matching(maxSimilarity, ass);
								newMatch.addAssignment(ur.getRestPartOfAssignmentByQueryNodesIDs
										(qiSubgraphNIDs, urMinusQ0Size));
								maxMatchingList.add(newMatch);
							}
						} else if (newMatchSimilarity == maxSimilarity) {
							for (Assignment ass : maxAssListQ0) {
								newMatch = new Matching(maxSimilarity, ass);
								newMatch.addAssignment(ur.getRestPartOfAssignmentByQueryNodesIDs
										(qiSubgraphNIDs, urMinusQ0Size));
								maxMatchingList.add(newMatch);
							}
						}
					}
				}
				
				if (maxMatchingList.size() > thresholdOfNumberOfMaxMatch) {
					reduceMatchings(maxMatchingList, allProcNodesIds, allProcessedProcNodesIds);		
				}
			}
			
			if (qNodesSortedSize > 1) {
				tempMaxMatchingList = new ArrayList<Matching>();
				umQIDs = new HashSet<String>();
				isMaxUmQi = false;
				for (i = 1; i < qNodesSortedSize; i++) {
					qiID = qNodesSortedByMatchSize.get(i).getActivityID();
					qiSubgraphNIDs = querygraph.getSubgraphNodesIDsFromMap(qNodesSortedByLevel.get(i));
					tempMaxMatchingList.clear();
					tempMaxMatchingList.addAll(maxMatchingList);
					solutionStreamQi = solutionStreamMap.get(qiID);
					maxMatchSizeQi = solutionStreamQi.getMaxMatchSize();
					maxAssListQi = maxAssignListMap.get(qiID);
					maxMatchingListChanged = false;
					for (Matching mmax : maxMatchingList) {
						assMmaxList = mmax.getAssignments();						
						tempNewMatchSize = 0.0f;
						maxAssignSize = 0;
						tempUm = null;
						um1Size = 0;					
						for (Assignment um : assMmaxList) {
							if (um.containQueryNode(qiID)) {
								umqiPID = um.getProcessNodeID(qiID);
								if (umqiPID == null) {
									sizeQiPID = -1;
								} else {
									sizeQiPID = solutionStreamQi.getMaxMatchSizeOfStreamItem(umqiPID);	
								}
								isMaxUmQi = false;
								if (sizeQiPID < maxMatchSizeQi) {								
									um.getQueryNodesIDs(umQIDs);
									differenceOfSets(umQIDs, qiSubgraphNIDs, qiSubgraphNIDsComplement);
									querygraph.computeNodeIDPairs(qiSubgraphNIDsComplement, queryIDPairsForNonCommonNodes);
									qIDpairsHalfLength = queryIDPairsForNonCommonNodes.size()/2;	
									um1Size = 0;
									for (k = 0; k < qIDpairsHalfLength; k++) {
										sourceQID = queryIDPairsForNonCommonNodes.get(k*2);
										targetQID = queryIDPairsForNonCommonNodes.get(k*2 + 1);
										if ((sourceQID != null) && (targetQID != null)) {
											sourcePID = um.getProcessNodeID(sourceQID);
											targetPID = um.getProcessNodeID(targetQID);
											if ((sourcePID != null) && (targetPID != null)) {
												sourceSE = solutionStreamMap.get(sourceQID).getStreamItem(sourcePID);
												targetSE = solutionStreamMap.get(targetQID).getStreamItem(targetPID);
												if ((sourceSE != null) && (targetSE != null)) {
													if (sourceSE.isChild(targetSE)) {
														um1Size++;	
													}	
												}
											}
										}
									}					
									if (maxMatchSizeQi >= um1Size) {
										if (maxMatchSizeQi > maxAssignSize) {
											maxAssignSize = maxMatchSizeQi;
										}
									} else {
										if (um1Size > maxAssignSize) {
											maxAssignSize = um1Size;
										}
									}
									tempNewMatchSize += ((float)maxMatchSizeQi + (float)um1Size);
									tempUm = um;
								} else {
									isMaxUmQi = true;
									break;
								}
							} else {
								if (um.getAssignSize() > maxAssignSize) {
									maxAssignSize = um.getAssignSize();
								}
								tempNewMatchSize += ((float)(um.getAssignSize()));
							}
						}
						
						newMatchSimilarity = (((float)maxAssignSize + connectivityFactor * 
								(tempNewMatchSize - (float)maxAssignSize))/numberOfQueryEdges);
						if ((tempUm != null) && (!isMaxUmQi)) {
							if (newMatchSimilarity > maxSimilarity) {
								um1 = tempUm.getRestPartOfAssignmentByQueryNodesIDs(qiSubgraphNIDs, um1Size);
								maxSimilarity = newMatchSimilarity;
								tempMaxMatchingList.clear();
								for (Assignment maxAssQi : maxAssListQi) {
									newmaxAssList = new ArrayList<Assignment>();
									newmaxAssList.add(um1);
									for (Assignment assMmax : assMmaxList) {
										if (!assMmax.equals(tempUm)) {
											newmaxAssList.add(assMmax);
										}
									}
									newmaxAssList.add(maxAssQi);
									newMatch = new Matching(newMatchSimilarity, newmaxAssList);
									tempMaxMatchingList.add(newMatch);
								}
								maxMatchingListChanged = true;
							} else if (newMatchSimilarity == maxSimilarity) {
								um1 = tempUm.getRestPartOfAssignmentByQueryNodesIDs(qiSubgraphNIDs, um1Size);
								for (Assignment maxAssQi : maxAssListQi) {
									newmaxAssList = new ArrayList<Assignment>();
									newmaxAssList.add(um1);
									for (Assignment assMmax : assMmaxList) {
										if (!assMmax.equals(tempUm)) {
											newmaxAssList.add(assMmax);
										}
									}
									newmaxAssList.add(maxAssQi);
									newMatch = new Matching(newMatchSimilarity, newmaxAssList);
									tempMaxMatchingList.add(newMatch);
								}
								maxMatchingListChanged = true;
							}
						}				
					}				
					if (maxMatchingListChanged) {
						if (tempMaxMatchingList.size() > thresholdOfNumberOfMaxMatch) {
							reduceMatchings(tempMaxMatchingList, allProcNodesIds, allProcessedProcNodesIds);		
						}
						maxMatchingList.clear();
						maxMatchingList.addAll(tempMaxMatchingList);
					}
				}
			}
		}
		
		if (maxSimilarity >= minMatchingSimilarity) {
			inexactMatchings = new InexactMatchingResult(processgraph.getProcessID(), 
					processgraph.getProcessNamespace(), processgraph.getProcessName(), 
					maxMatchingList, maxSimilarity);
			printSolutions();
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
		int oldListLength = inoutputAssList.size();
		int i, j, indexCompared, indexU1,indexU2, indexUi, tempDiff, maxDiff;
		pall.clear();
		processedProcIDs.clear();
		for (Assignment ass : inoutputAssList) {
			ass.addAllProcessNodeIDs(pall);
		}
		
		// find two assignments u1, u2 (their indexes in inoutputAssList are indexU1, indexU2) 
		// in AInputList that the number of different assigned process nodes is maximal in inoutputList
		maxDiff = -1;
		indexU1 = -1;
		indexU2 = -1;
		for (i = 0; i < oldListLength; i++) {
			for (j = (i+1); j < oldListLength; j++) {
				tempDiff = inoutputAssList.get(i).getNumberOfDiffProcessNode
					(inoutputAssList.get(j));
				if (tempDiff > maxDiff) {
					maxDiff = tempDiff;
					indexU1 = i;
					indexU2 = j;
				}
			}
		}
		
		if ((indexU1 != -1)&& (indexU2 != -1)) {
			if ((indexU1 > 1)&& (indexU2 > 1)) {
				Collections.swap(inoutputAssList, 0, indexU1);
				Collections.swap(inoutputAssList, 1, indexU2);
			} else if (indexU2 > 1) {
				if (indexU1 == 0) {
					Collections.swap(inoutputAssList, 1, indexU2);
				} else if (indexU1 == 1) {
					Collections.swap(inoutputAssList, 0, indexU2);
				}
			}
			
			inoutputAssList.get(0).addAllProcessNodeIDs(processedProcIDs);
			inoutputAssList.get(1).addAllProcessNodeIDs(processedProcIDs);
			pall.removeAll(processedProcIDs);
			
			indexCompared = 1;
			while (!pall.isEmpty()) {
				indexCompared++;
				if (indexCompared >= oldListLength) {
					break;
				}
				maxDiff = -1;
				indexUi = -1;
				for (i = indexCompared; i < oldListLength; i++ ) {
					tempDiff = inoutputAssList.get(i).getNumberOfDiffProcessNode(processedProcIDs);
					if (tempDiff > maxDiff) {
						maxDiff = tempDiff;
						indexUi = i;
					}
				}
				
				if (indexUi != -1) {
					Collections.swap(inoutputAssList, indexCompared, indexUi);
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
	 * 
	 */
	public void reduceMatchings(List<Matching> inoutputMatchList, Set<String> pall, Set<String> processedProcIDs) {
		int oldListLength = inoutputMatchList.size();
		int i, j, indexCompared, indexU1,indexU2, indexUi, tempDiff, maxDiff;
		List<Assignment> assList;
		
		pall.clear();
		processedProcIDs.clear();
		for (Matching mac : inoutputMatchList) {
			assList = mac.getAssignments();
			for (Assignment ass : assList) {
				ass.addAllProcessNodeIDs(pall);
			}	
		}
		
		// find two assignments u1, u2 (their indexes in inoutputAssList are indexU1, indexU2) 
		// in AInputList that the number of different assigned process nodes is maximal in inoutputList
		maxDiff = -1;
		indexU1 = -1;
		indexU2 = -1;
		for (i = 0; i < oldListLength; i++) {
			for (j = (i+1); j < oldListLength; j++) {
				tempDiff = inoutputMatchList.get(i).getNumberOfDiffProcessNode
					(inoutputMatchList.get(j));
				if (tempDiff > maxDiff) {
					maxDiff = tempDiff;
					indexU1 = i;
					indexU2 = j;
				}
			}
		}
		
		if ((indexU1 != -1)&& (indexU2 != -1)) {
			if ((indexU1 > 1)&& (indexU2 > 1)) {
				Collections.swap(inoutputMatchList, 0, indexU1);
				Collections.swap(inoutputMatchList, 1, indexU2);
			} else if (indexU2 > 1) {
				if (indexU1 == 0) {
					Collections.swap(inoutputMatchList, 1, indexU2);
				} else if (indexU1 == 1) {
					Collections.swap(inoutputMatchList, 0, indexU2);
				}
			}
			
			inoutputMatchList.get(0).addAllProcessNodeIDs(processedProcIDs);
			inoutputMatchList.get(1).addAllProcessNodeIDs(processedProcIDs);
			pall.removeAll(processedProcIDs);
			
			indexCompared = 1;
			while (!pall.isEmpty()) {
				indexCompared++;
				if (indexCompared >= oldListLength) {
					break;
				}
				maxDiff = -1;
				indexUi = -1;
				for (i = indexCompared; i < oldListLength; i++ ) {
					tempDiff = inoutputMatchList.get(i).getNumberOfDiffProcessNode(processedProcIDs);
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
		List<Matching> matchList = inexactMatchings.getMatchings();
		result = "process ID: " + inexactMatchings.getProcessID() + 
		"  process namespace: " + inexactMatchings.getProcessNamespace() + 
		"  process name: " + inexactMatchings.getProcessName() + 
		" matches query with matchingsimilarity " + inexactMatchings.getMatchingSimilarity()
		+ " has " + matchList.size() + " matchings: ";		
		for (Matching match : matchList) {
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
	
	public QueryGraph getQuerygraph() {
		return querygraph;
	}
	
	public void setQuerygraph(QueryGraph querygraph) {
		this.querygraph = querygraph;
	}
	
	public ProcessFlowGraph getProcessgraph() {
		return processgraph;
	}
	
	public void setProcessgraph(ProcessFlowGraph processgraph) {
		this.processgraph = processgraph;
	}
	
	public float getMinMatchingSimilarity() {
		return minMatchingSimilarity;
	}

	public void setMinMatchingSimilarity(float minMatchingSimilarity) {
		this.minMatchingSimilarity = minMatchingSimilarity;
	}

	public InexactMatchingResult getInexactMatchingResult() {
		return inexactMatchings;
	}

	public void setInexactMatchingResult(InexactMatchingResult inexactMatchings) {
		this.inexactMatchings = inexactMatchings;
	}

	public Map<String, List<Assignment>> getTempMaxAssignSetMap() {
		return tempMaxAssignSetMap;
	}

	public void setTempMaxAssignSetMap(
			Map<String, List<Assignment>> tempMaxAssignSetMap) {
		this.tempMaxAssignSetMap = tempMaxAssignSetMap;
	}

	public Map<String, List<Assignment>> getMaxAssignSetMap() {
		return maxAssignListMap;
	}

	public void setMaxAssignSetMap(Map<String, List<Assignment>> maxAssignSetMap) {
		this.maxAssignListMap = maxAssignSetMap;
	}
}
