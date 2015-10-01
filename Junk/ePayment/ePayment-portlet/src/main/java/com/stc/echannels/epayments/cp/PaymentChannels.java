package com.stc.echannels.epayments.cp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpSession;

import stc.com.echannels.util.PaymentTransactionUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.BusinessSrv;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.PaymentChannelSr;
import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;
import com.stc.echannels.epayments.service.BankLocalServiceUtil;
import com.stc.echannels.epayments.service.BankServicesLocalServiceUtil;
import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelSrLocalServiceUtil;
import com.stc.echannels.epayments.service.impl.AuditUtil;
import com.stc.echannels.exceptions.IntegrityViolationException;

/**
 * Portlet implementation class PaymentChannels
 */
public class PaymentChannels extends MVCPortlet
{
	private static Logger  _log =Logger.getLogger("Banks.class");
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		try{
			//PaymentChannelLocalServiceUtil.deleteChannels();
			//	_log.info("in  do view");
		}
		catch(Exception e)
		{}
		super.doView(renderRequest, renderResponse);
	}

	public void addChannel(ActionRequest request,
			ActionResponse response) throws IOException, PortletException {

		//long channelId=ParamUtil.getLong(request,"channelId");
		String channelType=ParamUtil.getString(request,"channelType");
		String nameEn=ParamUtil.getString(request,"nameEn");
		String nameAr=ParamUtil.getString(request,"nameAr");

		String businessServices[]=request.getParameterValues("businessSrvcheck");
		//	_log.info("Check box"+businessServices.length);
		String tempjobcategory=StringPool.BLANK;
		for(int i=1;i<businessServices.length;i++)
		{
			if(businessServices[i].equalsIgnoreCase("true"))
			{

				tempjobcategory=tempjobcategory+1+"0"+i+StringPool.COMMA;
			}
		}

		//	_log.info(tempjobcategory);

		String serviceIds[] = tempjobcategory.split(StringPool.COMMA);


		Date date = new Date();
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					PaymentChannel.class.getName(), request);

			PaymentChannel p=	PaymentChannelLocalServiceUtil.addPaymentChannel(channelType.toUpperCase(Locale.ENGLISH), nameEn, nameAr,  serviceContext);
			_log.info("Payment channel added into DB Channel id"+p.getChannelId());
			addIntoPaymentServiceMap(p.getChannelId(),serviceIds);
			_log.info("Payment channel services map added "+tempjobcategory);

			SessionMessages.add(request, "success-pmt");

		}
		catch (IntegrityViolationException ive) {
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("jspPage","/html/paymentchannels/edit_channel.jsp");
		}
		catch(PortalException portalException)
		{

		}
		catch(SystemException systemException)
		{

		}

	}
	public void updateChannel(ActionRequest request, ActionResponse response)
	{
		String transid=	ParamUtil.getString(request,"transId");
		try{
			_updateChannel(request);
			SessionMessages.add(request, "success-pmt");
		}catch (IntegrityViolationException ive) {
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("transId", transid);
			response.setRenderParameter("jspPage","/html/paymentchannels/edit_channel.jsp");
		}
		catch(PortalException portalException)
		{

		}
		catch(SystemException systemException)
		{

		}
	}

	private PaymentChannel _updateChannel(ActionRequest request)
			throws PortalException, SystemException {

		String transId=ParamUtil.getString(request,"transId");
		//long channelId = ParamUtil.getLong(request, "channelId");

		String channelType=ParamUtil.getString(request,"channelType");
		String nameEn=ParamUtil.getString(request,"nameEn");
		String nameAr=ParamUtil.getString(request,"nameAr");
		String businessServices[]=request.getParameterValues("businessSrvcheck");
		//	_log.info("Check box"+businessServices.length);
		String tempjobcategory=StringPool.BLANK;
		for(int i=1;i<businessServices.length;i++)
		{
			if(businessServices[i].equalsIgnoreCase("true"))
			{

				tempjobcategory=tempjobcategory+1+"0"+i+StringPool.COMMA;
			}
		}

		//	_log.info(tempjobcategory);

		String serviceIds[] = tempjobcategory.split(StringPool.COMMA);
		Date date = new Date();

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				PaymentChannel.class.getName(), request);

		PaymentChannel channel = null;

		if (transId ==null || transId.isEmpty()) {
			channel=PaymentChannelLocalServiceUtil.addPaymentChannel( channelType.toUpperCase(Locale.ENGLISH), nameEn, nameAr, serviceContext);
			updatePaymentServiceMap(channel.getChannelId()+"", serviceIds);
		}
		else {
			// channel = PaymentChannelLocalServiceUtil.getPaymentChannel(transId);
			channel = PaymentChannelLocalServiceUtil.updatePaymentChannel(transId,  nameEn, nameAr, serviceContext);
			updatePaymentServiceMap(channel.getChannelId()+"", serviceIds);
		}

		return channel;
	}

	public void deleteChannel(ActionRequest request, ActionResponse response)
			throws Exception {
		String transId = ParamUtil.getString(request, "transId");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				PaymentChannel.class.getName(), request);
		try{
			PaymentChannel p = PaymentChannelLocalServiceUtil.deleteChannel(transId,serviceContext);
			if(Validator.isNotNull(p)){
				List<PaymentChannelSr>	pmtsr=PaymentChannelSrLocalServiceUtil.getBusinessServiceAssociatedWithPmtChannel(p.getChannelId()+"");
				if(pmtsr.size()>0){

					String[] toBeDeletedServices = new String[pmtsr.size()];
					int i=0;
					for(PaymentChannelSr s:pmtsr){
						toBeDeletedServices[i]=s.getServiceid()+"";
						i++;
					}
					deleteFromPaymentServiceMap(p.getChannelId(), toBeDeletedServices);
					_log.info("Payment channel Successfully Deleted "+p.getChannelId());
					SessionMessages.add(request, "success-pmt");
				}

			}else{
				_log.info("there is no service associated with Payment Channel id"+p.getChannelId());
			}

		}
		catch(IntegrityViolationException exception)
		{
			SessionErrors.add(request, "integrityViolation");
		}



	}

	/*	public void getPaymentChannelsOfservice(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		String type=ParamUtil.getString(actionRequest, "businessServiceType");
		if(type!=null && !(type.equalsIgnoreCase("0")))
		{


			actionRequest.setAttribute("pmtbsid", type);
		}
		else
		{
			actionRequest.setAttribute("none","none");
		}
	}*/
	public boolean addIntoPaymentServiceMap(long paymentid,String[] serviceid)throws PortalException,SystemException{
		String newTransId=StringPool.BLANK;
		PaymentChannelSr  psr=null;
		for(String srvid:serviceid){
			newTransId=(UUID.randomUUID()).toString();

			psr= PaymentChannelSrLocalServiceUtil.createPaymentChannelSr(newTransId);
			psr.setChannelid(paymentid);
			psr.setServiceid(GetterUtil.getLong(srvid));
			PaymentChannelSrLocalServiceUtil.addPaymentChannelSr(psr);
		}
		return true;
	}
	private void updatePaymentServiceMap(String channelid,String[] serviceids)throws PortalException,SystemException{
		List<PaymentChannelSr> pmtidWithService=PaymentChannelSrLocalServiceUtil.getBusinessServiceAssociatedWithPmtChannel(channelid);
		//	_log.info(pmtidWithService.size()+"size to existing buiseness service");

		String[] existing=new String[pmtidWithService.size()];
		// get ids from  bean objects
		int j=0;
		for(PaymentChannelSr s:pmtidWithService){
			existing[j]=String.valueOf(s.getServiceid());
			j++;

		}
		//			_log.info(existing.length+" String array size to existing buiseness service");

		//	    _log.info(serviceids.length+"selected Services lenght");

		Set<String> a = new HashSet<String>();
		Set<String> b = new HashSet<String>();

		a.addAll(Arrays.asList(existing));
		b.addAll(Arrays.asList(serviceids));
		ArrayList<String> whicharePresentonlyinsetb =new ArrayList<String>();
		String toBeAdded=StringPool.BLANK;
		String toBeDeleted=StringPool.BLANK;
		for(String s:serviceids)
		{
			if(a.contains(s)){
				//	_log.info("");
			}
			else
			{
				//	 _log.info("unique in newly selected"+s);

				toBeAdded=toBeAdded+s+StringPool.COMMA;
			}

		}

		for(String s:existing){
			if(b.contains(s)){
				// _log.info(" ");
			}
			else{
				toBeDeleted=toBeDeleted+s+StringPool.COMMA;

				//   _log.info("to be deleted"+s);
			}

		}


		String[] toAddedDispatch =toBeAdded.split(StringPool.COMMA);

		if(toAddedDispatch.length>0){

			if(toAddedDispatch.length==1 && toBeAdded.trim().equals(""))
			{

				//   _log.info("no newly selected Business Service to add");
			}else{
				//	   _log.info("dispatching to add method"+toBeAdded+toAddedDispatch.length);
				addIntoPaymentServiceMap(GetterUtil.getLong(channelid) , toAddedDispatch);
			}
		}
		String[] toDeleteDispatch =toBeDeleted.split(StringPool.COMMA);
		if(toDeleteDispatch.length>0){

			if(toDeleteDispatch.length==1 && toBeDeleted.trim().equals("")){
				//	   _log.info("no selected Business Service to Delete");
			}else{
				//   _log.info("dispatching to delete method"+toBeDeleted+toDeleteDispatch.length);
				deleteFromPaymentServiceMap(GetterUtil.getLong(channelid), toDeleteDispatch);
			}
		}
	}

	private void deleteFromPaymentServiceMap(long channelid, String[] serviceids) throws PortalException,SystemException{
		if(serviceids.length>0){
			//		_log.info(serviceids.length+" size of records to be deleted");

			List<PaymentChannelSr> all=	PaymentChannelSrLocalServiceUtil.getPaymentChannelSrs(-1, -1);
			List<String> ser = new ArrayList<String>(Arrays.asList(serviceids));
			for(PaymentChannelSr p:all)
			{
				if(p.getChannelid()==channelid && (ser.contains(String.valueOf(p.getServiceid())))   ) {
					PaymentChannelSrLocalServiceUtil.deletePaymentChannelSr(p);
					//		_log.info("deleted"+p.getChannelid());
				}


			}

		}else{

			//		_log.info("there is no services to be deleted");
		}
	}

	public void serveResource(ResourceRequest request, ResourceResponse response) {
		String	typevalidation =		ParamUtil.getString(request, "formtype");

		String businessserviceid =	ParamUtil.getString(request, "bsrid");
		String pmtidchnlid =	ParamUtil.getString(request, "pmtid");
		PortletRequestDispatcher dispatcher = null;

		try{if(Validator.isNotNull(typevalidation)){
			if(typevalidation.equals("pmtchannel")){

				boolean isexists = isfieldVaildPmt(request);
				String res = StringPool.BLANK;
				if(isexists)
					res = "yes";
				else
					res = "no";
				JSONObject json = JSONFactoryUtil.createJSONObject();
				json.put("res", res);
				PrintWriter out=response.getWriter();
				// System.out.println(json.toString());
				out.println(json.toString());
			}

		}
		else	if(Validator.isNotNull(businessserviceid)&& !businessserviceid.trim().equals("") && !businessserviceid.equals("bsempty")){
			List<PaymentChannel> channellist=	getPmtChnlByBsvr(businessserviceid);
			channellist= getPmtcnlCheckedAgainstTransaction(channellist);
			request.setAttribute("pmtcnllist",channellist );
			request.setAttribute("bsrid", businessserviceid);
			dispatcher=getPortletContext().getRequestDispatcher("/html/paymentchannels/display_pmtchnl.jsp");
			dispatcher.include(request, response);

		}else if(Validator.isNotNull(pmtidchnlid)&& !pmtidchnlid.trim().equals("") && !pmtidchnlid.equals("empty")){

			PaymentChannel p =	PaymentChannelLocalServiceUtil.getChannel(GetterUtil.getLong(pmtidchnlid));

			List<PaymentChannel> channels = new ArrayList<PaymentChannel>();
			if(Validator.isNotNull(p)){
				channels.add(p);
			}
			channels =	getPmtcnlCheckedAgainstTransaction(channels);
			request.setAttribute("pmtcnllist",channels );
			request.setAttribute("pmtid", pmtidchnlid);
			request.setAttribute("dispBrscolunm", "yes");
			request.setAttribute("bsrvs", getBusinessSrvByPmtchnl(pmtidchnlid));
			dispatcher = getPortletContext().getRequestDispatcher("/html/paymentchannels/display_pmtchnl.jsp");
			dispatcher.include(request, response);
		}


		}catch(SystemException e){}
		catch(PortletException e){}
		catch(IOException e){}
		catch(PortalException e){}
	}
	private List<PaymentChannel> getPmtChnlByBsvr(String bsvrid) throws SystemException{
		List<PaymentChannel> channels =PaymentChannelLocalServiceUtil.getPaymentChannels(AuditUtil.STATUS_ACTIVE,-1, -1);

		List<PaymentChannelSr> paymentchannelsr = PaymentChannelSrLocalServiceUtil.getPaymentChannelsAssociatedWithBuisnessServices(bsvrid);
		List<Long> channelid= new ArrayList<Long>();
		if(paymentchannelsr != null && paymentchannelsr.size()>0){




			for(PaymentChannelSr b:paymentchannelsr){
				channelid.add(b.getChannelid());
			}
		}
		List<PaymentChannel> filteredchannels = new ArrayList<PaymentChannel>();
		for(Long ids:channelid){
			label1:
				for(PaymentChannel p :channels){
					if(p.getChannelId()==ids)
					{
						filteredchannels.add(p);
						break label1;
					}
				}
		}

		return filteredchannels;
	}

	private List<PaymentChannel> getPmtcnlCheckedAgainstTransaction(List<PaymentChannel> channels) throws SystemException{


		List<Object> transactionPmtBankIds = PaymentTransactionUtil.getTransactionsRecordedProjections("channelId");
		if(transactionPmtBankIds != null){
			for(Object o : transactionPmtBankIds){
				if(o!=null){
					Long transactionPmtBankId = (Long)o;
					for(PaymentChannel channel1: channels){
						if(transactionPmtBankId == channel1.getChannelId() ){
							channel1.setPaymentTransactionRecorded(true);
						}
					}
				}
			}
		}
		return channels;
	}
	private String getBusinessSrvByPmtchnl(String channelid) throws SystemException{

		String businessSrv = "Not Available";
		final List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil.getBusinessServices();
		List<PaymentChannelSr> psr = PaymentChannelSrLocalServiceUtil.getBusinessServiceAssociatedWithPmtChannel(channelid);
		if(Validator.isNotNull(psr) && psr.size()>0){
			List<Long> existingBrs = new ArrayList<Long>();

			for(PaymentChannelSr s:psr){
				existingBrs.add(s.getServiceid());


			}businessSrv = StringPool.BLANK;
			for(BusinessSrv businessService : businessServices){

				if(existingBrs.contains(businessService.getServiceId())){
					businessSrv =businessSrv+businessService.getServiceNameEn()+StringPool.COLON;

				}
			}

		}
		return businessSrv;
	}
	private boolean isfieldVaildPmt(ResourceRequest req) throws SystemException{

		String fieldName= ParamUtil.getString(req, "fieldName");
		String fieldvalue= ParamUtil.getString(req, "fieldvalue");

		if(Validator.isNotNull(fieldName) &&  !fieldName.equals("fempty") && Validator.isNotNull(fieldvalue) && !fieldvalue.equals("fvempty")){
			//	System.out.println("fieldName"+fieldName);
			//	System.out.println("fieldvalue"+fieldvalue);
			if(fieldName.equals("channelType")){
				// return	BankLocalServiceUtil.isSamaBankCodeExists(fieldvalue);
				return	PaymentChannelLocalServiceUtil.isPmtchnlTypeExists(fieldvalue);
			}else if(fieldName.equals("nameAr")){
				String transId=	ParamUtil.getString(req, "transid");
				//	return BankLocalServiceUtil.isArnameExists(fieldvalue, transId);
				return	PaymentChannelLocalServiceUtil.isArnameExists(fieldvalue, transId);
			}else if(fieldName.equals("nameEn")){
				String transId=	ParamUtil.getString(req, "transid");
				//	return BankLocalServiceUtil.isEnnameExists(fieldvalue, transId);
				return		PaymentChannelLocalServiceUtil.isEnnameExists(fieldvalue, transId);
			}



		}

		return false;

	}
}