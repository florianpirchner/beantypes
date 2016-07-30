package com.lunifera.beantypes.access.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;

import com.lunifera.beantypes.BBeanType;
import com.lunifera.beantypes.access.api.IBeanTypeConstants;
import com.lunifera.beantypes.access.api.IBeanTypeProvider;
import com.lunifera.beantypes.index.api.IIndexedBeanTypeAccess;
import com.lunifera.beantypes.resource.BeanTypeResource;

public class BeanTypeProvider implements IBeanTypeProvider, Resource.Factory {

	private final ResourceSet resourceSet;
	private final IIndexedBeanTypeAccess indexedBeanAccess;

	public BeanTypeProvider(ResourceSet resourceSet,
			IIndexedBeanTypeAccess indexedBeanAccess) {
		super();
		this.resourceSet = resourceSet;
		this.indexedBeanAccess = indexedBeanAccess;

		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(IBeanTypeConstants.PROTOCOL, this);
	}

	@Override
	public BBeanType getType(JvmDeclaredType jvmType) {
		return null;
	}

	@Override
	public Resource createResource(URI uri) {
		BeanTypeResource resource = new BeanTypeResource(uri);
		resource.setIndexAccess(indexedBeanAccess);
		return resource;
	}

}
