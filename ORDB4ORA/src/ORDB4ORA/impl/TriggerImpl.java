/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.Column;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.StructuralComponent;
import ORDB4ORA.Table;
import ORDB4ORA.Trigger;
import ORDB4ORA.TriggerActionTime;
import ORDB4ORA.TriggerEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.impl.TriggerImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ORDB4ORA.impl.TriggerImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link ORDB4ORA.impl.TriggerImpl#getAction <em>Action</em>}</li>
 *   <li>{@link ORDB4ORA.impl.TriggerImpl#getUpdateColumns <em>Update Columns</em>}</li>
 *   <li>{@link ORDB4ORA.impl.TriggerImpl#getTable <em>Table</em>}</li>
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerEvent> event;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerActionTime ACTION_EDEFAULT = TriggerActionTime.BEFORE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected TriggerActionTime action = ACTION_EDEFAULT;

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
		return ORDB4ORAPackage.Literals.TRIGGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.TRIGGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.TRIGGER__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerEvent> getEvent() {
		if (event == null) {
			event = new EDataTypeUniqueEList<TriggerEvent>(TriggerEvent.class, this, ORDB4ORAPackage.TRIGGER__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerActionTime getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(TriggerActionTime newAction) {
		TriggerActionTime oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.TRIGGER__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralComponent> getUpdateColumns() {
		if (updateColumns == null) {
			updateColumns = new EObjectResolvingEList<StructuralComponent>(StructuralComponent.class, this, ORDB4ORAPackage.TRIGGER__UPDATE_COLUMNS);
		}
		return updateColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (eContainerFeatureID() != ORDB4ORAPackage.TRIGGER__TABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, ORDB4ORAPackage.TRIGGER__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != ORDB4ORAPackage.TRIGGER__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, ORDB4ORAPackage.TABLE__TRIGGERS, Table.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.TRIGGER__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ORDB4ORAPackage.TRIGGER__TABLE:
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
			case ORDB4ORAPackage.TRIGGER__TABLE:
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
			case ORDB4ORAPackage.TRIGGER__TABLE:
				return eInternalContainer().eInverseRemove(this, ORDB4ORAPackage.TABLE__TRIGGERS, Table.class, msgs);
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
			case ORDB4ORAPackage.TRIGGER__NAME:
				return getName();
			case ORDB4ORAPackage.TRIGGER__BODY:
				return getBody();
			case ORDB4ORAPackage.TRIGGER__EVENT:
				return getEvent();
			case ORDB4ORAPackage.TRIGGER__ACTION:
				return getAction();
			case ORDB4ORAPackage.TRIGGER__UPDATE_COLUMNS:
				return getUpdateColumns();
			case ORDB4ORAPackage.TRIGGER__TABLE:
				return getTable();
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
			case ORDB4ORAPackage.TRIGGER__NAME:
				setName((String)newValue);
				return;
			case ORDB4ORAPackage.TRIGGER__BODY:
				setBody((String)newValue);
				return;
			case ORDB4ORAPackage.TRIGGER__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends TriggerEvent>)newValue);
				return;
			case ORDB4ORAPackage.TRIGGER__ACTION:
				setAction((TriggerActionTime)newValue);
				return;
			case ORDB4ORAPackage.TRIGGER__UPDATE_COLUMNS:
				getUpdateColumns().clear();
				getUpdateColumns().addAll((Collection<? extends StructuralComponent>)newValue);
				return;
			case ORDB4ORAPackage.TRIGGER__TABLE:
				setTable((Table)newValue);
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
			case ORDB4ORAPackage.TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ORDB4ORAPackage.TRIGGER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case ORDB4ORAPackage.TRIGGER__EVENT:
				getEvent().clear();
				return;
			case ORDB4ORAPackage.TRIGGER__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case ORDB4ORAPackage.TRIGGER__UPDATE_COLUMNS:
				getUpdateColumns().clear();
				return;
			case ORDB4ORAPackage.TRIGGER__TABLE:
				setTable((Table)null);
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
			case ORDB4ORAPackage.TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ORDB4ORAPackage.TRIGGER__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case ORDB4ORAPackage.TRIGGER__EVENT:
				return event != null && !event.isEmpty();
			case ORDB4ORAPackage.TRIGGER__ACTION:
				return action != ACTION_EDEFAULT;
			case ORDB4ORAPackage.TRIGGER__UPDATE_COLUMNS:
				return updateColumns != null && !updateColumns.isEmpty();
			case ORDB4ORAPackage.TRIGGER__TABLE:
				return getTable() != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Body: ");
		result.append(body);
		result.append(", Event: ");
		result.append(event);
		result.append(", Action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
