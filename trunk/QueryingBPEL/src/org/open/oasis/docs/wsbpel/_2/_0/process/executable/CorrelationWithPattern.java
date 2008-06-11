/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation With Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelationWithPattern()
 * @model extendedMetaData="name='tCorrelationWithPattern' kind='elementOnly'"
 * @generated
 */
public interface CorrelationWithPattern extends Correlation {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * The default value is <code>"request"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
	 * @see #isSetPattern()
	 * @see #unsetPattern()
	 * @see #setPattern(Pattern)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getCorrelationWithPattern_Pattern()
	 * @model default="request" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.Pattern
	 * @see #isSetPattern()
	 * @see #unsetPattern()
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPattern()
	 * @see #getPattern()
	 * @see #setPattern(Pattern)
	 * @generated
	 */
	void unsetPattern();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.CorrelationWithPattern#getPattern <em>Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pattern</em>' attribute is set.
	 * @see #unsetPattern()
	 * @see #getPattern()
	 * @see #setPattern(Pattern)
	 * @generated
	 */
	boolean isSetPattern();

} // CorrelationWithPattern
