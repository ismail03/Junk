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

package com.liferay.practicle.slayer.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.practicle.slayer.model.tops_user;

import java.util.List;

/**
 * The persistence utility for the tops_user service. This utility wraps {@link tops_userPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ismail
 * @see tops_userPersistence
 * @see tops_userPersistenceImpl
 * @generated
 */
public class tops_userUtil {
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
	public static void clearCache(tops_user tops_user) {
		getPersistence().clearCache(tops_user);
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
	public static List<tops_user> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<tops_user> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<tops_user> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static tops_user update(tops_user tops_user)
		throws SystemException {
		return getPersistence().update(tops_user);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static tops_user update(tops_user tops_user,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tops_user, serviceContext);
	}

	/**
	* Caches the tops_user in the entity cache if it is enabled.
	*
	* @param tops_user the tops_user
	*/
	public static void cacheResult(
		com.liferay.practicle.slayer.model.tops_user tops_user) {
		getPersistence().cacheResult(tops_user);
	}

	/**
	* Caches the tops_users in the entity cache if it is enabled.
	*
	* @param tops_users the tops_users
	*/
	public static void cacheResult(
		java.util.List<com.liferay.practicle.slayer.model.tops_user> tops_users) {
		getPersistence().cacheResult(tops_users);
	}

	/**
	* Creates a new tops_user with the primary key. Does not add the tops_user to the database.
	*
	* @param tops_userId the primary key for the new tops_user
	* @return the new tops_user
	*/
	public static com.liferay.practicle.slayer.model.tops_user create(
		long tops_userId) {
		return getPersistence().create(tops_userId);
	}

	/**
	* Removes the tops_user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user that was removed
	* @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user remove(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practicle.slayer.NoSuchtops_userException {
		return getPersistence().remove(tops_userId);
	}

	public static com.liferay.practicle.slayer.model.tops_user updateImpl(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tops_user);
	}

	/**
	* Returns the tops_user with the primary key or throws a {@link com.liferay.practicle.slayer.NoSuchtops_userException} if it could not be found.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user
	* @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user findByPrimaryKey(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practicle.slayer.NoSuchtops_userException {
		return getPersistence().findByPrimaryKey(tops_userId);
	}

	/**
	* Returns the tops_user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user, or <code>null</code> if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user fetchByPrimaryKey(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tops_userId);
	}

	/**
	* Returns all the tops_users.
	*
	* @return the tops_users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practicle.slayer.model.tops_user> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tops_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practicle.slayer.model.impl.tops_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tops_users
	* @param end the upper bound of the range of tops_users (not inclusive)
	* @return the range of tops_users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practicle.slayer.model.tops_user> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tops_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practicle.slayer.model.impl.tops_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tops_users
	* @param end the upper bound of the range of tops_users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tops_users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.practicle.slayer.model.tops_user> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tops_users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tops_users.
	*
	* @return the number of tops_users
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static tops_userPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (tops_userPersistence)PortletBeanLocatorUtil.locate(com.liferay.practicle.slayer.service.ClpSerializer.getServletContextName(),
					tops_userPersistence.class.getName());

			ReferenceRegistry.registerReference(tops_userUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(tops_userPersistence persistence) {
	}

	private static tops_userPersistence _persistence;
}