package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.NotifParam;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing NotifParam in entity cache.
 *
 * @author ahmed_fadlus
 * @see NotifParam
 * @generated
 */
public class NotifParamCacheModel implements CacheModel<NotifParam>,
    Externalizable {
    public long notifParamId;
    public String nameAr;
    public String nameEn;
    public String paramName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{notifParamId=");
        sb.append(notifParamId);
        sb.append(", nameAr=");
        sb.append(nameAr);
        sb.append(", nameEn=");
        sb.append(nameEn);
        sb.append(", paramName=");
        sb.append(paramName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public NotifParam toEntityModel() {
        NotifParamImpl notifParamImpl = new NotifParamImpl();

        notifParamImpl.setNotifParamId(notifParamId);

        if (nameAr == null) {
            notifParamImpl.setNameAr(StringPool.BLANK);
        } else {
            notifParamImpl.setNameAr(nameAr);
        }

        if (nameEn == null) {
            notifParamImpl.setNameEn(StringPool.BLANK);
        } else {
            notifParamImpl.setNameEn(nameEn);
        }

        if (paramName == null) {
            notifParamImpl.setParamName(StringPool.BLANK);
        } else {
            notifParamImpl.setParamName(paramName);
        }

        notifParamImpl.resetOriginalValues();

        return notifParamImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        notifParamId = objectInput.readLong();
        nameAr = objectInput.readUTF();
        nameEn = objectInput.readUTF();
        paramName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(notifParamId);

        if (nameAr == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nameAr);
        }

        if (nameEn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nameEn);
        }

        if (paramName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(paramName);
        }
    }
}
