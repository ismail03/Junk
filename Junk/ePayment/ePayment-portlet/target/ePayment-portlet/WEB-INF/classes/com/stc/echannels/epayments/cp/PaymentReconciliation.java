package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.service.ReconLogLocalServiceUtil;

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

/**
 * Portlet implementation class PaymentReconciliation
 */
public class PaymentReconciliation extends MVCPortlet {
 
	Log log = LogFactoryUtil.getLog(PaymentTransactions.class);
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		// Initialise search dates to last 30 days
		System.out.println("PARAMETER: " + renderRequest.getParameter("dateFrom"));
		SimpleDateFormat inputDateFormat = new SimpleDateFormat(CpConstants.DATE_FORMAT);
		Date endDate = new Date();
		Date startDate = DateUtils.addMonths(endDate, -1);
		
		if (StringUtils.isEmpty((String)renderRequest.getParameter("dateFrom"))) {
			renderRequest.setAttribute("dateFrom", inputDateFormat.format(startDate));
		}
		else {
			renderRequest.setAttribute("dateFrom", (String)renderRequest.getParameter("dateFrom"));
		}
		if (StringUtils.isEmpty((String)renderRequest.getParameter("dateTo"))) {
			renderRequest.setAttribute("dateTo", inputDateFormat.format(endDate));
		}
		else {
			renderRequest.setAttribute("dateTo", (String)renderRequest.getParameter("dateTo"));
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
			System.out.println("transAmount="+request.getParameter("transAmount"));
			System.out.println("date="+request.getParameter("date"));
			
			if (!CpConstants.DEFAULT.equals(request.getParameter("pmtBankId"))) {
				response.setRenderParameter("pmtBankId",request.getParameter("pmtBankId"));
			}
			if (!CpConstants.DEFAULT.equals(request.getParameter("serviceId"))) {
				response.setRenderParameter("serviceId",request.getParameter("serviceId"));
			}
			response.setRenderParameter("date",request.getParameter("date"));
			//System.out.println("---------------"+request.getParameter("paymentStatus"));
			if (!CpConstants.DEFAULT.equals(request.getParameter("paymentStatus"))) {
				response.setRenderParameter("paymentStatus",request.getParameter("paymentStatus"));
			}
		
		}
		catch (Exception se) {
		se.printStackTrace();
		}
		
		List reconLog=ReconLogLocalServiceUtil.findTransactions(
				request.getParameter("serviceId"), 
				request.getParameter("date"),
				request.getParameter("paymentStatus"),
				request.getParameter("pmtBankId"),
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
				//{"paymentStatus":"SUCCESS",,"new":false,"serviceId":101,"paymentChannel":"WEB","paymentMethod":"CCARD"},"Riyad Banque","CREDIT CARD","My Stc"]
				json.put("pmtBankId", record.getString(1));
				json.put("serviceId", record.getString(2));
				json.put("paymentMethod", record.getString(3));
				json.put("paymentChannel", record.getString(4));
				json.put("transactionDate", record.getString(5));
				json.put("transactionId", record.getString(6));
				System.out.println(json.toString());
				
				data.add(json);
			}
			
			response.setRenderParameter("data", data.toString());
		}
		response.setRenderParameter("valid", "true");
	}

}
