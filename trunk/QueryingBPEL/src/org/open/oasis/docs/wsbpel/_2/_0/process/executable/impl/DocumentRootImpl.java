/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Assign;
import org.open.oasis.docs.wsbpel._2._0.process.executable.BooleanExpr;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Branches;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Catch;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Compensate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Condition;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Copy;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets;
import org.open.oasis.docs.wsbpel._2._0.process.executable.DeadlineExpr;
import org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation;
import org.open.oasis.docs.wsbpel._2._0.process.executable.DurationExpr;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Empty;
import org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Exit;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Expression;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Extension;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionAssignOperation;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Extensions;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Flow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.From;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Import;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Link;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Links;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Literal;
import org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchange;
import org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink;
import org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLinks;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Query;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Receive;
import org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Reply;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Scope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Source;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sources;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Target;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Targets;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Throw;
import org.open.oasis.docs.wsbpel._2._0.process.executable.To;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ToPart;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ToParts;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Validate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Variable;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Variables;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Wait;
import org.open.oasis.docs.wsbpel._2._0.process.executable.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCatchAll <em>Catch All</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCorrelationSet <em>Correlation Set</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getElse <em>Else</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getElseif <em>Elseif</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getExtensionAssignOperation <em>Extension Assign Operation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getFinalCounterValue <em>Final Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getFromPart <em>From Part</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getJoinCondition <em>Join Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getMessageExchange <em>Message Exchange</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getOnEvent <em>On Event</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getOnMessage <em>On Message</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getPartnerLinks <em>Partner Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getRepeatEvery <em>Repeat Every</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getStartCounterValue <em>Start Counter Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getTerminationHandler <em>Termination Handler</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getToPart <em>To Part</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getToParts <em>To Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ExecutablePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ExecutablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ExecutablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign getAssign() {
		return (Assign)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__ASSIGN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssign(Assign newAssign, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__ASSIGN, newAssign, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssign(Assign newAssign) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__ASSIGN, newAssign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branches getBranches() {
		return (Branches)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__BRANCHES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranches(Branches newBranches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__BRANCHES, newBranches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranches(Branches newBranches) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__BRANCHES, newBranches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catch getCatch() {
		return (Catch)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__CATCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatch(Catch newCatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__CATCH, newCatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatch(Catch newCatch) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__CATCH, newCatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getCatchAll() {
		return (ActivityContainer)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__CATCH_ALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchAll(ActivityContainer newCatchAll, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__CATCH_ALL, newCatchAll, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchAll(ActivityContainer newCatchAll) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__CATCH_ALL, newCatchAll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compensate getCompensate() {
		return (Compensate)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensate(Compensate newCompensate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATE, newCompensate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensate(Compensate newCompensate) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATE, newCompensate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateScope getCompensateScope() {
		return (CompensateScope)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATE_SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensateScope(CompensateScope newCompensateScope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATE_SCOPE, newCompensateScope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensateScope(CompensateScope newCompensateScope) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATE_SCOPE, newCompensateScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getCompensationHandler() {
		return (ActivityContainer)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATION_HANDLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensationHandler(ActivityContainer newCompensationHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATION_HANDLER, newCompensationHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationHandler(ActivityContainer newCompensationHandler) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPENSATION_HANDLER, newCompensationHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionCondition getCompletionCondition() {
		return (CompletionCondition)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPLETION_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionCondition(CompletionCondition newCompletionCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPLETION_CONDITION, newCompletionCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(CompletionCondition newCompletionCondition) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__COMPLETION_CONDITION, newCompletionCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getCondition() {
		return (BooleanExpr)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(BooleanExpr newCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__CONDITION, newCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BooleanExpr newCondition) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copy getCopy() {
		return (Copy)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__COPY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopy(Copy newCopy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__COPY, newCopy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopy(Copy newCopy) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__COPY, newCopy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSet getCorrelationSet() {
		return (CorrelationSet)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__CORRELATION_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationSet(CorrelationSet newCorrelationSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__CORRELATION_SET, newCorrelationSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationSet(CorrelationSet newCorrelationSet) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__CORRELATION_SET, newCorrelationSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSets getCorrelationSets() {
		return (CorrelationSets)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__CORRELATION_SETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationSets(CorrelationSets newCorrelationSets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__CORRELATION_SETS, newCorrelationSets, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationSets(CorrelationSets newCorrelationSets) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__CORRELATION_SETS, newCorrelationSets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation getDocumentation() {
		return (Documentation)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Documentation newDocumentation) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getElse() {
		return (ActivityContainer)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__ELSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(ActivityContainer newElse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__ELSE, newElse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(ActivityContainer newElse) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__ELSE, newElse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elseif getElseif() {
		return (Elseif)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__ELSEIF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseif(Elseif newElseif, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__ELSEIF, newElseif, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseif(Elseif newElseif) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__ELSEIF, newElseif);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty getEmpty() {
		return (Empty)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__EMPTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpty(Empty newEmpty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__EMPTY, newEmpty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(Empty newEmpty) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__EMPTY, newEmpty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlers getEventHandlers() {
		return (EventHandlers)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__EVENT_HANDLERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventHandlers(EventHandlers newEventHandlers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__EVENT_HANDLERS, newEventHandlers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHandlers(EventHandlers newEventHandlers) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__EVENT_HANDLERS, newEventHandlers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exit getExit() {
		return (Exit)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__EXIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Exit newExit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__EXIT, newExit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Exit newExit) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__EXIT, newExit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension() {
		return (Extension)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(Extension newExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION, newExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Extension newExtension) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION, newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionActivity getExtensionActivity() {
		return (ExtensionActivity)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION_ACTIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionActivity(ExtensionActivity newExtensionActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION_ACTIVITY, newExtensionActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionActivity(ExtensionActivity newExtensionActivity) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION_ACTIVITY, newExtensionActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAssignOperation getExtensionAssignOperation() {
		return (ExtensionAssignOperation)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionAssignOperation(ExtensionAssignOperation newExtensionAssignOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION, newExtensionAssignOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionAssignOperation(ExtensionAssignOperation newExtensionAssignOperation) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION, newExtensionAssignOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extensions getExtensions() {
		return (Extensions)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(Extensions newExtensions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSIONS, newExtensions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(Extensions newExtensions) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__EXTENSIONS, newExtensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultHandlers getFaultHandlers() {
		return (FaultHandlers)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FAULT_HANDLERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultHandlers(FaultHandlers newFaultHandlers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FAULT_HANDLERS, newFaultHandlers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultHandlers(FaultHandlers newFaultHandlers) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FAULT_HANDLERS, newFaultHandlers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFinalCounterValue() {
		return (Expression)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FINAL_COUNTER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalCounterValue(Expression newFinalCounterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FINAL_COUNTER_VALUE, newFinalCounterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalCounterValue(Expression newFinalCounterValue) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FINAL_COUNTER_VALUE, newFinalCounterValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getFlow() {
		return (Flow)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FLOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlow(Flow newFlow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FLOW, newFlow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(Flow newFlow) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FLOW, newFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationExpr getFor() {
		return (DurationExpr)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(DurationExpr newFor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FOR, newFor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(DurationExpr newFor) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FOR, newFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach getForEach() {
		return (ForEach)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FOR_EACH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForEach(ForEach newForEach, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FOR_EACH, newForEach, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEach(ForEach newForEach) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FOR_EACH, newForEach);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From getFrom() {
		return (From)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(From newFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM, newFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(From newFrom) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromPart getFromPart() {
		return (FromPart)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromPart(FromPart newFromPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM_PART, newFromPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPart(FromPart newFromPart) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM_PART, newFromPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromParts getFromParts() {
		return (FromParts)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM_PARTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromParts(FromParts newFromParts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM_PARTS, newFromParts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromParts(FromParts newFromParts) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__FROM_PARTS, newFromParts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If getIf() {
		return (If)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__IF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(If newIf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__IF, newIf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(If newIf) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__IF, newIf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		return (Import)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(Import newImport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__IMPORT, newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke getInvoke() {
		return (Invoke)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__INVOKE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoke(Invoke newInvoke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__INVOKE, newInvoke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoke(Invoke newInvoke) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__INVOKE, newInvoke);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getJoinCondition() {
		return (Condition)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__JOIN_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinCondition(Condition newJoinCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__JOIN_CONDITION, newJoinCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinCondition(Condition newJoinCondition) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__JOIN_CONDITION, newJoinCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getLink() {
		return (Link)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(Link newLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__LINK, newLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Link newLink) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Links getLinks() {
		return (Links)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinks(Links newLinks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__LINKS, newLinks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(Links newLinks) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__LINKS, newLinks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getLiteral() {
		return (Literal)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__LITERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__LITERAL, newLiteral, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(Literal newLiteral) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__LITERAL, newLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchange getMessageExchange() {
		return (MessageExchange)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageExchange(MessageExchange newMessageExchange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGE, newMessageExchange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchange(MessageExchange newMessageExchange) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGE, newMessageExchange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchanges getMessageExchanges() {
		return (MessageExchanges)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageExchanges(MessageExchanges newMessageExchanges, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGES, newMessageExchanges, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchanges(MessageExchanges newMessageExchanges) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGES, newMessageExchanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnEvent getOnEvent() {
		return (OnEvent)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__ON_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnEvent(OnEvent newOnEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__ON_EVENT, newOnEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnEvent(OnEvent newOnEvent) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__ON_EVENT, newOnEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMessage getOnMessage() {
		return (OnMessage)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__ON_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnMessage(OnMessage newOnMessage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__ON_MESSAGE, newOnMessage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnMessage(OnMessage newOnMessage) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__ON_MESSAGE, newOnMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerLink getPartnerLink() {
		return (PartnerLink)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__PARTNER_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerLink(PartnerLink newPartnerLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__PARTNER_LINK, newPartnerLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLink(PartnerLink newPartnerLink) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__PARTNER_LINK, newPartnerLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerLinks getPartnerLinks() {
		return (PartnerLinks)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__PARTNER_LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerLinks(PartnerLinks newPartnerLinks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__PARTNER_LINKS, newPartnerLinks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLinks(PartnerLinks newPartnerLinks) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__PARTNER_LINKS, newPartnerLinks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pick getPick() {
		return (Pick)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__PICK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPick(Pick newPick, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__PICK, newPick, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPick(Pick newPick) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__PICK, newPick);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Process getProcess() {
		return (org.open.oasis.docs.wsbpel._2._0.process.executable.Process)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__PROCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(org.open.oasis.docs.wsbpel._2._0.process.executable.Process newProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__PROCESS, newProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(org.open.oasis.docs.wsbpel._2._0.process.executable.Process newProcess) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__PROCESS, newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		return (Query)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__QUERY, newQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__QUERY, newQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receive getReceive() {
		return (Receive)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__RECEIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceive(Receive newReceive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__RECEIVE, newReceive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceive(Receive newReceive) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__RECEIVE, newReceive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationExpr getRepeatEvery() {
		return (DurationExpr)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__REPEAT_EVERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatEvery(DurationExpr newRepeatEvery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__REPEAT_EVERY, newRepeatEvery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatEvery(DurationExpr newRepeatEvery) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__REPEAT_EVERY, newRepeatEvery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatUntil getRepeatUntil() {
		return (RepeatUntil)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__REPEAT_UNTIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatUntil(RepeatUntil newRepeatUntil, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__REPEAT_UNTIL, newRepeatUntil, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatUntil(RepeatUntil newRepeatUntil) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__REPEAT_UNTIL, newRepeatUntil);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reply getReply() {
		return (Reply)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__REPLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReply(Reply newReply, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__REPLY, newReply, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply(Reply newReply) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__REPLY, newReply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rethrow getRethrow() {
		return (Rethrow)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__RETHROW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRethrow(Rethrow newRethrow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__RETHROW, newRethrow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRethrow(Rethrow newRethrow) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__RETHROW, newRethrow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return (Scope)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__SCOPE, newScope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		return (Sequence)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__SEQUENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(Sequence newSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__SEQUENCE, newSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__SEQUENCE, newSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return (Source)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sources getSources() {
		return (Sources)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__SOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSources(Sources newSources, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__SOURCES, newSources, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSources(Sources newSources) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__SOURCES, newSources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStartCounterValue() {
		return (Expression)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__START_COUNTER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCounterValue(Expression newStartCounterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__START_COUNTER_VALUE, newStartCounterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCounterValue(Expression newStartCounterValue) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__START_COUNTER_VALUE, newStartCounterValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getTarget() {
		return (Target)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__TARGET, newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Target newTarget) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Targets getTargets() {
		return (Targets)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__TARGETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargets(Targets newTargets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__TARGETS, newTargets, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargets(Targets newTargets) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__TARGETS, newTargets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getTerminationHandler() {
		return (ActivityContainer)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__TERMINATION_HANDLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminationHandler(ActivityContainer newTerminationHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__TERMINATION_HANDLER, newTerminationHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationHandler(ActivityContainer newTerminationHandler) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__TERMINATION_HANDLER, newTerminationHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throw getThrow() {
		return (Throw)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__THROW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrow(Throw newThrow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__THROW, newThrow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrow(Throw newThrow) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__THROW, newThrow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public To getTo() {
		return (To)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(To newTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__TO, newTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(To newTo) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToPart getToPart() {
		return (ToPart)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__TO_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToPart(ToPart newToPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__TO_PART, newToPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPart(ToPart newToPart) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__TO_PART, newToPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToParts getToParts() {
		return (ToParts)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__TO_PARTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToParts(ToParts newToParts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__TO_PARTS, newToParts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParts(ToParts newToParts) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__TO_PARTS, newToParts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getTransitionCondition() {
		return (Condition)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__TRANSITION_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionCondition(Condition newTransitionCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__TRANSITION_CONDITION, newTransitionCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionCondition(Condition newTransitionCondition) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__TRANSITION_CONDITION, newTransitionCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineExpr getUntil() {
		return (DeadlineExpr)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__UNTIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntil(DeadlineExpr newUntil, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__UNTIL, newUntil, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntil(DeadlineExpr newUntil) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__UNTIL, newUntil);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validate getValidate() {
		return (Validate)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__VALIDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidate(Validate newValidate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__VALIDATE, newValidate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(Validate newValidate) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__VALIDATE, newValidate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		return (Variable)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__VARIABLE, newVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variables getVariables() {
		return (Variables)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__VARIABLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariables(Variables newVariables, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__VARIABLES, newVariables, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariables(Variables newVariables) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__VARIABLES, newVariables);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait getWait() {
		return (Wait)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__WAIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWait(Wait newWait, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__WAIT, newWait, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(Wait newWait) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__WAIT, newWait);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While getWhile() {
		return (While)getMixed().get(ExecutablePackage.Literals.DOCUMENT_ROOT__WHILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhile(While newWhile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExecutablePackage.Literals.DOCUMENT_ROOT__WHILE, newWhile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhile(While newWhile) {
		((FeatureMap.Internal)getMixed()).set(ExecutablePackage.Literals.DOCUMENT_ROOT__WHILE, newWhile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__ASSIGN:
				return basicSetAssign(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__BRANCHES:
				return basicSetBranches(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__CATCH:
				return basicSetCatch(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__CATCH_ALL:
				return basicSetCatchAll(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE:
				return basicSetCompensate(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE_SCOPE:
				return basicSetCompensateScope(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATION_HANDLER:
				return basicSetCompensationHandler(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__COMPLETION_CONDITION:
				return basicSetCompletionCondition(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__CONDITION:
				return basicSetCondition(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__COPY:
				return basicSetCopy(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SET:
				return basicSetCorrelationSet(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SETS:
				return basicSetCorrelationSets(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__ELSE:
				return basicSetElse(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__ELSEIF:
				return basicSetElseif(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__EMPTY:
				return basicSetEmpty(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__EVENT_HANDLERS:
				return basicSetEventHandlers(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__EXIT:
				return basicSetExit(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION:
				return basicSetExtension(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ACTIVITY:
				return basicSetExtensionActivity(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION:
				return basicSetExtensionAssignOperation(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FAULT_HANDLERS:
				return basicSetFaultHandlers(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FINAL_COUNTER_VALUE:
				return basicSetFinalCounterValue(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FLOW:
				return basicSetFlow(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FOR:
				return basicSetFor(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FOR_EACH:
				return basicSetForEach(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FROM:
				return basicSetFrom(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PART:
				return basicSetFromPart(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PARTS:
				return basicSetFromParts(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__IF:
				return basicSetIf(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__INVOKE:
				return basicSetInvoke(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__JOIN_CONDITION:
				return basicSetJoinCondition(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__LINK:
				return basicSetLink(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__LINKS:
				return basicSetLinks(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__LITERAL:
				return basicSetLiteral(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE:
				return basicSetMessageExchange(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGES:
				return basicSetMessageExchanges(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__ON_EVENT:
				return basicSetOnEvent(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__ON_MESSAGE:
				return basicSetOnMessage(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINK:
				return basicSetPartnerLink(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINKS:
				return basicSetPartnerLinks(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__PICK:
				return basicSetPick(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__PROCESS:
				return basicSetProcess(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__QUERY:
				return basicSetQuery(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__RECEIVE:
				return basicSetReceive(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_EVERY:
				return basicSetRepeatEvery(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_UNTIL:
				return basicSetRepeatUntil(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__REPLY:
				return basicSetReply(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__RETHROW:
				return basicSetRethrow(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__SCOPE:
				return basicSetScope(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__SOURCE:
				return basicSetSource(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__SOURCES:
				return basicSetSources(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__START_COUNTER_VALUE:
				return basicSetStartCounterValue(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__TARGET:
				return basicSetTarget(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__TARGETS:
				return basicSetTargets(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__TERMINATION_HANDLER:
				return basicSetTerminationHandler(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__THROW:
				return basicSetThrow(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__TO:
				return basicSetTo(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__TO_PART:
				return basicSetToPart(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__TO_PARTS:
				return basicSetToParts(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__TRANSITION_CONDITION:
				return basicSetTransitionCondition(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__UNTIL:
				return basicSetUntil(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__VALIDATE:
				return basicSetValidate(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLE:
				return basicSetVariable(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLES:
				return basicSetVariables(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__WAIT:
				return basicSetWait(null, msgs);
			case ExecutablePackage.DOCUMENT_ROOT__WHILE:
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
			case ExecutablePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ExecutablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ExecutablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ExecutablePackage.DOCUMENT_ROOT__ASSIGN:
				return getAssign();
			case ExecutablePackage.DOCUMENT_ROOT__BRANCHES:
				return getBranches();
			case ExecutablePackage.DOCUMENT_ROOT__CATCH:
				return getCatch();
			case ExecutablePackage.DOCUMENT_ROOT__CATCH_ALL:
				return getCatchAll();
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE:
				return getCompensate();
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE_SCOPE:
				return getCompensateScope();
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATION_HANDLER:
				return getCompensationHandler();
			case ExecutablePackage.DOCUMENT_ROOT__COMPLETION_CONDITION:
				return getCompletionCondition();
			case ExecutablePackage.DOCUMENT_ROOT__CONDITION:
				return getCondition();
			case ExecutablePackage.DOCUMENT_ROOT__COPY:
				return getCopy();
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SET:
				return getCorrelationSet();
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SETS:
				return getCorrelationSets();
			case ExecutablePackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation();
			case ExecutablePackage.DOCUMENT_ROOT__ELSE:
				return getElse();
			case ExecutablePackage.DOCUMENT_ROOT__ELSEIF:
				return getElseif();
			case ExecutablePackage.DOCUMENT_ROOT__EMPTY:
				return getEmpty();
			case ExecutablePackage.DOCUMENT_ROOT__EVENT_HANDLERS:
				return getEventHandlers();
			case ExecutablePackage.DOCUMENT_ROOT__EXIT:
				return getExit();
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension();
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ACTIVITY:
				return getExtensionActivity();
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION:
				return getExtensionAssignOperation();
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSIONS:
				return getExtensions();
			case ExecutablePackage.DOCUMENT_ROOT__FAULT_HANDLERS:
				return getFaultHandlers();
			case ExecutablePackage.DOCUMENT_ROOT__FINAL_COUNTER_VALUE:
				return getFinalCounterValue();
			case ExecutablePackage.DOCUMENT_ROOT__FLOW:
				return getFlow();
			case ExecutablePackage.DOCUMENT_ROOT__FOR:
				return getFor();
			case ExecutablePackage.DOCUMENT_ROOT__FOR_EACH:
				return getForEach();
			case ExecutablePackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PART:
				return getFromPart();
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PARTS:
				return getFromParts();
			case ExecutablePackage.DOCUMENT_ROOT__IF:
				return getIf();
			case ExecutablePackage.DOCUMENT_ROOT__IMPORT:
				return getImport();
			case ExecutablePackage.DOCUMENT_ROOT__INVOKE:
				return getInvoke();
			case ExecutablePackage.DOCUMENT_ROOT__JOIN_CONDITION:
				return getJoinCondition();
			case ExecutablePackage.DOCUMENT_ROOT__LINK:
				return getLink();
			case ExecutablePackage.DOCUMENT_ROOT__LINKS:
				return getLinks();
			case ExecutablePackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral();
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE:
				return getMessageExchange();
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGES:
				return getMessageExchanges();
			case ExecutablePackage.DOCUMENT_ROOT__ON_EVENT:
				return getOnEvent();
			case ExecutablePackage.DOCUMENT_ROOT__ON_MESSAGE:
				return getOnMessage();
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINK:
				return getPartnerLink();
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINKS:
				return getPartnerLinks();
			case ExecutablePackage.DOCUMENT_ROOT__PICK:
				return getPick();
			case ExecutablePackage.DOCUMENT_ROOT__PROCESS:
				return getProcess();
			case ExecutablePackage.DOCUMENT_ROOT__QUERY:
				return getQuery();
			case ExecutablePackage.DOCUMENT_ROOT__RECEIVE:
				return getReceive();
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_EVERY:
				return getRepeatEvery();
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_UNTIL:
				return getRepeatUntil();
			case ExecutablePackage.DOCUMENT_ROOT__REPLY:
				return getReply();
			case ExecutablePackage.DOCUMENT_ROOT__RETHROW:
				return getRethrow();
			case ExecutablePackage.DOCUMENT_ROOT__SCOPE:
				return getScope();
			case ExecutablePackage.DOCUMENT_ROOT__SEQUENCE:
				return getSequence();
			case ExecutablePackage.DOCUMENT_ROOT__SOURCE:
				return getSource();
			case ExecutablePackage.DOCUMENT_ROOT__SOURCES:
				return getSources();
			case ExecutablePackage.DOCUMENT_ROOT__START_COUNTER_VALUE:
				return getStartCounterValue();
			case ExecutablePackage.DOCUMENT_ROOT__TARGET:
				return getTarget();
			case ExecutablePackage.DOCUMENT_ROOT__TARGETS:
				return getTargets();
			case ExecutablePackage.DOCUMENT_ROOT__TERMINATION_HANDLER:
				return getTerminationHandler();
			case ExecutablePackage.DOCUMENT_ROOT__THROW:
				return getThrow();
			case ExecutablePackage.DOCUMENT_ROOT__TO:
				return getTo();
			case ExecutablePackage.DOCUMENT_ROOT__TO_PART:
				return getToPart();
			case ExecutablePackage.DOCUMENT_ROOT__TO_PARTS:
				return getToParts();
			case ExecutablePackage.DOCUMENT_ROOT__TRANSITION_CONDITION:
				return getTransitionCondition();
			case ExecutablePackage.DOCUMENT_ROOT__UNTIL:
				return getUntil();
			case ExecutablePackage.DOCUMENT_ROOT__VALIDATE:
				return getValidate();
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable();
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLES:
				return getVariables();
			case ExecutablePackage.DOCUMENT_ROOT__WAIT:
				return getWait();
			case ExecutablePackage.DOCUMENT_ROOT__WHILE:
				return getWhile();
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
			case ExecutablePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ASSIGN:
				setAssign((Assign)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__BRANCHES:
				setBranches((Branches)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CATCH:
				setCatch((Catch)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CATCH_ALL:
				setCatchAll((ActivityContainer)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE:
				setCompensate((Compensate)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPLETION_CONDITION:
				setCompletionCondition((CompletionCondition)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CONDITION:
				setCondition((BooleanExpr)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COPY:
				setCopy((Copy)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SET:
				setCorrelationSet((CorrelationSet)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ELSE:
				setElse((ActivityContainer)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ELSEIF:
				setElseif((Elseif)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EMPTY:
				setEmpty((Empty)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXIT:
				setExit((Exit)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION:
				setExtensionAssignOperation((ExtensionAssignOperation)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSIONS:
				setExtensions((Extensions)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FINAL_COUNTER_VALUE:
				setFinalCounterValue((Expression)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FLOW:
				setFlow((Flow)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FOR:
				setFor((DurationExpr)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FOR_EACH:
				setForEach((ForEach)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FROM:
				setFrom((From)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PART:
				setFromPart((FromPart)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PARTS:
				setFromParts((FromParts)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__IF:
				setIf((If)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__INVOKE:
				setInvoke((Invoke)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__JOIN_CONDITION:
				setJoinCondition((Condition)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__LINK:
				setLink((Link)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__LINKS:
				setLinks((Links)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((Literal)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE:
				setMessageExchange((MessageExchange)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ON_EVENT:
				setOnEvent((OnEvent)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ON_MESSAGE:
				setOnMessage((OnMessage)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINK:
				setPartnerLink((PartnerLink)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINKS:
				setPartnerLinks((PartnerLinks)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PICK:
				setPick((Pick)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PROCESS:
				setProcess((org.open.oasis.docs.wsbpel._2._0.process.executable.Process)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__QUERY:
				setQuery((Query)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__RECEIVE:
				setReceive((Receive)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_EVERY:
				setRepeatEvery((DurationExpr)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__REPLY:
				setReply((Reply)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__RETHROW:
				setRethrow((Rethrow)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SCOPE:
				setScope((Scope)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SEQUENCE:
				setSequence((Sequence)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SOURCE:
				setSource((Source)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SOURCES:
				setSources((Sources)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__START_COUNTER_VALUE:
				setStartCounterValue((Expression)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TARGET:
				setTarget((Target)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TARGETS:
				setTargets((Targets)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TERMINATION_HANDLER:
				setTerminationHandler((ActivityContainer)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__THROW:
				setThrow((Throw)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TO:
				setTo((To)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TO_PART:
				setToPart((ToPart)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TO_PARTS:
				setToParts((ToParts)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TRANSITION_CONDITION:
				setTransitionCondition((Condition)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__UNTIL:
				setUntil((DeadlineExpr)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__VALIDATE:
				setValidate((Validate)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLES:
				setVariables((Variables)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__WAIT:
				setWait((Wait)newValue);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__WHILE:
				setWhile((While)newValue);
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
			case ExecutablePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ExecutablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ExecutablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ASSIGN:
				setAssign((Assign)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__BRANCHES:
				setBranches((Branches)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CATCH:
				setCatch((Catch)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CATCH_ALL:
				setCatchAll((ActivityContainer)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE:
				setCompensate((Compensate)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COMPLETION_CONDITION:
				setCompletionCondition((CompletionCondition)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CONDITION:
				setCondition((BooleanExpr)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__COPY:
				setCopy((Copy)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SET:
				setCorrelationSet((CorrelationSet)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ELSE:
				setElse((ActivityContainer)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ELSEIF:
				setElseif((Elseif)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EMPTY:
				setEmpty((Empty)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXIT:
				setExit((Exit)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION:
				setExtensionAssignOperation((ExtensionAssignOperation)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSIONS:
				setExtensions((Extensions)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FINAL_COUNTER_VALUE:
				setFinalCounterValue((Expression)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FLOW:
				setFlow((Flow)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FOR:
				setFor((DurationExpr)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FOR_EACH:
				setForEach((ForEach)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FROM:
				setFrom((From)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PART:
				setFromPart((FromPart)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PARTS:
				setFromParts((FromParts)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__IF:
				setIf((If)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__INVOKE:
				setInvoke((Invoke)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__JOIN_CONDITION:
				setJoinCondition((Condition)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__LINK:
				setLink((Link)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__LINKS:
				setLinks((Links)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((Literal)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE:
				setMessageExchange((MessageExchange)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ON_EVENT:
				setOnEvent((OnEvent)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__ON_MESSAGE:
				setOnMessage((OnMessage)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINK:
				setPartnerLink((PartnerLink)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINKS:
				setPartnerLinks((PartnerLinks)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PICK:
				setPick((Pick)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__PROCESS:
				setProcess((org.open.oasis.docs.wsbpel._2._0.process.executable.Process)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__QUERY:
				setQuery((Query)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__RECEIVE:
				setReceive((Receive)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_EVERY:
				setRepeatEvery((DurationExpr)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__REPLY:
				setReply((Reply)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__RETHROW:
				setRethrow((Rethrow)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SCOPE:
				setScope((Scope)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SEQUENCE:
				setSequence((Sequence)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SOURCE:
				setSource((Source)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__SOURCES:
				setSources((Sources)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__START_COUNTER_VALUE:
				setStartCounterValue((Expression)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TARGET:
				setTarget((Target)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TARGETS:
				setTargets((Targets)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TERMINATION_HANDLER:
				setTerminationHandler((ActivityContainer)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__THROW:
				setThrow((Throw)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TO:
				setTo((To)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TO_PART:
				setToPart((ToPart)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TO_PARTS:
				setToParts((ToParts)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__TRANSITION_CONDITION:
				setTransitionCondition((Condition)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__UNTIL:
				setUntil((DeadlineExpr)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__VALIDATE:
				setValidate((Validate)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((Variable)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLES:
				setVariables((Variables)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__WAIT:
				setWait((Wait)null);
				return;
			case ExecutablePackage.DOCUMENT_ROOT__WHILE:
				setWhile((While)null);
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
			case ExecutablePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ExecutablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ExecutablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ExecutablePackage.DOCUMENT_ROOT__ASSIGN:
				return getAssign() != null;
			case ExecutablePackage.DOCUMENT_ROOT__BRANCHES:
				return getBranches() != null;
			case ExecutablePackage.DOCUMENT_ROOT__CATCH:
				return getCatch() != null;
			case ExecutablePackage.DOCUMENT_ROOT__CATCH_ALL:
				return getCatchAll() != null;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE:
				return getCompensate() != null;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATE_SCOPE:
				return getCompensateScope() != null;
			case ExecutablePackage.DOCUMENT_ROOT__COMPENSATION_HANDLER:
				return getCompensationHandler() != null;
			case ExecutablePackage.DOCUMENT_ROOT__COMPLETION_CONDITION:
				return getCompletionCondition() != null;
			case ExecutablePackage.DOCUMENT_ROOT__CONDITION:
				return getCondition() != null;
			case ExecutablePackage.DOCUMENT_ROOT__COPY:
				return getCopy() != null;
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SET:
				return getCorrelationSet() != null;
			case ExecutablePackage.DOCUMENT_ROOT__CORRELATION_SETS:
				return getCorrelationSets() != null;
			case ExecutablePackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation() != null;
			case ExecutablePackage.DOCUMENT_ROOT__ELSE:
				return getElse() != null;
			case ExecutablePackage.DOCUMENT_ROOT__ELSEIF:
				return getElseif() != null;
			case ExecutablePackage.DOCUMENT_ROOT__EMPTY:
				return getEmpty() != null;
			case ExecutablePackage.DOCUMENT_ROOT__EVENT_HANDLERS:
				return getEventHandlers() != null;
			case ExecutablePackage.DOCUMENT_ROOT__EXIT:
				return getExit() != null;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension() != null;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ACTIVITY:
				return getExtensionActivity() != null;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION:
				return getExtensionAssignOperation() != null;
			case ExecutablePackage.DOCUMENT_ROOT__EXTENSIONS:
				return getExtensions() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FAULT_HANDLERS:
				return getFaultHandlers() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FINAL_COUNTER_VALUE:
				return getFinalCounterValue() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FLOW:
				return getFlow() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FOR:
				return getFor() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FOR_EACH:
				return getForEach() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FROM:
				return getFrom() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PART:
				return getFromPart() != null;
			case ExecutablePackage.DOCUMENT_ROOT__FROM_PARTS:
				return getFromParts() != null;
			case ExecutablePackage.DOCUMENT_ROOT__IF:
				return getIf() != null;
			case ExecutablePackage.DOCUMENT_ROOT__IMPORT:
				return getImport() != null;
			case ExecutablePackage.DOCUMENT_ROOT__INVOKE:
				return getInvoke() != null;
			case ExecutablePackage.DOCUMENT_ROOT__JOIN_CONDITION:
				return getJoinCondition() != null;
			case ExecutablePackage.DOCUMENT_ROOT__LINK:
				return getLink() != null;
			case ExecutablePackage.DOCUMENT_ROOT__LINKS:
				return getLinks() != null;
			case ExecutablePackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral() != null;
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE:
				return getMessageExchange() != null;
			case ExecutablePackage.DOCUMENT_ROOT__MESSAGE_EXCHANGES:
				return getMessageExchanges() != null;
			case ExecutablePackage.DOCUMENT_ROOT__ON_EVENT:
				return getOnEvent() != null;
			case ExecutablePackage.DOCUMENT_ROOT__ON_MESSAGE:
				return getOnMessage() != null;
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINK:
				return getPartnerLink() != null;
			case ExecutablePackage.DOCUMENT_ROOT__PARTNER_LINKS:
				return getPartnerLinks() != null;
			case ExecutablePackage.DOCUMENT_ROOT__PICK:
				return getPick() != null;
			case ExecutablePackage.DOCUMENT_ROOT__PROCESS:
				return getProcess() != null;
			case ExecutablePackage.DOCUMENT_ROOT__QUERY:
				return getQuery() != null;
			case ExecutablePackage.DOCUMENT_ROOT__RECEIVE:
				return getReceive() != null;
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_EVERY:
				return getRepeatEvery() != null;
			case ExecutablePackage.DOCUMENT_ROOT__REPEAT_UNTIL:
				return getRepeatUntil() != null;
			case ExecutablePackage.DOCUMENT_ROOT__REPLY:
				return getReply() != null;
			case ExecutablePackage.DOCUMENT_ROOT__RETHROW:
				return getRethrow() != null;
			case ExecutablePackage.DOCUMENT_ROOT__SCOPE:
				return getScope() != null;
			case ExecutablePackage.DOCUMENT_ROOT__SEQUENCE:
				return getSequence() != null;
			case ExecutablePackage.DOCUMENT_ROOT__SOURCE:
				return getSource() != null;
			case ExecutablePackage.DOCUMENT_ROOT__SOURCES:
				return getSources() != null;
			case ExecutablePackage.DOCUMENT_ROOT__START_COUNTER_VALUE:
				return getStartCounterValue() != null;
			case ExecutablePackage.DOCUMENT_ROOT__TARGET:
				return getTarget() != null;
			case ExecutablePackage.DOCUMENT_ROOT__TARGETS:
				return getTargets() != null;
			case ExecutablePackage.DOCUMENT_ROOT__TERMINATION_HANDLER:
				return getTerminationHandler() != null;
			case ExecutablePackage.DOCUMENT_ROOT__THROW:
				return getThrow() != null;
			case ExecutablePackage.DOCUMENT_ROOT__TO:
				return getTo() != null;
			case ExecutablePackage.DOCUMENT_ROOT__TO_PART:
				return getToPart() != null;
			case ExecutablePackage.DOCUMENT_ROOT__TO_PARTS:
				return getToParts() != null;
			case ExecutablePackage.DOCUMENT_ROOT__TRANSITION_CONDITION:
				return getTransitionCondition() != null;
			case ExecutablePackage.DOCUMENT_ROOT__UNTIL:
				return getUntil() != null;
			case ExecutablePackage.DOCUMENT_ROOT__VALIDATE:
				return getValidate() != null;
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable() != null;
			case ExecutablePackage.DOCUMENT_ROOT__VARIABLES:
				return getVariables() != null;
			case ExecutablePackage.DOCUMENT_ROOT__WAIT:
				return getWait() != null;
			case ExecutablePackage.DOCUMENT_ROOT__WHILE:
				return getWhile() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
