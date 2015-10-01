package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel;
import com.stc.echannels.epayments.service.PaymentTransactionsLocalServiceUtil;

import java.io.IOException;
import java.text.DateFormat;
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
 * Portlet implementation class RefundTransactions
 */
public class RefundTransactions extends MVCPortlet {
 
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
		
		
		DateFormat df = new SimpleDateFormat(CpConstants.DATE_FORMAT);
		String serviceId = ParamUtil.getString(request,"serviceId");
		String pmtBankId = ParamUtil.getString(request,"pmtBankId");
		String paymentChannel = ParamUtil.getString(request,"paymentChannel");
		String paymentMethod = ParamUtil.getString(request,"paymentMethod");
		String serviceTypes = ParamUtil.getString(request,"serviceTypes");
		String refundStatus = ParamUtil.getString(request,"refundStatus");
		String beneficiaryServiceNo = ParamUtil.getString(request,"beneficiaryServiceNo");
		String beneficiaryId = ParamUtil.getString(request,"beneficiaryId");
		String transId = ParamUtil.getString(request,"transId");
		long transAmount = ParamUtil.getLong(request,"transAmount");
		String accountNumber = ParamUtil.getString(request,"accountNumber");
		Date dateFrom = ParamUtil.getDate(request,"dateFrom",df);
		Date dateTo = ParamUtil.getDate(request,"dateTo",df);
		
		RefundTransactionsCustomModel refundTransactionsCustomModel = new RefundTransactionsCustomModel(transId, accountNumber, serviceTypes, transAmount, paymentMethod, paymentChannel, pmtBankId,new Date(), new Date(), "", "",beneficiaryId, beneficiaryServiceNo, serviceId,refundStatus, "", 0, dateFrom, dateFrom, dateTo);

		try {
			
			
			System.out.println("------------------------------");
			
			if (!CpConstants.DEFAULT.equals(request.getParameter("pmtBankId"))) {
				response.setRenderParameter("pmtBankId",request.getParameter("pmtBankId"));
			}
			if (!CpConstants.DEFAULT.equals(request.getParameter("serviceId"))) {
				response.setRenderParameter("serviceId",request.getParameter("serviceId"));
			}
			response.setRenderParameter( "transAmount",request.getParameter("transAmount"));
			response.setRenderParameter("dateFrom",request.getParameter("dateFrom"));
			response.setRenderParameter("dateTo",request.getParameter("dateTo"));
			//System.out.println("---------------"+request.getParameter("paymentStatus"));
			if (!CpConstants.DEFAULT.equals(request.getParameter("paymentChannel"))) {
				response.setRenderParameter("paymentChannel", request.getParameter("paymentChannel"));
			}  
			if (!CpConstants.DEFAULT.equals(request.getParameter("paymentMethod"))) {
				response.setRenderParameter("paymentMethod",request.getParameter("paymentMethod"));
			}
			if (!CpConstants.DEFAULT.equals(request.getParameter("refundStatus"))) {
				response.setRenderParameter("refundStatus",request.getParameter("refundStatus"));
			}
			
			response.setRenderParameter("beneficiaryId", request.getParameter("beneficiaryId"));
			response.setRenderParameter("beneficiaryServiceNo",request.getParameter("beneficiaryServiceNo"));
			
		
			// validate dates
			if (!StringUtils.isEmpty(request.getParameter("dateFrom"))) {
				System.out.println("FROM: " + request.getParameter("dateTo"));
				SimpleDateFormat sdf = new SimpleDateFormat(CpConstants.DATE_FORMAT);
				Date from = sdf.parse(request.getParameter("dateFrom"));
				if (!StringUtils.isEmpty(request.getParameter("dateTo"))) {		
					Date to = sdf.parse(request.getParameter("dateTo"));
					if (to == null || to.getTime()<=from.getTime()) {
						SessionErrors.add(request, "invalid-date-period");
						return;
					}
				}
				else {
					SessionErrors.add(request, "missing-to-date");
					return;
				}
			}
		}
		catch (Exception se) {
		se.printStackTrace();
		}
		
		List<RefundTransactionsCustomModel> refundTransactionsCustomModels = PaymentTransactionsLocalServiceUtil.findCustomRefundTransactions(refundTransactionsCustomModel);

		System.out.println("SIZIIZIEIEEISII: " + refundTransactionsCustomModels.size());
		if (refundTransactionsCustomModels.size()>0) {
			
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(java.sql.Timestamp.class, new JsonDateValueProcessor());
			jsonConfig.setExcludes(new String[]{"cachedModel","primaryKey","columnBitmask","escapedModel", "expandoBridge", "expandoBridgeAttributes", "modelAttributes", "modelClass", "modelClassName", "primaryKeyObj" });
			
			JSONArray data=new JSONArray();
			for (int i=0; i<refundTransactionsCustomModels.size(); i++) {
				JSONArray record=JSONArray.fromObject(refundTransactionsCustomModels.get(i), jsonConfig);
				JSONObject json=record.getJSONObject(0);
				data.add(json);
			}
			
			response.setRenderParameter("data", data.toString());
		}
		response.setRenderParameter("valid", "true");
	}
	

}
