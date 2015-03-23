/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.BinaryStringType;
import SQL2003_V2.BinaryStringTypes;
import SQL2003_V2.SQL2003_V2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.BinaryStringTypeImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link SQL2003_V2.impl.BinaryStringTypeImpl#getLength_def <em>Length def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryStringTypeImpl extends PredefinedTypeImpl implements BinaryStringType {
	/**
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryStringTypes DESCRIPTOR_EDEFAULT = BinaryStringTypes.BINARYLARGEOBJECT;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected BinaryStringTypes descriptor = DESCRIPTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength_def() <em>Length def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength_def()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_DEF_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getLength_def() <em>Length def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength_def()
	 * @generated
	 * @ordered
	 */
	protected Integer length_def = LENGTH_DEF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryStringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.BINARY_STRING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryStringTypes getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(BinaryStringTypes newDescriptor) {
		BinaryStringTypes oldDescriptor = descriptor;
		descriptor = newDescriptor == null ? DESCRIPTOR_EDEFAULT : newDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.BINARY_STRING_TYPE__DESCRIPTOR, oldDescriptor, descriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLength_def() {
		return length_def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength_def(Integer newLength_def) {
		Integer oldLength_def = length_def;
		length_def = newLength_def;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.BINARY_STRING_TYPE__LENGTH_DEF, oldLength_def, length_def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQL2003_V2Package.BINARY_STRING_TYPE__DESCRIPTOR:
				return getDescriptor();
			case SQL2003_V2Package.BINARY_STRING_TYPE__LENGTH_DEF:
				return getLength_def();
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
			case SQL2003_V2Package.BINARY_STRING_TYPE__DESCRIPTOR:
				setDescriptor((BinaryStringTypes)newValue);
				return;
			case SQL2003_V2Package.BINARY_STRING_TYPE__LENGTH_DEF:
				setLength_def((Integer)newValue);
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
			case SQL2003_V2Package.BINARY_STRING_TYPE__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
				return;
			case SQL2003_V2Package.BINARY_STRING_TYPE__LENGTH_DEF:
				setLength_def(LENGTH_DEF_EDEFAULT);
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
			case SQL2003_V2Package.BINARY_STRING_TYPE__DESCRIPTOR:
				return descriptor != DESCRIPTOR_EDEFAULT;
			case SQL2003_V2Package.BINARY_STRING_TYPE__LENGTH_DEF:
				return LENGTH_DEF_EDEFAULT == null ? length_def != null : !LENGTH_DEF_EDEFAULT.equals(length_def);
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
		result.append(" (descriptor: ");
		result.append(descriptor);
		result.append(", length_def: ");
		result.append(length_def);
		result.append(')');
		return result.toString();
	}

} //BinaryStringTypeImpl
