package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.NotifParamSrv;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing NotifParamSrv in entity cache.
 *
 * @author ahmed_fadlus
 * @see NotifParamSrv
 * @generated
 */
public class NotifParamSrvCacheModel implements CacheModel<NotifParamSrv>,
    Externalizable {
    public long notifParamId;
    public long serviceId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{notifParamId=");
        sb.append(notifParamId);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public NotifParamSrv toEntityModel() {
        NotifParamSrvImpl notifParamSrvImpl = new NotifParamSrvImpl();

        notifParamSrvImpl.setNotifParamId(notifParamId);
        notifParamSrvImpl.setServiceId(serviceId);

        notifParamSrvImpl.resetOriginalValues();

        return notifParamSrvImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        notifParamId = objectInput.readLong();
        serviceId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(notifParamId);
        objectOutput.writeLong(serviceId);
    }
}
