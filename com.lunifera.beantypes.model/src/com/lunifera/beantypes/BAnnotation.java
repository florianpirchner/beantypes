/**
 */
package com.lunifera.beantypes;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmAnnotationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BAnnotation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBAnnotation()
 * @model
 * @generated
 */
public interface BAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(JvmAnnotationType)
	 * @see com.lunifera.beantypes.BeansPackage#getBAnnotation_Type()
	 * @model
	 * @generated
	 */
	JvmAnnotationType getType();

	/**
	 * Sets the value of the '{@link com.lunifera.beantypes.BAnnotation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JvmAnnotationType value);

} // BAnnotation
