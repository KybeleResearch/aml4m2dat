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
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V3.Table#getSchema <em>Schema</em>}</li>
 *   <li>{@link SQL2003_V3.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link SQL2003_V3.Table#getViews <em>Views</em>}</li>
 *   <li>{@link SQL2003_V3.Table#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link SQL2003_V3.Table#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getTable()
 * @model abstract="true"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see SQL2003_V3.SQL2003_V3Package#getTable_Schema()
	 * @see SQL2003_V3.Schema#getTables
	 * @model opposite="tables" required="true" transient="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link SQL2003_V3.Table#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003_V3.Column}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see SQL2003_V3.SQL2003_V3Package#getTable_Columns()
	 * @see SQL2003_V3.Column#getTable
	 * @model opposite="table" containment="true" ordered="false"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_V3.View}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.View#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see SQL2003_V3.SQL2003_V3Package#getTable_Views()
	 * @see SQL2003_V3.View#getTables
	 * @model opposite="tables" ordered="false"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003_V3.Restriction}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.Restriction#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' containment reference list.
	 * @see SQL2003_V3.SQL2003_V3Package#getTable_Restrictions()
	 * @see SQL2003_V3.Restriction#getTable
	 * @model opposite="table" containment="true" ordered="false"
	 * @generated
	 */
	EList<Restriction> getRestrictions();

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
	 * @see SQL2003_V3.SQL2003_V3Package#getTable_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_V3.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Table
