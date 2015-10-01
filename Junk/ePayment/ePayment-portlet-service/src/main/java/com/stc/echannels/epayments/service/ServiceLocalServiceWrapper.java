/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ServiceLocalService}.
 *
 * @author ahmed_fadlus
 * @see ServiceLocalService
 * @generated
 */
public class ServiceLocalServiceWrapper implements ServiceLocalService,
	ServiceWrapper<ServiceLocalService> {
	public ServiceLocalServiceWrapper(ServiceLocalService serviceLocalService) {
		_serviceLocalService = serviceLocalService;
	}

	/**
	* Adds the service to the database. Also notifies the appropriate model listeners.
	*
	* @param service the service
	* @return the service that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.stc.echannels.epayments.model.Service addService(
		com.stc.echannels.epayments.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.addService(service);
	}

	/**
	* Creates a new service with the primary key. Does not add the service to the database.
	*
	* @param serviceId the primary key for the new service
	* @return the new service
	*/
	@Override
	public com.stc.echannels.epayments.model.Service createService(
		long serviceId) {
		return _serviceLocalService.createService(serviceId);
	}

	/**
	* Deletes the service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceId the primary key of the service
	* @return the service that was removed
	* @throws PortalException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.stc.echannels.epayments.model.Service deleteService(
		long serviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.deleteService(serviceId);
	}

	/**
	* Deletes the service from the database. Also notifies the appropriate model listeners.
	*
	* @param service the service
	* @return the service that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.stc.echannels.epayments.model.Service deleteService(
		com.stc.echannels.epayments.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.deleteService(service);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceLocalService.dynamicQuery();
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
		return _serviceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _serviceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.stc.echannels.epayments.model.Service fetchService(
		long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.fetchService(serviceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @return the range of services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.stc.echannels.epayments.model.Service> getServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.getServices(start, end);
	}

	/**
	* Returns the number of services.
	*
	* @return the number of services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.getServicesCount();
	}

	/**
	* Updates the service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param service the service
	* @return the service that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.stc.echannels.epayments.model.Service updateService(
		com.stc.echannels.epayments.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceLocalService.updateService(service);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _serviceLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceLocalService getWrappedServiceLocalService() {
		return _serviceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceLocalService(
		ServiceLocalService serviceLocalService) {
		_serviceLocalService = serviceLocalService;
	}

	@Override
	public ServiceLocalService getWrappedService() {
		return _serviceLocalService;
	}

	@Override
	public void setWrappedService(ServiceLocalService serviceLocalService) {
		_serviceLocalService = serviceLocalService;
	}

	private ServiceLocalService _serviceLocalService;
}