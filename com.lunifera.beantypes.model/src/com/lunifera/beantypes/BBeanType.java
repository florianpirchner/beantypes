/**
 */
package com.lunifera.beantypes;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BBean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BBeanType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBBeanType()
 * @model
 * @generated
 */
public interface BBeanType extends BType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(JvmDeclaredType)
	 * @see com.lunifera.beantypes.BeansPackage#getBBeanType_Type()
	 * @model
	 * @generated
	 */
	JvmDeclaredType getType();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BBeanType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JvmDeclaredType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	BSimpleFeature getIdFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	BSimpleFeature getDomainKeyFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	BSimpleFeature getDomainDescriptionFeature();

} // BBeanType
