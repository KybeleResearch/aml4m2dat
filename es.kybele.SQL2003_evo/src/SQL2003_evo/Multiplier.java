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
 * A representation of the literals of the enumeration '<em><b>Multiplier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SQL2003_evo.SQL2003_evoPackage#getMultiplier()
 * @model
 * @generated
 */
public enum Multiplier implements Enumerator {
	/**
	 * The '<em><b>K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #K_VALUE
	 * @generated
	 * @ordered
	 */
	K(0, "K", "K"),

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(1, "M", "M"),

	/**
	 * The '<em><b>G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #G_VALUE
	 * @generated
	 * @ordered
	 */
	G(2, "G", "G"),

	/**
	 * The '<em><b>T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T_VALUE
	 * @generated
	 * @ordered
	 */
	T(3, "T", "T"),

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P_VALUE
	 * @generated
	 * @ordered
	 */
	P(4, "P", "P");

	/**
	 * The '<em><b>K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>K</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #K
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int K_VALUE = 0;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 1;

	/**
	 * The '<em><b>G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #G
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int G_VALUE = 2;

	/**
	 * The '<em><b>T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T_VALUE = 3;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #P
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P_VALUE = 4;

	/**
	 * An array of all the '<em><b>Multiplier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplier[] VALUES_ARRAY =
		new Multiplier[] {
			K,
			M,
			G,
			T,
			P,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Multiplier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Multiplier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Multiplier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Multiplier get(int value) {
		switch (value) {
			case K_VALUE: return K;
			case M_VALUE: return M;
			case G_VALUE: return G;
			case T_VALUE: return T;
			case P_VALUE: return P;
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
	private Multiplier(int value, String name, String literal) {
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
	
} //Multiplier
