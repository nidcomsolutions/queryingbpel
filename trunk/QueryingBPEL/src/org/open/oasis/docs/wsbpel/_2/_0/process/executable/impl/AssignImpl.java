/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Assign;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Copy;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionAssignOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl#getExtensionAssignOperation <em>Extension Assign Operation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignImpl extends ActivityImpl implements Assign {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean VALIDATE_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.NO;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean validate = VALIDATE_EDEFAULT;

	/**
	 * This is true if the Validate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ExecutablePackage.ASSIGN__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copy> getCopy() {
		return getGroup().list(ExecutablePackage.Literals.ASSIGN__COPY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionAssignOperation> getExtensionAssignOperation() {
		return getGroup().list(ExecutablePackage.Literals.ASSIGN__EXTENSION_ASSIGN_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newValidate) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldValidate = validate;
		validate = newValidate == null ? VALIDATE_EDEFAULT : newValidate;
		boolean oldValidateESet = validateESet;
		validateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ASSIGN__VALIDATE, oldValidate, validate, !oldValidateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidate() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldValidate = validate;
		boolean oldValidateESet = validateESet;
		validate = VALIDATE_EDEFAULT;
		validateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.ASSIGN__VALIDATE, oldValidate, VALIDATE_EDEFAULT, oldValidateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidate() {
		return validateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.ASSIGN__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.ASSIGN__COPY:
				return ((InternalEList<?>)getCopy()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				return ((InternalEList<?>)getExtensionAssignOperation()).basicRemove(otherEnd, msgs);
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
			case ExecutablePackage.ASSIGN__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ExecutablePackage.ASSIGN__COPY:
				return getCopy();
			case ExecutablePackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				return getExtensionAssignOperation();
			case ExecutablePackage.ASSIGN__VALIDATE:
				return getValidate();
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
			case ExecutablePackage.ASSIGN__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ExecutablePackage.ASSIGN__COPY:
				getCopy().clear();
				getCopy().addAll((Collection<? extends Copy>)newValue);
				return;
			case ExecutablePackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				getExtensionAssignOperation().clear();
				getExtensionAssignOperation().addAll((Collection<? extends ExtensionAssignOperation>)newValue);
				return;
			case ExecutablePackage.ASSIGN__VALIDATE:
				setValidate((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
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
			case ExecutablePackage.ASSIGN__GROUP:
				getGroup().clear();
				return;
			case ExecutablePackage.ASSIGN__COPY:
				getCopy().clear();
				return;
			case ExecutablePackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				getExtensionAssignOperation().clear();
				return;
			case ExecutablePackage.ASSIGN__VALIDATE:
				unsetValidate();
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
			case ExecutablePackage.ASSIGN__GROUP:
				return group != null && !group.isEmpty();
			case ExecutablePackage.ASSIGN__COPY:
				return !getCopy().isEmpty();
			case ExecutablePackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				return !getExtensionAssignOperation().isEmpty();
			case ExecutablePackage.ASSIGN__VALIDATE:
				return isSetValidate();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", validate: ");
		if (validateESet) result.append(validate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AssignImpl
