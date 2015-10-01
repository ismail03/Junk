package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;


public class NotifParamSrvPK implements Comparable<NotifParamSrvPK>,
    Serializable {
    public long notifParamId;
    public long serviceId;

    public NotifParamSrvPK() {
    }

    public NotifParamSrvPK(long notifParamId, long serviceId) {
        this.notifParamId = notifParamId;
        this.serviceId = serviceId;
    }

    public long getNotifParamId() {
        return notifParamId;
    }

    public void setNotifParamId(long notifParamId) {
        this.notifParamId = notifParamId;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public int compareTo(NotifParamSrvPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (notifParamId < pk.notifParamId) {
            value = -1;
        } else if (notifParamId > pk.notifParamId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (serviceId < pk.serviceId) {
            value = -1;
        } else if (serviceId > pk.serviceId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NotifParamSrvPK)) {
            return false;
        }

        NotifParamSrvPK pk = (NotifParamSrvPK) obj;

        if ((notifParamId == pk.notifParamId) && (serviceId == pk.serviceId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(notifParamId) + String.valueOf(serviceId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("notifParamId");
        sb.append(StringPool.EQUAL);
        sb.append(notifParamId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("serviceId");
        sb.append(StringPool.EQUAL);
        sb.append(serviceId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
