/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.BuiltInDatetimeTypes;
import ORDB4ORA.DatetimeType;
import ORDB4ORA.ORDB4ORAPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datetime Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getSecondPrecision_Min <em>Second Precision Min</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getSecondPrecision_Max <em>Second Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getSecondPrecision_Def <em>Second Precision Def</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getDayPrecision_Min <em>Day Precision Min</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getDayPrecision_Max <em>Day Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getDayPrecision_Def <em>Day Precision Def</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getYearPrecision_Min <em>Year Precision Min</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getYearPrecision_Max <em>Year Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.impl.DatetimeTypeImpl#getYearPrecision_Def <em>Year Precision Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatetimeTypeImpl extends BuiltInTypeImpl implements DatetimeType {
	/**
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInDatetimeTypes DESCRIPTOR_EDEFAULT = BuiltInDatetimeTypes.DATE;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected BuiltInDatetimeTypes descriptor = DESCRIPTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondPrecision_Min() <em>Second Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPrecision_Min()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_PRECISION_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecondPrecision_Min() <em>Second Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPrecision_Min()
	 * @generated
	 * @ordered
	 */
	protected int secondPrecision_Min = SECOND_PRECISION_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondPrecision_Max() <em>Second Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_PRECISION_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecondPrecision_Max() <em>Second Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected int secondPrecision_Max = SECOND_PRECISION_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondPrecision_Def() <em>Second Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPrecision_Def()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_PRECISION_DEF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecondPrecision_Def() <em>Second Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPrecision_Def()
	 * @generated
	 * @ordered
	 */
	protected int secondPrecision_Def = SECOND_PRECISION_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayPrecision_Min() <em>Day Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPrecision_Min()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_PRECISION_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDayPrecision_Min() <em>Day Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPrecision_Min()
	 * @generated
	 * @ordered
	 */
	protected int dayPrecision_Min = DAY_PRECISION_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayPrecision_Max() <em>Day Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_PRECISION_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDayPrecision_Max() <em>Day Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected int dayPrecision_Max = DAY_PRECISION_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayPrecision_Def() <em>Day Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPrecision_Def()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_PRECISION_DEF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDayPrecision_Def() <em>Day Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPrecision_Def()
	 * @generated
	 * @ordered
	 */
	protected int dayPrecision_Def = DAY_PRECISION_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearPrecision_Min() <em>Year Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearPrecision_Min()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_PRECISION_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearPrecision_Min() <em>Year Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearPrecision_Min()
	 * @generated
	 * @ordered
	 */
	protected int yearPrecision_Min = YEAR_PRECISION_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearPrecision_Max() <em>Year Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_PRECISION_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearPrecision_Max() <em>Year Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearPrecision_Max()
	 * @generated
	 * @ordered
	 */
	protected int yearPrecision_Max = YEAR_PRECISION_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearPrecision_Def() <em>Year Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearPrecision_Def()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_PRECISION_DEF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearPrecision_Def() <em>Year Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearPrecision_Def()
	 * @generated
	 * @ordered
	 */
	protected int yearPrecision_Def = YEAR_PRECISION_DEF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatetimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.DATETIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInDatetimeTypes getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(BuiltInDatetimeTypes newDescriptor) {
		BuiltInDatetimeTypes oldDescriptor = descriptor;
		descriptor = newDescriptor == null ? DESCRIPTOR_EDEFAULT : newDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__DESCRIPTOR, oldDescriptor, descriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondPrecision_Min() {
		return secondPrecision_Min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondPrecision_Min(int newSecondPrecision_Min) {
		int oldSecondPrecision_Min = secondPrecision_Min;
		secondPrecision_Min = newSecondPrecision_Min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MIN, oldSecondPrecision_Min, secondPrecision_Min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondPrecision_Max() {
		return secondPrecision_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondPrecision_Max(int newSecondPrecision_Max) {
		int oldSecondPrecision_Max = secondPrecision_Max;
		secondPrecision_Max = newSecondPrecision_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MAX, oldSecondPrecision_Max, secondPrecision_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondPrecision_Def() {
		return secondPrecision_Def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondPrecision_Def(int newSecondPrecision_Def) {
		int oldSecondPrecision_Def = secondPrecision_Def;
		secondPrecision_Def = newSecondPrecision_Def;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_DEF, oldSecondPrecision_Def, secondPrecision_Def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDayPrecision_Min() {
		return dayPrecision_Min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayPrecision_Min(int newDayPrecision_Min) {
		int oldDayPrecision_Min = dayPrecision_Min;
		dayPrecision_Min = newDayPrecision_Min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MIN, oldDayPrecision_Min, dayPrecision_Min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDayPrecision_Max() {
		return dayPrecision_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayPrecision_Max(int newDayPrecision_Max) {
		int oldDayPrecision_Max = dayPrecision_Max;
		dayPrecision_Max = newDayPrecision_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MAX, oldDayPrecision_Max, dayPrecision_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDayPrecision_Def() {
		return dayPrecision_Def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayPrecision_Def(int newDayPrecision_Def) {
		int oldDayPrecision_Def = dayPrecision_Def;
		dayPrecision_Def = newDayPrecision_Def;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_DEF, oldDayPrecision_Def, dayPrecision_Def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearPrecision_Min() {
		return yearPrecision_Min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearPrecision_Min(int newYearPrecision_Min) {
		int oldYearPrecision_Min = yearPrecision_Min;
		yearPrecision_Min = newYearPrecision_Min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MIN, oldYearPrecision_Min, yearPrecision_Min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearPrecision_Max() {
		return yearPrecision_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearPrecision_Max(int newYearPrecision_Max) {
		int oldYearPrecision_Max = yearPrecision_Max;
		yearPrecision_Max = newYearPrecision_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MAX, oldYearPrecision_Max, yearPrecision_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearPrecision_Def() {
		return yearPrecision_Def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearPrecision_Def(int newYearPrecision_Def) {
		int oldYearPrecision_Def = yearPrecision_Def;
		yearPrecision_Def = newYearPrecision_Def;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_DEF, oldYearPrecision_Def, yearPrecision_Def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ORDB4ORAPackage.DATETIME_TYPE__DESCRIPTOR:
				return getDescriptor();
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MIN:
				return getSecondPrecision_Min();
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MAX:
				return getSecondPrecision_Max();
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_DEF:
				return getSecondPrecision_Def();
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MIN:
				return getDayPrecision_Min();
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MAX:
				return getDayPrecision_Max();
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_DEF:
				return getDayPrecision_Def();
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MIN:
				return getYearPrecision_Min();
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MAX:
				return getYearPrecision_Max();
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_DEF:
				return getYearPrecision_Def();
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
			case ORDB4ORAPackage.DATETIME_TYPE__DESCRIPTOR:
				setDescriptor((BuiltInDatetimeTypes)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MIN:
				setSecondPrecision_Min((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MAX:
				setSecondPrecision_Max((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_DEF:
				setSecondPrecision_Def((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MIN:
				setDayPrecision_Min((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MAX:
				setDayPrecision_Max((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_DEF:
				setDayPrecision_Def((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MIN:
				setYearPrecision_Min((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MAX:
				setYearPrecision_Max((Integer)newValue);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_DEF:
				setYearPrecision_Def((Integer)newValue);
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
			case ORDB4ORAPackage.DATETIME_TYPE__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MIN:
				setSecondPrecision_Min(SECOND_PRECISION_MIN_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MAX:
				setSecondPrecision_Max(SECOND_PRECISION_MAX_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_DEF:
				setSecondPrecision_Def(SECOND_PRECISION_DEF_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MIN:
				setDayPrecision_Min(DAY_PRECISION_MIN_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MAX:
				setDayPrecision_Max(DAY_PRECISION_MAX_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_DEF:
				setDayPrecision_Def(DAY_PRECISION_DEF_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MIN:
				setYearPrecision_Min(YEAR_PRECISION_MIN_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MAX:
				setYearPrecision_Max(YEAR_PRECISION_MAX_EDEFAULT);
				return;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_DEF:
				setYearPrecision_Def(YEAR_PRECISION_DEF_EDEFAULT);
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
			case ORDB4ORAPackage.DATETIME_TYPE__DESCRIPTOR:
				return descriptor != DESCRIPTOR_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MIN:
				return secondPrecision_Min != SECOND_PRECISION_MIN_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MAX:
				return secondPrecision_Max != SECOND_PRECISION_MAX_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_DEF:
				return secondPrecision_Def != SECOND_PRECISION_DEF_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MIN:
				return dayPrecision_Min != DAY_PRECISION_MIN_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MAX:
				return dayPrecision_Max != DAY_PRECISION_MAX_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_DEF:
				return dayPrecision_Def != DAY_PRECISION_DEF_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MIN:
				return yearPrecision_Min != YEAR_PRECISION_MIN_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MAX:
				return yearPrecision_Max != YEAR_PRECISION_MAX_EDEFAULT;
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_DEF:
				return yearPrecision_Def != YEAR_PRECISION_DEF_EDEFAULT;
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
		result.append(", SecondPrecision_Min: ");
		result.append(secondPrecision_Min);
		result.append(", SecondPrecision_Max: ");
		result.append(secondPrecision_Max);
		result.append(", SecondPrecision_Def: ");
		result.append(secondPrecision_Def);
		result.append(", DayPrecision_Min: ");
		result.append(dayPrecision_Min);
		result.append(", DayPrecision_Max: ");
		result.append(dayPrecision_Max);
		result.append(", DayPrecision_Def: ");
		result.append(dayPrecision_Def);
		result.append(", YearPrecision_Min: ");
		result.append(yearPrecision_Min);
		result.append(", YearPrecision_Max: ");
		result.append(yearPrecision_Max);
		result.append(", YearPrecision_Def: ");
		result.append(yearPrecision_Def);
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

} //DatetimeTypeImpl
