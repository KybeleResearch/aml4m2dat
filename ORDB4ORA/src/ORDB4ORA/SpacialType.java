/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacial Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.SpacialType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getSpacialType()
 * @model
 * @generated
 */
public interface SpacialType extends SuppliedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.SuppliedSpacialTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.SuppliedSpacialTypes
	 * @see #setDescriptor(SuppliedSpacialTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getSpacialType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	SuppliedSpacialTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.SpacialType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.SuppliedSpacialTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(SuppliedSpacialTypes value);

} // SpacialType
