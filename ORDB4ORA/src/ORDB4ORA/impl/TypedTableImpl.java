/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.StoredNestedTable;
import ORDB4ORA.StructuredType;
import ORDB4ORA.TypedTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.TypedTableImpl#getStoredNested <em>Stored Nested</em>}</li>
 *   <li>{@link ORDB4ORA.impl.TypedTableImpl#getStructuredType <em>Structured Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedTableImpl extends TableImpl implements TypedTable {
	/**
	 * The cached value of the '{@link #getStoredNested() <em>Stored Nested</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredNested()
	 * @generated
	 * @ordered
	 */
	protected EList<StoredNestedTable> storedNested;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.TYPED_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoredNestedTable> getStoredNested() {
		if (storedNested == null) {
			storedNested = new EObjectContainmentWithInverseEList<StoredNestedTable>(StoredNestedTable.class, this, ORDB4ORAPackage.TYPED_TABLE__STORED_NESTED, ORDB4ORAPackage.STORED_NESTED_TABLE__TYPED);
		}
		return storedNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType getStructuredType() {
		if (eContainerFeatureID() != ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE) return null;
		return (StructuredType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredType(StructuredType newStructuredType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructuredType, ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredType(StructuredType newStructuredType) {
		if (newStructuredType != eInternalContainer() || (eContainerFeatureID() != ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE && newStructuredType != null)) {
			if (EcoreUtil.isAncestor(this, newStructuredType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructuredType != null)
				msgs = ((InternalEObject)newStructuredType).eInverseAdd(this, ORDB4ORAPackage.STRUCTURED_TYPE__TYPED, StructuredType.class, msgs);
			msgs = basicSetStructuredType(newStructuredType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE, newStructuredType, newStructuredType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ORDB4ORAPackage.TYPED_TABLE__STORED_NESTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoredNested()).basicAdd(otherEnd, msgs);
			case ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructuredType((StructuredType)otherEnd, msgs);
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
			case ORDB4ORAPackage.TYPED_TABLE__STORED_NESTED:
				return ((InternalEList<?>)getStoredNested()).basicRemove(otherEnd, msgs);
			case ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE:
				return basicSetStructuredType(null, msgs);
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
			case ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE:
				return eInternalContainer().eInverseRemove(this, ORDB4ORAPackage.STRUCTURED_TYPE__TYPED, StructuredType.class, msgs);
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
			case ORDB4ORAPackage.TYPED_TABLE__STORED_NESTED:
				return getStoredNested();
			case ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE:
				return getStructuredType();
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
			case ORDB4ORAPackage.TYPED_TABLE__STORED_NESTED:
				getStoredNested().clear();
				getStoredNested().addAll((Collection<? extends StoredNestedTable>)newValue);
				return;
			case ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE:
				setStructuredType((StructuredType)newValue);
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
			case ORDB4ORAPackage.TYPED_TABLE__STORED_NESTED:
				getStoredNested().clear();
				return;
			case ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE:
				setStructuredType((StructuredType)null);
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
			case ORDB4ORAPackage.TYPED_TABLE__STORED_NESTED:
				return storedNested != null && !storedNested.isEmpty();
			case ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE:
				return getStructuredType() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypedTableImpl
