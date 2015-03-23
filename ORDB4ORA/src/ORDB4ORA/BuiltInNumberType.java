/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.BuiltInNumberType#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInNumberType#getPrecision_Mn <em>Precision Mn</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInNumberType#getPrecision_Max <em>Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInNumberType#getScale_Min <em>Scale Min</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInNumberType#getScale_Max <em>Scale Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInNumberType()
 * @model
 * @generated
 */
public interface BuiltInNumberType extends BuiltInType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.BuiltNumberTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltNumberTypes
	 * @see #setDescriptor(BuiltNumberTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInNumberType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	BuiltNumberTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInNumberType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltNumberTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BuiltNumberTypes value);

	/**
	 * Returns the value of the '<em><b>Precision Mn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Mn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Mn</em>' attribute.
	 * @see #setPrecision_Mn(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInNumberType_Precision_Mn()
	 * @model
	 * @generated
	 */
	int getPrecision_Mn();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInNumberType#getPrecision_Mn <em>Precision Mn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Mn</em>' attribute.
	 * @see #getPrecision_Mn()
	 * @generated
	 */
	void setPrecision_Mn(int value);

	/**
	 * Returns the value of the '<em><b>Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Max</em>' attribute.
	 * @see #setPrecision_Max(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInNumberType_Precision_Max()
	 * @model
	 * @generated
	 */
	int getPrecision_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInNumberType#getPrecision_Max <em>Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Max</em>' attribute.
	 * @see #getPrecision_Max()
	 * @generated
	 */
	void setPrecision_Max(int value);

	/**
	 * Returns the value of the '<em><b>Scale Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Min</em>' attribute.
	 * @see #setScale_Min(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInNumberType_Scale_Min()
	 * @model
	 * @generated
	 */
	int getScale_Min();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInNumberType#getScale_Min <em>Scale Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Min</em>' attribute.
	 * @see #getScale_Min()
	 * @generated
	 */
	void setScale_Min(int value);

	/**
	 * Returns the value of the '<em><b>Scale Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Max</em>' attribute.
	 * @see #setScale_Max(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInNumberType_Scale_Max()
	 * @model
	 * @generated
	 */
	int getScale_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInNumberType#getScale_Max <em>Scale Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Max</em>' attribute.
	 * @see #getScale_Max()
	 * @generated
	 */
	void setScale_Max(int value);

} // BuiltInNumberType
