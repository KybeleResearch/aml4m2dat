/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.DistinctType;
import SQL2003_V2.Feature;
import SQL2003_V2.PredefinedType;
import SQL2003_V2.SQL2003_V2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distinct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.DistinctTypeImpl#getSource_type <em>Source type</em>}</li>
 *   <li>{@link SQL2003_V2.impl.DistinctTypeImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistinctTypeImpl extends UserDefinedTypeImpl implements DistinctType {
	/**
	 * The cached value of the '{@link #getSource_type() <em>Source type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_type()
	 * @generated
	 * @ordered
	 */
	protected PredefinedType source_type;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistinctTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.DISTINCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedType getSource_type() {
		if (source_type != null && source_type.eIsProxy()) {
			InternalEObject oldSource_type = (InternalEObject)source_type;
			source_type = (PredefinedType)eResolveProxy(oldSource_type);
			if (source_type != oldSource_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE, oldSource_type, source_type));
			}
		}
		return source_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedType basicGetSource_type() {
		return source_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource_type(PredefinedType newSource_type, NotificationChain msgs) {
		PredefinedType oldSource_type = source_type;
		source_type = newSource_type;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE, oldSource_type, newSource_type);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_type(PredefinedType newSource_type) {
		if (newSource_type != source_type) {
			NotificationChain msgs = null;
			if (source_type != null)
				msgs = ((InternalEObject)source_type).eInverseRemove(this, SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF, PredefinedType.class, msgs);
			if (newSource_type != null)
				msgs = ((InternalEObject)newSource_type).eInverseAdd(this, SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF, PredefinedType.class, msgs);
			msgs = basicSetSource_type(newSource_type, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE, newSource_type, newSource_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, SQL2003_V2Package.DISTINCT_TYPE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE:
				if (source_type != null)
					msgs = ((InternalEObject)source_type).eInverseRemove(this, SQL2003_V2Package.PREDEFINED_TYPE__IS_SOURCE_OF, PredefinedType.class, msgs);
				return basicSetSource_type((PredefinedType)otherEnd, msgs);
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
			case SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE:
				return basicSetSource_type(null, msgs);
			case SQL2003_V2Package.DISTINCT_TYPE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE:
				if (resolve) return getSource_type();
				return basicGetSource_type();
			case SQL2003_V2Package.DISTINCT_TYPE__FEATURES:
				return getFeatures();
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
			case SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE:
				setSource_type((PredefinedType)newValue);
				return;
			case SQL2003_V2Package.DISTINCT_TYPE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE:
				setSource_type((PredefinedType)null);
				return;
			case SQL2003_V2Package.DISTINCT_TYPE__FEATURES:
				getFeatures().clear();
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
			case SQL2003_V2Package.DISTINCT_TYPE__SOURCE_TYPE:
				return source_type != null;
			case SQL2003_V2Package.DISTINCT_TYPE__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DistinctTypeImpl
