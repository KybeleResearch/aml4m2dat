/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stored Nested Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.StoredNestedTable#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.StoredNestedTable#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link ORDB4ORA.StoredNestedTable#getTyped <em>Typed</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getStoredNestedTable()
 * @model
 * @generated
 */
public interface StoredNestedTable extends EObject {
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
	 * @see ORDB4ORA.ORDB4ORAPackage#getStoredNestedTable_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.StoredNestedTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see ORDB4ORA.ORDB4ORAPackage#getStoredNestedTable_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link ORDB4ORA.StoredNestedTable#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Typed</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.TypedTable#getStoredNested <em>Stored Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed</em>' container reference.
	 * @see #setTyped(TypedTable)
	 * @see ORDB4ORA.ORDB4ORAPackage#getStoredNestedTable_Typed()
	 * @see ORDB4ORA.TypedTable#getStoredNested
	 * @model opposite="storedNested" transient="false"
	 * @generated
	 */
	TypedTable getTyped();

	/**
	 * Sets the value of the '{@link ORDB4ORA.StoredNestedTable#getTyped <em>Typed</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed</em>' container reference.
	 * @see #getTyped()
	 * @generated
	 */
	void setTyped(TypedTable value);

} // StoredNestedTable
