package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.PaymentRule;
import com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil;

/**
 * The extended model base implementation for the PaymentRule service. Represents a row in the &quot;PAYMENT_RULES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentRuleImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentRuleImpl
 * @see com.stc.echannels.epayments.model.PaymentRule
 * @generated
 */
public abstract class PaymentRuleBaseImpl extends PaymentRuleModelImpl
    implements PaymentRule {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a payment rule model instance should use the {@link PaymentRule} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentRuleLocalServiceUtil.addPaymentRule(this);
        } else {
            PaymentRuleLocalServiceUtil.updatePaymentRule(this);
        }
    }
}
