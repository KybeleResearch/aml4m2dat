/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.Attribute;
import SQL2003_V2.Method;
import SQL2003_V2.SQL2003_V2Package;
import SQL2003_V2.StructuredType;
import SQL2003_V2.TypedTable;

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
 * An implementation of the model object '<em><b>Structured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.StructuredTypeImpl#isIs_final <em>Is final</em>}</li>
 *   <li>{@link SQL2003_V2.impl.StructuredTypeImpl#isIs_instantiable <em>Is instantiable</em>}</li>
 *   <li>{@link SQL2003_V2.impl.StructuredTypeImpl#getSuper_type <em>Super type</em>}</li>
 *   <li>{@link SQL2003_V2.impl.StructuredTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link SQL2003_V2.impl.StructuredTypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link SQL2003_V2.impl.StructuredTypeImpl#getTyped <em>Typed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredTypeImpl extends UserDefinedTypeImpl implements StructuredType {
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
	 * The cached value of the '{@link #getSuper_type() <em>Super type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper_type()
	 * @generated
	 * @ordered
	 */
	protected StructuredType super_type;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getTyped() <em>Typed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyped()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedTable> typed;

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
		return SQL2003_V2Package.Literals.STRUCTURED_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.STRUCTURED_TYPE__IS_FINAL, oldIs_final, is_final));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.STRUCTURED_TYPE__IS_INSTANTIABLE, oldIs_instantiable, is_instantiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType getSuper_type() {
		if (super_type != null && super_type.eIsProxy()) {
			InternalEObject oldSuper_type = (InternalEObject)super_type;
			super_type = (StructuredType)eResolveProxy(oldSuper_type);
			if (super_type != oldSuper_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003_V2Package.STRUCTURED_TYPE__SUPER_TYPE, oldSuper_type, super_type));
			}
		}
		return super_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType basicGetSuper_type() {
		return super_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper_type(StructuredType newSuper_type) {
		StructuredType oldSuper_type = super_type;
		super_type = newSuper_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.STRUCTURED_TYPE__SUPER_TYPE, oldSuper_type, super_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, SQL2003_V2Package.STRUCTURED_TYPE__ATTRIBUTES, SQL2003_V2Package.ATTRIBUTE__STRUCTURED);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this, SQL2003_V2Package.STRUCTURED_TYPE__METHODS, SQL2003_V2Package.METHOD__STRUCTURED);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedTable> getTyped() {
		if (typed == null) {
			typed = new EObjectWithInverseResolvingEList<TypedTable>(TypedTable.class, this, SQL2003_V2Package.STRUCTURED_TYPE__TYPED, SQL2003_V2Package.TYPED_TABLE__STRUCTURED);
		}
		return typed;
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
			case SQL2003_V2Package.STRUCTURED_TYPE__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case SQL2003_V2Package.STRUCTURED_TYPE__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case SQL2003_V2Package.STRUCTURED_TYPE__TYPED:
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
			case SQL2003_V2Package.STRUCTURED_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SQL2003_V2Package.STRUCTURED_TYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case SQL2003_V2Package.STRUCTURED_TYPE__TYPED:
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
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_FINAL:
				return isIs_final() ? Boolean.TRUE : Boolean.FALSE;
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_INSTANTIABLE:
				return isIs_instantiable() ? Boolean.TRUE : Boolean.FALSE;
			case SQL2003_V2Package.STRUCTURED_TYPE__SUPER_TYPE:
				if (resolve) return getSuper_type();
				return basicGetSuper_type();
			case SQL2003_V2Package.STRUCTURED_TYPE__ATTRIBUTES:
				return getAttributes();
			case SQL2003_V2Package.STRUCTURED_TYPE__METHODS:
				return getMethods();
			case SQL2003_V2Package.STRUCTURED_TYPE__TYPED:
				return getTyped();
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
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_FINAL:
				setIs_final(((Boolean)newValue).booleanValue());
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_INSTANTIABLE:
				setIs_instantiable(((Boolean)newValue).booleanValue());
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__SUPER_TYPE:
				setSuper_type((StructuredType)newValue);
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__TYPED:
				getTyped().clear();
				getTyped().addAll((Collection<? extends TypedTable>)newValue);
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
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_FINAL:
				setIs_final(IS_FINAL_EDEFAULT);
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_INSTANTIABLE:
				setIs_instantiable(IS_INSTANTIABLE_EDEFAULT);
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__SUPER_TYPE:
				setSuper_type((StructuredType)null);
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__METHODS:
				getMethods().clear();
				return;
			case SQL2003_V2Package.STRUCTURED_TYPE__TYPED:
				getTyped().clear();
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
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_FINAL:
				return is_final != IS_FINAL_EDEFAULT;
			case SQL2003_V2Package.STRUCTURED_TYPE__IS_INSTANTIABLE:
				return is_instantiable != IS_INSTANTIABLE_EDEFAULT;
			case SQL2003_V2Package.STRUCTURED_TYPE__SUPER_TYPE:
				return super_type != null;
			case SQL2003_V2Package.STRUCTURED_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SQL2003_V2Package.STRUCTURED_TYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case SQL2003_V2Package.STRUCTURED_TYPE__TYPED:
				return typed != null && !typed.isEmpty();
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
		result.append(" (is_final: ");
		result.append(is_final);
		result.append(", is_instantiable: ");
		result.append(is_instantiable);
		result.append(')');
		return result.toString();
	}

} //StructuredTypeImpl
