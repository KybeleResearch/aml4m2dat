/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.Attribute#getDefault <em>Default</em>}</li>
 *   <li>{@link SQL2003_evo.Attribute#getStructured <em>Structured</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends StructuralComponent {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see SQL2003_evo.SQL2003_evoPackage#getAttribute_Default()
	 * @model default=""
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link SQL2003_evo.Attribute#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Structured</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.StructuredType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured</em>' container reference.
	 * @see #setStructured(StructuredType)
	 * @see SQL2003_evo.SQL2003_evoPackage#getAttribute_Structured()
	 * @see SQL2003_evo.StructuredType#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	StructuredType getStructured();

	/**
	 * Sets the value of the '{@link SQL2003_evo.Attribute#getStructured <em>Structured</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured</em>' container reference.
	 * @see #getStructured()
	 * @generated
	 */
	void setStructured(StructuredType value);

} // Attribute
