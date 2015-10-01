package com.stc.echannels.epayments.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.stc.echannels.epayments.model.PaymentChannelSrvsMap;
import com.stc.echannels.epayments.service.base.PaymentChannelSrvsMapLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.PaymentChannelSrvsMapUtil;

import java.util.List;

/**
 * The implementation of the payment channel srvs map local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.PaymentChannelSrvsMapLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentChannelSrvsMapLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.PaymentChannelSrvsMapLocalServiceUtil
 */
public class PaymentChannelSrvsMapLocalServiceImpl
    extends PaymentChannelSrvsMapLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.PaymentChannelSrvsMapLocalServiceUtil} to access the payment channel srvs map local service.
     */
	
	List<PaymentChannelSrvsMap> findPaymentChannelSrvsMapByServiceId(long serviceId) throws SystemException{
		
		return PaymentChannelSrvsMapUtil.findByServiceId(serviceId);
	}
}
