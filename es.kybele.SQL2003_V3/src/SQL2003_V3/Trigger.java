/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V3.Trigger#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_V3.Trigger#getDescription <em>Description</em>}</li>
 *   <li>{@link SQL2003_V3.Trigger#getUpdateColumns <em>Update Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends Restriction {
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
	 * @see SQL2003_V3.SQL2003_V3Package#getTrigger_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_V3.Trigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.TriggerDescriptor#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(TriggerDescriptor)
	 * @see SQL2003_V3.SQL2003_V3Package#getTrigger_Description()
	 * @see SQL2003_V3.TriggerDescriptor#getTrigger
	 * @model opposite="trigger" containment="true"
	 * @generated
	 */
	TriggerDescriptor getDescription();

	/**
	 * Sets the value of the '{@link SQL2003_V3.Trigger#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(TriggerDescriptor value);

	/**
	 * Returns the value of the '<em><b>Update Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Columns</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Columns</em>' reference.
	 * @see #setUpdateColumns(StructuralComponent)
	 * @see SQL2003_V3.SQL2003_V3Package#getTrigger_UpdateColumns()
	 * @model
	 * @generated
	 */
	StructuralComponent getUpdateColumns();

	/**
	 * Sets the value of the '{@link SQL2003_V3.Trigger#getUpdateColumns <em>Update Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Columns</em>' reference.
	 * @see #getUpdateColumns()
	 * @generated
	 */
	void setUpdateColumns(StructuralComponent value);

} // Trigger
