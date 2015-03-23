/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long And Raw Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.LongAndRawType#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.LongAndRawType#getSize_Min <em>Size Min</em>}</li>
 *   <li>{@link ORDB4ORA.LongAndRawType#getSize_Max <em>Size Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getLongAndRawType()
 * @model
 * @generated
 */
public interface LongAndRawType extends BuiltInType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.BuiltInLongAndRawTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInLongAndRawTypes
	 * @see #setDescriptor(BuiltInLongAndRawTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getLongAndRawType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	BuiltInLongAndRawTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.LongAndRawType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInLongAndRawTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BuiltInLongAndRawTypes value);

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getLongAndRawType_Size_Min()
	 * @model
	 * @generated
	 */
	int getSize_Min();

	/**
	 * Sets the value of the '{@link ORDB4ORA.LongAndRawType#getSize_Min <em>Size Min</em>}' attribute.
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
	 * @see ORDB4ORA.ORDB4ORAPackage#getLongAndRawType_Size_Max()
	 * @model
	 * @generated
	 */
	int getSize_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.LongAndRawType#getSize_Max <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Max</em>' attribute.
	 * @see #getSize_Max()
	 * @generated
	 */
	void setSize_Max(int value);

} // LongAndRawType
