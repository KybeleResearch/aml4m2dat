/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interval Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SQL2003_evo.SQL2003_evoPackage#getIntervalTypes()
 * @model
 * @generated
 */
public enum IntervalTypes implements Enumerator {
	/**
	 * The '<em><b>YEAR MONTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR_MONTH(0, "YEAR_MONTH", "YEAR TO MONTH"),

	/**
	 * The '<em><b>DAY HOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_HOUR(1, "DAY_HOUR", "DAY_HOUR"),

	/**
	 * The '<em><b>DAY MINUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_MINUTE(2, "DAY_MINUTE", "DAY_MINUTE"),

	/**
	 * The '<em><b>DAY SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_SECOND(3, "DAY_SECOND", "DAY_SECOND"),

	/**
	 * The '<em><b>HOUR MINUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR_MINUTE(4, "HOUR_MINUTE", "HOUR_MINUTE"),

	/**
	 * The '<em><b>HOUR SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR_SECOND(5, "HOUR_SECOND", "HOUR_SECOND"),

	/**
	 * The '<em><b>MINUTE SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTE_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTE_SECOND(6, "MINUTE_SECOND", "MINUTE_SECOND"),

	/**
	 * The '<em><b>YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR(7, "YEAR", "YEAR"),

	/**
	 * The '<em><b>MONTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(8, "MONTH", "MONTH"),

	/**
	 * The '<em><b>DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(9, "DAY", "DAY"),

	/**
	 * The '<em><b>HOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(10, "HOUR", "HOUR"),

	/**
	 * The '<em><b>MINUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTE(11, "MINUTE", "MINUTE"),

	/**
	 * The '<em><b>SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND(12, "SECOND", "SECOND");

	/**
	 * The '<em><b>YEAR MONTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YEAR MONTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR_MONTH
	 * @model literal="YEAR TO MONTH"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_MONTH_VALUE = 0;

	/**
	 * The '<em><b>DAY HOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAY HOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_HOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAY_HOUR_VALUE = 1;

	/**
	 * The '<em><b>DAY MINUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAY MINUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_MINUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAY_MINUTE_VALUE = 2;

	/**
	 * The '<em><b>DAY SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAY SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAY_SECOND_VALUE = 3;

	/**
	 * The '<em><b>HOUR MINUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOUR MINUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUR_MINUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_MINUTE_VALUE = 4;

	/**
	 * The '<em><b>HOUR SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOUR SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUR_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_SECOND_VALUE = 5;

	/**
	 * The '<em><b>MINUTE SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUTE SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUTE_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINUTE_SECOND_VALUE = 6;

	/**
	 * The '<em><b>YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_VALUE = 7;

	/**
	 * The '<em><b>MONTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 8;

	/**
	 * The '<em><b>DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 9;

	/**
	 * The '<em><b>HOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 10;

	/**
	 * The '<em><b>MINUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINUTE_VALUE = 11;

	/**
	 * The '<em><b>SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_VALUE = 12;

	/**
	 * An array of all the '<em><b>Interval Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntervalTypes[] VALUES_ARRAY =
		new IntervalTypes[] {
			YEAR_MONTH,
			DAY_HOUR,
			DAY_MINUTE,
			DAY_SECOND,
			HOUR_MINUTE,
			HOUR_SECOND,
			MINUTE_SECOND,
			YEAR,
			MONTH,
			DAY,
			HOUR,
			MINUTE,
			SECOND,
		};

	/**
	 * A public read-only list of all the '<em><b>Interval Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntervalTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interval Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntervalTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interval Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntervalTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interval Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalTypes get(int value) {
		switch (value) {
			case YEAR_MONTH_VALUE: return YEAR_MONTH;
			case DAY_HOUR_VALUE: return DAY_HOUR;
			case DAY_MINUTE_VALUE: return DAY_MINUTE;
			case DAY_SECOND_VALUE: return DAY_SECOND;
			case HOUR_MINUTE_VALUE: return HOUR_MINUTE;
			case HOUR_SECOND_VALUE: return HOUR_SECOND;
			case MINUTE_SECOND_VALUE: return MINUTE_SECOND;
			case YEAR_VALUE: return YEAR;
			case MONTH_VALUE: return MONTH;
			case DAY_VALUE: return DAY;
			case HOUR_VALUE: return HOUR;
			case MINUTE_VALUE: return MINUTE;
			case SECOND_VALUE: return SECOND;
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
	private IntervalTypes(int value, String name, String literal) {
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
	
} //IntervalTypes
