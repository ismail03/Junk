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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for tops_user. This utility wraps
 * {@link com.liferay.practicle.slayer.service.impl.tops_userLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Ismail
 * @see tops_userLocalService
 * @see com.liferay.practicle.slayer.service.base.tops_userLocalServiceBaseImpl
 * @see com.liferay.practicle.slayer.service.impl.tops_userLocalServiceImpl
 * @generated
 */
public class tops_userLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.practicle.slayer.service.impl.tops_userLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tops_user to the database. Also notifies the appropriate model listeners.
	*
	* @param tops_user the tops_user
	* @return the tops_user that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user addtops_user(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addtops_user(tops_user);
	}

	/**
	* Creates a new tops_user with the primary key. Does not add the tops_user to the database.
	*
	* @param tops_userId the primary key for the new tops_user
	* @return the new tops_user
	*/
	public static com.liferay.practicle.slayer.model.tops_user createtops_user(
		long tops_userId) {
		return getService().createtops_user(tops_userId);
	}

	/**
	* Deletes the tops_user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user that was removed
	* @throws PortalException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user deletetops_user(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletetops_user(tops_userId);
	}

	/**
	* Deletes the tops_user from the database. Also notifies the appropriate model listeners.
	*
	* @param tops_user the tops_user
	* @return the tops_user that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user deletetops_user(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletetops_user(tops_user);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practicle.slayer.model.impl.tops_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.practicle.slayer.model.tops_user fetchtops_user(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchtops_user(tops_userId);
	}

	/**
	* Returns the tops_user with the primary key.
	*
	* @param tops_userId the primary key of the tops_user
	* @return the tops_user
	* @throws PortalException if a tops_user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user gettops_user(
		long tops_userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().gettops_user(tops_userId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.liferay.practicle.slayer.model.tops_user> gettops_users(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().gettops_users(start, end);
	}

	/**
	* Returns the number of tops_users.
	*
	* @return the number of tops_users
	* @throws SystemException if a system exception occurred
	*/
	public static int gettops_usersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().gettops_usersCount();
	}

	/**
	* Updates the tops_user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tops_user the tops_user
	* @return the tops_user that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.practicle.slayer.model.tops_user updatetops_user(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatetops_user(tops_user);
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

	public static tops_userLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					tops_userLocalService.class.getName());

			if (invokableLocalService instanceof tops_userLocalService) {
				_service = (tops_userLocalService)invokableLocalService;
			}
			else {
				_service = new tops_userLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(tops_userLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(tops_userLocalService service) {
	}

	private static tops_userLocalService _service;
}