package com.lunifera.beantypes.access.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;

import com.lunifera.beantypes.BBeanType;
import com.lunifera.beantypes.access.api.BeanTypeHelper;
import com.lunifera.beantypes.access.api.IBeanTypeProvider;
import com.lunifera.beantypes.index.api.IIndexedBeanTypeAccess;
import com.lunifera.beantypes.resource.BeanTypeResource;

@SuppressWarnings("restriction")
public class BeanTypeProvider implements IBeanTypeProvider, Resource.Factory {

	private final ResourceSet resourceSet;
	private final IIndexedBeanTypeAccess indexedBeanAccess;
	private final IJvmTypeProvider typeProvider;

	public BeanTypeProvider(ResourceSet resourceSet,
			IIndexedBeanTypeAccess indexedBeanAccess,
			IJvmTypeProvider typeProvider) {
		super();
		this.resourceSet = resourceSet;
		this.indexedBeanAccess = indexedBeanAccess;
		this.typeProvider = typeProvider;

		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(BeanTypeHelper.PROTOCOL, this);
	}

	@Override
	public BBeanType getType(JvmDeclaredType jvmType) {
		return null;
	}

	@Override
	public Resource createResource(URI uri) {
		BeanTypeResource resource = new BeanTypeResource(uri, typeProvider);
		resource.setIndexAccess(indexedBeanAccess);
		return resource;
	}

}
