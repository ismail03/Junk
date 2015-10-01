package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.model.CardGroup;
import com.stc.echannels.epayments.model.PaymentSystem;
import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.CardGroupLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil;
import com.stc.echannels.exceptions.IntegrityViolationException;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class CardGroups
 */
public class CardGroups extends MVCPortlet {
 
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		
		super.doView(renderRequest, renderResponse);
	}
	/*
	 * ( long userId,String cardGroupId,
		      long cardValue, long promotionValue, String inPaymentSystem,String description,
		        long active, int effectiveMonth, int effectiveDay, int effectiveYear, int effectiveHour, int effectiveMinute,
		        ServiceContext serviceContext)
	 */
	public void addCardGroup(ActionRequest request,
			ActionResponse response) throws IOException, PortletException {
		
		String cardGroupId=ParamUtil.getString(request,"cardGroupId");
		long cardValue=ParamUtil.getLong(request,"cardValue");
		String inPaymentSystem=ParamUtil.getString(request,"inPaymentSystem");
		long promotionValue=ParamUtil.getLong(request,"promotionValue");
		
		
		long serviceId=ParamUtil.getLong(request,"serviceId");
		
		Date date = new Date();
		
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            CardGroup.class.getName(), request);
	
	
			CardGroupLocalServiceUtil.addCardGroup(cardGroupId, cardValue, promotionValue, inPaymentSystem, serviceId, serviceContext);
		}
		catch (IntegrityViolationException ive) {
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("jspPage","/html/cardgroups/edit_cardGroup.jsp"); 			
		}
		catch(PortalException portalException)
		{
		
		}
		catch(SystemException systemException)
		{
			
		}
		
	}
	

	public void addSystem(ActionRequest request,
			ActionResponse response) throws IOException, PortletException {
		
		String systemName=ParamUtil.getString(request,"systemName");
		String dateFormat=ParamUtil.getString(request,"dateFormat");

		Date date = new Date();
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            PaymentSystem.class.getName(), request);
	
			PaymentSystemLocalServiceUtil.addPaymentSystem( systemName, dateFormat, 1, date, serviceContext);
		}
		catch(PortalException portalException)
		{
		
		}
		catch(SystemException systemException)
		{
			
		}
		
	}
	
	public void addService(ActionRequest request,
			ActionResponse response) throws IOException, PortletException {
		
		String serviceName=ParamUtil.getString(request,"serviceName");
		String nameAr=ParamUtil.getString(request,"nameAr");
		String nameEn=ParamUtil.getString(request,"nameEn");
		

		Date date = new Date();
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            PaymentSystem.class.getName(), request);
	
			BusinessSrvLocalServiceUtil.addBusinessSrv(serviceName, nameAr, nameEn, 1, date, serviceContext);
		}
		catch(PortalException portalException)
		{
		
		}
		catch(SystemException systemException)
		{
			
		}
		
	}

	
	public void updateCardGroup(ActionRequest request, ActionResponse response)
	    throws Exception {
	
		try {
			_updateCardGroup(request);
		}
		catch (IntegrityViolationException ive) {
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("jspPage","/html/cardgroups/edit_cardGroup.jsp"); 			
		}
	}
	
	 private CardGroup _updateCardGroup(ActionRequest request)
		        throws PortalException, SystemException  
	{
		
		 String transId=ParamUtil.getString(request,"transId");
		String cardGroupId=ParamUtil.getString(request,"cardGroupId");
		long cardValue=ParamUtil.getLong(request,"cardValue");
		String inPaymentSystem=ParamUtil.getString(request,"inPaymentSystem");
		long promotionValue=ParamUtil.getLong(request,"promotionValue");
		
		
		long serviceId=ParamUtil.getLong(request,"serviceId");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            CardGroup.class.getName(), request);
	
		CardGroup cardGroup = null;

        if (null==transId || transId.isEmpty()) {
        	CardGroupLocalServiceUtil.addCardGroup(cardGroupId, cardValue, promotionValue, inPaymentSystem, serviceId, serviceContext);
        }
        else {
            

            cardGroup = CardGroupLocalServiceUtil.updateCardGroup( transId,cardGroupId, cardValue, promotionValue, inPaymentSystem, serviceId, serviceContext);
        }

        return cardGroup;
	}
	
	 public void deleteCardGroup(ActionRequest request, ActionResponse response)
		        throws Exception {
		 ServiceContext serviceContext = ServiceContextFactory.getInstance(
		            CardGroup.class.getName(), request);
			String transId=ParamUtil.getString(request,"transId");
			
	        CardGroupLocalServiceUtil.deleteCardGroup(transId,serviceContext);

	        sendRedirect(request, response);
	 }
}
