/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCompletionCondition()
 * @model extendedMetaData="name='tCompletionCondition' kind='elementOnly'"
 * @generated
 */
public interface CompletionCondition extends ExtensibleElements {
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCompletionCondition_Branches()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='branches' namespace='##targetNamespace'"
	 * @generated
	 */
	Branches getBranches();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition#getBranches <em>Branches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches</em>' containment reference.
	 * @see #getBranches()
	 * @generated
	 */
	void setBranches(Branches value);

} // CompletionCondition
