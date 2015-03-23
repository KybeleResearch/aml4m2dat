/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LOB Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.LOBType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getLOBType()
 * @model
 * @generated
 */
public interface LOBType extends BuiltInType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.BuiltInLOBType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInLOBType
	 * @see #setDescriptor(BuiltInLOBType)
	 * @see ORDB4ORA.ORDB4ORAPackage#getLOBType_Descriptor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BuiltInLOBType getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.LOBType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInLOBType
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BuiltInLOBType value);

} // LOBType
