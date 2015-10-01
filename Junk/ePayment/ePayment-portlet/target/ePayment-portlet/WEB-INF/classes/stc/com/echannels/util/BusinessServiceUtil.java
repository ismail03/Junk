/**
 * 
 */
package stc.com.echannels.util;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.stc.echannels.epayments.custommodel.DisableBusinessServiceCustomModel;
import com.stc.echannels.epayments.model.EPayAccessControl;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.PaymentChannelSrvsMap;
import com.stc.echannels.epayments.model.SrvTypes;
import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil;
import com.stc.echannels.epayments.service.impl.EPayAccessControlLocalServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author arpit
 *
 */
public class BusinessServiceUtil {

	public static String[] splitString(String baseString){
		return baseString.split(":");
	}
	public static List<DisableBusinessServiceCustomModel> getModelForService(final String serviceIdAndName,
			final String paymentChannelIdAndName, final String serviceTypeIdAndName, final String paymentMethodIdAndName)
			throws SystemException {

		String serviceId = splitString(serviceIdAndName)[0];
		String serviceName = splitString(serviceIdAndName)[1];
 
		if (!paymentChannelIdAndName.equals("0")) {
			String paymentChannelId = splitString(paymentChannelIdAndName)[0];
			String paymentChannelName = splitString(paymentChannelIdAndName)[1];

			final DisableBusinessServiceCustomModel model = new DisableBusinessServiceCustomModel();
			model.setId("serviceId:" + serviceId + ";paymentChannelId:" + paymentChannelId);

			model.setServiceNameAR(serviceName);
			model.setServiceNameEN(serviceName);

			model.setPaymentChannelNameAR(paymentChannelName);
			model.setPaymentChannelNameEN(paymentChannelName);

			return Arrays.asList(model);
		}

		if (!serviceTypeIdAndName.equals("0")) {
			List<PaymentChannel> paymentChannels = PaymentChannelLocalServiceUtil.getPaymentChannels();
			List<DisableBusinessServiceCustomModel> models = new ArrayList<DisableBusinessServiceCustomModel>(paymentChannels.size());

			String serviceTypeId = splitString(serviceTypeIdAndName)[0];
			String serviceTypeName = splitString(serviceTypeIdAndName)[1];

			final DisableBusinessServiceCustomModel model = new DisableBusinessServiceCustomModel();
			model.setId("serviceId:" + serviceId + ";serviceTypeId:" + serviceTypeId);

			model.setServiceNameEN(serviceName);
			model.setServiceNameAR(serviceName);

			model.setServiceTypeNameAR(serviceTypeName);
			model.setServiceTypeNameEN(serviceTypeName);

			models.add(model);
			return models;
		}

		if (!paymentMethodIdAndName.equals("0")) {
			List<DisableBusinessServiceCustomModel> models = new ArrayList<DisableBusinessServiceCustomModel>();

			String paymentMethodId = splitString(paymentMethodIdAndName)[0];
			String paymentMethodName = splitString(paymentMethodIdAndName)[1];

			final DisableBusinessServiceCustomModel model = new DisableBusinessServiceCustomModel();
			model.setId("serviceId:" + serviceId + ";paymentMethodId:" + paymentMethodId);

			model.setServiceNameEN(serviceName);
			model.setServiceNameAR(serviceName);
			
			model.setPaymentMethodNameAR(paymentMethodName);
			model.setPaymentMethodNameEN(paymentMethodName);

			models.add(model);

			return models;
		}

		return Collections.emptyList();
	}
	
	
	
	
	
	
}
