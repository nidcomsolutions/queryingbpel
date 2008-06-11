/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getMyRole <em>My Role</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerRole <em>Partner Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLink()
 * @model extendedMetaData="name='tPartnerLink' kind='elementOnly'"
 * @generated
 */
public interface PartnerLink extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Initialize Partner Role</b></em>' attribute.
	 * The default value is <code>"yes"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize Partner Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize Partner Role</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetInitializePartnerRole()
	 * @see #unsetInitializePartnerRole()
	 * @see #setInitializePartnerRole(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLink_InitializePartnerRole()
	 * @model default="yes" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='initializePartnerRole'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getInitializePartnerRole();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize Partner Role</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetInitializePartnerRole()
	 * @see #unsetInitializePartnerRole()
	 * @see #getInitializePartnerRole()
	 * @generated
	 */
	void setInitializePartnerRole(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitializePartnerRole()
	 * @see #getInitializePartnerRole()
	 * @see #setInitializePartnerRole(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetInitializePartnerRole();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initialize Partner Role</em>' attribute is set.
	 * @see #unsetInitializePartnerRole()
	 * @see #getInitializePartnerRole()
	 * @see #setInitializePartnerRole(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetInitializePartnerRole();

	/**
	 * Returns the value of the '<em><b>My Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Role</em>' attribute.
	 * @see #setMyRole(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLink_MyRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='myRole'"
	 * @generated
	 */
	String getMyRole();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getMyRole <em>My Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Role</em>' attribute.
	 * @see #getMyRole()
	 * @generated
	 */
	void setMyRole(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLink_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Partner Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link Type</em>' attribute.
	 * @see #setPartnerLinkType(QName)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLink_PartnerLinkType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='partnerLinkType'"
	 * @generated
	 */
	QName getPartnerLinkType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link Type</em>' attribute.
	 * @see #getPartnerLinkType()
	 * @generated
	 */
	void setPartnerLinkType(QName value);

	/**
	 * Returns the value of the '<em><b>Partner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Role</em>' attribute.
	 * @see #setPartnerRole(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLink_PartnerRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='partnerRole'"
	 * @generated
	 */
	String getPartnerRole();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerRole <em>Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Role</em>' attribute.
	 * @see #getPartnerRole()
	 * @generated
	 */
	void setPartnerRole(String value);

} // PartnerLink
