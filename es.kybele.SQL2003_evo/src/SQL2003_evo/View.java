/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.View#getTables <em>Tables</em>}</li>
 *   <li>{@link SQL2003_evo.View#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getView()
 * @model
 * @generated
 */
public interface View extends DerivedTable {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_evo.Table}.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.Table#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference list.
	 * @see SQL2003_evo.SQL2003_evoPackage#getView_Tables()
	 * @see SQL2003_evo.Table#getViews
	 * @model opposite="views" required="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_evo.StructuralComponent}.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.StructuralComponent#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see SQL2003_evo.SQL2003_evoPackage#getView_Components()
	 * @see SQL2003_evo.StructuralComponent#getViews
	 * @model opposite="views"
	 * @generated
	 */
	EList<StructuralComponent> getComponents();

} // View
