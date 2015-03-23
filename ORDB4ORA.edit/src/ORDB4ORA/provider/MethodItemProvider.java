/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.provider;


import ORDB4ORA.BasicTypes;
import ORDB4ORA.Datatype;
import ORDB4ORA.LOBType;
import ORDB4ORA.Method;
import ORDB4ORA.MethodParameter;
import ORDB4ORA.NestedTableType;
import ORDB4ORA.ORDB4ORAFactory;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.Parameter;
import ORDB4ORA.PrimitiveType;
import ORDB4ORA.ReferenceType;
import ORDB4ORA.StructuredType;
import ORDB4ORA.Varray;

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
 * This is the item provider adapter for a {@link ORDB4ORA.Method} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodItemProvider
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
	public MethodItemProvider(AdapterFactory adapterFactory) {
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
			addOverridePropertyDescriptor(object);
			addReturnTypePropertyDescriptor(object);
			addBodyPropertyDescriptor(object);
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
				 getString("_UI_Method_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_Name_feature", "_UI_Method_type"),
				 ORDB4ORAPackage.Literals.METHOD__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_override_feature", "_UI_Method_type"),
				 ORDB4ORAPackage.Literals.METHOD__OVERRIDE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_returnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_returnType_feature", "_UI_Method_type"),
				 ORDB4ORAPackage.Literals.METHOD__RETURN_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_Body_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_Body_feature", "_UI_Method_type"),
				 ORDB4ORAPackage.Literals.METHOD__BODY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ORDB4ORAPackage.Literals.METHOD__PARAMETERS);
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
	 * This returns Method.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Method"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String name;
		String override = "";
		String returnType = "";
		String parameters = "";
		
		Datatype returnTypeObject;
		EList<MethodParameter> parametersList;

		/*Name*/
		name = ((Method)object).getName(); //nombre del método
		if(name == null || name.length() == 0) //si el nombre del método no existe se retorna el siguiente String
			return getString("_UI_Method_type");

		
		/*Override*/
		if(((Method)object).getOverride() != null) //método al que sobreescribe, si existiera
			override = "override";//si existe se agrega el valor "override"
		
		
		/*Return Type*/
		returnTypeObject = ((Method)object).getReturnType(); //tipo de retorno del método
		
		
		returnType = (returnTypeObject == null)?"":returnTypeObject.friendlyName();//si no existe, no se le agrega return type
		
		
		
		/*Parameters*/
		parametersList = ((Method)object).getParameters(); //parámetros del método
		if(!parametersList.isEmpty())
		{
			int posUltimo = parametersList.size()-1;
			for (int i = 0; i<posUltimo; i++) {
				parameters += parametersList.get(i).getType().friendlyName() + " " + parametersList.get(i).getName()+",";//se van concatenando los pares de valores "tipo" y "nombre", seguido de coma 
			}
			parameters += parametersList.get(posUltimo).getType().friendlyName() + " " + parametersList.get(posUltimo).getName();//el último par de valores no lleva coma al final
			
		} 

		return getString("_UI_Method_type") + " " + override + " " + returnType + " " + name + "(" + parameters + ") <<METHOD>>";//retorno del String con el formato descripto
			
			
			/*INICIO CODIGO ORIGINAL*/
//			String label = ((Method)object).getName(); 
//			return name == null || name.length() == 0 ?
//					getString("_UI_Method_type") :
//					getString("_UI_Method_type") + " " + name;
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

		switch (notification.getFeatureID(Method.class)) {
			case ORDB4ORAPackage.METHOD__NAME:
			case ORDB4ORAPackage.METHOD__BODY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ORDB4ORAPackage.METHOD__PARAMETERS:
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
				(ORDB4ORAPackage.Literals.METHOD__PARAMETERS,
				 ORDB4ORAFactory.eINSTANCE.createMethodParameter()));
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
