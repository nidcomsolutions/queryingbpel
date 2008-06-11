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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Catch;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Handlers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FaultHandlersImpl#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FaultHandlersImpl#getCatchAll <em>Catch All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultHandlersImpl extends ExtensibleElementsImpl implements FaultHandlers {
	/**
	 * The cached value of the '{@link #getCatch() <em>Catch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Catch> catch_;

	/**
	 * The cached value of the '{@link #getCatchAll() <em>Catch All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchAll()
	 * @generated
	 * @ordered
	 */
	protected ActivityContainer catchAll;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultHandlersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.FAULT_HANDLERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Catch> getCatch() {
		if (catch_ == null) {
			catch_ = new EObjectContainmentEList<Catch>(Catch.class, this, ExecutablePackage.FAULT_HANDLERS__CATCH);
		}
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getCatchAll() {
		return catchAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchAll(ActivityContainer newCatchAll, NotificationChain msgs) {
		ActivityContainer oldCatchAll = catchAll;
		catchAll = newCatchAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.FAULT_HANDLERS__CATCH_ALL, oldCatchAll, newCatchAll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchAll(ActivityContainer newCatchAll) {
		if (newCatchAll != catchAll) {
			NotificationChain msgs = null;
			if (catchAll != null)
				msgs = ((InternalEObject)catchAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FAULT_HANDLERS__CATCH_ALL, null, msgs);
			if (newCatchAll != null)
				msgs = ((InternalEObject)newCatchAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FAULT_HANDLERS__CATCH_ALL, null, msgs);
			msgs = basicSetCatchAll(newCatchAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FAULT_HANDLERS__CATCH_ALL, newCatchAll, newCatchAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.FAULT_HANDLERS__CATCH:
				return ((InternalEList<?>)getCatch()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FAULT_HANDLERS__CATCH_ALL:
				return basicSetCatchAll(null, msgs);
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
			case ExecutablePackage.FAULT_HANDLERS__CATCH:
				return getCatch();
			case ExecutablePackage.FAULT_HANDLERS__CATCH_ALL:
				return getCatchAll();
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
			case ExecutablePackage.FAULT_HANDLERS__CATCH:
				getCatch().clear();
				getCatch().addAll((Collection<? extends Catch>)newValue);
				return;
			case ExecutablePackage.FAULT_HANDLERS__CATCH_ALL:
				setCatchAll((ActivityContainer)newValue);
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
			case ExecutablePackage.FAULT_HANDLERS__CATCH:
				getCatch().clear();
				return;
			case ExecutablePackage.FAULT_HANDLERS__CATCH_ALL:
				setCatchAll((ActivityContainer)null);
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
			case ExecutablePackage.FAULT_HANDLERS__CATCH:
				return catch_ != null && !catch_.isEmpty();
			case ExecutablePackage.FAULT_HANDLERS__CATCH_ALL:
				return catchAll != null;
		}
		return super.eIsSet(featureID);
	}

} //FaultHandlersImpl
