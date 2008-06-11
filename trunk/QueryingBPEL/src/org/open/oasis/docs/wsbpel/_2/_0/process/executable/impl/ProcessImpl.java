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

import org.open.oasis.docs.wsbpel._2._0.process.executable.Assign;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Compensate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Empty;
import org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Exit;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Extensions;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Flow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Import;
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
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getPartnerLinks <em>Partner Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getSuppressJoinFailure <em>Suppress Join Failure</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends ExtensibleElementsImpl implements org.open.oasis.docs.wsbpel._2._0.process.executable.Process {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected Extensions extensions;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> import_;

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
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean EXIT_ON_STANDARD_FAULT_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.NO;

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
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0";

	/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Expression Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expressionLanguageESet;

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
	 * The default value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_LANGUAGE_EDEFAULT = "urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0";

	/**
	 * The cached value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected String queryLanguage = QUERY_LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Query Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryLanguageESet;

	/**
	 * The default value of the '{@link #getSuppressJoinFailure() <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressJoinFailure()
	 * @generated
	 * @ordered
	 */
	protected static final org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean SUPPRESS_JOIN_FAILURE_EDEFAULT = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.NO;

	/**
	 * The cached value of the '{@link #getSuppressJoinFailure() <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressJoinFailure()
	 * @generated
	 * @ordered
	 */
	protected org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean suppressJoinFailure = SUPPRESS_JOIN_FAILURE_EDEFAULT;

	/**
	 * This is true if the Suppress Join Failure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suppressJoinFailureESet;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extensions getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(Extensions newExtensions, NotificationChain msgs) {
		Extensions oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(Extensions newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, ExecutablePackage.PROCESS__IMPORT);
		}
		return import_;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__PARTNER_LINKS, oldPartnerLinks, newPartnerLinks);
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
				msgs = ((InternalEObject)partnerLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__PARTNER_LINKS, null, msgs);
			if (newPartnerLinks != null)
				msgs = ((InternalEObject)newPartnerLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__PARTNER_LINKS, null, msgs);
			msgs = basicSetPartnerLinks(newPartnerLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__PARTNER_LINKS, newPartnerLinks, newPartnerLinks));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__MESSAGE_EXCHANGES, oldMessageExchanges, newMessageExchanges);
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
				msgs = ((InternalEObject)messageExchanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__MESSAGE_EXCHANGES, null, msgs);
			if (newMessageExchanges != null)
				msgs = ((InternalEObject)newMessageExchanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__MESSAGE_EXCHANGES, null, msgs);
			msgs = basicSetMessageExchanges(newMessageExchanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__MESSAGE_EXCHANGES, newMessageExchanges, newMessageExchanges));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__VARIABLES, oldVariables, newVariables);
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
				msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__VARIABLES, null, msgs);
			if (newVariables != null)
				msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__VARIABLES, null, msgs);
			msgs = basicSetVariables(newVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__VARIABLES, newVariables, newVariables));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__CORRELATION_SETS, oldCorrelationSets, newCorrelationSets);
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
				msgs = ((InternalEObject)correlationSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__CORRELATION_SETS, null, msgs);
			if (newCorrelationSets != null)
				msgs = ((InternalEObject)newCorrelationSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__CORRELATION_SETS, null, msgs);
			msgs = basicSetCorrelationSets(newCorrelationSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__CORRELATION_SETS, newCorrelationSets, newCorrelationSets));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__FAULT_HANDLERS, oldFaultHandlers, newFaultHandlers);
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
				msgs = ((InternalEObject)faultHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__FAULT_HANDLERS, null, msgs);
			if (newFaultHandlers != null)
				msgs = ((InternalEObject)newFaultHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__FAULT_HANDLERS, null, msgs);
			msgs = basicSetFaultHandlers(newFaultHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__FAULT_HANDLERS, newFaultHandlers, newFaultHandlers));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EVENT_HANDLERS, oldEventHandlers, newEventHandlers);
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
				msgs = ((InternalEObject)eventHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EVENT_HANDLERS, null, msgs);
			if (newEventHandlers != null)
				msgs = ((InternalEObject)newEventHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EVENT_HANDLERS, null, msgs);
			msgs = basicSetEventHandlers(newEventHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EVENT_HANDLERS, newEventHandlers, newEventHandlers));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__ASSIGN, oldAssign, newAssign);
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
				msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__ASSIGN, null, msgs);
			if (newAssign != null)
				msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__ASSIGN, null, msgs);
			msgs = basicSetAssign(newAssign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__ASSIGN, newAssign, newAssign));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__COMPENSATE, oldCompensate, newCompensate);
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
				msgs = ((InternalEObject)compensate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__COMPENSATE, null, msgs);
			if (newCompensate != null)
				msgs = ((InternalEObject)newCompensate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__COMPENSATE, null, msgs);
			msgs = basicSetCompensate(newCompensate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__COMPENSATE, newCompensate, newCompensate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__COMPENSATE_SCOPE, oldCompensateScope, newCompensateScope);
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
				msgs = ((InternalEObject)compensateScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__COMPENSATE_SCOPE, null, msgs);
			if (newCompensateScope != null)
				msgs = ((InternalEObject)newCompensateScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__COMPENSATE_SCOPE, null, msgs);
			msgs = basicSetCompensateScope(newCompensateScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__COMPENSATE_SCOPE, newCompensateScope, newCompensateScope));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EMPTY, oldEmpty, newEmpty);
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
				msgs = ((InternalEObject)empty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EMPTY, null, msgs);
			if (newEmpty != null)
				msgs = ((InternalEObject)newEmpty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EMPTY, null, msgs);
			msgs = basicSetEmpty(newEmpty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EMPTY, newEmpty, newEmpty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXIT, oldExit, newExit);
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
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXIT, newExit, newExit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXTENSION_ACTIVITY, oldExtensionActivity, newExtensionActivity);
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
				msgs = ((InternalEObject)extensionActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EXTENSION_ACTIVITY, null, msgs);
			if (newExtensionActivity != null)
				msgs = ((InternalEObject)newExtensionActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__EXTENSION_ACTIVITY, null, msgs);
			msgs = basicSetExtensionActivity(newExtensionActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXTENSION_ACTIVITY, newExtensionActivity, newExtensionActivity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__FLOW, oldFlow, newFlow);
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
				msgs = ((InternalEObject)flow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__FLOW, null, msgs);
			if (newFlow != null)
				msgs = ((InternalEObject)newFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__FLOW, null, msgs);
			msgs = basicSetFlow(newFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__FLOW, newFlow, newFlow));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__FOR_EACH, oldForEach, newForEach);
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
				msgs = ((InternalEObject)forEach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__FOR_EACH, null, msgs);
			if (newForEach != null)
				msgs = ((InternalEObject)newForEach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__FOR_EACH, null, msgs);
			msgs = basicSetForEach(newForEach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__FOR_EACH, newForEach, newForEach));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__IF, oldIf, newIf);
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
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__IF, newIf, newIf));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__INVOKE, oldInvoke, newInvoke);
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
				msgs = ((InternalEObject)invoke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__INVOKE, null, msgs);
			if (newInvoke != null)
				msgs = ((InternalEObject)newInvoke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__INVOKE, null, msgs);
			msgs = basicSetInvoke(newInvoke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__INVOKE, newInvoke, newInvoke));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__PICK, oldPick, newPick);
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
				msgs = ((InternalEObject)pick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__PICK, null, msgs);
			if (newPick != null)
				msgs = ((InternalEObject)newPick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__PICK, null, msgs);
			msgs = basicSetPick(newPick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__PICK, newPick, newPick));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__RECEIVE, oldReceive, newReceive);
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
				msgs = ((InternalEObject)receive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__RECEIVE, null, msgs);
			if (newReceive != null)
				msgs = ((InternalEObject)newReceive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__RECEIVE, null, msgs);
			msgs = basicSetReceive(newReceive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__RECEIVE, newReceive, newReceive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__REPEAT_UNTIL, oldRepeatUntil, newRepeatUntil);
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
				msgs = ((InternalEObject)repeatUntil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__REPEAT_UNTIL, null, msgs);
			if (newRepeatUntil != null)
				msgs = ((InternalEObject)newRepeatUntil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__REPEAT_UNTIL, null, msgs);
			msgs = basicSetRepeatUntil(newRepeatUntil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__REPEAT_UNTIL, newRepeatUntil, newRepeatUntil));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__REPLY, oldReply, newReply);
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
				msgs = ((InternalEObject)reply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__REPLY, null, msgs);
			if (newReply != null)
				msgs = ((InternalEObject)newReply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__REPLY, null, msgs);
			msgs = basicSetReply(newReply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__REPLY, newReply, newReply));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__RETHROW, oldRethrow, newRethrow);
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
				msgs = ((InternalEObject)rethrow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__RETHROW, null, msgs);
			if (newRethrow != null)
				msgs = ((InternalEObject)newRethrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__RETHROW, null, msgs);
			msgs = basicSetRethrow(newRethrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__RETHROW, newRethrow, newRethrow));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__SCOPE, oldScope, newScope);
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
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__SCOPE, newScope, newScope));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__SEQUENCE, oldSequence, newSequence);
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
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__SEQUENCE, newSequence, newSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__THROW, oldThrow, newThrow);
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
				msgs = ((InternalEObject)throw_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__THROW, null, msgs);
			if (newThrow != null)
				msgs = ((InternalEObject)newThrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__THROW, null, msgs);
			msgs = basicSetThrow(newThrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__THROW, newThrow, newThrow));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__VALIDATE, oldValidate, newValidate);
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
				msgs = ((InternalEObject)validate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__VALIDATE, null, msgs);
			if (newValidate != null)
				msgs = ((InternalEObject)newValidate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__VALIDATE, null, msgs);
			msgs = basicSetValidate(newValidate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__VALIDATE, newValidate, newValidate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__WAIT, oldWait, newWait);
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
				msgs = ((InternalEObject)wait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__WAIT, null, msgs);
			if (newWait != null)
				msgs = ((InternalEObject)newWait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__WAIT, null, msgs);
			msgs = basicSetWait(newWait, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__WAIT, newWait, newWait));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__WHILE, oldWhile, newWhile);
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
				msgs = ((InternalEObject)while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__WHILE, null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject)newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.PROCESS__WHILE, null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__WHILE, newWhile, newWhile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXIT_ON_STANDARD_FAULT, oldExitOnStandardFault, exitOnStandardFault, !oldExitOnStandardFaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.PROCESS__EXIT_ON_STANDARD_FAULT, oldExitOnStandardFault, EXIT_ON_STANDARD_FAULT_EDEFAULT, oldExitOnStandardFaultESet));
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
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage, !oldExpressionLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpressionLanguage() {
		String oldExpressionLanguage = expressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;
		expressionLanguageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.PROCESS__EXPRESSION_LANGUAGE, oldExpressionLanguage, EXPRESSION_LANGUAGE_EDEFAULT, oldExpressionLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpressionLanguage() {
		return expressionLanguageESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryLanguage() {
		return queryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryLanguage(String newQueryLanguage) {
		String oldQueryLanguage = queryLanguage;
		queryLanguage = newQueryLanguage;
		boolean oldQueryLanguageESet = queryLanguageESet;
		queryLanguageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__QUERY_LANGUAGE, oldQueryLanguage, queryLanguage, !oldQueryLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueryLanguage() {
		String oldQueryLanguage = queryLanguage;
		boolean oldQueryLanguageESet = queryLanguageESet;
		queryLanguage = QUERY_LANGUAGE_EDEFAULT;
		queryLanguageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.PROCESS__QUERY_LANGUAGE, oldQueryLanguage, QUERY_LANGUAGE_EDEFAULT, oldQueryLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueryLanguage() {
		return queryLanguageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getSuppressJoinFailure() {
		return suppressJoinFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressJoinFailure(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean newSuppressJoinFailure) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldSuppressJoinFailure = suppressJoinFailure;
		suppressJoinFailure = newSuppressJoinFailure == null ? SUPPRESS_JOIN_FAILURE_EDEFAULT : newSuppressJoinFailure;
		boolean oldSuppressJoinFailureESet = suppressJoinFailureESet;
		suppressJoinFailureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__SUPPRESS_JOIN_FAILURE, oldSuppressJoinFailure, suppressJoinFailure, !oldSuppressJoinFailureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuppressJoinFailure() {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean oldSuppressJoinFailure = suppressJoinFailure;
		boolean oldSuppressJoinFailureESet = suppressJoinFailureESet;
		suppressJoinFailure = SUPPRESS_JOIN_FAILURE_EDEFAULT;
		suppressJoinFailureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExecutablePackage.PROCESS__SUPPRESS_JOIN_FAILURE, oldSuppressJoinFailure, SUPPRESS_JOIN_FAILURE_EDEFAULT, oldSuppressJoinFailureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuppressJoinFailure() {
		return suppressJoinFailureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.PROCESS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.PROCESS__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case ExecutablePackage.PROCESS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.PROCESS__PARTNER_LINKS:
				return basicSetPartnerLinks(null, msgs);
			case ExecutablePackage.PROCESS__MESSAGE_EXCHANGES:
				return basicSetMessageExchanges(null, msgs);
			case ExecutablePackage.PROCESS__VARIABLES:
				return basicSetVariables(null, msgs);
			case ExecutablePackage.PROCESS__CORRELATION_SETS:
				return basicSetCorrelationSets(null, msgs);
			case ExecutablePackage.PROCESS__FAULT_HANDLERS:
				return basicSetFaultHandlers(null, msgs);
			case ExecutablePackage.PROCESS__EVENT_HANDLERS:
				return basicSetEventHandlers(null, msgs);
			case ExecutablePackage.PROCESS__ASSIGN:
				return basicSetAssign(null, msgs);
			case ExecutablePackage.PROCESS__COMPENSATE:
				return basicSetCompensate(null, msgs);
			case ExecutablePackage.PROCESS__COMPENSATE_SCOPE:
				return basicSetCompensateScope(null, msgs);
			case ExecutablePackage.PROCESS__EMPTY:
				return basicSetEmpty(null, msgs);
			case ExecutablePackage.PROCESS__EXIT:
				return basicSetExit(null, msgs);
			case ExecutablePackage.PROCESS__EXTENSION_ACTIVITY:
				return basicSetExtensionActivity(null, msgs);
			case ExecutablePackage.PROCESS__FLOW:
				return basicSetFlow(null, msgs);
			case ExecutablePackage.PROCESS__FOR_EACH:
				return basicSetForEach(null, msgs);
			case ExecutablePackage.PROCESS__IF:
				return basicSetIf(null, msgs);
			case ExecutablePackage.PROCESS__INVOKE:
				return basicSetInvoke(null, msgs);
			case ExecutablePackage.PROCESS__PICK:
				return basicSetPick(null, msgs);
			case ExecutablePackage.PROCESS__RECEIVE:
				return basicSetReceive(null, msgs);
			case ExecutablePackage.PROCESS__REPEAT_UNTIL:
				return basicSetRepeatUntil(null, msgs);
			case ExecutablePackage.PROCESS__REPLY:
				return basicSetReply(null, msgs);
			case ExecutablePackage.PROCESS__RETHROW:
				return basicSetRethrow(null, msgs);
			case ExecutablePackage.PROCESS__SCOPE:
				return basicSetScope(null, msgs);
			case ExecutablePackage.PROCESS__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ExecutablePackage.PROCESS__THROW:
				return basicSetThrow(null, msgs);
			case ExecutablePackage.PROCESS__VALIDATE:
				return basicSetValidate(null, msgs);
			case ExecutablePackage.PROCESS__WAIT:
				return basicSetWait(null, msgs);
			case ExecutablePackage.PROCESS__WHILE:
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
			case ExecutablePackage.PROCESS__EXTENSIONS:
				return getExtensions();
			case ExecutablePackage.PROCESS__IMPORT:
				return getImport();
			case ExecutablePackage.PROCESS__PARTNER_LINKS:
				return getPartnerLinks();
			case ExecutablePackage.PROCESS__MESSAGE_EXCHANGES:
				return getMessageExchanges();
			case ExecutablePackage.PROCESS__VARIABLES:
				return getVariables();
			case ExecutablePackage.PROCESS__CORRELATION_SETS:
				return getCorrelationSets();
			case ExecutablePackage.PROCESS__FAULT_HANDLERS:
				return getFaultHandlers();
			case ExecutablePackage.PROCESS__EVENT_HANDLERS:
				return getEventHandlers();
			case ExecutablePackage.PROCESS__ASSIGN:
				return getAssign();
			case ExecutablePackage.PROCESS__COMPENSATE:
				return getCompensate();
			case ExecutablePackage.PROCESS__COMPENSATE_SCOPE:
				return getCompensateScope();
			case ExecutablePackage.PROCESS__EMPTY:
				return getEmpty();
			case ExecutablePackage.PROCESS__EXIT:
				return getExit();
			case ExecutablePackage.PROCESS__EXTENSION_ACTIVITY:
				return getExtensionActivity();
			case ExecutablePackage.PROCESS__FLOW:
				return getFlow();
			case ExecutablePackage.PROCESS__FOR_EACH:
				return getForEach();
			case ExecutablePackage.PROCESS__IF:
				return getIf();
			case ExecutablePackage.PROCESS__INVOKE:
				return getInvoke();
			case ExecutablePackage.PROCESS__PICK:
				return getPick();
			case ExecutablePackage.PROCESS__RECEIVE:
				return getReceive();
			case ExecutablePackage.PROCESS__REPEAT_UNTIL:
				return getRepeatUntil();
			case ExecutablePackage.PROCESS__REPLY:
				return getReply();
			case ExecutablePackage.PROCESS__RETHROW:
				return getRethrow();
			case ExecutablePackage.PROCESS__SCOPE:
				return getScope();
			case ExecutablePackage.PROCESS__SEQUENCE:
				return getSequence();
			case ExecutablePackage.PROCESS__THROW:
				return getThrow();
			case ExecutablePackage.PROCESS__VALIDATE:
				return getValidate();
			case ExecutablePackage.PROCESS__WAIT:
				return getWait();
			case ExecutablePackage.PROCESS__WHILE:
				return getWhile();
			case ExecutablePackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				return getExitOnStandardFault();
			case ExecutablePackage.PROCESS__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case ExecutablePackage.PROCESS__NAME:
				return getName();
			case ExecutablePackage.PROCESS__QUERY_LANGUAGE:
				return getQueryLanguage();
			case ExecutablePackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ExecutablePackage.PROCESS__TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case ExecutablePackage.PROCESS__EXTENSIONS:
				setExtensions((Extensions)newValue);
				return;
			case ExecutablePackage.PROCESS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case ExecutablePackage.PROCESS__PARTNER_LINKS:
				setPartnerLinks((PartnerLinks)newValue);
				return;
			case ExecutablePackage.PROCESS__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)newValue);
				return;
			case ExecutablePackage.PROCESS__VARIABLES:
				setVariables((Variables)newValue);
				return;
			case ExecutablePackage.PROCESS__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)newValue);
				return;
			case ExecutablePackage.PROCESS__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)newValue);
				return;
			case ExecutablePackage.PROCESS__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)newValue);
				return;
			case ExecutablePackage.PROCESS__ASSIGN:
				setAssign((Assign)newValue);
				return;
			case ExecutablePackage.PROCESS__COMPENSATE:
				setCompensate((Compensate)newValue);
				return;
			case ExecutablePackage.PROCESS__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)newValue);
				return;
			case ExecutablePackage.PROCESS__EMPTY:
				setEmpty((Empty)newValue);
				return;
			case ExecutablePackage.PROCESS__EXIT:
				setExit((Exit)newValue);
				return;
			case ExecutablePackage.PROCESS__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)newValue);
				return;
			case ExecutablePackage.PROCESS__FLOW:
				setFlow((Flow)newValue);
				return;
			case ExecutablePackage.PROCESS__FOR_EACH:
				setForEach((ForEach)newValue);
				return;
			case ExecutablePackage.PROCESS__IF:
				setIf((If)newValue);
				return;
			case ExecutablePackage.PROCESS__INVOKE:
				setInvoke((Invoke)newValue);
				return;
			case ExecutablePackage.PROCESS__PICK:
				setPick((Pick)newValue);
				return;
			case ExecutablePackage.PROCESS__RECEIVE:
				setReceive((Receive)newValue);
				return;
			case ExecutablePackage.PROCESS__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)newValue);
				return;
			case ExecutablePackage.PROCESS__REPLY:
				setReply((Reply)newValue);
				return;
			case ExecutablePackage.PROCESS__RETHROW:
				setRethrow((Rethrow)newValue);
				return;
			case ExecutablePackage.PROCESS__SCOPE:
				setScope((Scope)newValue);
				return;
			case ExecutablePackage.PROCESS__SEQUENCE:
				setSequence((Sequence)newValue);
				return;
			case ExecutablePackage.PROCESS__THROW:
				setThrow((Throw)newValue);
				return;
			case ExecutablePackage.PROCESS__VALIDATE:
				setValidate((Validate)newValue);
				return;
			case ExecutablePackage.PROCESS__WAIT:
				setWait((Wait)newValue);
				return;
			case ExecutablePackage.PROCESS__WHILE:
				setWhile((While)newValue);
				return;
			case ExecutablePackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
				return;
			case ExecutablePackage.PROCESS__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case ExecutablePackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case ExecutablePackage.PROCESS__QUERY_LANGUAGE:
				setQueryLanguage((String)newValue);
				return;
			case ExecutablePackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)newValue);
				return;
			case ExecutablePackage.PROCESS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
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
			case ExecutablePackage.PROCESS__EXTENSIONS:
				setExtensions((Extensions)null);
				return;
			case ExecutablePackage.PROCESS__IMPORT:
				getImport().clear();
				return;
			case ExecutablePackage.PROCESS__PARTNER_LINKS:
				setPartnerLinks((PartnerLinks)null);
				return;
			case ExecutablePackage.PROCESS__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)null);
				return;
			case ExecutablePackage.PROCESS__VARIABLES:
				setVariables((Variables)null);
				return;
			case ExecutablePackage.PROCESS__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)null);
				return;
			case ExecutablePackage.PROCESS__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)null);
				return;
			case ExecutablePackage.PROCESS__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)null);
				return;
			case ExecutablePackage.PROCESS__ASSIGN:
				setAssign((Assign)null);
				return;
			case ExecutablePackage.PROCESS__COMPENSATE:
				setCompensate((Compensate)null);
				return;
			case ExecutablePackage.PROCESS__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)null);
				return;
			case ExecutablePackage.PROCESS__EMPTY:
				setEmpty((Empty)null);
				return;
			case ExecutablePackage.PROCESS__EXIT:
				setExit((Exit)null);
				return;
			case ExecutablePackage.PROCESS__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)null);
				return;
			case ExecutablePackage.PROCESS__FLOW:
				setFlow((Flow)null);
				return;
			case ExecutablePackage.PROCESS__FOR_EACH:
				setForEach((ForEach)null);
				return;
			case ExecutablePackage.PROCESS__IF:
				setIf((If)null);
				return;
			case ExecutablePackage.PROCESS__INVOKE:
				setInvoke((Invoke)null);
				return;
			case ExecutablePackage.PROCESS__PICK:
				setPick((Pick)null);
				return;
			case ExecutablePackage.PROCESS__RECEIVE:
				setReceive((Receive)null);
				return;
			case ExecutablePackage.PROCESS__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)null);
				return;
			case ExecutablePackage.PROCESS__REPLY:
				setReply((Reply)null);
				return;
			case ExecutablePackage.PROCESS__RETHROW:
				setRethrow((Rethrow)null);
				return;
			case ExecutablePackage.PROCESS__SCOPE:
				setScope((Scope)null);
				return;
			case ExecutablePackage.PROCESS__SEQUENCE:
				setSequence((Sequence)null);
				return;
			case ExecutablePackage.PROCESS__THROW:
				setThrow((Throw)null);
				return;
			case ExecutablePackage.PROCESS__VALIDATE:
				setValidate((Validate)null);
				return;
			case ExecutablePackage.PROCESS__WAIT:
				setWait((Wait)null);
				return;
			case ExecutablePackage.PROCESS__WHILE:
				setWhile((While)null);
				return;
			case ExecutablePackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				unsetExitOnStandardFault();
				return;
			case ExecutablePackage.PROCESS__EXPRESSION_LANGUAGE:
				unsetExpressionLanguage();
				return;
			case ExecutablePackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExecutablePackage.PROCESS__QUERY_LANGUAGE:
				unsetQueryLanguage();
				return;
			case ExecutablePackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ExecutablePackage.PROCESS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
			case ExecutablePackage.PROCESS__EXTENSIONS:
				return extensions != null;
			case ExecutablePackage.PROCESS__IMPORT:
				return import_ != null && !import_.isEmpty();
			case ExecutablePackage.PROCESS__PARTNER_LINKS:
				return partnerLinks != null;
			case ExecutablePackage.PROCESS__MESSAGE_EXCHANGES:
				return messageExchanges != null;
			case ExecutablePackage.PROCESS__VARIABLES:
				return variables != null;
			case ExecutablePackage.PROCESS__CORRELATION_SETS:
				return correlationSets != null;
			case ExecutablePackage.PROCESS__FAULT_HANDLERS:
				return faultHandlers != null;
			case ExecutablePackage.PROCESS__EVENT_HANDLERS:
				return eventHandlers != null;
			case ExecutablePackage.PROCESS__ASSIGN:
				return assign != null;
			case ExecutablePackage.PROCESS__COMPENSATE:
				return compensate != null;
			case ExecutablePackage.PROCESS__COMPENSATE_SCOPE:
				return compensateScope != null;
			case ExecutablePackage.PROCESS__EMPTY:
				return empty != null;
			case ExecutablePackage.PROCESS__EXIT:
				return exit != null;
			case ExecutablePackage.PROCESS__EXTENSION_ACTIVITY:
				return extensionActivity != null;
			case ExecutablePackage.PROCESS__FLOW:
				return flow != null;
			case ExecutablePackage.PROCESS__FOR_EACH:
				return forEach != null;
			case ExecutablePackage.PROCESS__IF:
				return if_ != null;
			case ExecutablePackage.PROCESS__INVOKE:
				return invoke != null;
			case ExecutablePackage.PROCESS__PICK:
				return pick != null;
			case ExecutablePackage.PROCESS__RECEIVE:
				return receive != null;
			case ExecutablePackage.PROCESS__REPEAT_UNTIL:
				return repeatUntil != null;
			case ExecutablePackage.PROCESS__REPLY:
				return reply != null;
			case ExecutablePackage.PROCESS__RETHROW:
				return rethrow != null;
			case ExecutablePackage.PROCESS__SCOPE:
				return scope != null;
			case ExecutablePackage.PROCESS__SEQUENCE:
				return sequence != null;
			case ExecutablePackage.PROCESS__THROW:
				return throw_ != null;
			case ExecutablePackage.PROCESS__VALIDATE:
				return validate != null;
			case ExecutablePackage.PROCESS__WAIT:
				return wait != null;
			case ExecutablePackage.PROCESS__WHILE:
				return while_ != null;
			case ExecutablePackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				return isSetExitOnStandardFault();
			case ExecutablePackage.PROCESS__EXPRESSION_LANGUAGE:
				return isSetExpressionLanguage();
			case ExecutablePackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExecutablePackage.PROCESS__QUERY_LANGUAGE:
				return isSetQueryLanguage();
			case ExecutablePackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ExecutablePackage.PROCESS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
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
		result.append(", expressionLanguage: ");
		if (expressionLanguageESet) result.append(expressionLanguage); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", queryLanguage: ");
		if (queryLanguageESet) result.append(queryLanguage); else result.append("<unset>");
		result.append(", suppressJoinFailure: ");
		if (suppressJoinFailureESet) result.append(suppressJoinFailure); else result.append("<unset>");
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
