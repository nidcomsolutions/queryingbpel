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

import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Extension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionImpl#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends ExtensibleElementsImpl implements Extension {
	/**
	 * The default value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean MUST_UNDERSTAND_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.YES;

	/**
	 * The cached value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

	/**
	 * This is true if the Must Understand attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mustUnderstandESet;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getMustUnderstand() {
		return mustUnderstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustUnderstand(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newMustUnderstand) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand == null ? MUST_UNDERSTAND_EDEFAULT : newMustUnderstand;
		boolean oldMustUnderstandESet = mustUnderstandESet;
		mustUnderstandESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.EXTENSION__MUST_UNDERSTAND, oldMustUnderstand, mustUnderstand, !oldMustUnderstandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMustUnderstand() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldMustUnderstand = mustUnderstand;
		boolean oldMustUnderstandESet = mustUnderstandESet;
		mustUnderstand = MUST_UNDERSTAND_EDEFAULT;
		mustUnderstandESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.EXTENSION__MUST_UNDERSTAND, oldMustUnderstand, MUST_UNDERSTAND_EDEFAULT, oldMustUnderstandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMustUnderstand() {
		return mustUnderstandESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.EXTENSION__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutablePackage.EXTENSION__MUST_UNDERSTAND:
				return getMustUnderstand();
			case ExecutablePackage.EXTENSION__NAMESPACE:
				return getNamespace();
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
			case ExecutablePackage.EXTENSION__MUST_UNDERSTAND:
				setMustUnderstand((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
				return;
			case ExecutablePackage.EXTENSION__NAMESPACE:
				setNamespace((String)newValue);
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
			case ExecutablePackage.EXTENSION__MUST_UNDERSTAND:
				unsetMustUnderstand();
				return;
			case ExecutablePackage.EXTENSION__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case ExecutablePackage.EXTENSION__MUST_UNDERSTAND:
				return isSetMustUnderstand();
			case ExecutablePackage.EXTENSION__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(" (mustUnderstand: ");
		if (mustUnderstandESet) result.append(mustUnderstand); else result.append("<unset>");
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
