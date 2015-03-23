/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.Attribute;
import ORDB4ORA.Method;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.StructuredType;
import ORDB4ORA.TypedTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.StructuredTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.impl.StructuredTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link ORDB4ORA.impl.StructuredTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link ORDB4ORA.impl.StructuredTypeImpl#getTyped <em>Typed</em>}</li>
 *   <li>{@link ORDB4ORA.impl.StructuredTypeImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link ORDB4ORA.impl.StructuredTypeImpl#isIs_instantiable <em>Is instantiable</em>}</li>
 *   <li>{@link ORDB4ORA.impl.StructuredTypeImpl#isIs_final <em>Is final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredTypeImpl extends DatatypeImpl implements StructuredType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * The cached value of the '{@link #getTyped() <em>Typed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyped()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedTable> typed;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected StructuredType supertype;

	/**
	 * The default value of the '{@link #isIs_instantiable() <em>Is instantiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_instantiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INSTANTIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_instantiable() <em>Is instantiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_instantiable()
	 * @generated
	 * @ordered
	 */
	protected boolean is_instantiable = IS_INSTANTIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_final() <em>Is final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_final()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_final() <em>Is final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_final()
	 * @generated
	 * @ordered
	 */
	protected boolean is_final = IS_FINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.STRUCTURED_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.STRUCTURED_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, ORDB4ORAPackage.STRUCTURED_TYPE__ATTRIBUTE, ORDB4ORAPackage.ATTRIBUTE__STRUCTURED);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectContainmentWithInverseEList<Method>(Method.class, this, ORDB4ORAPackage.STRUCTURED_TYPE__METHOD, ORDB4ORAPackage.METHOD__STRUCTURED);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedTable> getTyped() {
		if (typed == null) {
			typed = new EObjectContainmentWithInverseEList<TypedTable>(TypedTable.class, this, ORDB4ORAPackage.STRUCTURED_TYPE__TYPED, ORDB4ORAPackage.TYPED_TABLE__STRUCTURED_TYPE);
		}
		return typed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject)supertype;
			supertype = (StructuredType)eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ORDB4ORAPackage.STRUCTURED_TYPE__SUPERTYPE, oldSupertype, supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType basicGetSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(StructuredType newSupertype) {
		StructuredType oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.STRUCTURED_TYPE__SUPERTYPE, oldSupertype, supertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_instantiable() {
		return is_instantiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_instantiable(boolean newIs_instantiable) {
		boolean oldIs_instantiable = is_instantiable;
		is_instantiable = newIs_instantiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.STRUCTURED_TYPE__IS_INSTANTIABLE, oldIs_instantiable, is_instantiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_final() {
		return is_final;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_final(boolean newIs_final) {
		boolean oldIs_final = is_final;
		is_final = newIs_final;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.STRUCTURED_TYPE__IS_FINAL, oldIs_final, is_final));
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
			case ORDB4ORAPackage.STRUCTURED_TYPE__ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttribute()).basicAdd(otherEnd, msgs);
			case ORDB4ORAPackage.STRUCTURED_TYPE__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
			case ORDB4ORAPackage.STRUCTURED_TYPE__TYPED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTyped()).basicAdd(otherEnd, msgs);
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
			case ORDB4ORAPackage.STRUCTURED_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case ORDB4ORAPackage.STRUCTURED_TYPE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case ORDB4ORAPackage.STRUCTURED_TYPE__TYPED:
				return ((InternalEList<?>)getTyped()).basicRemove(otherEnd, msgs);
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
			case ORDB4ORAPackage.STRUCTURED_TYPE__NAME:
				return getName();
			case ORDB4ORAPackage.STRUCTURED_TYPE__ATTRIBUTE:
				return getAttribute();
			case ORDB4ORAPackage.STRUCTURED_TYPE__METHOD:
				return getMethod();
			case ORDB4ORAPackage.STRUCTURED_TYPE__TYPED:
				return getTyped();
			case ORDB4ORAPackage.STRUCTURED_TYPE__SUPERTYPE:
				if (resolve) return getSupertype();
				return basicGetSupertype();
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_INSTANTIABLE:
				return isIs_instantiable();
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_FINAL:
				return isIs_final();
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
			case ORDB4ORAPackage.STRUCTURED_TYPE__NAME:
				setName((String)newValue);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Method>)newValue);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__TYPED:
				getTyped().clear();
				getTyped().addAll((Collection<? extends TypedTable>)newValue);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__SUPERTYPE:
				setSupertype((StructuredType)newValue);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_INSTANTIABLE:
				setIs_instantiable((Boolean)newValue);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_FINAL:
				setIs_final((Boolean)newValue);
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
			case ORDB4ORAPackage.STRUCTURED_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__METHOD:
				getMethod().clear();
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__TYPED:
				getTyped().clear();
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__SUPERTYPE:
				setSupertype((StructuredType)null);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_INSTANTIABLE:
				setIs_instantiable(IS_INSTANTIABLE_EDEFAULT);
				return;
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_FINAL:
				setIs_final(IS_FINAL_EDEFAULT);
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
			case ORDB4ORAPackage.STRUCTURED_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ORDB4ORAPackage.STRUCTURED_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case ORDB4ORAPackage.STRUCTURED_TYPE__METHOD:
				return method != null && !method.isEmpty();
			case ORDB4ORAPackage.STRUCTURED_TYPE__TYPED:
				return typed != null && !typed.isEmpty();
			case ORDB4ORAPackage.STRUCTURED_TYPE__SUPERTYPE:
				return supertype != null;
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_INSTANTIABLE:
				return is_instantiable != IS_INSTANTIABLE_EDEFAULT;
			case ORDB4ORAPackage.STRUCTURED_TYPE__IS_FINAL:
				return is_final != IS_FINAL_EDEFAULT;
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
		result.append(", is_instantiable: ");
		result.append(is_instantiable);
		result.append(", is_final: ");
		result.append(is_final);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String friendlyName() {
		if (eIsProxy()) return super.toString();
		return name;
	}


} //StructuredTypeImpl
