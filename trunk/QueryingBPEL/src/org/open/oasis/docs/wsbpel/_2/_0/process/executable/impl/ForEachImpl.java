/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Expression;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl#getStartCounterValue <em>Start Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl#getFinalCounterValue <em>Final Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl#getCounterName <em>Counter Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl#getParallel <em>Parallel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachImpl extends ActivityImpl implements ForEach {
	/**
	 * The cached value of the '{@link #getStartCounterValue() <em>Start Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCounterValue()
	 * @generated
	 * @ordered
	 */
	protected Expression startCounterValue;

	/**
	 * The cached value of the '{@link #getFinalCounterValue() <em>Final Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCounterValue()
	 * @generated
	 * @ordered
	 */
	protected Expression finalCounterValue;

	/**
	 * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCondition()
	 * @generated
	 * @ordered
	 */
	protected CompletionCondition completionCondition;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * The default value of the '{@link #getCounterName() <em>Counter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterName()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterName() <em>Counter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterName()
	 * @generated
	 * @ordered
	 */
	protected String counterName = COUNTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean PARALLEL_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.YES;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * This is true if the Parallel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parallelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForEachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.FOR_EACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStartCounterValue() {
		return startCounterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCounterValue(Expression newStartCounterValue, NotificationChain msgs) {
		Expression oldStartCounterValue = startCounterValue;
		startCounterValue = newStartCounterValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__START_COUNTER_VALUE, oldStartCounterValue, newStartCounterValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCounterValue(Expression newStartCounterValue) {
		if (newStartCounterValue != startCounterValue) {
			NotificationChain msgs = null;
			if (startCounterValue != null)
				msgs = ((InternalEObject)startCounterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__START_COUNTER_VALUE, null, msgs);
			if (newStartCounterValue != null)
				msgs = ((InternalEObject)newStartCounterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__START_COUNTER_VALUE, null, msgs);
			msgs = basicSetStartCounterValue(newStartCounterValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__START_COUNTER_VALUE, newStartCounterValue, newStartCounterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFinalCounterValue() {
		return finalCounterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalCounterValue(Expression newFinalCounterValue, NotificationChain msgs) {
		Expression oldFinalCounterValue = finalCounterValue;
		finalCounterValue = newFinalCounterValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE, oldFinalCounterValue, newFinalCounterValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalCounterValue(Expression newFinalCounterValue) {
		if (newFinalCounterValue != finalCounterValue) {
			NotificationChain msgs = null;
			if (finalCounterValue != null)
				msgs = ((InternalEObject)finalCounterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE, null, msgs);
			if (newFinalCounterValue != null)
				msgs = ((InternalEObject)newFinalCounterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE, null, msgs);
			msgs = basicSetFinalCounterValue(newFinalCounterValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE, newFinalCounterValue, newFinalCounterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionCondition getCompletionCondition() {
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionCondition(CompletionCondition newCompletionCondition, NotificationChain msgs) {
		CompletionCondition oldCompletionCondition = completionCondition;
		completionCondition = newCompletionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(CompletionCondition newCompletionCondition) {
		if (newCompletionCondition != completionCondition) {
			NotificationChain msgs = null;
			if (completionCondition != null)
				msgs = ((InternalEObject)completionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__COMPLETION_CONDITION, null, msgs);
			if (newCompletionCondition != null)
				msgs = ((InternalEObject)newCompletionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__COMPLETION_CONDITION, null, msgs);
			msgs = basicSetCompletionCondition(newCompletionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__COMPLETION_CONDITION, newCompletionCondition, newCompletionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FOR_EACH__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounterName() {
		return counterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterName(String newCounterName) {
		String oldCounterName = counterName;
		counterName = newCounterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__COUNTER_NAME, oldCounterName, counterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newParallel) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldParallel = parallel;
		parallel = newParallel == null ? PARALLEL_EDEFAULT : newParallel;
		boolean oldParallelESet = parallelESet;
		parallelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FOR_EACH__PARALLEL, oldParallel, parallel, !oldParallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParallel() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldParallel = parallel;
		boolean oldParallelESet = parallelESet;
		parallel = PARALLEL_EDEFAULT;
		parallelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.FOR_EACH__PARALLEL, oldParallel, PARALLEL_EDEFAULT, oldParallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParallel() {
		return parallelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.FOR_EACH__START_COUNTER_VALUE:
				return basicSetStartCounterValue(null, msgs);
			case ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE:
				return basicSetFinalCounterValue(null, msgs);
			case ExecutablePackage.FOR_EACH__COMPLETION_CONDITION:
				return basicSetCompletionCondition(null, msgs);
			case ExecutablePackage.FOR_EACH__SCOPE:
				return basicSetScope(null, msgs);
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
			case ExecutablePackage.FOR_EACH__START_COUNTER_VALUE:
				return getStartCounterValue();
			case ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE:
				return getFinalCounterValue();
			case ExecutablePackage.FOR_EACH__COMPLETION_CONDITION:
				return getCompletionCondition();
			case ExecutablePackage.FOR_EACH__SCOPE:
				return getScope();
			case ExecutablePackage.FOR_EACH__COUNTER_NAME:
				return getCounterName();
			case ExecutablePackage.FOR_EACH__PARALLEL:
				return getParallel();
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
			case ExecutablePackage.FOR_EACH__START_COUNTER_VALUE:
				setStartCounterValue((Expression)newValue);
				return;
			case ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE:
				setFinalCounterValue((Expression)newValue);
				return;
			case ExecutablePackage.FOR_EACH__COMPLETION_CONDITION:
				setCompletionCondition((CompletionCondition)newValue);
				return;
			case ExecutablePackage.FOR_EACH__SCOPE:
				setScope((Scope)newValue);
				return;
			case ExecutablePackage.FOR_EACH__COUNTER_NAME:
				setCounterName((String)newValue);
				return;
			case ExecutablePackage.FOR_EACH__PARALLEL:
				setParallel((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
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
			case ExecutablePackage.FOR_EACH__START_COUNTER_VALUE:
				setStartCounterValue((Expression)null);
				return;
			case ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE:
				setFinalCounterValue((Expression)null);
				return;
			case ExecutablePackage.FOR_EACH__COMPLETION_CONDITION:
				setCompletionCondition((CompletionCondition)null);
				return;
			case ExecutablePackage.FOR_EACH__SCOPE:
				setScope((Scope)null);
				return;
			case ExecutablePackage.FOR_EACH__COUNTER_NAME:
				setCounterName(COUNTER_NAME_EDEFAULT);
				return;
			case ExecutablePackage.FOR_EACH__PARALLEL:
				unsetParallel();
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
			case ExecutablePackage.FOR_EACH__START_COUNTER_VALUE:
				return startCounterValue != null;
			case ExecutablePackage.FOR_EACH__FINAL_COUNTER_VALUE:
				return finalCounterValue != null;
			case ExecutablePackage.FOR_EACH__COMPLETION_CONDITION:
				return completionCondition != null;
			case ExecutablePackage.FOR_EACH__SCOPE:
				return scope != null;
			case ExecutablePackage.FOR_EACH__COUNTER_NAME:
				return COUNTER_NAME_EDEFAULT == null ? counterName != null : !COUNTER_NAME_EDEFAULT.equals(counterName);
			case ExecutablePackage.FOR_EACH__PARALLEL:
				return isSetParallel();
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
		result.append(" (counterName: ");
		result.append(counterName);
		result.append(", parallel: ");
		if (parallelESet) result.append(parallel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ForEachImpl
