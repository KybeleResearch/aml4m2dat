/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.Model;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.Operation;
import ORDB4ORA.OperationParameter;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ORDB4ORA.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ORDB4ORA.impl.OperationImpl#getOperationParameters <em>Operation Parameters</em>}</li>
 *   <li>{@link ORDB4ORA.impl.OperationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ORDB4ORA.impl.OperationImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperationImpl extends EObjectImpl implements Operation {
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
	 * The cached value of the '{@link #getOperationParameters() <em>Operation Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationParameter> operationParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.OPERATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.OPERATION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationParameter> getOperationParameters() {
		if (operationParameters == null) {
			operationParameters = new EObjectContainmentWithInverseEList<OperationParameter>(OperationParameter.class, this, ORDB4ORAPackage.OPERATION__OPERATION_PARAMETERS, ORDB4ORAPackage.OPERATION_PARAMETER__OPERATION);
		}
		return operationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != ORDB4ORAPackage.OPERATION__MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, ORDB4ORAPackage.OPERATION__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != ORDB4ORAPackage.OPERATION__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ORDB4ORAPackage.MODEL__OPERATION, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.OPERATION__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDB4ORA.Package getPackage() {
		if (eContainerFeatureID() != ORDB4ORAPackage.OPERATION__PACKAGE) return null;
		return (ORDB4ORA.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(ORDB4ORA.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, ORDB4ORAPackage.OPERATION__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(ORDB4ORA.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != ORDB4ORAPackage.OPERATION__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, ORDB4ORAPackage.PACKAGE__OPERATIONS, ORDB4ORA.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.OPERATION__PACKAGE, newPackage, newPackage));
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
			case ORDB4ORAPackage.OPERATION__OPERATION_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationParameters()).basicAdd(otherEnd, msgs);
			case ORDB4ORAPackage.OPERATION__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
			case ORDB4ORAPackage.OPERATION__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((ORDB4ORA.Package)otherEnd, msgs);
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
			case ORDB4ORAPackage.OPERATION__OPERATION_PARAMETERS:
				return ((InternalEList<?>)getOperationParameters()).basicRemove(otherEnd, msgs);
			case ORDB4ORAPackage.OPERATION__MODEL:
				return basicSetModel(null, msgs);
			case ORDB4ORAPackage.OPERATION__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case ORDB4ORAPackage.OPERATION__MODEL:
				return eInternalContainer().eInverseRemove(this, ORDB4ORAPackage.MODEL__OPERATION, Model.class, msgs);
			case ORDB4ORAPackage.OPERATION__PACKAGE:
				return eInternalContainer().eInverseRemove(this, ORDB4ORAPackage.PACKAGE__OPERATIONS, ORDB4ORA.Package.class, msgs);
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
			case ORDB4ORAPackage.OPERATION__NAME:
				return getName();
			case ORDB4ORAPackage.OPERATION__BODY:
				return getBody();
			case ORDB4ORAPackage.OPERATION__OPERATION_PARAMETERS:
				return getOperationParameters();
			case ORDB4ORAPackage.OPERATION__MODEL:
				return getModel();
			case ORDB4ORAPackage.OPERATION__PACKAGE:
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
			case ORDB4ORAPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case ORDB4ORAPackage.OPERATION__BODY:
				setBody((String)newValue);
				return;
			case ORDB4ORAPackage.OPERATION__OPERATION_PARAMETERS:
				getOperationParameters().clear();
				getOperationParameters().addAll((Collection<? extends OperationParameter>)newValue);
				return;
			case ORDB4ORAPackage.OPERATION__MODEL:
				setModel((Model)newValue);
				return;
			case ORDB4ORAPackage.OPERATION__PACKAGE:
				setPackage((ORDB4ORA.Package)newValue);
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
			case ORDB4ORAPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ORDB4ORAPackage.OPERATION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case ORDB4ORAPackage.OPERATION__OPERATION_PARAMETERS:
				getOperationParameters().clear();
				return;
			case ORDB4ORAPackage.OPERATION__MODEL:
				setModel((Model)null);
				return;
			case ORDB4ORAPackage.OPERATION__PACKAGE:
				setPackage((ORDB4ORA.Package)null);
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
			case ORDB4ORAPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ORDB4ORAPackage.OPERATION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case ORDB4ORAPackage.OPERATION__OPERATION_PARAMETERS:
				return operationParameters != null && !operationParameters.isEmpty();
			case ORDB4ORAPackage.OPERATION__MODEL:
				return getModel() != null;
			case ORDB4ORAPackage.OPERATION__PACKAGE:
				return getPackage() != null;
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
		result.append(", Body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
