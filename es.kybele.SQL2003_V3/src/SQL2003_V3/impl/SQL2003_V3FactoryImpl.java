/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3.impl;

import SQL2003_V3.*;

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
public class SQL2003_V3FactoryImpl extends EFactoryImpl implements SQL2003_V3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SQL2003_V3Factory init() {
		try {
			SQL2003_V3Factory theSQL2003_V3Factory = (SQL2003_V3Factory)EPackage.Registry.INSTANCE.getEFactory("http://SQL2003_V3.ecore"); 
			if (theSQL2003_V3Factory != null) {
				return theSQL2003_V3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SQL2003_V3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQL2003_V3FactoryImpl() {
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
			case SQL2003_V3Package.ARRAY: return createARRAY();
			case SQL2003_V3Package.ATTRIBUTE: return createAttribute();
			case SQL2003_V3Package.BASE_TABLE: return createBaseTable();
			case SQL2003_V3Package.BINARY_STRING_TYPE: return createBinaryStringType();
			case SQL2003_V3Package.BOOLEAN_TYPE: return createBooleanType();
			case SQL2003_V3Package.CHARACTER_STRING_TYPE: return createCharacterStringType();
			case SQL2003_V3Package.COLUMN: return createColumn();
			case SQL2003_V3Package.DATETIME_FEATURE: return (EObject)createDatetimeFeature();
			case SQL2003_V3Package.DATETIME_TYPE: return createDatetimeType();
			case SQL2003_V3Package.DERIVED_TABLE: return createDerivedTable();
			case SQL2003_V3Package.DISTINCT_TYPE: return createDistinctType();
			case SQL2003_V3Package.DOMAIN: return createDomain();
			case SQL2003_V3Package.DOMAIN_CONSTRAINT: return createDomainConstraint();
			case SQL2003_V3Package.FIELD: return createField();
			case SQL2003_V3Package.FUNCTION: return createFunction();
			case SQL2003_V3Package.INTERVAL_FEATURE: return (EObject)createIntervalFeature();
			case SQL2003_V3Package.INTERVAL_TYPE: return createIntervalType();
			case SQL2003_V3Package.MULTISET: return createMULTISET();
			case SQL2003_V3Package.METHOD: return createMethod();
			case SQL2003_V3Package.METHOD_PARAMETER: return createMethodParameter();
			case SQL2003_V3Package.NOT_NULL: return createNotNull();
			case SQL2003_V3Package.NUMERIC_FEATURE: return (EObject)createNumericFeature();
			case SQL2003_V3Package.NUMERIC_TYPE: return createNumericType();
			case SQL2003_V3Package.PARAMETER_WITH_MODE: return createParameterWithMode();
			case SQL2003_V3Package.PRIMARY_KEY: return createPrimaryKey();
			case SQL2003_V3Package.PROCEDURE: return createProcedure();
			case SQL2003_V3Package.ROW: return createROW();
			case SQL2003_V3Package.REFERENCE_TYPE: return createReferenceType();
			case SQL2003_V3Package.REFERENTIAL_CONSTRAINT: return createReferentialConstraint();
			case SQL2003_V3Package.SCHEMA: return createSchema();
			case SQL2003_V3Package.STRING_FEATURE: return (EObject)createStringFeature();
			case SQL2003_V3Package.STRUCTURED_TYPE: return createStructuredType();
			case SQL2003_V3Package.TABLE_CHECK_CONSTRAINT: return createTableCheckConstraint();
			case SQL2003_V3Package.TRIGGER: return createTrigger();
			case SQL2003_V3Package.TRIGGER_DESCRIPTOR: return createTriggerDescriptor();
			case SQL2003_V3Package.TYPED_TABLE: return createTypedTable();
			case SQL2003_V3Package.UNIQUE_CONSTRAINT: return createUniqueConstraint();
			case SQL2003_V3Package.VIEW: return createView();
			case SQL2003_V3Package.XML_TYPE: return createXMLType();
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
			case SQL2003_V3Package.BINARY_STRING_TYPES:
				return createBinaryStringTypesFromString(eDataType, initialValue);
			case SQL2003_V3Package.BOOLEAN_TYPES:
				return createBooleanTypesFromString(eDataType, initialValue);
			case SQL2003_V3Package.CHARACTER_STRING_TYPES:
				return createCharacterStringTypesFromString(eDataType, initialValue);
			case SQL2003_V3Package.DATETIME_FEATURES:
				return createDatetimeFeaturesFromString(eDataType, initialValue);
			case SQL2003_V3Package.DATETIME_TYPES:
				return createDatetimeTypesFromString(eDataType, initialValue);
			case SQL2003_V3Package.INTERVAL_FEATURES:
				return createIntervalFeaturesFromString(eDataType, initialValue);
			case SQL2003_V3Package.INTERVAL_TYPES:
				return createIntervalTypesFromString(eDataType, initialValue);
			case SQL2003_V3Package.MATCH_TYPES:
				return createMatchTypesFromString(eDataType, initialValue);
			case SQL2003_V3Package.MULTIPLIER:
				return createMultiplierFromString(eDataType, initialValue);
			case SQL2003_V3Package.NUMERIC_FEATURES:
				return createNumericFeaturesFromString(eDataType, initialValue);
			case SQL2003_V3Package.NUMERIC_RADIX:
				return createNumericRadixFromString(eDataType, initialValue);
			case SQL2003_V3Package.NUMERIC_TYPES:
				return createNumericTypesFromString(eDataType, initialValue);
			case SQL2003_V3Package.PARAMETER_MODE:
				return createParameterModeFromString(eDataType, initialValue);
			case SQL2003_V3Package.REFERENTIAL_ACTION:
				return createReferentialActionFromString(eDataType, initialValue);
			case SQL2003_V3Package.STRING_FEATURES:
				return createStringFeaturesFromString(eDataType, initialValue);
			case SQL2003_V3Package.TRIGGER_ACTION_TIME:
				return createTriggerActionTimeFromString(eDataType, initialValue);
			case SQL2003_V3Package.TRIGGER_EVENT:
				return createTriggerEventFromString(eDataType, initialValue);
			case SQL2003_V3Package.TRIGGER_LEVEL:
				return createTriggerLevelFromString(eDataType, initialValue);
			case SQL2003_V3Package.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case SQL2003_V3Package.XML_TYPES:
				return createXMLTypesFromString(eDataType, initialValue);
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
			case SQL2003_V3Package.BINARY_STRING_TYPES:
				return convertBinaryStringTypesToString(eDataType, instanceValue);
			case SQL2003_V3Package.BOOLEAN_TYPES:
				return convertBooleanTypesToString(eDataType, instanceValue);
			case SQL2003_V3Package.CHARACTER_STRING_TYPES:
				return convertCharacterStringTypesToString(eDataType, instanceValue);
			case SQL2003_V3Package.DATETIME_FEATURES:
				return convertDatetimeFeaturesToString(eDataType, instanceValue);
			case SQL2003_V3Package.DATETIME_TYPES:
				return convertDatetimeTypesToString(eDataType, instanceValue);
			case SQL2003_V3Package.INTERVAL_FEATURES:
				return convertIntervalFeaturesToString(eDataType, instanceValue);
			case SQL2003_V3Package.INTERVAL_TYPES:
				return convertIntervalTypesToString(eDataType, instanceValue);
			case SQL2003_V3Package.MATCH_TYPES:
				return convertMatchTypesToString(eDataType, instanceValue);
			case SQL2003_V3Package.MULTIPLIER:
				return convertMultiplierToString(eDataType, instanceValue);
			case SQL2003_V3Package.NUMERIC_FEATURES:
				return convertNumericFeaturesToString(eDataType, instanceValue);
			case SQL2003_V3Package.NUMERIC_RADIX:
				return convertNumericRadixToString(eDataType, instanceValue);
			case SQL2003_V3Package.NUMERIC_TYPES:
				return convertNumericTypesToString(eDataType, instanceValue);
			case SQL2003_V3Package.PARAMETER_MODE:
				return convertParameterModeToString(eDataType, instanceValue);
			case SQL2003_V3Package.REFERENTIAL_ACTION:
				return convertReferentialActionToString(eDataType, instanceValue);
			case SQL2003_V3Package.STRING_FEATURES:
				return convertStringFeaturesToString(eDataType, instanceValue);
			case SQL2003_V3Package.TRIGGER_ACTION_TIME:
				return convertTriggerActionTimeToString(eDataType, instanceValue);
			case SQL2003_V3Package.TRIGGER_EVENT:
				return convertTriggerEventToString(eDataType, instanceValue);
			case SQL2003_V3Package.TRIGGER_LEVEL:
				return convertTriggerLevelToString(eDataType, instanceValue);
			case SQL2003_V3Package.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case SQL2003_V3Package.XML_TYPES:
				return convertXMLTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAY createARRAY() {
		ARRAYImpl array = new ARRAYImpl();
		return array;
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
	public BaseTable createBaseTable() {
		BaseTableImpl baseTable = new BaseTableImpl();
		return baseTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryStringType createBinaryStringType() {
		BinaryStringTypeImpl binaryStringType = new BinaryStringTypeImpl();
		return binaryStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStringType createCharacterStringType() {
		CharacterStringTypeImpl characterStringType = new CharacterStringTypeImpl();
		return characterStringType;
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
	public Map.Entry<DatetimeFeatures, String> createDatetimeFeature() {
		DatetimeFeatureImpl datetimeFeature = new DatetimeFeatureImpl();
		return datetimeFeature;
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
	public DerivedTable createDerivedTable() {
		DerivedTableImpl derivedTable = new DerivedTableImpl();
		return derivedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistinctType createDistinctType() {
		DistinctTypeImpl distinctType = new DistinctTypeImpl();
		return distinctType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
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
	public Map.Entry<IntervalFeatures, String> createIntervalFeature() {
		IntervalFeatureImpl intervalFeature = new IntervalFeatureImpl();
		return intervalFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalType createIntervalType() {
		IntervalTypeImpl intervalType = new IntervalTypeImpl();
		return intervalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MULTISET createMULTISET() {
		MULTISETImpl multiset = new MULTISETImpl();
		return multiset;
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
	public MethodParameter createMethodParameter() {
		MethodParameterImpl methodParameter = new MethodParameterImpl();
		return methodParameter;
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
	public Map.Entry<NumericFeatures, String> createNumericFeature() {
		NumericFeatureImpl numericFeature = new NumericFeatureImpl();
		return numericFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType createNumericType() {
		NumericTypeImpl numericType = new NumericTypeImpl();
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterWithMode createParameterWithMode() {
		ParameterWithModeImpl parameterWithMode = new ParameterWithModeImpl();
		return parameterWithMode;
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
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROW createROW() {
		ROWImpl row = new ROWImpl();
		return row;
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
	public ReferentialConstraint createReferentialConstraint() {
		ReferentialConstraintImpl referentialConstraint = new ReferentialConstraintImpl();
		return referentialConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<StringFeatures, String> createStringFeature() {
		StringFeatureImpl stringFeature = new StringFeatureImpl();
		return stringFeature;
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
	public TableCheckConstraint createTableCheckConstraint() {
		TableCheckConstraintImpl tableCheckConstraint = new TableCheckConstraintImpl();
		return tableCheckConstraint;
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
	public TriggerDescriptor createTriggerDescriptor() {
		TriggerDescriptorImpl triggerDescriptor = new TriggerDescriptorImpl();
		return triggerDescriptor;
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
	public UniqueConstraint createUniqueConstraint() {
		UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
		return uniqueConstraint;
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
	public XMLType createXMLType() {
		XMLTypeImpl xmlType = new XMLTypeImpl();
		return xmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainConstraint createDomainConstraint() {
		DomainConstraintImpl domainConstraint = new DomainConstraintImpl();
		return domainConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryStringTypes createBinaryStringTypesFromString(EDataType eDataType, String initialValue) {
		BinaryStringTypes result = BinaryStringTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryStringTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTypes createBooleanTypesFromString(EDataType eDataType, String initialValue) {
		BooleanTypes result = BooleanTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStringTypes createCharacterStringTypesFromString(EDataType eDataType, String initialValue) {
		CharacterStringTypes result = CharacterStringTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterStringTypesToString(EDataType eDataType, Object instanceValue) {
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
	public DatetimeTypes createDatetimeTypesFromString(EDataType eDataType, String initialValue) {
		DatetimeTypes result = DatetimeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeTypesToString(EDataType eDataType, Object instanceValue) {
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
	public IntervalTypes createIntervalTypesFromString(EDataType eDataType, String initialValue) {
		IntervalTypes result = IntervalTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntervalTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchTypes createMatchTypesFromString(EDataType eDataType, String initialValue) {
		MatchTypes result = MatchTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplier createMultiplierFromString(EDataType eDataType, String initialValue) {
		Multiplier result = Multiplier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericRadix createNumericRadixFromString(EDataType eDataType, String initialValue) {
		NumericRadix result = NumericRadix.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericRadixToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericFeatures createNumericFeaturesFromString(EDataType eDataType, String initialValue) {
		NumericFeatures result = NumericFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericTypes createNumericTypesFromString(EDataType eDataType, String initialValue) {
		NumericTypes result = NumericTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericTypesToString(EDataType eDataType, Object instanceValue) {
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
	public ReferentialAction createReferentialActionFromString(EDataType eDataType, String initialValue) {
		ReferentialAction result = ReferentialAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferentialActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringFeatures createStringFeaturesFromString(EDataType eDataType, String initialValue) {
		StringFeatures result = StringFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringFeaturesToString(EDataType eDataType, Object instanceValue) {
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
	public TriggerLevel createTriggerLevelFromString(EDataType eDataType, String initialValue) {
		TriggerLevel result = TriggerLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue) {
		Unit result = Unit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTypes createXMLTypesFromString(EDataType eDataType, String initialValue) {
		XMLTypes result = XMLTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXMLTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQL2003_V3Package getSQL2003_V3Package() {
		return (SQL2003_V3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SQL2003_V3Package getPackage() {
		return SQL2003_V3Package.eINSTANCE;
	}

} //SQL2003_V3FactoryImpl
