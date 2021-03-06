/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V3.ConstructedType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getConstructedType()
 * @model abstract="true"
 * @generated
 */
public interface ConstructedType extends DataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SQL2003_V3.SQL2003_V3Package#getConstructedType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_V3.ConstructedType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConstructedType
