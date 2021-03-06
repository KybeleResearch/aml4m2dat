/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import SQL2003_V3.util.SQL2003_V3AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SQL2003_V3ItemProviderAdapterFactory extends SQL2003_V3AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQL2003_V3ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.ARRAY} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARRAYItemProvider arrayItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.ARRAY}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createARRAYAdapter() {
		if (arrayItemProvider == null) {
			arrayItemProvider = new ARRAYItemProvider(this);
		}

		return arrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.BaseTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseTableItemProvider baseTableItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.BaseTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseTableAdapter() {
		if (baseTableItemProvider == null) {
			baseTableItemProvider = new BaseTableItemProvider(this);
		}

		return baseTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.BinaryStringType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryStringTypeItemProvider binaryStringTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.BinaryStringType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryStringTypeAdapter() {
		if (binaryStringTypeItemProvider == null) {
			binaryStringTypeItemProvider = new BinaryStringTypeItemProvider(this);
		}

		return binaryStringTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.BooleanType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTypeItemProvider booleanTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanTypeAdapter() {
		if (booleanTypeItemProvider == null) {
			booleanTypeItemProvider = new BooleanTypeItemProvider(this);
		}

		return booleanTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.CharacterStringType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterStringTypeItemProvider characterStringTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.CharacterStringType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacterStringTypeAdapter() {
		if (characterStringTypeItemProvider == null) {
			characterStringTypeItemProvider = new CharacterStringTypeItemProvider(this);
		}

		return characterStringTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Column} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnItemProvider columnItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnAdapter() {
		if (columnItemProvider == null) {
			columnItemProvider = new ColumnItemProvider(this);
		}

		return columnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatetimeFeatureItemProvider datetimeFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatetimeFeatureAdapter() {
		if (datetimeFeatureItemProvider == null) {
			datetimeFeatureItemProvider = new DatetimeFeatureItemProvider(this);
		}

		return datetimeFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.DatetimeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatetimeTypeItemProvider datetimeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.DatetimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatetimeTypeAdapter() {
		if (datetimeTypeItemProvider == null) {
			datetimeTypeItemProvider = new DatetimeTypeItemProvider(this);
		}

		return datetimeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.DerivedTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedTableItemProvider derivedTableItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.DerivedTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerivedTableAdapter() {
		if (derivedTableItemProvider == null) {
			derivedTableItemProvider = new DerivedTableItemProvider(this);
		}

		return derivedTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.DistinctType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistinctTypeItemProvider distinctTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.DistinctType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistinctTypeAdapter() {
		if (distinctTypeItemProvider == null) {
			distinctTypeItemProvider = new DistinctTypeItemProvider(this);
		}

		return distinctTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Field} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldItemProvider fieldItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldAdapter() {
		if (fieldItemProvider == null) {
			fieldItemProvider = new FieldItemProvider(this);
		}

		return fieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalFeatureItemProvider intervalFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervalFeatureAdapter() {
		if (intervalFeatureItemProvider == null) {
			intervalFeatureItemProvider = new IntervalFeatureItemProvider(this);
		}

		return intervalFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.IntervalType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalTypeItemProvider intervalTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.IntervalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervalTypeAdapter() {
		if (intervalTypeItemProvider == null) {
			intervalTypeItemProvider = new IntervalTypeItemProvider(this);
		}

		return intervalTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.MULTISET} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MULTISETItemProvider multisetItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.MULTISET}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMULTISETAdapter() {
		if (multisetItemProvider == null) {
			multisetItemProvider = new MULTISETItemProvider(this);
		}

		return multisetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Method} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodItemProvider methodItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodAdapter() {
		if (methodItemProvider == null) {
			methodItemProvider = new MethodItemProvider(this);
		}

		return methodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.MethodParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterItemProvider methodParameterItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.MethodParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodParameterAdapter() {
		if (methodParameterItemProvider == null) {
			methodParameterItemProvider = new MethodParameterItemProvider(this);
		}

		return methodParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.NotNull} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotNullItemProvider notNullItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.NotNull}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotNullAdapter() {
		if (notNullItemProvider == null) {
			notNullItemProvider = new NotNullItemProvider(this);
		}

		return notNullItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericFeatureItemProvider numericFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericFeatureAdapter() {
		if (numericFeatureItemProvider == null) {
			numericFeatureItemProvider = new NumericFeatureItemProvider(this);
		}

		return numericFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.NumericType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericTypeItemProvider numericTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.NumericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericTypeAdapter() {
		if (numericTypeItemProvider == null) {
			numericTypeItemProvider = new NumericTypeItemProvider(this);
		}

		return numericTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.ParameterWithMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterWithModeItemProvider parameterWithModeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.ParameterWithMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterWithModeAdapter() {
		if (parameterWithModeItemProvider == null) {
			parameterWithModeItemProvider = new ParameterWithModeItemProvider(this);
		}

		return parameterWithModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.PrimaryKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyItemProvider primaryKeyItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimaryKeyAdapter() {
		if (primaryKeyItemProvider == null) {
			primaryKeyItemProvider = new PrimaryKeyItemProvider(this);
		}

		return primaryKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Procedure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureItemProvider procedureItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Procedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcedureAdapter() {
		if (procedureItemProvider == null) {
			procedureItemProvider = new ProcedureItemProvider(this);
		}

		return procedureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.ROW} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROWItemProvider rowItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.ROW}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROWAdapter() {
		if (rowItemProvider == null) {
			rowItemProvider = new ROWItemProvider(this);
		}

		return rowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.ReferenceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeItemProvider referenceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceTypeAdapter() {
		if (referenceTypeItemProvider == null) {
			referenceTypeItemProvider = new ReferenceTypeItemProvider(this);
		}

		return referenceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.ReferentialConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferentialConstraintItemProvider referentialConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.ReferentialConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferentialConstraintAdapter() {
		if (referentialConstraintItemProvider == null) {
			referentialConstraintItemProvider = new ReferentialConstraintItemProvider(this);
		}

		return referentialConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Schema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaItemProvider schemaItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchemaAdapter() {
		if (schemaItemProvider == null) {
			schemaItemProvider = new SchemaItemProvider(this);
		}

		return schemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringFeatureItemProvider stringFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringFeatureAdapter() {
		if (stringFeatureItemProvider == null) {
			stringFeatureItemProvider = new StringFeatureItemProvider(this);
		}

		return stringFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.StructuredType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredTypeItemProvider structuredTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.StructuredType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredTypeAdapter() {
		if (structuredTypeItemProvider == null) {
			structuredTypeItemProvider = new StructuredTypeItemProvider(this);
		}

		return structuredTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.TableCheckConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCheckConstraintItemProvider tableCheckConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.TableCheckConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableCheckConstraintAdapter() {
		if (tableCheckConstraintItemProvider == null) {
			tableCheckConstraintItemProvider = new TableCheckConstraintItemProvider(this);
		}

		return tableCheckConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.TriggerDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerDescriptorItemProvider triggerDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.TriggerDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerDescriptorAdapter() {
		if (triggerDescriptorItemProvider == null) {
			triggerDescriptorItemProvider = new TriggerDescriptorItemProvider(this);
		}

		return triggerDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.TypedTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedTableItemProvider typedTableItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.TypedTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypedTableAdapter() {
		if (typedTableItemProvider == null) {
			typedTableItemProvider = new TypedTableItemProvider(this);
		}

		return typedTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.UniqueConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueConstraintItemProvider uniqueConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.UniqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniqueConstraintAdapter() {
		if (uniqueConstraintItemProvider == null) {
			uniqueConstraintItemProvider = new UniqueConstraintItemProvider(this);
		}

		return uniqueConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.View} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewItemProvider viewItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewAdapter() {
		if (viewItemProvider == null) {
			viewItemProvider = new ViewItemProvider(this);
		}

		return viewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.XMLType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeItemProvider xmlTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.XMLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMLTypeAdapter() {
		if (xmlTypeItemProvider == null) {
			xmlTypeItemProvider = new XMLTypeItemProvider(this);
		}

		return xmlTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SQL2003_V3.DomainConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainConstraintItemProvider domainConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link SQL2003_V3.DomainConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainConstraintAdapter() {
		if (domainConstraintItemProvider == null) {
			domainConstraintItemProvider = new DomainConstraintItemProvider(this);
		}

		return domainConstraintItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (arrayItemProvider != null) arrayItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (baseTableItemProvider != null) baseTableItemProvider.dispose();
		if (binaryStringTypeItemProvider != null) binaryStringTypeItemProvider.dispose();
		if (booleanTypeItemProvider != null) booleanTypeItemProvider.dispose();
		if (characterStringTypeItemProvider != null) characterStringTypeItemProvider.dispose();
		if (columnItemProvider != null) columnItemProvider.dispose();
		if (datetimeFeatureItemProvider != null) datetimeFeatureItemProvider.dispose();
		if (datetimeTypeItemProvider != null) datetimeTypeItemProvider.dispose();
		if (derivedTableItemProvider != null) derivedTableItemProvider.dispose();
		if (distinctTypeItemProvider != null) distinctTypeItemProvider.dispose();
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (domainConstraintItemProvider != null) domainConstraintItemProvider.dispose();
		if (fieldItemProvider != null) fieldItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (intervalFeatureItemProvider != null) intervalFeatureItemProvider.dispose();
		if (intervalTypeItemProvider != null) intervalTypeItemProvider.dispose();
		if (multisetItemProvider != null) multisetItemProvider.dispose();
		if (methodItemProvider != null) methodItemProvider.dispose();
		if (methodParameterItemProvider != null) methodParameterItemProvider.dispose();
		if (notNullItemProvider != null) notNullItemProvider.dispose();
		if (numericFeatureItemProvider != null) numericFeatureItemProvider.dispose();
		if (numericTypeItemProvider != null) numericTypeItemProvider.dispose();
		if (parameterWithModeItemProvider != null) parameterWithModeItemProvider.dispose();
		if (primaryKeyItemProvider != null) primaryKeyItemProvider.dispose();
		if (procedureItemProvider != null) procedureItemProvider.dispose();
		if (rowItemProvider != null) rowItemProvider.dispose();
		if (referenceTypeItemProvider != null) referenceTypeItemProvider.dispose();
		if (referentialConstraintItemProvider != null) referentialConstraintItemProvider.dispose();
		if (schemaItemProvider != null) schemaItemProvider.dispose();
		if (stringFeatureItemProvider != null) stringFeatureItemProvider.dispose();
		if (structuredTypeItemProvider != null) structuredTypeItemProvider.dispose();
		if (tableCheckConstraintItemProvider != null) tableCheckConstraintItemProvider.dispose();
		if (triggerItemProvider != null) triggerItemProvider.dispose();
		if (triggerDescriptorItemProvider != null) triggerDescriptorItemProvider.dispose();
		if (typedTableItemProvider != null) typedTableItemProvider.dispose();
		if (uniqueConstraintItemProvider != null) uniqueConstraintItemProvider.dispose();
		if (viewItemProvider != null) viewItemProvider.dispose();
		if (xmlTypeItemProvider != null) xmlTypeItemProvider.dispose();
	}

}
