/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Alarm Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getFor <em>For</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getUntil <em>Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery <em>Repeat Every</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery1 <em>Repeat Every1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnAlarmEvent()
 * @model extendedMetaData="name='tOnAlarmEvent' kind='elementOnly'"
 * @generated
 */
public interface OnAlarmEvent extends ExtensibleElements {
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnAlarmEvent_For()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='for' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationExpr getFor();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(DurationExpr value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnAlarmEvent_Until()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='until' namespace='##targetNamespace'"
	 * @generated
	 */
	DeadlineExpr getUntil();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getUntil <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' containment reference.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(DeadlineExpr value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnAlarmEvent_RepeatEvery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatEvery' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationExpr getRepeatEvery();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery <em>Repeat Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Every</em>' containment reference.
	 * @see #getRepeatEvery()
	 * @generated
	 */
	void setRepeatEvery(DurationExpr value);

	/**
	 * Returns the value of the '<em><b>Repeat Every1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Every1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Every1</em>' containment reference.
	 * @see #setRepeatEvery1(DurationExpr)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnAlarmEvent_RepeatEvery1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatEvery' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationExpr getRepeatEvery1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery1 <em>Repeat Every1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Every1</em>' containment reference.
	 * @see #getRepeatEvery1()
	 * @generated
	 */
	void setRepeatEvery1(DurationExpr value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnAlarmEvent_Scope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // OnAlarmEvent
