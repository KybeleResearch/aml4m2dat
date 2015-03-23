/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.SQL2003_V2Package;
import SQL2003_V2.Trigger;
import SQL2003_V2.TriggerActionTime;
import SQL2003_V2.TriggerDescriptor;
import SQL2003_V2.TriggerEvent;
import SQL2003_V2.TriggerLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.TriggerDescriptorImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link SQL2003_V2.impl.TriggerDescriptorImpl#getActionTime <em>Action Time</em>}</li>
 *   <li>{@link SQL2003_V2.impl.TriggerDescriptorImpl#getTriggeredAction <em>Triggered Action</em>}</li>
 *   <li>{@link SQL2003_V2.impl.TriggerDescriptorImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link SQL2003_V2.impl.TriggerDescriptorImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerDescriptorImpl extends EObjectImpl implements TriggerDescriptor {
	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerEvent EVENT_EDEFAULT = TriggerEvent.INSERT;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected TriggerEvent event = EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionTime() <em>Action Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTime()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerActionTime ACTION_TIME_EDEFAULT = TriggerActionTime.BEFORE;

	/**
	 * The cached value of the '{@link #getActionTime() <em>Action Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTime()
	 * @generated
	 * @ordered
	 */
	protected TriggerActionTime actionTime = ACTION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggeredAction() <em>Triggered Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredAction()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGERED_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggeredAction() <em>Triggered Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredAction()
	 * @generated
	 * @ordered
	 */
	protected String triggeredAction = TRIGGERED_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerLevel LEVEL_EDEFAULT = TriggerLevel.ROW_LEVEL;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected TriggerLevel level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.TRIGGER_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(TriggerEvent newEvent) {
		TriggerEvent oldEvent = event;
		event = newEvent == null ? EVENT_EDEFAULT : newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER_DESCRIPTOR__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerActionTime getActionTime() {
		return actionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionTime(TriggerActionTime newActionTime) {
		TriggerActionTime oldActionTime = actionTime;
		actionTime = newActionTime == null ? ACTION_TIME_EDEFAULT : newActionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER_DESCRIPTOR__ACTION_TIME, oldActionTime, actionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggeredAction() {
		return triggeredAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredAction(String newTriggeredAction) {
		String oldTriggeredAction = triggeredAction;
		triggeredAction = newTriggeredAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGERED_ACTION, oldTriggeredAction, triggeredAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger() {
		if (eContainerFeatureID != SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER) return null;
		return (Trigger)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(Trigger newTrigger, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTrigger, SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Trigger newTrigger) {
		if (newTrigger != eInternalContainer() || (eContainerFeatureID != SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER && newTrigger != null)) {
			if (EcoreUtil.isAncestor(this, newTrigger))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, SQL2003_V2Package.TRIGGER__DESCRIPTION, Trigger.class, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(TriggerLevel newLevel) {
		TriggerLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER_DESCRIPTOR__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTrigger((Trigger)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER:
				return basicSetTrigger(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER:
				return eInternalContainer().eInverseRemove(this, SQL2003_V2Package.TRIGGER__DESCRIPTION, Trigger.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__EVENT:
				return getEvent();
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__ACTION_TIME:
				return getActionTime();
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGERED_ACTION:
				return getTriggeredAction();
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER:
				return getTrigger();
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__LEVEL:
				return getLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__EVENT:
				setEvent((TriggerEvent)newValue);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__ACTION_TIME:
				setActionTime((TriggerActionTime)newValue);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGERED_ACTION:
				setTriggeredAction((String)newValue);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER:
				setTrigger((Trigger)newValue);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__LEVEL:
				setLevel((TriggerLevel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__ACTION_TIME:
				setActionTime(ACTION_TIME_EDEFAULT);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGERED_ACTION:
				setTriggeredAction(TRIGGERED_ACTION_EDEFAULT);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER:
				setTrigger((Trigger)null);
				return;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__EVENT:
				return event != EVENT_EDEFAULT;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__ACTION_TIME:
				return actionTime != ACTION_TIME_EDEFAULT;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGERED_ACTION:
				return TRIGGERED_ACTION_EDEFAULT == null ? triggeredAction != null : !TRIGGERED_ACTION_EDEFAULT.equals(triggeredAction);
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER:
				return getTrigger() != null;
			case SQL2003_V2Package.TRIGGER_DESCRIPTOR__LEVEL:
				return level != LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (event: ");
		result.append(event);
		result.append(", actionTime: ");
		result.append(actionTime);
		result.append(", triggeredAction: ");
		result.append(triggeredAction);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //TriggerDescriptorImpl
