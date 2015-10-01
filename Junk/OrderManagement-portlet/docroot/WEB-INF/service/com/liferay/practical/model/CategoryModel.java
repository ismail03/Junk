/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.practical.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Category service. Represents a row in the &quot;Category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.practical.model.impl.CategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.practical.model.impl.CategoryImpl}.
 * </p>
 *
 * @author saifulla
 * @see Category
 * @see com.liferay.practical.model.impl.CategoryImpl
 * @see com.liferay.practical.model.impl.CategoryModelImpl
 * @generated
 */
public interface CategoryModel extends BaseModel<Category> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a category model instance should use the {@link Category} interface instead.
	 */

	/**
	 * Returns the primary key of this category.
	 *
	 * @return the primary key of this category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this category.
	 *
	 * @param primaryKey the primary key of this category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the categoryid of this category.
	 *
	 * @return the categoryid of this category
	 */
	public long getCategoryid();

	/**
	 * Sets the categoryid of this category.
	 *
	 * @param categoryid the categoryid of this category
	 */
	public void setCategoryid(long categoryid);

	/**
	 * Returns the categoryname of this category.
	 *
	 * @return the categoryname of this category
	 */
	@AutoEscape
	public String getCategoryname();

	/**
	 * Sets the categoryname of this category.
	 *
	 * @param categoryname the categoryname of this category
	 */
	public void setCategoryname(String categoryname);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Category category);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Category> toCacheModel();

	@Override
	public Category toEscapedModel();

	@Override
	public Category toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}