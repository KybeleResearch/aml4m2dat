/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.Datatype;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.Varray;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Varray</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.VarrayImpl#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.impl.VarrayImpl#getNumElements <em>Num Elements</em>}</li>
 *   <li>{@link ORDB4ORA.impl.VarrayImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarrayImpl extends DatatypeImpl implements Varray {
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
	 * The default value of the '{@link #getNumElements() <em>Num Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumElements() <em>Num Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumElements()
	 * @generated
	 * @ordered
	 */
	protected int numElements = NUM_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Datatype type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.VARRAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.VARRAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumElements() {
		return numElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumElements(int newNumElements) {
		int oldNumElements = numElements;
		numElements = newNumElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.VARRAY__NUM_ELEMENTS, oldNumElements, numElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Datatype)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ORDB4ORAPackage.VARRAY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Datatype newType) {
		Datatype oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.VARRAY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ORDB4ORAPackage.VARRAY__NAME:
				return getName();
			case ORDB4ORAPackage.VARRAY__NUM_ELEMENTS:
				return getNumElements();
			case ORDB4ORAPackage.VARRAY__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case ORDB4ORAPackage.VARRAY__NAME:
				setName((String)newValue);
				return;
			case ORDB4ORAPackage.VARRAY__NUM_ELEMENTS:
				setNumElements((Integer)newValue);
				return;
			case ORDB4ORAPackage.VARRAY__TYPE:
				setType((Datatype)newValue);
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
			case ORDB4ORAPackage.VARRAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ORDB4ORAPackage.VARRAY__NUM_ELEMENTS:
				setNumElements(NUM_ELEMENTS_EDEFAULT);
				return;
			case ORDB4ORAPackage.VARRAY__TYPE:
				setType((Datatype)null);
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
			case ORDB4ORAPackage.VARRAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ORDB4ORAPackage.VARRAY__NUM_ELEMENTS:
				return numElements != NUM_ELEMENTS_EDEFAULT;
			case ORDB4ORAPackage.VARRAY__TYPE:
				return type != null;
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
		result.append(", NumElements: ");
		result.append(numElements);
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
		
		return name.toString();
	}

} //VarrayImpl
