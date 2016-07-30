/**
 */
package com.lunifera.beantypes;

import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFeature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BFeature#getField <em>Field</em>}</li>
 *   <li>{@link com.lunifera.beantypes.BFeature#getGetter <em>Getter</em>}</li>
 *   <li>{@link com.lunifera.beantypes.BFeature#getSetter <em>Setter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBFeature()
 * @model abstract="true"
 * @generated
 */
public interface BFeature extends BNameable, BAnnotationsable, BPropertiesable {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(JvmField)
	 * @see com.lunifera.beantypes.BeansPackage#getBFeature_Field()
	 * @model
	 * @generated
	 */
	JvmField getField();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BFeature#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(JvmField value);

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' reference.
	 * @see #setGetter(JvmOperation)
	 * @see com.lunifera.beantypes.BeansPackage#getBFeature_Getter()
	 * @model
	 * @generated
	 */
	JvmOperation getGetter();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BFeature#getGetter <em>Getter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' reference.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(JvmOperation value);

	/**
	 * Returns the value of the '<em><b>Setter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' reference.
	 * @see #setSetter(JvmOperation)
	 * @see com.lunifera.beantypes.BeansPackage#getBFeature_Setter()
	 * @model
	 * @generated
	 */
	JvmOperation getSetter();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BFeature#getSetter <em>Setter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' reference.
	 * @see #getSetter()
	 * @generated
	 */
	void setSetter(JvmOperation value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMany();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isReadonly();

} // BFeature
