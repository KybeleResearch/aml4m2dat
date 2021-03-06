/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003.impl;

import SQL2003.DataType;
import SQL2003.Feature;
import SQL2003.Restriction;
import SQL2003.SQL2003Package;
import SQL2003.StructuralComponent;
import SQL2003.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003.impl.StructuralComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003.impl.StructuralComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link SQL2003.impl.StructuralComponentImpl#getViews <em>Views</em>}</li>
 *   <li>{@link SQL2003.impl.StructuralComponentImpl#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link SQL2003.impl.StructuralComponentImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuralComponentImpl extends EObjectImpl implements StructuralComponent {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<Restriction> restrictions;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003Package.Literals.STRUCTURAL_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.STRUCTURAL_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003Package.STRUCTURAL_COMPONENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003Package.STRUCTURAL_COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectWithInverseResolvingEList.ManyInverse<View>(View.class, this, SQL2003Package.STRUCTURAL_COMPONENT__VIEWS, SQL2003Package.VIEW__COMPONENTS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Restriction> getRestrictions() {
		if (restrictions == null) {
			restrictions = new EObjectWithInverseResolvingEList.ManyInverse<Restriction>(Restriction.class, this, SQL2003Package.STRUCTURAL_COMPONENT__RESTRICTIONS, SQL2003Package.RESTRICTION__COLUMNS);
		}
		return restrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, SQL2003Package.STRUCTURAL_COMPONENT__FEATURES);
		}
		return features;
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
			case SQL2003Package.STRUCTURAL_COMPONENT__VIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViews()).basicAdd(otherEnd, msgs);
			case SQL2003Package.STRUCTURAL_COMPONENT__RESTRICTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRestrictions()).basicAdd(otherEnd, msgs);
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
			case SQL2003Package.STRUCTURAL_COMPONENT__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case SQL2003Package.STRUCTURAL_COMPONENT__RESTRICTIONS:
				return ((InternalEList<?>)getRestrictions()).basicRemove(otherEnd, msgs);
			case SQL2003Package.STRUCTURAL_COMPONENT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case SQL2003Package.STRUCTURAL_COMPONENT__NAME:
				return getName();
			case SQL2003Package.STRUCTURAL_COMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SQL2003Package.STRUCTURAL_COMPONENT__VIEWS:
				return getViews();
			case SQL2003Package.STRUCTURAL_COMPONENT__RESTRICTIONS:
				return getRestrictions();
			case SQL2003Package.STRUCTURAL_COMPONENT__FEATURES:
				return getFeatures();
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
			case SQL2003Package.STRUCTURAL_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__TYPE:
				setType((DataType)newValue);
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__RESTRICTIONS:
				getRestrictions().clear();
				getRestrictions().addAll((Collection<? extends Restriction>)newValue);
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case SQL2003Package.STRUCTURAL_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__TYPE:
				setType((DataType)null);
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__VIEWS:
				getViews().clear();
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__RESTRICTIONS:
				getRestrictions().clear();
				return;
			case SQL2003Package.STRUCTURAL_COMPONENT__FEATURES:
				getFeatures().clear();
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
			case SQL2003Package.STRUCTURAL_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQL2003Package.STRUCTURAL_COMPONENT__TYPE:
				return type != null;
			case SQL2003Package.STRUCTURAL_COMPONENT__VIEWS:
				return views != null && !views.isEmpty();
			case SQL2003Package.STRUCTURAL_COMPONENT__RESTRICTIONS:
				return restrictions != null && !restrictions.isEmpty();
			case SQL2003Package.STRUCTURAL_COMPONENT__FEATURES:
				return features != null && !features.isEmpty();
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

} //StructuralComponentImpl
