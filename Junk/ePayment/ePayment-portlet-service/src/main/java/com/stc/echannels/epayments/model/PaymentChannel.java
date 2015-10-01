package com.stc.echannels.epayments.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the PaymentChannel service. Represents a row in the &quot;PAYMENT_CHANNELS&quot; database table, with each column mapped to a property of this class.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelModel
 * @see com.stc.echannels.epayments.model.impl.PaymentChannelImpl
 * @see com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl
 * @generated
 */
public interface PaymentChannel extends PaymentChannelModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.stc.echannels.epayments.model.impl.PaymentChannelImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isPaymentTransactionRecorded();

    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded);

    public java.lang.String getName(java.util.Locale locale);
}
