/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAFactory
 * @model kind="package"
 * @generated
 */
public interface ORDB4ORAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ORDB4ORA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ORDB4ORA.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ORDB4ORA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ORDB4ORAPackage eINSTANCE = ORDB4ORA.impl.ORDB4ORAPackageImpl.init();

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ModelImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 24;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.DatatypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 12;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.RestrictionImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 37;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.AttributeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.NestedTableTypeImpl <em>Nested Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.NestedTableTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNestedTableType()
	 * @generated
	 */
	int NESTED_TABLE_TYPE = 25;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.BasicDataTypeImpl <em>Basic Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.BasicDataTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBasicDataType()
	 * @generated
	 */
	int BASIC_DATA_TYPE = 5;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.LOBTypeImpl <em>LOB Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.LOBTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getLOBType()
	 * @generated
	 */
	int LOB_TYPE = 19;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ROWIDTypeImpl <em>ROWID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ROWIDTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getROWIDType()
	 * @generated
	 */
	int ROWID_TYPE = 34;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ANSICharacterTypeImpl <em>ANSI Character Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ANSICharacterTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSICharacterType()
	 * @generated
	 */
	int ANSI_CHARACTER_TYPE = 0;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ANSINumberTypeImpl <em>ANSI Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ANSINumberTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSINumberType()
	 * @generated
	 */
	int ANSI_NUMBER_TYPE = 1;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.AnyTypeImpl <em>Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.AnyTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 3;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.XMLTypeImpl <em>XML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.XMLTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getXMLType()
	 * @generated
	 */
	int XML_TYPE = 49;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.SpacialTypeImpl <em>Spacial Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.SpacialTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSpacialType()
	 * @generated
	 */
	int SPACIAL_TYPE = 39;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.MediaTypeImpl <em>Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.MediaTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 21;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.VarrayImpl <em>Varray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.VarrayImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getVarray()
	 * @generated
	 */
	int VARRAY = 48;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.StructuredTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getStructuredType()
	 * @generated
	 */
	int STRUCTURED_TYPE = 42;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.MethodImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 22;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.TypedTableImpl <em>Typed Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.TypedTableImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTypedTable()
	 * @generated
	 */
	int TYPED_TABLE = 46;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.StoredNestedTableImpl <em>Stored Nested Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.StoredNestedTableImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getStoredNestedTable()
	 * @generated
	 */
	int STORED_NESTED_TABLE = 40;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ReferenceTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 36;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.TableImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 44;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.StructuralComponentImpl <em>Structural Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.StructuralComponentImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getStructuralComponent()
	 * @generated
	 */
	int STRUCTURAL_COMPONENT = 41;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The number of structural features of the '<em>Basic Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ForeignKeyImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 16;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.PrimaryKeyImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 32;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.UniqueImpl <em>Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.UniqueImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getUnique()
	 * @generated
	 */
	int UNIQUE = 47;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.NotNullImpl <em>Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.NotNullImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNotNull()
	 * @generated
	 */
	int NOT_NULL = 26;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.CheckImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 10;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ParameterImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 31;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.BuiltInTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInType()
	 * @generated
	 */
	int BUILT_IN_TYPE = 8;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ANSITypeImpl <em>ANSI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ANSITypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSIType()
	 * @generated
	 */
	int ANSI_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_TYPE__MODEL = BASIC_DATA_TYPE__MODEL;

	/**
	 * The number of structural features of the '<em>ANSI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_TYPE_FEATURE_COUNT = BASIC_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.SuppliedTypeImpl <em>Supplied Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.SuppliedTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedType()
	 * @generated
	 */
	int SUPPLIED_TYPE = 43;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.BuiltInCharacterTypeImpl <em>Built In Character Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.BuiltInCharacterTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInCharacterType()
	 * @generated
	 */
	int BUILT_IN_CHARACTER_TYPE = 6;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.BuiltInNumberTypeImpl <em>Built In Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.BuiltInNumberTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInNumberType()
	 * @generated
	 */
	int BUILT_IN_NUMBER_TYPE = 7;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.LongAndRawTypeImpl <em>Long And Raw Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.LongAndRawTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getLongAndRawType()
	 * @generated
	 */
	int LONG_AND_RAW_TYPE = 20;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.DatetimeTypeImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatetimeType()
	 * @generated
	 */
	int DATETIME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_CHARACTER_TYPE__MODEL = ANSI_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_CHARACTER_TYPE__DESCRIPTOR = ANSI_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ANSI Character Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_CHARACTER_TYPE_FEATURE_COUNT = ANSI_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_NUMBER_TYPE__MODEL = ANSI_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_NUMBER_TYPE__DESCRIPTOR = ANSI_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ANSI Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSI_NUMBER_TYPE_FEATURE_COUNT = ANSI_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_TYPE__MODEL = BASIC_DATA_TYPE__MODEL;

	/**
	 * The number of structural features of the '<em>Supplied Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_TYPE_FEATURE_COUNT = BASIC_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__MODEL = SUPPLIED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__DESCRIPTOR = SUPPLIED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FEATURE_COUNT = SUPPLIED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__FEATURES = 2;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__RESTRICTIONS = 3;

	/**
	 * The number of structural features of the '<em>Structural Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = STRUCTURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = STRUCTURAL_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FEATURES = STRUCTURAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RESTRICTIONS = STRUCTURAL_COMPONENT__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Structured</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STRUCTURED = STRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE__MODEL = BASIC_DATA_TYPE__MODEL;

	/**
	 * The number of structural features of the '<em>Built In Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE_FEATURE_COUNT = BASIC_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CHARACTER_TYPE__MODEL = BUILT_IN_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CHARACTER_TYPE__DESCRIPTOR = BUILT_IN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CHARACTER_TYPE__SEMANTIC = BUILT_IN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CHARACTER_TYPE__SIZE_MIN = BUILT_IN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CHARACTER_TYPE__SIZE_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CHARACTER_TYPE__SIZE_DEF = BUILT_IN_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Built In Character Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CHARACTER_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_NUMBER_TYPE__MODEL = BUILT_IN_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_NUMBER_TYPE__DESCRIPTOR = BUILT_IN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision Mn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_NUMBER_TYPE__PRECISION_MN = BUILT_IN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_NUMBER_TYPE__PRECISION_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_NUMBER_TYPE__SCALE_MIN = BUILT_IN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_NUMBER_TYPE__SCALE_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Built In Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_NUMBER_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.FeatureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 15;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.CharacterFeatureImpl <em>Character Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.CharacterFeatureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getCharacterFeature()
	 * @generated
	 */
	int CHARACTER_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__ATTRIBUTES = RESTRICTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CONDITION = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__NAME = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.NumberFeatureImpl <em>Number Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.NumberFeatureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNumberFeature()
	 * @generated
	 */
	int NUMBER_FEATURE = 27;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.RawFeatureImpl <em>Raw Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.RawFeatureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRawFeature()
	 * @generated
	 */
	int RAW_FEATURE = 35;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.RowFeatureImpl <em>Row Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.RowFeatureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRowFeature()
	 * @generated
	 */
	int ROW_FEATURE = 38;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.DatetimeFeatureImpl <em>Datetime Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.DatetimeFeatureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatetimeFeature()
	 * @generated
	 */
	int DATETIME_FEATURE = 13;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.IntervalFeatureImpl <em>Interval Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.IntervalFeatureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getIntervalFeature()
	 * @generated
	 */
	int INTERVAL_FEATURE = 18;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ColumnImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = STRUCTURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = STRUCTURAL_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FEATURES = STRUCTURAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__RESTRICTIONS = STRUCTURAL_COMPONENT__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = STRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datetime Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__MODEL = BUILT_IN_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__DESCRIPTOR = BUILT_IN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Precision Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__SECOND_PRECISION_MIN = BUILT_IN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__SECOND_PRECISION_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second Precision Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__SECOND_PRECISION_DEF = BUILT_IN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Day Precision Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__DAY_PRECISION_MIN = BUILT_IN_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Day Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__DAY_PRECISION_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Day Precision Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__DAY_PRECISION_DEF = BUILT_IN_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Year Precision Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__YEAR_PRECISION_MIN = BUILT_IN_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Year Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__YEAR_PRECISION_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Year Precision Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__YEAR_PRECISION_DEF = BUILT_IN_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Datetime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ATTRIBUTES = RESTRICTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ON_DELETE = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERENCE = RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.PackageImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 30;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.OperationImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = 1;

	/**
	 * The feature id for the '<em><b>Operation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MODEL = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.MethodParameterImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getMethodParameter()
	 * @generated
	 */
	int METHOD_PARAMETER = 23;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.OperationParameterImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getOperationParameter()
	 * @generated
	 */
	int OPERATION_PARAMETER = 29;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ProcedureImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 33;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.FunctionImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Operation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OPERATION_PARAMETERS = OPERATION__OPERATION_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MODEL = OPERATION__MODEL;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PACKAGE = OPERATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interval Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_TYPE__MODEL = BUILT_IN_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_TYPE__DESCRIPTOR = BUILT_IN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LOB Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_AND_RAW_TYPE__MODEL = BUILT_IN_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_AND_RAW_TYPE__DESCRIPTOR = BUILT_IN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_AND_RAW_TYPE__SIZE_MIN = BUILT_IN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_AND_RAW_TYPE__SIZE_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Long And Raw Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_AND_RAW_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__MODEL = SUPPLIED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__DESCRIPTOR = SUPPLIED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_FEATURE_COUNT = SUPPLIED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>Structured</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STRUCTURED = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__METHOD = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_TABLE_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_TABLE_TYPE__NAME = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_TABLE_TYPE__TYPE = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nested Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_TABLE_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__ATTRIBUTES = RESTRICTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__NAME = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__MODE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__OPERATION = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODEL = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__ATTRIBUTES = RESTRICTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__BODY = OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Operation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__OPERATION_PARAMETERS = OPERATION__OPERATION_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MODEL = OPERATION__MODEL;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PACKAGE = OPERATION__PACKAGE;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROWID_TYPE__MODEL = BUILT_IN_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROWID_TYPE__DESCRIPTOR = BUILT_IN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROWID_TYPE__SIZE_MIN = BUILT_IN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROWID_TYPE__SIZE_MAX = BUILT_IN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ROWID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROWID_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Raw Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__NAME = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__TYPE = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Row Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACIAL_TYPE__MODEL = SUPPLIED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACIAL_TYPE__DESCRIPTOR = SUPPLIED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spacial Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACIAL_TYPE_FEATURE_COUNT = SUPPLIED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_NESTED_TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_NESTED_TABLE__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Typed</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_NESTED_TABLE__TYPED = 2;

	/**
	 * The number of structural features of the '<em>Stored Nested Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_NESTED_TABLE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__NAME = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__ATTRIBUTE = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__METHOD = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Typed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__TYPED = DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__SUPERTYPE = DATATYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is instantiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__IS_INSTANTIABLE = DATATYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__IS_FINAL = DATATYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Structured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RESTRICTION = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MODEL = 3;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TRIGGERS = 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.TriggerImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__BODY = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Update Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__UPDATE_COLUMNS = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TABLE = 5;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__RESTRICTION = TABLE__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__MODEL = TABLE__MODEL;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__TRIGGERS = TABLE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Stored Nested</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__STORED_NESTED = TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structured Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__STRUCTURED_TYPE = TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__ATTRIBUTES = RESTRICTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__NAME = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARRAY__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARRAY__NAME = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARRAY__NUM_ELEMENTS = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARRAY__TYPE = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Varray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARRAY_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__MODEL = SUPPLIED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__DESCRIPTOR = SUPPLIED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE_FEATURE_COUNT = SUPPLIED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.DerivedTableImpl <em>Derived Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.DerivedTableImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDerivedTable()
	 * @generated
	 */
	int DERIVED_TABLE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__NAME = TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__RESTRICTION = TABLE__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__MODEL = TABLE__MODEL;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__TRIGGERS = TABLE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Query expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__QUERY_EXPRESSION = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ORDB4ORA.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.impl.ViewImpl
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = DERIVED_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__RESTRICTION = DERIVED_TABLE__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COLUMNS = DERIVED_TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__MODEL = DERIVED_TABLE__MODEL;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TRIGGERS = DERIVED_TABLE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Query expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__QUERY_EXPRESSION = DERIVED_TABLE__QUERY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TABLES = DERIVED_TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COMPONENTS = DERIVED_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = DERIVED_TABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ORDB4ORA.ONDELETEActions <em>ONDELETE Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.ONDELETEActions
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getONDELETEActions()
	 * @generated
	 */
	int ONDELETE_ACTIONS = 65;


	/**
	 * The meta object id for the '{@link ORDB4ORA.BuiltInCharacterTypes <em>Built In Character Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.BuiltInCharacterTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInCharacterTypes()
	 * @generated
	 */
	int BUILT_IN_CHARACTER_TYPES = 55;

	/**
	 * The meta object id for the '{@link ORDB4ORA.BuiltInCharacterSemantics <em>Built In Character Semantics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.BuiltInCharacterSemantics
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInCharacterSemantics()
	 * @generated
	 */
	int BUILT_IN_CHARACTER_SEMANTICS = 54;

	/**
	 * The meta object id for the '{@link ORDB4ORA.BuiltNumberTypes <em>Built Number Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.BuiltNumberTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltNumberTypes()
	 * @generated
	 */
	int BUILT_NUMBER_TYPES = 60;

	/**
	 * The meta object id for the '{@link ORDB4ORA.BuiltInLongAndRawTypes <em>Built In Long And Raw Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.BuiltInLongAndRawTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInLongAndRawTypes()
	 * @generated
	 */
	int BUILT_IN_LONG_AND_RAW_TYPES = 58;

	/**
	 * The meta object id for the '{@link ORDB4ORA.BuiltInDatetimeTypes <em>Built In Datetime Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.BuiltInDatetimeTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInDatetimeTypes()
	 * @generated
	 */
	int BUILT_IN_DATETIME_TYPES = 56;

	/**
	 * The meta object id for the '{@link ORDB4ORA.BuiltInLOBType <em>Built In LOB Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.BuiltInLOBType
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInLOBType()
	 * @generated
	 */
	int BUILT_IN_LOB_TYPE = 57;

	/**
	 * The meta object id for the '{@link ORDB4ORA.BuiltInROWIDType <em>Built In ROWID Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.BuiltInROWIDType
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInROWIDType()
	 * @generated
	 */
	int BUILT_IN_ROWID_TYPE = 59;

	/**
	 * The meta object id for the '{@link ORDB4ORA.ANSICharacterTypes <em>ANSI Character Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.ANSICharacterTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSICharacterTypes()
	 * @generated
	 */
	int ANSI_CHARACTER_TYPES = 52;

	/**
	 * The meta object id for the '{@link ORDB4ORA.ANSINumberTypes <em>ANSI Number Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.ANSINumberTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSINumberTypes()
	 * @generated
	 */
	int ANSI_NUMBER_TYPES = 53;

	/**
	 * The meta object id for the '{@link ORDB4ORA.SuppliedAnyTypes <em>Supplied Any Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.SuppliedAnyTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedAnyTypes()
	 * @generated
	 */
	int SUPPLIED_ANY_TYPES = 69;

	/**
	 * The meta object id for the '{@link ORDB4ORA.SuppliedXMLTypes <em>Supplied XML Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.SuppliedXMLTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedXMLTypes()
	 * @generated
	 */
	int SUPPLIED_XML_TYPES = 72;

	/**
	 * The meta object id for the '{@link ORDB4ORA.SuppliedSpacialTypes <em>Supplied Spacial Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.SuppliedSpacialTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedSpacialTypes()
	 * @generated
	 */
	int SUPPLIED_SPACIAL_TYPES = 71;

	/**
	 * The meta object id for the '{@link ORDB4ORA.SuppliedMediaTypes <em>Supplied Media Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.SuppliedMediaTypes
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedMediaTypes()
	 * @generated
	 */
	int SUPPLIED_MEDIA_TYPES = 70;


	/**
	 * The meta object id for the '{@link ORDB4ORA.CharacterFeatures <em>Character Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.CharacterFeatures
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getCharacterFeatures()
	 * @generated
	 */
	int CHARACTER_FEATURES = 61;

	/**
	 * The meta object id for the '{@link ORDB4ORA.NumberFeatures <em>Number Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.NumberFeatures
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNumberFeatures()
	 * @generated
	 */
	int NUMBER_FEATURES = 64;

	/**
	 * The meta object id for the '{@link ORDB4ORA.RawFeatures <em>Raw Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.RawFeatures
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRawFeatures()
	 * @generated
	 */
	int RAW_FEATURES = 67;

	/**
	 * The meta object id for the '{@link ORDB4ORA.RowFeatures <em>Row Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.RowFeatures
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRowFeatures()
	 * @generated
	 */
	int ROW_FEATURES = 68;

	/**
	 * The meta object id for the '{@link ORDB4ORA.DatetimeFeatures <em>Datetime Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.DatetimeFeatures
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatetimeFeatures()
	 * @generated
	 */
	int DATETIME_FEATURES = 62;

	/**
	 * The meta object id for the '{@link ORDB4ORA.IntervalFeatures <em>Interval Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.IntervalFeatures
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getIntervalFeatures()
	 * @generated
	 */
	int INTERVAL_FEATURES = 63;


	/**
	 * The meta object id for the '{@link ORDB4ORA.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.ParameterMode
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 66;

	/**
	 * The meta object id for the '{@link ORDB4ORA.TriggerActionTime <em>Trigger Action Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.TriggerActionTime
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTriggerActionTime()
	 * @generated
	 */
	int TRIGGER_ACTION_TIME = 73;

	/**
	 * The meta object id for the '{@link ORDB4ORA.TriggerEvent <em>Trigger Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ORDB4ORA.TriggerEvent
	 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTriggerEvent()
	 * @generated
	 */
	int TRIGGER_EVENT = 74;


	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ORDB4ORA.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Model#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see ORDB4ORA.Model#getDatatype()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Model#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see ORDB4ORA.Model#getTable()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Table();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Model#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see ORDB4ORA.Model#getOperation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Model#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see ORDB4ORA.Model#getPackage()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Package();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see ORDB4ORA.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Datatype#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see ORDB4ORA.Datatype#getModel()
	 * @see #getDatatype()
	 * @generated
	 */
	EReference getDatatype_Model();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see ORDB4ORA.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Restriction#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see ORDB4ORA.Restriction#getTable()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Table();

	/**
	 * Returns the meta object for the reference list '{@link ORDB4ORA.Restriction#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see ORDB4ORA.Restriction#getAttributes()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Attributes();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ORDB4ORA.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Attribute#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured</em>'.
	 * @see ORDB4ORA.Attribute#getStructured()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Structured();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see ORDB4ORA.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.NestedTableType <em>Nested Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Table Type</em>'.
	 * @see ORDB4ORA.NestedTableType
	 * @generated
	 */
	EClass getNestedTableType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.NestedTableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.NestedTableType#getName()
	 * @see #getNestedTableType()
	 * @generated
	 */
	EAttribute getNestedTableType_Name();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.NestedTableType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ORDB4ORA.NestedTableType#getType()
	 * @see #getNestedTableType()
	 * @generated
	 */
	EReference getNestedTableType_Type();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.BasicDataType <em>Basic Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Data Type</em>'.
	 * @see ORDB4ORA.BasicDataType
	 * @generated
	 */
	EClass getBasicDataType();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.LOBType <em>LOB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LOB Type</em>'.
	 * @see ORDB4ORA.LOBType
	 * @generated
	 */
	EClass getLOBType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.LOBType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.LOBType#getDescriptor()
	 * @see #getLOBType()
	 * @generated
	 */
	EAttribute getLOBType_Descriptor();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.ROWIDType <em>ROWID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROWID Type</em>'.
	 * @see ORDB4ORA.ROWIDType
	 * @generated
	 */
	EClass getROWIDType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ROWIDType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.ROWIDType#getDescriptor()
	 * @see #getROWIDType()
	 * @generated
	 */
	EAttribute getROWIDType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ROWIDType#getSize_Min <em>Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Min</em>'.
	 * @see ORDB4ORA.ROWIDType#getSize_Min()
	 * @see #getROWIDType()
	 * @generated
	 */
	EAttribute getROWIDType_Size_Min();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ROWIDType#getSize_Max <em>Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Max</em>'.
	 * @see ORDB4ORA.ROWIDType#getSize_Max()
	 * @see #getROWIDType()
	 * @generated
	 */
	EAttribute getROWIDType_Size_Max();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.ANSICharacterType <em>ANSI Character Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANSI Character Type</em>'.
	 * @see ORDB4ORA.ANSICharacterType
	 * @generated
	 */
	EClass getANSICharacterType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ANSICharacterType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.ANSICharacterType#getDescriptor()
	 * @see #getANSICharacterType()
	 * @generated
	 */
	EAttribute getANSICharacterType_Descriptor();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.ANSINumberType <em>ANSI Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANSI Number Type</em>'.
	 * @see ORDB4ORA.ANSINumberType
	 * @generated
	 */
	EClass getANSINumberType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ANSINumberType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.ANSINumberType#getDescriptor()
	 * @see #getANSINumberType()
	 * @generated
	 */
	EAttribute getANSINumberType_Descriptor();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see ORDB4ORA.AnyType
	 * @generated
	 */
	EClass getAnyType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.AnyType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.AnyType#getDescriptor()
	 * @see #getAnyType()
	 * @generated
	 */
	EAttribute getAnyType_Descriptor();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.XMLType <em>XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Type</em>'.
	 * @see ORDB4ORA.XMLType
	 * @generated
	 */
	EClass getXMLType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.XMLType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.XMLType#getDescriptor()
	 * @see #getXMLType()
	 * @generated
	 */
	EAttribute getXMLType_Descriptor();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.DerivedTable <em>Derived Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Table</em>'.
	 * @see ORDB4ORA.DerivedTable
	 * @generated
	 */
	EClass getDerivedTable();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DerivedTable#getQuery_expression <em>Query expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query expression</em>'.
	 * @see ORDB4ORA.DerivedTable#getQuery_expression()
	 * @see #getDerivedTable()
	 * @generated
	 */
	EAttribute getDerivedTable_Query_expression();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see ORDB4ORA.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link ORDB4ORA.View#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see ORDB4ORA.View#getTables()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Tables();

	/**
	 * Returns the meta object for the reference list '{@link ORDB4ORA.View#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see ORDB4ORA.View#getComponents()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Components();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.SpacialType <em>Spacial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacial Type</em>'.
	 * @see ORDB4ORA.SpacialType
	 * @generated
	 */
	EClass getSpacialType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.SpacialType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.SpacialType#getDescriptor()
	 * @see #getSpacialType()
	 * @generated
	 */
	EAttribute getSpacialType_Descriptor();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type</em>'.
	 * @see ORDB4ORA.MediaType
	 * @generated
	 */
	EClass getMediaType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.MediaType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.MediaType#getDescriptor()
	 * @see #getMediaType()
	 * @generated
	 */
	EAttribute getMediaType_Descriptor();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see ORDB4ORA.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Character Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="ORDB4ORA.CharacterFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getCharacterFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCharacterFeature()
	 * @generated
	 */
	EAttribute getCharacterFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCharacterFeature()
	 * @generated
	 */
	EAttribute getCharacterFeature_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Number Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="ORDB4ORA.NumberFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getNumberFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNumberFeature()
	 * @generated
	 */
	EAttribute getNumberFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNumberFeature()
	 * @generated
	 */
	EAttribute getNumberFeature_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Raw Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="ORDB4ORA.RawFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getRawFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRawFeature()
	 * @generated
	 */
	EAttribute getRawFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRawFeature()
	 * @generated
	 */
	EAttribute getRawFeature_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Row Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="ORDB4ORA.RowFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getRowFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRowFeature()
	 * @generated
	 */
	EAttribute getRowFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRowFeature()
	 * @generated
	 */
	EAttribute getRowFeature_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Datetime Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="ORDB4ORA.DatetimeFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getDatetimeFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDatetimeFeature()
	 * @generated
	 */
	EAttribute getDatetimeFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDatetimeFeature()
	 * @generated
	 */
	EAttribute getDatetimeFeature_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Interval Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="ORDB4ORA.IntervalFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getIntervalFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntervalFeature()
	 * @generated
	 */
	EAttribute getIntervalFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntervalFeature()
	 * @generated
	 */
	EAttribute getIntervalFeature_Value();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see ORDB4ORA.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see ORDB4ORA.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see ORDB4ORA.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Package#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ORDB4ORA.Package#getOperations()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Operations();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Package#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see ORDB4ORA.Package#getModel()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Model();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ORDB4ORA.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see ORDB4ORA.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Operation#getOperationParameters <em>Operation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Parameters</em>'.
	 * @see ORDB4ORA.Operation#getOperationParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OperationParameters();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Operation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see ORDB4ORA.Operation#getModel()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Model();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Operation#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see ORDB4ORA.Operation#getPackage()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Package();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter</em>'.
	 * @see ORDB4ORA.MethodParameter
	 * @generated
	 */
	EClass getMethodParameter();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.MethodParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see ORDB4ORA.MethodParameter#getMethod()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EReference getMethodParameter_Method();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.OperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Parameter</em>'.
	 * @see ORDB4ORA.OperationParameter
	 * @generated
	 */
	EClass getOperationParameter();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.OperationParameter#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ORDB4ORA.OperationParameter#getMode()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EAttribute getOperationParameter_Mode();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.OperationParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see ORDB4ORA.OperationParameter#getOperation()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EReference getOperationParameter_Operation();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see ORDB4ORA.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see ORDB4ORA.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.Function#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see ORDB4ORA.Function#getReturn()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Return();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see ORDB4ORA.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Trigger#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see ORDB4ORA.Trigger#getBody()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Body();

	/**
	 * Returns the meta object for the attribute list '{@link ORDB4ORA.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event</em>'.
	 * @see ORDB4ORA.Trigger#getEvent()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Event();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Trigger#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see ORDB4ORA.Trigger#getAction()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Action();

	/**
	 * Returns the meta object for the reference list '{@link ORDB4ORA.Trigger#getUpdateColumns <em>Update Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Update Columns</em>'.
	 * @see ORDB4ORA.Trigger#getUpdateColumns()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_UpdateColumns();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Trigger#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see ORDB4ORA.Trigger#getTable()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Table();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.StructuralComponent <em>Structural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Component</em>'.
	 * @see ORDB4ORA.StructuralComponent
	 * @generated
	 */
	EClass getStructuralComponent();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.StructuralComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.StructuralComponent#getName()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EAttribute getStructuralComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.StructuralComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ORDB4ORA.StructuralComponent#getType()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.StructuralComponent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see ORDB4ORA.StructuralComponent#getFeatures()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Features();

	/**
	 * Returns the meta object for the reference list '{@link ORDB4ORA.StructuralComponent#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrictions</em>'.
	 * @see ORDB4ORA.StructuralComponent#getRestrictions()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Restrictions();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Varray <em>Varray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Varray</em>'.
	 * @see ORDB4ORA.Varray
	 * @generated
	 */
	EClass getVarray();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Varray#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Varray#getName()
	 * @see #getVarray()
	 * @generated
	 */
	EAttribute getVarray_Name();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Varray#getNumElements <em>Num Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Elements</em>'.
	 * @see ORDB4ORA.Varray#getNumElements()
	 * @see #getVarray()
	 * @generated
	 */
	EAttribute getVarray_NumElements();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.Varray#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ORDB4ORA.Varray#getType()
	 * @see #getVarray()
	 * @generated
	 */
	EReference getVarray_Type();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.StructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Type</em>'.
	 * @see ORDB4ORA.StructuredType
	 * @generated
	 */
	EClass getStructuredType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.StructuredType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.StructuredType#getName()
	 * @see #getStructuredType()
	 * @generated
	 */
	EAttribute getStructuredType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.StructuredType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see ORDB4ORA.StructuredType#getAttribute()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.StructuredType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see ORDB4ORA.StructuredType#getMethod()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.StructuredType#getTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typed</em>'.
	 * @see ORDB4ORA.StructuredType#getTyped()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Typed();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.StructuredType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see ORDB4ORA.StructuredType#getSupertype()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Supertype();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.StructuredType#isIs_instantiable <em>Is instantiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is instantiable</em>'.
	 * @see ORDB4ORA.StructuredType#isIs_instantiable()
	 * @see #getStructuredType()
	 * @generated
	 */
	EAttribute getStructuredType_Is_instantiable();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.StructuredType#isIs_final <em>Is final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is final</em>'.
	 * @see ORDB4ORA.StructuredType#isIs_final()
	 * @see #getStructuredType()
	 * @generated
	 */
	EAttribute getStructuredType_Is_final();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see ORDB4ORA.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.Method#getOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override</em>'.
	 * @see ORDB4ORA.Method#getOverride()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Override();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Method#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured</em>'.
	 * @see ORDB4ORA.Method#getStructured()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Structured();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see ORDB4ORA.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see ORDB4ORA.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ORDB4ORA.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.TypedTable <em>Typed Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Table</em>'.
	 * @see ORDB4ORA.TypedTable
	 * @generated
	 */
	EClass getTypedTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.TypedTable#getStoredNested <em>Stored Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stored Nested</em>'.
	 * @see ORDB4ORA.TypedTable#getStoredNested()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_StoredNested();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.TypedTable#getStructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Type</em>'.
	 * @see ORDB4ORA.TypedTable#getStructuredType()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_StructuredType();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.StoredNestedTable <em>Stored Nested Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Nested Table</em>'.
	 * @see ORDB4ORA.StoredNestedTable
	 * @generated
	 */
	EClass getStoredNestedTable();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.StoredNestedTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.StoredNestedTable#getName()
	 * @see #getStoredNestedTable()
	 * @generated
	 */
	EAttribute getStoredNestedTable_Name();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.StoredNestedTable#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see ORDB4ORA.StoredNestedTable#getAttribute()
	 * @see #getStoredNestedTable()
	 * @generated
	 */
	EReference getStoredNestedTable_Attribute();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.StoredNestedTable#getTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Typed</em>'.
	 * @see ORDB4ORA.StoredNestedTable#getTyped()
	 * @see #getStoredNestedTable()
	 * @generated
	 */
	EReference getStoredNestedTable_Typed();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see ORDB4ORA.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ReferenceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.ReferenceType#getName()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Name();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.ReferenceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ORDB4ORA.ReferenceType#getType()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Type();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see ORDB4ORA.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Table#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restriction</em>'.
	 * @see ORDB4ORA.Table#getRestriction()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Restriction();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see ORDB4ORA.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the container reference '{@link ORDB4ORA.Table#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see ORDB4ORA.Table#getModel()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link ORDB4ORA.Table#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see ORDB4ORA.Table#getTriggers()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Triggers();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see ORDB4ORA.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.ForeignKey#getName()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.ForeignKey#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see ORDB4ORA.ForeignKey#getOnDelete()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_OnDelete();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.ForeignKey#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see ORDB4ORA.ForeignKey#getReference()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Reference();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see ORDB4ORA.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.PrimaryKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.PrimaryKey#getName()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Name();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique</em>'.
	 * @see ORDB4ORA.Unique
	 * @generated
	 */
	EClass getUnique();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Unique#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Unique#getName()
	 * @see #getUnique()
	 * @generated
	 */
	EAttribute getUnique_Name();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.NotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null</em>'.
	 * @see ORDB4ORA.NotNull
	 * @generated
	 */
	EClass getNotNull();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.NotNull#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.NotNull#getName()
	 * @see #getNotNull()
	 * @generated
	 */
	EAttribute getNotNull_Name();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see ORDB4ORA.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Check#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ORDB4ORA.Check#getCondition()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Condition();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Check#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Check#getName()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Name();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ORDB4ORA.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ORDB4ORA.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link ORDB4ORA.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ORDB4ORA.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.BuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Type</em>'.
	 * @see ORDB4ORA.BuiltInType
	 * @generated
	 */
	EClass getBuiltInType();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.ANSIType <em>ANSI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANSI Type</em>'.
	 * @see ORDB4ORA.ANSIType
	 * @generated
	 */
	EClass getANSIType();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.SuppliedType <em>Supplied Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplied Type</em>'.
	 * @see ORDB4ORA.SuppliedType
	 * @generated
	 */
	EClass getSuppliedType();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.BuiltInCharacterType <em>Built In Character Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Character Type</em>'.
	 * @see ORDB4ORA.BuiltInCharacterType
	 * @generated
	 */
	EClass getBuiltInCharacterType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInCharacterType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.BuiltInCharacterType#getDescriptor()
	 * @see #getBuiltInCharacterType()
	 * @generated
	 */
	EAttribute getBuiltInCharacterType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInCharacterType#getSemantic <em>Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic</em>'.
	 * @see ORDB4ORA.BuiltInCharacterType#getSemantic()
	 * @see #getBuiltInCharacterType()
	 * @generated
	 */
	EAttribute getBuiltInCharacterType_Semantic();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInCharacterType#getSize_Min <em>Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Min</em>'.
	 * @see ORDB4ORA.BuiltInCharacterType#getSize_Min()
	 * @see #getBuiltInCharacterType()
	 * @generated
	 */
	EAttribute getBuiltInCharacterType_Size_Min();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInCharacterType#getSize_Max <em>Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Max</em>'.
	 * @see ORDB4ORA.BuiltInCharacterType#getSize_Max()
	 * @see #getBuiltInCharacterType()
	 * @generated
	 */
	EAttribute getBuiltInCharacterType_Size_Max();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInCharacterType#getSize_Def <em>Size Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Def</em>'.
	 * @see ORDB4ORA.BuiltInCharacterType#getSize_Def()
	 * @see #getBuiltInCharacterType()
	 * @generated
	 */
	EAttribute getBuiltInCharacterType_Size_Def();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.BuiltInNumberType <em>Built In Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Number Type</em>'.
	 * @see ORDB4ORA.BuiltInNumberType
	 * @generated
	 */
	EClass getBuiltInNumberType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInNumberType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.BuiltInNumberType#getDescriptor()
	 * @see #getBuiltInNumberType()
	 * @generated
	 */
	EAttribute getBuiltInNumberType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInNumberType#getPrecision_Mn <em>Precision Mn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision Mn</em>'.
	 * @see ORDB4ORA.BuiltInNumberType#getPrecision_Mn()
	 * @see #getBuiltInNumberType()
	 * @generated
	 */
	EAttribute getBuiltInNumberType_Precision_Mn();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInNumberType#getPrecision_Max <em>Precision Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision Max</em>'.
	 * @see ORDB4ORA.BuiltInNumberType#getPrecision_Max()
	 * @see #getBuiltInNumberType()
	 * @generated
	 */
	EAttribute getBuiltInNumberType_Precision_Max();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInNumberType#getScale_Min <em>Scale Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Min</em>'.
	 * @see ORDB4ORA.BuiltInNumberType#getScale_Min()
	 * @see #getBuiltInNumberType()
	 * @generated
	 */
	EAttribute getBuiltInNumberType_Scale_Min();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.BuiltInNumberType#getScale_Max <em>Scale Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Max</em>'.
	 * @see ORDB4ORA.BuiltInNumberType#getScale_Max()
	 * @see #getBuiltInNumberType()
	 * @generated
	 */
	EAttribute getBuiltInNumberType_Scale_Max();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.LongAndRawType <em>Long And Raw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long And Raw Type</em>'.
	 * @see ORDB4ORA.LongAndRawType
	 * @generated
	 */
	EClass getLongAndRawType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.LongAndRawType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.LongAndRawType#getDescriptor()
	 * @see #getLongAndRawType()
	 * @generated
	 */
	EAttribute getLongAndRawType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.LongAndRawType#getSize_Min <em>Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Min</em>'.
	 * @see ORDB4ORA.LongAndRawType#getSize_Min()
	 * @see #getLongAndRawType()
	 * @generated
	 */
	EAttribute getLongAndRawType_Size_Min();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.LongAndRawType#getSize_Max <em>Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Max</em>'.
	 * @see ORDB4ORA.LongAndRawType#getSize_Max()
	 * @see #getLongAndRawType()
	 * @generated
	 */
	EAttribute getLongAndRawType_Size_Max();

	/**
	 * Returns the meta object for class '{@link ORDB4ORA.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Type</em>'.
	 * @see ORDB4ORA.DatetimeType
	 * @generated
	 */
	EClass getDatetimeType();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see ORDB4ORA.DatetimeType#getDescriptor()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getSecondPrecision_Min <em>Second Precision Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Precision Min</em>'.
	 * @see ORDB4ORA.DatetimeType#getSecondPrecision_Min()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_SecondPrecision_Min();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getSecondPrecision_Max <em>Second Precision Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Precision Max</em>'.
	 * @see ORDB4ORA.DatetimeType#getSecondPrecision_Max()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_SecondPrecision_Max();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getSecondPrecision_Def <em>Second Precision Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Precision Def</em>'.
	 * @see ORDB4ORA.DatetimeType#getSecondPrecision_Def()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_SecondPrecision_Def();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getDayPrecision_Min <em>Day Precision Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Precision Min</em>'.
	 * @see ORDB4ORA.DatetimeType#getDayPrecision_Min()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_DayPrecision_Min();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getDayPrecision_Max <em>Day Precision Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Precision Max</em>'.
	 * @see ORDB4ORA.DatetimeType#getDayPrecision_Max()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_DayPrecision_Max();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getDayPrecision_Def <em>Day Precision Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Precision Def</em>'.
	 * @see ORDB4ORA.DatetimeType#getDayPrecision_Def()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_DayPrecision_Def();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getYearPrecision_Min <em>Year Precision Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Precision Min</em>'.
	 * @see ORDB4ORA.DatetimeType#getYearPrecision_Min()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_YearPrecision_Min();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getYearPrecision_Max <em>Year Precision Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Precision Max</em>'.
	 * @see ORDB4ORA.DatetimeType#getYearPrecision_Max()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_YearPrecision_Max();

	/**
	 * Returns the meta object for the attribute '{@link ORDB4ORA.DatetimeType#getYearPrecision_Def <em>Year Precision Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Precision Def</em>'.
	 * @see ORDB4ORA.DatetimeType#getYearPrecision_Def()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_YearPrecision_Def();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.ONDELETEActions <em>ONDELETE Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ONDELETE Actions</em>'.
	 * @see ORDB4ORA.ONDELETEActions
	 * @generated
	 */
	EEnum getONDELETEActions();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.BuiltInCharacterTypes <em>Built In Character Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Character Types</em>'.
	 * @see ORDB4ORA.BuiltInCharacterTypes
	 * @generated
	 */
	EEnum getBuiltInCharacterTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.BuiltInCharacterSemantics <em>Built In Character Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Character Semantics</em>'.
	 * @see ORDB4ORA.BuiltInCharacterSemantics
	 * @generated
	 */
	EEnum getBuiltInCharacterSemantics();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.BuiltNumberTypes <em>Built Number Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built Number Types</em>'.
	 * @see ORDB4ORA.BuiltNumberTypes
	 * @generated
	 */
	EEnum getBuiltNumberTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.BuiltInLongAndRawTypes <em>Built In Long And Raw Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Long And Raw Types</em>'.
	 * @see ORDB4ORA.BuiltInLongAndRawTypes
	 * @generated
	 */
	EEnum getBuiltInLongAndRawTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.BuiltInDatetimeTypes <em>Built In Datetime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Datetime Types</em>'.
	 * @see ORDB4ORA.BuiltInDatetimeTypes
	 * @generated
	 */
	EEnum getBuiltInDatetimeTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.BuiltInLOBType <em>Built In LOB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In LOB Type</em>'.
	 * @see ORDB4ORA.BuiltInLOBType
	 * @generated
	 */
	EEnum getBuiltInLOBType();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.BuiltInROWIDType <em>Built In ROWID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In ROWID Type</em>'.
	 * @see ORDB4ORA.BuiltInROWIDType
	 * @generated
	 */
	EEnum getBuiltInROWIDType();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.ANSICharacterTypes <em>ANSI Character Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ANSI Character Types</em>'.
	 * @see ORDB4ORA.ANSICharacterTypes
	 * @generated
	 */
	EEnum getANSICharacterTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.ANSINumberTypes <em>ANSI Number Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ANSI Number Types</em>'.
	 * @see ORDB4ORA.ANSINumberTypes
	 * @generated
	 */
	EEnum getANSINumberTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.SuppliedAnyTypes <em>Supplied Any Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplied Any Types</em>'.
	 * @see ORDB4ORA.SuppliedAnyTypes
	 * @generated
	 */
	EEnum getSuppliedAnyTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.SuppliedXMLTypes <em>Supplied XML Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplied XML Types</em>'.
	 * @see ORDB4ORA.SuppliedXMLTypes
	 * @generated
	 */
	EEnum getSuppliedXMLTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.SuppliedSpacialTypes <em>Supplied Spacial Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplied Spacial Types</em>'.
	 * @see ORDB4ORA.SuppliedSpacialTypes
	 * @generated
	 */
	EEnum getSuppliedSpacialTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.SuppliedMediaTypes <em>Supplied Media Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplied Media Types</em>'.
	 * @see ORDB4ORA.SuppliedMediaTypes
	 * @generated
	 */
	EEnum getSuppliedMediaTypes();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.CharacterFeatures <em>Character Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Character Features</em>'.
	 * @see ORDB4ORA.CharacterFeatures
	 * @generated
	 */
	EEnum getCharacterFeatures();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.NumberFeatures <em>Number Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Features</em>'.
	 * @see ORDB4ORA.NumberFeatures
	 * @generated
	 */
	EEnum getNumberFeatures();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.RawFeatures <em>Raw Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Raw Features</em>'.
	 * @see ORDB4ORA.RawFeatures
	 * @generated
	 */
	EEnum getRawFeatures();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.RowFeatures <em>Row Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Row Features</em>'.
	 * @see ORDB4ORA.RowFeatures
	 * @generated
	 */
	EEnum getRowFeatures();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.DatetimeFeatures <em>Datetime Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Features</em>'.
	 * @see ORDB4ORA.DatetimeFeatures
	 * @generated
	 */
	EEnum getDatetimeFeatures();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.IntervalFeatures <em>Interval Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interval Features</em>'.
	 * @see ORDB4ORA.IntervalFeatures
	 * @generated
	 */
	EEnum getIntervalFeatures();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see ORDB4ORA.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.TriggerActionTime <em>Trigger Action Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Action Time</em>'.
	 * @see ORDB4ORA.TriggerActionTime
	 * @generated
	 */
	EEnum getTriggerActionTime();

	/**
	 * Returns the meta object for enum '{@link ORDB4ORA.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Event</em>'.
	 * @see ORDB4ORA.TriggerEvent
	 * @generated
	 */
	EEnum getTriggerEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ORDB4ORAFactory getORDB4ORAFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ModelImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATATYPE = eINSTANCE.getModel_Datatype();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TABLE = eINSTANCE.getModel_Table();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OPERATION = eINSTANCE.getModel_Operation();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGE = eINSTANCE.getModel_Package();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.DatatypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE__MODEL = eINSTANCE.getDatatype_Model();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.RestrictionImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION__TABLE = eINSTANCE.getRestriction_Table();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION__ATTRIBUTES = eINSTANCE.getRestriction_Attributes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.AttributeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Structured</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__STRUCTURED = eINSTANCE.getAttribute_Structured();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.NestedTableTypeImpl <em>Nested Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.NestedTableTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNestedTableType()
		 * @generated
		 */
		EClass NESTED_TABLE_TYPE = eINSTANCE.getNestedTableType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_TABLE_TYPE__NAME = eINSTANCE.getNestedTableType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_TABLE_TYPE__TYPE = eINSTANCE.getNestedTableType_Type();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.BasicDataTypeImpl <em>Basic Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.BasicDataTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBasicDataType()
		 * @generated
		 */
		EClass BASIC_DATA_TYPE = eINSTANCE.getBasicDataType();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.LOBTypeImpl <em>LOB Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.LOBTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getLOBType()
		 * @generated
		 */
		EClass LOB_TYPE = eINSTANCE.getLOBType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOB_TYPE__DESCRIPTOR = eINSTANCE.getLOBType_Descriptor();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ROWIDTypeImpl <em>ROWID Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ROWIDTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getROWIDType()
		 * @generated
		 */
		EClass ROWID_TYPE = eINSTANCE.getROWIDType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROWID_TYPE__DESCRIPTOR = eINSTANCE.getROWIDType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Size Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROWID_TYPE__SIZE_MIN = eINSTANCE.getROWIDType_Size_Min();

		/**
		 * The meta object literal for the '<em><b>Size Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROWID_TYPE__SIZE_MAX = eINSTANCE.getROWIDType_Size_Max();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ANSICharacterTypeImpl <em>ANSI Character Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ANSICharacterTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSICharacterType()
		 * @generated
		 */
		EClass ANSI_CHARACTER_TYPE = eINSTANCE.getANSICharacterType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSI_CHARACTER_TYPE__DESCRIPTOR = eINSTANCE.getANSICharacterType_Descriptor();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ANSINumberTypeImpl <em>ANSI Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ANSINumberTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSINumberType()
		 * @generated
		 */
		EClass ANSI_NUMBER_TYPE = eINSTANCE.getANSINumberType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSI_NUMBER_TYPE__DESCRIPTOR = eINSTANCE.getANSINumberType_Descriptor();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.AnyTypeImpl <em>Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.AnyTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getAnyType()
		 * @generated
		 */
		EClass ANY_TYPE = eINSTANCE.getAnyType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_TYPE__DESCRIPTOR = eINSTANCE.getAnyType_Descriptor();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.XMLTypeImpl <em>XML Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.XMLTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getXMLType()
		 * @generated
		 */
		EClass XML_TYPE = eINSTANCE.getXMLType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TYPE__DESCRIPTOR = eINSTANCE.getXMLType_Descriptor();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.DerivedTableImpl <em>Derived Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.DerivedTableImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDerivedTable()
		 * @generated
		 */
		EClass DERIVED_TABLE = eINSTANCE.getDerivedTable();

		/**
		 * The meta object literal for the '<em><b>Query expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_TABLE__QUERY_EXPRESSION = eINSTANCE.getDerivedTable_Query_expression();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ViewImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__TABLES = eINSTANCE.getView_Tables();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__COMPONENTS = eINSTANCE.getView_Components();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.SpacialTypeImpl <em>Spacial Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.SpacialTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSpacialType()
		 * @generated
		 */
		EClass SPACIAL_TYPE = eINSTANCE.getSpacialType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACIAL_TYPE__DESCRIPTOR = eINSTANCE.getSpacialType_Descriptor();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.MediaTypeImpl <em>Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.MediaTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getMediaType()
		 * @generated
		 */
		EClass MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE__DESCRIPTOR = eINSTANCE.getMediaType_Descriptor();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.FeatureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.CharacterFeatureImpl <em>Character Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.CharacterFeatureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getCharacterFeature()
		 * @generated
		 */
		EClass CHARACTER_FEATURE = eINSTANCE.getCharacterFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_FEATURE__KEY = eINSTANCE.getCharacterFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_FEATURE__VALUE = eINSTANCE.getCharacterFeature_Value();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.NumberFeatureImpl <em>Number Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.NumberFeatureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNumberFeature()
		 * @generated
		 */
		EClass NUMBER_FEATURE = eINSTANCE.getNumberFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_FEATURE__KEY = eINSTANCE.getNumberFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_FEATURE__VALUE = eINSTANCE.getNumberFeature_Value();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.RawFeatureImpl <em>Raw Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.RawFeatureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRawFeature()
		 * @generated
		 */
		EClass RAW_FEATURE = eINSTANCE.getRawFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_FEATURE__KEY = eINSTANCE.getRawFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_FEATURE__VALUE = eINSTANCE.getRawFeature_Value();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.RowFeatureImpl <em>Row Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.RowFeatureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRowFeature()
		 * @generated
		 */
		EClass ROW_FEATURE = eINSTANCE.getRowFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_FEATURE__KEY = eINSTANCE.getRowFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_FEATURE__VALUE = eINSTANCE.getRowFeature_Value();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.DatetimeFeatureImpl <em>Datetime Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.DatetimeFeatureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatetimeFeature()
		 * @generated
		 */
		EClass DATETIME_FEATURE = eINSTANCE.getDatetimeFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_FEATURE__KEY = eINSTANCE.getDatetimeFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_FEATURE__VALUE = eINSTANCE.getDatetimeFeature_Value();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.IntervalFeatureImpl <em>Interval Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.IntervalFeatureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getIntervalFeature()
		 * @generated
		 */
		EClass INTERVAL_FEATURE = eINSTANCE.getIntervalFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_FEATURE__KEY = eINSTANCE.getIntervalFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_FEATURE__VALUE = eINSTANCE.getIntervalFeature_Value();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ColumnImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.PackageImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OPERATIONS = eINSTANCE.getPackage_Operations();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MODEL = eINSTANCE.getPackage_Model();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.OperationImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Operation Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATION_PARAMETERS = eINSTANCE.getOperation_OperationParameters();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__MODEL = eINSTANCE.getOperation_Model();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PACKAGE = eINSTANCE.getOperation_Package();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.MethodParameterImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getMethodParameter()
		 * @generated
		 */
		EClass METHOD_PARAMETER = eINSTANCE.getMethodParameter();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PARAMETER__METHOD = eINSTANCE.getMethodParameter_Method();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.OperationParameterImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getOperationParameter()
		 * @generated
		 */
		EClass OPERATION_PARAMETER = eINSTANCE.getOperationParameter();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER__MODE = eINSTANCE.getOperationParameter_Mode();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PARAMETER__OPERATION = eINSTANCE.getOperationParameter_Operation();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ProcedureImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.FunctionImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN = eINSTANCE.getFunction_Return();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.TriggerImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__BODY = eINSTANCE.getTrigger_Body();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTION = eINSTANCE.getTrigger_Action();

		/**
		 * The meta object literal for the '<em><b>Update Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__UPDATE_COLUMNS = eINSTANCE.getTrigger_UpdateColumns();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TABLE = eINSTANCE.getTrigger_Table();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.StructuralComponentImpl <em>Structural Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.StructuralComponentImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getStructuralComponent()
		 * @generated
		 */
		EClass STRUCTURAL_COMPONENT = eINSTANCE.getStructuralComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_COMPONENT__NAME = eINSTANCE.getStructuralComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_COMPONENT__TYPE = eINSTANCE.getStructuralComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_COMPONENT__FEATURES = eINSTANCE.getStructuralComponent_Features();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_COMPONENT__RESTRICTIONS = eINSTANCE.getStructuralComponent_Restrictions();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.VarrayImpl <em>Varray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.VarrayImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getVarray()
		 * @generated
		 */
		EClass VARRAY = eINSTANCE.getVarray();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARRAY__NAME = eINSTANCE.getVarray_Name();

		/**
		 * The meta object literal for the '<em><b>Num Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARRAY__NUM_ELEMENTS = eINSTANCE.getVarray_NumElements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARRAY__TYPE = eINSTANCE.getVarray_Type();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.StructuredTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getStructuredType()
		 * @generated
		 */
		EClass STRUCTURED_TYPE = eINSTANCE.getStructuredType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_TYPE__NAME = eINSTANCE.getStructuredType_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__ATTRIBUTE = eINSTANCE.getStructuredType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__METHOD = eINSTANCE.getStructuredType_Method();

		/**
		 * The meta object literal for the '<em><b>Typed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__TYPED = eINSTANCE.getStructuredType_Typed();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__SUPERTYPE = eINSTANCE.getStructuredType_Supertype();

		/**
		 * The meta object literal for the '<em><b>Is instantiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_TYPE__IS_INSTANTIABLE = eINSTANCE.getStructuredType_Is_instantiable();

		/**
		 * The meta object literal for the '<em><b>Is final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_TYPE__IS_FINAL = eINSTANCE.getStructuredType_Is_final();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.MethodImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__OVERRIDE = eINSTANCE.getMethod_Override();

		/**
		 * The meta object literal for the '<em><b>Structured</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__STRUCTURED = eINSTANCE.getMethod_Structured();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__BODY = eINSTANCE.getMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.TypedTableImpl <em>Typed Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.TypedTableImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTypedTable()
		 * @generated
		 */
		EClass TYPED_TABLE = eINSTANCE.getTypedTable();

		/**
		 * The meta object literal for the '<em><b>Stored Nested</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_TABLE__STORED_NESTED = eINSTANCE.getTypedTable_StoredNested();

		/**
		 * The meta object literal for the '<em><b>Structured Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_TABLE__STRUCTURED_TYPE = eINSTANCE.getTypedTable_StructuredType();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.StoredNestedTableImpl <em>Stored Nested Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.StoredNestedTableImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getStoredNestedTable()
		 * @generated
		 */
		EClass STORED_NESTED_TABLE = eINSTANCE.getStoredNestedTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_NESTED_TABLE__NAME = eINSTANCE.getStoredNestedTable_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_NESTED_TABLE__ATTRIBUTE = eINSTANCE.getStoredNestedTable_Attribute();

		/**
		 * The meta object literal for the '<em><b>Typed</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_NESTED_TABLE__TYPED = eINSTANCE.getStoredNestedTable_Typed();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ReferenceTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__NAME = eINSTANCE.getReferenceType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__TYPE = eINSTANCE.getReferenceType_Type();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.TableImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__RESTRICTION = eINSTANCE.getTable_Restriction();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__MODEL = eINSTANCE.getTable_Model();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TRIGGERS = eINSTANCE.getTable_Triggers();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ForeignKeyImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__NAME = eINSTANCE.getForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__ON_DELETE = eINSTANCE.getForeignKey_OnDelete();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERENCE = eINSTANCE.getForeignKey_Reference();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.PrimaryKeyImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__NAME = eINSTANCE.getPrimaryKey_Name();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.UniqueImpl <em>Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.UniqueImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getUnique()
		 * @generated
		 */
		EClass UNIQUE = eINSTANCE.getUnique();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE__NAME = eINSTANCE.getUnique_Name();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.NotNullImpl <em>Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.NotNullImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNotNull()
		 * @generated
		 */
		EClass NOT_NULL = eINSTANCE.getNotNull();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_NULL__NAME = eINSTANCE.getNotNull_Name();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.CheckImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__CONDITION = eINSTANCE.getCheck_Condition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__NAME = eINSTANCE.getCheck_Name();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ParameterImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.BuiltInTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInType()
		 * @generated
		 */
		EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.ANSITypeImpl <em>ANSI Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.ANSITypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSIType()
		 * @generated
		 */
		EClass ANSI_TYPE = eINSTANCE.getANSIType();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.SuppliedTypeImpl <em>Supplied Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.SuppliedTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedType()
		 * @generated
		 */
		EClass SUPPLIED_TYPE = eINSTANCE.getSuppliedType();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.BuiltInCharacterTypeImpl <em>Built In Character Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.BuiltInCharacterTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInCharacterType()
		 * @generated
		 */
		EClass BUILT_IN_CHARACTER_TYPE = eINSTANCE.getBuiltInCharacterType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_CHARACTER_TYPE__DESCRIPTOR = eINSTANCE.getBuiltInCharacterType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Semantic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_CHARACTER_TYPE__SEMANTIC = eINSTANCE.getBuiltInCharacterType_Semantic();

		/**
		 * The meta object literal for the '<em><b>Size Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_CHARACTER_TYPE__SIZE_MIN = eINSTANCE.getBuiltInCharacterType_Size_Min();

		/**
		 * The meta object literal for the '<em><b>Size Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_CHARACTER_TYPE__SIZE_MAX = eINSTANCE.getBuiltInCharacterType_Size_Max();

		/**
		 * The meta object literal for the '<em><b>Size Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_CHARACTER_TYPE__SIZE_DEF = eINSTANCE.getBuiltInCharacterType_Size_Def();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.BuiltInNumberTypeImpl <em>Built In Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.BuiltInNumberTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInNumberType()
		 * @generated
		 */
		EClass BUILT_IN_NUMBER_TYPE = eINSTANCE.getBuiltInNumberType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_NUMBER_TYPE__DESCRIPTOR = eINSTANCE.getBuiltInNumberType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Precision Mn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_NUMBER_TYPE__PRECISION_MN = eINSTANCE.getBuiltInNumberType_Precision_Mn();

		/**
		 * The meta object literal for the '<em><b>Precision Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_NUMBER_TYPE__PRECISION_MAX = eINSTANCE.getBuiltInNumberType_Precision_Max();

		/**
		 * The meta object literal for the '<em><b>Scale Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_NUMBER_TYPE__SCALE_MIN = eINSTANCE.getBuiltInNumberType_Scale_Min();

		/**
		 * The meta object literal for the '<em><b>Scale Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_NUMBER_TYPE__SCALE_MAX = eINSTANCE.getBuiltInNumberType_Scale_Max();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.LongAndRawTypeImpl <em>Long And Raw Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.LongAndRawTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getLongAndRawType()
		 * @generated
		 */
		EClass LONG_AND_RAW_TYPE = eINSTANCE.getLongAndRawType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_AND_RAW_TYPE__DESCRIPTOR = eINSTANCE.getLongAndRawType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Size Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_AND_RAW_TYPE__SIZE_MIN = eINSTANCE.getLongAndRawType_Size_Min();

		/**
		 * The meta object literal for the '<em><b>Size Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_AND_RAW_TYPE__SIZE_MAX = eINSTANCE.getLongAndRawType_Size_Max();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.impl.DatetimeTypeImpl
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatetimeType()
		 * @generated
		 */
		EClass DATETIME_TYPE = eINSTANCE.getDatetimeType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__DESCRIPTOR = eINSTANCE.getDatetimeType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Second Precision Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__SECOND_PRECISION_MIN = eINSTANCE.getDatetimeType_SecondPrecision_Min();

		/**
		 * The meta object literal for the '<em><b>Second Precision Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__SECOND_PRECISION_MAX = eINSTANCE.getDatetimeType_SecondPrecision_Max();

		/**
		 * The meta object literal for the '<em><b>Second Precision Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__SECOND_PRECISION_DEF = eINSTANCE.getDatetimeType_SecondPrecision_Def();

		/**
		 * The meta object literal for the '<em><b>Day Precision Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__DAY_PRECISION_MIN = eINSTANCE.getDatetimeType_DayPrecision_Min();

		/**
		 * The meta object literal for the '<em><b>Day Precision Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__DAY_PRECISION_MAX = eINSTANCE.getDatetimeType_DayPrecision_Max();

		/**
		 * The meta object literal for the '<em><b>Day Precision Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__DAY_PRECISION_DEF = eINSTANCE.getDatetimeType_DayPrecision_Def();

		/**
		 * The meta object literal for the '<em><b>Year Precision Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__YEAR_PRECISION_MIN = eINSTANCE.getDatetimeType_YearPrecision_Min();

		/**
		 * The meta object literal for the '<em><b>Year Precision Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__YEAR_PRECISION_MAX = eINSTANCE.getDatetimeType_YearPrecision_Max();

		/**
		 * The meta object literal for the '<em><b>Year Precision Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_TYPE__YEAR_PRECISION_DEF = eINSTANCE.getDatetimeType_YearPrecision_Def();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.ONDELETEActions <em>ONDELETE Actions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.ONDELETEActions
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getONDELETEActions()
		 * @generated
		 */
		EEnum ONDELETE_ACTIONS = eINSTANCE.getONDELETEActions();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.BuiltInCharacterTypes <em>Built In Character Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.BuiltInCharacterTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInCharacterTypes()
		 * @generated
		 */
		EEnum BUILT_IN_CHARACTER_TYPES = eINSTANCE.getBuiltInCharacterTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.BuiltInCharacterSemantics <em>Built In Character Semantics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.BuiltInCharacterSemantics
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInCharacterSemantics()
		 * @generated
		 */
		EEnum BUILT_IN_CHARACTER_SEMANTICS = eINSTANCE.getBuiltInCharacterSemantics();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.BuiltNumberTypes <em>Built Number Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.BuiltNumberTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltNumberTypes()
		 * @generated
		 */
		EEnum BUILT_NUMBER_TYPES = eINSTANCE.getBuiltNumberTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.BuiltInLongAndRawTypes <em>Built In Long And Raw Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.BuiltInLongAndRawTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInLongAndRawTypes()
		 * @generated
		 */
		EEnum BUILT_IN_LONG_AND_RAW_TYPES = eINSTANCE.getBuiltInLongAndRawTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.BuiltInDatetimeTypes <em>Built In Datetime Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.BuiltInDatetimeTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInDatetimeTypes()
		 * @generated
		 */
		EEnum BUILT_IN_DATETIME_TYPES = eINSTANCE.getBuiltInDatetimeTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.BuiltInLOBType <em>Built In LOB Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.BuiltInLOBType
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInLOBType()
		 * @generated
		 */
		EEnum BUILT_IN_LOB_TYPE = eINSTANCE.getBuiltInLOBType();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.BuiltInROWIDType <em>Built In ROWID Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.BuiltInROWIDType
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getBuiltInROWIDType()
		 * @generated
		 */
		EEnum BUILT_IN_ROWID_TYPE = eINSTANCE.getBuiltInROWIDType();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.ANSICharacterTypes <em>ANSI Character Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.ANSICharacterTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSICharacterTypes()
		 * @generated
		 */
		EEnum ANSI_CHARACTER_TYPES = eINSTANCE.getANSICharacterTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.ANSINumberTypes <em>ANSI Number Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.ANSINumberTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getANSINumberTypes()
		 * @generated
		 */
		EEnum ANSI_NUMBER_TYPES = eINSTANCE.getANSINumberTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.SuppliedAnyTypes <em>Supplied Any Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.SuppliedAnyTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedAnyTypes()
		 * @generated
		 */
		EEnum SUPPLIED_ANY_TYPES = eINSTANCE.getSuppliedAnyTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.SuppliedXMLTypes <em>Supplied XML Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.SuppliedXMLTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedXMLTypes()
		 * @generated
		 */
		EEnum SUPPLIED_XML_TYPES = eINSTANCE.getSuppliedXMLTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.SuppliedSpacialTypes <em>Supplied Spacial Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.SuppliedSpacialTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedSpacialTypes()
		 * @generated
		 */
		EEnum SUPPLIED_SPACIAL_TYPES = eINSTANCE.getSuppliedSpacialTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.SuppliedMediaTypes <em>Supplied Media Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.SuppliedMediaTypes
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getSuppliedMediaTypes()
		 * @generated
		 */
		EEnum SUPPLIED_MEDIA_TYPES = eINSTANCE.getSuppliedMediaTypes();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.CharacterFeatures <em>Character Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.CharacterFeatures
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getCharacterFeatures()
		 * @generated
		 */
		EEnum CHARACTER_FEATURES = eINSTANCE.getCharacterFeatures();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.NumberFeatures <em>Number Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.NumberFeatures
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getNumberFeatures()
		 * @generated
		 */
		EEnum NUMBER_FEATURES = eINSTANCE.getNumberFeatures();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.RawFeatures <em>Raw Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.RawFeatures
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRawFeatures()
		 * @generated
		 */
		EEnum RAW_FEATURES = eINSTANCE.getRawFeatures();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.RowFeatures <em>Row Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.RowFeatures
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getRowFeatures()
		 * @generated
		 */
		EEnum ROW_FEATURES = eINSTANCE.getRowFeatures();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.DatetimeFeatures <em>Datetime Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.DatetimeFeatures
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getDatetimeFeatures()
		 * @generated
		 */
		EEnum DATETIME_FEATURES = eINSTANCE.getDatetimeFeatures();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.IntervalFeatures <em>Interval Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.IntervalFeatures
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getIntervalFeatures()
		 * @generated
		 */
		EEnum INTERVAL_FEATURES = eINSTANCE.getIntervalFeatures();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.ParameterMode <em>Parameter Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.ParameterMode
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getParameterMode()
		 * @generated
		 */
		EEnum PARAMETER_MODE = eINSTANCE.getParameterMode();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.TriggerActionTime <em>Trigger Action Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.TriggerActionTime
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTriggerActionTime()
		 * @generated
		 */
		EEnum TRIGGER_ACTION_TIME = eINSTANCE.getTriggerActionTime();

		/**
		 * The meta object literal for the '{@link ORDB4ORA.TriggerEvent <em>Trigger Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ORDB4ORA.TriggerEvent
		 * @see ORDB4ORA.impl.ORDB4ORAPackageImpl#getTriggerEvent()
		 * @generated
		 */
		EEnum TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

	}

} //ORDB4ORAPackage
