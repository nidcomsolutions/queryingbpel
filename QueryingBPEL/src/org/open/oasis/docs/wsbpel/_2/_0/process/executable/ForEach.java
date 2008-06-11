/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getStartCounterValue <em>Start Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getFinalCounterValue <em>Final Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCounterName <em>Counter Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getParallel <em>Parallel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getForEach()
 * @model extendedMetaData="name='tForEach' kind='elementOnly'"
 * @generated
 */
public interface ForEach extends Activity {
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getForEach_StartCounterValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startCounterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getStartCounterValue();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getStartCounterValue <em>Start Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Counter Value</em>' containment reference.
	 * @see #getStartCounterValue()
	 * @generated
	 */
	void setStartCounterValue(Expression value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getForEach_FinalCounterValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='finalCounterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getFinalCounterValue();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getFinalCounterValue <em>Final Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Counter Value</em>' containment reference.
	 * @see #getFinalCounterValue()
	 * @generated
	 */
	void setFinalCounterValue(Expression value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getForEach_CompletionCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='completionCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	CompletionCondition getCompletionCondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCompletionCondition <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Condition</em>' containment reference.
	 * @see #getCompletionCondition()
	 * @generated
	 */
	void setCompletionCondition(CompletionCondition value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getForEach_Scope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Counter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Name</em>' attribute.
	 * @see #setCounterName(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getForEach_CounterName()
	 * @model dataType="org.open.oasis.docs.wsbpel._2._0.process.executable.BPELVariableName" required="true"
	 *        extendedMetaData="kind='attribute' name='counterName'"
	 * @generated
	 */
	String getCounterName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCounterName <em>Counter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Name</em>' attribute.
	 * @see #getCounterName()
	 * @generated
	 */
	void setCounterName(String value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * The default value is <code>"yes"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetParallel()
	 * @see #unsetParallel()
	 * @see #setParallel(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getForEach_Parallel()
	 * @model default="yes" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='parallel'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getParallel();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetParallel()
	 * @see #unsetParallel()
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParallel()
	 * @see #getParallel()
	 * @see #setParallel(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetParallel();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getParallel <em>Parallel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parallel</em>' attribute is set.
	 * @see #unsetParallel()
	 * @see #getParallel()
	 * @see #setParallel(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetParallel();

} // ForEach
