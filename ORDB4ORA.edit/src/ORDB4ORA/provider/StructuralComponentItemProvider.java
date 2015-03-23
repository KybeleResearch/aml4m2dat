/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.provider;


import ORDB4ORA.Attribute;
import ORDB4ORA.Datatype;
import ORDB4ORA.Feature;
import ORDB4ORA.ForeignKey;
import ORDB4ORA.NotNull;
import ORDB4ORA.ORDB4ORAFactory;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.PrimaryKey;
import ORDB4ORA.Restriction;
import ORDB4ORA.StructuralComponent;
import ORDB4ORA.Unique;
import ORDB4ORA.impl.FeatureImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ORDB4ORA.StructuralComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuralComponentItemProvider
	extends ItemProviderAdapter
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
	public StructuralComponentItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addRestrictionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuralComponent_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuralComponent_Name_feature", "_UI_StructuralComponent_type"),
				 ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuralComponent_Type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuralComponent_Type_feature", "_UI_StructuralComponent_type"),
				 ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restrictions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestrictionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuralComponent_restrictions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuralComponent_restrictions_feature", "_UI_StructuralComponent_type"),
				 ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__RESTRICTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__FEATURES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns StructuralComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructuralComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {

		String name = "";
		Datatype typeObject;
		String type = "";
		String features = "";
		String restrictions = "";
		String resultado = "";

		
		/*Name*/
		name = ((StructuralComponent)object).getName(); //nombre del atributo
		
		if(name == null || name.length() == 0) //si el nombre del atributo no existe se retorna el siguiente String
			return getString("_UI_StructuralComponent_type");
		
		/* Type */
		typeObject = ((StructuralComponent)object).getType();
		type = (typeObject == null)? "" : typeObject.friendlyName();
		
		/* Restrictions */
		EList <Restriction> restrictionList = ((StructuralComponent)object).getRestrictions();
		Restriction res;
		Boolean noPK = true;
		Boolean noUNIQUE = true;
		Boolean noNOTNULL = true;
		Boolean noFK = true;
		
		if (!restrictionList.isEmpty()) {
			System.err.println("No empty: " + restrictionList.size());
			for (int i = 0; i<restrictionList.size(); i++) {
				res = (Restriction)restrictionList.get(i);
				if ((res instanceof PrimaryKey) && (noPK)) {
					restrictions += " <<PK>>";
					noPK = false;
				}
				else if ((res instanceof Unique) && (noUNIQUE)) {
					restrictions += " <<UNIQUE>>";
					noUNIQUE = false;
				} 
				else if ((res instanceof NotNull) && (noNOTNULL)) {
					restrictions += " <<NOT NULL>>";
					noNOTNULL = false;
				}
				else if ((res instanceof ForeignKey) && (noFK)) {
					restrictions += " <<FK>>";
					noFK = false;
				}
			}
		}
		
		/*Features*/
		EList<Feature> featureList = ((StructuralComponent)object).getFeatures(); //features del atributo
		if(!featureList.isEmpty())
		{
			int posUltimo = featureList.size()-1;
			
			for(int i=0; i< posUltimo;i++)
			{
				features += ((FeatureImpl) featureList.get(i)).friendlyName();//se van concatenando los pares de valores "Key" y "Value", seguido de espacio	
			}
			features += ((FeatureImpl) featureList.get(posUltimo)).friendlyName();//el último par de valores no lleva espacio al final
			resultado = getString("_UI_StructuralComponent_type") + " " + name + " : " + type + "(" + features + ")" + restrictions;//retorno del String con el formato descripto 
		}
		else
			resultado = getString("_UI_StructuralComponent_type") + " " + name + " : " + type + restrictions;//retorno del String con el formato descripto
		

		return resultado;

		/*INICIO CODIGO ORIGINAL*/
		//String label = ((Attribute)object).getName();
		//return label == null || label.length() == 0 ?
		//	getString("_UI_Attribute_type") :
		//	getString("_UI_Attribute_type") + " " + label;
		/*FIN CODIGO ORIGINAL*/
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

		switch (notification.getFeatureID(StructuralComponent.class)) {
			case ORDB4ORAPackage.STRUCTURAL_COMPONENT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ORDB4ORAPackage.STRUCTURAL_COMPONENT__FEATURES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__FEATURES,
				 ORDB4ORAFactory.eINSTANCE.create(ORDB4ORAPackage.Literals.CHARACTER_FEATURE)));

		newChildDescriptors.add
			(createChildParameter
				(ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__FEATURES,
				 ORDB4ORAFactory.eINSTANCE.create(ORDB4ORAPackage.Literals.DATETIME_FEATURE)));

		newChildDescriptors.add
			(createChildParameter
				(ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__FEATURES,
				 ORDB4ORAFactory.eINSTANCE.create(ORDB4ORAPackage.Literals.INTERVAL_FEATURE)));

		newChildDescriptors.add
			(createChildParameter
				(ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__FEATURES,
				 ORDB4ORAFactory.eINSTANCE.create(ORDB4ORAPackage.Literals.NUMBER_FEATURE)));

		newChildDescriptors.add
			(createChildParameter
				(ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__FEATURES,
				 ORDB4ORAFactory.eINSTANCE.create(ORDB4ORAPackage.Literals.RAW_FEATURE)));

		newChildDescriptors.add
			(createChildParameter
				(ORDB4ORAPackage.Literals.STRUCTURAL_COMPONENT__FEATURES,
				 ORDB4ORAFactory.eINSTANCE.create(ORDB4ORAPackage.Literals.ROW_FEATURE)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ORDB4ORAEditPlugin.INSTANCE;
	}

}
