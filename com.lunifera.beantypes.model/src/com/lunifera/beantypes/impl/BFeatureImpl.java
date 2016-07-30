/**
 */
package com.lunifera.beantypes.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;

import com.lunifera.beantypes.BAnnotation;
import com.lunifera.beantypes.BAnnotationsable;
import com.lunifera.beantypes.BCollectionFeature;
import com.lunifera.beantypes.BFeature;
import com.lunifera.beantypes.BMapFeature;
import com.lunifera.beantypes.BPropertiesable;
import com.lunifera.beantypes.BProperty;
import com.lunifera.beantypes.BType;
import com.lunifera.beantypes.BeansPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BFeature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lunifera.beantypes.impl.BFeatureImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.lunifera.beantypes.impl.BFeatureImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.lunifera.beantypes.impl.BFeatureImpl#getField <em>Field</em>}</li>
 *   <li>{@link com.lunifera.beantypes.impl.BFeatureImpl#getGetter <em>Getter</em>}</li>
 *   <li>{@link com.lunifera.beantypes.impl.BFeatureImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link com.lunifera.beantypes.impl.BFeatureImpl#getFieldType <em>Field Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BFeatureImpl extends BNameableImpl implements BFeature {
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
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected JvmField field;

	/**
	 * The cached value of the '{@link #getGetter() <em>Getter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation getter;

	/**
	 * The cached value of the '{@link #getSetter() <em>Setter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation setter;

	/**
	 * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected BType fieldType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeansPackage.Literals.BFEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<BAnnotation>(BAnnotation.class, this, BeansPackage.BFEATURE__ANNOTATIONS);
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
			properties = new EObjectContainmentEList<BProperty>(BProperty.class, this, BeansPackage.BFEATURE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (JvmField)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeansPackage.BFEATURE__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(JvmField newField) {
		JvmField oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BFEATURE__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getGetter() {
		if (getter != null && getter.eIsProxy()) {
			InternalEObject oldGetter = (InternalEObject)getter;
			getter = (JvmOperation)eResolveProxy(oldGetter);
			if (getter != oldGetter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeansPackage.BFEATURE__GETTER, oldGetter, getter));
			}
		}
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetGetter() {
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetter(JvmOperation newGetter) {
		JvmOperation oldGetter = getter;
		getter = newGetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BFEATURE__GETTER, oldGetter, getter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getSetter() {
		if (setter != null && setter.eIsProxy()) {
			InternalEObject oldSetter = (InternalEObject)setter;
			setter = (JvmOperation)eResolveProxy(oldSetter);
			if (setter != oldSetter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeansPackage.BFEATURE__SETTER, oldSetter, setter));
			}
		}
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetSetter() {
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetter(JvmOperation newSetter) {
		JvmOperation oldSetter = setter;
		setter = newSetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BFEATURE__SETTER, oldSetter, setter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BType getFieldType() {
		if (fieldType != null && fieldType.eIsProxy()) {
			InternalEObject oldFieldType = (InternalEObject)fieldType;
			fieldType = (BType)eResolveProxy(oldFieldType);
			if (fieldType != oldFieldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeansPackage.BFEATURE__FIELD_TYPE, oldFieldType, fieldType));
			}
		}
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BType basicGetFieldType() {
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldType(BType newFieldType) {
		BType oldFieldType = fieldType;
		fieldType = newFieldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BFEATURE__FIELD_TYPE, oldFieldType, fieldType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isMany() { 
		return this instanceof BCollectionFeature || this instanceof BMapFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isReadonly() {
		return getSetter() == null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeansPackage.BFEATURE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case BeansPackage.BFEATURE__PROPERTIES:
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
			case BeansPackage.BFEATURE__ANNOTATIONS:
				return getAnnotations();
			case BeansPackage.BFEATURE__PROPERTIES:
				return getProperties();
			case BeansPackage.BFEATURE__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case BeansPackage.BFEATURE__GETTER:
				if (resolve) return getGetter();
				return basicGetGetter();
			case BeansPackage.BFEATURE__SETTER:
				if (resolve) return getSetter();
				return basicGetSetter();
			case BeansPackage.BFEATURE__FIELD_TYPE:
				if (resolve) return getFieldType();
				return basicGetFieldType();
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
			case BeansPackage.BFEATURE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends BAnnotation>)newValue);
				return;
			case BeansPackage.BFEATURE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends BProperty>)newValue);
				return;
			case BeansPackage.BFEATURE__FIELD:
				setField((JvmField)newValue);
				return;
			case BeansPackage.BFEATURE__GETTER:
				setGetter((JvmOperation)newValue);
				return;
			case BeansPackage.BFEATURE__SETTER:
				setSetter((JvmOperation)newValue);
				return;
			case BeansPackage.BFEATURE__FIELD_TYPE:
				setFieldType((BType)newValue);
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
			case BeansPackage.BFEATURE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case BeansPackage.BFEATURE__PROPERTIES:
				getProperties().clear();
				return;
			case BeansPackage.BFEATURE__FIELD:
				setField((JvmField)null);
				return;
			case BeansPackage.BFEATURE__GETTER:
				setGetter((JvmOperation)null);
				return;
			case BeansPackage.BFEATURE__SETTER:
				setSetter((JvmOperation)null);
				return;
			case BeansPackage.BFEATURE__FIELD_TYPE:
				setFieldType((BType)null);
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
			case BeansPackage.BFEATURE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case BeansPackage.BFEATURE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case BeansPackage.BFEATURE__FIELD:
				return field != null;
			case BeansPackage.BFEATURE__GETTER:
				return getter != null;
			case BeansPackage.BFEATURE__SETTER:
				return setter != null;
			case BeansPackage.BFEATURE__FIELD_TYPE:
				return fieldType != null;
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
		if (baseClass == BAnnotationsable.class) {
			switch (derivedFeatureID) {
				case BeansPackage.BFEATURE__ANNOTATIONS: return BeansPackage.BANNOTATIONSABLE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == BPropertiesable.class) {
			switch (derivedFeatureID) {
				case BeansPackage.BFEATURE__PROPERTIES: return BeansPackage.BPROPERTIESABLE__PROPERTIES;
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
		if (baseClass == BAnnotationsable.class) {
			switch (baseFeatureID) {
				case BeansPackage.BANNOTATIONSABLE__ANNOTATIONS: return BeansPackage.BFEATURE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == BPropertiesable.class) {
			switch (baseFeatureID) {
				case BeansPackage.BPROPERTIESABLE__PROPERTIES: return BeansPackage.BFEATURE__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BeansPackage.BFEATURE___IS_MANY:
				return isMany();
			case BeansPackage.BFEATURE___IS_READONLY:
				return isReadonly();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BFeatureImpl
