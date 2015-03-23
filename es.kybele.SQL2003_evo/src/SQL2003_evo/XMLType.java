/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.XMLType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getXMLType()
 * @model
 * @generated
 */
public interface XMLType extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_evo.XMLTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.XMLTypes
	 * @see #setDescriptor(XMLTypes)
	 * @see SQL2003_evo.SQL2003_evoPackage#getXMLType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	XMLTypes getDescriptor();

	/**
	 * Sets the value of the '{@link SQL2003_evo.XMLType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.XMLTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(XMLTypes value);

} // XMLType
