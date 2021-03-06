/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3.impl;

import SQL2003_V3.BehaviouralComponent;
import SQL2003_V3.DataType;
import SQL2003_V3.Domain;
import SQL2003_V3.SQL2003_V3Package;
import SQL2003_V3.Schema;
import SQL2003_V3.Table;

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
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V3.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_V3.impl.SchemaImpl#getBehaviouralComponents <em>Behavioural Components</em>}</li>
 *   <li>{@link SQL2003_V3.impl.SchemaImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link SQL2003_V3.impl.SchemaImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link SQL2003_V3.impl.SchemaImpl#getDomains <em>Domains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends EObjectImpl implements Schema {
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
	 * The cached value of the '{@link #getBehaviouralComponents() <em>Behavioural Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviouralComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviouralComponent> behaviouralComponents;

	/**
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatypes;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V3Package.Literals.SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V3Package.SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviouralComponent> getBehaviouralComponents() {
		if (behaviouralComponents == null) {
			behaviouralComponents = new EObjectContainmentWithInverseEList<BehaviouralComponent>(BehaviouralComponent.class, this, SQL2003_V3Package.SCHEMA__BEHAVIOURAL_COMPONENTS, SQL2003_V3Package.BEHAVIOURAL_COMPONENT__SCHEMA);
		}
		return behaviouralComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentWithInverseEList<DataType>(DataType.class, this, SQL2003_V3Package.SCHEMA__DATATYPES, SQL2003_V3Package.DATA_TYPE__SCHEMA);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentWithInverseEList<Table>(Table.class, this, SQL2003_V3Package.SCHEMA__TABLES, SQL2003_V3Package.TABLE__SCHEMA);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentWithInverseEList<Domain>(Domain.class, this, SQL2003_V3Package.SCHEMA__DOMAINS, SQL2003_V3Package.DOMAIN__SCHEMA);
		}
		return domains;
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
			case SQL2003_V3Package.SCHEMA__BEHAVIOURAL_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehaviouralComponents()).basicAdd(otherEnd, msgs);
			case SQL2003_V3Package.SCHEMA__DATATYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatatypes()).basicAdd(otherEnd, msgs);
			case SQL2003_V3Package.SCHEMA__TABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTables()).basicAdd(otherEnd, msgs);
			case SQL2003_V3Package.SCHEMA__DOMAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomains()).basicAdd(otherEnd, msgs);
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
			case SQL2003_V3Package.SCHEMA__BEHAVIOURAL_COMPONENTS:
				return ((InternalEList<?>)getBehaviouralComponents()).basicRemove(otherEnd, msgs);
			case SQL2003_V3Package.SCHEMA__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case SQL2003_V3Package.SCHEMA__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case SQL2003_V3Package.SCHEMA__DOMAINS:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
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
			case SQL2003_V3Package.SCHEMA__NAME:
				return getName();
			case SQL2003_V3Package.SCHEMA__BEHAVIOURAL_COMPONENTS:
				return getBehaviouralComponents();
			case SQL2003_V3Package.SCHEMA__DATATYPES:
				return getDatatypes();
			case SQL2003_V3Package.SCHEMA__TABLES:
				return getTables();
			case SQL2003_V3Package.SCHEMA__DOMAINS:
				return getDomains();
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
			case SQL2003_V3Package.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case SQL2003_V3Package.SCHEMA__BEHAVIOURAL_COMPONENTS:
				getBehaviouralComponents().clear();
				getBehaviouralComponents().addAll((Collection<? extends BehaviouralComponent>)newValue);
				return;
			case SQL2003_V3Package.SCHEMA__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case SQL2003_V3Package.SCHEMA__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends Table>)newValue);
				return;
			case SQL2003_V3Package.SCHEMA__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Domain>)newValue);
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
			case SQL2003_V3Package.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQL2003_V3Package.SCHEMA__BEHAVIOURAL_COMPONENTS:
				getBehaviouralComponents().clear();
				return;
			case SQL2003_V3Package.SCHEMA__DATATYPES:
				getDatatypes().clear();
				return;
			case SQL2003_V3Package.SCHEMA__TABLES:
				getTables().clear();
				return;
			case SQL2003_V3Package.SCHEMA__DOMAINS:
				getDomains().clear();
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
			case SQL2003_V3Package.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQL2003_V3Package.SCHEMA__BEHAVIOURAL_COMPONENTS:
				return behaviouralComponents != null && !behaviouralComponents.isEmpty();
			case SQL2003_V3Package.SCHEMA__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
			case SQL2003_V3Package.SCHEMA__TABLES:
				return tables != null && !tables.isEmpty();
			case SQL2003_V3Package.SCHEMA__DOMAINS:
				return domains != null && !domains.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
