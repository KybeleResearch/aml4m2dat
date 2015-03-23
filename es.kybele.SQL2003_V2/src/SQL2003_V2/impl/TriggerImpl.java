/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.SQL2003_V2Package;
import SQL2003_V2.StructuralComponent;
import SQL2003_V2.Trigger;
import SQL2003_V2.TriggerDescriptor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_V2.impl.TriggerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SQL2003_V2.impl.TriggerImpl#getUpdateColumns <em>Update Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends RestrictionImpl implements Trigger {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected TriggerDescriptor description;

	/**
	 * The cached value of the '{@link #getUpdateColumns() <em>Update Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateColumns()
	 * @generated
	 * @ordered
	 */
	protected StructuralComponent updateColumns;

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
		return SQL2003_V2Package.Literals.TRIGGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDescriptor getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(TriggerDescriptor newDescription, NotificationChain msgs) {
		TriggerDescriptor oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(TriggerDescriptor newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER, TriggerDescriptor.class, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, SQL2003_V2Package.TRIGGER_DESCRIPTOR__TRIGGER, TriggerDescriptor.class, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralComponent getUpdateColumns() {
		if (updateColumns != null && updateColumns.eIsProxy()) {
			InternalEObject oldUpdateColumns = (InternalEObject)updateColumns;
			updateColumns = (StructuralComponent)eResolveProxy(oldUpdateColumns);
			if (updateColumns != oldUpdateColumns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003_V2Package.TRIGGER__UPDATE_COLUMNS, oldUpdateColumns, updateColumns));
			}
		}
		return updateColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralComponent basicGetUpdateColumns() {
		return updateColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateColumns(StructuralComponent newUpdateColumns) {
		StructuralComponent oldUpdateColumns = updateColumns;
		updateColumns = newUpdateColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.TRIGGER__UPDATE_COLUMNS, oldUpdateColumns, updateColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER__DESCRIPTION:
				if (description != null)
					msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQL2003_V2Package.TRIGGER__DESCRIPTION, null, msgs);
				return basicSetDescription((TriggerDescriptor)otherEnd, msgs);
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
			case SQL2003_V2Package.TRIGGER__DESCRIPTION:
				return basicSetDescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQL2003_V2Package.TRIGGER__NAME:
				return getName();
			case SQL2003_V2Package.TRIGGER__DESCRIPTION:
				return getDescription();
			case SQL2003_V2Package.TRIGGER__UPDATE_COLUMNS:
				if (resolve) return getUpdateColumns();
				return basicGetUpdateColumns();
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
			case SQL2003_V2Package.TRIGGER__NAME:
				setName((String)newValue);
				return;
			case SQL2003_V2Package.TRIGGER__DESCRIPTION:
				setDescription((TriggerDescriptor)newValue);
				return;
			case SQL2003_V2Package.TRIGGER__UPDATE_COLUMNS:
				setUpdateColumns((StructuralComponent)newValue);
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
			case SQL2003_V2Package.TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQL2003_V2Package.TRIGGER__DESCRIPTION:
				setDescription((TriggerDescriptor)null);
				return;
			case SQL2003_V2Package.TRIGGER__UPDATE_COLUMNS:
				setUpdateColumns((StructuralComponent)null);
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
			case SQL2003_V2Package.TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQL2003_V2Package.TRIGGER__DESCRIPTION:
				return description != null;
			case SQL2003_V2Package.TRIGGER__UPDATE_COLUMNS:
				return updateColumns != null;
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
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
