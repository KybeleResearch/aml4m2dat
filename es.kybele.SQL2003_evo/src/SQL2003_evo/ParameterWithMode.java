/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter With Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.ParameterWithMode#getMode <em>Mode</em>}</li>
 *   <li>{@link SQL2003_evo.ParameterWithMode#getBehaviouralComponent <em>Behavioural Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getParameterWithMode()
 * @model
 * @generated
 */
public interface ParameterWithMode extends Parameter {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_evo.ParameterMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see SQL2003_evo.ParameterMode
	 * @see #setMode(ParameterMode)
	 * @see SQL2003_evo.SQL2003_evoPackage#getParameterWithMode_Mode()
	 * @model required="true"
	 * @generated
	 */
	ParameterMode getMode();

	/**
	 * Sets the value of the '{@link SQL2003_evo.ParameterWithMode#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see SQL2003_evo.ParameterMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ParameterMode value);

	/**
	 * Returns the value of the '<em><b>Behavioural Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.BehaviouralComponent#getParametersWithMode <em>Parameters With Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioural Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioural Component</em>' container reference.
	 * @see #setBehaviouralComponent(BehaviouralComponent)
	 * @see SQL2003_evo.SQL2003_evoPackage#getParameterWithMode_BehaviouralComponent()
	 * @see SQL2003_evo.BehaviouralComponent#getParametersWithMode
	 * @model opposite="parametersWithMode" required="true" transient="false"
	 * @generated
	 */
	BehaviouralComponent getBehaviouralComponent();

	/**
	 * Sets the value of the '{@link SQL2003_evo.ParameterWithMode#getBehaviouralComponent <em>Behavioural Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioural Component</em>' container reference.
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	void setBehaviouralComponent(BehaviouralComponent value);

} // ParameterWithMode
