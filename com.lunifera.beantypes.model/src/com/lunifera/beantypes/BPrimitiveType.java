/**
 */
package com.lunifera.beantypes;

import org.eclipse.xtext.common.types.JvmPrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPrimitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BPrimitiveType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBPrimitiveType()
 * @model
 * @generated
 */
public interface BPrimitiveType extends BType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(JvmPrimitiveType)
	 * @see com.lunifera.beantypes.BeansPackage#getBPrimitiveType_Type()
	 * @model
	 * @generated
	 */
	JvmPrimitiveType getType();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BPrimitiveType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JvmPrimitiveType value);

} // BPrimitiveType
