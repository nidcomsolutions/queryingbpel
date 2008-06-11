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

import org.open.oasis.docs.wsbpel._2._0.process.executable.Copy;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.From;
import org.open.oasis.docs.wsbpel._2._0.process.executable.To;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl#getKeepSrcElementName <em>Keep Src Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyImpl extends ExtensibleElementsImpl implements Copy {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected From from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected To to;

	/**
	 * The default value of the '{@link #getIgnoreMissingFromData() <em>Ignore Missing From Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreMissingFromData()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean IGNORE_MISSING_FROM_DATA_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.NO;

	/**
	 * The cached value of the '{@link #getIgnoreMissingFromData() <em>Ignore Missing From Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreMissingFromData()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean ignoreMissingFromData = IGNORE_MISSING_FROM_DATA_EDEFAULT;

	/**
	 * This is true if the Ignore Missing From Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreMissingFromDataESet;

	/**
	 * The default value of the '{@link #getKeepSrcElementName() <em>Keep Src Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepSrcElementName()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean KEEP_SRC_ELEMENT_NAME_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.NO;

	/**
	 * The cached value of the '{@link #getKeepSrcElementName() <em>Keep Src Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepSrcElementName()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean keepSrcElementName = KEEP_SRC_ELEMENT_NAME_EDEFAULT;

	/**
	 * This is true if the Keep Src Element Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keepSrcElementNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.COPY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(From newFrom, NotificationChain msgs) {
		From oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.COPY__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(From newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.COPY__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.COPY__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.COPY__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public To getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(To newTo, NotificationChain msgs) {
		To oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.COPY__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(To newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.COPY__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.COPY__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.COPY__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getIgnoreMissingFromData() {
		return ignoreMissingFromData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreMissingFromData(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newIgnoreMissingFromData) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldIgnoreMissingFromData = ignoreMissingFromData;
		ignoreMissingFromData = newIgnoreMissingFromData == null ? IGNORE_MISSING_FROM_DATA_EDEFAULT : newIgnoreMissingFromData;
		boolean oldIgnoreMissingFromDataESet = ignoreMissingFromDataESet;
		ignoreMissingFromDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.COPY__IGNORE_MISSING_FROM_DATA, oldIgnoreMissingFromData, ignoreMissingFromData, !oldIgnoreMissingFromDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreMissingFromData() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldIgnoreMissingFromData = ignoreMissingFromData;
		boolean oldIgnoreMissingFromDataESet = ignoreMissingFromDataESet;
		ignoreMissingFromData = IGNORE_MISSING_FROM_DATA_EDEFAULT;
		ignoreMissingFromDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.COPY__IGNORE_MISSING_FROM_DATA, oldIgnoreMissingFromData, IGNORE_MISSING_FROM_DATA_EDEFAULT, oldIgnoreMissingFromDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreMissingFromData() {
		return ignoreMissingFromDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getKeepSrcElementName() {
		return keepSrcElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepSrcElementName(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newKeepSrcElementName) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldKeepSrcElementName = keepSrcElementName;
		keepSrcElementName = newKeepSrcElementName == null ? KEEP_SRC_ELEMENT_NAME_EDEFAULT : newKeepSrcElementName;
		boolean oldKeepSrcElementNameESet = keepSrcElementNameESet;
		keepSrcElementNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.COPY__KEEP_SRC_ELEMENT_NAME, oldKeepSrcElementName, keepSrcElementName, !oldKeepSrcElementNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeepSrcElementName() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldKeepSrcElementName = keepSrcElementName;
		boolean oldKeepSrcElementNameESet = keepSrcElementNameESet;
		keepSrcElementName = KEEP_SRC_ELEMENT_NAME_EDEFAULT;
		keepSrcElementNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.COPY__KEEP_SRC_ELEMENT_NAME, oldKeepSrcElementName, KEEP_SRC_ELEMENT_NAME_EDEFAULT, oldKeepSrcElementNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeepSrcElementName() {
		return keepSrcElementNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.COPY__FROM:
				return basicSetFrom(null, msgs);
			case ExecutablePackage.COPY__TO:
				return basicSetTo(null, msgs);
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
			case ExecutablePackage.COPY__FROM:
				return getFrom();
			case ExecutablePackage.COPY__TO:
				return getTo();
			case ExecutablePackage.COPY__IGNORE_MISSING_FROM_DATA:
				return getIgnoreMissingFromData();
			case ExecutablePackage.COPY__KEEP_SRC_ELEMENT_NAME:
				return getKeepSrcElementName();
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
			case ExecutablePackage.COPY__FROM:
				setFrom((From)newValue);
				return;
			case ExecutablePackage.COPY__TO:
				setTo((To)newValue);
				return;
			case ExecutablePackage.COPY__IGNORE_MISSING_FROM_DATA:
				setIgnoreMissingFromData((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
				return;
			case ExecutablePackage.COPY__KEEP_SRC_ELEMENT_NAME:
				setKeepSrcElementName((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
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
			case ExecutablePackage.COPY__FROM:
				setFrom((From)null);
				return;
			case ExecutablePackage.COPY__TO:
				setTo((To)null);
				return;
			case ExecutablePackage.COPY__IGNORE_MISSING_FROM_DATA:
				unsetIgnoreMissingFromData();
				return;
			case ExecutablePackage.COPY__KEEP_SRC_ELEMENT_NAME:
				unsetKeepSrcElementName();
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
			case ExecutablePackage.COPY__FROM:
				return from != null;
			case ExecutablePackage.COPY__TO:
				return to != null;
			case ExecutablePackage.COPY__IGNORE_MISSING_FROM_DATA:
				return isSetIgnoreMissingFromData();
			case ExecutablePackage.COPY__KEEP_SRC_ELEMENT_NAME:
				return isSetKeepSrcElementName();
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
		result.append(" (ignoreMissingFromData: ");
		if (ignoreMissingFromDataESet) result.append(ignoreMissingFromData); else result.append("<unset>");
		result.append(", keepSrcElementName: ");
		if (keepSrcElementNameESet) result.append(keepSrcElementName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CopyImpl
