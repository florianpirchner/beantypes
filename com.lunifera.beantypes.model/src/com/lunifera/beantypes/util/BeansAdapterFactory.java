/**
 */
package com.lunifera.beantypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.lunifera.beantypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.lunifera.beantypes.BeansPackage
 * @generated
 */
public class BeansAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BeansPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeansAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BeansPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeansSwitch<Adapter> modelSwitch =
		new BeansSwitch<Adapter>() {
			@Override
			public Adapter caseBNameable(BNameable object) {
				return createBNameableAdapter();
			}
			@Override
			public Adapter caseBAnnotation(BAnnotation object) {
				return createBAnnotationAdapter();
			}
			@Override
			public Adapter caseBAnnotationsable(BAnnotationsable object) {
				return createBAnnotationsableAdapter();
			}
			@Override
			public Adapter caseBProperty(BProperty object) {
				return createBPropertyAdapter();
			}
			@Override
			public Adapter caseBPropertiesable(BPropertiesable object) {
				return createBPropertiesableAdapter();
			}
			@Override
			public Adapter caseBFeaturesable(BFeaturesable object) {
				return createBFeaturesableAdapter();
			}
			@Override
			public Adapter caseBType(BType object) {
				return createBTypeAdapter();
			}
			@Override
			public Adapter caseBBeanType(BBeanType object) {
				return createBBeanTypeAdapter();
			}
			@Override
			public Adapter caseBPrimitiveType(BPrimitiveType object) {
				return createBPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseBFeature(BFeature object) {
				return createBFeatureAdapter();
			}
			@Override
			public Adapter caseBSimpleFeature(BSimpleFeature object) {
				return createBSimpleFeatureAdapter();
			}
			@Override
			public Adapter caseBCollectionFeature(BCollectionFeature object) {
				return createBCollectionFeatureAdapter();
			}
			@Override
			public Adapter caseBMapFeature(BMapFeature object) {
				return createBMapFeatureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BNameable <em>BNameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BNameable
	 * @generated
	 */
	public Adapter createBNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BAnnotation <em>BAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BAnnotation
	 * @generated
	 */
	public Adapter createBAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BAnnotationsable <em>BAnnotationsable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BAnnotationsable
	 * @generated
	 */
	public Adapter createBAnnotationsableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BProperty <em>BProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BProperty
	 * @generated
	 */
	public Adapter createBPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BPropertiesable <em>BPropertiesable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BPropertiesable
	 * @generated
	 */
	public Adapter createBPropertiesableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BFeaturesable <em>BFeaturesable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BFeaturesable
	 * @generated
	 */
	public Adapter createBFeaturesableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BType
	 * @generated
	 */
	public Adapter createBTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BBeanType <em>BBean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BBeanType
	 * @generated
	 */
	public Adapter createBBeanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BPrimitiveType <em>BPrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BPrimitiveType
	 * @generated
	 */
	public Adapter createBPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BFeature <em>BFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BFeature
	 * @generated
	 */
	public Adapter createBFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BSimpleFeature <em>BSimple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BSimpleFeature
	 * @generated
	 */
	public Adapter createBSimpleFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BCollectionFeature <em>BCollection Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BCollectionFeature
	 * @generated
	 */
	public Adapter createBCollectionFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.beantypes.BMapFeature <em>BMap Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.beantypes.BMapFeature
	 * @generated
	 */
	public Adapter createBMapFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BeansAdapterFactory
