/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 			Schema for Executable Process for WS-BPEL 2.0
 * 			OASIS Standard
 * 			11th April, 2007
 * 		
 * 
 *    See http://www.w3.org/XML/1998/namespace.html and
 *    http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *     This schema document describes the XML namespace, in a form
 *     suitable for import by other schema documents.  
 * 
 *     Note that local names in this namespace are intended to be defined
 *     only by the World Wide Web Consortium or its subgroups.  The
 *     following names are currently defined in this namespace and should
 *     not be used with conflicting semantics by any Working Group,
 *     specification, or document instance:
 * 
 *     base (as an attribute name): denotes an attribute whose value
 *          provides a URI to be used as the base for interpreting any
 *          relative URIs in the scope of the element on which it
 *          appears; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML Base specification.
 * 
 *     id   (as an attribute name): denotes an attribute whose value
 *          should be interpreted as if declared to be of type ID.
 *          This name is reserved by virtue of its definition in the
 *          xml:id specification.
 * 
 *     lang (as an attribute name): denotes an attribute whose value
 *          is a language code for the natural language of the content of
 *          any element; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML specification.
 *   
 *     space (as an attribute name): denotes an attribute whose
 *          value is a keyword indicating what whitespace processing
 *          discipline is intended for the content of the element; its
 *          value is inherited.  This name is reserved by virtue of its
 *          definition in the XML specification.
 * 
 *     Father (in any context at all): denotes Jon Bosak, the chair of 
 *          the original XML Working Group.  This name is reserved by 
 *          the following decision of the W3C XML Plenary and 
 *          XML Coordination groups:
 * 
 *              In appreciation for his vision, leadership and dedication
 *              the W3C XML Plenary on this 10th day of February, 2000
 *              reserves for Jon Bosak in perpetuity the XML name
 *              xml:Father
 *   
 * This schema defines attributes and an attribute group
 *         suitable for use by
 *         schemas wishing to allow xml:base, xml:lang, xml:space or xml:id
 *         attributes on elements they define.
 * 
 *         To enable this, such a schema must import this schema
 *         for the XML namespace, e.g. as follows:
 *         &lt;schema . . .&gt;
 *          . . .
 *          &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                     schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 * 
 *         Subsequently, qualified reference to any of the attributes
 *         or the group defined below will have the desired effect, e.g.
 * 
 *         &lt;type . . .&gt;
 *          . . .
 *          &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *  
 *          will define a type which will schema-validate an instance
 *          element with any of those attributes
 * In keeping with the XML Schema WG's standard versioning
 *    policy, this schema document will persist at
 *    http://www.w3.org/2007/08/xml.xsd.
 *    At the date of issue it can also be found at
 *    http://www.w3.org/2001/xml.xsd.
 *    The schema document at that URI may however change in the future,
 *    in order to remain compatible with the latest version of XML Schema
 *    itself, or with the XML namespace itself.  In other words, if the XML
 *    Schema or XML namespaces change, the version of this document at
 *    http://www.w3.org/2001/xml.xsd will change
 *    accordingly; the version at
 *    http://www.w3.org/2007/08/xml.xsd will not change.
 *   
 * <!-- end-model-doc -->
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutableFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "executable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/wsbpel/2.0/process/executable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "executable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutablePackage eINSTANCE = org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSIGN = 3;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BRANCHES = 4;

	/**
	 * The feature id for the '<em><b>Catch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATCH = 5;

	/**
	 * The feature id for the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATCH_ALL = 6;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPENSATE = 7;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPENSATE_SCOPE = 8;

	/**
	 * The feature id for the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPENSATION_HANDLER = 9;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLETION_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COPY = 12;

	/**
	 * The feature id for the '<em><b>Correlation Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_SET = 13;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_SETS = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 15;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELSE = 16;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELSEIF = 17;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMPTY = 18;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_HANDLERS = 19;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXIT = 20;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION = 21;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION_ACTIVITY = 22;

	/**
	 * The feature id for the '<em><b>Extension Assign Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION = 23;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSIONS = 24;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAULT_HANDLERS = 25;

	/**
	 * The feature id for the '<em><b>Final Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FINAL_COUNTER_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOW = 27;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOR = 28;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOR_EACH = 29;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM = 30;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM_PART = 31;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM_PARTS = 32;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IF = 33;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORT = 34;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOKE = 35;

	/**
	 * The feature id for the '<em><b>Join Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOIN_CONDITION = 36;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK = 37;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINKS = 38;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LITERAL = 39;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_EXCHANGE = 40;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_EXCHANGES = 41;

	/**
	 * The feature id for the '<em><b>On Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ON_EVENT = 42;

	/**
	 * The feature id for the '<em><b>On Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ON_MESSAGE = 43;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTNER_LINK = 44;

	/**
	 * The feature id for the '<em><b>Partner Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTNER_LINKS = 45;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PICK = 46;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESS = 47;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY = 48;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECEIVE = 49;

	/**
	 * The feature id for the '<em><b>Repeat Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPEAT_EVERY = 50;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPEAT_UNTIL = 51;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLY = 52;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETHROW = 53;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCOPE = 54;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQUENCE = 55;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 56;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCES = 57;

	/**
	 * The feature id for the '<em><b>Start Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_COUNTER_VALUE = 58;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET = 59;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGETS = 60;

	/**
	 * The feature id for the '<em><b>Termination Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TERMINATION_HANDLER = 61;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THROW = 62;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO = 63;

	/**
	 * The feature id for the '<em><b>To Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO_PART = 64;

	/**
	 * The feature id for the '<em><b>To Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO_PARTS = 65;

	/**
	 * The feature id for the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION_CONDITION = 66;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNTIL = 67;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE = 68;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VARIABLE = 69;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VARIABLES = 70;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAIT = 71;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WHILE = 72;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 73;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensibleElementsImpl <em>Extensible Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensibleElementsImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensibleElements()
	 * @generated
	 */
	int EXTENSIBLE_ELEMENTS = 26;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Extensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TARGETS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SOURCES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUPPRESS_JOIN_FAILURE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityContainerImpl <em>Activity Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityContainerImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getActivityContainer()
	 * @generated
	 */
	int ACTIVITY_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__ASSIGN = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__COMPENSATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__COMPENSATE_SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__EMPTY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__EXIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__EXTENSION_ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__FLOW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__FOR_EACH = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__IF = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__INVOKE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__PICK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__RECEIVE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__REPEAT_UNTIL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__REPLY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__RETHROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__SEQUENCE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__THROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__VALIDATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__WAIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__WHILE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Activity Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__GROUP = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__COPY = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension Assign Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXTENSION_ASSIGN_OPERATION = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__VALIDATE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExpressionImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BooleanExprImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__MIXED = EXPRESSION__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__ANY = EXPRESSION__ANY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BranchesImpl <em>Branches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BranchesImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBranches()
	 * @generated
	 */
	int BRANCHES = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__MIXED = EXPRESSION__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__ANY = EXPRESSION__ANY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Successful Branches Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__SUCCESSFUL_BRANCHES_ONLY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl <em>Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCatch()
	 * @generated
	 */
	int CATCH = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__DOCUMENTATION = ACTIVITY_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ANY = ACTIVITY_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ANY_ATTRIBUTE = ACTIVITY_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ASSIGN = ACTIVITY_CONTAINER__ASSIGN;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__COMPENSATE = ACTIVITY_CONTAINER__COMPENSATE;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__COMPENSATE_SCOPE = ACTIVITY_CONTAINER__COMPENSATE_SCOPE;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__EMPTY = ACTIVITY_CONTAINER__EMPTY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__EXIT = ACTIVITY_CONTAINER__EXIT;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__EXTENSION_ACTIVITY = ACTIVITY_CONTAINER__EXTENSION_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FLOW = ACTIVITY_CONTAINER__FLOW;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FOR_EACH = ACTIVITY_CONTAINER__FOR_EACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__IF = ACTIVITY_CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__INVOKE = ACTIVITY_CONTAINER__INVOKE;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__PICK = ACTIVITY_CONTAINER__PICK;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__RECEIVE = ACTIVITY_CONTAINER__RECEIVE;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__REPEAT_UNTIL = ACTIVITY_CONTAINER__REPEAT_UNTIL;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__REPLY = ACTIVITY_CONTAINER__REPLY;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__RETHROW = ACTIVITY_CONTAINER__RETHROW;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__SCOPE = ACTIVITY_CONTAINER__SCOPE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__SEQUENCE = ACTIVITY_CONTAINER__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__THROW = ACTIVITY_CONTAINER__THROW;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__VALIDATE = ACTIVITY_CONTAINER__VALIDATE;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__WAIT = ACTIVITY_CONTAINER__WAIT;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__WHILE = ACTIVITY_CONTAINER__WHILE;

	/**
	 * The feature id for the '<em><b>Fault Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_ELEMENT = ACTIVITY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_MESSAGE_TYPE = ACTIVITY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_NAME = ACTIVITY_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_VARIABLE = ACTIVITY_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_FEATURE_COUNT = ACTIVITY_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateImpl <em>Compensate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCompensate()
	 * @generated
	 */
	int COMPENSATE = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The number of structural features of the '<em>Compensate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateScopeImpl <em>Compensate Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateScopeImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCompensateScope()
	 * @generated
	 */
	int COMPENSATE_SCOPE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__TARGET = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compensate Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompletionConditionImpl <em>Completion Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompletionConditionImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCompletionCondition()
	 * @generated
	 */
	int COMPLETION_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__BRANCHES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Completion Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ConditionImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MIXED = EXPRESSION__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ANY = EXPRESSION__ANY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__FROM = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TO = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore Missing From Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__IGNORE_MISSING_FROM_DATA = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keep Src Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__KEEP_SRC_ELEMENT_NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Initiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__INITIATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__SET = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsImpl <em>Correlations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelations()
	 * @generated
	 */
	int CORRELATIONS = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__CORRELATION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationSet()
	 * @generated
	 */
	int CORRELATION_SET = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__PROPERTIES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetsImpl <em>Correlation Sets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetsImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationSets()
	 * @generated
	 */
	int CORRELATION_SETS = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__CORRELATION_SET = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlation Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsWithPatternImpl <em>Correlations With Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsWithPatternImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationsWithPattern()
	 * @generated
	 */
	int CORRELATIONS_WITH_PATTERN = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_WITH_PATTERN__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_WITH_PATTERN__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_WITH_PATTERN__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_WITH_PATTERN__CORRELATION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlations With Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_WITH_PATTERN_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationWithPatternImpl <em>Correlation With Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationWithPatternImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationWithPattern()
	 * @generated
	 */
	int CORRELATION_WITH_PATTERN = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_WITH_PATTERN__DOCUMENTATION = CORRELATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_WITH_PATTERN__ANY = CORRELATION__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_WITH_PATTERN__ANY_ATTRIBUTE = CORRELATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Initiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_WITH_PATTERN__INITIATE = CORRELATION__INITIATE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_WITH_PATTERN__SET = CORRELATION__SET;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_WITH_PATTERN__PATTERN = CORRELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlation With Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_WITH_PATTERN_FEATURE_COUNT = CORRELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DeadlineExprImpl <em>Deadline Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DeadlineExprImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDeadlineExpr()
	 * @generated
	 */
	int DEADLINE_EXPR = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_EXPR__MIXED = EXPRESSION__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_EXPR__ANY = EXPRESSION__ANY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_EXPR__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_EXPR__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Deadline Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentationImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LANG = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DurationExprImpl <em>Duration Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DurationExprImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDurationExpr()
	 * @generated
	 */
	int DURATION_EXPR = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_EXPR__MIXED = EXPRESSION__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_EXPR__ANY = EXPRESSION__ANY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_EXPR__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_EXPR__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Duration Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl <em>Elseif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getElseif()
	 * @generated
	 */
	int ELSEIF = 21;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__CONDITION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__ASSIGN = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__COMPENSATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__COMPENSATE_SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__EMPTY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__EXIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__EXTENSION_ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__FLOW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__FOR_EACH = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__IF = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__INVOKE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__PICK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__RECEIVE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__REPEAT_UNTIL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__REPLY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__RETHROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__SEQUENCE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__THROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__VALIDATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__WAIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__WHILE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Elseif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EmptyImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EventHandlersImpl <em>Event Handlers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EventHandlersImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getEventHandlers()
	 * @generated
	 */
	int EVENT_HANDLERS = 23;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>On Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ON_EVENT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ON_ALARM = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Handlers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExitImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExit()
	 * @generated
	 */
	int EXIT = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The number of structural features of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 27;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MUST_UNDERSTAND = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAMESPACE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionActivityImpl <em>Extension Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionActivityImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensionActivity()
	 * @generated
	 */
	int EXTENSION_ACTIVITY = 28;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extension Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionAssignOperationImpl <em>Extension Assign Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionAssignOperationImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensionAssignOperation()
	 * @generated
	 */
	int EXTENSION_ASSIGN_OPERATION = 29;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Extension Assign Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionsImpl <em>Extensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionsImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensions()
	 * @generated
	 */
	int EXTENSIONS = 30;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__EXTENSION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FaultHandlersImpl <em>Fault Handlers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FaultHandlersImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFaultHandlers()
	 * @generated
	 */
	int FAULT_HANDLERS = 31;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Catch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__CATCH = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__CATCH_ALL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Handlers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 32;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__LINKS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ACTIVITY = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ASSIGN = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__COMPENSATE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__COMPENSATE_SCOPE = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EMPTY = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EXIT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EXTENSION_ACTIVITY = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FOR_EACH = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__IF = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__INVOKE = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PICK = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__RECEIVE = ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__REPEAT_UNTIL = ACTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__REPLY = ACTIVITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__RETHROW = ACTIVITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SCOPE = ACTIVITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SEQUENCE = ACTIVITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__THROW = ACTIVITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__VALIDATE = ACTIVITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__WAIT = ACTIVITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__WHILE = ACTIVITY_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 33;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Start Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__START_COUNTER_VALUE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__FINAL_COUNTER_VALUE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__COMPLETION_CONDITION = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SCOPE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Counter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__COUNTER_NAME = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__PARALLEL = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ANY = 2;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__QUERY = 4;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ENDPOINT_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__EXPRESSION_LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PART = 7;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PARTNER_LINK = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ANY_ATTRIBUTE = 11;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartImpl <em>From Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFromPart()
	 * @generated
	 */
	int FROM_PART = 35;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__TO_VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>From Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartsImpl <em>From Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartsImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFromParts()
	 * @generated
	 */
	int FROM_PARTS = 36;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__FROM_PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>From Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.IfImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getIf()
	 * @generated
	 */
	int IF = 37;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ASSIGN = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COMPENSATE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COMPENSATE_SCOPE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EMPTY = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EXIT = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EXTENSION_ACTIVITY = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FLOW = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FOR_EACH = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__INVOKE = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__PICK = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__RECEIVE = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__REPEAT_UNTIL = ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__REPLY = ACTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__RETHROW = ACTIVITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SCOPE = ACTIVITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SEQUENCE = ACTIVITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THROW = ACTIVITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__VALIDATE = ACTIVITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__WAIT = ACTIVITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__WHILE = ACTIVITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSEIF = ACTIVITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = ACTIVITY_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ImportImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 38;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 39;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CORRELATIONS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CATCH = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CATCH_ALL = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__COMPENSATION_HANDLER = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TO_PARTS = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FROM_PARTS = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__INPUT_VARIABLE = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__OPERATION = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__OUTPUT_VARIABLE = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PARTNER_LINK = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PORT_TYPE = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinkImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 40;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinksImpl <em>Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinksImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getLinks()
	 * @generated
	 */
	int LINKS = 41;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__LINK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LiteralImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 42;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ANY = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangeImpl <em>Message Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangeImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getMessageExchange()
	 * @generated
	 */
	int MESSAGE_EXCHANGE = 43;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangesImpl <em>Message Exchanges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangesImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getMessageExchanges()
	 * @generated
	 */
	int MESSAGE_EXCHANGES = 44;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__MESSAGE_EXCHANGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Exchanges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl <em>On Alarm Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnAlarmEvent()
	 * @generated
	 */
	int ON_ALARM_EVENT = 45;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__FOR = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__UNTIL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repeat Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__REPEAT_EVERY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repeat Every1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__REPEAT_EVERY1 = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT__SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>On Alarm Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_EVENT_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmPickImpl <em>On Alarm Pick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmPickImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnAlarmPick()
	 * @generated
	 */
	int ON_ALARM_PICK = 46;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__FOR = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__UNTIL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__ASSIGN = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__COMPENSATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__COMPENSATE_SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__EMPTY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__EXIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__EXTENSION_ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__FLOW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__FOR_EACH = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__IF = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__INVOKE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__PICK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__RECEIVE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__REPEAT_UNTIL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__REPLY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__RETHROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__SEQUENCE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__THROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__VALIDATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__WAIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK__WHILE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>On Alarm Pick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_PICK_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl <em>On Msg Common</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnMsgCommon()
	 * @generated
	 */
	int ON_MSG_COMMON = 49;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__CORRELATIONS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__FROM_PARTS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__MESSAGE_EXCHANGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__OPERATION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__PARTNER_LINK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__PORT_TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>On Msg Common</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnEventImpl <em>On Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnEventImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnEvent()
	 * @generated
	 */
	int ON_EVENT = 47;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__DOCUMENTATION = ON_MSG_COMMON__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ANY = ON_MSG_COMMON__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ANY_ATTRIBUTE = ON_MSG_COMMON__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__CORRELATIONS = ON_MSG_COMMON__CORRELATIONS;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__FROM_PARTS = ON_MSG_COMMON__FROM_PARTS;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__MESSAGE_EXCHANGE = ON_MSG_COMMON__MESSAGE_EXCHANGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__OPERATION = ON_MSG_COMMON__OPERATION;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__PARTNER_LINK = ON_MSG_COMMON__PARTNER_LINK;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__PORT_TYPE = ON_MSG_COMMON__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__VARIABLE = ON_MSG_COMMON__VARIABLE;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__SCOPE = ON_MSG_COMMON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ELEMENT = ON_MSG_COMMON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__MESSAGE_TYPE = ON_MSG_COMMON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>On Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT_FEATURE_COUNT = ON_MSG_COMMON_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMessageImpl <em>On Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMessageImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnMessage()
	 * @generated
	 */
	int ON_MESSAGE = 48;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__DOCUMENTATION = ON_MSG_COMMON__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ANY = ON_MSG_COMMON__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ANY_ATTRIBUTE = ON_MSG_COMMON__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__CORRELATIONS = ON_MSG_COMMON__CORRELATIONS;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__FROM_PARTS = ON_MSG_COMMON__FROM_PARTS;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__MESSAGE_EXCHANGE = ON_MSG_COMMON__MESSAGE_EXCHANGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__OPERATION = ON_MSG_COMMON__OPERATION;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__PARTNER_LINK = ON_MSG_COMMON__PARTNER_LINK;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__PORT_TYPE = ON_MSG_COMMON__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__VARIABLE = ON_MSG_COMMON__VARIABLE;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ASSIGN = ON_MSG_COMMON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__COMPENSATE = ON_MSG_COMMON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__COMPENSATE_SCOPE = ON_MSG_COMMON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__EMPTY = ON_MSG_COMMON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__EXIT = ON_MSG_COMMON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__EXTENSION_ACTIVITY = ON_MSG_COMMON_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__FLOW = ON_MSG_COMMON_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__FOR_EACH = ON_MSG_COMMON_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__IF = ON_MSG_COMMON_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__INVOKE = ON_MSG_COMMON_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__PICK = ON_MSG_COMMON_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__RECEIVE = ON_MSG_COMMON_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__REPEAT_UNTIL = ON_MSG_COMMON_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__REPLY = ON_MSG_COMMON_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__RETHROW = ON_MSG_COMMON_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__SCOPE = ON_MSG_COMMON_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__SEQUENCE = ON_MSG_COMMON_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__THROW = ON_MSG_COMMON_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__VALIDATE = ON_MSG_COMMON_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__WAIT = ON_MSG_COMMON_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__WHILE = ON_MSG_COMMON_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>On Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_FEATURE_COUNT = ON_MSG_COMMON_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl <em>Partner Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPartnerLink()
	 * @generated
	 */
	int PARTNER_LINK = 50;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Initialize Partner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__INITIALIZE_PARTNER_ROLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>My Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__MY_ROLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partner Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__PARTNER_LINK_TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__PARTNER_ROLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Partner Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinksImpl <em>Partner Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinksImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPartnerLinks()
	 * @generated
	 */
	int PARTNER_LINKS = 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__PARTNER_LINK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partner Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PickImpl <em>Pick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PickImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPick()
	 * @generated
	 */
	int PICK = 52;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>On Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ON_MESSAGE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ON_ALARM = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__CREATE_INSTANCE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSIONS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPORT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partner Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARTNER_LINKS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MESSAGE_EXCHANGES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABLES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CORRELATION_SETS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FAULT_HANDLERS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EVENT_HANDLERS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ASSIGN = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COMPENSATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COMPENSATE_SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EMPTY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSION_ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FLOW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FOR_EACH = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IF = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INVOKE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PICK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RECEIVE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REPEAT_UNTIL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REPLY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RETHROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SEQUENCE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__THROW = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VALIDATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WAIT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WHILE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXIT_ON_STANDARD_FAULT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXPRESSION_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QUERY_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPRESS_JOIN_FAILURE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TARGET_NAMESPACE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 35;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.QueryImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 54;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ANY = 1;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReceiveImpl <em>Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReceiveImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getReceive()
	 * @generated
	 */
	int RECEIVE = 55;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__CORRELATIONS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__FROM_PARTS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__CREATE_INSTANCE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__MESSAGE_EXCHANGE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__OPERATION = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__PARTNER_LINK = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__PORT_TYPE = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__VARIABLE = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RepeatUntilImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRepeatUntil()
	 * @generated
	 */
	int REPEAT_UNTIL = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ASSIGN = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__COMPENSATE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__COMPENSATE_SCOPE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__EMPTY = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__EXIT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__EXTENSION_ACTIVITY = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__FLOW = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__FOR_EACH = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__IF = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__INVOKE = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__PICK = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__RECEIVE = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__REPEAT_UNTIL = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__REPLY = ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__RETHROW = ACTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SCOPE = ACTIVITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SEQUENCE = ACTIVITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__THROW = ACTIVITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__VALIDATE = ACTIVITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__WAIT = ACTIVITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__WHILE = ACTIVITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__CONDITION = ACTIVITY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Repeat Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReplyImpl <em>Reply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReplyImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getReply()
	 * @generated
	 */
	int REPLY = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__CORRELATIONS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__TO_PARTS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__FAULT_NAME = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__MESSAGE_EXCHANGE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__OPERATION = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__PARTNER_LINK = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__PORT_TYPE = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__VARIABLE = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Reply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RethrowImpl <em>Rethrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RethrowImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRethrow()
	 * @generated
	 */
	int RETHROW = 58;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The number of structural features of the '<em>Rethrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 59;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Partner Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__PARTNER_LINKS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MESSAGE_EXCHANGES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__VARIABLES = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CORRELATION_SETS = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__FAULT_HANDLERS = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__COMPENSATION_HANDLER = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Termination Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TERMINATION_HANDLER = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EVENT_HANDLERS = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ASSIGN = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__COMPENSATE = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__COMPENSATE_SCOPE = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EMPTY = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EXIT = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EXTENSION_ACTIVITY = ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__FLOW = ACTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__FOR_EACH = ACTIVITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__IF = ACTIVITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INVOKE = ACTIVITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__PICK = ACTIVITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__RECEIVE = ACTIVITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__REPEAT_UNTIL = ACTIVITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__REPLY = ACTIVITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__RETHROW = ACTIVITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SCOPE = ACTIVITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SEQUENCE = ACTIVITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__THROW = ACTIVITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__VALIDATE = ACTIVITY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__WAIT = ACTIVITY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__WHILE = ACTIVITY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EXIT_ON_STANDARD_FAULT = ACTIVITY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Isolated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ISOLATED = ACTIVITY_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 31;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 60;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ASSIGN = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMPENSATE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMPENSATE_SCOPE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__EMPTY = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__EXIT = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__EXTENSION_ACTIVITY = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FLOW = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FOR_EACH = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__IF = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INVOKE = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__PICK = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__RECEIVE = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REPEAT_UNTIL = ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REPLY = ACTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__RETHROW = ACTIVITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SCOPE = ACTIVITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SEQUENCE = ACTIVITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__THROW = ACTIVITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VALIDATE = ACTIVITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__WAIT = ACTIVITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__WHILE = ACTIVITY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourceImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 61;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TRANSITION_CONDITION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LINK_NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourcesImpl <em>Sources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourcesImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getSources()
	 * @generated
	 */
	int SOURCES = 62;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__SOURCE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 63;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__LINK_NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetsImpl <em>Targets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetsImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getTargets()
	 * @generated
	 */
	int TARGETS = 64;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Join Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__JOIN_CONDITION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__TARGET = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Targets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ThrowImpl <em>Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ThrowImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getThrow()
	 * @generated
	 */
	int THROW = 65;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__FAULT_NAME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__FAULT_VARIABLE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToImpl <em>To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getTo()
	 * @generated
	 */
	int TO = 66;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__ANY = 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__QUERY = 3;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__EXPRESSION_LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PART = 5;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PARTNER_LINK = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartImpl <em>To Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getToPart()
	 * @generated
	 */
	int TO_PART = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>From Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__FROM_VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartsImpl <em>To Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartsImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getToParts()
	 * @generated
	 */
	int TO_PARTS = 68;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>To Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__TO_PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ValidateImpl <em>Validate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ValidateImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getValidate()
	 * @generated
	 */
	int VALIDATE = 69;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__VARIABLES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariableImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 70;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FROM = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ELEMENT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MESSAGE_TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariablesImpl <em>Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariablesImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getVariables()
	 * @generated
	 */
	int VARIABLES = 71;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__ANY = EXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WaitImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 72;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__FOR = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__UNTIL = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WhileImpl
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 73;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ANY = ACTIVITY__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ASSIGN = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__COMPENSATE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensate Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__COMPENSATE_SCOPE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__EMPTY = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__EXIT = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extension Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__EXTENSION_ACTIVITY = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__FLOW = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__FOR_EACH = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__IF = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__INVOKE = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__PICK = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__RECEIVE = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Repeat Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__REPEAT_UNTIL = ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__REPLY = ACTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rethrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__RETHROW = ACTIVITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SCOPE = ACTIVITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SEQUENCE = ACTIVITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Throw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__THROW = ACTIVITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__VALIDATE = ACTIVITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__WAIT = ACTIVITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__WHILE = ACTIVITY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean <em>Boolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 74;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate <em>Initiate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getInitiate()
	 * @generated
	 */
	int INITIATE = 75;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern <em>Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 76;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Roles <em>Roles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRoles()
	 * @generated
	 */
	int ROLES = 77;

	/**
	 * The meta object id for the '<em>BPEL Variable Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBPELVariableName()
	 * @generated
	 */
	int BPEL_VARIABLE_NAME = 78;

	/**
	 * The meta object id for the '<em>BPEL Variable Names</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBPELVariableNames()
	 * @generated
	 */
	int BPEL_VARIABLE_NAMES = 79;

	/**
	 * The meta object id for the '<em>BPEL Variable Names Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBPELVariableNamesBase()
	 * @generated
	 */
	int BPEL_VARIABLE_NAMES_BASE = 80;

	/**
	 * The meta object id for the '<em>QNames</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getQNames()
	 * @generated
	 */
	int QNAMES = 81;

	/**
	 * The meta object id for the '<em>QNames Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getQNamesBase()
	 * @generated
	 */
	int QNAMES_BASE = 82;

	/**
	 * The meta object id for the '<em>Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBooleanObject()
	 * @generated
	 */
	int BOOLEAN_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Initiate Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getInitiateObject()
	 * @generated
	 */
	int INITIATE_OBJECT = 84;

	/**
	 * The meta object id for the '<em>Pattern Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPatternObject()
	 * @generated
	 */
	int PATTERN_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Roles Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRolesObject()
	 * @generated
	 */
	int ROLES_OBJECT = 86;


	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getAssign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branches</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getBranches()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Branches();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catch();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch All</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCatchAll()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CatchAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensateScope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Handler</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompensationHandler()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCompletionCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompletionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCopy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Copy();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Set</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getCorrelationSets()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationSets();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Else();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getElseif()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Elseif();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEmpty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getEventHandlers()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionAssignOperation <em>Extension Assign Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Assign Operation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensionAssignOperation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtensionAssignOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getExtensions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extensions();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFaultHandlers()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FaultHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFinalCounterValue <em>Final Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Counter Value</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFinalCounterValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FinalCounterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFlow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getForEach()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromPart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FromPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getFromParts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FromParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getIf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getImport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getInvoke()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getJoinCondition <em>Join Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getJoinCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JoinCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Link();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Links</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLinks()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Links();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getLiteral()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Literal();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Exchange</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageExchange();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Exchanges</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getMessageExchanges()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageExchanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnEvent <em>On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Event</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OnEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnMessage <em>On Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Message</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getOnMessage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OnMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartnerLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Links</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPartnerLinks()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartnerLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getPick()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getProcess()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Process();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Query();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReceive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatEvery <em>Repeat Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Every</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatEvery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RepeatEvery();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRepeatUntil()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getReply()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getRethrow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getScope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSequence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sources</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getSources()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sources();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getStartCounterValue <em>Start Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Counter Value</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getStartCounterValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StartCounterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Targets</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTargets()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTerminationHandler <em>Termination Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Termination Handler</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTerminationHandler()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TerminationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getThrow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_To();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToPart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ToPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToParts <em>To Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getToParts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ToParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getTransitionCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransitionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getUntil()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Until();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getValidate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getVariables()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWait()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DocumentRoot#getWhile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_While();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Targets</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getTargets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sources</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Sources();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Join Failure</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Activity#getSuppressJoinFailure()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_SuppressJoinFailure();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer <em>Activity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Container</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer
	 * @generated
	 */
	EClass getActivityContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getAssign()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getCompensate()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getCompensateScope()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getEmpty()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getExit()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getExtensionActivity()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getFlow()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getForEach()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getIf()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getInvoke()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getPick()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getReceive()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getRepeatUntil()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getReply()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getRethrow()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getScope()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getSequence()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getThrow()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getValidate()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getWait()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ActivityContainer#getWhile()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_While();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getGroup()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copy</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getCopy()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Copy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getExtensionAssignOperation <em>Extension Assign Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Assign Operation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getExtensionAssignOperation()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_ExtensionAssignOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Assign#getValidate()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Validate();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expr</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.BooleanExpr
	 * @generated
	 */
	EClass getBooleanExpr();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Branches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branches</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Branches
	 * @generated
	 */
	EClass getBranches();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successful Branches Only</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Branches#getSuccessfulBranchesOnly()
	 * @see #getBranches()
	 * @generated
	 */
	EAttribute getBranches_SuccessfulBranchesOnly();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Catch
	 * @generated
	 */
	EClass getCatch();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultElement <em>Fault Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Element</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultElement()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultElement();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultMessageType <em>Fault Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Message Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultMessageType()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultMessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultName()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultName();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultVariable <em>Fault Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Catch#getFaultVariable()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultVariable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Compensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Compensate
	 * @generated
	 */
	EClass getCompensate();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope
	 * @generated
	 */
	EClass getCompensateScope();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope#getTarget()
	 * @see #getCompensateScope()
	 * @generated
	 */
	EAttribute getCompensateScope_Target();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition
	 * @generated
	 */
	EClass getCompletionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branches</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CompletionCondition#getBranches()
	 * @see #getCompletionCondition()
	 * @generated
	 */
	EReference getCompletionCondition_Branches();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getFrom()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getTo()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_To();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Missing From Data</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getIgnoreMissingFromData()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_IgnoreMissingFromData();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Src Element Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getKeepSrcElementName()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_KeepSrcElementName();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getInitiate <em>Initiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getInitiate()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Initiate();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Correlation#getSet()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Set();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlations</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Correlations
	 * @generated
	 */
	EClass getCorrelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Correlations#getCorrelation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Correlations#getCorrelation()
	 * @see #getCorrelations()
	 * @generated
	 */
	EReference getCorrelations_Correlation();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Set</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet
	 * @generated
	 */
	EClass getCorrelationSet();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet#getName()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EAttribute getCorrelationSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSet#getProperties()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EAttribute getCorrelationSet_Properties();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Sets</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets
	 * @generated
	 */
	EClass getCorrelationSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets#getCorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Set</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationSets#getCorrelationSet()
	 * @see #getCorrelationSets()
	 * @generated
	 */
	EReference getCorrelationSets_CorrelationSet();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationsWithPattern <em>Correlations With Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlations With Pattern</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationsWithPattern
	 * @generated
	 */
	EClass getCorrelationsWithPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationsWithPattern#getCorrelation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationsWithPattern#getCorrelation()
	 * @see #getCorrelationsWithPattern()
	 * @generated
	 */
	EReference getCorrelationsWithPattern_Correlation();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern <em>Correlation With Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation With Pattern</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern
	 * @generated
	 */
	EClass getCorrelationWithPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern#getPattern()
	 * @see #getCorrelationWithPattern()
	 * @generated
	 */
	EAttribute getCorrelationWithPattern_Pattern();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DeadlineExpr <em>Deadline Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Expr</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DeadlineExpr
	 * @generated
	 */
	EClass getDeadlineExpr();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getMixed()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getAny()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getLang()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation#getSource()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Source();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.DurationExpr <em>Duration Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Expr</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.DurationExpr
	 * @generated
	 */
	EClass getDurationExpr();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elseif</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif
	 * @generated
	 */
	EClass getElseif();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCondition()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getAssign()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensate()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getCompensateScope()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getEmpty()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExit()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getExtensionActivity()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getFlow()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getForEach()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getIf()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getInvoke()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getPick()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReceive()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRepeatUntil()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getReply()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getRethrow()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getScope()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getSequence()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getThrow()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getValidate()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWait()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif#getWhile()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_While();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers
	 * @generated
	 */
	EClass getEventHandlers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers#getOnEvent <em>On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Event</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers#getOnEvent()
	 * @see #getEventHandlers()
	 * @generated
	 */
	EReference getEventHandlers_OnEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers#getOnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Alarm</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.EventHandlers#getOnAlarm()
	 * @see #getEventHandlers()
	 * @generated
	 */
	EReference getEventHandlers_OnAlarm();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Exit
	 * @generated
	 */
	EClass getExit();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getMixed()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getAny()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getExpressionLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Expression#getAnyAttribute()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements <em>Extensible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensible Elements</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements
	 * @generated
	 */
	EClass getExtensibleElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements#getDocumentation()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EReference getExtensibleElements_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements#getAny()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EAttribute getExtensibleElements_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensibleElements#getAnyAttribute()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EAttribute getExtensibleElements_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Extension#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Extension#getMustUnderstand()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_MustUnderstand();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Extension#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Extension#getNamespace()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Namespace();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity
	 * @generated
	 */
	EClass getExtensionActivity();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity#getAny()
	 * @see #getExtensionActivity()
	 * @generated
	 */
	EAttribute getExtensionActivity_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionAssignOperation <em>Extension Assign Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Assign Operation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionAssignOperation
	 * @generated
	 */
	EClass getExtensionAssignOperation();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Extensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Extensions
	 * @generated
	 */
	EClass getExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Extensions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Extensions#getExtension()
	 * @see #getExtensions()
	 * @generated
	 */
	EReference getExtensions_Extension();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers
	 * @generated
	 */
	EClass getFaultHandlers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers#getCatch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers#getCatch()
	 * @see #getFaultHandlers()
	 * @generated
	 */
	EReference getFaultHandlers_Catch();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers#getCatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch All</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FaultHandlers#getCatchAll()
	 * @see #getFaultHandlers()
	 * @generated
	 */
	EReference getFaultHandlers_CatchAll();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Links</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getLinks()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Links();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getActivity()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getAssign()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Assign();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getCompensate()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Compensate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getCompensateScope()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_CompensateScope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getEmpty()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Empty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getExit()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Exit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getExtensionActivity()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getFlow()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Flow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getForEach()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_ForEach();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getIf()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getInvoke()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Invoke();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getPick()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Pick();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getReceive()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Receive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getRepeatUntil()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getReply()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Reply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getRethrow()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Rethrow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getScope()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getSequence()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getThrow()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Throw();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getValidate()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Validate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getWait()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Wait();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Flow#getWhile()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_While();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getStartCounterValue <em>Start Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Counter Value</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getStartCounterValue()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_StartCounterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getFinalCounterValue <em>Final Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Counter Value</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getFinalCounterValue()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_FinalCounterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCompletionCondition()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_CompletionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getScope()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCounterName <em>Counter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getCounterName()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_CounterName();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach#getParallel()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Parallel();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getMixed()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getDocumentation()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getAny()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Any();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getLiteral()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Literal();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getQuery()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getEndpointReference <em>Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Reference</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getEndpointReference()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_EndpointReference();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getExpressionLanguage()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPart()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPartnerLink()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getProperty()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getVariable()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.From#getAnyAttribute()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart
	 * @generated
	 */
	EClass getFromPart();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart#getPart()
	 * @see #getFromPart()
	 * @generated
	 */
	EAttribute getFromPart_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart#getToVariable <em>To Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FromPart#getToVariable()
	 * @see #getFromPart()
	 * @generated
	 */
	EAttribute getFromPart_ToVariable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts
	 * @generated
	 */
	EClass getFromParts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts#getFromPart()
	 * @see #getFromParts()
	 * @generated
	 */
	EReference getFromParts_FromPart();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getAssign()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getCompensate()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getCompensateScope()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getEmpty()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getExit()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getExtensionActivity()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getFlow()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getForEach()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getInvoke()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getPick()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getReceive()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getRepeatUntil()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getReply()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getRethrow()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getScope()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getSequence()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getThrow()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getValidate()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getWait()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getWhile()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_While();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elseif</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getElseif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elseif();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Import#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Import#getImportType()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCorrelations()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Correlations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCatch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCatch()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Catch();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch All</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCatchAll()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_CatchAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Handler</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getCompensationHandler()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_CompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getToParts <em>To Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getToParts()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_ToParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getFromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getFromParts()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_FromParts();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getInputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getInputVariable()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_InputVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getOperation()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getOutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getOutputVariable()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_OutputVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getPartnerLink()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke#getPortType()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_PortType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Links
	 * @generated
	 */
	EClass getLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Links#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Links#getLink()
	 * @see #getLinks()
	 * @generated
	 */
	EReference getLinks_Link();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Literal#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Literal#getMixed()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Literal#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Literal#getAny()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Exchange</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchange
	 * @generated
	 */
	EClass getMessageExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchange#getName()
	 * @see #getMessageExchange()
	 * @generated
	 */
	EAttribute getMessageExchange_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Exchanges</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges
	 * @generated
	 */
	EClass getMessageExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Exchange</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.MessageExchanges#getMessageExchange()
	 * @see #getMessageExchanges()
	 * @generated
	 */
	EReference getMessageExchanges_MessageExchange();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent <em>On Alarm Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Alarm Event</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent
	 * @generated
	 */
	EClass getOnAlarmEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getFor()
	 * @see #getOnAlarmEvent()
	 * @generated
	 */
	EReference getOnAlarmEvent_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getUntil()
	 * @see #getOnAlarmEvent()
	 * @generated
	 */
	EReference getOnAlarmEvent_Until();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery <em>Repeat Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Every</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery()
	 * @see #getOnAlarmEvent()
	 * @generated
	 */
	EReference getOnAlarmEvent_RepeatEvery();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery1 <em>Repeat Every1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Every1</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getRepeatEvery1()
	 * @see #getOnAlarmEvent()
	 * @generated
	 */
	EReference getOnAlarmEvent_RepeatEvery1();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmEvent#getScope()
	 * @see #getOnAlarmEvent()
	 * @generated
	 */
	EReference getOnAlarmEvent_Scope();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick <em>On Alarm Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Alarm Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick
	 * @generated
	 */
	EClass getOnAlarmPick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getFor()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getUntil()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Until();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getAssign()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getCompensate()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getCompensateScope()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getEmpty()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getExit()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getExtensionActivity()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getFlow()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getForEach()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getIf()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getInvoke()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getPick()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getReceive()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getRepeatUntil()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getReply()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getRethrow()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getScope()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getSequence()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getThrow()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getValidate()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getWait()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnAlarmPick#getWhile()
	 * @see #getOnAlarmPick()
	 * @generated
	 */
	EReference getOnAlarmPick_While();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent <em>On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Event</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent
	 * @generated
	 */
	EClass getOnEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent#getScope()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent#getElement()
	 * @see #getOnEvent()
	 * @generated
	 */
	EAttribute getOnEvent_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnEvent#getMessageType()
	 * @see #getOnEvent()
	 * @generated
	 */
	EAttribute getOnEvent_MessageType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage <em>On Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Message</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage
	 * @generated
	 */
	EClass getOnMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getAssign()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getCompensate()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getCompensateScope()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getEmpty()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getExit()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getExtensionActivity()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getFlow()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getForEach()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getIf()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getInvoke()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getPick()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getReceive()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getRepeatUntil()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getReply()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getRethrow()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getScope()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getSequence()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getThrow()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getValidate()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getWait()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMessage#getWhile()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_While();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon <em>On Msg Common</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Msg Common</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon
	 * @generated
	 */
	EClass getOnMsgCommon();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getCorrelations()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EReference getOnMsgCommon_Correlations();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getFromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getFromParts()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EReference getOnMsgCommon_FromParts();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getMessageExchange()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EAttribute getOnMsgCommon_MessageExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getOperation()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EAttribute getOnMsgCommon_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPartnerLink()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EAttribute getOnMsgCommon_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPortType()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EAttribute getOnMsgCommon_PortType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getVariable()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EAttribute getOnMsgCommon_Variable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink
	 * @generated
	 */
	EClass getPartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialize Partner Role</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getInitializePartnerRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_InitializePartnerRole();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getMyRole <em>My Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Role</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getMyRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_MyRole();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getName()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerLinkType()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_PartnerLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Role</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLink#getPartnerRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_PartnerRole();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Links</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLinks
	 * @generated
	 */
	EClass getPartnerLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLinks#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.PartnerLinks#getPartnerLink()
	 * @see #getPartnerLinks()
	 * @generated
	 */
	EReference getPartnerLinks_PartnerLink();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pick
	 * @generated
	 */
	EClass getPick();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getOnMessage <em>On Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Message</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getOnMessage()
	 * @see #getPick()
	 * @generated
	 */
	EReference getPick_OnMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getOnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Alarm</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getOnAlarm()
	 * @see #getPick()
	 * @generated
	 */
	EReference getPick_OnAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getCreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Instance</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pick#getCreateInstance()
	 * @see #getPick()
	 * @generated
	 */
	EAttribute getPick_CreateInstance();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExtensions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getImport()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getPartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Links</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getPartnerLinks()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_PartnerLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getMessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Exchanges</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getMessageExchanges()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_MessageExchanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getVariables()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getCorrelationSets()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CorrelationSets();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getFaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getFaultHandlers()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FaultHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getEventHandlers()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_EventHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getAssign()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getCompensate()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getCompensateScope()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getEmpty()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExit()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExtensionActivity()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getFlow()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getForEach()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getIf()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getInvoke()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getPick()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getReceive()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getRepeatUntil()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getReply()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getRethrow()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getScope()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getSequence()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getThrow()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getValidate()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getWait()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getWhile()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_While();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExitOnStandardFault <em>Exit On Standard Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit On Standard Fault</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExitOnStandardFault()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExitOnStandardFault();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getExpressionLanguage()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getQueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getQueryLanguage()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_QueryLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getSuppressJoinFailure <em>Suppress Join Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Join Failure</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getSuppressJoinFailure()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_SuppressJoinFailure();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Process#getTargetNamespace()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getMixed()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getAny()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getQueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getQueryLanguage()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_QueryLanguage();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Query#getAnyAttribute()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive
	 * @generated
	 */
	EClass getReceive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getCorrelations()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_Correlations();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getFromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getFromParts()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_FromParts();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getCreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Instance</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getCreateInstance()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_CreateInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getMessageExchange()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_MessageExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getOperation()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getPartnerLink()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getPortType()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_PortType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Receive#getVariable()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_Variable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil
	 * @generated
	 */
	EClass getRepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getAssign()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getCompensate()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getCompensateScope()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getEmpty()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getExit()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getExtensionActivity()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getFlow()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getForEach()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getIf()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getInvoke()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getPick()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getReceive()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getRepeatUntil()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getReply()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getRethrow()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getScope()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getSequence()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getThrow()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getValidate()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getWait()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getWhile()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_While();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil#getCondition()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Condition();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply
	 * @generated
	 */
	EClass getReply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getCorrelations()
	 * @see #getReply()
	 * @generated
	 */
	EReference getReply_Correlations();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getToParts <em>To Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getToParts()
	 * @see #getReply()
	 * @generated
	 */
	EReference getReply_ToParts();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getFaultName()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_FaultName();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getMessageExchange()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_MessageExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getOperation()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getPartnerLink()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getPortType()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_PortType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Reply#getVariable()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_Variable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow
	 * @generated
	 */
	EClass getRethrow();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Links</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPartnerLinks()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_PartnerLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getMessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Exchanges</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getMessageExchanges()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_MessageExchanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCorrelationSets()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_CorrelationSets();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFaultHandlers()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_FaultHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Handler</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensationHandler()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_CompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getTerminationHandler <em>Termination Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Termination Handler</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getTerminationHandler()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_TerminationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handlers</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEventHandlers()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_EventHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getAssign()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensate()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getCompensateScope()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getEmpty()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExit()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExtensionActivity()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getFlow()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getForEach()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIf()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getInvoke()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getPick()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReceive()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRepeatUntil()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getReply()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getRethrow()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getScope()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getSequence()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getThrow()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getValidate()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWait()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getWhile()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_While();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit On Standard Fault</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getExitOnStandardFault()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_ExitOnStandardFault();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIsolated <em>Isolated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Scope#getIsolated()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Isolated();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getActivity()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getAssign()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Assign();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getCompensate()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Compensate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getCompensateScope()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_CompensateScope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getEmpty()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Empty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getExit()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Exit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getExtensionActivity()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getFlow()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Flow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getForEach()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_ForEach();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getIf()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getInvoke()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Invoke();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getPick()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Pick();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getReceive()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Receive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getRepeatUntil()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getReply()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Reply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getRethrow()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Rethrow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getScope()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getSequence()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getThrow()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Throw();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getValidate()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Validate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getWait()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Wait();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence#getWhile()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_While();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getTransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getTransitionCondition()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_TransitionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Source#getLinkName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_LinkName();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sources</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sources
	 * @generated
	 */
	EClass getSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Sources#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Sources#getSource()
	 * @see #getSources()
	 * @generated
	 */
	EReference getSources_Source();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Target#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Target#getLinkName()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_LinkName();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Targets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targets</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Targets
	 * @generated
	 */
	EClass getTargets();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Targets#getJoinCondition <em>Join Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Targets#getJoinCondition()
	 * @see #getTargets()
	 * @generated
	 */
	EReference getTargets_JoinCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Targets#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Targets#getTarget()
	 * @see #getTargets()
	 * @generated
	 */
	EReference getTargets_Target();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Throw <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Throw
	 * @generated
	 */
	EClass getThrow();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Throw#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Throw#getFaultName()
	 * @see #getThrow()
	 * @generated
	 */
	EAttribute getThrow_FaultName();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Throw#getFaultVariable <em>Fault Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Throw#getFaultVariable()
	 * @see #getThrow()
	 * @generated
	 */
	EAttribute getThrow_FaultVariable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To
	 * @generated
	 */
	EClass getTo();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getMixed()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getDocumentation()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getAny()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Any();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getQuery()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getExpressionLanguage()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getPart()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getPartnerLink()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getProperty()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getVariable()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.To#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.To#getAnyAttribute()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ToPart
	 * @generated
	 */
	EClass getToPart();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ToPart#getFromVariable <em>From Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ToPart#getFromVariable()
	 * @see #getToPart()
	 * @generated
	 */
	EAttribute getToPart_FromVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ToPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ToPart#getPart()
	 * @see #getToPart()
	 * @generated
	 */
	EAttribute getToPart_Part();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ToParts <em>To Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Parts</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ToParts
	 * @generated
	 */
	EClass getToParts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.ToParts#getToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Part</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ToParts#getToPart()
	 * @see #getToParts()
	 * @generated
	 */
	EReference getToParts_ToPart();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Validate
	 * @generated
	 */
	EClass getValidate();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Validate#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variables</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Validate#getVariables()
	 * @see #getValidate()
	 * @generated
	 */
	EAttribute getValidate_Variables();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getFrom()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_From();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getElement()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getMessageType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variables</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variables
	 * @generated
	 */
	EClass getVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Variables#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Variables#getVariable()
	 * @see #getVariables()
	 * @generated
	 */
	EReference getVariables_Variable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Wait#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Wait#getFor()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Wait#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Wait#getUntil()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_Until();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getAssign()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getCompensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getCompensate()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Compensate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getCompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getCompensateScope()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_CompensateScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getEmpty()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getExit()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Activity</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getExtensionActivity()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_ExtensionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getFlow()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Flow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Each</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getForEach()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_ForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getIf()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getInvoke()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Invoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pick</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getPick()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Pick();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getReceive()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Receive();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getRepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Until</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getRepeatUntil()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_RepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getReply()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Reply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getRethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rethrow</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getRethrow()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Rethrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getScope()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getSequence()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getThrow <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getThrow()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Throw();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getValidate()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getWait()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.While#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.While#getWhile()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_While();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @generated
	 */
	EEnum getBoolean();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate <em>Initiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initiate</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
	 * @generated
	 */
	EEnum getInitiate();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pattern</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
	 * @generated
	 */
	EEnum getPattern();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Roles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Roles</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
	 * @generated
	 */
	EEnum getRoles();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>BPEL Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BPEL Variable Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BPELVariableName' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' pattern='[^\\.]+'"
	 * @generated
	 */
	EDataType getBPELVariableName();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>BPEL Variable Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BPEL Variable Names</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='BPELVariableNames' baseType='BPELVariableNames_._base' minLength='1'"
	 * @generated
	 */
	EDataType getBPELVariableNames();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>BPEL Variable Names Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BPEL Variable Names Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='BPELVariableNames_._base' itemType='BPELVariableName'"
	 * @generated
	 */
	EDataType getBPELVariableNamesBase();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>QNames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>QNames</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='QNames' baseType='QNames_._base' minLength='1'"
	 * @generated
	 */
	EDataType getQNames();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>QNames Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>QNames Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='QNames_._base' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getQNamesBase();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean <em>Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Object</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @model instanceClass="org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean"
	 *        extendedMetaData="name='tBoolean:Object' baseType='tBoolean'"
	 * @generated
	 */
	EDataType getBooleanObject();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate <em>Initiate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Initiate Object</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
	 * @model instanceClass="org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate"
	 *        extendedMetaData="name='tInitiate:Object' baseType='tInitiate'"
	 * @generated
	 */
	EDataType getInitiateObject();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern <em>Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pattern Object</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
	 * @model instanceClass="org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern"
	 *        extendedMetaData="name='tPattern:Object' baseType='tPattern'"
	 * @generated
	 */
	EDataType getPatternObject();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Roles <em>Roles Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Roles Object</em>'.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
	 * @model instanceClass="org.open.oasis.docs.wsbpel._2._0.process.executable.Roles"
	 *        extendedMetaData="name='tRoles:Object' baseType='tRoles'"
	 * @generated
	 */
	EDataType getRolesObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutableFactory getExecutableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentRootImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSIGN = eINSTANCE.getDocumentRoot_Assign();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BRANCHES = eINSTANCE.getDocumentRoot_Branches();

		/**
		 * The meta object literal for the '<em><b>Catch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATCH = eINSTANCE.getDocumentRoot_Catch();

		/**
		 * The meta object literal for the '<em><b>Catch All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATCH_ALL = eINSTANCE.getDocumentRoot_CatchAll();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPENSATE = eINSTANCE.getDocumentRoot_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPENSATE_SCOPE = eINSTANCE.getDocumentRoot_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Compensation Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPENSATION_HANDLER = eINSTANCE.getDocumentRoot_CompensationHandler();

		/**
		 * The meta object literal for the '<em><b>Completion Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPLETION_CONDITION = eINSTANCE.getDocumentRoot_CompletionCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONDITION = eINSTANCE.getDocumentRoot_Condition();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COPY = eINSTANCE.getDocumentRoot_Copy();

		/**
		 * The meta object literal for the '<em><b>Correlation Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CORRELATION_SET = eINSTANCE.getDocumentRoot_CorrelationSet();

		/**
		 * The meta object literal for the '<em><b>Correlation Sets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CORRELATION_SETS = eINSTANCE.getDocumentRoot_CorrelationSets();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ELSE = eINSTANCE.getDocumentRoot_Else();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ELSEIF = eINSTANCE.getDocumentRoot_Elseif();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMPTY = eINSTANCE.getDocumentRoot_Empty();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVENT_HANDLERS = eINSTANCE.getDocumentRoot_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXIT = eINSTANCE.getDocumentRoot_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSION = eINSTANCE.getDocumentRoot_Extension();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSION_ACTIVITY = eINSTANCE.getDocumentRoot_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Extension Assign Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSION_ASSIGN_OPERATION = eINSTANCE.getDocumentRoot_ExtensionAssignOperation();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSIONS = eINSTANCE.getDocumentRoot_Extensions();

		/**
		 * The meta object literal for the '<em><b>Fault Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FAULT_HANDLERS = eINSTANCE.getDocumentRoot_FaultHandlers();

		/**
		 * The meta object literal for the '<em><b>Final Counter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FINAL_COUNTER_VALUE = eINSTANCE.getDocumentRoot_FinalCounterValue();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOW = eINSTANCE.getDocumentRoot_Flow();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOR = eINSTANCE.getDocumentRoot_For();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOR_EACH = eINSTANCE.getDocumentRoot_ForEach();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FROM = eINSTANCE.getDocumentRoot_From();

		/**
		 * The meta object literal for the '<em><b>From Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FROM_PART = eINSTANCE.getDocumentRoot_FromPart();

		/**
		 * The meta object literal for the '<em><b>From Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FROM_PARTS = eINSTANCE.getDocumentRoot_FromParts();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IF = eINSTANCE.getDocumentRoot_If();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INVOKE = eINSTANCE.getDocumentRoot_Invoke();

		/**
		 * The meta object literal for the '<em><b>Join Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__JOIN_CONDITION = eINSTANCE.getDocumentRoot_JoinCondition();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINK = eINSTANCE.getDocumentRoot_Link();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINKS = eINSTANCE.getDocumentRoot_Links();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LITERAL = eINSTANCE.getDocumentRoot_Literal();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_EXCHANGE = eINSTANCE.getDocumentRoot_MessageExchange();

		/**
		 * The meta object literal for the '<em><b>Message Exchanges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_EXCHANGES = eINSTANCE.getDocumentRoot_MessageExchanges();

		/**
		 * The meta object literal for the '<em><b>On Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ON_EVENT = eINSTANCE.getDocumentRoot_OnEvent();

		/**
		 * The meta object literal for the '<em><b>On Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ON_MESSAGE = eINSTANCE.getDocumentRoot_OnMessage();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARTNER_LINK = eINSTANCE.getDocumentRoot_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Partner Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARTNER_LINKS = eINSTANCE.getDocumentRoot_PartnerLinks();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PICK = eINSTANCE.getDocumentRoot_Pick();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROCESS = eINSTANCE.getDocumentRoot_Process();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY = eINSTANCE.getDocumentRoot_Query();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECEIVE = eINSTANCE.getDocumentRoot_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Every</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPEAT_EVERY = eINSTANCE.getDocumentRoot_RepeatEvery();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPEAT_UNTIL = eINSTANCE.getDocumentRoot_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLY = eINSTANCE.getDocumentRoot_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RETHROW = eINSTANCE.getDocumentRoot_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCOPE = eINSTANCE.getDocumentRoot_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SEQUENCE = eINSTANCE.getDocumentRoot_Sequence();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCES = eINSTANCE.getDocumentRoot_Sources();

		/**
		 * The meta object literal for the '<em><b>Start Counter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__START_COUNTER_VALUE = eINSTANCE.getDocumentRoot_StartCounterValue();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TARGET = eINSTANCE.getDocumentRoot_Target();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TARGETS = eINSTANCE.getDocumentRoot_Targets();

		/**
		 * The meta object literal for the '<em><b>Termination Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TERMINATION_HANDLER = eINSTANCE.getDocumentRoot_TerminationHandler();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__THROW = eINSTANCE.getDocumentRoot_Throw();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TO = eINSTANCE.getDocumentRoot_To();

		/**
		 * The meta object literal for the '<em><b>To Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TO_PART = eINSTANCE.getDocumentRoot_ToPart();

		/**
		 * The meta object literal for the '<em><b>To Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TO_PARTS = eINSTANCE.getDocumentRoot_ToParts();

		/**
		 * The meta object literal for the '<em><b>Transition Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSITION_CONDITION = eINSTANCE.getDocumentRoot_TransitionCondition();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNTIL = eINSTANCE.getDocumentRoot_Until();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATE = eINSTANCE.getDocumentRoot_Validate();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VARIABLE = eINSTANCE.getDocumentRoot_Variable();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VARIABLES = eINSTANCE.getDocumentRoot_Variables();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAIT = eINSTANCE.getDocumentRoot_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WHILE = eINSTANCE.getDocumentRoot_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TARGETS = eINSTANCE.getActivity_Targets();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SOURCES = eINSTANCE.getActivity_Sources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Suppress Join Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__SUPPRESS_JOIN_FAILURE = eINSTANCE.getActivity_SuppressJoinFailure();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityContainerImpl <em>Activity Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ActivityContainerImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getActivityContainer()
		 * @generated
		 */
		EClass ACTIVITY_CONTAINER = eINSTANCE.getActivityContainer();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__ASSIGN = eINSTANCE.getActivityContainer_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__COMPENSATE = eINSTANCE.getActivityContainer_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__COMPENSATE_SCOPE = eINSTANCE.getActivityContainer_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__EMPTY = eINSTANCE.getActivityContainer_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__EXIT = eINSTANCE.getActivityContainer_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__EXTENSION_ACTIVITY = eINSTANCE.getActivityContainer_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__FLOW = eINSTANCE.getActivityContainer_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__FOR_EACH = eINSTANCE.getActivityContainer_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__IF = eINSTANCE.getActivityContainer_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__INVOKE = eINSTANCE.getActivityContainer_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__PICK = eINSTANCE.getActivityContainer_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__RECEIVE = eINSTANCE.getActivityContainer_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__REPEAT_UNTIL = eINSTANCE.getActivityContainer_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__REPLY = eINSTANCE.getActivityContainer_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__RETHROW = eINSTANCE.getActivityContainer_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__SCOPE = eINSTANCE.getActivityContainer_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__SEQUENCE = eINSTANCE.getActivityContainer_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__THROW = eINSTANCE.getActivityContainer_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__VALIDATE = eINSTANCE.getActivityContainer_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__WAIT = eINSTANCE.getActivityContainer_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__WHILE = eINSTANCE.getActivityContainer_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.AssignImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__GROUP = eINSTANCE.getAssign_Group();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__COPY = eINSTANCE.getAssign_Copy();

		/**
		 * The meta object literal for the '<em><b>Extension Assign Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__EXTENSION_ASSIGN_OPERATION = eINSTANCE.getAssign_ExtensionAssignOperation();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__VALIDATE = eINSTANCE.getAssign_Validate();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BooleanExprImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBooleanExpr()
		 * @generated
		 */
		EClass BOOLEAN_EXPR = eINSTANCE.getBooleanExpr();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BranchesImpl <em>Branches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.BranchesImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBranches()
		 * @generated
		 */
		EClass BRANCHES = eINSTANCE.getBranches();

		/**
		 * The meta object literal for the '<em><b>Successful Branches Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCHES__SUCCESSFUL_BRANCHES_ONLY = eINSTANCE.getBranches_SuccessfulBranchesOnly();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl <em>Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CatchImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCatch()
		 * @generated
		 */
		EClass CATCH = eINSTANCE.getCatch();

		/**
		 * The meta object literal for the '<em><b>Fault Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_ELEMENT = eINSTANCE.getCatch_FaultElement();

		/**
		 * The meta object literal for the '<em><b>Fault Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_MESSAGE_TYPE = eINSTANCE.getCatch_FaultMessageType();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_NAME = eINSTANCE.getCatch_FaultName();

		/**
		 * The meta object literal for the '<em><b>Fault Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_VARIABLE = eINSTANCE.getCatch_FaultVariable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateImpl <em>Compensate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCompensate()
		 * @generated
		 */
		EClass COMPENSATE = eINSTANCE.getCompensate();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateScopeImpl <em>Compensate Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompensateScopeImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCompensateScope()
		 * @generated
		 */
		EClass COMPENSATE_SCOPE = eINSTANCE.getCompensateScope();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATE_SCOPE__TARGET = eINSTANCE.getCompensateScope_Target();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompletionConditionImpl <em>Completion Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CompletionConditionImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCompletionCondition()
		 * @generated
		 */
		EClass COMPLETION_CONDITION = eINSTANCE.getCompletionCondition();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETION_CONDITION__BRANCHES = eINSTANCE.getCompletionCondition_Branches();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ConditionImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CopyImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__FROM = eINSTANCE.getCopy_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__TO = eINSTANCE.getCopy_To();

		/**
		 * The meta object literal for the '<em><b>Ignore Missing From Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__IGNORE_MISSING_FROM_DATA = eINSTANCE.getCopy_IgnoreMissingFromData();

		/**
		 * The meta object literal for the '<em><b>Keep Src Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__KEEP_SRC_ELEMENT_NAME = eINSTANCE.getCopy_KeepSrcElementName();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationImpl <em>Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelation()
		 * @generated
		 */
		EClass CORRELATION = eINSTANCE.getCorrelation();

		/**
		 * The meta object literal for the '<em><b>Initiate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__INITIATE = eINSTANCE.getCorrelation_Initiate();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__SET = eINSTANCE.getCorrelation_Set();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsImpl <em>Correlations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelations()
		 * @generated
		 */
		EClass CORRELATIONS = eINSTANCE.getCorrelations();

		/**
		 * The meta object literal for the '<em><b>Correlation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATIONS__CORRELATION = eINSTANCE.getCorrelations_Correlation();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationSet()
		 * @generated
		 */
		EClass CORRELATION_SET = eINSTANCE.getCorrelationSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_SET__NAME = eINSTANCE.getCorrelationSet_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_SET__PROPERTIES = eINSTANCE.getCorrelationSet_Properties();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetsImpl <em>Correlation Sets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationSetsImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationSets()
		 * @generated
		 */
		EClass CORRELATION_SETS = eINSTANCE.getCorrelationSets();

		/**
		 * The meta object literal for the '<em><b>Correlation Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_SETS__CORRELATION_SET = eINSTANCE.getCorrelationSets_CorrelationSet();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsWithPatternImpl <em>Correlations With Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationsWithPatternImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationsWithPattern()
		 * @generated
		 */
		EClass CORRELATIONS_WITH_PATTERN = eINSTANCE.getCorrelationsWithPattern();

		/**
		 * The meta object literal for the '<em><b>Correlation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATIONS_WITH_PATTERN__CORRELATION = eINSTANCE.getCorrelationsWithPattern_Correlation();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationWithPatternImpl <em>Correlation With Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.CorrelationWithPatternImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getCorrelationWithPattern()
		 * @generated
		 */
		EClass CORRELATION_WITH_PATTERN = eINSTANCE.getCorrelationWithPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_WITH_PATTERN__PATTERN = eINSTANCE.getCorrelationWithPattern_Pattern();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DeadlineExprImpl <em>Deadline Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DeadlineExprImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDeadlineExpr()
		 * @generated
		 */
		EClass DEADLINE_EXPR = eINSTANCE.getDeadlineExpr();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DocumentationImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__MIXED = eINSTANCE.getDocumentation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__ANY = eINSTANCE.getDocumentation_Any();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__LANG = eINSTANCE.getDocumentation_Lang();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__SOURCE = eINSTANCE.getDocumentation_Source();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DurationExprImpl <em>Duration Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.DurationExprImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getDurationExpr()
		 * @generated
		 */
		EClass DURATION_EXPR = eINSTANCE.getDurationExpr();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl <em>Elseif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getElseif()
		 * @generated
		 */
		EClass ELSEIF = eINSTANCE.getElseif();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__CONDITION = eINSTANCE.getElseif_Condition();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__ASSIGN = eINSTANCE.getElseif_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__COMPENSATE = eINSTANCE.getElseif_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__COMPENSATE_SCOPE = eINSTANCE.getElseif_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__EMPTY = eINSTANCE.getElseif_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__EXIT = eINSTANCE.getElseif_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__EXTENSION_ACTIVITY = eINSTANCE.getElseif_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__FLOW = eINSTANCE.getElseif_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__FOR_EACH = eINSTANCE.getElseif_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__IF = eINSTANCE.getElseif_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__INVOKE = eINSTANCE.getElseif_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__PICK = eINSTANCE.getElseif_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__RECEIVE = eINSTANCE.getElseif_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__REPEAT_UNTIL = eINSTANCE.getElseif_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__REPLY = eINSTANCE.getElseif_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__RETHROW = eINSTANCE.getElseif_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__SCOPE = eINSTANCE.getElseif_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__SEQUENCE = eINSTANCE.getElseif_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__THROW = eINSTANCE.getElseif_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__VALIDATE = eINSTANCE.getElseif_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__WAIT = eINSTANCE.getElseif_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__WHILE = eINSTANCE.getElseif_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EmptyImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EventHandlersImpl <em>Event Handlers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.EventHandlersImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getEventHandlers()
		 * @generated
		 */
		EClass EVENT_HANDLERS = eINSTANCE.getEventHandlers();

		/**
		 * The meta object literal for the '<em><b>On Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLERS__ON_EVENT = eINSTANCE.getEventHandlers_OnEvent();

		/**
		 * The meta object literal for the '<em><b>On Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLERS__ON_ALARM = eINSTANCE.getEventHandlers_OnAlarm();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExitImpl <em>Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExitImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExit()
		 * @generated
		 */
		EClass EXIT = eINSTANCE.getExit();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExpressionImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__MIXED = eINSTANCE.getExpression_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__ANY = eINSTANCE.getExpression_Any();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION_LANGUAGE = eINSTANCE.getExpression_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__ANY_ATTRIBUTE = eINSTANCE.getExpression_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensibleElementsImpl <em>Extensible Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensibleElementsImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensibleElements()
		 * @generated
		 */
		EClass EXTENSIBLE_ELEMENTS = eINSTANCE.getExtensibleElements();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIBLE_ELEMENTS__DOCUMENTATION = eINSTANCE.getExtensibleElements_Documentation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBLE_ELEMENTS__ANY = eINSTANCE.getExtensibleElements_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = eINSTANCE.getExtensibleElements_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Must Understand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__MUST_UNDERSTAND = eINSTANCE.getExtension_MustUnderstand();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAMESPACE = eINSTANCE.getExtension_Namespace();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionActivityImpl <em>Extension Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionActivityImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensionActivity()
		 * @generated
		 */
		EClass EXTENSION_ACTIVITY = eINSTANCE.getExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ACTIVITY__ANY = eINSTANCE.getExtensionActivity_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionAssignOperationImpl <em>Extension Assign Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionAssignOperationImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensionAssignOperation()
		 * @generated
		 */
		EClass EXTENSION_ASSIGN_OPERATION = eINSTANCE.getExtensionAssignOperation();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionsImpl <em>Extensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExtensionsImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getExtensions()
		 * @generated
		 */
		EClass EXTENSIONS = eINSTANCE.getExtensions();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS__EXTENSION = eINSTANCE.getExtensions_Extension();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FaultHandlersImpl <em>Fault Handlers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FaultHandlersImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFaultHandlers()
		 * @generated
		 */
		EClass FAULT_HANDLERS = eINSTANCE.getFaultHandlers();

		/**
		 * The meta object literal for the '<em><b>Catch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_HANDLERS__CATCH = eINSTANCE.getFaultHandlers_Catch();

		/**
		 * The meta object literal for the '<em><b>Catch All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_HANDLERS__CATCH_ALL = eINSTANCE.getFaultHandlers_CatchAll();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FlowImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__LINKS = eINSTANCE.getFlow_Links();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__ACTIVITY = eINSTANCE.getFlow_Activity();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ASSIGN = eINSTANCE.getFlow_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__COMPENSATE = eINSTANCE.getFlow_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__COMPENSATE_SCOPE = eINSTANCE.getFlow_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__EMPTY = eINSTANCE.getFlow_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__EXIT = eINSTANCE.getFlow_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__EXTENSION_ACTIVITY = eINSTANCE.getFlow_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOW = eINSTANCE.getFlow_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FOR_EACH = eINSTANCE.getFlow_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__IF = eINSTANCE.getFlow_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__INVOKE = eINSTANCE.getFlow_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__PICK = eINSTANCE.getFlow_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__RECEIVE = eINSTANCE.getFlow_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__REPEAT_UNTIL = eINSTANCE.getFlow_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__REPLY = eINSTANCE.getFlow_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__RETHROW = eINSTANCE.getFlow_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SCOPE = eINSTANCE.getFlow_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SEQUENCE = eINSTANCE.getFlow_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__THROW = eINSTANCE.getFlow_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__VALIDATE = eINSTANCE.getFlow_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__WAIT = eINSTANCE.getFlow_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__WHILE = eINSTANCE.getFlow_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl <em>For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ForEachImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getForEach()
		 * @generated
		 */
		EClass FOR_EACH = eINSTANCE.getForEach();

		/**
		 * The meta object literal for the '<em><b>Start Counter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__START_COUNTER_VALUE = eINSTANCE.getForEach_StartCounterValue();

		/**
		 * The meta object literal for the '<em><b>Final Counter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__FINAL_COUNTER_VALUE = eINSTANCE.getForEach_FinalCounterValue();

		/**
		 * The meta object literal for the '<em><b>Completion Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__COMPLETION_CONDITION = eINSTANCE.getForEach_CompletionCondition();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__SCOPE = eINSTANCE.getForEach_Scope();

		/**
		 * The meta object literal for the '<em><b>Counter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__COUNTER_NAME = eINSTANCE.getForEach_CounterName();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__PARALLEL = eINSTANCE.getForEach_Parallel();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__MIXED = eINSTANCE.getFrom_Mixed();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__DOCUMENTATION = eINSTANCE.getFrom_Documentation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__ANY = eINSTANCE.getFrom_Any();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__LITERAL = eINSTANCE.getFrom_Literal();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__QUERY = eINSTANCE.getFrom_Query();

		/**
		 * The meta object literal for the '<em><b>Endpoint Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__ENDPOINT_REFERENCE = eINSTANCE.getFrom_EndpointReference();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__EXPRESSION_LANGUAGE = eINSTANCE.getFrom_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__PART = eINSTANCE.getFrom_Part();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__PARTNER_LINK = eINSTANCE.getFrom_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__PROPERTY = eINSTANCE.getFrom_Property();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__VARIABLE = eINSTANCE.getFrom_Variable();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__ANY_ATTRIBUTE = eINSTANCE.getFrom_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartImpl <em>From Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFromPart()
		 * @generated
		 */
		EClass FROM_PART = eINSTANCE.getFromPart();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_PART__PART = eINSTANCE.getFromPart_Part();

		/**
		 * The meta object literal for the '<em><b>To Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_PART__TO_VARIABLE = eINSTANCE.getFromPart_ToVariable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartsImpl <em>From Parts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.FromPartsImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getFromParts()
		 * @generated
		 */
		EClass FROM_PARTS = eINSTANCE.getFromParts();

		/**
		 * The meta object literal for the '<em><b>From Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_PARTS__FROM_PART = eINSTANCE.getFromParts_FromPart();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.IfImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ASSIGN = eINSTANCE.getIf_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__COMPENSATE = eINSTANCE.getIf_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__COMPENSATE_SCOPE = eINSTANCE.getIf_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__EMPTY = eINSTANCE.getIf_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__EXIT = eINSTANCE.getIf_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__EXTENSION_ACTIVITY = eINSTANCE.getIf_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__FLOW = eINSTANCE.getIf_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__FOR_EACH = eINSTANCE.getIf_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IF = eINSTANCE.getIf_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__INVOKE = eINSTANCE.getIf_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__PICK = eINSTANCE.getIf_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__RECEIVE = eINSTANCE.getIf_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__REPEAT_UNTIL = eINSTANCE.getIf_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__REPLY = eINSTANCE.getIf_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__RETHROW = eINSTANCE.getIf_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__SCOPE = eINSTANCE.getIf_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__SEQUENCE = eINSTANCE.getIf_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THROW = eINSTANCE.getIf_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__VALIDATE = eINSTANCE.getIf_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__WAIT = eINSTANCE.getIf_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__WHILE = eINSTANCE.getIf_While();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSEIF = eINSTANCE.getIf_Elseif();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ImportImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_TYPE = eINSTANCE.getImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__LOCATION = eINSTANCE.getImport_Location();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAMESPACE = eINSTANCE.getImport_Namespace();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl <em>Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.InvokeImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getInvoke()
		 * @generated
		 */
		EClass INVOKE = eINSTANCE.getInvoke();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__CORRELATIONS = eINSTANCE.getInvoke_Correlations();

		/**
		 * The meta object literal for the '<em><b>Catch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__CATCH = eINSTANCE.getInvoke_Catch();

		/**
		 * The meta object literal for the '<em><b>Catch All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__CATCH_ALL = eINSTANCE.getInvoke_CatchAll();

		/**
		 * The meta object literal for the '<em><b>Compensation Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__COMPENSATION_HANDLER = eINSTANCE.getInvoke_CompensationHandler();

		/**
		 * The meta object literal for the '<em><b>To Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__TO_PARTS = eINSTANCE.getInvoke_ToParts();

		/**
		 * The meta object literal for the '<em><b>From Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__FROM_PARTS = eINSTANCE.getInvoke_FromParts();

		/**
		 * The meta object literal for the '<em><b>Input Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__INPUT_VARIABLE = eINSTANCE.getInvoke_InputVariable();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__OPERATION = eINSTANCE.getInvoke_Operation();

		/**
		 * The meta object literal for the '<em><b>Output Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__OUTPUT_VARIABLE = eINSTANCE.getInvoke_OutputVariable();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__PARTNER_LINK = eINSTANCE.getInvoke_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__PORT_TYPE = eINSTANCE.getInvoke_PortType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinkImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinksImpl <em>Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LinksImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getLinks()
		 * @generated
		 */
		EClass LINKS = eINSTANCE.getLinks();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKS__LINK = eINSTANCE.getLinks_Link();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.LiteralImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__MIXED = eINSTANCE.getLiteral_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__ANY = eINSTANCE.getLiteral_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangeImpl <em>Message Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangeImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getMessageExchange()
		 * @generated
		 */
		EClass MESSAGE_EXCHANGE = eINSTANCE.getMessageExchange();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_EXCHANGE__NAME = eINSTANCE.getMessageExchange_Name();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangesImpl <em>Message Exchanges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.MessageExchangesImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getMessageExchanges()
		 * @generated
		 */
		EClass MESSAGE_EXCHANGES = eINSTANCE.getMessageExchanges();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_EXCHANGES__MESSAGE_EXCHANGE = eINSTANCE.getMessageExchanges_MessageExchange();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl <em>On Alarm Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmEventImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnAlarmEvent()
		 * @generated
		 */
		EClass ON_ALARM_EVENT = eINSTANCE.getOnAlarmEvent();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_EVENT__FOR = eINSTANCE.getOnAlarmEvent_For();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_EVENT__UNTIL = eINSTANCE.getOnAlarmEvent_Until();

		/**
		 * The meta object literal for the '<em><b>Repeat Every</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_EVENT__REPEAT_EVERY = eINSTANCE.getOnAlarmEvent_RepeatEvery();

		/**
		 * The meta object literal for the '<em><b>Repeat Every1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_EVENT__REPEAT_EVERY1 = eINSTANCE.getOnAlarmEvent_RepeatEvery1();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_EVENT__SCOPE = eINSTANCE.getOnAlarmEvent_Scope();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmPickImpl <em>On Alarm Pick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnAlarmPickImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnAlarmPick()
		 * @generated
		 */
		EClass ON_ALARM_PICK = eINSTANCE.getOnAlarmPick();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__FOR = eINSTANCE.getOnAlarmPick_For();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__UNTIL = eINSTANCE.getOnAlarmPick_Until();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__ASSIGN = eINSTANCE.getOnAlarmPick_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__COMPENSATE = eINSTANCE.getOnAlarmPick_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__COMPENSATE_SCOPE = eINSTANCE.getOnAlarmPick_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__EMPTY = eINSTANCE.getOnAlarmPick_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__EXIT = eINSTANCE.getOnAlarmPick_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__EXTENSION_ACTIVITY = eINSTANCE.getOnAlarmPick_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__FLOW = eINSTANCE.getOnAlarmPick_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__FOR_EACH = eINSTANCE.getOnAlarmPick_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__IF = eINSTANCE.getOnAlarmPick_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__INVOKE = eINSTANCE.getOnAlarmPick_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__PICK = eINSTANCE.getOnAlarmPick_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__RECEIVE = eINSTANCE.getOnAlarmPick_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__REPEAT_UNTIL = eINSTANCE.getOnAlarmPick_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__REPLY = eINSTANCE.getOnAlarmPick_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__RETHROW = eINSTANCE.getOnAlarmPick_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__SCOPE = eINSTANCE.getOnAlarmPick_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__SEQUENCE = eINSTANCE.getOnAlarmPick_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__THROW = eINSTANCE.getOnAlarmPick_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__VALIDATE = eINSTANCE.getOnAlarmPick_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__WAIT = eINSTANCE.getOnAlarmPick_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM_PICK__WHILE = eINSTANCE.getOnAlarmPick_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnEventImpl <em>On Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnEventImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnEvent()
		 * @generated
		 */
		EClass ON_EVENT = eINSTANCE.getOnEvent();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EVENT__SCOPE = eINSTANCE.getOnEvent_Scope();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_EVENT__ELEMENT = eINSTANCE.getOnEvent_Element();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_EVENT__MESSAGE_TYPE = eINSTANCE.getOnEvent_MessageType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMessageImpl <em>On Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMessageImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnMessage()
		 * @generated
		 */
		EClass ON_MESSAGE = eINSTANCE.getOnMessage();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__ASSIGN = eINSTANCE.getOnMessage_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__COMPENSATE = eINSTANCE.getOnMessage_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__COMPENSATE_SCOPE = eINSTANCE.getOnMessage_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__EMPTY = eINSTANCE.getOnMessage_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__EXIT = eINSTANCE.getOnMessage_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__EXTENSION_ACTIVITY = eINSTANCE.getOnMessage_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__FLOW = eINSTANCE.getOnMessage_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__FOR_EACH = eINSTANCE.getOnMessage_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__IF = eINSTANCE.getOnMessage_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__INVOKE = eINSTANCE.getOnMessage_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__PICK = eINSTANCE.getOnMessage_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__RECEIVE = eINSTANCE.getOnMessage_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__REPEAT_UNTIL = eINSTANCE.getOnMessage_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__REPLY = eINSTANCE.getOnMessage_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__RETHROW = eINSTANCE.getOnMessage_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__SCOPE = eINSTANCE.getOnMessage_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__SEQUENCE = eINSTANCE.getOnMessage_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__THROW = eINSTANCE.getOnMessage_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__VALIDATE = eINSTANCE.getOnMessage_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__WAIT = eINSTANCE.getOnMessage_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__WHILE = eINSTANCE.getOnMessage_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl <em>On Msg Common</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getOnMsgCommon()
		 * @generated
		 */
		EClass ON_MSG_COMMON = eINSTANCE.getOnMsgCommon();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MSG_COMMON__CORRELATIONS = eINSTANCE.getOnMsgCommon_Correlations();

		/**
		 * The meta object literal for the '<em><b>From Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MSG_COMMON__FROM_PARTS = eINSTANCE.getOnMsgCommon_FromParts();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MSG_COMMON__MESSAGE_EXCHANGE = eINSTANCE.getOnMsgCommon_MessageExchange();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MSG_COMMON__OPERATION = eINSTANCE.getOnMsgCommon_Operation();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MSG_COMMON__PARTNER_LINK = eINSTANCE.getOnMsgCommon_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MSG_COMMON__PORT_TYPE = eINSTANCE.getOnMsgCommon_PortType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MSG_COMMON__VARIABLE = eINSTANCE.getOnMsgCommon_Variable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl <em>Partner Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinkImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPartnerLink()
		 * @generated
		 */
		EClass PARTNER_LINK = eINSTANCE.getPartnerLink();

		/**
		 * The meta object literal for the '<em><b>Initialize Partner Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__INITIALIZE_PARTNER_ROLE = eINSTANCE.getPartnerLink_InitializePartnerRole();

		/**
		 * The meta object literal for the '<em><b>My Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__MY_ROLE = eINSTANCE.getPartnerLink_MyRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__NAME = eINSTANCE.getPartnerLink_Name();

		/**
		 * The meta object literal for the '<em><b>Partner Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__PARTNER_LINK_TYPE = eINSTANCE.getPartnerLink_PartnerLinkType();

		/**
		 * The meta object literal for the '<em><b>Partner Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__PARTNER_ROLE = eINSTANCE.getPartnerLink_PartnerRole();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinksImpl <em>Partner Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PartnerLinksImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPartnerLinks()
		 * @generated
		 */
		EClass PARTNER_LINKS = eINSTANCE.getPartnerLinks();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTNER_LINKS__PARTNER_LINK = eINSTANCE.getPartnerLinks_PartnerLink();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PickImpl <em>Pick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.PickImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPick()
		 * @generated
		 */
		EClass PICK = eINSTANCE.getPick();

		/**
		 * The meta object literal for the '<em><b>On Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK__ON_MESSAGE = eINSTANCE.getPick_OnMessage();

		/**
		 * The meta object literal for the '<em><b>On Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK__ON_ALARM = eINSTANCE.getPick_OnAlarm();

		/**
		 * The meta object literal for the '<em><b>Create Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK__CREATE_INSTANCE = eINSTANCE.getPick_CreateInstance();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ProcessImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EXTENSIONS = eINSTANCE.getProcess_Extensions();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__IMPORT = eINSTANCE.getProcess_Import();

		/**
		 * The meta object literal for the '<em><b>Partner Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PARTNER_LINKS = eINSTANCE.getProcess_PartnerLinks();

		/**
		 * The meta object literal for the '<em><b>Message Exchanges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__MESSAGE_EXCHANGES = eINSTANCE.getProcess_MessageExchanges();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__VARIABLES = eINSTANCE.getProcess_Variables();

		/**
		 * The meta object literal for the '<em><b>Correlation Sets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__CORRELATION_SETS = eINSTANCE.getProcess_CorrelationSets();

		/**
		 * The meta object literal for the '<em><b>Fault Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FAULT_HANDLERS = eINSTANCE.getProcess_FaultHandlers();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EVENT_HANDLERS = eINSTANCE.getProcess_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ASSIGN = eINSTANCE.getProcess_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__COMPENSATE = eINSTANCE.getProcess_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__COMPENSATE_SCOPE = eINSTANCE.getProcess_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EMPTY = eINSTANCE.getProcess_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EXIT = eINSTANCE.getProcess_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EXTENSION_ACTIVITY = eINSTANCE.getProcess_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FLOW = eINSTANCE.getProcess_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FOR_EACH = eINSTANCE.getProcess_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__IF = eINSTANCE.getProcess_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INVOKE = eINSTANCE.getProcess_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PICK = eINSTANCE.getProcess_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RECEIVE = eINSTANCE.getProcess_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__REPEAT_UNTIL = eINSTANCE.getProcess_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__REPLY = eINSTANCE.getProcess_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RETHROW = eINSTANCE.getProcess_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SCOPE = eINSTANCE.getProcess_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SEQUENCE = eINSTANCE.getProcess_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__THROW = eINSTANCE.getProcess_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__VALIDATE = eINSTANCE.getProcess_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__WAIT = eINSTANCE.getProcess_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__WHILE = eINSTANCE.getProcess_While();

		/**
		 * The meta object literal for the '<em><b>Exit On Standard Fault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__EXIT_ON_STANDARD_FAULT = eINSTANCE.getProcess_ExitOnStandardFault();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__EXPRESSION_LANGUAGE = eINSTANCE.getProcess_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Query Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__QUERY_LANGUAGE = eINSTANCE.getProcess_QueryLanguage();

		/**
		 * The meta object literal for the '<em><b>Suppress Join Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__SUPPRESS_JOIN_FAILURE = eINSTANCE.getProcess_SuppressJoinFailure();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__TARGET_NAMESPACE = eINSTANCE.getProcess_TargetNamespace();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.QueryImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__MIXED = eINSTANCE.getQuery_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__ANY = eINSTANCE.getQuery_Any();

		/**
		 * The meta object literal for the '<em><b>Query Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__QUERY_LANGUAGE = eINSTANCE.getQuery_QueryLanguage();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__ANY_ATTRIBUTE = eINSTANCE.getQuery_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReceiveImpl <em>Receive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReceiveImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getReceive()
		 * @generated
		 */
		EClass RECEIVE = eINSTANCE.getReceive();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE__CORRELATIONS = eINSTANCE.getReceive_Correlations();

		/**
		 * The meta object literal for the '<em><b>From Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE__FROM_PARTS = eINSTANCE.getReceive_FromParts();

		/**
		 * The meta object literal for the '<em><b>Create Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__CREATE_INSTANCE = eINSTANCE.getReceive_CreateInstance();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__MESSAGE_EXCHANGE = eINSTANCE.getReceive_MessageExchange();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__OPERATION = eINSTANCE.getReceive_Operation();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__PARTNER_LINK = eINSTANCE.getReceive_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__PORT_TYPE = eINSTANCE.getReceive_PortType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__VARIABLE = eINSTANCE.getReceive_Variable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RepeatUntilImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRepeatUntil()
		 * @generated
		 */
		EClass REPEAT_UNTIL = eINSTANCE.getRepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__ASSIGN = eINSTANCE.getRepeatUntil_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__COMPENSATE = eINSTANCE.getRepeatUntil_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__COMPENSATE_SCOPE = eINSTANCE.getRepeatUntil_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__EMPTY = eINSTANCE.getRepeatUntil_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__EXIT = eINSTANCE.getRepeatUntil_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__EXTENSION_ACTIVITY = eINSTANCE.getRepeatUntil_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__FLOW = eINSTANCE.getRepeatUntil_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__FOR_EACH = eINSTANCE.getRepeatUntil_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__IF = eINSTANCE.getRepeatUntil_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__INVOKE = eINSTANCE.getRepeatUntil_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__PICK = eINSTANCE.getRepeatUntil_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__RECEIVE = eINSTANCE.getRepeatUntil_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__REPEAT_UNTIL = eINSTANCE.getRepeatUntil_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__REPLY = eINSTANCE.getRepeatUntil_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__RETHROW = eINSTANCE.getRepeatUntil_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__SCOPE = eINSTANCE.getRepeatUntil_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__SEQUENCE = eINSTANCE.getRepeatUntil_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__THROW = eINSTANCE.getRepeatUntil_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__VALIDATE = eINSTANCE.getRepeatUntil_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__WAIT = eINSTANCE.getRepeatUntil_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__WHILE = eINSTANCE.getRepeatUntil_While();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__CONDITION = eINSTANCE.getRepeatUntil_Condition();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReplyImpl <em>Reply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ReplyImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getReply()
		 * @generated
		 */
		EClass REPLY = eINSTANCE.getReply();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY__CORRELATIONS = eINSTANCE.getReply_Correlations();

		/**
		 * The meta object literal for the '<em><b>To Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY__TO_PARTS = eINSTANCE.getReply_ToParts();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__FAULT_NAME = eINSTANCE.getReply_FaultName();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__MESSAGE_EXCHANGE = eINSTANCE.getReply_MessageExchange();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__OPERATION = eINSTANCE.getReply_Operation();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__PARTNER_LINK = eINSTANCE.getReply_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__PORT_TYPE = eINSTANCE.getReply_PortType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__VARIABLE = eINSTANCE.getReply_Variable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RethrowImpl <em>Rethrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.RethrowImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRethrow()
		 * @generated
		 */
		EClass RETHROW = eINSTANCE.getRethrow();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ScopeImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Partner Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__PARTNER_LINKS = eINSTANCE.getScope_PartnerLinks();

		/**
		 * The meta object literal for the '<em><b>Message Exchanges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__MESSAGE_EXCHANGES = eINSTANCE.getScope_MessageExchanges();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__VARIABLES = eINSTANCE.getScope_Variables();

		/**
		 * The meta object literal for the '<em><b>Correlation Sets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CORRELATION_SETS = eINSTANCE.getScope_CorrelationSets();

		/**
		 * The meta object literal for the '<em><b>Fault Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__FAULT_HANDLERS = eINSTANCE.getScope_FaultHandlers();

		/**
		 * The meta object literal for the '<em><b>Compensation Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__COMPENSATION_HANDLER = eINSTANCE.getScope_CompensationHandler();

		/**
		 * The meta object literal for the '<em><b>Termination Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__TERMINATION_HANDLER = eINSTANCE.getScope_TerminationHandler();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__EVENT_HANDLERS = eINSTANCE.getScope_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__ASSIGN = eINSTANCE.getScope_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__COMPENSATE = eINSTANCE.getScope_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__COMPENSATE_SCOPE = eINSTANCE.getScope_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__EMPTY = eINSTANCE.getScope_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__EXIT = eINSTANCE.getScope_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__EXTENSION_ACTIVITY = eINSTANCE.getScope_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__FLOW = eINSTANCE.getScope_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__FOR_EACH = eINSTANCE.getScope_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__IF = eINSTANCE.getScope_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__INVOKE = eINSTANCE.getScope_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__PICK = eINSTANCE.getScope_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__RECEIVE = eINSTANCE.getScope_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__REPEAT_UNTIL = eINSTANCE.getScope_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__REPLY = eINSTANCE.getScope_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__RETHROW = eINSTANCE.getScope_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__SCOPE = eINSTANCE.getScope_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__SEQUENCE = eINSTANCE.getScope_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__THROW = eINSTANCE.getScope_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__VALIDATE = eINSTANCE.getScope_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__WAIT = eINSTANCE.getScope_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__WHILE = eINSTANCE.getScope_While();

		/**
		 * The meta object literal for the '<em><b>Exit On Standard Fault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__EXIT_ON_STANDARD_FAULT = eINSTANCE.getScope_ExitOnStandardFault();

		/**
		 * The meta object literal for the '<em><b>Isolated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__ISOLATED = eINSTANCE.getScope_Isolated();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SequenceImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__ACTIVITY = eINSTANCE.getSequence_Activity();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ASSIGN = eINSTANCE.getSequence_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__COMPENSATE = eINSTANCE.getSequence_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__COMPENSATE_SCOPE = eINSTANCE.getSequence_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__EMPTY = eINSTANCE.getSequence_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__EXIT = eINSTANCE.getSequence_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__EXTENSION_ACTIVITY = eINSTANCE.getSequence_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__FLOW = eINSTANCE.getSequence_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__FOR_EACH = eINSTANCE.getSequence_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__IF = eINSTANCE.getSequence_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__INVOKE = eINSTANCE.getSequence_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__PICK = eINSTANCE.getSequence_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__RECEIVE = eINSTANCE.getSequence_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__REPEAT_UNTIL = eINSTANCE.getSequence_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__REPLY = eINSTANCE.getSequence_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__RETHROW = eINSTANCE.getSequence_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SCOPE = eINSTANCE.getSequence_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SEQUENCE = eINSTANCE.getSequence_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__THROW = eINSTANCE.getSequence_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__VALIDATE = eINSTANCE.getSequence_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__WAIT = eINSTANCE.getSequence_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__WHILE = eINSTANCE.getSequence_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourceImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Transition Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__TRANSITION_CONDITION = eINSTANCE.getSource_TransitionCondition();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__LINK_NAME = eINSTANCE.getSource_LinkName();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourcesImpl <em>Sources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourcesImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getSources()
		 * @generated
		 */
		EClass SOURCES = eINSTANCE.getSources();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCES__SOURCE = eINSTANCE.getSources_Source();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__LINK_NAME = eINSTANCE.getTarget_LinkName();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetsImpl <em>Targets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.TargetsImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getTargets()
		 * @generated
		 */
		EClass TARGETS = eINSTANCE.getTargets();

		/**
		 * The meta object literal for the '<em><b>Join Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETS__JOIN_CONDITION = eINSTANCE.getTargets_JoinCondition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETS__TARGET = eINSTANCE.getTargets_Target();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ThrowImpl <em>Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ThrowImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getThrow()
		 * @generated
		 */
		EClass THROW = eINSTANCE.getThrow();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROW__FAULT_NAME = eINSTANCE.getThrow_FaultName();

		/**
		 * The meta object literal for the '<em><b>Fault Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROW__FAULT_VARIABLE = eINSTANCE.getThrow_FaultVariable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToImpl <em>To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getTo()
		 * @generated
		 */
		EClass TO = eINSTANCE.getTo();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__MIXED = eINSTANCE.getTo_Mixed();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO__DOCUMENTATION = eINSTANCE.getTo_Documentation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__ANY = eINSTANCE.getTo_Any();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO__QUERY = eINSTANCE.getTo_Query();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__EXPRESSION_LANGUAGE = eINSTANCE.getTo_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__PART = eINSTANCE.getTo_Part();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__PARTNER_LINK = eINSTANCE.getTo_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__PROPERTY = eINSTANCE.getTo_Property();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__VARIABLE = eINSTANCE.getTo_Variable();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__ANY_ATTRIBUTE = eINSTANCE.getTo_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartImpl <em>To Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getToPart()
		 * @generated
		 */
		EClass TO_PART = eINSTANCE.getToPart();

		/**
		 * The meta object literal for the '<em><b>From Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_PART__FROM_VARIABLE = eINSTANCE.getToPart_FromVariable();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_PART__PART = eINSTANCE.getToPart_Part();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartsImpl <em>To Parts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ToPartsImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getToParts()
		 * @generated
		 */
		EClass TO_PARTS = eINSTANCE.getToParts();

		/**
		 * The meta object literal for the '<em><b>To Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_PARTS__TO_PART = eINSTANCE.getToParts_ToPart();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ValidateImpl <em>Validate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ValidateImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getValidate()
		 * @generated
		 */
		EClass VALIDATE = eINSTANCE.getValidate();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE__VARIABLES = eINSTANCE.getValidate_Variables();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariableImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__FROM = eINSTANCE.getVariable_From();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ELEMENT = eINSTANCE.getVariable_Element();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MESSAGE_TYPE = eINSTANCE.getVariable_MessageType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariablesImpl <em>Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.VariablesImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getVariables()
		 * @generated
		 */
		EClass VARIABLES = eINSTANCE.getVariables();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLES__VARIABLE = eINSTANCE.getVariables_Variable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WaitImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT__FOR = eINSTANCE.getWait_For();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT__UNTIL = eINSTANCE.getWait_Until();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.WhileImpl
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__ASSIGN = eINSTANCE.getWhile_Assign();

		/**
		 * The meta object literal for the '<em><b>Compensate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__COMPENSATE = eINSTANCE.getWhile_Compensate();

		/**
		 * The meta object literal for the '<em><b>Compensate Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__COMPENSATE_SCOPE = eINSTANCE.getWhile_CompensateScope();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__EMPTY = eINSTANCE.getWhile_Empty();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__EXIT = eINSTANCE.getWhile_Exit();

		/**
		 * The meta object literal for the '<em><b>Extension Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__EXTENSION_ACTIVITY = eINSTANCE.getWhile_ExtensionActivity();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__FLOW = eINSTANCE.getWhile_Flow();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__FOR_EACH = eINSTANCE.getWhile_ForEach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__IF = eINSTANCE.getWhile_If();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__INVOKE = eINSTANCE.getWhile_Invoke();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__PICK = eINSTANCE.getWhile_Pick();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__RECEIVE = eINSTANCE.getWhile_Receive();

		/**
		 * The meta object literal for the '<em><b>Repeat Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__REPEAT_UNTIL = eINSTANCE.getWhile_RepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__REPLY = eINSTANCE.getWhile_Reply();

		/**
		 * The meta object literal for the '<em><b>Rethrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__RETHROW = eINSTANCE.getWhile_Rethrow();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__SCOPE = eINSTANCE.getWhile_Scope();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__SEQUENCE = eINSTANCE.getWhile_Sequence();

		/**
		 * The meta object literal for the '<em><b>Throw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__THROW = eINSTANCE.getWhile_Throw();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__VALIDATE = eINSTANCE.getWhile_Validate();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__WAIT = eINSTANCE.getWhile_Wait();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__WHILE = eINSTANCE.getWhile_While();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean <em>Boolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBoolean()
		 * @generated
		 */
		EEnum BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate <em>Initiate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getInitiate()
		 * @generated
		 */
		EEnum INITIATE = eINSTANCE.getInitiate();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern <em>Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPattern()
		 * @generated
		 */
		EEnum PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Roles <em>Roles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRoles()
		 * @generated
		 */
		EEnum ROLES = eINSTANCE.getRoles();

		/**
		 * The meta object literal for the '<em>BPEL Variable Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBPELVariableName()
		 * @generated
		 */
		EDataType BPEL_VARIABLE_NAME = eINSTANCE.getBPELVariableName();

		/**
		 * The meta object literal for the '<em>BPEL Variable Names</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBPELVariableNames()
		 * @generated
		 */
		EDataType BPEL_VARIABLE_NAMES = eINSTANCE.getBPELVariableNames();

		/**
		 * The meta object literal for the '<em>BPEL Variable Names Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBPELVariableNamesBase()
		 * @generated
		 */
		EDataType BPEL_VARIABLE_NAMES_BASE = eINSTANCE.getBPELVariableNamesBase();

		/**
		 * The meta object literal for the '<em>QNames</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getQNames()
		 * @generated
		 */
		EDataType QNAMES = eINSTANCE.getQNames();

		/**
		 * The meta object literal for the '<em>QNames Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getQNamesBase()
		 * @generated
		 */
		EDataType QNAMES_BASE = eINSTANCE.getQNamesBase();

		/**
		 * The meta object literal for the '<em>Boolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getBooleanObject()
		 * @generated
		 */
		EDataType BOOLEAN_OBJECT = eINSTANCE.getBooleanObject();

		/**
		 * The meta object literal for the '<em>Initiate Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Initiate
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getInitiateObject()
		 * @generated
		 */
		EDataType INITIATE_OBJECT = eINSTANCE.getInitiateObject();

		/**
		 * The meta object literal for the '<em>Pattern Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getPatternObject()
		 * @generated
		 */
		EDataType PATTERN_OBJECT = eINSTANCE.getPatternObject();

		/**
		 * The meta object literal for the '<em>Roles Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
		 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ExecutablePackageImpl#getRolesObject()
		 * @generated
		 */
		EDataType ROLES_OBJECT = eINSTANCE.getRolesObject();

	}

} //ExecutablePackage
