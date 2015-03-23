/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2.impl;

import SQL2003_V2.Attribute;
import SQL2003_V2.BaseTable;
import SQL2003_V2.BehaviouralComponent;
import SQL2003_V2.BinaryStringType;
import SQL2003_V2.BinaryStringTypes;
import SQL2003_V2.BooleanType;
import SQL2003_V2.BooleanTypes;
import SQL2003_V2.CharacterStringType;
import SQL2003_V2.CharacterStringTypes;
import SQL2003_V2.CollectionType;
import SQL2003_V2.Column;
import SQL2003_V2.ColumnConstraint;
import SQL2003_V2.ConstructedType;
import SQL2003_V2.DataType;
import SQL2003_V2.DatetimeFeatures;
import SQL2003_V2.DatetimeType;
import SQL2003_V2.DatetimeTypes;
import SQL2003_V2.DerivedTable;
import SQL2003_V2.DistinctType;
import SQL2003_V2.Domain;
import SQL2003_V2.Feature;
import SQL2003_V2.Field;
import SQL2003_V2.Function;
import SQL2003_V2.IntervalFeatures;
import SQL2003_V2.IntervalType;
import SQL2003_V2.IntervalTypes;
import SQL2003_V2.MatchTypes;
import SQL2003_V2.Method;
import SQL2003_V2.MethodParameter;
import SQL2003_V2.Multiplier;
import SQL2003_V2.NotNull;
import SQL2003_V2.NumericFeatures;
import SQL2003_V2.NumericRadix;
import SQL2003_V2.NumericType;
import SQL2003_V2.NumericTypes;
import SQL2003_V2.Parameter;
import SQL2003_V2.ParameterMode;
import SQL2003_V2.ParameterWithMode;
import SQL2003_V2.PredefinedType;
import SQL2003_V2.PrimaryKey;
import SQL2003_V2.Procedure;
import SQL2003_V2.ReferenceType;
import SQL2003_V2.ReferentialAction;
import SQL2003_V2.ReferentialConstraint;
import SQL2003_V2.Restriction;
import SQL2003_V2.SQL2003_V2Factory;
import SQL2003_V2.SQL2003_V2Package;
import SQL2003_V2.Schema;
import SQL2003_V2.StringFeatures;
import SQL2003_V2.StructuralComponent;
import SQL2003_V2.StructuredType;
import SQL2003_V2.Table;
import SQL2003_V2.TableCheckConstraint;
import SQL2003_V2.TableConstraint;
import SQL2003_V2.Trigger;
import SQL2003_V2.TriggerActionTime;
import SQL2003_V2.TriggerDescriptor;
import SQL2003_V2.TriggerEvent;
import SQL2003_V2.TriggerLevel;
import SQL2003_V2.TypedTable;
import SQL2003_V2.UniqueConstraint;
import SQL2003_V2.Unit;
import SQL2003_V2.UserDefinedType;
import SQL2003_V2.View;
import SQL2003_V2.XMLType;
import SQL2003_V2.XMLTypes;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SQL2003_V2PackageImpl extends EPackageImpl implements SQL2003_V2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

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
	private EClass baseTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviouralComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

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
	private EClass columnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

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
	private EClass datetimeTypeEClass = null;

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
	private EClass distinctTypeEClass = null;

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
	private EClass fieldEClass = null;

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
	private EClass intervalFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multisetEClass = null;

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
	private EClass methodParameterEClass = null;

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
	private EClass numericFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

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
	private EClass parameterWithModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedTypeEClass = null;

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
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

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
	private EClass referentialConstraintEClass = null;

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
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringFeatureEClass = null;

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
	private EClass structuredTypeEClass = null;

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
	private EClass tableCheckConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableConstraintEClass = null;

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
	private EClass triggerDescriptorEClass = null;

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
	private EClass uniqueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedTypeEClass = null;

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
	private EClass xmlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryStringTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum characterStringTypesEEnum = null;

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
	private EEnum datetimeTypesEEnum = null;

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
	private EEnum intervalTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matchTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericRadixEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericTypesEEnum = null;

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
	private EEnum referentialActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stringFeaturesEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmlTypesEEnum = null;

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
	 * @see SQL2003_V2.SQL2003_V2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SQL2003_V2PackageImpl() {
		super(eNS_URI, SQL2003_V2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SQL2003_V2Package init() {
		if (isInited) return (SQL2003_V2Package)EPackage.Registry.INSTANCE.getEPackage(SQL2003_V2Package.eNS_URI);

		// Obtain or create and register package
		SQL2003_V2PackageImpl theSQL2003_V2Package = (SQL2003_V2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SQL2003_V2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SQL2003_V2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSQL2003_V2Package.createPackageContents();

		// Initialize created meta-data
		theSQL2003_V2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSQL2003_V2Package.freeze();

		return theSQL2003_V2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARRAY() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARRAY_Num_elements() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAttribute_Default() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Structured() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseTable() {
		return baseTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviouralComponent() {
		return behaviouralComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviouralComponent_Schema() {
		return (EReference)behaviouralComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviouralComponent_Name() {
		return (EAttribute)behaviouralComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviouralComponent_Body() {
		return (EAttribute)behaviouralComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviouralComponent_ParametersWithMode() {
		return (EReference)behaviouralComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryStringType() {
		return binaryStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryStringType_Descriptor() {
		return (EAttribute)binaryStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryStringType_Length_def() {
		return (EAttribute)binaryStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_Descriptor() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterStringType() {
		return characterStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStringType_Descriptor() {
		return (EAttribute)characterStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStringType_Length_def() {
		return (EAttribute)characterStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_Super_type() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_Type() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getColumn_Default() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnConstraint() {
		return columnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructedType() {
		return constructedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructedType_Name() {
		return (EAttribute)constructedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Schema() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getDistinctType() {
		return distinctTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistinctType_Source_type() {
		return (EReference)distinctTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistinctType_Features() {
		return (EReference)distinctTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Row() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
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
	public EReference getFunction_Return_type() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
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
	public EClass getIntervalType() {
		return intervalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalType_Descriptor() {
		return (EAttribute)intervalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMULTISET() {
		return multisetEClass;
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
	public EAttribute getMethod_Body() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Override() {
		return (EReference)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Structured() {
		return (EReference)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Return_type() {
		return (EReference)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parameters() {
		return (EReference)methodEClass.getEStructuralFeatures().get(5);
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
	public EClass getNotNull() {
		return notNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericFeature() {
		return numericFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericFeature_Key() {
		return (EAttribute)numericFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericFeature_Value() {
		return (EAttribute)numericFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericType() {
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericType_Descriptor() {
		return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getParameterWithMode() {
		return parameterWithModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterWithMode_Mode() {
		return (EAttribute)parameterWithModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterWithMode_BehaviouralComponent() {
		return (EReference)parameterWithModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedType() {
		return predefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredefinedType_Is_source_of() {
		return (EReference)predefinedTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROW() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROW_Super_type() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROW_Fields() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROW_Sub_types() {
		return (EReference)rowEClass.getEStructuralFeatures().get(2);
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
	public EReference getReferenceType_Type() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferentialConstraint() {
		return referentialConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferentialConstraint_Delete_action() {
		return (EAttribute)referentialConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferentialConstraint_Update_action() {
		return (EAttribute)referentialConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferentialConstraint_Match() {
		return (EAttribute)referentialConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferentialConstraint_References() {
		return (EReference)referentialConstraintEClass.getEStructuralFeatures().get(3);
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
		return (EReference)restrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestriction_Columns() {
		return (EReference)restrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Name() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_BehaviouralComponents() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Datatypes() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Tables() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Domains() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringFeature() {
		return stringFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringFeature_Key() {
		return (EAttribute)stringFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringFeature_Value() {
		return (EAttribute)stringFeatureEClass.getEStructuralFeatures().get(1);
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
	public EReference getStructuralComponent_Views() {
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
	public EReference getStructuralComponent_Features() {
		return (EReference)structuralComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralComponent_Has_domain() {
		return (EReference)structuralComponentEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getStructuredType_Is_final() {
		return (EAttribute)structuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredType_Is_instantiable() {
		return (EAttribute)structuredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Super_type() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Attributes() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Methods() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredType_Typed() {
		return (EReference)structuredTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getTable_Schema() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Views() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Restrictions() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCheckConstraint() {
		return tableCheckConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCheckConstraint_Expression() {
		return (EAttribute)tableCheckConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableConstraint() {
		return tableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableConstraint_Name() {
		return (EAttribute)tableConstraintEClass.getEStructuralFeatures().get(0);
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
	public EReference getTrigger_Description() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_UpdateColumns() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerDescriptor() {
		return triggerDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerDescriptor_Event() {
		return (EAttribute)triggerDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerDescriptor_ActionTime() {
		return (EAttribute)triggerDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerDescriptor_TriggeredAction() {
		return (EAttribute)triggerDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerDescriptor_Trigger() {
		return (EReference)triggerDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerDescriptor_Level() {
		return (EAttribute)triggerDescriptorEClass.getEStructuralFeatures().get(4);
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
	public EReference getTypedTable_Structured() {
		return (EReference)typedTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedTable_Supertable() {
		return (EReference)typedTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedTable_Subtables() {
		return (EReference)typedTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueConstraint() {
		return uniqueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedType() {
		return userDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Name() {
		return (EAttribute)userDefinedTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Expression() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Default() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Schema() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Defines() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryStringTypes() {
		return binaryStringTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanTypes() {
		return booleanTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCharacterStringTypes() {
		return characterStringTypesEEnum;
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
	public EEnum getDatetimeTypes() {
		return datetimeTypesEEnum;
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
	public EEnum getIntervalTypes() {
		return intervalTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatchTypes() {
		return matchTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplier() {
		return multiplierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericRadix() {
		return numericRadixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericFeatures() {
		return numericFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericTypes() {
		return numericTypesEEnum;
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
	public EEnum getReferentialAction() {
		return referentialActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStringFeatures() {
		return stringFeaturesEEnum;
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
	public EEnum getTriggerLevel() {
		return triggerLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnit() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXMLTypes() {
		return xmlTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQL2003_V2Factory getSQL2003_V2Factory() {
		return (SQL2003_V2Factory)getEFactoryInstance();
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
		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__NUM_ELEMENTS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT);
		createEReference(attributeEClass, ATTRIBUTE__STRUCTURED);

		baseTableEClass = createEClass(BASE_TABLE);

		behaviouralComponentEClass = createEClass(BEHAVIOURAL_COMPONENT);
		createEReference(behaviouralComponentEClass, BEHAVIOURAL_COMPONENT__SCHEMA);
		createEAttribute(behaviouralComponentEClass, BEHAVIOURAL_COMPONENT__NAME);
		createEAttribute(behaviouralComponentEClass, BEHAVIOURAL_COMPONENT__BODY);
		createEReference(behaviouralComponentEClass, BEHAVIOURAL_COMPONENT__PARAMETERS_WITH_MODE);

		binaryStringTypeEClass = createEClass(BINARY_STRING_TYPE);
		createEAttribute(binaryStringTypeEClass, BINARY_STRING_TYPE__DESCRIPTOR);
		createEAttribute(binaryStringTypeEClass, BINARY_STRING_TYPE__LENGTH_DEF);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__DESCRIPTOR);

		characterStringTypeEClass = createEClass(CHARACTER_STRING_TYPE);
		createEAttribute(characterStringTypeEClass, CHARACTER_STRING_TYPE__DESCRIPTOR);
		createEAttribute(characterStringTypeEClass, CHARACTER_STRING_TYPE__LENGTH_DEF);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__SUPER_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__TYPE);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__TABLE);
		createEAttribute(columnEClass, COLUMN__DEFAULT);

		columnConstraintEClass = createEClass(COLUMN_CONSTRAINT);

		constructedTypeEClass = createEClass(CONSTRUCTED_TYPE);
		createEAttribute(constructedTypeEClass, CONSTRUCTED_TYPE__NAME);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__SCHEMA);

		datetimeFeatureEClass = createEClass(DATETIME_FEATURE);
		createEAttribute(datetimeFeatureEClass, DATETIME_FEATURE__KEY);
		createEAttribute(datetimeFeatureEClass, DATETIME_FEATURE__VALUE);

		datetimeTypeEClass = createEClass(DATETIME_TYPE);
		createEAttribute(datetimeTypeEClass, DATETIME_TYPE__DESCRIPTOR);

		derivedTableEClass = createEClass(DERIVED_TABLE);
		createEAttribute(derivedTableEClass, DERIVED_TABLE__QUERY_EXPRESSION);

		distinctTypeEClass = createEClass(DISTINCT_TYPE);
		createEReference(distinctTypeEClass, DISTINCT_TYPE__SOURCE_TYPE);
		createEReference(distinctTypeEClass, DISTINCT_TYPE__FEATURES);

		featureEClass = createEClass(FEATURE);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__ROW);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RETURN_TYPE);

		intervalFeatureEClass = createEClass(INTERVAL_FEATURE);
		createEAttribute(intervalFeatureEClass, INTERVAL_FEATURE__KEY);
		createEAttribute(intervalFeatureEClass, INTERVAL_FEATURE__VALUE);

		intervalTypeEClass = createEClass(INTERVAL_TYPE);
		createEAttribute(intervalTypeEClass, INTERVAL_TYPE__DESCRIPTOR);

		multisetEClass = createEClass(MULTISET);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);
		createEAttribute(methodEClass, METHOD__BODY);
		createEReference(methodEClass, METHOD__OVERRIDE);
		createEReference(methodEClass, METHOD__STRUCTURED);
		createEReference(methodEClass, METHOD__RETURN_TYPE);
		createEReference(methodEClass, METHOD__PARAMETERS);

		methodParameterEClass = createEClass(METHOD_PARAMETER);
		createEReference(methodParameterEClass, METHOD_PARAMETER__METHOD);

		notNullEClass = createEClass(NOT_NULL);

		numericFeatureEClass = createEClass(NUMERIC_FEATURE);
		createEAttribute(numericFeatureEClass, NUMERIC_FEATURE__KEY);
		createEAttribute(numericFeatureEClass, NUMERIC_FEATURE__VALUE);

		numericTypeEClass = createEClass(NUMERIC_TYPE);
		createEAttribute(numericTypeEClass, NUMERIC_TYPE__DESCRIPTOR);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__TYPE);

		parameterWithModeEClass = createEClass(PARAMETER_WITH_MODE);
		createEAttribute(parameterWithModeEClass, PARAMETER_WITH_MODE__MODE);
		createEReference(parameterWithModeEClass, PARAMETER_WITH_MODE__BEHAVIOURAL_COMPONENT);

		predefinedTypeEClass = createEClass(PREDEFINED_TYPE);
		createEReference(predefinedTypeEClass, PREDEFINED_TYPE__IS_SOURCE_OF);

		primaryKeyEClass = createEClass(PRIMARY_KEY);

		procedureEClass = createEClass(PROCEDURE);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__SUPER_TYPE);
		createEReference(rowEClass, ROW__FIELDS);
		createEReference(rowEClass, ROW__SUB_TYPES);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__TYPE);

		referentialConstraintEClass = createEClass(REFERENTIAL_CONSTRAINT);
		createEAttribute(referentialConstraintEClass, REFERENTIAL_CONSTRAINT__DELETE_ACTION);
		createEAttribute(referentialConstraintEClass, REFERENTIAL_CONSTRAINT__UPDATE_ACTION);
		createEAttribute(referentialConstraintEClass, REFERENTIAL_CONSTRAINT__MATCH);
		createEReference(referentialConstraintEClass, REFERENTIAL_CONSTRAINT__REFERENCES);

		restrictionEClass = createEClass(RESTRICTION);
		createEReference(restrictionEClass, RESTRICTION__TABLE);
		createEReference(restrictionEClass, RESTRICTION__COLUMNS);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__NAME);
		createEReference(schemaEClass, SCHEMA__BEHAVIOURAL_COMPONENTS);
		createEReference(schemaEClass, SCHEMA__DATATYPES);
		createEReference(schemaEClass, SCHEMA__TABLES);
		createEReference(schemaEClass, SCHEMA__DOMAINS);

		stringFeatureEClass = createEClass(STRING_FEATURE);
		createEAttribute(stringFeatureEClass, STRING_FEATURE__KEY);
		createEAttribute(stringFeatureEClass, STRING_FEATURE__VALUE);

		structuralComponentEClass = createEClass(STRUCTURAL_COMPONENT);
		createEAttribute(structuralComponentEClass, STRUCTURAL_COMPONENT__NAME);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__TYPE);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__VIEWS);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__RESTRICTIONS);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__FEATURES);
		createEReference(structuralComponentEClass, STRUCTURAL_COMPONENT__HAS_DOMAIN);

		structuredTypeEClass = createEClass(STRUCTURED_TYPE);
		createEAttribute(structuredTypeEClass, STRUCTURED_TYPE__IS_FINAL);
		createEAttribute(structuredTypeEClass, STRUCTURED_TYPE__IS_INSTANTIABLE);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__SUPER_TYPE);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__ATTRIBUTES);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__METHODS);
		createEReference(structuredTypeEClass, STRUCTURED_TYPE__TYPED);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__SCHEMA);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__VIEWS);
		createEReference(tableEClass, TABLE__RESTRICTIONS);
		createEAttribute(tableEClass, TABLE__NAME);

		tableCheckConstraintEClass = createEClass(TABLE_CHECK_CONSTRAINT);
		createEAttribute(tableCheckConstraintEClass, TABLE_CHECK_CONSTRAINT__EXPRESSION);

		tableConstraintEClass = createEClass(TABLE_CONSTRAINT);
		createEAttribute(tableConstraintEClass, TABLE_CONSTRAINT__NAME);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__NAME);
		createEReference(triggerEClass, TRIGGER__DESCRIPTION);
		createEReference(triggerEClass, TRIGGER__UPDATE_COLUMNS);

		triggerDescriptorEClass = createEClass(TRIGGER_DESCRIPTOR);
		createEAttribute(triggerDescriptorEClass, TRIGGER_DESCRIPTOR__EVENT);
		createEAttribute(triggerDescriptorEClass, TRIGGER_DESCRIPTOR__ACTION_TIME);
		createEAttribute(triggerDescriptorEClass, TRIGGER_DESCRIPTOR__TRIGGERED_ACTION);
		createEReference(triggerDescriptorEClass, TRIGGER_DESCRIPTOR__TRIGGER);
		createEAttribute(triggerDescriptorEClass, TRIGGER_DESCRIPTOR__LEVEL);

		typedTableEClass = createEClass(TYPED_TABLE);
		createEReference(typedTableEClass, TYPED_TABLE__STRUCTURED);
		createEReference(typedTableEClass, TYPED_TABLE__SUPERTABLE);
		createEReference(typedTableEClass, TYPED_TABLE__SUBTABLES);

		uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);

		userDefinedTypeEClass = createEClass(USER_DEFINED_TYPE);
		createEAttribute(userDefinedTypeEClass, USER_DEFINED_TYPE__NAME);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__TABLES);
		createEReference(viewEClass, VIEW__COMPONENTS);

		xmlTypeEClass = createEClass(XML_TYPE);
		createEAttribute(xmlTypeEClass, XML_TYPE__DESCRIPTOR);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEAttribute(domainEClass, DOMAIN__EXPRESSION);
		createEAttribute(domainEClass, DOMAIN__DEFAULT);
		createEReference(domainEClass, DOMAIN__SCHEMA);
		createEReference(domainEClass, DOMAIN__DEFINES);

		// Create enums
		binaryStringTypesEEnum = createEEnum(BINARY_STRING_TYPES);
		booleanTypesEEnum = createEEnum(BOOLEAN_TYPES);
		characterStringTypesEEnum = createEEnum(CHARACTER_STRING_TYPES);
		datetimeFeaturesEEnum = createEEnum(DATETIME_FEATURES);
		datetimeTypesEEnum = createEEnum(DATETIME_TYPES);
		intervalFeaturesEEnum = createEEnum(INTERVAL_FEATURES);
		intervalTypesEEnum = createEEnum(INTERVAL_TYPES);
		matchTypesEEnum = createEEnum(MATCH_TYPES);
		multiplierEEnum = createEEnum(MULTIPLIER);
		numericRadixEEnum = createEEnum(NUMERIC_RADIX);
		numericFeaturesEEnum = createEEnum(NUMERIC_FEATURES);
		numericTypesEEnum = createEEnum(NUMERIC_TYPES);
		parameterModeEEnum = createEEnum(PARAMETER_MODE);
		referentialActionEEnum = createEEnum(REFERENTIAL_ACTION);
		stringFeaturesEEnum = createEEnum(STRING_FEATURES);
		triggerActionTimeEEnum = createEEnum(TRIGGER_ACTION_TIME);
		triggerEventEEnum = createEEnum(TRIGGER_EVENT);
		triggerLevelEEnum = createEEnum(TRIGGER_LEVEL);
		unitEEnum = createEEnum(UNIT);
		xmlTypesEEnum = createEEnum(XML_TYPES);
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
		arrayEClass.getESuperTypes().add(this.getCollectionType());
		attributeEClass.getESuperTypes().add(this.getStructuralComponent());
		baseTableEClass.getESuperTypes().add(this.getTable());
		binaryStringTypeEClass.getESuperTypes().add(this.getPredefinedType());
		booleanTypeEClass.getESuperTypes().add(this.getPredefinedType());
		characterStringTypeEClass.getESuperTypes().add(this.getPredefinedType());
		collectionTypeEClass.getESuperTypes().add(this.getConstructedType());
		columnEClass.getESuperTypes().add(this.getStructuralComponent());
		columnConstraintEClass.getESuperTypes().add(this.getRestriction());
		constructedTypeEClass.getESuperTypes().add(this.getDataType());
		datetimeFeatureEClass.getESuperTypes().add(this.getFeature());
		datetimeTypeEClass.getESuperTypes().add(this.getPredefinedType());
		derivedTableEClass.getESuperTypes().add(this.getTable());
		distinctTypeEClass.getESuperTypes().add(this.getUserDefinedType());
		fieldEClass.getESuperTypes().add(this.getStructuralComponent());
		functionEClass.getESuperTypes().add(this.getBehaviouralComponent());
		intervalFeatureEClass.getESuperTypes().add(this.getFeature());
		intervalTypeEClass.getESuperTypes().add(this.getPredefinedType());
		multisetEClass.getESuperTypes().add(this.getCollectionType());
		methodParameterEClass.getESuperTypes().add(this.getParameter());
		notNullEClass.getESuperTypes().add(this.getColumnConstraint());
		numericFeatureEClass.getESuperTypes().add(this.getFeature());
		numericTypeEClass.getESuperTypes().add(this.getPredefinedType());
		parameterWithModeEClass.getESuperTypes().add(this.getParameter());
		predefinedTypeEClass.getESuperTypes().add(this.getDataType());
		primaryKeyEClass.getESuperTypes().add(this.getUniqueConstraint());
		procedureEClass.getESuperTypes().add(this.getBehaviouralComponent());
		rowEClass.getESuperTypes().add(this.getConstructedType());
		referenceTypeEClass.getESuperTypes().add(this.getConstructedType());
		referentialConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		stringFeatureEClass.getESuperTypes().add(this.getFeature());
		structuredTypeEClass.getESuperTypes().add(this.getUserDefinedType());
		tableCheckConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		tableConstraintEClass.getESuperTypes().add(this.getRestriction());
		triggerEClass.getESuperTypes().add(this.getRestriction());
		typedTableEClass.getESuperTypes().add(this.getBaseTable());
		uniqueConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		userDefinedTypeEClass.getESuperTypes().add(this.getDataType());
		viewEClass.getESuperTypes().add(this.getDerivedTable());
		xmlTypeEClass.getESuperTypes().add(this.getPredefinedType());

		// Initialize classes and features; add operations and parameters
		initEClass(arrayEClass, SQL2003_V2.ARRAY.class, "ARRAY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getARRAY_Num_elements(), ecorePackage.getEIntegerObject(), "num_elements", null, 1, 1, SQL2003_V2.ARRAY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Default(), ecorePackage.getEString(), "default", "", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Structured(), this.getStructuredType(), this.getStructuredType_Attributes(), "structured", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseTableEClass, BaseTable.class, "BaseTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviouralComponentEClass, BehaviouralComponent.class, "BehaviouralComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviouralComponent_Schema(), this.getSchema(), this.getSchema_BehaviouralComponents(), "schema", null, 1, 1, BehaviouralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviouralComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, BehaviouralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviouralComponent_Body(), ecorePackage.getEString(), "body", null, 0, 1, BehaviouralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviouralComponent_ParametersWithMode(), this.getParameterWithMode(), this.getParameterWithMode_BehaviouralComponent(), "parametersWithMode", null, 0, -1, BehaviouralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryStringTypeEClass, BinaryStringType.class, "BinaryStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryStringType_Descriptor(), this.getBinaryStringTypes(), "descriptor", null, 1, 1, BinaryStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryStringType_Length_def(), ecorePackage.getEIntegerObject(), "length_def", "1", 1, 1, BinaryStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanType_Descriptor(), this.getBooleanTypes(), "descriptor", null, 1, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterStringTypeEClass, CharacterStringType.class, "CharacterStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterStringType_Descriptor(), this.getCharacterStringTypes(), "descriptor", null, 1, 1, CharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStringType_Length_def(), ecorePackage.getEIntegerObject(), "length_def", "1", 1, 1, CharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionType_Super_type(), this.getCollectionType(), null, "super_type", null, 0, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionType_Type(), this.getDataType(), null, "type", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Table(), this.getTable(), this.getTable_Columns(), "table", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Default(), ecorePackage.getEString(), "default", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnConstraintEClass, ColumnConstraint.class, "ColumnConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructedTypeEClass, ConstructedType.class, "ConstructedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstructedType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ConstructedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Schema(), this.getSchema(), this.getSchema_Datatypes(), "schema", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datetimeFeatureEClass, Map.Entry.class, "DatetimeFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeFeature_Key(), this.getDatetimeFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datetimeTypeEClass, DatetimeType.class, "DatetimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeType_Descriptor(), this.getDatetimeTypes(), "descriptor", null, 1, 1, DatetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedTableEClass, DerivedTable.class, "DerivedTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedTable_Query_expression(), ecorePackage.getEString(), "query_expression", null, 0, 1, DerivedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distinctTypeEClass, DistinctType.class, "DistinctType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistinctType_Source_type(), this.getPredefinedType(), this.getPredefinedType_Is_source_of(), "source_type", null, 1, 1, DistinctType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistinctType_Features(), this.getFeature(), null, "features", null, 0, -1, DistinctType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Row(), this.getROW(), this.getROW_Fields(), "row", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Return_type(), this.getDataType(), null, "return_type", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalFeatureEClass, Map.Entry.class, "IntervalFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervalFeature_Key(), this.getIntervalFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalTypeEClass, IntervalType.class, "IntervalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervalType_Descriptor(), this.getIntervalTypes(), "descriptor", null, 1, 1, IntervalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multisetEClass, SQL2003_V2.MULTISET.class, "MULTISET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMethod_Body(), ecorePackage.getEString(), "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Override(), this.getMethod(), null, "override", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMethod_Structured(), this.getStructuredType(), this.getStructuredType_Methods(), "structured", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Return_type(), this.getDataType(), null, "return_type", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameters(), this.getMethodParameter(), this.getMethodParameter_Method(), "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodParameterEClass, MethodParameter.class, "MethodParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodParameter_Method(), this.getMethod(), this.getMethod_Parameters(), "method", null, 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notNullEClass, NotNull.class, "NotNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericFeatureEClass, Map.Entry.class, "NumericFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericFeature_Key(), this.getNumericFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericType_Descriptor(), this.getNumericTypes(), "descriptor", null, 1, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_Type(), this.getDataType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterWithModeEClass, ParameterWithMode.class, "ParameterWithMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterWithMode_Mode(), this.getParameterMode(), "mode", null, 1, 1, ParameterWithMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterWithMode_BehaviouralComponent(), this.getBehaviouralComponent(), this.getBehaviouralComponent_ParametersWithMode(), "behaviouralComponent", null, 1, 1, ParameterWithMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedTypeEClass, PredefinedType.class, "PredefinedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredefinedType_Is_source_of(), this.getDistinctType(), this.getDistinctType_Source_type(), "is_source_of", null, 0, -1, PredefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rowEClass, SQL2003_V2.ROW.class, "ROW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROW_Super_type(), this.getROW(), this.getROW_Sub_types(), "super_type", null, 0, 1, SQL2003_V2.ROW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROW_Fields(), this.getField(), this.getField_Row(), "fields", null, 1, -1, SQL2003_V2.ROW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROW_Sub_types(), this.getROW(), this.getROW_Super_type(), "sub_types", null, 0, -1, SQL2003_V2.ROW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType_Type(), this.getStructuredType(), null, "type", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referentialConstraintEClass, ReferentialConstraint.class, "ReferentialConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferentialConstraint_Delete_action(), this.getReferentialAction(), "delete_action", null, 0, 1, ReferentialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferentialConstraint_Update_action(), this.getReferentialAction(), "update_action", null, 0, 1, ReferentialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferentialConstraint_Match(), this.getMatchTypes(), "match", null, 0, 1, ReferentialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferentialConstraint_References(), this.getUniqueConstraint(), null, "references", null, 1, 1, ReferentialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestriction_Table(), this.getTable(), this.getTable_Restrictions(), "table", null, 1, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestriction_Columns(), this.getStructuralComponent(), this.getStructuralComponent_Restrictions(), "columns", null, 1, -1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_Name(), ecorePackage.getEString(), "name", null, 1, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_BehaviouralComponents(), this.getBehaviouralComponent(), this.getBehaviouralComponent_Schema(), "behaviouralComponents", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Datatypes(), this.getDataType(), this.getDataType_Schema(), "datatypes", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_Tables(), this.getTable(), this.getTable_Schema(), "tables", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_Domains(), this.getDomain(), this.getDomain_Schema(), "domains", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringFeatureEClass, Map.Entry.class, "StringFeature", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringFeature_Key(), this.getStringFeatures(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralComponentEClass, StructuralComponent.class, "StructuralComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuralComponent_Type(), this.getDataType(), null, "type", null, 1, 1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuralComponent_Views(), this.getView(), this.getView_Components(), "views", null, 0, -1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralComponent_Restrictions(), this.getRestriction(), this.getRestriction_Columns(), "restrictions", null, 0, -1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralComponent_Features(), this.getFeature(), null, "features", null, 0, -1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralComponent_Has_domain(), this.getDomain(), this.getDomain_Defines(), "has_domain", null, 0, 1, StructuralComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredTypeEClass, StructuredType.class, "StructuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredType_Is_final(), ecorePackage.getEBoolean(), "is_final", null, 0, 1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredType_Is_instantiable(), ecorePackage.getEBoolean(), "is_instantiable", null, 0, 1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredType_Super_type(), this.getStructuredType(), null, "super_type", null, 0, 1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredType_Attributes(), this.getAttribute(), this.getAttribute_Structured(), "attributes", null, 0, -1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredType_Methods(), this.getMethod(), this.getMethod_Structured(), "methods", null, 0, -1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredType_Typed(), this.getTypedTable(), this.getTypedTable_Structured(), "typed", null, 0, -1, StructuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Schema(), this.getSchema(), this.getSchema_Tables(), "schema", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getColumn(), this.getColumn_Table(), "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTable_Views(), this.getView(), this.getView_Tables(), "views", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTable_Restrictions(), this.getRestriction(), this.getRestriction_Table(), "restrictions", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tableCheckConstraintEClass, TableCheckConstraint.class, "TableCheckConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCheckConstraint_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, TableCheckConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, TableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Name(), ecorePackage.getEString(), "name", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Description(), this.getTriggerDescriptor(), this.getTriggerDescriptor_Trigger(), "description", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_UpdateColumns(), this.getStructuralComponent(), null, "updateColumns", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerDescriptorEClass, TriggerDescriptor.class, "TriggerDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerDescriptor_Event(), this.getTriggerEvent(), "event", null, 1, 1, TriggerDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggerDescriptor_ActionTime(), this.getTriggerActionTime(), "actionTime", null, 1, 1, TriggerDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggerDescriptor_TriggeredAction(), ecorePackage.getEString(), "triggeredAction", null, 0, 1, TriggerDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDescriptor_Trigger(), this.getTrigger(), this.getTrigger_Description(), "trigger", null, 1, 1, TriggerDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggerDescriptor_Level(), this.getTriggerLevel(), "level", null, 0, 1, TriggerDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedTableEClass, TypedTable.class, "TypedTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedTable_Structured(), this.getStructuredType(), this.getStructuredType_Typed(), "structured", null, 1, 1, TypedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedTable_Supertable(), this.getTypedTable(), this.getTypedTable_Subtables(), "supertable", null, 0, 1, TypedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedTable_Subtables(), this.getTypedTable(), this.getTypedTable_Supertable(), "subtables", null, 0, -1, TypedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDefinedTypeEClass, UserDefinedType.class, "UserDefinedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDefinedType_Name(), ecorePackage.getEString(), "name", null, 1, 1, UserDefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Tables(), this.getTable(), this.getTable_Views(), "tables", null, 1, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Components(), this.getStructuralComponent(), this.getStructuralComponent_Views(), "components", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTypeEClass, XMLType.class, "XMLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLType_Descriptor(), this.getXMLTypes(), "descriptor", null, 1, 1, XMLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Default(), ecorePackage.getEString(), "default", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Schema(), this.getSchema(), this.getSchema_Domains(), "schema", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Defines(), this.getStructuralComponent(), this.getStructuralComponent_Has_domain(), "defines", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryStringTypesEEnum, BinaryStringTypes.class, "BinaryStringTypes");
		addEEnumLiteral(binaryStringTypesEEnum, BinaryStringTypes.BINARYLARGEOBJECT);
		addEEnumLiteral(binaryStringTypesEEnum, BinaryStringTypes.BINARY);
		addEEnumLiteral(binaryStringTypesEEnum, BinaryStringTypes.BINARYVARYING);

		initEEnum(booleanTypesEEnum, BooleanTypes.class, "BooleanTypes");
		addEEnumLiteral(booleanTypesEEnum, BooleanTypes.BOOLEAN);

		initEEnum(characterStringTypesEEnum, CharacterStringTypes.class, "CharacterStringTypes");
		addEEnumLiteral(characterStringTypesEEnum, CharacterStringTypes.CHARACTER);
		addEEnumLiteral(characterStringTypesEEnum, CharacterStringTypes.CHARACTERVARYING);
		addEEnumLiteral(characterStringTypesEEnum, CharacterStringTypes.CHARACTERLARGEOBJECT);

		initEEnum(datetimeFeaturesEEnum, DatetimeFeatures.class, "DatetimeFeatures");
		addEEnumLiteral(datetimeFeaturesEEnum, DatetimeFeatures.PRECISION);

		initEEnum(datetimeTypesEEnum, DatetimeTypes.class, "DatetimeTypes");
		addEEnumLiteral(datetimeTypesEEnum, DatetimeTypes.DATE);
		addEEnumLiteral(datetimeTypesEEnum, DatetimeTypes.TIMEWITHTIMEZONE);
		addEEnumLiteral(datetimeTypesEEnum, DatetimeTypes.TIMEWITHOUTTIMEZONE);
		addEEnumLiteral(datetimeTypesEEnum, DatetimeTypes.TIMESTAMPWITHOUTTIMEZONE);
		addEEnumLiteral(datetimeTypesEEnum, DatetimeTypes.TIMESTAMPWITHTIMEZONE);

		initEEnum(intervalFeaturesEEnum, IntervalFeatures.class, "IntervalFeatures");
		addEEnumLiteral(intervalFeaturesEEnum, IntervalFeatures.START_LEADING_PRECISION);
		addEEnumLiteral(intervalFeaturesEEnum, IntervalFeatures.END_LEADING_PRECISION);
		addEEnumLiteral(intervalFeaturesEEnum, IntervalFeatures.LEADING_PRECISION);
		addEEnumLiteral(intervalFeaturesEEnum, IntervalFeatures.SECOND_PRECISION);

		initEEnum(intervalTypesEEnum, IntervalTypes.class, "IntervalTypes");
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.YEAR_MONTH);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.DAY_HOUR);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.DAY_MINUTE);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.DAY_SECOND);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.HOUR_MINUTE);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.HOUR_SECOND);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.MINUTE_SECOND);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.YEAR);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.MONTH);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.DAY);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.HOUR);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.MINUTE);
		addEEnumLiteral(intervalTypesEEnum, IntervalTypes.SECOND);

		initEEnum(matchTypesEEnum, MatchTypes.class, "MatchTypes");
		addEEnumLiteral(matchTypesEEnum, MatchTypes.SIMPLE);
		addEEnumLiteral(matchTypesEEnum, MatchTypes.PARTIAL);
		addEEnumLiteral(matchTypesEEnum, MatchTypes.TOTAL);

		initEEnum(multiplierEEnum, Multiplier.class, "Multiplier");
		addEEnumLiteral(multiplierEEnum, Multiplier.K);
		addEEnumLiteral(multiplierEEnum, Multiplier.M);
		addEEnumLiteral(multiplierEEnum, Multiplier.G);
		addEEnumLiteral(multiplierEEnum, Multiplier.T);
		addEEnumLiteral(multiplierEEnum, Multiplier.P);

		initEEnum(numericRadixEEnum, NumericRadix.class, "NumericRadix");
		addEEnumLiteral(numericRadixEEnum, NumericRadix.DECIMAL);
		addEEnumLiteral(numericRadixEEnum, NumericRadix.BINARY);

		initEEnum(numericFeaturesEEnum, NumericFeatures.class, "NumericFeatures");
		addEEnumLiteral(numericFeaturesEEnum, NumericFeatures.PRECISION);
		addEEnumLiteral(numericFeaturesEEnum, NumericFeatures.SCALE);
		addEEnumLiteral(numericFeaturesEEnum, NumericFeatures.RADIX);

		initEEnum(numericTypesEEnum, NumericTypes.class, "NumericTypes");
		addEEnumLiteral(numericTypesEEnum, NumericTypes.NUMERIC);
		addEEnumLiteral(numericTypesEEnum, NumericTypes.DECIMAL);
		addEEnumLiteral(numericTypesEEnum, NumericTypes.SMALLINT);
		addEEnumLiteral(numericTypesEEnum, NumericTypes.INTEGER);
		addEEnumLiteral(numericTypesEEnum, NumericTypes.BIGINT);
		addEEnumLiteral(numericTypesEEnum, NumericTypes.FLOAT);
		addEEnumLiteral(numericTypesEEnum, NumericTypes.REAL);
		addEEnumLiteral(numericTypesEEnum, NumericTypes.DOUBLEPRECISION);

		initEEnum(parameterModeEEnum, ParameterMode.class, "ParameterMode");
		addEEnumLiteral(parameterModeEEnum, ParameterMode.IN);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.OUT);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.INOUT);

		initEEnum(referentialActionEEnum, ReferentialAction.class, "ReferentialAction");
		addEEnumLiteral(referentialActionEEnum, ReferentialAction.CASCADE);
		addEEnumLiteral(referentialActionEEnum, ReferentialAction.SET_NULL);
		addEEnumLiteral(referentialActionEEnum, ReferentialAction.RESTRICT);
		addEEnumLiteral(referentialActionEEnum, ReferentialAction.NO_ACTION);
		addEEnumLiteral(referentialActionEEnum, ReferentialAction.SET_DEFAULT);

		initEEnum(stringFeaturesEEnum, StringFeatures.class, "StringFeatures");
		addEEnumLiteral(stringFeaturesEEnum, StringFeatures.LENGTH);
		addEEnumLiteral(stringFeaturesEEnum, StringFeatures.UNIT);
		addEEnumLiteral(stringFeaturesEEnum, StringFeatures.MULTIPLIER);

		initEEnum(triggerActionTimeEEnum, TriggerActionTime.class, "TriggerActionTime");
		addEEnumLiteral(triggerActionTimeEEnum, TriggerActionTime.BEFORE);
		addEEnumLiteral(triggerActionTimeEEnum, TriggerActionTime.AFTER);

		initEEnum(triggerEventEEnum, TriggerEvent.class, "TriggerEvent");
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.INSERT);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.DELETE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.UPDATE);

		initEEnum(triggerLevelEEnum, TriggerLevel.class, "TriggerLevel");
		addEEnumLiteral(triggerLevelEEnum, TriggerLevel.ROW_LEVEL);
		addEEnumLiteral(triggerLevelEEnum, TriggerLevel.STATEMENT_LEVEL);

		initEEnum(unitEEnum, Unit.class, "Unit");
		addEEnumLiteral(unitEEnum, Unit.CHARACTERS);
		addEEnumLiteral(unitEEnum, Unit.OCTETS);

		initEEnum(xmlTypesEEnum, XMLTypes.class, "XMLTypes");
		addEEnumLiteral(xmlTypesEEnum, XMLTypes.XMLTYPE);

		// Create resource
		createResource(eNS_URI);
	}

} //SQL2003_V2PackageImpl
