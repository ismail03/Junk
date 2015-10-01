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

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.practicle.slayer.model.tops_user;

/**
 * The persistence interface for the tops_user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ismail
 * @see tops_userPersistenceImpl
 * @see tops_userUtil
 * @generated
 */
public interface tops_userPersistence extends BasePersistence<tops_user> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link tops_userUtil} to access the tops_user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tops_user in the entity cache if it is enabled.
	*
	* @param tops_user the tops_user
	*/
	public void cacheResult(
		com.liferay.practicle.slayer.model.tops_user tops_user);

	/**
	* Caches the tops_users in the entity cache if it is enabled.
	*
	* @param tops_users the tops_users
	*/
	public void cacheResult(
		java.util.List<com.liferay.practicle.slayer.model.tops_user> tops_users);

	/**
	* Creates a new tops_user with the primary key. Does not add the tops_user to the database.
	*
	* @param tops_userId the primary key for the new tops_user
	* @return the new tops_user
	*/
	public com.liferay.practicle.slayer.model.tops_user create(long tops_userId);

	/**
	* Removes the tops_user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user that was removed
	* @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practicle.slayer.model.tops_user remove(long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practicle.slayer.NoSuchtops_userException;

	public com.liferay.practicle.slayer.model.tops_user updateImpl(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tops_user with the primary key or throws a {@link com.liferay.practicle.slayer.NoSuchtops_userException} if it could not be found.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user
	* @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practicle.slayer.model.tops_user findByPrimaryKey(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practicle.slayer.NoSuchtops_userException;

	/**
	* Returns the tops_user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user, or <code>null</code> if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practicle.slayer.model.tops_user fetchByPrimaryKey(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tops_users.
	*
	* @return the tops_users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practicle.slayer.model.tops_user> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.practicle.slayer.model.tops_user> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.practicle.slayer.model.tops_user> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tops_users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tops_users.
	*
	* @return the number of tops_users
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}