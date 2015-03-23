/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.BehaviouralComponent;
import SQL2003_V2.ParameterMode;
import SQL2003_V2.ParameterWithMode;
import SQL2003_V2.SQL2003_V2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter With Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.ParameterWithModeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link SQL2003_V2.impl.ParameterWithModeImpl#getBehaviouralComponent <em>Behavioural Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterWithModeImpl extends ParameterImpl implements ParameterWithMode {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterMode MODE_EDEFAULT = ParameterMode.IN;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ParameterMode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterWithModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.PARAMETER_WITH_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ParameterMode newMode) {
		ParameterMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.PARAMETER_WITH_MODE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralComponent getBehaviouralComponent() {
		if (eContainerFeatureID != SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT) return null;
		return (BehaviouralComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviouralComponent(BehaviouralComponent newBehaviouralComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBehaviouralComponent, SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviouralComponent(BehaviouralComponent newBehaviouralComponent) {
		if (newBehaviouralComponent != eInternalContainer() || (eContainerFeatureID != SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT && newBehaviouralComponent != null)) {
			if (EcoreUtil.isAncestor(this, newBehaviouralComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBehaviouralComponent != null)
				msgs = ((InternalEObject)newBehaviouralComponent).eInverseAdd(this, SQL2003_V2Package.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE, BehaviouralComponent.class, msgs);
			msgs = basicSetBehaviouralComponent(newBehaviouralComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT, newBehaviouralComponent, newBehaviouralComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBehaviouralComponent((BehaviouralComponent)otherEnd, msgs);
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
			case SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT:
				return basicSetBehaviouralComponent(null, msgs);
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
			case SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT:
				return eInternalContainer().eInverseRemove(this, SQL2003_V2Package.BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE, BehaviouralComponent.class, msgs);
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
			case SQL2003_V2Package.PARAMETER_WITH_MODE__MODE:
				return getMode();
			case SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT:
				return getBehaviouralComponent();
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
			case SQL2003_V2Package.PARAMETER_WITH_MODE__MODE:
				setMode((ParameterMode)newValue);
				return;
			case SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT:
				setBehaviouralComponent((BehaviouralComponent)newValue);
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
			case SQL2003_V2Package.PARAMETER_WITH_MODE__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT:
				setBehaviouralComponent((BehaviouralComponent)null);
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
			case SQL2003_V2Package.PARAMETER_WITH_MODE__MODE:
				return mode != MODE_EDEFAULT;
			case SQL2003_V2Package.PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT:
				return getBehaviouralComponent() != null;
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //ParameterWithModeImpl
