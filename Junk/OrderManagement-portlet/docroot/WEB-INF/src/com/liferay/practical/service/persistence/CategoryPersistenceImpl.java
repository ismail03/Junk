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

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import com.liferay.practical.NoSuchCategoryException;
import com.liferay.practical.model.Category;
import com.liferay.practical.model.impl.CategoryImpl;
import com.liferay.practical.model.impl.CategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author saifulla
 * @see CategoryPersistence
 * @see CategoryUtil
 * @generated
 */
public class CategoryPersistenceImpl extends BasePersistenceImpl<Category>
	implements CategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CategoryUtil} to access the category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CategoryModelImpl.ENTITY_CACHE_ENABLED,
			CategoryModelImpl.FINDER_CACHE_ENABLED, CategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CategoryModelImpl.ENTITY_CACHE_ENABLED,
			CategoryModelImpl.FINDER_CACHE_ENABLED, CategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CategoryModelImpl.ENTITY_CACHE_ENABLED,
			CategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CategoryPersistenceImpl() {
		setModelClass(Category.class);
	}

	/**
	 * Caches the category in the entity cache if it is enabled.
	 *
	 * @param category the category
	 */
	@Override
	public void cacheResult(Category category) {
		EntityCacheUtil.putResult(CategoryModelImpl.ENTITY_CACHE_ENABLED,
			CategoryImpl.class, category.getPrimaryKey(), category);

		category.resetOriginalValues();
	}

	/**
	 * Caches the categories in the entity cache if it is enabled.
	 *
	 * @param categories the categories
	 */
	@Override
	public void cacheResult(List<Category> categories) {
		for (Category category : categories) {
			if (EntityCacheUtil.getResult(
						CategoryModelImpl.ENTITY_CACHE_ENABLED,
						CategoryImpl.class, category.getPrimaryKey()) == null) {
				cacheResult(category);
			}
			else {
				category.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Category category) {
		EntityCacheUtil.removeResult(CategoryModelImpl.ENTITY_CACHE_ENABLED,
			CategoryImpl.class, category.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Category> categories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Category category : categories) {
			EntityCacheUtil.removeResult(CategoryModelImpl.ENTITY_CACHE_ENABLED,
				CategoryImpl.class, category.getPrimaryKey());
		}
	}

	/**
	 * Creates a new category with the primary key. Does not add the category to the database.
	 *
	 * @param categoryid the primary key for the new category
	 * @return the new category
	 */
	@Override
	public Category create(long categoryid) {
		Category category = new CategoryImpl();

		category.setNew(true);
		category.setPrimaryKey(categoryid);

		return category;
	}

	/**
	 * Removes the category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryid the primary key of the category
	 * @return the category that was removed
	 * @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Category remove(long categoryid)
		throws NoSuchCategoryException, SystemException {
		return remove((Serializable)categoryid);
	}

	/**
	 * Removes the category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the category
	 * @return the category that was removed
	 * @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Category remove(Serializable primaryKey)
		throws NoSuchCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Category category = (Category)session.get(CategoryImpl.class,
					primaryKey);

			if (category == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(category);
		}
		catch (NoSuchCategoryException nsee) {
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
	protected Category removeImpl(Category category) throws SystemException {
		category = toUnwrappedModel(category);

		categoryToOrdersTableMapper.deleteLeftPrimaryKeyTableMappings(category.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(category)) {
				category = (Category)session.get(CategoryImpl.class,
						category.getPrimaryKeyObj());
			}

			if (category != null) {
				session.delete(category);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (category != null) {
			clearCache(category);
		}

		return category;
	}

	@Override
	public Category updateImpl(com.liferay.practical.model.Category category)
		throws SystemException {
		category = toUnwrappedModel(category);

		boolean isNew = category.isNew();

		Session session = null;

		try {
			session = openSession();

			if (category.isNew()) {
				session.save(category);

				category.setNew(false);
			}
			else {
				session.merge(category);
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

		EntityCacheUtil.putResult(CategoryModelImpl.ENTITY_CACHE_ENABLED,
			CategoryImpl.class, category.getPrimaryKey(), category);

		return category;
	}

	protected Category toUnwrappedModel(Category category) {
		if (category instanceof CategoryImpl) {
			return category;
		}

		CategoryImpl categoryImpl = new CategoryImpl();

		categoryImpl.setNew(category.isNew());
		categoryImpl.setPrimaryKey(category.getPrimaryKey());

		categoryImpl.setCategoryid(category.getCategoryid());
		categoryImpl.setCategoryname(category.getCategoryname());

		return categoryImpl;
	}

	/**
	 * Returns the category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the category
	 * @return the category
	 * @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Category findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCategoryException, SystemException {
		Category category = fetchByPrimaryKey(primaryKey);

		if (category == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return category;
	}

	/**
	 * Returns the category with the primary key or throws a {@link com.liferay.practical.NoSuchCategoryException} if it could not be found.
	 *
	 * @param categoryid the primary key of the category
	 * @return the category
	 * @throws com.liferay.practical.NoSuchCategoryException if a category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Category findByPrimaryKey(long categoryid)
		throws NoSuchCategoryException, SystemException {
		return findByPrimaryKey((Serializable)categoryid);
	}

	/**
	 * Returns the category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the category
	 * @return the category, or <code>null</code> if a category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Category fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Category category = (Category)EntityCacheUtil.getResult(CategoryModelImpl.ENTITY_CACHE_ENABLED,
				CategoryImpl.class, primaryKey);

		if (category == _nullCategory) {
			return null;
		}

		if (category == null) {
			Session session = null;

			try {
				session = openSession();

				category = (Category)session.get(CategoryImpl.class, primaryKey);

				if (category != null) {
					cacheResult(category);
				}
				else {
					EntityCacheUtil.putResult(CategoryModelImpl.ENTITY_CACHE_ENABLED,
						CategoryImpl.class, primaryKey, _nullCategory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CategoryModelImpl.ENTITY_CACHE_ENABLED,
					CategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return category;
	}

	/**
	 * Returns the category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoryid the primary key of the category
	 * @return the category, or <code>null</code> if a category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Category fetchByPrimaryKey(long categoryid)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)categoryid);
	}

	/**
	 * Returns all the categories.
	 *
	 * @return the categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Category> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Category> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Category> findAll(int start, int end,
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

		List<Category> list = (List<Category>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CATEGORY;

				if (pagination) {
					sql = sql.concat(CategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Category>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Category>(list);
				}
				else {
					list = (List<Category>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Category category : findAll()) {
			remove(category);
		}
	}

	/**
	 * Returns the number of categories.
	 *
	 * @return the number of categories
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

				Query q = session.createQuery(_SQL_COUNT_CATEGORY);

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

	/**
	 * Returns all the orderses associated with the category.
	 *
	 * @param pk the primary key of the category
	 * @return the orderses associated with the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.liferay.practical.model.Orders> getOrderses(long pk)
		throws SystemException {
		return getOrderses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
	@Override
	public List<com.liferay.practical.model.Orders> getOrderses(long pk,
		int start, int end) throws SystemException {
		return getOrderses(pk, start, end, null);
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
	@Override
	public List<com.liferay.practical.model.Orders> getOrderses(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return categoryToOrdersTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of orderses associated with the category.
	 *
	 * @param pk the primary key of the category
	 * @return the number of orderses associated with the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getOrdersesSize(long pk) throws SystemException {
		long[] pks = categoryToOrdersTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the orders is associated with the category.
	 *
	 * @param pk the primary key of the category
	 * @param ordersPK the primary key of the orders
	 * @return <code>true</code> if the orders is associated with the category; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsOrders(long pk, long ordersPK)
		throws SystemException {
		return categoryToOrdersTableMapper.containsTableMapping(pk, ordersPK);
	}

	/**
	 * Returns <code>true</code> if the category has any orderses associated with it.
	 *
	 * @param pk the primary key of the category to check for associations with orderses
	 * @return <code>true</code> if the category has any orderses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsOrderses(long pk) throws SystemException {
		if (getOrdersesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param ordersPK the primary key of the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrders(long pk, long ordersPK) throws SystemException {
		categoryToOrdersTableMapper.addTableMapping(pk, ordersPK);
	}

	/**
	 * Adds an association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param orders the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrders(long pk, com.liferay.practical.model.Orders orders)
		throws SystemException {
		categoryToOrdersTableMapper.addTableMapping(pk, orders.getPrimaryKey());
	}

	/**
	 * Adds an association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param ordersPKs the primary keys of the orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrderses(long pk, long[] ordersPKs)
		throws SystemException {
		for (long ordersPK : ordersPKs) {
			categoryToOrdersTableMapper.addTableMapping(pk, ordersPK);
		}
	}

	/**
	 * Adds an association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param orderses the orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrderses(long pk,
		List<com.liferay.practical.model.Orders> orderses)
		throws SystemException {
		for (com.liferay.practical.model.Orders orders : orderses) {
			categoryToOrdersTableMapper.addTableMapping(pk,
				orders.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the category and its orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category to clear the associated orderses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearOrderses(long pk) throws SystemException {
		categoryToOrdersTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param ordersPK the primary key of the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrders(long pk, long ordersPK) throws SystemException {
		categoryToOrdersTableMapper.deleteTableMapping(pk, ordersPK);
	}

	/**
	 * Removes the association between the category and the orders. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param orders the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrders(long pk, com.liferay.practical.model.Orders orders)
		throws SystemException {
		categoryToOrdersTableMapper.deleteTableMapping(pk,
			orders.getPrimaryKey());
	}

	/**
	 * Removes the association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param ordersPKs the primary keys of the orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrderses(long pk, long[] ordersPKs)
		throws SystemException {
		for (long ordersPK : ordersPKs) {
			categoryToOrdersTableMapper.deleteTableMapping(pk, ordersPK);
		}
	}

	/**
	 * Removes the association between the category and the orderses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param orderses the orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrderses(long pk,
		List<com.liferay.practical.model.Orders> orderses)
		throws SystemException {
		for (com.liferay.practical.model.Orders orders : orderses) {
			categoryToOrdersTableMapper.deleteTableMapping(pk,
				orders.getPrimaryKey());
		}
	}

	/**
	 * Sets the orderses associated with the category, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param ordersPKs the primary keys of the orderses to be associated with the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setOrderses(long pk, long[] ordersPKs)
		throws SystemException {
		Set<Long> newOrdersPKsSet = SetUtil.fromArray(ordersPKs);
		Set<Long> oldOrdersPKsSet = SetUtil.fromArray(categoryToOrdersTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeOrdersPKsSet = new HashSet<Long>(oldOrdersPKsSet);

		removeOrdersPKsSet.removeAll(newOrdersPKsSet);

		for (long removeOrdersPK : removeOrdersPKsSet) {
			categoryToOrdersTableMapper.deleteTableMapping(pk, removeOrdersPK);
		}

		newOrdersPKsSet.removeAll(oldOrdersPKsSet);

		for (long newOrdersPK : newOrdersPKsSet) {
			categoryToOrdersTableMapper.addTableMapping(pk, newOrdersPK);
		}
	}

	/**
	 * Sets the orderses associated with the category, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the category
	 * @param orderses the orderses to be associated with the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setOrderses(long pk,
		List<com.liferay.practical.model.Orders> orderses)
		throws SystemException {
		try {
			long[] ordersPKs = new long[orderses.size()];

			for (int i = 0; i < orderses.size(); i++) {
				com.liferay.practical.model.Orders orders = orderses.get(i);

				ordersPKs[i] = orders.getPrimaryKey();
			}

			setOrderses(pk, ordersPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(CategoryModelImpl.MAPPING_TABLE_ORDERS_CATEGORY_NAME);
		}
	}

	/**
	 * Initializes the category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.practical.model.Category")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Category>> listenersList = new ArrayList<ModelListener<Category>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Category>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		categoryToOrdersTableMapper = TableMapperFactory.getTableMapper("Orders_Category",
				"categoryid", "orderid", this, ordersPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = OrdersPersistence.class)
	protected OrdersPersistence ordersPersistence;
	protected TableMapper<Category, com.liferay.practical.model.Orders> categoryToOrdersTableMapper;
	private static final String _SQL_SELECT_CATEGORY = "SELECT category FROM Category category";
	private static final String _SQL_COUNT_CATEGORY = "SELECT COUNT(category) FROM Category category";
	private static final String _ORDER_BY_ENTITY_ALIAS = "category.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Category exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CategoryPersistenceImpl.class);
	private static Category _nullCategory = new CategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Category> toCacheModel() {
				return _nullCategoryCacheModel;
			}
		};

	private static CacheModel<Category> _nullCategoryCacheModel = new CacheModel<Category>() {
			@Override
			public Category toEntityModel() {
				return _nullCategory;
			}
		};
}