/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.DistinctType;
import SQL2003_V2.PredefinedType;
import SQL2003_V2.SQL2003_V2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predefined Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.PredefinedTypeImpl#getIs_source_of <em>Is source of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PredefinedTypeImpl extends DataTypeImpl implements PredefinedType {
	/**
	 * The cached value of the '{@link #getIs_source_of() <em>Is source of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_source_of()
	 * @generated
	 * @ordered
	 */
	protected EList<DistinctType> is_source_of;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.PREDEFINED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistinctType> getIs_source_of() {
		if (is_source_of == null) {
			is_source_of = new EObjectWithInverseResolvingEList<DistinctType>(DistinctType.class, this, SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF, SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE);
		}
		return is_source_of;
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
			case SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIs_source_of()).basicAdd(otherEnd, msgs);
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
			case SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF:
				return ((InternalEList<?>)getIs_source_of()).basicRemove(otherEnd, msgs);
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
			case SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF:
				return getIs_source_of();
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
			case SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF:
				getIs_source_of().clear();
				getIs_source_of().addAll((Collection<? extends DistinctType>)newValue);
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
			case SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF:
				getIs_source_of().clear();
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
			case SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF:
				return is_source_of != null && !is_source_of.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PredefinedTypeImpl
