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
 * A representation of the model object '<em><b>Fault Handlers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers#getCatchAll <em>Catch All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFaultHandlers()
 * @model extendedMetaData="name='tFaultHandlers' kind='elementOnly'"
 * @generated
 */
public interface FaultHandlers extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Catch</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This element can contain all activities including the activities
	 * 				compensate, compensateScope and rethrow.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catch</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFaultHandlers_Catch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='catch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Catch> getCatch();

	/**
	 * Returns the value of the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This element can contain all activities including the activities
	 * 				compensate, compensateScope and rethrow.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catch All</em>' containment reference.
	 * @see #setCatchAll(ActivityContainer)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFaultHandlers_CatchAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='catchAll' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityContainer getCatchAll();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers#getCatchAll <em>Catch All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch All</em>' containment reference.
	 * @see #getCatchAll()
	 * @generated
	 */
	void setCatchAll(ActivityContainer value);

} // FaultHandlers
