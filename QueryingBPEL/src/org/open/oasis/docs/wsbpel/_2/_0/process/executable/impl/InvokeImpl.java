/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

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
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationsWithPattern;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ToParts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getCatchAll <em>Catch All</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getToParts <em>To Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getInputVariable <em>Input Variable</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getOutputVariable <em>Output Variable</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl#getPortType <em>Port Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends ActivityImpl implements Invoke {
	/**
	 * The cached value of the '{@link #getCorrelations() <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelations()
	 * @generated
	 * @ordered
	 */
	protected CorrelationsWithPattern correlations;

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
	 * The cached value of the '{@link #getCompensationHandler() <em>Compensation Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationHandler()
	 * @generated
	 * @ordered
	 */
	protected ActivityContainer compensationHandler;

	/**
	 * The cached value of the '{@link #getToParts() <em>To Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToParts()
	 * @generated
	 * @ordered
	 */
	protected ToParts toParts;

	/**
	 * The cached value of the '{@link #getFromParts() <em>From Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromParts()
	 * @generated
	 * @ordered
	 */
	protected FromParts fromParts;

	/**
	 * The default value of the '{@link #getInputVariable() <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputVariable() <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariable()
	 * @generated
	 * @ordered
	 */
	protected String inputVariable = INPUT_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputVariable() <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputVariable() <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariable()
	 * @generated
	 * @ordered
	 */
	protected String outputVariable = OUTPUT_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerLink() <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerLink() <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected String partnerLink = PARTNER_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected static final QName PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected QName portType = PORT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.INVOKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationsWithPattern getCorrelations() {
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelations(CorrelationsWithPattern newCorrelations, NotificationChain msgs) {
		CorrelationsWithPattern oldCorrelations = correlations;
		correlations = newCorrelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__CORRELATIONS, oldCorrelations, newCorrelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelations(CorrelationsWithPattern newCorrelations) {
		if (newCorrelations != correlations) {
			NotificationChain msgs = null;
			if (correlations != null)
				msgs = ((InternalEObject)correlations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__CORRELATIONS, null, msgs);
			if (newCorrelations != null)
				msgs = ((InternalEObject)newCorrelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__CORRELATIONS, null, msgs);
			msgs = basicSetCorrelations(newCorrelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__CORRELATIONS, newCorrelations, newCorrelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Catch> getCatch() {
		if (catch_ == null) {
			catch_ = new EObjectContainmentEList<Catch>(Catch.class, this, ExecutablePackage.INVOKE__CATCH);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__CATCH_ALL, oldCatchAll, newCatchAll);
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
				msgs = ((InternalEObject)catchAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__CATCH_ALL, null, msgs);
			if (newCatchAll != null)
				msgs = ((InternalEObject)newCatchAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__CATCH_ALL, null, msgs);
			msgs = basicSetCatchAll(newCatchAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__CATCH_ALL, newCatchAll, newCatchAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getCompensationHandler() {
		return compensationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensationHandler(ActivityContainer newCompensationHandler, NotificationChain msgs) {
		ActivityContainer oldCompensationHandler = compensationHandler;
		compensationHandler = newCompensationHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__COMPENSATION_HANDLER, oldCompensationHandler, newCompensationHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationHandler(ActivityContainer newCompensationHandler) {
		if (newCompensationHandler != compensationHandler) {
			NotificationChain msgs = null;
			if (compensationHandler != null)
				msgs = ((InternalEObject)compensationHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__COMPENSATION_HANDLER, null, msgs);
			if (newCompensationHandler != null)
				msgs = ((InternalEObject)newCompensationHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__COMPENSATION_HANDLER, null, msgs);
			msgs = basicSetCompensationHandler(newCompensationHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__COMPENSATION_HANDLER, newCompensationHandler, newCompensationHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToParts getToParts() {
		return toParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToParts(ToParts newToParts, NotificationChain msgs) {
		ToParts oldToParts = toParts;
		toParts = newToParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__TO_PARTS, oldToParts, newToParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParts(ToParts newToParts) {
		if (newToParts != toParts) {
			NotificationChain msgs = null;
			if (toParts != null)
				msgs = ((InternalEObject)toParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__TO_PARTS, null, msgs);
			if (newToParts != null)
				msgs = ((InternalEObject)newToParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__TO_PARTS, null, msgs);
			msgs = basicSetToParts(newToParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__TO_PARTS, newToParts, newToParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromParts getFromParts() {
		return fromParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromParts(FromParts newFromParts, NotificationChain msgs) {
		FromParts oldFromParts = fromParts;
		fromParts = newFromParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__FROM_PARTS, oldFromParts, newFromParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromParts(FromParts newFromParts) {
		if (newFromParts != fromParts) {
			NotificationChain msgs = null;
			if (fromParts != null)
				msgs = ((InternalEObject)fromParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__FROM_PARTS, null, msgs);
			if (newFromParts != null)
				msgs = ((InternalEObject)newFromParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.INVOKE__FROM_PARTS, null, msgs);
			msgs = basicSetFromParts(newFromParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__FROM_PARTS, newFromParts, newFromParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputVariable() {
		return inputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVariable(String newInputVariable) {
		String oldInputVariable = inputVariable;
		inputVariable = newInputVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__INPUT_VARIABLE, oldInputVariable, inputVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputVariable() {
		return outputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputVariable(String newOutputVariable) {
		String oldOutputVariable = outputVariable;
		outputVariable = newOutputVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__OUTPUT_VARIABLE, oldOutputVariable, outputVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerLink() {
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLink(String newPartnerLink) {
		String oldPartnerLink = partnerLink;
		partnerLink = newPartnerLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__PARTNER_LINK, oldPartnerLink, partnerLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(QName newPortType) {
		QName oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.INVOKE__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.INVOKE__CORRELATIONS:
				return basicSetCorrelations(null, msgs);
			case ExecutablePackage.INVOKE__CATCH:
				return ((InternalEList<?>)getCatch()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.INVOKE__CATCH_ALL:
				return basicSetCatchAll(null, msgs);
			case ExecutablePackage.INVOKE__COMPENSATION_HANDLER:
				return basicSetCompensationHandler(null, msgs);
			case ExecutablePackage.INVOKE__TO_PARTS:
				return basicSetToParts(null, msgs);
			case ExecutablePackage.INVOKE__FROM_PARTS:
				return basicSetFromParts(null, msgs);
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
			case ExecutablePackage.INVOKE__CORRELATIONS:
				return getCorrelations();
			case ExecutablePackage.INVOKE__CATCH:
				return getCatch();
			case ExecutablePackage.INVOKE__CATCH_ALL:
				return getCatchAll();
			case ExecutablePackage.INVOKE__COMPENSATION_HANDLER:
				return getCompensationHandler();
			case ExecutablePackage.INVOKE__TO_PARTS:
				return getToParts();
			case ExecutablePackage.INVOKE__FROM_PARTS:
				return getFromParts();
			case ExecutablePackage.INVOKE__INPUT_VARIABLE:
				return getInputVariable();
			case ExecutablePackage.INVOKE__OPERATION:
				return getOperation();
			case ExecutablePackage.INVOKE__OUTPUT_VARIABLE:
				return getOutputVariable();
			case ExecutablePackage.INVOKE__PARTNER_LINK:
				return getPartnerLink();
			case ExecutablePackage.INVOKE__PORT_TYPE:
				return getPortType();
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
			case ExecutablePackage.INVOKE__CORRELATIONS:
				setCorrelations((CorrelationsWithPattern)newValue);
				return;
			case ExecutablePackage.INVOKE__CATCH:
				getCatch().clear();
				getCatch().addAll((Collection<? extends Catch>)newValue);
				return;
			case ExecutablePackage.INVOKE__CATCH_ALL:
				setCatchAll((ActivityContainer)newValue);
				return;
			case ExecutablePackage.INVOKE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)newValue);
				return;
			case ExecutablePackage.INVOKE__TO_PARTS:
				setToParts((ToParts)newValue);
				return;
			case ExecutablePackage.INVOKE__FROM_PARTS:
				setFromParts((FromParts)newValue);
				return;
			case ExecutablePackage.INVOKE__INPUT_VARIABLE:
				setInputVariable((String)newValue);
				return;
			case ExecutablePackage.INVOKE__OPERATION:
				setOperation((String)newValue);
				return;
			case ExecutablePackage.INVOKE__OUTPUT_VARIABLE:
				setOutputVariable((String)newValue);
				return;
			case ExecutablePackage.INVOKE__PARTNER_LINK:
				setPartnerLink((String)newValue);
				return;
			case ExecutablePackage.INVOKE__PORT_TYPE:
				setPortType((QName)newValue);
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
			case ExecutablePackage.INVOKE__CORRELATIONS:
				setCorrelations((CorrelationsWithPattern)null);
				return;
			case ExecutablePackage.INVOKE__CATCH:
				getCatch().clear();
				return;
			case ExecutablePackage.INVOKE__CATCH_ALL:
				setCatchAll((ActivityContainer)null);
				return;
			case ExecutablePackage.INVOKE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)null);
				return;
			case ExecutablePackage.INVOKE__TO_PARTS:
				setToParts((ToParts)null);
				return;
			case ExecutablePackage.INVOKE__FROM_PARTS:
				setFromParts((FromParts)null);
				return;
			case ExecutablePackage.INVOKE__INPUT_VARIABLE:
				setInputVariable(INPUT_VARIABLE_EDEFAULT);
				return;
			case ExecutablePackage.INVOKE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ExecutablePackage.INVOKE__OUTPUT_VARIABLE:
				setOutputVariable(OUTPUT_VARIABLE_EDEFAULT);
				return;
			case ExecutablePackage.INVOKE__PARTNER_LINK:
				setPartnerLink(PARTNER_LINK_EDEFAULT);
				return;
			case ExecutablePackage.INVOKE__PORT_TYPE:
				setPortType(PORT_TYPE_EDEFAULT);
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
			case ExecutablePackage.INVOKE__CORRELATIONS:
				return correlations != null;
			case ExecutablePackage.INVOKE__CATCH:
				return catch_ != null && !catch_.isEmpty();
			case ExecutablePackage.INVOKE__CATCH_ALL:
				return catchAll != null;
			case ExecutablePackage.INVOKE__COMPENSATION_HANDLER:
				return compensationHandler != null;
			case ExecutablePackage.INVOKE__TO_PARTS:
				return toParts != null;
			case ExecutablePackage.INVOKE__FROM_PARTS:
				return fromParts != null;
			case ExecutablePackage.INVOKE__INPUT_VARIABLE:
				return INPUT_VARIABLE_EDEFAULT == null ? inputVariable != null : !INPUT_VARIABLE_EDEFAULT.equals(inputVariable);
			case ExecutablePackage.INVOKE__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case ExecutablePackage.INVOKE__OUTPUT_VARIABLE:
				return OUTPUT_VARIABLE_EDEFAULT == null ? outputVariable != null : !OUTPUT_VARIABLE_EDEFAULT.equals(outputVariable);
			case ExecutablePackage.INVOKE__PARTNER_LINK:
				return PARTNER_LINK_EDEFAULT == null ? partnerLink != null : !PARTNER_LINK_EDEFAULT.equals(partnerLink);
			case ExecutablePackage.INVOKE__PORT_TYPE:
				return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
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
		result.append(" (inputVariable: ");
		result.append(inputVariable);
		result.append(", operation: ");
		result.append(operation);
		result.append(", outputVariable: ");
		result.append(outputVariable);
		result.append(", partnerLink: ");
		result.append(partnerLink);
		result.append(", portType: ");
		result.append(portType);
		result.append(')');
		return result.toString();
	}

} //InvokeImpl
