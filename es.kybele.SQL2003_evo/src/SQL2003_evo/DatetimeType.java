/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datetime Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.DatetimeType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getDatetimeType()
 * @model
 * @generated
 */
public interface DatetimeType extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_evo.DatetimeTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.DatetimeTypes
	 * @see #setDescriptor(DatetimeTypes)
	 * @see SQL2003_evo.SQL2003_evoPackage#getDatetimeType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	DatetimeTypes getDescriptor();

	/**
	 * Sets the value of the '{@link SQL2003_evo.DatetimeType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see SQL2003_evo.DatetimeTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(DatetimeTypes value);

} // DatetimeType
