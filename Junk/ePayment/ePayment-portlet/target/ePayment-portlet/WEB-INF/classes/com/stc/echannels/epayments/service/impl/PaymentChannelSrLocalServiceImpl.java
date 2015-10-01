package com.stc.echannels.epayments.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.PaymentChannelSr;
import com.stc.echannels.epayments.service.base.PaymentChannelSrLocalServiceBaseImpl;

/**
 * The implementation of the payment channel sr local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.PaymentChannelSrLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentChannelSrLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.PaymentChannelSrLocalServiceUtil
 */
public class PaymentChannelSrLocalServiceImpl
    extends PaymentChannelSrLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.PaymentChannelSrLocalServiceUtil} to access the payment channel sr local service.
     */
	
	public List<PaymentChannelSr> getPaymentChannelsAssociatedWithBuisnessServices(String servceid) throws SystemException
	{
		
		return paymentChannelSrPersistence.findByserviceid(GetterUtil.getLong(servceid));
	}
	
	public List<PaymentChannelSr> getBusinessServiceAssociatedWithPmtChannel(String channelid) throws SystemException{
		
		return paymentChannelSrPersistence.findBychannelid(GetterUtil.getLong(channelid));
		
	}
}
