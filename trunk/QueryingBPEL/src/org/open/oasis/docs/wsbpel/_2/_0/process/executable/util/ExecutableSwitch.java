/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Activity;
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
import org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Correlations;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationsWithPattern;
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
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements;
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
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage
 * @generated
 */
public class ExecutableSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutablePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableSwitch() {
		if (modelPackage == null) {
			modelPackage = ExecutablePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExecutablePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseExtensibleElements(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ACTIVITY_CONTAINER: {
				ActivityContainer activityContainer = (ActivityContainer)theEObject;
				T result = caseActivityContainer(activityContainer);
				if (result == null) result = caseExtensibleElements(activityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseActivity(assign);
				if (result == null) result = caseExtensibleElements(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.BOOLEAN_EXPR: {
				BooleanExpr booleanExpr = (BooleanExpr)theEObject;
				T result = caseBooleanExpr(booleanExpr);
				if (result == null) result = caseExpression(booleanExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.BRANCHES: {
				Branches branches = (Branches)theEObject;
				T result = caseBranches(branches);
				if (result == null) result = caseExpression(branches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CATCH: {
				Catch catch_ = (Catch)theEObject;
				T result = caseCatch(catch_);
				if (result == null) result = caseActivityContainer(catch_);
				if (result == null) result = caseExtensibleElements(catch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.COMPENSATE: {
				Compensate compensate = (Compensate)theEObject;
				T result = caseCompensate(compensate);
				if (result == null) result = caseActivity(compensate);
				if (result == null) result = caseExtensibleElements(compensate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.COMPENSATE_SCOPE: {
				CompensateScope compensateScope = (CompensateScope)theEObject;
				T result = caseCompensateScope(compensateScope);
				if (result == null) result = caseActivity(compensateScope);
				if (result == null) result = caseExtensibleElements(compensateScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.COMPLETION_CONDITION: {
				CompletionCondition completionCondition = (CompletionCondition)theEObject;
				T result = caseCompletionCondition(completionCondition);
				if (result == null) result = caseExtensibleElements(completionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseExpression(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.COPY: {
				Copy copy = (Copy)theEObject;
				T result = caseCopy(copy);
				if (result == null) result = caseExtensibleElements(copy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CORRELATION: {
				Correlation correlation = (Correlation)theEObject;
				T result = caseCorrelation(correlation);
				if (result == null) result = caseExtensibleElements(correlation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CORRELATIONS: {
				Correlations correlations = (Correlations)theEObject;
				T result = caseCorrelations(correlations);
				if (result == null) result = caseExtensibleElements(correlations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CORRELATION_SET: {
				CorrelationSet correlationSet = (CorrelationSet)theEObject;
				T result = caseCorrelationSet(correlationSet);
				if (result == null) result = caseExtensibleElements(correlationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CORRELATION_SETS: {
				CorrelationSets correlationSets = (CorrelationSets)theEObject;
				T result = caseCorrelationSets(correlationSets);
				if (result == null) result = caseExtensibleElements(correlationSets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CORRELATIONS_WITH_PATTERN: {
				CorrelationsWithPattern correlationsWithPattern = (CorrelationsWithPattern)theEObject;
				T result = caseCorrelationsWithPattern(correlationsWithPattern);
				if (result == null) result = caseExtensibleElements(correlationsWithPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.CORRELATION_WITH_PATTERN: {
				CorrelationWithPattern correlationWithPattern = (CorrelationWithPattern)theEObject;
				T result = caseCorrelationWithPattern(correlationWithPattern);
				if (result == null) result = caseCorrelation(correlationWithPattern);
				if (result == null) result = caseExtensibleElements(correlationWithPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.DEADLINE_EXPR: {
				DeadlineExpr deadlineExpr = (DeadlineExpr)theEObject;
				T result = caseDeadlineExpr(deadlineExpr);
				if (result == null) result = caseExpression(deadlineExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.DURATION_EXPR: {
				DurationExpr durationExpr = (DurationExpr)theEObject;
				T result = caseDurationExpr(durationExpr);
				if (result == null) result = caseExpression(durationExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ELSEIF: {
				Elseif elseif = (Elseif)theEObject;
				T result = caseElseif(elseif);
				if (result == null) result = caseExtensibleElements(elseif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EMPTY: {
				Empty empty = (Empty)theEObject;
				T result = caseEmpty(empty);
				if (result == null) result = caseActivity(empty);
				if (result == null) result = caseExtensibleElements(empty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EVENT_HANDLERS: {
				EventHandlers eventHandlers = (EventHandlers)theEObject;
				T result = caseEventHandlers(eventHandlers);
				if (result == null) result = caseExtensibleElements(eventHandlers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EXIT: {
				Exit exit = (Exit)theEObject;
				T result = caseExit(exit);
				if (result == null) result = caseActivity(exit);
				if (result == null) result = caseExtensibleElements(exit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EXTENSIBLE_ELEMENTS: {
				ExtensibleElements extensibleElements = (ExtensibleElements)theEObject;
				T result = caseExtensibleElements(extensibleElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseExtensibleElements(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EXTENSION_ACTIVITY: {
				ExtensionActivity extensionActivity = (ExtensionActivity)theEObject;
				T result = caseExtensionActivity(extensionActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EXTENSION_ASSIGN_OPERATION: {
				ExtensionAssignOperation extensionAssignOperation = (ExtensionAssignOperation)theEObject;
				T result = caseExtensionAssignOperation(extensionAssignOperation);
				if (result == null) result = caseExtensibleElements(extensionAssignOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.EXTENSIONS: {
				Extensions extensions = (Extensions)theEObject;
				T result = caseExtensions(extensions);
				if (result == null) result = caseExtensibleElements(extensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.FAULT_HANDLERS: {
				FaultHandlers faultHandlers = (FaultHandlers)theEObject;
				T result = caseFaultHandlers(faultHandlers);
				if (result == null) result = caseExtensibleElements(faultHandlers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseActivity(flow);
				if (result == null) result = caseExtensibleElements(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.FOR_EACH: {
				ForEach forEach = (ForEach)theEObject;
				T result = caseForEach(forEach);
				if (result == null) result = caseActivity(forEach);
				if (result == null) result = caseExtensibleElements(forEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.FROM: {
				From from = (From)theEObject;
				T result = caseFrom(from);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.FROM_PART: {
				FromPart fromPart = (FromPart)theEObject;
				T result = caseFromPart(fromPart);
				if (result == null) result = caseExtensibleElements(fromPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.FROM_PARTS: {
				FromParts fromParts = (FromParts)theEObject;
				T result = caseFromParts(fromParts);
				if (result == null) result = caseExtensibleElements(fromParts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseActivity(if_);
				if (result == null) result = caseExtensibleElements(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseExtensibleElements(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.INVOKE: {
				Invoke invoke = (Invoke)theEObject;
				T result = caseInvoke(invoke);
				if (result == null) result = caseActivity(invoke);
				if (result == null) result = caseExtensibleElements(invoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseExtensibleElements(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.LINKS: {
				Links links = (Links)theEObject;
				T result = caseLinks(links);
				if (result == null) result = caseExtensibleElements(links);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.MESSAGE_EXCHANGE: {
				MessageExchange messageExchange = (MessageExchange)theEObject;
				T result = caseMessageExchange(messageExchange);
				if (result == null) result = caseExtensibleElements(messageExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.MESSAGE_EXCHANGES: {
				MessageExchanges messageExchanges = (MessageExchanges)theEObject;
				T result = caseMessageExchanges(messageExchanges);
				if (result == null) result = caseExtensibleElements(messageExchanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ON_ALARM_EVENT: {
				OnAlarmEvent onAlarmEvent = (OnAlarmEvent)theEObject;
				T result = caseOnAlarmEvent(onAlarmEvent);
				if (result == null) result = caseExtensibleElements(onAlarmEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ON_ALARM_PICK: {
				OnAlarmPick onAlarmPick = (OnAlarmPick)theEObject;
				T result = caseOnAlarmPick(onAlarmPick);
				if (result == null) result = caseExtensibleElements(onAlarmPick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ON_EVENT: {
				OnEvent onEvent = (OnEvent)theEObject;
				T result = caseOnEvent(onEvent);
				if (result == null) result = caseOnMsgCommon(onEvent);
				if (result == null) result = caseExtensibleElements(onEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ON_MESSAGE: {
				OnMessage onMessage = (OnMessage)theEObject;
				T result = caseOnMessage(onMessage);
				if (result == null) result = caseOnMsgCommon(onMessage);
				if (result == null) result = caseExtensibleElements(onMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.ON_MSG_COMMON: {
				OnMsgCommon onMsgCommon = (OnMsgCommon)theEObject;
				T result = caseOnMsgCommon(onMsgCommon);
				if (result == null) result = caseExtensibleElements(onMsgCommon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.PARTNER_LINK: {
				PartnerLink partnerLink = (PartnerLink)theEObject;
				T result = casePartnerLink(partnerLink);
				if (result == null) result = caseExtensibleElements(partnerLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.PARTNER_LINKS: {
				PartnerLinks partnerLinks = (PartnerLinks)theEObject;
				T result = casePartnerLinks(partnerLinks);
				if (result == null) result = caseExtensibleElements(partnerLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.PICK: {
				Pick pick = (Pick)theEObject;
				T result = casePick(pick);
				if (result == null) result = caseActivity(pick);
				if (result == null) result = caseExtensibleElements(pick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.PROCESS: {
				org.open.oasis.docs.wsbpel._2._0.process.executable.Process process = (org.open.oasis.docs.wsbpel._2._0.process.executable.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseExtensibleElements(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.RECEIVE: {
				Receive receive = (Receive)theEObject;
				T result = caseReceive(receive);
				if (result == null) result = caseActivity(receive);
				if (result == null) result = caseExtensibleElements(receive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.REPEAT_UNTIL: {
				RepeatUntil repeatUntil = (RepeatUntil)theEObject;
				T result = caseRepeatUntil(repeatUntil);
				if (result == null) result = caseActivity(repeatUntil);
				if (result == null) result = caseExtensibleElements(repeatUntil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.REPLY: {
				Reply reply = (Reply)theEObject;
				T result = caseReply(reply);
				if (result == null) result = caseActivity(reply);
				if (result == null) result = caseExtensibleElements(reply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.RETHROW: {
				Rethrow rethrow = (Rethrow)theEObject;
				T result = caseRethrow(rethrow);
				if (result == null) result = caseActivity(rethrow);
				if (result == null) result = caseExtensibleElements(rethrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = caseActivity(scope);
				if (result == null) result = caseExtensibleElements(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseActivity(sequence);
				if (result == null) result = caseExtensibleElements(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseExtensibleElements(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.SOURCES: {
				Sources sources = (Sources)theEObject;
				T result = caseSources(sources);
				if (result == null) result = caseExtensibleElements(sources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.TARGET: {
				Target target = (Target)theEObject;
				T result = caseTarget(target);
				if (result == null) result = caseExtensibleElements(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.TARGETS: {
				Targets targets = (Targets)theEObject;
				T result = caseTargets(targets);
				if (result == null) result = caseExtensibleElements(targets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.THROW: {
				Throw throw_ = (Throw)theEObject;
				T result = caseThrow(throw_);
				if (result == null) result = caseActivity(throw_);
				if (result == null) result = caseExtensibleElements(throw_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.TO: {
				To to = (To)theEObject;
				T result = caseTo(to);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.TO_PART: {
				ToPart toPart = (ToPart)theEObject;
				T result = caseToPart(toPart);
				if (result == null) result = caseExtensibleElements(toPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.TO_PARTS: {
				ToParts toParts = (ToParts)theEObject;
				T result = caseToParts(toParts);
				if (result == null) result = caseExtensibleElements(toParts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.VALIDATE: {
				Validate validate = (Validate)theEObject;
				T result = caseValidate(validate);
				if (result == null) result = caseActivity(validate);
				if (result == null) result = caseExtensibleElements(validate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseExtensibleElements(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.VARIABLES: {
				Variables variables = (Variables)theEObject;
				T result = caseVariables(variables);
				if (result == null) result = caseExtensibleElements(variables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = caseActivity(wait);
				if (result == null) result = caseExtensibleElements(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutablePackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseActivity(while_);
				if (result == null) result = caseExtensibleElements(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityContainer(ActivityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpr(BooleanExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranches(Branches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatch(Catch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compensate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compensate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompensate(Compensate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compensate Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compensate Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompensateScope(CompensateScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletionCondition(CompletionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopy(Copy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelation(Correlation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelations(Correlations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationSet(CorrelationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Sets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Sets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationSets(CorrelationSets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlations With Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlations With Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationsWithPattern(CorrelationsWithPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation With Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation With Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationWithPattern(CorrelationWithPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlineExpr(DeadlineExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationExpr(DurationExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elseif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elseif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseif(Elseif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmpty(Empty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handlers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handlers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandlers(EventHandlers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExit(Exit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElements(ExtensibleElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionActivity(ExtensionActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Assign Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Assign Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionAssignOperation(ExtensionAssignOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensions(Extensions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Handlers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Handlers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultHandlers(FaultHandlers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEach(ForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrom(From object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromPart(FromPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Parts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Parts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromParts(FromParts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoke(Invoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinks(Links object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageExchange(MessageExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Exchanges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Exchanges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageExchanges(MessageExchanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Alarm Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Alarm Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnAlarmEvent(OnAlarmEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Alarm Pick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Alarm Pick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnAlarmPick(OnAlarmPick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnEvent(OnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMessage(OnMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Msg Common</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Msg Common</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMsgCommon(OnMsgCommon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partner Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partner Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartnerLink(PartnerLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partner Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partner Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartnerLinks(PartnerLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePick(Pick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.open.oasis.docs.wsbpel._2._0.process.executable.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceive(Receive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatUntil(RepeatUntil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReply(Reply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rethrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rethrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRethrow(Rethrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSources(Sources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Targets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Targets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargets(Targets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrow(Throw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTo(To object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToPart(ToPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Parts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Parts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToParts(ToParts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidate(Validate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariables(Variables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ExecutableSwitch
