/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.impl;

import ORDB4ORA.ANSICharacterType;
import ORDB4ORA.ANSICharacterTypes;
import ORDB4ORA.ANSINumberType;
import ORDB4ORA.ANSINumberTypes;
import ORDB4ORA.AnyType;
import ORDB4ORA.Attribute;
import ORDB4ORA.BuiltInCharacterSemantics;
import ORDB4ORA.BuiltInCharacterType;
import ORDB4ORA.BuiltInCharacterTypes;
import ORDB4ORA.BuiltInDatetimeTypes;
import ORDB4ORA.BuiltInLOBType;
import ORDB4ORA.BuiltInLongAndRawTypes;
import ORDB4ORA.BuiltInNumberType;
import ORDB4ORA.BuiltInROWIDType;
import ORDB4ORA.BuiltNumberTypes;
import ORDB4ORA.CharacterFeatures;
import ORDB4ORA.Check;
import ORDB4ORA.Column;
import ORDB4ORA.DatetimeFeatures;
import ORDB4ORA.DatetimeType;
import ORDB4ORA.DerivedTable;
import ORDB4ORA.ForeignKey;
import ORDB4ORA.Function;
import ORDB4ORA.IntervalFeatures;
import ORDB4ORA.LOBType;
import ORDB4ORA.LongAndRawType;
import ORDB4ORA.MediaType;
import ORDB4ORA.Method;
import ORDB4ORA.MethodParameter;
import ORDB4ORA.Model;
import ORDB4ORA.NestedTableType;
import ORDB4ORA.NotNull;
import ORDB4ORA.NumberFeatures;
import ORDB4ORA.ONDELETEActions;
import ORDB4ORA.ORDB4ORAFactory;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.Operation;
import ORDB4ORA.OperationParameter;
import ORDB4ORA.Parameter;
import ORDB4ORA.ParameterMode;
import ORDB4ORA.PrimaryKey;
import ORDB4ORA.Procedure;
import ORDB4ORA.ROWIDType;
import ORDB4ORA.RawFeatures;
import ORDB4ORA.ReferenceType;
import ORDB4ORA.RowFeatures;
import ORDB4ORA.SpacialType;
import ORDB4ORA.StoredNestedTable;
import ORDB4ORA.StructuralComponent;
import ORDB4ORA.StructuredType;
import ORDB4ORA.SuppliedAnyTypes;
import ORDB4ORA.SuppliedMediaTypes;
import ORDB4ORA.SuppliedSpacialTypes;
import ORDB4ORA.SuppliedXMLTypes;
import ORDB4ORA.Table;
import ORDB4ORA.Trigger;
import ORDB4ORA.TriggerActionTime;
import ORDB4ORA.TriggerEvent;
import ORDB4ORA.TypedTable;
import ORDB4ORA.Unique;
import ORDB4ORA.Varray;
import ORDB4ORA.View;
import ORDB4ORA.XMLType;
import ORDB4ORA.*;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ORDB4ORAFactoryImpl extends EFactoryImpl implements ORDB4ORAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ORDB4ORAFactory init() {
		try {
			ORDB4ORAFactory theORDB4ORAFactory = (ORDB4ORAFactory)EPackage.Registry.INSTANCE.getEFactory("http:///ORDB4ORA.ecore"); 
			if (theORDB4ORAFactory != null) {
				return theORDB4ORAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ORDB4ORAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDB4ORAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ORDB4ORAPackage.ANSI_CHARACTER_TYPE: return createANSICharacterType();
			case ORDB4ORAPackage.ANSI_NUMBER_TYPE: return createANSINumberType();
			case ORDB4ORAPackage.ANY_TYPE: return createAnyType();
			case ORDB4ORAPackage.ATTRIBUTE: return createAttribute();
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE: return createBuiltInCharacterType();
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE: return createBuiltInNumberType();
			case ORDB4ORAPackage.CHARACTER_FEATURE: return (EObject)createCharacterFeature();
			case ORDB4ORAPackage.CHECK: return createCheck();
			case ORDB4ORAPackage.COLUMN: return createColumn();
			case ORDB4ORAPackage.DATETIME_FEATURE: return (EObject)createDatetimeFeature();
			case ORDB4ORAPackage.DATETIME_TYPE: return createDatetimeType();
			case ORDB4ORAPackage.FOREIGN_KEY: return createForeignKey();
			case ORDB4ORAPackage.FUNCTION: return createFunction();
			case ORDB4ORAPackage.INTERVAL_FEATURE: return (EObject)createIntervalFeature();
			case ORDB4ORAPackage.LOB_TYPE: return createLOBType();
			case ORDB4ORAPackage.LONG_AND_RAW_TYPE: return createLongAndRawType();
			case ORDB4ORAPackage.MEDIA_TYPE: return createMediaType();
			case ORDB4ORAPackage.METHOD: return createMethod();
			case ORDB4ORAPackage.METHOD_PARAMETER: return createMethodParameter();
			case ORDB4ORAPackage.MODEL: return createModel();
			case ORDB4ORAPackage.NESTED_TABLE_TYPE: return createNestedTableType();
			case ORDB4ORAPackage.NOT_NULL: return createNotNull();
			case ORDB4ORAPackage.NUMBER_FEATURE: return (EObject)createNumberFeature();
			case ORDB4ORAPackage.OPERATION_PARAMETER: return createOperationParameter();
			case ORDB4ORAPackage.PACKAGE: return createPackage();
			case ORDB4ORAPackage.PARAMETER: return createParameter();
			case ORDB4ORAPackage.PRIMARY_KEY: return createPrimaryKey();
			case ORDB4ORAPackage.PROCEDURE: return createProcedure();
			case ORDB4ORAPackage.ROWID_TYPE: return createROWIDType();
			case ORDB4ORAPackage.RAW_FEATURE: return (EObject)createRawFeature();
			case ORDB4ORAPackage.REFERENCE_TYPE: return createReferenceType();
			case ORDB4ORAPackage.ROW_FEATURE: return (EObject)createRowFeature();
			case ORDB4ORAPackage.SPACIAL_TYPE: return createSpacialType();
			case ORDB4ORAPackage.STORED_NESTED_TABLE: return createStoredNestedTable();
			case ORDB4ORAPackage.STRUCTURAL_COMPONENT: return createStructuralComponent();
			case ORDB4ORAPackage.STRUCTURED_TYPE: return createStructuredType();
			case ORDB4ORAPackage.TABLE: return createTable();
			case ORDB4ORAPackage.TRIGGER: return createTrigger();
			case ORDB4ORAPackage.TYPED_TABLE: return createTypedTable();
			case ORDB4ORAPackage.UNIQUE: return createUnique();
			case ORDB4ORAPackage.VARRAY: return createVarray();
			case ORDB4ORAPackage.XML_TYPE: return createXMLType();
			case ORDB4ORAPackage.DERIVED_TABLE: return createDerivedTable();
			case ORDB4ORAPackage.VIEW: return createView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ORDB4ORAPackage.ANSI_CHARACTER_TYPES:
				return createANSICharacterTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.ANSI_NUMBER_TYPES:
				return createANSINumberTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_SEMANTICS:
				return createBuiltInCharacterSemanticsFromString(eDataType, initialValue);
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPES:
				return createBuiltInCharacterTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.BUILT_IN_DATETIME_TYPES:
				return createBuiltInDatetimeTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.BUILT_IN_LOB_TYPE:
				return createBuiltInLOBTypeFromString(eDataType, initialValue);
			case ORDB4ORAPackage.BUILT_IN_LONG_AND_RAW_TYPES:
				return createBuiltInLongAndRawTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.BUILT_IN_ROWID_TYPE:
				return createBuiltInROWIDTypeFromString(eDataType, initialValue);
			case ORDB4ORAPackage.BUILT_NUMBER_TYPES:
				return createBuiltNumberTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.CHARACTER_FEATURES:
				return createCharacterFeaturesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.DATETIME_FEATURES:
				return createDatetimeFeaturesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.INTERVAL_FEATURES:
				return createIntervalFeaturesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.NUMBER_FEATURES:
				return createNumberFeaturesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.ONDELETE_ACTIONS:
				return createONDELETEActionsFromString(eDataType, initialValue);
			case ORDB4ORAPackage.PARAMETER_MODE:
				return createParameterModeFromString(eDataType, initialValue);
			case ORDB4ORAPackage.RAW_FEATURES:
				return createRawFeaturesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.ROW_FEATURES:
				return createRowFeaturesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.SUPPLIED_ANY_TYPES:
				return createSuppliedAnyTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.SUPPLIED_MEDIA_TYPES:
				return createSuppliedMediaTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.SUPPLIED_SPACIAL_TYPES:
				return createSuppliedSpacialTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.SUPPLIED_XML_TYPES:
				return createSuppliedXMLTypesFromString(eDataType, initialValue);
			case ORDB4ORAPackage.TRIGGER_ACTION_TIME:
				return createTriggerActionTimeFromString(eDataType, initialValue);
			case ORDB4ORAPackage.TRIGGER_EVENT:
				return createTriggerEventFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ORDB4ORAPackage.ANSI_CHARACTER_TYPES:
				return convertANSICharacterTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.ANSI_NUMBER_TYPES:
				return convertANSINumberTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_SEMANTICS:
				return convertBuiltInCharacterSemanticsToString(eDataType, instanceValue);
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPES:
				return convertBuiltInCharacterTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.BUILT_IN_DATETIME_TYPES:
				return convertBuiltInDatetimeTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.BUILT_IN_LOB_TYPE:
				return convertBuiltInLOBTypeToString(eDataType, instanceValue);
			case ORDB4ORAPackage.BUILT_IN_LONG_AND_RAW_TYPES:
				return convertBuiltInLongAndRawTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.BUILT_IN_ROWID_TYPE:
				return convertBuiltInROWIDTypeToString(eDataType, instanceValue);
			case ORDB4ORAPackage.BUILT_NUMBER_TYPES:
				return convertBuiltNumberTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.CHARACTER_FEATURES:
				return convertCharacterFeaturesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.DATETIME_FEATURES:
				return convertDatetimeFeaturesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.INTERVAL_FEATURES:
				return convertIntervalFeaturesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.NUMBER_FEATURES:
				return convertNumberFeaturesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.ONDELETE_ACTIONS:
				return convertONDELETEActionsToString(eDataType, instanceValue);
			case ORDB4ORAPackage.PARAMETER_MODE:
				return convertParameterModeToString(eDataType, instanceValue);
			case ORDB4ORAPackage.RAW_FEATURES:
				return convertRawFeaturesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.ROW_FEATURES:
				return convertRowFeaturesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.SUPPLIED_ANY_TYPES:
				return convertSuppliedAnyTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.SUPPLIED_MEDIA_TYPES:
				return convertSuppliedMediaTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.SUPPLIED_SPACIAL_TYPES:
				return convertSuppliedSpacialTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.SUPPLIED_XML_TYPES:
				return convertSuppliedXMLTypesToString(eDataType, instanceValue);
			case ORDB4ORAPackage.TRIGGER_ACTION_TIME:
				return convertTriggerActionTimeToString(eDataType, instanceValue);
			case ORDB4ORAPackage.TRIGGER_EVENT:
				return convertTriggerEventToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedTableType createNestedTableType() {
		NestedTableTypeImpl nestedTableType = new NestedTableTypeImpl();
		return nestedTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOBType createLOBType() {
		LOBTypeImpl lobType = new LOBTypeImpl();
		return lobType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROWIDType createROWIDType() {
		ROWIDTypeImpl rowidType = new ROWIDTypeImpl();
		return rowidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANSICharacterType createANSICharacterType() {
		ANSICharacterTypeImpl ansiCharacterType = new ANSICharacterTypeImpl();
		return ansiCharacterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANSINumberType createANSINumberType() {
		ANSINumberTypeImpl ansiNumberType = new ANSINumberTypeImpl();
		return ansiNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyType createAnyType() {
		AnyTypeImpl anyType = new AnyTypeImpl();
		return anyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLType createXMLType() {
		XMLTypeImpl xmlType = new XMLTypeImpl();
		return xmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedTable createDerivedTable() {
		DerivedTableImpl derivedTable = new DerivedTableImpl();
		return derivedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacialType createSpacialType() {
		SpacialTypeImpl spacialType = new SpacialTypeImpl();
		return spacialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaType() {
		MediaTypeImpl mediaType = new MediaTypeImpl();
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<CharacterFeatures, String> createCharacterFeature() {
		CharacterFeatureImpl characterFeature = new CharacterFeatureImpl();
		return characterFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<NumberFeatures, String> createNumberFeature() {
		NumberFeatureImpl numberFeature = new NumberFeatureImpl();
		return numberFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<RawFeatures, String> createRawFeature() {
		RawFeatureImpl rawFeature = new RawFeatureImpl();
		return rawFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<RowFeatures, String> createRowFeature() {
		RowFeatureImpl rowFeature = new RowFeatureImpl();
		return rowFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<DatetimeFeatures, String> createDatetimeFeature() {
		DatetimeFeatureImpl datetimeFeature = new DatetimeFeatureImpl();
		return datetimeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<IntervalFeatures, String> createIntervalFeature() {
		IntervalFeatureImpl intervalFeature = new IntervalFeatureImpl();
		return intervalFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDB4ORA.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameter createMethodParameter() {
		MethodParameterImpl methodParameter = new MethodParameterImpl();
		return methodParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameter createOperationParameter() {
		OperationParameterImpl operationParameter = new OperationParameterImpl();
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralComponent createStructuralComponent() {
		StructuralComponentImpl structuralComponent = new StructuralComponentImpl();
		return structuralComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Varray createVarray() {
		VarrayImpl varray = new VarrayImpl();
		return varray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredType createStructuredType() {
		StructuredTypeImpl structuredType = new StructuredTypeImpl();
		return structuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedTable createTypedTable() {
		TypedTableImpl typedTable = new TypedTableImpl();
		return typedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredNestedTable createStoredNestedTable() {
		StoredNestedTableImpl storedNestedTable = new StoredNestedTableImpl();
		return storedNestedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey createForeignKey() {
		ForeignKeyImpl foreignKey = new ForeignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey createPrimaryKey() {
		PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unique createUnique() {
		UniqueImpl unique = new UniqueImpl();
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotNull createNotNull() {
		NotNullImpl notNull = new NotNullImpl();
		return notNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Check createCheck() {
		CheckImpl check = new CheckImpl();
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInCharacterType createBuiltInCharacterType() {
		BuiltInCharacterTypeImpl builtInCharacterType = new BuiltInCharacterTypeImpl();
		return builtInCharacterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInNumberType createBuiltInNumberType() {
		BuiltInNumberTypeImpl builtInNumberType = new BuiltInNumberTypeImpl();
		return builtInNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongAndRawType createLongAndRawType() {
		LongAndRawTypeImpl longAndRawType = new LongAndRawTypeImpl();
		return longAndRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeType createDatetimeType() {
		DatetimeTypeImpl datetimeType = new DatetimeTypeImpl();
		return datetimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONDELETEActions createONDELETEActionsFromString(EDataType eDataType, String initialValue) {
		ONDELETEActions result = ONDELETEActions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertONDELETEActionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInCharacterTypes createBuiltInCharacterTypesFromString(EDataType eDataType, String initialValue) {
		BuiltInCharacterTypes result = BuiltInCharacterTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInCharacterTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInCharacterSemantics createBuiltInCharacterSemanticsFromString(EDataType eDataType, String initialValue) {
		BuiltInCharacterSemantics result = BuiltInCharacterSemantics.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInCharacterSemanticsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltNumberTypes createBuiltNumberTypesFromString(EDataType eDataType, String initialValue) {
		BuiltNumberTypes result = BuiltNumberTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltNumberTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInLongAndRawTypes createBuiltInLongAndRawTypesFromString(EDataType eDataType, String initialValue) {
		BuiltInLongAndRawTypes result = BuiltInLongAndRawTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInLongAndRawTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInDatetimeTypes createBuiltInDatetimeTypesFromString(EDataType eDataType, String initialValue) {
		BuiltInDatetimeTypes result = BuiltInDatetimeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInDatetimeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInLOBType createBuiltInLOBTypeFromString(EDataType eDataType, String initialValue) {
		BuiltInLOBType result = BuiltInLOBType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInLOBTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInROWIDType createBuiltInROWIDTypeFromString(EDataType eDataType, String initialValue) {
		BuiltInROWIDType result = BuiltInROWIDType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInROWIDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANSICharacterTypes createANSICharacterTypesFromString(EDataType eDataType, String initialValue) {
		ANSICharacterTypes result = ANSICharacterTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertANSICharacterTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANSINumberTypes createANSINumberTypesFromString(EDataType eDataType, String initialValue) {
		ANSINumberTypes result = ANSINumberTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertANSINumberTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppliedAnyTypes createSuppliedAnyTypesFromString(EDataType eDataType, String initialValue) {
		SuppliedAnyTypes result = SuppliedAnyTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuppliedAnyTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppliedXMLTypes createSuppliedXMLTypesFromString(EDataType eDataType, String initialValue) {
		SuppliedXMLTypes result = SuppliedXMLTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuppliedXMLTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppliedSpacialTypes createSuppliedSpacialTypesFromString(EDataType eDataType, String initialValue) {
		SuppliedSpacialTypes result = SuppliedSpacialTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuppliedSpacialTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppliedMediaTypes createSuppliedMediaTypesFromString(EDataType eDataType, String initialValue) {
		SuppliedMediaTypes result = SuppliedMediaTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuppliedMediaTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterFeatures createCharacterFeaturesFromString(EDataType eDataType, String initialValue) {
		CharacterFeatures result = CharacterFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberFeatures createNumberFeaturesFromString(EDataType eDataType, String initialValue) {
		NumberFeatures result = NumberFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawFeatures createRawFeaturesFromString(EDataType eDataType, String initialValue) {
		RawFeatures result = RawFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRawFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowFeatures createRowFeaturesFromString(EDataType eDataType, String initialValue) {
		RowFeatures result = RowFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeFeatures createDatetimeFeaturesFromString(EDataType eDataType, String initialValue) {
		DatetimeFeatures result = DatetimeFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalFeatures createIntervalFeaturesFromString(EDataType eDataType, String initialValue) {
		IntervalFeatures result = IntervalFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntervalFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMode createParameterModeFromString(EDataType eDataType, String initialValue) {
		ParameterMode result = ParameterMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerActionTime createTriggerActionTimeFromString(EDataType eDataType, String initialValue) {
		TriggerActionTime result = TriggerActionTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerActionTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent createTriggerEventFromString(EDataType eDataType, String initialValue) {
		TriggerEvent result = TriggerEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDB4ORAPackage getORDB4ORAPackage() {
		return (ORDB4ORAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ORDB4ORAPackage getPackage() {
		return ORDB4ORAPackage.eINSTANCE;
	}

} //ORDB4ORAFactoryImpl
