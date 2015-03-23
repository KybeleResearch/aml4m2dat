/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;

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
 *   <li>{@link SQL2003_V3.Restriction#getTable <em>Table</em>}</li>
 *   <li>{@link SQL2003_V3.Restriction#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getRestriction()
 * @model abstract="true"
 * @generated
 */
public interface Restriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.Table#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see SQL2003_V3.SQL2003_V3Package#getRestriction_Table()
	 * @see SQL2003_V3.Table#getRestrictions
	 * @model opposite="restrictions" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link SQL2003_V3.Restriction#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_V3.StructuralComponent}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.StructuralComponent#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see SQL2003_V3.SQL2003_V3Package#getRestriction_Columns()
	 * @see SQL2003_V3.StructuralComponent#getRestrictions
	 * @model opposite="restrictions" required="true"
	 * @generated
	 */
	EList<StructuralComponent> getColumns();

} // Restriction
