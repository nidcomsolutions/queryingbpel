/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchange;
import org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Exchanges</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangesImpl#getMessageExchange <em>Message Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageExchangesImpl extends ExtensibleElementsImpl implements MessageExchanges {
	/**
	 * The cached value of the '{@link #getMessageExchange() <em>Message Exchange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchange()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageExchange> messageExchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageExchangesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.MESSAGE_EXCHANGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageExchange> getMessageExchange() {
		if (messageExchange == null) {
			messageExchange = new EObjectContainmentEList<MessageExchange>(MessageExchange.class, this, ExecutablePackage.MESSAGE_EXCHANGES__MESSAGE_EXCHANGE);
		}
		return messageExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.MESSAGE_EXCHANGES__MESSAGE_EXCHANGE:
				return ((InternalEList<?>)getMessageExchange()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutablePackage.MESSAGE_EXCHANGES__MESSAGE_EXCHANGE:
				return getMessageExchange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutablePackage.MESSAGE_EXCHANGES__MESSAGE_EXCHANGE:
				getMessageExchange().clear();
				getMessageExchange().addAll((Collection<? extends MessageExchange>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutablePackage.MESSAGE_EXCHANGES__MESSAGE_EXCHANGE:
				getMessageExchange().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutablePackage.MESSAGE_EXCHANGES__MESSAGE_EXCHANGE:
				return messageExchange != null && !messageExchange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageExchangesImpl
