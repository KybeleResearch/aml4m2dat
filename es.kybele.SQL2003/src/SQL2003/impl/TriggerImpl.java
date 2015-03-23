/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003.impl;

import SQL2003.SQL2003Package;
import SQL2003.StructuralComponent;
import SQL2003.Table;
import SQL2003.Trigger;
import SQL2003.TriggerActionTime;
import SQL2003.TriggerEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003.impl.TriggerImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link SQL2003.impl.TriggerImpl#getActionTime <em>Action Time</em>}</li>
 *   <li>{@link SQL2003.impl.TriggerImpl#getTable <em>Table</em>}</li>
 *   <li>{@link SQL2003.impl.TriggerImpl#getTriggeredAction <em>Triggered Action</em>}</li>
 *   <li>{@link SQL2003.impl.TriggerImpl#getUpdateColumns <em>Update Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends EObjectImpl implements Trigger {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getUpdateColumns() <em>Update Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralComponent> updateColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003Package.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.TRIGGER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.TRIGGER__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.TRIGGER__ACTION_TIME, oldActionTime, actionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (eContainerFeatureID() != SQL2003Package.TRIGGER__TABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, SQL2003Package.TRIGGER__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != SQL2003Package.TRIGGER__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, SQL2003Package.TABLE__TRIGGERS, Table.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.TRIGGER__TABLE, newTable, newTable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.TRIGGER__TRIGGERED_ACTION, oldTriggeredAction, triggeredAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralComponent> getUpdateColumns() {
		if (updateColumns == null) {
			updateColumns = new EObjectResolvingEList<StructuralComponent>(StructuralComponent.class, this, SQL2003Package.TRIGGER__UPDATE_COLUMNS);
		}
		return updateColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SQL2003Package.TRIGGER__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((Table)otherEnd, msgs);
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
			case SQL2003Package.TRIGGER__TABLE:
				return basicSetTable(null, msgs);
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
		switch (eContainerFeatureID()) {
			case SQL2003Package.TRIGGER__TABLE:
				return eInternalContainer().eInverseRemove(this, SQL2003Package.TABLE__TRIGGERS, Table.class, msgs);
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
			case SQL2003Package.TRIGGER__NAME:
				return getName();
			case SQL2003Package.TRIGGER__EVENT:
				return getEvent();
			case SQL2003Package.TRIGGER__ACTION_TIME:
				return getActionTime();
			case SQL2003Package.TRIGGER__TABLE:
				return getTable();
			case SQL2003Package.TRIGGER__TRIGGERED_ACTION:
				return getTriggeredAction();
			case SQL2003Package.TRIGGER__UPDATE_COLUMNS:
				return getUpdateColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SQL2003Package.TRIGGER__NAME:
				setName((String)newValue);
				return;
			case SQL2003Package.TRIGGER__EVENT:
				setEvent((TriggerEvent)newValue);
				return;
			case SQL2003Package.TRIGGER__ACTION_TIME:
				setActionTime((TriggerActionTime)newValue);
				return;
			case SQL2003Package.TRIGGER__TABLE:
				setTable((Table)newValue);
				return;
			case SQL2003Package.TRIGGER__TRIGGERED_ACTION:
				setTriggeredAction((String)newValue);
				return;
			case SQL2003Package.TRIGGER__UPDATE_COLUMNS:
				getUpdateColumns().clear();
				getUpdateColumns().addAll((Collection<? extends StructuralComponent>)newValue);
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
			case SQL2003Package.TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQL2003Package.TRIGGER__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case SQL2003Package.TRIGGER__ACTION_TIME:
				setActionTime(ACTION_TIME_EDEFAULT);
				return;
			case SQL2003Package.TRIGGER__TABLE:
				setTable((Table)null);
				return;
			case SQL2003Package.TRIGGER__TRIGGERED_ACTION:
				setTriggeredAction(TRIGGERED_ACTION_EDEFAULT);
				return;
			case SQL2003Package.TRIGGER__UPDATE_COLUMNS:
				getUpdateColumns().clear();
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
			case SQL2003Package.TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQL2003Package.TRIGGER__EVENT:
				return event != EVENT_EDEFAULT;
			case SQL2003Package.TRIGGER__ACTION_TIME:
				return actionTime != ACTION_TIME_EDEFAULT;
			case SQL2003Package.TRIGGER__TABLE:
				return getTable() != null;
			case SQL2003Package.TRIGGER__TRIGGERED_ACTION:
				return TRIGGERED_ACTION_EDEFAULT == null ? triggeredAction != null : !TRIGGERED_ACTION_EDEFAULT.equals(triggeredAction);
			case SQL2003Package.TRIGGER__UPDATE_COLUMNS:
				return updateColumns != null && !updateColumns.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", event: ");
		result.append(event);
		result.append(", actionTime: ");
		result.append(actionTime);
		result.append(", triggeredAction: ");
		result.append(triggeredAction);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
