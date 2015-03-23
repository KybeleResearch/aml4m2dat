/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.Datatype;
import ORDB4ORA.Model;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.Operation;
import ORDB4ORA.Table;
import ORDB4ORA.Tables;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.ModelImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link ORDB4ORA.impl.ModelImpl#getTable <em>Table</em>}</li>
 *   <li>{@link ORDB4ORA.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.impl.ModelImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ORDB4ORA.impl.ModelImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<Datatype> datatype;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> table;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ORDB4ORA.Package> package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datatype> getDatatype() {
		if (datatype == null) {
			datatype = new EObjectContainmentWithInverseEList<Datatype>(Datatype.class, this, ORDB4ORAPackage.MODEL__DATATYPE, ORDB4ORAPackage.DATATYPE__MODEL);
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTable() {
		if (table == null) {
			table = new EObjectContainmentWithInverseEList<Table>(Table.class, this, ORDB4ORAPackage.MODEL__TABLE, ORDB4ORAPackage.TABLE__MODEL);
		}
		return table;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, ORDB4ORAPackage.MODEL__OPERATION, ORDB4ORAPackage.OPERATION__MODEL);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORDB4ORA.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentWithInverseEList<ORDB4ORA.Package>(ORDB4ORA.Package.class, this, ORDB4ORAPackage.MODEL__PACKAGE, ORDB4ORAPackage.PACKAGE__MODEL);
		}
		return package_;
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
			case ORDB4ORAPackage.MODEL__DATATYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatatype()).basicAdd(otherEnd, msgs);
			case ORDB4ORAPackage.MODEL__TABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTable()).basicAdd(otherEnd, msgs);
			case ORDB4ORAPackage.MODEL__OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperation()).basicAdd(otherEnd, msgs);
			case ORDB4ORAPackage.MODEL__PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackage()).basicAdd(otherEnd, msgs);
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
			case ORDB4ORAPackage.MODEL__DATATYPE:
				return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
			case ORDB4ORAPackage.MODEL__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case ORDB4ORAPackage.MODEL__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case ORDB4ORAPackage.MODEL__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
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
			case ORDB4ORAPackage.MODEL__DATATYPE:
				return getDatatype();
			case ORDB4ORAPackage.MODEL__TABLE:
				return getTable();
			case ORDB4ORAPackage.MODEL__NAME:
				return getName();
			case ORDB4ORAPackage.MODEL__OPERATION:
				return getOperation();
			case ORDB4ORAPackage.MODEL__PACKAGE:
				return getPackage();
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
			case ORDB4ORAPackage.MODEL__DATATYPE:
				getDatatype().clear();
				getDatatype().addAll((Collection<? extends Datatype>)newValue);
				return;
			case ORDB4ORAPackage.MODEL__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends Table>)newValue);
				return;
			case ORDB4ORAPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case ORDB4ORAPackage.MODEL__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case ORDB4ORAPackage.MODEL__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends ORDB4ORA.Package>)newValue);
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
			case ORDB4ORAPackage.MODEL__DATATYPE:
				getDatatype().clear();
				return;
			case ORDB4ORAPackage.MODEL__TABLE:
				getTable().clear();
				return;
			case ORDB4ORAPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ORDB4ORAPackage.MODEL__OPERATION:
				getOperation().clear();
				return;
			case ORDB4ORAPackage.MODEL__PACKAGE:
				getPackage().clear();
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
			case ORDB4ORAPackage.MODEL__DATATYPE:
				return datatype != null && !datatype.isEmpty();
			case ORDB4ORAPackage.MODEL__TABLE:
				return table != null && !table.isEmpty();
			case ORDB4ORAPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ORDB4ORAPackage.MODEL__OPERATION:
				return operation != null && !operation.isEmpty();
			case ORDB4ORAPackage.MODEL__PACKAGE:
				return package_ != null && !package_.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ModelImpl
