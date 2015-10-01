package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.NotifConfig;
import com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil;

/**
 * The extended model base implementation for the NotifConfig service. Represents a row in the &quot;NOTIF_CONFIG_MGR&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NotifConfigImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifConfigImpl
 * @see com.stc.echannels.epayments.model.NotifConfig
 * @generated
 */
public abstract class NotifConfigBaseImpl extends NotifConfigModelImpl
    implements NotifConfig {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a notif config model instance should use the {@link NotifConfig} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NotifConfigLocalServiceUtil.addNotifConfig(this);
        } else {
            NotifConfigLocalServiceUtil.updateNotifConfig(this);
        }
    }
}
