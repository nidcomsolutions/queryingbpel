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
 * A representation of the model object '<em><b>Correlation Sets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets#getCorrelationSet <em>Correlation Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelationSets()
 * @model extendedMetaData="name='tCorrelationSets' kind='elementOnly'"
 * @generated
 */
public interface CorrelationSets extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Correlation Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Set</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelationSets_CorrelationSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='correlationSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CorrelationSet> getCorrelationSet();

} // CorrelationSets
