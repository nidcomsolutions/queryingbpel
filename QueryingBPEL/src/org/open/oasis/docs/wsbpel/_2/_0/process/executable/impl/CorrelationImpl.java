/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationImpl#getInitiate <em>Initiate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationImpl#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationImpl extends ExtensibleElementsImpl implements Correlation {
	/**
	 * The default value of the '{@link #getInitiate() <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiate()
	 * @generated
	 * @ordered
	 */
	protected static final Initiate INITIATE_EDEFAULT = Initiate.NO;

	/**
	 * The cached value of the '{@link #getInitiate() <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiate()
	 * @generated
	 * @ordered
	 */
	protected Initiate initiate = INITIATE_EDEFAULT;

	/**
	 * This is true if the Initiate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initiateESet;

	/**
	 * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected String set = SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.CORRELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiate getInitiate() {
		return initiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiate(Initiate newInitiate) {
		Initiate oldInitiate = initiate;
		initiate = newInitiate == null ? INITIATE_EDEFAULT : newInitiate;
		boolean oldInitiateESet = initiateESet;
		initiateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.CORRELATION__INITIATE, oldInitiate, initiate, !oldInitiateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitiate() {
		Initiate oldInitiate = initiate;
		boolean oldInitiateESet = initiateESet;
		initiate = INITIATE_EDEFAULT;
		initiateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.CORRELATION__INITIATE, oldInitiate, INITIATE_EDEFAULT, oldInitiateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitiate() {
		return initiateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(String newSet) {
		String oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.CORRELATION__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutablePackage.CORRELATION__INITIATE:
				return getInitiate();
			case ExecutablePackage.CORRELATION__SET:
				return getSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutablePackage.CORRELATION__INITIATE:
				setInitiate((Initiate)newValue);
				return;
			case ExecutablePackage.CORRELATION__SET:
				setSet((String)newValue);
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
			case ExecutablePackage.CORRELATION__INITIATE:
				unsetInitiate();
				return;
			case ExecutablePackage.CORRELATION__SET:
				setSet(SET_EDEFAULT);
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
			case ExecutablePackage.CORRELATION__INITIATE:
				return isSetInitiate();
			case ExecutablePackage.CORRELATION__SET:
				return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initiate: ");
		if (initiateESet) result.append(initiate); else result.append("<unset>");
		result.append(", set: ");
		result.append(set);
		result.append(')');
		return result.toString();
	}

} //CorrelationImpl
