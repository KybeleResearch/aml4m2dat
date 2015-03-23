/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2;

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
 *   <li>{@link SQL2003_V2.StructuralComponent#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_V2.StructuralComponent#getType <em>Type</em>}</li>
 *   <li>{@link SQL2003_V2.StructuralComponent#getViews <em>Views</em>}</li>
 *   <li>{@link SQL2003_V2.StructuralComponent#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link SQL2003_V2.StructuralComponent#getFeatures <em>Features</em>}</li>
 *   <li>{@link SQL2003_V2.StructuralComponent#getHas_domain <em>Has domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getStructuralComponent()
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
	 * @see SQL2003_V2.SQL2003_V2Package#getStructuralComponent_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_V2.StructuralComponent#getName <em>Name</em>}' attribute.
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
	 * @see SQL2003_V2.SQL2003_V2Package#getStructuralComponent_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link SQL2003_V2.StructuralComponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_V2.View}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.View#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see SQL2003_V2.SQL2003_V2Package#getStructuralComponent_Views()
	 * @see SQL2003_V2.View#getComponents
	 * @model opposite="components"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_V2.Restriction}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.Restriction#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' reference list.
	 * @see SQL2003_V2.SQL2003_V2Package#getStructuralComponent_Restrictions()
	 * @see SQL2003_V2.Restriction#getColumns
	 * @model opposite="columns"
	 * @generated
	 */
	EList<Restriction> getRestrictions();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003_V2.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see SQL2003_V2.SQL2003_V2Package#getStructuralComponent_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Has domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.Domain#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has domain</em>' reference.
	 * @see #setHas_domain(Domain)
	 * @see SQL2003_V2.SQL2003_V2Package#getStructuralComponent_Has_domain()
	 * @see SQL2003_V2.Domain#getDefines
	 * @model opposite="defines"
	 * @generated
	 */
	Domain getHas_domain();

	/**
	 * Sets the value of the '{@link SQL2003_V2.StructuralComponent#getHas_domain <em>Has domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has domain</em>' reference.
	 * @see #getHas_domain()
	 * @generated
	 */
	void setHas_domain(Domain value);

} // StructuralComponent
