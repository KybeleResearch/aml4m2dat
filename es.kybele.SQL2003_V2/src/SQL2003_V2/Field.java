/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V2.Field#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getField()
 * @model
 * @generated
 */
public interface Field extends StructuralComponent {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.ROW#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' container reference.
	 * @see #setRow(ROW)
	 * @see SQL2003_V2.SQL2003_V2Package#getField_Row()
	 * @see SQL2003_V2.ROW#getFields
	 * @model opposite="fields" required="true" transient="false"
	 * @generated
	 */
	ROW getRow();

	/**
	 * Sets the value of the '{@link SQL2003_V2.Field#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(ROW value);

} // Field
