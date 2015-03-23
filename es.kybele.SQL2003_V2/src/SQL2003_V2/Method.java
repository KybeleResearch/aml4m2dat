/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V2.Method#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_V2.Method#getBody <em>Body</em>}</li>
 *   <li>{@link SQL2003_V2.Method#getOverride <em>Override</em>}</li>
 *   <li>{@link SQL2003_V2.Method#getStructured <em>Structured</em>}</li>
 *   <li>{@link SQL2003_V2.Method#getReturn_type <em>Return type</em>}</li>
 *   <li>{@link SQL2003_V2.Method#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SQL2003_V2.SQL2003_V2Package#getMethod_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_V2.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see SQL2003_V2.SQL2003_V2Package#getMethod_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link SQL2003_V2.Method#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' reference.
	 * @see #setOverride(Method)
	 * @see SQL2003_V2.SQL2003_V2Package#getMethod_Override()
	 * @model ordered="false"
	 * @generated
	 */
	Method getOverride();

	/**
	 * Sets the value of the '{@link SQL2003_V2.Method#getOverride <em>Override</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' reference.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(Method value);

	/**
	 * Returns the value of the '<em><b>Structured</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.StructuredType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured</em>' container reference.
	 * @see #setStructured(StructuredType)
	 * @see SQL2003_V2.SQL2003_V2Package#getMethod_Structured()
	 * @see SQL2003_V2.StructuredType#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	StructuredType getStructured();

	/**
	 * Sets the value of the '{@link SQL2003_V2.Method#getStructured <em>Structured</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured</em>' container reference.
	 * @see #getStructured()
	 * @generated
	 */
	void setStructured(StructuredType value);

	/**
	 * Returns the value of the '<em><b>Return type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return type</em>' reference.
	 * @see #setReturn_type(DataType)
	 * @see SQL2003_V2.SQL2003_V2Package#getMethod_Return_type()
	 * @model required="true"
	 * @generated
	 */
	DataType getReturn_type();

	/**
	 * Sets the value of the '{@link SQL2003_V2.Method#getReturn_type <em>Return type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return type</em>' reference.
	 * @see #getReturn_type()
	 * @generated
	 */
	void setReturn_type(DataType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003_V2.MethodParameter}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.MethodParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see SQL2003_V2.SQL2003_V2Package#getMethod_Parameters()
	 * @see SQL2003_V2.MethodParameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<MethodParameter> getParameters();

} // Method
