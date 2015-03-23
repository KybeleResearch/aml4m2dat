/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V2.ROW#getSuper_type <em>Super type</em>}</li>
 *   <li>{@link SQL2003_V2.ROW#getFields <em>Fields</em>}</li>
 *   <li>{@link SQL2003_V2.ROW#getSub_types <em>Sub types</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getROW()
 * @model
 * @generated
 */
public interface ROW extends ConstructedType {
	/**
	 * Returns the value of the '<em><b>Super type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.ROW#getSub_types <em>Sub types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super type</em>' reference.
	 * @see #setSuper_type(ROW)
	 * @see SQL2003_V2.SQL2003_V2Package#getROW_Super_type()
	 * @see SQL2003_V2.ROW#getSub_types
	 * @model opposite="sub_types"
	 * @generated
	 */
	ROW getSuper_type();

	/**
	 * Sets the value of the '{@link SQL2003_V2.ROW#getSuper_type <em>Super type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super type</em>' reference.
	 * @see #getSuper_type()
	 * @generated
	 */
	void setSuper_type(ROW value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link SQL2003_V2.Field}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.Field#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see SQL2003_V2.SQL2003_V2Package#getROW_Fields()
	 * @see SQL2003_V2.Field#getRow
	 * @model opposite="row" containment="true" required="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Sub types</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_V2.ROW}.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.ROW#getSuper_type <em>Super type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub types</em>' reference list.
	 * @see SQL2003_V2.SQL2003_V2Package#getROW_Sub_types()
	 * @see SQL2003_V2.ROW#getSuper_type
	 * @model opposite="super_type"
	 * @generated
	 */
	EList<ROW> getSub_types();

} // ROW
