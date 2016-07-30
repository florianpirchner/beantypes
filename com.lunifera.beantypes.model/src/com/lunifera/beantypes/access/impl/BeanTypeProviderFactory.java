package com.lunifera.beantypes.access.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Singleton;
import com.lunifera.beantypes.access.api.IBeanTypeConstants;
import com.lunifera.beantypes.access.api.IBeanTypeProvider;
import com.lunifera.beantypes.access.api.IBeanTypeProvider.Factory;

@Singleton
public class BeanTypeProviderFactory implements Factory {

	@Override
	public IBeanTypeProvider getOrCreateTypeProvider(ResourceSet resourceSet) {
		if (resourceSet == null)
			throw new IllegalArgumentException("resourceSet may not be null.");
		IBeanTypeProvider provider = findTypeProvider(resourceSet);
		if (provider == null) {
			provider = new BeanTypeProvider(resourceSet,
					new IndexedBeanTypesAccess());
		}

		return provider;
	}

	protected IBeanTypeProvider findTypeProvider(ResourceSet resourceSet) {
		return (IBeanTypeProvider) resourceSet.getResourceFactoryRegistry()
				.getProtocolToFactoryMap().get(IBeanTypeConstants.PROTOCOL);
	}

}
