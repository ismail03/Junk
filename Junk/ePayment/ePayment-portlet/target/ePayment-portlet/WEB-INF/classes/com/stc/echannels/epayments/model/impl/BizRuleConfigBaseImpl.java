package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil;

/**
 * The extended model base implementation for the BizRuleConfig service. Represents a row in the &quot;BIZ_RULE_CONFIG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BizRuleConfigImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BizRuleConfigImpl
 * @see com.stc.echannels.epayments.model.BizRuleConfig
 * @generated
 */
public abstract class BizRuleConfigBaseImpl extends BizRuleConfigModelImpl
    implements BizRuleConfig {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a biz rule config model instance should use the {@link BizRuleConfig} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BizRuleConfigLocalServiceUtil.addBizRuleConfig(this);
        } else {
            BizRuleConfigLocalServiceUtil.updateBizRuleConfig(this);
        }
    }
}
