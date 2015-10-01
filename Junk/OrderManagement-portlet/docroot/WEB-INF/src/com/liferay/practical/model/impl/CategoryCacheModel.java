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

package com.liferay.practical.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.practical.model.Category;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Category in entity cache.
 *
 * @author saifulla
 * @see Category
 * @generated
 */
public class CategoryCacheModel implements CacheModel<Category>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{categoryid=");
		sb.append(categoryid);
		sb.append(", categoryname=");
		sb.append(categoryname);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Category toEntityModel() {
		CategoryImpl categoryImpl = new CategoryImpl();

		categoryImpl.setCategoryid(categoryid);

		if (categoryname == null) {
			categoryImpl.setCategoryname(StringPool.BLANK);
		}
		else {
			categoryImpl.setCategoryname(categoryname);
		}

		categoryImpl.resetOriginalValues();

		return categoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		categoryid = objectInput.readLong();
		categoryname = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(categoryid);

		if (categoryname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryname);
		}
	}

	public long categoryid;
	public String categoryname;
}