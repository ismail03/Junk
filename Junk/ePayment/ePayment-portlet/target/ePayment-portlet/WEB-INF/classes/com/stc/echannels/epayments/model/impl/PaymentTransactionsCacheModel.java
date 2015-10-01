package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentTransactions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentTransactions in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentTransactions
 * @generated
 */
public class PaymentTransactionsCacheModel implements CacheModel<PaymentTransactions>,
    Externalizable {
    public String epayTransId;
    public long transAmount;
    public String transValue;
    public long transAmotChkDigit;
    public String processorReference;
    public long channelId;
    public String pmtBankId;
    public String pmtBranchId;
    public long transProcessDate;
    public String batchId;
    public long serviceId;
    public long appliedDate;
    public long appliedAmount;
    public String processStatus;
    public String notificationNumber;
    public String currencyCode;
    public String confirmationNumber;
    public long pmtRecievedDate;
    public String reasonCode;
    public long eventTypeId;
    public long pmtMethodId;
    public String pmtType;
    public String rpmId;
    public String nativeReasonCode;
    public long feeId;
    public String requestLocation;
    public String profileId;
    public String senderId;
    public String last4Digits;
    public String cardType;
    public long expiryDate;
    public String sourceTransType;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(65);

        sb.append("{epayTransId=");
        sb.append(epayTransId);
        sb.append(", transAmount=");
        sb.append(transAmount);
        sb.append(", transValue=");
        sb.append(transValue);
        sb.append(", transAmotChkDigit=");
        sb.append(transAmotChkDigit);
        sb.append(", processorReference=");
        sb.append(processorReference);
        sb.append(", channelId=");
        sb.append(channelId);
        sb.append(", pmtBankId=");
        sb.append(pmtBankId);
        sb.append(", pmtBranchId=");
        sb.append(pmtBranchId);
        sb.append(", transProcessDate=");
        sb.append(transProcessDate);
        sb.append(", batchId=");
        sb.append(batchId);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", appliedDate=");
        sb.append(appliedDate);
        sb.append(", appliedAmount=");
        sb.append(appliedAmount);
        sb.append(", processStatus=");
        sb.append(processStatus);
        sb.append(", notificationNumber=");
        sb.append(notificationNumber);
        sb.append(", currencyCode=");
        sb.append(currencyCode);
        sb.append(", confirmationNumber=");
        sb.append(confirmationNumber);
        sb.append(", pmtRecievedDate=");
        sb.append(pmtRecievedDate);
        sb.append(", reasonCode=");
        sb.append(reasonCode);
        sb.append(", eventTypeId=");
        sb.append(eventTypeId);
        sb.append(", pmtMethodId=");
        sb.append(pmtMethodId);
        sb.append(", pmtType=");
        sb.append(pmtType);
        sb.append(", rpmId=");
        sb.append(rpmId);
        sb.append(", nativeReasonCode=");
        sb.append(nativeReasonCode);
        sb.append(", feeId=");
        sb.append(feeId);
        sb.append(", requestLocation=");
        sb.append(requestLocation);
        sb.append(", profileId=");
        sb.append(profileId);
        sb.append(", senderId=");
        sb.append(senderId);
        sb.append(", last4Digits=");
        sb.append(last4Digits);
        sb.append(", cardType=");
        sb.append(cardType);
        sb.append(", expiryDate=");
        sb.append(expiryDate);
        sb.append(", sourceTransType=");
        sb.append(sourceTransType);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentTransactions toEntityModel() {
        PaymentTransactionsImpl paymentTransactionsImpl = new PaymentTransactionsImpl();

        if (epayTransId == null) {
            paymentTransactionsImpl.setEpayTransId(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setEpayTransId(epayTransId);
        }

        paymentTransactionsImpl.setTransAmount(transAmount);

        if (transValue == null) {
            paymentTransactionsImpl.setTransValue(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setTransValue(transValue);
        }

        paymentTransactionsImpl.setTransAmotChkDigit(transAmotChkDigit);

        if (processorReference == null) {
            paymentTransactionsImpl.setProcessorReference(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setProcessorReference(processorReference);
        }

        paymentTransactionsImpl.setChannelId(channelId);

        if (pmtBankId == null) {
            paymentTransactionsImpl.setPmtBankId(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setPmtBankId(pmtBankId);
        }

        if (pmtBranchId == null) {
            paymentTransactionsImpl.setPmtBranchId(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setPmtBranchId(pmtBranchId);
        }

        if (transProcessDate == Long.MIN_VALUE) {
            paymentTransactionsImpl.setTransProcessDate(null);
        } else {
            paymentTransactionsImpl.setTransProcessDate(new Date(
                    transProcessDate));
        }

        if (batchId == null) {
            paymentTransactionsImpl.setBatchId(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setBatchId(batchId);
        }

        paymentTransactionsImpl.setServiceId(serviceId);

        if (appliedDate == Long.MIN_VALUE) {
            paymentTransactionsImpl.setAppliedDate(null);
        } else {
            paymentTransactionsImpl.setAppliedDate(new Date(appliedDate));
        }

        paymentTransactionsImpl.setAppliedAmount(appliedAmount);

        if (processStatus == null) {
            paymentTransactionsImpl.setProcessStatus(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setProcessStatus(processStatus);
        }

        if (notificationNumber == null) {
            paymentTransactionsImpl.setNotificationNumber(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setNotificationNumber(notificationNumber);
        }

        if (currencyCode == null) {
            paymentTransactionsImpl.setCurrencyCode(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setCurrencyCode(currencyCode);
        }

        if (confirmationNumber == null) {
            paymentTransactionsImpl.setConfirmationNumber(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setConfirmationNumber(confirmationNumber);
        }

        if (pmtRecievedDate == Long.MIN_VALUE) {
            paymentTransactionsImpl.setPmtRecievedDate(null);
        } else {
            paymentTransactionsImpl.setPmtRecievedDate(new Date(pmtRecievedDate));
        }

        if (reasonCode == null) {
            paymentTransactionsImpl.setReasonCode(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setReasonCode(reasonCode);
        }

        paymentTransactionsImpl.setEventTypeId(eventTypeId);
        paymentTransactionsImpl.setPmtMethodId(pmtMethodId);

        if (pmtType == null) {
            paymentTransactionsImpl.setPmtType(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setPmtType(pmtType);
        }

        if (rpmId == null) {
            paymentTransactionsImpl.setRpmId(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setRpmId(rpmId);
        }

        if (nativeReasonCode == null) {
            paymentTransactionsImpl.setNativeReasonCode(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setNativeReasonCode(nativeReasonCode);
        }

        paymentTransactionsImpl.setFeeId(feeId);

        if (requestLocation == null) {
            paymentTransactionsImpl.setRequestLocation(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setRequestLocation(requestLocation);
        }

        if (profileId == null) {
            paymentTransactionsImpl.setProfileId(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setProfileId(profileId);
        }

        if (senderId == null) {
            paymentTransactionsImpl.setSenderId(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setSenderId(senderId);
        }

        if (last4Digits == null) {
            paymentTransactionsImpl.setLast4Digits(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setLast4Digits(last4Digits);
        }

        if (cardType == null) {
            paymentTransactionsImpl.setCardType(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setCardType(cardType);
        }

        if (expiryDate == Long.MIN_VALUE) {
            paymentTransactionsImpl.setExpiryDate(null);
        } else {
            paymentTransactionsImpl.setExpiryDate(new Date(expiryDate));
        }

        if (sourceTransType == null) {
            paymentTransactionsImpl.setSourceTransType(StringPool.BLANK);
        } else {
            paymentTransactionsImpl.setSourceTransType(sourceTransType);
        }

        paymentTransactionsImpl.resetOriginalValues();

        return paymentTransactionsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        epayTransId = objectInput.readUTF();
        transAmount = objectInput.readLong();
        transValue = objectInput.readUTF();
        transAmotChkDigit = objectInput.readLong();
        processorReference = objectInput.readUTF();
        channelId = objectInput.readLong();
        pmtBankId = objectInput.readUTF();
        pmtBranchId = objectInput.readUTF();
        transProcessDate = objectInput.readLong();
        batchId = objectInput.readUTF();
        serviceId = objectInput.readLong();
        appliedDate = objectInput.readLong();
        appliedAmount = objectInput.readLong();
        processStatus = objectInput.readUTF();
        notificationNumber = objectInput.readUTF();
        currencyCode = objectInput.readUTF();
        confirmationNumber = objectInput.readUTF();
        pmtRecievedDate = objectInput.readLong();
        reasonCode = objectInput.readUTF();
        eventTypeId = objectInput.readLong();
        pmtMethodId = objectInput.readLong();
        pmtType = objectInput.readUTF();
        rpmId = objectInput.readUTF();
        nativeReasonCode = objectInput.readUTF();
        feeId = objectInput.readLong();
        requestLocation = objectInput.readUTF();
        profileId = objectInput.readUTF();
        senderId = objectInput.readUTF();
        last4Digits = objectInput.readUTF();
        cardType = objectInput.readUTF();
        expiryDate = objectInput.readLong();
        sourceTransType = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (epayTransId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(epayTransId);
        }

        objectOutput.writeLong(transAmount);

        if (transValue == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transValue);
        }

        objectOutput.writeLong(transAmotChkDigit);

        if (processorReference == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(processorReference);
        }

        objectOutput.writeLong(channelId);

        if (pmtBankId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pmtBankId);
        }

        if (pmtBranchId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pmtBranchId);
        }

        objectOutput.writeLong(transProcessDate);

        if (batchId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(batchId);
        }

        objectOutput.writeLong(serviceId);
        objectOutput.writeLong(appliedDate);
        objectOutput.writeLong(appliedAmount);

        if (processStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(processStatus);
        }

        if (notificationNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(notificationNumber);
        }

        if (currencyCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(currencyCode);
        }

        if (confirmationNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(confirmationNumber);
        }

        objectOutput.writeLong(pmtRecievedDate);

        if (reasonCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(reasonCode);
        }

        objectOutput.writeLong(eventTypeId);
        objectOutput.writeLong(pmtMethodId);

        if (pmtType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pmtType);
        }

        if (rpmId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(rpmId);
        }

        if (nativeReasonCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nativeReasonCode);
        }

        objectOutput.writeLong(feeId);

        if (requestLocation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(requestLocation);
        }

        if (profileId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(profileId);
        }

        if (senderId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(senderId);
        }

        if (last4Digits == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(last4Digits);
        }

        if (cardType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cardType);
        }

        objectOutput.writeLong(expiryDate);

        if (sourceTransType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sourceTransType);
        }
    }
}
