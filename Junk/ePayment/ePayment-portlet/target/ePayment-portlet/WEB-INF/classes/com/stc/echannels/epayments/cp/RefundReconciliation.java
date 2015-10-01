package com.stc.echannels.epayments.cp;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import stc.com.echannels.util.JsonDateValueProcessor;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.service.ReconLogLocalServiceUtil;
import com.stc.echannels.epayments.service.RefundReconLogLocalServiceUtil;

/**
 * Portlet implementation class RefundReconciliation
 */
public class RefundReconciliation extends MVCPortlet {


	Log log = LogFactoryUtil.getLog(PaymentTransactions.class);
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		// Initialise search dates to last 30 days
		System.out.println("PARAMETER: " + renderRequest.getParameter("reconciliationDate"));
		SimpleDateFormat inputDateFormat = new SimpleDateFormat(CpConstants.DATE_FORMAT);
		Date endDate = new Date();

		if (StringUtils.isEmpty((String)renderRequest.getParameter("reconciliationDate"))) {
			renderRequest.setAttribute("dateTo", inputDateFormat.format(endDate));
		}
		else {
			renderRequest.setAttribute("reconciliationDate", (String)renderRequest.getParameter("reconciliationDate"));
		}


		
		super.doView(renderRequest, renderResponse);
	
	}
	//findTransactions
	
	public void findTransactions(ActionRequest request,ActionResponse response)
		    throws Exception {
		try {
			
			
			System.out.println("------------------------------");
			System.out.println("Bank Id =" +request.getParameter("pmtBankId"));
			System.out.println("Service ID="+request.getParameter("serviceId"));
			System.out.println("reconciliationDate="+request.getParameter("reconciliationDate"));
			
			if (!CpConstants.DEFAULT.equals(request.getParameter("pmtBankId"))) {
				response.setRenderParameter("pmtBankId",request.getParameter("pmtBankId"));
			}
			if (!CpConstants.DEFAULT.equals(request.getParameter("serviceId"))) {
				response.setRenderParameter("serviceId",request.getParameter("serviceId"));
			}
			response.setRenderParameter("reconciliationDate",request.getParameter("reconciliationDate"));

			if (!CpConstants.DEFAULT.equals(request.getParameter("reconciliationType"))) {
				response.setRenderParameter("reconciliationType",request.getParameter("reconciliationType"));
			}
		
			// validate dates
			if (!StringUtils.isEmpty(request.getParameter("reconciliationDate"))) {
				System.out.println("FROM: " + request.getParameter("reconciliationDate"));
				SimpleDateFormat sdf = new SimpleDateFormat(CpConstants.DATE_FORMAT);
				Date from = sdf.parse(request.getParameter("reconciliationDate"));
			}
		}
		catch (Exception se) {
		se.printStackTrace();
		}
		
		List reconLog=RefundReconLogLocalServiceUtil.findTransactions(
				request.getParameter("serviceId"), 
				request.getParameter("reconciliationDate"),
				request.getParameter("pmtBankId"),
				request.getParameter("reconciliationType"),
				request.getLocale());
		System.out.println("SIZIIZIEIEEISII: " + reconLog.size());
		if (reconLog.size()>0) {
			
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(java.sql.Timestamp.class, new JsonDateValueProcessor());
			jsonConfig.setExcludes(new String[]{"new", "cachedModel","primaryKey","columnBitmask","escapedModel", "expandoBridge", "expandoBridgeAttributes", "modelAttributes", "modelClass", "modelClassName", "primaryKeyObj" });
			
			JSONArray data=new JSONArray();
			for (int i=0; i<reconLog.size(); i++) {
				JSONArray record=JSONArray.fromObject(reconLog.get(i), jsonConfig);
				JSONObject json=record.getJSONObject(0);
				//json.put("pmtBankId", record.getString(1));
				//json.put("serviceId", record.getString(2));
				json.put("epayTransId", record.getString(1));
				json.put("submissionDate", record.getString(2));
				json.put("serviceId", record.getString(4));
				System.out.println(json.toString());
				
				data.add(json);
			}
			
			response.setRenderParameter("data", data.toString());
		}
		response.setRenderParameter("valid", "true");
	}


}
