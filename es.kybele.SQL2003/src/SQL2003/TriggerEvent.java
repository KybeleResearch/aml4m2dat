/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Event</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SQL2003.SQL2003Package#getTriggerEvent()
 * @model
 * @generated
 */
public enum TriggerEvent implements Enumerator {
	/**
	 * The '<em><b>INSERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(0, "INSERT", "INSERT"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(1, "DELETE", "DELETE"),

	/**
	 * The '<em><b>UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(2, "UPDATE", "UPDATE");

	/**
	 * The '<em><b>INSERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 0;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 1;

	/**
	 * The '<em><b>UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Trigger Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerEvent[] VALUES_ARRAY =
		new TriggerEvent[] {
			INSERT,
			DELETE,
			UPDATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggerEvent> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Event</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerEvent get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerEvent result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Event</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerEvent getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerEvent result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Event</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerEvent get(int value) {
		switch (value) {
			case INSERT_VALUE: return INSERT;
			case DELETE_VALUE: return DELETE;
			case UPDATE_VALUE: return UPDATE;
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
	private TriggerEvent(int value, String name, String literal) {
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
	
} //TriggerEvent
