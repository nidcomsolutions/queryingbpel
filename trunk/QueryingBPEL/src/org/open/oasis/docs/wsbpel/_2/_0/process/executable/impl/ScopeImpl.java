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

import org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Assign;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Compensate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Empty;
import org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Exit;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Flow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges;
import org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLinks;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Receive;
import org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Reply;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Scope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Throw;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Validate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Variables;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Wait;
import org.open.oasis.docs.wsbpel._2._0.process.executable.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getPartnerLinks <em>Partner Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getTerminationHandler <em>Termination Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl#getIsolated <em>Isolated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends ActivityImpl implements Scope {
	/**
	 * The cached value of the '{@link #getPartnerLinks() <em>Partner Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLinks()
	 * @generated
	 * @ordered
	 */
	protected PartnerLinks partnerLinks;

	/**
	 * The cached value of the '{@link #getMessageExchanges() <em>Message Exchanges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchanges()
	 * @generated
	 * @ordered
	 */
	protected MessageExchanges messageExchanges;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected Variables variables;

	/**
	 * The cached value of the '{@link #getCorrelationSets() <em>Correlation Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationSets()
	 * @generated
	 * @ordered
	 */
	protected CorrelationSets correlationSets;

	/**
	 * The cached value of the '{@link #getFaultHandlers() <em>Fault Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultHandlers()
	 * @generated
	 * @ordered
	 */
	protected FaultHandlers faultHandlers;

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
	 * The cached value of the '{@link #getTerminationHandler() <em>Termination Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationHandler()
	 * @generated
	 * @ordered
	 */
	protected ActivityContainer terminationHandler;

	/**
	 * The cached value of the '{@link #getEventHandlers() <em>Event Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandlers()
	 * @generated
	 * @ordered
	 */
	protected EventHandlers eventHandlers;

	/**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected Assign assign;

	/**
	 * The cached value of the '{@link #getCompensate() <em>Compensate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensate()
	 * @generated
	 * @ordered
	 */
	protected Compensate compensate;

	/**
	 * The cached value of the '{@link #getCompensateScope() <em>Compensate Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensateScope()
	 * @generated
	 * @ordered
	 */
	protected CompensateScope compensateScope;

	/**
	 * The cached value of the '{@link #getEmpty() <em>Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpty()
	 * @generated
	 * @ordered
	 */
	protected Empty empty;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Exit exit;

	/**
	 * The cached value of the '{@link #getExtensionActivity() <em>Extension Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionActivity()
	 * @generated
	 * @ordered
	 */
	protected ExtensionActivity extensionActivity;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected Flow flow;

	/**
	 * The cached value of the '{@link #getForEach() <em>For Each</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForEach()
	 * @generated
	 * @ordered
	 */
	protected ForEach forEach;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected If if_;

	/**
	 * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoke()
	 * @generated
	 * @ordered
	 */
	protected Invoke invoke;

	/**
	 * The cached value of the '{@link #getPick() <em>Pick</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPick()
	 * @generated
	 * @ordered
	 */
	protected Pick pick;

	/**
	 * The cached value of the '{@link #getReceive() <em>Receive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive()
	 * @generated
	 * @ordered
	 */
	protected Receive receive;

	/**
	 * The cached value of the '{@link #getRepeatUntil() <em>Repeat Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUntil()
	 * @generated
	 * @ordered
	 */
	protected RepeatUntil repeatUntil;

	/**
	 * The cached value of the '{@link #getReply() <em>Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply()
	 * @generated
	 * @ordered
	 */
	protected Reply reply;

	/**
	 * The cached value of the '{@link #getRethrow() <em>Rethrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRethrow()
	 * @generated
	 * @ordered
	 */
	protected Rethrow rethrow;

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
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence sequence;

	/**
	 * The cached value of the '{@link #getThrow() <em>Throw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrow()
	 * @generated
	 * @ordered
	 */
	protected Throw throw_;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected Validate validate;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected Wait wait;

	/**
	 * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
	protected While while_;

	/**
	 * The default value of the '{@link #getExitOnStandardFault() <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitOnStandardFault()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean EXIT_ON_STANDARD_FAULT_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.YES;

	/**
	 * The cached value of the '{@link #getExitOnStandardFault() <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitOnStandardFault()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean exitOnStandardFault = EXIT_ON_STANDARD_FAULT_EDEFAULT;

	/**
	 * This is true if the Exit On Standard Fault attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exitOnStandardFaultESet;

	/**
	 * The default value of the '{@link #getIsolated() <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean ISOLATED_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.NO;

	/**
	 * The cached value of the '{@link #getIsolated() <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean isolated = ISOLATED_EDEFAULT;

	/**
	 * This is true if the Isolated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isolatedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerLinks getPartnerLinks() {
		return partnerLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerLinks(PartnerLinks newPartnerLinks, NotificationChain msgs) {
		PartnerLinks oldPartnerLinks = partnerLinks;
		partnerLinks = newPartnerLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__PARTNER_LINKS, oldPartnerLinks, newPartnerLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLinks(PartnerLinks newPartnerLinks) {
		if (newPartnerLinks != partnerLinks) {
			NotificationChain msgs = null;
			if (partnerLinks != null)
				msgs = ((InternalEObject)partnerLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__PARTNER_LINKS, null, msgs);
			if (newPartnerLinks != null)
				msgs = ((InternalEObject)newPartnerLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__PARTNER_LINKS, null, msgs);
			msgs = basicSetPartnerLinks(newPartnerLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__PARTNER_LINKS, newPartnerLinks, newPartnerLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchanges getMessageExchanges() {
		return messageExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageExchanges(MessageExchanges newMessageExchanges, NotificationChain msgs) {
		MessageExchanges oldMessageExchanges = messageExchanges;
		messageExchanges = newMessageExchanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__MESSAGE_EXCHANGES, oldMessageExchanges, newMessageExchanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchanges(MessageExchanges newMessageExchanges) {
		if (newMessageExchanges != messageExchanges) {
			NotificationChain msgs = null;
			if (messageExchanges != null)
				msgs = ((InternalEObject)messageExchanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__MESSAGE_EXCHANGES, null, msgs);
			if (newMessageExchanges != null)
				msgs = ((InternalEObject)newMessageExchanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__MESSAGE_EXCHANGES, null, msgs);
			msgs = basicSetMessageExchanges(newMessageExchanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__MESSAGE_EXCHANGES, newMessageExchanges, newMessageExchanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variables getVariables() {
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariables(Variables newVariables, NotificationChain msgs) {
		Variables oldVariables = variables;
		variables = newVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__VARIABLES, oldVariables, newVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariables(Variables newVariables) {
		if (newVariables != variables) {
			NotificationChain msgs = null;
			if (variables != null)
				msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__VARIABLES, null, msgs);
			if (newVariables != null)
				msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__VARIABLES, null, msgs);
			msgs = basicSetVariables(newVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__VARIABLES, newVariables, newVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSets getCorrelationSets() {
		return correlationSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationSets(CorrelationSets newCorrelationSets, NotificationChain msgs) {
		CorrelationSets oldCorrelationSets = correlationSets;
		correlationSets = newCorrelationSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__CORRELATION_SETS, oldCorrelationSets, newCorrelationSets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationSets(CorrelationSets newCorrelationSets) {
		if (newCorrelationSets != correlationSets) {
			NotificationChain msgs = null;
			if (correlationSets != null)
				msgs = ((InternalEObject)correlationSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__CORRELATION_SETS, null, msgs);
			if (newCorrelationSets != null)
				msgs = ((InternalEObject)newCorrelationSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__CORRELATION_SETS, null, msgs);
			msgs = basicSetCorrelationSets(newCorrelationSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__CORRELATION_SETS, newCorrelationSets, newCorrelationSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultHandlers getFaultHandlers() {
		return faultHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultHandlers(FaultHandlers newFaultHandlers, NotificationChain msgs) {
		FaultHandlers oldFaultHandlers = faultHandlers;
		faultHandlers = newFaultHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__FAULT_HANDLERS, oldFaultHandlers, newFaultHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultHandlers(FaultHandlers newFaultHandlers) {
		if (newFaultHandlers != faultHandlers) {
			NotificationChain msgs = null;
			if (faultHandlers != null)
				msgs = ((InternalEObject)faultHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__FAULT_HANDLERS, null, msgs);
			if (newFaultHandlers != null)
				msgs = ((InternalEObject)newFaultHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__FAULT_HANDLERS, null, msgs);
			msgs = basicSetFaultHandlers(newFaultHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__FAULT_HANDLERS, newFaultHandlers, newFaultHandlers));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__COMPENSATION_HANDLER, oldCompensationHandler, newCompensationHandler);
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
				msgs = ((InternalEObject)compensationHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__COMPENSATION_HANDLER, null, msgs);
			if (newCompensationHandler != null)
				msgs = ((InternalEObject)newCompensationHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__COMPENSATION_HANDLER, null, msgs);
			msgs = basicSetCompensationHandler(newCompensationHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__COMPENSATION_HANDLER, newCompensationHandler, newCompensationHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getTerminationHandler() {
		return terminationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminationHandler(ActivityContainer newTerminationHandler, NotificationChain msgs) {
		ActivityContainer oldTerminationHandler = terminationHandler;
		terminationHandler = newTerminationHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__TERMINATION_HANDLER, oldTerminationHandler, newTerminationHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationHandler(ActivityContainer newTerminationHandler) {
		if (newTerminationHandler != terminationHandler) {
			NotificationChain msgs = null;
			if (terminationHandler != null)
				msgs = ((InternalEObject)terminationHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__TERMINATION_HANDLER, null, msgs);
			if (newTerminationHandler != null)
				msgs = ((InternalEObject)newTerminationHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__TERMINATION_HANDLER, null, msgs);
			msgs = basicSetTerminationHandler(newTerminationHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__TERMINATION_HANDLER, newTerminationHandler, newTerminationHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlers getEventHandlers() {
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventHandlers(EventHandlers newEventHandlers, NotificationChain msgs) {
		EventHandlers oldEventHandlers = eventHandlers;
		eventHandlers = newEventHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EVENT_HANDLERS, oldEventHandlers, newEventHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHandlers(EventHandlers newEventHandlers) {
		if (newEventHandlers != eventHandlers) {
			NotificationChain msgs = null;
			if (eventHandlers != null)
				msgs = ((InternalEObject)eventHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EVENT_HANDLERS, null, msgs);
			if (newEventHandlers != null)
				msgs = ((InternalEObject)newEventHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EVENT_HANDLERS, null, msgs);
			msgs = basicSetEventHandlers(newEventHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EVENT_HANDLERS, newEventHandlers, newEventHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign getAssign() {
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssign(Assign newAssign, NotificationChain msgs) {
		Assign oldAssign = assign;
		assign = newAssign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__ASSIGN, oldAssign, newAssign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssign(Assign newAssign) {
		if (newAssign != assign) {
			NotificationChain msgs = null;
			if (assign != null)
				msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__ASSIGN, null, msgs);
			if (newAssign != null)
				msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__ASSIGN, null, msgs);
			msgs = basicSetAssign(newAssign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__ASSIGN, newAssign, newAssign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compensate getCompensate() {
		return compensate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensate(Compensate newCompensate, NotificationChain msgs) {
		Compensate oldCompensate = compensate;
		compensate = newCompensate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__COMPENSATE, oldCompensate, newCompensate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensate(Compensate newCompensate) {
		if (newCompensate != compensate) {
			NotificationChain msgs = null;
			if (compensate != null)
				msgs = ((InternalEObject)compensate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__COMPENSATE, null, msgs);
			if (newCompensate != null)
				msgs = ((InternalEObject)newCompensate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__COMPENSATE, null, msgs);
			msgs = basicSetCompensate(newCompensate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__COMPENSATE, newCompensate, newCompensate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateScope getCompensateScope() {
		return compensateScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensateScope(CompensateScope newCompensateScope, NotificationChain msgs) {
		CompensateScope oldCompensateScope = compensateScope;
		compensateScope = newCompensateScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__COMPENSATE_SCOPE, oldCompensateScope, newCompensateScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensateScope(CompensateScope newCompensateScope) {
		if (newCompensateScope != compensateScope) {
			NotificationChain msgs = null;
			if (compensateScope != null)
				msgs = ((InternalEObject)compensateScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__COMPENSATE_SCOPE, null, msgs);
			if (newCompensateScope != null)
				msgs = ((InternalEObject)newCompensateScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__COMPENSATE_SCOPE, null, msgs);
			msgs = basicSetCompensateScope(newCompensateScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__COMPENSATE_SCOPE, newCompensateScope, newCompensateScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty getEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpty(Empty newEmpty, NotificationChain msgs) {
		Empty oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EMPTY, oldEmpty, newEmpty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(Empty newEmpty) {
		if (newEmpty != empty) {
			NotificationChain msgs = null;
			if (empty != null)
				msgs = ((InternalEObject)empty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EMPTY, null, msgs);
			if (newEmpty != null)
				msgs = ((InternalEObject)newEmpty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EMPTY, null, msgs);
			msgs = basicSetEmpty(newEmpty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EMPTY, newEmpty, newEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exit getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Exit newExit, NotificationChain msgs) {
		Exit oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Exit newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionActivity getExtensionActivity() {
		return extensionActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionActivity(ExtensionActivity newExtensionActivity, NotificationChain msgs) {
		ExtensionActivity oldExtensionActivity = extensionActivity;
		extensionActivity = newExtensionActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EXTENSION_ACTIVITY, oldExtensionActivity, newExtensionActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionActivity(ExtensionActivity newExtensionActivity) {
		if (newExtensionActivity != extensionActivity) {
			NotificationChain msgs = null;
			if (extensionActivity != null)
				msgs = ((InternalEObject)extensionActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EXTENSION_ACTIVITY, null, msgs);
			if (newExtensionActivity != null)
				msgs = ((InternalEObject)newExtensionActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__EXTENSION_ACTIVITY, null, msgs);
			msgs = basicSetExtensionActivity(newExtensionActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EXTENSION_ACTIVITY, newExtensionActivity, newExtensionActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlow(Flow newFlow, NotificationChain msgs) {
		Flow oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__FLOW, oldFlow, newFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(Flow newFlow) {
		if (newFlow != flow) {
			NotificationChain msgs = null;
			if (flow != null)
				msgs = ((InternalEObject)flow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__FLOW, null, msgs);
			if (newFlow != null)
				msgs = ((InternalEObject)newFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__FLOW, null, msgs);
			msgs = basicSetFlow(newFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__FLOW, newFlow, newFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach getForEach() {
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForEach(ForEach newForEach, NotificationChain msgs) {
		ForEach oldForEach = forEach;
		forEach = newForEach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__FOR_EACH, oldForEach, newForEach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEach(ForEach newForEach) {
		if (newForEach != forEach) {
			NotificationChain msgs = null;
			if (forEach != null)
				msgs = ((InternalEObject)forEach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__FOR_EACH, null, msgs);
			if (newForEach != null)
				msgs = ((InternalEObject)newForEach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__FOR_EACH, null, msgs);
			msgs = basicSetForEach(newForEach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__FOR_EACH, newForEach, newForEach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(If newIf, NotificationChain msgs) {
		If oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__IF, oldIf, newIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(If newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke getInvoke() {
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoke(Invoke newInvoke, NotificationChain msgs) {
		Invoke oldInvoke = invoke;
		invoke = newInvoke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__INVOKE, oldInvoke, newInvoke);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoke(Invoke newInvoke) {
		if (newInvoke != invoke) {
			NotificationChain msgs = null;
			if (invoke != null)
				msgs = ((InternalEObject)invoke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__INVOKE, null, msgs);
			if (newInvoke != null)
				msgs = ((InternalEObject)newInvoke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__INVOKE, null, msgs);
			msgs = basicSetInvoke(newInvoke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__INVOKE, newInvoke, newInvoke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pick getPick() {
		return pick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPick(Pick newPick, NotificationChain msgs) {
		Pick oldPick = pick;
		pick = newPick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__PICK, oldPick, newPick);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPick(Pick newPick) {
		if (newPick != pick) {
			NotificationChain msgs = null;
			if (pick != null)
				msgs = ((InternalEObject)pick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__PICK, null, msgs);
			if (newPick != null)
				msgs = ((InternalEObject)newPick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__PICK, null, msgs);
			msgs = basicSetPick(newPick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__PICK, newPick, newPick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receive getReceive() {
		return receive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceive(Receive newReceive, NotificationChain msgs) {
		Receive oldReceive = receive;
		receive = newReceive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__RECEIVE, oldReceive, newReceive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceive(Receive newReceive) {
		if (newReceive != receive) {
			NotificationChain msgs = null;
			if (receive != null)
				msgs = ((InternalEObject)receive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__RECEIVE, null, msgs);
			if (newReceive != null)
				msgs = ((InternalEObject)newReceive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__RECEIVE, null, msgs);
			msgs = basicSetReceive(newReceive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__RECEIVE, newReceive, newReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatUntil getRepeatUntil() {
		return repeatUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatUntil(RepeatUntil newRepeatUntil, NotificationChain msgs) {
		RepeatUntil oldRepeatUntil = repeatUntil;
		repeatUntil = newRepeatUntil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__REPEAT_UNTIL, oldRepeatUntil, newRepeatUntil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatUntil(RepeatUntil newRepeatUntil) {
		if (newRepeatUntil != repeatUntil) {
			NotificationChain msgs = null;
			if (repeatUntil != null)
				msgs = ((InternalEObject)repeatUntil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__REPEAT_UNTIL, null, msgs);
			if (newRepeatUntil != null)
				msgs = ((InternalEObject)newRepeatUntil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__REPEAT_UNTIL, null, msgs);
			msgs = basicSetRepeatUntil(newRepeatUntil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__REPEAT_UNTIL, newRepeatUntil, newRepeatUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reply getReply() {
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReply(Reply newReply, NotificationChain msgs) {
		Reply oldReply = reply;
		reply = newReply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__REPLY, oldReply, newReply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply(Reply newReply) {
		if (newReply != reply) {
			NotificationChain msgs = null;
			if (reply != null)
				msgs = ((InternalEObject)reply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__REPLY, null, msgs);
			if (newReply != null)
				msgs = ((InternalEObject)newReply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__REPLY, null, msgs);
			msgs = basicSetReply(newReply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__REPLY, newReply, newReply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rethrow getRethrow() {
		return rethrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRethrow(Rethrow newRethrow, NotificationChain msgs) {
		Rethrow oldRethrow = rethrow;
		rethrow = newRethrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__RETHROW, oldRethrow, newRethrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRethrow(Rethrow newRethrow) {
		if (newRethrow != rethrow) {
			NotificationChain msgs = null;
			if (rethrow != null)
				msgs = ((InternalEObject)rethrow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__RETHROW, null, msgs);
			if (newRethrow != null)
				msgs = ((InternalEObject)newRethrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__RETHROW, null, msgs);
			msgs = basicSetRethrow(newRethrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__RETHROW, newRethrow, newRethrow));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__SCOPE, oldScope, newScope);
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
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(Sequence newSequence, NotificationChain msgs) {
		Sequence oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throw getThrow() {
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrow(Throw newThrow, NotificationChain msgs) {
		Throw oldThrow = throw_;
		throw_ = newThrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__THROW, oldThrow, newThrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrow(Throw newThrow) {
		if (newThrow != throw_) {
			NotificationChain msgs = null;
			if (throw_ != null)
				msgs = ((InternalEObject)throw_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__THROW, null, msgs);
			if (newThrow != null)
				msgs = ((InternalEObject)newThrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__THROW, null, msgs);
			msgs = basicSetThrow(newThrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__THROW, newThrow, newThrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validate getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidate(Validate newValidate, NotificationChain msgs) {
		Validate oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__VALIDATE, oldValidate, newValidate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(Validate newValidate) {
		if (newValidate != validate) {
			NotificationChain msgs = null;
			if (validate != null)
				msgs = ((InternalEObject)validate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__VALIDATE, null, msgs);
			if (newValidate != null)
				msgs = ((InternalEObject)newValidate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__VALIDATE, null, msgs);
			msgs = basicSetValidate(newValidate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__VALIDATE, newValidate, newValidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait getWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWait(Wait newWait, NotificationChain msgs) {
		Wait oldWait = wait;
		wait = newWait;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__WAIT, oldWait, newWait);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(Wait newWait) {
		if (newWait != wait) {
			NotificationChain msgs = null;
			if (wait != null)
				msgs = ((InternalEObject)wait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__WAIT, null, msgs);
			if (newWait != null)
				msgs = ((InternalEObject)newWait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__WAIT, null, msgs);
			msgs = basicSetWait(newWait, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__WAIT, newWait, newWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While getWhile() {
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhile(While newWhile, NotificationChain msgs) {
		While oldWhile = while_;
		while_ = newWhile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__WHILE, oldWhile, newWhile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhile(While newWhile) {
		if (newWhile != while_) {
			NotificationChain msgs = null;
			if (while_ != null)
				msgs = ((InternalEObject)while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__WHILE, null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject)newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SCOPE__WHILE, null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__WHILE, newWhile, newWhile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getExitOnStandardFault() {
		return exitOnStandardFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitOnStandardFault(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newExitOnStandardFault) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldExitOnStandardFault = exitOnStandardFault;
		exitOnStandardFault = newExitOnStandardFault == null ? EXIT_ON_STANDARD_FAULT_EDEFAULT : newExitOnStandardFault;
		boolean oldExitOnStandardFaultESet = exitOnStandardFaultESet;
		exitOnStandardFaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__EXIT_ON_STANDARD_FAULT, oldExitOnStandardFault, exitOnStandardFault, !oldExitOnStandardFaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExitOnStandardFault() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldExitOnStandardFault = exitOnStandardFault;
		boolean oldExitOnStandardFaultESet = exitOnStandardFaultESet;
		exitOnStandardFault = EXIT_ON_STANDARD_FAULT_EDEFAULT;
		exitOnStandardFaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.SCOPE__EXIT_ON_STANDARD_FAULT, oldExitOnStandardFault, EXIT_ON_STANDARD_FAULT_EDEFAULT, oldExitOnStandardFaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExitOnStandardFault() {
		return exitOnStandardFaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getIsolated() {
		return isolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolated(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newIsolated) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldIsolated = isolated;
		isolated = newIsolated == null ? ISOLATED_EDEFAULT : newIsolated;
		boolean oldIsolatedESet = isolatedESet;
		isolatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SCOPE__ISOLATED, oldIsolated, isolated, !oldIsolatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsolated() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldIsolated = isolated;
		boolean oldIsolatedESet = isolatedESet;
		isolated = ISOLATED_EDEFAULT;
		isolatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.SCOPE__ISOLATED, oldIsolated, ISOLATED_EDEFAULT, oldIsolatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsolated() {
		return isolatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.SCOPE__PARTNER_LINKS:
				return basicSetPartnerLinks(null, msgs);
			case ExecutablePackage.SCOPE__MESSAGE_EXCHANGES:
				return basicSetMessageExchanges(null, msgs);
			case ExecutablePackage.SCOPE__VARIABLES:
				return basicSetVariables(null, msgs);
			case ExecutablePackage.SCOPE__CORRELATION_SETS:
				return basicSetCorrelationSets(null, msgs);
			case ExecutablePackage.SCOPE__FAULT_HANDLERS:
				return basicSetFaultHandlers(null, msgs);
			case ExecutablePackage.SCOPE__COMPENSATION_HANDLER:
				return basicSetCompensationHandler(null, msgs);
			case ExecutablePackage.SCOPE__TERMINATION_HANDLER:
				return basicSetTerminationHandler(null, msgs);
			case ExecutablePackage.SCOPE__EVENT_HANDLERS:
				return basicSetEventHandlers(null, msgs);
			case ExecutablePackage.SCOPE__ASSIGN:
				return basicSetAssign(null, msgs);
			case ExecutablePackage.SCOPE__COMPENSATE:
				return basicSetCompensate(null, msgs);
			case ExecutablePackage.SCOPE__COMPENSATE_SCOPE:
				return basicSetCompensateScope(null, msgs);
			case ExecutablePackage.SCOPE__EMPTY:
				return basicSetEmpty(null, msgs);
			case ExecutablePackage.SCOPE__EXIT:
				return basicSetExit(null, msgs);
			case ExecutablePackage.SCOPE__EXTENSION_ACTIVITY:
				return basicSetExtensionActivity(null, msgs);
			case ExecutablePackage.SCOPE__FLOW:
				return basicSetFlow(null, msgs);
			case ExecutablePackage.SCOPE__FOR_EACH:
				return basicSetForEach(null, msgs);
			case ExecutablePackage.SCOPE__IF:
				return basicSetIf(null, msgs);
			case ExecutablePackage.SCOPE__INVOKE:
				return basicSetInvoke(null, msgs);
			case ExecutablePackage.SCOPE__PICK:
				return basicSetPick(null, msgs);
			case ExecutablePackage.SCOPE__RECEIVE:
				return basicSetReceive(null, msgs);
			case ExecutablePackage.SCOPE__REPEAT_UNTIL:
				return basicSetRepeatUntil(null, msgs);
			case ExecutablePackage.SCOPE__REPLY:
				return basicSetReply(null, msgs);
			case ExecutablePackage.SCOPE__RETHROW:
				return basicSetRethrow(null, msgs);
			case ExecutablePackage.SCOPE__SCOPE:
				return basicSetScope(null, msgs);
			case ExecutablePackage.SCOPE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ExecutablePackage.SCOPE__THROW:
				return basicSetThrow(null, msgs);
			case ExecutablePackage.SCOPE__VALIDATE:
				return basicSetValidate(null, msgs);
			case ExecutablePackage.SCOPE__WAIT:
				return basicSetWait(null, msgs);
			case ExecutablePackage.SCOPE__WHILE:
				return basicSetWhile(null, msgs);
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
			case ExecutablePackage.SCOPE__PARTNER_LINKS:
				return getPartnerLinks();
			case ExecutablePackage.SCOPE__MESSAGE_EXCHANGES:
				return getMessageExchanges();
			case ExecutablePackage.SCOPE__VARIABLES:
				return getVariables();
			case ExecutablePackage.SCOPE__CORRELATION_SETS:
				return getCorrelationSets();
			case ExecutablePackage.SCOPE__FAULT_HANDLERS:
				return getFaultHandlers();
			case ExecutablePackage.SCOPE__COMPENSATION_HANDLER:
				return getCompensationHandler();
			case ExecutablePackage.SCOPE__TERMINATION_HANDLER:
				return getTerminationHandler();
			case ExecutablePackage.SCOPE__EVENT_HANDLERS:
				return getEventHandlers();
			case ExecutablePackage.SCOPE__ASSIGN:
				return getAssign();
			case ExecutablePackage.SCOPE__COMPENSATE:
				return getCompensate();
			case ExecutablePackage.SCOPE__COMPENSATE_SCOPE:
				return getCompensateScope();
			case ExecutablePackage.SCOPE__EMPTY:
				return getEmpty();
			case ExecutablePackage.SCOPE__EXIT:
				return getExit();
			case ExecutablePackage.SCOPE__EXTENSION_ACTIVITY:
				return getExtensionActivity();
			case ExecutablePackage.SCOPE__FLOW:
				return getFlow();
			case ExecutablePackage.SCOPE__FOR_EACH:
				return getForEach();
			case ExecutablePackage.SCOPE__IF:
				return getIf();
			case ExecutablePackage.SCOPE__INVOKE:
				return getInvoke();
			case ExecutablePackage.SCOPE__PICK:
				return getPick();
			case ExecutablePackage.SCOPE__RECEIVE:
				return getReceive();
			case ExecutablePackage.SCOPE__REPEAT_UNTIL:
				return getRepeatUntil();
			case ExecutablePackage.SCOPE__REPLY:
				return getReply();
			case ExecutablePackage.SCOPE__RETHROW:
				return getRethrow();
			case ExecutablePackage.SCOPE__SCOPE:
				return getScope();
			case ExecutablePackage.SCOPE__SEQUENCE:
				return getSequence();
			case ExecutablePackage.SCOPE__THROW:
				return getThrow();
			case ExecutablePackage.SCOPE__VALIDATE:
				return getValidate();
			case ExecutablePackage.SCOPE__WAIT:
				return getWait();
			case ExecutablePackage.SCOPE__WHILE:
				return getWhile();
			case ExecutablePackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				return getExitOnStandardFault();
			case ExecutablePackage.SCOPE__ISOLATED:
				return getIsolated();
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
			case ExecutablePackage.SCOPE__PARTNER_LINKS:
				setPartnerLinks((PartnerLinks)newValue);
				return;
			case ExecutablePackage.SCOPE__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)newValue);
				return;
			case ExecutablePackage.SCOPE__VARIABLES:
				setVariables((Variables)newValue);
				return;
			case ExecutablePackage.SCOPE__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)newValue);
				return;
			case ExecutablePackage.SCOPE__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)newValue);
				return;
			case ExecutablePackage.SCOPE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)newValue);
				return;
			case ExecutablePackage.SCOPE__TERMINATION_HANDLER:
				setTerminationHandler((ActivityContainer)newValue);
				return;
			case ExecutablePackage.SCOPE__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)newValue);
				return;
			case ExecutablePackage.SCOPE__ASSIGN:
				setAssign((Assign)newValue);
				return;
			case ExecutablePackage.SCOPE__COMPENSATE:
				setCompensate((Compensate)newValue);
				return;
			case ExecutablePackage.SCOPE__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)newValue);
				return;
			case ExecutablePackage.SCOPE__EMPTY:
				setEmpty((Empty)newValue);
				return;
			case ExecutablePackage.SCOPE__EXIT:
				setExit((Exit)newValue);
				return;
			case ExecutablePackage.SCOPE__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)newValue);
				return;
			case ExecutablePackage.SCOPE__FLOW:
				setFlow((Flow)newValue);
				return;
			case ExecutablePackage.SCOPE__FOR_EACH:
				setForEach((ForEach)newValue);
				return;
			case ExecutablePackage.SCOPE__IF:
				setIf((If)newValue);
				return;
			case ExecutablePackage.SCOPE__INVOKE:
				setInvoke((Invoke)newValue);
				return;
			case ExecutablePackage.SCOPE__PICK:
				setPick((Pick)newValue);
				return;
			case ExecutablePackage.SCOPE__RECEIVE:
				setReceive((Receive)newValue);
				return;
			case ExecutablePackage.SCOPE__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)newValue);
				return;
			case ExecutablePackage.SCOPE__REPLY:
				setReply((Reply)newValue);
				return;
			case ExecutablePackage.SCOPE__RETHROW:
				setRethrow((Rethrow)newValue);
				return;
			case ExecutablePackage.SCOPE__SCOPE:
				setScope((Scope)newValue);
				return;
			case ExecutablePackage.SCOPE__SEQUENCE:
				setSequence((Sequence)newValue);
				return;
			case ExecutablePackage.SCOPE__THROW:
				setThrow((Throw)newValue);
				return;
			case ExecutablePackage.SCOPE__VALIDATE:
				setValidate((Validate)newValue);
				return;
			case ExecutablePackage.SCOPE__WAIT:
				setWait((Wait)newValue);
				return;
			case ExecutablePackage.SCOPE__WHILE:
				setWhile((While)newValue);
				return;
			case ExecutablePackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
				return;
			case ExecutablePackage.SCOPE__ISOLATED:
				setIsolated((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
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
			case ExecutablePackage.SCOPE__PARTNER_LINKS:
				setPartnerLinks((PartnerLinks)null);
				return;
			case ExecutablePackage.SCOPE__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)null);
				return;
			case ExecutablePackage.SCOPE__VARIABLES:
				setVariables((Variables)null);
				return;
			case ExecutablePackage.SCOPE__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)null);
				return;
			case ExecutablePackage.SCOPE__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)null);
				return;
			case ExecutablePackage.SCOPE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)null);
				return;
			case ExecutablePackage.SCOPE__TERMINATION_HANDLER:
				setTerminationHandler((ActivityContainer)null);
				return;
			case ExecutablePackage.SCOPE__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)null);
				return;
			case ExecutablePackage.SCOPE__ASSIGN:
				setAssign((Assign)null);
				return;
			case ExecutablePackage.SCOPE__COMPENSATE:
				setCompensate((Compensate)null);
				return;
			case ExecutablePackage.SCOPE__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)null);
				return;
			case ExecutablePackage.SCOPE__EMPTY:
				setEmpty((Empty)null);
				return;
			case ExecutablePackage.SCOPE__EXIT:
				setExit((Exit)null);
				return;
			case ExecutablePackage.SCOPE__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)null);
				return;
			case ExecutablePackage.SCOPE__FLOW:
				setFlow((Flow)null);
				return;
			case ExecutablePackage.SCOPE__FOR_EACH:
				setForEach((ForEach)null);
				return;
			case ExecutablePackage.SCOPE__IF:
				setIf((If)null);
				return;
			case ExecutablePackage.SCOPE__INVOKE:
				setInvoke((Invoke)null);
				return;
			case ExecutablePackage.SCOPE__PICK:
				setPick((Pick)null);
				return;
			case ExecutablePackage.SCOPE__RECEIVE:
				setReceive((Receive)null);
				return;
			case ExecutablePackage.SCOPE__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)null);
				return;
			case ExecutablePackage.SCOPE__REPLY:
				setReply((Reply)null);
				return;
			case ExecutablePackage.SCOPE__RETHROW:
				setRethrow((Rethrow)null);
				return;
			case ExecutablePackage.SCOPE__SCOPE:
				setScope((Scope)null);
				return;
			case ExecutablePackage.SCOPE__SEQUENCE:
				setSequence((Sequence)null);
				return;
			case ExecutablePackage.SCOPE__THROW:
				setThrow((Throw)null);
				return;
			case ExecutablePackage.SCOPE__VALIDATE:
				setValidate((Validate)null);
				return;
			case ExecutablePackage.SCOPE__WAIT:
				setWait((Wait)null);
				return;
			case ExecutablePackage.SCOPE__WHILE:
				setWhile((While)null);
				return;
			case ExecutablePackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				unsetExitOnStandardFault();
				return;
			case ExecutablePackage.SCOPE__ISOLATED:
				unsetIsolated();
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
			case ExecutablePackage.SCOPE__PARTNER_LINKS:
				return partnerLinks != null;
			case ExecutablePackage.SCOPE__MESSAGE_EXCHANGES:
				return messageExchanges != null;
			case ExecutablePackage.SCOPE__VARIABLES:
				return variables != null;
			case ExecutablePackage.SCOPE__CORRELATION_SETS:
				return correlationSets != null;
			case ExecutablePackage.SCOPE__FAULT_HANDLERS:
				return faultHandlers != null;
			case ExecutablePackage.SCOPE__COMPENSATION_HANDLER:
				return compensationHandler != null;
			case ExecutablePackage.SCOPE__TERMINATION_HANDLER:
				return terminationHandler != null;
			case ExecutablePackage.SCOPE__EVENT_HANDLERS:
				return eventHandlers != null;
			case ExecutablePackage.SCOPE__ASSIGN:
				return assign != null;
			case ExecutablePackage.SCOPE__COMPENSATE:
				return compensate != null;
			case ExecutablePackage.SCOPE__COMPENSATE_SCOPE:
				return compensateScope != null;
			case ExecutablePackage.SCOPE__EMPTY:
				return empty != null;
			case ExecutablePackage.SCOPE__EXIT:
				return exit != null;
			case ExecutablePackage.SCOPE__EXTENSION_ACTIVITY:
				return extensionActivity != null;
			case ExecutablePackage.SCOPE__FLOW:
				return flow != null;
			case ExecutablePackage.SCOPE__FOR_EACH:
				return forEach != null;
			case ExecutablePackage.SCOPE__IF:
				return if_ != null;
			case ExecutablePackage.SCOPE__INVOKE:
				return invoke != null;
			case ExecutablePackage.SCOPE__PICK:
				return pick != null;
			case ExecutablePackage.SCOPE__RECEIVE:
				return receive != null;
			case ExecutablePackage.SCOPE__REPEAT_UNTIL:
				return repeatUntil != null;
			case ExecutablePackage.SCOPE__REPLY:
				return reply != null;
			case ExecutablePackage.SCOPE__RETHROW:
				return rethrow != null;
			case ExecutablePackage.SCOPE__SCOPE:
				return scope != null;
			case ExecutablePackage.SCOPE__SEQUENCE:
				return sequence != null;
			case ExecutablePackage.SCOPE__THROW:
				return throw_ != null;
			case ExecutablePackage.SCOPE__VALIDATE:
				return validate != null;
			case ExecutablePackage.SCOPE__WAIT:
				return wait != null;
			case ExecutablePackage.SCOPE__WHILE:
				return while_ != null;
			case ExecutablePackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				return isSetExitOnStandardFault();
			case ExecutablePackage.SCOPE__ISOLATED:
				return isSetIsolated();
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
		result.append(" (exitOnStandardFault: ");
		if (exitOnStandardFaultESet) result.append(exitOnStandardFault); else result.append("<unset>");
		result.append(", isolated: ");
		if (isolatedESet) result.append(isolated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
