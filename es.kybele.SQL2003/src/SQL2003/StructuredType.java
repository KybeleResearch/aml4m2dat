/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003.StructuredType#isIs_final <em>Is final</em>}</li>
 *   <li>{@link SQL2003.StructuredType#isIs_instantiable <em>Is instantiable</em>}</li>
 *   <li>{@link SQL2003.StructuredType#getSuper_type <em>Super type</em>}</li>
 *   <li>{@link SQL2003.StructuredType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link SQL2003.StructuredType#getMethods <em>Methods</em>}</li>
 *   <li>{@link SQL2003.StructuredType#getTyped <em>Typed</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003.SQL2003Package#getStructuredType()
 * @model
 * @generated
 */
public interface StructuredType extends UserDefinedType {
	/**
	 * Returns the value of the '<em><b>Is final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is final</em>' attribute.
	 * @see #setIs_final(boolean)
	 * @see SQL2003.SQL2003Package#getStructuredType_Is_final()
	 * @model
	 * @generated
	 */
	boolean isIs_final();

	/**
	 * Sets the value of the '{@link SQL2003.StructuredType#isIs_final <em>Is final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is final</em>' attribute.
	 * @see #isIs_final()
	 * @generated
	 */
	void setIs_final(boolean value);

	/**
	 * Returns the value of the '<em><b>Is instantiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is instantiable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is instantiable</em>' attribute.
	 * @see #setIs_instantiable(boolean)
	 * @see SQL2003.SQL2003Package#getStructuredType_Is_instantiable()
	 * @model
	 * @generated
	 */
	boolean isIs_instantiable();

	/**
	 * Sets the value of the '{@link SQL2003.StructuredType#isIs_instantiable <em>Is instantiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is instantiable</em>' attribute.
	 * @see #isIs_instantiable()
	 * @generated
	 */
	void setIs_instantiable(boolean value);

	/**
	 * Returns the value of the '<em><b>Super type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super type</em>' reference.
	 * @see #setSuper_type(StructuredType)
	 * @see SQL2003.SQL2003Package#getStructuredType_Super_type()
	 * @model ordered="false"
	 * @generated
	 */
	StructuredType getSuper_type();

	/**
	 * Sets the value of the '{@link SQL2003.StructuredType#getSuper_type <em>Super type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super type</em>' reference.
	 * @see #getSuper_type()
	 * @generated
	 */
	void setSuper_type(StructuredType value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003.Attribute}.
	 * It is bidirectional and its opposite is '{@link SQL2003.Attribute#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see SQL2003.SQL2003Package#getStructuredType_Attributes()
	 * @see SQL2003.Attribute#getStructured
	 * @model opposite="structured" containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003.Method}.
	 * It is bidirectional and its opposite is '{@link SQL2003.Method#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see SQL2003.SQL2003Package#getStructuredType_Methods()
	 * @see SQL2003.Method#getStructured
	 * @model opposite="structured" containment="true" ordered="false"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Typed</b></em>' reference list.
	 * The list contents are of type {@link SQL2003.TypedTable}.
	 * It is bidirectional and its opposite is '{@link SQL2003.TypedTable#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed</em>' reference list.
	 * @see SQL2003.SQL2003Package#getStructuredType_Typed()
	 * @see SQL2003.TypedTable#getStructured
	 * @model opposite="structured" ordered="false"
	 * @generated
	 */
	EList<TypedTable> getTyped();

} // StructuredType
