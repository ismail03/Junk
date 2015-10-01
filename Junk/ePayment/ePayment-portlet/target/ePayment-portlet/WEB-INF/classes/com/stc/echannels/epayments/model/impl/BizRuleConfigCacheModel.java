package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.BizRuleConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BizRuleConfig in entity cache.
 *
 * @author ahmed_fadlus
 * @see BizRuleConfig
 * @generated
 */
public class BizRuleConfigCacheModel implements CacheModel<BizRuleConfig>,
    Externalizable {
    public long bizRuleId;
    public long serviceId;
    public long channelId;
    public long pmtMethodId;
    public String customValue;
    public long ruleId;
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
        StringBundler sb = new StringBundler(33);

        sb.append("{bizRuleId=");
        sb.append(bizRuleId);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", channelId=");
        sb.append(channelId);
        sb.append(", pmtMethodId=");
        sb.append(pmtMethodId);
        sb.append(", customValue=");
        sb.append(customValue);
        sb.append(", ruleId=");
        sb.append(ruleId);
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
    public BizRuleConfig toEntityModel() {
        BizRuleConfigImpl bizRuleConfigImpl = new BizRuleConfigImpl();

        bizRuleConfigImpl.setBizRuleId(bizRuleId);
        bizRuleConfigImpl.setServiceId(serviceId);
        bizRuleConfigImpl.setChannelId(channelId);
        bizRuleConfigImpl.setPmtMethodId(pmtMethodId);

        if (customValue == null) {
            bizRuleConfigImpl.setCustomValue(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setCustomValue(customValue);
        }

        bizRuleConfigImpl.setRuleId(ruleId);

        if (transId == null) {
            bizRuleConfigImpl.setTransId(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setTransId(transId);
        }

        if (clientIP == null) {
            bizRuleConfigImpl.setClientIP(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setClientIP(clientIP);
        }

        if (serverIP == null) {
            bizRuleConfigImpl.setServerIP(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setServerIP(serverIP);
        }

        if (userAgent == null) {
            bizRuleConfigImpl.setUserAgent(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            bizRuleConfigImpl.setOperation(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setOperation(operation);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            bizRuleConfigImpl.setLastUpdateTimestamp(null);
        } else {
            bizRuleConfigImpl.setLastUpdateTimestamp(new Date(
                    lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            bizRuleConfigImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            bizRuleConfigImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (status == null) {
            bizRuleConfigImpl.setStatus(StringPool.BLANK);
        } else {
            bizRuleConfigImpl.setStatus(status);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            bizRuleConfigImpl.setEffectiveTimestamp(null);
        } else {
            bizRuleConfigImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        bizRuleConfigImpl.resetOriginalValues();

        return bizRuleConfigImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bizRuleId = objectInput.readLong();
        serviceId = objectInput.readLong();
        channelId = objectInput.readLong();
        pmtMethodId = objectInput.readLong();
        customValue = objectInput.readUTF();
        ruleId = objectInput.readLong();
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
        objectOutput.writeLong(bizRuleId);
        objectOutput.writeLong(serviceId);
        objectOutput.writeLong(channelId);
        objectOutput.writeLong(pmtMethodId);

        if (customValue == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(customValue);
        }

        objectOutput.writeLong(ruleId);

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
