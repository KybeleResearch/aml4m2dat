/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.XMLType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getXMLType()
 * @model
 * @generated
 */
public interface XMLType extends SuppliedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.SuppliedXMLTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.SuppliedXMLTypes
	 * @see #setDescriptor(SuppliedXMLTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getXMLType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	SuppliedXMLTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.XMLType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.SuppliedXMLTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(SuppliedXMLTypes value);

} // XMLType
