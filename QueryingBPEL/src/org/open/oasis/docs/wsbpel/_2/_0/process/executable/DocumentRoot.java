/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatchAll <em>Catch All</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSet <em>Correlation Set</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElse <em>Else</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElseif <em>Elseif</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionAssignOperation <em>Extension Assign Operation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFinalCounterValue <em>Final Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFor <em>For</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFrom <em>From</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromPart <em>From Part</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getJoinCondition <em>Join Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLink <em>Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLinks <em>Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchange <em>Message Exchange</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnEvent <em>On Event</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnMessage <em>On Message</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLinks <em>Partner Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getQuery <em>Query</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatEvery <em>Repeat Every</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSources <em>Sources</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getStartCounterValue <em>Start Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTarget <em>Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTerminationHandler <em>Termination Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTo <em>To</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToPart <em>To Part</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToParts <em>To Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getUntil <em>Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' containment reference.
	 * @see #setAssign(Assign)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Assign()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assign' namespace='##targetNamespace'"
	 * @generated
	 */
	Assign getAssign();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getAssign <em>Assign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign</em>' containment reference.
	 * @see #getAssign()
	 * @generated
	 */
	void setAssign(Assign value);

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference.
	 * @see #setBranches(Branches)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Branches()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='branches' namespace='##targetNamespace'"
	 * @generated
	 */
	Branches getBranches();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getBranches <em>Branches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches</em>' containment reference.
	 * @see #getBranches()
	 * @generated
	 */
	void setBranches(Branches value);

	/**
	 * Returns the value of the '<em><b>Catch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This element can contain all activities including the activities
	 * 				compensate, compensateScope and rethrow.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catch</em>' containment reference.
	 * @see #setCatch(Catch)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Catch()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='catch' namespace='##targetNamespace'"
	 * @generated
	 */
	Catch getCatch();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatch <em>Catch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch</em>' containment reference.
	 * @see #getCatch()
	 * @generated
	 */
	void setCatch(Catch value);

	/**
	 * Returns the value of the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This element can contain all activities including the activities
	 * 				compensate, compensateScope and rethrow.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catch All</em>' containment reference.
	 * @see #setCatchAll(ActivityContainer)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_CatchAll()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='catchAll' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityContainer getCatchAll();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatchAll <em>Catch All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch All</em>' containment reference.
	 * @see #getCatchAll()
	 * @generated
	 */
	void setCatchAll(ActivityContainer value);

	/**
	 * Returns the value of the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensate</em>' containment reference.
	 * @see #setCompensate(Compensate)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Compensate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compensate' namespace='##targetNamespace'"
	 * @generated
	 */
	Compensate getCompensate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensate <em>Compensate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensate</em>' containment reference.
	 * @see #getCompensate()
	 * @generated
	 */
	void setCompensate(Compensate value);

	/**
	 * Returns the value of the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensate Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensate Scope</em>' containment reference.
	 * @see #setCompensateScope(CompensateScope)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_CompensateScope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compensateScope' namespace='##targetNamespace'"
	 * @generated
	 */
	CompensateScope getCompensateScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensateScope <em>Compensate Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensate Scope</em>' containment reference.
	 * @see #getCompensateScope()
	 * @generated
	 */
	void setCompensateScope(CompensateScope value);

	/**
	 * Returns the value of the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This element can contain all activities including the activities
	 * 				compensate and compensateScope.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compensation Handler</em>' containment reference.
	 * @see #setCompensationHandler(ActivityContainer)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_CompensationHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compensationHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityContainer getCompensationHandler();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensationHandler <em>Compensation Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Handler</em>' containment reference.
	 * @see #getCompensationHandler()
	 * @generated
	 */
	void setCompensationHandler(ActivityContainer value);

	/**
	 * Returns the value of the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Condition</em>' containment reference.
	 * @see #setCompletionCondition(CompletionCondition)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_CompletionCondition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='completionCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	CompletionCondition getCompletionCondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompletionCondition <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Condition</em>' containment reference.
	 * @see #getCompletionCondition()
	 * @generated
	 */
	void setCompletionCondition(CompletionCondition value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExpr)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Condition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExpr getCondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Copy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy</em>' containment reference.
	 * @see #setCopy(Copy)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Copy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copy' namespace='##targetNamespace'"
	 * @generated
	 */
	Copy getCopy();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCopy <em>Copy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' containment reference.
	 * @see #getCopy()
	 * @generated
	 */
	void setCopy(Copy value);

	/**
	 * Returns the value of the '<em><b>Correlation Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Set</em>' containment reference.
	 * @see #setCorrelationSet(CorrelationSet)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_CorrelationSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='correlationSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CorrelationSet getCorrelationSet();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSet <em>Correlation Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Set</em>' containment reference.
	 * @see #getCorrelationSet()
	 * @generated
	 */
	void setCorrelationSet(CorrelationSet value);

	/**
	 * Returns the value of the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Sets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Sets</em>' containment reference.
	 * @see #setCorrelationSets(CorrelationSets)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_CorrelationSets()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='correlationSets' namespace='##targetNamespace'"
	 * @generated
	 */
	CorrelationSets getCorrelationSets();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSets <em>Correlation Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Sets</em>' containment reference.
	 * @see #getCorrelationSets()
	 * @generated
	 */
	void setCorrelationSets(CorrelationSets value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Documentation)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Documentation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Documentation getDocumentation();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Documentation value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(ActivityContainer)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Else()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='else' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityContainer getElse();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ActivityContainer value);

	/**
	 * Returns the value of the '<em><b>Elseif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elseif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif</em>' containment reference.
	 * @see #setElseif(Elseif)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Elseif()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elseif' namespace='##targetNamespace'"
	 * @generated
	 */
	Elseif getElseif();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElseif <em>Elseif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elseif</em>' containment reference.
	 * @see #getElseif()
	 * @generated
	 */
	void setElseif(Elseif value);

	/**
	 * Returns the value of the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty</em>' containment reference.
	 * @see #setEmpty(Empty)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Empty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='empty' namespace='##targetNamespace'"
	 * @generated
	 */
	Empty getEmpty();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEmpty <em>Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty</em>' containment reference.
	 * @see #getEmpty()
	 * @generated
	 */
	void setEmpty(Empty value);

	/**
	 * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Handlers</em>' containment reference.
	 * @see #setEventHandlers(EventHandlers)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_EventHandlers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='eventHandlers' namespace='##targetNamespace'"
	 * @generated
	 */
	EventHandlers getEventHandlers();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEventHandlers <em>Event Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Handlers</em>' containment reference.
	 * @see #getEventHandlers()
	 * @generated
	 */
	void setEventHandlers(EventHandlers value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Exit)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Exit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exit' namespace='##targetNamespace'"
	 * @generated
	 */
	Exit getExit();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Exit value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(Extension)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Extension()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	Extension getExtension();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Extension value);

	/**
	 * Returns the value of the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Activity</em>' containment reference.
	 * @see #setExtensionActivity(ExtensionActivity)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_ExtensionActivity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensionActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionActivity getExtensionActivity();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionActivity <em>Extension Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Activity</em>' containment reference.
	 * @see #getExtensionActivity()
	 * @generated
	 */
	void setExtensionActivity(ExtensionActivity value);

	/**
	 * Returns the value of the '<em><b>Extension Assign Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Assign Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Assign Operation</em>' containment reference.
	 * @see #setExtensionAssignOperation(ExtensionAssignOperation)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_ExtensionAssignOperation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensionAssignOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionAssignOperation getExtensionAssignOperation();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionAssignOperation <em>Extension Assign Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Assign Operation</em>' containment reference.
	 * @see #getExtensionAssignOperation()
	 * @generated
	 */
	void setExtensionAssignOperation(ExtensionAssignOperation value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(Extensions)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Extensions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	Extensions getExtensions();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(Extensions value);

	/**
	 * Returns the value of the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Handlers</em>' containment reference.
	 * @see #setFaultHandlers(FaultHandlers)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_FaultHandlers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='faultHandlers' namespace='##targetNamespace'"
	 * @generated
	 */
	FaultHandlers getFaultHandlers();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFaultHandlers <em>Fault Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Handlers</em>' containment reference.
	 * @see #getFaultHandlers()
	 * @generated
	 */
	void setFaultHandlers(FaultHandlers value);

	/**
	 * Returns the value of the '<em><b>Final Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Counter Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Counter Value</em>' containment reference.
	 * @see #setFinalCounterValue(Expression)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_FinalCounterValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='finalCounterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getFinalCounterValue();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFinalCounterValue <em>Final Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Counter Value</em>' containment reference.
	 * @see #getFinalCounterValue()
	 * @generated
	 */
	void setFinalCounterValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference.
	 * @see #setFlow(Flow)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Flow()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='flow' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getFlow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFlow <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' containment reference.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(Flow value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(DurationExpr)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_For()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='for' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationExpr getFor();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(DurationExpr value);

	/**
	 * Returns the value of the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Each</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Each</em>' containment reference.
	 * @see #setForEach(ForEach)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_ForEach()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='forEach' namespace='##targetNamespace'"
	 * @generated
	 */
	ForEach getForEach();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getForEach <em>For Each</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' containment reference.
	 * @see #getForEach()
	 * @generated
	 */
	void setForEach(ForEach value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(From)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_From()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	From getFrom();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(From value);

	/**
	 * Returns the value of the '<em><b>From Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Part</em>' containment reference.
	 * @see #setFromPart(FromPart)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_FromPart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fromPart' namespace='##targetNamespace'"
	 * @generated
	 */
	FromPart getFromPart();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromPart <em>From Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Part</em>' containment reference.
	 * @see #getFromPart()
	 * @generated
	 */
	void setFromPart(FromPart value);

	/**
	 * Returns the value of the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Parts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Parts</em>' containment reference.
	 * @see #setFromParts(FromParts)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_FromParts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fromParts' namespace='##targetNamespace'"
	 * @generated
	 */
	FromParts getFromParts();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromParts <em>From Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Parts</em>' containment reference.
	 * @see #getFromParts()
	 * @generated
	 */
	void setFromParts(FromParts value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(If)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_If()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace'"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference.
	 * @see #setImport(Import)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Import()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getImport <em>Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' containment reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoke</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke</em>' containment reference.
	 * @see #setInvoke(Invoke)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Invoke()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='invoke' namespace='##targetNamespace'"
	 * @generated
	 */
	Invoke getInvoke();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getInvoke <em>Invoke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke</em>' containment reference.
	 * @see #getInvoke()
	 * @generated
	 */
	void setInvoke(Invoke value);

	/**
	 * Returns the value of the '<em><b>Join Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Condition</em>' containment reference.
	 * @see #setJoinCondition(Condition)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_JoinCondition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='joinCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getJoinCondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getJoinCondition <em>Join Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Condition</em>' containment reference.
	 * @see #getJoinCondition()
	 * @generated
	 */
	void setJoinCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Link)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Link()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference.
	 * @see #setLinks(Links)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Links()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='links' namespace='##targetNamespace'"
	 * @generated
	 */
	Links getLinks();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLinks <em>Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links</em>' containment reference.
	 * @see #getLinks()
	 * @generated
	 */
	void setLinks(Links value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(Literal)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Literal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literal' namespace='##targetNamespace'"
	 * @generated
	 */
	Literal getLiteral();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(Literal value);

	/**
	 * Returns the value of the '<em><b>Message Exchange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Exchange</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchange</em>' containment reference.
	 * @see #setMessageExchange(MessageExchange)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_MessageExchange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='messageExchange' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageExchange getMessageExchange();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchange <em>Message Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange</em>' containment reference.
	 * @see #getMessageExchange()
	 * @generated
	 */
	void setMessageExchange(MessageExchange value);

	/**
	 * Returns the value of the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Exchanges</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchanges</em>' containment reference.
	 * @see #setMessageExchanges(MessageExchanges)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_MessageExchanges()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='messageExchanges' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageExchanges getMessageExchanges();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchanges <em>Message Exchanges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchanges</em>' containment reference.
	 * @see #getMessageExchanges()
	 * @generated
	 */
	void setMessageExchanges(MessageExchanges value);

	/**
	 * Returns the value of the '<em><b>On Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Event</em>' containment reference.
	 * @see #setOnEvent(OnEvent)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_OnEvent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	OnEvent getOnEvent();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnEvent <em>On Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Event</em>' containment reference.
	 * @see #getOnEvent()
	 * @generated
	 */
	void setOnEvent(OnEvent value);

	/**
	 * Returns the value of the '<em><b>On Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Message</em>' containment reference.
	 * @see #setOnMessage(OnMessage)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_OnMessage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	OnMessage getOnMessage();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnMessage <em>On Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Message</em>' containment reference.
	 * @see #getOnMessage()
	 * @generated
	 */
	void setOnMessage(OnMessage value);

	/**
	 * Returns the value of the '<em><b>Partner Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link</em>' containment reference.
	 * @see #setPartnerLink(PartnerLink)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_PartnerLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partnerLink' namespace='##targetNamespace'"
	 * @generated
	 */
	PartnerLink getPartnerLink();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLink <em>Partner Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link</em>' containment reference.
	 * @see #getPartnerLink()
	 * @generated
	 */
	void setPartnerLink(PartnerLink value);

	/**
	 * Returns the value of the '<em><b>Partner Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Links</em>' containment reference.
	 * @see #setPartnerLinks(PartnerLinks)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_PartnerLinks()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partnerLinks' namespace='##targetNamespace'"
	 * @generated
	 */
	PartnerLinks getPartnerLinks();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLinks <em>Partner Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Links</em>' containment reference.
	 * @see #getPartnerLinks()
	 * @generated
	 */
	void setPartnerLinks(PartnerLinks value);

	/**
	 * Returns the value of the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick</em>' containment reference.
	 * @see #setPick(Pick)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Pick()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pick' namespace='##targetNamespace'"
	 * @generated
	 */
	Pick getPick();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPick <em>Pick</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick</em>' containment reference.
	 * @see #getPick()
	 * @generated
	 */
	void setPick(Pick value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This is the root element for a WS-BPEL 2.0 process.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(org.open.oasis.docs.wsbpel._2._0.process.executable.Process)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Process()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Process getProcess();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.open.oasis.docs.wsbpel._2._0.process.executable.Process value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Query()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive</em>' containment reference.
	 * @see #setReceive(Receive)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Receive()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='receive' namespace='##targetNamespace'"
	 * @generated
	 */
	Receive getReceive();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReceive <em>Receive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive</em>' containment reference.
	 * @see #getReceive()
	 * @generated
	 */
	void setReceive(Receive value);

	/**
	 * Returns the value of the '<em><b>Repeat Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Every</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Every</em>' containment reference.
	 * @see #setRepeatEvery(DurationExpr)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_RepeatEvery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='repeatEvery' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationExpr getRepeatEvery();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatEvery <em>Repeat Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Every</em>' containment reference.
	 * @see #getRepeatEvery()
	 * @generated
	 */
	void setRepeatEvery(DurationExpr value);

	/**
	 * Returns the value of the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Until</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Until</em>' containment reference.
	 * @see #setRepeatUntil(RepeatUntil)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_RepeatUntil()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='repeatUntil' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatUntil getRepeatUntil();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatUntil <em>Repeat Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Until</em>' containment reference.
	 * @see #getRepeatUntil()
	 * @generated
	 */
	void setRepeatUntil(RepeatUntil value);

	/**
	 * Returns the value of the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply</em>' containment reference.
	 * @see #setReply(Reply)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Reply()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reply' namespace='##targetNamespace'"
	 * @generated
	 */
	Reply getReply();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReply <em>Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply</em>' containment reference.
	 * @see #getReply()
	 * @generated
	 */
	void setReply(Reply value);

	/**
	 * Returns the value of the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rethrow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rethrow</em>' containment reference.
	 * @see #setRethrow(Rethrow)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Rethrow()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rethrow' namespace='##targetNamespace'"
	 * @generated
	 */
	Rethrow getRethrow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRethrow <em>Rethrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rethrow</em>' containment reference.
	 * @see #getRethrow()
	 * @generated
	 */
	void setRethrow(Rethrow value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Scope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(Sequence)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Sequence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	Sequence getSequence();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(Sequence value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Source()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference.
	 * @see #setSources(Sources)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Sources()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sources' namespace='##targetNamespace'"
	 * @generated
	 */
	Sources getSources();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSources <em>Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sources</em>' containment reference.
	 * @see #getSources()
	 * @generated
	 */
	void setSources(Sources value);

	/**
	 * Returns the value of the '<em><b>Start Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Counter Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Counter Value</em>' containment reference.
	 * @see #setStartCounterValue(Expression)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_StartCounterValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='startCounterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getStartCounterValue();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getStartCounterValue <em>Start Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Counter Value</em>' containment reference.
	 * @see #getStartCounterValue()
	 * @generated
	 */
	void setStartCounterValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Target()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference.
	 * @see #setTargets(Targets)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Targets()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='targets' namespace='##targetNamespace'"
	 * @generated
	 */
	Targets getTargets();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTargets <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' containment reference.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(Targets value);

	/**
	 * Returns the value of the '<em><b>Termination Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This element can contain all activities including the activities
	 * 				compensate and compensateScope.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Termination Handler</em>' containment reference.
	 * @see #setTerminationHandler(ActivityContainer)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_TerminationHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='terminationHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityContainer getTerminationHandler();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTerminationHandler <em>Termination Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Handler</em>' containment reference.
	 * @see #getTerminationHandler()
	 * @generated
	 */
	void setTerminationHandler(ActivityContainer value);

	/**
	 * Returns the value of the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throw</em>' containment reference.
	 * @see #setThrow(Throw)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Throw()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throw' namespace='##targetNamespace'"
	 * @generated
	 */
	Throw getThrow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getThrow <em>Throw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throw</em>' containment reference.
	 * @see #getThrow()
	 * @generated
	 */
	void setThrow(Throw value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(To)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_To()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	To getTo();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(To value);

	/**
	 * Returns the value of the '<em><b>To Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Part</em>' containment reference.
	 * @see #setToPart(ToPart)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_ToPart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toPart' namespace='##targetNamespace'"
	 * @generated
	 */
	ToPart getToPart();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToPart <em>To Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Part</em>' containment reference.
	 * @see #getToPart()
	 * @generated
	 */
	void setToPart(ToPart value);

	/**
	 * Returns the value of the '<em><b>To Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Parts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Parts</em>' containment reference.
	 * @see #setToParts(ToParts)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_ToParts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toParts' namespace='##targetNamespace'"
	 * @generated
	 */
	ToParts getToParts();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToParts <em>To Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Parts</em>' containment reference.
	 * @see #getToParts()
	 * @generated
	 */
	void setToParts(ToParts value);

	/**
	 * Returns the value of the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Condition</em>' containment reference.
	 * @see #setTransitionCondition(Condition)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_TransitionCondition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transitionCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getTransitionCondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTransitionCondition <em>Transition Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Condition</em>' containment reference.
	 * @see #getTransitionCondition()
	 * @generated
	 */
	void setTransitionCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' containment reference.
	 * @see #setUntil(DeadlineExpr)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Until()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='until' namespace='##targetNamespace'"
	 * @generated
	 */
	DeadlineExpr getUntil();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getUntil <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' containment reference.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(DeadlineExpr value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference.
	 * @see #setValidate(Validate)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Validate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace'"
	 * @generated
	 */
	Validate getValidate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getValidate <em>Validate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' containment reference.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(Validate value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Variable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference.
	 * @see #setVariables(Variables)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Variables()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variables' namespace='##targetNamespace'"
	 * @generated
	 */
	Variables getVariables();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariables <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' containment reference.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(Variables value);

	/**
	 * Returns the value of the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait</em>' containment reference.
	 * @see #setWait(Wait)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_Wait()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wait' namespace='##targetNamespace'"
	 * @generated
	 */
	Wait getWait();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWait <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait</em>' containment reference.
	 * @see #getWait()
	 * @generated
	 */
	void setWait(Wait value);

	/**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(While)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getDocumentRoot_While()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='while' namespace='##targetNamespace'"
	 * @generated
	 */
	While getWhile();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(While value);

} // DocumentRoot
