package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.EPayAccessControl;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EPayAccessControl in entity cache.
 *
 * @author ahmed_fadlus
 * @see EPayAccessControl
 * @generated
 */
public class EPayAccessControlCacheModel implements CacheModel<EPayAccessControl>,
    Externalizable {
    public long epayCofignId;
    public long serviceId;
    public long serviceTypeId;
    public long channelId;
    public long pmtMethodId;
    public String transId;
    public String clientIP;
    public String serverIP;
    public String userAgent;
    public String operation;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String status;
    public long effectiveTimestamp;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{epayCofignId=");
        sb.append(epayCofignId);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", serviceTypeId=");
        sb.append(serviceTypeId);
        sb.append(", channelId=");
        sb.append(channelId);
        sb.append(", pmtMethodId=");
        sb.append(pmtMethodId);
        sb.append(", transId=");
        sb.append(transId);
        sb.append(", clientIP=");
        sb.append(clientIP);
        sb.append(", serverIP=");
        sb.append(serverIP);
        sb.append(", userAgent=");
        sb.append(userAgent);
        sb.append(", operation=");
        sb.append(operation);
        sb.append(", lastUpdateTimestamp=");
        sb.append(lastUpdateTimestamp);
        sb.append(", lastUpdateUserid=");
        sb.append(lastUpdateUserid);
        sb.append(", lastUpdateUsername=");
        sb.append(lastUpdateUsername);
        sb.append(", status=");
        sb.append(status);
        sb.append(", effectiveTimestamp=");
        sb.append(effectiveTimestamp);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EPayAccessControl toEntityModel() {
        EPayAccessControlImpl ePayAccessControlImpl = new EPayAccessControlImpl();

        ePayAccessControlImpl.setEpayCofignId(epayCofignId);
        ePayAccessControlImpl.setServiceId(serviceId);
        ePayAccessControlImpl.setServiceTypeId(serviceTypeId);
        ePayAccessControlImpl.setChannelId(channelId);
        ePayAccessControlImpl.setPmtMethodId(pmtMethodId);

        if (transId == null) {
            ePayAccessControlImpl.setTransId(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setTransId(transId);
        }

        if (clientIP == null) {
            ePayAccessControlImpl.setClientIP(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setClientIP(clientIP);
        }

        if (serverIP == null) {
            ePayAccessControlImpl.setServerIP(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setServerIP(serverIP);
        }

        if (userAgent == null) {
            ePayAccessControlImpl.setUserAgent(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            ePayAccessControlImpl.setOperation(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setOperation(operation);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            ePayAccessControlImpl.setLastUpdateTimestamp(null);
        } else {
            ePayAccessControlImpl.setLastUpdateTimestamp(new Date(
                    lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            ePayAccessControlImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            ePayAccessControlImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (status == null) {
            ePayAccessControlImpl.setStatus(StringPool.BLANK);
        } else {
            ePayAccessControlImpl.setStatus(status);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            ePayAccessControlImpl.setEffectiveTimestamp(null);
        } else {
            ePayAccessControlImpl.setEffectiveTimestamp(new Date(
                    effectiveTimestamp));
        }

        ePayAccessControlImpl.resetOriginalValues();

        return ePayAccessControlImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        epayCofignId = objectInput.readLong();
        serviceId = objectInput.readLong();
        serviceTypeId = objectInput.readLong();
        channelId = objectInput.readLong();
        pmtMethodId = objectInput.readLong();
        transId = objectInput.readUTF();
        clientIP = objectInput.readUTF();
        serverIP = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        status = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(epayCofignId);
        objectOutput.writeLong(serviceId);
        objectOutput.writeLong(serviceTypeId);
        objectOutput.writeLong(channelId);
        objectOutput.writeLong(pmtMethodId);

        if (transId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transId);
        }

        if (clientIP == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(clientIP);
        }

        if (serverIP == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serverIP);
        }

        if (userAgent == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userAgent);
        }

        if (operation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(operation);
        }

        objectOutput.writeLong(lastUpdateTimestamp);

        if (lastUpdateUserid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastUpdateUsername);
        }

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        objectOutput.writeLong(effectiveTimestamp);
    }
}
