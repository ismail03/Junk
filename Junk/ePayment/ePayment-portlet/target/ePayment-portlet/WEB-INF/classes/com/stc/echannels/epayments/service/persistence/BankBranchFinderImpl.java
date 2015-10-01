package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.model.impl.BankBranchImpl;

import java.util.ArrayList;
import java.util.List;

public class BankBranchFinderImpl extends BasePersistenceImpl<BankBranch> implements BankBranchFinder{
	
	
	public List<BankBranch> findCustomBankBranchByStatus(String status,int start, int end) {


		List<BankBranch> bankBranchModels = new ArrayList<BankBranch>();
		SQLQuery q = fetchQueryBankBranchByStatus(status);

		@SuppressWarnings("unchecked")
		List<Object[]> resultRecords = (List<Object[]>) QueryUtil.list(q, getDialect(), start, end);
		for (Object[] resultRecord : resultRecords) {

 			BankBranch bankBranch = new BankBranchImpl();
			bankBranch.setStcBankCode((String) resultRecord[0]);
			bankBranch.setBankNameEn((String) resultRecord[1]);
			bankBranch.setBankNameAr((String) resultRecord[2]);
			bankBranch.setStcBranchCode((String) resultRecord[3]);
			bankBranch.setBankId((String) resultRecord[4]);
			bankBranch.setPaymentChannelNameEn((String) resultRecord[5]);
			bankBranch.setPaymentChannelNameAr((String) resultRecord[6]);
			bankBranch.setChannelId((Long)resultRecord[7] );
			bankBranch.setTransId((String)resultRecord[8] );
			bankBranchModels.add(bankBranch); 
		}
 
		return bankBranchModels;
		}
	
	public int getBankBranchCount(String status){
		
		return fetchQueryBankBranchByStatus(status).list().size();
	}
	
	public SQLQuery  fetchQueryBankBranchByStatus(String status){
		Session session = getCurrentSession();

		
		String sql = CustomSQLUtil.get(FIND__CUSTOM_BANK_BRANCH_BY_STATUS);
		SQLQuery q = session.createSQLQuery(sql);
		q.setString(0, status);
		q.setString(1, status);
		q.setString(2, status);

		q.addScalar("stcBankCode", Type.STRING);
		q.addScalar("bankNameEn", Type.STRING);
		q.addScalar("bankNameAr", Type.STRING);
		q.addScalar("stcBranchCode", Type.STRING);
		q.addScalar("bankId", Type.STRING);
		q.addScalar("paymentChannelNameEn", Type.STRING);
		q.addScalar("paymentChannelNameAr", Type.STRING);
		q.addScalar("paymentChannelId", Type.LONG);
		q.addScalar("transId", Type.STRING);
		
		return q;
	}

		public static final String FIND__CUSTOM_BANK_BRANCH_BY_STATUS =
		    BankBranchFinder.class.getName() +
		        ".findCustomBankBranchByStatus";

}
