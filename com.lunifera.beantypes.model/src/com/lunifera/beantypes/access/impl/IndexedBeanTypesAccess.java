package com.lunifera.beantypes.access.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.lunifera.beantypes.BBeanType;
import com.lunifera.beantypes.index.api.IIndexedBeanTypeAccess;

public class IndexedBeanTypesAccess implements IIndexedBeanTypeAccess {

	@Override
	public BBeanType getIndexedType(URI uri, ResourceSet rs) {
		return null;
	}

}
