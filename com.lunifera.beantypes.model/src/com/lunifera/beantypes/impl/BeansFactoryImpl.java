/**
 */
package com.lunifera.beantypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.lunifera.beantypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeansFactoryImpl extends EFactoryImpl implements BeansFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BeansFactory init() {
		try {
			BeansFactory theBeansFactory = (BeansFactory)EPackage.Registry.INSTANCE.getEFactory(BeansPackage.eNS_URI);
			if (theBeansFactory != null) {
				return theBeansFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BeansFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeansFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BeansPackage.BANNOTATION: return createBAnnotation();
			case BeansPackage.BPROPERTY: return createBProperty();
			case BeansPackage.BBEAN_TYPE: return createBBeanType();
			case BeansPackage.BPRIMITIVE_TYPE: return createBPrimitiveType();
			case BeansPackage.BSIMPLE_FEATURE: return createBSimpleFeature();
			case BeansPackage.BCOLLECTION_FEATURE: return createBCollectionFeature();
			case BeansPackage.BMAP_FEATURE: return createBMapFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAnnotation createBAnnotation() {
		BAnnotationImpl bAnnotation = new BAnnotationImpl();
		return bAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BProperty createBProperty() {
		BPropertyImpl bProperty = new BPropertyImpl();
		return bProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBeanType createBBeanType() {
		BBeanTypeImpl bBeanType = new BBeanTypeImpl();
		return bBeanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPrimitiveType createBPrimitiveType() {
		BPrimitiveTypeImpl bPrimitiveType = new BPrimitiveTypeImpl();
		return bPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSimpleFeature createBSimpleFeature() {
		BSimpleFeatureImpl bSimpleFeature = new BSimpleFeatureImpl();
		return bSimpleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCollectionFeature createBCollectionFeature() {
		BCollectionFeatureImpl bCollectionFeature = new BCollectionFeatureImpl();
		return bCollectionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMapFeature createBMapFeature() {
		BMapFeatureImpl bMapFeature = new BMapFeatureImpl();
		return bMapFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeansPackage getBeansPackage() {
		return (BeansPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BeansPackage getPackage() {
		return BeansPackage.eINSTANCE;
	}

} //BeansFactoryImpl
