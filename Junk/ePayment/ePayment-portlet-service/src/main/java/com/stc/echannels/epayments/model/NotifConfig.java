package com.stc.echannels.epayments.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the NotifConfig service. Represents a row in the &quot;NOTIF_CONFIG_MGR&quot; database table, with each column mapped to a property of this class.
 *
 * @author ahmed_fadlus
 * @see NotifConfigModel
 * @see com.stc.echannels.epayments.model.impl.NotifConfigImpl
 * @see com.stc.echannels.epayments.model.impl.NotifConfigModelImpl
 * @generated
 */
public interface NotifConfig extends NotifConfigModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.stc.echannels.epayments.model.impl.NotifConfigImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getEnMsgWithParams();

    public java.lang.String getArMsgWithParams();
}
