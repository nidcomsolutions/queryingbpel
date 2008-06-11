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
 * A representation of the model object '<em><b>Message Exchanges</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges#getMessageExchange <em>Message Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getMessageExchanges()
 * @model extendedMetaData="name='tMessageExchanges' kind='elementOnly'"
 * @generated
 */
public interface MessageExchanges extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Message Exchange</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Exchange</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchange</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getMessageExchanges_MessageExchange()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='messageExchange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MessageExchange> getMessageExchange();

} // MessageExchanges
