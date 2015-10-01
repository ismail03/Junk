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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import com.liferay.practical.NoSuchOrdersException;
import com.liferay.practical.model.Orders;
import com.liferay.practical.model.impl.OrdersImpl;
import com.liferay.practical.model.impl.OrdersModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the orders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author saifulla
 * @see OrdersPersistence
 * @see OrdersUtil
 * @generated
 */
public class OrdersPersistenceImpl extends BasePersistenceImpl<Orders>
	implements OrdersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OrdersUtil} to access the orders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OrdersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			OrdersModelImpl.GROUPID_COLUMN_BITMASK |
			OrdersModelImpl.ORDERDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the orderses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orderses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @return the range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orderses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<Orders> list = (List<Orders>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Orders orders : list) {
				if ((groupId != orders.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ORDERS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrdersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Orders>(list);
				}
				else {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first orders in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByGroupId_First(groupId, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the first orders in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Orders> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last orders in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByGroupId_Last(groupId, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the last orders in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Orders> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the orderses before and after the current orders in the ordered set where groupId = &#63;.
	 *
	 * @param orderid the primary key of the current orders
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders[] findByGroupId_PrevAndNext(long orderid, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = findByPrimaryKey(orderid);

		Session session = null;

		try {
			session = openSession();

			Orders[] array = new OrdersImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, orders, groupId,
					orderByComparator, true);

			array[1] = orders;

			array[2] = getByGroupId_PrevAndNext(session, orders, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Orders getByGroupId_PrevAndNext(Session session, Orders orders,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERS_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OrdersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orders);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Orders> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the orderses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (Orders orders : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(orders);
		}
	}

	/**
	 * Returns the number of orderses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDERS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "orders.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			OrdersModelImpl.COMPANYID_COLUMN_BITMASK |
			OrdersModelImpl.ORDERDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the orderses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the orderses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @return the range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orderses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<Orders> list = (List<Orders>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Orders orders : list) {
				if ((companyId != orders.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ORDERS_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrdersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Orders>(list);
				}
				else {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first orders in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByCompanyId_First(companyId, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the first orders in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Orders> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last orders in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByCompanyId_Last(companyId, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the last orders in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Orders> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the orderses before and after the current orders in the ordered set where companyId = &#63;.
	 *
	 * @param orderid the primary key of the current orders
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders[] findByCompanyId_PrevAndNext(long orderid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = findByPrimaryKey(orderid);

		Session session = null;

		try {
			session = openSession();

			Orders[] array = new OrdersImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, orders, companyId,
					orderByComparator, true);

			array[1] = orders;

			array[2] = getByCompanyId_PrevAndNext(session, orders, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Orders getByCompanyId_PrevAndNext(Session session, Orders orders,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERS_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OrdersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orders);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Orders> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the orderses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (Orders orders : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(orders);
		}
	}

	/**
	 * Returns the number of orderses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDERS_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "orders.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTNAME =
		new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByproductname",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME =
		new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByproductname",
			new String[] { String.class.getName() },
			OrdersModelImpl.PRODUCTNAME_COLUMN_BITMASK |
			OrdersModelImpl.ORDERDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTNAME = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByproductname",
			new String[] { String.class.getName() });

	/**
	 * Returns all the orderses where productname = &#63;.
	 *
	 * @param productname the productname
	 * @return the matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByproductname(String productname)
		throws SystemException {
		return findByproductname(productname, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orderses where productname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productname the productname
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @return the range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByproductname(String productname, int start, int end)
		throws SystemException {
		return findByproductname(productname, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orderses where productname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productname the productname
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByproductname(String productname, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME;
			finderArgs = new Object[] { productname };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTNAME;
			finderArgs = new Object[] { productname, start, end, orderByComparator };
		}

		List<Orders> list = (List<Orders>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Orders orders : list) {
				if (!Validator.equals(productname, orders.getProductname())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ORDERS_WHERE);

			boolean bindProductname = false;

			if (productname == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1);
			}
			else if (productname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3);
			}
			else {
				bindProductname = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrdersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductname) {
					qPos.add(productname);
				}

				if (!pagination) {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Orders>(list);
				}
				else {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first orders in the ordered set where productname = &#63;.
	 *
	 * @param productname the productname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByproductname_First(String productname,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByproductname_First(productname, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productname=");
		msg.append(productname);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the first orders in the ordered set where productname = &#63;.
	 *
	 * @param productname the productname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByproductname_First(String productname,
		OrderByComparator orderByComparator) throws SystemException {
		List<Orders> list = findByproductname(productname, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last orders in the ordered set where productname = &#63;.
	 *
	 * @param productname the productname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByproductname_Last(String productname,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByproductname_Last(productname, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productname=");
		msg.append(productname);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the last orders in the ordered set where productname = &#63;.
	 *
	 * @param productname the productname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByproductname_Last(String productname,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByproductname(productname);

		if (count == 0) {
			return null;
		}

		List<Orders> list = findByproductname(productname, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the orderses before and after the current orders in the ordered set where productname = &#63;.
	 *
	 * @param orderid the primary key of the current orders
	 * @param productname the productname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders[] findByproductname_PrevAndNext(long orderid,
		String productname, OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = findByPrimaryKey(orderid);

		Session session = null;

		try {
			session = openSession();

			Orders[] array = new OrdersImpl[3];

			array[0] = getByproductname_PrevAndNext(session, orders,
					productname, orderByComparator, true);

			array[1] = orders;

			array[2] = getByproductname_PrevAndNext(session, orders,
					productname, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Orders getByproductname_PrevAndNext(Session session,
		Orders orders, String productname, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERS_WHERE);

		boolean bindProductname = false;

		if (productname == null) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1);
		}
		else if (productname.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3);
		}
		else {
			bindProductname = true;

			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OrdersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductname) {
			qPos.add(productname);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orders);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Orders> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the orderses where productname = &#63; from the database.
	 *
	 * @param productname the productname
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByproductname(String productname)
		throws SystemException {
		for (Orders orders : findByproductname(productname, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(orders);
		}
	}

	/**
	 * Returns the number of orderses where productname = &#63;.
	 *
	 * @param productname the productname
	 * @return the number of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByproductname(String productname) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTNAME;

		Object[] finderArgs = new Object[] { productname };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDERS_WHERE);

			boolean bindProductname = false;

			if (productname == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1);
			}
			else if (productname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3);
			}
			else {
				bindProductname = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductname) {
					qPos.add(productname);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1 = "orders.productname IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2 = "orders.productname = ?";
	private static final String _FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3 = "(orders.productname IS NULL OR orders.productname = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_O = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_O",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, OrdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_O",
			new String[] { Long.class.getName(), Integer.class.getName() },
			OrdersModelImpl.GROUPID_COLUMN_BITMASK |
			OrdersModelImpl.ORDERSTATUS_COLUMN_BITMASK |
			OrdersModelImpl.ORDERDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_O = new FinderPath(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_O",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the orderses where groupId = &#63; and orderstatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @return the matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByG_O(long groupId, int orderstatus)
		throws SystemException {
		return findByG_O(groupId, orderstatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orderses where groupId = &#63; and orderstatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @return the range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByG_O(long groupId, int orderstatus, int start,
		int end) throws SystemException {
		return findByG_O(groupId, orderstatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orderses where groupId = &#63; and orderstatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findByG_O(long groupId, int orderstatus, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O;
			finderArgs = new Object[] { groupId, orderstatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_O;
			finderArgs = new Object[] {
					groupId, orderstatus,
					
					start, end, orderByComparator
				};
		}

		List<Orders> list = (List<Orders>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Orders orders : list) {
				if ((groupId != orders.getGroupId()) ||
						(orderstatus != orders.getOrderstatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_ORDERS_WHERE);

			query.append(_FINDER_COLUMN_G_O_GROUPID_2);

			query.append(_FINDER_COLUMN_G_O_ORDERSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrdersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(orderstatus);

				if (!pagination) {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Orders>(list);
				}
				else {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByG_O_First(long groupId, int orderstatus,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByG_O_First(groupId, orderstatus, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", orderstatus=");
		msg.append(orderstatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the first orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByG_O_First(long groupId, int orderstatus,
		OrderByComparator orderByComparator) throws SystemException {
		List<Orders> list = findByG_O(groupId, orderstatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByG_O_Last(long groupId, int orderstatus,
		OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByG_O_Last(groupId, orderstatus, orderByComparator);

		if (orders != null) {
			return orders;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", orderstatus=");
		msg.append(orderstatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrdersException(msg.toString());
	}

	/**
	 * Returns the last orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orders, or <code>null</code> if a matching orders could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByG_O_Last(long groupId, int orderstatus,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_O(groupId, orderstatus);

		if (count == 0) {
			return null;
		}

		List<Orders> list = findByG_O(groupId, orderstatus, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the orderses before and after the current orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	 *
	 * @param orderid the primary key of the current orders
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders[] findByG_O_PrevAndNext(long orderid, long groupId,
		int orderstatus, OrderByComparator orderByComparator)
		throws NoSuchOrdersException, SystemException {
		Orders orders = findByPrimaryKey(orderid);

		Session session = null;

		try {
			session = openSession();

			Orders[] array = new OrdersImpl[3];

			array[0] = getByG_O_PrevAndNext(session, orders, groupId,
					orderstatus, orderByComparator, true);

			array[1] = orders;

			array[2] = getByG_O_PrevAndNext(session, orders, groupId,
					orderstatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Orders getByG_O_PrevAndNext(Session session, Orders orders,
		long groupId, int orderstatus, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERS_WHERE);

		query.append(_FINDER_COLUMN_G_O_GROUPID_2);

		query.append(_FINDER_COLUMN_G_O_ORDERSTATUS_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OrdersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(orderstatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orders);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Orders> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the orderses where groupId = &#63; and orderstatus = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_O(long groupId, int orderstatus)
		throws SystemException {
		for (Orders orders : findByG_O(groupId, orderstatus, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(orders);
		}
	}

	/**
	 * Returns the number of orderses where groupId = &#63; and orderstatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderstatus the orderstatus
	 * @return the number of matching orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_O(long groupId, int orderstatus)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_O;

		Object[] finderArgs = new Object[] { groupId, orderstatus };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ORDERS_WHERE);

			query.append(_FINDER_COLUMN_G_O_GROUPID_2);

			query.append(_FINDER_COLUMN_G_O_ORDERSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(orderstatus);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_O_GROUPID_2 = "orders.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_O_ORDERSTATUS_2 = "orders.orderstatus = ?";

	public OrdersPersistenceImpl() {
		setModelClass(Orders.class);
	}

	/**
	 * Caches the orders in the entity cache if it is enabled.
	 *
	 * @param orders the orders
	 */
	@Override
	public void cacheResult(Orders orders) {
		EntityCacheUtil.putResult(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersImpl.class, orders.getPrimaryKey(), orders);

		orders.resetOriginalValues();
	}

	/**
	 * Caches the orderses in the entity cache if it is enabled.
	 *
	 * @param orderses the orderses
	 */
	@Override
	public void cacheResult(List<Orders> orderses) {
		for (Orders orders : orderses) {
			if (EntityCacheUtil.getResult(
						OrdersModelImpl.ENTITY_CACHE_ENABLED, OrdersImpl.class,
						orders.getPrimaryKey()) == null) {
				cacheResult(orders);
			}
			else {
				orders.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all orderses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OrdersImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OrdersImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the orders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Orders orders) {
		EntityCacheUtil.removeResult(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersImpl.class, orders.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Orders> orderses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Orders orders : orderses) {
			EntityCacheUtil.removeResult(OrdersModelImpl.ENTITY_CACHE_ENABLED,
				OrdersImpl.class, orders.getPrimaryKey());
		}
	}

	/**
	 * Creates a new orders with the primary key. Does not add the orders to the database.
	 *
	 * @param orderid the primary key for the new orders
	 * @return the new orders
	 */
	@Override
	public Orders create(long orderid) {
		Orders orders = new OrdersImpl();

		orders.setNew(true);
		orders.setPrimaryKey(orderid);

		return orders;
	}

	/**
	 * Removes the orders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orderid the primary key of the orders
	 * @return the orders that was removed
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders remove(long orderid)
		throws NoSuchOrdersException, SystemException {
		return remove((Serializable)orderid);
	}

	/**
	 * Removes the orders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the orders
	 * @return the orders that was removed
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders remove(Serializable primaryKey)
		throws NoSuchOrdersException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Orders orders = (Orders)session.get(OrdersImpl.class, primaryKey);

			if (orders == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOrdersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(orders);
		}
		catch (NoSuchOrdersException nsee) {
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
	protected Orders removeImpl(Orders orders) throws SystemException {
		orders = toUnwrappedModel(orders);

		ordersToCategoryTableMapper.deleteLeftPrimaryKeyTableMappings(orders.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(orders)) {
				orders = (Orders)session.get(OrdersImpl.class,
						orders.getPrimaryKeyObj());
			}

			if (orders != null) {
				session.delete(orders);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (orders != null) {
			clearCache(orders);
		}

		return orders;
	}

	@Override
	public Orders updateImpl(com.liferay.practical.model.Orders orders)
		throws SystemException {
		orders = toUnwrappedModel(orders);

		boolean isNew = orders.isNew();

		OrdersModelImpl ordersModelImpl = (OrdersModelImpl)orders;

		Session session = null;

		try {
			session = openSession();

			if (orders.isNew()) {
				session.save(orders);

				orders.setNew(false);
			}
			else {
				session.merge(orders);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OrdersModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ordersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ordersModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { ordersModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((ordersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ordersModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { ordersModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((ordersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ordersModelImpl.getOriginalProductname()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME,
					args);

				args = new Object[] { ordersModelImpl.getProductname() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME,
					args);
			}

			if ((ordersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ordersModelImpl.getOriginalGroupId(),
						ordersModelImpl.getOriginalOrderstatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O,
					args);

				args = new Object[] {
						ordersModelImpl.getGroupId(),
						ordersModelImpl.getOrderstatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O,
					args);
			}
		}

		EntityCacheUtil.putResult(OrdersModelImpl.ENTITY_CACHE_ENABLED,
			OrdersImpl.class, orders.getPrimaryKey(), orders);

		return orders;
	}

	protected Orders toUnwrappedModel(Orders orders) {
		if (orders instanceof OrdersImpl) {
			return orders;
		}

		OrdersImpl ordersImpl = new OrdersImpl();

		ordersImpl.setNew(orders.isNew());
		ordersImpl.setPrimaryKey(orders.getPrimaryKey());

		ordersImpl.setOrderid(orders.getOrderid());
		ordersImpl.setOrderdate(orders.getOrderdate());
		ordersImpl.setProductname(orders.getProductname());
		ordersImpl.setProductpackage(orders.getProductpackage());
		ordersImpl.setOrderstatus(orders.getOrderstatus());
		ordersImpl.setSubscription(orders.isSubscription());
		ordersImpl.setDocumnetid(orders.getDocumnetid());
		ordersImpl.setStatusByUserId(orders.getStatusByUserId());
		ordersImpl.setStatusDate(orders.getStatusDate());
		ordersImpl.setCompanyId(orders.getCompanyId());
		ordersImpl.setGroupId(orders.getGroupId());
		ordersImpl.setUserId(orders.getUserId());

		return ordersImpl;
	}

	/**
	 * Returns the orders with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the orders
	 * @return the orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOrdersException, SystemException {
		Orders orders = fetchByPrimaryKey(primaryKey);

		if (orders == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOrdersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return orders;
	}

	/**
	 * Returns the orders with the primary key or throws a {@link com.liferay.practical.NoSuchOrdersException} if it could not be found.
	 *
	 * @param orderid the primary key of the orders
	 * @return the orders
	 * @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders findByPrimaryKey(long orderid)
		throws NoSuchOrdersException, SystemException {
		return findByPrimaryKey((Serializable)orderid);
	}

	/**
	 * Returns the orders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the orders
	 * @return the orders, or <code>null</code> if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Orders orders = (Orders)EntityCacheUtil.getResult(OrdersModelImpl.ENTITY_CACHE_ENABLED,
				OrdersImpl.class, primaryKey);

		if (orders == _nullOrders) {
			return null;
		}

		if (orders == null) {
			Session session = null;

			try {
				session = openSession();

				orders = (Orders)session.get(OrdersImpl.class, primaryKey);

				if (orders != null) {
					cacheResult(orders);
				}
				else {
					EntityCacheUtil.putResult(OrdersModelImpl.ENTITY_CACHE_ENABLED,
						OrdersImpl.class, primaryKey, _nullOrders);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OrdersModelImpl.ENTITY_CACHE_ENABLED,
					OrdersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return orders;
	}

	/**
	 * Returns the orders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orderid the primary key of the orders
	 * @return the orders, or <code>null</code> if a orders with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Orders fetchByPrimaryKey(long orderid) throws SystemException {
		return fetchByPrimaryKey((Serializable)orderid);
	}

	/**
	 * Returns all the orderses.
	 *
	 * @return the orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @return the range of orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the orderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of orderses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Orders> findAll(int start, int end,
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

		List<Orders> list = (List<Orders>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ORDERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORDERS;

				if (pagination) {
					sql = sql.concat(OrdersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Orders>(list);
				}
				else {
					list = (List<Orders>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the orderses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Orders orders : findAll()) {
			remove(orders);
		}
	}

	/**
	 * Returns the number of orderses.
	 *
	 * @return the number of orderses
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

				Query q = session.createQuery(_SQL_COUNT_ORDERS);

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
	 * Returns all the categories associated with the orders.
	 *
	 * @param pk the primary key of the orders
	 * @return the categories associated with the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.liferay.practical.model.Category> getCategories(long pk)
		throws SystemException {
		return getCategories(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the categories associated with the orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the orders
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @return the range of categories associated with the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.liferay.practical.model.Category> getCategories(long pk,
		int start, int end) throws SystemException {
		return getCategories(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the categories associated with the orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the orders
	 * @param start the lower bound of the range of orderses
	 * @param end the upper bound of the range of orderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of categories associated with the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.liferay.practical.model.Category> getCategories(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return ordersToCategoryTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of categories associated with the orders.
	 *
	 * @param pk the primary key of the orders
	 * @return the number of categories associated with the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCategoriesSize(long pk) throws SystemException {
		long[] pks = ordersToCategoryTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the category is associated with the orders.
	 *
	 * @param pk the primary key of the orders
	 * @param categoryPK the primary key of the category
	 * @return <code>true</code> if the category is associated with the orders; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCategory(long pk, long categoryPK)
		throws SystemException {
		return ordersToCategoryTableMapper.containsTableMapping(pk, categoryPK);
	}

	/**
	 * Returns <code>true</code> if the orders has any categories associated with it.
	 *
	 * @param pk the primary key of the orders to check for associations with categories
	 * @return <code>true</code> if the orders has any categories associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCategories(long pk) throws SystemException {
		if (getCategoriesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categoryPK the primary key of the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCategory(long pk, long categoryPK) throws SystemException {
		ordersToCategoryTableMapper.addTableMapping(pk, categoryPK);
	}

	/**
	 * Adds an association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param category the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCategory(long pk,
		com.liferay.practical.model.Category category)
		throws SystemException {
		ordersToCategoryTableMapper.addTableMapping(pk, category.getPrimaryKey());
	}

	/**
	 * Adds an association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categoryPKs the primary keys of the categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCategories(long pk, long[] categoryPKs)
		throws SystemException {
		for (long categoryPK : categoryPKs) {
			ordersToCategoryTableMapper.addTableMapping(pk, categoryPK);
		}
	}

	/**
	 * Adds an association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categories the categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCategories(long pk,
		List<com.liferay.practical.model.Category> categories)
		throws SystemException {
		for (com.liferay.practical.model.Category category : categories) {
			ordersToCategoryTableMapper.addTableMapping(pk,
				category.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the orders and its categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders to clear the associated categories from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearCategories(long pk) throws SystemException {
		ordersToCategoryTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categoryPK the primary key of the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCategory(long pk, long categoryPK)
		throws SystemException {
		ordersToCategoryTableMapper.deleteTableMapping(pk, categoryPK);
	}

	/**
	 * Removes the association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param category the category
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCategory(long pk,
		com.liferay.practical.model.Category category)
		throws SystemException {
		ordersToCategoryTableMapper.deleteTableMapping(pk,
			category.getPrimaryKey());
	}

	/**
	 * Removes the association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categoryPKs the primary keys of the categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCategories(long pk, long[] categoryPKs)
		throws SystemException {
		for (long categoryPK : categoryPKs) {
			ordersToCategoryTableMapper.deleteTableMapping(pk, categoryPK);
		}
	}

	/**
	 * Removes the association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categories the categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCategories(long pk,
		List<com.liferay.practical.model.Category> categories)
		throws SystemException {
		for (com.liferay.practical.model.Category category : categories) {
			ordersToCategoryTableMapper.deleteTableMapping(pk,
				category.getPrimaryKey());
		}
	}

	/**
	 * Sets the categories associated with the orders, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categoryPKs the primary keys of the categories to be associated with the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCategories(long pk, long[] categoryPKs)
		throws SystemException {
		Set<Long> newCategoryPKsSet = SetUtil.fromArray(categoryPKs);
		Set<Long> oldCategoryPKsSet = SetUtil.fromArray(ordersToCategoryTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCategoryPKsSet = new HashSet<Long>(oldCategoryPKsSet);

		removeCategoryPKsSet.removeAll(newCategoryPKsSet);

		for (long removeCategoryPK : removeCategoryPKsSet) {
			ordersToCategoryTableMapper.deleteTableMapping(pk, removeCategoryPK);
		}

		newCategoryPKsSet.removeAll(oldCategoryPKsSet);

		for (long newCategoryPK : newCategoryPKsSet) {
			ordersToCategoryTableMapper.addTableMapping(pk, newCategoryPK);
		}
	}

	/**
	 * Sets the categories associated with the orders, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the orders
	 * @param categories the categories to be associated with the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCategories(long pk,
		List<com.liferay.practical.model.Category> categories)
		throws SystemException {
		try {
			long[] categoryPKs = new long[categories.size()];

			for (int i = 0; i < categories.size(); i++) {
				com.liferay.practical.model.Category category = categories.get(i);

				categoryPKs[i] = category.getPrimaryKey();
			}

			setCategories(pk, categoryPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(OrdersModelImpl.MAPPING_TABLE_ORDERS_CATEGORY_NAME);
		}
	}

	/**
	 * Initializes the orders persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.practical.model.Orders")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Orders>> listenersList = new ArrayList<ModelListener<Orders>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Orders>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		ordersToCategoryTableMapper = TableMapperFactory.getTableMapper("Orders_Category",
				"orderid", "categoryid", this, categoryPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(OrdersImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CategoryPersistence.class)
	protected CategoryPersistence categoryPersistence;
	protected TableMapper<Orders, com.liferay.practical.model.Category> ordersToCategoryTableMapper;
	private static final String _SQL_SELECT_ORDERS = "SELECT orders FROM Orders orders";
	private static final String _SQL_SELECT_ORDERS_WHERE = "SELECT orders FROM Orders orders WHERE ";
	private static final String _SQL_COUNT_ORDERS = "SELECT COUNT(orders) FROM Orders orders";
	private static final String _SQL_COUNT_ORDERS_WHERE = "SELECT COUNT(orders) FROM Orders orders WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "orders.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Orders exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Orders exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OrdersPersistenceImpl.class);
	private static Orders _nullOrders = new OrdersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Orders> toCacheModel() {
				return _nullOrdersCacheModel;
			}
		};

	private static CacheModel<Orders> _nullOrdersCacheModel = new CacheModel<Orders>() {
			@Override
			public Orders toEntityModel() {
				return _nullOrders;
			}
		};
}