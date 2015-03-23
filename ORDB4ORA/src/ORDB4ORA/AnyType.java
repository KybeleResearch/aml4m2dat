/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.AnyType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getAnyType()
 * @model
 * @generated
 */
public interface AnyType extends SuppliedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.SuppliedAnyTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.SuppliedAnyTypes
	 * @see #setDescriptor(SuppliedAnyTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getAnyType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	SuppliedAnyTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.AnyType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.SuppliedAnyTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(SuppliedAnyTypes value);

} // AnyType
