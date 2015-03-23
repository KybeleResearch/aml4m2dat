/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.Model#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link ORDB4ORA.Model#getTable <em>Table</em>}</li>
 *   <li>{@link ORDB4ORA.Model#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.Model#getOperation <em>Operation</em>}</li>
 *   <li>{@link ORDB4ORA.Model#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Datatype}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Datatype#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getModel_Datatype()
	 * @see ORDB4ORA.Datatype#getModel
	 * @model opposite="model" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Datatype> getDatatype();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Table}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Table#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getModel_Table()
	 * @see ORDB4ORA.Table#getModel
	 * @model opposite="model" containment="true" ordered="false"
	 * @generated
	 */
	EList<Table> getTable();

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getModel_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Operation}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Operation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getModel_Operation()
	 * @see ORDB4ORA.Operation#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Package}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Package#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getModel_Package()
	 * @see ORDB4ORA.Package#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<ORDB4ORA.Package> getPackage();

} // Model
