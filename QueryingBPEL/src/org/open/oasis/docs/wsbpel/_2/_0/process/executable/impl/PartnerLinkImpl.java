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

import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partner Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl#getInitializePartnerRole <em>Initialize Partner Role</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl#getMyRole <em>My Role</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl#getPartnerLinkType <em>Partner Link Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl#getPartnerRole <em>Partner Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartnerLinkImpl extends ExtensibleElementsImpl implements PartnerLink {
	/**
	 * The default value of the '{@link #getInitializePartnerRole() <em>Initialize Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializePartnerRole()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean INITIALIZE_PARTNER_ROLE_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.YES;

	/**
	 * The cached value of the '{@link #getInitializePartnerRole() <em>Initialize Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializePartnerRole()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean initializePartnerRole = INITIALIZE_PARTNER_ROLE_EDEFAULT;

	/**
	 * This is true if the Initialize Partner Role attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initializePartnerRoleESet;

	/**
	 * The default value of the '{@link #getMyRole() <em>My Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyRole()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyRole() <em>My Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyRole()
	 * @generated
	 * @ordered
	 */
	protected String myRole = MY_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerLinkType() <em>Partner Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final QName PARTNER_LINK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerLinkType() <em>Partner Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLinkType()
	 * @generated
	 * @ordered
	 */
	protected QName partnerLinkType = PARTNER_LINK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerRole() <em>Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerRole()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerRole() <em>Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerRole()
	 * @generated
	 * @ordered
	 */
	protected String partnerRole = PARTNER_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartnerLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.PARTNER_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getInitializePartnerRole() {
		return initializePartnerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializePartnerRole(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newInitializePartnerRole) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldInitializePartnerRole = initializePartnerRole;
		initializePartnerRole = newInitializePartnerRole == null ? INITIALIZE_PARTNER_ROLE_EDEFAULT : newInitializePartnerRole;
		boolean oldInitializePartnerRoleESet = initializePartnerRoleESet;
		initializePartnerRoleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PARTNER_LINK__INITIALIZE_PARTNER_ROLE, oldInitializePartnerRole, initializePartnerRole, !oldInitializePartnerRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitializePartnerRole() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldInitializePartnerRole = initializePartnerRole;
		boolean oldInitializePartnerRoleESet = initializePartnerRoleESet;
		initializePartnerRole = INITIALIZE_PARTNER_ROLE_EDEFAULT;
		initializePartnerRoleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.PARTNER_LINK__INITIALIZE_PARTNER_ROLE, oldInitializePartnerRole, INITIALIZE_PARTNER_ROLE_EDEFAULT, oldInitializePartnerRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitializePartnerRole() {
		return initializePartnerRoleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyRole() {
		return myRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyRole(String newMyRole) {
		String oldMyRole = myRole;
		myRole = newMyRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PARTNER_LINK__MY_ROLE, oldMyRole, myRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PARTNER_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPartnerLinkType() {
		return partnerLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLinkType(QName newPartnerLinkType) {
		QName oldPartnerLinkType = partnerLinkType;
		partnerLinkType = newPartnerLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PARTNER_LINK__PARTNER_LINK_TYPE, oldPartnerLinkType, partnerLinkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerRole() {
		return partnerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerRole(String newPartnerRole) {
		String oldPartnerRole = partnerRole;
		partnerRole = newPartnerRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PARTNER_LINK__PARTNER_ROLE, oldPartnerRole, partnerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutablePackage.PARTNER_LINK__INITIALIZE_PARTNER_ROLE:
				return getInitializePartnerRole();
			case ExecutablePackage.PARTNER_LINK__MY_ROLE:
				return getMyRole();
			case ExecutablePackage.PARTNER_LINK__NAME:
				return getName();
			case ExecutablePackage.PARTNER_LINK__PARTNER_LINK_TYPE:
				return getPartnerLinkType();
			case ExecutablePackage.PARTNER_LINK__PARTNER_ROLE:
				return getPartnerRole();
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
			case ExecutablePackage.PARTNER_LINK__INITIALIZE_PARTNER_ROLE:
				setInitializePartnerRole((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
				return;
			case ExecutablePackage.PARTNER_LINK__MY_ROLE:
				setMyRole((String)newValue);
				return;
			case ExecutablePackage.PARTNER_LINK__NAME:
				setName((String)newValue);
				return;
			case ExecutablePackage.PARTNER_LINK__PARTNER_LINK_TYPE:
				setPartnerLinkType((QName)newValue);
				return;
			case ExecutablePackage.PARTNER_LINK__PARTNER_ROLE:
				setPartnerRole((String)newValue);
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
			case ExecutablePackage.PARTNER_LINK__INITIALIZE_PARTNER_ROLE:
				unsetInitializePartnerRole();
				return;
			case ExecutablePackage.PARTNER_LINK__MY_ROLE:
				setMyRole(MY_ROLE_EDEFAULT);
				return;
			case ExecutablePackage.PARTNER_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExecutablePackage.PARTNER_LINK__PARTNER_LINK_TYPE:
				setPartnerLinkType(PARTNER_LINK_TYPE_EDEFAULT);
				return;
			case ExecutablePackage.PARTNER_LINK__PARTNER_ROLE:
				setPartnerRole(PARTNER_ROLE_EDEFAULT);
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
			case ExecutablePackage.PARTNER_LINK__INITIALIZE_PARTNER_ROLE:
				return isSetInitializePartnerRole();
			case ExecutablePackage.PARTNER_LINK__MY_ROLE:
				return MY_ROLE_EDEFAULT == null ? myRole != null : !MY_ROLE_EDEFAULT.equals(myRole);
			case ExecutablePackage.PARTNER_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExecutablePackage.PARTNER_LINK__PARTNER_LINK_TYPE:
				return PARTNER_LINK_TYPE_EDEFAULT == null ? partnerLinkType != null : !PARTNER_LINK_TYPE_EDEFAULT.equals(partnerLinkType);
			case ExecutablePackage.PARTNER_LINK__PARTNER_ROLE:
				return PARTNER_ROLE_EDEFAULT == null ? partnerRole != null : !PARTNER_ROLE_EDEFAULT.equals(partnerRole);
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
		result.append(" (initializePartnerRole: ");
		if (initializePartnerRoleESet) result.append(initializePartnerRole); else result.append("<unset>");
		result.append(", myRole: ");
		result.append(myRole);
		result.append(", name: ");
		result.append(name);
		result.append(", partnerLinkType: ");
		result.append(partnerLinkType);
		result.append(", partnerRole: ");
		result.append(partnerRole);
		result.append(')');
		return result.toString();
	}

} //PartnerLinkImpl
