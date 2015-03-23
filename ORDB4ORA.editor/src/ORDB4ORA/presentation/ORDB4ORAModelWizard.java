/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA.presentation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import ORDB4ORA.ANSICharacterTypes;
import ORDB4ORA.ANSINumberTypes;
import ORDB4ORA.BuiltInCharacterTypes;
import ORDB4ORA.BuiltInDatetimeTypes;
import ORDB4ORA.BuiltInLOBType;
import ORDB4ORA.BuiltInLongAndRawTypes;
import ORDB4ORA.BuiltInROWIDType;
import ORDB4ORA.BuiltNumberTypes;
import ORDB4ORA.Model;
import ORDB4ORA.ORDB4ORAFactory;
import ORDB4ORA.ORDB4ORAPackage;
import ORDB4ORA.SuppliedAnyTypes;
import ORDB4ORA.SuppliedMediaTypes;
import ORDB4ORA.SuppliedSpacialTypes;
import ORDB4ORA.SuppliedXMLTypes;
import ORDB4ORA.provider.ORDB4ORAEditPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;


/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ORDB4ORAModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ORDB4ORAEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ORDB4ORAEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORDB4ORAPackage ordb4ORAPackage = ORDB4ORAPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORDB4ORAFactory ordb4ORAFactory = ordb4ORAPackage.getORDB4ORAFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORDB4ORAModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORDB4ORAModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ORDB4ORAEditorPlugin.INSTANCE.getImage("full/wizban/NewORDB4ORA")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : ordb4ORAPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)ordb4ORAPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EObject rootObject = ordb4ORAFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = createInitialModel();
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}
							//Add predefined types to Model:
							
							/*BuiltIn Types*/

							int size = BuiltInCharacterTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.BuiltInCharacterType dt = ordb4ORAFactory.createBuiltInCharacterType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(BuiltInCharacterTypes.get(i));
								dt.setSize_Min(1);
								dt.setSize_Max(4000);
								if( (BuiltInCharacterTypes.get(i) == BuiltInCharacterTypes.CHAR)|| (BuiltInCharacterTypes.get(i) == BuiltInCharacterTypes.NCHAR))
								{
									dt.setSize_Def(1);
									dt.setSize_Max(2000);
								}
									
							}
							
							size = BuiltNumberTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.BuiltInNumberType dt = ordb4ORAFactory.createBuiltInNumberType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(BuiltNumberTypes.get(i));
								if(BuiltNumberTypes.get(i) == BuiltNumberTypes.NUMBER)
								{
									dt.setScale_Min(-84);
									dt.setScale_Max(127);
									dt.setPrecision_Max(38);
									dt.setPrecision_Mn(1);
								}
							}
							
							size = BuiltInLongAndRawTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.LongAndRawType dt = ordb4ORAFactory.createLongAndRawType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(BuiltInLongAndRawTypes.get(i));
								if(BuiltInLongAndRawTypes.get(i) == BuiltInLongAndRawTypes.RAW)
								{
									dt.setSize_Min(1);
									dt.setSize_Max(2000);
								}
							}
							
							size = BuiltInDatetimeTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.DatetimeType dt = ordb4ORAFactory.createDatetimeType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(BuiltInDatetimeTypes.get(i));
								if((BuiltInDatetimeTypes.get(i) == BuiltInDatetimeTypes.INTERVALDAYTOSECOND)||(BuiltInDatetimeTypes.get(i) == BuiltInDatetimeTypes.TIMESTAMP)||(BuiltInDatetimeTypes.get(i) == BuiltInDatetimeTypes.TIMESTAMPWITHLOCALTIMEZONE)||(BuiltInDatetimeTypes.get(i) == BuiltInDatetimeTypes.TIMESTAMPWITHTIMEZONE))
								{
									dt.setSecondPrecision_Def(6);
									dt.setSecondPrecision_Max(9);
									dt.setSecondPrecision_Min(0);
								}
								
								if(BuiltInDatetimeTypes.get(i) == BuiltInDatetimeTypes.INTERVALDAYTOSECOND)
								{
									dt.setDayPrecision_Def(2);
									dt.setDayPrecision_Max(9);
									dt.setDayPrecision_Min(0);
								}
								
								if(BuiltInDatetimeTypes.get(i) == BuiltInDatetimeTypes.INTERVALYEARTOMONTH)
								{
									dt.setYearPrecision_Def(2);
									dt.setYearPrecision_Max(9);
									dt.setYearPrecision_Min(0);
								}
							}
							
							size = BuiltInLOBType.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.LOBType dt = ordb4ORAFactory.createLOBType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(BuiltInLOBType.get(i));
							}
							
							size = BuiltInROWIDType.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.ROWIDType dt = ordb4ORAFactory.createROWIDType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(BuiltInROWIDType.get(i));
								
								if(BuiltInROWIDType.get(i) == BuiltInROWIDType.UROWID)
								{
									dt.setSize_Min(1);
									dt.setSize_Max(4000);
								}
							}
							
							/*ANSI Types*/
							
							size = ANSICharacterTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.ANSICharacterType dt = ordb4ORAFactory.createANSICharacterType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(ANSICharacterTypes.get(i));
							}
							
							size = ANSINumberTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.ANSINumberType dt = ordb4ORAFactory.createANSINumberType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(ANSINumberTypes.get(i));
							}
							
							/*ANY Types*/
							
							size = SuppliedAnyTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.AnyType dt = ordb4ORAFactory.createAnyType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(SuppliedAnyTypes.get(i));
							}
							
							size = SuppliedXMLTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.XMLType dt = ordb4ORAFactory.createXMLType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(SuppliedXMLTypes.get(i));
							}
							
							size = SuppliedSpacialTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.SpacialType dt = ordb4ORAFactory.createSpacialType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(SuppliedSpacialTypes.get(i));
							}
							
							size = SuppliedMediaTypes.values().length;
							for(int i = 0; i<size; i++)
							{
								ORDB4ORA.MediaType dt = ordb4ORAFactory.createMediaType();
								dt.setModel((Model)rootObject);
								dt.setDescriptor(SuppliedMediaTypes.get(i));
							}
														
							
							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							resource.save(options);
						}
						catch (Exception exception) {
							ORDB4ORAEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			ORDB4ORAEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ORDB4ORAModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ORDB4ORAModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(ORDB4ORAEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ORDB4ORAModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ORDB4ORAModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}
			
			int modelIndex = 0;//ADDED
			for (String objectName : getInitialObjectNames()) {
				if(objectName.equals("Model"))//ADDED
					modelIndex = initialObjectField.getItemCount();
				initialObjectField.add(getLabel(objectName));
				
			}

				initialObjectField.select(modelIndex);//ADDED

				initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return ORDB4ORAEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				ORDB4ORAEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ORDB4ORAModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ORDB4ORAModelWizard_label"));
		newFileCreationPage.setDescription(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ORDB4ORAModelWizard_description"));
		newFileCreationPage.setFileName(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ORDB4ORAEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ORDB4ORAEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new ORDB4ORAModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_ORDB4ORAModelWizard_label"));
		initialObjectCreationPage.setDescription(ORDB4ORAEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}
	 

}
