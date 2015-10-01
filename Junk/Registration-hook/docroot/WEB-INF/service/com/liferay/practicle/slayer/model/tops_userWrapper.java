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

package com.liferay.practicle.slayer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link tops_user}.
 * </p>
 *
 * @author Ismail
 * @see tops_user
 * @generated
 */
public class tops_userWrapper implements tops_user, ModelWrapper<tops_user> {
	public tops_userWrapper(tops_user tops_user) {
		_tops_user = tops_user;
	}

	@Override
	public Class<?> getModelClass() {
		return tops_user.class;
	}

	@Override
	public String getModelClassName() {
		return tops_user.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tops_userId", getTops_userId());
		attributes.put("firstname", getFirstname());
		attributes.put("LastName", getLastName());
		attributes.put("userName", getUserName());
		attributes.put("password", getPassword());
		attributes.put("email", getEmail());
		attributes.put("phone", getPhone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tops_userId = (Long)attributes.get("tops_userId");

		if (tops_userId != null) {
			setTops_userId(tops_userId);
		}

		String firstname = (String)attributes.get("firstname");

		if (firstname != null) {
			setFirstname(firstname);
		}

		String LastName = (String)attributes.get("LastName");

		if (LastName != null) {
			setLastName(LastName);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}
	}

	/**
	* Returns the primary key of this tops_user.
	*
	* @return the primary key of this tops_user
	*/
	@Override
	public long getPrimaryKey() {
		return _tops_user.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tops_user.
	*
	* @param primaryKey the primary key of this tops_user
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tops_user.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tops_user ID of this tops_user.
	*
	* @return the tops_user ID of this tops_user
	*/
	@Override
	public long getTops_userId() {
		return _tops_user.getTops_userId();
	}

	/**
	* Sets the tops_user ID of this tops_user.
	*
	* @param tops_userId the tops_user ID of this tops_user
	*/
	@Override
	public void setTops_userId(long tops_userId) {
		_tops_user.setTops_userId(tops_userId);
	}

	/**
	* Returns the firstname of this tops_user.
	*
	* @return the firstname of this tops_user
	*/
	@Override
	public java.lang.String getFirstname() {
		return _tops_user.getFirstname();
	}

	/**
	* Sets the firstname of this tops_user.
	*
	* @param firstname the firstname of this tops_user
	*/
	@Override
	public void setFirstname(java.lang.String firstname) {
		_tops_user.setFirstname(firstname);
	}

	/**
	* Returns the last name of this tops_user.
	*
	* @return the last name of this tops_user
	*/
	@Override
	public java.lang.String getLastName() {
		return _tops_user.getLastName();
	}

	/**
	* Sets the last name of this tops_user.
	*
	* @param LastName the last name of this tops_user
	*/
	@Override
	public void setLastName(java.lang.String LastName) {
		_tops_user.setLastName(LastName);
	}

	/**
	* Returns the user name of this tops_user.
	*
	* @return the user name of this tops_user
	*/
	@Override
	public java.lang.String getUserName() {
		return _tops_user.getUserName();
	}

	/**
	* Sets the user name of this tops_user.
	*
	* @param userName the user name of this tops_user
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tops_user.setUserName(userName);
	}

	/**
	* Returns the password of this tops_user.
	*
	* @return the password of this tops_user
	*/
	@Override
	public java.lang.String getPassword() {
		return _tops_user.getPassword();
	}

	/**
	* Sets the password of this tops_user.
	*
	* @param password the password of this tops_user
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_tops_user.setPassword(password);
	}

	/**
	* Returns the email of this tops_user.
	*
	* @return the email of this tops_user
	*/
	@Override
	public java.lang.String getEmail() {
		return _tops_user.getEmail();
	}

	/**
	* Sets the email of this tops_user.
	*
	* @param email the email of this tops_user
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_tops_user.setEmail(email);
	}

	/**
	* Returns the phone of this tops_user.
	*
	* @return the phone of this tops_user
	*/
	@Override
	public java.lang.String getPhone() {
		return _tops_user.getPhone();
	}

	/**
	* Sets the phone of this tops_user.
	*
	* @param phone the phone of this tops_user
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_tops_user.setPhone(phone);
	}

	@Override
	public boolean isNew() {
		return _tops_user.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tops_user.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tops_user.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tops_user.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tops_user.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tops_user.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tops_user.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tops_user.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tops_user.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tops_user.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tops_user.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new tops_userWrapper((tops_user)_tops_user.clone());
	}

	@Override
	public int compareTo(com.liferay.practicle.slayer.model.tops_user tops_user) {
		return _tops_user.compareTo(tops_user);
	}

	@Override
	public int hashCode() {
		return _tops_user.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.practicle.slayer.model.tops_user> toCacheModel() {
		return _tops_user.toCacheModel();
	}

	@Override
	public com.liferay.practicle.slayer.model.tops_user toEscapedModel() {
		return new tops_userWrapper(_tops_user.toEscapedModel());
	}

	@Override
	public com.liferay.practicle.slayer.model.tops_user toUnescapedModel() {
		return new tops_userWrapper(_tops_user.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tops_user.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tops_user.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tops_user.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tops_userWrapper)) {
			return false;
		}

		tops_userWrapper tops_userWrapper = (tops_userWrapper)obj;

		if (Validator.equals(_tops_user, tops_userWrapper._tops_user)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public tops_user getWrappedtops_user() {
		return _tops_user;
	}

	@Override
	public tops_user getWrappedModel() {
		return _tops_user;
	}

	@Override
	public void resetOriginalValues() {
		_tops_user.resetOriginalValues();
	}

	private tops_user _tops_user;
}