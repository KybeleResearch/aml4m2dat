/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.DataType;
import SQL2003_V2.Function;
import SQL2003_V2.SQL2003_V2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.FunctionImpl#getReturn_type <em>Return type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends BehaviouralComponentImpl implements Function {
	/**
	 * The cached value of the '{@link #getReturn_type() <em>Return type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn_type()
	 * @generated
	 * @ordered
	 */
	protected DataType return_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturn_type() {
		if (return_type != null && return_type.eIsProxy()) {
			InternalEObject oldReturn_type = (InternalEObject)return_type;
			return_type = (DataType)eResolveProxy(oldReturn_type);
			if (return_type != oldReturn_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003_V2Package.FUNCTION__RETURN_TYPE, oldReturn_type, return_type));
			}
		}
		return return_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturn_type() {
		return return_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn_type(DataType newReturn_type) {
		DataType oldReturn_type = return_type;
		return_type = newReturn_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.FUNCTION__RETURN_TYPE, oldReturn_type, return_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQL2003_V2Package.FUNCTION__RETURN_TYPE:
				if (resolve) return getReturn_type();
				return basicGetReturn_type();
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
			case SQL2003_V2Package.FUNCTION__RETURN_TYPE:
				setReturn_type((DataType)newValue);
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
			case SQL2003_V2Package.FUNCTION__RETURN_TYPE:
				setReturn_type((DataType)null);
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
			case SQL2003_V2Package.FUNCTION__RETURN_TYPE:
				return return_type != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
