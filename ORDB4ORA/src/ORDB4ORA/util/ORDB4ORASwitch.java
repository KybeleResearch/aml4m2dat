/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.util;

import ORDB4ORA.ANSICharacterType;
import ORDB4ORA.ANSINumberType;
import ORDB4ORA.ANSIType;
import ORDB4ORA.AnyType;
import ORDB4ORA.Attribute;
import ORDB4ORA.BasicDataType;
import ORDB4ORA.BuiltInCharacterType;
import ORDB4ORA.BuiltInNumberType;
import ORDB4ORA.BuiltInType;
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
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.Operation;
import ORDB4ORA.OperationParameter;
import ORDB4ORA.Parameter;
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
import ORDB4ORA.SuppliedType;
import ORDB4ORA.Table;
import ORDB4ORA.Trigger;
import ORDB4ORA.TypedTable;
import ORDB4ORA.Unique;
import ORDB4ORA.Varray;
import ORDB4ORA.View;
import ORDB4ORA.XMLType;
import ORDB4ORA.*;

import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage
 * @generated
 */
public class ORDB4ORASwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ORDB4ORAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDB4ORASwitch() {
		if (modelPackage == null) {
			modelPackage = ORDB4ORAPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ORDB4ORAPackage.ANSI_CHARACTER_TYPE: {
				ANSICharacterType ansiCharacterType = (ANSICharacterType)theEObject;
				T result = caseANSICharacterType(ansiCharacterType);
				if (result == null) result = caseANSIType(ansiCharacterType);
				if (result == null) result = caseBasicDataType(ansiCharacterType);
				if (result == null) result = caseDatatype(ansiCharacterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.ANSI_NUMBER_TYPE: {
				ANSINumberType ansiNumberType = (ANSINumberType)theEObject;
				T result = caseANSINumberType(ansiNumberType);
				if (result == null) result = caseANSIType(ansiNumberType);
				if (result == null) result = caseBasicDataType(ansiNumberType);
				if (result == null) result = caseDatatype(ansiNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.ANSI_TYPE: {
				ANSIType ansiType = (ANSIType)theEObject;
				T result = caseANSIType(ansiType);
				if (result == null) result = caseBasicDataType(ansiType);
				if (result == null) result = caseDatatype(ansiType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.ANY_TYPE: {
				AnyType anyType = (AnyType)theEObject;
				T result = caseAnyType(anyType);
				if (result == null) result = caseSuppliedType(anyType);
				if (result == null) result = caseBasicDataType(anyType);
				if (result == null) result = caseDatatype(anyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseStructuralComponent(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.BASIC_DATA_TYPE: {
				BasicDataType basicDataType = (BasicDataType)theEObject;
				T result = caseBasicDataType(basicDataType);
				if (result == null) result = caseDatatype(basicDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.BUILT_IN_CHARACTER_TYPE: {
				BuiltInCharacterType builtInCharacterType = (BuiltInCharacterType)theEObject;
				T result = caseBuiltInCharacterType(builtInCharacterType);
				if (result == null) result = caseBuiltInType(builtInCharacterType);
				if (result == null) result = caseBasicDataType(builtInCharacterType);
				if (result == null) result = caseDatatype(builtInCharacterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.BUILT_IN_NUMBER_TYPE: {
				BuiltInNumberType builtInNumberType = (BuiltInNumberType)theEObject;
				T result = caseBuiltInNumberType(builtInNumberType);
				if (result == null) result = caseBuiltInType(builtInNumberType);
				if (result == null) result = caseBasicDataType(builtInNumberType);
				if (result == null) result = caseDatatype(builtInNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.BUILT_IN_TYPE: {
				BuiltInType builtInType = (BuiltInType)theEObject;
				T result = caseBuiltInType(builtInType);
				if (result == null) result = caseBasicDataType(builtInType);
				if (result == null) result = caseDatatype(builtInType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.CHARACTER_FEATURE: {
				@SuppressWarnings("unchecked") Map.Entry<CharacterFeatures, String> characterFeature = (Map.Entry<CharacterFeatures, String>)theEObject;
				T result = caseCharacterFeature(characterFeature);
				if (result == null) result = caseFeature((Feature)characterFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = caseRestriction(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseStructuralComponent(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.DATETIME_FEATURE: {
				@SuppressWarnings("unchecked") Map.Entry<DatetimeFeatures, String> datetimeFeature = (Map.Entry<DatetimeFeatures, String>)theEObject;
				T result = caseDatetimeFeature(datetimeFeature);
				if (result == null) result = caseFeature((Feature)datetimeFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.DATETIME_TYPE: {
				DatetimeType datetimeType = (DatetimeType)theEObject;
				T result = caseDatetimeType(datetimeType);
				if (result == null) result = caseBuiltInType(datetimeType);
				if (result == null) result = caseBasicDataType(datetimeType);
				if (result == null) result = caseDatatype(datetimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.FOREIGN_KEY: {
				ForeignKey foreignKey = (ForeignKey)theEObject;
				T result = caseForeignKey(foreignKey);
				if (result == null) result = caseRestriction(foreignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseOperation(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.INTERVAL_FEATURE: {
				@SuppressWarnings("unchecked") Map.Entry<IntervalFeatures, String> intervalFeature = (Map.Entry<IntervalFeatures, String>)theEObject;
				T result = caseIntervalFeature(intervalFeature);
				if (result == null) result = caseFeature((Feature)intervalFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.LOB_TYPE: {
				LOBType lobType = (LOBType)theEObject;
				T result = caseLOBType(lobType);
				if (result == null) result = caseBuiltInType(lobType);
				if (result == null) result = caseBasicDataType(lobType);
				if (result == null) result = caseDatatype(lobType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.LONG_AND_RAW_TYPE: {
				LongAndRawType longAndRawType = (LongAndRawType)theEObject;
				T result = caseLongAndRawType(longAndRawType);
				if (result == null) result = caseBuiltInType(longAndRawType);
				if (result == null) result = caseBasicDataType(longAndRawType);
				if (result == null) result = caseDatatype(longAndRawType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.MEDIA_TYPE: {
				MediaType mediaType = (MediaType)theEObject;
				T result = caseMediaType(mediaType);
				if (result == null) result = caseSuppliedType(mediaType);
				if (result == null) result = caseBasicDataType(mediaType);
				if (result == null) result = caseDatatype(mediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.METHOD_PARAMETER: {
				MethodParameter methodParameter = (MethodParameter)theEObject;
				T result = caseMethodParameter(methodParameter);
				if (result == null) result = caseParameter(methodParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.NESTED_TABLE_TYPE: {
				NestedTableType nestedTableType = (NestedTableType)theEObject;
				T result = caseNestedTableType(nestedTableType);
				if (result == null) result = caseDatatype(nestedTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.NOT_NULL: {
				NotNull notNull = (NotNull)theEObject;
				T result = caseNotNull(notNull);
				if (result == null) result = caseRestriction(notNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.NUMBER_FEATURE: {
				@SuppressWarnings("unchecked") Map.Entry<NumberFeatures, String> numberFeature = (Map.Entry<NumberFeatures, String>)theEObject;
				T result = caseNumberFeature(numberFeature);
				if (result == null) result = caseFeature((Feature)numberFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.OPERATION_PARAMETER: {
				OperationParameter operationParameter = (OperationParameter)theEObject;
				T result = caseOperationParameter(operationParameter);
				if (result == null) result = caseParameter(operationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.PACKAGE: {
				ORDB4ORA.Package package_ = (ORDB4ORA.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.PRIMARY_KEY: {
				PrimaryKey primaryKey = (PrimaryKey)theEObject;
				T result = casePrimaryKey(primaryKey);
				if (result == null) result = caseRestriction(primaryKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseOperation(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.ROWID_TYPE: {
				ROWIDType rowidType = (ROWIDType)theEObject;
				T result = caseROWIDType(rowidType);
				if (result == null) result = caseBuiltInType(rowidType);
				if (result == null) result = caseBasicDataType(rowidType);
				if (result == null) result = caseDatatype(rowidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.RAW_FEATURE: {
				@SuppressWarnings("unchecked") Map.Entry<RawFeatures, String> rawFeature = (Map.Entry<RawFeatures, String>)theEObject;
				T result = caseRawFeature(rawFeature);
				if (result == null) result = caseFeature((Feature)rawFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = caseDatatype(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.RESTRICTION: {
				Restriction restriction = (Restriction)theEObject;
				T result = caseRestriction(restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.ROW_FEATURE: {
				@SuppressWarnings("unchecked") Map.Entry<RowFeatures, String> rowFeature = (Map.Entry<RowFeatures, String>)theEObject;
				T result = caseRowFeature(rowFeature);
				if (result == null) result = caseFeature((Feature)rowFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.SPACIAL_TYPE: {
				SpacialType spacialType = (SpacialType)theEObject;
				T result = caseSpacialType(spacialType);
				if (result == null) result = caseSuppliedType(spacialType);
				if (result == null) result = caseBasicDataType(spacialType);
				if (result == null) result = caseDatatype(spacialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.STORED_NESTED_TABLE: {
				StoredNestedTable storedNestedTable = (StoredNestedTable)theEObject;
				T result = caseStoredNestedTable(storedNestedTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.STRUCTURAL_COMPONENT: {
				StructuralComponent structuralComponent = (StructuralComponent)theEObject;
				T result = caseStructuralComponent(structuralComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.STRUCTURED_TYPE: {
				StructuredType structuredType = (StructuredType)theEObject;
				T result = caseStructuredType(structuredType);
				if (result == null) result = caseDatatype(structuredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.SUPPLIED_TYPE: {
				SuppliedType suppliedType = (SuppliedType)theEObject;
				T result = caseSuppliedType(suppliedType);
				if (result == null) result = caseBasicDataType(suppliedType);
				if (result == null) result = caseDatatype(suppliedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.TYPED_TABLE: {
				TypedTable typedTable = (TypedTable)theEObject;
				T result = caseTypedTable(typedTable);
				if (result == null) result = caseTable(typedTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.UNIQUE: {
				Unique unique = (Unique)theEObject;
				T result = caseUnique(unique);
				if (result == null) result = caseRestriction(unique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.VARRAY: {
				Varray varray = (Varray)theEObject;
				T result = caseVarray(varray);
				if (result == null) result = caseDatatype(varray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.XML_TYPE: {
				XMLType xmlType = (XMLType)theEObject;
				T result = caseXMLType(xmlType);
				if (result == null) result = caseSuppliedType(xmlType);
				if (result == null) result = caseBasicDataType(xmlType);
				if (result == null) result = caseDatatype(xmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.DERIVED_TABLE: {
				DerivedTable derivedTable = (DerivedTable)theEObject;
				T result = caseDerivedTable(derivedTable);
				if (result == null) result = caseTable(derivedTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ORDB4ORAPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseDerivedTable(view);
				if (result == null) result = caseTable(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestriction(Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedTableType(NestedTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicDataType(BasicDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LOB Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LOB Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLOBType(LOBType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROWID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROWID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROWIDType(ROWIDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANSI Character Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANSI Character Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANSICharacterType(ANSICharacterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANSI Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANSI Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANSINumberType(ANSINumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyType(AnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLType(XMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedTable(DerivedTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacial Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacial Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacialType(SpacialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaType(MediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterFeature(Map.Entry<CharacterFeatures, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberFeature(Map.Entry<NumberFeatures, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawFeature(Map.Entry<RawFeatures, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowFeature(Map.Entry<RowFeatures, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datetime Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datetime Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatetimeFeature(Map.Entry<DatetimeFeatures, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalFeature(Map.Entry<IntervalFeatures, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(ORDB4ORA.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameter(MethodParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameter(OperationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralComponent(StructuralComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarray(Varray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredType(StructuredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedTable(TypedTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored Nested Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored Nested Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredNestedTable(StoredNestedTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKey(ForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKey(PrimaryKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnique(Unique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotNull(NotNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInType(BuiltInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANSI Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANSI Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANSIType(ANSIType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplied Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplied Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuppliedType(SuppliedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Character Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Character Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInCharacterType(BuiltInCharacterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInNumberType(BuiltInNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long And Raw Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long And Raw Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongAndRawType(LongAndRawType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datetime Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datetime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatetimeType(DatetimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ORDB4ORASwitch
