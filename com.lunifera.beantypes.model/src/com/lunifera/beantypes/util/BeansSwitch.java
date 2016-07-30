/**
 */
package com.lunifera.beantypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.lunifera.beantypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.lunifera.beantypes.BeansPackage
 * @generated
 */
public class BeansSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BeansPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeansSwitch() {
		if (modelPackage == null) {
			modelPackage = BeansPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BeansPackage.BNAMEABLE: {
				BNameable bNameable = (BNameable)theEObject;
				T result = caseBNameable(bNameable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BANNOTATION: {
				BAnnotation bAnnotation = (BAnnotation)theEObject;
				T result = caseBAnnotation(bAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BANNOTATIONSABLE: {
				BAnnotationsable bAnnotationsable = (BAnnotationsable)theEObject;
				T result = caseBAnnotationsable(bAnnotationsable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BPROPERTY: {
				BProperty bProperty = (BProperty)theEObject;
				T result = caseBProperty(bProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BPROPERTIESABLE: {
				BPropertiesable bPropertiesable = (BPropertiesable)theEObject;
				T result = caseBPropertiesable(bPropertiesable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BFEATURESABLE: {
				BFeaturesable bFeaturesable = (BFeaturesable)theEObject;
				T result = caseBFeaturesable(bFeaturesable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BTYPE: {
				BType bType = (BType)theEObject;
				T result = caseBType(bType);
				if (result == null) result = caseBNameable(bType);
				if (result == null) result = caseBFeaturesable(bType);
				if (result == null) result = caseBAnnotationsable(bType);
				if (result == null) result = caseBPropertiesable(bType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BBEAN_TYPE: {
				BBeanType bBeanType = (BBeanType)theEObject;
				T result = caseBBeanType(bBeanType);
				if (result == null) result = caseBType(bBeanType);
				if (result == null) result = caseBNameable(bBeanType);
				if (result == null) result = caseBFeaturesable(bBeanType);
				if (result == null) result = caseBAnnotationsable(bBeanType);
				if (result == null) result = caseBPropertiesable(bBeanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BPRIMITIVE_TYPE: {
				BPrimitiveType bPrimitiveType = (BPrimitiveType)theEObject;
				T result = caseBPrimitiveType(bPrimitiveType);
				if (result == null) result = caseBType(bPrimitiveType);
				if (result == null) result = caseBNameable(bPrimitiveType);
				if (result == null) result = caseBFeaturesable(bPrimitiveType);
				if (result == null) result = caseBAnnotationsable(bPrimitiveType);
				if (result == null) result = caseBPropertiesable(bPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BFEATURE: {
				BFeature bFeature = (BFeature)theEObject;
				T result = caseBFeature(bFeature);
				if (result == null) result = caseBNameable(bFeature);
				if (result == null) result = caseBAnnotationsable(bFeature);
				if (result == null) result = caseBPropertiesable(bFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BSIMPLE_FEATURE: {
				BSimpleFeature bSimpleFeature = (BSimpleFeature)theEObject;
				T result = caseBSimpleFeature(bSimpleFeature);
				if (result == null) result = caseBFeature(bSimpleFeature);
				if (result == null) result = caseBNameable(bSimpleFeature);
				if (result == null) result = caseBAnnotationsable(bSimpleFeature);
				if (result == null) result = caseBPropertiesable(bSimpleFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BCOLLECTION_FEATURE: {
				BCollectionFeature bCollectionFeature = (BCollectionFeature)theEObject;
				T result = caseBCollectionFeature(bCollectionFeature);
				if (result == null) result = caseBFeature(bCollectionFeature);
				if (result == null) result = caseBNameable(bCollectionFeature);
				if (result == null) result = caseBAnnotationsable(bCollectionFeature);
				if (result == null) result = caseBPropertiesable(bCollectionFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeansPackage.BMAP_FEATURE: {
				BMapFeature bMapFeature = (BMapFeature)theEObject;
				T result = caseBMapFeature(bMapFeature);
				if (result == null) result = caseBFeature(bMapFeature);
				if (result == null) result = caseBNameable(bMapFeature);
				if (result == null) result = caseBAnnotationsable(bMapFeature);
				if (result == null) result = caseBPropertiesable(bMapFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BNameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BNameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBNameable(BNameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAnnotation(BAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAnnotationsable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAnnotationsable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAnnotationsable(BAnnotationsable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBProperty(BProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPropertiesable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPropertiesable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPropertiesable(BPropertiesable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFeaturesable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFeaturesable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFeaturesable(BFeaturesable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBType(BType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBeanType(BBeanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPrimitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPrimitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPrimitiveType(BPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFeature(BFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSimple Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSimple Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSimpleFeature(BSimpleFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCollection Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCollection Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCollectionFeature(BCollectionFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BMap Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BMap Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMapFeature(BMapFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BeansSwitch
