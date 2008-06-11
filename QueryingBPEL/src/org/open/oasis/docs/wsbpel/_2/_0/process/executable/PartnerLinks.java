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
 * A representation of the model object '<em><b>Partner Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLinks#getPartnerLink <em>Partner Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLinks()
 * @model extendedMetaData="name='tPartnerLinks' kind='elementOnly'"
 * @generated
 */
public interface PartnerLinks extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Partner Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getPartnerLinks_PartnerLink()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='partnerLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PartnerLink> getPartnerLink();

} // PartnerLinks
