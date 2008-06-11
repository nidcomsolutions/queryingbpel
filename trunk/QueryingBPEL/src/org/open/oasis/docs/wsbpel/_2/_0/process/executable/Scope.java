/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				There is no schema-level default for "exitOnStandardFault"
 * 				at "scope". Because, it will inherit default from enclosing scope
 * 				or process.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPartnerLinks <em>Partner Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getTerminationHandler <em>Termination Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWhile <em>While</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIsolated <em>Isolated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope()
 * @model extendedMetaData="name='tScope' kind='elementOnly'"
 * @generated
 */
public interface Scope extends Activity {
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_PartnerLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partnerLinks' namespace='##targetNamespace'"
	 * @generated
	 */
	PartnerLinks getPartnerLinks();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPartnerLinks <em>Partner Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Links</em>' containment reference.
	 * @see #getPartnerLinks()
	 * @generated
	 */
	void setPartnerLinks(PartnerLinks value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_MessageExchanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='messageExchanges' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageExchanges getMessageExchanges();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getMessageExchanges <em>Message Exchanges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchanges</em>' containment reference.
	 * @see #getMessageExchanges()
	 * @generated
	 */
	void setMessageExchanges(MessageExchanges value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Variables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variables' namespace='##targetNamespace'"
	 * @generated
	 */
	Variables getVariables();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getVariables <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' containment reference.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(Variables value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_CorrelationSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correlationSets' namespace='##targetNamespace'"
	 * @generated
	 */
	CorrelationSets getCorrelationSets();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCorrelationSets <em>Correlation Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Sets</em>' containment reference.
	 * @see #getCorrelationSets()
	 * @generated
	 */
	void setCorrelationSets(CorrelationSets value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_FaultHandlers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='faultHandlers' namespace='##targetNamespace'"
	 * @generated
	 */
	FaultHandlers getFaultHandlers();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFaultHandlers <em>Fault Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Handlers</em>' containment reference.
	 * @see #getFaultHandlers()
	 * @generated
	 */
	void setFaultHandlers(FaultHandlers value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_CompensationHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compensationHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityContainer getCompensationHandler();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensationHandler <em>Compensation Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Handler</em>' containment reference.
	 * @see #getCompensationHandler()
	 * @generated
	 */
	void setCompensationHandler(ActivityContainer value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_TerminationHandler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='terminationHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityContainer getTerminationHandler();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getTerminationHandler <em>Termination Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Handler</em>' containment reference.
	 * @see #getTerminationHandler()
	 * @generated
	 */
	void setTerminationHandler(ActivityContainer value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_EventHandlers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventHandlers' namespace='##targetNamespace'"
	 * @generated
	 */
	EventHandlers getEventHandlers();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEventHandlers <em>Event Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Handlers</em>' containment reference.
	 * @see #getEventHandlers()
	 * @generated
	 */
	void setEventHandlers(EventHandlers value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Assign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assign' namespace='##targetNamespace'"
	 * @generated
	 */
	Assign getAssign();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getAssign <em>Assign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign</em>' containment reference.
	 * @see #getAssign()
	 * @generated
	 */
	void setAssign(Assign value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Compensate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compensate' namespace='##targetNamespace'"
	 * @generated
	 */
	Compensate getCompensate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensate <em>Compensate</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_CompensateScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compensateScope' namespace='##targetNamespace'"
	 * @generated
	 */
	CompensateScope getCompensateScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensateScope <em>Compensate Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensate Scope</em>' containment reference.
	 * @see #getCompensateScope()
	 * @generated
	 */
	void setCompensateScope(CompensateScope value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Empty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='empty' namespace='##targetNamespace'"
	 * @generated
	 */
	Empty getEmpty();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEmpty <em>Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty</em>' containment reference.
	 * @see #getEmpty()
	 * @generated
	 */
	void setEmpty(Empty value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Exit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exit' namespace='##targetNamespace'"
	 * @generated
	 */
	Exit getExit();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Exit value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_ExtensionActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensionActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionActivity getExtensionActivity();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExtensionActivity <em>Extension Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Activity</em>' containment reference.
	 * @see #getExtensionActivity()
	 * @generated
	 */
	void setExtensionActivity(ExtensionActivity value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Flow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flow' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getFlow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFlow <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' containment reference.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(Flow value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_ForEach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='forEach' namespace='##targetNamespace'"
	 * @generated
	 */
	ForEach getForEach();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getForEach <em>For Each</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' containment reference.
	 * @see #getForEach()
	 * @generated
	 */
	void setForEach(ForEach value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_If()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace'"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Invoke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='invoke' namespace='##targetNamespace'"
	 * @generated
	 */
	Invoke getInvoke();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getInvoke <em>Invoke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke</em>' containment reference.
	 * @see #getInvoke()
	 * @generated
	 */
	void setInvoke(Invoke value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Pick()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pick' namespace='##targetNamespace'"
	 * @generated
	 */
	Pick getPick();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPick <em>Pick</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick</em>' containment reference.
	 * @see #getPick()
	 * @generated
	 */
	void setPick(Pick value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Receive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receive' namespace='##targetNamespace'"
	 * @generated
	 */
	Receive getReceive();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReceive <em>Receive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive</em>' containment reference.
	 * @see #getReceive()
	 * @generated
	 */
	void setReceive(Receive value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_RepeatUntil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatUntil' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatUntil getRepeatUntil();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRepeatUntil <em>Repeat Until</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Reply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reply' namespace='##targetNamespace'"
	 * @generated
	 */
	Reply getReply();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReply <em>Reply</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Rethrow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rethrow' namespace='##targetNamespace'"
	 * @generated
	 */
	Rethrow getRethrow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRethrow <em>Rethrow</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getScope <em>Scope</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	Sequence getSequence();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(Sequence value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Throw()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='throw' namespace='##targetNamespace'"
	 * @generated
	 */
	Throw getThrow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getThrow <em>Throw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throw</em>' containment reference.
	 * @see #getThrow()
	 * @generated
	 */
	void setThrow(Throw value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Validate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace'"
	 * @generated
	 */
	Validate getValidate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getValidate <em>Validate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' containment reference.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(Validate value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Wait()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wait' namespace='##targetNamespace'"
	 * @generated
	 */
	Wait getWait();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWait <em>Wait</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_While()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='while' namespace='##targetNamespace'"
	 * @generated
	 */
	While getWhile();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(While value);

	/**
	 * Returns the value of the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * The default value is <code>"yes"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit On Standard Fault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit On Standard Fault</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetExitOnStandardFault()
	 * @see #unsetExitOnStandardFault()
	 * @see #setExitOnStandardFault(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_ExitOnStandardFault()
	 * @model default="yes" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='exitOnStandardFault'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getExitOnStandardFault();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit On Standard Fault</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetExitOnStandardFault()
	 * @see #unsetExitOnStandardFault()
	 * @see #getExitOnStandardFault()
	 * @generated
	 */
	void setExitOnStandardFault(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExitOnStandardFault()
	 * @see #getExitOnStandardFault()
	 * @see #setExitOnStandardFault(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetExitOnStandardFault();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exit On Standard Fault</em>' attribute is set.
	 * @see #unsetExitOnStandardFault()
	 * @see #getExitOnStandardFault()
	 * @see #setExitOnStandardFault(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetExitOnStandardFault();

	/**
	 * Returns the value of the '<em><b>Isolated</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetIsolated()
	 * @see #unsetIsolated()
	 * @see #setIsolated(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getScope_Isolated()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='isolated'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getIsolated();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIsolated <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolated</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetIsolated()
	 * @see #unsetIsolated()
	 * @see #getIsolated()
	 * @generated
	 */
	void setIsolated(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIsolated <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsolated()
	 * @see #getIsolated()
	 * @see #setIsolated(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetIsolated();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIsolated <em>Isolated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isolated</em>' attribute is set.
	 * @see #unsetIsolated()
	 * @see #getIsolated()
	 * @see #setIsolated(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetIsolated();

} // Scope
