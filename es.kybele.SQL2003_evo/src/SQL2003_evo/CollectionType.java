/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.CollectionType#getSuper_type <em>Super type</em>}</li>
 *   <li>{@link SQL2003_evo.CollectionType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getCollectionType()
 * @model abstract="true"
 * @generated
 */
public interface CollectionType extends ConstructedType {
	/**
	 * Returns the value of the '<em><b>Super type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super type</em>' reference.
	 * @see #setSuper_type(CollectionType)
	 * @see SQL2003_evo.SQL2003_evoPackage#getCollectionType_Super_type()
	 * @model
	 * @generated
	 */
	CollectionType getSuper_type();

	/**
	 * Sets the value of the '{@link SQL2003_evo.CollectionType#getSuper_type <em>Super type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super type</em>' reference.
	 * @see #getSuper_type()
	 * @generated
	 */
	void setSuper_type(CollectionType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see SQL2003_evo.SQL2003_evoPackage#getCollectionType_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link SQL2003_evo.CollectionType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // CollectionType
