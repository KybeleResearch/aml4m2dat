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
 * A representation of the literals of the enumeration '<em><b>Character String Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SQL2003_V3.SQL2003_V3Package#getCharacterStringTypes()
 * @model
 * @generated
 */
public enum CharacterStringTypes implements Enumerator {
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
	 * The '<em><b>CHARACTERLARGEOBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTERLARGEOBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTERLARGEOBJECT(2, "CHARACTERLARGEOBJECT", "CHARACTERLARGEOBJECT");

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
	 * The '<em><b>CHARACTERLARGEOBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTERLARGEOBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTERLARGEOBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTERLARGEOBJECT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Character String Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CharacterStringTypes[] VALUES_ARRAY =
		new CharacterStringTypes[] {
			CHARACTER,
			CHARACTERVARYING,
			CHARACTERLARGEOBJECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Character String Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CharacterStringTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Character String Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CharacterStringTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacterStringTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Character String Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CharacterStringTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacterStringTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Character String Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CharacterStringTypes get(int value) {
		switch (value) {
			case CHARACTER_VALUE: return CHARACTER;
			case CHARACTERVARYING_VALUE: return CHARACTERVARYING;
			case CHARACTERLARGEOBJECT_VALUE: return CHARACTERLARGEOBJECT;
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
	private CharacterStringTypes(int value, String name, String literal) {
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
	
} //CharacterStringTypes
