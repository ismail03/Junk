package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentRule;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentRule in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentRule
 * @generated
 */
public class PaymentRuleCacheModel implements CacheModel<PaymentRule>,
    Externalizable {
    public long ruleId;
    public String transId;
    public String ruleName;
    public String value;
    public String descriptionEN;
    public String descriptionAR;
    public String isEditable;
    public String refundOnViolation;
    public String ruleCategory;
    public String clientIP;
    public String serverIP;
    public String userAgent;
    public String operation;
    public String isList;
    public long serviceTypeId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String status;
    public long effectiveTimestamp;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(41);

        sb.append("{ruleId=");
        sb.append(ruleId);
        sb.append(", transId=");
        sb.append(transId);
        sb.append(", ruleName=");
        sb.append(ruleName);
        sb.append(", value=");
        sb.append(value);
        sb.append(", descriptionEN=");
        sb.append(descriptionEN);
        sb.append(", descriptionAR=");
        sb.append(descriptionAR);
        sb.append(", isEditable=");
        sb.append(isEditable);
        sb.append(", refundOnViolation=");
        sb.append(refundOnViolation);
        sb.append(", ruleCategory=");
        sb.append(ruleCategory);
        sb.append(", clientIP=");
        sb.append(clientIP);
        sb.append(", serverIP=");
        sb.append(serverIP);
        sb.append(", userAgent=");
        sb.append(userAgent);
        sb.append(", operation=");
        sb.append(operation);
        sb.append(", isList=");
        sb.append(isList);
        sb.append(", serviceTypeId=");
        sb.append(serviceTypeId);
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
    public PaymentRule toEntityModel() {
        PaymentRuleImpl paymentRuleImpl = new PaymentRuleImpl();

        paymentRuleImpl.setRuleId(ruleId);

        if (transId == null) {
            paymentRuleImpl.setTransId(StringPool.BLANK);
        } else {
            paymentRuleImpl.setTransId(transId);
        }

        if (ruleName == null) {
            paymentRuleImpl.setRuleName(StringPool.BLANK);
        } else {
            paymentRuleImpl.setRuleName(ruleName);
        }

        if (value == null) {
            paymentRuleImpl.setValue(StringPool.BLANK);
        } else {
            paymentRuleImpl.setValue(value);
        }

        if (descriptionEN == null) {
            paymentRuleImpl.setDescriptionEN(StringPool.BLANK);
        } else {
            paymentRuleImpl.setDescriptionEN(descriptionEN);
        }

        if (descriptionAR == null) {
            paymentRuleImpl.setDescriptionAR(StringPool.BLANK);
        } else {
            paymentRuleImpl.setDescriptionAR(descriptionAR);
        }

        if (isEditable == null) {
            paymentRuleImpl.setIsEditable(StringPool.BLANK);
        } else {
            paymentRuleImpl.setIsEditable(isEditable);
        }

        if (refundOnViolation == null) {
            paymentRuleImpl.setRefundOnViolation(StringPool.BLANK);
        } else {
            paymentRuleImpl.setRefundOnViolation(refundOnViolation);
        }

        if (ruleCategory == null) {
            paymentRuleImpl.setRuleCategory(StringPool.BLANK);
        } else {
            paymentRuleImpl.setRuleCategory(ruleCategory);
        }

        if (clientIP == null) {
            paymentRuleImpl.setClientIP(StringPool.BLANK);
        } else {
            paymentRuleImpl.setClientIP(clientIP);
        }

        if (serverIP == null) {
            paymentRuleImpl.setServerIP(StringPool.BLANK);
        } else {
            paymentRuleImpl.setServerIP(serverIP);
        }

        if (userAgent == null) {
            paymentRuleImpl.setUserAgent(StringPool.BLANK);
        } else {
            paymentRuleImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            paymentRuleImpl.setOperation(StringPool.BLANK);
        } else {
            paymentRuleImpl.setOperation(operation);
        }

        if (isList == null) {
            paymentRuleImpl.setIsList(StringPool.BLANK);
        } else {
            paymentRuleImpl.setIsList(isList);
        }

        paymentRuleImpl.setServiceTypeId(serviceTypeId);

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            paymentRuleImpl.setLastUpdateTimestamp(null);
        } else {
            paymentRuleImpl.setLastUpdateTimestamp(new Date(lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            paymentRuleImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            paymentRuleImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            paymentRuleImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            paymentRuleImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (status == null) {
            paymentRuleImpl.setStatus(StringPool.BLANK);
        } else {
            paymentRuleImpl.setStatus(status);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            paymentRuleImpl.setEffectiveTimestamp(null);
        } else {
            paymentRuleImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        paymentRuleImpl.resetOriginalValues();

        return paymentRuleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        ruleId = objectInput.readLong();
        transId = objectInput.readUTF();
        ruleName = objectInput.readUTF();
        value = objectInput.readUTF();
        descriptionEN = objectInput.readUTF();
        descriptionAR = objectInput.readUTF();
        isEditable = objectInput.readUTF();
        refundOnViolation = objectInput.readUTF();
        ruleCategory = objectInput.readUTF();
        clientIP = objectInput.readUTF();
        serverIP = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        isList = objectInput.readUTF();
        serviceTypeId = objectInput.readLong();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        status = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(ruleId);

        if (transId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transId);
        }

        if (ruleName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ruleName);
        }

        if (value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(value);
        }

        if (descriptionEN == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptionEN);
        }

        if (descriptionAR == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptionAR);
        }

        if (isEditable == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(isEditable);
        }

        if (refundOnViolation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(refundOnViolation);
        }

        if (ruleCategory == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ruleCategory);
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

        if (isList == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(isList);
        }

        objectOutput.writeLong(serviceTypeId);
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
