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

import org.open.oasis.docs.wsbpel._2._0.process.executable.Branches;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BranchesImpl#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchesImpl extends ExpressionImpl implements Branches {
	/**
	 * The default value of the '{@link #getSuccessfulBranchesOnly() <em>Successful Branches Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessfulBranchesOnly()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean SUCCESSFUL_BRANCHES_ONLY_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.NO;

	/**
	 * The cached value of the '{@link #getSuccessfulBranchesOnly() <em>Successful Branches Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessfulBranchesOnly()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean successfulBranchesOnly = SUCCESSFUL_BRANCHES_ONLY_EDEFAULT;

	/**
	 * This is true if the Successful Branches Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean successfulBranchesOnlyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.BRANCHES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getSuccessfulBranchesOnly() {
		return successfulBranchesOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessfulBranchesOnly(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newSuccessfulBranchesOnly) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldSuccessfulBranchesOnly = successfulBranchesOnly;
		successfulBranchesOnly = newSuccessfulBranchesOnly == null ? SUCCESSFUL_BRANCHES_ONLY_EDEFAULT : newSuccessfulBranchesOnly;
		boolean oldSuccessfulBranchesOnlyESet = successfulBranchesOnlyESet;
		successfulBranchesOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY, oldSuccessfulBranchesOnly, successfulBranchesOnly, !oldSuccessfulBranchesOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuccessfulBranchesOnly() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldSuccessfulBranchesOnly = successfulBranchesOnly;
		boolean oldSuccessfulBranchesOnlyESet = successfulBranchesOnlyESet;
		successfulBranchesOnly = SUCCESSFUL_BRANCHES_ONLY_EDEFAULT;
		successfulBranchesOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY, oldSuccessfulBranchesOnly, SUCCESSFUL_BRANCHES_ONLY_EDEFAULT, oldSuccessfulBranchesOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuccessfulBranchesOnly() {
		return successfulBranchesOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutablePackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				return getSuccessfulBranchesOnly();
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
			case ExecutablePackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				setSuccessfulBranchesOnly((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
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
			case ExecutablePackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				unsetSuccessfulBranchesOnly();
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
			case ExecutablePackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				return isSetSuccessfulBranchesOnly();
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
		result.append(" (successfulBranchesOnly: ");
		if (successfulBranchesOnlyESet) result.append(successfulBranchesOnly); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BranchesImpl
