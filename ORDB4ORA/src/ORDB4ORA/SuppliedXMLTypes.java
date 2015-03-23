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
 * A representation of the literals of the enumeration '<em><b>Supplied XML Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getSuppliedXMLTypes()
 * @model
 * @generated
 */
public enum SuppliedXMLTypes implements Enumerator {
	/**
	 * The '<em><b>XMLTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMLTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	XMLTYPE(0, "XMLTYPE", "XMLTYPE"),

	/**
	 * The '<em><b>URITYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URITYPE_VALUE
	 * @generated
	 * @ordered
	 */
	URITYPE(1, "URITYPE", "URITYPE");

	/**
	 * The '<em><b>XMLTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMLTYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMLTYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XMLTYPE_VALUE = 0;

	/**
	 * The '<em><b>URITYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URITYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URITYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URITYPE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Supplied XML Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SuppliedXMLTypes[] VALUES_ARRAY =
		new SuppliedXMLTypes[] {
			XMLTYPE,
			URITYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Supplied XML Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SuppliedXMLTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Supplied XML Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedXMLTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedXMLTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied XML Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedXMLTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedXMLTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied XML Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedXMLTypes get(int value) {
		switch (value) {
			case XMLTYPE_VALUE: return XMLTYPE;
			case URITYPE_VALUE: return URITYPE;
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
	private SuppliedXMLTypes(int value, String name, String literal) {
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
	
} //SuppliedXMLTypes
