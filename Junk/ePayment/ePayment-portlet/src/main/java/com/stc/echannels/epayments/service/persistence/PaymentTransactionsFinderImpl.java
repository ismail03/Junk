package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel;
import com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel;
import com.stc.echannels.epayments.model.PaymentTransactions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentTransactionsFinderImpl extends BasePersistenceImpl<PaymentTransactions> implements PaymentTransactionsFinder{
	
	
	public List<PaymentTransactionsCustomModel> findCustomPaymentTransactions(PaymentTransactionsCustomModel searchPaymentTransactionsCustomModel,int start, int end) {


		List<PaymentTransactionsCustomModel> paymentTransactionsList = new ArrayList<PaymentTransactionsCustomModel>();
		SQLQuery q = fetchQueryForPaymentTransactions(searchPaymentTransactionsCustomModel);

		@SuppressWarnings("unchecked")
		List<Object[]> resultRecords = (List<Object[]>) QueryUtil.list(q, getDialect(), start, end);
		for (Object[] resultRecord : resultRecords) {

			PaymentTransactionsCustomModel paymentTransactionsCustomModel = new PaymentTransactionsCustomModel();
			paymentTransactionsCustomModel.setEpayTransId((String) resultRecord[0]);
			paymentTransactionsCustomModel.setAccountNumber((String) resultRecord[1]);
			paymentTransactionsCustomModel.setServiceTypeNameEn((String) resultRecord[2]);
			paymentTransactionsCustomModel.setTransAmount((Long) resultRecord[3]);
			paymentTransactionsCustomModel.setPaymentMethodNameEn((String) resultRecord[4]);
			paymentTransactionsCustomModel.setPaymentChannelNameEn((String) resultRecord[5]);
			paymentTransactionsCustomModel.setBankNameEn((String)resultRecord[6] );
			paymentTransactionsCustomModel.setTransDate((Date)resultRecord[7] );
			paymentTransactionsCustomModel.setProcessDate((Date)resultRecord[8] );
			paymentTransactionsCustomModel.setPaymentStatus((String) resultRecord[9]);
			paymentTransactionsCustomModel.setReason((String) resultRecord[10]);
			paymentTransactionsCustomModel.setBeneficiaryId((String) resultRecord[11]);
			paymentTransactionsCustomModel.setBeneficiaryServiceNumber((String)resultRecord[12] );
			paymentTransactionsCustomModel.setBusinessService((String)resultRecord[13] );
			paymentTransactionsList.add(paymentTransactionsCustomModel); 
		}
 
		return paymentTransactionsList;
		}

	public List<RefundTransactionsCustomModel> findCustomRefundTransactions(RefundTransactionsCustomModel searchRefundTransactionsCustomModel,int start, int end) {


		List<RefundTransactionsCustomModel> refundTransactionsList = new ArrayList<RefundTransactionsCustomModel>();
		SQLQuery q = 	fetchQueryForRefundTransactions( searchRefundTransactionsCustomModel);

		@SuppressWarnings("unchecked")
		List<Object[]> resultRecords = (List<Object[]>) QueryUtil.list(q, getDialect(), start, end);
		for (Object[] resultRecord : resultRecords) {

			RefundTransactionsCustomModel refundTransactionsCustomModel = new RefundTransactionsCustomModel();
			refundTransactionsCustomModel.setEpayTransId((String) resultRecord[0]);
			refundTransactionsCustomModel.setBankNameEn((String)resultRecord[1] );
			refundTransactionsCustomModel.setPaymentMethodNameEn((String) resultRecord[2]);
			refundTransactionsCustomModel.setPaymentChannelNameEn((String) resultRecord[3]);
			refundTransactionsCustomModel.setAccountNumber((String) resultRecord[4]);
			refundTransactionsCustomModel.setBeneficiaryId((String) resultRecord[5]);
			refundTransactionsCustomModel.setBeneficiaryServiceNumber((String)resultRecord[6] );			
			refundTransactionsCustomModel.setServiceTypeNameEn((String) resultRecord[7]);			
			refundTransactionsCustomModel.setTransAmount((Long) resultRecord[8]);		
			refundTransactionsCustomModel.setProcessDate((Date)resultRecord[9] );
			refundTransactionsCustomModel.setPaymentStatus((String) resultRecord[10]);			
			refundTransactionsCustomModel.setRefundStatus((String) resultRecord[11]);			
			refundTransactionsCustomModel.setRefundId((String) resultRecord[12]);			
			refundTransactionsCustomModel.setRefundAmount((Long) (resultRecord[13] !=null ? resultRecord[13] :0l) );
			refundTransactionsCustomModel.setRefundSubmissionDate((Date)resultRecord[14] );	
			refundTransactionsCustomModel.setRefundApprovalDate((Date)resultRecord[15] );
			
			refundTransactionsList.add(refundTransactionsCustomModel); 
				
		}
 
		return refundTransactionsList;
		}

	private SQLQuery  fetchQueryForRefundTransactions(RefundTransactionsCustomModel searchRefundTransactionsCustomModel){
		Session session = getCurrentSession();

		
		String sql = CustomSQLUtil.get(FIND_CUSTOM_REFUND_TRANSACTIONS);
		StringBuilder sb= new StringBuilder("");
		if( ! searchRefundTransactionsCustomModel.getBusinessService().isEmpty()){
			sb.append(" AND S.SERVICE_NAME_EN LIKE '%"+ searchRefundTransactionsCustomModel.getBusinessService() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getServiceTypeNameEn().isEmpty()){
			sb.append(" AND ST.SERVICE_NAME_EN LIKE '%"+ searchRefundTransactionsCustomModel.getServiceTypeNameEn() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getPaymentChannelNameEn().isEmpty()){
			sb.append(" AND PC.DESCRIPTIVE_NAME_EN LIKE '%"+ searchRefundTransactionsCustomModel.getPaymentChannelNameEn() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getPaymentMethodNameEn().isEmpty()){
			sb.append(" AND PM.DESCRIPTIVE_NAME_EN LIKE '%"+ searchRefundTransactionsCustomModel.getPaymentMethodNameEn() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getBankNameEn().isEmpty()){
			sb.append(" AND BCM.BANK_NAME_EN LIKE  '%"+ searchRefundTransactionsCustomModel.getBankNameEn() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getRefundStatus().isEmpty()){
			sb.append(" AND RL.STATUS LIKE '%"+ searchRefundTransactionsCustomModel.getRefundStatus() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getBeneficiaryServiceNumber().isEmpty()){
			sb.append(" AND PTD.SERVICE_NUMBER LIKE '%"+ searchRefundTransactionsCustomModel.getBeneficiaryServiceNumber() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getBeneficiaryId().isEmpty()){
			sb.append(" AND PTD.RECIPIENT_ID LIKE '%"+ searchRefundTransactionsCustomModel.getBeneficiaryId() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getEpayTransId().isEmpty()){
			sb.append(" AND PTD.EPAY_TRANS_ID LIKE '%"+ searchRefundTransactionsCustomModel.getEpayTransId() +"%' ");
		}
		if(  searchRefundTransactionsCustomModel.getTransAmount()!=0){
			sb.append(" AND PTD.TRANS_AMOUNT LIKE '%"+ searchRefundTransactionsCustomModel.getTransAmount() +"%' ");
		}
		if( ! searchRefundTransactionsCustomModel.getAccountNumber().isEmpty()){
			sb.append(" AND PTD.ACCOUNT_NUMBER LIKE '%" + searchRefundTransactionsCustomModel.getAccountNumber() + "%'");
		}
		
		SQLQuery q = session.createSQLQuery(sql+sb.toString());
		
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		String fromDate = df.format(searchRefundTransactionsCustomModel.getFromDate());
		String toDate = df.format(searchRefundTransactionsCustomModel.getTodate());
		q.setString(0, fromDate) ;
		q.setString(1,  toDate);
		
		q.addScalar("epayTransId", Type.STRING);
		q.addScalar("bankNameEn", Type.STRING);
		q.addScalar("paymentMethodNameEn", Type.STRING);
		q.addScalar("paymentChannelNameEn", Type.STRING);
		q.addScalar("accountNumber", Type.STRING);
		q.addScalar("beneficiaryId", Type.STRING);
		q.addScalar("beneficiaryServiceNumber", Type.STRING);
		q.addScalar("serviceTypeNameEn", Type.STRING);
		q.addScalar("transAmount", Type.LONG);
		q.addScalar("processDate", Type.DATE);
		q.addScalar("paymentStatus", Type.STRING);		
		q.addScalar("refundStatus", Type.STRING);
		q.addScalar("refundId", Type.STRING);
		q.addScalar("refundAmount", Type.LONG);
		q.addScalar("refundSubmissionDate", Type.DATE);
		q.addScalar("refundApprovalDate", Type.DATE);
		

		
		return q;
	}
	
	private SQLQuery  fetchQueryForPaymentTransactions(PaymentTransactionsCustomModel searchPaymentTransactionsCustomModel){
		Session session = getCurrentSession();

		
		String sql = CustomSQLUtil.get(FIND_CUSTOM_PAYMENT_TRANSACTIONS);
		
		StringBuilder sb= new StringBuilder("");
		if( ! searchPaymentTransactionsCustomModel.getBusinessService().isEmpty()){
			sb.append(" AND S.SERVICE_NAME_EN LIKE '%"+ searchPaymentTransactionsCustomModel.getBusinessService() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getServiceTypeNameEn().isEmpty()){
			sb.append(" AND ST.SERVICE_NAME_EN LIKE '%"+ searchPaymentTransactionsCustomModel.getServiceTypeNameEn() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getPaymentChannelNameEn().isEmpty()){
			sb.append(" AND PC.DESCRIPTIVE_NAME_EN LIKE '%"+ searchPaymentTransactionsCustomModel.getPaymentChannelNameEn() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getPaymentMethodNameEn().isEmpty()){
			sb.append(" AND PM.DESCRIPTIVE_NAME_EN LIKE '%"+ searchPaymentTransactionsCustomModel.getPaymentMethodNameEn() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getBankNameEn().isEmpty()){
			sb.append(" AND BCM.BANK_NAME_EN LIKE  '%"+ searchPaymentTransactionsCustomModel.getBankNameEn() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getPaymentStatus().isEmpty()){
			sb.append(" AND PTD.PROCESS_STATUS LIKE '%"+ searchPaymentTransactionsCustomModel.getPaymentStatus() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getBeneficiaryServiceNumber().isEmpty()){
			sb.append(" AND PTD.SERVICE_NUMBER LIKE '%"+ searchPaymentTransactionsCustomModel.getBeneficiaryServiceNumber() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getBeneficiaryId().isEmpty()){
			sb.append(" AND PTD.RECIPIENT_ID LIKE '%"+ searchPaymentTransactionsCustomModel.getBeneficiaryId() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getEpayTransId().isEmpty()){
			sb.append(" AND PTD.EPAY_TRANS_ID LIKE '%"+ searchPaymentTransactionsCustomModel.getEpayTransId() +"%' ");
		}
		if(  searchPaymentTransactionsCustomModel.getTransAmount()!=0){
			sb.append(" AND PTD.TRANS_AMOUNT LIKE '%"+ searchPaymentTransactionsCustomModel.getTransAmount() +"%' ");
		}
		if( ! searchPaymentTransactionsCustomModel.getAccountNumber().isEmpty()){
			sb.append(" AND PTD.ACCOUNT_NUMBER LIKE '%" + searchPaymentTransactionsCustomModel.getAccountNumber() + "%'");
		}
		
		SQLQuery q = session.createSQLQuery(sql+sb.toString());
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		String fromDate = df.format(searchPaymentTransactionsCustomModel.getFromDate());
		String toDate = df.format(searchPaymentTransactionsCustomModel.getTodate());
		q.setString(0, fromDate) ;
		q.setString(1,  toDate);
		
		q.addScalar("epayTransId", Type.STRING);
		q.addScalar("accountNumber", Type.STRING);
		q.addScalar("serviceTypeNameEn", Type.STRING);
		q.addScalar("transAmount", Type.LONG);
		q.addScalar("paymentMethodNameEn", Type.STRING);
		q.addScalar("paymentChannelNameEn", Type.STRING);
		q.addScalar("bankNameEn", Type.STRING);
		q.addScalar("transDate", Type.DATE);
		q.addScalar("processDate", Type.DATE);
		q.addScalar("paymentStatus", Type.STRING);
		q.addScalar("reason", Type.STRING);
		q.addScalar("beneficiaryId", Type.STRING);
		q.addScalar("beneficiaryServiceNumber", Type.STRING);
		q.addScalar("businessService", Type.STRING);
		
		return q;
	}

	public static final String FIND_CUSTOM_PAYMENT_TRANSACTIONS =
			PaymentTransactionsFinder.class.getName() +
		        ".findCustomPaymentTransactions";
	public static final String FIND_CUSTOM_REFUND_TRANSACTIONS =
			PaymentTransactionsFinder.class.getName() +
		        ".findCustomRefundTransactions";
}
