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
 * A representation of the literals of the enumeration '<em><b>Built In Datetime Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getBuiltInDatetimeTypes()
 * @model
 * @generated
 */
public enum BuiltInDatetimeTypes implements Enumerator {
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
	 * The '<em><b>TIMESTAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP(1, "TIMESTAMP", "TIMESTAMP"),

	/**
	 * The '<em><b>TIMESTAMPWITHTIMEZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHTIMEZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMPWITHTIMEZONE(2, "TIMESTAMPWITHTIMEZONE", "TIMESTAMPWITHTIMEZONE"),

	/**
	 * The '<em><b>TIMESTAMPWITHLOCALTIMEZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHLOCALTIMEZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMPWITHLOCALTIMEZONE(3, "TIMESTAMPWITHLOCALTIMEZONE", "TIMESTAMPWITHLOCALTIMEZONE"),

	/**
	 * The '<em><b>INTERVALYEARTOMONTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVALYEARTOMONTH_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVALYEARTOMONTH(4, "INTERVALYEARTOMONTH", "INTERVALYEARTOMONTH"), /**
	 * The '<em><b>INTERVALDAYTOSECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVALDAYTOSECOND_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVALDAYTOSECOND(5, "INTERVALDAYTOSECOND", "INTERVALDAYTOSECOND");

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
	 * The '<em><b>TIMESTAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_VALUE = 1;

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
	public static final int TIMESTAMPWITHTIMEZONE_VALUE = 2;

	/**
	 * The '<em><b>TIMESTAMPWITHLOCALTIMEZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMPWITHLOCALTIMEZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHLOCALTIMEZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMPWITHLOCALTIMEZONE_VALUE = 3;

	/**
	 * The '<em><b>INTERVALYEARTOMONTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERVALYEARTOMONTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVALYEARTOMONTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERVALYEARTOMONTH_VALUE = 4;

	/**
	 * The '<em><b>INTERVALDAYTOSECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERVALDAYTOSECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVALDAYTOSECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERVALDAYTOSECOND_VALUE = 5;

	/**
	 * An array of all the '<em><b>Built In Datetime Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BuiltInDatetimeTypes[] VALUES_ARRAY =
		new BuiltInDatetimeTypes[] {
			DATE,
			TIMESTAMP,
			TIMESTAMPWITHTIMEZONE,
			TIMESTAMPWITHLOCALTIMEZONE,
			INTERVALYEARTOMONTH,
			INTERVALDAYTOSECOND,
		};

	/**
	 * A public read-only list of all the '<em><b>Built In Datetime Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BuiltInDatetimeTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Built In Datetime Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuiltInDatetimeTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuiltInDatetimeTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Built In Datetime Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuiltInDatetimeTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuiltInDatetimeTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Built In Datetime Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuiltInDatetimeTypes get(int value) {
		switch (value) {
			case DATE_VALUE: return DATE;
			case TIMESTAMP_VALUE: return TIMESTAMP;
			case TIMESTAMPWITHTIMEZONE_VALUE: return TIMESTAMPWITHTIMEZONE;
			case TIMESTAMPWITHLOCALTIMEZONE_VALUE: return TIMESTAMPWITHLOCALTIMEZONE;
			case INTERVALYEARTOMONTH_VALUE: return INTERVALYEARTOMONTH;
			case INTERVALDAYTOSECOND_VALUE: return INTERVALDAYTOSECOND;
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
	private BuiltInDatetimeTypes(int value, String name, String literal) {
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
	
} //BuiltInDatetimeTypes
