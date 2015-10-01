/**
 * 
 */
package stc.com.echannels.util;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.stc.echannels.epayments.custommodel.BizRuleCustomValueConfigModel;
import com.stc.echannels.epayments.enums.BusinessRuleConfigLevel;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.BusinessSrv;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.PaymentChannelSrvsMap;
import com.stc.echannels.epayments.model.PaymentMethod;
import com.stc.echannels.epayments.model.PaymentMethodSrvsMap;
import com.stc.echannels.epayments.model.SrvTypeSrvsMap;
import com.stc.echannels.epayments.service.BankLocalServiceUtil;
import com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author arpit
 * 
 */
public class BizRuleUtil {

	public static final String COLON = ":";

	public static List<BizRuleCustomValueConfigModel> getBusinessRuleConfigLevelMatrix(
			BusinessRuleConfigLevel businessRuleConfigLevel,
			String ruleDefaultValue, String ruleNewValue)
			throws SystemException, PortalException {

		List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil
				.getBusinessSrvs(0, 200);

		switch (businessRuleConfigLevel) {
		case BUSINESS_SERVICE:
			return buildBizRuleCustomValueConfigModel(businessServices,
					ruleDefaultValue, ruleNewValue);
		case PAYMENT_CHANNEL:
			List<PaymentChannel> paymentChannels1 = PaymentChannelLocalServiceUtil
					.getPaymentChannels();
			return buildBizRuleCustomValueConfigModel(businessServices,
					paymentChannels1, ruleDefaultValue, ruleNewValue);
		case PAYMENT_METHOD:
			List<PaymentChannel> paymentChannels2 = PaymentChannelLocalServiceUtil
					.getPaymentChannels();
			List<PaymentMethod> paymentMethods = PaymentMethodLocalServiceUtil
					.findAll();
			return buildBizRuleCustomValueConfigModel(businessServices,
					paymentChannels2, paymentMethods, ruleDefaultValue,
					ruleNewValue);
		default:
			return null;
		}

	}

	private static List<BizRuleCustomValueConfigModel> buildBizRuleCustomValueConfigModel(
			List<BusinessSrv> businessServices, String defaultValue,
			String newValue) {
		List<BizRuleCustomValueConfigModel> bizRuleCustomValueConfigModels = new ArrayList<BizRuleCustomValueConfigModel>();

		for (BusinessSrv businessService : businessServices) {
			BizRuleCustomValueConfigModel bizRuleCustomValueConfigModel = new BizRuleCustomValueConfigModel();

			bizRuleCustomValueConfigModel.setId("serviceId:"
					+ businessService.getServiceId());
			bizRuleCustomValueConfigModel.setServiceNameEN(businessService
					.getServiceNameEn());
			bizRuleCustomValueConfigModel.setServiceNameAR(businessService
					.getServiceNameAr());

			bizRuleCustomValueConfigModel.setDefaultValue(defaultValue);
			bizRuleCustomValueConfigModel.setNewValue(newValue);

			bizRuleCustomValueConfigModels.add(bizRuleCustomValueConfigModel);
		}

		return bizRuleCustomValueConfigModels;
	}

	private static List<BizRuleCustomValueConfigModel> buildBizRuleCustomValueConfigModel(
			List<BusinessSrv> businessServices,
			List<PaymentChannel> paymentChannels, String defaultValue,
			String newValue) {
		List<BizRuleCustomValueConfigModel> bizRuleCustomValueConfigModels = new ArrayList<BizRuleCustomValueConfigModel>();

		for (BusinessSrv businessService : businessServices) {
			for (PaymentChannel paymentChannel : paymentChannels) {
				BizRuleCustomValueConfigModel bizRuleCustomValueConfigModel = new BizRuleCustomValueConfigModel();
				bizRuleCustomValueConfigModel.setId("serviceId:"
						+ businessService.getServiceId() + ";channelId:"
						+ paymentChannel.getChannelId());

				bizRuleCustomValueConfigModel.setServiceNameEN(businessService
						.getServiceNameEn());
				bizRuleCustomValueConfigModel.setServiceNameAR(businessService
						.getServiceNameAr());

				bizRuleCustomValueConfigModel.setDefaultValue(defaultValue);
				bizRuleCustomValueConfigModel.setNewValue(newValue);

				bizRuleCustomValueConfigModel
						.setPaymentChannelNameEN(paymentChannel
								.getDescriptiveNameEn());
				bizRuleCustomValueConfigModel
						.setPaymentChannelNameAR(paymentChannel
								.getDescriptiveNameAr());

				bizRuleCustomValueConfigModels
						.add(bizRuleCustomValueConfigModel);
			}
		}

		return bizRuleCustomValueConfigModels;
	}

	private static List<BizRuleCustomValueConfigModel> buildBizRuleCustomValueConfigModel(
			List<BusinessSrv> businessServices,
			List<PaymentChannel> paymentChannels,
			List<PaymentMethod> paymentMethods, String defaultValue,
			String newValue) {
		List<BizRuleCustomValueConfigModel> bizRuleCustomValueConfigModels = new ArrayList<BizRuleCustomValueConfigModel>();

		for (BusinessSrv businessService : businessServices) {
			for (PaymentChannel paymentChannel : paymentChannels) {
				for (PaymentMethod paymentMethod : paymentMethods) {
					BizRuleCustomValueConfigModel bizRuleCustomValueConfigModel = new BizRuleCustomValueConfigModel();
					bizRuleCustomValueConfigModel.setId("serviceId:"
							+ businessService.getServiceId() + ";channelId:"
							+ paymentChannel.getChannelId() + ";methodId:"
							+ paymentMethod.getPmtMethodId());

					bizRuleCustomValueConfigModel
							.setServiceNameEN(businessService
									.getServiceNameEn());
					bizRuleCustomValueConfigModel
							.setServiceNameAR(businessService
									.getServiceNameAr());

					bizRuleCustomValueConfigModel.setDefaultValue(defaultValue);
					bizRuleCustomValueConfigModel.setNewValue(newValue);

					bizRuleCustomValueConfigModel
							.setPaymentChannelNameEN(paymentChannel
									.getDescriptiveNameEn());
					bizRuleCustomValueConfigModel
							.setPaymentChannelNameAR(paymentChannel
									.getDescriptiveNameAr());

					bizRuleCustomValueConfigModels
							.add(bizRuleCustomValueConfigModel);
				}
			}
		}

		return bizRuleCustomValueConfigModels;
	}

	@SuppressWarnings("unchecked")
	public static List<PaymentMethod> getPaymentMethodByBusiniessServiceId(
			long serviceId) throws SystemException {
		ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(
				ClpSerializer.getServletContextName(), "portletClassLoader");
		DynamicQuery dq0 = DynamicQueryFactoryUtil
				.forClass(PaymentMethodSrvsMap.class, "paymentMethodSrvsMap",
						classLoader)
				.setProjection(
						ProjectionFactoryUtil
								.property("paymentMethodSrvsMap.paymentMethodId"))
				.add(PropertyFactoryUtil.forName(
						"paymentMethodSrvsMap.serviceId").eq(serviceId));

		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(PaymentMethod.class, "paymentMethod", classLoader)
				.add(PropertyFactoryUtil.forName("paymentMethod.pmtMethodId")
						.in(dq0))
				.add(PropertyFactoryUtil.forName("paymentMethod.status").eq(
						new String("ACTIVE")));
		List<PaymentMethod> paymentMethods = PaymentMethodLocalServiceUtil
				.dynamicQuery(query);
		return paymentMethods;
	}

	// ==================================================================================

	public static List<BizRuleCustomValueConfigModel> getConfigForPaymentMethod(
			String businessServiceTypeIdAndDescription,
			String paymentMethodTypeAndDescription, String ruleDefaultValue,
			String ruleNewValue) throws SystemException, PortalException {

		List<BizRuleCustomValueConfigModel> bizRuleCustomValueConfigModels = new ArrayList<BizRuleCustomValueConfigModel>();

		String serviceId = "0";
		String serviceDesc = "";

		if (businessServiceTypeIdAndDescription != null
				&& !businessServiceTypeIdAndDescription.isEmpty()) {
			String[] businessServiceIdAndDesc = businessServiceTypeIdAndDescription
					.split(":");
			serviceId = businessServiceIdAndDesc[0] != null ? businessServiceIdAndDesc[0]
					: "0";
			serviceDesc = businessServiceIdAndDesc[1];
		}
		List<PaymentMethod> paymentMethods = getPaymentMethodByBusiniessServiceId(Long
				.parseLong(serviceId));
		String paymentMethodId = "";
		String paymentDesc = "";
		if (paymentMethodTypeAndDescription != null
				&& !paymentMethodTypeAndDescription.isEmpty()
				&& !paymentMethodTypeAndDescription.equals("ALL")) {
			String[] paymentMethodAndDesc = paymentMethodTypeAndDescription
					.split(":");
			paymentMethodId = (paymentMethodAndDesc[0] != null) ? paymentMethodAndDesc[0]
					: "0";
			paymentDesc = paymentMethodAndDesc[1];
		}

		for (PaymentMethod paymentMethod : paymentMethods) {
			if (paymentMethod.getPmtMethodId() == Long
					.parseLong(paymentMethodId)) {
				BizRuleCustomValueConfigModel bizRuleCustomValueConfigModel = new BizRuleCustomValueConfigModel();
				bizRuleCustomValueConfigModel.setId("serviceId:"+ serviceId+ ";methodId:" + paymentMethod.getPmtMethodId());
				bizRuleCustomValueConfigModel.setServiceNameEN(serviceDesc);
				bizRuleCustomValueConfigModel.setServiceNameAR(serviceDesc);

				bizRuleCustomValueConfigModel
						.setPaymentMethodNameEN(paymentMethod
								.getDescriptiveNameEn());
				bizRuleCustomValueConfigModel
						.setPaymentMethodNameAR(paymentMethod
								.getDescriptiveNameAr());

				bizRuleCustomValueConfigModel.setDefaultValue(ruleDefaultValue);
				bizRuleCustomValueConfigModel.setNewValue(ruleNewValue);

				bizRuleCustomValueConfigModels
						.add(bizRuleCustomValueConfigModel);
			}
		}
		return bizRuleCustomValueConfigModels;
	}

	@SuppressWarnings("unchecked")
	public static List<PaymentChannel> getPaymentChannelsByBusiniessServiceId(
			long serviceId) throws SystemException {
		ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(
				ClpSerializer.getServletContextName(), "portletClassLoader");
		DynamicQuery dq0 = DynamicQueryFactoryUtil
				.forClass(PaymentChannelSrvsMap.class, "paymentChannelSrvsMap",
						classLoader)
				.setProjection(
						ProjectionFactoryUtil
								.property("paymentChannelSrvsMap.channelId"))
				.add(PropertyFactoryUtil.forName(
						"paymentChannelSrvsMap.serviceId").eq(serviceId));

		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(PaymentChannel.class, "paymentChannel", classLoader)
				.add(PropertyFactoryUtil.forName("paymentChannel.channelId")
						.in(dq0))
				.add(PropertyFactoryUtil.forName("paymentChannel.status").eq(
						new String("ACTIVE")));
		List<PaymentChannel> paymentChannels = PaymentChannelLocalServiceUtil
				.dynamicQuery(query);
		return paymentChannels;
	}
	
	public static List<BizRuleCustomValueConfigModel> getConfigForPaymentChannel(
			String businessServiceTypeIdAndDescription,
			String paymentChannelTypeIdAndDescription, String ruleDefaultValue,
			String ruleNewValue) throws SystemException, PortalException {
		List<BizRuleCustomValueConfigModel> bizRuleCustomValueConfigModels = new ArrayList<BizRuleCustomValueConfigModel>();

		String serviceId = "0";
		String serviceDesc = "";
		if (businessServiceTypeIdAndDescription != null
				&& !businessServiceTypeIdAndDescription.isEmpty()) {
			String[] businessServiceIdAndDesc = businessServiceTypeIdAndDescription
					.split(":");
			serviceId = businessServiceIdAndDesc[0] != null ? businessServiceIdAndDesc[0]
					: "0";
			serviceDesc = businessServiceIdAndDesc[1];
		}
		long paymentChannelId = 0l;
		if (paymentChannelTypeIdAndDescription != null
				&& !paymentChannelTypeIdAndDescription.isEmpty()) {
			paymentChannelId = Long
					.parseLong(paymentChannelTypeIdAndDescription.split(":")[0]);
		}

		List<PaymentChannel> paymentChannels = getPaymentChannelsByBusiniessServiceId(Long
				.parseLong(serviceId));
		for (PaymentChannel paymentChannel : paymentChannels) {
			if (paymentChannel.getChannelId() == paymentChannelId) {
				BizRuleCustomValueConfigModel bizRuleCustomValueConfigModel = new BizRuleCustomValueConfigModel();
				bizRuleCustomValueConfigModel.setId("serviceId:" + serviceId
						+ ";channelId:" + paymentChannel.getChannelId());

				bizRuleCustomValueConfigModel.setServiceNameEN(serviceDesc);
				bizRuleCustomValueConfigModel.setServiceNameAR(serviceDesc);

				bizRuleCustomValueConfigModel
						.setPaymentChannelNameEN(paymentChannel
								.getDescriptiveNameEn());
				bizRuleCustomValueConfigModel
						.setPaymentChannelNameAR(paymentChannel
								.getDescriptiveNameAr());

				bizRuleCustomValueConfigModel.setDefaultValue(ruleDefaultValue);
				bizRuleCustomValueConfigModel.setNewValue(ruleNewValue);

				bizRuleCustomValueConfigModels
						.add(bizRuleCustomValueConfigModel);
			}
		}
		return bizRuleCustomValueConfigModels;
	}

	@SuppressWarnings("unchecked")
	public static List<BusinessSrv> getBusiniessServiceByRegisteredServiceTypeId(
			long serviceTypeId) throws SystemException {
		ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(
				ClpSerializer.getServletContextName(), "portletClassLoader");
		DynamicQuery dq0 = DynamicQueryFactoryUtil
				.forClass(SrvTypeSrvsMap.class, "srvTypeSrvsMap", classLoader)
				.setProjection(
						ProjectionFactoryUtil
								.property("srvTypeSrvsMap.serviceId"))
				.add(PropertyFactoryUtil
						.forName("srvTypeSrvsMap.serviceTypeId").eq(
								serviceTypeId));

		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(BusinessSrv.class, "businessSrv", classLoader)
				.add(PropertyFactoryUtil.forName("businessSrv.serviceId").in(
						dq0))
				.add(PropertyFactoryUtil.forName("businessSrv.status").eq(
						new String("ACTIVE")));
		List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil
				.dynamicQuery(query);
		return businessServices;
	}

	public static List<BizRuleCustomValueConfigModel> getConfigForBusinessService(
			String ruleDefaultValue, String ruleNewValue, Long serviceTypeId)
			throws SystemException, PortalException {

		final List<BusinessSrv> businessServices = getBusiniessServiceByRegisteredServiceTypeId(serviceTypeId);
		final List<BizRuleCustomValueConfigModel> bizRuleCustomValueConfigModels = new ArrayList<BizRuleCustomValueConfigModel>(
				businessServices.size());

		for (BusinessSrv businessService : businessServices) {
			BizRuleCustomValueConfigModel bizRuleCustomValueConfigModel = new BizRuleCustomValueConfigModel();

			bizRuleCustomValueConfigModel.setId("serviceId:"
					+ businessService.getServiceId());
			bizRuleCustomValueConfigModel.setServiceNameEN(businessService
					.getServiceNameEn());
			bizRuleCustomValueConfigModel.setServiceNameAR(businessService
					.getServiceNameAr());

			bizRuleCustomValueConfigModel.setDefaultValue(ruleDefaultValue);
			bizRuleCustomValueConfigModel.setNewValue(ruleNewValue);

			bizRuleCustomValueConfigModels.add(bizRuleCustomValueConfigModel);
		}

		return bizRuleCustomValueConfigModels;
	}

}
