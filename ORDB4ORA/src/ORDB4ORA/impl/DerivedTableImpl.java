/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.DerivedTable;
import ORDB4ORA.ORDB4ORAPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ORDB4ORA.impl.DerivedTableImpl#getQuery_expression <em>Query expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedTableImpl extends TableImpl implements DerivedTable {
	/**
	 * The default value of the '{@link #getQuery_expression() <em>Query expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery_expression()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery_expression() <em>Query expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery_expression()
	 * @generated
	 * @ordered
	 */
	protected String query_expression = QUERY_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ORDB4ORAPackage.Literals.DERIVED_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery_expression() {
		return query_expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery_expression(String newQuery_expression) {
		String oldQuery_expression = query_expression;
		query_expression = newQuery_expression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ORDB4ORAPackage.DERIVED_TABLE__QUERY_EXPRESSION, oldQuery_expression, query_expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ORDB4ORAPackage.DERIVED_TABLE__QUERY_EXPRESSION:
				return getQuery_expression();
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
			case ORDB4ORAPackage.DERIVED_TABLE__QUERY_EXPRESSION:
				setQuery_expression((String)newValue);
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
			case ORDB4ORAPackage.DERIVED_TABLE__QUERY_EXPRESSION:
				setQuery_expression(QUERY_EXPRESSION_EDEFAULT);
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
			case ORDB4ORAPackage.DERIVED_TABLE__QUERY_EXPRESSION:
				return QUERY_EXPRESSION_EDEFAULT == null ? query_expression != null : !QUERY_EXPRESSION_EDEFAULT.equals(query_expression);
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
		result.append(" (query_expression: ");
		result.append(query_expression);
		result.append(')');
		return result.toString();
	}

} //DerivedTableImpl
