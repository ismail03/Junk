package com.stc.echannels.epayments.service.impl;

import com.liferay.portal.kernel.dao.orm.Query;
import com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel;
import com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel;
import com.stc.echannels.epayments.service.base.PaymentTransactionsLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.PaymentTransactionsFinderUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the payment transactions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.PaymentTransactionsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentTransactionsLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.PaymentTransactionsLocalServiceUtil
 */
public class PaymentTransactionsLocalServiceImpl
    extends PaymentTransactionsLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.PaymentTransactionsLocalServiceUtil} to access the payment transactions local service.
     */
	
	public List<PaymentTransactionsCustomModel> findCustomPaymentTransactions(PaymentTransactionsCustomModel paymentTransactionsCustomModel){
		return PaymentTransactionsFinderUtil.findCustomPaymentTransactions(paymentTransactionsCustomModel, -1, -1);
	}
	
	public List<RefundTransactionsCustomModel> findCustomRefundTransactions(RefundTransactionsCustomModel refundTransactionsCustomModel){
		return PaymentTransactionsFinderUtil.findCustomRefundTransactions(refundTransactionsCustomModel, -1, -1);
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getPaymentStatuses() {
		String sql = "SELECT  distinct ptd.processStatus FROM   PaymentTransactionDetails ptd";
		try {
			
			Query query = paymentTransactionsPersistence.getCurrentSession().createQuery(sql);
			
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<String>();
	}
}
