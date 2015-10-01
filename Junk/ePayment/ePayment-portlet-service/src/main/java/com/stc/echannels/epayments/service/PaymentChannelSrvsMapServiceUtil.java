package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for PaymentChannelSrvsMap. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.PaymentChannelSrvsMapServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrvsMapService
 * @see com.stc.echannels.epayments.service.base.PaymentChannelSrvsMapServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.PaymentChannelSrvsMapServiceImpl
 * @generated
 */
public class PaymentChannelSrvsMapServiceUtil {
    private static PaymentChannelSrvsMapService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.PaymentChannelSrvsMapServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static PaymentChannelSrvsMapService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PaymentChannelSrvsMapService.class.getName());

            if (invokableService instanceof PaymentChannelSrvsMapService) {
                _service = (PaymentChannelSrvsMapService) invokableService;
            } else {
                _service = new PaymentChannelSrvsMapServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(PaymentChannelSrvsMapServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PaymentChannelSrvsMapService service) {
    }
}
