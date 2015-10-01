package com.stc.echannels.epayments.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.stc.echannels.epayments.model.PaymentMethodSrvsMap;
import com.stc.echannels.epayments.service.base.PaymentMethodSrvsMapLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.PaymentMethodSrvsMapUtil;

import java.util.List;

/**
 * The implementation of the payment method srvs map local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.PaymentMethodSrvsMapLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentMethodSrvsMapLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.PaymentMethodSrvsMapLocalServiceUtil
 */
public class PaymentMethodSrvsMapLocalServiceImpl
    extends PaymentMethodSrvsMapLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.PaymentMethodSrvsMapLocalServiceUtil} to access the payment method srvs map local service.
     */
	
List<PaymentMethodSrvsMap> findPaymentChannelSrvsMapByServiceId(long serviceId) throws SystemException{
		
		return PaymentMethodSrvsMapUtil.findByServiceId(serviceId);
	}
}
