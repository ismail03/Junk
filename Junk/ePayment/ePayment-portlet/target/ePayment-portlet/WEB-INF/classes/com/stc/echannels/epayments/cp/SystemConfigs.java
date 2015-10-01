package com.stc.echannels.epayments.cp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.SystemConfig;
import com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil;

/**
 * Portlet implementation class SystemConfigs
 */
public class SystemConfigs extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(SystemConfigs.class);

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            PaymentChannel.class.getName(), renderRequest);
		//SystemConfigLocalServiceUtil.addSystemConfig(101, 201, "{302:\"true\"}", serviceContext);
		}
		catch(Exception e)
		{
			
		}
		super.doView(renderRequest, renderResponse);
	}

	
	public void viewSystemConfig(ActionRequest request, ActionResponse response)
		    throws Exception {
		log.info("**********************************************");
		log.warn("**********************************************");
		log.error("**********************************************");
		log.info("**********************************************");
		log.info("**********************************************");
		log.info("**********************************************");
		
		log.info("**********************************************"+LanguageUtil.get(getPortletConfig(), request.getLocale(), "bank-name"));
		
		long serviceId= ParamUtil.getLong(request, "serviceId");
		
		response.setRenderParameter("serviceId", ""+serviceId );
		   // _viewSystemConfig(request);
		String columns=SystemConfigLocalServiceUtil.getColumns(getPortletConfig(), request.getLocale(),serviceId);
		log.info("********************* columns =   "+columns + "  **************************");
		
		JSONArray json = JSONArray.fromObject(columns);
		int size = json.size();
		for (int i=1; i<size; i++) {
			JSONObject o = json.getJSONObject(i);
			o.put("allowHTML", true);
			o.put("formatter", "<input type=\"checkbox\" {value} />");
			//o.put("emptyCellValue", "");
		}
		columns = json.toString();
		response.setRenderParameter("columns",columns );
		
		String data = SystemConfigLocalServiceUtil.getData(request.getLocale(),serviceId);
		data = data.replaceAll("true", "checked");
		data = data.replaceAll("false", "");
		
		log.info("**********************************************");
		
		log.info("**********************************************");
		
		log.info("********************* data =   "+data + "  **************************");
		response.setRenderParameter("data", data );
		//request.setAttribute("data", SystemConfigLocalServiceUtil.getData(request.getLocale()));
		}
	 public void serveResource(ResourceRequest request, ResourceResponse response) {
		 ServiceContext serviceContext=null;	
		 ParamUtil.print(request);
		 log.info("Contenet Type :   " +request.getContentType());
		 log.info("Contenet Count :   " +request.getContentLength());
		
		 log.info("response Contenet Type :   " + request.getResponseContentType());
		 
		 try{
				 serviceContext = ServiceContextFactory.getInstance(
		            PaymentChannel.class.getName(), request);
			//SystemConfigLocalServiceUtil.addSystemConfig(101, 201, "{302:\"true\"}", serviceContext);
			}
			catch(Exception e)
			{
				
			}
		 String config = ParamUtil.getString(request , "configsData"); 
		 config = config.replaceAll("checked", "true");
		 try {
			SystemConfigLocalServiceUtil.saveSystemConfigs(ParamUtil.getLong(request, "serviceId"), config, serviceContext);
		
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	 SystemConfigLocalServiceUtil.
	 }

}

