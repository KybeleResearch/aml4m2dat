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
 * A representation of the model object '<em><b>Tables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.Tables#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link ORDB4ORA.Tables#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link ORDB4ORA.Tables#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getTables()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/ocl/examples/OCL OnlyOnePrimaryKey='self.restriction->select(r|r.oclIsTypeOf(PrimaryKey))->size()<=1'"
 * @generated
 */
public interface Tables extends EObject {
	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Restriction}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Restriction#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getTables_Restriction()
	 * @see ORDB4ORA.Restriction#getTables
	 * @model opposite="tables" containment="true" ordered="false"
	 * @generated
	 */
	EList<Restriction> getRestriction();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link ORDB4ORA.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getTables_Attribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttribute();

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
	 * @see ORDB4ORA.ORDB4ORAPackage#getTables_Model()
	 * @see ORDB4ORA.Model#getTable
	 * @model opposite="table" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Tables#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Tables
