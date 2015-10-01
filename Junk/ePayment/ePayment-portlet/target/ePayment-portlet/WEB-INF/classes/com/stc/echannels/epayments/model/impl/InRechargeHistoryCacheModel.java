package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.InRechargeHistory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing InRechargeHistory in entity cache.
 *
 * @author ahmed_fadlus
 * @see InRechargeHistory
 * @generated
 */
public class InRechargeHistoryCacheModel implements CacheModel<InRechargeHistory>,
    Externalizable {
    public String msisdn;
    public String transactionId;
    public String cardGroup;
    public String serviceClass;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{msisdn=");
        sb.append(msisdn);
        sb.append(", transactionId=");
        sb.append(transactionId);
        sb.append(", cardGroup=");
        sb.append(cardGroup);
        sb.append(", serviceClass=");
        sb.append(serviceClass);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public InRechargeHistory toEntityModel() {
        InRechargeHistoryImpl inRechargeHistoryImpl = new InRechargeHistoryImpl();

        if (msisdn == null) {
            inRechargeHistoryImpl.setMsisdn(StringPool.BLANK);
        } else {
            inRechargeHistoryImpl.setMsisdn(msisdn);
        }

        if (transactionId == null) {
            inRechargeHistoryImpl.setTransactionId(StringPool.BLANK);
        } else {
            inRechargeHistoryImpl.setTransactionId(transactionId);
        }

        if (cardGroup == null) {
            inRechargeHistoryImpl.setCardGroup(StringPool.BLANK);
        } else {
            inRechargeHistoryImpl.setCardGroup(cardGroup);
        }

        if (serviceClass == null) {
            inRechargeHistoryImpl.setServiceClass(StringPool.BLANK);
        } else {
            inRechargeHistoryImpl.setServiceClass(serviceClass);
        }

        inRechargeHistoryImpl.resetOriginalValues();

        return inRechargeHistoryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        msisdn = objectInput.readUTF();
        transactionId = objectInput.readUTF();
        cardGroup = objectInput.readUTF();
        serviceClass = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (msisdn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(msisdn);
        }

        if (transactionId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transactionId);
        }

        if (cardGroup == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cardGroup);
        }

        if (serviceClass == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceClass);
        }
    }
}
