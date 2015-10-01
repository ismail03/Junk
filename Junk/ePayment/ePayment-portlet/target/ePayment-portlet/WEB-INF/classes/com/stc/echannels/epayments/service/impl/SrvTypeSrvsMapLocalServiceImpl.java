package com.stc.echannels.epayments.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.stc.echannels.epayments.model.SrvTypeSrvsMap;
import com.stc.echannels.epayments.service.base.SrvTypeSrvsMapLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.SrvTypeSrvsMapUtil;

import java.util.List;

/**
 * The implementation of the srv type srvs map local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.SrvTypeSrvsMapLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalServiceUtil
 */
public class SrvTypeSrvsMapLocalServiceImpl
    extends SrvTypeSrvsMapLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalServiceUtil} to access the srv type srvs map local service.
     */
	
List<SrvTypeSrvsMap> findPaymentChannelSrvsMapByServiceId(long serviceId) throws SystemException{
		
		return SrvTypeSrvsMapUtil.findByServiceId(serviceId);
	}
}
