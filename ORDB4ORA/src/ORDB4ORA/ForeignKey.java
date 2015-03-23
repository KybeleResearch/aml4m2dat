/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.ForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.ForeignKey#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link ORDB4ORA.ForeignKey#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Restriction {
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
	 * @see ORDB4ORA.ORDB4ORAPackage#getForeignKey_Name()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.ForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.ONDELETEActions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see ORDB4ORA.ONDELETEActions
	 * @see #setOnDelete(ONDELETEActions)
	 * @see ORDB4ORA.ORDB4ORAPackage#getForeignKey_OnDelete()
	 * @model
	 * @generated
	 */
	ONDELETEActions getOnDelete();

	/**
	 * Sets the value of the '{@link ORDB4ORA.ForeignKey#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see ORDB4ORA.ONDELETEActions
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(ONDELETEActions value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Table)
	 * @see ORDB4ORA.ORDB4ORAPackage#getForeignKey_Reference()
	 * @model required="true"
	 * @generated
	 */
	Table getReference();

	/**
	 * Sets the value of the '{@link ORDB4ORA.ForeignKey#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Table value);

} // ForeignKey
