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
 * A representation of the literals of the enumeration '<em><b>Supplied Any Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getSuppliedAnyTypes()
 * @model
 * @generated
 */
public enum SuppliedAnyTypes implements Enumerator {
	/**
	 * The '<em><b>SYSANYDATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSANYDATA_VALUE
	 * @generated
	 * @ordered
	 */
	SYSANYDATA(0, "SYSANYDATA", "SYSANYDATA"),

	/**
	 * The '<em><b>SYSANYTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSANYTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SYSANYTYPE(1, "SYSANYTYPE", "SYSANYTYPE"),

	/**
	 * The '<em><b>SYSANYDATASET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSANYDATASET_VALUE
	 * @generated
	 * @ordered
	 */
	SYSANYDATASET(2, "SYSANYDATASET", "SYSANYDATASET");

	/**
	 * The '<em><b>SYSANYDATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSANYDATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSANYDATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSANYDATA_VALUE = 0;

	/**
	 * The '<em><b>SYSANYTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSANYTYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSANYTYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSANYTYPE_VALUE = 1;

	/**
	 * The '<em><b>SYSANYDATASET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSANYDATASET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSANYDATASET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSANYDATASET_VALUE = 2;

	/**
	 * An array of all the '<em><b>Supplied Any Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SuppliedAnyTypes[] VALUES_ARRAY =
		new SuppliedAnyTypes[] {
			SYSANYDATA,
			SYSANYTYPE,
			SYSANYDATASET,
		};

	/**
	 * A public read-only list of all the '<em><b>Supplied Any Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SuppliedAnyTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Supplied Any Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedAnyTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedAnyTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied Any Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedAnyTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedAnyTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied Any Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedAnyTypes get(int value) {
		switch (value) {
			case SYSANYDATA_VALUE: return SYSANYDATA;
			case SYSANYTYPE_VALUE: return SYSANYTYPE;
			case SYSANYDATASET_VALUE: return SYSANYDATASET;
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
	private SuppliedAnyTypes(int value, String name, String literal) {
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
	
} //SuppliedAnyTypes
