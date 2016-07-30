package com.lunifera.beantypes.index.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.lunifera.beantypes.BBeanType;

/**
 * Accesses the index and/or the resource set to resolve already prepared bean
 * types.
 */
public interface IIndexedBeanTypeAccess {

	/**
	 * Returns a bean type for its uri using the rs to resolve the URI into the
	 * type.
	 * 
	 * @param uri
	 * @param rs
	 * @return
	 */
	BBeanType getIndexedType(URI uri, ResourceSet rs);

}
