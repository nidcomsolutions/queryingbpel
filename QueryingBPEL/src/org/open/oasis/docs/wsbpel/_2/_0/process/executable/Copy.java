/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getFrom <em>From</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getTo <em>To</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCopy()
 * @model extendedMetaData="name='tCopy' kind='elementOnly'"
 * @generated
 */
public interface Copy extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(From)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCopy_From()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	From getFrom();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(From value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(To)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCopy_To()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	To getTo();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(To value);

	/**
	 * Returns the value of the '<em><b>Ignore Missing From Data</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Missing From Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Missing From Data</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetIgnoreMissingFromData()
	 * @see #unsetIgnoreMissingFromData()
	 * @see #setIgnoreMissingFromData(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCopy_IgnoreMissingFromData()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ignoreMissingFromData'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getIgnoreMissingFromData();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Missing From Data</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetIgnoreMissingFromData()
	 * @see #unsetIgnoreMissingFromData()
	 * @see #getIgnoreMissingFromData()
	 * @generated
	 */
	void setIgnoreMissingFromData(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreMissingFromData()
	 * @see #getIgnoreMissingFromData()
	 * @see #setIgnoreMissingFromData(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetIgnoreMissingFromData();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Missing From Data</em>' attribute is set.
	 * @see #unsetIgnoreMissingFromData()
	 * @see #getIgnoreMissingFromData()
	 * @see #setIgnoreMissingFromData(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetIgnoreMissingFromData();

	/**
	 * Returns the value of the '<em><b>Keep Src Element Name</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Src Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Src Element Name</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetKeepSrcElementName()
	 * @see #unsetKeepSrcElementName()
	 * @see #setKeepSrcElementName(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCopy_KeepSrcElementName()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='keepSrcElementName'"
	 * @generated
	 */
	org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean getKeepSrcElementName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Src Element Name</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean
	 * @see #isSetKeepSrcElementName()
	 * @see #unsetKeepSrcElementName()
	 * @see #getKeepSrcElementName()
	 * @generated
	 */
	void setKeepSrcElementName(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeepSrcElementName()
	 * @see #getKeepSrcElementName()
	 * @see #setKeepSrcElementName(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	void unsetKeepSrcElementName();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keep Src Element Name</em>' attribute is set.
	 * @see #unsetKeepSrcElementName()
	 * @see #getKeepSrcElementName()
	 * @see #setKeepSrcElementName(org.open.oasis.docs.wsbpel._2._0.process.executable.Boolean)
	 * @generated
	 */
	boolean isSetKeepSrcElementName();

} // Copy
