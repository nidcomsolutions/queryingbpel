/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

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
import org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate;
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
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Query;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Receive;
import org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Reply;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Roles;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage
 * @generated
 */
public class ExecutableValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExecutableValidator INSTANCE = new ExecutableValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.open.oasis.docs.wsbpel._2._0.process.executable";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ExecutablePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExecutablePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ExecutablePackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case ExecutablePackage.ACTIVITY_CONTAINER:
				return validateActivityContainer((ActivityContainer)value, diagnostics, context);
			case ExecutablePackage.ASSIGN:
				return validateAssign((Assign)value, diagnostics, context);
			case ExecutablePackage.BOOLEAN_EXPR:
				return validateBooleanExpr((BooleanExpr)value, diagnostics, context);
			case ExecutablePackage.BRANCHES:
				return validateBranches((Branches)value, diagnostics, context);
			case ExecutablePackage.CATCH:
				return validateCatch((Catch)value, diagnostics, context);
			case ExecutablePackage.COMPENSATE:
				return validateCompensate((Compensate)value, diagnostics, context);
			case ExecutablePackage.COMPENSATE_SCOPE:
				return validateCompensateScope((CompensateScope)value, diagnostics, context);
			case ExecutablePackage.COMPLETION_CONDITION:
				return validateCompletionCondition((CompletionCondition)value, diagnostics, context);
			case ExecutablePackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case ExecutablePackage.COPY:
				return validateCopy((Copy)value, diagnostics, context);
			case ExecutablePackage.CORRELATION:
				return validateCorrelation((Correlation)value, diagnostics, context);
			case ExecutablePackage.CORRELATIONS:
				return validateCorrelations((Correlations)value, diagnostics, context);
			case ExecutablePackage.CORRELATION_SET:
				return validateCorrelationSet((CorrelationSet)value, diagnostics, context);
			case ExecutablePackage.CORRELATION_SETS:
				return validateCorrelationSets((CorrelationSets)value, diagnostics, context);
			case ExecutablePackage.CORRELATIONS_WITH_PATTERN:
				return validateCorrelationsWithPattern((CorrelationsWithPattern)value, diagnostics, context);
			case ExecutablePackage.CORRELATION_WITH_PATTERN:
				return validateCorrelationWithPattern((CorrelationWithPattern)value, diagnostics, context);
			case ExecutablePackage.DEADLINE_EXPR:
				return validateDeadlineExpr((DeadlineExpr)value, diagnostics, context);
			case ExecutablePackage.DOCUMENTATION:
				return validateDocumentation((Documentation)value, diagnostics, context);
			case ExecutablePackage.DURATION_EXPR:
				return validateDurationExpr((DurationExpr)value, diagnostics, context);
			case ExecutablePackage.ELSEIF:
				return validateElseif((Elseif)value, diagnostics, context);
			case ExecutablePackage.EMPTY:
				return validateEmpty((Empty)value, diagnostics, context);
			case ExecutablePackage.EVENT_HANDLERS:
				return validateEventHandlers((EventHandlers)value, diagnostics, context);
			case ExecutablePackage.EXIT:
				return validateExit((Exit)value, diagnostics, context);
			case ExecutablePackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case ExecutablePackage.EXTENSIBLE_ELEMENTS:
				return validateExtensibleElements((ExtensibleElements)value, diagnostics, context);
			case ExecutablePackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case ExecutablePackage.EXTENSION_ACTIVITY:
				return validateExtensionActivity((ExtensionActivity)value, diagnostics, context);
			case ExecutablePackage.EXTENSION_ASSIGN_OPERATION:
				return validateExtensionAssignOperation((ExtensionAssignOperation)value, diagnostics, context);
			case ExecutablePackage.EXTENSIONS:
				return validateExtensions((Extensions)value, diagnostics, context);
			case ExecutablePackage.FAULT_HANDLERS:
				return validateFaultHandlers((FaultHandlers)value, diagnostics, context);
			case ExecutablePackage.FLOW:
				return validateFlow((Flow)value, diagnostics, context);
			case ExecutablePackage.FOR_EACH:
				return validateForEach((ForEach)value, diagnostics, context);
			case ExecutablePackage.FROM:
				return validateFrom((From)value, diagnostics, context);
			case ExecutablePackage.FROM_PART:
				return validateFromPart((FromPart)value, diagnostics, context);
			case ExecutablePackage.FROM_PARTS:
				return validateFromParts((FromParts)value, diagnostics, context);
			case ExecutablePackage.IF:
				return validateIf((If)value, diagnostics, context);
			case ExecutablePackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case ExecutablePackage.INVOKE:
				return validateInvoke((Invoke)value, diagnostics, context);
			case ExecutablePackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case ExecutablePackage.LINKS:
				return validateLinks((Links)value, diagnostics, context);
			case ExecutablePackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case ExecutablePackage.MESSAGE_EXCHANGE:
				return validateMessageExchange((MessageExchange)value, diagnostics, context);
			case ExecutablePackage.MESSAGE_EXCHANGES:
				return validateMessageExchanges((MessageExchanges)value, diagnostics, context);
			case ExecutablePackage.ON_ALARM_EVENT:
				return validateOnAlarmEvent((OnAlarmEvent)value, diagnostics, context);
			case ExecutablePackage.ON_ALARM_PICK:
				return validateOnAlarmPick((OnAlarmPick)value, diagnostics, context);
			case ExecutablePackage.ON_EVENT:
				return validateOnEvent((OnEvent)value, diagnostics, context);
			case ExecutablePackage.ON_MESSAGE:
				return validateOnMessage((OnMessage)value, diagnostics, context);
			case ExecutablePackage.ON_MSG_COMMON:
				return validateOnMsgCommon((OnMsgCommon)value, diagnostics, context);
			case ExecutablePackage.PARTNER_LINK:
				return validatePartnerLink((PartnerLink)value, diagnostics, context);
			case ExecutablePackage.PARTNER_LINKS:
				return validatePartnerLinks((PartnerLinks)value, diagnostics, context);
			case ExecutablePackage.PICK:
				return validatePick((Pick)value, diagnostics, context);
			case ExecutablePackage.PROCESS:
				return validateProcess((org.open.oasis.docs.wsbpel._2._0.process.executable.Process)value, diagnostics, context);
			case ExecutablePackage.QUERY:
				return validateQuery((Query)value, diagnostics, context);
			case ExecutablePackage.RECEIVE:
				return validateReceive((Receive)value, diagnostics, context);
			case ExecutablePackage.REPEAT_UNTIL:
				return validateRepeatUntil((RepeatUntil)value, diagnostics, context);
			case ExecutablePackage.REPLY:
				return validateReply((Reply)value, diagnostics, context);
			case ExecutablePackage.RETHROW:
				return validateRethrow((Rethrow)value, diagnostics, context);
			case ExecutablePackage.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			case ExecutablePackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case ExecutablePackage.SOURCE:
				return validateSource((Source)value, diagnostics, context);
			case ExecutablePackage.SOURCES:
				return validateSources((Sources)value, diagnostics, context);
			case ExecutablePackage.TARGET:
				return validateTarget((Target)value, diagnostics, context);
			case ExecutablePackage.TARGETS:
				return validateTargets((Targets)value, diagnostics, context);
			case ExecutablePackage.THROW:
				return validateThrow((Throw)value, diagnostics, context);
			case ExecutablePackage.TO:
				return validateTo((To)value, diagnostics, context);
			case ExecutablePackage.TO_PART:
				return validateToPart((ToPart)value, diagnostics, context);
			case ExecutablePackage.TO_PARTS:
				return validateToParts((ToParts)value, diagnostics, context);
			case ExecutablePackage.VALIDATE:
				return validateValidate((Validate)value, diagnostics, context);
			case ExecutablePackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case ExecutablePackage.VARIABLES:
				return validateVariables((Variables)value, diagnostics, context);
			case ExecutablePackage.WAIT:
				return validateWait((Wait)value, diagnostics, context);
			case ExecutablePackage.WHILE:
				return validateWhile((While)value, diagnostics, context);
			case ExecutablePackage.BOOLEAN:
				return validateBoolean((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)value, diagnostics, context);
			case ExecutablePackage.INITIATE:
				return validateInitiate((Initiate)value, diagnostics, context);
			case ExecutablePackage.PATTERN:
				return validatePattern((Pattern)value, diagnostics, context);
			case ExecutablePackage.ROLES:
				return validateRoles((Roles)value, diagnostics, context);
			case ExecutablePackage.BPEL_VARIABLE_NAME:
				return validateBPELVariableName((String)value, diagnostics, context);
			case ExecutablePackage.BPEL_VARIABLE_NAMES:
				return validateBPELVariableNames((List<?>)value, diagnostics, context);
			case ExecutablePackage.BPEL_VARIABLE_NAMES_BASE:
				return validateBPELVariableNamesBase((List<?>)value, diagnostics, context);
			case ExecutablePackage.QNAMES:
				return validateQNames((List<?>)value, diagnostics, context);
			case ExecutablePackage.QNAMES_BASE:
				return validateQNamesBase((List<?>)value, diagnostics, context);
			case ExecutablePackage.BOOLEAN_OBJECT:
				return validateBooleanObject((org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)value, diagnostics, context);
			case ExecutablePackage.INITIATE_OBJECT:
				return validateInitiateObject((Initiate)value, diagnostics, context);
			case ExecutablePackage.PATTERN_OBJECT:
				return validatePatternObject((Pattern)value, diagnostics, context);
			case ExecutablePackage.ROLES_OBJECT:
				return validateRolesObject((Roles)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityContainer(ActivityContainer activityContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssign(Assign assign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpr(BooleanExpr booleanExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranches(Branches branches, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branches, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatch(Catch catch_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catch_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompensate(Compensate compensate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compensate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompensateScope(CompensateScope compensateScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compensateScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompletionCondition(CompletionCondition completionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(completionCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopy(Copy copy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(copy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelation(Correlation correlation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelations(Correlations correlations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationSet(CorrelationSet correlationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationSets(CorrelationSets correlationSets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationSets, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationsWithPattern(CorrelationsWithPattern correlationsWithPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationsWithPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationWithPattern(CorrelationWithPattern correlationWithPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationWithPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadlineExpr(DeadlineExpr deadlineExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deadlineExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationExpr(DurationExpr durationExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(durationExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElseif(Elseif elseif, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elseif, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmpty(Empty empty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(empty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventHandlers(EventHandlers eventHandlers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventHandlers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExit(Exit exit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensibleElements(ExtensibleElements extensibleElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensibleElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionActivity(ExtensionActivity extensionActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionAssignOperation(ExtensionAssignOperation extensionAssignOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionAssignOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensions(Extensions extensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultHandlers(FaultHandlers faultHandlers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(faultHandlers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlow(Flow flow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForEach(ForEach forEach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forEach, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrom(From from, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(from, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFromPart(FromPart fromPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fromPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFromParts(FromParts fromParts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fromParts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIf(If if_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(if_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoke(Invoke invoke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinks(Links links, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(links, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageExchange(MessageExchange messageExchange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageExchange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageExchanges(MessageExchanges messageExchanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageExchanges, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnAlarmEvent(OnAlarmEvent onAlarmEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onAlarmEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnAlarmPick(OnAlarmPick onAlarmPick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onAlarmPick, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnEvent(OnEvent onEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnMessage(OnMessage onMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnMsgCommon(OnMsgCommon onMsgCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onMsgCommon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerLink(PartnerLink partnerLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partnerLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerLinks(PartnerLinks partnerLinks, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partnerLinks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePick(Pick pick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pick, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(org.open.oasis.docs.wsbpel._2._0.process.executable.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuery(Query query, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(query, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceive(Receive receive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatUntil(RepeatUntil repeatUntil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repeatUntil, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReply(Reply reply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRethrow(Rethrow rethrow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rethrow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource(Source source, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(source, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSources(Sources sources, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sources, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget(Target target, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(target, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargets(Targets targets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targets, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrow(Throw throw_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(throw_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTo(To to, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(to, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToPart(ToPart toPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToParts(ToParts toParts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toParts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidate(Validate validate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariables(Variables variables, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variables, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWait(Wait wait, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wait, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhile(While while_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(while_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiate(Initiate initiate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePattern(Pattern pattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoles(Roles roles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPELVariableName(String bpelVariableName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBPELVariableName_Pattern(bpelVariableName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBPELVariableName_Pattern
	 */
	public static final  PatternMatcher [][] BPEL_VARIABLE_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\.]+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>BPEL Variable Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPELVariableName_Pattern(String bpelVariableName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ExecutablePackage.Literals.BPEL_VARIABLE_NAME, bpelVariableName, BPEL_VARIABLE_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPELVariableNames(List<?> bpelVariableNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBPELVariableNamesBase_ItemType(bpelVariableNames, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPELVariableNames_MinLength(bpelVariableNames, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>BPEL Variable Names</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPELVariableNames_MinLength(List<?> bpelVariableNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = bpelVariableNames.size();  
		boolean result = length >= 1;
		if (!result && diagnostics != null) 
			reportMinLengthViolation(ExecutablePackage.Literals.BPEL_VARIABLE_NAMES, bpelVariableNames, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPELVariableNamesBase(List<?> bpelVariableNamesBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBPELVariableNamesBase_ItemType(bpelVariableNamesBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>BPEL Variable Names Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPELVariableNamesBase_ItemType(List<?> bpelVariableNamesBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = bpelVariableNamesBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (ExecutablePackage.Literals.BPEL_VARIABLE_NAME.isInstance(item)) {
				result &= validateBPELVariableName((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(ExecutablePackage.Literals.BPEL_VARIABLE_NAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNames(List<?> qNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateQNamesBase_ItemType(qNames, diagnostics, context);
		if (result || diagnostics != null) result &= validateQNames_MinLength(qNames, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>QNames</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNames_MinLength(List<?> qNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = qNames.size();  
		boolean result = length >= 1;
		if (!result && diagnostics != null) 
			reportMinLengthViolation(ExecutablePackage.Literals.QNAMES, qNames, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNamesBase(List<?> qNamesBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateQNamesBase_ItemType(qNamesBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>QNames Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNamesBase_ItemType(List<?> qNamesBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = qNamesBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
				result &= xmlTypeValidator.validateQName((QName)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanObject(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean booleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiateObject(Initiate initiateObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternObject(Pattern patternObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolesObject(Roles rolesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

} //ExecutableValidator
