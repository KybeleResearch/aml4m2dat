/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V2.NumericType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getNumericType()
 * @model
 * @generated
 */
public interface NumericType extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V2.NumericTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_V2.NumericTypes
	 * @see #setDescriptor(NumericTypes)
	 * @see SQL2003_V2.SQL2003_V2Package#getNumericType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	NumericTypes getDescriptor();

	/**
	 * Sets the value of the '{@link SQL2003_V2.NumericType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_V2.NumericTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(NumericTypes value);

} // NumericType
