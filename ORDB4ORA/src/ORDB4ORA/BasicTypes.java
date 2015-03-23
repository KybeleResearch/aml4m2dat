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
 * A representation of the literals of the enumeration '<em><b>Basic Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getBasicTypes()
 * @model
 * @generated
 */
public enum BasicTypes implements Enumerator {
	/**
	 * The '<em><b>CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(0, "CHAR", "CHAR"),

	/**
	 * The '<em><b>VARCHAR2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARCHAR2_VALUE
	 * @generated
	 * @ordered
	 */
	VARCHAR2(1, "VARCHAR2", "VARCHAR2"),

	/**
	 * The '<em><b>NCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	NCHAR(2, "NCHAR", "NCHAR"),

	/**
	 * The '<em><b>NVARCHAR2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NVARCHAR2_VALUE
	 * @generated
	 * @ordered
	 */
	NVARCHAR2(3, "NVARCHAR2", "NVARCHAR2"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(4, "NUMBER", "NUMBER"),

	/**
	 * The '<em><b>LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(5, "LONG", "LONG"),

	/**
	 * The '<em><b>LONGRAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONGRAW_VALUE
	 * @generated
	 * @ordered
	 */
	LONGRAW(6, "LONGRAW", "LONGRAW"),

	/**
	 * The '<em><b>RAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW_VALUE
	 * @generated
	 * @ordered
	 */
	RAW(7, "RAW", "RAW"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(8, "DATE", "DATE"),

	/**
	 * The '<em><b>TIMESTAMPWITHTIMEZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMPWITHTIMEZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMPWITHTIMEZONE(9, "TIMESTAMPWITHTIMEZONE", "TIMESTAMPWITHTIMEZONE"),

	/**
	 * The '<em><b>INTERNALDAYTOSECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNALDAYTOSECOND_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNALDAYTOSECOND(10, "INTERNALDAYTOSECOND", "INTERNALDAYTOSECOND"),

	/**
	 * The '<em><b>ROWID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROWID_VALUE
	 * @generated
	 * @ordered
	 */
	ROWID(11, "ROWID", "ROWID"),

	/**
	 * The '<em><b>UROWID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UROWID_VALUE
	 * @generated
	 * @ordered
	 */
	UROWID(12, "UROWID", "UROWID"),

	/**
	 * The '<em><b>CHARACTERVARAYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTERVARAYING_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTERVARAYING(13, "CHARACTERVARAYING", "CHARACTERVARAYING"),

	/**
	 * The '<em><b>CHARVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	CHARVARYING(14, "CHARVARYING", "CHARVARYING"),

	/**
	 * The '<em><b>NCHARVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCHARVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	NCHARVARYING(15, "NCHARVARYING", "NCHARVARYING"),

	/**
	 * The '<em><b>NATIONALCHARACTERVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARACTERVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHARACTERVARYING(16, "NATIONALCHARACTERVARYING", "NATIONALCHARACTERVARYING"),

	/**
	 * The '<em><b>NATIONALCHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHARACTER(17, "NATIONALCHARACTER", "NATIONALCHARACTER"),

	/**
	 * The '<em><b>NATIONALCHARVARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHARVARYING_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHARVARYING(18, "NATIONALCHARVARYING", "NATIONALCHARVARYING"),

	/**
	 * The '<em><b>NATIONALCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONALCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONALCHAR(19, "NATIONALCHAR", "NATIONALCHAR"),

	/**
	 * The '<em><b>NUMERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(20, "NUMERIC", "NUMERIC"),

	/**
	 * The '<em><b>DECIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(21, "DECIMAL", "DECIMAL"),

	/**
	 * The '<em><b>DEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEC_VALUE
	 * @generated
	 * @ordered
	 */
	DEC(22, "DEC", "DEC"),

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(23, "INTEGER", "INTEGER"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(24, "INT", "INT"),

	/**
	 * The '<em><b>SMALLINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLINT_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLINT(25, "SMALLINT", "SMALLINT"),

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(26, "FLOAT", "FLOAT"),

	/**
	 * The '<em><b>DOUBLEPRECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLEPRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLEPRECISION(27, "DOUBLEPRECISION", "DOUBLEPRECISION"),

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(28, "REAL", "REAL"),

	/**
	 * The '<em><b>SYS Any Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS_ANY_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SYS_ANY_DATA(29, "SYSAnyData", "SYSAnyData"),

	/**
	 * The '<em><b>SYS Any Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS_ANY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SYS_ANY_TYPE(30, "SYSAnyType", "SYSAnyType"),

	/**
	 * The '<em><b>SYS Any Data Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS_ANY_DATA_SET_VALUE
	 * @generated
	 * @ordered
	 */
	SYS_ANY_DATA_SET(31, "SYSAnyDataSet", "SYSAnyDataSet"),

	/**
	 * The '<em><b>XML Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	XML_TYPE(32, "XMLType", "XMLType"),

	/**
	 * The '<em><b>URI Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	URI_TYPE(33, "URIType", "URIType"),

	/**
	 * The '<em><b>MDSYSSDO Geometry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSYSSDO_GEOMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	MDSYSSDO_GEOMETRY(34, "MDSYSSDO_Geometry", "MDSYSSDO_Geometry"),

	/**
	 * The '<em><b>ORDSYSORD Audio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_AUDIO_VALUE
	 * @generated
	 * @ordered
	 */
	ORDSYSORD_AUDIO(35, "ORDSYSORDAudio", "ORDSYSORDAudio"),

	/**
	 * The '<em><b>ORDSYSORD Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORDSYSORD_IMAGE(36, "ORDSYSORDImage", "ORDSYSORDImage"),

	/**
	 * The '<em><b>ORDSYSORD Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	ORDSYSORD_VIDEO(37, "ORDSYSORDVideo", "ORDSYSORDVideo"),

	/**
	 * The '<em><b>ORDSYSORD Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_DOC_VALUE
	 * @generated
	 * @ordered
	 */
	ORDSYSORD_DOC(38, "ORDSYSORDDoc", "ORDSYSORDDoc");

	/**
	 * The '<em><b>CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 0;

	/**
	 * The '<em><b>VARCHAR2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARCHAR2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARCHAR2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARCHAR2_VALUE = 1;

	/**
	 * The '<em><b>NCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NCHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCHAR_VALUE = 2;

	/**
	 * The '<em><b>NVARCHAR2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NVARCHAR2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NVARCHAR2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NVARCHAR2_VALUE = 3;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 4;

	/**
	 * The '<em><b>LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 5;

	/**
	 * The '<em><b>LONGRAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONGRAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONGRAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONGRAW_VALUE = 6;

	/**
	 * The '<em><b>RAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAW_VALUE = 7;

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
	public static final int DATE_VALUE = 8;

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
	public static final int TIMESTAMPWITHTIMEZONE_VALUE = 9;

	/**
	 * The '<em><b>INTERNALDAYTOSECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERNALDAYTOSECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNALDAYTOSECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERNALDAYTOSECOND_VALUE = 10;

	/**
	 * The '<em><b>ROWID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROWID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROWID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROWID_VALUE = 11;

	/**
	 * The '<em><b>UROWID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UROWID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UROWID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UROWID_VALUE = 12;

	/**
	 * The '<em><b>CHARACTERVARAYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTERVARAYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTERVARAYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTERVARAYING_VALUE = 13;

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
	public static final int CHARVARYING_VALUE = 14;

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
	public static final int NCHARVARYING_VALUE = 15;

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
	public static final int NATIONALCHARACTERVARYING_VALUE = 16;

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
	public static final int NATIONALCHARACTER_VALUE = 17;

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
	public static final int NATIONALCHARVARYING_VALUE = 18;

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
	public static final int NATIONALCHAR_VALUE = 19;

	/**
	 * The '<em><b>NUMERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMERIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 20;

	/**
	 * The '<em><b>DECIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECIMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 21;

	/**
	 * The '<em><b>DEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEC_VALUE = 22;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 23;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 24;

	/**
	 * The '<em><b>SMALLINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALLINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALLINT_VALUE = 25;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 26;

	/**
	 * The '<em><b>DOUBLEPRECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLEPRECISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLEPRECISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLEPRECISION_VALUE = 27;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 28;

	/**
	 * The '<em><b>SYS Any Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYS Any Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYS_ANY_DATA
	 * @model name="SYSAnyData"
	 * @generated
	 * @ordered
	 */
	public static final int SYS_ANY_DATA_VALUE = 29;

	/**
	 * The '<em><b>SYS Any Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYS Any Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYS_ANY_TYPE
	 * @model name="SYSAnyType"
	 * @generated
	 * @ordered
	 */
	public static final int SYS_ANY_TYPE_VALUE = 30;

	/**
	 * The '<em><b>SYS Any Data Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYS Any Data Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYS_ANY_DATA_SET
	 * @model name="SYSAnyDataSet"
	 * @generated
	 * @ordered
	 */
	public static final int SYS_ANY_DATA_SET_VALUE = 31;

	/**
	 * The '<em><b>XML Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_TYPE
	 * @model name="XMLType"
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_VALUE = 32;

	/**
	 * The '<em><b>URI Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URI Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URI_TYPE
	 * @model name="URIType"
	 * @generated
	 * @ordered
	 */
	public static final int URI_TYPE_VALUE = 33;

	/**
	 * The '<em><b>MDSYSSDO Geometry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MDSYSSDO Geometry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MDSYSSDO_GEOMETRY
	 * @model name="MDSYSSDO_Geometry"
	 * @generated
	 * @ordered
	 */
	public static final int MDSYSSDO_GEOMETRY_VALUE = 34;

	/**
	 * The '<em><b>ORDSYSORD Audio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORDSYSORD Audio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_AUDIO
	 * @model name="ORDSYSORDAudio"
	 * @generated
	 * @ordered
	 */
	public static final int ORDSYSORD_AUDIO_VALUE = 35;

	/**
	 * The '<em><b>ORDSYSORD Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORDSYSORD Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_IMAGE
	 * @model name="ORDSYSORDImage"
	 * @generated
	 * @ordered
	 */
	public static final int ORDSYSORD_IMAGE_VALUE = 36;

	/**
	 * The '<em><b>ORDSYSORD Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORDSYSORD Video</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_VIDEO
	 * @model name="ORDSYSORDVideo"
	 * @generated
	 * @ordered
	 */
	public static final int ORDSYSORD_VIDEO_VALUE = 37;

	/**
	 * The '<em><b>ORDSYSORD Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORDSYSORD Doc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDSYSORD_DOC
	 * @model name="ORDSYSORDDoc"
	 * @generated
	 * @ordered
	 */
	public static final int ORDSYSORD_DOC_VALUE = 38;

	/**
	 * An array of all the '<em><b>Basic Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasicTypes[] VALUES_ARRAY =
		new BasicTypes[] {
			CHAR,
			VARCHAR2,
			NCHAR,
			NVARCHAR2,
			NUMBER,
			LONG,
			LONGRAW,
			RAW,
			DATE,
			TIMESTAMPWITHTIMEZONE,
			INTERNALDAYTOSECOND,
			ROWID,
			UROWID,
			CHARACTERVARAYING,
			CHARVARYING,
			NCHARVARYING,
			NATIONALCHARACTERVARYING,
			NATIONALCHARACTER,
			NATIONALCHARVARYING,
			NATIONALCHAR,
			NUMERIC,
			DECIMAL,
			DEC,
			INTEGER,
			INT,
			SMALLINT,
			FLOAT,
			DOUBLEPRECISION,
			REAL,
			SYS_ANY_DATA,
			SYS_ANY_TYPE,
			SYS_ANY_DATA_SET,
			XML_TYPE,
			URI_TYPE,
			MDSYSSDO_GEOMETRY,
			ORDSYSORD_AUDIO,
			ORDSYSORD_IMAGE,
			ORDSYSORD_VIDEO,
			ORDSYSORD_DOC,
		};

	/**
	 * A public read-only list of all the '<em><b>Basic Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BasicTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basic Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasicTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basic Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasicTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basic Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicTypes get(int value) {
		switch (value) {
			case CHAR_VALUE: return CHAR;
			case VARCHAR2_VALUE: return VARCHAR2;
			case NCHAR_VALUE: return NCHAR;
			case NVARCHAR2_VALUE: return NVARCHAR2;
			case NUMBER_VALUE: return NUMBER;
			case LONG_VALUE: return LONG;
			case LONGRAW_VALUE: return LONGRAW;
			case RAW_VALUE: return RAW;
			case DATE_VALUE: return DATE;
			case TIMESTAMPWITHTIMEZONE_VALUE: return TIMESTAMPWITHTIMEZONE;
			case INTERNALDAYTOSECOND_VALUE: return INTERNALDAYTOSECOND;
			case ROWID_VALUE: return ROWID;
			case UROWID_VALUE: return UROWID;
			case CHARACTERVARAYING_VALUE: return CHARACTERVARAYING;
			case CHARVARYING_VALUE: return CHARVARYING;
			case NCHARVARYING_VALUE: return NCHARVARYING;
			case NATIONALCHARACTERVARYING_VALUE: return NATIONALCHARACTERVARYING;
			case NATIONALCHARACTER_VALUE: return NATIONALCHARACTER;
			case NATIONALCHARVARYING_VALUE: return NATIONALCHARVARYING;
			case NATIONALCHAR_VALUE: return NATIONALCHAR;
			case NUMERIC_VALUE: return NUMERIC;
			case DECIMAL_VALUE: return DECIMAL;
			case DEC_VALUE: return DEC;
			case INTEGER_VALUE: return INTEGER;
			case INT_VALUE: return INT;
			case SMALLINT_VALUE: return SMALLINT;
			case FLOAT_VALUE: return FLOAT;
			case DOUBLEPRECISION_VALUE: return DOUBLEPRECISION;
			case REAL_VALUE: return REAL;
			case SYS_ANY_DATA_VALUE: return SYS_ANY_DATA;
			case SYS_ANY_TYPE_VALUE: return SYS_ANY_TYPE;
			case SYS_ANY_DATA_SET_VALUE: return SYS_ANY_DATA_SET;
			case XML_TYPE_VALUE: return XML_TYPE;
			case URI_TYPE_VALUE: return URI_TYPE;
			case MDSYSSDO_GEOMETRY_VALUE: return MDSYSSDO_GEOMETRY;
			case ORDSYSORD_AUDIO_VALUE: return ORDSYSORD_AUDIO;
			case ORDSYSORD_IMAGE_VALUE: return ORDSYSORD_IMAGE;
			case ORDSYSORD_VIDEO_VALUE: return ORDSYSORD_VIDEO;
			case ORDSYSORD_DOC_VALUE: return ORDSYSORD_DOC;
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
	private BasicTypes(int value, String name, String literal) {
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
	
} //BasicTypes
