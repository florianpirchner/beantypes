/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */

package com.lunifera.beantypes.access.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.RawSuperTypes;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Helper class to collect all properties for a given JvmType.
 */
@SuppressWarnings("restriction")
public class JvmTypeParser {

	/**
	 * Normalizes the method name.
	 * 
	 * @param simpleName
	 * @return
	 */
	public static String toPropertyName(String simpleName) {
		if (simpleName == null) {
			return null;
		}
		String tempName = null;
		if (isSetter(simpleName)) {
			tempName = StringExtensions.toFirstLower(simpleName.replaceFirst(
					"set", ""));
		} else if (isGetter(simpleName)) {
			if (simpleName.startsWith("get")) {
				tempName = StringExtensions.toFirstLower(simpleName
						.replaceFirst("get", ""));
			} else {
				tempName = StringExtensions.toFirstLower(simpleName
						.replaceFirst("is", ""));
			}
		}
		return tempName;
	}

	public static boolean isGetter(String simpleName) {
		if (simpleName == null) {
			return false;
		}
		return simpleName.startsWith("get") || simpleName.startsWith("is");
	}

	public static boolean isSetter(String simpleName) {
		return simpleName != null && simpleName.startsWith("set");
	}

	/**
	 * Calculates the operation infos for the given type.
	 * 
	 * @param type
	 * @return
	 */
	public static Map<String, FeatureInfo> getOperationInfos(JvmDeclaredType type) {
		return getOperationInfos(type, null);
	}

	/**
	 * Calculates the operation infos for the given info.
	 * 
	 * @param info
	 * @return
	 */
	public static Map<String, FeatureInfo> getOperationInfos(FeatureInfo info) {

		JvmType type = null;
		if (info.isMany()) {
			type = info.getParameterizedType();
		} else {
			type = info.getFieldType();
		}

		Map<String, FeatureInfo> result = null;
		if (type instanceof JvmDeclaredType) {
			result = getOperationInfos((JvmDeclaredType) type);
		} else {
			result = new HashMap<String, JvmTypeParser.FeatureInfo>();
		}
		// apply the info as a parent
		for (FeatureInfo temp : result.values()) {
			temp.setParent(info);
		}

		return result;
	}

	/**
	 * Calculates the operation infos for the given type.
	 * 
	 * @param type
	 * @param filterName
	 *            - is used to filter only methods property names matching the
	 *            filter name.
	 * @return
	 */
	public static Map<String, FeatureInfo> getOperationInfos(JvmDeclaredType type,
			String filterName) {
		Map<String, FeatureInfo> infos = new TreeMap<String, FeatureInfo>();
		for (JvmFeature feature : type.getAllFeatures()) {
			if (!(feature instanceof JvmOperation)) {
				continue;
			}

			JvmOperation operation = (JvmOperation) feature;
			if (operation.getVisibility() != JvmVisibility.PUBLIC) {
				continue;
			}

			if (!isSetter(operation.getSimpleName())
					&& operation.getParameters().size() > 1) {
				continue;
			}

			String propertyName = toPropertyName(operation.getSimpleName());
			if (propertyName == null) {
				continue;
			}

			if (filterName != null && !filterName.equals(propertyName)) {
				continue;
			}

			if (operation.getSimpleName().equals("getClass")) {
				continue;
			}

			if (!isGetter(operation.getSimpleName())
					&& !isSetter(operation.getSimpleName())) {
				continue;
			}

			String id = calcId(operation.getDeclaringType(),
					operation.getSimpleName());
			if (!infos.containsKey(id)) {
				FeatureInfo info = new FeatureInfo();
				info.id = id;
				info.name = propertyName;
				infos.put(id, info);
			}

			FeatureInfo info = infos.get(id);
			if (isGetter(operation.getSimpleName())) {
				info.getter = operation;
			} else {
				if (!propertyName.equals("dirty")) {
					info.setter = operation;
				}
			}
		}

		// apply readonly and create descriptions
		for (FeatureInfo info : infos.values()) {
			if (info.getter == null) {
				continue;
			}
			if (info.setter == null) {
				info.readonly = true;
			}
		}

		for (JvmFeature member : type.getAllFeatures()) {
			if (member instanceof JvmField) {
				JvmField field = (JvmField) member;
				String id = calcFieldId(field.getDeclaringType(),
						field.getSimpleName());
				if (infos.containsKey(id)) {
					FeatureInfo info = infos.get(id);
					info.setField(field);
					info.fieldType = field.getType().getType();
					info.primitive = info.fieldType instanceof JvmPrimitiveType
							|| info.fieldType.getQualifiedName().equals(
									String.class.getName());

					// collect all super types and check if collection is part
					// of them
					Set<String> superTypes = new RawSuperTypes()
							.collectNames(info.fieldType);
					for (String typeName : superTypes) {
						if (typeName.equals(Collection.class.getName())) {
							info.many = true;
							break;
						}
						if (typeName.equals(Map.class.getName())) {
							info.map = true;
							break;
						}
					}

					if (info.many) {
						JvmParameterizedTypeReference typeRef = (JvmParameterizedTypeReference) field
								.getType();
						if (!typeRef.getArguments().isEmpty()) {
							info.parameterizedType = typeRef.getArguments()
									.get(0).getType();
						}
					}

					if (info.map) {
						JvmParameterizedTypeReference typeRef = (JvmParameterizedTypeReference) field
								.getType();
						if (!typeRef.getArguments().isEmpty()) {
							info.parameterizedType = typeRef.getArguments()
									.get(0).getType();
						}
					}
				}
			}
		}
		return infos;
	}

	/**
	 * Normalizes the name.
	 * 
	 * @param declaringType
	 * @param simpleName
	 * @return
	 */
	public static String calcId(JvmDeclaredType declaringType, String simpleName) {
		String tempName = toPropertyName(simpleName);
		if (tempName == null) {
			return null;
		}

		return declaringType.getQualifiedName() + ":" + tempName;
	}

	/**
	 * Normalizes the name.
	 * 
	 * @param declaringType
	 * @param simpleName
	 * @return
	 */
	public static String calcFieldId(JvmDeclaredType declaringType,
			String simpleName) {
		return declaringType.getQualifiedName() + ":" + simpleName;
	}

	public static class FeatureInfo implements Comparable<FeatureInfo> {

		/**
		 * Can by any object that requested the info. For instance a YBeanSlot,
		 * an Entity, a JvmField,... The root should only be set for the top
		 * most parent.
		 */
		private Object root;
		/**
		 * The parent which requested this instance of info.
		 */
		private FeatureInfo parent;
		private String id;
		private String name;
		private boolean readonly;
		private boolean primitive;
		private JvmOperation getter;
		private JvmOperation setter;
		private JvmField field;
		private JvmType fieldType;

		// for list (isMany)
		private JvmType parameterizedType;

		// for map (isMap)
		private JvmType mapKeyType;
		private JvmType mapValueType;

		private boolean many;
		private boolean map;

		public FeatureInfo getParent() {
			return parent;
		}

		void setParent(FeatureInfo parent) {
			this.parent = parent;
		}

		public FeatureInfo getTopParent() {
			if (getParent() != null) {
				return getParent().getTopParent();
			}
			return this;
		}

		public Object getRoot() {
			if (this.root == null && getParent() != null) {
				return getParent().getRoot();
			}
			return root;
		}

		void setRoot(Object root) {
			this.root = root;
		}

		public String getId() {
			return id;
		}

		void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}

		public boolean isReadonly() {
			return readonly;
		}

		void setReadonly(boolean readonly) {
			this.readonly = readonly;
		}

		public JvmOperation getGetter() {
			return getter;
		}

		void setGetter(JvmOperation getter) {
			this.getter = getter;
		}

		public JvmOperation getSetter() {
			return setter;
		}

		void setSetter(JvmOperation setter) {
			this.setter = setter;
		}

		public JvmField getField() {
			return field;
		}

		void setField(JvmField field) {
			this.field = field;
		}

		public boolean isPrimitive() {
			return primitive;
		}

		void setPrimitive(boolean primitive) {
			this.primitive = primitive;
		}

		public JvmType getFieldType() {
			return fieldType;
		}

		void setFieldType(JvmType fieldType) {
			this.fieldType = fieldType;
		}

		public boolean isMany() {
			return many;
		}

		void setMany(boolean many) {
			this.many = many;
		}

		public boolean isMap() {
			return map;
		}

		public void setMap(boolean map) {
			this.map = map;
		}

		public JvmType getParameterizedType() {
			return parameterizedType;
		}

		void setParameterizedType(JvmType parameterizedType) {
			this.parameterizedType = parameterizedType;
		}

		// public JvmType getType() {
		// if (isMany()) {
		// type = getParameterizedType();
		// } else {
		// type = getType();
		// }
		// }

		public JvmType getMapKeyType() {
			return mapKeyType;
		}

		public void setMapKeyType(JvmType mapKeyType) {
			this.mapKeyType = mapKeyType;
		}

		public JvmType getMapValueType() {
			return mapValueType;
		}

		public void setMapValueType(JvmType mapValueType) {
			this.mapValueType = mapValueType;
		}

		/**
		 * Returns true, if the info has an annotation matching the given
		 * annotationType.
		 * 
		 * @param annotationType
		 * @return
		 */
		public boolean hasAnnotation(Class<?> annotationType) {
			if (field == null) {
				return false;
			}
			for (JvmAnnotationReference annotation : field.getAnnotations()) {
				if (annotation.getAnnotation().getQualifiedName()
						.equals(annotationType.getName())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * Returns the dot'ed attribute path for this info and its parents. For
		 * instance <code>person.address.name</code>.
		 * 
		 * @return
		 */
		public String getAttributePath() {
			return getAttributePath(parent, name);
		}

		protected String getAttributePath(FeatureInfo parent, String postFix) {
			if (parent != null) {
				String temp = parent.getAttributePath();
				return temp + "." + postFix;
			} else {
				return postFix;
			}
		}

		@Override
		public int compareTo(FeatureInfo other) {
			if (name == null || other == null) {
				return -1;
			}
			return name.compareTo(other.getName());
		}
	}
}
