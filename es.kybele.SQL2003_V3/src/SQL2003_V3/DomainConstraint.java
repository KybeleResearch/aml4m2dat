/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V3.DomainConstraint#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V3.SQL2003_V3Package#getDomainConstraint()
 * @model
 * @generated
 */
public interface DomainConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SQL2003_V3.Domain#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Domain)
	 * @see SQL2003_V3.SQL2003_V3Package#getDomainConstraint_Domain()
	 * @see SQL2003_V3.Domain#getConstraint
	 * @model opposite="constraint" required="true"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link SQL2003_V3.DomainConstraint#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

} // DomainConstraint
