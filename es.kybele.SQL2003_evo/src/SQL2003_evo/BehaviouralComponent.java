/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioural Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.BehaviouralComponent#getSchema <em>Schema</em>}</li>
 *   <li>{@link SQL2003_evo.BehaviouralComponent#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_evo.BehaviouralComponent#getBody <em>Body</em>}</li>
 *   <li>{@link SQL2003_evo.BehaviouralComponent#getParametersWithMode <em>Parameters With Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getBehaviouralComponent()
 * @model abstract="true"
 * @generated
 */
public interface BehaviouralComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.Schema#getBehaviouralComponents <em>Behavioural Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see SQL2003_evo.SQL2003_evoPackage#getBehaviouralComponent_Schema()
	 * @see SQL2003_evo.Schema#getBehaviouralComponents
	 * @model opposite="behaviouralComponents" required="true" transient="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link SQL2003_evo.BehaviouralComponent#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

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
	 * @see SQL2003_evo.SQL2003_evoPackage#getBehaviouralComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_evo.BehaviouralComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see SQL2003_evo.SQL2003_evoPackage#getBehaviouralComponent_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link SQL2003_evo.BehaviouralComponent#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Parameters With Mode</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003_evo.ParameterWithMode}.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.ParameterWithMode#getBehaviouralComponent <em>Behavioural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters With Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters With Mode</em>' containment reference list.
	 * @see SQL2003_evo.SQL2003_evoPackage#getBehaviouralComponent_ParametersWithMode()
	 * @see SQL2003_evo.ParameterWithMode#getBehaviouralComponent
	 * @model opposite="behaviouralComponent" containment="true"
	 * @generated
	 */
	EList<ParameterWithMode> getParametersWithMode();

} // BehaviouralComponent
