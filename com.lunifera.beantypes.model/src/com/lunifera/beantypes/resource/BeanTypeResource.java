package com.lunifera.beantypes.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;

import com.lunifera.beantypes.BType;
import com.lunifera.beantypes.access.api.BeanTypeHelper;
import com.lunifera.beantypes.access.impl.BeanTypesFactory;
import com.lunifera.beantypes.index.api.IIndexedBeanTypeAccess;

@SuppressWarnings("restriction")
public class BeanTypeResource extends ResourceImpl {

	private final IJvmTypeProvider typeProvider;
	private IIndexedBeanTypeAccess indexAccess;

	public BeanTypeResource(URI uri, IJvmTypeProvider typeProvider) {
		super(uri);
		this.typeProvider = typeProvider;
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		if (getURI() != null) {

			String className = BeanTypeHelper.getClassName(getURI());
			JvmType jvmType = typeProvider.findTypeByName(className);

			// check if things match
			if ((jvmType instanceof JvmPrimitiveType && !BeanTypeHelper
					.isPrimitive(uri))
					|| (jvmType instanceof JvmDeclaredType && BeanTypeHelper
							.isObject(uri))) {
				throw new IllegalArgumentException(uri + " <--> " + className
						+ " : Something went wrong!");
			}

			// create the new type
			BType bType = null;
			if (BeanTypeHelper.isPrimitive(uri)) {
				bType = new BeanTypesFactory()
						.createPrimitiveType((JvmPrimitiveType) jvmType);
			} else if (BeanTypeHelper.isObject(uri)) {
				bType = new BeanTypesFactory()
						.createBeanType((JvmDeclaredType) jvmType);
			} else {
				throw new IllegalArgumentException(uri
						+ " is not a valid type!");
			}

			getContents().add(bType);
		}
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
