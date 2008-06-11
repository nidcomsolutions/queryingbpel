/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getLinkName <em>Link Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getSource()
 * @model extendedMetaData="name='tSource' kind='elementOnly'"
 * @generated
 */
public interface Source extends ExtensibleElements {
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
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getSource_TransitionCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transitionCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getTransitionCondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getTransitionCondition <em>Transition Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Condition</em>' containment reference.
	 * @see #getTransitionCondition()
	 * @generated
	 */
	void setTransitionCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getSource_LinkName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='linkName'"
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

} // Source
