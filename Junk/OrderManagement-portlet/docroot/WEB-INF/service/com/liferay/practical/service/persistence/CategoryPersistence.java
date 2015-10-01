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

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.practical.model.Category;

/**
 * The persistence interface for the category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author saifulla
 * @see CategoryPersistenceImpl
 * @see CategoryUtil
 * @generated
 */
public interface CategoryPersistence extends BasePersistence<Category> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CategoryUtil} to access the category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the category in the entity cache if it is enabled.
	*
	* @param category the category
	*/
	public void cacheResult(com.liferay.practical.model.Category category);

	/**
	* Caches the categories in the entity cache if it is enabled.
	*
	* @param categories the categories
	*/
	public void cacheResult(
		java.util.List<com.liferay.practical.model.Category> categories);

	/**
	* Creates a new category with the primary key. Does not add the category to the database.
	*
	* @param categoryid the primary key for the new category
	* @return the new category
	*/
	public com.liferay.practical.model.Category create(long categoryid);

	/**
	* Removes the category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryid the primary key of the category
	* @return the category that was removed
	* @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Category remove(long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchCategoryException;

	public com.liferay.practical.model.Category updateImpl(
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the category with the primary key or throws a {@link com.liferay.practical.NoSuchCategoryException} if it could not be found.
	*
	* @param categoryid the primary key of the category
	* @return the category
	* @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Category findByPrimaryKey(
		long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchCategoryException;

	/**
	* Returns the category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryid the primary key of the category
	* @return the category, or <code>null</code> if a category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Category fetchByPrimaryKey(
		long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the categories.
	*
	* @return the categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Category> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.practical.model.Category> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.practical.model.Category> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of categories.
	*
	* @return the number of categories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the orderses associated with the category.
	*
	* @param pk the primary key of the category
	* @return the orderses associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> getOrderses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.practical.model.Orders> getOrderses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.practical.model.Orders> getOrderses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orderses associated with the category.
	*
	* @param pk the primary key of the category
	* @return the number of orderses associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public int getOrdersesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the orders is associated with the category.
	*
	* @param pk the primary key of the category
	* @param ordersPK the primary key of the orders
	* @return <code>true</code> if the orders is associated with the category; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsOrders(long pk, long ordersPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the category has any orderses associated with it.
	*
	* @param pk the primary key of the category to check for associations with orderses
	* @return <code>true</code> if the category has any orderses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsOrderses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPK the primary key of the orders
	* @throws SystemException if a system exception occurred
	*/
	public void addOrders(long pk, long ordersPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orders the orders
	* @throws SystemException if a system exception occurred
	*/
	public void addOrders(long pk, com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPKs the primary keys of the orderses
	* @throws SystemException if a system exception occurred
	*/
	public void addOrderses(long pk, long[] ordersPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orderses the orderses
	* @throws SystemException if a system exception occurred
	*/
	public void addOrderses(long pk,
		java.util.List<com.liferay.practical.model.Orders> orderses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the category and its orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category to clear the associated orderses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearOrderses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPK the primary key of the orders
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrders(long pk, long ordersPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orders the orders
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrders(long pk, com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPKs the primary keys of the orderses
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrderses(long pk, long[] ordersPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orderses the orderses
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrderses(long pk,
		java.util.List<com.liferay.practical.model.Orders> orderses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the orderses associated with the category, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param ordersPKs the primary keys of the orderses to be associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public void setOrderses(long pk, long[] ordersPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the orderses associated with the category, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the category
	* @param orderses the orderses to be associated with the category
	* @throws SystemException if a system exception occurred
	*/
	public void setOrderses(long pk,
		java.util.List<com.liferay.practical.model.Orders> orderses)
		throws com.liferay.portal.kernel.exception.SystemException;
}