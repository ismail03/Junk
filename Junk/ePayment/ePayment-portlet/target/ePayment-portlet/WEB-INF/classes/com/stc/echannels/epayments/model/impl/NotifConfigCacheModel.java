package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.NotifConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NotifConfig in entity cache.
 *
 * @author ahmed_fadlus
 * @see NotifConfig
 * @generated
 */
public class NotifConfigCacheModel implements CacheModel<NotifConfig>,
    Externalizable {
    public long notifId;
    public String transId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String status;
    public String active;
    public long effectiveTimestamp;
    public String clientIp;
    public String serverIp;
    public String userAgent;
    public String operation;
    public String enabled;
    public String msgEn;
    public String msgAr;
    public String param1;
    public String param2;
    public String param3;
    public String param4;
    public String param5;
    public String decriptiveNameEn;
    public String decriptiveNameAr;
    public String notifName;
    public long serviceId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(49);

        sb.append("{notifId=");
        sb.append(notifId);
        sb.append(", transId=");
        sb.append(transId);
        sb.append(", lastUpdateTimestamp=");
        sb.append(lastUpdateTimestamp);
        sb.append(", lastUpdateUserid=");
        sb.append(lastUpdateUserid);
        sb.append(", lastUpdateUsername=");
        sb.append(lastUpdateUsername);
        sb.append(", status=");
        sb.append(status);
        sb.append(", active=");
        sb.append(active);
        sb.append(", effectiveTimestamp=");
        sb.append(effectiveTimestamp);
        sb.append(", clientIp=");
        sb.append(clientIp);
        sb.append(", serverIp=");
        sb.append(serverIp);
        sb.append(", userAgent=");
        sb.append(userAgent);
        sb.append(", operation=");
        sb.append(operation);
        sb.append(", enabled=");
        sb.append(enabled);
        sb.append(", msgEn=");
        sb.append(msgEn);
        sb.append(", msgAr=");
        sb.append(msgAr);
        sb.append(", param1=");
        sb.append(param1);
        sb.append(", param2=");
        sb.append(param2);
        sb.append(", param3=");
        sb.append(param3);
        sb.append(", param4=");
        sb.append(param4);
        sb.append(", param5=");
        sb.append(param5);
        sb.append(", decriptiveNameEn=");
        sb.append(decriptiveNameEn);
        sb.append(", decriptiveNameAr=");
        sb.append(decriptiveNameAr);
        sb.append(", notifName=");
        sb.append(notifName);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public NotifConfig toEntityModel() {
        NotifConfigImpl notifConfigImpl = new NotifConfigImpl();

        notifConfigImpl.setNotifId(notifId);

        if (transId == null) {
            notifConfigImpl.setTransId(StringPool.BLANK);
        } else {
            notifConfigImpl.setTransId(transId);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            notifConfigImpl.setLastUpdateTimestamp(null);
        } else {
            notifConfigImpl.setLastUpdateTimestamp(new Date(lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            notifConfigImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            notifConfigImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            notifConfigImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            notifConfigImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (status == null) {
            notifConfigImpl.setStatus(StringPool.BLANK);
        } else {
            notifConfigImpl.setStatus(status);
        }

        if (active == null) {
            notifConfigImpl.setActive(StringPool.BLANK);
        } else {
            notifConfigImpl.setActive(active);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            notifConfigImpl.setEffectiveTimestamp(null);
        } else {
            notifConfigImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (clientIp == null) {
            notifConfigImpl.setClientIp(StringPool.BLANK);
        } else {
            notifConfigImpl.setClientIp(clientIp);
        }

        if (serverIp == null) {
            notifConfigImpl.setServerIp(StringPool.BLANK);
        } else {
            notifConfigImpl.setServerIp(serverIp);
        }

        if (userAgent == null) {
            notifConfigImpl.setUserAgent(StringPool.BLANK);
        } else {
            notifConfigImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            notifConfigImpl.setOperation(StringPool.BLANK);
        } else {
            notifConfigImpl.setOperation(operation);
        }

        if (enabled == null) {
            notifConfigImpl.setEnabled(StringPool.BLANK);
        } else {
            notifConfigImpl.setEnabled(enabled);
        }

        if (msgEn == null) {
            notifConfigImpl.setMsgEn(StringPool.BLANK);
        } else {
            notifConfigImpl.setMsgEn(msgEn);
        }

        if (msgAr == null) {
            notifConfigImpl.setMsgAr(StringPool.BLANK);
        } else {
            notifConfigImpl.setMsgAr(msgAr);
        }

        if (param1 == null) {
            notifConfigImpl.setParam1(StringPool.BLANK);
        } else {
            notifConfigImpl.setParam1(param1);
        }

        if (param2 == null) {
            notifConfigImpl.setParam2(StringPool.BLANK);
        } else {
            notifConfigImpl.setParam2(param2);
        }

        if (param3 == null) {
            notifConfigImpl.setParam3(StringPool.BLANK);
        } else {
            notifConfigImpl.setParam3(param3);
        }

        if (param4 == null) {
            notifConfigImpl.setParam4(StringPool.BLANK);
        } else {
            notifConfigImpl.setParam4(param4);
        }

        if (param5 == null) {
            notifConfigImpl.setParam5(StringPool.BLANK);
        } else {
            notifConfigImpl.setParam5(param5);
        }

        if (decriptiveNameEn == null) {
            notifConfigImpl.setDecriptiveNameEn(StringPool.BLANK);
        } else {
            notifConfigImpl.setDecriptiveNameEn(decriptiveNameEn);
        }

        if (decriptiveNameAr == null) {
            notifConfigImpl.setDecriptiveNameAr(StringPool.BLANK);
        } else {
            notifConfigImpl.setDecriptiveNameAr(decriptiveNameAr);
        }

        if (notifName == null) {
            notifConfigImpl.setNotifName(StringPool.BLANK);
        } else {
            notifConfigImpl.setNotifName(notifName);
        }

        notifConfigImpl.setServiceId(serviceId);

        notifConfigImpl.resetOriginalValues();

        return notifConfigImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        notifId = objectInput.readLong();
        transId = objectInput.readUTF();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        status = objectInput.readUTF();
        active = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        clientIp = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        enabled = objectInput.readUTF();
        msgEn = objectInput.readUTF();
        msgAr = objectInput.readUTF();
        param1 = objectInput.readUTF();
        param2 = objectInput.readUTF();
        param3 = objectInput.readUTF();
        param4 = objectInput.readUTF();
        param5 = objectInput.readUTF();
        decriptiveNameEn = objectInput.readUTF();
        decriptiveNameAr = objectInput.readUTF();
        notifName = objectInput.readUTF();
        serviceId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(notifId);

        if (transId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transId);
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

        if (active == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(active);
        }

        objectOutput.writeLong(effectiveTimestamp);

        if (clientIp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(clientIp);
        }

        if (serverIp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serverIp);
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

        if (enabled == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(enabled);
        }

        if (msgEn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(msgEn);
        }

        if (msgAr == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(msgAr);
        }

        if (param1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(param1);
        }

        if (param2 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(param2);
        }

        if (param3 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(param3);
        }

        if (param4 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(param4);
        }

        if (param5 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(param5);
        }

        if (decriptiveNameEn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(decriptiveNameEn);
        }

        if (decriptiveNameAr == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(decriptiveNameAr);
        }

        if (notifName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(notifName);
        }

        objectOutput.writeLong(serviceId);
    }
}
