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
 * A representation of the literals of the enumeration '<em><b>Supplied Spacial Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getSuppliedSpacialTypes()
 * @model
 * @generated
 */
public enum SuppliedSpacialTypes implements Enumerator {
	/**
	 * The '<em><b>SDO GEOMETRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDO_GEOMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	SDO_GEOMETRY(0, "SDO_GEOMETRY", "SDO_GEOMETRY"),

	/**
	 * The '<em><b>SDO TOPO GEOMETRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDO_TOPO_GEOMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	SDO_TOPO_GEOMETRY(1, "SDO_TOPO_GEOMETRY", "SDO_TOPO_GEOMETRY"), /**
	 * The '<em><b>SDO RASTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDO_RASTER_VALUE
	 * @generated
	 * @ordered
	 */
	SDO_RASTER(2, "SDO_RASTER", "SDO_RASTER");

	/**
	 * The '<em><b>SDO GEOMETRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SDO GEOMETRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SDO_GEOMETRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SDO_GEOMETRY_VALUE = 0;

	/**
	 * The '<em><b>SDO TOPO GEOMETRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SDO TOPO GEOMETRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SDO_TOPO_GEOMETRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SDO_TOPO_GEOMETRY_VALUE = 1;

	/**
	 * The '<em><b>SDO RASTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SDO RASTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SDO_RASTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SDO_RASTER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Supplied Spacial Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SuppliedSpacialTypes[] VALUES_ARRAY =
		new SuppliedSpacialTypes[] {
			SDO_GEOMETRY,
			SDO_TOPO_GEOMETRY,
			SDO_RASTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Supplied Spacial Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SuppliedSpacialTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Supplied Spacial Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedSpacialTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedSpacialTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied Spacial Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedSpacialTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedSpacialTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied Spacial Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedSpacialTypes get(int value) {
		switch (value) {
			case SDO_GEOMETRY_VALUE: return SDO_GEOMETRY;
			case SDO_TOPO_GEOMETRY_VALUE: return SDO_TOPO_GEOMETRY;
			case SDO_RASTER_VALUE: return SDO_RASTER;
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
	private SuppliedSpacialTypes(int value, String name, String literal) {
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
	
} //SuppliedSpacialTypes
