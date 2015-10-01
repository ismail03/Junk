package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;


public class PaymentTransactionDetailsPK implements Comparable<PaymentTransactionDetailsPK>,
    Serializable {
    public String epayTransId;
    public String epayInstanceId;

    public PaymentTransactionDetailsPK() {
    }

    public PaymentTransactionDetailsPK(String epayTransId, String epayInstanceId) {
        this.epayTransId = epayTransId;
        this.epayInstanceId = epayInstanceId;
    }

    public String getEpayTransId() {
        return epayTransId;
    }

    public void setEpayTransId(String epayTransId) {
        this.epayTransId = epayTransId;
    }

    public String getEpayInstanceId() {
        return epayInstanceId;
    }

    public void setEpayInstanceId(String epayInstanceId) {
        this.epayInstanceId = epayInstanceId;
    }

    @Override
    public int compareTo(PaymentTransactionDetailsPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        value = epayTransId.compareTo(pk.epayTransId);

        if (value != 0) {
            return value;
        }

        value = epayInstanceId.compareTo(pk.epayInstanceId);

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentTransactionDetailsPK)) {
            return false;
        }

        PaymentTransactionDetailsPK pk = (PaymentTransactionDetailsPK) obj;

        if ((epayTransId.equals(pk.epayTransId)) &&
                (epayInstanceId.equals(pk.epayInstanceId))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(epayTransId) + String.valueOf(epayInstanceId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("epayTransId");
        sb.append(StringPool.EQUAL);
        sb.append(epayTransId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("epayInstanceId");
        sb.append(StringPool.EQUAL);
        sb.append(epayInstanceId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
