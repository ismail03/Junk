package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.PaymentChannelSr;
import com.stc.echannels.epayments.service.PaymentChannelSrLocalServiceUtil;

/**
 * The extended model base implementation for the PaymentChannelSr service. Represents a row in the &quot;PAYMENT_CHANNEL_SERVICES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentChannelSrImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrImpl
 * @see com.stc.echannels.epayments.model.PaymentChannelSr
 * @generated
 */
public abstract class PaymentChannelSrBaseImpl extends PaymentChannelSrModelImpl
    implements PaymentChannelSr {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a payment channel sr model instance should use the {@link PaymentChannelSr} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentChannelSrLocalServiceUtil.addPaymentChannelSr(this);
        } else {
            PaymentChannelSrLocalServiceUtil.updatePaymentChannelSr(this);
        }
    }
}
