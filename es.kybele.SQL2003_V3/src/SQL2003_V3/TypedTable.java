/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V3.TypedTable#getStructured <em>Structured</em>}</li>
 *   <li>{@link SQL2003_V3.TypedTable#getSupertable <em>Supertable</em>}</li>
 *   <li>{@link SQL2003_V3.TypedTable#getSubtables <em>Subtables</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getTypedTable()
 * @model
 * @generated
 */
public interface TypedTable extends BaseTable {
	/**
	 * Returns the value of the '<em><b>Structured</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.StructuredType#getTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured</em>' reference.
	 * @see #setStructured(StructuredType)
	 * @see SQL2003_V3.SQL2003_V3Package#getTypedTable_Structured()
	 * @see SQL2003_V3.StructuredType#getTyped
	 * @model opposite="typed" required="true"
	 * @generated
	 */
	StructuredType getStructured();

	/**
	 * Sets the value of the '{@link SQL2003_V3.TypedTable#getStructured <em>Structured</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured</em>' reference.
	 * @see #getStructured()
	 * @generated
	 */
	void setStructured(StructuredType value);

	/**
	 * Returns the value of the '<em><b>Supertable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.TypedTable#getSubtables <em>Subtables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertable</em>' reference.
	 * @see #setSupertable(TypedTable)
	 * @see SQL2003_V3.SQL2003_V3Package#getTypedTable_Supertable()
	 * @see SQL2003_V3.TypedTable#getSubtables
	 * @model opposite="subtables"
	 * @generated
	 */
	TypedTable getSupertable();

	/**
	 * Sets the value of the '{@link SQL2003_V3.TypedTable#getSupertable <em>Supertable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertable</em>' reference.
	 * @see #getSupertable()
	 * @generated
	 */
	void setSupertable(TypedTable value);

	/**
	 * Returns the value of the '<em><b>Subtables</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_V3.TypedTable}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.TypedTable#getSupertable <em>Supertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtables</em>' reference list.
	 * @see SQL2003_V3.SQL2003_V3Package#getTypedTable_Subtables()
	 * @see SQL2003_V3.TypedTable#getSupertable
	 * @model opposite="supertable"
	 * @generated
	 */
	EList<TypedTable> getSubtables();

} // TypedTable
