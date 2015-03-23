/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003;

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
 *   <li>{@link SQL2003.Trigger#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003.Trigger#getEvent <em>Event</em>}</li>
 *   <li>{@link SQL2003.Trigger#getActionTime <em>Action Time</em>}</li>
 *   <li>{@link SQL2003.Trigger#getTable <em>Table</em>}</li>
 *   <li>{@link SQL2003.Trigger#getTriggeredAction <em>Triggered Action</em>}</li>
 *   <li>{@link SQL2003.Trigger#getUpdateColumns <em>Update Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003.SQL2003Package#getTrigger()
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
	 * @see SQL2003.SQL2003Package#getTrigger_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003.Trigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see SQL2003.TriggerEvent
	 * @see #setEvent(TriggerEvent)
	 * @see SQL2003.SQL2003Package#getTrigger_Event()
	 * @model required="true"
	 * @generated
	 */
	TriggerEvent getEvent();

	/**
	 * Sets the value of the '{@link SQL2003.Trigger#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see SQL2003.TriggerEvent
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(TriggerEvent value);

	/**
	 * Returns the value of the '<em><b>Action Time</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003.TriggerActionTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Time</em>' attribute.
	 * @see SQL2003.TriggerActionTime
	 * @see #setActionTime(TriggerActionTime)
	 * @see SQL2003.SQL2003Package#getTrigger_ActionTime()
	 * @model required="true"
	 * @generated
	 */
	TriggerActionTime getActionTime();

	/**
	 * Sets the value of the '{@link SQL2003.Trigger#getActionTime <em>Action Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Time</em>' attribute.
	 * @see SQL2003.TriggerActionTime
	 * @see #getActionTime()
	 * @generated
	 */
	void setActionTime(TriggerActionTime value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003.Table#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see SQL2003.SQL2003Package#getTrigger_Table()
	 * @see SQL2003.Table#getTriggers
	 * @model opposite="triggers" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link SQL2003.Trigger#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Triggered Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered Action</em>' attribute.
	 * @see #setTriggeredAction(String)
	 * @see SQL2003.SQL2003Package#getTrigger_TriggeredAction()
	 * @model
	 * @generated
	 */
	String getTriggeredAction();

	/**
	 * Sets the value of the '{@link SQL2003.Trigger#getTriggeredAction <em>Triggered Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered Action</em>' attribute.
	 * @see #getTriggeredAction()
	 * @generated
	 */
	void setTriggeredAction(String value);

	/**
	 * Returns the value of the '<em><b>Update Columns</b></em>' reference list.
	 * The list contents are of type {@link SQL2003.StructuralComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Columns</em>' reference list.
	 * @see SQL2003.SQL2003Package#getTrigger_UpdateColumns()
	 * @model
	 * @generated
	 */
	EList<StructuralComponent> getUpdateColumns();

} // Trigger
