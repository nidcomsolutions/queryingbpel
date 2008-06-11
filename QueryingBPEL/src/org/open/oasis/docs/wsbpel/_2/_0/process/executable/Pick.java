/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				XSD Authors: The child element onAlarm needs to be a Local Element Declaration, 
 * 				because there is another onAlarm element defined for event handlers.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getOnMessage <em>On Message</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getOnAlarm <em>On Alarm</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getCreateInstance <em>Create Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPick()
 * @model extendedMetaData="name='tPick' kind='elementOnly'"
 * @generated
 */
public interface Pick extends Activity {
	/**
	 * Returns the value of the '<em><b>On Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Message</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPick_OnMessage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='onMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnMessage> getOnMessage();

	/**
	 * Returns the value of the '<em><b>On Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Alarm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Alarm</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPick_OnAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnAlarmPick> getOnAlarm();

	/**
	 * Returns the value of the '<em><b>Create Instance</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Instance</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetCreateInstance()
	 * @see #unsetCreateInstance()
	 * @see #setCreateInstance(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPick_CreateInstance()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='createInstance'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getCreateInstance();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getCreateInstance <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Instance</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetCreateInstance()
	 * @see #unsetCreateInstance()
	 * @see #getCreateInstance()
	 * @generated
	 */
	void setCreateInstance(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getCreateInstance <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateInstance()
	 * @see #getCreateInstance()
	 * @see #setCreateInstance(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetCreateInstance();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getCreateInstance <em>Create Instance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Instance</em>' attribute is set.
	 * @see #unsetCreateInstance()
	 * @see #getCreateInstance()
	 * @see #setCreateInstance(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetCreateInstance();

} // Pick
