/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003.Schema#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003.Schema#getBehaviouralComponents <em>Behavioural Components</em>}</li>
 *   <li>{@link SQL2003.Schema#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link SQL2003.Schema#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003.SQL2003Package#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
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
	 * @see SQL2003.SQL2003Package#getSchema_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Behavioural Components</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003.BehaviouralComponent}.
	 * It is bidirectional and its opposite is '{@link SQL2003.BehaviouralComponent#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioural Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioural Components</em>' containment reference list.
	 * @see SQL2003.SQL2003Package#getSchema_BehaviouralComponents()
	 * @see SQL2003.BehaviouralComponent#getSchema
	 * @model opposite="schema" containment="true"
	 * @generated
	 */
	EList<BehaviouralComponent> getBehaviouralComponents();

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003.DataType}.
	 * It is bidirectional and its opposite is '{@link SQL2003.DataType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see SQL2003.SQL2003Package#getSchema_Datatypes()
	 * @see SQL2003.DataType#getSchema
	 * @model opposite="schema" containment="true" ordered="false"
	 * @generated
	 */
	EList<DataType> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003.Table}.
	 * It is bidirectional and its opposite is '{@link SQL2003.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see SQL2003.SQL2003Package#getSchema_Tables()
	 * @see SQL2003.Table#getSchema
	 * @model opposite="schema" containment="true" ordered="false"
	 * @generated
	 */
	EList<Table> getTables();

} // Schema
