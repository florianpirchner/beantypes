package com.lunifera.beantypes.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.lunifera.beantypes.index.api.IIndexedBeanTypeAccess;

public class BeanTypeResource extends ResourceImpl {

	private IIndexedBeanTypeAccess indexAccess;

	public BeanTypeResource() {
		super();
	}

	public BeanTypeResource(URI uri) {
		super(uri);
	}

	/**
	 * @return the indexAccess
	 */
	public IIndexedBeanTypeAccess getIndexAccess() {
		return indexAccess;
	}

	/**
	 * @param indexAccess
	 *            the indexAccess to set
	 */
	public void setIndexAccess(IIndexedBeanTypeAccess indexAccess) {
		this.indexAccess = indexAccess;
	}

}
