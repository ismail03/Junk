/**
 *
 */
package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;
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
import com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.impl.AuditUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import stc.com.echannels.util.AccessControlUtil;

/**
 * @author arpit
 *
 */
public class AccessControlConfig extends MVCPortlet {

	private static Logger  _log = LoggerFactory.getLogger(AccessControlConfig.class);
	private String[] configtypes ={"pmttypes","srtypes","pmtMtdtypes"};

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		super.doView(renderRequest, renderResponse);

	}

	@Override
	protected void addSuccessMessage(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		if (ParamUtil.getString(actionRequest, "method") != null
				&& ParamUtil.getString(actionRequest, "method").trim().length() > 0) {
			return;
		}
		super.addSuccessMessage(actionRequest, actionResponse);
	}

	public void disableBusinessRules() {

	}

	private String getFieldValue(String keyValuePair) {
		String value = null;
		String keyValueItem[] = StringUtils.split(keyValuePair, ":");
		if (keyValueItem.length == 2) {
			value = keyValueItem[1];
		}
		return value;
	}

	// enabling selected bits payment cahnnel,service type, payment method
	public void updatedEpayAccessControl(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		String id = ParamUtil.getString(actionRequest,
				"businessServiceType");
		id = id.split(StringPool.COLON)[0];
		_log.info("Updating AccessControl Selection For Business Service id -->"+id );
		try{
			boolean isBusinessServiceDisabled = EPayAccessControlLocalServiceUtil.isBusinessServiceDisabled(GetterUtil.getLong(id));
			if(isBusinessServiceDisabled){

				enableBusinessService(actionRequest, actionResponse);
				_log.info("Enabled  Business Service id-->"+id );
			}
		}catch(SystemException s){

			_log.error("Oops ,Error occurred while updating EpayAccess control "+s);
			return;
		}


		Map<String, String[]> maps = actionRequest.getParameterMap();
		Set<String> ketsets = maps.keySet();

		String configlevel =StringPool.BLANK;
		for(String cs:configtypes){

			configlevel =cs;
			if (configlevel != null && !configlevel.trim().equals("")) {


				_log.info("Enabling Disabling Bits for Config Level "+configlevel);

				Map<String, String> configtype = new java.util.HashMap<String, String>();

				for (String ss : ketsets) {

					if (ss.startsWith(configlevel) && !ss.endsWith("Checkbox")) {
						configtype.put(ss.split(StringPool.COLON)[1], Arrays
								.asList(maps.get(ss)).get(0));
					}

				}
				if (Validator.isNotNull(configtype) && configtype.size() > 0) {
					_log.info(" IDs for Config level "+configlevel+"--->"+configtype.toString());
					List<String> Toenabled = new ArrayList<String>();
					List<String> Todisabled = new ArrayList<String>();
					for (String sss : configtype.keySet()) {



						if (configtype.get(sss).equalsIgnoreCase("true")) {
							Toenabled.add(sss);
						} else {
							Todisabled.add(sss);

						}
					}
					_log.info(" IDs for Config level "+configlevel+" to be enabled are--->"+Toenabled.toString());
					_log.info(" IDs for Config level "+configlevel+" to be disabled are--->"+Todisabled.toString());
					_log.info("Performing Db Operations ");
					try {

						List<AccessControlModel> accessControlModels = EPayAccessControlLocalServiceUtil
								.findActiveEpayAccessControlByServiceType(GetterUtil
										.getLong(id));

						String bundle = AccessControlUtil
								.getSeperatedChannelsSrMethod(accessControlModels);
						String[] bundleArray = bundle.split(StringPool.COLON);

						String[] disabledpmtChannelids = null;
						String[] disabledsrvtypesids = null;
						String[] disabledpmtmethodids = null;
						if (bundleArray.length > 0) {
							if (bundleArray.length == 1) {
								disabledpmtChannelids = new String[bundleArray[0]
										.length()];
								disabledpmtChannelids = bundleArray[0]
										.split(StringPool.COMMA);
							} else if (bundleArray.length == 2) {
								disabledpmtChannelids = new String[bundleArray[0]
										.length()];
								disabledsrvtypesids = new String[bundleArray[1]
										.length()];
								disabledpmtChannelids = bundleArray[0]
										.split(StringPool.COMMA);
								disabledsrvtypesids = bundleArray[1]
										.split(StringPool.COMMA);
							} else if (bundleArray.length == 3) {
								disabledpmtChannelids = new String[bundleArray[0]
										.length()];
								disabledsrvtypesids = new String[bundleArray[1]
										.length()];

								disabledpmtmethodids = new String[bundleArray[2]
										.length()];
								disabledpmtChannelids = bundleArray[0]
										.split(StringPool.COMMA);
								disabledsrvtypesids = bundleArray[1]
										.split(StringPool.COMMA);
								disabledpmtmethodids = bundleArray[2]
										.split(StringPool.COMMA);
							}

						}

						List<String> disabledlist = null;

						if (configlevel.equals(configtypes[0])) {
							if (disabledpmtChannelids == null) {
								disabledlist = new ArrayList<String>();
							} else {
								disabledlist = Arrays.asList(disabledpmtChannelids);

							}
						} else if (configlevel.equals(configtypes[1])) {

							if (disabledsrvtypesids == null) {
								disabledlist = new ArrayList<String>();
							} else {
								disabledlist = Arrays.asList(disabledsrvtypesids);

							}

						} else if (configlevel.equals(configtypes[2])) {
							if (disabledpmtmethodids == null) {
								disabledlist = new ArrayList<String>();
							} else {
								disabledlist = Arrays.asList(disabledpmtmethodids);

							}
						}


						finalEnablingAndDisabling(actionRequest, actionResponse,
								accessControlModels, configlevel, Toenabled,
								Todisabled, disabledlist, id);
						_log.info("Successfully Upadted for Config level  "+configlevel);

					} catch (IOException e) {
						_log.error("Oops error occured during EpayAccessControl Update",e);
					} catch (PortletException e) {
						_log.error("Oops error occured during EpayAccessControl Update",e);
					} catch (SystemException e) {
						_log.error("Oops error occured during EpayAccessControl Update",e);
					} catch (PortalException e) {
						_log.error("Oops error occured during EpayAccessControl Update",e);
					}

				}
			}
		}
		SessionMessages.add(actionRequest,"success-update");
	}

	// enabliding disabled bits and disabling business service
	public void jumbodisableService(ActionRequest actionRequest,
			ActionResponse actionResponse) throws SystemException {

		String id = ParamUtil.getString(actionRequest, "businessServiceType");
		id = id.split(StringPool.COLON)[0];
		_log.info("All checkboxes are unchecked, Disabling Business Service ID -->"+id);


		try {
			boolean isBusinessServiceDisabled = EPayAccessControlLocalServiceUtil.isBusinessServiceDisabled(GetterUtil.getLong(id));
			if(isBusinessServiceDisabled==false){
				List<AccessControlModel> accessControlModels = EPayAccessControlLocalServiceUtil
						.findActiveEpayAccessControlByServiceType(GetterUtil
								.getLong(id));

				if (Validator.isNotNull(accessControlModels)
						&& accessControlModels.size() > 0) {
					long[] deleteitemids = new long[accessControlModels.size()];
					int i = 0;
					for (AccessControlModel a : accessControlModels) {
						deleteitemids[i] = a.getEpayAccessControlId();
						i++;
					}

					enableEPayAcessControl(actionRequest, actionResponse,
							deleteitemids);
					_log.info("All Active Bits Of Buisness Service ID  "+id+"are changed to inactive");


				}
				AccessControlUtil.disableService(actionRequest, actionResponse);
				_log.info(" Buisness Service ID  "+id+" is disabled ");
			}else{

				_log.info(" Buisness Service ID  "+id+" is Already disabled ");
			}
			SessionMessages.add(actionRequest,"success-update");
		} catch (IOException e) {
			_log.error("Oops error occured while disabling Buisness service ID "+id,e);
		} catch (PortalException e) {
			_log.error("Oops error occured while disabling Buisness service ID "+id,e);
		} catch (PortletException e) {
			_log.error("Oops error occured while disabling Buisness service ID "+id,e);
		} catch (SystemException e) {
			_log.error("Oops error occured while disabling Buisness service ID "+id,e);
		}
	}



	// disable bits payment cahnnel , service type, payment method
	private void disableBusinessServices(ActionRequest actionRequest,
			ActionResponse actionResponse, List<String> todisabledids,
			String type, String serviceId) throws SystemException,
			PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				AccessControlConfig.class.getName(), actionRequest);

		List<EPayAccessControl> accessControls = new ArrayList<EPayAccessControl>();
		for (String id : todisabledids) {

			final EPayAccessControl accessControl = AccessControlUtil
					.createNewInstance(serviceContext);

			accessControl.setServiceId(Long.parseLong(serviceId));

			if (type.equals(configtypes[0])) {
				accessControl.setChannelId(Long.parseLong(id));


			} else if (type.equals(configtypes[1])) {
				accessControl.setServiceTypeId(Long.parseLong(id));

			} else if (type.equals(configtypes[2])) {
				accessControl.setPmtMethodId(Long.parseLong(id));

			}

			accessControls.add(accessControl);
		}

		EPayAccessControlLocalServiceUtil.addEPayAcessControl(accessControls);
		/*
		 * try { changeAccessControlTriggeerWebservice(); } catch
		 * (URISyntaxException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}

	private void enableBusinessService(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		String id = ParamUtil.getString(actionRequest, "businessServiceType");

		id = id.split(StringPool.COLON)[0];
		try {
			List<EPayAccessControl> e = EPayAccessControlLocalServiceUtil
					.findByServiceidAndStatus(GetterUtil.getLong(id),
							AuditUtil.STATUS_ACTIVE);


			if (Validator.isNotNull(e) && e.size() > 0) {
				long[] deleteid = new long[e.size()];
				int i = 0;
				for (EPayAccessControl e1 : e) {
					deleteid[i] = e1.getEpayCofignId();
					i++;
				}
				enableEPayAcessControl(actionRequest, actionResponse, deleteid);

			}
		} catch (IOException e) {

		} catch (PortletException e) {

		} catch (SystemException e) {

		}
	}

	// enabling bits Payment Channel, Service Type, Payment Method
	private void enableEPayAcessControl(ActionRequest actionRequest,
			ActionResponse actionResponse, long[] deleteItemIds)
					throws IOException, PortletException, SystemException {

		long records[] = deleteItemIds;
		final EPayAccessControl accessControl = new EPayAccessControlImpl();
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					AccessControlConfig.class.getName(), actionRequest);

			Date dt = new Date();
			accessControl.setLastUpdateTimestamp(dt);
			accessControl.setEffectiveTimestamp(dt);
			accessControl.setLastUpdateUserid(serviceContext.getUserId() + "");
			accessControl.setClientIP(serviceContext.getRemoteAddr());
			accessControl.setServerIP(serviceContext.getRequest()
					.getLocalAddr());
			accessControl.setUserAgent(serviceContext.getUserAgent());
			accessControl.setTransId((UUID.randomUUID()).toString());

			accessControl.setLastUpdateUsername(UserLocalServiceUtil.getUser(
					serviceContext.getUserId()).getEmailAddress());
		} catch (PortalException e) {
			_log.error("Oops,error occurred while disabling bits",e);
		} catch (SystemException e) {
			_log.error("Oops,error occurred while disabling bits",e);
		}
		accessControl.setOperation(AuditUtil.OPERATION_ADD);
		accessControl.setStatus(AuditUtil.STATUS_INACTIVE);
		EPayAccessControlLocalServiceUtil.enableEPayAcessControl(records,
				accessControl);
		/*
		 * try { changeAccessControlTriggeerWebservice(); } catch
		 * (URISyntaxException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

	// for loading sadad related services
	public void viewSystemConfig(ActionRequest request, ActionResponse response)
			throws Exception {

		final String serviceIdAndName = ParamUtil.getString(request,
				"businessServiceType");
		final Long serviceId = Long.parseLong(serviceIdAndName.split(":")[0]);

		response.setRenderParameter("serviceId", "" + serviceId);
		response.setRenderParameter("businessServiceType",
				ParamUtil.getString(request, "businessServiceType"));

		String columns = SystemConfigLocalServiceUtil.getColumns(
				getPortletConfig(), request.getLocale(), serviceId);
		_log.debug("********************* columns =   " + columns
				+ "  **************************");

		JSONArray json = JSONArray.fromObject(columns);
		int size = json.size();
		for (int i = 1; i < size; i++) {
			JSONObject o = json.getJSONObject(i);
			o.put("allowHTML", true);
			o.put("formatter", "<input type=\"checkbox\" {value} />");
		}
		columns = json.toString();
		response.setRenderParameter("columns", columns);
		String data = SystemConfigLocalServiceUtil.getData(request.getLocale(),
				serviceId);

		if (data != null) {
			response.setRenderParameter("data", data);
		} else {
			response.setRenderParameter("data", "no-results-found");
		}

	}

	public void serveResource(ResourceRequest request, ResourceResponse response) {



		String iddd = ParamUtil.getString(request, "bsrid");
		String config = ParamUtil.getString(request, "configsData");

		String flag = ParamUtil.getString(request, "action");



		try{
			if(Validator.isNotNull(iddd) && !iddd.trim().equals("temp")){
				boolean isBusinessServiceDisabled = EPayAccessControlLocalServiceUtil.isBusinessServiceDisabled(GetterUtil.getLong(iddd));

				if(Validator.isNotNull(flag) && flag.trim().equals("enable")){


					boolean en =		enableBusinessServiceWithAjaxCall(request,response,iddd);

					SessionMessages.add(request, "success-update");
					if(en==true)
						isBusinessServiceDisabled=false;

				}

				if(isBusinessServiceDisabled==true){

					PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/html/accesscontrol/configenabled.jsp");


					request.setAttribute("businessServiceId", iddd);
					request.setAttribute("pmtChannelList",
							AccessControlUtil.getRegisterdPaymentChannel(iddd));
					request.setAttribute("serviceTypsList",
							AccessControlUtil.getRegisteredServiceTypes(iddd));
					request.setAttribute("pmtmthdList",
							AccessControlUtil.getRegisteredPaymentMethod(iddd));

					dispatcher.include(request, response);

				}else{





					List<AccessControlModel> accessControlModels = EPayAccessControlLocalServiceUtil
							.findActiveEpayAccessControlByServiceType(GetterUtil
									.getLong(iddd));

					String bundle = AccessControlUtil
							.getSeperatedChannelsSrMethod(accessControlModels);
					String[] bundleArray = bundle.split(StringPool.COLON);

					String[] disabledpmtChannelids = null;

					String[] disabledsrvtypesids = null;
					String[] disabledpmtmethodids = null;
					if (bundleArray.length > 0) {
						if (bundleArray.length == 1) {
							disabledpmtChannelids = new String[bundleArray[0]
									.length()];
							disabledpmtChannelids = bundleArray[0]
									.split(StringPool.COMMA);
						} else if (bundleArray.length == 2) {
							disabledpmtChannelids = new String[bundleArray[0]
									.length()];
							disabledsrvtypesids = new String[bundleArray[1]
									.length()];
							disabledpmtChannelids = bundleArray[0]
									.split(StringPool.COMMA);
							disabledsrvtypesids = bundleArray[1]
									.split(StringPool.COMMA);
						} else if (bundleArray.length == 3) {
							disabledpmtChannelids = new String[bundleArray[0]
									.length()];
							disabledsrvtypesids = new String[bundleArray[1]
									.length()];

							disabledpmtmethodids = new String[bundleArray[2]
									.length()];
							disabledpmtChannelids = bundleArray[0]
									.split(StringPool.COMMA);
							disabledsrvtypesids = bundleArray[1]
									.split(StringPool.COMMA);
							disabledpmtmethodids = bundleArray[2]
									.split(StringPool.COMMA);
						}

					}
					PortletRequestDispatcher dispatcher = getPortletContext()
							.getRequestDispatcher(
									"/html/accesscontrol/configlevel.jsp");
					request.setAttribute("businessServiceId", iddd);
					request.setAttribute("pmtChannelList",
							AccessControlUtil.getRegisterdPaymentChannel(iddd));
					request.setAttribute("serviceTypsList",
							AccessControlUtil.getRegisteredServiceTypes(iddd));
					request.setAttribute("pmtmthdList",
							AccessControlUtil.getRegisteredPaymentMethod(iddd));

					request.setAttribute(
							"disabledpmtChnlids",
							disabledpmtChannelids == null ? new ArrayList<PaymentChannel>()
									: Arrays.asList(disabledpmtChannelids));

					request.setAttribute("disabledsrvtypesids",
							disabledsrvtypesids == null ? new ArrayList<SrvTypes>()
									: Arrays.asList(disabledsrvtypesids));

					request.setAttribute(
							"disabledpmtmthdids",
							disabledpmtmethodids == null ? new ArrayList<PaymentMethod>()
									: Arrays.asList(disabledpmtmethodids));

					dispatcher.include(request, response);







				}



			}else if(Validator.isNotNull(config)&& !config.trim().equals("")){
				ServiceContext serviceContext = null;
				ParamUtil.print(request);
				_log.info("Contenet Type :   " + request.getContentType());
				_log.info("Contenet Count :   " + request.getContentLength());

				_log.info("response Contenet Type :   "
						+ request.getResponseContentType());


				serviceContext = ServiceContextFactory.getInstance(
						PaymentChannel.class.getName(), request);


				final String serviceIdAndName = ParamUtil.getString(request,
						"businessServiceType");
				final Long serviceId = Long.parseLong(serviceIdAndName
						.split(":")[0]);
				SystemConfigLocalServiceUtil.saveSystemConfigs(serviceId,
						config, serviceContext);
				SessionMessages.add(request, "success-update");


			}

		} catch (PortletException e) {

		} catch (IOException e) {

		} catch (SystemException e) {

		} catch (PortalException e) {

		} catch (Exception e) {

		}


		// SystemConfigLocalServiceUtil.

	}

	private void changeAccessControlTriggeerWebservice()
			throws URISyntaxException {
		String accessControlChangeWebserviceUrl = GetterUtil
				.getString(PortletProps.get("access-control-change-webservice"));
		_log.info(accessControlChangeWebserviceUrl);
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate rest = new RestTemplate();
		URI uriaccessControlChangeWebserviceUrl = new URI(
				accessControlChangeWebserviceUrl);
		rest.exchange(uriaccessControlChangeWebserviceUrl, HttpMethod.POST,
				new HttpEntity<Object>(requestHeaders), String.class);
	}

	private void finalEnablingAndDisabling(ActionRequest req,
			ActionResponse res, List<AccessControlModel> a, String type,
			List<String> tobeenabledids, List<String> tobedisabled,
			List<String> disabledids, String bssid) throws PortletException,
			PortalException, SystemException, IOException {

		String enablediasbleids = AccessControlUtil
				.getTobeenableandDisabledIds(tobeenabledids, tobedisabled,
						disabledids);
		List<String> enableids = new ArrayList<String>();
		List<String> disableids = new ArrayList<String>();
		String deleteItemIds = StringPool.BLANK;
		String[] bundlearray = enablediasbleids.split(StringPool.COLON);
		String[] enableidsArray = null;
		String[] disableidsArray = null;
		if (bundlearray.length > 0) {
			if (bundlearray.length == 1) {
				enableidsArray = new String[bundlearray[0].length()];
				enableidsArray = bundlearray[0].split(StringPool.COMMA);
			} else if (bundlearray.length == 2) {
				enableidsArray = new String[bundlearray[0].length()];
				disableidsArray = new String[bundlearray[1].length()];
				enableidsArray = bundlearray[0].split(StringPool.COMMA);
				disableidsArray = bundlearray[1].split(StringPool.COMMA);
			}

		}

		if (enableidsArray != null) {
			enableids = Arrays.asList(enableidsArray);

		}
		if (disableidsArray != null) {
			disableids = Arrays.asList(disableidsArray);

		}

		if (a != null && a.size() > 0) {

			for (AccessControlModel a1 : a) {

				EPayAccessControl e = EPayAccessControlLocalServiceUtil
						.getEPayAccessControl(a1.getEpayAccessControlId());

				if (type != null && type.equalsIgnoreCase("pmttypes")) {

					if (e.getChannelId() != 0L) {

						if (enableids.size() > 0
								&& enableids.contains(e.getChannelId() + "")) {

							deleteItemIds = deleteItemIds + e.getEpayCofignId()
									+ StringPool.COLON;

						}

					}
				} else if (type != null && type.equalsIgnoreCase("srtypes")) {
					if (e.getServiceTypeId() != 0L) {
						if (enableids.size() > 0
								&& enableids
								.contains(e.getServiceTypeId() + "")) {
							deleteItemIds = deleteItemIds + e.getEpayCofignId()
									+ StringPool.COLON;

						}
					}

				} else if (type != null && type.equalsIgnoreCase("pmtMtdtypes")) {
					if (e.getPmtMethodId() != 0L) {
						if (enableids.size() > 0
								&& enableids.contains(e.getPmtMethodId() + "")) {
							deleteItemIds = deleteItemIds + e.getEpayCofignId()
									+ StringPool.COLON;

						}
					}

				}
			}

			if (!deleteItemIds.trim().equals("")) {
				String[] temp = deleteItemIds.split(StringPool.COLON);
				long[] deleteItemIdslong = new long[temp.length];
				int i = 0;
				for (String s : temp) {
					if (s != null && !s.trim().equals("")) {
						deleteItemIdslong[i] = Long.parseLong(s);
						i++;
					}
				}
				if (deleteItemIdslong != null && deleteItemIdslong.length > 0) {

					enableEPayAcessControl(req, res, deleteItemIdslong);
				}
			}

			if (disableids != null && disableids.size() > 0) {

				disableBusinessServices(req, res, disableids, type, bssid);
			}
		} else {
			if (disableids != null && disableids.size() > 0) {

				disableBusinessServices(req, res, disableids, type, bssid);
			}

		}

	}
	public boolean enableBusinessServiceWithAjaxCall(ResourceRequest request, ResourceResponse response,String  id){
		try {
			List<EPayAccessControl> e = EPayAccessControlLocalServiceUtil
					.findByServiceidAndStatus(GetterUtil.getLong(id),
							AuditUtil.STATUS_ACTIVE);
			System.out.println(e.size());

			if (Validator.isNotNull(e) && e.size() > 0) {
				long[] deleteid = new long[e.size()];
				int i = 0;
				for (EPayAccessControl e1 : e) {
					deleteid[i] = e1.getEpayCofignId();
					i++;
				}

				final EPayAccessControl accessControl = new EPayAccessControlImpl();
				//	enableEPayAcessControl(actionRequest, actionResponse, deleteid);
				ServiceContext serviceContext = ServiceContextFactory.getInstance(
						AccessControlConfig.class.getName(), request);

				Date dt = new Date();
				accessControl.setLastUpdateTimestamp(dt);
				accessControl.setEffectiveTimestamp(dt);
				accessControl.setLastUpdateUserid(serviceContext.getUserId() + "");
				accessControl.setClientIP(serviceContext.getRemoteAddr());
				accessControl.setServerIP(serviceContext.getRequest()
						.getLocalAddr());
				accessControl.setUserAgent(serviceContext.getUserAgent());
				accessControl.setTransId((UUID.randomUUID()).toString());

				accessControl.setLastUpdateUsername(UserLocalServiceUtil.getUser(
						serviceContext.getUserId()).getEmailAddress());

				accessControl.setOperation(AuditUtil.OPERATION_ADD);
				accessControl.setStatus(AuditUtil.STATUS_INACTIVE);
				EPayAccessControlLocalServiceUtil.enableEPayAcessControl(deleteid,
						accessControl);
				/*
				 * try { changeAccessControlTriggeerWebservice(); } catch
				 * (URISyntaxException e) { // TODO Auto-generated catch block
				 * e.printStackTrace(); }
				 */
				return true;
			}
		}  catch (PortalException e) {

		} catch (SystemException e) {

		}

		return false;

	}
}
