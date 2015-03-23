/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

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
 *   <li>{@link ORDB4ORA.Method#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.Method#getOverride <em>Override</em>}</li>
 *   <li>{@link ORDB4ORA.Method#getStructured <em>Structured</em>}</li>
 *   <li>{@link ORDB4ORA.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ORDB4ORA.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ORDB4ORA.Method#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getMethod()
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
	 * @see ORDB4ORA.ORDB4ORAPackage#getMethod_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getMethod_Override()
	 * @model ordered="false"
	 * @generated
	 */
	Method getOverride();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Method#getOverride <em>Override</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' reference.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(Method value);

	/**
	 * Returns the value of the '<em><b>Structured</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.StructuredType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured</em>' container reference.
	 * @see #setStructured(StructuredType)
	 * @see ORDB4ORA.ORDB4ORAPackage#getMethod_Structured()
	 * @see ORDB4ORA.StructuredType#getMethod
	 * @model opposite="method" transient="false"
	 * @generated
	 */
	StructuredType getStructured();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Method#getStructured <em>Structured</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured</em>' container reference.
	 * @see #getStructured()
	 * @generated
	 */
	void setStructured(StructuredType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.MethodParameter}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.MethodParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getMethod_Parameters()
	 * @see ORDB4ORA.MethodParameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<MethodParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Datatype)
	 * @see ORDB4ORA.ORDB4ORAPackage#getMethod_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Datatype getReturnType();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Datatype value);

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getMethod_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Method#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Method
