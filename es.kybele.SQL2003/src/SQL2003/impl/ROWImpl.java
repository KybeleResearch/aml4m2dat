/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003.impl;

import SQL2003.Field;
import SQL2003.ROW;
import SQL2003.SQL2003Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003.impl.ROWImpl#getSuper_type <em>Super type</em>}</li>
 *   <li>{@link SQL2003.impl.ROWImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link SQL2003.impl.ROWImpl#getSub_types <em>Sub types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROWImpl extends ConstructedTypeImpl implements ROW {
	/**
	 * The cached value of the '{@link #getSuper_type() <em>Super type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper_type()
	 * @generated
	 * @ordered
	 */
	protected ROW super_type;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getSub_types() <em>Sub types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub_types()
	 * @generated
	 * @ordered
	 */
	protected EList<ROW> sub_types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROWImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003Package.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROW getSuper_type() {
		if (super_type != null && super_type.eIsProxy()) {
			InternalEObject oldSuper_type = (InternalEObject)super_type;
			super_type = (ROW)eResolveProxy(oldSuper_type);
			if (super_type != oldSuper_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003Package.ROW__SUPER_TYPE, oldSuper_type, super_type));
			}
		}
		return super_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROW basicGetSuper_type() {
		return super_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuper_type(ROW newSuper_type, NotificationChain msgs) {
		ROW oldSuper_type = super_type;
		super_type = newSuper_type;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQL2003Package.ROW__SUPER_TYPE, oldSuper_type, newSuper_type);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper_type(ROW newSuper_type) {
		if (newSuper_type != super_type) {
			NotificationChain msgs = null;
			if (super_type != null)
				msgs = ((InternalEObject)super_type).eInverseRemove(this, SQL2003Package.ROW__SUB_TYPES, ROW.class, msgs);
			if (newSuper_type != null)
				msgs = ((InternalEObject)newSuper_type).eInverseAdd(this, SQL2003Package.ROW__SUB_TYPES, ROW.class, msgs);
			msgs = basicSetSuper_type(newSuper_type, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.ROW__SUPER_TYPE, newSuper_type, newSuper_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<Field>(Field.class, this, SQL2003Package.ROW__FIELDS, SQL2003Package.FIELD__ROW);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROW> getSub_types() {
		if (sub_types == null) {
			sub_types = new EObjectWithInverseResolvingEList<ROW>(ROW.class, this, SQL2003Package.ROW__SUB_TYPES, SQL2003Package.ROW__SUPER_TYPE);
		}
		return sub_types;
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
			case SQL2003Package.ROW__SUPER_TYPE:
				if (super_type != null)
					msgs = ((InternalEObject)super_type).eInverseRemove(this, SQL2003Package.ROW__SUB_TYPES, ROW.class, msgs);
				return basicSetSuper_type((ROW)otherEnd, msgs);
			case SQL2003Package.ROW__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case SQL2003Package.ROW__SUB_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSub_types()).basicAdd(otherEnd, msgs);
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
			case SQL2003Package.ROW__SUPER_TYPE:
				return basicSetSuper_type(null, msgs);
			case SQL2003Package.ROW__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case SQL2003Package.ROW__SUB_TYPES:
				return ((InternalEList<?>)getSub_types()).basicRemove(otherEnd, msgs);
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
			case SQL2003Package.ROW__SUPER_TYPE:
				if (resolve) return getSuper_type();
				return basicGetSuper_type();
			case SQL2003Package.ROW__FIELDS:
				return getFields();
			case SQL2003Package.ROW__SUB_TYPES:
				return getSub_types();
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
			case SQL2003Package.ROW__SUPER_TYPE:
				setSuper_type((ROW)newValue);
				return;
			case SQL2003Package.ROW__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case SQL2003Package.ROW__SUB_TYPES:
				getSub_types().clear();
				getSub_types().addAll((Collection<? extends ROW>)newValue);
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
			case SQL2003Package.ROW__SUPER_TYPE:
				setSuper_type((ROW)null);
				return;
			case SQL2003Package.ROW__FIELDS:
				getFields().clear();
				return;
			case SQL2003Package.ROW__SUB_TYPES:
				getSub_types().clear();
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
			case SQL2003Package.ROW__SUPER_TYPE:
				return super_type != null;
			case SQL2003Package.ROW__FIELDS:
				return fields != null && !fields.isEmpty();
			case SQL2003Package.ROW__SUB_TYPES:
				return sub_types != null && !sub_types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROWImpl
