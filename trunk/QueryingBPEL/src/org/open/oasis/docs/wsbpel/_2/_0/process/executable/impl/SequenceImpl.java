/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends ActivityImpl implements Sequence {
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
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivity() {
		if (activity == null) {
			activity = new BasicFeatureMap(this, ExecutablePackage.SEQUENCE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assign> getAssign() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__ASSIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compensate> getCompensate() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__COMPENSATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompensateScope> getCompensateScope() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__COMPENSATE_SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empty> getEmpty() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__EMPTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exit> getExit() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__EXIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionActivity> getExtensionActivity() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__EXTENSION_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlow() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__FLOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForEach> getForEach() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__FOR_EACH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<If> getIf() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__IF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invoke> getInvoke() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__INVOKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pick> getPick() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__PICK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receive> getReceive() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__RECEIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepeatUntil> getRepeatUntil() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__REPEAT_UNTIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reply> getReply() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__REPLY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rethrow> getRethrow() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__RETHROW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getScope() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getSequence() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__SEQUENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Throw> getThrow() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__THROW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validate> getValidate() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__VALIDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wait> getWait() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__WAIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<While> getWhile() {
		return getActivity().list(ExecutablePackage.Literals.SEQUENCE__WHILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.SEQUENCE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__ASSIGN:
				return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__COMPENSATE:
				return ((InternalEList<?>)getCompensate()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__COMPENSATE_SCOPE:
				return ((InternalEList<?>)getCompensateScope()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__EMPTY:
				return ((InternalEList<?>)getEmpty()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__EXIT:
				return ((InternalEList<?>)getExit()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__EXTENSION_ACTIVITY:
				return ((InternalEList<?>)getExtensionActivity()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__FLOW:
				return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__FOR_EACH:
				return ((InternalEList<?>)getForEach()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__INVOKE:
				return ((InternalEList<?>)getInvoke()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__PICK:
				return ((InternalEList<?>)getPick()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__RECEIVE:
				return ((InternalEList<?>)getReceive()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__REPEAT_UNTIL:
				return ((InternalEList<?>)getRepeatUntil()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__REPLY:
				return ((InternalEList<?>)getReply()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__RETHROW:
				return ((InternalEList<?>)getRethrow()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__SCOPE:
				return ((InternalEList<?>)getScope()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__THROW:
				return ((InternalEList<?>)getThrow()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__WAIT:
				return ((InternalEList<?>)getWait()).basicRemove(otherEnd, msgs);
			case ExecutablePackage.SEQUENCE__WHILE:
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
			case ExecutablePackage.SEQUENCE__ACTIVITY:
				if (coreType) return getActivity();
				return ((FeatureMap.Internal)getActivity()).getWrapper();
			case ExecutablePackage.SEQUENCE__ASSIGN:
				return getAssign();
			case ExecutablePackage.SEQUENCE__COMPENSATE:
				return getCompensate();
			case ExecutablePackage.SEQUENCE__COMPENSATE_SCOPE:
				return getCompensateScope();
			case ExecutablePackage.SEQUENCE__EMPTY:
				return getEmpty();
			case ExecutablePackage.SEQUENCE__EXIT:
				return getExit();
			case ExecutablePackage.SEQUENCE__EXTENSION_ACTIVITY:
				return getExtensionActivity();
			case ExecutablePackage.SEQUENCE__FLOW:
				return getFlow();
			case ExecutablePackage.SEQUENCE__FOR_EACH:
				return getForEach();
			case ExecutablePackage.SEQUENCE__IF:
				return getIf();
			case ExecutablePackage.SEQUENCE__INVOKE:
				return getInvoke();
			case ExecutablePackage.SEQUENCE__PICK:
				return getPick();
			case ExecutablePackage.SEQUENCE__RECEIVE:
				return getReceive();
			case ExecutablePackage.SEQUENCE__REPEAT_UNTIL:
				return getRepeatUntil();
			case ExecutablePackage.SEQUENCE__REPLY:
				return getReply();
			case ExecutablePackage.SEQUENCE__RETHROW:
				return getRethrow();
			case ExecutablePackage.SEQUENCE__SCOPE:
				return getScope();
			case ExecutablePackage.SEQUENCE__SEQUENCE:
				return getSequence();
			case ExecutablePackage.SEQUENCE__THROW:
				return getThrow();
			case ExecutablePackage.SEQUENCE__VALIDATE:
				return getValidate();
			case ExecutablePackage.SEQUENCE__WAIT:
				return getWait();
			case ExecutablePackage.SEQUENCE__WHILE:
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
			case ExecutablePackage.SEQUENCE__ACTIVITY:
				((FeatureMap.Internal)getActivity()).set(newValue);
				return;
			case ExecutablePackage.SEQUENCE__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection<? extends Assign>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__COMPENSATE:
				getCompensate().clear();
				getCompensate().addAll((Collection<? extends Compensate>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__COMPENSATE_SCOPE:
				getCompensateScope().clear();
				getCompensateScope().addAll((Collection<? extends CompensateScope>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__EMPTY:
				getEmpty().clear();
				getEmpty().addAll((Collection<? extends Empty>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__EXIT:
				getExit().clear();
				getExit().addAll((Collection<? extends Exit>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__EXTENSION_ACTIVITY:
				getExtensionActivity().clear();
				getExtensionActivity().addAll((Collection<? extends ExtensionActivity>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection<? extends Flow>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__FOR_EACH:
				getForEach().clear();
				getForEach().addAll((Collection<? extends ForEach>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends If>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__INVOKE:
				getInvoke().clear();
				getInvoke().addAll((Collection<? extends Invoke>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__PICK:
				getPick().clear();
				getPick().addAll((Collection<? extends Pick>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__RECEIVE:
				getReceive().clear();
				getReceive().addAll((Collection<? extends Receive>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__REPEAT_UNTIL:
				getRepeatUntil().clear();
				getRepeatUntil().addAll((Collection<? extends RepeatUntil>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__REPLY:
				getReply().clear();
				getReply().addAll((Collection<? extends Reply>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__RETHROW:
				getRethrow().clear();
				getRethrow().addAll((Collection<? extends Rethrow>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Scope>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends Sequence>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__THROW:
				getThrow().clear();
				getThrow().addAll((Collection<? extends Throw>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends Validate>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__WAIT:
				getWait().clear();
				getWait().addAll((Collection<? extends Wait>)newValue);
				return;
			case ExecutablePackage.SEQUENCE__WHILE:
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
			case ExecutablePackage.SEQUENCE__ACTIVITY:
				getActivity().clear();
				return;
			case ExecutablePackage.SEQUENCE__ASSIGN:
				getAssign().clear();
				return;
			case ExecutablePackage.SEQUENCE__COMPENSATE:
				getCompensate().clear();
				return;
			case ExecutablePackage.SEQUENCE__COMPENSATE_SCOPE:
				getCompensateScope().clear();
				return;
			case ExecutablePackage.SEQUENCE__EMPTY:
				getEmpty().clear();
				return;
			case ExecutablePackage.SEQUENCE__EXIT:
				getExit().clear();
				return;
			case ExecutablePackage.SEQUENCE__EXTENSION_ACTIVITY:
				getExtensionActivity().clear();
				return;
			case ExecutablePackage.SEQUENCE__FLOW:
				getFlow().clear();
				return;
			case ExecutablePackage.SEQUENCE__FOR_EACH:
				getForEach().clear();
				return;
			case ExecutablePackage.SEQUENCE__IF:
				getIf().clear();
				return;
			case ExecutablePackage.SEQUENCE__INVOKE:
				getInvoke().clear();
				return;
			case ExecutablePackage.SEQUENCE__PICK:
				getPick().clear();
				return;
			case ExecutablePackage.SEQUENCE__RECEIVE:
				getReceive().clear();
				return;
			case ExecutablePackage.SEQUENCE__REPEAT_UNTIL:
				getRepeatUntil().clear();
				return;
			case ExecutablePackage.SEQUENCE__REPLY:
				getReply().clear();
				return;
			case ExecutablePackage.SEQUENCE__RETHROW:
				getRethrow().clear();
				return;
			case ExecutablePackage.SEQUENCE__SCOPE:
				getScope().clear();
				return;
			case ExecutablePackage.SEQUENCE__SEQUENCE:
				getSequence().clear();
				return;
			case ExecutablePackage.SEQUENCE__THROW:
				getThrow().clear();
				return;
			case ExecutablePackage.SEQUENCE__VALIDATE:
				getValidate().clear();
				return;
			case ExecutablePackage.SEQUENCE__WAIT:
				getWait().clear();
				return;
			case ExecutablePackage.SEQUENCE__WHILE:
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
			case ExecutablePackage.SEQUENCE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case ExecutablePackage.SEQUENCE__ASSIGN:
				return !getAssign().isEmpty();
			case ExecutablePackage.SEQUENCE__COMPENSATE:
				return !getCompensate().isEmpty();
			case ExecutablePackage.SEQUENCE__COMPENSATE_SCOPE:
				return !getCompensateScope().isEmpty();
			case ExecutablePackage.SEQUENCE__EMPTY:
				return !getEmpty().isEmpty();
			case ExecutablePackage.SEQUENCE__EXIT:
				return !getExit().isEmpty();
			case ExecutablePackage.SEQUENCE__EXTENSION_ACTIVITY:
				return !getExtensionActivity().isEmpty();
			case ExecutablePackage.SEQUENCE__FLOW:
				return !getFlow().isEmpty();
			case ExecutablePackage.SEQUENCE__FOR_EACH:
				return !getForEach().isEmpty();
			case ExecutablePackage.SEQUENCE__IF:
				return !getIf().isEmpty();
			case ExecutablePackage.SEQUENCE__INVOKE:
				return !getInvoke().isEmpty();
			case ExecutablePackage.SEQUENCE__PICK:
				return !getPick().isEmpty();
			case ExecutablePackage.SEQUENCE__RECEIVE:
				return !getReceive().isEmpty();
			case ExecutablePackage.SEQUENCE__REPEAT_UNTIL:
				return !getRepeatUntil().isEmpty();
			case ExecutablePackage.SEQUENCE__REPLY:
				return !getReply().isEmpty();
			case ExecutablePackage.SEQUENCE__RETHROW:
				return !getRethrow().isEmpty();
			case ExecutablePackage.SEQUENCE__SCOPE:
				return !getScope().isEmpty();
			case ExecutablePackage.SEQUENCE__SEQUENCE:
				return !getSequence().isEmpty();
			case ExecutablePackage.SEQUENCE__THROW:
				return !getThrow().isEmpty();
			case ExecutablePackage.SEQUENCE__VALIDATE:
				return !getValidate().isEmpty();
			case ExecutablePackage.SEQUENCE__WAIT:
				return !getWait().isEmpty();
			case ExecutablePackage.SEQUENCE__WHILE:
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

} //SequenceImpl
