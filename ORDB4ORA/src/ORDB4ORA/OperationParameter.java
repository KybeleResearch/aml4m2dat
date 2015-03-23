/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.OperationParameter#getMode <em>Mode</em>}</li>
 *   <li>{@link ORDB4ORA.OperationParameter#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getOperationParameter()
 * @model
 * @generated
 */
public interface OperationParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.ParameterMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see ORDB4ORA.ParameterMode
	 * @see #setMode(ParameterMode)
	 * @see ORDB4ORA.ORDB4ORAPackage#getOperationParameter_Mode()
	 * @model
	 * @generated
	 */
	ParameterMode getMode();

	/**
	 * Sets the value of the '{@link ORDB4ORA.OperationParameter#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see ORDB4ORA.ParameterMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ParameterMode value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Operation#getOperationParameters <em>Operation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see ORDB4ORA.ORDB4ORAPackage#getOperationParameter_Operation()
	 * @see ORDB4ORA.Operation#getOperationParameters
	 * @model opposite="operationParameters" transient="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link ORDB4ORA.OperationParameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // OperationParameter
