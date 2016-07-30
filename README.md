# beantypes
Bean Types to work with Xtext JvmTypes.

BeanTypes follow the java.beans idea. Field, getter and setter are abstracted by a feature.

Also support for special OSBP Annotations like @ID, @DomainKey and @DomainDescription are available.

The implementation uses proxies for lazy loading stuff.


Base Model:
```
entity Item {
	var Warehouse warehouse;
	var List<OrderDetail> orderDetails;
}

```


Idea:
```
@Inject
IBeanTypeProvider provider;

	JvmDeclaredType itemEntity = ...
	BBeanType itemBean = provider.getType(itemEntity);

	// ----- warehouse -----

	BSimpleFeature warehouseFeature = (BSimpleFeature) itemBean.getFeatures().get(0);
	warehouseFeature.isReadOnly();
	warehouseFeature.isMany();

	JvmField field = warehouseFeature.getJvmField();
	JvmOperation getter = warehouseFeature.getJvmGetter();
	JvmOperation setter = warehouseFeature.getJvmSetter();
	
	// lazy loading will create a new BeanTypesResource
	// lets assume that the first feature points to warehouse in the entity
	BBeanType entityBean = warehouseFeature.getType();


	// ----- order details -----

	BSimpleFeature orderDetailsFeature = (BSimpleFeature) itemBean.getFeatures().get(1);
	
	JvmField field = orderDetailsFeature.getJvmField();
	// may be null for collections
	JvmOperation getter = orderDetailsFeature.getJvmGetter();
	JvmOperation setter = orderDetailsFeature.getJvmSetter();
	
	// get the type of the feature
	// will be a List or Set type containing no features since no getter and setter
	// are available
	BBeanType collectionBean = orderDetailsFeature.getType();
	
	// lazy loading will create a new BeanTypesResource
	// lets assume that the feature points to a list of OrderDetails in the entity
	BBeanType orderDetailsBean = orderDetailsFeature.getParameterType();
}
```
