/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003.ReferenceType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003.SQL2003Package#getReferenceType()
 * @model
 * @generated
 */
public interface ReferenceType extends ConstructedType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(StructuredType)
	 * @see SQL2003.SQL2003Package#getReferenceType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredType getType();

	/**
	 * Sets the value of the '{@link SQL2003.ReferenceType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(StructuredType value);

} // ReferenceType
