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
 * A representation of the model object '<em><b>Extensions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Extensions#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getExtensions()
 * @model extendedMetaData="name='tExtensions' kind='elementOnly'"
 * @generated
 */
public interface Extensions extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getExtensions_Extension()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getExtension();

} // Extensions
