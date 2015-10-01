/**
 * 
 */
package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.stc.echannels.epayments.model.BusinessSrv;

import java.util.List;

/**
 * @author arpit
 *
 */
public class BusinessSrvFinderImpl extends BasePersistenceImpl<BusinessSrv> implements BusinessSrvFinder {

	@SuppressWarnings("unchecked")
	public List<BusinessSrv> findBusinessServiceExcludingSADAD() {
		Session session = getCurrentSession();
		//SQLQuery q = session.createSQLQuery("SELECT * FROM SERVICES WHERE SERVICE_TYPE NOT LIKE 'SADAD-%' AND STATUS LIKE 'ACTIVE'");
		return session.createQuery("SELECT FROM BusinessService WHERE service_type NOT LIKE 'SADAD-%' AND STATUS LIKE 'ACTIVE'").list();
		//return q.list();
	}
}
