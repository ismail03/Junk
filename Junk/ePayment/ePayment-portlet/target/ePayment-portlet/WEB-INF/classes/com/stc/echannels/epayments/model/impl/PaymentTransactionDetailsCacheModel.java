package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentTransactionDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentTransactionDetails in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionDetails
 * @generated
 */
public class PaymentTransactionDetailsCacheModel implements CacheModel<PaymentTransactionDetails>,
    Externalizable {
    public String epayTransId;
    public String epayInstanceId;
    public String accountNumber;
    public long serviceTypeId;
    public long transAmount;
    public String transValue;
    public long processDate;
    public String serviceNumber;
    public String idType;
    public String recipientId;
    public String recipientIdType;
    public String notificationNumber;
    public String processStatus;
    public String serviceCategory;
    public String reasonCode;
    public String nativeReasonCode;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{epayTransId=");
        sb.append(epayTransId);
        sb.append(", epayInstanceId=");
        sb.append(epayInstanceId);
        sb.append(", accountNumber=");
        sb.append(accountNumber);
        sb.append(", serviceTypeId=");
        sb.append(serviceTypeId);
        sb.append(", transAmount=");
        sb.append(transAmount);
        sb.append(", transValue=");
        sb.append(transValue);
        sb.append(", processDate=");
        sb.append(processDate);
        sb.append(", serviceNumber=");
        sb.append(serviceNumber);
        sb.append(", idType=");
        sb.append(idType);
        sb.append(", recipientId=");
        sb.append(recipientId);
        sb.append(", recipientIdType=");
        sb.append(recipientIdType);
        sb.append(", notificationNumber=");
        sb.append(notificationNumber);
        sb.append(", processStatus=");
        sb.append(processStatus);
        sb.append(", serviceCategory=");
        sb.append(serviceCategory);
        sb.append(", reasonCode=");
        sb.append(reasonCode);
        sb.append(", nativeReasonCode=");
        sb.append(nativeReasonCode);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentTransactionDetails toEntityModel() {
        PaymentTransactionDetailsImpl paymentTransactionDetailsImpl = new PaymentTransactionDetailsImpl();

        if (epayTransId == null) {
            paymentTransactionDetailsImpl.setEpayTransId(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setEpayTransId(epayTransId);
        }

        if (epayInstanceId == null) {
            paymentTransactionDetailsImpl.setEpayInstanceId(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setEpayInstanceId(epayInstanceId);
        }

        if (accountNumber == null) {
            paymentTransactionDetailsImpl.setAccountNumber(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setAccountNumber(accountNumber);
        }

        paymentTransactionDetailsImpl.setServiceTypeId(serviceTypeId);
        paymentTransactionDetailsImpl.setTransAmount(transAmount);

        if (transValue == null) {
            paymentTransactionDetailsImpl.setTransValue(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setTransValue(transValue);
        }

        if (processDate == Long.MIN_VALUE) {
            paymentTransactionDetailsImpl.setProcessDate(null);
        } else {
            paymentTransactionDetailsImpl.setProcessDate(new Date(processDate));
        }

        if (serviceNumber == null) {
            paymentTransactionDetailsImpl.setServiceNumber(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setServiceNumber(serviceNumber);
        }

        if (idType == null) {
            paymentTransactionDetailsImpl.setIdType(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setIdType(idType);
        }

        if (recipientId == null) {
            paymentTransactionDetailsImpl.setRecipientId(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setRecipientId(recipientId);
        }

        if (recipientIdType == null) {
            paymentTransactionDetailsImpl.setRecipientIdType(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setRecipientIdType(recipientIdType);
        }

        if (notificationNumber == null) {
            paymentTransactionDetailsImpl.setNotificationNumber(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setNotificationNumber(notificationNumber);
        }

        if (processStatus == null) {
            paymentTransactionDetailsImpl.setProcessStatus(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setProcessStatus(processStatus);
        }

        if (serviceCategory == null) {
            paymentTransactionDetailsImpl.setServiceCategory(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setServiceCategory(serviceCategory);
        }

        if (reasonCode == null) {
            paymentTransactionDetailsImpl.setReasonCode(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setReasonCode(reasonCode);
        }

        if (nativeReasonCode == null) {
            paymentTransactionDetailsImpl.setNativeReasonCode(StringPool.BLANK);
        } else {
            paymentTransactionDetailsImpl.setNativeReasonCode(nativeReasonCode);
        }

        paymentTransactionDetailsImpl.resetOriginalValues();

        return paymentTransactionDetailsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        epayTransId = objectInput.readUTF();
        epayInstanceId = objectInput.readUTF();
        accountNumber = objectInput.readUTF();
        serviceTypeId = objectInput.readLong();
        transAmount = objectInput.readLong();
        transValue = objectInput.readUTF();
        processDate = objectInput.readLong();
        serviceNumber = objectInput.readUTF();
        idType = objectInput.readUTF();
        recipientId = objectInput.readUTF();
        recipientIdType = objectInput.readUTF();
        notificationNumber = objectInput.readUTF();
        processStatus = objectInput.readUTF();
        serviceCategory = objectInput.readUTF();
        reasonCode = objectInput.readUTF();
        nativeReasonCode = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (epayTransId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(epayTransId);
        }

        if (epayInstanceId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(epayInstanceId);
        }

        if (accountNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(accountNumber);
        }

        objectOutput.writeLong(serviceTypeId);
        objectOutput.writeLong(transAmount);

        if (transValue == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transValue);
        }

        objectOutput.writeLong(processDate);

        if (serviceNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceNumber);
        }

        if (idType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(idType);
        }

        if (recipientId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(recipientId);
        }

        if (recipientIdType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(recipientIdType);
        }

        if (notificationNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(notificationNumber);
        }

        if (processStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(processStatus);
        }

        if (serviceCategory == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceCategory);
        }

        if (reasonCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(reasonCode);
        }

        if (nativeReasonCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nativeReasonCode);
        }
    }
}
