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
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.Restriction#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ORDB4ORA.Restriction#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getRestriction()
 * @model abstract="true"
 * @generated
 */
public interface Restriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Table#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see ORDB4ORA.ORDB4ORAPackage#getRestriction_Table()
	 * @see ORDB4ORA.Table#getRestriction
	 * @model opposite="restriction" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Restriction#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link ORDB4ORA.StructuralComponent}.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.StructuralComponent#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getRestriction_Attributes()
	 * @see ORDB4ORA.StructuralComponent#getRestrictions
	 * @model opposite="restrictions" required="true" ordered="false"
	 * @generated
	 */
	EList<StructuralComponent> getAttributes();

} // Restriction
