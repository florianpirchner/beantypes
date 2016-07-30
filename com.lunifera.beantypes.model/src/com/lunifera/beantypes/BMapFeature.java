/**
 */
package com.lunifera.beantypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BMap Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BMapFeature#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link com.lunifera.beantypes.BMapFeature#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBMapFeature()
 * @model
 * @generated
 */
public interface BMapFeature extends BFeature {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' reference.
	 * @see #setKeyType(BType)
	 * @see com.lunifera.beantypes.BeansPackage#getBMapFeature_KeyType()
	 * @model
	 * @generated
	 */
	BType getKeyType();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BMapFeature#getKeyType <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(BType value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(BType)
	 * @see com.lunifera.beantypes.BeansPackage#getBMapFeature_ValueType()
	 * @model
	 * @generated
	 */
	BType getValueType();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BMapFeature#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(BType value);

} // BMapFeature
