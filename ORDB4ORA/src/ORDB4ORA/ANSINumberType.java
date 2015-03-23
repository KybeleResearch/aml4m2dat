/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANSI Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.ANSINumberType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getANSINumberType()
 * @model
 * @generated
 */
public interface ANSINumberType extends ANSIType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.ANSINumberTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.ANSINumberTypes
	 * @see #setDescriptor(ANSINumberTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getANSINumberType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	ANSINumberTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.ANSINumberType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.ANSINumberTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(ANSINumberTypes value);

} // ANSINumberType
