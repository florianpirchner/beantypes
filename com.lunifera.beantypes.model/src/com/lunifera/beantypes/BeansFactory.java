/**
 */
package com.lunifera.beantypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.lunifera.beantypes.BeansPackage
 * @generated
 */
public interface BeansFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BeansFactory eINSTANCE = com.lunifera.beantypes.impl.BeansFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAnnotation</em>'.
	 * @generated
	 */
	BAnnotation createBAnnotation();

	/**
	 * Returns a new object of class '<em>BProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BProperty</em>'.
	 * @generated
	 */
	BProperty createBProperty();

	/**
	 * Returns a new object of class '<em>BBean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BBean Type</em>'.
	 * @generated
	 */
	BBeanType createBBeanType();

	/**
	 * Returns a new object of class '<em>BPrimitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPrimitive Type</em>'.
	 * @generated
	 */
	BPrimitiveType createBPrimitiveType();

	/**
	 * Returns a new object of class '<em>BSimple Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BSimple Feature</em>'.
	 * @generated
	 */
	BSimpleFeature createBSimpleFeature();

	/**
	 * Returns a new object of class '<em>BCollection Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCollection Feature</em>'.
	 * @generated
	 */
	BCollectionFeature createBCollectionFeature();

	/**
	 * Returns a new object of class '<em>BMap Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BMap Feature</em>'.
	 * @generated
	 */
	BMapFeature createBMapFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BeansPackage getBeansPackage();

} //BeansFactory
