/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.BooleanType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getBooleanType()
 * @model
 * @generated
 */
public interface BooleanType extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_evo.BooleanTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.BooleanTypes
	 * @see #setDescriptor(BooleanTypes)
	 * @see SQL2003_evo.SQL2003_evoPackage#getBooleanType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	BooleanTypes getDescriptor();

	/**
	 * Sets the value of the '{@link SQL2003_evo.BooleanType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.BooleanTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BooleanTypes value);

} // BooleanType
