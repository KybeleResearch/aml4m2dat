/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003.MethodParameter#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003.SQL2003Package#getMethodParameter()
 * @model
 * @generated
 */
public interface MethodParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see SQL2003.SQL2003Package#getMethodParameter_Method()
	 * @see SQL2003.Method#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link SQL2003.MethodParameter#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // MethodParameter
