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

package com.liferay.practical.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.practical.model.Category;

import java.util.List;

/**
 * The persistence utility for the category service. This utility wraps {@link CategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author saifulla
 * @see CategoryPersistence
 * @see CategoryPersistenceImpl
 * @generated
 */
public class CategoryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Category category) {
		getPersistence().clearCache(category);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Category> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Category> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Category> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Category update(Category category) throws SystemException {
		return getPersistence().update(category);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Category update(Category category,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(category, serviceContext);
	}

	/**
	* Caches the category in the entity cache if it is enabled.
	*
	* @param category the category
	*/
	public static void cacheResult(
		com.liferay.practical.model.Category category) {
		getPersistence().cacheResult(category);
	}

	/**
	* Caches the categories in the entity cache if it is enabled.
	*
	* @param categories the categories
	*/
	public static void cacheResult(
		java.util.List<com.liferay.practical.model.Category> categories) {
		getPersistence().cacheResult(categories);
	}

	/**
	* Creates a new category with the primary key. Does not add the category to the database.
	*
	* @param categoryid the primary key for the new category
	* @return the new category
	*/
	public static com.liferay.practical.model.Category create(long categoryid) {
		return getPersistence().create(categoryid);
	}

	/**
	* Removes the category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryid the primary key of the category
	* @return the category that was removed
	* @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category remove(long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchCategoryException {
		return getPersistence().remove(categoryid);
	}

	public static com.liferay.practical.model.Category updateImpl(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(category);
	}

	/**
	* Returns the category with the primary key or throws a {@link com.liferay.practical.NoSuchCategoryException} if it could not be found.
	*
	* @param categoryid the primary key of the category
	* @return the category
	* @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category findByPrimaryKey(
		long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchCategoryException {
		return getPersistence().findByPrimaryKey(categoryid);
	}

	/**
	* Returns the category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryid the primary key of the category
	* @return the category, or <code>null</code> if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practical.model.Category fetchByPrimaryKey(
		long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(categoryid);
	}

	/**
	* Returns all the categories.
	*
	* @return the categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Category> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.practical.model.Category> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.CategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of categories
	* @param end the upper bound of the range of categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Category> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of categories.
	*
	* @return the number of categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the orderses associated with the category.
	*
	* @param pk the primary key of the category
	* @return the orderses associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Orders> getOrderses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getOrderses(pk);
	}

	/**
	* Returns a range of all the orderses associated with the category.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.CategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the category
	* @param start the lower bound of the range of categories
	* @param end the upper bound of the range of categories (not inclusive)
	* @return the range of orderses associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Orders> getOrderses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getOrderses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the orderses associated with the category.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.CategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the category
	* @param start the lower bound of the range of categories
	* @param end the upper bound of the range of categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of orderses associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practical.model.Orders> getOrderses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getOrderses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of orderses associated with the category.
	*
	* @param pk the primary key of the category
	* @return the number of orderses associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrdersesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getOrdersesSize(pk);
	}

	/**
	* Returns <code>true</code> if the orders is associated with the category.
	*
	* @param pk the primary key of the category
	* @param ordersPK the primary key of the orders
	* @return <code>true</code> if the orders is associated with the category; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsOrders(long pk, long ordersPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsOrders(pk, ordersPK);
	}

	/**
	* Returns <code>true</code> if the category has any orderses associated with it.
	*
	* @param pk the primary key of the category to check for associations with orderses
	* @return <code>true</code> if the category has any orderses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsOrderses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsOrderses(pk);
	}

	/**
	* Adds an association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPK the primary key of the orders
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrders(long pk, long ordersPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addOrders(pk, ordersPK);
	}

	/**
	* Adds an association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orders the orders
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrders(long pk,
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addOrders(pk, orders);
	}

	/**
	* Adds an association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPKs the primary keys of the orderses
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrderses(long pk, long[] ordersPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addOrderses(pk, ordersPKs);
	}

	/**
	* Adds an association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orderses the orderses
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrderses(long pk,
		java.util.List<com.liferay.practical.model.Orders> orderses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addOrderses(pk, orderses);
	}

	/**
	* Clears all associations between the category and its orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category to clear the associated orderses from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearOrderses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearOrderses(pk);
	}

	/**
	* Removes the association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPK the primary key of the orders
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrders(long pk, long ordersPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeOrders(pk, ordersPK);
	}

	/**
	* Removes the association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orders the orders
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrders(long pk,
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeOrders(pk, orders);
	}

	/**
	* Removes the association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPKs the primary keys of the orderses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrderses(long pk, long[] ordersPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeOrderses(pk, ordersPKs);
	}

	/**
	* Removes the association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orderses the orderses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrderses(long pk,
		java.util.List<com.liferay.practical.model.Orders> orderses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeOrderses(pk, orderses);
	}

	/**
	* Sets the orderses associated with the category, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPKs the primary keys of the orderses to be associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public static void setOrderses(long pk, long[] ordersPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setOrderses(pk, ordersPKs);
	}

	/**
	* Sets the orderses associated with the category, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orderses the orderses to be associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public static void setOrderses(long pk,
		java.util.List<com.liferay.practical.model.Orders> orderses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setOrderses(pk, orderses);
	}

	public static CategoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CategoryPersistence)PortletBeanLocatorUtil.locate(com.liferay.practical.service.ClpSerializer.getServletContextName(),
					CategoryPersistence.class.getName());

			ReferenceRegistry.registerReference(CategoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CategoryPersistence persistence) {
	}

	private static CategoryPersistence _persistence;
}