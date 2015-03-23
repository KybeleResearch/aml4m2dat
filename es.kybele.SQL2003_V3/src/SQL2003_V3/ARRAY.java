/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARRAY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V3.ARRAY#getNum_elements <em>Num elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getARRAY()
 * @model
 * @generated
 */
public interface ARRAY extends CollectionType {
	/**
	 * Returns the value of the '<em><b>Num elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num elements</em>' attribute.
	 * @see #setNum_elements(Integer)
	 * @see SQL2003_V3.SQL2003_V3Package#getARRAY_Num_elements()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Integer getNum_elements();

	/**
	 * Sets the value of the '{@link SQL2003_V3.ARRAY#getNum_elements <em>Num elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num elements</em>' attribute.
	 * @see #getNum_elements()
	 * @generated
	 */
	void setNum_elements(Integer value);

} // ARRAY
