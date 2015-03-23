/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo.impl;

import SQL2003_evo.ARRAY;
import SQL2003_evo.SQL2003_evoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARRAY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_evo.impl.ARRAYImpl#getNum_elements <em>Num elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ARRAYImpl extends CollectionTypeImpl implements ARRAY {
	/**
	 * The default value of the '{@link #getNum_elements() <em>Num elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_elements()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNum_elements() <em>Num elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_elements()
	 * @generated
	 * @ordered
	 */
	protected Integer num_elements = NUM_ELEMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARRAYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_evoPackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNum_elements() {
		return num_elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_elements(Integer newNum_elements) {
		Integer oldNum_elements = num_elements;
		num_elements = newNum_elements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_evoPackage.ARRAY__NUM_ELEMENTS, oldNum_elements, num_elements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQL2003_evoPackage.ARRAY__NUM_ELEMENTS:
				return getNum_elements();
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
			case SQL2003_evoPackage.ARRAY__NUM_ELEMENTS:
				setNum_elements((Integer)newValue);
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
			case SQL2003_evoPackage.ARRAY__NUM_ELEMENTS:
				setNum_elements(NUM_ELEMENTS_EDEFAULT);
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
			case SQL2003_evoPackage.ARRAY__NUM_ELEMENTS:
				return NUM_ELEMENTS_EDEFAULT == null ? num_elements != null : !NUM_ELEMENTS_EDEFAULT.equals(num_elements);
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
		result.append(" (num_elements: ");
		result.append(num_elements);
		result.append(')');
		return result.toString();
	}

} //ARRAYImpl
