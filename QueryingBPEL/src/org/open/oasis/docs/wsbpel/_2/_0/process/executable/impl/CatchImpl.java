/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Catch;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl#getFaultElement <em>Fault Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl#getFaultMessageType <em>Fault Message Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl#getFaultVariable <em>Fault Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatchImpl extends ActivityContainerImpl implements Catch {
	/**
	 * The default value of the '{@link #getFaultElement() <em>Fault Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultElement()
	 * @generated
	 * @ordered
	 */
	protected static final QName FAULT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultElement() <em>Fault Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultElement()
	 * @generated
	 * @ordered
	 */
	protected QName faultElement = FAULT_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultMessageType() <em>Fault Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final QName FAULT_MESSAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultMessageType() <em>Fault Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultMessageType()
	 * @generated
	 * @ordered
	 */
	protected QName faultMessageType = FAULT_MESSAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected static final QName FAULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected QName faultName = FAULT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultVariable() <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultVariable() <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultVariable()
	 * @generated
	 * @ordered
	 */
	protected String faultVariable = FAULT_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.CATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getFaultElement() {
		return faultElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultElement(QName newFaultElement) {
		QName oldFaultElement = faultElement;
		faultElement = newFaultElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.CATCH__FAULT_ELEMENT, oldFaultElement, faultElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getFaultMessageType() {
		return faultMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultMessageType(QName newFaultMessageType) {
		QName oldFaultMessageType = faultMessageType;
		faultMessageType = newFaultMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.CATCH__FAULT_MESSAGE_TYPE, oldFaultMessageType, faultMessageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getFaultName() {
		return faultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultName(QName newFaultName) {
		QName oldFaultName = faultName;
		faultName = newFaultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.CATCH__FAULT_NAME, oldFaultName, faultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaultVariable() {
		return faultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultVariable(String newFaultVariable) {
		String oldFaultVariable = faultVariable;
		faultVariable = newFaultVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.CATCH__FAULT_VARIABLE, oldFaultVariable, faultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutablePackage.CATCH__FAULT_ELEMENT:
				return getFaultElement();
			case ExecutablePackage.CATCH__FAULT_MESSAGE_TYPE:
				return getFaultMessageType();
			case ExecutablePackage.CATCH__FAULT_NAME:
				return getFaultName();
			case ExecutablePackage.CATCH__FAULT_VARIABLE:
				return getFaultVariable();
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
			case ExecutablePackage.CATCH__FAULT_ELEMENT:
				setFaultElement((QName)newValue);
				return;
			case ExecutablePackage.CATCH__FAULT_MESSAGE_TYPE:
				setFaultMessageType((QName)newValue);
				return;
			case ExecutablePackage.CATCH__FAULT_NAME:
				setFaultName((QName)newValue);
				return;
			case ExecutablePackage.CATCH__FAULT_VARIABLE:
				setFaultVariable((String)newValue);
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
			case ExecutablePackage.CATCH__FAULT_ELEMENT:
				setFaultElement(FAULT_ELEMENT_EDEFAULT);
				return;
			case ExecutablePackage.CATCH__FAULT_MESSAGE_TYPE:
				setFaultMessageType(FAULT_MESSAGE_TYPE_EDEFAULT);
				return;
			case ExecutablePackage.CATCH__FAULT_NAME:
				setFaultName(FAULT_NAME_EDEFAULT);
				return;
			case ExecutablePackage.CATCH__FAULT_VARIABLE:
				setFaultVariable(FAULT_VARIABLE_EDEFAULT);
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
			case ExecutablePackage.CATCH__FAULT_ELEMENT:
				return FAULT_ELEMENT_EDEFAULT == null ? faultElement != null : !FAULT_ELEMENT_EDEFAULT.equals(faultElement);
			case ExecutablePackage.CATCH__FAULT_MESSAGE_TYPE:
				return FAULT_MESSAGE_TYPE_EDEFAULT == null ? faultMessageType != null : !FAULT_MESSAGE_TYPE_EDEFAULT.equals(faultMessageType);
			case ExecutablePackage.CATCH__FAULT_NAME:
				return FAULT_NAME_EDEFAULT == null ? faultName != null : !FAULT_NAME_EDEFAULT.equals(faultName);
			case ExecutablePackage.CATCH__FAULT_VARIABLE:
				return FAULT_VARIABLE_EDEFAULT == null ? faultVariable != null : !FAULT_VARIABLE_EDEFAULT.equals(faultVariable);
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
		result.append(" (faultElement: ");
		result.append(faultElement);
		result.append(", faultMessageType: ");
		result.append(faultMessageType);
		result.append(", faultName: ");
		result.append(faultName);
		result.append(", faultVariable: ");
		result.append(faultVariable);
		result.append(')');
		return result.toString();
	}

} //CatchImpl
