/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getInitiate <em>Initiate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelation()
 * @model extendedMetaData="name='tCorrelation' kind='elementOnly'"
 * @generated
 */
public interface Correlation extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Initiate</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiate</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
	 * @see #isSetInitiate()
	 * @see #unsetInitiate()
	 * @see #setInitiate(Initiate)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelation_Initiate()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='initiate'"
	 * @generated
	 */
	Initiate getInitiate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getInitiate <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiate</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
	 * @see #isSetInitiate()
	 * @see #unsetInitiate()
	 * @see #getInitiate()
	 * @generated
	 */
	void setInitiate(Initiate value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getInitiate <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitiate()
	 * @see #getInitiate()
	 * @see #setInitiate(Initiate)
	 * @generated
	 */
	void unsetInitiate();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getInitiate <em>Initiate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initiate</em>' attribute is set.
	 * @see #unsetInitiate()
	 * @see #getInitiate()
	 * @see #setInitiate(Initiate)
	 * @generated
	 */
	boolean isSetInitiate();

	/**
	 * Returns the value of the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' attribute.
	 * @see #setSet(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelation_Set()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='set'"
	 * @generated
	 */
	String getSet();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(String value);

} // Correlation
