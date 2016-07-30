# beantypes
Bean Types to work with Xtext JvmTypes.

BeanTypes follow the java.beans idea. Field, getter and setter are abstracted by a feature.

Also support for special OSBP Annotations like @ID, @DomainKey and @DomainDescription are available.

The implementation uses proxies for lazy loading stuff.


Idea:

@Inject
IBeanTypeProvider provider;

JvmDeclaredType someType = ...
BBeanType beanType = provider.getType(someType);

BFeature feature = beanType.getFeatures().get(0);

if(feature instanceof BSimpleFeature) {
	JvmField field = feature.getJvmField();
	JvmOperation getter = feature.getJvmGetter();
	JvmOperation setter = feature.getJvmSetter();
	
	// lazy loading will create a new BeanTypesResource
	BBeanType featureType = feature.getType();
}