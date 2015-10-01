package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.TransactionStatus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TransactionStatus in entity cache.
 *
 * @author ahmed_fadlus
 * @see TransactionStatus
 * @generated
 */
public class TransactionStatusCacheModel implements CacheModel<TransactionStatus>,
    Externalizable {
    public long id;
    public String description;
    public String descriptiveNameEn;
    public String descriptiveNameAr;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", description=");
        sb.append(description);
        sb.append(", descriptiveNameEn=");
        sb.append(descriptiveNameEn);
        sb.append(", descriptiveNameAr=");
        sb.append(descriptiveNameAr);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public TransactionStatus toEntityModel() {
        TransactionStatusImpl transactionStatusImpl = new TransactionStatusImpl();

        transactionStatusImpl.setId(id);

        if (description == null) {
            transactionStatusImpl.setDescription(StringPool.BLANK);
        } else {
            transactionStatusImpl.setDescription(description);
        }

        if (descriptiveNameEn == null) {
            transactionStatusImpl.setDescriptiveNameEn(StringPool.BLANK);
        } else {
            transactionStatusImpl.setDescriptiveNameEn(descriptiveNameEn);
        }

        if (descriptiveNameAr == null) {
            transactionStatusImpl.setDescriptiveNameAr(StringPool.BLANK);
        } else {
            transactionStatusImpl.setDescriptiveNameAr(descriptiveNameAr);
        }

        transactionStatusImpl.resetOriginalValues();

        return transactionStatusImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        description = objectInput.readUTF();
        descriptiveNameEn = objectInput.readUTF();
        descriptiveNameAr = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        if (descriptiveNameEn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptiveNameEn);
        }

        if (descriptiveNameAr == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptiveNameAr);
        }
    }
}
