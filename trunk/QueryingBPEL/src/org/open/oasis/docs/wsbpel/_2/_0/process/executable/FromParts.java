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
 * A representation of the model object '<em><b>From Parts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts#getFromPart <em>From Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFromParts()
 * @model extendedMetaData="name='tFromParts' kind='elementOnly'"
 * @generated
 */
public interface FromParts extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>From Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Part</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFromParts_FromPart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromPart' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FromPart> getFromPart();

} // FromParts
