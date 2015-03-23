/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;

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
 * @see SQL2003_V3.SQL2003_V3Factory
 * @model kind="package"
 * @generated
 */
public interface SQL2003_V3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SQL2003_V3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://SQL2003_V3.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SQL2003_V3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SQL2003_V3Package eINSTANCE = SQL2003_V3.impl.SQL2003_V3PackageImpl.init();

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.DataTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SCHEMA = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ConstructedTypeImpl <em>Constructed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ConstructedTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getConstructedType()
	 * @generated
	 */
	int CONSTRUCTED_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__SCHEMA = DATA_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.CollectionTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__SCHEMA = CONSTRUCTED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__NAME = CONSTRUCTED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Super type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__SUPER_TYPE = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__TYPE = CONSTRUCTED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ARRAYImpl <em>ARRAY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ARRAYImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getARRAY()
	 * @generated
	 */
	int ARRAY = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SCHEMA = COLLECTION_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Super type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SUPER_TYPE = COLLECTION_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE = COLLECTION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Num elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NUM_ELEMENTS = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ARRAY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.StructuralComponentImpl <em>Structural Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.StructuralComponentImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStructuralComponent()
	 * @generated
	 */
	int STRUCTURAL_COMPONENT = 40;

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
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__RESTRICTIONS = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__FEATURES = 4;

	/**
	 * The feature id for the '<em><b>Has domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT__HAS_DOMAIN = 5;

	/**
	 * The number of structural features of the '<em>Structural Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.AttributeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

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
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VIEWS = STRUCTURAL_COMPONENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RESTRICTIONS = STRUCTURAL_COMPONENT__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FEATURES = STRUCTURAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Has domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__HAS_DOMAIN = STRUCTURAL_COMPONENT__HAS_DOMAIN;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structured</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STRUCTURED = STRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.TableImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 42;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RESTRICTIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.BaseTableImpl <em>Base Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.BaseTableImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBaseTable()
	 * @generated
	 */
	int BASE_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TABLE__SCHEMA = TABLE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TABLE__VIEWS = TABLE__VIEWS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TABLE__RESTRICTIONS = TABLE__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TABLE__NAME = TABLE__NAME;

	/**
	 * The number of structural features of the '<em>Base Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.BehaviouralComponentImpl <em>Behavioural Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.BehaviouralComponentImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBehaviouralComponent()
	 * @generated
	 */
	int BEHAVIOURAL_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_COMPONENT__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_COMPONENT__BODY = 2;

	/**
	 * The feature id for the '<em><b>Parameters With Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE = 3;

	/**
	 * The number of structural features of the '<em>Behavioural Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.PredefinedTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getPredefinedType()
	 * @generated
	 */
	int PREDEFINED_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE__SCHEMA = DATA_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE__IS_SOURCE_OF = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.BinaryStringTypeImpl <em>Binary String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.BinaryStringTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBinaryStringType()
	 * @generated
	 */
	int BINARY_STRING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_STRING_TYPE__SCHEMA = PREDEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_STRING_TYPE__IS_SOURCE_OF = PREDEFINED_TYPE__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_STRING_TYPE__DESCRIPTOR = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_STRING_TYPE__LENGTH_DEF = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_STRING_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.BooleanTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__SCHEMA = PREDEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__IS_SOURCE_OF = PREDEFINED_TYPE__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DESCRIPTOR = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.CharacterStringTypeImpl <em>Character String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.CharacterStringTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getCharacterStringType()
	 * @generated
	 */
	int CHARACTER_STRING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_TYPE__SCHEMA = PREDEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_TYPE__IS_SOURCE_OF = PREDEFINED_TYPE__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_TYPE__DESCRIPTOR = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_TYPE__LENGTH_DEF = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ColumnImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 8;

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
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__VIEWS = STRUCTURAL_COMPONENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__RESTRICTIONS = STRUCTURAL_COMPONENT__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FEATURES = STRUCTURAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Has domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__HAS_DOMAIN = STRUCTURAL_COMPONENT__HAS_DOMAIN;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = STRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DEFAULT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.RestrictionImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 37;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ColumnConstraintImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getColumnConstraint()
	 * @generated
	 */
	int COLUMN_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT__COLUMNS = RESTRICTION__COLUMNS;

	/**
	 * The number of structural features of the '<em>Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.FeatureImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 18;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.DatetimeFeatureImpl <em>Datetime Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.DatetimeFeatureImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeFeature()
	 * @generated
	 */
	int DATETIME_FEATURE = 12;

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
	 * The meta object id for the '{@link SQL2003_V3.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.DatetimeTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeType()
	 * @generated
	 */
	int DATETIME_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__SCHEMA = PREDEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__IS_SOURCE_OF = PREDEFINED_TYPE__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE__DESCRIPTOR = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datetime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.DerivedTableImpl <em>Derived Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.DerivedTableImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDerivedTable()
	 * @generated
	 */
	int DERIVED_TABLE = 14;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__SCHEMA = TABLE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__VIEWS = TABLE__VIEWS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__RESTRICTIONS = TABLE__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TABLE__NAME = TABLE__NAME;

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
	 * The meta object id for the '{@link SQL2003_V3.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.UserDefinedTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getUserDefinedType()
	 * @generated
	 */
	int USER_DEFINED_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE__SCHEMA = DATA_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.DistinctTypeImpl <em>Distinct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.DistinctTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDistinctType()
	 * @generated
	 */
	int DISTINCT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_TYPE__SCHEMA = USER_DEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_TYPE__NAME = USER_DEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_TYPE__SOURCE_TYPE = USER_DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_TYPE__FEATURES = USER_DEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distinct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_TYPE_FEATURE_COUNT = USER_DEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.FieldImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getField()
	 * @generated
	 */
	int FIELD = 19;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.FunctionImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 20;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.IntervalFeatureImpl <em>Interval Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.IntervalFeatureImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalFeature()
	 * @generated
	 */
	int INTERVAL_FEATURE = 21;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.IntervalTypeImpl <em>Interval Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.IntervalTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalType()
	 * @generated
	 */
	int INTERVAL_TYPE = 22;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.MULTISETImpl <em>MULTISET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.MULTISETImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMULTISET()
	 * @generated
	 */
	int MULTISET = 23;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.MethodImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 24;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ParameterImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 29;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.MethodParameterImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMethodParameter()
	 * @generated
	 */
	int METHOD_PARAMETER = 25;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.NotNullImpl <em>Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.NotNullImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNotNull()
	 * @generated
	 */
	int NOT_NULL = 26;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.NumericFeatureImpl <em>Numeric Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.NumericFeatureImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericFeature()
	 * @generated
	 */
	int NUMERIC_FEATURE = 27;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.NumericTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 28;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ParameterWithModeImpl <em>Parameter With Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ParameterWithModeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getParameterWithMode()
	 * @generated
	 */
	int PARAMETER_WITH_MODE = 30;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.TableConstraintImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTableConstraint()
	 * @generated
	 */
	int TABLE_CONSTRAINT = 44;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.DomainConstraintImpl <em>Domain Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.DomainConstraintImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDomainConstraint()
	 * @generated
	 */
	int DOMAIN_CONSTRAINT = 17;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.UniqueConstraintImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 48;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.PrimaryKeyImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 32;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ProcedureImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 33;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ROWImpl <em>ROW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ROWImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getROW()
	 * @generated
	 */
	int ROW = 34;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ReferenceTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 35;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ReferentialConstraintImpl <em>Referential Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ReferentialConstraintImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getReferentialConstraint()
	 * @generated
	 */
	int REFERENTIAL_CONSTRAINT = 36;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.SchemaImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 38;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.StringFeatureImpl <em>String Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.StringFeatureImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStringFeature()
	 * @generated
	 */
	int STRING_FEATURE = 39;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.StructuredTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStructuredType()
	 * @generated
	 */
	int STRUCTURED_TYPE = 41;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.TableCheckConstraintImpl <em>Table Check Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.TableCheckConstraintImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTableCheckConstraint()
	 * @generated
	 */
	int TABLE_CHECK_CONSTRAINT = 43;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.TriggerImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 45;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.TriggerDescriptorImpl <em>Trigger Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.TriggerDescriptorImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerDescriptor()
	 * @generated
	 */
	int TRIGGER_DESCRIPTOR = 46;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.TypedTableImpl <em>Typed Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.TypedTableImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTypedTable()
	 * @generated
	 */
	int TYPED_TABLE = 47;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.ViewImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getView()
	 * @generated
	 */
	int VIEW = 50;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.XMLTypeImpl <em>XML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.XMLTypeImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getXMLType()
	 * @generated
	 */
	int XML_TYPE = 51;

	/**
	 * The meta object id for the '{@link SQL2003_V3.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.impl.DomainImpl
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DEFINES = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONSTRAINT = 5;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__COLUMNS = RESTRICTION__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__NAME = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT__DOMAIN = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = STRUCTURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = STRUCTURAL_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VIEWS = STRUCTURAL_COMPONENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__RESTRICTIONS = STRUCTURAL_COMPONENT__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FEATURES = STRUCTURAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Has domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HAS_DOMAIN = STRUCTURAL_COMPONENT__HAS_DOMAIN;

	/**
	 * The feature id for the '<em><b>Row</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ROW = STRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SCHEMA = BEHAVIOURAL_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = BEHAVIOURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = BEHAVIOURAL_COMPONENT__BODY;

	/**
	 * The feature id for the '<em><b>Parameters With Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS_WITH_MODE = BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE;

	/**
	 * The feature id for the '<em><b>Return type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_TYPE = BEHAVIOURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = BEHAVIOURAL_COMPONENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE__SCHEMA = PREDEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE__IS_SOURCE_OF = PREDEFINED_TYPE__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE__DESCRIPTOR = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interval Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET__SCHEMA = COLLECTION_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Super type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET__SUPER_TYPE = COLLECTION_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET__TYPE = COLLECTION_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>MULTISET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = 1;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OVERRIDE = 2;

	/**
	 * The feature id for the '<em><b>Structured</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STRUCTURED = 3;

	/**
	 * The feature id for the '<em><b>Return type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = 5;

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
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__TABLE = COLUMN_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__COLUMNS = COLUMN_CONSTRAINT__COLUMNS;

	/**
	 * The number of structural features of the '<em>Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__SCHEMA = PREDEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__IS_SOURCE_OF = PREDEFINED_TYPE__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__DESCRIPTOR = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WITH_MODE__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WITH_MODE__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WITH_MODE__MODE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavioural Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter With Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WITH_MODE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TABLE = UNIQUE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COLUMNS = UNIQUE_CONSTRAINT__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = UNIQUE_CONSTRAINT__NAME;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = UNIQUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SCHEMA = BEHAVIOURAL_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = BEHAVIOURAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__BODY = BEHAVIOURAL_COMPONENT__BODY;

	/**
	 * The feature id for the '<em><b>Parameters With Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARAMETERS_WITH_MODE = BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = BEHAVIOURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SCHEMA = CONSTRUCTED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = CONSTRUCTED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Super type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SUPER_TYPE = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__FIELDS = CONSTRUCTED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SUB_TYPES = CONSTRUCTED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ROW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__SCHEMA = CONSTRUCTED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__NAME = CONSTRUCTED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__TYPE = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Delete action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT__DELETE_ACTION = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT__UPDATE_ACTION = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT__MATCH = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT__REFERENCES = TABLE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Referential Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Behavioural Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__BEHAVIOURAL_COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DATATYPES = 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLES = 3;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DOMAINS = 4;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE__KEY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__SCHEMA = USER_DEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__NAME = USER_DEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__IS_FINAL = USER_DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is instantiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__IS_INSTANTIABLE = USER_DEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__SUPER_TYPE = USER_DEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__ATTRIBUTES = USER_DEFINED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__METHODS = USER_DEFINED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Typed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__TYPED = USER_DEFINED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Structured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE_FEATURE_COUNT = USER_DEFINED_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CHECK_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CHECK_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CHECK_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CHECK_CONSTRAINT__EXPRESSION = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Check Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CHECK_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TABLE = RESTRICTION__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__COLUMNS = RESTRICTION__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DESCRIPTION = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Update Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__UPDATE_COLUMNS = RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESCRIPTOR__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Action Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESCRIPTOR__ACTION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Triggered Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESCRIPTOR__TRIGGERED_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESCRIPTOR__TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESCRIPTOR__LEVEL = 4;

	/**
	 * The number of structural features of the '<em>Trigger Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESCRIPTOR_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__SCHEMA = BASE_TABLE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__COLUMNS = BASE_TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__VIEWS = BASE_TABLE__VIEWS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__RESTRICTIONS = BASE_TABLE__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__NAME = BASE_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Structured</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__STRUCTURED = BASE_TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__SUPERTABLE = BASE_TABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE__SUBTABLES = BASE_TABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Typed Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TABLE_FEATURE_COUNT = BASE_TABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SCHEMA = DERIVED_TABLE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COLUMNS = DERIVED_TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEWS = DERIVED_TABLE__VIEWS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__RESTRICTIONS = DERIVED_TABLE__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = DERIVED_TABLE__NAME;

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
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__SCHEMA = PREDEFINED_TYPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Is source of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__IS_SOURCE_OF = PREDEFINED_TYPE__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__DESCRIPTOR = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SQL2003_V3.BinaryStringTypes <em>Binary String Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.BinaryStringTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBinaryStringTypes()
	 * @generated
	 */
	int BINARY_STRING_TYPES = 52;

	/**
	 * The meta object id for the '{@link SQL2003_V3.BooleanTypes <em>Boolean Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.BooleanTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBooleanTypes()
	 * @generated
	 */
	int BOOLEAN_TYPES = 53;

	/**
	 * The meta object id for the '{@link SQL2003_V3.CharacterStringTypes <em>Character String Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.CharacterStringTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getCharacterStringTypes()
	 * @generated
	 */
	int CHARACTER_STRING_TYPES = 54;

	/**
	 * The meta object id for the '{@link SQL2003_V3.DatetimeFeatures <em>Datetime Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.DatetimeFeatures
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeFeatures()
	 * @generated
	 */
	int DATETIME_FEATURES = 55;

	/**
	 * The meta object id for the '{@link SQL2003_V3.DatetimeTypes <em>Datetime Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.DatetimeTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeTypes()
	 * @generated
	 */
	int DATETIME_TYPES = 56;

	/**
	 * The meta object id for the '{@link SQL2003_V3.IntervalFeatures <em>Interval Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.IntervalFeatures
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalFeatures()
	 * @generated
	 */
	int INTERVAL_FEATURES = 57;

	/**
	 * The meta object id for the '{@link SQL2003_V3.IntervalTypes <em>Interval Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.IntervalTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalTypes()
	 * @generated
	 */
	int INTERVAL_TYPES = 58;

	/**
	 * The meta object id for the '{@link SQL2003_V3.MatchTypes <em>Match Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.MatchTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMatchTypes()
	 * @generated
	 */
	int MATCH_TYPES = 59;

	/**
	 * The meta object id for the '{@link SQL2003_V3.Multiplier <em>Multiplier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.Multiplier
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMultiplier()
	 * @generated
	 */
	int MULTIPLIER = 60;

	/**
	 * The meta object id for the '{@link SQL2003_V3.NumericRadix <em>Numeric Radix</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.NumericRadix
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericRadix()
	 * @generated
	 */
	int NUMERIC_RADIX = 62;

	/**
	 * The meta object id for the '{@link SQL2003_V3.NumericFeatures <em>Numeric Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.NumericFeatures
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericFeatures()
	 * @generated
	 */
	int NUMERIC_FEATURES = 61;

	/**
	 * The meta object id for the '{@link SQL2003_V3.NumericTypes <em>Numeric Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.NumericTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericTypes()
	 * @generated
	 */
	int NUMERIC_TYPES = 63;

	/**
	 * The meta object id for the '{@link SQL2003_V3.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.ParameterMode
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 64;

	/**
	 * The meta object id for the '{@link SQL2003_V3.ReferentialAction <em>Referential Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.ReferentialAction
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getReferentialAction()
	 * @generated
	 */
	int REFERENTIAL_ACTION = 65;

	/**
	 * The meta object id for the '{@link SQL2003_V3.StringFeatures <em>String Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.StringFeatures
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStringFeatures()
	 * @generated
	 */
	int STRING_FEATURES = 66;

	/**
	 * The meta object id for the '{@link SQL2003_V3.TriggerActionTime <em>Trigger Action Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.TriggerActionTime
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerActionTime()
	 * @generated
	 */
	int TRIGGER_ACTION_TIME = 67;

	/**
	 * The meta object id for the '{@link SQL2003_V3.TriggerEvent <em>Trigger Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.TriggerEvent
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerEvent()
	 * @generated
	 */
	int TRIGGER_EVENT = 68;

	/**
	 * The meta object id for the '{@link SQL2003_V3.TriggerLevel <em>Trigger Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.TriggerLevel
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerLevel()
	 * @generated
	 */
	int TRIGGER_LEVEL = 69;

	/**
	 * The meta object id for the '{@link SQL2003_V3.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.Unit
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 70;

	/**
	 * The meta object id for the '{@link SQL2003_V3.XMLTypes <em>XML Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_V3.XMLTypes
	 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getXMLTypes()
	 * @generated
	 */
	int XML_TYPES = 71;


	/**
	 * Returns the meta object for class '{@link SQL2003_V3.ARRAY <em>ARRAY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARRAY</em>'.
	 * @see SQL2003_V3.ARRAY
	 * @generated
	 */
	EClass getARRAY();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.ARRAY#getNum_elements <em>Num elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num elements</em>'.
	 * @see SQL2003_V3.ARRAY#getNum_elements()
	 * @see #getARRAY()
	 * @generated
	 */
	EAttribute getARRAY_Num_elements();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see SQL2003_V3.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see SQL2003_V3.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.Attribute#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured</em>'.
	 * @see SQL2003_V3.Attribute#getStructured()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Structured();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.BaseTable <em>Base Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Table</em>'.
	 * @see SQL2003_V3.BaseTable
	 * @generated
	 */
	EClass getBaseTable();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.BehaviouralComponent <em>Behavioural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Component</em>'.
	 * @see SQL2003_V3.BehaviouralComponent
	 * @generated
	 */
	EClass getBehaviouralComponent();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.BehaviouralComponent#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SQL2003_V3.BehaviouralComponent#getSchema()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EReference getBehaviouralComponent_Schema();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.BehaviouralComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.BehaviouralComponent#getName()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EAttribute getBehaviouralComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.BehaviouralComponent#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see SQL2003_V3.BehaviouralComponent#getBody()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EAttribute getBehaviouralComponent_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.BehaviouralComponent#getParametersWithMode <em>Parameters With Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters With Mode</em>'.
	 * @see SQL2003_V3.BehaviouralComponent#getParametersWithMode()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EReference getBehaviouralComponent_ParametersWithMode();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.BinaryStringType <em>Binary String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary String Type</em>'.
	 * @see SQL2003_V3.BinaryStringType
	 * @generated
	 */
	EClass getBinaryStringType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.BinaryStringType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_V3.BinaryStringType#getDescriptor()
	 * @see #getBinaryStringType()
	 * @generated
	 */
	EAttribute getBinaryStringType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.BinaryStringType#getLength_def <em>Length def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length def</em>'.
	 * @see SQL2003_V3.BinaryStringType#getLength_def()
	 * @see #getBinaryStringType()
	 * @generated
	 */
	EAttribute getBinaryStringType_Length_def();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see SQL2003_V3.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.BooleanType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_V3.BooleanType#getDescriptor()
	 * @see #getBooleanType()
	 * @generated
	 */
	EAttribute getBooleanType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.CharacterStringType <em>Character String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character String Type</em>'.
	 * @see SQL2003_V3.CharacterStringType
	 * @generated
	 */
	EClass getCharacterStringType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.CharacterStringType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_V3.CharacterStringType#getDescriptor()
	 * @see #getCharacterStringType()
	 * @generated
	 */
	EAttribute getCharacterStringType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.CharacterStringType#getLength_def <em>Length def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length def</em>'.
	 * @see SQL2003_V3.CharacterStringType#getLength_def()
	 * @see #getCharacterStringType()
	 * @generated
	 */
	EAttribute getCharacterStringType_Length_def();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see SQL2003_V3.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.CollectionType#getSuper_type <em>Super type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super type</em>'.
	 * @see SQL2003_V3.CollectionType#getSuper_type()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Super_type();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.CollectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_V3.CollectionType#getType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Type();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see SQL2003_V3.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see SQL2003_V3.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Column#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see SQL2003_V3.Column#getDefault()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Default();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.ColumnConstraint <em>Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Constraint</em>'.
	 * @see SQL2003_V3.ColumnConstraint
	 * @generated
	 */
	EClass getColumnConstraint();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.ConstructedType <em>Constructed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructed Type</em>'.
	 * @see SQL2003_V3.ConstructedType
	 * @generated
	 */
	EClass getConstructedType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.ConstructedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.ConstructedType#getName()
	 * @see #getConstructedType()
	 * @generated
	 */
	EAttribute getConstructedType_Name();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see SQL2003_V3.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.DataType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SQL2003_V3.DataType#getSchema()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Schema();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Datetime Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="SQL2003_V3.DatetimeFeatures" keyRequired="true"
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
	 * Returns the meta object for class '{@link SQL2003_V3.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Type</em>'.
	 * @see SQL2003_V3.DatetimeType
	 * @generated
	 */
	EClass getDatetimeType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.DatetimeType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_V3.DatetimeType#getDescriptor()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.DerivedTable <em>Derived Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Table</em>'.
	 * @see SQL2003_V3.DerivedTable
	 * @generated
	 */
	EClass getDerivedTable();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.DerivedTable#getQuery_expression <em>Query expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query expression</em>'.
	 * @see SQL2003_V3.DerivedTable#getQuery_expression()
	 * @see #getDerivedTable()
	 * @generated
	 */
	EAttribute getDerivedTable_Query_expression();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.DistinctType <em>Distinct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinct Type</em>'.
	 * @see SQL2003_V3.DistinctType
	 * @generated
	 */
	EClass getDistinctType();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.DistinctType#getSource_type <em>Source type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source type</em>'.
	 * @see SQL2003_V3.DistinctType#getSource_type()
	 * @see #getDistinctType()
	 * @generated
	 */
	EReference getDistinctType_Source_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.DistinctType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see SQL2003_V3.DistinctType#getFeatures()
	 * @see #getDistinctType()
	 * @generated
	 */
	EReference getDistinctType_Features();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see SQL2003_V3.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see SQL2003_V3.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.Field#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see SQL2003_V3.Field#getRow()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Row();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see SQL2003_V3.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.Function#getReturn_type <em>Return type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return type</em>'.
	 * @see SQL2003_V3.Function#getReturn_type()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Return_type();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Interval Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="SQL2003_V3.IntervalFeatures" keyRequired="true"
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
	 * Returns the meta object for class '{@link SQL2003_V3.IntervalType <em>Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Type</em>'.
	 * @see SQL2003_V3.IntervalType
	 * @generated
	 */
	EClass getIntervalType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.IntervalType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_V3.IntervalType#getDescriptor()
	 * @see #getIntervalType()
	 * @generated
	 */
	EAttribute getIntervalType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.MULTISET <em>MULTISET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MULTISET</em>'.
	 * @see SQL2003_V3.MULTISET
	 * @generated
	 */
	EClass getMULTISET();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see SQL2003_V3.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see SQL2003_V3.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Body();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.Method#getOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override</em>'.
	 * @see SQL2003_V3.Method#getOverride()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Override();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.Method#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured</em>'.
	 * @see SQL2003_V3.Method#getStructured()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Structured();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.Method#getReturn_type <em>Return type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return type</em>'.
	 * @see SQL2003_V3.Method#getReturn_type()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Return_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see SQL2003_V3.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter</em>'.
	 * @see SQL2003_V3.MethodParameter
	 * @generated
	 */
	EClass getMethodParameter();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.MethodParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see SQL2003_V3.MethodParameter#getMethod()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EReference getMethodParameter_Method();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.NotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null</em>'.
	 * @see SQL2003_V3.NotNull
	 * @generated
	 */
	EClass getNotNull();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Numeric Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="SQL2003_V3.NumericFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getNumericFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNumericFeature()
	 * @generated
	 */
	EAttribute getNumericFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNumericFeature()
	 * @generated
	 */
	EAttribute getNumericFeature_Value();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see SQL2003_V3.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.NumericType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_V3.NumericType#getDescriptor()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see SQL2003_V3.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_V3.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.ParameterWithMode <em>Parameter With Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter With Mode</em>'.
	 * @see SQL2003_V3.ParameterWithMode
	 * @generated
	 */
	EClass getParameterWithMode();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.ParameterWithMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see SQL2003_V3.ParameterWithMode#getMode()
	 * @see #getParameterWithMode()
	 * @generated
	 */
	EAttribute getParameterWithMode_Mode();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.ParameterWithMode#getBehaviouralComponent <em>Behavioural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Behavioural Component</em>'.
	 * @see SQL2003_V3.ParameterWithMode#getBehaviouralComponent()
	 * @see #getParameterWithMode()
	 * @generated
	 */
	EReference getParameterWithMode_BehaviouralComponent();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.PredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Type</em>'.
	 * @see SQL2003_V3.PredefinedType
	 * @generated
	 */
	EClass getPredefinedType();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.PredefinedType#getIs_source_of <em>Is source of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is source of</em>'.
	 * @see SQL2003_V3.PredefinedType#getIs_source_of()
	 * @see #getPredefinedType()
	 * @generated
	 */
	EReference getPredefinedType_Is_source_of();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see SQL2003_V3.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see SQL2003_V3.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.ROW <em>ROW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROW</em>'.
	 * @see SQL2003_V3.ROW
	 * @generated
	 */
	EClass getROW();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.ROW#getSuper_type <em>Super type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super type</em>'.
	 * @see SQL2003_V3.ROW#getSuper_type()
	 * @see #getROW()
	 * @generated
	 */
	EReference getROW_Super_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.ROW#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see SQL2003_V3.ROW#getFields()
	 * @see #getROW()
	 * @generated
	 */
	EReference getROW_Fields();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.ROW#getSub_types <em>Sub types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub types</em>'.
	 * @see SQL2003_V3.ROW#getSub_types()
	 * @see #getROW()
	 * @generated
	 */
	EReference getROW_Sub_types();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see SQL2003_V3.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.ReferenceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_V3.ReferenceType#getType()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Type();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.ReferentialConstraint <em>Referential Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referential Constraint</em>'.
	 * @see SQL2003_V3.ReferentialConstraint
	 * @generated
	 */
	EClass getReferentialConstraint();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.ReferentialConstraint#getDelete_action <em>Delete action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete action</em>'.
	 * @see SQL2003_V3.ReferentialConstraint#getDelete_action()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EAttribute getReferentialConstraint_Delete_action();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.ReferentialConstraint#getUpdate_action <em>Update action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update action</em>'.
	 * @see SQL2003_V3.ReferentialConstraint#getUpdate_action()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EAttribute getReferentialConstraint_Update_action();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.ReferentialConstraint#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match</em>'.
	 * @see SQL2003_V3.ReferentialConstraint#getMatch()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EAttribute getReferentialConstraint_Match();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.ReferentialConstraint#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see SQL2003_V3.ReferentialConstraint#getReferences()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EReference getReferentialConstraint_References();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see SQL2003_V3.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.Restriction#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see SQL2003_V3.Restriction#getTable()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Table();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.Restriction#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see SQL2003_V3.Restriction#getColumns()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Columns();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see SQL2003_V3.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.Schema#getBehaviouralComponents <em>Behavioural Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavioural Components</em>'.
	 * @see SQL2003_V3.Schema#getBehaviouralComponents()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_BehaviouralComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.Schema#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see SQL2003_V3.Schema#getDatatypes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see SQL2003_V3.Schema#getTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.Schema#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see SQL2003_V3.Schema#getDomains()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Domains();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="SQL2003_V3.StringFeatures" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getStringFeature();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringFeature()
	 * @generated
	 */
	EAttribute getStringFeature_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringFeature()
	 * @generated
	 */
	EAttribute getStringFeature_Value();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.StructuralComponent <em>Structural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Component</em>'.
	 * @see SQL2003_V3.StructuralComponent
	 * @generated
	 */
	EClass getStructuralComponent();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.StructuralComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.StructuralComponent#getName()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EAttribute getStructuralComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.StructuralComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_V3.StructuralComponent#getType()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Type();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.StructuralComponent#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see SQL2003_V3.StructuralComponent#getViews()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Views();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.StructuralComponent#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrictions</em>'.
	 * @see SQL2003_V3.StructuralComponent#getRestrictions()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Restrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.StructuralComponent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see SQL2003_V3.StructuralComponent#getFeatures()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Features();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.StructuralComponent#getHas_domain <em>Has domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has domain</em>'.
	 * @see SQL2003_V3.StructuralComponent#getHas_domain()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Has_domain();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.StructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Type</em>'.
	 * @see SQL2003_V3.StructuredType
	 * @generated
	 */
	EClass getStructuredType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.StructuredType#isIs_final <em>Is final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is final</em>'.
	 * @see SQL2003_V3.StructuredType#isIs_final()
	 * @see #getStructuredType()
	 * @generated
	 */
	EAttribute getStructuredType_Is_final();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.StructuredType#isIs_instantiable <em>Is instantiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is instantiable</em>'.
	 * @see SQL2003_V3.StructuredType#isIs_instantiable()
	 * @see #getStructuredType()
	 * @generated
	 */
	EAttribute getStructuredType_Is_instantiable();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.StructuredType#getSuper_type <em>Super type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super type</em>'.
	 * @see SQL2003_V3.StructuredType#getSuper_type()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Super_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.StructuredType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see SQL2003_V3.StructuredType#getAttributes()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.StructuredType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see SQL2003_V3.StructuredType#getMethods()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Methods();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.StructuredType#getTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed</em>'.
	 * @see SQL2003_V3.StructuredType#getTyped()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Typed();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see SQL2003_V3.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SQL2003_V3.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see SQL2003_V3.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.Table#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see SQL2003_V3.Table#getViews()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_V3.Table#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see SQL2003_V3.Table#getRestrictions()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Restrictions();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.TableCheckConstraint <em>Table Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Check Constraint</em>'.
	 * @see SQL2003_V3.TableCheckConstraint
	 * @generated
	 */
	EClass getTableCheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.TableCheckConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see SQL2003_V3.TableCheckConstraint#getExpression()
	 * @see #getTableCheckConstraint()
	 * @generated
	 */
	EAttribute getTableCheckConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.TableConstraint <em>Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Constraint</em>'.
	 * @see SQL2003_V3.TableConstraint
	 * @generated
	 */
	EClass getTableConstraint();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.TableConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.TableConstraint#getName()
	 * @see #getTableConstraint()
	 * @generated
	 */
	EAttribute getTableConstraint_Name();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see SQL2003_V3.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the containment reference '{@link SQL2003_V3.Trigger#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see SQL2003_V3.Trigger#getDescription()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Description();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.Trigger#getUpdateColumns <em>Update Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Columns</em>'.
	 * @see SQL2003_V3.Trigger#getUpdateColumns()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_UpdateColumns();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.TriggerDescriptor <em>Trigger Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Descriptor</em>'.
	 * @see SQL2003_V3.TriggerDescriptor
	 * @generated
	 */
	EClass getTriggerDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.TriggerDescriptor#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see SQL2003_V3.TriggerDescriptor#getEvent()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_Event();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.TriggerDescriptor#getActionTime <em>Action Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Time</em>'.
	 * @see SQL2003_V3.TriggerDescriptor#getActionTime()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_ActionTime();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.TriggerDescriptor#getTriggeredAction <em>Triggered Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered Action</em>'.
	 * @see SQL2003_V3.TriggerDescriptor#getTriggeredAction()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_TriggeredAction();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.TriggerDescriptor#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trigger</em>'.
	 * @see SQL2003_V3.TriggerDescriptor#getTrigger()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EReference getTriggerDescriptor_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.TriggerDescriptor#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see SQL2003_V3.TriggerDescriptor#getLevel()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_Level();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.TypedTable <em>Typed Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Table</em>'.
	 * @see SQL2003_V3.TypedTable
	 * @generated
	 */
	EClass getTypedTable();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.TypedTable#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structured</em>'.
	 * @see SQL2003_V3.TypedTable#getStructured()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_Structured();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.TypedTable#getSupertable <em>Supertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertable</em>'.
	 * @see SQL2003_V3.TypedTable#getSupertable()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_Supertable();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.TypedTable#getSubtables <em>Subtables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtables</em>'.
	 * @see SQL2003_V3.TypedTable#getSubtables()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_Subtables();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see SQL2003_V3.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.UserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Type</em>'.
	 * @see SQL2003_V3.UserDefinedType
	 * @generated
	 */
	EClass getUserDefinedType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.UserDefinedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.UserDefinedType#getName()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	EAttribute getUserDefinedType_Name();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see SQL2003_V3.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.View#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see SQL2003_V3.View#getTables()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Tables();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.View#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see SQL2003_V3.View#getComponents()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Components();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.XMLType <em>XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Type</em>'.
	 * @see SQL2003_V3.XMLType
	 * @generated
	 */
	EClass getXMLType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.XMLType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_V3.XMLType#getDescriptor()
	 * @see #getXMLType()
	 * @generated
	 */
	EAttribute getXMLType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see SQL2003_V3.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_V3.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Domain#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see SQL2003_V3.Domain#getExpression()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Expression();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_V3.Domain#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see SQL2003_V3.Domain#getDefault()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Default();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_V3.Domain#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SQL2003_V3.Domain#getSchema()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Schema();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.Domain#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defines</em>'.
	 * @see SQL2003_V3.Domain#getDefines()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Defines();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_V3.Domain#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see SQL2003_V3.Domain#getConstraint()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Constraint();

	/**
	 * Returns the meta object for class '{@link SQL2003_V3.DomainConstraint <em>Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Constraint</em>'.
	 * @see SQL2003_V3.DomainConstraint
	 * @generated
	 */
	EClass getDomainConstraint();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_V3.DomainConstraint#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see SQL2003_V3.DomainConstraint#getDomain()
	 * @see #getDomainConstraint()
	 * @generated
	 */
	EReference getDomainConstraint_Domain();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.BinaryStringTypes <em>Binary String Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary String Types</em>'.
	 * @see SQL2003_V3.BinaryStringTypes
	 * @generated
	 */
	EEnum getBinaryStringTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.BooleanTypes <em>Boolean Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Types</em>'.
	 * @see SQL2003_V3.BooleanTypes
	 * @generated
	 */
	EEnum getBooleanTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.CharacterStringTypes <em>Character String Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Character String Types</em>'.
	 * @see SQL2003_V3.CharacterStringTypes
	 * @generated
	 */
	EEnum getCharacterStringTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.DatetimeFeatures <em>Datetime Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Features</em>'.
	 * @see SQL2003_V3.DatetimeFeatures
	 * @generated
	 */
	EEnum getDatetimeFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.DatetimeTypes <em>Datetime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Types</em>'.
	 * @see SQL2003_V3.DatetimeTypes
	 * @generated
	 */
	EEnum getDatetimeTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.IntervalFeatures <em>Interval Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interval Features</em>'.
	 * @see SQL2003_V3.IntervalFeatures
	 * @generated
	 */
	EEnum getIntervalFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.IntervalTypes <em>Interval Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interval Types</em>'.
	 * @see SQL2003_V3.IntervalTypes
	 * @generated
	 */
	EEnum getIntervalTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.MatchTypes <em>Match Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Types</em>'.
	 * @see SQL2003_V3.MatchTypes
	 * @generated
	 */
	EEnum getMatchTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.Multiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplier</em>'.
	 * @see SQL2003_V3.Multiplier
	 * @generated
	 */
	EEnum getMultiplier();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.NumericRadix <em>Numeric Radix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Radix</em>'.
	 * @see SQL2003_V3.NumericRadix
	 * @generated
	 */
	EEnum getNumericRadix();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.NumericFeatures <em>Numeric Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Features</em>'.
	 * @see SQL2003_V3.NumericFeatures
	 * @generated
	 */
	EEnum getNumericFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.NumericTypes <em>Numeric Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Types</em>'.
	 * @see SQL2003_V3.NumericTypes
	 * @generated
	 */
	EEnum getNumericTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see SQL2003_V3.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.ReferentialAction <em>Referential Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referential Action</em>'.
	 * @see SQL2003_V3.ReferentialAction
	 * @generated
	 */
	EEnum getReferentialAction();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.StringFeatures <em>String Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Features</em>'.
	 * @see SQL2003_V3.StringFeatures
	 * @generated
	 */
	EEnum getStringFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.TriggerActionTime <em>Trigger Action Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Action Time</em>'.
	 * @see SQL2003_V3.TriggerActionTime
	 * @generated
	 */
	EEnum getTriggerActionTime();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Event</em>'.
	 * @see SQL2003_V3.TriggerEvent
	 * @generated
	 */
	EEnum getTriggerEvent();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.TriggerLevel <em>Trigger Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Level</em>'.
	 * @see SQL2003_V3.TriggerLevel
	 * @generated
	 */
	EEnum getTriggerLevel();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see SQL2003_V3.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the meta object for enum '{@link SQL2003_V3.XMLTypes <em>XML Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XML Types</em>'.
	 * @see SQL2003_V3.XMLTypes
	 * @generated
	 */
	EEnum getXMLTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SQL2003_V3Factory getSQL2003_V3Factory();

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
		 * The meta object literal for the '{@link SQL2003_V3.impl.ARRAYImpl <em>ARRAY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ARRAYImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getARRAY()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getARRAY();

		/**
		 * The meta object literal for the '<em><b>Num elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__NUM_ELEMENTS = eINSTANCE.getARRAY_Num_elements();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.AttributeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Structured</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__STRUCTURED = eINSTANCE.getAttribute_Structured();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.BaseTableImpl <em>Base Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.BaseTableImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBaseTable()
		 * @generated
		 */
		EClass BASE_TABLE = eINSTANCE.getBaseTable();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.BehaviouralComponentImpl <em>Behavioural Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.BehaviouralComponentImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBehaviouralComponent()
		 * @generated
		 */
		EClass BEHAVIOURAL_COMPONENT = eINSTANCE.getBehaviouralComponent();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_COMPONENT__SCHEMA = eINSTANCE.getBehaviouralComponent_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_COMPONENT__NAME = eINSTANCE.getBehaviouralComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_COMPONENT__BODY = eINSTANCE.getBehaviouralComponent_Body();

		/**
		 * The meta object literal for the '<em><b>Parameters With Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE = eINSTANCE.getBehaviouralComponent_ParametersWithMode();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.BinaryStringTypeImpl <em>Binary String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.BinaryStringTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBinaryStringType()
		 * @generated
		 */
		EClass BINARY_STRING_TYPE = eINSTANCE.getBinaryStringType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_STRING_TYPE__DESCRIPTOR = eINSTANCE.getBinaryStringType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Length def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_STRING_TYPE__LENGTH_DEF = eINSTANCE.getBinaryStringType_Length_def();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.BooleanTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_TYPE__DESCRIPTOR = eINSTANCE.getBooleanType_Descriptor();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.CharacterStringTypeImpl <em>Character String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.CharacterStringTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getCharacterStringType()
		 * @generated
		 */
		EClass CHARACTER_STRING_TYPE = eINSTANCE.getCharacterStringType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STRING_TYPE__DESCRIPTOR = eINSTANCE.getCharacterStringType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Length def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STRING_TYPE__LENGTH_DEF = eINSTANCE.getCharacterStringType_Length_def();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.CollectionTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Super type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__SUPER_TYPE = eINSTANCE.getCollectionType_Super_type();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__TYPE = eINSTANCE.getCollectionType_Type();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ColumnImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getColumn()
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
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DEFAULT = eINSTANCE.getColumn_Default();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ColumnConstraintImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getColumnConstraint()
		 * @generated
		 */
		EClass COLUMN_CONSTRAINT = eINSTANCE.getColumnConstraint();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ConstructedTypeImpl <em>Constructed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ConstructedTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getConstructedType()
		 * @generated
		 */
		EClass CONSTRUCTED_TYPE = eINSTANCE.getConstructedType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTED_TYPE__NAME = eINSTANCE.getConstructedType_Name();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.DataTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__SCHEMA = eINSTANCE.getDataType_Schema();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.DatetimeFeatureImpl <em>Datetime Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.DatetimeFeatureImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeFeature()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.DatetimeTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeType()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.DerivedTableImpl <em>Derived Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.DerivedTableImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDerivedTable()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.DistinctTypeImpl <em>Distinct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.DistinctTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDistinctType()
		 * @generated
		 */
		EClass DISTINCT_TYPE = eINSTANCE.getDistinctType();

		/**
		 * The meta object literal for the '<em><b>Source type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTINCT_TYPE__SOURCE_TYPE = eINSTANCE.getDistinctType_Source_type();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTINCT_TYPE__FEATURES = eINSTANCE.getDistinctType_Features();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.FeatureImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.FieldImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__ROW = eINSTANCE.getField_Row();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.FunctionImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Return type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_Return_type();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.IntervalFeatureImpl <em>Interval Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.IntervalFeatureImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalFeature()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.IntervalTypeImpl <em>Interval Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.IntervalTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalType()
		 * @generated
		 */
		EClass INTERVAL_TYPE = eINSTANCE.getIntervalType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_TYPE__DESCRIPTOR = eINSTANCE.getIntervalType_Descriptor();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.MULTISETImpl <em>MULTISET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.MULTISETImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMULTISET()
		 * @generated
		 */
		EClass MULTISET = eINSTANCE.getMULTISET();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.MethodImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMethod()
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
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__BODY = eINSTANCE.getMethod_Body();

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
		 * The meta object literal for the '<em><b>Return type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_Return_type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.MethodParameterImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMethodParameter()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.NotNullImpl <em>Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.NotNullImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNotNull()
		 * @generated
		 */
		EClass NOT_NULL = eINSTANCE.getNotNull();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.NumericFeatureImpl <em>Numeric Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.NumericFeatureImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericFeature()
		 * @generated
		 */
		EClass NUMERIC_FEATURE = eINSTANCE.getNumericFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FEATURE__KEY = eINSTANCE.getNumericFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FEATURE__VALUE = eINSTANCE.getNumericFeature_Value();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.NumericTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__DESCRIPTOR = eINSTANCE.getNumericType_Descriptor();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ParameterImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getParameter()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.ParameterWithModeImpl <em>Parameter With Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ParameterWithModeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getParameterWithMode()
		 * @generated
		 */
		EClass PARAMETER_WITH_MODE = eINSTANCE.getParameterWithMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_WITH_MODE__MODE = eINSTANCE.getParameterWithMode_Mode();

		/**
		 * The meta object literal for the '<em><b>Behavioural Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT = eINSTANCE.getParameterWithMode_BehaviouralComponent();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.PredefinedTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getPredefinedType()
		 * @generated
		 */
		EClass PREDEFINED_TYPE = eINSTANCE.getPredefinedType();

		/**
		 * The meta object literal for the '<em><b>Is source of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDEFINED_TYPE__IS_SOURCE_OF = eINSTANCE.getPredefinedType_Is_source_of();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.PrimaryKeyImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ProcedureImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ROWImpl <em>ROW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ROWImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getROW()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getROW();

		/**
		 * The meta object literal for the '<em><b>Super type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SUPER_TYPE = eINSTANCE.getROW_Super_type();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__FIELDS = eINSTANCE.getROW_Fields();

		/**
		 * The meta object literal for the '<em><b>Sub types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SUB_TYPES = eINSTANCE.getROW_Sub_types();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ReferenceTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__TYPE = eINSTANCE.getReferenceType_Type();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ReferentialConstraintImpl <em>Referential Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ReferentialConstraintImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getReferentialConstraint()
		 * @generated
		 */
		EClass REFERENTIAL_CONSTRAINT = eINSTANCE.getReferentialConstraint();

		/**
		 * The meta object literal for the '<em><b>Delete action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENTIAL_CONSTRAINT__DELETE_ACTION = eINSTANCE.getReferentialConstraint_Delete_action();

		/**
		 * The meta object literal for the '<em><b>Update action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENTIAL_CONSTRAINT__UPDATE_ACTION = eINSTANCE.getReferentialConstraint_Update_action();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENTIAL_CONSTRAINT__MATCH = eINSTANCE.getReferentialConstraint_Match();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENTIAL_CONSTRAINT__REFERENCES = eINSTANCE.getReferentialConstraint_References();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.RestrictionImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getRestriction()
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
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION__COLUMNS = eINSTANCE.getRestriction_Columns();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.SchemaImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Behavioural Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__BEHAVIOURAL_COMPONENTS = eINSTANCE.getSchema_BehaviouralComponents();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DATATYPES = eINSTANCE.getSchema_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DOMAINS = eINSTANCE.getSchema_Domains();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.StringFeatureImpl <em>String Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.StringFeatureImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStringFeature()
		 * @generated
		 */
		EClass STRING_FEATURE = eINSTANCE.getStringFeature();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FEATURE__KEY = eINSTANCE.getStringFeature_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FEATURE__VALUE = eINSTANCE.getStringFeature_Value();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.StructuralComponentImpl <em>Structural Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.StructuralComponentImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStructuralComponent()
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
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_COMPONENT__VIEWS = eINSTANCE.getStructuralComponent_Views();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_COMPONENT__RESTRICTIONS = eINSTANCE.getStructuralComponent_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_COMPONENT__FEATURES = eINSTANCE.getStructuralComponent_Features();

		/**
		 * The meta object literal for the '<em><b>Has domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_COMPONENT__HAS_DOMAIN = eINSTANCE.getStructuralComponent_Has_domain();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.StructuredTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStructuredType()
		 * @generated
		 */
		EClass STRUCTURED_TYPE = eINSTANCE.getStructuredType();

		/**
		 * The meta object literal for the '<em><b>Is final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_TYPE__IS_FINAL = eINSTANCE.getStructuredType_Is_final();

		/**
		 * The meta object literal for the '<em><b>Is instantiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_TYPE__IS_INSTANTIABLE = eINSTANCE.getStructuredType_Is_instantiable();

		/**
		 * The meta object literal for the '<em><b>Super type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__SUPER_TYPE = eINSTANCE.getStructuredType_Super_type();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__ATTRIBUTES = eINSTANCE.getStructuredType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__METHODS = eINSTANCE.getStructuredType_Methods();

		/**
		 * The meta object literal for the '<em><b>Typed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TYPE__TYPED = eINSTANCE.getStructuredType_Typed();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.TableImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__SCHEMA = eINSTANCE.getTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__VIEWS = eINSTANCE.getTable_Views();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__RESTRICTIONS = eINSTANCE.getTable_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.TableCheckConstraintImpl <em>Table Check Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.TableCheckConstraintImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTableCheckConstraint()
		 * @generated
		 */
		EClass TABLE_CHECK_CONSTRAINT = eINSTANCE.getTableCheckConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CHECK_CONSTRAINT__EXPRESSION = eINSTANCE.getTableCheckConstraint_Expression();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.TableConstraintImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTableConstraint()
		 * @generated
		 */
		EClass TABLE_CONSTRAINT = eINSTANCE.getTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONSTRAINT__NAME = eINSTANCE.getTableConstraint_Name();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.TriggerImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTrigger()
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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__DESCRIPTION = eINSTANCE.getTrigger_Description();

		/**
		 * The meta object literal for the '<em><b>Update Columns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__UPDATE_COLUMNS = eINSTANCE.getTrigger_UpdateColumns();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.TriggerDescriptorImpl <em>Trigger Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.TriggerDescriptorImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerDescriptor()
		 * @generated
		 */
		EClass TRIGGER_DESCRIPTOR = eINSTANCE.getTriggerDescriptor();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_DESCRIPTOR__EVENT = eINSTANCE.getTriggerDescriptor_Event();

		/**
		 * The meta object literal for the '<em><b>Action Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_DESCRIPTOR__ACTION_TIME = eINSTANCE.getTriggerDescriptor_ActionTime();

		/**
		 * The meta object literal for the '<em><b>Triggered Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_DESCRIPTOR__TRIGGERED_ACTION = eINSTANCE.getTriggerDescriptor_TriggeredAction();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DESCRIPTOR__TRIGGER = eINSTANCE.getTriggerDescriptor_Trigger();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_DESCRIPTOR__LEVEL = eINSTANCE.getTriggerDescriptor_Level();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.TypedTableImpl <em>Typed Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.TypedTableImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTypedTable()
		 * @generated
		 */
		EClass TYPED_TABLE = eINSTANCE.getTypedTable();

		/**
		 * The meta object literal for the '<em><b>Structured</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_TABLE__STRUCTURED = eINSTANCE.getTypedTable_Structured();

		/**
		 * The meta object literal for the '<em><b>Supertable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_TABLE__SUPERTABLE = eINSTANCE.getTypedTable_Supertable();

		/**
		 * The meta object literal for the '<em><b>Subtables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_TABLE__SUBTABLES = eINSTANCE.getTypedTable_Subtables();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.UniqueConstraintImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.UserDefinedTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getUserDefinedType()
		 * @generated
		 */
		EClass USER_DEFINED_TYPE = eINSTANCE.getUserDefinedType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_TYPE__NAME = eINSTANCE.getUserDefinedType_Name();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.ViewImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getView()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.XMLTypeImpl <em>XML Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.XMLTypeImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getXMLType()
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
		 * The meta object literal for the '{@link SQL2003_V3.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.DomainImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__EXPRESSION = eINSTANCE.getDomain_Expression();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DEFAULT = eINSTANCE.getDomain_Default();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SCHEMA = eINSTANCE.getDomain_Schema();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DEFINES = eINSTANCE.getDomain_Defines();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__CONSTRAINT = eINSTANCE.getDomain_Constraint();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.impl.DomainConstraintImpl <em>Domain Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.impl.DomainConstraintImpl
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDomainConstraint()
		 * @generated
		 */
		EClass DOMAIN_CONSTRAINT = eINSTANCE.getDomainConstraint();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONSTRAINT__DOMAIN = eINSTANCE.getDomainConstraint_Domain();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.BinaryStringTypes <em>Binary String Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.BinaryStringTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBinaryStringTypes()
		 * @generated
		 */
		EEnum BINARY_STRING_TYPES = eINSTANCE.getBinaryStringTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.BooleanTypes <em>Boolean Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.BooleanTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getBooleanTypes()
		 * @generated
		 */
		EEnum BOOLEAN_TYPES = eINSTANCE.getBooleanTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.CharacterStringTypes <em>Character String Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.CharacterStringTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getCharacterStringTypes()
		 * @generated
		 */
		EEnum CHARACTER_STRING_TYPES = eINSTANCE.getCharacterStringTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.DatetimeFeatures <em>Datetime Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.DatetimeFeatures
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeFeatures()
		 * @generated
		 */
		EEnum DATETIME_FEATURES = eINSTANCE.getDatetimeFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.DatetimeTypes <em>Datetime Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.DatetimeTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getDatetimeTypes()
		 * @generated
		 */
		EEnum DATETIME_TYPES = eINSTANCE.getDatetimeTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.IntervalFeatures <em>Interval Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.IntervalFeatures
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalFeatures()
		 * @generated
		 */
		EEnum INTERVAL_FEATURES = eINSTANCE.getIntervalFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.IntervalTypes <em>Interval Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.IntervalTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getIntervalTypes()
		 * @generated
		 */
		EEnum INTERVAL_TYPES = eINSTANCE.getIntervalTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.MatchTypes <em>Match Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.MatchTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMatchTypes()
		 * @generated
		 */
		EEnum MATCH_TYPES = eINSTANCE.getMatchTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.Multiplier <em>Multiplier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.Multiplier
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getMultiplier()
		 * @generated
		 */
		EEnum MULTIPLIER = eINSTANCE.getMultiplier();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.NumericRadix <em>Numeric Radix</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.NumericRadix
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericRadix()
		 * @generated
		 */
		EEnum NUMERIC_RADIX = eINSTANCE.getNumericRadix();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.NumericFeatures <em>Numeric Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.NumericFeatures
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericFeatures()
		 * @generated
		 */
		EEnum NUMERIC_FEATURES = eINSTANCE.getNumericFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.NumericTypes <em>Numeric Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.NumericTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getNumericTypes()
		 * @generated
		 */
		EEnum NUMERIC_TYPES = eINSTANCE.getNumericTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.ParameterMode <em>Parameter Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.ParameterMode
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getParameterMode()
		 * @generated
		 */
		EEnum PARAMETER_MODE = eINSTANCE.getParameterMode();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.ReferentialAction <em>Referential Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.ReferentialAction
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getReferentialAction()
		 * @generated
		 */
		EEnum REFERENTIAL_ACTION = eINSTANCE.getReferentialAction();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.StringFeatures <em>String Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.StringFeatures
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getStringFeatures()
		 * @generated
		 */
		EEnum STRING_FEATURES = eINSTANCE.getStringFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.TriggerActionTime <em>Trigger Action Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.TriggerActionTime
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerActionTime()
		 * @generated
		 */
		EEnum TRIGGER_ACTION_TIME = eINSTANCE.getTriggerActionTime();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.TriggerEvent <em>Trigger Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.TriggerEvent
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerEvent()
		 * @generated
		 */
		EEnum TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.TriggerLevel <em>Trigger Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.TriggerLevel
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getTriggerLevel()
		 * @generated
		 */
		EEnum TRIGGER_LEVEL = eINSTANCE.getTriggerLevel();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.Unit
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link SQL2003_V3.XMLTypes <em>XML Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_V3.XMLTypes
		 * @see SQL2003_V3.impl.SQL2003_V3PackageImpl#getXMLTypes()
		 * @generated
		 */
		EEnum XML_TYPES = eINSTANCE.getXMLTypes();

	}

} //SQL2003_V3Package
