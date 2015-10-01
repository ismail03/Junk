package com.stc.echannels.epayments.service.persistence;

import java.util.List;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.impl.BankImpl;
import com.stc.echannels.epayments.model.impl.BankServicesImpl;

public class BankFinderImpl extends BasePersistenceImpl<Bank> implements BankFinder{
	
	public static final String FIND_BANK_BY_STATUS_BUSINESSSERVICEID =
		    BankFinder.class.getName() +
		        ".getBanksByBusinessServiceId";

public List getBanksByBusinessServiceId(long serviceid){
	
	Session session = null;
	try {
	session = getCurrentSession();
	String sql = CustomSQLUtil.get(FIND_BANK_BY_STATUS_BUSINESSSERVICEID);
	SQLQuery queryObject = session.createSQLQuery(sql);
	queryObject.setCacheable(false);

	queryObject.addEntity("BankServices", BankServicesImpl.class);
	queryObject.addEntity("Bank", BankImpl.class);
	queryObject.setLong(0,serviceid);

	
	 
	
	return (List) queryObject.list();
	} catch (Exception e) {
	e.printStackTrace();
	} 
	return null;
}
}
