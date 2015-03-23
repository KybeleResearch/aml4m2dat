/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.Trigger#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.Trigger#getBody <em>Body</em>}</li>
 *   <li>{@link ORDB4ORA.Trigger#getEvent <em>Event</em>}</li>
 *   <li>{@link ORDB4ORA.Trigger#getAction <em>Action</em>}</li>
 *   <li>{@link ORDB4ORA.Trigger#getUpdateColumns <em>Update Columns</em>}</li>
 *   <li>{@link ORDB4ORA.Trigger#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
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
	 * @see ORDB4ORA.ORDB4ORAPackage#getTrigger_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Trigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see ORDB4ORA.ORDB4ORAPackage#getTrigger_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Trigger#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute list.
	 * The list contents are of type {@link ORDB4ORA.TriggerEvent}.
	 * The literals are from the enumeration {@link ORDB4ORA.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute list.
	 * @see ORDB4ORA.TriggerEvent
	 * @see ORDB4ORA.ORDB4ORAPackage#getTrigger_Event()
	 * @model required="true"
	 * @generated
	 */
	EList<TriggerEvent> getEvent();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.TriggerActionTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see ORDB4ORA.TriggerActionTime
	 * @see #setAction(TriggerActionTime)
	 * @see ORDB4ORA.ORDB4ORAPackage#getTrigger_Action()
	 * @model required="true"
	 * @generated
	 */
	TriggerActionTime getAction();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Trigger#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see ORDB4ORA.TriggerActionTime
	 * @see #getAction()
	 * @generated
	 */
	void setAction(TriggerActionTime value);

	/**
	 * Returns the value of the '<em><b>Update Columns</b></em>' reference list.
	 * The list contents are of type {@link ORDB4ORA.StructuralComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Columns</em>' reference list.
	 * @see ORDB4ORA.ORDB4ORAPackage#getTrigger_UpdateColumns()
	 * @model
	 * @generated
	 */
	EList<StructuralComponent> getUpdateColumns();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.Table#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see ORDB4ORA.ORDB4ORAPackage#getTrigger_Table()
	 * @see ORDB4ORA.Table#getTriggers
	 * @model opposite="triggers" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Trigger#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // Trigger
