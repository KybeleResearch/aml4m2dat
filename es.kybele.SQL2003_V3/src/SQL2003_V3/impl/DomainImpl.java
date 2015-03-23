/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3.impl;

import SQL2003_V3.Domain;
import SQL2003_V3.DomainConstraint;
import SQL2003_V3.SQL2003_V3Package;
import SQL2003_V3.Schema;
import SQL2003_V3.StructuralComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V3.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_V3.impl.DomainImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link SQL2003_V3.impl.DomainImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link SQL2003_V3.impl.DomainImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link SQL2003_V3.impl.DomainImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link SQL2003_V3.impl.DomainImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
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
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralComponent> defines;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainConstraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V3Package.Literals.DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V3Package.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V3Package.DOMAIN__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V3Package.DOMAIN__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (eContainerFeatureID != SQL2003_V3Package.DOMAIN__SCHEMA) return null;
		return (Schema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, SQL2003_V3Package.DOMAIN__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID != SQL2003_V3Package.DOMAIN__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, SQL2003_V3Package.SCHEMA__DOMAINS, Schema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V3Package.DOMAIN__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralComponent> getDefines() {
		if (defines == null) {
			defines = new EObjectWithInverseResolvingEList<StructuralComponent>(StructuralComponent.class, this, SQL2003_V3Package.DOMAIN__DEFINES, SQL2003_V3Package.STRUCTURAL_COMPONENT__HAS_DOMAIN);
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectWithInverseResolvingEList<DomainConstraint>(DomainConstraint.class, this, SQL2003_V3Package.DOMAIN__CONSTRAINT, SQL2003_V3Package.DOMAIN_CONSTRAINT__DOMAIN);
		}
		return constraint;
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
			case SQL2003_V3Package.DOMAIN__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((Schema)otherEnd, msgs);
			case SQL2003_V3Package.DOMAIN__DEFINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefines()).basicAdd(otherEnd, msgs);
			case SQL2003_V3Package.DOMAIN__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
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
			case SQL2003_V3Package.DOMAIN__SCHEMA:
				return basicSetSchema(null, msgs);
			case SQL2003_V3Package.DOMAIN__DEFINES:
				return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
			case SQL2003_V3Package.DOMAIN__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case SQL2003_V3Package.DOMAIN__SCHEMA:
				return eInternalContainer().eInverseRemove(this, SQL2003_V3Package.SCHEMA__DOMAINS, Schema.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQL2003_V3Package.DOMAIN__NAME:
				return getName();
			case SQL2003_V3Package.DOMAIN__EXPRESSION:
				return getExpression();
			case SQL2003_V3Package.DOMAIN__DEFAULT:
				return getDefault();
			case SQL2003_V3Package.DOMAIN__SCHEMA:
				return getSchema();
			case SQL2003_V3Package.DOMAIN__DEFINES:
				return getDefines();
			case SQL2003_V3Package.DOMAIN__CONSTRAINT:
				return getConstraint();
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
			case SQL2003_V3Package.DOMAIN__NAME:
				setName((String)newValue);
				return;
			case SQL2003_V3Package.DOMAIN__EXPRESSION:
				setExpression((String)newValue);
				return;
			case SQL2003_V3Package.DOMAIN__DEFAULT:
				setDefault((String)newValue);
				return;
			case SQL2003_V3Package.DOMAIN__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case SQL2003_V3Package.DOMAIN__DEFINES:
				getDefines().clear();
				getDefines().addAll((Collection<? extends StructuralComponent>)newValue);
				return;
			case SQL2003_V3Package.DOMAIN__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends DomainConstraint>)newValue);
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
			case SQL2003_V3Package.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQL2003_V3Package.DOMAIN__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case SQL2003_V3Package.DOMAIN__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case SQL2003_V3Package.DOMAIN__SCHEMA:
				setSchema((Schema)null);
				return;
			case SQL2003_V3Package.DOMAIN__DEFINES:
				getDefines().clear();
				return;
			case SQL2003_V3Package.DOMAIN__CONSTRAINT:
				getConstraint().clear();
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
			case SQL2003_V3Package.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQL2003_V3Package.DOMAIN__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case SQL2003_V3Package.DOMAIN__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case SQL2003_V3Package.DOMAIN__SCHEMA:
				return getSchema() != null;
			case SQL2003_V3Package.DOMAIN__DEFINES:
				return defines != null && !defines.isEmpty();
			case SQL2003_V3Package.DOMAIN__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
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
		result.append(", expression: ");
		result.append(expression);
		result.append(", default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
