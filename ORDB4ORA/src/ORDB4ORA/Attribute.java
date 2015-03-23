/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.Attribute#getStructured <em>Structured</em>}</li>
 *   <li>{@link ORDB4ORA.Attribute#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends StructuralComponent {
	/**
	 * Returns the value of the '<em><b>Structured</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ORDB4ORA.StructuredType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured</em>' container reference.
	 * @see #setStructured(StructuredType)
	 * @see ORDB4ORA.ORDB4ORAPackage#getAttribute_Structured()
	 * @see ORDB4ORA.StructuredType#getAttribute
	 * @model opposite="attribute" transient="false"
	 * @generated
	 */
	StructuredType getStructured();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Attribute#getStructured <em>Structured</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured</em>' container reference.
	 * @see #getStructured()
	 * @generated
	 */
	void setStructured(StructuredType value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see ORDB4ORA.ORDB4ORAPackage#getAttribute_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link ORDB4ORA.Attribute#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

} // Attribute
