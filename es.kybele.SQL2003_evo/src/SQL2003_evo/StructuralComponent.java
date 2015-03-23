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
 * A representation of the model object '<em><b>Structural Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.StructuralComponent#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_evo.StructuralComponent#getType <em>Type</em>}</li>
 *   <li>{@link SQL2003_evo.StructuralComponent#getViews <em>Views</em>}</li>
 *   <li>{@link SQL2003_evo.StructuralComponent#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link SQL2003_evo.StructuralComponent#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getStructuralComponent()
 * @model abstract="true"
 * @generated
 */
public interface StructuralComponent extends EObject {
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
	 * @see SQL2003_evo.SQL2003_evoPackage#getStructuralComponent_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_evo.StructuralComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see SQL2003_evo.SQL2003_evoPackage#getStructuralComponent_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link SQL2003_evo.StructuralComponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_evo.View}.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.View#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see SQL2003_evo.SQL2003_evoPackage#getStructuralComponent_Views()
	 * @see SQL2003_evo.View#getComponents
	 * @model opposite="components"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_evo.Restriction}.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.Restriction#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' reference list.
	 * @see SQL2003_evo.SQL2003_evoPackage#getStructuralComponent_Restrictions()
	 * @see SQL2003_evo.Restriction#getColumns
	 * @model opposite="columns"
	 * @generated
	 */
	EList<Restriction> getRestrictions();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003_evo.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see SQL2003_evo.SQL2003_evoPackage#getStructuralComponent_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // StructuralComponent
