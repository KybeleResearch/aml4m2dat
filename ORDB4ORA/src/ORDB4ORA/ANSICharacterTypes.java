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
 * A representation of the literals of the enumeration '<em><b>ANSI Character Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getANSICharacterTypes()
 * @model
 * @generated
 */
public enum ANSICharacterTypes implements Enumerator {
	/**
	 * The '<em><b>CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTER(0, "CHARACTER", "CHARACTER"),

	/**
	 * The '<em><b>CHARACTERVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTERVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTERVARYING(1, "CHARACTERVARYING", "CHARACTERVARYING"),

	/**
	 * The '<em><b>CHARVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	CHARVARYING(2, "CHARVARYING", "CHARVARYING"),

	/**
	 * The '<em><b>NCHARVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCHARVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	NCHARVARYING(3, "NCHARVARYING", "NCHARVARYING"),

	/**
	 * The '<em><b>VARCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	VARCHAR(4, "VARCHAR", "VARCHAR"),

	/**
	 * The '<em><b>NATIONALCHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHARACTER(5, "NATIONALCHARACTER", "NATIONALCHARACTER"),

	/**
	 * The '<em><b>NATIONALCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHAR(6, "NATIONALCHAR", "NATIONALCHAR"),

	/**
	 * The '<em><b>NATIONALCHARACTERVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARACTERVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHARACTERVARYING(7, "NATIONALCHARACTERVARYING", "NATIONALCHARACTERVARYING"),

	/**
	 * The '<em><b>NATIONALCHARVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHARVARYING(8, "NATIONALCHARVARYING", "NATIONALCHARVARYING");

	/**
	 * The '<em><b>CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_VALUE = 0;

	/**
	 * The '<em><b>CHARACTERVARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTERVARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTERVARYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTERVARYING_VALUE = 1;

	/**
	 * The '<em><b>CHARVARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARVARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARVARYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARVARYING_VALUE = 2;

	/**
	 * The '<em><b>NCHARVARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NCHARVARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NCHARVARYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCHARVARYING_VALUE = 3;

	/**
	 * The '<em><b>VARCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARCHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARCHAR_VALUE = 4;

	/**
	 * The '<em><b>NATIONALCHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONALCHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARACTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONALCHARACTER_VALUE = 5;

	/**
	 * The '<em><b>NATIONALCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONALCHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONALCHAR_VALUE = 6;

	/**
	 * The '<em><b>NATIONALCHARACTERVARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONALCHARACTERVARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARACTERVARYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONALCHARACTERVARYING_VALUE = 7;

	/**
	 * The '<em><b>NATIONALCHARVARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONALCHARVARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARVARYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONALCHARVARYING_VALUE = 8;

	/**
	 * An array of all the '<em><b>ANSI Character Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ANSICharacterTypes[] VALUES_ARRAY =
		new ANSICharacterTypes[] {
			CHARACTER,
			CHARACTERVARYING,
			CHARVARYING,
			NCHARVARYING,
			VARCHAR,
			NATIONALCHARACTER,
			NATIONALCHAR,
			NATIONALCHARACTERVARYING,
			NATIONALCHARVARYING,
		};

	/**
	 * A public read-only list of all the '<em><b>ANSI Character Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ANSICharacterTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ANSI Character Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ANSICharacterTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ANSICharacterTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ANSI Character Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ANSICharacterTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ANSICharacterTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ANSI Character Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ANSICharacterTypes get(int value) {
		switch (value) {
			case CHARACTER_VALUE: return CHARACTER;
			case CHARACTERVARYING_VALUE: return CHARACTERVARYING;
			case CHARVARYING_VALUE: return CHARVARYING;
			case NCHARVARYING_VALUE: return NCHARVARYING;
			case VARCHAR_VALUE: return VARCHAR;
			case NATIONALCHARACTER_VALUE: return NATIONALCHARACTER;
			case NATIONALCHAR_VALUE: return NATIONALCHAR;
			case NATIONALCHARACTERVARYING_VALUE: return NATIONALCHARACTERVARYING;
			case NATIONALCHARVARYING_VALUE: return NATIONALCHARVARYING;
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
	private ANSICharacterTypes(int value, String name, String literal) {
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
	
} //ANSICharacterTypes
