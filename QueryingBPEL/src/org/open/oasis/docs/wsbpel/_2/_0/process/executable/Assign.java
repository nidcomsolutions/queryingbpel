/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getExtensionAssignOperation <em>Extension Assign Operation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getAssign()
 * @model extendedMetaData="name='tAssign' kind='elementOnly'"
 * @generated
 */
public interface Assign extends Activity {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getAssign_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:7'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Copy</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getAssign_Copy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copy' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
	EList<Copy> getCopy();

	/**
	 * Returns the value of the '<em><b>Extension Assign Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionAssignOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Assign Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Assign Operation</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getAssign_ExtensionAssignOperation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensionAssignOperation' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
	EList<ExtensionAssignOperation> getExtensionAssignOperation();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetValidate()
	 * @see #unsetValidate()
	 * @see #setValidate(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getAssign_Validate()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='validate'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getValidate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetValidate()
	 * @see #unsetValidate()
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidate()
	 * @see #getValidate()
	 * @see #setValidate(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetValidate();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getValidate <em>Validate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validate</em>' attribute is set.
	 * @see #unsetValidate()
	 * @see #getValidate()
	 * @see #setValidate(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetValidate();

} // Assign
