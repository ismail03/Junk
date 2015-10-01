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

package com.liferay.practical.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CategoryLocalService}.
 *
 * @author saifulla
 * @see CategoryLocalService
 * @generated
 */
public class CategoryLocalServiceWrapper implements CategoryLocalService,
	ServiceWrapper<CategoryLocalService> {
	public CategoryLocalServiceWrapper(
		CategoryLocalService categoryLocalService) {
		_categoryLocalService = categoryLocalService;
	}

	/**
	* Adds the category to the database. Also notifies the appropriate model listeners.
	*
	* @param category the category
	* @return the category that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Category addCategory(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.addCategory(category);
	}

	/**
	* Creates a new category with the primary key. Does not add the category to the database.
	*
	* @param categoryid the primary key for the new category
	* @return the new category
	*/
	@Override
	public com.liferay.practical.model.Category createCategory(long categoryid) {
		return _categoryLocalService.createCategory(categoryid);
	}

	/**
	* Deletes the category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryid the primary key of the category
	* @return the category that was removed
	* @throws PortalException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Category deleteCategory(long categoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.deleteCategory(categoryid);
	}

	/**
	* Deletes the category from the database. Also notifies the appropriate model listeners.
	*
	* @param category the category
	* @return the category that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Category deleteCategory(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.deleteCategory(category);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _categoryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.CategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.CategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.practical.model.Category fetchCategory(long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.fetchCategory(categoryid);
	}

	/**
	* Returns the category with the primary key.
	*
	* @param categoryid the primary key of the category
	* @return the category
	* @throws PortalException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Category getCategory(long categoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getCategory(categoryid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.CategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of categories
	* @param end the upper bound of the range of categories (not inclusive)
	* @return the range of categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.practical.model.Category> getCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getCategories(start, end);
	}

	/**
	* Returns the number of categories.
	*
	* @return the number of categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getCategoriesCount();
	}

	/**
	* Updates the category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param category the category
	* @return the category that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Category updateCategory(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.updateCategory(category);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrdersCategory(long orderid, long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.addOrdersCategory(orderid, categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrdersCategory(long orderid,
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.addOrdersCategory(orderid, category);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrdersCategories(long orderid, long[] categoryids)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.addOrdersCategories(orderid, categoryids);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrdersCategories(long orderid,
		java.util.List<com.liferay.practical.model.Category> Categories)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.addOrdersCategories(orderid, Categories);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearOrdersCategories(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.clearOrdersCategories(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrdersCategory(long orderid, long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.deleteOrdersCategory(orderid, categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrdersCategory(long orderid,
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.deleteOrdersCategory(orderid, category);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrdersCategories(long orderid, long[] categoryids)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.deleteOrdersCategories(orderid, categoryids);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrdersCategories(long orderid,
		java.util.List<com.liferay.practical.model.Category> Categories)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.deleteOrdersCategories(orderid, Categories);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.practical.model.Category> getOrdersCategories(
		long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getOrdersCategories(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.practical.model.Category> getOrdersCategories(
		long orderid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getOrdersCategories(orderid, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.practical.model.Category> getOrdersCategories(
		long orderid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getOrdersCategories(orderid, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOrdersCategoriesCount(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.getOrdersCategoriesCount(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasOrdersCategory(long orderid, long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.hasOrdersCategory(orderid, categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasOrdersCategories(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryLocalService.hasOrdersCategories(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setOrdersCategories(long orderid, long[] categoryids)
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryLocalService.setOrdersCategories(orderid, categoryids);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _categoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_categoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _categoryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CategoryLocalService getWrappedCategoryLocalService() {
		return _categoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCategoryLocalService(
		CategoryLocalService categoryLocalService) {
		_categoryLocalService = categoryLocalService;
	}

	@Override
	public CategoryLocalService getWrappedService() {
		return _categoryLocalService;
	}

	@Override
	public void setWrappedService(CategoryLocalService categoryLocalService) {
		_categoryLocalService = categoryLocalService;
	}

	private CategoryLocalService _categoryLocalService;
}