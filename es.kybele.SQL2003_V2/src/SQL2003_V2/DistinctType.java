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
 * A representation of the model object '<em><b>Distinct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V2.DistinctType#getSource_type <em>Source type</em>}</li>
 *   <li>{@link SQL2003_V2.DistinctType#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getDistinctType()
 * @model
 * @generated
 */
public interface DistinctType extends UserDefinedType {
	/**
	 * Returns the value of the '<em><b>Source type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V2.PredefinedType#getIs_source_of <em>Is source of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source type</em>' reference.
	 * @see #setSource_type(PredefinedType)
	 * @see SQL2003_V2.SQL2003_V2Package#getDistinctType_Source_type()
	 * @see SQL2003_V2.PredefinedType#getIs_source_of
	 * @model opposite="is_source_of" required="true"
	 * @generated
	 */
	PredefinedType getSource_type();

	/**
	 * Sets the value of the '{@link SQL2003_V2.DistinctType#getSource_type <em>Source type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source type</em>' reference.
	 * @see #getSource_type()
	 * @generated
	 */
	void setSource_type(PredefinedType value);

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
	 * @see SQL2003_V2.SQL2003_V2Package#getDistinctType_Features()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // DistinctType
