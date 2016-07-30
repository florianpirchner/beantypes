/**
 */
package com.lunifera.beantypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCollection Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BCollectionFeature#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBCollectionFeature()
 * @model
 * @generated
 */
public interface BCollectionFeature extends BFeature {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(BType)
	 * @see com.lunifera.beantypes.BeansPackage#getBCollectionFeature_ParameterType()
	 * @model required="true"
	 * @generated
	 */
	BType getParameterType();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BCollectionFeature#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(BType value);

} // BCollectionFeature
