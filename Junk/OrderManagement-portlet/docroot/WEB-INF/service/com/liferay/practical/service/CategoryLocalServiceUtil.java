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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Category. This utility wraps
 * {@link com.liferay.practical.service.impl.CategoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author saifulla
 * @see CategoryLocalService
 * @see com.liferay.practical.service.base.CategoryLocalServiceBaseImpl
 * @see com.liferay.practical.service.impl.CategoryLocalServiceImpl
 * @generated
 */
public class CategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.practical.service.impl.CategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the category to the database. Also notifies the appropriate model listeners.
	*
	* @param category the category
	* @return the category that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category addCategory(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCategory(category);
	}

	/**
	* Creates a new category with the primary key. Does not add the category to the database.
	*
	* @param categoryid the primary key for the new category
	* @return the new category
	*/
	public static com.liferay.practical.model.Category createCategory(
		long categoryid) {
		return getService().createCategory(categoryid);
	}

	/**
	* Deletes the category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryid the primary key of the category
	* @return the category that was removed
	* @throws PortalException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category deleteCategory(
		long categoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCategory(categoryid);
	}

	/**
	* Deletes the category from the database. Also notifies the appropriate model listeners.
	*
	* @param category the category
	* @return the category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category deleteCategory(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCategory(category);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.practical.model.Category fetchCategory(
		long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCategory(categoryid);
	}

	/**
	* Returns the category with the primary key.
	*
	* @param categoryid the primary key of the category
	* @return the category
	* @throws PortalException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category getCategory(
		long categoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategory(categoryid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.liferay.practical.model.Category> getCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategories(start, end);
	}

	/**
	* Returns the number of categories.
	*
	* @return the number of categories
	* @throws SystemException if a system exception occurred
	*/
	public static int getCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategoriesCount();
	}

	/**
	* Updates the category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param category the category
	* @return the category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category updateCategory(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCategory(category);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrdersCategory(long orderid, long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addOrdersCategory(orderid, categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrdersCategory(long orderid,
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addOrdersCategory(orderid, category);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrdersCategories(long orderid, long[] categoryids)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addOrdersCategories(orderid, categoryids);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrdersCategories(long orderid,
		java.util.List<com.liferay.practical.model.Category> Categories)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addOrdersCategories(orderid, Categories);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearOrdersCategories(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearOrdersCategories(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrdersCategory(long orderid, long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteOrdersCategory(orderid, categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrdersCategory(long orderid,
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteOrdersCategory(orderid, category);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrdersCategories(long orderid, long[] categoryids)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteOrdersCategories(orderid, categoryids);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrdersCategories(long orderid,
		java.util.List<com.liferay.practical.model.Category> Categories)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteOrdersCategories(orderid, Categories);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Category> getOrdersCategories(
		long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrdersCategories(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Category> getOrdersCategories(
		long orderid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrdersCategories(orderid, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Category> getOrdersCategories(
		long orderid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOrdersCategories(orderid, start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrdersCategoriesCount(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrdersCategoriesCount(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasOrdersCategory(long orderid, long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasOrdersCategory(orderid, categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasOrdersCategories(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasOrdersCategories(orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setOrdersCategories(long orderid, long[] categoryids)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setOrdersCategories(orderid, categoryids);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static CategoryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CategoryLocalService.class.getName());

			if (invokableLocalService instanceof CategoryLocalService) {
				_service = (CategoryLocalService)invokableLocalService;
			}
			else {
				_service = new CategoryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CategoryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CategoryLocalService service) {
	}

	private static CategoryLocalService _service;
}