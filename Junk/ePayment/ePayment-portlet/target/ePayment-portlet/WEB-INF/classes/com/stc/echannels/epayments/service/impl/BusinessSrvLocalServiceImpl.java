package com.stc.echannels.epayments.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.custommodel.AccessControlModel;
import com.stc.echannels.epayments.model.BusinessSrv;
import com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil;
import com.stc.echannels.epayments.service.base.BusinessSrvLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the business srv local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.BusinessSrvLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.BusinessSrvLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil
 */
public class BusinessSrvLocalServiceImpl extends BusinessSrvLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil} to access the business srv local service.
     */
	
	public BusinessSrv addBusinessSrv( 
		      String serviceName,String nameAr,String nameEn,
		        long active, Date effectiveDate, ServiceContext serviceContext)
		    throws PortalException	, SystemException {

		   // User user = userPersistence.findByPrimaryKey(userId);

		    long serviceId = counterLocalService.increment(BusinessSrv.class.getName());

		    BusinessSrv service = businessSrvPersistence.create(serviceId);
		    service.setServiceNameAr(nameAr);
		    service.setServiceNameEn(nameEn);
		    service.setStatus(AuditUtil.STATUS_ACTIVE);
		    service.setLastUpdateTimestamp(new Date());
		    service.setEffectiveTimestamp(effectiveDate);

		    super.addBusinessSrv(service);

		    return service;
		}
	
	public List<BusinessSrv> getBusinessServices() throws SystemException {
		
		List<BusinessSrv> businessSrvs = businessSrvPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		for(BusinessSrv businessSrv : businessSrvs){
			List<AccessControlModel> accessControlModels = EPayAccessControlLocalServiceUtil.findActiveEpayAccessControlByServiceType(businessSrv.getServiceId());
			businessSrv.setEpayAccessControlPresent(accessControlModels.size()>0  );
		}
		
		return businessSrvs;
	}
	
	public List<BusinessSrv> findBusinessServiceExcludingSADAD() throws SystemException {
		return getBusinessSrvFinder().findBusinessServiceExcludingSADAD();
	}

}
