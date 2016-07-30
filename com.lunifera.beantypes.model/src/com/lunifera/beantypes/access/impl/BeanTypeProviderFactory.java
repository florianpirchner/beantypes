package com.lunifera.beantypes.access.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;

import com.google.inject.Singleton;
import com.lunifera.beantypes.access.api.BeanTypeHelper;
import com.lunifera.beantypes.access.api.IBeanTypeProvider;
import com.lunifera.beantypes.access.api.IBeanTypeProvider.Factory;

@SuppressWarnings("restriction")
@Singleton
public class BeanTypeProviderFactory implements Factory {

	@Override
	public IBeanTypeProvider getOrCreateTypeProvider(ResourceSet resourceSet,
			IJvmTypeProvider typeProvider) {
		if (resourceSet == null)
			throw new IllegalArgumentException("resourceSet may not be null.");
		IBeanTypeProvider provider = findTypeProvider(resourceSet);
		if (provider == null) {
			provider = new BeanTypeProvider(resourceSet,
					new IndexedBeanTypesAccess(), typeProvider);
		}

		return provider;
	}

	protected IBeanTypeProvider findTypeProvider(ResourceSet resourceSet) {
		return (IBeanTypeProvider) resourceSet.getResourceFactoryRegistry()
				.getProtocolToFactoryMap().get(BeanTypeHelper.PROTOCOL);
	}

}
