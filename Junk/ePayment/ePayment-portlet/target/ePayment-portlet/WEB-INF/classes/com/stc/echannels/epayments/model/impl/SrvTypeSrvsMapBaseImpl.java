package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.SrvTypeSrvsMap;
import com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalServiceUtil;

/**
 * The extended model base implementation for the SrvTypeSrvsMap service. Represents a row in the &quot;SERVICE_TYPE_SERVICES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SrvTypeSrvsMapImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMapImpl
 * @see com.stc.echannels.epayments.model.SrvTypeSrvsMap
 * @generated
 */
public abstract class SrvTypeSrvsMapBaseImpl extends SrvTypeSrvsMapModelImpl
    implements SrvTypeSrvsMap {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a srv type srvs map model instance should use the {@link SrvTypeSrvsMap} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SrvTypeSrvsMapLocalServiceUtil.addSrvTypeSrvsMap(this);
        } else {
            SrvTypeSrvsMapLocalServiceUtil.updateSrvTypeSrvsMap(this);
        }
    }
}
