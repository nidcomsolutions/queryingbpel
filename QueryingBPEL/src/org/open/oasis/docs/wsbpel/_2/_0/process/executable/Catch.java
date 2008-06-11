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
 * A representation of the model object '<em><b>Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultElement <em>Fault Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultMessageType <em>Fault Message Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultVariable <em>Fault Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCatch()
 * @model extendedMetaData="name='tCatch' kind='elementOnly'"
 * @generated
 */
public interface Catch extends ActivityContainer {
	/**
	 * Returns the value of the '<em><b>Fault Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Element</em>' attribute.
	 * @see #setFaultElement(QName)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCatch_FaultElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='faultElement'"
	 * @generated
	 */
	QName getFaultElement();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultElement <em>Fault Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Element</em>' attribute.
	 * @see #getFaultElement()
	 * @generated
	 */
	void setFaultElement(QName value);

	/**
	 * Returns the value of the '<em><b>Fault Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Message Type</em>' attribute.
	 * @see #setFaultMessageType(QName)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCatch_FaultMessageType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='faultMessageType'"
	 * @generated
	 */
	QName getFaultMessageType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultMessageType <em>Fault Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Message Type</em>' attribute.
	 * @see #getFaultMessageType()
	 * @generated
	 */
	void setFaultMessageType(QName value);

	/**
	 * Returns the value of the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Name</em>' attribute.
	 * @see #setFaultName(QName)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCatch_FaultName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='faultName'"
	 * @generated
	 */
	QName getFaultName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultName <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Name</em>' attribute.
	 * @see #getFaultName()
	 * @generated
	 */
	void setFaultName(QName value);

	/**
	 * Returns the value of the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Variable</em>' attribute.
	 * @see #setFaultVariable(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCatch_FaultVariable()
	 * @model dataType="org.open.oasis.docs.wsbpel._2._0.process.executable.BPELVariableName"
	 *        extendedMetaData="kind='attribute' name='faultVariable'"
	 * @generated
	 */
	String getFaultVariable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultVariable <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Variable</em>' attribute.
	 * @see #getFaultVariable()
	 * @generated
	 */
	void setFaultVariable(String value);

} // Catch
