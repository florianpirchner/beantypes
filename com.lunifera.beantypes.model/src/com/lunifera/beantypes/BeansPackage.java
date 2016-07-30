/**
 */
package com.lunifera.beantypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.lunifera.beantypes.BeansFactory
 * @model kind="package"
 * @generated
 */
public interface BeansPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "beantypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/beantypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "beantypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BeansPackage eINSTANCE = com.lunifera.beantypes.impl.BeansPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BNameableImpl <em>BNameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BNameableImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBNameable()
	 * @generated
	 */
	int BNAMEABLE = 0;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNAMEABLE__SIMPLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNAMEABLE__QUALIFIED_NAME = 1;

	/**
	 * The number of structural features of the '<em>BNameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNAMEABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BNameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNAMEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BAnnotationImpl <em>BAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BAnnotationImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBAnnotation()
	 * @generated
	 */
	int BANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANNOTATION__TYPE = 0;

	/**
	 * The number of structural features of the '<em>BAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.BAnnotationsable <em>BAnnotationsable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.BAnnotationsable
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBAnnotationsable()
	 * @generated
	 */
	int BANNOTATIONSABLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANNOTATIONSABLE__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>BAnnotationsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANNOTATIONSABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BAnnotationsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANNOTATIONSABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BPropertyImpl <em>BProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BPropertyImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBProperty()
	 * @generated
	 */
	int BPROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>BProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.BPropertiesable <em>BPropertiesable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.BPropertiesable
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBPropertiesable()
	 * @generated
	 */
	int BPROPERTIESABLE = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTIESABLE__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>BPropertiesable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTIESABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BPropertiesable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTIESABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.BFeaturesable <em>BFeaturesable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.BFeaturesable
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBFeaturesable()
	 * @generated
	 */
	int BFEATURESABLE = 5;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURESABLE__FEATURES = 0;

	/**
	 * The number of structural features of the '<em>BFeaturesable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURESABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BFeaturesable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURESABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BTypeImpl <em>BType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BTypeImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBType()
	 * @generated
	 */
	int BTYPE = 6;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SIMPLE_NAME = BNAMEABLE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__QUALIFIED_NAME = BNAMEABLE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__FEATURES = BNAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__ANNOTATIONS = BNAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__PROPERTIES = BNAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_FEATURE_COUNT = BNAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_OPERATION_COUNT = BNAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BBeanTypeImpl <em>BBean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BBeanTypeImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBBeanType()
	 * @generated
	 */
	int BBEAN_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE__SIMPLE_NAME = BTYPE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE__QUALIFIED_NAME = BTYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE__FEATURES = BTYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE__ANNOTATIONS = BTYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE__PROPERTIES = BTYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE__TYPE = BTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BBean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE_FEATURE_COUNT = BTYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE___GET_ID_FEATURE = BTYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Domain Key Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE___GET_DOMAIN_KEY_FEATURE = BTYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Domain Description Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE___GET_DOMAIN_DESCRIPTION_FEATURE = BTYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>BBean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBEAN_TYPE_OPERATION_COUNT = BTYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BPrimitiveTypeImpl <em>BPrimitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BPrimitiveTypeImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBPrimitiveType()
	 * @generated
	 */
	int BPRIMITIVE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE__SIMPLE_NAME = BTYPE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE__QUALIFIED_NAME = BTYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE__FEATURES = BTYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE__ANNOTATIONS = BTYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE__PROPERTIES = BTYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE__TYPE = BTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BPrimitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE_FEATURE_COUNT = BTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BPrimitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPRIMITIVE_TYPE_OPERATION_COUNT = BTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BFeatureImpl <em>BFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BFeatureImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBFeature()
	 * @generated
	 */
	int BFEATURE = 9;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__SIMPLE_NAME = BNAMEABLE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__QUALIFIED_NAME = BNAMEABLE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__ANNOTATIONS = BNAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__PROPERTIES = BNAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__FIELD = BNAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__GETTER = BNAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__SETTER = BNAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE__FIELD_TYPE = BNAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE_FEATURE_COUNT = BNAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE___IS_MANY = BNAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Readonly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE___IS_READONLY = BNAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE_OPERATION_COUNT = BNAMEABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BSimpleFeatureImpl <em>BSimple Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BSimpleFeatureImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBSimpleFeature()
	 * @generated
	 */
	int BSIMPLE_FEATURE = 10;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__SIMPLE_NAME = BFEATURE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__QUALIFIED_NAME = BFEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__ANNOTATIONS = BFEATURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__PROPERTIES = BFEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__FIELD = BFEATURE__FIELD;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__GETTER = BFEATURE__GETTER;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__SETTER = BFEATURE__SETTER;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE__FIELD_TYPE = BFEATURE__FIELD_TYPE;

	/**
	 * The number of structural features of the '<em>BSimple Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE_FEATURE_COUNT = BFEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE___IS_MANY = BFEATURE___IS_MANY;

	/**
	 * The operation id for the '<em>Is Readonly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE___IS_READONLY = BFEATURE___IS_READONLY;

	/**
	 * The operation id for the '<em>Is Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE___IS_ID = BFEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Domain Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE___IS_DOMAIN_KEY = BFEATURE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Domain Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE___IS_DOMAIN_DESCRIPTION = BFEATURE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>BSimple Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIMPLE_FEATURE_OPERATION_COUNT = BFEATURE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BCollectionFeatureImpl <em>BCollection Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BCollectionFeatureImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBCollectionFeature()
	 * @generated
	 */
	int BCOLLECTION_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__SIMPLE_NAME = BFEATURE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__QUALIFIED_NAME = BFEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__ANNOTATIONS = BFEATURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__PROPERTIES = BFEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__FIELD = BFEATURE__FIELD;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__GETTER = BFEATURE__GETTER;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__SETTER = BFEATURE__SETTER;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__FIELD_TYPE = BFEATURE__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE__PARAMETER_TYPE = BFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BCollection Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE_FEATURE_COUNT = BFEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE___IS_MANY = BFEATURE___IS_MANY;

	/**
	 * The operation id for the '<em>Is Readonly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE___IS_READONLY = BFEATURE___IS_READONLY;

	/**
	 * The number of operations of the '<em>BCollection Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOLLECTION_FEATURE_OPERATION_COUNT = BFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.beantypes.impl.BMapFeatureImpl <em>BMap Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.beantypes.impl.BMapFeatureImpl
	 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBMapFeature()
	 * @generated
	 */
	int BMAP_FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__SIMPLE_NAME = BFEATURE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__QUALIFIED_NAME = BFEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__ANNOTATIONS = BFEATURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__PROPERTIES = BFEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__FIELD = BFEATURE__FIELD;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__GETTER = BFEATURE__GETTER;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__SETTER = BFEATURE__SETTER;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__FIELD_TYPE = BFEATURE__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__KEY_TYPE = BFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE__VALUE_TYPE = BFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BMap Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE_FEATURE_COUNT = BFEATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE___IS_MANY = BFEATURE___IS_MANY;

	/**
	 * The operation id for the '<em>Is Readonly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE___IS_READONLY = BFEATURE___IS_READONLY;

	/**
	 * The number of operations of the '<em>BMap Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_FEATURE_OPERATION_COUNT = BFEATURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BNameable <em>BNameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BNameable</em>'.
	 * @see com.lunifera.beantypes.BNameable
	 * @generated
	 */
	EClass getBNameable();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.beantypes.BNameable#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see com.lunifera.beantypes.BNameable#getSimpleName()
	 * @see #getBNameable()
	 * @generated
	 */
	EAttribute getBNameable_SimpleName();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.beantypes.BNameable#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see com.lunifera.beantypes.BNameable#getQualifiedName()
	 * @see #getBNameable()
	 * @generated
	 */
	EAttribute getBNameable_QualifiedName();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BAnnotation <em>BAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAnnotation</em>'.
	 * @see com.lunifera.beantypes.BAnnotation
	 * @generated
	 */
	EClass getBAnnotation();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.lunifera.beantypes.BAnnotation#getType()
	 * @see #getBAnnotation()
	 * @generated
	 */
	EReference getBAnnotation_Type();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BAnnotationsable <em>BAnnotationsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAnnotationsable</em>'.
	 * @see com.lunifera.beantypes.BAnnotationsable
	 * @generated
	 */
	EClass getBAnnotationsable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.lunifera.beantypes.BAnnotationsable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.lunifera.beantypes.BAnnotationsable#getAnnotations()
	 * @see #getBAnnotationsable()
	 * @generated
	 */
	EReference getBAnnotationsable_Annotations();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BProperty <em>BProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProperty</em>'.
	 * @see com.lunifera.beantypes.BProperty
	 * @generated
	 */
	EClass getBProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.beantypes.BProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.lunifera.beantypes.BProperty#getKey()
	 * @see #getBProperty()
	 * @generated
	 */
	EAttribute getBProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.beantypes.BProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.lunifera.beantypes.BProperty#getValue()
	 * @see #getBProperty()
	 * @generated
	 */
	EAttribute getBProperty_Value();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BPropertiesable <em>BPropertiesable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPropertiesable</em>'.
	 * @see com.lunifera.beantypes.BPropertiesable
	 * @generated
	 */
	EClass getBPropertiesable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.lunifera.beantypes.BPropertiesable#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.lunifera.beantypes.BPropertiesable#getProperties()
	 * @see #getBPropertiesable()
	 * @generated
	 */
	EReference getBPropertiesable_Properties();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BFeaturesable <em>BFeaturesable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFeaturesable</em>'.
	 * @see com.lunifera.beantypes.BFeaturesable
	 * @generated
	 */
	EClass getBFeaturesable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.lunifera.beantypes.BFeaturesable#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.lunifera.beantypes.BFeaturesable#getFeatures()
	 * @see #getBFeaturesable()
	 * @generated
	 */
	EReference getBFeaturesable_Features();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BType</em>'.
	 * @see com.lunifera.beantypes.BType
	 * @generated
	 */
	EClass getBType();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BBeanType <em>BBean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBean Type</em>'.
	 * @see com.lunifera.beantypes.BBeanType
	 * @generated
	 */
	EClass getBBeanType();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BBeanType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.lunifera.beantypes.BBeanType#getType()
	 * @see #getBBeanType()
	 * @generated
	 */
	EReference getBBeanType_Type();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BBeanType#getIdFeature() <em>Get Id Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id Feature</em>' operation.
	 * @see com.lunifera.beantypes.BBeanType#getIdFeature()
	 * @generated
	 */
	EOperation getBBeanType__GetIdFeature();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BBeanType#getDomainKeyFeature() <em>Get Domain Key Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Domain Key Feature</em>' operation.
	 * @see com.lunifera.beantypes.BBeanType#getDomainKeyFeature()
	 * @generated
	 */
	EOperation getBBeanType__GetDomainKeyFeature();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BBeanType#getDomainDescriptionFeature() <em>Get Domain Description Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Domain Description Feature</em>' operation.
	 * @see com.lunifera.beantypes.BBeanType#getDomainDescriptionFeature()
	 * @generated
	 */
	EOperation getBBeanType__GetDomainDescriptionFeature();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BPrimitiveType <em>BPrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPrimitive Type</em>'.
	 * @see com.lunifera.beantypes.BPrimitiveType
	 * @generated
	 */
	EClass getBPrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BPrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.lunifera.beantypes.BPrimitiveType#getType()
	 * @see #getBPrimitiveType()
	 * @generated
	 */
	EReference getBPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BFeature <em>BFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFeature</em>'.
	 * @see com.lunifera.beantypes.BFeature
	 * @generated
	 */
	EClass getBFeature();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BFeature#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see com.lunifera.beantypes.BFeature#getField()
	 * @see #getBFeature()
	 * @generated
	 */
	EReference getBFeature_Field();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BFeature#getGetter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Getter</em>'.
	 * @see com.lunifera.beantypes.BFeature#getGetter()
	 * @see #getBFeature()
	 * @generated
	 */
	EReference getBFeature_Getter();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BFeature#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Setter</em>'.
	 * @see com.lunifera.beantypes.BFeature#getSetter()
	 * @see #getBFeature()
	 * @generated
	 */
	EReference getBFeature_Setter();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BFeature#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Type</em>'.
	 * @see com.lunifera.beantypes.BFeature#getFieldType()
	 * @see #getBFeature()
	 * @generated
	 */
	EReference getBFeature_FieldType();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BFeature#isMany() <em>Is Many</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Many</em>' operation.
	 * @see com.lunifera.beantypes.BFeature#isMany()
	 * @generated
	 */
	EOperation getBFeature__IsMany();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BFeature#isReadonly() <em>Is Readonly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Readonly</em>' operation.
	 * @see com.lunifera.beantypes.BFeature#isReadonly()
	 * @generated
	 */
	EOperation getBFeature__IsReadonly();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BSimpleFeature <em>BSimple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSimple Feature</em>'.
	 * @see com.lunifera.beantypes.BSimpleFeature
	 * @generated
	 */
	EClass getBSimpleFeature();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BSimpleFeature#isId() <em>Is Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Id</em>' operation.
	 * @see com.lunifera.beantypes.BSimpleFeature#isId()
	 * @generated
	 */
	EOperation getBSimpleFeature__IsId();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BSimpleFeature#isDomainKey() <em>Is Domain Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Domain Key</em>' operation.
	 * @see com.lunifera.beantypes.BSimpleFeature#isDomainKey()
	 * @generated
	 */
	EOperation getBSimpleFeature__IsDomainKey();

	/**
	 * Returns the meta object for the '{@link com.lunifera.beantypes.BSimpleFeature#isDomainDescription() <em>Is Domain Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Domain Description</em>' operation.
	 * @see com.lunifera.beantypes.BSimpleFeature#isDomainDescription()
	 * @generated
	 */
	EOperation getBSimpleFeature__IsDomainDescription();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BCollectionFeature <em>BCollection Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCollection Feature</em>'.
	 * @see com.lunifera.beantypes.BCollectionFeature
	 * @generated
	 */
	EClass getBCollectionFeature();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BCollectionFeature#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see com.lunifera.beantypes.BCollectionFeature#getParameterType()
	 * @see #getBCollectionFeature()
	 * @generated
	 */
	EReference getBCollectionFeature_ParameterType();

	/**
	 * Returns the meta object for class '{@link com.lunifera.beantypes.BMapFeature <em>BMap Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BMap Feature</em>'.
	 * @see com.lunifera.beantypes.BMapFeature
	 * @generated
	 */
	EClass getBMapFeature();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BMapFeature#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Type</em>'.
	 * @see com.lunifera.beantypes.BMapFeature#getKeyType()
	 * @see #getBMapFeature()
	 * @generated
	 */
	EReference getBMapFeature_KeyType();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.beantypes.BMapFeature#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see com.lunifera.beantypes.BMapFeature#getValueType()
	 * @see #getBMapFeature()
	 * @generated
	 */
	EReference getBMapFeature_ValueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BeansFactory getBeansFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BNameableImpl <em>BNameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BNameableImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBNameable()
		 * @generated
		 */
		EClass BNAMEABLE = eINSTANCE.getBNameable();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BNAMEABLE__SIMPLE_NAME = eINSTANCE.getBNameable_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BNAMEABLE__QUALIFIED_NAME = eINSTANCE.getBNameable_QualifiedName();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BAnnotationImpl <em>BAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BAnnotationImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBAnnotation()
		 * @generated
		 */
		EClass BANNOTATION = eINSTANCE.getBAnnotation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANNOTATION__TYPE = eINSTANCE.getBAnnotation_Type();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.BAnnotationsable <em>BAnnotationsable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.BAnnotationsable
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBAnnotationsable()
		 * @generated
		 */
		EClass BANNOTATIONSABLE = eINSTANCE.getBAnnotationsable();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANNOTATIONSABLE__ANNOTATIONS = eINSTANCE.getBAnnotationsable_Annotations();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BPropertyImpl <em>BProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BPropertyImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBProperty()
		 * @generated
		 */
		EClass BPROPERTY = eINSTANCE.getBProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPROPERTY__KEY = eINSTANCE.getBProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPROPERTY__VALUE = eINSTANCE.getBProperty_Value();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.BPropertiesable <em>BPropertiesable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.BPropertiesable
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBPropertiesable()
		 * @generated
		 */
		EClass BPROPERTIESABLE = eINSTANCE.getBPropertiesable();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPROPERTIESABLE__PROPERTIES = eINSTANCE.getBPropertiesable_Properties();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.BFeaturesable <em>BFeaturesable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.BFeaturesable
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBFeaturesable()
		 * @generated
		 */
		EClass BFEATURESABLE = eINSTANCE.getBFeaturesable();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFEATURESABLE__FEATURES = eINSTANCE.getBFeaturesable_Features();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BTypeImpl <em>BType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BTypeImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBType()
		 * @generated
		 */
		EClass BTYPE = eINSTANCE.getBType();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BBeanTypeImpl <em>BBean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BBeanTypeImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBBeanType()
		 * @generated
		 */
		EClass BBEAN_TYPE = eINSTANCE.getBBeanType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBEAN_TYPE__TYPE = eINSTANCE.getBBeanType_Type();

		/**
		 * The meta object literal for the '<em><b>Get Id Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BBEAN_TYPE___GET_ID_FEATURE = eINSTANCE.getBBeanType__GetIdFeature();

		/**
		 * The meta object literal for the '<em><b>Get Domain Key Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BBEAN_TYPE___GET_DOMAIN_KEY_FEATURE = eINSTANCE.getBBeanType__GetDomainKeyFeature();

		/**
		 * The meta object literal for the '<em><b>Get Domain Description Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BBEAN_TYPE___GET_DOMAIN_DESCRIPTION_FEATURE = eINSTANCE.getBBeanType__GetDomainDescriptionFeature();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BPrimitiveTypeImpl <em>BPrimitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BPrimitiveTypeImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBPrimitiveType()
		 * @generated
		 */
		EClass BPRIMITIVE_TYPE = eINSTANCE.getBPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPRIMITIVE_TYPE__TYPE = eINSTANCE.getBPrimitiveType_Type();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BFeatureImpl <em>BFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BFeatureImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBFeature()
		 * @generated
		 */
		EClass BFEATURE = eINSTANCE.getBFeature();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFEATURE__FIELD = eINSTANCE.getBFeature_Field();

		/**
		 * The meta object literal for the '<em><b>Getter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFEATURE__GETTER = eINSTANCE.getBFeature_Getter();

		/**
		 * The meta object literal for the '<em><b>Setter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFEATURE__SETTER = eINSTANCE.getBFeature_Setter();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFEATURE__FIELD_TYPE = eINSTANCE.getBFeature_FieldType();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BFEATURE___IS_MANY = eINSTANCE.getBFeature__IsMany();

		/**
		 * The meta object literal for the '<em><b>Is Readonly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BFEATURE___IS_READONLY = eINSTANCE.getBFeature__IsReadonly();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BSimpleFeatureImpl <em>BSimple Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BSimpleFeatureImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBSimpleFeature()
		 * @generated
		 */
		EClass BSIMPLE_FEATURE = eINSTANCE.getBSimpleFeature();

		/**
		 * The meta object literal for the '<em><b>Is Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSIMPLE_FEATURE___IS_ID = eINSTANCE.getBSimpleFeature__IsId();

		/**
		 * The meta object literal for the '<em><b>Is Domain Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSIMPLE_FEATURE___IS_DOMAIN_KEY = eINSTANCE.getBSimpleFeature__IsDomainKey();

		/**
		 * The meta object literal for the '<em><b>Is Domain Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSIMPLE_FEATURE___IS_DOMAIN_DESCRIPTION = eINSTANCE.getBSimpleFeature__IsDomainDescription();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BCollectionFeatureImpl <em>BCollection Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BCollectionFeatureImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBCollectionFeature()
		 * @generated
		 */
		EClass BCOLLECTION_FEATURE = eINSTANCE.getBCollectionFeature();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOLLECTION_FEATURE__PARAMETER_TYPE = eINSTANCE.getBCollectionFeature_ParameterType();

		/**
		 * The meta object literal for the '{@link com.lunifera.beantypes.impl.BMapFeatureImpl <em>BMap Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.beantypes.impl.BMapFeatureImpl
		 * @see com.lunifera.beantypes.impl.BeansPackageImpl#getBMapFeature()
		 * @generated
		 */
		EClass BMAP_FEATURE = eINSTANCE.getBMapFeature();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMAP_FEATURE__KEY_TYPE = eINSTANCE.getBMapFeature_KeyType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMAP_FEATURE__VALUE_TYPE = eINSTANCE.getBMapFeature_ValueType();

	}

} //BeansPackage
