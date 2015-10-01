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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Category}.
 * </p>
 *
 * @author saifulla
 * @see Category
 * @generated
 */
public class CategoryWrapper implements Category, ModelWrapper<Category> {
	public CategoryWrapper(Category category) {
		_category = category;
	}

	@Override
	public Class<?> getModelClass() {
		return Category.class;
	}

	@Override
	public String getModelClassName() {
		return Category.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoryid", getCategoryid());
		attributes.put("categoryname", getCategoryname());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long categoryid = (Long)attributes.get("categoryid");

		if (categoryid != null) {
			setCategoryid(categoryid);
		}

		String categoryname = (String)attributes.get("categoryname");

		if (categoryname != null) {
			setCategoryname(categoryname);
		}
	}

	/**
	* Returns the primary key of this category.
	*
	* @return the primary key of this category
	*/
	@Override
	public long getPrimaryKey() {
		return _category.getPrimaryKey();
	}

	/**
	* Sets the primary key of this category.
	*
	* @param primaryKey the primary key of this category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_category.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the categoryid of this category.
	*
	* @return the categoryid of this category
	*/
	@Override
	public long getCategoryid() {
		return _category.getCategoryid();
	}

	/**
	* Sets the categoryid of this category.
	*
	* @param categoryid the categoryid of this category
	*/
	@Override
	public void setCategoryid(long categoryid) {
		_category.setCategoryid(categoryid);
	}

	/**
	* Returns the categoryname of this category.
	*
	* @return the categoryname of this category
	*/
	@Override
	public java.lang.String getCategoryname() {
		return _category.getCategoryname();
	}

	/**
	* Sets the categoryname of this category.
	*
	* @param categoryname the categoryname of this category
	*/
	@Override
	public void setCategoryname(java.lang.String categoryname) {
		_category.setCategoryname(categoryname);
	}

	@Override
	public boolean isNew() {
		return _category.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_category.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _category.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_category.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _category.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _category.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_category.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _category.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_category.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_category.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_category.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CategoryWrapper((Category)_category.clone());
	}

	@Override
	public int compareTo(com.liferay.practical.model.Category category) {
		return _category.compareTo(category);
	}

	@Override
	public int hashCode() {
		return _category.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.practical.model.Category> toCacheModel() {
		return _category.toCacheModel();
	}

	@Override
	public com.liferay.practical.model.Category toEscapedModel() {
		return new CategoryWrapper(_category.toEscapedModel());
	}

	@Override
	public com.liferay.practical.model.Category toUnescapedModel() {
		return new CategoryWrapper(_category.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _category.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _category.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_category.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CategoryWrapper)) {
			return false;
		}

		CategoryWrapper categoryWrapper = (CategoryWrapper)obj;

		if (Validator.equals(_category, categoryWrapper._category)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Category getWrappedCategory() {
		return _category;
	}

	@Override
	public Category getWrappedModel() {
		return _category;
	}

	@Override
	public void resetOriginalValues() {
		_category.resetOriginalValues();
	}

	private Category _category;
}