/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.BuiltInCharacterSemantics;
import ORDB4ORA.BuiltInCharacterType;
import ORDB4ORA.BuiltInCharacterTypes;
import ORDB4ORA.ORDB4ORAPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Character Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.BuiltInCharacterTypeImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInCharacterTypeImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInCharacterTypeImpl#getSize_Min <em>Size Min</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInCharacterTypeImpl#getSize_Max <em>Size Max</em>}</li>
 *   <li>{@link ORDB4ORA.impl.BuiltInCharacterTypeImpl#getSize_Def <em>Size Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInCharacterTypeImpl extends BuiltInTypeImpl implements BuiltInCharacterType {
	/**
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInCharacterTypes DESCRIPTOR_EDEFAULT = BuiltInCharacterTypes.CHAR;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected BuiltInCharacterTypes descriptor = DESCRIPTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantic()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInCharacterSemantics SEMANTIC_EDEFAULT = BuiltInCharacterSemantics.BYTE;

	/**
	 * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantic()
	 * @generated
	 * @ordered
	 */
	protected BuiltInCharacterSemantics semantic = SEMANTIC_EDEFAULT;

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
	 * The default value of the '{@link #getSize_Def() <em>Size Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_Def()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_DEF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize_Def() <em>Size Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_Def()
	 * @generated
	 * @ordered
	 */
	protected int size_Def = SIZE_DEF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuiltInCharacterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.BUILT_IN_CHARACTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInCharacterTypes getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(BuiltInCharacterTypes newDescriptor) {
		BuiltInCharacterTypes oldDescriptor = descriptor;
		descriptor = newDescriptor == null ? DESCRIPTOR_EDEFAULT : newDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__DESCRIPTOR, oldDescriptor, descriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInCharacterSemantics getSemantic() {
		return semantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantic(BuiltInCharacterSemantics newSemantic) {
		BuiltInCharacterSemantics oldSemantic = semantic;
		semantic = newSemantic == null ? SEMANTIC_EDEFAULT : newSemantic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SEMANTIC, oldSemantic, semantic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MIN, oldSize_Min, size_Min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MAX, oldSize_Max, size_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize_Def() {
		return size_Def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize_Def(int newSize_Def) {
		int oldSize_Def = size_Def;
		size_Def = newSize_Def;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_DEF, oldSize_Def, size_Def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__DESCRIPTOR:
				return getDescriptor();
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SEMANTIC:
				return getSemantic();
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MIN:
				return getSize_Min();
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MAX:
				return getSize_Max();
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_DEF:
				return getSize_Def();
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
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__DESCRIPTOR:
				setDescriptor((BuiltInCharacterTypes)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SEMANTIC:
				setSemantic((BuiltInCharacterSemantics)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MIN:
				setSize_Min((Integer)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MAX:
				setSize_Max((Integer)newValue);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_DEF:
				setSize_Def((Integer)newValue);
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
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SEMANTIC:
				setSemantic(SEMANTIC_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MIN:
				setSize_Min(SIZE_MIN_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MAX:
				setSize_Max(SIZE_MAX_EDEFAULT);
				return;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_DEF:
				setSize_Def(SIZE_DEF_EDEFAULT);
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
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__DESCRIPTOR:
				return descriptor != DESCRIPTOR_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SEMANTIC:
				return semantic != SEMANTIC_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MIN:
				return size_Min != SIZE_MIN_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_MAX:
				return size_Max != SIZE_MAX_EDEFAULT;
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE__SIZE_DEF:
				return size_Def != SIZE_DEF_EDEFAULT;
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
		result.append(", Semantic: ");
		result.append(semantic);
		result.append(", Size_Min: ");
		result.append(size_Min);
		result.append(", Size_Max: ");
		result.append(size_Max);
		result.append(", Size_Def: ");
		result.append(size_Def);
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

} //BuiltInCharacterTypeImpl
