package com.lunifera.beantypes.access.api;

import org.eclipse.emf.common.util.URI;

public class BeanTypeHelper {

	private static final String OBJECT_SEGMENT = "/object/";

	private static final String PRIMITIVE_SEGMENT = "/primitive/";

	public static final String PROTOCOL = "beantypes";

	public static final String OBJECT_TYPES = PROTOCOL + ":/object/";

	public static final String PRIMITVE_TYPES = PROTOCOL + ":/primitive/";

	public static final String OBJECT_PROXY_PATTERN = OBJECT_TYPES + "%s#%s";
	public static final String PRIMITVE_PROXY_PATTERN = PRIMITVE_TYPES
			+ "%s#%s";

	public static URI createProxyURI(String classname, boolean primitive) {
		if (primitive) {
			return createPrimitiveProxyURI(classname);
		} else {
			return createProxyURI(classname);
		}
	}

	/**
	 * Creates a proper proxy URI for the given class name
	 * 
	 * @param classname
	 * @return
	 */
	public static URI createProxyURI(String classname) {
		return URI.createURI(String.format(OBJECT_PROXY_PATTERN, classname,
				classname));
	}

	/**
	 * Creates a proper proxy URI for the given class name.
	 * 
	 * @param classname
	 * @return
	 */
	public static URI createPrimitiveProxyURI(String classname) {
		return URI.createURI(String.format(PRIMITVE_PROXY_PATTERN, classname,
				classname));
	}

	public static boolean isPrimitive(URI uri) {
		return uri.toString().startsWith(PRIMITVE_TYPES);
	}

	public static boolean isObject(URI uri) {
		return uri.toString().startsWith(OBJECT_TYPES);
	}

	public static String getClassName(URI uri) {
		if(isPrimitive(uri)) {
			return uri.path().substring(PRIMITIVE_SEGMENT.length());
		}else{
			return uri.path().substring(OBJECT_SEGMENT.length());
		}
	}

}
