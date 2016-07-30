package com.lunifera.beantypes.access.impl;

import com.lunifera.beantypes.BBeanType;
import com.lunifera.beantypes.BCollectionFeature;
import com.lunifera.beantypes.BFeature;
import com.lunifera.beantypes.BMapFeature;
import com.lunifera.beantypes.BPrimitiveType;
import com.lunifera.beantypes.BSimpleFeature;
import com.lunifera.beantypes.BType;
import com.lunifera.beantypes.BeansFactory;
import com.lunifera.beantypes.access.api.BeanTypeHelper;
import com.lunifera.beantypes.access.impl.JvmTypeParser;
import java.util.Map;
import java.util.function.BiConsumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;

@SuppressWarnings("all")
public class BeanTypesFactory {
  private BeansFactory factory = BeansFactory.eINSTANCE;
  
  public BBeanType createBeanType(final JvmDeclaredType jvmType) {
    final BBeanType bType = this.factory.createBBeanType();
    this.fill(bType, jvmType);
    return bType;
  }
  
  public BPrimitiveType createPrimitiveType(final JvmPrimitiveType jvmType) {
    final BPrimitiveType bType = this.factory.createBPrimitiveType();
    String _simpleName = jvmType.getSimpleName();
    bType.setSimpleName(_simpleName);
    String _qualifiedName = jvmType.getQualifiedName();
    bType.setQualifiedName(_qualifiedName);
    bType.setType(jvmType);
    return bType;
  }
  
  protected void fill(final BBeanType bType, final JvmDeclaredType jvmType) {
    String _simpleName = jvmType.getSimpleName();
    bType.setSimpleName(_simpleName);
    String _qualifiedName = jvmType.getQualifiedName();
    bType.setQualifiedName(_qualifiedName);
    bType.setType(jvmType);
    final Map<String, JvmTypeParser.FeatureInfo> infos = JvmTypeParser.getOperationInfos(jvmType);
    final BiConsumer<String, JvmTypeParser.FeatureInfo> _function = new BiConsumer<String, JvmTypeParser.FeatureInfo>() {
      public void accept(final String key, final JvmTypeParser.FeatureInfo value) {
        final BFeature feature = BeanTypesFactory.this.createFeature(key, value);
        EList<BFeature> _features = bType.getFeatures();
        _features.add(feature);
      }
    };
    infos.forEach(_function);
  }
  
  protected BFeature createFeature(final String id, final JvmTypeParser.FeatureInfo info) {
    BFeature feature = null;
    boolean _isMany = info.isMany();
    if (_isMany) {
      BCollectionFeature _createCollectionFeature = this.createCollectionFeature(id, info);
      feature = _createCollectionFeature;
    } else {
      boolean _isMap = info.isMap();
      if (_isMap) {
        BMapFeature _createMapFeature = this.createMapFeature(id, info);
        feature = _createMapFeature;
      } else {
        BSimpleFeature _createSimpleFeature = this.createSimpleFeature(id, info);
        feature = _createSimpleFeature;
      }
    }
    return feature;
  }
  
  protected BSimpleFeature createSimpleFeature(final String id, final JvmTypeParser.FeatureInfo info) {
    final BSimpleFeature bFeature = this.factory.createBSimpleFeature();
    String _name = info.getName();
    bFeature.setSimpleName(_name);
    String _id = info.getId();
    bFeature.setQualifiedName(_id);
    JvmField _field = info.getField();
    bFeature.setField(_field);
    JvmOperation _setter = info.getSetter();
    bFeature.setSetter(_setter);
    JvmOperation _getter = info.getGetter();
    bFeature.setGetter(_getter);
    JvmType _fieldType = info.getFieldType();
    boolean _isPrimitive = info.isPrimitive();
    BType _createBeanTypeProxy = this.createBeanTypeProxy(_fieldType, _isPrimitive);
    bFeature.setFieldType(_createBeanTypeProxy);
    return bFeature;
  }
  
  protected BType createBeanTypeProxy(final JvmType jvmType, final boolean primitive) {
    BType type = null;
    if (primitive) {
      BPrimitiveType _createBPrimitiveType = this.factory.createBPrimitiveType();
      type = _createBPrimitiveType;
    } else {
      BBeanType _createBBeanType = this.factory.createBBeanType();
      type = _createBBeanType;
    }
    String _qualifiedName = jvmType.getQualifiedName();
    URI proxyURI = BeanTypeHelper.createProxyURI(_qualifiedName, primitive);
    ((InternalEObject) type).eSetProxyURI(proxyURI);
    return type;
  }
  
  protected BMapFeature createMapFeature(final String string, final JvmTypeParser.FeatureInfo info) {
    final BMapFeature bFeature = this.factory.createBMapFeature();
    String _name = info.getName();
    bFeature.setSimpleName(_name);
    String _id = info.getId();
    bFeature.setQualifiedName(_id);
    JvmField _field = info.getField();
    bFeature.setField(_field);
    JvmOperation _setter = info.getSetter();
    bFeature.setSetter(_setter);
    JvmOperation _getter = info.getGetter();
    bFeature.setGetter(_getter);
    JvmType _fieldType = info.getFieldType();
    boolean _isPrimitive = info.isPrimitive();
    BType _createBeanTypeProxy = this.createBeanTypeProxy(_fieldType, _isPrimitive);
    bFeature.setFieldType(_createBeanTypeProxy);
    JvmType _mapKeyType = info.getMapKeyType();
    boolean _isPrimitive_1 = info.isPrimitive();
    BType _createBeanTypeProxy_1 = this.createBeanTypeProxy(_mapKeyType, _isPrimitive_1);
    bFeature.setKeyType(_createBeanTypeProxy_1);
    JvmType _mapValueType = info.getMapValueType();
    boolean _isPrimitive_2 = info.isPrimitive();
    BType _createBeanTypeProxy_2 = this.createBeanTypeProxy(_mapValueType, _isPrimitive_2);
    bFeature.setValueType(_createBeanTypeProxy_2);
    return bFeature;
  }
  
  protected BCollectionFeature createCollectionFeature(final String string, final JvmTypeParser.FeatureInfo info) {
    final BCollectionFeature bFeature = this.factory.createBCollectionFeature();
    String _name = info.getName();
    bFeature.setSimpleName(_name);
    String _id = info.getId();
    bFeature.setQualifiedName(_id);
    JvmField _field = info.getField();
    bFeature.setField(_field);
    JvmOperation _setter = info.getSetter();
    bFeature.setSetter(_setter);
    JvmOperation _getter = info.getGetter();
    bFeature.setGetter(_getter);
    JvmType _fieldType = info.getFieldType();
    boolean _isPrimitive = info.isPrimitive();
    BType _createBeanTypeProxy = this.createBeanTypeProxy(_fieldType, _isPrimitive);
    bFeature.setFieldType(_createBeanTypeProxy);
    JvmType _parameterizedType = info.getParameterizedType();
    boolean _isPrimitive_1 = info.isPrimitive();
    BType _createBeanTypeProxy_1 = this.createBeanTypeProxy(_parameterizedType, _isPrimitive_1);
    bFeature.setParameterType(_createBeanTypeProxy_1);
    return bFeature;
  }
}
