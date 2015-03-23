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
import ORDB4ORA.BasicLOBType;
import ORDB4ORA.BasicTypes;
import ORDB4ORA.Check;
import ORDB4ORA.Column;
import ORDB4ORA.Configuration;
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
import ORDB4ORA.PrimitiveType;
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
import ORDB4ORA.Tables;
import ORDB4ORA.TypedTable;
import ORDB4ORA.Unique;
import ORDB4ORA.Varray;

import ORDB4ORA.View;
import ORDB4ORA.XMLType;
import ORDB4ORA.util.ORDB4ORAValidator;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ORDB4ORAPackageImpl extends EPackageImpl implements ORDB4ORAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lobTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ansiCharacterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ansiNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storedNestedTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ansiTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suppliedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInCharacterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longAndRawTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ondeleteActionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInCharacterTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInCharacterSemanticsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtNumberTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInLongAndRawTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInDatetimeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInLOBTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInROWIDTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ansiCharacterTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ansiNumberTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum suppliedAnyTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum suppliedXMLTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum suppliedSpacialTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum suppliedMediaTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum characterFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rawFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rowFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datetimeFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intervalFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerActionTimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerEventEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ORDB4ORA.ORDB4ORAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ORDB4ORAPackageImpl() {
		super(eNS_URI, ORDB4ORAFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ORDB4ORAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ORDB4ORAPackage init() {
		if (isInited) return (ORDB4ORAPackage)EPackage.Registry.INSTANCE.getEPackage(ORDB4ORAPackage.eNS_URI);

		// Obtain or create and register package
		ORDB4ORAPackageImpl theORDB4ORAPackage = (ORDB4ORAPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ORDB4ORAPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ORDB4ORAPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theORDB4ORAPackage.createPackageContents();

		// Initialize created meta-data
		theORDB4ORAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theORDB4ORAPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ORDB4ORAPackage.eNS_URI, theORDB4ORAPackage);
		return theORDB4ORAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Datatype() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Table() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Operation() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Package() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_Model() {
		return (EReference)datatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestriction_Table() {
		return (EReference)restrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestriction_Attributes() {
		return (EReference)restrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Structured() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Default() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedTableType() {
		return nestedTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedTableType_Name() {
		return (EAttribute)nestedTableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedTableType_Type() {
		return (EReference)nestedTableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicDataType() {
		return basicDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLOBType() {
		return lobTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLOBType_Descriptor() {
		return (EAttribute)lobTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROWIDType() {
		return rowidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROWIDType_Descriptor() {
		return (EAttribute)rowidTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROWIDType_Size_Min() {
		return (EAttribute)rowidTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROWIDType_Size_Max() {
		return (EAttribute)rowidTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANSICharacterType() {
		return ansiCharacterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANSICharacterType_Descriptor() {
		return (EAttribute)ansiCharacterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANSINumberType() {
		return ansiNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANSINumberType_Descriptor() {
		return (EAttribute)ansiNumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyType() {
		return anyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyType_Descriptor() {
		return (EAttribute)anyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLType() {
		return xmlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLType_Descriptor() {
		return (EAttribute)xmlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedTable() {
		return derivedTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedTable_Query_expression() {
		return (EAttribute)derivedTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Tables() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Components() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacialType() {
		return spacialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacialType_Descriptor() {
		return (EAttribute)spacialTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaType() {
		return mediaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaType_Descriptor() {
		return (EAttribute)mediaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterFeature() {
		return characterFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterFeature_Key() {
		return (EAttribute)characterFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterFeature_Value() {
		return (EAttribute)characterFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberFeature() {
		return numberFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFeature_Key() {
		return (EAttribute)numberFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFeature_Value() {
		return (EAttribute)numberFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawFeature() {
		return rawFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRawFeature_Key() {
		return (EAttribute)rawFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRawFeature_Value() {
		return (EAttribute)rawFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowFeature() {
		return rowFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowFeature_Key() {
		return (EAttribute)rowFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowFeature_Value() {
		return (EAttribute)rowFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatetimeFeature() {
		return datetimeFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeFeature_Key() {
		return (EAttribute)datetimeFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeFeature_Value() {
		return (EAttribute)datetimeFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalFeature() {
		return intervalFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalFeature_Key() {
		return (EAttribute)intervalFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalFeature_Value() {
		return (EAttribute)intervalFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Table() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Name() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Operations() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Model() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Body() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OperationParameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Model() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Package() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParameter() {
		return methodParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodParameter_Method() {
		return (EReference)methodParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationParameter() {
		return operationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameter_Mode() {
		return (EAttribute)operationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationParameter_Operation() {
		return (EReference)operationParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Return() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Name() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Body() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Event() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Action() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_UpdateColumns() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Table() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralComponent() {
		return structuralComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralComponent_Name() {
		return (EAttribute)structuralComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralComponent_Type() {
		return (EReference)structuralComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralComponent_Features() {
		return (EReference)structuralComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralComponent_Restrictions() {
		return (EReference)structuralComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarray() {
		return varrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarray_Name() {
		return (EAttribute)varrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarray_NumElements() {
		return (EAttribute)varrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarray_Type() {
		return (EReference)varrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredType() {
		return structuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredType_Name() {
		return (EAttribute)structuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Attribute() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Method() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Typed() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Supertype() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredType_Is_instantiable() {
		return (EAttribute)structuredTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredType_Is_final() {
		return (EAttribute)structuredTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Override() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Structured() {
		return (EReference)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_ReturnType() {
		return (EReference)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Body() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parameters() {
		return (EReference)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedTable() {
		return typedTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedTable_StoredNested() {
		return (EReference)typedTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedTable_StructuredType() {
		return (EReference)typedTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoredNestedTable() {
		return storedNestedTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoredNestedTable_Name() {
		return (EAttribute)storedNestedTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoredNestedTable_Attribute() {
		return (EReference)storedNestedTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoredNestedTable_Typed() {
		return (EReference)storedNestedTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Name() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_Type() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Restriction() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Model() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Triggers() {
		return (EReference)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignKey() {
		return foreignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKey_Name() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKey_OnDelete() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_Reference() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKey() {
		return primaryKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryKey_Name() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnique() {
		return uniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnique_Name() {
		return (EAttribute)uniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotNull() {
		return notNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotNull_Name() {
		return (EAttribute)notNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Condition() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Name() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInType() {
		return builtInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANSIType() {
		return ansiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuppliedType() {
		return suppliedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInCharacterType() {
		return builtInCharacterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInCharacterType_Descriptor() {
		return (EAttribute)builtInCharacterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInCharacterType_Semantic() {
		return (EAttribute)builtInCharacterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInCharacterType_Size_Min() {
		return (EAttribute)builtInCharacterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInCharacterType_Size_Max() {
		return (EAttribute)builtInCharacterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInCharacterType_Size_Def() {
		return (EAttribute)builtInCharacterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInNumberType() {
		return builtInNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInNumberType_Descriptor() {
		return (EAttribute)builtInNumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInNumberType_Precision_Mn() {
		return (EAttribute)builtInNumberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInNumberType_Precision_Max() {
		return (EAttribute)builtInNumberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInNumberType_Scale_Min() {
		return (EAttribute)builtInNumberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInNumberType_Scale_Max() {
		return (EAttribute)builtInNumberTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongAndRawType() {
		return longAndRawTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongAndRawType_Descriptor() {
		return (EAttribute)longAndRawTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongAndRawType_Size_Min() {
		return (EAttribute)longAndRawTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongAndRawType_Size_Max() {
		return (EAttribute)longAndRawTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatetimeType() {
		return datetimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_Descriptor() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_SecondPrecision_Min() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_SecondPrecision_Max() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_SecondPrecision_Def() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_DayPrecision_Min() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_DayPrecision_Max() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_DayPrecision_Def() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_YearPrecision_Min() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_YearPrecision_Max() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeType_YearPrecision_Def() {
		return (EAttribute)datetimeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getONDELETEActions() {
		return ondeleteActionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInCharacterTypes() {
		return builtInCharacterTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInCharacterSemantics() {
		return builtInCharacterSemanticsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltNumberTypes() {
		return builtNumberTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInLongAndRawTypes() {
		return builtInLongAndRawTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInDatetimeTypes() {
		return builtInDatetimeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInLOBType() {
		return builtInLOBTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInROWIDType() {
		return builtInROWIDTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getANSICharacterTypes() {
		return ansiCharacterTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getANSINumberTypes() {
		return ansiNumberTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuppliedAnyTypes() {
		return suppliedAnyTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuppliedXMLTypes() {
		return suppliedXMLTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuppliedSpacialTypes() {
		return suppliedSpacialTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuppliedMediaTypes() {
		return suppliedMediaTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCharacterFeatures() {
		return characterFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberFeatures() {
		return numberFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRawFeatures() {
		return rawFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRowFeatures() {
		return rowFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatetimeFeatures() {
		return datetimeFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntervalFeatures() {
		return intervalFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterMode() {
		return parameterModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerActionTime() {
		return triggerActionTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerEvent() {
		return triggerEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDB4ORAFactory getORDB4ORAFactory() {
		return (ORDB4ORAFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ansiCharacterTypeEClass = createEClass(ANSI_CHARACTER_TYPE);
		createEAttribute(ansiCharacterTypeEClass, ANSI_CHARACTER_TYPE__DESCRIPTOR);

		ansiNumberTypeEClass = createEClass(ANSI_NUMBER_TYPE);
		createEAttribute(ansiNumberTypeEClass, ANSI_NUMBER_TYPE__DESCRIPTOR);

		ansiTypeEClass = createEClass(ANSI_TYPE);

		anyTypeEClass = createEClass(ANY_TYPE);
		createEAttribute(anyTypeEClass, ANY_TYPE__DESCRIPTOR);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__STRUCTURED);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT);

		basicDataTypeEClass = createEClass(BASIC_DATA_TYPE);

		builtInCharacterTypeEClass = createEClass(BUILT_IN_CHARACTER_TYPE);
		createEAttribute(builtInCharacterTypeEClass, BUILT_IN_CHARACTER_TYPE__DESCRIPTOR);
		createEAttribute(builtInCharacterTypeEClass, BUILT_IN_CHARACTER_TYPE__SEMANTIC);
		createEAttribute(builtInCharacterTypeEClass, BUILT_IN_CHARACTER_TYPE__SIZE_MIN);
		createEAttribute(builtInCharacterTypeEClass, BUILT_IN_CHARACTER_TYPE__SIZE_MAX);
		createEAttribute(builtInCharacterTypeEClass, BUILT_IN_CHARACTER_TYPE__SIZE_DEF);

		builtInNumberTypeEClass = createEClass(BUILT_IN_NUMBER_TYPE);
		createEAttribute(builtInNumberTypeEClass, BUILT_IN_NUMBER_TYPE__DESCRIPTOR);
		createEAttribute(builtInNumberTypeEClass, BUILT_IN_NUMBER_TYPE__PRECISION_MN);
		createEAttribute(builtInNumberTypeEClass, BUILT_IN_NUMBER_TYPE__PRECISION_MAX);
		createEAttribute(builtInNumberTypeEClass, BUILT_IN_NUMBER_TYPE__SCALE_MIN);
		createEAttribute(builtInNumberTypeEClass, BUILT_IN_NUMBER_TYPE__SCALE_MAX);

		builtInTypeEClass = createEClass(BUILT_IN_TYPE);

		characterFeatureEClass = createEClass(CHARACTER_FEATURE);
		createEAttribute(characterFeatureEClass, CHARACTER_FEATURE__KEY);
		createEAttribute(characterFeatureEClass, CHARACTER_FEATURE__VALUE);

		checkEClass = createEClass(CHECK);
		createEAttribute(checkEClass, CHECK__CONDITION);
		createEAttribute(checkEClass, CHECK__NAME);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__TABLE);

		datatypeEClass = createEClass(DATATYPE);
		createEReference(datatypeEClass, DATATYPE__MODEL);

		datetimeFeatureEClass = createEClass(DATETIME_FEATURE);
		createEAttribute(datetimeFeatureEClass, DATETIME_FEATURE__KEY);
		createEAttribute(datetimeFeatureEClass, DATETIME_FEATURE__VALUE);

		datetimeTypeEClass = createEClass(DATETIME_TYPE);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__DESCRIPTOR);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__SECOND_PRECISION_MIN);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__SECOND_PRECISION_MAX);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__SECOND_PRECISION_DEF);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__DAY_PRECISION_MIN);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__DAY_PRECISION_MAX);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__DAY_PRECISION_DEF);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__YEAR_PRECISION_MIN);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__YEAR_PRECISION_MAX);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__YEAR_PRECISION_DEF);

		featureEClass = createEClass(FEATURE);

		foreignKeyEClass = createEClass(FOREIGN_KEY);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__NAME);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__ON_DELETE);
		createEReference(foreignKeyEClass, FOREIGN_KEY__REFERENCE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RETURN);

		intervalFeatureEClass = createEClass(INTERVAL_FEATURE);
		createEAttribute(intervalFeatureEClass, INTERVAL_FEATURE__KEY);
		createEAttribute(intervalFeatureEClass, INTERVAL_FEATURE__VALUE);

		lobTypeEClass = createEClass(LOB_TYPE);
		createEAttribute(lobTypeEClass, LOB_TYPE__DESCRIPTOR);

		longAndRawTypeEClass = createEClass(LONG_AND_RAW_TYPE);
		createEAttribute(longAndRawTypeEClass, LONG_AND_RAW_TYPE__DESCRIPTOR);
		createEAttribute(longAndRawTypeEClass, LONG_AND_RAW_TYPE__SIZE_MIN);
		createEAttribute(longAndRawTypeEClass, LONG_AND_RAW_TYPE__SIZE_MAX);

		mediaTypeEClass = createEClass(MEDIA_TYPE);
		createEAttribute(mediaTypeEClass, MEDIA_TYPE__DESCRIPTOR);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);
		createEReference(methodEClass, METHOD__OVERRIDE);
		createEReference(methodEClass, METHOD__STRUCTURED);
		createEReference(methodEClass, METHOD__PARAMETERS);
		createEReference(methodEClass, METHOD__RETURN_TYPE);
		createEAttribute(methodEClass, METHOD__BODY);

		methodParameterEClass = createEClass(METHOD_PARAMETER);
		createEReference(methodParameterEClass, METHOD_PARAMETER__METHOD);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__DATATYPE);
		createEReference(modelEClass, MODEL__TABLE);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__OPERATION);
		createEReference(modelEClass, MODEL__PACKAGE);

		nestedTableTypeEClass = createEClass(NESTED_TABLE_TYPE);
		createEAttribute(nestedTableTypeEClass, NESTED_TABLE_TYPE__NAME);
		createEReference(nestedTableTypeEClass, NESTED_TABLE_TYPE__TYPE);

		notNullEClass = createEClass(NOT_NULL);
		createEAttribute(notNullEClass, NOT_NULL__NAME);

		numberFeatureEClass = createEClass(NUMBER_FEATURE);
		createEAttribute(numberFeatureEClass, NUMBER_FEATURE__KEY);
		createEAttribute(numberFeatureEClass, NUMBER_FEATURE__VALUE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEAttribute(operationEClass, OPERATION__BODY);
		createEReference(operationEClass, OPERATION__OPERATION_PARAMETERS);
		createEReference(operationEClass, OPERATION__MODEL);
		createEReference(operationEClass, OPERATION__PACKAGE);

		operationParameterEClass = createEClass(OPERATION_PARAMETER);
		createEAttribute(operationParameterEClass, OPERATION_PARAMETER__MODE);
		createEReference(operationParameterEClass, OPERATION_PARAMETER__OPERATION);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEReference(packageEClass, PACKAGE__OPERATIONS);
		createEReference(packageEClass, PACKAGE__MODEL);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__TYPE);

		primaryKeyEClass = createEClass(PRIMARY_KEY);
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__NAME);

		procedureEClass = createEClass(PROCEDURE);

		rowidTypeEClass = createEClass(ROWID_TYPE);
		createEAttribute(rowidTypeEClass, ROWID_TYPE__DESCRIPTOR);
		createEAttribute(rowidTypeEClass, ROWID_TYPE__SIZE_MIN);
		createEAttribute(rowidTypeEClass, ROWID_TYPE__SIZE_MAX);

		rawFeatureEClass = createEClass(RAW_FEATURE);
		createEAttribute(rawFeatureEClass, RAW_FEATURE__KEY);
		createEAttribute(rawFeatureEClass, RAW_FEATURE__VALUE);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__NAME);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__TYPE);

		restrictionEClass = createEClass(RESTRICTION);
		createEReference(restrictionEClass, RESTRICTION__ATTRIBUTES);
		createEReference(restrictionEClass, RESTRICTION__TABLE);

		rowFeatureEClass = createEClass(ROW_FEATURE);
		createEAttribute(rowFeatureEClass, ROW_FEATURE__KEY);
		createEAttribute(rowFeatureEClass, ROW_FEATURE__VALUE);

		spacialTypeEClass = createEClass(SPACIAL_TYPE);
		createEAttribute(spacialTypeEClass, SPACIAL_TYPE__DESCRIPTOR);

		storedNestedTableEClass = createEClass(STORED_NESTED_TABLE);
		createEAttribute(storedNestedTableEClass, STORED_NESTED_TABLE__NAME);
		createEReference(storedNestedTableEClass, STORED_NESTED_TABLE__ATTRIBUTE);
		createEReference(storedNestedTableEClass, STORED_NESTED_TABLE__TYPED);

		structuralComponentEClass = createEClass(STRUCTURAL_COMPONENT);
		createEAttribute(structuralComponentEClass, STRUCTURAL_COMPONENT__NAME);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__TYPE);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__FEATURES);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__RESTRICTIONS);

		structuredTypeEClass = createEClass(STRUCTURED_TYPE);
		createEAttribute(structuredTypeEClass, STRUCTURED_TYPE__NAME);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__ATTRIBUTE);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__METHOD);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__TYPED);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__SUPERTYPE);
		createEAttribute(structuredTypeEClass, STRUCTURED_TYPE__IS_INSTANTIABLE);
		createEAttribute(structuredTypeEClass, STRUCTURED_TYPE__IS_FINAL);

		suppliedTypeEClass = createEClass(SUPPLIED_TYPE);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NAME);
		createEReference(tableEClass, TABLE__RESTRICTION);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__MODEL);
		createEReference(tableEClass, TABLE__TRIGGERS);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__NAME);
		createEAttribute(triggerEClass, TRIGGER__BODY);
		createEAttribute(triggerEClass, TRIGGER__EVENT);
		createEAttribute(triggerEClass, TRIGGER__ACTION);
		createEReference(triggerEClass, TRIGGER__UPDATE_COLUMNS);
		createEReference(triggerEClass, TRIGGER__TABLE);

		typedTableEClass = createEClass(TYPED_TABLE);
		createEReference(typedTableEClass, TYPED_TABLE__STORED_NESTED);
		createEReference(typedTableEClass, TYPED_TABLE__STRUCTURED_TYPE);

		uniqueEClass = createEClass(UNIQUE);
		createEAttribute(uniqueEClass, UNIQUE__NAME);

		varrayEClass = createEClass(VARRAY);
		createEAttribute(varrayEClass, VARRAY__NAME);
		createEAttribute(varrayEClass, VARRAY__NUM_ELEMENTS);
		createEReference(varrayEClass, VARRAY__TYPE);

		xmlTypeEClass = createEClass(XML_TYPE);
		createEAttribute(xmlTypeEClass, XML_TYPE__DESCRIPTOR);

		derivedTableEClass = createEClass(DERIVED_TABLE);
		createEAttribute(derivedTableEClass, DERIVED_TABLE__QUERY_EXPRESSION);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__TABLES);
		createEReference(viewEClass, VIEW__COMPONENTS);

		// Create enums
		ansiCharacterTypesEEnum = createEEnum(ANSI_CHARACTER_TYPES);
		ansiNumberTypesEEnum = createEEnum(ANSI_NUMBER_TYPES);
		builtInCharacterSemanticsEEnum = createEEnum(BUILT_IN_CHARACTER_SEMANTICS);
		builtInCharacterTypesEEnum = createEEnum(BUILT_IN_CHARACTER_TYPES);
		builtInDatetimeTypesEEnum = createEEnum(BUILT_IN_DATETIME_TYPES);
		builtInLOBTypeEEnum = createEEnum(BUILT_IN_LOB_TYPE);
		builtInLongAndRawTypesEEnum = createEEnum(BUILT_IN_LONG_AND_RAW_TYPES);
		builtInROWIDTypeEEnum = createEEnum(BUILT_IN_ROWID_TYPE);
		builtNumberTypesEEnum = createEEnum(BUILT_NUMBER_TYPES);
		characterFeaturesEEnum = createEEnum(CHARACTER_FEATURES);
		datetimeFeaturesEEnum = createEEnum(DATETIME_FEATURES);
		intervalFeaturesEEnum = createEEnum(INTERVAL_FEATURES);
		numberFeaturesEEnum = createEEnum(NUMBER_FEATURES);
		ondeleteActionsEEnum = createEEnum(ONDELETE_ACTIONS);
		parameterModeEEnum = createEEnum(PARAMETER_MODE);
		rawFeaturesEEnum = createEEnum(RAW_FEATURES);
		rowFeaturesEEnum = createEEnum(ROW_FEATURES);
		suppliedAnyTypesEEnum = createEEnum(SUPPLIED_ANY_TYPES);
		suppliedMediaTypesEEnum = createEEnum(SUPPLIED_MEDIA_TYPES);
		suppliedSpacialTypesEEnum = createEEnum(SUPPLIED_SPACIAL_TYPES);
		suppliedXMLTypesEEnum = createEEnum(SUPPLIED_XML_TYPES);
		triggerActionTimeEEnum = createEEnum(TRIGGER_ACTION_TIME);
		triggerEventEEnum = createEEnum(TRIGGER_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ansiCharacterTypeEClass.getESuperTypes().add(this.getANSIType());
		ansiNumberTypeEClass.getESuperTypes().add(this.getANSIType());
		ansiTypeEClass.getESuperTypes().add(this.getBasicDataType());
		anyTypeEClass.getESuperTypes().add(this.getSuppliedType());
		attributeEClass.getESuperTypes().add(this.getStructuralComponent());
		basicDataTypeEClass.getESuperTypes().add(this.getDatatype());
		builtInCharacterTypeEClass.getESuperTypes().add(this.getBuiltInType());
		builtInNumberTypeEClass.getESuperTypes().add(this.getBuiltInType());
		builtInTypeEClass.getESuperTypes().add(this.getBasicDataType());
		characterFeatureEClass.getESuperTypes().add(this.getFeature());
		checkEClass.getESuperTypes().add(this.getRestriction());
		columnEClass.getESuperTypes().add(this.getStructuralComponent());
		datetimeFeatureEClass.getESuperTypes().add(this.getFeature());
		datetimeTypeEClass.getESuperTypes().add(this.getBuiltInType());
		foreignKeyEClass.getESuperTypes().add(this.getRestriction());
		functionEClass.getESuperTypes().add(this.getOperation());
		intervalFeatureEClass.getESuperTypes().add(this.getFeature());
		lobTypeEClass.getESuperTypes().add(this.getBuiltInType());
		longAndRawTypeEClass.getESuperTypes().add(this.getBuiltInType());
		mediaTypeEClass.getESuperTypes().add(this.getSuppliedType());
		methodParameterEClass.getESuperTypes().add(this.getParameter());
		nestedTableTypeEClass.getESuperTypes().add(this.getDatatype());
		notNullEClass.getESuperTypes().add(this.getRestriction());
		numberFeatureEClass.getESuperTypes().add(this.getFeature());
		operationParameterEClass.getESuperTypes().add(this.getParameter());
		primaryKeyEClass.getESuperTypes().add(this.getRestriction());
		procedureEClass.getESuperTypes().add(this.getOperation());
		rowidTypeEClass.getESuperTypes().add(this.getBuiltInType());
		rawFeatureEClass.getESuperTypes().add(this.getFeature());
		referenceTypeEClass.getESuperTypes().add(this.getDatatype());
		rowFeatureEClass.getESuperTypes().add(this.getFeature());
		spacialTypeEClass.getESuperTypes().add(this.getSuppliedType());
		structuredTypeEClass.getESuperTypes().add(this.getDatatype());
		suppliedTypeEClass.getESuperTypes().add(this.getBasicDataType());
		typedTableEClass.getESuperTypes().add(this.getTable());
		uniqueEClass.getESuperTypes().add(this.getRestriction());
		varrayEClass.getESuperTypes().add(this.getDatatype());
		xmlTypeEClass.getESuperTypes().add(this.getSuppliedType());
		derivedTableEClass.getESuperTypes().add(this.getTable());
		viewEClass.getESuperTypes().add(this.getDerivedTable());

		// Initialize classes and features; add operations and parameters
		initEClass(ansiCharacterTypeEClass, ANSICharacterType.class, "ANSICharacterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANSICharacterType_Descriptor(), this.getANSICharacterTypes(), "Descriptor", null, 1, 1, ANSICharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ansiNumberTypeEClass, ANSINumberType.class, "ANSINumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANSINumberType_Descriptor(), this.getANSINumberTypes(), "Descriptor", null, 1, 1, ANSINumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ansiTypeEClass, ANSIType.class, "ANSIType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyTypeEClass, AnyType.class, "AnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyType_Descriptor(), this.getSuppliedAnyTypes(), "Descriptor", null, 1, 1, AnyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Structured(), this.getStructuredType(), this.getStructuredType_Attribute(), "structured", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Default(), ecorePackage.getEString(), "default", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicDataTypeEClass, BasicDataType.class, "BasicDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builtInCharacterTypeEClass, BuiltInCharacterType.class, "BuiltInCharacterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuiltInCharacterType_Descriptor(), this.getBuiltInCharacterTypes(), "Descriptor", null, 1, 1, BuiltInCharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInCharacterType_Semantic(), this.getBuiltInCharacterSemantics(), "Semantic", "", 0, 1, BuiltInCharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInCharacterType_Size_Min(), ecorePackage.getEInt(), "Size_Min", null, 0, 1, BuiltInCharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInCharacterType_Size_Max(), ecorePackage.getEInt(), "Size_Max", null, 0, 1, BuiltInCharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInCharacterType_Size_Def(), ecorePackage.getEInt(), "Size_Def", null, 0, 1, BuiltInCharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInNumberTypeEClass, BuiltInNumberType.class, "BuiltInNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuiltInNumberType_Descriptor(), this.getBuiltNumberTypes(), "Descriptor", null, 1, 1, BuiltInNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInNumberType_Precision_Mn(), ecorePackage.getEInt(), "Precision_Mn", null, 0, 1, BuiltInNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInNumberType_Precision_Max(), ecorePackage.getEInt(), "Precision_Max", null, 0, 1, BuiltInNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInNumberType_Scale_Min(), ecorePackage.getEInt(), "Scale_Min", null, 0, 1, BuiltInNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInNumberType_Scale_Max(), ecorePackage.getEInt(), "Scale_Max", null, 0, 1, BuiltInNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInTypeEClass, BuiltInType.class, "BuiltInType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterFeatureEClass, Map.Entry.class, "CharacterFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterFeature_Key(), this.getCharacterFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheck_Condition(), ecorePackage.getEString(), "Condition", "", 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheck_Name(), ecorePackage.getEString(), "Name", "", 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Table(), this.getTable(), this.getTable_Columns(), "table", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeEClass, Datatype.class, "Datatype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatype_Model(), this.getModel(), this.getModel_Datatype(), "model", null, 1, 1, Datatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datetimeFeatureEClass, Map.Entry.class, "DatetimeFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeFeature_Key(), this.getDatetimeFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datetimeTypeEClass, DatetimeType.class, "DatetimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeType_Descriptor(), this.getBuiltInDatetimeTypes(), "Descriptor", null, 1, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_SecondPrecision_Min(), ecorePackage.getEInt(), "SecondPrecision_Min", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_SecondPrecision_Max(), ecorePackage.getEInt(), "SecondPrecision_Max", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_SecondPrecision_Def(), ecorePackage.getEInt(), "SecondPrecision_Def", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_DayPrecision_Min(), ecorePackage.getEInt(), "DayPrecision_Min", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_DayPrecision_Max(), ecorePackage.getEInt(), "DayPrecision_Max", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_DayPrecision_Def(), ecorePackage.getEInt(), "DayPrecision_Def", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_YearPrecision_Min(), ecorePackage.getEInt(), "YearPrecision_Min", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_YearPrecision_Max(), ecorePackage.getEInt(), "YearPrecision_Max", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeType_YearPrecision_Def(), ecorePackage.getEInt(), "YearPrecision_Def", null, 0, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForeignKey_Name(), ecorePackage.getEString(), "Name", "", 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getForeignKey_OnDelete(), this.getONDELETEActions(), "OnDelete", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_Reference(), this.getTable(), null, "reference", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Return(), this.getDatatype(), null, "Return", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalFeatureEClass, Map.Entry.class, "IntervalFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervalFeature_Key(), this.getIntervalFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lobTypeEClass, LOBType.class, "LOBType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLOBType_Descriptor(), this.getBuiltInLOBType(), "Descriptor", null, 1, 1, LOBType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(longAndRawTypeEClass, LongAndRawType.class, "LongAndRawType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongAndRawType_Descriptor(), this.getBuiltInLongAndRawTypes(), "Descriptor", null, 1, 1, LongAndRawType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongAndRawType_Size_Min(), ecorePackage.getEInt(), "Size_Min", null, 0, 1, LongAndRawType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongAndRawType_Size_Max(), ecorePackage.getEInt(), "Size_Max", null, 0, 1, LongAndRawType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaTypeEClass, MediaType.class, "MediaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaType_Descriptor(), this.getSuppliedMediaTypes(), "Descriptor", null, 1, 1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMethod_Override(), this.getMethod(), null, "override", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMethod_Structured(), this.getStructuredType(), this.getStructuredType_Method(), "structured", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameters(), this.getMethodParameter(), this.getMethodParameter_Method(), "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_ReturnType(), this.getDatatype(), null, "returnType", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Body(), ecorePackage.getEString(), "Body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodParameterEClass, MethodParameter.class, "MethodParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodParameter_Method(), this.getMethod(), this.getMethod_Parameters(), "method", null, 0, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Datatype(), this.getDatatype(), this.getDatatype_Model(), "datatype", null, 1, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Table(), this.getTable(), this.getTable_Model(), "table", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Operation(), this.getOperation(), this.getOperation_Model(), "operation", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Package(), this.getPackage(), this.getPackage_Model(), "package", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedTableTypeEClass, NestedTableType.class, "NestedTableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNestedTableType_Name(), ecorePackage.getEString(), "Name", "", 1, 1, NestedTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNestedTableType_Type(), this.getDatatype(), null, "Type", null, 1, 1, NestedTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notNullEClass, NotNull.class, "NotNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotNull_Name(), ecorePackage.getEString(), "Name", "", 1, 1, NotNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberFeatureEClass, Map.Entry.class, "NumberFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberFeature_Key(), this.getNumberFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Body(), ecorePackage.getEString(), "Body", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OperationParameters(), this.getOperationParameter(), this.getOperationParameter_Operation(), "operationParameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Model(), this.getModel(), this.getModel_Operation(), "model", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Package(), this.getPackage(), this.getPackage_Operations(), "package", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationParameterEClass, OperationParameter.class, "OperationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationParameter_Mode(), this.getParameterMode(), "Mode", null, 0, 1, OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationParameter_Operation(), this.getOperation(), this.getOperation_OperationParameters(), "operation", null, 0, 1, OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, ORDB4ORA.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ORDB4ORA.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Operations(), this.getOperation(), this.getOperation_Package(), "operations", null, 0, -1, ORDB4ORA.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Model(), this.getModel(), this.getModel_Package(), "model", null, 1, 1, ORDB4ORA.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getDatatype(), null, "Type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimaryKey_Name(), ecorePackage.getEString(), "Name", "", 1, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rowidTypeEClass, ROWIDType.class, "ROWIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROWIDType_Descriptor(), this.getBuiltInROWIDType(), "Descriptor", null, 1, 1, ROWIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getROWIDType_Size_Min(), ecorePackage.getEInt(), "Size_Min", null, 0, 1, ROWIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROWIDType_Size_Max(), ecorePackage.getEInt(), "Size_Max", null, 0, 1, ROWIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawFeatureEClass, Map.Entry.class, "RawFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRawFeature_Key(), this.getRawFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRawFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceType_Name(), ecorePackage.getEString(), "Name", "", 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceType_Type(), this.getStructuredType(), null, "Type", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestriction_Attributes(), this.getStructuralComponent(), this.getStructuralComponent_Restrictions(), "attributes", null, 1, -1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestriction_Table(), this.getTable(), this.getTable_Restriction(), "table", null, 1, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowFeatureEClass, Map.Entry.class, "RowFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRowFeature_Key(), this.getRowFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacialTypeEClass, SpacialType.class, "SpacialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacialType_Descriptor(), this.getSuppliedSpacialTypes(), "Descriptor", null, 1, 1, SpacialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storedNestedTableEClass, StoredNestedTable.class, "StoredNestedTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoredNestedTable_Name(), ecorePackage.getEString(), "Name", null, 1, 1, StoredNestedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStoredNestedTable_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, StoredNestedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStoredNestedTable_Typed(), this.getTypedTable(), this.getTypedTable_StoredNested(), "typed", null, 0, 1, StoredNestedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralComponentEClass, StructuralComponent.class, "StructuralComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralComponent_Name(), ecorePackage.getEString(), "Name", null, 1, 1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralComponent_Type(), this.getDatatype(), null, "Type", null, 1, 1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuralComponent_Features(), this.getFeature(), null, "features", null, 0, -1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralComponent_Restrictions(), this.getRestriction(), this.getRestriction_Attributes(), "restrictions", null, 0, -1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredTypeEClass, StructuredType.class, "StructuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredType_Name(), ecorePackage.getEString(), "Name", "", 1, 1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredType_Attribute(), this.getAttribute(), this.getAttribute_Structured(), "attribute", null, 0, -1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredType_Method(), this.getMethod(), this.getMethod_Structured(), "method", null, 0, -1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredType_Typed(), this.getTypedTable(), this.getTypedTable_StructuredType(), "typed", null, 0, -1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredType_Supertype(), this.getStructuredType(), null, "supertype", null, 0, 1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredType_Is_instantiable(), ecorePackage.getEBoolean(), "is_instantiable", null, 0, 1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredType_Is_final(), ecorePackage.getEBoolean(), "is_final", null, 0, 1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suppliedTypeEClass, SuppliedType.class, "SuppliedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Restriction(), this.getRestriction(), this.getRestriction_Table(), "restriction", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTable_Columns(), this.getColumn(), this.getColumn_Table(), "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTable_Model(), this.getModel(), this.getModel_Table(), "model", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Triggers(), this.getTrigger(), this.getTrigger_Table(), "triggers", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Body(), ecorePackage.getEString(), "Body", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Event(), this.getTriggerEvent(), "Event", null, 1, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Action(), this.getTriggerActionTime(), "Action", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_UpdateColumns(), this.getStructuralComponent(), null, "updateColumns", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Table(), this.getTable(), this.getTable_Triggers(), "table", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedTableEClass, TypedTable.class, "TypedTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedTable_StoredNested(), this.getStoredNestedTable(), this.getStoredNestedTable_Typed(), "storedNested", null, 0, -1, TypedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypedTable_StructuredType(), this.getStructuredType(), this.getStructuredType_Typed(), "structuredType", null, 1, 1, TypedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueEClass, Unique.class, "Unique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnique_Name(), ecorePackage.getEString(), "Name", "", 1, 1, Unique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(varrayEClass, Varray.class, "Varray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarray_Name(), ecorePackage.getEString(), "Name", "", 1, 1, Varray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVarray_NumElements(), ecorePackage.getEInt(), "NumElements", null, 1, 1, Varray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVarray_Type(), this.getDatatype(), null, "Type", null, 1, 1, Varray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(xmlTypeEClass, XMLType.class, "XMLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLType_Descriptor(), this.getSuppliedXMLTypes(), "Descriptor", null, 1, 1, XMLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedTableEClass, DerivedTable.class, "DerivedTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedTable_Query_expression(), ecorePackage.getEString(), "query_expression", null, 1, 1, DerivedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Tables(), this.getTable(), null, "tables", null, 1, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Components(), this.getStructuralComponent(), null, "components", null, 1, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ansiCharacterTypesEEnum, ANSICharacterTypes.class, "ANSICharacterTypes");
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.CHARACTER);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.CHARACTERVARYING);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.CHARVARYING);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.NCHARVARYING);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.VARCHAR);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.NATIONALCHARACTER);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.NATIONALCHAR);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.NATIONALCHARACTERVARYING);
		addEEnumLiteral(ansiCharacterTypesEEnum, ANSICharacterTypes.NATIONALCHARVARYING);

		initEEnum(ansiNumberTypesEEnum, ANSINumberTypes.class, "ANSINumberTypes");
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.NUMERIC);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.DECIMAL);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.DEC);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.INTEGER);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.INT);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.SMALLINT);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.FLOAT);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.DOUBLEPRECISION);
		addEEnumLiteral(ansiNumberTypesEEnum, ANSINumberTypes.REAL);

		initEEnum(builtInCharacterSemanticsEEnum, BuiltInCharacterSemantics.class, "BuiltInCharacterSemantics");
		addEEnumLiteral(builtInCharacterSemanticsEEnum, BuiltInCharacterSemantics.BYTE);
		addEEnumLiteral(builtInCharacterSemanticsEEnum, BuiltInCharacterSemantics.CHAR);

		initEEnum(builtInCharacterTypesEEnum, BuiltInCharacterTypes.class, "BuiltInCharacterTypes");
		addEEnumLiteral(builtInCharacterTypesEEnum, BuiltInCharacterTypes.CHAR);
		addEEnumLiteral(builtInCharacterTypesEEnum, BuiltInCharacterTypes.VARCHAR2);
		addEEnumLiteral(builtInCharacterTypesEEnum, BuiltInCharacterTypes.NCHAR);
		addEEnumLiteral(builtInCharacterTypesEEnum, BuiltInCharacterTypes.NVARCHAR2);

		initEEnum(builtInDatetimeTypesEEnum, BuiltInDatetimeTypes.class, "BuiltInDatetimeTypes");
		addEEnumLiteral(builtInDatetimeTypesEEnum, BuiltInDatetimeTypes.DATE);
		addEEnumLiteral(builtInDatetimeTypesEEnum, BuiltInDatetimeTypes.TIMESTAMP);
		addEEnumLiteral(builtInDatetimeTypesEEnum, BuiltInDatetimeTypes.TIMESTAMPWITHTIMEZONE);
		addEEnumLiteral(builtInDatetimeTypesEEnum, BuiltInDatetimeTypes.TIMESTAMPWITHLOCALTIMEZONE);
		addEEnumLiteral(builtInDatetimeTypesEEnum, BuiltInDatetimeTypes.INTERVALYEARTOMONTH);
		addEEnumLiteral(builtInDatetimeTypesEEnum, BuiltInDatetimeTypes.INTERVALDAYTOSECOND);

		initEEnum(builtInLOBTypeEEnum, BuiltInLOBType.class, "BuiltInLOBType");
		addEEnumLiteral(builtInLOBTypeEEnum, BuiltInLOBType.BLOB);
		addEEnumLiteral(builtInLOBTypeEEnum, BuiltInLOBType.CLOB);
		addEEnumLiteral(builtInLOBTypeEEnum, BuiltInLOBType.NLOB);
		addEEnumLiteral(builtInLOBTypeEEnum, BuiltInLOBType.BFILE);

		initEEnum(builtInLongAndRawTypesEEnum, BuiltInLongAndRawTypes.class, "BuiltInLongAndRawTypes");
		addEEnumLiteral(builtInLongAndRawTypesEEnum, BuiltInLongAndRawTypes.LONG);
		addEEnumLiteral(builtInLongAndRawTypesEEnum, BuiltInLongAndRawTypes.LONGRAW);
		addEEnumLiteral(builtInLongAndRawTypesEEnum, BuiltInLongAndRawTypes.RAW);

		initEEnum(builtInROWIDTypeEEnum, BuiltInROWIDType.class, "BuiltInROWIDType");
		addEEnumLiteral(builtInROWIDTypeEEnum, BuiltInROWIDType.ROWID);
		addEEnumLiteral(builtInROWIDTypeEEnum, BuiltInROWIDType.UROWID);

		initEEnum(builtNumberTypesEEnum, BuiltNumberTypes.class, "BuiltNumberTypes");
		addEEnumLiteral(builtNumberTypesEEnum, BuiltNumberTypes.NUMBER);
		addEEnumLiteral(builtNumberTypesEEnum, BuiltNumberTypes.BINARY_FLOAT);
		addEEnumLiteral(builtNumberTypesEEnum, BuiltNumberTypes.BINARY_DOUBLE);

		initEEnum(characterFeaturesEEnum, CharacterFeatures.class, "CharacterFeatures");
		addEEnumLiteral(characterFeaturesEEnum, CharacterFeatures.SIZE);
		addEEnumLiteral(characterFeaturesEEnum, CharacterFeatures.SEMANTIC);

		initEEnum(datetimeFeaturesEEnum, DatetimeFeatures.class, "DatetimeFeatures");
		addEEnumLiteral(datetimeFeaturesEEnum, DatetimeFeatures.PRECISION);

		initEEnum(intervalFeaturesEEnum, IntervalFeatures.class, "IntervalFeatures");
		addEEnumLiteral(intervalFeaturesEEnum, IntervalFeatures.DAY_PRECISION);
		addEEnumLiteral(intervalFeaturesEEnum, IntervalFeatures.SECOND_PRECISION);
		addEEnumLiteral(intervalFeaturesEEnum, IntervalFeatures.YEAR_PRECISION);

		initEEnum(numberFeaturesEEnum, NumberFeatures.class, "NumberFeatures");
		addEEnumLiteral(numberFeaturesEEnum, NumberFeatures.SIZE);
		addEEnumLiteral(numberFeaturesEEnum, NumberFeatures.PRECISION);
		addEEnumLiteral(numberFeaturesEEnum, NumberFeatures.SCALE);

		initEEnum(ondeleteActionsEEnum, ONDELETEActions.class, "ONDELETEActions");
		addEEnumLiteral(ondeleteActionsEEnum, ONDELETEActions.CASCADE);
		addEEnumLiteral(ondeleteActionsEEnum, ONDELETEActions.SETNULL);

		initEEnum(parameterModeEEnum, ParameterMode.class, "ParameterMode");
		addEEnumLiteral(parameterModeEEnum, ParameterMode.IN);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.OUT);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.INOUT);

		initEEnum(rawFeaturesEEnum, RawFeatures.class, "RawFeatures");
		addEEnumLiteral(rawFeaturesEEnum, RawFeatures.SIZE);

		initEEnum(rowFeaturesEEnum, RowFeatures.class, "RowFeatures");
		addEEnumLiteral(rowFeaturesEEnum, RowFeatures.SIZE);

		initEEnum(suppliedAnyTypesEEnum, SuppliedAnyTypes.class, "SuppliedAnyTypes");
		addEEnumLiteral(suppliedAnyTypesEEnum, SuppliedAnyTypes.SYSANYDATA);
		addEEnumLiteral(suppliedAnyTypesEEnum, SuppliedAnyTypes.SYSANYTYPE);
		addEEnumLiteral(suppliedAnyTypesEEnum, SuppliedAnyTypes.SYSANYDATASET);

		initEEnum(suppliedMediaTypesEEnum, SuppliedMediaTypes.class, "SuppliedMediaTypes");
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.ORD_AUDIO);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.ORD_IMAGE);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.ORD_VIDEO);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.ORD_DOC);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.ORD_IMAGE_SIGNATURE);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.SI_STILLIMAGE);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.SI_AVERAGECOLOR);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.SI_POSITIONALCOLOR);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.SI_COLORHISTOGRAM);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.SI_TEXTURE);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.SI_FEATURELIST);
		addEEnumLiteral(suppliedMediaTypesEEnum, SuppliedMediaTypes.SI_COLOR);

		initEEnum(suppliedSpacialTypesEEnum, SuppliedSpacialTypes.class, "SuppliedSpacialTypes");
		addEEnumLiteral(suppliedSpacialTypesEEnum, SuppliedSpacialTypes.SDO_GEOMETRY);
		addEEnumLiteral(suppliedSpacialTypesEEnum, SuppliedSpacialTypes.SDO_TOPO_GEOMETRY);
		addEEnumLiteral(suppliedSpacialTypesEEnum, SuppliedSpacialTypes.SDO_RASTER);

		initEEnum(suppliedXMLTypesEEnum, SuppliedXMLTypes.class, "SuppliedXMLTypes");
		addEEnumLiteral(suppliedXMLTypesEEnum, SuppliedXMLTypes.XMLTYPE);
		addEEnumLiteral(suppliedXMLTypesEEnum, SuppliedXMLTypes.URITYPE);

		initEEnum(triggerActionTimeEEnum, TriggerActionTime.class, "TriggerActionTime");
		addEEnumLiteral(triggerActionTimeEEnum, TriggerActionTime.BEFORE);
		addEEnumLiteral(triggerActionTimeEEnum, TriggerActionTime.AFTER);
		addEEnumLiteral(triggerActionTimeEEnum, TriggerActionTime.INSTEADOF);

		initEEnum(triggerEventEEnum, TriggerEvent.class, "TriggerEvent");
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.DELETE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.INSERT);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.UPDATE);

		// Create resource
		createResource(eNS_URI);
	}

} //ORDB4ORAPackageImpl
