/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROWID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.ROWIDType#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.ROWIDType#getSize_Min <em>Size Min</em>}</li>
 *   <li>{@link ORDB4ORA.ROWIDType#getSize_Max <em>Size Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getROWIDType()
 * @model
 * @generated
 */
public interface ROWIDType extends BuiltInType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.BuiltInROWIDType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInROWIDType
	 * @see #setDescriptor(BuiltInROWIDType)
	 * @see ORDB4ORA.ORDB4ORAPackage#getROWIDType_Descriptor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BuiltInROWIDType getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.ROWIDType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInROWIDType
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BuiltInROWIDType value);

	/**
	 * Returns the value of the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Min</em>' attribute.
	 * @see #setSize_Min(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getROWIDType_Size_Min()
	 * @model
	 * @generated
	 */
	int getSize_Min();

	/**
	 * Sets the value of the '{@link ORDB4ORA.ROWIDType#getSize_Min <em>Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Min</em>' attribute.
	 * @see #getSize_Min()
	 * @generated
	 */
	void setSize_Min(int value);

	/**
	 * Returns the value of the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Max</em>' attribute.
	 * @see #setSize_Max(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getROWIDType_Size_Max()
	 * @model
	 * @generated
	 */
	int getSize_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.ROWIDType#getSize_Max <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Max</em>' attribute.
	 * @see #getSize_Max()
	 * @generated
	 */
	void setSize_Max(int value);

} // ROWIDType
