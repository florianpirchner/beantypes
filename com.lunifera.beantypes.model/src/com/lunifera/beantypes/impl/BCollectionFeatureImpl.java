/**
 */
package com.lunifera.beantypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.lunifera.beantypes.BCollectionFeature;
import com.lunifera.beantypes.BType;
import com.lunifera.beantypes.BeansPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCollection Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.impl.BCollectionFeatureImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCollectionFeatureImpl extends BFeatureImpl implements BCollectionFeature {
	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected BType parameterType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCollectionFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeansPackage.Literals.BCOLLECTION_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BType getParameterType() {
		if (parameterType != null && parameterType.eIsProxy()) {
			InternalEObject oldParameterType = (InternalEObject)parameterType;
			parameterType = (BType)eResolveProxy(oldParameterType);
			if (parameterType != oldParameterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeansPackage.BCOLLECTION_FEATURE__PARAMETER_TYPE, oldParameterType, parameterType));
			}
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BType basicGetParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(BType newParameterType) {
		BType oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BCOLLECTION_FEATURE__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeansPackage.BCOLLECTION_FEATURE__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BeansPackage.BCOLLECTION_FEATURE__PARAMETER_TYPE:
				setParameterType((BType)newValue);
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
			case BeansPackage.BCOLLECTION_FEATURE__PARAMETER_TYPE:
				setParameterType((BType)null);
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
			case BeansPackage.BCOLLECTION_FEATURE__PARAMETER_TYPE:
				return parameterType != null;
		}
		return super.eIsSet(featureID);
	}

} //BCollectionFeatureImpl
