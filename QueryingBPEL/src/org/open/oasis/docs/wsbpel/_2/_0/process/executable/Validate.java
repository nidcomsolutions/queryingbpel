/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Validate#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getValidate()
 * @model extendedMetaData="name='tValidate' kind='elementOnly'"
 * @generated
 */
public interface Validate extends Activity {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute.
	 * @see #setVariables(List)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getValidate_Variables()
	 * @model dataType="org.open.oasis.docs.wsbpel._2._0.process.executable.BPELVariableNames" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='variables'"
	 * @generated
	 */
	List<String> getVariables();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.Validate#getVariables <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' attribute.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(List<String> value);

} // Validate
