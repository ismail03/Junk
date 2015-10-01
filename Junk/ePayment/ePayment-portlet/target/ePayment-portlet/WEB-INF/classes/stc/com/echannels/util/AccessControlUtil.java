package stc.com.echannels.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.stc.echannels.epayments.cp.AccessControlConfig;
import com.stc.echannels.epayments.custommodel.AccessControlModel;
import com.stc.echannels.epayments.model.EPayAccessControl;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.PaymentChannelSrvsMap;
import com.stc.echannels.epayments.model.PaymentMethod;
import com.stc.echannels.epayments.model.PaymentMethodSrvsMap;
import com.stc.echannels.epayments.model.SrvTypeSrvsMap;
import com.stc.echannels.epayments.model.SrvTypes;
import com.stc.echannels.epayments.model.impl.EPayAccessControlImpl;
import com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelSrvsMapLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentMethodSrvsMapLocalServiceUtil;
import com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalServiceUtil;
import com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil;
import com.stc.echannels.epayments.service.impl.AuditUtil;

public class AccessControlUtil {
	// disabling full business service
	public static void disableService(ActionRequest actionRequest,
			ActionResponse actionResponse) throws SystemException,
			PortalException {
		final String serviceIdAndName = ParamUtil.getString(actionRequest,
				"businessServiceType");
		final Long serviceId = Long.parseLong(serviceIdAndName.split(":")[0]);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				AccessControlConfig.class.getName(), actionRequest);
		final EPayAccessControl accessControl = AccessControlUtil
				.createNewInstance(serviceContext);
		accessControl.setServiceId(serviceId);
		EPayAccessControlLocalServiceUtil.addEPayAcessControl(Arrays
				.asList(accessControl));
		/*
		 * try { changeAccessControlTriggeerWebservice(); } catch
		 * (URISyntaxException e) { log.error(e); e.printStackTrace(); }
		 */
	}

	public static String getSeperatedChannelsSrMethod(List<AccessControlModel> accessControlModels)throws PortalException ,SystemException{
		String pmtChannel=StringPool.BLANK;
		String servicetype=StringPool.BLANK;
		String pmtmethod=StringPool.BLANK;
		if(accessControlModels!=null && accessControlModels.size()>0){



			for(AccessControlModel a:accessControlModels){


				EPayAccessControl e = EPayAccessControlLocalServiceUtil.getEPayAccessControl(a.getEpayAccessControlId());

				if(e.getServiceTypeId()!=0L){
					servicetype=servicetype+e.getServiceTypeId()+StringPool.COMMA;

				}
				else if(e.getChannelId()!=0L){

					pmtChannel = pmtChannel+e.getChannelId()+StringPool.COMMA;

				}
				else	if(e.getPmtMethodId()!=0L){
					pmtmethod=pmtmethod+e.getPmtMethodId()+StringPool.COMMA;

				}

			}


		}

		return pmtChannel+StringPool.COLON+servicetype+StringPool.COLON+pmtmethod+StringPool.COLON;
	}

	public static String getTobeenableandDisabledIds(List<String> tobeenabledids,List<String> tobedisabled,List<String> disabledids ){

		String enableids=StringPool.BLANK;
		String disableids=StringPool.BLANK;
		if(disabledids!=null && disabledids.size()>0)
		{


			for(String s:tobeenabledids){

				if(disabledids.contains(s)){
					// enable this s ,,call enable
					enableids=enableids+s+StringPool.COMMA;
				}

			}

			for(String r:tobedisabled){

				if(!disabledids.contains(r)){

					// diable this access control
					disableids=disableids+r+StringPool.COMMA;
				}
			}
		}else{
			// if tobedisabled is greater than 0 call disablemethod
			if(tobedisabled!=null && tobedisabled.size()>0){
				for(String r:tobedisabled){



					// diable this access control
					disableids=disableids+r+StringPool.COMMA;

				}
			}

		}
		return enableids+StringPool.COLON+disableids;
	}
	public static List<PaymentChannel> getRegisterdPaymentChannel(String serviceId) throws SystemException{
		List<PaymentChannel> paymentChannels = PaymentChannelLocalServiceUtil.getPaymentChannels();

		List<PaymentChannel> registeredPaymentChannels = new ArrayList<PaymentChannel>();
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(PaymentChannelSrvsMap.class).add(PropertyFactoryUtil.forName("serviceId").eq(new Long(serviceId)));

		List paymentChannelResults = PaymentChannelSrvsMapLocalServiceUtil.dynamicQuery(query, 0, 100);

		for(Object o : paymentChannelResults){
			for (PaymentChannel p : paymentChannels){
				if(p.getChannelId() == ( (PaymentChannelSrvsMap)o).getChannelId() ){
					registeredPaymentChannels.add(p);
				}
			}
		}
		return registeredPaymentChannels;
	}
	public static List<SrvTypes> getRegisteredServiceTypes(String serviceId)throws SystemException{
		List<SrvTypes> serviceTypes = SrvTypesLocalServiceUtil.getSrvTypeses(0, Integer.MAX_VALUE);
		List<SrvTypes> registeredServiceTypes = new ArrayList<SrvTypes>();
		DynamicQuery query1 = DynamicQueryFactoryUtil.forClass(SrvTypeSrvsMap.class)
				.add(PropertyFactoryUtil.forName("serviceId").eq(new Long(serviceId)));
		List serviceTypesMapResults = SrvTypeSrvsMapLocalServiceUtil.dynamicQuery(query1, 0, 100);

		for(Object o : serviceTypesMapResults){
			for (SrvTypes s : serviceTypes){
				if(s.getServiceTypeId() ==  ((SrvTypeSrvsMap) o).getServiceTypeId() ){
					registeredServiceTypes.add(s);
				}
			}
		}
		return registeredServiceTypes;
	}
	public static List<PaymentMethod> getRegisteredPaymentMethod(String serviceId)throws SystemException{
		List<PaymentMethod> paymentMethods = PaymentMethodLocalServiceUtil.getPaymentMethods(0, Integer.MAX_VALUE);
		List<PaymentMethod> registeredPaymentMethods = new ArrayList<PaymentMethod>();

		DynamicQuery query2 = DynamicQueryFactoryUtil.forClass(PaymentMethodSrvsMap.class)
				.add(PropertyFactoryUtil.forName("serviceId").eq(new Long(serviceId)));
		List paymentMethodResults = PaymentMethodSrvsMapLocalServiceUtil.dynamicQuery(query2, 0, 100);

		for(Object o : paymentMethodResults){
			for (PaymentMethod p : paymentMethods){
				if(p.getPmtMethodId() == ( (PaymentMethodSrvsMap)o).getPaymentMethodId() ){
					registeredPaymentMethods.add(p);
				}
			}
		}

		return registeredPaymentMethods;
	}

	public static EPayAccessControl createNewInstance(ServiceContext serviceContext) {
		final EPayAccessControl accessControl = new EPayAccessControlImpl();
		accessControl.setLastUpdateTimestamp(new Date());
		accessControl.setEffectiveTimestamp(new Date());
		accessControl.setLastUpdateUserid(serviceContext.getUserId() + "");
		accessControl.setClientIP(serviceContext.getRemoteAddr());
		accessControl.setServerIP(serviceContext.getRequest().getLocalAddr());
		accessControl.setUserAgent(serviceContext.getUserAgent());
		accessControl.setTransId((UUID.randomUUID()).toString());
		try {
			accessControl.setLastUpdateUsername(UserLocalServiceUtil.getUser(
					serviceContext.getUserId()).getEmailAddress());
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		accessControl.setOperation(AuditUtil.OPERATION_ADD);
		accessControl.setStatus(AuditUtil.STATUS_ACTIVE);
		return accessControl;
	}

}
