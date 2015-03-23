/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003.impl;

import SQL2003.SQL2003Package;
import SQL2003.StructuredType;
import SQL2003.TypedTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003.impl.TypedTableImpl#getStructured <em>Structured</em>}</li>
 *   <li>{@link SQL2003.impl.TypedTableImpl#getSupertable <em>Supertable</em>}</li>
 *   <li>{@link SQL2003.impl.TypedTableImpl#getSubtables <em>Subtables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedTableImpl extends BaseTableImpl implements TypedTable {
	/**
	 * The cached value of the '{@link #getStructured() <em>Structured</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructured()
	 * @generated
	 * @ordered
	 */
	protected StructuredType structured;

	/**
	 * The cached value of the '{@link #getSupertable() <em>Supertable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertable()
	 * @generated
	 * @ordered
	 */
	protected TypedTable supertable;

	/**
	 * The cached value of the '{@link #getSubtables() <em>Subtables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtables()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedTable> subtables;

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
		return SQL2003Package.Literals.TYPED_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType getStructured() {
		if (structured != null && structured.eIsProxy()) {
			InternalEObject oldStructured = (InternalEObject)structured;
			structured = (StructuredType)eResolveProxy(oldStructured);
			if (structured != oldStructured) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003Package.TYPED_TABLE__STRUCTURED, oldStructured, structured));
			}
		}
		return structured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType basicGetStructured() {
		return structured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructured(StructuredType newStructured, NotificationChain msgs) {
		StructuredType oldStructured = structured;
		structured = newStructured;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQL2003Package.TYPED_TABLE__STRUCTURED, oldStructured, newStructured);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructured(StructuredType newStructured) {
		if (newStructured != structured) {
			NotificationChain msgs = null;
			if (structured != null)
				msgs = ((InternalEObject)structured).eInverseRemove(this, SQL2003Package.STRUCTURED_TYPE__TYPED, StructuredType.class, msgs);
			if (newStructured != null)
				msgs = ((InternalEObject)newStructured).eInverseAdd(this, SQL2003Package.STRUCTURED_TYPE__TYPED, StructuredType.class, msgs);
			msgs = basicSetStructured(newStructured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.TYPED_TABLE__STRUCTURED, newStructured, newStructured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedTable getSupertable() {
		if (supertable != null && supertable.eIsProxy()) {
			InternalEObject oldSupertable = (InternalEObject)supertable;
			supertable = (TypedTable)eResolveProxy(oldSupertable);
			if (supertable != oldSupertable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003Package.TYPED_TABLE__SUPERTABLE, oldSupertable, supertable));
			}
		}
		return supertable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedTable basicGetSupertable() {
		return supertable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertable(TypedTable newSupertable, NotificationChain msgs) {
		TypedTable oldSupertable = supertable;
		supertable = newSupertable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQL2003Package.TYPED_TABLE__SUPERTABLE, oldSupertable, newSupertable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertable(TypedTable newSupertable) {
		if (newSupertable != supertable) {
			NotificationChain msgs = null;
			if (supertable != null)
				msgs = ((InternalEObject)supertable).eInverseRemove(this, SQL2003Package.TYPED_TABLE__SUBTABLES, TypedTable.class, msgs);
			if (newSupertable != null)
				msgs = ((InternalEObject)newSupertable).eInverseAdd(this, SQL2003Package.TYPED_TABLE__SUBTABLES, TypedTable.class, msgs);
			msgs = basicSetSupertable(newSupertable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.TYPED_TABLE__SUPERTABLE, newSupertable, newSupertable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedTable> getSubtables() {
		if (subtables == null) {
			subtables = new EObjectWithInverseResolvingEList<TypedTable>(TypedTable.class, this, SQL2003Package.TYPED_TABLE__SUBTABLES, SQL2003Package.TYPED_TABLE__SUPERTABLE);
		}
		return subtables;
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
			case SQL2003Package.TYPED_TABLE__STRUCTURED:
				if (structured != null)
					msgs = ((InternalEObject)structured).eInverseRemove(this, SQL2003Package.STRUCTURED_TYPE__TYPED, StructuredType.class, msgs);
				return basicSetStructured((StructuredType)otherEnd, msgs);
			case SQL2003Package.TYPED_TABLE__SUPERTABLE:
				if (supertable != null)
					msgs = ((InternalEObject)supertable).eInverseRemove(this, SQL2003Package.TYPED_TABLE__SUBTABLES, TypedTable.class, msgs);
				return basicSetSupertable((TypedTable)otherEnd, msgs);
			case SQL2003Package.TYPED_TABLE__SUBTABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubtables()).basicAdd(otherEnd, msgs);
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
			case SQL2003Package.TYPED_TABLE__STRUCTURED:
				return basicSetStructured(null, msgs);
			case SQL2003Package.TYPED_TABLE__SUPERTABLE:
				return basicSetSupertable(null, msgs);
			case SQL2003Package.TYPED_TABLE__SUBTABLES:
				return ((InternalEList<?>)getSubtables()).basicRemove(otherEnd, msgs);
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
			case SQL2003Package.TYPED_TABLE__STRUCTURED:
				if (resolve) return getStructured();
				return basicGetStructured();
			case SQL2003Package.TYPED_TABLE__SUPERTABLE:
				if (resolve) return getSupertable();
				return basicGetSupertable();
			case SQL2003Package.TYPED_TABLE__SUBTABLES:
				return getSubtables();
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
			case SQL2003Package.TYPED_TABLE__STRUCTURED:
				setStructured((StructuredType)newValue);
				return;
			case SQL2003Package.TYPED_TABLE__SUPERTABLE:
				setSupertable((TypedTable)newValue);
				return;
			case SQL2003Package.TYPED_TABLE__SUBTABLES:
				getSubtables().clear();
				getSubtables().addAll((Collection<? extends TypedTable>)newValue);
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
			case SQL2003Package.TYPED_TABLE__STRUCTURED:
				setStructured((StructuredType)null);
				return;
			case SQL2003Package.TYPED_TABLE__SUPERTABLE:
				setSupertable((TypedTable)null);
				return;
			case SQL2003Package.TYPED_TABLE__SUBTABLES:
				getSubtables().clear();
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
			case SQL2003Package.TYPED_TABLE__STRUCTURED:
				return structured != null;
			case SQL2003Package.TYPED_TABLE__SUPERTABLE:
				return supertable != null;
			case SQL2003Package.TYPED_TABLE__SUBTABLES:
				return subtables != null && !subtables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypedTableImpl
