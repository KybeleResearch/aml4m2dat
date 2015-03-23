/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.Function#getReturn_type <em>Return type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends BehaviouralComponent {
	/**
	 * Returns the value of the '<em><b>Return type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return type</em>' reference.
	 * @see #setReturn_type(DataType)
	 * @see SQL2003_evo.SQL2003_evoPackage#getFunction_Return_type()
	 * @model required="true"
	 * @generated
	 */
	DataType getReturn_type();

	/**
	 * Sets the value of the '{@link SQL2003_evo.Function#getReturn_type <em>Return type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return type</em>' reference.
	 * @see #getReturn_type()
	 * @generated
	 */
	void setReturn_type(DataType value);

} // Function
