package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.SystemConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SystemConfig in entity cache.
 *
 * @author ahmed_fadlus
 * @see SystemConfig
 * @generated
 */
public class SystemConfigCacheModel implements CacheModel<SystemConfig>,
    Externalizable {
    public String transId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String status;
    public long effectiveTimestamp;
    public String clientIp;
    public String serverIp;
    public String userAgent;
    public String operation;
    public long serviceId;
    public String bankId;
    public String config;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{transId=");
        sb.append(transId);
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
        sb.append(", clientIp=");
        sb.append(clientIp);
        sb.append(", serverIp=");
        sb.append(serverIp);
        sb.append(", userAgent=");
        sb.append(userAgent);
        sb.append(", operation=");
        sb.append(operation);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", bankId=");
        sb.append(bankId);
        sb.append(", config=");
        sb.append(config);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SystemConfig toEntityModel() {
        SystemConfigImpl systemConfigImpl = new SystemConfigImpl();

        if (transId == null) {
            systemConfigImpl.setTransId(StringPool.BLANK);
        } else {
            systemConfigImpl.setTransId(transId);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            systemConfigImpl.setLastUpdateTimestamp(null);
        } else {
            systemConfigImpl.setLastUpdateTimestamp(new Date(
                    lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            systemConfigImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            systemConfigImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            systemConfigImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            systemConfigImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (status == null) {
            systemConfigImpl.setStatus(StringPool.BLANK);
        } else {
            systemConfigImpl.setStatus(status);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            systemConfigImpl.setEffectiveTimestamp(null);
        } else {
            systemConfigImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (clientIp == null) {
            systemConfigImpl.setClientIp(StringPool.BLANK);
        } else {
            systemConfigImpl.setClientIp(clientIp);
        }

        if (serverIp == null) {
            systemConfigImpl.setServerIp(StringPool.BLANK);
        } else {
            systemConfigImpl.setServerIp(serverIp);
        }

        if (userAgent == null) {
            systemConfigImpl.setUserAgent(StringPool.BLANK);
        } else {
            systemConfigImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            systemConfigImpl.setOperation(StringPool.BLANK);
        } else {
            systemConfigImpl.setOperation(operation);
        }

        systemConfigImpl.setServiceId(serviceId);

        if (bankId == null) {
            systemConfigImpl.setBankId(StringPool.BLANK);
        } else {
            systemConfigImpl.setBankId(bankId);
        }

        if (config == null) {
            systemConfigImpl.setConfig(StringPool.BLANK);
        } else {
            systemConfigImpl.setConfig(config);
        }

        systemConfigImpl.resetOriginalValues();

        return systemConfigImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        transId = objectInput.readUTF();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        status = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        clientIp = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        serviceId = objectInput.readLong();
        bankId = objectInput.readUTF();
        config = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
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

        objectOutput.writeLong(serviceId);

        if (bankId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankId);
        }

        if (config == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(config);
        }
    }
}
