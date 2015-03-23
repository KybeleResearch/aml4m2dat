/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interval Features</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getIntervalFeatures()
 * @model
 * @generated
 */
public enum IntervalFeatures implements Enumerator {
	/**
	 * The '<em><b>Day precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_PRECISION(0, "day_precision", "day_precision"),

	/**
	 * The '<em><b>Second precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_PRECISION(1, "second_precision", "second_precision"),

	/**
	 * The '<em><b>Year precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR_PRECISION(2, "year_precision", "year_precision");

	/**
	 * The '<em><b>Day precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_PRECISION
	 * @model name="day_precision"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_PRECISION_VALUE = 0;

	/**
	 * The '<em><b>Second precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Second precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECOND_PRECISION
	 * @model name="second_precision"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_PRECISION_VALUE = 1;

	/**
	 * The '<em><b>Year precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Year precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR_PRECISION
	 * @model name="year_precision"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_PRECISION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Interval Features</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntervalFeatures[] VALUES_ARRAY =
		new IntervalFeatures[] {
			DAY_PRECISION,
			SECOND_PRECISION,
			YEAR_PRECISION,
		};

	/**
	 * A public read-only list of all the '<em><b>Interval Features</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntervalFeatures> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interval Features</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalFeatures get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntervalFeatures result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interval Features</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalFeatures getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntervalFeatures result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interval Features</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalFeatures get(int value) {
		switch (value) {
			case DAY_PRECISION_VALUE: return DAY_PRECISION;
			case SECOND_PRECISION_VALUE: return SECOND_PRECISION;
			case YEAR_PRECISION_VALUE: return YEAR_PRECISION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IntervalFeatures(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IntervalFeatures
