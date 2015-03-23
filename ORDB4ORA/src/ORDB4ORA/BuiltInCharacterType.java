/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Character Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.BuiltInCharacterType#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInCharacterType#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInCharacterType#getSize_Min <em>Size Min</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInCharacterType#getSize_Max <em>Size Max</em>}</li>
 *   <li>{@link ORDB4ORA.BuiltInCharacterType#getSize_Def <em>Size Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInCharacterType()
 * @model
 * @generated
 */
public interface BuiltInCharacterType extends BuiltInType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.BuiltInCharacterTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInCharacterTypes
	 * @see #setDescriptor(BuiltInCharacterTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInCharacterType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	BuiltInCharacterTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInCharacterType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInCharacterTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BuiltInCharacterTypes value);

	/**
	 * Returns the value of the '<em><b>Semantic</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link ORDB4ORA.BuiltInCharacterSemantics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic</em>' attribute.
	 * @see ORDB4ORA.BuiltInCharacterSemantics
	 * @see #setSemantic(BuiltInCharacterSemantics)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInCharacterType_Semantic()
	 * @model default=""
	 * @generated
	 */
	BuiltInCharacterSemantics getSemantic();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInCharacterType#getSemantic <em>Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic</em>' attribute.
	 * @see ORDB4ORA.BuiltInCharacterSemantics
	 * @see #getSemantic()
	 * @generated
	 */
	void setSemantic(BuiltInCharacterSemantics value);

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInCharacterType_Size_Min()
	 * @model
	 * @generated
	 */
	int getSize_Min();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInCharacterType#getSize_Min <em>Size Min</em>}' attribute.
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
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInCharacterType_Size_Max()
	 * @model
	 * @generated
	 */
	int getSize_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInCharacterType#getSize_Max <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Max</em>' attribute.
	 * @see #getSize_Max()
	 * @generated
	 */
	void setSize_Max(int value);

	/**
	 * Returns the value of the '<em><b>Size Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Def</em>' attribute.
	 * @see #setSize_Def(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInCharacterType_Size_Def()
	 * @model
	 * @generated
	 */
	int getSize_Def();

	/**
	 * Sets the value of the '{@link ORDB4ORA.BuiltInCharacterType#getSize_Def <em>Size Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Def</em>' attribute.
	 * @see #getSize_Def()
	 * @generated
	 */
	void setSize_Def(int value);

} // BuiltInCharacterType
