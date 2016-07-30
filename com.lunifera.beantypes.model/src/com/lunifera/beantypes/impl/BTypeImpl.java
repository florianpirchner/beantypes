/**
 */
package com.lunifera.beantypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.lunifera.beantypes.BAnnotation;
import com.lunifera.beantypes.BAnnotationsable;
import com.lunifera.beantypes.BFeature;
import com.lunifera.beantypes.BFeaturesable;
import com.lunifera.beantypes.BPropertiesable;
import com.lunifera.beantypes.BProperty;
import com.lunifera.beantypes.BType;
import com.lunifera.beantypes.BeansPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.impl.BTypeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.lunifera.beantypes.impl.BTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.lunifera.beantypes.impl.BTypeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTypeImpl extends BNameableImpl implements BType {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<BFeature> features;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<BAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<BProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeansPackage.Literals.BTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<BFeature>(BFeature.class, this, BeansPackage.BTYPE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<BAnnotation>(BAnnotation.class, this, BeansPackage.BTYPE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<BProperty>(BProperty.class, this, BeansPackage.BTYPE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeansPackage.BTYPE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case BeansPackage.BTYPE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case BeansPackage.BTYPE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeansPackage.BTYPE__FEATURES:
				return getFeatures();
			case BeansPackage.BTYPE__ANNOTATIONS:
				return getAnnotations();
			case BeansPackage.BTYPE__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BeansPackage.BTYPE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends BFeature>)newValue);
				return;
			case BeansPackage.BTYPE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends BAnnotation>)newValue);
				return;
			case BeansPackage.BTYPE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends BProperty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BeansPackage.BTYPE__FEATURES:
				getFeatures().clear();
				return;
			case BeansPackage.BTYPE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case BeansPackage.BTYPE__PROPERTIES:
				getProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BeansPackage.BTYPE__FEATURES:
				return features != null && !features.isEmpty();
			case BeansPackage.BTYPE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case BeansPackage.BTYPE__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BFeaturesable.class) {
			switch (derivedFeatureID) {
				case BeansPackage.BTYPE__FEATURES: return BeansPackage.BFEATURESABLE__FEATURES;
				default: return -1;
			}
		}
		if (baseClass == BAnnotationsable.class) {
			switch (derivedFeatureID) {
				case BeansPackage.BTYPE__ANNOTATIONS: return BeansPackage.BANNOTATIONSABLE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == BPropertiesable.class) {
			switch (derivedFeatureID) {
				case BeansPackage.BTYPE__PROPERTIES: return BeansPackage.BPROPERTIESABLE__PROPERTIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BFeaturesable.class) {
			switch (baseFeatureID) {
				case BeansPackage.BFEATURESABLE__FEATURES: return BeansPackage.BTYPE__FEATURES;
				default: return -1;
			}
		}
		if (baseClass == BAnnotationsable.class) {
			switch (baseFeatureID) {
				case BeansPackage.BANNOTATIONSABLE__ANNOTATIONS: return BeansPackage.BTYPE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == BPropertiesable.class) {
			switch (baseFeatureID) {
				case BeansPackage.BPROPERTIESABLE__PROPERTIES: return BeansPackage.BTYPE__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BTypeImpl
