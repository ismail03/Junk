/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.stc.echannels.epayments.service.impl;

import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.exception.SystemException;
import com.stc.echannels.epayments.custommodel.AccessControlModel;
import com.stc.echannels.epayments.model.EPayAccessControl;
import com.stc.echannels.epayments.service.base.EPayAccessControlLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.EPayAccessControlUtil;

/**
 * The implementation of the e pay access control local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.EPayAccessControlLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.EPayAccessControlLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil
 */
public class EPayAccessControlLocalServiceImpl
	extends EPayAccessControlLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil} to access the e pay access control local service.
	 */
	
	public List<AccessControlModel> findActiveEpayAccessControlByServiceType(
			Long serviceTypeId) throws SystemException {
		return getEPayAccessControlFinder().findActiveEpayAccessControlByServiceType(serviceTypeId);
	}
	
	public void enableEPayAcessControl(long [] ids, EPayAccessControl epac) throws SystemException {
		
		getEPayAccessControlFinder().enableEPayAcessControl(ids,epac);
		
		for (long l : ids) {
			String sql = "select  a.serviceTypeId,a.channelId,a.pmtMethodId,a.serviceId from EPayAccessControl a where a.epayCofignId = ?";
			Query query = ePayAccessControlPersistence.getCurrentSession().createQuery(sql);
			query.setLong(0,l);
			List<Object> list = query.list();
			Object[] ePayIds = (Object[]) list.get(0);
			final long epayConfigId= counterLocalService.increment(EPayAccessControl.class.getName());
			epac.setEpayCofignId(epayConfigId);
			epac.setServiceTypeId((Long)ePayIds[0]);
			epac.setChannelId((Long)ePayIds[1]);
			epac.setPmtMethodId((Long)ePayIds[2]);
			epac.setServiceId((Long)ePayIds[3]);
			getEPayAccessControlFinder().addEPayAccessControl(epac);
		}
	}
		
	public void addEPayAcessControl(List<EPayAccessControl> accessControls) throws SystemException {
		for (EPayAccessControl ePayAccessControl : accessControls) {
			 final long epayConfigId= counterLocalService.increment(EPayAccessControl.class.getName());
			// final long epayConfigId=CounterLocalServiceUtil.increment(EPayAccessControl.class.getName());

			ePayAccessControl.setEpayCofignId(epayConfigId);
			getEPayAccessControlFinder().addEPayAccessControl(ePayAccessControl);
		}
	}
	
	public boolean  isBusinessServiceDisabled(long serviceId)   throws SystemException {
		 
	      for (EPayAccessControl ePayAccessControl : EPayAccessControlUtil.findByServiceId(serviceId)) {
			if(ePayAccessControl.getServiceTypeId() == 0 && ePayAccessControl.getPmtMethodId() == 0 && ePayAccessControl.getChannelId() == 0 && ePayAccessControl.getStatus().equals(AuditUtil.STATUS_ACTIVE)){
				return true;
			}
	      };
	         
	      return false;
	}
	
	public boolean  isBusinessServiceDownHierarchyDisabled(long serviceId)   throws SystemException {
 
	      for (EPayAccessControl ePayAccessControl : EPayAccessControlUtil.findByServiceId(serviceId)) {
			if( ( ePayAccessControl.getServiceTypeId() != 0 || ePayAccessControl.getPmtMethodId() != 0 || ePayAccessControl.getChannelId() != 0 )&& ePayAccessControl.getStatus().equals(AuditUtil.STATUS_ACTIVE)){
				return true;
			}
	      };
	         
	      return false;
	}
	
	
	public boolean  isCombinationDisabled(long serviceId,long serviceTypeId, long channelId, long pmtMethodId)   throws SystemException {
		 
	      for (EPayAccessControl ePayAccessControl : EPayAccessControlUtil.findByServiceId(serviceId)) {
			if( ePayAccessControl.getServiceTypeId()==serviceTypeId && ePayAccessControl.getPmtMethodId() == pmtMethodId && ePayAccessControl.getChannelId() == channelId && ePayAccessControl.getStatus().equals(AuditUtil.STATUS_ACTIVE)){
				return true;
			}
	      };
	         
	      return false;
	}
public List<EPayAccessControl> findByServiceidAndStatus(long srvid,String status) throws SystemException{
	
 return ePayAccessControlPersistence.findByserviceIdAndstatus(srvid, status);
}
}