/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.util;

import ORDB4ORA.ANSICharacterType;
import ORDB4ORA.ANSICharacterTypes;
import ORDB4ORA.ANSINumberType;
import ORDB4ORA.ANSINumberTypes;
import ORDB4ORA.ANSIType;
import ORDB4ORA.AnyType;
import ORDB4ORA.Attribute;
import ORDB4ORA.BasicDataType;
import ORDB4ORA.BuiltInCharacterSemantics;
import ORDB4ORA.BuiltInCharacterType;
import ORDB4ORA.BuiltInCharacterTypes;
import ORDB4ORA.BuiltInDatetimeTypes;
import ORDB4ORA.BuiltInLOBType;
import ORDB4ORA.BuiltInLongAndRawTypes;
import ORDB4ORA.BuiltInNumberType;
import ORDB4ORA.BuiltInROWIDType;
import ORDB4ORA.BuiltInType;
import ORDB4ORA.BuiltNumberTypes;
import ORDB4ORA.CharacterFeatures;
import ORDB4ORA.Check;
import ORDB4ORA.Column;
import ORDB4ORA.Datatype;
import ORDB4ORA.DatetimeFeatures;
import ORDB4ORA.DatetimeType;
import ORDB4ORA.DerivedTable;
import ORDB4ORA.Feature;
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
import ORDB4ORA.Restriction;
import ORDB4ORA.RowFeatures;
import ORDB4ORA.SpacialType;
import ORDB4ORA.StoredNestedTable;
import ORDB4ORA.StructuralComponent;
import ORDB4ORA.StructuredType;
import ORDB4ORA.SuppliedAnyTypes;
import ORDB4ORA.SuppliedMediaTypes;
import ORDB4ORA.SuppliedSpacialTypes;
import ORDB4ORA.SuppliedType;
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

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage
 * @generated
 */
public class ORDB4ORAValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ORDB4ORAValidator INSTANCE = new ORDB4ORAValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ORDB4ORA";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Restriction' of 'Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE__RESTRICTION = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/ocl/examples/OCL";


	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDB4ORAValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ORDB4ORAPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ORDB4ORAPackage.ANSI_CHARACTER_TYPE:
				return validateANSICharacterType((ANSICharacterType)value, diagnostics, context);
			case ORDB4ORAPackage.ANSI_NUMBER_TYPE:
				return validateANSINumberType((ANSINumberType)value, diagnostics, context);
			case ORDB4ORAPackage.ANSI_TYPE:
				return validateANSIType((ANSIType)value, diagnostics, context);
			case ORDB4ORAPackage.ANY_TYPE:
				return validateAnyType((AnyType)value, diagnostics, context);
			case ORDB4ORAPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case ORDB4ORAPackage.BASIC_DATA_TYPE:
				return validateBasicDataType((BasicDataType)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE:
				return validateBuiltInCharacterType((BuiltInCharacterType)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE:
				return validateBuiltInNumberType((BuiltInNumberType)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_TYPE:
				return validateBuiltInType((BuiltInType)value, diagnostics, context);
			case ORDB4ORAPackage.CHARACTER_FEATURE:
				return validateCharacterFeature((Map.Entry<?, ?>)value, diagnostics, context);
			case ORDB4ORAPackage.CHECK:
				return validateCheck((Check)value, diagnostics, context);
			case ORDB4ORAPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case ORDB4ORAPackage.DATATYPE:
				return validateDatatype((Datatype)value, diagnostics, context);
			case ORDB4ORAPackage.DATETIME_FEATURE:
				return validateDatetimeFeature((Map.Entry<?, ?>)value, diagnostics, context);
			case ORDB4ORAPackage.DATETIME_TYPE:
				return validateDatetimeType((DatetimeType)value, diagnostics, context);
			case ORDB4ORAPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case ORDB4ORAPackage.FOREIGN_KEY:
				return validateForeignKey((ForeignKey)value, diagnostics, context);
			case ORDB4ORAPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case ORDB4ORAPackage.INTERVAL_FEATURE:
				return validateIntervalFeature((Map.Entry<?, ?>)value, diagnostics, context);
			case ORDB4ORAPackage.LOB_TYPE:
				return validateLOBType((LOBType)value, diagnostics, context);
			case ORDB4ORAPackage.LONG_AND_RAW_TYPE:
				return validateLongAndRawType((LongAndRawType)value, diagnostics, context);
			case ORDB4ORAPackage.MEDIA_TYPE:
				return validateMediaType((MediaType)value, diagnostics, context);
			case ORDB4ORAPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case ORDB4ORAPackage.METHOD_PARAMETER:
				return validateMethodParameter((MethodParameter)value, diagnostics, context);
			case ORDB4ORAPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case ORDB4ORAPackage.NESTED_TABLE_TYPE:
				return validateNestedTableType((NestedTableType)value, diagnostics, context);
			case ORDB4ORAPackage.NOT_NULL:
				return validateNotNull((NotNull)value, diagnostics, context);
			case ORDB4ORAPackage.NUMBER_FEATURE:
				return validateNumberFeature((Map.Entry<?, ?>)value, diagnostics, context);
			case ORDB4ORAPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case ORDB4ORAPackage.OPERATION_PARAMETER:
				return validateOperationParameter((OperationParameter)value, diagnostics, context);
			case ORDB4ORAPackage.PACKAGE:
				return validatePackage((ORDB4ORA.Package)value, diagnostics, context);
			case ORDB4ORAPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ORDB4ORAPackage.PRIMARY_KEY:
				return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
			case ORDB4ORAPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case ORDB4ORAPackage.ROWID_TYPE:
				return validateROWIDType((ROWIDType)value, diagnostics, context);
			case ORDB4ORAPackage.RAW_FEATURE:
				return validateRawFeature((Map.Entry<?, ?>)value, diagnostics, context);
			case ORDB4ORAPackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case ORDB4ORAPackage.RESTRICTION:
				return validateRestriction((Restriction)value, diagnostics, context);
			case ORDB4ORAPackage.ROW_FEATURE:
				return validateRowFeature((Map.Entry<?, ?>)value, diagnostics, context);
			case ORDB4ORAPackage.SPACIAL_TYPE:
				return validateSpacialType((SpacialType)value, diagnostics, context);
			case ORDB4ORAPackage.STORED_NESTED_TABLE:
				return validateStoredNestedTable((StoredNestedTable)value, diagnostics, context);
			case ORDB4ORAPackage.STRUCTURAL_COMPONENT:
				return validateStructuralComponent((StructuralComponent)value, diagnostics, context);
			case ORDB4ORAPackage.STRUCTURED_TYPE:
				return validateStructuredType((StructuredType)value, diagnostics, context);
			case ORDB4ORAPackage.SUPPLIED_TYPE:
				return validateSuppliedType((SuppliedType)value, diagnostics, context);
			case ORDB4ORAPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case ORDB4ORAPackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case ORDB4ORAPackage.TYPED_TABLE:
				return validateTypedTable((TypedTable)value, diagnostics, context);
			case ORDB4ORAPackage.UNIQUE:
				return validateUnique((Unique)value, diagnostics, context);
			case ORDB4ORAPackage.VARRAY:
				return validateVarray((Varray)value, diagnostics, context);
			case ORDB4ORAPackage.XML_TYPE:
				return validateXMLType((XMLType)value, diagnostics, context);
			case ORDB4ORAPackage.DERIVED_TABLE:
				return validateDerivedTable((DerivedTable)value, diagnostics, context);
			case ORDB4ORAPackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case ORDB4ORAPackage.ANSI_CHARACTER_TYPES:
				return validateANSICharacterTypes((ANSICharacterTypes)value, diagnostics, context);
			case ORDB4ORAPackage.ANSI_NUMBER_TYPES:
				return validateANSINumberTypes((ANSINumberTypes)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_SEMANTICS:
				return validateBuiltInCharacterSemantics((BuiltInCharacterSemantics)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPES:
				return validateBuiltInCharacterTypes((BuiltInCharacterTypes)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_DATETIME_TYPES:
				return validateBuiltInDatetimeTypes((BuiltInDatetimeTypes)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_LOB_TYPE:
				return validateBuiltInLOBType((BuiltInLOBType)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_LONG_AND_RAW_TYPES:
				return validateBuiltInLongAndRawTypes((BuiltInLongAndRawTypes)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_IN_ROWID_TYPE:
				return validateBuiltInROWIDType((BuiltInROWIDType)value, diagnostics, context);
			case ORDB4ORAPackage.BUILT_NUMBER_TYPES:
				return validateBuiltNumberTypes((BuiltNumberTypes)value, diagnostics, context);
			case ORDB4ORAPackage.CHARACTER_FEATURES:
				return validateCharacterFeatures((CharacterFeatures)value, diagnostics, context);
			case ORDB4ORAPackage.DATETIME_FEATURES:
				return validateDatetimeFeatures((DatetimeFeatures)value, diagnostics, context);
			case ORDB4ORAPackage.INTERVAL_FEATURES:
				return validateIntervalFeatures((IntervalFeatures)value, diagnostics, context);
			case ORDB4ORAPackage.NUMBER_FEATURES:
				return validateNumberFeatures((NumberFeatures)value, diagnostics, context);
			case ORDB4ORAPackage.ONDELETE_ACTIONS:
				return validateONDELETEActions((ONDELETEActions)value, diagnostics, context);
			case ORDB4ORAPackage.PARAMETER_MODE:
				return validateParameterMode((ParameterMode)value, diagnostics, context);
			case ORDB4ORAPackage.RAW_FEATURES:
				return validateRawFeatures((RawFeatures)value, diagnostics, context);
			case ORDB4ORAPackage.ROW_FEATURES:
				return validateRowFeatures((RowFeatures)value, diagnostics, context);
			case ORDB4ORAPackage.SUPPLIED_ANY_TYPES:
				return validateSuppliedAnyTypes((SuppliedAnyTypes)value, diagnostics, context);
			case ORDB4ORAPackage.SUPPLIED_MEDIA_TYPES:
				return validateSuppliedMediaTypes((SuppliedMediaTypes)value, diagnostics, context);
			case ORDB4ORAPackage.SUPPLIED_SPACIAL_TYPES:
				return validateSuppliedSpacialTypes((SuppliedSpacialTypes)value, diagnostics, context);
			case ORDB4ORAPackage.SUPPLIED_XML_TYPES:
				return validateSuppliedXMLTypes((SuppliedXMLTypes)value, diagnostics, context);
			case ORDB4ORAPackage.TRIGGER_ACTION_TIME:
				return validateTriggerActionTime((TriggerActionTime)value, diagnostics, context);
			case ORDB4ORAPackage.TRIGGER_EVENT:
				return validateTriggerEvent((TriggerEvent)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatype(Datatype datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestriction(Restriction restriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestedTableType(NestedTableType nestedTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nestedTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicDataType(BasicDataType basicDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOBType(LOBType lobType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lobType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateROWIDType(ROWIDType rowidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rowidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANSICharacterType(ANSICharacterType ansiCharacterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ansiCharacterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANSINumberType(ANSINumberType ansiNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ansiNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyType(AnyType anyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXMLType(XMLType xmlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedTable(DerivedTable derivedTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(view, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpacialType(SpacialType spacialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spacialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaType(MediaType mediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mediaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterFeature(Map.Entry<?, ?> characterFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)characterFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberFeature(Map.Entry<?, ?> numberFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)numberFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawFeature(Map.Entry<?, ?> rawFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)rawFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowFeature(Map.Entry<?, ?> rowFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)rowFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatetimeFeature(Map.Entry<?, ?> datetimeFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)datetimeFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntervalFeature(Map.Entry<?, ?> intervalFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)intervalFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(ORDB4ORA.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(package_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodParameter(MethodParameter methodParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameter(OperationParameter operationParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(function, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralComponent(StructuralComponent structuralComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarray(Varray varray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varray, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredType(StructuredType structuredType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(method, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedTable(TypedTable typedTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredNestedTable(StoredNestedTable storedNestedTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storedNestedTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreignKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaryKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnique(Unique unique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unique, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotNull(NotNull notNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notNull, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheck(Check check, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(check, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInType(BuiltInType builtInType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builtInType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANSIType(ANSIType ansiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ansiType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuppliedType(SuppliedType suppliedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(suppliedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInCharacterType(BuiltInCharacterType builtInCharacterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builtInCharacterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInNumberType(BuiltInNumberType builtInNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builtInNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongAndRawType(LongAndRawType longAndRawType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longAndRawType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatetimeType(DatetimeType datetimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datetimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateONDELETEActions(ONDELETEActions ondeleteActions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInCharacterTypes(BuiltInCharacterTypes builtInCharacterTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInCharacterSemantics(BuiltInCharacterSemantics builtInCharacterSemantics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltNumberTypes(BuiltNumberTypes builtNumberTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInLongAndRawTypes(BuiltInLongAndRawTypes builtInLongAndRawTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInDatetimeTypes(BuiltInDatetimeTypes builtInDatetimeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInLOBType(BuiltInLOBType builtInLOBType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInROWIDType(BuiltInROWIDType builtInROWIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANSICharacterTypes(ANSICharacterTypes ansiCharacterTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANSINumberTypes(ANSINumberTypes ansiNumberTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuppliedAnyTypes(SuppliedAnyTypes suppliedAnyTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuppliedXMLTypes(SuppliedXMLTypes suppliedXMLTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuppliedSpacialTypes(SuppliedSpacialTypes suppliedSpacialTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuppliedMediaTypes(SuppliedMediaTypes suppliedMediaTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterFeatures(CharacterFeatures characterFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberFeatures(NumberFeatures numberFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawFeatures(RawFeatures rawFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowFeatures(RowFeatures rowFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatetimeFeatures(DatetimeFeatures datetimeFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntervalFeatures(IntervalFeatures intervalFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMode(ParameterMode parameterMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerActionTime(TriggerActionTime triggerActionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEvent(TriggerEvent triggerEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ORDB4ORAValidator
