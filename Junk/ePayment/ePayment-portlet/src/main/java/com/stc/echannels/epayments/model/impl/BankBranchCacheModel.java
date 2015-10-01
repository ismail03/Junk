package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.BankBranch;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BankBranch in entity cache.
 *
 * @author ahmed_fadlus
 * @see BankBranch
 * @generated
 */
public class BankBranchCacheModel implements CacheModel<BankBranch>,
    Externalizable {
    public String transId;
    public String stcBranchCode;
    public String bankId;
    public long channelId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String active;
    public String status;
    public long effectiveTimestamp;
    public String clientIp;
    public String serverIp;
    public String userAgent;
    public String operation;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{transId=");
        sb.append(transId);
        sb.append(", stcBranchCode=");
        sb.append(stcBranchCode);
        sb.append(", bankId=");
        sb.append(bankId);
        sb.append(", channelId=");
        sb.append(channelId);
        sb.append(", lastUpdateTimestamp=");
        sb.append(lastUpdateTimestamp);
        sb.append(", lastUpdateUserid=");
        sb.append(lastUpdateUserid);
        sb.append(", lastUpdateUsername=");
        sb.append(lastUpdateUsername);
        sb.append(", active=");
        sb.append(active);
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BankBranch toEntityModel() {
        BankBranchImpl bankBranchImpl = new BankBranchImpl();

        if (transId == null) {
            bankBranchImpl.setTransId(StringPool.BLANK);
        } else {
            bankBranchImpl.setTransId(transId);
        }

        if (stcBranchCode == null) {
            bankBranchImpl.setStcBranchCode(StringPool.BLANK);
        } else {
            bankBranchImpl.setStcBranchCode(stcBranchCode);
        }

        if (bankId == null) {
            bankBranchImpl.setBankId(StringPool.BLANK);
        } else {
            bankBranchImpl.setBankId(bankId);
        }

        bankBranchImpl.setChannelId(channelId);

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            bankBranchImpl.setLastUpdateTimestamp(null);
        } else {
            bankBranchImpl.setLastUpdateTimestamp(new Date(lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            bankBranchImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            bankBranchImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            bankBranchImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            bankBranchImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (active == null) {
            bankBranchImpl.setActive(StringPool.BLANK);
        } else {
            bankBranchImpl.setActive(active);
        }

        if (status == null) {
            bankBranchImpl.setStatus(StringPool.BLANK);
        } else {
            bankBranchImpl.setStatus(status);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            bankBranchImpl.setEffectiveTimestamp(null);
        } else {
            bankBranchImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (clientIp == null) {
            bankBranchImpl.setClientIp(StringPool.BLANK);
        } else {
            bankBranchImpl.setClientIp(clientIp);
        }

        if (serverIp == null) {
            bankBranchImpl.setServerIp(StringPool.BLANK);
        } else {
            bankBranchImpl.setServerIp(serverIp);
        }

        if (userAgent == null) {
            bankBranchImpl.setUserAgent(StringPool.BLANK);
        } else {
            bankBranchImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            bankBranchImpl.setOperation(StringPool.BLANK);
        } else {
            bankBranchImpl.setOperation(operation);
        }

        bankBranchImpl.resetOriginalValues();

        return bankBranchImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        transId = objectInput.readUTF();
        stcBranchCode = objectInput.readUTF();
        bankId = objectInput.readUTF();
        channelId = objectInput.readLong();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        active = objectInput.readUTF();
        status = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        clientIp = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (transId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transId);
        }

        if (stcBranchCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(stcBranchCode);
        }

        if (bankId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankId);
        }

        objectOutput.writeLong(channelId);
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

        if (active == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(active);
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
    }
}
