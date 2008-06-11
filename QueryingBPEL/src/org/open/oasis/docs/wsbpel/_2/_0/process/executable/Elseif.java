/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elseif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif()
 * @model extendedMetaData="name='tElseif' kind='elementOnly'"
 * @generated
 */
public interface Elseif extends ExtensibleElements {
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExpr getCondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanExpr value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Assign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assign' namespace='##targetNamespace'"
	 * @generated
	 */
	Assign getAssign();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getAssign <em>Assign</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Compensate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compensate' namespace='##targetNamespace'"
	 * @generated
	 */
	Compensate getCompensate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensate <em>Compensate</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_CompensateScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compensateScope' namespace='##targetNamespace'"
	 * @generated
	 */
	CompensateScope getCompensateScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensateScope <em>Compensate Scope</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Empty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='empty' namespace='##targetNamespace'"
	 * @generated
	 */
	Empty getEmpty();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getEmpty <em>Empty</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Exit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exit' namespace='##targetNamespace'"
	 * @generated
	 */
	Exit getExit();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExit <em>Exit</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_ExtensionActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensionActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionActivity getExtensionActivity();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExtensionActivity <em>Extension Activity</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Flow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flow' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getFlow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getFlow <em>Flow</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_ForEach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='forEach' namespace='##targetNamespace'"
	 * @generated
	 */
	ForEach getForEach();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getForEach <em>For Each</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_If()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace'"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getIf <em>If</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Invoke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='invoke' namespace='##targetNamespace'"
	 * @generated
	 */
	Invoke getInvoke();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getInvoke <em>Invoke</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Pick()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pick' namespace='##targetNamespace'"
	 * @generated
	 */
	Pick getPick();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getPick <em>Pick</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Receive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receive' namespace='##targetNamespace'"
	 * @generated
	 */
	Receive getReceive();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReceive <em>Receive</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_RepeatUntil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatUntil' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatUntil getRepeatUntil();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRepeatUntil <em>Repeat Until</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Reply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reply' namespace='##targetNamespace'"
	 * @generated
	 */
	Reply getReply();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReply <em>Reply</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Rethrow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rethrow' namespace='##targetNamespace'"
	 * @generated
	 */
	Rethrow getRethrow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRethrow <em>Rethrow</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getScope <em>Scope</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	Sequence getSequence();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getSequence <em>Sequence</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Throw()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='throw' namespace='##targetNamespace'"
	 * @generated
	 */
	Throw getThrow();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getThrow <em>Throw</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Validate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace'"
	 * @generated
	 */
	Validate getValidate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getValidate <em>Validate</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_Wait()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wait' namespace='##targetNamespace'"
	 * @generated
	 */
	Wait getWait();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWait <em>Wait</em>}' containment reference.
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getElseif_While()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='while' namespace='##targetNamespace'"
	 * @generated
	 */
	While getWhile();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(While value);

} // Elseif
