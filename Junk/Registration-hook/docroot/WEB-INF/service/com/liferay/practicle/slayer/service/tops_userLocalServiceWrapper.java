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

package com.liferay.practicle.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link tops_userLocalService}.
 *
 * @author Ismail
 * @see tops_userLocalService
 * @generated
 */
public class tops_userLocalServiceWrapper implements tops_userLocalService,
	ServiceWrapper<tops_userLocalService> {
	public tops_userLocalServiceWrapper(
		tops_userLocalService tops_userLocalService) {
		_tops_userLocalService = tops_userLocalService;
	}

	/**
	* Adds the tops_user to the database. Also notifies the appropriate model listeners.
	*
	* @param tops_user the tops_user
	* @return the tops_user that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practicle.slayer.model.tops_user addtops_user(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.addtops_user(tops_user);
	}

	/**
	* Creates a new tops_user with the primary key. Does not add the tops_user to the database.
	*
	* @param tops_userId the primary key for the new tops_user
	* @return the new tops_user
	*/
	@Override
	public com.liferay.practicle.slayer.model.tops_user createtops_user(
		long tops_userId) {
		return _tops_userLocalService.createtops_user(tops_userId);
	}

	/**
	* Deletes the tops_user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user that was removed
	* @throws PortalException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practicle.slayer.model.tops_user deletetops_user(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.deletetops_user(tops_userId);
	}

	/**
	* Deletes the tops_user from the database. Also notifies the appropriate model listeners.
	*
	* @param tops_user the tops_user
	* @return the tops_user that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practicle.slayer.model.tops_user deletetops_user(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.deletetops_user(tops_user);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tops_userLocalService.dynamicQuery();
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
		return _tops_userLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practicle.slayer.model.impl.tops_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tops_userLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practicle.slayer.model.impl.tops_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tops_userLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tops_userLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tops_userLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.practicle.slayer.model.tops_user fetchtops_user(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.fetchtops_user(tops_userId);
	}

	/**
	* Returns the tops_user with the primary key.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user
	* @throws PortalException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practicle.slayer.model.tops_user gettops_user(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.gettops_user(tops_userId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.liferay.practicle.slayer.model.tops_user> gettops_users(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.gettops_users(start, end);
	}

	/**
	* Returns the number of tops_users.
	*
	* @return the number of tops_users
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int gettops_usersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.gettops_usersCount();
	}

	/**
	* Updates the tops_user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tops_user the tops_user
	* @return the tops_user that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practicle.slayer.model.tops_user updatetops_user(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tops_userLocalService.updatetops_user(tops_user);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tops_userLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tops_userLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tops_userLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public tops_userLocalService getWrappedtops_userLocalService() {
		return _tops_userLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedtops_userLocalService(
		tops_userLocalService tops_userLocalService) {
		_tops_userLocalService = tops_userLocalService;
	}

	@Override
	public tops_userLocalService getWrappedService() {
		return _tops_userLocalService;
	}

	@Override
	public void setWrappedService(tops_userLocalService tops_userLocalService) {
		_tops_userLocalService = tops_userLocalService;
	}

	private tops_userLocalService _tops_userLocalService;
}