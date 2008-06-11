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

import org.open.oasis.docs.wsbpel._2._0.process.executable.DeadlineExpr;
import org.open.oasis.docs.wsbpel._2._0.process.executable.DurationExpr;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Alarm Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl#getRepeatEvery <em>Repeat Every</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl#getRepeatEvery1 <em>Repeat Every1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnAlarmEventImpl extends ExtensibleElementsImpl implements OnAlarmEvent {
	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected DurationExpr for_;

	/**
	 * The cached value of the '{@link #getUntil() <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected DeadlineExpr until;

	/**
	 * The cached value of the '{@link #getRepeatEvery() <em>Repeat Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatEvery()
	 * @generated
	 * @ordered
	 */
	protected DurationExpr repeatEvery;

	/**
	 * The cached value of the '{@link #getRepeatEvery1() <em>Repeat Every1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatEvery1()
	 * @generated
	 * @ordered
	 */
	protected DurationExpr repeatEvery1;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnAlarmEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.ON_ALARM_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationExpr getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(DurationExpr newFor, NotificationChain msgs) {
		DurationExpr oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__FOR, oldFor, newFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(DurationExpr newFor) {
		if (newFor != for_) {
			NotificationChain msgs = null;
			if (for_ != null)
				msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__FOR, null, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__FOR, null, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__FOR, newFor, newFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineExpr getUntil() {
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntil(DeadlineExpr newUntil, NotificationChain msgs) {
		DeadlineExpr oldUntil = until;
		until = newUntil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__UNTIL, oldUntil, newUntil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntil(DeadlineExpr newUntil) {
		if (newUntil != until) {
			NotificationChain msgs = null;
			if (until != null)
				msgs = ((InternalEObject)until).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__UNTIL, null, msgs);
			if (newUntil != null)
				msgs = ((InternalEObject)newUntil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__UNTIL, null, msgs);
			msgs = basicSetUntil(newUntil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__UNTIL, newUntil, newUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationExpr getRepeatEvery() {
		return repeatEvery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatEvery(DurationExpr newRepeatEvery, NotificationChain msgs) {
		DurationExpr oldRepeatEvery = repeatEvery;
		repeatEvery = newRepeatEvery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY, oldRepeatEvery, newRepeatEvery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatEvery(DurationExpr newRepeatEvery) {
		if (newRepeatEvery != repeatEvery) {
			NotificationChain msgs = null;
			if (repeatEvery != null)
				msgs = ((InternalEObject)repeatEvery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY, null, msgs);
			if (newRepeatEvery != null)
				msgs = ((InternalEObject)newRepeatEvery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY, null, msgs);
			msgs = basicSetRepeatEvery(newRepeatEvery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY, newRepeatEvery, newRepeatEvery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationExpr getRepeatEvery1() {
		return repeatEvery1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatEvery1(DurationExpr newRepeatEvery1, NotificationChain msgs) {
		DurationExpr oldRepeatEvery1 = repeatEvery1;
		repeatEvery1 = newRepeatEvery1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1, oldRepeatEvery1, newRepeatEvery1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatEvery1(DurationExpr newRepeatEvery1) {
		if (newRepeatEvery1 != repeatEvery1) {
			NotificationChain msgs = null;
			if (repeatEvery1 != null)
				msgs = ((InternalEObject)repeatEvery1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1, null, msgs);
			if (newRepeatEvery1 != null)
				msgs = ((InternalEObject)newRepeatEvery1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1, null, msgs);
			msgs = basicSetRepeatEvery1(newRepeatEvery1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1, newRepeatEvery1, newRepeatEvery1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__SCOPE, oldScope, newScope);
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
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_ALARM_EVENT__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_ALARM_EVENT__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.ON_ALARM_EVENT__FOR:
				return basicSetFor(null, msgs);
			case ExecutablePackage.ON_ALARM_EVENT__UNTIL:
				return basicSetUntil(null, msgs);
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY:
				return basicSetRepeatEvery(null, msgs);
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1:
				return basicSetRepeatEvery1(null, msgs);
			case ExecutablePackage.ON_ALARM_EVENT__SCOPE:
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
			case ExecutablePackage.ON_ALARM_EVENT__FOR:
				return getFor();
			case ExecutablePackage.ON_ALARM_EVENT__UNTIL:
				return getUntil();
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY:
				return getRepeatEvery();
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1:
				return getRepeatEvery1();
			case ExecutablePackage.ON_ALARM_EVENT__SCOPE:
				return getScope();
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
			case ExecutablePackage.ON_ALARM_EVENT__FOR:
				setFor((DurationExpr)newValue);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__UNTIL:
				setUntil((DeadlineExpr)newValue);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY:
				setRepeatEvery((DurationExpr)newValue);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1:
				setRepeatEvery1((DurationExpr)newValue);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__SCOPE:
				setScope((Scope)newValue);
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
			case ExecutablePackage.ON_ALARM_EVENT__FOR:
				setFor((DurationExpr)null);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__UNTIL:
				setUntil((DeadlineExpr)null);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY:
				setRepeatEvery((DurationExpr)null);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1:
				setRepeatEvery1((DurationExpr)null);
				return;
			case ExecutablePackage.ON_ALARM_EVENT__SCOPE:
				setScope((Scope)null);
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
			case ExecutablePackage.ON_ALARM_EVENT__FOR:
				return for_ != null;
			case ExecutablePackage.ON_ALARM_EVENT__UNTIL:
				return until != null;
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY:
				return repeatEvery != null;
			case ExecutablePackage.ON_ALARM_EVENT__REPEAT_EVERY1:
				return repeatEvery1 != null;
			case ExecutablePackage.ON_ALARM_EVENT__SCOPE:
				return scope != null;
		}
		return super.eIsSet(featureID);
	}

} //OnAlarmEventImpl
