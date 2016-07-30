/**
 */
package com.lunifera.beantypes.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import com.lunifera.beantypes.BSimpleFeature;
import com.lunifera.beantypes.BeansPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSimple Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BSimpleFeatureImpl extends BFeatureImpl implements BSimpleFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSimpleFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeansPackage.Literals.BSIMPLE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isId() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDomainKey() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDomainDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BeansPackage.BSIMPLE_FEATURE___IS_ID:
				return isId();
			case BeansPackage.BSIMPLE_FEATURE___IS_DOMAIN_KEY:
				return isDomainKey();
			case BeansPackage.BSIMPLE_FEATURE___IS_DOMAIN_DESCRIPTION:
				return isDomainDescription();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BSimpleFeatureImpl
