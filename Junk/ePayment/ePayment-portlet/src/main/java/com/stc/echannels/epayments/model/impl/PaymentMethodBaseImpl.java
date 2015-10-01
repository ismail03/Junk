package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.PaymentMethod;
import com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil;

/**
 * The extended model base implementation for the PaymentMethod service. Represents a row in the &quot;PAYMENT_METHODS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentMethodImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentMethodImpl
 * @see com.stc.echannels.epayments.model.PaymentMethod
 * @generated
 */
public abstract class PaymentMethodBaseImpl extends PaymentMethodModelImpl
    implements PaymentMethod {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a payment method model instance should use the {@link PaymentMethod} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentMethodLocalServiceUtil.addPaymentMethod(this);
        } else {
            PaymentMethodLocalServiceUtil.updatePaymentMethod(this);
        }
    }
}