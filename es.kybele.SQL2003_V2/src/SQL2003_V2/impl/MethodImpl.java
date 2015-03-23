/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.DataType;
import SQL2003_V2.Method;
import SQL2003_V2.MethodParameter;
import SQL2003_V2.SQL2003_V2Package;
import SQL2003_V2.StructuredType;

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
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link SQL2003_V2.impl.MethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link SQL2003_V2.impl.MethodImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link SQL2003_V2.impl.MethodImpl#getStructured <em>Structured</em>}</li>
 *   <li>{@link SQL2003_V2.impl.MethodImpl#getReturn_type <em>Return type</em>}</li>
 *   <li>{@link SQL2003_V2.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends EObjectImpl implements Method {
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
	 * The cached value of the '{@link #getOverride() <em>Override</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected Method override;

	/**
	 * The cached value of the '{@link #getReturn_type() <em>Return type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn_type()
	 * @generated
	 * @ordered
	 */
	protected DataType return_type;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.METHOD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.METHOD__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getOverride() {
		if (override != null && override.eIsProxy()) {
			InternalEObject oldOverride = (InternalEObject)override;
			override = (Method)eResolveProxy(oldOverride);
			if (override != oldOverride) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003_V2Package.METHOD__OVERRIDE, oldOverride, override));
			}
		}
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetOverride() {
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(Method newOverride) {
		Method oldOverride = override;
		override = newOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.METHOD__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType getStructured() {
		if (eContainerFeatureID != SQL2003_V2Package.METHOD__STRUCTURED) return null;
		return (StructuredType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructured(StructuredType newStructured, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructured, SQL2003_V2Package.METHOD__STRUCTURED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructured(StructuredType newStructured) {
		if (newStructured != eInternalContainer() || (eContainerFeatureID != SQL2003_V2Package.METHOD__STRUCTURED && newStructured != null)) {
			if (EcoreUtil.isAncestor(this, newStructured))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructured != null)
				msgs = ((InternalEObject)newStructured).eInverseAdd(this, SQL2003_V2Package.STRUCTURED_TYPE__METHODS, StructuredType.class, msgs);
			msgs = basicSetStructured(newStructured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.METHOD__STRUCTURED, newStructured, newStructured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturn_type() {
		if (return_type != null && return_type.eIsProxy()) {
			InternalEObject oldReturn_type = (InternalEObject)return_type;
			return_type = (DataType)eResolveProxy(oldReturn_type);
			if (return_type != oldReturn_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003_V2Package.METHOD__RETURN_TYPE, oldReturn_type, return_type));
			}
		}
		return return_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturn_type() {
		return return_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn_type(DataType newReturn_type) {
		DataType oldReturn_type = return_type;
		return_type = newReturn_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.METHOD__RETURN_TYPE, oldReturn_type, return_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<MethodParameter>(MethodParameter.class, this, SQL2003_V2Package.METHOD__PARAMETERS, SQL2003_V2Package.METHOD_PARAMETER__METHOD);
		}
		return parameters;
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
			case SQL2003_V2Package.METHOD__STRUCTURED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructured((StructuredType)otherEnd, msgs);
			case SQL2003_V2Package.METHOD__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
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
			case SQL2003_V2Package.METHOD__STRUCTURED:
				return basicSetStructured(null, msgs);
			case SQL2003_V2Package.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case SQL2003_V2Package.METHOD__STRUCTURED:
				return eInternalContainer().eInverseRemove(this, SQL2003_V2Package.STRUCTURED_TYPE__METHODS, StructuredType.class, msgs);
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
			case SQL2003_V2Package.METHOD__NAME:
				return getName();
			case SQL2003_V2Package.METHOD__BODY:
				return getBody();
			case SQL2003_V2Package.METHOD__OVERRIDE:
				if (resolve) return getOverride();
				return basicGetOverride();
			case SQL2003_V2Package.METHOD__STRUCTURED:
				return getStructured();
			case SQL2003_V2Package.METHOD__RETURN_TYPE:
				if (resolve) return getReturn_type();
				return basicGetReturn_type();
			case SQL2003_V2Package.METHOD__PARAMETERS:
				return getParameters();
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
			case SQL2003_V2Package.METHOD__NAME:
				setName((String)newValue);
				return;
			case SQL2003_V2Package.METHOD__BODY:
				setBody((String)newValue);
				return;
			case SQL2003_V2Package.METHOD__OVERRIDE:
				setOverride((Method)newValue);
				return;
			case SQL2003_V2Package.METHOD__STRUCTURED:
				setStructured((StructuredType)newValue);
				return;
			case SQL2003_V2Package.METHOD__RETURN_TYPE:
				setReturn_type((DataType)newValue);
				return;
			case SQL2003_V2Package.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MethodParameter>)newValue);
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
			case SQL2003_V2Package.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQL2003_V2Package.METHOD__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case SQL2003_V2Package.METHOD__OVERRIDE:
				setOverride((Method)null);
				return;
			case SQL2003_V2Package.METHOD__STRUCTURED:
				setStructured((StructuredType)null);
				return;
			case SQL2003_V2Package.METHOD__RETURN_TYPE:
				setReturn_type((DataType)null);
				return;
			case SQL2003_V2Package.METHOD__PARAMETERS:
				getParameters().clear();
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
			case SQL2003_V2Package.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQL2003_V2Package.METHOD__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case SQL2003_V2Package.METHOD__OVERRIDE:
				return override != null;
			case SQL2003_V2Package.METHOD__STRUCTURED:
				return getStructured() != null;
			case SQL2003_V2Package.METHOD__RETURN_TYPE:
				return return_type != null;
			case SQL2003_V2Package.METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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

} //MethodImpl
