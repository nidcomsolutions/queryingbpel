/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getQuery <em>Query</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPart <em>Part</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom()
 * @model extendedMetaData="name='tFrom' kind='mixed'"
 * @generated
 */
public interface From extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Documentation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(Literal)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Literal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literal' namespace='##targetNamespace'"
	 * @generated
	 */
	Literal getLiteral();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(Literal value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Query()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Endpoint Reference</b></em>' attribute.
	 * The default value is <code>"myRole"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Roles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Reference</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
	 * @see #isSetEndpointReference()
	 * @see #unsetEndpointReference()
	 * @see #setEndpointReference(Roles)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_EndpointReference()
	 * @model default="myRole" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endpointReference'"
	 * @generated
	 */
	Roles getEndpointReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getEndpointReference <em>Endpoint Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Reference</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Roles
	 * @see #isSetEndpointReference()
	 * @see #unsetEndpointReference()
	 * @see #getEndpointReference()
	 * @generated
	 */
	void setEndpointReference(Roles value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getEndpointReference <em>Endpoint Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointReference()
	 * @see #getEndpointReference()
	 * @see #setEndpointReference(Roles)
	 * @generated
	 */
	void unsetEndpointReference();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getEndpointReference <em>Endpoint Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endpoint Reference</em>' attribute is set.
	 * @see #unsetEndpointReference()
	 * @see #getEndpointReference()
	 * @see #setEndpointReference(Roles)
	 * @generated
	 */
	boolean isSetEndpointReference();

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #setExpressionLanguage(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_ExpressionLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='expressionLanguage'"
	 * @generated
	 */
	String getExpressionLanguage();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see #setPart(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Part()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='part'"
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

	/**
	 * Returns the value of the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link</em>' attribute.
	 * @see #setPartnerLink(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_PartnerLink()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='partnerLink'"
	 * @generated
	 */
	String getPartnerLink();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getPartnerLink <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link</em>' attribute.
	 * @see #getPartnerLink()
	 * @generated
	 */
	void setPartnerLink(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(QName)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Property()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='property'"
	 * @generated
	 */
	QName getProperty();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(QName value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_Variable()
	 * @model dataType="org.open.oasis.docs.wsbpel._2._0.process.executable.BPELVariableName"
	 *        extendedMetaData="kind='attribute' name='variable'"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.From#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getFrom_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':11' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // From
