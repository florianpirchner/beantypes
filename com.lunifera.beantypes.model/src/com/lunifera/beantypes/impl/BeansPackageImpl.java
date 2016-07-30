/**
 */
package com.lunifera.beantypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;

import com.lunifera.beantypes.BAnnotation;
import com.lunifera.beantypes.BAnnotationsable;
import com.lunifera.beantypes.BBeanType;
import com.lunifera.beantypes.BCollectionFeature;
import com.lunifera.beantypes.BFeature;
import com.lunifera.beantypes.BFeaturesable;
import com.lunifera.beantypes.BMapFeature;
import com.lunifera.beantypes.BNameable;
import com.lunifera.beantypes.BPrimitiveType;
import com.lunifera.beantypes.BPropertiesable;
import com.lunifera.beantypes.BProperty;
import com.lunifera.beantypes.BSimpleFeature;
import com.lunifera.beantypes.BType;
import com.lunifera.beantypes.BeansFactory;
import com.lunifera.beantypes.BeansPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeansPackageImpl extends EPackageImpl implements BeansPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bNameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bAnnotationsableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPropertiesableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bFeaturesableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bBeanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bSimpleFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bCollectionFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bMapFeatureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.lunifera.beantypes.BeansPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BeansPackageImpl() {
		super(eNS_URI, BeansFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BeansPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BeansPackage init() {
		if (isInited) return (BeansPackage)EPackage.Registry.INSTANCE.getEPackage(BeansPackage.eNS_URI);

		// Obtain or create and register package
		BeansPackageImpl theBeansPackage = (BeansPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BeansPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BeansPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBeansPackage.createPackageContents();

		// Initialize created meta-data
		theBeansPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBeansPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BeansPackage.eNS_URI, theBeansPackage);
		return theBeansPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBNameable() {
		return bNameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBNameable_SimpleName() {
		return (EAttribute)bNameableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBNameable_QualifiedName() {
		return (EAttribute)bNameableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAnnotation() {
		return bAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAnnotation_Type() {
		return (EReference)bAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAnnotationsable() {
		return bAnnotationsableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAnnotationsable_Annotations() {
		return (EReference)bAnnotationsableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBProperty() {
		return bPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBProperty_Key() {
		return (EAttribute)bPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBProperty_Value() {
		return (EAttribute)bPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPropertiesable() {
		return bPropertiesableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPropertiesable_Properties() {
		return (EReference)bPropertiesableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBFeaturesable() {
		return bFeaturesableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBFeaturesable_Features() {
		return (EReference)bFeaturesableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBType() {
		return bTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBBeanType() {
		return bBeanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBBeanType_Type() {
		return (EReference)bBeanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBBeanType__GetIdFeature() {
		return bBeanTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBBeanType__GetDomainKeyFeature() {
		return bBeanTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBBeanType__GetDomainDescriptionFeature() {
		return bBeanTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPrimitiveType() {
		return bPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPrimitiveType_Type() {
		return (EReference)bPrimitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBFeature() {
		return bFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBFeature_Field() {
		return (EReference)bFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBFeature_Getter() {
		return (EReference)bFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBFeature_Setter() {
		return (EReference)bFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBFeature__IsMany() {
		return bFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBFeature__IsReadonly() {
		return bFeatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBSimpleFeature() {
		return bSimpleFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSimpleFeature_Type() {
		return (EReference)bSimpleFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBSimpleFeature__IsId() {
		return bSimpleFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBSimpleFeature__IsDomainKey() {
		return bSimpleFeatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBSimpleFeature__IsDomainDescription() {
		return bSimpleFeatureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBCollectionFeature() {
		return bCollectionFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCollectionFeature_ParameterType() {
		return (EReference)bCollectionFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBMapFeature() {
		return bMapFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBMapFeature_KeyType() {
		return (EReference)bMapFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBMapFeature_ValueType() {
		return (EReference)bMapFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeansFactory getBeansFactory() {
		return (BeansFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bNameableEClass = createEClass(BNAMEABLE);
		createEAttribute(bNameableEClass, BNAMEABLE__SIMPLE_NAME);
		createEAttribute(bNameableEClass, BNAMEABLE__QUALIFIED_NAME);

		bAnnotationEClass = createEClass(BANNOTATION);
		createEReference(bAnnotationEClass, BANNOTATION__TYPE);

		bAnnotationsableEClass = createEClass(BANNOTATIONSABLE);
		createEReference(bAnnotationsableEClass, BANNOTATIONSABLE__ANNOTATIONS);

		bPropertyEClass = createEClass(BPROPERTY);
		createEAttribute(bPropertyEClass, BPROPERTY__KEY);
		createEAttribute(bPropertyEClass, BPROPERTY__VALUE);

		bPropertiesableEClass = createEClass(BPROPERTIESABLE);
		createEReference(bPropertiesableEClass, BPROPERTIESABLE__PROPERTIES);

		bFeaturesableEClass = createEClass(BFEATURESABLE);
		createEReference(bFeaturesableEClass, BFEATURESABLE__FEATURES);

		bTypeEClass = createEClass(BTYPE);

		bBeanTypeEClass = createEClass(BBEAN_TYPE);
		createEReference(bBeanTypeEClass, BBEAN_TYPE__TYPE);
		createEOperation(bBeanTypeEClass, BBEAN_TYPE___GET_ID_FEATURE);
		createEOperation(bBeanTypeEClass, BBEAN_TYPE___GET_DOMAIN_KEY_FEATURE);
		createEOperation(bBeanTypeEClass, BBEAN_TYPE___GET_DOMAIN_DESCRIPTION_FEATURE);

		bPrimitiveTypeEClass = createEClass(BPRIMITIVE_TYPE);
		createEReference(bPrimitiveTypeEClass, BPRIMITIVE_TYPE__TYPE);

		bFeatureEClass = createEClass(BFEATURE);
		createEReference(bFeatureEClass, BFEATURE__FIELD);
		createEReference(bFeatureEClass, BFEATURE__GETTER);
		createEReference(bFeatureEClass, BFEATURE__SETTER);
		createEOperation(bFeatureEClass, BFEATURE___IS_MANY);
		createEOperation(bFeatureEClass, BFEATURE___IS_READONLY);

		bSimpleFeatureEClass = createEClass(BSIMPLE_FEATURE);
		createEReference(bSimpleFeatureEClass, BSIMPLE_FEATURE__TYPE);
		createEOperation(bSimpleFeatureEClass, BSIMPLE_FEATURE___IS_ID);
		createEOperation(bSimpleFeatureEClass, BSIMPLE_FEATURE___IS_DOMAIN_KEY);
		createEOperation(bSimpleFeatureEClass, BSIMPLE_FEATURE___IS_DOMAIN_DESCRIPTION);

		bCollectionFeatureEClass = createEClass(BCOLLECTION_FEATURE);
		createEReference(bCollectionFeatureEClass, BCOLLECTION_FEATURE__PARAMETER_TYPE);

		bMapFeatureEClass = createEClass(BMAP_FEATURE);
		createEReference(bMapFeatureEClass, BMAP_FEATURE__KEY_TYPE);
		createEReference(bMapFeatureEClass, BMAP_FEATURE__VALUE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bTypeEClass.getESuperTypes().add(this.getBNameable());
		bTypeEClass.getESuperTypes().add(this.getBFeaturesable());
		bTypeEClass.getESuperTypes().add(this.getBAnnotationsable());
		bTypeEClass.getESuperTypes().add(this.getBPropertiesable());
		bBeanTypeEClass.getESuperTypes().add(this.getBType());
		bPrimitiveTypeEClass.getESuperTypes().add(this.getBType());
		bFeatureEClass.getESuperTypes().add(this.getBNameable());
		bFeatureEClass.getESuperTypes().add(this.getBAnnotationsable());
		bFeatureEClass.getESuperTypes().add(this.getBPropertiesable());
		bSimpleFeatureEClass.getESuperTypes().add(this.getBFeature());
		bCollectionFeatureEClass.getESuperTypes().add(this.getBSimpleFeature());
		bMapFeatureEClass.getESuperTypes().add(this.getBFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(bNameableEClass, BNameable.class, "BNameable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBNameable_SimpleName(), ecorePackage.getEString(), "simpleName", null, 1, 1, BNameable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBNameable_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, BNameable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bAnnotationEClass, BAnnotation.class, "BAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBAnnotation_Type(), theTypesPackage.getJvmAnnotationType(), null, "type", null, 0, 1, BAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bAnnotationsableEClass, BAnnotationsable.class, "BAnnotationsable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBAnnotationsable_Annotations(), this.getBAnnotation(), null, "annotations", null, 0, -1, BAnnotationsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bPropertyEClass, BProperty.class, "BProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, BProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, BProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bPropertiesableEClass, BPropertiesable.class, "BPropertiesable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPropertiesable_Properties(), this.getBProperty(), null, "properties", null, 0, -1, BPropertiesable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bFeaturesableEClass, BFeaturesable.class, "BFeaturesable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBFeaturesable_Features(), this.getBFeature(), null, "features", null, 0, -1, BFeaturesable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTypeEClass, BType.class, "BType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bBeanTypeEClass, BBeanType.class, "BBeanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBBeanType_Type(), theTypesPackage.getJvmDeclaredType(), null, "type", null, 0, 1, BBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBBeanType__GetIdFeature(), this.getBSimpleFeature(), "getIdFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBBeanType__GetDomainKeyFeature(), this.getBSimpleFeature(), "getDomainKeyFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBBeanType__GetDomainDescriptionFeature(), this.getBSimpleFeature(), "getDomainDescriptionFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bPrimitiveTypeEClass, BPrimitiveType.class, "BPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPrimitiveType_Type(), theTypesPackage.getJvmPrimitiveType(), null, "type", null, 0, 1, BPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bFeatureEClass, BFeature.class, "BFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBFeature_Field(), theTypesPackage.getJvmField(), null, "field", null, 0, 1, BFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBFeature_Getter(), theTypesPackage.getJvmOperation(), null, "getter", null, 0, 1, BFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBFeature_Setter(), theTypesPackage.getJvmOperation(), null, "setter", null, 0, 1, BFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBFeature__IsMany(), ecorePackage.getEBoolean(), "isMany", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBFeature__IsReadonly(), ecorePackage.getEBoolean(), "isReadonly", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bSimpleFeatureEClass, BSimpleFeature.class, "BSimpleFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBSimpleFeature_Type(), this.getBType(), null, "type", null, 1, 1, BSimpleFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBSimpleFeature__IsId(), ecorePackage.getEBoolean(), "isId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBSimpleFeature__IsDomainKey(), ecorePackage.getEBoolean(), "isDomainKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBSimpleFeature__IsDomainDescription(), ecorePackage.getEBoolean(), "isDomainDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bCollectionFeatureEClass, BCollectionFeature.class, "BCollectionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBCollectionFeature_ParameterType(), this.getBType(), null, "parameterType", null, 1, 1, BCollectionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bMapFeatureEClass, BMapFeature.class, "BMapFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBMapFeature_KeyType(), this.getBType(), null, "keyType", null, 0, 1, BMapFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBMapFeature_ValueType(), this.getBType(), null, "valueType", null, 0, 1, BMapFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BeansPackageImpl
