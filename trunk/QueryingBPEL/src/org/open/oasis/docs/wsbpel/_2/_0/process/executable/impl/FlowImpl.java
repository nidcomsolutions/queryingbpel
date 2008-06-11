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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Assign;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Compensate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Empty;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Exit;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Flow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Links;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Receive;
import org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Reply;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Scope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Throw;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Validate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Wait;
import org.open.oasis.docs.wsbpel._2._0.process.executable.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends ActivityImpl implements Flow {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected Links links;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Links getLinks() {
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinks(Links newLinks, NotificationChain msgs) {
		Links oldLinks = links;
		links = newLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.FLOW__LINKS, oldLinks, newLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(Links newLinks) {
		if (newLinks != links) {
			NotificationChain msgs = null;
			if (links != null)
				msgs = ((InternalEObject)links).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FLOW__LINKS, null, msgs);
			if (newLinks != null)
				msgs = ((InternalEObject)newLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.FLOW__LINKS, null, msgs);
			msgs = basicSetLinks(newLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.FLOW__LINKS, newLinks, newLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivity() {
		if (activity == null) {
			activity = new BasicFeatureMap(this, ExecutablePackage.FLOW__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assign> getAssign() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__ASSIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compensate> getCompensate() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__COMPENSATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompensateScope> getCompensateScope() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__COMPENSATE_SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empty> getEmpty() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__EMPTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exit> getExit() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__EXIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionActivity> getExtensionActivity() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__EXTENSION_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlow() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__FLOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForEach> getForEach() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__FOR_EACH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<If> getIf() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__IF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invoke> getInvoke() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__INVOKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pick> getPick() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__PICK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receive> getReceive() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__RECEIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepeatUntil> getRepeatUntil() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__REPEAT_UNTIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reply> getReply() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__REPLY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rethrow> getRethrow() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__RETHROW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getScope() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getSequence() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__SEQUENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Throw> getThrow() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__THROW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validate> getValidate() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__VALIDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wait> getWait() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__WAIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<While> getWhile() {
		return getActivity().list(ExecutablePackage.Literals.FLOW__WHILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.FLOW__LINKS:
				return basicSetLinks(null, msgs);
			case ExecutablePackage.FLOW__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__ASSIGN:
				return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__COMPENSATE:
				return ((InternalEList<?>)getCompensate()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__COMPENSATE_SCOPE:
				return ((InternalEList<?>)getCompensateScope()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__EMPTY:
				return ((InternalEList<?>)getEmpty()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__EXIT:
				return ((InternalEList<?>)getExit()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__EXTENSION_ACTIVITY:
				return ((InternalEList<?>)getExtensionActivity()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__FLOW:
				return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__FOR_EACH:
				return ((InternalEList<?>)getForEach()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__INVOKE:
				return ((InternalEList<?>)getInvoke()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__PICK:
				return ((InternalEList<?>)getPick()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__RECEIVE:
				return ((InternalEList<?>)getReceive()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__REPEAT_UNTIL:
				return ((InternalEList<?>)getRepeatUntil()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__REPLY:
				return ((InternalEList<?>)getReply()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__RETHROW:
				return ((InternalEList<?>)getRethrow()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__SCOPE:
				return ((InternalEList<?>)getScope()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__THROW:
				return ((InternalEList<?>)getThrow()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__WAIT:
				return ((InternalEList<?>)getWait()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.FLOW__WHILE:
				return ((InternalEList<?>)getWhile()).basicRemove(otherEnd, msgs);
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
			case ExecutablePackage.FLOW__LINKS:
				return getLinks();
			case ExecutablePackage.FLOW__ACTIVITY:
				if (coreType) return getActivity();
				return ((FeatureMap.Internal)getActivity()).getWrapper();
			case ExecutablePackage.FLOW__ASSIGN:
				return getAssign();
			case ExecutablePackage.FLOW__COMPENSATE:
				return getCompensate();
			case ExecutablePackage.FLOW__COMPENSATE_SCOPE:
				return getCompensateScope();
			case ExecutablePackage.FLOW__EMPTY:
				return getEmpty();
			case ExecutablePackage.FLOW__EXIT:
				return getExit();
			case ExecutablePackage.FLOW__EXTENSION_ACTIVITY:
				return getExtensionActivity();
			case ExecutablePackage.FLOW__FLOW:
				return getFlow();
			case ExecutablePackage.FLOW__FOR_EACH:
				return getForEach();
			case ExecutablePackage.FLOW__IF:
				return getIf();
			case ExecutablePackage.FLOW__INVOKE:
				return getInvoke();
			case ExecutablePackage.FLOW__PICK:
				return getPick();
			case ExecutablePackage.FLOW__RECEIVE:
				return getReceive();
			case ExecutablePackage.FLOW__REPEAT_UNTIL:
				return getRepeatUntil();
			case ExecutablePackage.FLOW__REPLY:
				return getReply();
			case ExecutablePackage.FLOW__RETHROW:
				return getRethrow();
			case ExecutablePackage.FLOW__SCOPE:
				return getScope();
			case ExecutablePackage.FLOW__SEQUENCE:
				return getSequence();
			case ExecutablePackage.FLOW__THROW:
				return getThrow();
			case ExecutablePackage.FLOW__VALIDATE:
				return getValidate();
			case ExecutablePackage.FLOW__WAIT:
				return getWait();
			case ExecutablePackage.FLOW__WHILE:
				return getWhile();
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
			case ExecutablePackage.FLOW__LINKS:
				setLinks((Links)newValue);
				return;
			case ExecutablePackage.FLOW__ACTIVITY:
				((FeatureMap.Internal)getActivity()).set(newValue);
				return;
			case ExecutablePackage.FLOW__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection<? extends Assign>)newValue);
				return;
			case ExecutablePackage.FLOW__COMPENSATE:
				getCompensate().clear();
				getCompensate().addAll((Collection<? extends Compensate>)newValue);
				return;
			case ExecutablePackage.FLOW__COMPENSATE_SCOPE:
				getCompensateScope().clear();
				getCompensateScope().addAll((Collection<? extends CompensateScope>)newValue);
				return;
			case ExecutablePackage.FLOW__EMPTY:
				getEmpty().clear();
				getEmpty().addAll((Collection<? extends Empty>)newValue);
				return;
			case ExecutablePackage.FLOW__EXIT:
				getExit().clear();
				getExit().addAll((Collection<? extends Exit>)newValue);
				return;
			case ExecutablePackage.FLOW__EXTENSION_ACTIVITY:
				getExtensionActivity().clear();
				getExtensionActivity().addAll((Collection<? extends ExtensionActivity>)newValue);
				return;
			case ExecutablePackage.FLOW__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection<? extends Flow>)newValue);
				return;
			case ExecutablePackage.FLOW__FOR_EACH:
				getForEach().clear();
				getForEach().addAll((Collection<? extends ForEach>)newValue);
				return;
			case ExecutablePackage.FLOW__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends If>)newValue);
				return;
			case ExecutablePackage.FLOW__INVOKE:
				getInvoke().clear();
				getInvoke().addAll((Collection<? extends Invoke>)newValue);
				return;
			case ExecutablePackage.FLOW__PICK:
				getPick().clear();
				getPick().addAll((Collection<? extends Pick>)newValue);
				return;
			case ExecutablePackage.FLOW__RECEIVE:
				getReceive().clear();
				getReceive().addAll((Collection<? extends Receive>)newValue);
				return;
			case ExecutablePackage.FLOW__REPEAT_UNTIL:
				getRepeatUntil().clear();
				getRepeatUntil().addAll((Collection<? extends RepeatUntil>)newValue);
				return;
			case ExecutablePackage.FLOW__REPLY:
				getReply().clear();
				getReply().addAll((Collection<? extends Reply>)newValue);
				return;
			case ExecutablePackage.FLOW__RETHROW:
				getRethrow().clear();
				getRethrow().addAll((Collection<? extends Rethrow>)newValue);
				return;
			case ExecutablePackage.FLOW__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Scope>)newValue);
				return;
			case ExecutablePackage.FLOW__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends Sequence>)newValue);
				return;
			case ExecutablePackage.FLOW__THROW:
				getThrow().clear();
				getThrow().addAll((Collection<? extends Throw>)newValue);
				return;
			case ExecutablePackage.FLOW__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends Validate>)newValue);
				return;
			case ExecutablePackage.FLOW__WAIT:
				getWait().clear();
				getWait().addAll((Collection<? extends Wait>)newValue);
				return;
			case ExecutablePackage.FLOW__WHILE:
				getWhile().clear();
				getWhile().addAll((Collection<? extends While>)newValue);
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
			case ExecutablePackage.FLOW__LINKS:
				setLinks((Links)null);
				return;
			case ExecutablePackage.FLOW__ACTIVITY:
				getActivity().clear();
				return;
			case ExecutablePackage.FLOW__ASSIGN:
				getAssign().clear();
				return;
			case ExecutablePackage.FLOW__COMPENSATE:
				getCompensate().clear();
				return;
			case ExecutablePackage.FLOW__COMPENSATE_SCOPE:
				getCompensateScope().clear();
				return;
			case ExecutablePackage.FLOW__EMPTY:
				getEmpty().clear();
				return;
			case ExecutablePackage.FLOW__EXIT:
				getExit().clear();
				return;
			case ExecutablePackage.FLOW__EXTENSION_ACTIVITY:
				getExtensionActivity().clear();
				return;
			case ExecutablePackage.FLOW__FLOW:
				getFlow().clear();
				return;
			case ExecutablePackage.FLOW__FOR_EACH:
				getForEach().clear();
				return;
			case ExecutablePackage.FLOW__IF:
				getIf().clear();
				return;
			case ExecutablePackage.FLOW__INVOKE:
				getInvoke().clear();
				return;
			case ExecutablePackage.FLOW__PICK:
				getPick().clear();
				return;
			case ExecutablePackage.FLOW__RECEIVE:
				getReceive().clear();
				return;
			case ExecutablePackage.FLOW__REPEAT_UNTIL:
				getRepeatUntil().clear();
				return;
			case ExecutablePackage.FLOW__REPLY:
				getReply().clear();
				return;
			case ExecutablePackage.FLOW__RETHROW:
				getRethrow().clear();
				return;
			case ExecutablePackage.FLOW__SCOPE:
				getScope().clear();
				return;
			case ExecutablePackage.FLOW__SEQUENCE:
				getSequence().clear();
				return;
			case ExecutablePackage.FLOW__THROW:
				getThrow().clear();
				return;
			case ExecutablePackage.FLOW__VALIDATE:
				getValidate().clear();
				return;
			case ExecutablePackage.FLOW__WAIT:
				getWait().clear();
				return;
			case ExecutablePackage.FLOW__WHILE:
				getWhile().clear();
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
			case ExecutablePackage.FLOW__LINKS:
				return links != null;
			case ExecutablePackage.FLOW__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case ExecutablePackage.FLOW__ASSIGN:
				return !getAssign().isEmpty();
			case ExecutablePackage.FLOW__COMPENSATE:
				return !getCompensate().isEmpty();
			case ExecutablePackage.FLOW__COMPENSATE_SCOPE:
				return !getCompensateScope().isEmpty();
			case ExecutablePackage.FLOW__EMPTY:
				return !getEmpty().isEmpty();
			case ExecutablePackage.FLOW__EXIT:
				return !getExit().isEmpty();
			case ExecutablePackage.FLOW__EXTENSION_ACTIVITY:
				return !getExtensionActivity().isEmpty();
			case ExecutablePackage.FLOW__FLOW:
				return !getFlow().isEmpty();
			case ExecutablePackage.FLOW__FOR_EACH:
				return !getForEach().isEmpty();
			case ExecutablePackage.FLOW__IF:
				return !getIf().isEmpty();
			case ExecutablePackage.FLOW__INVOKE:
				return !getInvoke().isEmpty();
			case ExecutablePackage.FLOW__PICK:
				return !getPick().isEmpty();
			case ExecutablePackage.FLOW__RECEIVE:
				return !getReceive().isEmpty();
			case ExecutablePackage.FLOW__REPEAT_UNTIL:
				return !getRepeatUntil().isEmpty();
			case ExecutablePackage.FLOW__REPLY:
				return !getReply().isEmpty();
			case ExecutablePackage.FLOW__RETHROW:
				return !getRethrow().isEmpty();
			case ExecutablePackage.FLOW__SCOPE:
				return !getScope().isEmpty();
			case ExecutablePackage.FLOW__SEQUENCE:
				return !getSequence().isEmpty();
			case ExecutablePackage.FLOW__THROW:
				return !getThrow().isEmpty();
			case ExecutablePackage.FLOW__VALIDATE:
				return !getValidate().isEmpty();
			case ExecutablePackage.FLOW__WAIT:
				return !getWait().isEmpty();
			case ExecutablePackage.FLOW__WHILE:
				return !getWhile().isEmpty();
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
		result.append(" (activity: ");
		result.append(activity);
		result.append(')');
		return result.toString();
	}

} //FlowImpl
