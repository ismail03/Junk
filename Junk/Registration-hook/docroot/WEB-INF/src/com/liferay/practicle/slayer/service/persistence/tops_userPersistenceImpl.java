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

import com.liferay.practicle.slayer.NoSuchtops_userException;
import com.liferay.practicle.slayer.model.impl.tops_userImpl;
import com.liferay.practicle.slayer.model.impl.tops_userModelImpl;
import com.liferay.practicle.slayer.model.tops_user;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tops_user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ismail
 * @see tops_userPersistence
 * @see tops_userUtil
 * @generated
 */
public class tops_userPersistenceImpl extends BasePersistenceImpl<tops_user>
	implements tops_userPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tops_userUtil} to access the tops_user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = tops_userImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(tops_userModelImpl.ENTITY_CACHE_ENABLED,
			tops_userModelImpl.FINDER_CACHE_ENABLED, tops_userImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(tops_userModelImpl.ENTITY_CACHE_ENABLED,
			tops_userModelImpl.FINDER_CACHE_ENABLED, tops_userImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(tops_userModelImpl.ENTITY_CACHE_ENABLED,
			tops_userModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public tops_userPersistenceImpl() {
		setModelClass(tops_user.class);
	}

	/**
	 * Caches the tops_user in the entity cache if it is enabled.
	 *
	 * @param tops_user the tops_user
	 */
	@Override
	public void cacheResult(tops_user tops_user) {
		EntityCacheUtil.putResult(tops_userModelImpl.ENTITY_CACHE_ENABLED,
			tops_userImpl.class, tops_user.getPrimaryKey(), tops_user);

		tops_user.resetOriginalValues();
	}

	/**
	 * Caches the tops_users in the entity cache if it is enabled.
	 *
	 * @param tops_users the tops_users
	 */
	@Override
	public void cacheResult(List<tops_user> tops_users) {
		for (tops_user tops_user : tops_users) {
			if (EntityCacheUtil.getResult(
						tops_userModelImpl.ENTITY_CACHE_ENABLED,
						tops_userImpl.class, tops_user.getPrimaryKey()) == null) {
				cacheResult(tops_user);
			}
			else {
				tops_user.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tops_users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(tops_userImpl.class.getName());
		}

		EntityCacheUtil.clearCache(tops_userImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tops_user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(tops_user tops_user) {
		EntityCacheUtil.removeResult(tops_userModelImpl.ENTITY_CACHE_ENABLED,
			tops_userImpl.class, tops_user.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<tops_user> tops_users) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (tops_user tops_user : tops_users) {
			EntityCacheUtil.removeResult(tops_userModelImpl.ENTITY_CACHE_ENABLED,
				tops_userImpl.class, tops_user.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tops_user with the primary key. Does not add the tops_user to the database.
	 *
	 * @param tops_userId the primary key for the new tops_user
	 * @return the new tops_user
	 */
	@Override
	public tops_user create(long tops_userId) {
		tops_user tops_user = new tops_userImpl();

		tops_user.setNew(true);
		tops_user.setPrimaryKey(tops_userId);

		return tops_user;
	}

	/**
	 * Removes the tops_user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tops_userId the primary key of the tops_user
	 * @return the tops_user that was removed
	 * @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tops_user remove(long tops_userId)
		throws NoSuchtops_userException, SystemException {
		return remove((Serializable)tops_userId);
	}

	/**
	 * Removes the tops_user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tops_user
	 * @return the tops_user that was removed
	 * @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tops_user remove(Serializable primaryKey)
		throws NoSuchtops_userException, SystemException {
		Session session = null;

		try {
			session = openSession();

			tops_user tops_user = (tops_user)session.get(tops_userImpl.class,
					primaryKey);

			if (tops_user == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtops_userException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tops_user);
		}
		catch (NoSuchtops_userException nsee) {
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
	protected tops_user removeImpl(tops_user tops_user)
		throws SystemException {
		tops_user = toUnwrappedModel(tops_user);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tops_user)) {
				tops_user = (tops_user)session.get(tops_userImpl.class,
						tops_user.getPrimaryKeyObj());
			}

			if (tops_user != null) {
				session.delete(tops_user);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tops_user != null) {
			clearCache(tops_user);
		}

		return tops_user;
	}

	@Override
	public tops_user updateImpl(
		com.liferay.practicle.slayer.model.tops_user tops_user)
		throws SystemException {
		tops_user = toUnwrappedModel(tops_user);

		boolean isNew = tops_user.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tops_user.isNew()) {
				session.save(tops_user);

				tops_user.setNew(false);
			}
			else {
				session.merge(tops_user);
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

		EntityCacheUtil.putResult(tops_userModelImpl.ENTITY_CACHE_ENABLED,
			tops_userImpl.class, tops_user.getPrimaryKey(), tops_user);

		return tops_user;
	}

	protected tops_user toUnwrappedModel(tops_user tops_user) {
		if (tops_user instanceof tops_userImpl) {
			return tops_user;
		}

		tops_userImpl tops_userImpl = new tops_userImpl();

		tops_userImpl.setNew(tops_user.isNew());
		tops_userImpl.setPrimaryKey(tops_user.getPrimaryKey());

		tops_userImpl.setTops_userId(tops_user.getTops_userId());
		tops_userImpl.setFirstname(tops_user.getFirstname());
		tops_userImpl.setLastName(tops_user.getLastName());
		tops_userImpl.setUserName(tops_user.getUserName());
		tops_userImpl.setPassword(tops_user.getPassword());
		tops_userImpl.setEmail(tops_user.getEmail());
		tops_userImpl.setPhone(tops_user.getPhone());

		return tops_userImpl;
	}

	/**
	 * Returns the tops_user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tops_user
	 * @return the tops_user
	 * @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tops_user findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtops_userException, SystemException {
		tops_user tops_user = fetchByPrimaryKey(primaryKey);

		if (tops_user == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtops_userException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tops_user;
	}

	/**
	 * Returns the tops_user with the primary key or throws a {@link com.liferay.practicle.slayer.NoSuchtops_userException} if it could not be found.
	 *
	 * @param tops_userId the primary key of the tops_user
	 * @return the tops_user
	 * @throws com.liferay.practicle.slayer.NoSuchtops_userException if a tops_user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tops_user findByPrimaryKey(long tops_userId)
		throws NoSuchtops_userException, SystemException {
		return findByPrimaryKey((Serializable)tops_userId);
	}

	/**
	 * Returns the tops_user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tops_user
	 * @return the tops_user, or <code>null</code> if a tops_user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tops_user fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		tops_user tops_user = (tops_user)EntityCacheUtil.getResult(tops_userModelImpl.ENTITY_CACHE_ENABLED,
				tops_userImpl.class, primaryKey);

		if (tops_user == _nulltops_user) {
			return null;
		}

		if (tops_user == null) {
			Session session = null;

			try {
				session = openSession();

				tops_user = (tops_user)session.get(tops_userImpl.class,
						primaryKey);

				if (tops_user != null) {
					cacheResult(tops_user);
				}
				else {
					EntityCacheUtil.putResult(tops_userModelImpl.ENTITY_CACHE_ENABLED,
						tops_userImpl.class, primaryKey, _nulltops_user);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(tops_userModelImpl.ENTITY_CACHE_ENABLED,
					tops_userImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tops_user;
	}

	/**
	 * Returns the tops_user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tops_userId the primary key of the tops_user
	 * @return the tops_user, or <code>null</code> if a tops_user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tops_user fetchByPrimaryKey(long tops_userId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)tops_userId);
	}

	/**
	 * Returns all the tops_users.
	 *
	 * @return the tops_users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<tops_user> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<tops_user> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<tops_user> findAll(int start, int end,
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

		List<tops_user> list = (List<tops_user>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TOPS_USER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOPS_USER;

				if (pagination) {
					sql = sql.concat(tops_userModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<tops_user>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<tops_user>(list);
				}
				else {
					list = (List<tops_user>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tops_users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (tops_user tops_user : findAll()) {
			remove(tops_user);
		}
	}

	/**
	 * Returns the number of tops_users.
	 *
	 * @return the number of tops_users
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

				Query q = session.createQuery(_SQL_COUNT_TOPS_USER);

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
	 * Initializes the tops_user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.practicle.slayer.model.tops_user")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<tops_user>> listenersList = new ArrayList<ModelListener<tops_user>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<tops_user>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(tops_userImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TOPS_USER = "SELECT tops_user FROM tops_user tops_user";
	private static final String _SQL_COUNT_TOPS_USER = "SELECT COUNT(tops_user) FROM tops_user tops_user";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tops_user.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No tops_user exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(tops_userPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"password"
			});
	private static tops_user _nulltops_user = new tops_userImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<tops_user> toCacheModel() {
				return _nulltops_userCacheModel;
			}
		};

	private static CacheModel<tops_user> _nulltops_userCacheModel = new CacheModel<tops_user>() {
			@Override
			public tops_user toEntityModel() {
				return _nulltops_user;
			}
		};
}