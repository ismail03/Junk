package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.SystemConfig;
import com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil;

/**
 * The extended model base implementation for the SystemConfig service. Represents a row in the &quot;SYSTEM_CONFIG_MGR&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SystemConfigImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SystemConfigImpl
 * @see com.stc.echannels.epayments.model.SystemConfig
 * @generated
 */
public abstract class SystemConfigBaseImpl extends SystemConfigModelImpl
    implements SystemConfig {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a system config model instance should use the {@link SystemConfig} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SystemConfigLocalServiceUtil.addSystemConfig(this);
        } else {
            SystemConfigLocalServiceUtil.updateSystemConfig(this);
        }
    }
}