/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSources <em>Sources</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getActivity()
 * @model extendedMetaData="name='tActivity' kind='elementOnly'"
 * @generated
 */
public interface Activity extends ExtensibleElements {
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getActivity_Targets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targets' namespace='##targetNamespace'"
	 * @generated
	 */
	Targets getTargets();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getTargets <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' containment reference.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(Targets value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getActivity_Sources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sources' namespace='##targetNamespace'"
	 * @generated
	 */
	Sources getSources();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSources <em>Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sources</em>' containment reference.
	 * @see #getSources()
	 * @generated
	 */
	void setSources(Sources value);

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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getActivity_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * The default value is <code>"yes"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppress Join Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Join Failure</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetSuppressJoinFailure()
	 * @see #unsetSuppressJoinFailure()
	 * @see #setSuppressJoinFailure(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getActivity_SuppressJoinFailure()
	 * @model default="yes" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='suppressJoinFailure'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getSuppressJoinFailure();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Join Failure</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetSuppressJoinFailure()
	 * @see #unsetSuppressJoinFailure()
	 * @see #getSuppressJoinFailure()
	 * @generated
	 */
	void setSuppressJoinFailure(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuppressJoinFailure()
	 * @see #getSuppressJoinFailure()
	 * @see #setSuppressJoinFailure(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetSuppressJoinFailure();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suppress Join Failure</em>' attribute is set.
	 * @see #unsetSuppressJoinFailure()
	 * @see #getSuppressJoinFailure()
	 * @see #setSuppressJoinFailure(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetSuppressJoinFailure();

} // Activity
