/**
 */
package com.lunifera.beantypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPropertiesable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BPropertiesable#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBPropertiesable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BPropertiesable extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.lunifera.beantypes.BProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.lunifera.beantypes.BeansPackage#getBPropertiesable_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<BProperty> getProperties();

} // BPropertiesable
