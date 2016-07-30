package com.lunifera.beantypes.access.impl

import com.lunifera.beantypes.BBeanType
import com.lunifera.beantypes.BCollectionFeature
import com.lunifera.beantypes.BFeature
import com.lunifera.beantypes.BMapFeature
import com.lunifera.beantypes.BSimpleFeature
import com.lunifera.beantypes.BType
import com.lunifera.beantypes.BeansFactory
import com.lunifera.beantypes.access.api.BeanTypeHelper
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmPrimitiveType
import com.lunifera.beantypes.BPrimitiveType

class BeanTypesFactory {

	BeansFactory factory = BeansFactory.eINSTANCE;

	def BBeanType createBeanType(JvmDeclaredType jvmType) {
		val BBeanType bType = factory.createBBeanType
		bType.fill(jvmType);

		return bType;
	}
	
	def BPrimitiveType createPrimitiveType(JvmPrimitiveType jvmType) {

		val BPrimitiveType bType = factory.createBPrimitiveType
		bType.simpleName = jvmType.simpleName
		bType.qualifiedName = jvmType.qualifiedName
		bType.type = jvmType

		return bType
	}

	def protected void fill(BBeanType bType, JvmDeclaredType jvmType) {
		bType.simpleName = jvmType.simpleName
		bType.qualifiedName = jvmType.qualifiedName
		bType.type = jvmType

		val infos = JvmTypeParser.getOperationInfos(jvmType)

		infos.forEach(
			[ key, value |
				val feature = createFeature(key, value)
				bType.features += feature
			])
	}

	def protected BFeature createFeature(String id, JvmTypeParser.FeatureInfo info) {
		var BFeature feature
		if (info.isMany) {
			feature = id.createCollectionFeature(info);
		} else if (info.isMap) {
			feature = id.createMapFeature(info);
		} else {
			feature = id.createSimpleFeature(info);
		}
		
		return feature
	}

	def protected BSimpleFeature createSimpleFeature(String id, JvmTypeParser.FeatureInfo info) {
		val BSimpleFeature bFeature = factory.createBSimpleFeature

		bFeature.simpleName = info.name
		bFeature.qualifiedName = info.id
		bFeature.field = info.field
		bFeature.setter = info.setter
		bFeature.getter = info.getter

		bFeature.fieldType = createBeanTypeProxy(info.fieldType, info.primitive)

		return bFeature
	}

	def protected BType createBeanTypeProxy(JvmType jvmType, boolean primitive) {

		var BType type = null
		if (primitive) {
			type = factory.createBPrimitiveType
		} else {
			type = factory.createBBeanType
		}

		var URI proxyURI = BeanTypeHelper.createProxyURI(jvmType.qualifiedName, primitive)
		(type as InternalEObject).eSetProxyURI(proxyURI)

		return type
	}

	def protected BMapFeature createMapFeature(String string, JvmTypeParser.FeatureInfo info) {
		val BMapFeature bFeature = factory.createBMapFeature

		bFeature.simpleName = info.name
		bFeature.qualifiedName = info.id
		bFeature.field = info.field
		bFeature.setter = info.setter
		bFeature.getter = info.getter

		bFeature.fieldType = createBeanTypeProxy(info.fieldType, info.primitive)
		bFeature.keyType = createBeanTypeProxy(info.mapKeyType, info.primitive)
		bFeature.valueType = createBeanTypeProxy(info.mapValueType, info.primitive)

		return bFeature

	}

	def protected BCollectionFeature createCollectionFeature(String string, JvmTypeParser.FeatureInfo info) {
		val BCollectionFeature bFeature = factory.createBCollectionFeature

		bFeature.simpleName = info.name
		bFeature.qualifiedName = info.id
		bFeature.field = info.field
		bFeature.setter = info.setter
		bFeature.getter = info.getter

		bFeature.fieldType = createBeanTypeProxy(info.fieldType, info.primitive)
		bFeature.parameterType = createBeanTypeProxy(info.parameterizedType, info.primitive)

		return bFeature
	}

}
