/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.PrimitiveType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends BasicDataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.BasicTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ORDB4ORA.BasicTypes
	 * @see #setName(BasicTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getPrimitiveType_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BasicTypes getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.PrimitiveType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see ORDB4ORA.BasicTypes
	 * @see #getName()
	 * @generated
	 */
	void setName(BasicTypes value);

} // PrimitiveType
