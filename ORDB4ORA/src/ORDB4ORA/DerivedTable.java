/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.DerivedTable#getQuery_expression <em>Query expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getDerivedTable()
 * @model
 * @generated
 */
public interface DerivedTable extends Table {
	/**
	 * Returns the value of the '<em><b>Query expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query expression</em>' attribute.
	 * @see #setQuery_expression(String)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDerivedTable_Query_expression()
	 * @model required="true"
	 * @generated
	 */
	String getQuery_expression();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DerivedTable#getQuery_expression <em>Query expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query expression</em>' attribute.
	 * @see #getQuery_expression()
	 * @generated
	 */
	void setQuery_expression(String value);

} // DerivedTable
