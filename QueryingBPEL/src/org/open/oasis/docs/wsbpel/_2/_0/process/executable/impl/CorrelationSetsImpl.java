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

import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Sets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetsImpl#getCorrelationSet <em>Correlation Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationSetsImpl extends ExtensibleElementsImpl implements CorrelationSets {
	/**
	 * The cached value of the '{@link #getCorrelationSet() <em>Correlation Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationSet()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrelationSet> correlationSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationSetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.CORRELATION_SETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrelationSet> getCorrelationSet() {
		if (correlationSet == null) {
			correlationSet = new EObjectContainmentEList<CorrelationSet>(CorrelationSet.class, this, ExecutablePackage.CORRELATION_SETS__CORRELATION_SET);
		}
		return correlationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.CORRELATION_SETS__CORRELATION_SET:
				return ((InternalEList<?>)getCorrelationSet()).basicRemove(otherEnd, msgs);
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
			case ExecutablePackage.CORRELATION_SETS__CORRELATION_SET:
				return getCorrelationSet();
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
			case ExecutablePackage.CORRELATION_SETS__CORRELATION_SET:
				getCorrelationSet().clear();
				getCorrelationSet().addAll((Collection<? extends CorrelationSet>)newValue);
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
			case ExecutablePackage.CORRELATION_SETS__CORRELATION_SET:
				getCorrelationSet().clear();
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
			case ExecutablePackage.CORRELATION_SETS__CORRELATION_SET:
				return correlationSet != null && !correlationSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorrelationSetsImpl
