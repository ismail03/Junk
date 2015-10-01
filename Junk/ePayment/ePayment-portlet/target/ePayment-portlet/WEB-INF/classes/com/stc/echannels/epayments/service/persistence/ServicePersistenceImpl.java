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

package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.stc.echannels.epayments.NoSuchServiceException;
import com.stc.echannels.epayments.model.Service;
import com.stc.echannels.epayments.model.impl.ServiceImpl;
import com.stc.echannels.epayments.model.impl.ServiceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see ServicePersistence
 * @see ServiceUtil
 * @generated
 */
public class ServicePersistenceImpl extends BasePersistenceImpl<Service>
	implements ServicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceUtil} to access the service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceModelImpl.ENTITY_CACHE_ENABLED,
			ServiceModelImpl.FINDER_CACHE_ENABLED, ServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceModelImpl.ENTITY_CACHE_ENABLED,
			ServiceModelImpl.FINDER_CACHE_ENABLED, ServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceModelImpl.ENTITY_CACHE_ENABLED,
			ServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ServicePersistenceImpl() {
		setModelClass(Service.class);
	}

	/**
	 * Caches the service in the entity cache if it is enabled.
	 *
	 * @param service the service
	 */
	@Override
	public void cacheResult(Service service) {
		EntityCacheUtil.putResult(ServiceModelImpl.ENTITY_CACHE_ENABLED,
			ServiceImpl.class, service.getPrimaryKey(), service);

		service.resetOriginalValues();
	}

	/**
	 * Caches the services in the entity cache if it is enabled.
	 *
	 * @param services the services
	 */
	@Override
	public void cacheResult(List<Service> services) {
		for (Service service : services) {
			if (EntityCacheUtil.getResult(
						ServiceModelImpl.ENTITY_CACHE_ENABLED,
						ServiceImpl.class, service.getPrimaryKey()) == null) {
				cacheResult(service);
			}
			else {
				service.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Service service) {
		EntityCacheUtil.removeResult(ServiceModelImpl.ENTITY_CACHE_ENABLED,
			ServiceImpl.class, service.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Service> services) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Service service : services) {
			EntityCacheUtil.removeResult(ServiceModelImpl.ENTITY_CACHE_ENABLED,
				ServiceImpl.class, service.getPrimaryKey());
		}
	}

	/**
	 * Creates a new service with the primary key. Does not add the service to the database.
	 *
	 * @param serviceId the primary key for the new service
	 * @return the new service
	 */
	@Override
	public Service create(long serviceId) {
		Service service = new ServiceImpl();

		service.setNew(true);
		service.setPrimaryKey(serviceId);

		return service;
	}

	/**
	 * Removes the service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceId the primary key of the service
	 * @return the service that was removed
	 * @throws com.stc.echannels.epayments.NoSuchServiceException if a service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Service remove(long serviceId)
		throws NoSuchServiceException, SystemException {
		return remove((Serializable)serviceId);
	}

	/**
	 * Removes the service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service
	 * @return the service that was removed
	 * @throws com.stc.echannels.epayments.NoSuchServiceException if a service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Service remove(Serializable primaryKey)
		throws NoSuchServiceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Service service = (Service)session.get(ServiceImpl.class, primaryKey);

			if (service == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(service);
		}
		catch (NoSuchServiceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Service removeImpl(Service service) throws SystemException {
		service = toUnwrappedModel(service);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(service)) {
				service = (Service)session.get(ServiceImpl.class,
						service.getPrimaryKeyObj());
			}

			if (service != null) {
				session.delete(service);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (service != null) {
			clearCache(service);
		}

		return service;
	}

	@Override
	public Service updateImpl(com.stc.echannels.epayments.model.Service service)
		throws SystemException {
		service = toUnwrappedModel(service);

		boolean isNew = service.isNew();

		Session session = null;

		try {
			session = openSession();

			if (service.isNew()) {
				session.save(service);

				service.setNew(false);
			}
			else {
				session.merge(service);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ServiceModelImpl.ENTITY_CACHE_ENABLED,
			ServiceImpl.class, service.getPrimaryKey(), service);

		return service;
	}

	protected Service toUnwrappedModel(Service service) {
		if (service instanceof ServiceImpl) {
			return service;
		}

		ServiceImpl serviceImpl = new ServiceImpl();

		serviceImpl.setNew(service.isNew());
		serviceImpl.setPrimaryKey(service.getPrimaryKey());

		serviceImpl.setServiceId(service.getServiceId());
		serviceImpl.setLastUpdateTimestamp(service.getLastUpdateTimestamp());
		serviceImpl.setLastUpdateUserid(service.getLastUpdateUserid());
		serviceImpl.setLastUpdateUsername(service.getLastUpdateUsername());
		serviceImpl.setActive(service.getActive());
		serviceImpl.setEffectiveTimestamp(service.getEffectiveTimestamp());
		serviceImpl.setServiceName(service.getServiceName());
		serviceImpl.setDescriptiveNameEn(service.getDescriptiveNameEn());
		serviceImpl.setDescriptiveNameAr(service.getDescriptiveNameAr());

		return serviceImpl;
	}

	/**
	 * Returns the service with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service
	 * @return the service
	 * @throws com.stc.echannels.epayments.NoSuchServiceException if a service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Service findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceException, SystemException {
		Service service = fetchByPrimaryKey(primaryKey);

		if (service == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return service;
	}

	/**
	 * Returns the service with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchServiceException} if it could not be found.
	 *
	 * @param serviceId the primary key of the service
	 * @return the service
	 * @throws com.stc.echannels.epayments.NoSuchServiceException if a service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Service findByPrimaryKey(long serviceId)
		throws NoSuchServiceException, SystemException {
		return findByPrimaryKey((Serializable)serviceId);
	}

	/**
	 * Returns the service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service
	 * @return the service, or <code>null</code> if a service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Service fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Service service = (Service)EntityCacheUtil.getResult(ServiceModelImpl.ENTITY_CACHE_ENABLED,
				ServiceImpl.class, primaryKey);

		if (service == _nullService) {
			return null;
		}

		if (service == null) {
			Session session = null;

			try {
				session = openSession();

				service = (Service)session.get(ServiceImpl.class, primaryKey);

				if (service != null) {
					cacheResult(service);
				}
				else {
					EntityCacheUtil.putResult(ServiceModelImpl.ENTITY_CACHE_ENABLED,
						ServiceImpl.class, primaryKey, _nullService);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceModelImpl.ENTITY_CACHE_ENABLED,
					ServiceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return service;
	}

	/**
	 * Returns the service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param serviceId the primary key of the service
	 * @return the service, or <code>null</code> if a service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Service fetchByPrimaryKey(long serviceId) throws SystemException {
		return fetchByPrimaryKey((Serializable)serviceId);
	}

	/**
	 * Returns all the services.
	 *
	 * @return the services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Service> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Service> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of services
	 * @param end the upper bound of the range of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Service> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Service> list = (List<Service>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICE;

				if (pagination) {
					sql = sql.concat(ServiceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Service>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Service>(list);
				}
				else {
					list = (List<Service>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the services from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Service service : findAll()) {
			remove(service);
		}
	}

	/**
	 * Returns the number of services.
	 *
	 * @return the number of services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SERVICE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the service persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.stc.echannels.epayments.model.Service")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Service>> listenersList = new ArrayList<ModelListener<Service>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Service>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ServiceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICE = "SELECT service FROM Service service";
	private static final String _SQL_COUNT_SERVICE = "SELECT COUNT(service) FROM Service service";
	private static final String _ORDER_BY_ENTITY_ALIAS = "service.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Service exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ServicePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"serviceId", "lastUpdateTimestamp", "lastUpdateUserid",
				"lastUpdateUsername", "effectiveTimestamp", "serviceName",
				"descriptiveNameEn", "descriptiveNameAr"
			});
	private static Service _nullService = new ServiceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Service> toCacheModel() {
				return _nullServiceCacheModel;
			}
		};

	private static CacheModel<Service> _nullServiceCacheModel = new CacheModel<Service>() {
			@Override
			public Service toEntityModel() {
				return _nullService;
			}
		};
}