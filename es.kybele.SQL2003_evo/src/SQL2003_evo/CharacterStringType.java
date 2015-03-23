/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.CharacterStringType#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link SQL2003_evo.CharacterStringType#getLength_def <em>Length def</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getCharacterStringType()
 * @model
 * @generated
 */
public interface CharacterStringType extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_evo.CharacterStringTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.CharacterStringTypes
	 * @see #setDescriptor(CharacterStringTypes)
	 * @see SQL2003_evo.SQL2003_evoPackage#getCharacterStringType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	CharacterStringTypes getDescriptor();

	/**
	 * Sets the value of the '{@link SQL2003_evo.CharacterStringType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.CharacterStringTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(CharacterStringTypes value);

	/**
	 * Returns the value of the '<em><b>Length def</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length def</em>' attribute.
	 * @see #setLength_def(Integer)
	 * @see SQL2003_evo.SQL2003_evoPackage#getCharacterStringType_Length_def()
	 * @model default="1" required="true"
	 * @generated
	 */
	Integer getLength_def();

	/**
	 * Sets the value of the '{@link SQL2003_evo.CharacterStringType#getLength_def <em>Length def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length def</em>' attribute.
	 * @see #getLength_def()
	 * @generated
	 */
	void setLength_def(Integer value);

} // CharacterStringType
