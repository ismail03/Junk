package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for PaymentMethodSrvsMap. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.PaymentMethodSrvsMapServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author ahmed_fadlus
 * @see PaymentMethodSrvsMapService
 * @see com.stc.echannels.epayments.service.base.PaymentMethodSrvsMapServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.PaymentMethodSrvsMapServiceImpl
 * @generated
 */
public class PaymentMethodSrvsMapServiceUtil {
    private static PaymentMethodSrvsMapService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.PaymentMethodSrvsMapServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static PaymentMethodSrvsMapService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PaymentMethodSrvsMapService.class.getName());

            if (invokableService instanceof PaymentMethodSrvsMapService) {
                _service = (PaymentMethodSrvsMapService) invokableService;
            } else {
                _service = new PaymentMethodSrvsMapServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(PaymentMethodSrvsMapServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PaymentMethodSrvsMapService service) {
    }
}
