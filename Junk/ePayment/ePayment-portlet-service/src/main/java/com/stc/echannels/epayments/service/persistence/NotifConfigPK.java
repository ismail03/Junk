package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;


public class NotifConfigPK implements Comparable<NotifConfigPK>, Serializable {
    public String transId;
    public long notifId;

    public NotifConfigPK() {
    }

    public NotifConfigPK(String transId, long notifId) {
        this.transId = transId;
        this.notifId = notifId;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public long getNotifId() {
        return notifId;
    }

    public void setNotifId(long notifId) {
        this.notifId = notifId;
    }

    @Override
    public int compareTo(NotifConfigPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        value = transId.compareTo(pk.transId);

        if (value != 0) {
            return value;
        }

        if (notifId < pk.notifId) {
            value = -1;
        } else if (notifId > pk.notifId) {
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

        if (!(obj instanceof NotifConfigPK)) {
            return false;
        }

        NotifConfigPK pk = (NotifConfigPK) obj;

        if ((transId.equals(pk.transId)) && (notifId == pk.notifId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(transId) + String.valueOf(notifId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("transId");
        sb.append(StringPool.EQUAL);
        sb.append(transId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("notifId");
        sb.append(StringPool.EQUAL);
        sb.append(notifId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
