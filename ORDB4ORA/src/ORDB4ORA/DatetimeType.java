/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datetime Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ORDB4ORA.DatetimeType#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getSecondPrecision_Min <em>Second Precision Min</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getSecondPrecision_Max <em>Second Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getSecondPrecision_Def <em>Second Precision Def</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getDayPrecision_Min <em>Day Precision Min</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getDayPrecision_Max <em>Day Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getDayPrecision_Def <em>Day Precision Def</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getYearPrecision_Min <em>Year Precision Min</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getYearPrecision_Max <em>Year Precision Max</em>}</li>
 *   <li>{@link ORDB4ORA.DatetimeType#getYearPrecision_Def <em>Year Precision Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType()
 * @model
 * @generated
 */
public interface DatetimeType extends BuiltInType {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * The literals are from the enumeration {@link ORDB4ORA.BuiltInDatetimeTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInDatetimeTypes
	 * @see #setDescriptor(BuiltInDatetimeTypes)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	BuiltInDatetimeTypes getDescriptor();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see ORDB4ORA.BuiltInDatetimeTypes
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BuiltInDatetimeTypes value);

	/**
	 * Returns the value of the '<em><b>Second Precision Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Precision Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Precision Min</em>' attribute.
	 * @see #setSecondPrecision_Min(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_SecondPrecision_Min()
	 * @model
	 * @generated
	 */
	int getSecondPrecision_Min();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getSecondPrecision_Min <em>Second Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Precision Min</em>' attribute.
	 * @see #getSecondPrecision_Min()
	 * @generated
	 */
	void setSecondPrecision_Min(int value);

	/**
	 * Returns the value of the '<em><b>Second Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Precision Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Precision Max</em>' attribute.
	 * @see #setSecondPrecision_Max(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_SecondPrecision_Max()
	 * @model
	 * @generated
	 */
	int getSecondPrecision_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getSecondPrecision_Max <em>Second Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Precision Max</em>' attribute.
	 * @see #getSecondPrecision_Max()
	 * @generated
	 */
	void setSecondPrecision_Max(int value);

	/**
	 * Returns the value of the '<em><b>Second Precision Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Precision Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Precision Def</em>' attribute.
	 * @see #setSecondPrecision_Def(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_SecondPrecision_Def()
	 * @model
	 * @generated
	 */
	int getSecondPrecision_Def();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getSecondPrecision_Def <em>Second Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Precision Def</em>' attribute.
	 * @see #getSecondPrecision_Def()
	 * @generated
	 */
	void setSecondPrecision_Def(int value);

	/**
	 * Returns the value of the '<em><b>Day Precision Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Precision Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Precision Min</em>' attribute.
	 * @see #setDayPrecision_Min(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_DayPrecision_Min()
	 * @model
	 * @generated
	 */
	int getDayPrecision_Min();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getDayPrecision_Min <em>Day Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Precision Min</em>' attribute.
	 * @see #getDayPrecision_Min()
	 * @generated
	 */
	void setDayPrecision_Min(int value);

	/**
	 * Returns the value of the '<em><b>Day Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Precision Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Precision Max</em>' attribute.
	 * @see #setDayPrecision_Max(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_DayPrecision_Max()
	 * @model
	 * @generated
	 */
	int getDayPrecision_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getDayPrecision_Max <em>Day Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Precision Max</em>' attribute.
	 * @see #getDayPrecision_Max()
	 * @generated
	 */
	void setDayPrecision_Max(int value);

	/**
	 * Returns the value of the '<em><b>Day Precision Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Precision Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Precision Def</em>' attribute.
	 * @see #setDayPrecision_Def(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_DayPrecision_Def()
	 * @model
	 * @generated
	 */
	int getDayPrecision_Def();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getDayPrecision_Def <em>Day Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Precision Def</em>' attribute.
	 * @see #getDayPrecision_Def()
	 * @generated
	 */
	void setDayPrecision_Def(int value);

	/**
	 * Returns the value of the '<em><b>Year Precision Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Precision Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Precision Min</em>' attribute.
	 * @see #setYearPrecision_Min(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_YearPrecision_Min()
	 * @model
	 * @generated
	 */
	int getYearPrecision_Min();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getYearPrecision_Min <em>Year Precision Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Precision Min</em>' attribute.
	 * @see #getYearPrecision_Min()
	 * @generated
	 */
	void setYearPrecision_Min(int value);

	/**
	 * Returns the value of the '<em><b>Year Precision Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Precision Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Precision Max</em>' attribute.
	 * @see #setYearPrecision_Max(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_YearPrecision_Max()
	 * @model
	 * @generated
	 */
	int getYearPrecision_Max();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getYearPrecision_Max <em>Year Precision Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Precision Max</em>' attribute.
	 * @see #getYearPrecision_Max()
	 * @generated
	 */
	void setYearPrecision_Max(int value);

	/**
	 * Returns the value of the '<em><b>Year Precision Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Precision Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Precision Def</em>' attribute.
	 * @see #setYearPrecision_Def(int)
	 * @see ORDB4ORA.ORDB4ORAPackage#getDatetimeType_YearPrecision_Def()
	 * @model
	 * @generated
	 */
	int getYearPrecision_Def();

	/**
	 * Sets the value of the '{@link ORDB4ORA.DatetimeType#getYearPrecision_Def <em>Year Precision Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Precision Def</em>' attribute.
	 * @see #getYearPrecision_Def()
	 * @generated
	 */
	void setYearPrecision_Def(int value);

} // DatetimeType
