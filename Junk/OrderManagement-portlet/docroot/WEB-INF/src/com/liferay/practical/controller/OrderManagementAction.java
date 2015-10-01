package com.liferay.practical.controller;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.mail.internet.AddressException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.model.WorkflowDefinitionLink;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.practical.model.Orders;
import com.liferay.practical.service.OrdersLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


/**
 * Portlet implementation class OrderManagementAction
 */
public class OrderManagementAction extends MVCPortlet {
	public void submitorder(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
		 AddressException,com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		String productname = ParamUtil.getString(uploadRequest, "productname");
		String productpackage = ParamUtil.getString(uploadRequest, "productpackage");
		
	boolean	subscription =ParamUtil.getBoolean(uploadRequest, "subscription");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Orders.class.getName(), uploadRequest);
		
		try {
		long docid=	uploadFileEntity(serviceContext,uploadRequest,themeDisplay);
			Orders	orders= OrdersLocalServiceUtil.createOrders(CounterLocalServiceUtil.increment());
			orders.setCompanyId(themeDisplay.getCompanyId());
			orders.setGroupId(themeDisplay.getScopeGroupId());
			orders.setOrderdate(new Date());
			orders.setProductname(productname);
			orders.setProductpackage(productpackage);
			orders.setSubscription(subscription);
			orders.setDocumnetid(docid);
			orders.setOrderstatus(WorkflowConstants.STATUS_DRAFT);
			orders.setUserId(themeDisplay.getUserId());
			orders.setStatusByUserId(themeDisplay.getUserId());
			orders=OrdersLocalServiceUtil.addOrders(orders);
			WorkflowDefinitionLink workflowDefinitionLink=null;
			try{
				 workflowDefinitionLink=WorkflowDefinitionLinkLocalServiceUtil.getDefaultWorkflowDefinitionLink(themeDisplay.getCompanyId(), Orders.class.getName(), 0, 0);
			}catch (Exception e) {
				if(e instanceof NoSuchWorkflowDefinitionLinkException){
					SessionMessages.add(actionRequest.getPortletSession(),"workflow-not-enabled");
				}
				e.printStackTrace();
			}
			//checking workflow defintion is enabled to feedback asset or not
			if(orders!=null&&workflowDefinitionLink!=null){
				//add feedback asset in asset entry table
				AssetEntryLocalServiceUtil.updateEntry(themeDisplay.getUserId(), orders.getGroupId(),
						Orders.class.getName(), orders.getOrderid(),
						serviceContext.getAssetCategoryIds(),
						serviceContext.getAssetTagNames());
				//start workflow instance to feedback.
				WorkflowHandlerRegistryUtil.startWorkflowInstance(
						orders.getCompanyId(), orders.getGroupId(), themeDisplay.getUserId(),
						Orders.class.getName(), orders.getPrimaryKey(), orders,
						serviceContext);
			}
			if(orders==null){
				SessionErrors.add(actionRequest.getPortletSession(),"orders-submit-failed");
			}else{
			 SessionMessages.add(actionRequest.getPortletSession(),"orders-submit-success");
			}
		} catch (Exception e) {
			if(e instanceof NoSuchWorkflowDefinitionLinkException){
				SessionMessages.add(actionRequest.getPortletSession(),"workflow-not-enabled");
			}
			e.printStackTrace();
		}
		actionResponse.setRenderParameter("mvcPath", "/html/ordermanagementaction/orders.jsp");
	}
	private long uploadFileEntity(ServiceContext serviceContext, 
	        UploadPortletRequest request,ThemeDisplay themeDisplay) 
	                throws PortalException, SystemException {

	    String filename = "";
	    String description = "File description";
Long fileid = 0L;
	    try{

	        // serviceContext.scopeGroupId is the groupId of a site
	        long repositoryId = themeDisplay.getCompanyGroupId();
	        
	        
	        Folder f =  getFolder(repositoryId, 0L, themeDisplay.getUser().getScreenName());
	       
		if(Validator.isNull(f)){
		f =	DLAppLocalServiceUtil.addFolder(themeDisplay.getUserId(), repositoryId,
					0L, themeDisplay.getUser().getScreenName(),
					"contains orders placed by this user", serviceContext);
			
		}

	        File file = request.getFile("file-to-upload");
	        filename = request.getFileName("file-to-upload");
	        String mimeType =  MimeTypesUtil.getContentType(file);
	        
	      
						
						
					
	   FileEntry entry = DLAppLocalServiceUtil.addFileEntry(serviceContext.getUserId(), 
	                repositoryId,  f.getFolderId(), filename, 
	                mimeType, filename, description, "", 
	                file, serviceContext
	        );  
	     fileid =   entry.getFileEntryId();
	    }catch(PortalException e){
	       
	        throw e;
	    }catch(SystemException e ){
	      
	        throw e;
	    }
	    
	 return fileid;
	}
	
private Folder getFolder(long repositoryid, long parentfolderid, String foldername) {
	Folder f = null;
	  try {
		 f = DLAppLocalServiceUtil.getFolder(repositoryid, parentfolderid,foldername);
	} catch (PortalException | SystemException e) {
		// TODO Auto-generated catch block
		System.out.println("there is no folder exist with given user id  therefore creating new folder");
	}
	  
	return f;
	} 
}
