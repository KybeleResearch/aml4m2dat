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
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.Table#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.Table#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link ORDB4ORA.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link ORDB4ORA.Table#getModel <em>Model</em>}</li>
 *   <li>{@link ORDB4ORA.Table#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
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
	 * @see ORDB4ORA.ORDB4ORAPackage#getTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Restriction}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Restriction#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getTable_Restriction()
	 * @see ORDB4ORA.Restriction#getTable
	 * @model opposite="table" containment="true" ordered="false"
	 * @generated
	 */
	EList<Restriction> getRestriction();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Column}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getTable_Columns()
	 * @see ORDB4ORA.Column#getTable
	 * @model opposite="table" containment="true" ordered="false"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Model#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see ORDB4ORA.ORDB4ORAPackage#getTable_Model()
	 * @see ORDB4ORA.Model#getTable
	 * @model opposite="table" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Table#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Trigger}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Trigger#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getTable_Triggers()
	 * @see ORDB4ORA.Trigger#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

} // Table
