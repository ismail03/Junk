package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.RefundLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RefundLog in entity cache.
 *
 * @author ahmed_fadlus
 * @see RefundLog
 * @generated
 */
public class RefundLogCacheModel implements CacheModel<RefundLog>,
    Externalizable {
    public String refundId;
    public String epayTransId;
    public double amount;
    public long submissionDate;
    public long approvalDate;
    public String status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{refundId=");
        sb.append(refundId);
        sb.append(", epayTransId=");
        sb.append(epayTransId);
        sb.append(", amount=");
        sb.append(amount);
        sb.append(", submissionDate=");
        sb.append(submissionDate);
        sb.append(", approvalDate=");
        sb.append(approvalDate);
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RefundLog toEntityModel() {
        RefundLogImpl refundLogImpl = new RefundLogImpl();

        if (refundId == null) {
            refundLogImpl.setRefundId(StringPool.BLANK);
        } else {
            refundLogImpl.setRefundId(refundId);
        }

        if (epayTransId == null) {
            refundLogImpl.setEpayTransId(StringPool.BLANK);
        } else {
            refundLogImpl.setEpayTransId(epayTransId);
        }

        refundLogImpl.setAmount(amount);

        if (submissionDate == Long.MIN_VALUE) {
            refundLogImpl.setSubmissionDate(null);
        } else {
            refundLogImpl.setSubmissionDate(new Date(submissionDate));
        }

        if (approvalDate == Long.MIN_VALUE) {
            refundLogImpl.setApprovalDate(null);
        } else {
            refundLogImpl.setApprovalDate(new Date(approvalDate));
        }

        if (status == null) {
            refundLogImpl.setStatus(StringPool.BLANK);
        } else {
            refundLogImpl.setStatus(status);
        }

        refundLogImpl.resetOriginalValues();

        return refundLogImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        refundId = objectInput.readUTF();
        epayTransId = objectInput.readUTF();
        amount = objectInput.readDouble();
        submissionDate = objectInput.readLong();
        approvalDate = objectInput.readLong();
        status = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (refundId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(refundId);
        }

        if (epayTransId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(epayTransId);
        }

        objectOutput.writeDouble(amount);
        objectOutput.writeLong(submissionDate);
        objectOutput.writeLong(approvalDate);

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }
    }
}
