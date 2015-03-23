/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;

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
 * @see SQL2003_evo.SQL2003_evoFactory
 * @model kind="package"
 * @generated
 */
public interface SQL2003_evoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SQL2003_evo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://SQL2003_evo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SQL2003_evo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SQL2003_evoPackage eINSTANCE = SQL2003_evo.impl.SQL2003_evoPackageImpl.init();

	/**
	 * The meta object id for the '{@link SQL2003_evo.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.DataTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDataType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.ConstructedTypeImpl <em>Constructed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ConstructedTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getConstructedType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.CollectionTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getCollectionType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.ARRAYImpl <em>ARRAY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ARRAYImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getARRAY()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.StructuralComponentImpl <em>Structural Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.StructuralComponentImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStructuralComponent()
	 * @generated
	 */
	int STRUCTURAL_COMPONENT = 38;

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
	 * The number of structural features of the '<em>Structural Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link SQL2003_evo.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.AttributeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.TableImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 40;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.BaseTableImpl <em>Base Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.BaseTableImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBaseTable()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.BehaviouralComponentImpl <em>Behavioural Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.BehaviouralComponentImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBehaviouralComponent()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.PredefinedTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getPredefinedType()
	 * @generated
	 */
	int PREDEFINED_TYPE = 29;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.BinaryStringTypeImpl <em>Binary String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.BinaryStringTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBinaryStringType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.BooleanTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBooleanType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.CharacterStringTypeImpl <em>Character String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.CharacterStringTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getCharacterStringType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ColumnImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getColumn()
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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DEFAULT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = STRUCTURAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = STRUCTURAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SQL2003_evo.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.RestrictionImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 35;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ColumnConstraintImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getColumnConstraint()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.FeatureImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 16;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SQL2003_evo.impl.DatetimeFeatureImpl <em>Datetime Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.DatetimeFeatureImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeFeature()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.DatetimeTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.DerivedTableImpl <em>Derived Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.DerivedTableImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDerivedTable()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.UserDefinedTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getUserDefinedType()
	 * @generated
	 */
	int USER_DEFINED_TYPE = 47;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.DistinctTypeImpl <em>Distinct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.DistinctTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDistinctType()
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
	 * The meta object id for the '{@link SQL2003_evo.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.FieldImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 17;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.FunctionImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 18;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.IntervalFeatureImpl <em>Interval Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.IntervalFeatureImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalFeature()
	 * @generated
	 */
	int INTERVAL_FEATURE = 19;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.IntervalTypeImpl <em>Interval Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.IntervalTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalType()
	 * @generated
	 */
	int INTERVAL_TYPE = 20;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.MULTISETImpl <em>MULTISET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.MULTISETImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMULTISET()
	 * @generated
	 */
	int MULTISET = 21;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.MethodImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 22;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ParameterImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 27;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.MethodParameterImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMethodParameter()
	 * @generated
	 */
	int METHOD_PARAMETER = 23;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.NotNullImpl <em>Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.NotNullImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNotNull()
	 * @generated
	 */
	int NOT_NULL = 24;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.NumericFeatureImpl <em>Numeric Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.NumericFeatureImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericFeature()
	 * @generated
	 */
	int NUMERIC_FEATURE = 25;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.NumericTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 26;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ParameterWithModeImpl <em>Parameter With Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ParameterWithModeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getParameterWithMode()
	 * @generated
	 */
	int PARAMETER_WITH_MODE = 28;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.TableConstraintImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTableConstraint()
	 * @generated
	 */
	int TABLE_CONSTRAINT = 42;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.UniqueConstraintImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 46;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.PrimaryKeyImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 30;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ProcedureImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 31;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ROWImpl <em>ROW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ROWImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getROW()
	 * @generated
	 */
	int ROW = 32;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ReferenceTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 33;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ReferentialConstraintImpl <em>Referential Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ReferentialConstraintImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getReferentialConstraint()
	 * @generated
	 */
	int REFERENTIAL_CONSTRAINT = 34;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.SchemaImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 36;

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
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link SQL2003_evo.impl.StringFeatureImpl <em>String Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.StringFeatureImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStringFeature()
	 * @generated
	 */
	int STRING_FEATURE = 37;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.StructuredTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStructuredType()
	 * @generated
	 */
	int STRUCTURED_TYPE = 39;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.TableCheckConstraintImpl <em>Table Check Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.TableCheckConstraintImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTableCheckConstraint()
	 * @generated
	 */
	int TABLE_CHECK_CONSTRAINT = 41;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.TriggerImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 43;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.TriggerDescriptorImpl <em>Trigger Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.TriggerDescriptorImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerDescriptor()
	 * @generated
	 */
	int TRIGGER_DESCRIPTOR = 44;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.TypedTableImpl <em>Typed Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.TypedTableImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTypedTable()
	 * @generated
	 */
	int TYPED_TABLE = 45;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.ViewImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 48;

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
	 * The meta object id for the '{@link SQL2003_evo.impl.XMLTypeImpl <em>XML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.impl.XMLTypeImpl
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getXMLType()
	 * @generated
	 */
	int XML_TYPE = 49;

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
	 * The meta object id for the '{@link SQL2003_evo.BinaryStringTypes <em>Binary String Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.BinaryStringTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBinaryStringTypes()
	 * @generated
	 */
	int BINARY_STRING_TYPES = 50;

	/**
	 * The meta object id for the '{@link SQL2003_evo.BooleanTypes <em>Boolean Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.BooleanTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBooleanTypes()
	 * @generated
	 */
	int BOOLEAN_TYPES = 51;

	/**
	 * The meta object id for the '{@link SQL2003_evo.CharacterStringTypes <em>Character String Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.CharacterStringTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getCharacterStringTypes()
	 * @generated
	 */
	int CHARACTER_STRING_TYPES = 52;

	/**
	 * The meta object id for the '{@link SQL2003_evo.DatetimeFeatures <em>Datetime Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.DatetimeFeatures
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeFeatures()
	 * @generated
	 */
	int DATETIME_FEATURES = 53;

	/**
	 * The meta object id for the '{@link SQL2003_evo.DatetimeTypes <em>Datetime Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.DatetimeTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeTypes()
	 * @generated
	 */
	int DATETIME_TYPES = 54;

	/**
	 * The meta object id for the '{@link SQL2003_evo.IntervalFeatures <em>Interval Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.IntervalFeatures
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalFeatures()
	 * @generated
	 */
	int INTERVAL_FEATURES = 55;

	/**
	 * The meta object id for the '{@link SQL2003_evo.IntervalTypes <em>Interval Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.IntervalTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalTypes()
	 * @generated
	 */
	int INTERVAL_TYPES = 56;

	/**
	 * The meta object id for the '{@link SQL2003_evo.MatchTypes <em>Match Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.MatchTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMatchTypes()
	 * @generated
	 */
	int MATCH_TYPES = 57;

	/**
	 * The meta object id for the '{@link SQL2003_evo.Multiplier <em>Multiplier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.Multiplier
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMultiplier()
	 * @generated
	 */
	int MULTIPLIER = 58;

	/**
	 * The meta object id for the '{@link SQL2003_evo.NumericRadix <em>Numeric Radix</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.NumericRadix
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericRadix()
	 * @generated
	 */
	int NUMERIC_RADIX = 59;

	/**
	 * The meta object id for the '{@link SQL2003_evo.NumericFeatures <em>Numeric Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.NumericFeatures
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericFeatures()
	 * @generated
	 */
	int NUMERIC_FEATURES = 60;

	/**
	 * The meta object id for the '{@link SQL2003_evo.NumericTypes <em>Numeric Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.NumericTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericTypes()
	 * @generated
	 */
	int NUMERIC_TYPES = 61;

	/**
	 * The meta object id for the '{@link SQL2003_evo.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.ParameterMode
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 62;

	/**
	 * The meta object id for the '{@link SQL2003_evo.ReferentialAction <em>Referential Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.ReferentialAction
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getReferentialAction()
	 * @generated
	 */
	int REFERENTIAL_ACTION = 63;

	/**
	 * The meta object id for the '{@link SQL2003_evo.StringFeatures <em>String Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.StringFeatures
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStringFeatures()
	 * @generated
	 */
	int STRING_FEATURES = 64;

	/**
	 * The meta object id for the '{@link SQL2003_evo.TriggerActionTime <em>Trigger Action Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.TriggerActionTime
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerActionTime()
	 * @generated
	 */
	int TRIGGER_ACTION_TIME = 65;

	/**
	 * The meta object id for the '{@link SQL2003_evo.TriggerEvent <em>Trigger Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.TriggerEvent
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerEvent()
	 * @generated
	 */
	int TRIGGER_EVENT = 66;

	/**
	 * The meta object id for the '{@link SQL2003_evo.TriggerLevel <em>Trigger Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.TriggerLevel
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerLevel()
	 * @generated
	 */
	int TRIGGER_LEVEL = 67;

	/**
	 * The meta object id for the '{@link SQL2003_evo.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.Unit
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 68;

	/**
	 * The meta object id for the '{@link SQL2003_evo.XMLTypes <em>XML Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SQL2003_evo.XMLTypes
	 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getXMLTypes()
	 * @generated
	 */
	int XML_TYPES = 69;


	/**
	 * Returns the meta object for class '{@link SQL2003_evo.ARRAY <em>ARRAY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARRAY</em>'.
	 * @see SQL2003_evo.ARRAY
	 * @generated
	 */
	EClass getARRAY();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.ARRAY#getNum_elements <em>Num elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num elements</em>'.
	 * @see SQL2003_evo.ARRAY#getNum_elements()
	 * @see #getARRAY()
	 * @generated
	 */
	EAttribute getARRAY_Num_elements();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see SQL2003_evo.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see SQL2003_evo.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.Attribute#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured</em>'.
	 * @see SQL2003_evo.Attribute#getStructured()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Structured();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.BaseTable <em>Base Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Table</em>'.
	 * @see SQL2003_evo.BaseTable
	 * @generated
	 */
	EClass getBaseTable();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.BehaviouralComponent <em>Behavioural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Component</em>'.
	 * @see SQL2003_evo.BehaviouralComponent
	 * @generated
	 */
	EClass getBehaviouralComponent();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.BehaviouralComponent#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SQL2003_evo.BehaviouralComponent#getSchema()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EReference getBehaviouralComponent_Schema();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.BehaviouralComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.BehaviouralComponent#getName()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EAttribute getBehaviouralComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.BehaviouralComponent#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see SQL2003_evo.BehaviouralComponent#getBody()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EAttribute getBehaviouralComponent_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.BehaviouralComponent#getParametersWithMode <em>Parameters With Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters With Mode</em>'.
	 * @see SQL2003_evo.BehaviouralComponent#getParametersWithMode()
	 * @see #getBehaviouralComponent()
	 * @generated
	 */
	EReference getBehaviouralComponent_ParametersWithMode();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.BinaryStringType <em>Binary String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary String Type</em>'.
	 * @see SQL2003_evo.BinaryStringType
	 * @generated
	 */
	EClass getBinaryStringType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.BinaryStringType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_evo.BinaryStringType#getDescriptor()
	 * @see #getBinaryStringType()
	 * @generated
	 */
	EAttribute getBinaryStringType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.BinaryStringType#getLength_def <em>Length def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length def</em>'.
	 * @see SQL2003_evo.BinaryStringType#getLength_def()
	 * @see #getBinaryStringType()
	 * @generated
	 */
	EAttribute getBinaryStringType_Length_def();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see SQL2003_evo.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.BooleanType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_evo.BooleanType#getDescriptor()
	 * @see #getBooleanType()
	 * @generated
	 */
	EAttribute getBooleanType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.CharacterStringType <em>Character String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character String Type</em>'.
	 * @see SQL2003_evo.CharacterStringType
	 * @generated
	 */
	EClass getCharacterStringType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.CharacterStringType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_evo.CharacterStringType#getDescriptor()
	 * @see #getCharacterStringType()
	 * @generated
	 */
	EAttribute getCharacterStringType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.CharacterStringType#getLength_def <em>Length def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length def</em>'.
	 * @see SQL2003_evo.CharacterStringType#getLength_def()
	 * @see #getCharacterStringType()
	 * @generated
	 */
	EAttribute getCharacterStringType_Length_def();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see SQL2003_evo.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.CollectionType#getSuper_type <em>Super type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super type</em>'.
	 * @see SQL2003_evo.CollectionType#getSuper_type()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Super_type();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.CollectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_evo.CollectionType#getType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Type();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see SQL2003_evo.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Column#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see SQL2003_evo.Column#getDefault()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Default();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see SQL2003_evo.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.ColumnConstraint <em>Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Constraint</em>'.
	 * @see SQL2003_evo.ColumnConstraint
	 * @generated
	 */
	EClass getColumnConstraint();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.ConstructedType <em>Constructed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructed Type</em>'.
	 * @see SQL2003_evo.ConstructedType
	 * @generated
	 */
	EClass getConstructedType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.ConstructedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.ConstructedType#getName()
	 * @see #getConstructedType()
	 * @generated
	 */
	EAttribute getConstructedType_Name();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see SQL2003_evo.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.DataType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SQL2003_evo.DataType#getSchema()
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
	 * @model keyDataType="SQL2003_evo.DatetimeFeatures" keyRequired="true"
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
	 * Returns the meta object for class '{@link SQL2003_evo.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Type</em>'.
	 * @see SQL2003_evo.DatetimeType
	 * @generated
	 */
	EClass getDatetimeType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.DatetimeType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_evo.DatetimeType#getDescriptor()
	 * @see #getDatetimeType()
	 * @generated
	 */
	EAttribute getDatetimeType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.DerivedTable <em>Derived Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Table</em>'.
	 * @see SQL2003_evo.DerivedTable
	 * @generated
	 */
	EClass getDerivedTable();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.DerivedTable#getQuery_expression <em>Query expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query expression</em>'.
	 * @see SQL2003_evo.DerivedTable#getQuery_expression()
	 * @see #getDerivedTable()
	 * @generated
	 */
	EAttribute getDerivedTable_Query_expression();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.DistinctType <em>Distinct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinct Type</em>'.
	 * @see SQL2003_evo.DistinctType
	 * @generated
	 */
	EClass getDistinctType();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.DistinctType#getSource_type <em>Source type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source type</em>'.
	 * @see SQL2003_evo.DistinctType#getSource_type()
	 * @see #getDistinctType()
	 * @generated
	 */
	EReference getDistinctType_Source_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.DistinctType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see SQL2003_evo.DistinctType#getFeatures()
	 * @see #getDistinctType()
	 * @generated
	 */
	EReference getDistinctType_Features();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see SQL2003_evo.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see SQL2003_evo.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.Field#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see SQL2003_evo.Field#getRow()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Row();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see SQL2003_evo.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.Function#getReturn_type <em>Return type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return type</em>'.
	 * @see SQL2003_evo.Function#getReturn_type()
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
	 * @model keyDataType="SQL2003_evo.IntervalFeatures" keyRequired="true"
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
	 * Returns the meta object for class '{@link SQL2003_evo.IntervalType <em>Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Type</em>'.
	 * @see SQL2003_evo.IntervalType
	 * @generated
	 */
	EClass getIntervalType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.IntervalType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_evo.IntervalType#getDescriptor()
	 * @see #getIntervalType()
	 * @generated
	 */
	EAttribute getIntervalType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.MULTISET <em>MULTISET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MULTISET</em>'.
	 * @see SQL2003_evo.MULTISET
	 * @generated
	 */
	EClass getMULTISET();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see SQL2003_evo.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see SQL2003_evo.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Body();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.Method#getOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override</em>'.
	 * @see SQL2003_evo.Method#getOverride()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Override();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.Method#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured</em>'.
	 * @see SQL2003_evo.Method#getStructured()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Structured();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.Method#getReturn_type <em>Return type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return type</em>'.
	 * @see SQL2003_evo.Method#getReturn_type()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Return_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see SQL2003_evo.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter</em>'.
	 * @see SQL2003_evo.MethodParameter
	 * @generated
	 */
	EClass getMethodParameter();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.MethodParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see SQL2003_evo.MethodParameter#getMethod()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EReference getMethodParameter_Method();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.NotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null</em>'.
	 * @see SQL2003_evo.NotNull
	 * @generated
	 */
	EClass getNotNull();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Numeric Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="SQL2003_evo.NumericFeatures" keyRequired="true"
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
	 * Returns the meta object for class '{@link SQL2003_evo.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see SQL2003_evo.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.NumericType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_evo.NumericType#getDescriptor()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_Descriptor();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see SQL2003_evo.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_evo.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.ParameterWithMode <em>Parameter With Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter With Mode</em>'.
	 * @see SQL2003_evo.ParameterWithMode
	 * @generated
	 */
	EClass getParameterWithMode();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.ParameterWithMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see SQL2003_evo.ParameterWithMode#getMode()
	 * @see #getParameterWithMode()
	 * @generated
	 */
	EAttribute getParameterWithMode_Mode();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.ParameterWithMode#getBehaviouralComponent <em>Behavioural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Behavioural Component</em>'.
	 * @see SQL2003_evo.ParameterWithMode#getBehaviouralComponent()
	 * @see #getParameterWithMode()
	 * @generated
	 */
	EReference getParameterWithMode_BehaviouralComponent();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.PredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Type</em>'.
	 * @see SQL2003_evo.PredefinedType
	 * @generated
	 */
	EClass getPredefinedType();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.PredefinedType#getIs_source_of <em>Is source of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is source of</em>'.
	 * @see SQL2003_evo.PredefinedType#getIs_source_of()
	 * @see #getPredefinedType()
	 * @generated
	 */
	EReference getPredefinedType_Is_source_of();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see SQL2003_evo.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see SQL2003_evo.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.ROW <em>ROW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROW</em>'.
	 * @see SQL2003_evo.ROW
	 * @generated
	 */
	EClass getROW();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.ROW#getSuper_type <em>Super type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super type</em>'.
	 * @see SQL2003_evo.ROW#getSuper_type()
	 * @see #getROW()
	 * @generated
	 */
	EReference getROW_Super_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.ROW#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see SQL2003_evo.ROW#getFields()
	 * @see #getROW()
	 * @generated
	 */
	EReference getROW_Fields();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.ROW#getSub_types <em>Sub types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub types</em>'.
	 * @see SQL2003_evo.ROW#getSub_types()
	 * @see #getROW()
	 * @generated
	 */
	EReference getROW_Sub_types();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see SQL2003_evo.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.ReferenceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_evo.ReferenceType#getType()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Type();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.ReferentialConstraint <em>Referential Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referential Constraint</em>'.
	 * @see SQL2003_evo.ReferentialConstraint
	 * @generated
	 */
	EClass getReferentialConstraint();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.ReferentialConstraint#getDelete_action <em>Delete action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete action</em>'.
	 * @see SQL2003_evo.ReferentialConstraint#getDelete_action()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EAttribute getReferentialConstraint_Delete_action();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.ReferentialConstraint#getUpdate_action <em>Update action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update action</em>'.
	 * @see SQL2003_evo.ReferentialConstraint#getUpdate_action()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EAttribute getReferentialConstraint_Update_action();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.ReferentialConstraint#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match</em>'.
	 * @see SQL2003_evo.ReferentialConstraint#getMatch()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EAttribute getReferentialConstraint_Match();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.ReferentialConstraint#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see SQL2003_evo.ReferentialConstraint#getReferences()
	 * @see #getReferentialConstraint()
	 * @generated
	 */
	EReference getReferentialConstraint_References();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see SQL2003_evo.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.Restriction#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see SQL2003_evo.Restriction#getTable()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Table();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.Restriction#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see SQL2003_evo.Restriction#getColumns()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Columns();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see SQL2003_evo.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.Schema#getBehaviouralComponents <em>Behavioural Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavioural Components</em>'.
	 * @see SQL2003_evo.Schema#getBehaviouralComponents()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_BehaviouralComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.Schema#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see SQL2003_evo.Schema#getDatatypes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see SQL2003_evo.Schema#getTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Tables();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Feature</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="SQL2003_evo.StringFeatures" keyRequired="true"
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
	 * Returns the meta object for class '{@link SQL2003_evo.StructuralComponent <em>Structural Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Component</em>'.
	 * @see SQL2003_evo.StructuralComponent
	 * @generated
	 */
	EClass getStructuralComponent();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.StructuralComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.StructuralComponent#getName()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EAttribute getStructuralComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.StructuralComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SQL2003_evo.StructuralComponent#getType()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Type();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.StructuralComponent#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see SQL2003_evo.StructuralComponent#getViews()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Views();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.StructuralComponent#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrictions</em>'.
	 * @see SQL2003_evo.StructuralComponent#getRestrictions()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Restrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.StructuralComponent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see SQL2003_evo.StructuralComponent#getFeatures()
	 * @see #getStructuralComponent()
	 * @generated
	 */
	EReference getStructuralComponent_Features();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.StructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Type</em>'.
	 * @see SQL2003_evo.StructuredType
	 * @generated
	 */
	EClass getStructuredType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.StructuredType#isIs_final <em>Is final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is final</em>'.
	 * @see SQL2003_evo.StructuredType#isIs_final()
	 * @see #getStructuredType()
	 * @generated
	 */
	EAttribute getStructuredType_Is_final();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.StructuredType#isIs_instantiable <em>Is instantiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is instantiable</em>'.
	 * @see SQL2003_evo.StructuredType#isIs_instantiable()
	 * @see #getStructuredType()
	 * @generated
	 */
	EAttribute getStructuredType_Is_instantiable();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.StructuredType#getSuper_type <em>Super type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super type</em>'.
	 * @see SQL2003_evo.StructuredType#getSuper_type()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Super_type();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.StructuredType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see SQL2003_evo.StructuredType#getAttributes()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.StructuredType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see SQL2003_evo.StructuredType#getMethods()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Methods();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.StructuredType#getTyped <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed</em>'.
	 * @see SQL2003_evo.StructuredType#getTyped()
	 * @see #getStructuredType()
	 * @generated
	 */
	EReference getStructuredType_Typed();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see SQL2003_evo.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see SQL2003_evo.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see SQL2003_evo.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.Table#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see SQL2003_evo.Table#getViews()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link SQL2003_evo.Table#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see SQL2003_evo.Table#getRestrictions()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Restrictions();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.TableCheckConstraint <em>Table Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Check Constraint</em>'.
	 * @see SQL2003_evo.TableCheckConstraint
	 * @generated
	 */
	EClass getTableCheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.TableCheckConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see SQL2003_evo.TableCheckConstraint#getExpression()
	 * @see #getTableCheckConstraint()
	 * @generated
	 */
	EAttribute getTableCheckConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.TableConstraint <em>Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Constraint</em>'.
	 * @see SQL2003_evo.TableConstraint
	 * @generated
	 */
	EClass getTableConstraint();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.TableConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.TableConstraint#getName()
	 * @see #getTableConstraint()
	 * @generated
	 */
	EAttribute getTableConstraint_Name();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see SQL2003_evo.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the containment reference '{@link SQL2003_evo.Trigger#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see SQL2003_evo.Trigger#getDescription()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Description();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.Trigger#getUpdateColumns <em>Update Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Columns</em>'.
	 * @see SQL2003_evo.Trigger#getUpdateColumns()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_UpdateColumns();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.TriggerDescriptor <em>Trigger Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Descriptor</em>'.
	 * @see SQL2003_evo.TriggerDescriptor
	 * @generated
	 */
	EClass getTriggerDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.TriggerDescriptor#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see SQL2003_evo.TriggerDescriptor#getEvent()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_Event();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.TriggerDescriptor#getActionTime <em>Action Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Time</em>'.
	 * @see SQL2003_evo.TriggerDescriptor#getActionTime()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_ActionTime();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.TriggerDescriptor#getTriggeredAction <em>Triggered Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered Action</em>'.
	 * @see SQL2003_evo.TriggerDescriptor#getTriggeredAction()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_TriggeredAction();

	/**
	 * Returns the meta object for the container reference '{@link SQL2003_evo.TriggerDescriptor#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trigger</em>'.
	 * @see SQL2003_evo.TriggerDescriptor#getTrigger()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EReference getTriggerDescriptor_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.TriggerDescriptor#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see SQL2003_evo.TriggerDescriptor#getLevel()
	 * @see #getTriggerDescriptor()
	 * @generated
	 */
	EAttribute getTriggerDescriptor_Level();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.TypedTable <em>Typed Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Table</em>'.
	 * @see SQL2003_evo.TypedTable
	 * @generated
	 */
	EClass getTypedTable();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.TypedTable#getStructured <em>Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structured</em>'.
	 * @see SQL2003_evo.TypedTable#getStructured()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_Structured();

	/**
	 * Returns the meta object for the reference '{@link SQL2003_evo.TypedTable#getSupertable <em>Supertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertable</em>'.
	 * @see SQL2003_evo.TypedTable#getSupertable()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_Supertable();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.TypedTable#getSubtables <em>Subtables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtables</em>'.
	 * @see SQL2003_evo.TypedTable#getSubtables()
	 * @see #getTypedTable()
	 * @generated
	 */
	EReference getTypedTable_Subtables();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see SQL2003_evo.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.UserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Type</em>'.
	 * @see SQL2003_evo.UserDefinedType
	 * @generated
	 */
	EClass getUserDefinedType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.UserDefinedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SQL2003_evo.UserDefinedType#getName()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	EAttribute getUserDefinedType_Name();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see SQL2003_evo.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.View#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see SQL2003_evo.View#getTables()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Tables();

	/**
	 * Returns the meta object for the reference list '{@link SQL2003_evo.View#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see SQL2003_evo.View#getComponents()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Components();

	/**
	 * Returns the meta object for class '{@link SQL2003_evo.XMLType <em>XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Type</em>'.
	 * @see SQL2003_evo.XMLType
	 * @generated
	 */
	EClass getXMLType();

	/**
	 * Returns the meta object for the attribute '{@link SQL2003_evo.XMLType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see SQL2003_evo.XMLType#getDescriptor()
	 * @see #getXMLType()
	 * @generated
	 */
	EAttribute getXMLType_Descriptor();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.BinaryStringTypes <em>Binary String Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary String Types</em>'.
	 * @see SQL2003_evo.BinaryStringTypes
	 * @generated
	 */
	EEnum getBinaryStringTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.BooleanTypes <em>Boolean Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Types</em>'.
	 * @see SQL2003_evo.BooleanTypes
	 * @generated
	 */
	EEnum getBooleanTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.CharacterStringTypes <em>Character String Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Character String Types</em>'.
	 * @see SQL2003_evo.CharacterStringTypes
	 * @generated
	 */
	EEnum getCharacterStringTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.DatetimeFeatures <em>Datetime Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Features</em>'.
	 * @see SQL2003_evo.DatetimeFeatures
	 * @generated
	 */
	EEnum getDatetimeFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.DatetimeTypes <em>Datetime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Types</em>'.
	 * @see SQL2003_evo.DatetimeTypes
	 * @generated
	 */
	EEnum getDatetimeTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.IntervalFeatures <em>Interval Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interval Features</em>'.
	 * @see SQL2003_evo.IntervalFeatures
	 * @generated
	 */
	EEnum getIntervalFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.IntervalTypes <em>Interval Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interval Types</em>'.
	 * @see SQL2003_evo.IntervalTypes
	 * @generated
	 */
	EEnum getIntervalTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.MatchTypes <em>Match Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Types</em>'.
	 * @see SQL2003_evo.MatchTypes
	 * @generated
	 */
	EEnum getMatchTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.Multiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplier</em>'.
	 * @see SQL2003_evo.Multiplier
	 * @generated
	 */
	EEnum getMultiplier();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.NumericRadix <em>Numeric Radix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Radix</em>'.
	 * @see SQL2003_evo.NumericRadix
	 * @generated
	 */
	EEnum getNumericRadix();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.NumericFeatures <em>Numeric Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Features</em>'.
	 * @see SQL2003_evo.NumericFeatures
	 * @generated
	 */
	EEnum getNumericFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.NumericTypes <em>Numeric Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Types</em>'.
	 * @see SQL2003_evo.NumericTypes
	 * @generated
	 */
	EEnum getNumericTypes();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see SQL2003_evo.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.ReferentialAction <em>Referential Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referential Action</em>'.
	 * @see SQL2003_evo.ReferentialAction
	 * @generated
	 */
	EEnum getReferentialAction();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.StringFeatures <em>String Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Features</em>'.
	 * @see SQL2003_evo.StringFeatures
	 * @generated
	 */
	EEnum getStringFeatures();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.TriggerActionTime <em>Trigger Action Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Action Time</em>'.
	 * @see SQL2003_evo.TriggerActionTime
	 * @generated
	 */
	EEnum getTriggerActionTime();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Event</em>'.
	 * @see SQL2003_evo.TriggerEvent
	 * @generated
	 */
	EEnum getTriggerEvent();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.TriggerLevel <em>Trigger Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Level</em>'.
	 * @see SQL2003_evo.TriggerLevel
	 * @generated
	 */
	EEnum getTriggerLevel();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see SQL2003_evo.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the meta object for enum '{@link SQL2003_evo.XMLTypes <em>XML Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XML Types</em>'.
	 * @see SQL2003_evo.XMLTypes
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
	SQL2003_evoFactory getSQL2003_evoFactory();

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
		 * The meta object literal for the '{@link SQL2003_evo.impl.ARRAYImpl <em>ARRAY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ARRAYImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getARRAY()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.AttributeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.BaseTableImpl <em>Base Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.BaseTableImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBaseTable()
		 * @generated
		 */
		EClass BASE_TABLE = eINSTANCE.getBaseTable();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.BehaviouralComponentImpl <em>Behavioural Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.BehaviouralComponentImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBehaviouralComponent()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.BinaryStringTypeImpl <em>Binary String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.BinaryStringTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBinaryStringType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.BooleanTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBooleanType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.CharacterStringTypeImpl <em>Character String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.CharacterStringTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getCharacterStringType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.CollectionTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getCollectionType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ColumnImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DEFAULT = eINSTANCE.getColumn_Default();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ColumnConstraintImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getColumnConstraint()
		 * @generated
		 */
		EClass COLUMN_CONSTRAINT = eINSTANCE.getColumnConstraint();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.ConstructedTypeImpl <em>Constructed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ConstructedTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getConstructedType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.DataTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDataType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.DatetimeFeatureImpl <em>Datetime Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.DatetimeFeatureImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeFeature()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.DatetimeTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.DerivedTableImpl <em>Derived Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.DerivedTableImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDerivedTable()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.DistinctTypeImpl <em>Distinct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.DistinctTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDistinctType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.FeatureImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.FieldImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getField()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.FunctionImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getFunction()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.IntervalFeatureImpl <em>Interval Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.IntervalFeatureImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalFeature()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.IntervalTypeImpl <em>Interval Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.IntervalTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.MULTISETImpl <em>MULTISET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.MULTISETImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMULTISET()
		 * @generated
		 */
		EClass MULTISET = eINSTANCE.getMULTISET();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.MethodImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMethod()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.MethodParameterImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMethodParameter()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.NotNullImpl <em>Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.NotNullImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNotNull()
		 * @generated
		 */
		EClass NOT_NULL = eINSTANCE.getNotNull();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.NumericFeatureImpl <em>Numeric Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.NumericFeatureImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericFeature()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.NumericTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ParameterImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getParameter()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.ParameterWithModeImpl <em>Parameter With Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ParameterWithModeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getParameterWithMode()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.PredefinedTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getPredefinedType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.PrimaryKeyImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ProcedureImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.ROWImpl <em>ROW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ROWImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getROW()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ReferenceTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getReferenceType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.ReferentialConstraintImpl <em>Referential Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ReferentialConstraintImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getReferentialConstraint()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.RestrictionImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getRestriction()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.SchemaImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getSchema()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.StringFeatureImpl <em>String Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.StringFeatureImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStringFeature()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.StructuralComponentImpl <em>Structural Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.StructuralComponentImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStructuralComponent()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.StructuredTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStructuredType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.TableImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTable()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.TableCheckConstraintImpl <em>Table Check Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.TableCheckConstraintImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTableCheckConstraint()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.TableConstraintImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTableConstraint()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.TriggerImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTrigger()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.TriggerDescriptorImpl <em>Trigger Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.TriggerDescriptorImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerDescriptor()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.TypedTableImpl <em>Typed Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.TypedTableImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTypedTable()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.UniqueConstraintImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.UserDefinedTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getUserDefinedType()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.ViewImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getView()
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
		 * The meta object literal for the '{@link SQL2003_evo.impl.XMLTypeImpl <em>XML Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.impl.XMLTypeImpl
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getXMLType()
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
		 * The meta object literal for the '{@link SQL2003_evo.BinaryStringTypes <em>Binary String Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.BinaryStringTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBinaryStringTypes()
		 * @generated
		 */
		EEnum BINARY_STRING_TYPES = eINSTANCE.getBinaryStringTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.BooleanTypes <em>Boolean Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.BooleanTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getBooleanTypes()
		 * @generated
		 */
		EEnum BOOLEAN_TYPES = eINSTANCE.getBooleanTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.CharacterStringTypes <em>Character String Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.CharacterStringTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getCharacterStringTypes()
		 * @generated
		 */
		EEnum CHARACTER_STRING_TYPES = eINSTANCE.getCharacterStringTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.DatetimeFeatures <em>Datetime Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.DatetimeFeatures
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeFeatures()
		 * @generated
		 */
		EEnum DATETIME_FEATURES = eINSTANCE.getDatetimeFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.DatetimeTypes <em>Datetime Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.DatetimeTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getDatetimeTypes()
		 * @generated
		 */
		EEnum DATETIME_TYPES = eINSTANCE.getDatetimeTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.IntervalFeatures <em>Interval Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.IntervalFeatures
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalFeatures()
		 * @generated
		 */
		EEnum INTERVAL_FEATURES = eINSTANCE.getIntervalFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.IntervalTypes <em>Interval Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.IntervalTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getIntervalTypes()
		 * @generated
		 */
		EEnum INTERVAL_TYPES = eINSTANCE.getIntervalTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.MatchTypes <em>Match Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.MatchTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMatchTypes()
		 * @generated
		 */
		EEnum MATCH_TYPES = eINSTANCE.getMatchTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.Multiplier <em>Multiplier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.Multiplier
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getMultiplier()
		 * @generated
		 */
		EEnum MULTIPLIER = eINSTANCE.getMultiplier();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.NumericRadix <em>Numeric Radix</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.NumericRadix
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericRadix()
		 * @generated
		 */
		EEnum NUMERIC_RADIX = eINSTANCE.getNumericRadix();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.NumericFeatures <em>Numeric Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.NumericFeatures
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericFeatures()
		 * @generated
		 */
		EEnum NUMERIC_FEATURES = eINSTANCE.getNumericFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.NumericTypes <em>Numeric Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.NumericTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getNumericTypes()
		 * @generated
		 */
		EEnum NUMERIC_TYPES = eINSTANCE.getNumericTypes();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.ParameterMode <em>Parameter Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.ParameterMode
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getParameterMode()
		 * @generated
		 */
		EEnum PARAMETER_MODE = eINSTANCE.getParameterMode();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.ReferentialAction <em>Referential Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.ReferentialAction
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getReferentialAction()
		 * @generated
		 */
		EEnum REFERENTIAL_ACTION = eINSTANCE.getReferentialAction();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.StringFeatures <em>String Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.StringFeatures
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getStringFeatures()
		 * @generated
		 */
		EEnum STRING_FEATURES = eINSTANCE.getStringFeatures();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.TriggerActionTime <em>Trigger Action Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.TriggerActionTime
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerActionTime()
		 * @generated
		 */
		EEnum TRIGGER_ACTION_TIME = eINSTANCE.getTriggerActionTime();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.TriggerEvent <em>Trigger Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.TriggerEvent
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerEvent()
		 * @generated
		 */
		EEnum TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.TriggerLevel <em>Trigger Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.TriggerLevel
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getTriggerLevel()
		 * @generated
		 */
		EEnum TRIGGER_LEVEL = eINSTANCE.getTriggerLevel();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.Unit
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link SQL2003_evo.XMLTypes <em>XML Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SQL2003_evo.XMLTypes
		 * @see SQL2003_evo.impl.SQL2003_evoPackageImpl#getXMLTypes()
		 * @generated
		 */
		EEnum XML_TYPES = eINSTANCE.getXMLTypes();

	}

} //SQL2003_evoPackage
