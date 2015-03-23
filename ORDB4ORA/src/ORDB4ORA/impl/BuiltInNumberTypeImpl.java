/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.BuiltInNumberType;
import ORDB4ORA.BuiltNumberTypes;
import ORDB4ORA.ORDB4ORAPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.BuiltInNumberTypeImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInNumberTypeImpl#getPrecision_Mn <em>Precision Mn</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInNumberTypeImpl#getPrecision_Max <em>Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInNumberTypeImpl#getScale_Min <em>Scale Min</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInNumberTypeImpl#getScale_Max <em>Scale Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInNumberTypeImpl extends BuiltInTypeImpl implements BuiltInNumberType {
	/**
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltNumberTypes DESCRIPTOR_EDEFAULT = BuiltNumberTypes.NUMBER;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected BuiltNumberTypes descriptor = DESCRIPTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision_Mn() <em>Precision Mn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision_Mn()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_MN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision_Mn() <em>Precision Mn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision_Mn()
	 * @generated
	 * @ordered
	 */
	protected int precision_Mn = PRECISION_MN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision_Max() <em>Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision_Max() <em>Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected int precision_Max = PRECISION_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale_Min() <em>Scale Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale_Min()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScale_Min() <em>Scale Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale_Min()
	 * @generated
	 * @ordered
	 */
	protected int scale_Min = SCALE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale_Max() <em>Scale Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale_Max()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScale_Max() <em>Scale Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale_Max()
	 * @generated
	 * @ordered
	 */
	protected int scale_Max = SCALE_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuiltInNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.BUILT_IN_NUMBER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltNumberTypes getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(BuiltNumberTypes newDescriptor) {
		BuiltNumberTypes oldDescriptor = descriptor;
		descriptor = newDescriptor == null ? DESCRIPTOR_EDEFAULT : newDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__DESCRIPTOR, oldDescriptor, descriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision_Mn() {
		return precision_Mn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision_Mn(int newPrecision_Mn) {
		int oldPrecision_Mn = precision_Mn;
		precision_Mn = newPrecision_Mn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MN, oldPrecision_Mn, precision_Mn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision_Max() {
		return precision_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision_Max(int newPrecision_Max) {
		int oldPrecision_Max = precision_Max;
		precision_Max = newPrecision_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MAX, oldPrecision_Max, precision_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScale_Min() {
		return scale_Min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale_Min(int newScale_Min) {
		int oldScale_Min = scale_Min;
		scale_Min = newScale_Min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MIN, oldScale_Min, scale_Min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScale_Max() {
		return scale_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale_Max(int newScale_Max) {
		int oldScale_Max = scale_Max;
		scale_Max = newScale_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MAX, oldScale_Max, scale_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__DESCRIPTOR:
				return getDescriptor();
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MN:
				return getPrecision_Mn();
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MAX:
				return getPrecision_Max();
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MIN:
				return getScale_Min();
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MAX:
				return getScale_Max();
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
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__DESCRIPTOR:
				setDescriptor((BuiltNumberTypes)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MN:
				setPrecision_Mn((Integer)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MAX:
				setPrecision_Max((Integer)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MIN:
				setScale_Min((Integer)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MAX:
				setScale_Max((Integer)newValue);
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
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MN:
				setPrecision_Mn(PRECISION_MN_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MAX:
				setPrecision_Max(PRECISION_MAX_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MIN:
				setScale_Min(SCALE_MIN_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MAX:
				setScale_Max(SCALE_MAX_EDEFAULT);
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
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__DESCRIPTOR:
				return descriptor != DESCRIPTOR_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MN:
				return precision_Mn != PRECISION_MN_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__PRECISION_MAX:
				return precision_Max != PRECISION_MAX_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MIN:
				return scale_Min != SCALE_MIN_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE__SCALE_MAX:
				return scale_Max != SCALE_MAX_EDEFAULT;
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
		result.append(", Precision_Mn: ");
		result.append(precision_Mn);
		result.append(", Precision_Max: ");
		result.append(precision_Max);
		result.append(", Scale_Min: ");
		result.append(scale_Min);
		result.append(", Scale_Max: ");
		result.append(scale_Max);
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

} //BuiltInNumberTypeImpl
