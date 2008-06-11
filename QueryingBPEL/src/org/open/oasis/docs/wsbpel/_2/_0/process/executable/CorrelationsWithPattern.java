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
 * A representation of the model object '<em><b>Correlations With Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				XSD Authors: The child element correlation needs to be a Local Element Declaration, 
 * 				because there is another correlation element defined for the non-invoke activities.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationsWithPattern#getCorrelation <em>Correlation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelationsWithPattern()
 * @model extendedMetaData="name='tCorrelationsWithPattern' kind='elementOnly'"
 * @generated
 */
public interface CorrelationsWithPattern extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Correlation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelationsWithPattern_Correlation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='correlation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CorrelationWithPattern> getCorrelation();

} // CorrelationsWithPattern
