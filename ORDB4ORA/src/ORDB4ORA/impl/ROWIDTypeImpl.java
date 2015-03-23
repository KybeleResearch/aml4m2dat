/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.BuiltInROWIDType;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.ROWIDType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROWID Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.ROWIDTypeImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.impl.ROWIDTypeImpl#getSize_Min <em>Size Min</em>}</li>
 *   <li>{@link ORDB4ORA.impl.ROWIDTypeImpl#getSize_Max <em>Size Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROWIDTypeImpl extends BuiltInTypeImpl implements ROWIDType {
	/**
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInROWIDType DESCRIPTOR_EDEFAULT = BuiltInROWIDType.ROWID;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected BuiltInROWIDType descriptor = DESCRIPTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize_Min() <em>Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_Min()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize_Min() <em>Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_Min()
	 * @generated
	 * @ordered
	 */
	protected int size_Min = SIZE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize_Max() <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_Max()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize_Max() <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_Max()
	 * @generated
	 * @ordered
	 */
	protected int size_Max = SIZE_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROWIDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.ROWID_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInROWIDType getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(BuiltInROWIDType newDescriptor) {
		BuiltInROWIDType oldDescriptor = descriptor;
		descriptor = newDescriptor == null ? DESCRIPTOR_EDEFAULT : newDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.ROWID_TYPE__DESCRIPTOR, oldDescriptor, descriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize_Min() {
		return size_Min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize_Min(int newSize_Min) {
		int oldSize_Min = size_Min;
		size_Min = newSize_Min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.ROWID_TYPE__SIZE_MIN, oldSize_Min, size_Min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize_Max() {
		return size_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize_Max(int newSize_Max) {
		int oldSize_Max = size_Max;
		size_Max = newSize_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.ROWID_TYPE__SIZE_MAX, oldSize_Max, size_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ORDB4ORAPackage.ROWID_TYPE__DESCRIPTOR:
				return getDescriptor();
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MIN:
				return getSize_Min();
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MAX:
				return getSize_Max();
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
			case ORDB4ORAPackage.ROWID_TYPE__DESCRIPTOR:
				setDescriptor((BuiltInROWIDType)newValue);
				return;
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MIN:
				setSize_Min((Integer)newValue);
				return;
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MAX:
				setSize_Max((Integer)newValue);
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
			case ORDB4ORAPackage.ROWID_TYPE__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
				return;
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MIN:
				setSize_Min(SIZE_MIN_EDEFAULT);
				return;
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MAX:
				setSize_Max(SIZE_MAX_EDEFAULT);
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
			case ORDB4ORAPackage.ROWID_TYPE__DESCRIPTOR:
				return descriptor != DESCRIPTOR_EDEFAULT;
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MIN:
				return size_Min != SIZE_MIN_EDEFAULT;
			case ORDB4ORAPackage.ROWID_TYPE__SIZE_MAX:
				return size_Max != SIZE_MAX_EDEFAULT;
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
		result.append(" (Descriptor: ");
		result.append(descriptor);
		result.append(", Size_Min: ");
		result.append(size_Min);
		result.append(", Size_Max: ");
		result.append(size_Max);
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
		
		return descriptor.toString();
	}
} //ROWIDTypeImpl
