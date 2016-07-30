/**
 */
package com.lunifera.beantypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAnnotationsable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.BAnnotationsable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lunifera.beantypes.BeansPackage#getBAnnotationsable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BAnnotationsable extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link com.lunifera.beantypes.BAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see com.lunifera.beantypes.BeansPackage#getBAnnotationsable_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BAnnotation> getAnnotations();

} // BAnnotationsable
