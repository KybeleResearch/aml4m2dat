/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.StructuredType#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.StructuredType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link ORDB4ORA.StructuredType#getMethod <em>Method</em>}</li>
 *   <li>{@link ORDB4ORA.StructuredType#getTyped <em>Typed</em>}</li>
 *   <li>{@link ORDB4ORA.StructuredType#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link ORDB4ORA.StructuredType#isIs_instantiable <em>Is instantiable</em>}</li>
 *   <li>{@link ORDB4ORA.StructuredType#isIs_final <em>Is final</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType()
 * @model
 * @generated
 */
public interface StructuredType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType_Name()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.StructuredType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Attribute}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Attribute#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType_Attribute()
	 * @see ORDB4ORA.Attribute#getStructured
	 * @model opposite="structured" containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Method}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Method#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType_Method()
	 * @see ORDB4ORA.Method#getStructured
	 * @model opposite="structured" containment="true" ordered="false"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Typed</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.TypedTable}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.TypedTable#getStructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType_Typed()
	 * @see ORDB4ORA.TypedTable#getStructuredType
	 * @model opposite="structuredType" containment="true" ordered="false"
	 * @generated
	 */
	EList<TypedTable> getTyped();

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see #setSupertype(StructuredType)
	 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType_Supertype()
	 * @model ordered="false"
	 * @generated
	 */
	StructuredType getSupertype();

	/**
	 * Sets the value of the '{@link ORDB4ORA.StructuredType#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(StructuredType value);

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType_Is_instantiable()
	 * @model
	 * @generated
	 */
	boolean isIs_instantiable();

	/**
	 * Sets the value of the '{@link ORDB4ORA.StructuredType#isIs_instantiable <em>Is instantiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is instantiable</em>' attribute.
	 * @see #isIs_instantiable()
	 * @generated
	 */
	void setIs_instantiable(boolean value);

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getStructuredType_Is_final()
	 * @model
	 * @generated
	 */
	boolean isIs_final();

	/**
	 * Sets the value of the '{@link ORDB4ORA.StructuredType#isIs_final <em>Is final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is final</em>' attribute.
	 * @see #isIs_final()
	 * @generated
	 */
	void setIs_final(boolean value);
	
	/**
	 * @generated NOT
	 */
	String friendlyName();

} // StructuredType
