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
 * A representation of the literals of the enumeration '<em><b>Datetime Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SQL2003_evo.SQL2003_evoPackage#getDatetimeTypes()
 * @model
 * @generated
 */
public enum DatetimeTypes implements Enumerator {
	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(0, "DATE", "DATE"),

	/**
	 * The '<em><b>TIMEWITHTIMEZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEWITHTIMEZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEWITHTIMEZONE(1, "TIMEWITHTIMEZONE", "TIMEWITHTIMEZONE"),

	/**
	 * The '<em><b>TIMEWITHOUTTIMEZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEWITHOUTTIMEZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEWITHOUTTIMEZONE(2, "TIMEWITHOUTTIMEZONE", "TIMEWITHOUTTIMEZONE"),

	/**
	 * The '<em><b>TIMESTAMPWITHOUTTIMEZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHOUTTIMEZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMPWITHOUTTIMEZONE(3, "TIMESTAMPWITHOUTTIMEZONE", "TIMESTAMPWITHOUTTIMEZONE"),

	/**
	 * The '<em><b>TIMESTAMPWITHTIMEZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHTIMEZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMPWITHTIMEZONE(4, "TIMESTAMPWITHTIMEZONE", "TIMESTAMPWITHTIMEZONE");

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 0;

	/**
	 * The '<em><b>TIMEWITHTIMEZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEWITHTIMEZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEWITHTIMEZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEWITHTIMEZONE_VALUE = 1;

	/**
	 * The '<em><b>TIMEWITHOUTTIMEZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEWITHOUTTIMEZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEWITHOUTTIMEZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEWITHOUTTIMEZONE_VALUE = 2;

	/**
	 * The '<em><b>TIMESTAMPWITHOUTTIMEZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMPWITHOUTTIMEZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHOUTTIMEZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMPWITHOUTTIMEZONE_VALUE = 3;

	/**
	 * The '<em><b>TIMESTAMPWITHTIMEZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMPWITHTIMEZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHTIMEZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMPWITHTIMEZONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Datetime Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatetimeTypes[] VALUES_ARRAY =
		new DatetimeTypes[] {
			DATE,
			TIMEWITHTIMEZONE,
			TIMEWITHOUTTIMEZONE,
			TIMESTAMPWITHOUTTIMEZONE,
			TIMESTAMPWITHTIMEZONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Datetime Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatetimeTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datetime Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatetimeTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatetimeTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datetime Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatetimeTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatetimeTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datetime Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatetimeTypes get(int value) {
		switch (value) {
			case DATE_VALUE: return DATE;
			case TIMEWITHTIMEZONE_VALUE: return TIMEWITHTIMEZONE;
			case TIMEWITHOUTTIMEZONE_VALUE: return TIMEWITHOUTTIMEZONE;
			case TIMESTAMPWITHOUTTIMEZONE_VALUE: return TIMESTAMPWITHOUTTIMEZONE;
			case TIMESTAMPWITHTIMEZONE_VALUE: return TIMESTAMPWITHTIMEZONE;
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
	private DatetimeTypes(int value, String name, String literal) {
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
	
} //DatetimeTypes
