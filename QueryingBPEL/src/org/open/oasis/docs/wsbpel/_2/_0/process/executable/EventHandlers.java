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
 * A representation of the model object '<em><b>Event Handlers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				XSD Authors: The child element onAlarm needs to be a Local Element Declaration, 
 * 				because there is another onAlarm element defined for the pick activity.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers#getOnEvent <em>On Event</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers#getOnAlarm <em>On Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getEventHandlers()
 * @model extendedMetaData="name='tEventHandlers' kind='elementOnly'"
 * @generated
 */
public interface EventHandlers extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>On Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Event</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getEventHandlers_OnEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnEvent> getOnEvent();

	/**
	 * Returns the value of the '<em><b>On Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Alarm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Alarm</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getEventHandlers_OnAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnAlarmEvent> getOnAlarm();

} // EventHandlers
