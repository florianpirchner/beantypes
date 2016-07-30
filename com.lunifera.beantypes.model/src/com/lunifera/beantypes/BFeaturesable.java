/**
 */
package com.lunifera.beantypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFeaturesable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BFeaturesable#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBFeaturesable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BFeaturesable extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.lunifera.beantypes.BFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.lunifera.beantypes.BeansPackage#getBFeaturesable_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<BFeature> getFeatures();

} // BFeaturesable
