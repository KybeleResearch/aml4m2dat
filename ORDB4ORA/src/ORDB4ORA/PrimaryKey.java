/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.PrimaryKey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends Restriction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ORDB4ORA.ORDB4ORAPackage#getPrimaryKey_Name()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.PrimaryKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PrimaryKey
