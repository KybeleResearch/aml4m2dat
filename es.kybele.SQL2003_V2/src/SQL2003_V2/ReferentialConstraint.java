/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referential Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_V2.ReferentialConstraint#getDelete_action <em>Delete action</em>}</li>
 *   <li>{@link SQL2003_V2.ReferentialConstraint#getUpdate_action <em>Update action</em>}</li>
 *   <li>{@link SQL2003_V2.ReferentialConstraint#getMatch <em>Match</em>}</li>
 *   <li>{@link SQL2003_V2.ReferentialConstraint#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_V2.SQL2003_V2Package#getReferentialConstraint()
 * @model
 * @generated
 */
public interface ReferentialConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Delete action</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V2.ReferentialAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete action</em>' attribute.
	 * @see SQL2003_V2.ReferentialAction
	 * @see #setDelete_action(ReferentialAction)
	 * @see SQL2003_V2.SQL2003_V2Package#getReferentialConstraint_Delete_action()
	 * @model
	 * @generated
	 */
	ReferentialAction getDelete_action();

	/**
	 * Sets the value of the '{@link SQL2003_V2.ReferentialConstraint#getDelete_action <em>Delete action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete action</em>' attribute.
	 * @see SQL2003_V2.ReferentialAction
	 * @see #getDelete_action()
	 * @generated
	 */
	void setDelete_action(ReferentialAction value);

	/**
	 * Returns the value of the '<em><b>Update action</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V2.ReferentialAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update action</em>' attribute.
	 * @see SQL2003_V2.ReferentialAction
	 * @see #setUpdate_action(ReferentialAction)
	 * @see SQL2003_V2.SQL2003_V2Package#getReferentialConstraint_Update_action()
	 * @model
	 * @generated
	 */
	ReferentialAction getUpdate_action();

	/**
	 * Sets the value of the '{@link SQL2003_V2.ReferentialConstraint#getUpdate_action <em>Update action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update action</em>' attribute.
	 * @see SQL2003_V2.ReferentialAction
	 * @see #getUpdate_action()
	 * @generated
	 */
	void setUpdate_action(ReferentialAction value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * The literals are from the enumeration {@link SQL2003_V2.MatchTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see SQL2003_V2.MatchTypes
	 * @see #setMatch(MatchTypes)
	 * @see SQL2003_V2.SQL2003_V2Package#getReferentialConstraint_Match()
	 * @model
	 * @generated
	 */
	MatchTypes getMatch();

	/**
	 * Sets the value of the '{@link SQL2003_V2.ReferentialConstraint#getMatch <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see SQL2003_V2.MatchTypes
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(MatchTypes value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(UniqueConstraint)
	 * @see SQL2003_V2.SQL2003_V2Package#getReferentialConstraint_References()
	 * @model required="true"
	 * @generated
	 */
	UniqueConstraint getReferences();

	/**
	 * Sets the value of the '{@link SQL2003_V2.ReferentialConstraint#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(UniqueConstraint value);

} // ReferentialConstraint
