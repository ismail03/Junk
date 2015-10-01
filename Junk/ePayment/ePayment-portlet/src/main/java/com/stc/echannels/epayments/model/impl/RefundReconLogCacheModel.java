package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.RefundReconLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RefundReconLog in entity cache.
 *
 * @author ahmed_fadlus
 * @see RefundReconLog
 * @generated
 */
public class RefundReconLogCacheModel implements CacheModel<RefundReconLog>,
    Externalizable {
    public String batchId;
    public long serviceId;
    public String refundId;
    public String pmtBankId;
    public String pmtSystemRefundTransId;
    public String bankRefundTransId;
    public long effDt;
    public long processDate;
    public double refundAmount;
    public String refundStatusCode;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{batchId=");
        sb.append(batchId);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", refundId=");
        sb.append(refundId);
        sb.append(", pmtBankId=");
        sb.append(pmtBankId);
        sb.append(", pmtSystemRefundTransId=");
        sb.append(pmtSystemRefundTransId);
        sb.append(", bankRefundTransId=");
        sb.append(bankRefundTransId);
        sb.append(", effDt=");
        sb.append(effDt);
        sb.append(", processDate=");
        sb.append(processDate);
        sb.append(", refundAmount=");
        sb.append(refundAmount);
        sb.append(", refundStatusCode=");
        sb.append(refundStatusCode);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RefundReconLog toEntityModel() {
        RefundReconLogImpl refundReconLogImpl = new RefundReconLogImpl();

        if (batchId == null) {
            refundReconLogImpl.setBatchId(StringPool.BLANK);
        } else {
            refundReconLogImpl.setBatchId(batchId);
        }

        refundReconLogImpl.setServiceId(serviceId);

        if (refundId == null) {
            refundReconLogImpl.setRefundId(StringPool.BLANK);
        } else {
            refundReconLogImpl.setRefundId(refundId);
        }

        if (pmtBankId == null) {
            refundReconLogImpl.setPmtBankId(StringPool.BLANK);
        } else {
            refundReconLogImpl.setPmtBankId(pmtBankId);
        }

        if (pmtSystemRefundTransId == null) {
            refundReconLogImpl.setPmtSystemRefundTransId(StringPool.BLANK);
        } else {
            refundReconLogImpl.setPmtSystemRefundTransId(pmtSystemRefundTransId);
        }

        if (bankRefundTransId == null) {
            refundReconLogImpl.setBankRefundTransId(StringPool.BLANK);
        } else {
            refundReconLogImpl.setBankRefundTransId(bankRefundTransId);
        }

        if (effDt == Long.MIN_VALUE) {
            refundReconLogImpl.setEffDt(null);
        } else {
            refundReconLogImpl.setEffDt(new Date(effDt));
        }

        if (processDate == Long.MIN_VALUE) {
            refundReconLogImpl.setProcessDate(null);
        } else {
            refundReconLogImpl.setProcessDate(new Date(processDate));
        }

        refundReconLogImpl.setRefundAmount(refundAmount);

        if (refundStatusCode == null) {
            refundReconLogImpl.setRefundStatusCode(StringPool.BLANK);
        } else {
            refundReconLogImpl.setRefundStatusCode(refundStatusCode);
        }

        refundReconLogImpl.resetOriginalValues();

        return refundReconLogImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        batchId = objectInput.readUTF();
        serviceId = objectInput.readLong();
        refundId = objectInput.readUTF();
        pmtBankId = objectInput.readUTF();
        pmtSystemRefundTransId = objectInput.readUTF();
        bankRefundTransId = objectInput.readUTF();
        effDt = objectInput.readLong();
        processDate = objectInput.readLong();
        refundAmount = objectInput.readDouble();
        refundStatusCode = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (batchId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(batchId);
        }

        objectOutput.writeLong(serviceId);

        if (refundId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(refundId);
        }

        if (pmtBankId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pmtBankId);
        }

        if (pmtSystemRefundTransId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pmtSystemRefundTransId);
        }

        if (bankRefundTransId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankRefundTransId);
        }

        objectOutput.writeLong(effDt);
        objectOutput.writeLong(processDate);
        objectOutput.writeDouble(refundAmount);

        if (refundStatusCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(refundStatusCode);
        }
    }
}
