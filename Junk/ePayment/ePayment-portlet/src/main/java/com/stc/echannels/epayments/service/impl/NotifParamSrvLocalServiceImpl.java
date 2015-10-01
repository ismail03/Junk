package com.stc.echannels.epayments.service.impl;


import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;
import com.stc.echannels.epayments.model.NotifParamSrv;
import com.stc.echannels.epayments.service.persistence.NotifParamSrvUtil;
import com.stc.echannels.epayments.service.base.NotifParamSrvLocalServiceBaseImpl;

/**
 * The implementation of the notif param srv local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.NotifParamSrvLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.NotifParamSrvLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.NotifParamSrvLocalServiceUtil
 */
public class NotifParamSrvLocalServiceImpl
    extends NotifParamSrvLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.NotifParamSrvLocalServiceUtil} to access the notif param srv local service.
     */
	public List<NotifParamSrv> findByServiceId(long serviceId) throws SystemException {
	     return NotifParamSrvUtil.findByServiceId(serviceId);
	 }
}
