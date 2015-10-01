package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.ReconLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ReconLog in entity cache.
 *
 * @author ahmed_fadlus
 * @see ReconLog
 * @generated
 */
public class ReconLogCacheModel implements CacheModel<ReconLog>, Externalizable {
    public String paymentSystemTransId;
    public long bankTransId;
    public double transAmount;
    public String paymentMethod;
    public String paymentChannel;
    public String pmtBankId;
    public long bankTransDate;
    public String beneficiaryServiceNo;
    public long serviceId;
    public String paymentStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{paymentSystemTransId=");
        sb.append(paymentSystemTransId);
        sb.append(", bankTransId=");
        sb.append(bankTransId);
        sb.append(", transAmount=");
        sb.append(transAmount);
        sb.append(", paymentMethod=");
        sb.append(paymentMethod);
        sb.append(", paymentChannel=");
        sb.append(paymentChannel);
        sb.append(", pmtBankId=");
        sb.append(pmtBankId);
        sb.append(", bankTransDate=");
        sb.append(bankTransDate);
        sb.append(", beneficiaryServiceNo=");
        sb.append(beneficiaryServiceNo);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", paymentStatus=");
        sb.append(paymentStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ReconLog toEntityModel() {
        ReconLogImpl reconLogImpl = new ReconLogImpl();

        if (paymentSystemTransId == null) {
            reconLogImpl.setPaymentSystemTransId(StringPool.BLANK);
        } else {
            reconLogImpl.setPaymentSystemTransId(paymentSystemTransId);
        }

        reconLogImpl.setBankTransId(bankTransId);
        reconLogImpl.setTransAmount(transAmount);

        if (paymentMethod == null) {
            reconLogImpl.setPaymentMethod(StringPool.BLANK);
        } else {
            reconLogImpl.setPaymentMethod(paymentMethod);
        }

        if (paymentChannel == null) {
            reconLogImpl.setPaymentChannel(StringPool.BLANK);
        } else {
            reconLogImpl.setPaymentChannel(paymentChannel);
        }

        if (pmtBankId == null) {
            reconLogImpl.setPmtBankId(StringPool.BLANK);
        } else {
            reconLogImpl.setPmtBankId(pmtBankId);
        }

        if (bankTransDate == Long.MIN_VALUE) {
            reconLogImpl.setBankTransDate(null);
        } else {
            reconLogImpl.setBankTransDate(new Date(bankTransDate));
        }

        if (beneficiaryServiceNo == null) {
            reconLogImpl.setBeneficiaryServiceNo(StringPool.BLANK);
        } else {
            reconLogImpl.setBeneficiaryServiceNo(beneficiaryServiceNo);
        }

        reconLogImpl.setServiceId(serviceId);

        if (paymentStatus == null) {
            reconLogImpl.setPaymentStatus(StringPool.BLANK);
        } else {
            reconLogImpl.setPaymentStatus(paymentStatus);
        }

        reconLogImpl.resetOriginalValues();

        return reconLogImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        paymentSystemTransId = objectInput.readUTF();
        bankTransId = objectInput.readLong();
        transAmount = objectInput.readDouble();
        paymentMethod = objectInput.readUTF();
        paymentChannel = objectInput.readUTF();
        pmtBankId = objectInput.readUTF();
        bankTransDate = objectInput.readLong();
        beneficiaryServiceNo = objectInput.readUTF();
        serviceId = objectInput.readLong();
        paymentStatus = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (paymentSystemTransId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(paymentSystemTransId);
        }

        objectOutput.writeLong(bankTransId);
        objectOutput.writeDouble(transAmount);

        if (paymentMethod == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(paymentMethod);
        }

        if (paymentChannel == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(paymentChannel);
        }

        if (pmtBankId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pmtBankId);
        }

        objectOutput.writeLong(bankTransDate);

        if (beneficiaryServiceNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(beneficiaryServiceNo);
        }

        objectOutput.writeLong(serviceId);

        if (paymentStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(paymentStatus);
        }
    }
}
