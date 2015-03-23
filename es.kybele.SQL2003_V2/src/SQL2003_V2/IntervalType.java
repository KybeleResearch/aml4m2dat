/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V2.IntervalType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getIntervalType()
 * @model
 * @generated
 */
public interface IntervalType extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V2.IntervalTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_V2.IntervalTypes
	 * @see #setDescriptor(IntervalTypes)
	 * @see SQL2003_V2.SQL2003_V2Package#getIntervalType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	IntervalTypes getDescriptor();

	/**
	 * Sets the value of the '{@link SQL2003_V2.IntervalType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_V2.IntervalTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(IntervalTypes value);

} // IntervalType
