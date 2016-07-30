package com.lunifera.beantypes.access.api;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;

import com.lunifera.beantypes.BBeanType;

/**
 * Returns already existing types for the given jvmType or creates a new
 * instances of it.
 */
public interface IBeanTypeProvider {

	/**
	 * Returns the bean type for the given jvm type
	 * 
	 * @param type
	 * @return
	 */
	BBeanType getType(JvmDeclaredType jvmType);

	/**
	 * Creates or returns an existing type provider for the resource set.
	 */
	interface Factory {

		/**
		 * Creates or returns an existing type provider for the resource set.
		 * 
		 * @param resourceSet
		 * @param typeProvider
		 * @return
		 */
		@SuppressWarnings("restriction")
		IBeanTypeProvider getOrCreateTypeProvider(ResourceSet resourceSet,
				IJvmTypeProvider typeProvider);

	}

}
