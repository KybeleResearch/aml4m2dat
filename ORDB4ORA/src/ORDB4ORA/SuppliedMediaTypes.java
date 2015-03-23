/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ORDB4ORA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Supplied Media Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ORDB4ORA.ORDB4ORAPackage#getSuppliedMediaTypes()
 * @model
 * @generated
 */
public enum SuppliedMediaTypes implements Enumerator {
	/**
	 * The '<em><b>ORD Audio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORD_AUDIO_VALUE
	 * @generated
	 * @ordered
	 */
	ORD_AUDIO(0, "ORDAudio", "ORDAudio"),

	/**
	 * The '<em><b>ORD Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORD_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORD_IMAGE(1, "ORDImage", "ORDImage"),

	/**
	 * The '<em><b>ORD Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORD_VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	ORD_VIDEO(2, "ORDVideo", "ORDVideo"),

	/**
	 * The '<em><b>ORD Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORD_DOC_VALUE
	 * @generated
	 * @ordered
	 */
	ORD_DOC(3, "ORDDoc", "ORDDoc"),

	/**
	 * The '<em><b>ORD Image Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORD_IMAGE_SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	ORD_IMAGE_SIGNATURE(4, "ORDImageSignature", "ORDImageSignature"),

	/**
	 * The '<em><b>SI STILLIMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_STILLIMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SI_STILLIMAGE(5, "SI_STILLIMAGE", "SI_STILLIMAGE"),

	/**
	 * The '<em><b>SI AVERAGECOLOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_AVERAGECOLOR_VALUE
	 * @generated
	 * @ordered
	 */
	SI_AVERAGECOLOR(6, "SI_AVERAGECOLOR", "SI_AVERAGECOLOR"),

	/**
	 * The '<em><b>SI POSITIONALCOLOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_POSITIONALCOLOR_VALUE
	 * @generated
	 * @ordered
	 */
	SI_POSITIONALCOLOR(7, "SI_POSITIONALCOLOR", "SI_POSITIONALCOLOR"),

	/**
	 * The '<em><b>SI COLORHISTOGRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_COLORHISTOGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	SI_COLORHISTOGRAM(8, "SI_COLORHISTOGRAM", "SI_COLORHISTOGRAM"),

	/**
	 * The '<em><b>SI TEXTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_TEXTURE_VALUE
	 * @generated
	 * @ordered
	 */
	SI_TEXTURE(9, "SI_TEXTURE", "SI_TEXTURE"),

	/**
	 * The '<em><b>SI FEATURELIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_FEATURELIST_VALUE
	 * @generated
	 * @ordered
	 */
	SI_FEATURELIST(10, "SI_FEATURELIST", "SI_FEATURELIST"),

	/**
	 * The '<em><b>SI COLOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	SI_COLOR(11, "SI_COLOR", "SI_COLOR");

	/**
	 * The '<em><b>ORD Audio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORD Audio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORD_AUDIO
	 * @model name="ORDAudio"
	 * @generated
	 * @ordered
	 */
	public static final int ORD_AUDIO_VALUE = 0;

	/**
	 * The '<em><b>ORD Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORD Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORD_IMAGE
	 * @model name="ORDImage"
	 * @generated
	 * @ordered
	 */
	public static final int ORD_IMAGE_VALUE = 1;

	/**
	 * The '<em><b>ORD Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORD Video</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORD_VIDEO
	 * @model name="ORDVideo"
	 * @generated
	 * @ordered
	 */
	public static final int ORD_VIDEO_VALUE = 2;

	/**
	 * The '<em><b>ORD Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORD Doc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORD_DOC
	 * @model name="ORDDoc"
	 * @generated
	 * @ordered
	 */
	public static final int ORD_DOC_VALUE = 3;

	/**
	 * The '<em><b>ORD Image Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORD Image Signature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORD_IMAGE_SIGNATURE
	 * @model name="ORDImageSignature"
	 * @generated
	 * @ordered
	 */
	public static final int ORD_IMAGE_SIGNATURE_VALUE = 4;

	/**
	 * The '<em><b>SI STILLIMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI STILLIMAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_STILLIMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_STILLIMAGE_VALUE = 5;

	/**
	 * The '<em><b>SI AVERAGECOLOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI AVERAGECOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_AVERAGECOLOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_AVERAGECOLOR_VALUE = 6;

	/**
	 * The '<em><b>SI POSITIONALCOLOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI POSITIONALCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_POSITIONALCOLOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_POSITIONALCOLOR_VALUE = 7;

	/**
	 * The '<em><b>SI COLORHISTOGRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI COLORHISTOGRAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_COLORHISTOGRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_COLORHISTOGRAM_VALUE = 8;

	/**
	 * The '<em><b>SI TEXTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI TEXTURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_TEXTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_TEXTURE_VALUE = 9;

	/**
	 * The '<em><b>SI FEATURELIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI FEATURELIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_FEATURELIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_FEATURELIST_VALUE = 10;

	/**
	 * The '<em><b>SI COLOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI COLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_COLOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_COLOR_VALUE = 11;

	/**
	 * An array of all the '<em><b>Supplied Media Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SuppliedMediaTypes[] VALUES_ARRAY =
		new SuppliedMediaTypes[] {
			ORD_AUDIO,
			ORD_IMAGE,
			ORD_VIDEO,
			ORD_DOC,
			ORD_IMAGE_SIGNATURE,
			SI_STILLIMAGE,
			SI_AVERAGECOLOR,
			SI_POSITIONALCOLOR,
			SI_COLORHISTOGRAM,
			SI_TEXTURE,
			SI_FEATURELIST,
			SI_COLOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Supplied Media Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SuppliedMediaTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Supplied Media Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedMediaTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedMediaTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied Media Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedMediaTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SuppliedMediaTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supplied Media Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppliedMediaTypes get(int value) {
		switch (value) {
			case ORD_AUDIO_VALUE: return ORD_AUDIO;
			case ORD_IMAGE_VALUE: return ORD_IMAGE;
			case ORD_VIDEO_VALUE: return ORD_VIDEO;
			case ORD_DOC_VALUE: return ORD_DOC;
			case ORD_IMAGE_SIGNATURE_VALUE: return ORD_IMAGE_SIGNATURE;
			case SI_STILLIMAGE_VALUE: return SI_STILLIMAGE;
			case SI_AVERAGECOLOR_VALUE: return SI_AVERAGECOLOR;
			case SI_POSITIONALCOLOR_VALUE: return SI_POSITIONALCOLOR;
			case SI_COLORHISTOGRAM_VALUE: return SI_COLORHISTOGRAM;
			case SI_TEXTURE_VALUE: return SI_TEXTURE;
			case SI_FEATURELIST_VALUE: return SI_FEATURELIST;
			case SI_COLOR_VALUE: return SI_COLOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SuppliedMediaTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SuppliedMediaTypes
