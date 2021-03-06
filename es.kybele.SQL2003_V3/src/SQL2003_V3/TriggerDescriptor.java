/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V3.TriggerDescriptor#getEvent <em>Event</em>}</li>
 *   <li>{@link SQL2003_V3.TriggerDescriptor#getActionTime <em>Action Time</em>}</li>
 *   <li>{@link SQL2003_V3.TriggerDescriptor#getTriggeredAction <em>Triggered Action</em>}</li>
 *   <li>{@link SQL2003_V3.TriggerDescriptor#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link SQL2003_V3.TriggerDescriptor#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getTriggerDescriptor()
 * @model
 * @generated
 */
public interface TriggerDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V3.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see SQL2003_V3.TriggerEvent
	 * @see #setEvent(TriggerEvent)
	 * @see SQL2003_V3.SQL2003_V3Package#getTriggerDescriptor_Event()
	 * @model required="true"
	 * @generated
	 */
	TriggerEvent getEvent();

	/**
	 * Sets the value of the '{@link SQL2003_V3.TriggerDescriptor#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see SQL2003_V3.TriggerEvent
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(TriggerEvent value);

	/**
	 * Returns the value of the '<em><b>Action Time</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V3.TriggerActionTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Time</em>' attribute.
	 * @see SQL2003_V3.TriggerActionTime
	 * @see #setActionTime(TriggerActionTime)
	 * @see SQL2003_V3.SQL2003_V3Package#getTriggerDescriptor_ActionTime()
	 * @model required="true"
	 * @generated
	 */
	TriggerActionTime getActionTime();

	/**
	 * Sets the value of the '{@link SQL2003_V3.TriggerDescriptor#getActionTime <em>Action Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Time</em>' attribute.
	 * @see SQL2003_V3.TriggerActionTime
	 * @see #getActionTime()
	 * @generated
	 */
	void setActionTime(TriggerActionTime value);

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
	 * @see SQL2003_V3.SQL2003_V3Package#getTriggerDescriptor_TriggeredAction()
	 * @model
	 * @generated
	 */
	String getTriggeredAction();

	/**
	 * Sets the value of the '{@link SQL2003_V3.TriggerDescriptor#getTriggeredAction <em>Triggered Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered Action</em>' attribute.
	 * @see #getTriggeredAction()
	 * @generated
	 */
	void setTriggeredAction(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.Trigger#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' container reference.
	 * @see #setTrigger(Trigger)
	 * @see SQL2003_V3.SQL2003_V3Package#getTriggerDescriptor_Trigger()
	 * @see SQL2003_V3.Trigger#getDescription
	 * @model opposite="description" required="true" transient="false"
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link SQL2003_V3.TriggerDescriptor#getTrigger <em>Trigger</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' container reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V3.TriggerLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see SQL2003_V3.TriggerLevel
	 * @see #setLevel(TriggerLevel)
	 * @see SQL2003_V3.SQL2003_V3Package#getTriggerDescriptor_Level()
	 * @model
	 * @generated
	 */
	TriggerLevel getLevel();

	/**
	 * Sets the value of the '{@link SQL2003_V3.TriggerDescriptor#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see SQL2003_V3.TriggerLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(TriggerLevel value);

} // TriggerDescriptor
