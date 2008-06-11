/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutableFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutableFactoryImpl extends EFactoryImpl implements ExecutableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExecutableFactory init() {
		try {
			ExecutableFactory theExecutableFactory = (ExecutableFactory)EPackage.Registry.INSTANCE.getEFactory("http://docs.oasis-open.org/wsbpel/2.0/process/executable"); 
			if (theExecutableFactory != null) {
				return theExecutableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExecutableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExecutablePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ExecutablePackage.ACTIVITY: return createActivity();
			case ExecutablePackage.ACTIVITY_CONTAINER: return createActivityContainer();
			case ExecutablePackage.ASSIGN: return createAssign();
			case ExecutablePackage.BOOLEAN_EXPR: return createBooleanExpr();
			case ExecutablePackage.BRANCHES: return createBranches();
			case ExecutablePackage.CATCH: return createCatch();
			case ExecutablePackage.COMPENSATE: return createCompensate();
			case ExecutablePackage.COMPENSATE_SCOPE: return createCompensateScope();
			case ExecutablePackage.COMPLETION_CONDITION: return createCompletionCondition();
			case ExecutablePackage.CONDITION: return createCondition();
			case ExecutablePackage.COPY: return createCopy();
			case ExecutablePackage.CORRELATION: return createCorrelation();
			case ExecutablePackage.CORRELATIONS: return createCorrelations();
			case ExecutablePackage.CORRELATION_SET: return createCorrelationSet();
			case ExecutablePackage.CORRELATION_SETS: return createCorrelationSets();
			case ExecutablePackage.CORRELATIONS_WITH_PATTERN: return createCorrelationsWithPattern();
			case ExecutablePackage.CORRELATION_WITH_PATTERN: return createCorrelationWithPattern();
			case ExecutablePackage.DEADLINE_EXPR: return createDeadlineExpr();
			case ExecutablePackage.DOCUMENTATION: return createDocumentation();
			case ExecutablePackage.DURATION_EXPR: return createDurationExpr();
			case ExecutablePackage.ELSEIF: return createElseif();
			case ExecutablePackage.EMPTY: return createEmpty();
			case ExecutablePackage.EVENT_HANDLERS: return createEventHandlers();
			case ExecutablePackage.EXIT: return createExit();
			case ExecutablePackage.EXPRESSION: return createExpression();
			case ExecutablePackage.EXTENSIBLE_ELEMENTS: return createExtensibleElements();
			case ExecutablePackage.EXTENSION: return createExtension();
			case ExecutablePackage.EXTENSION_ACTIVITY: return createExtensionActivity();
			case ExecutablePackage.EXTENSION_ASSIGN_OPERATION: return createExtensionAssignOperation();
			case ExecutablePackage.EXTENSIONS: return createExtensions();
			case ExecutablePackage.FAULT_HANDLERS: return createFaultHandlers();
			case ExecutablePackage.FLOW: return createFlow();
			case ExecutablePackage.FOR_EACH: return createForEach();
			case ExecutablePackage.FROM: return createFrom();
			case ExecutablePackage.FROM_PART: return createFromPart();
			case ExecutablePackage.FROM_PARTS: return createFromParts();
			case ExecutablePackage.IF: return createIf();
			case ExecutablePackage.IMPORT: return createImport();
			case ExecutablePackage.INVOKE: return createInvoke();
			case ExecutablePackage.LINK: return createLink();
			case ExecutablePackage.LINKS: return createLinks();
			case ExecutablePackage.LITERAL: return createLiteral();
			case ExecutablePackage.MESSAGE_EXCHANGE: return createMessageExchange();
			case ExecutablePackage.MESSAGE_EXCHANGES: return createMessageExchanges();
			case ExecutablePackage.ON_ALARM_EVENT: return createOnAlarmEvent();
			case ExecutablePackage.ON_ALARM_PICK: return createOnAlarmPick();
			case ExecutablePackage.ON_EVENT: return createOnEvent();
			case ExecutablePackage.ON_MESSAGE: return createOnMessage();
			case ExecutablePackage.ON_MSG_COMMON: return createOnMsgCommon();
			case ExecutablePackage.PARTNER_LINK: return createPartnerLink();
			case ExecutablePackage.PARTNER_LINKS: return createPartnerLinks();
			case ExecutablePackage.PICK: return createPick();
			case ExecutablePackage.PROCESS: return createProcess();
			case ExecutablePackage.QUERY: return createQuery();
			case ExecutablePackage.RECEIVE: return createReceive();
			case ExecutablePackage.REPEAT_UNTIL: return createRepeatUntil();
			case ExecutablePackage.REPLY: return createReply();
			case ExecutablePackage.RETHROW: return createRethrow();
			case ExecutablePackage.SCOPE: return createScope();
			case ExecutablePackage.SEQUENCE: return createSequence();
			case ExecutablePackage.SOURCE: return createSource();
			case ExecutablePackage.SOURCES: return createSources();
			case ExecutablePackage.TARGET: return createTarget();
			case ExecutablePackage.TARGETS: return createTargets();
			case ExecutablePackage.THROW: return createThrow();
			case ExecutablePackage.TO: return createTo();
			case ExecutablePackage.TO_PART: return createToPart();
			case ExecutablePackage.TO_PARTS: return createToParts();
			case ExecutablePackage.VALIDATE: return createValidate();
			case ExecutablePackage.VARIABLE: return createVariable();
			case ExecutablePackage.VARIABLES: return createVariables();
			case ExecutablePackage.WAIT: return createWait();
			case ExecutablePackage.WHILE: return createWhile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutablePackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case ExecutablePackage.INITIATE:
				return createInitiateFromString(eDataType, initialValue);
			case ExecutablePackage.PATTERN:
				return createPatternFromString(eDataType, initialValue);
			case ExecutablePackage.ROLES:
				return createRolesFromString(eDataType, initialValue);
			case ExecutablePackage.BPEL_VARIABLE_NAME:
				return createBPELVariableNameFromString(eDataType, initialValue);
			case ExecutablePackage.BPEL_VARIABLE_NAMES:
				return createBPELVariableNamesFromString(eDataType, initialValue);
			case ExecutablePackage.BPEL_VARIABLE_NAMES_BASE:
				return createBPELVariableNamesBaseFromString(eDataType, initialValue);
			case ExecutablePackage.QNAMES:
				return createQNamesFromString(eDataType, initialValue);
			case ExecutablePackage.QNAMES_BASE:
				return createQNamesBaseFromString(eDataType, initialValue);
			case ExecutablePackage.BOOLEAN_OBJECT:
				return createBooleanObjectFromString(eDataType, initialValue);
			case ExecutablePackage.INITIATE_OBJECT:
				return createInitiateObjectFromString(eDataType, initialValue);
			case ExecutablePackage.PATTERN_OBJECT:
				return createPatternObjectFromString(eDataType, initialValue);
			case ExecutablePackage.ROLES_OBJECT:
				return createRolesObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutablePackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case ExecutablePackage.INITIATE:
				return convertInitiateToString(eDataType, instanceValue);
			case ExecutablePackage.PATTERN:
				return convertPatternToString(eDataType, instanceValue);
			case ExecutablePackage.ROLES:
				return convertRolesToString(eDataType, instanceValue);
			case ExecutablePackage.BPEL_VARIABLE_NAME:
				return convertBPELVariableNameToString(eDataType, instanceValue);
			case ExecutablePackage.BPEL_VARIABLE_NAMES:
				return convertBPELVariableNamesToString(eDataType, instanceValue);
			case ExecutablePackage.BPEL_VARIABLE_NAMES_BASE:
				return convertBPELVariableNamesBaseToString(eDataType, instanceValue);
			case ExecutablePackage.QNAMES:
				return convertQNamesToString(eDataType, instanceValue);
			case ExecutablePackage.QNAMES_BASE:
				return convertQNamesBaseToString(eDataType, instanceValue);
			case ExecutablePackage.BOOLEAN_OBJECT:
				return convertBooleanObjectToString(eDataType, instanceValue);
			case ExecutablePackage.INITIATE_OBJECT:
				return convertInitiateObjectToString(eDataType, instanceValue);
			case ExecutablePackage.PATTERN_OBJECT:
				return convertPatternObjectToString(eDataType, instanceValue);
			case ExecutablePackage.ROLES_OBJECT:
				return convertRolesObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer createActivityContainer() {
		ActivityContainerImpl activityContainer = new ActivityContainerImpl();
		return activityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr createBooleanExpr() {
		BooleanExprImpl booleanExpr = new BooleanExprImpl();
		return booleanExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branches createBranches() {
		BranchesImpl branches = new BranchesImpl();
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catch createCatch() {
		CatchImpl catch_ = new CatchImpl();
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compensate createCompensate() {
		CompensateImpl compensate = new CompensateImpl();
		return compensate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateScope createCompensateScope() {
		CompensateScopeImpl compensateScope = new CompensateScopeImpl();
		return compensateScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionCondition createCompletionCondition() {
		CompletionConditionImpl completionCondition = new CompletionConditionImpl();
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copy createCopy() {
		CopyImpl copy = new CopyImpl();
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation createCorrelation() {
		CorrelationImpl correlation = new CorrelationImpl();
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlations createCorrelations() {
		CorrelationsImpl correlations = new CorrelationsImpl();
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSet createCorrelationSet() {
		CorrelationSetImpl correlationSet = new CorrelationSetImpl();
		return correlationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSets createCorrelationSets() {
		CorrelationSetsImpl correlationSets = new CorrelationSetsImpl();
		return correlationSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationsWithPattern createCorrelationsWithPattern() {
		CorrelationsWithPatternImpl correlationsWithPattern = new CorrelationsWithPatternImpl();
		return correlationsWithPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationWithPattern createCorrelationWithPattern() {
		CorrelationWithPatternImpl correlationWithPattern = new CorrelationWithPatternImpl();
		return correlationWithPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineExpr createDeadlineExpr() {
		DeadlineExprImpl deadlineExpr = new DeadlineExprImpl();
		return deadlineExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationExpr createDurationExpr() {
		DurationExprImpl durationExpr = new DurationExprImpl();
		return durationExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elseif createElseif() {
		ElseifImpl elseif = new ElseifImpl();
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlers createEventHandlers() {
		EventHandlersImpl eventHandlers = new EventHandlersImpl();
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exit createExit() {
		ExitImpl exit = new ExitImpl();
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensibleElements createExtensibleElements() {
		ExtensibleElementsImpl extensibleElements = new ExtensibleElementsImpl();
		return extensibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionActivity createExtensionActivity() {
		ExtensionActivityImpl extensionActivity = new ExtensionActivityImpl();
		return extensionActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAssignOperation createExtensionAssignOperation() {
		ExtensionAssignOperationImpl extensionAssignOperation = new ExtensionAssignOperationImpl();
		return extensionAssignOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extensions createExtensions() {
		ExtensionsImpl extensions = new ExtensionsImpl();
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultHandlers createFaultHandlers() {
		FaultHandlersImpl faultHandlers = new FaultHandlersImpl();
		return faultHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach createForEach() {
		ForEachImpl forEach = new ForEachImpl();
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From createFrom() {
		FromImpl from = new FromImpl();
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromPart createFromPart() {
		FromPartImpl fromPart = new FromPartImpl();
		return fromPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromParts createFromParts() {
		FromPartsImpl fromParts = new FromPartsImpl();
		return fromParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke createInvoke() {
		InvokeImpl invoke = new InvokeImpl();
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Links createLinks() {
		LinksImpl links = new LinksImpl();
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchange createMessageExchange() {
		MessageExchangeImpl messageExchange = new MessageExchangeImpl();
		return messageExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchanges createMessageExchanges() {
		MessageExchangesImpl messageExchanges = new MessageExchangesImpl();
		return messageExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnAlarmEvent createOnAlarmEvent() {
		OnAlarmEventImpl onAlarmEvent = new OnAlarmEventImpl();
		return onAlarmEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnAlarmPick createOnAlarmPick() {
		OnAlarmPickImpl onAlarmPick = new OnAlarmPickImpl();
		return onAlarmPick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnEvent createOnEvent() {
		OnEventImpl onEvent = new OnEventImpl();
		return onEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMessage createOnMessage() {
		OnMessageImpl onMessage = new OnMessageImpl();
		return onMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMsgCommon createOnMsgCommon() {
		OnMsgCommonImpl onMsgCommon = new OnMsgCommonImpl();
		return onMsgCommon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerLink createPartnerLink() {
		PartnerLinkImpl partnerLink = new PartnerLinkImpl();
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerLinks createPartnerLinks() {
		PartnerLinksImpl partnerLinks = new PartnerLinksImpl();
		return partnerLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pick createPick() {
		PickImpl pick = new PickImpl();
		return pick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receive createReceive() {
		ReceiveImpl receive = new ReceiveImpl();
		return receive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatUntil createRepeatUntil() {
		RepeatUntilImpl repeatUntil = new RepeatUntilImpl();
		return repeatUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reply createReply() {
		ReplyImpl reply = new ReplyImpl();
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rethrow createRethrow() {
		RethrowImpl rethrow = new RethrowImpl();
		return rethrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sources createSources() {
		SourcesImpl sources = new SourcesImpl();
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Targets createTargets() {
		TargetsImpl targets = new TargetsImpl();
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throw createThrow() {
		ThrowImpl throw_ = new ThrowImpl();
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public To createTo() {
		ToImpl to = new ToImpl();
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToPart createToPart() {
		ToPartImpl toPart = new ToPartImpl();
		return toPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToParts createToParts() {
		ToPartsImpl toParts = new ToPartsImpl();
		return toParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validate createValidate() {
		ValidateImpl validate = new ValidateImpl();
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variables createVariables() {
		VariablesImpl variables = new VariablesImpl();
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean result = org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiate createInitiateFromString(EDataType eDataType, String initialValue) {
		Initiate result = Initiate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPatternFromString(EDataType eDataType, String initialValue) {
		Pattern result = Pattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles createRolesFromString(EDataType eDataType, String initialValue) {
		Roles result = Roles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRolesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBPELVariableNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBPELVariableNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createBPELVariableNamesFromString(EDataType eDataType, String initialValue) {
		return createBPELVariableNamesBaseFromString(ExecutablePackage.Literals.BPEL_VARIABLE_NAMES_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBPELVariableNamesToString(EDataType eDataType, Object instanceValue) {
		return convertBPELVariableNamesBaseToString(ExecutablePackage.Literals.BPEL_VARIABLE_NAMES_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createBPELVariableNamesBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createBPELVariableNameFromString(ExecutablePackage.Literals.BPEL_VARIABLE_NAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBPELVariableNamesBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertBPELVariableNameToString(ExecutablePackage.Literals.BPEL_VARIABLE_NAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> createQNamesFromString(EDataType eDataType, String initialValue) {
		return createQNamesBaseFromString(ExecutablePackage.Literals.QNAMES_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQNamesToString(EDataType eDataType, Object instanceValue) {
		return convertQNamesBaseToString(ExecutablePackage.Literals.QNAMES_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> createQNamesBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<QName> result = new ArrayList<QName>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQNamesBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean createBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanFromString(ExecutablePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanToString(ExecutablePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiate createInitiateObjectFromString(EDataType eDataType, String initialValue) {
		return createInitiateFromString(ExecutablePackage.Literals.INITIATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInitiateToString(ExecutablePackage.Literals.INITIATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPatternObjectFromString(EDataType eDataType, String initialValue) {
		return createPatternFromString(ExecutablePackage.Literals.PATTERN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPatternToString(ExecutablePackage.Literals.PATTERN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles createRolesObjectFromString(EDataType eDataType, String initialValue) {
		return createRolesFromString(ExecutablePackage.Literals.ROLES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRolesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRolesToString(ExecutablePackage.Literals.ROLES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutablePackage getExecutablePackage() {
		return (ExecutablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExecutablePackage getPackage() {
		return ExecutablePackage.eINSTANCE;
	}

} //ExecutableFactoryImpl
