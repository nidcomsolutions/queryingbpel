/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getBranches()
 * @model extendedMetaData="name='tBranches' kind='mixed'"
 * @generated
 */
public interface Branches extends Expression {
	/**
	 * Returns the value of the '<em><b>Successful Branches Only</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successful Branches Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successful Branches Only</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetSuccessfulBranchesOnly()
	 * @see #unsetSuccessfulBranchesOnly()
	 * @see #setSuccessfulBranchesOnly(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getBranches_SuccessfulBranchesOnly()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='successfulBranchesOnly'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getSuccessfulBranchesOnly();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successful Branches Only</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetSuccessfulBranchesOnly()
	 * @see #unsetSuccessfulBranchesOnly()
	 * @see #getSuccessfulBranchesOnly()
	 * @generated
	 */
	void setSuccessfulBranchesOnly(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuccessfulBranchesOnly()
	 * @see #getSuccessfulBranchesOnly()
	 * @see #setSuccessfulBranchesOnly(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetSuccessfulBranchesOnly();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Successful Branches Only</em>' attribute is set.
	 * @see #unsetSuccessfulBranchesOnly()
	 * @see #getSuccessfulBranchesOnly()
	 * @see #setSuccessfulBranchesOnly(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetSuccessfulBranchesOnly();

} // Branches
