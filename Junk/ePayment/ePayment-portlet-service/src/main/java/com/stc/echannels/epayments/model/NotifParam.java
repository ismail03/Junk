package com.stc.echannels.epayments.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the NotifParam service. Represents a row in the &quot;NOTIF_PARAMS&quot; database table, with each column mapped to a property of this class.
 *
 * @author ahmed_fadlus
 * @see NotifParamModel
 * @see com.stc.echannels.epayments.model.impl.NotifParamImpl
 * @see com.stc.echannels.epayments.model.impl.NotifParamModelImpl
 * @generated
 */
public interface NotifParam extends NotifParamModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.stc.echannels.epayments.model.impl.NotifParamImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getName(java.util.Locale locale);
}
