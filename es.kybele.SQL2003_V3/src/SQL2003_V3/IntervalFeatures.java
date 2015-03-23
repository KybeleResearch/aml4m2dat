/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interval Features</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SQL2003_V3.SQL2003_V3Package#getIntervalFeatures()
 * @model
 * @generated
 */
public enum IntervalFeatures implements Enumerator {
	/**
	 * The '<em><b>Start leading precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_LEADING_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	START_LEADING_PRECISION(0, "start_leading_precision", "start_leading_precision"),

	/**
	 * The '<em><b>End leading precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_LEADING_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	END_LEADING_PRECISION(1, "end_leading_precision", "end_leading_precision"),

	/**
	 * The '<em><b>Leading precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEADING_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	LEADING_PRECISION(2, "leading_precision", "leading_precision"),

	/**
	 * The '<em><b>Second precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_PRECISION(3, "second_precision", "second_precision");

	/**
	 * The '<em><b>Start leading precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start leading precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_LEADING_PRECISION
	 * @model name="start_leading_precision"
	 * @generated
	 * @ordered
	 */
	public static final int START_LEADING_PRECISION_VALUE = 0;

	/**
	 * The '<em><b>End leading precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End leading precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_LEADING_PRECISION
	 * @model name="end_leading_precision"
	 * @generated
	 * @ordered
	 */
	public static final int END_LEADING_PRECISION_VALUE = 1;

	/**
	 * The '<em><b>Leading precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leading precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEADING_PRECISION
	 * @model name="leading_precision"
	 * @generated
	 * @ordered
	 */
	public static final int LEADING_PRECISION_VALUE = 2;

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
	public static final int SECOND_PRECISION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Interval Features</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntervalFeatures[] VALUES_ARRAY =
		new IntervalFeatures[] {
			START_LEADING_PRECISION,
			END_LEADING_PRECISION,
			LEADING_PRECISION,
			SECOND_PRECISION,
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
			case START_LEADING_PRECISION_VALUE: return START_LEADING_PRECISION;
			case END_LEADING_PRECISION_VALUE: return END_LEADING_PRECISION;
			case LEADING_PRECISION_VALUE: return LEADING_PRECISION;
			case SECOND_PRECISION_VALUE: return SECOND_PRECISION;
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
