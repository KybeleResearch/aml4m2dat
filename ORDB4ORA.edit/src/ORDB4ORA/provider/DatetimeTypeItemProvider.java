/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.provider;


import ORDB4ORA.BuiltInDatetimeTypes;
import ORDB4ORA.DatetimeType;
import ORDB4ORA.ORDB4ORAPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ORDB4ORA.DatetimeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatetimeTypeItemProvider
	extends BuiltInTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptorPropertyDescriptor(object);
			addSecondPrecision_MinPropertyDescriptor(object);
			addSecondPrecision_MaxPropertyDescriptor(object);
			addSecondPrecision_DefPropertyDescriptor(object);
			addDayPrecision_MinPropertyDescriptor(object);
			addDayPrecision_MaxPropertyDescriptor(object);
			addDayPrecision_DefPropertyDescriptor(object);
			addYearPrecision_MinPropertyDescriptor(object);
			addYearPrecision_MaxPropertyDescriptor(object);
			addYearPrecision_DefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Descriptor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_Descriptor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_Descriptor_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__DESCRIPTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Precision Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondPrecision_MinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_SecondPrecision_Min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_SecondPrecision_Min_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__SECOND_PRECISION_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Precision Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondPrecision_MaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_SecondPrecision_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_SecondPrecision_Max_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__SECOND_PRECISION_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Precision Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondPrecision_DefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_SecondPrecision_Def_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_SecondPrecision_Def_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__SECOND_PRECISION_DEF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Day Precision Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDayPrecision_MinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_DayPrecision_Min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_DayPrecision_Min_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__DAY_PRECISION_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Day Precision Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDayPrecision_MaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_DayPrecision_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_DayPrecision_Max_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__DAY_PRECISION_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Day Precision Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDayPrecision_DefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_DayPrecision_Def_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_DayPrecision_Def_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__DAY_PRECISION_DEF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Year Precision Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearPrecision_MinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_YearPrecision_Min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_YearPrecision_Min_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__YEAR_PRECISION_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Year Precision Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearPrecision_MaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_YearPrecision_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_YearPrecision_Max_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__YEAR_PRECISION_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Year Precision Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearPrecision_DefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatetimeType_YearPrecision_Def_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatetimeType_YearPrecision_Def_feature", "_UI_DatetimeType_type"),
				 ORDB4ORAPackage.Literals.DATETIME_TYPE__YEAR_PRECISION_DEF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DatetimeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatetimeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BuiltInDatetimeTypes labelValue = ((DatetimeType)object).getDescriptor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DatetimeType_type") :
			getString("_UI_DatetimeType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DatetimeType.class)) {
			case ORDB4ORAPackage.DATETIME_TYPE__DESCRIPTOR:
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MIN:
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_MAX:
			case ORDB4ORAPackage.DATETIME_TYPE__SECOND_PRECISION_DEF:
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MIN:
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_MAX:
			case ORDB4ORAPackage.DATETIME_TYPE__DAY_PRECISION_DEF:
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MIN:
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_MAX:
			case ORDB4ORAPackage.DATETIME_TYPE__YEAR_PRECISION_DEF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
