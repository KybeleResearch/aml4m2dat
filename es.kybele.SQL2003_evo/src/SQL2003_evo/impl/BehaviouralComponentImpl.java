/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo.impl;

import SQL2003_evo.BehaviouralComponent;
import SQL2003_evo.ParameterWithMode;
import SQL2003_evo.SQL2003_evoPackage;
import SQL2003_evo.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioural Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_evo.impl.BehaviouralComponentImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link SQL2003_evo.impl.BehaviouralComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_evo.impl.BehaviouralComponentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link SQL2003_evo.impl.BehaviouralComponentImpl#getParametersWithMode <em>Parameters With Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviouralComponentImpl extends EObjectImpl implements BehaviouralComponent {
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParametersWithMode() <em>Parameters With Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersWithMode()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterWithMode> parametersWithMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviouralComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_evoPackage.Literals.BEHAVIOURAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (eContainerFeatureID() != SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA) return null;
		return (Schema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, SQL2003_evoPackage.SCHEMA__BEHAVIOURAL_COMPONENTS, Schema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA, newSchema, newSchema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterWithMode> getParametersWithMode() {
		if (parametersWithMode == null) {
			parametersWithMode = new EObjectContainmentWithInverseEList<ParameterWithMode>(ParameterWithMode.class, this, SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE, SQL2003_evoPackage.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT);
		}
		return parametersWithMode;
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
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((Schema)otherEnd, msgs);
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParametersWithMode()).basicAdd(otherEnd, msgs);
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
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA:
				return basicSetSchema(null, msgs);
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE:
				return ((InternalEList<?>)getParametersWithMode()).basicRemove(otherEnd, msgs);
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
		switch (eContainerFeatureID()) {
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA:
				return eInternalContainer().eInverseRemove(this, SQL2003_evoPackage.SCHEMA__BEHAVIOURAL_COMPONENTS, Schema.class, msgs);
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
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA:
				return getSchema();
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__NAME:
				return getName();
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__BODY:
				return getBody();
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE:
				return getParametersWithMode();
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
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__BODY:
				setBody((String)newValue);
				return;
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE:
				getParametersWithMode().clear();
				getParametersWithMode().addAll((Collection<? extends ParameterWithMode>)newValue);
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
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA:
				setSchema((Schema)null);
				return;
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE:
				getParametersWithMode().clear();
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
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__SCHEMA:
				return getSchema() != null;
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case SQL2003_evoPackage.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE:
				return parametersWithMode != null && !parametersWithMode.isEmpty();
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
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //BehaviouralComponentImpl
