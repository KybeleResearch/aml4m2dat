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
 * A representation of the model object '<em><b>Predefined Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.PredefinedType#getIs_source_of <em>Is source of</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getPredefinedType()
 * @model abstract="true"
 * @generated
 */
public interface PredefinedType extends DataType {
	/**
	 * Returns the value of the '<em><b>Is source of</b></em>' reference list.
	 * The list contents are of type {@link SQL2003_evo.DistinctType}.
	 * It is bidirectional and its opposite is '{@link SQL2003_evo.DistinctType#getSource_type <em>Source type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is source of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is source of</em>' reference list.
	 * @see SQL2003_evo.SQL2003_evoPackage#getPredefinedType_Is_source_of()
	 * @see SQL2003_evo.DistinctType#getSource_type
	 * @model opposite="source_type" derived="true"
	 * @generated
	 */
	EList<DistinctType> getIs_source_of();

} // PredefinedType
