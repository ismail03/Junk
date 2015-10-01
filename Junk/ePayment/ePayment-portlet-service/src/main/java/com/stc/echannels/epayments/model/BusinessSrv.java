package com.stc.echannels.epayments.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the BusinessSrv service. Represents a row in the &quot;SERVICES&quot; database table, with each column mapped to a property of this class.
 *
 * @author ahmed_fadlus
 * @see BusinessSrvModel
 * @see com.stc.echannels.epayments.model.impl.BusinessSrvImpl
 * @see com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl
 * @generated
 */
public interface BusinessSrv extends BusinessSrvModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.stc.echannels.epayments.model.impl.BusinessSrvImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getName(java.util.Locale locale);

    public boolean isEpayAccessControlPresent();

    public void setEpayAccessControlPresent(boolean isEpayAccessControlPresent);
}
