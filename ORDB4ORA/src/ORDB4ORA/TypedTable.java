/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.TypedTable#getStoredNested <em>Stored Nested</em>}</li>
 *   <li>{@link ORDB4ORA.TypedTable#getStructuredType <em>Structured Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getTypedTable()
 * @model
 * @generated
 */
public interface TypedTable extends Table {
	/**
	 * Returns the value of the '<em><b>Stored Nested</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.StoredNestedTable}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.StoredNestedTable#getTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored Nested</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Nested</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getTypedTable_StoredNested()
	 * @see ORDB4ORA.StoredNestedTable#getTyped
	 * @model opposite="typed" containment="true" ordered="false"
	 * @generated
	 */
	EList<StoredNestedTable> getStoredNested();

	/**
	 * Returns the value of the '<em><b>Structured Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.StructuredType#getTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Type</em>' container reference.
	 * @see #setStructuredType(StructuredType)
	 * @see ORDB4ORA.ORDB4ORAPackage#getTypedTable_StructuredType()
	 * @see ORDB4ORA.StructuredType#getTyped
	 * @model opposite="typed" required="true" transient="false"
	 * @generated
	 */
	StructuredType getStructuredType();

	/**
	 * Sets the value of the '{@link ORDB4ORA.TypedTable#getStructuredType <em>Structured Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Type</em>' container reference.
	 * @see #getStructuredType()
	 * @generated
	 */
	void setStructuredType(StructuredType value);

} // TypedTable
