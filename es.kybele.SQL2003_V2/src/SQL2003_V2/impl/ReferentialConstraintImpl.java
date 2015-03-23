/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.MatchTypes;
import SQL2003_V2.ReferentialAction;
import SQL2003_V2.ReferentialConstraint;
import SQL2003_V2.SQL2003_V2Package;
import SQL2003_V2.UniqueConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referential Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SQL2003_V2.impl.ReferentialConstraintImpl#getDelete_action <em>Delete action</em>}</li>
 *   <li>{@link SQL2003_V2.impl.ReferentialConstraintImpl#getUpdate_action <em>Update action</em>}</li>
 *   <li>{@link SQL2003_V2.impl.ReferentialConstraintImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link SQL2003_V2.impl.ReferentialConstraintImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferentialConstraintImpl extends TableConstraintImpl implements ReferentialConstraint {
	/**
	 * The default value of the '{@link #getDelete_action() <em>Delete action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete_action()
	 * @generated
	 * @ordered
	 */
	protected static final ReferentialAction DELETE_ACTION_EDEFAULT = ReferentialAction.CASCADE;

	/**
	 * The cached value of the '{@link #getDelete_action() <em>Delete action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete_action()
	 * @generated
	 * @ordered
	 */
	protected ReferentialAction delete_action = DELETE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdate_action() <em>Update action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate_action()
	 * @generated
	 * @ordered
	 */
	protected static final ReferentialAction UPDATE_ACTION_EDEFAULT = ReferentialAction.CASCADE;

	/**
	 * The cached value of the '{@link #getUpdate_action() <em>Update action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate_action()
	 * @generated
	 * @ordered
	 */
	protected ReferentialAction update_action = UPDATE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected static final MatchTypes MATCH_EDEFAULT = MatchTypes.SIMPLE;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected MatchTypes match = MATCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected UniqueConstraint references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferentialConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQL2003_V2Package.Literals.REFERENTIAL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialAction getDelete_action() {
		return delete_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete_action(ReferentialAction newDelete_action) {
		ReferentialAction oldDelete_action = delete_action;
		delete_action = newDelete_action == null ? DELETE_ACTION_EDEFAULT : newDelete_action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.REFERENTIAL_CONSTRAINT__DELETE_ACTION, oldDelete_action, delete_action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialAction getUpdate_action() {
		return update_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate_action(ReferentialAction newUpdate_action) {
		ReferentialAction oldUpdate_action = update_action;
		update_action = newUpdate_action == null ? UPDATE_ACTION_EDEFAULT : newUpdate_action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.REFERENTIAL_CONSTRAINT__UPDATE_ACTION, oldUpdate_action, update_action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchTypes getMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(MatchTypes newMatch) {
		MatchTypes oldMatch = match;
		match = newMatch == null ? MATCH_EDEFAULT : newMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.REFERENTIAL_CONSTRAINT__MATCH, oldMatch, match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraint getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (UniqueConstraint)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQL2003_V2Package.REFERENTIAL_CONSTRAINT__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraint basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(UniqueConstraint newReferences) {
		UniqueConstraint oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQL2003_V2Package.REFERENTIAL_CONSTRAINT__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__DELETE_ACTION:
				return getDelete_action();
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__UPDATE_ACTION:
				return getUpdate_action();
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__MATCH:
				return getMatch();
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
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
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__DELETE_ACTION:
				setDelete_action((ReferentialAction)newValue);
				return;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__UPDATE_ACTION:
				setUpdate_action((ReferentialAction)newValue);
				return;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__MATCH:
				setMatch((MatchTypes)newValue);
				return;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__REFERENCES:
				setReferences((UniqueConstraint)newValue);
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
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__DELETE_ACTION:
				setDelete_action(DELETE_ACTION_EDEFAULT);
				return;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__UPDATE_ACTION:
				setUpdate_action(UPDATE_ACTION_EDEFAULT);
				return;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__MATCH:
				setMatch(MATCH_EDEFAULT);
				return;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__REFERENCES:
				setReferences((UniqueConstraint)null);
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
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__DELETE_ACTION:
				return delete_action != DELETE_ACTION_EDEFAULT;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__UPDATE_ACTION:
				return update_action != UPDATE_ACTION_EDEFAULT;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__MATCH:
				return match != MATCH_EDEFAULT;
			case SQL2003_V2Package.REFERENTIAL_CONSTRAINT__REFERENCES:
				return references != null;
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
		result.append(" (delete_action: ");
		result.append(delete_action);
		result.append(", update_action: ");
		result.append(update_action);
		result.append(", match: ");
		result.append(match);
		result.append(')');
		return result.toString();
	}

} //ReferentialConstraintImpl
