/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.stc.echannels.epayments.model.impl;

/**
 * The extended model implementation for the NotifConfig service. Represents a row in the &quot;NOTIF_CONFIG_MGR&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.model.NotifConfig} interface.
 * </p>
 *
 * @author ahmed_fadlus
 */
public class NotifConfigImpl extends NotifConfigBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a notif config model instance should use the {@link com.stc.echannels.epayments.model.NotifConfig} interface instead.
	 */
	public NotifConfigImpl() {
	}
	
	public String getEnMsgWithParams()
	{
		String msgEn=this.getMsgEn();
		msgEn=msgEn.replace("{0}", "{"+this.getParam1()+"}");
		msgEn=msgEn.replace("{1}", "{"+this.getParam2()+"}");
		msgEn=msgEn.replace("{2}", "{"+this.getParam3()+"}");
		msgEn=msgEn.replace("{3}", "{"+this.getParam4()+"}");
		msgEn=msgEn.replace("{4}", "{"+this.getParam5()+"}");
		System.out.println("msgEn " +msgEn);
		return msgEn;
	}
	
	public String getArMsgWithParams()
	{
		String msgEn=this.getMsgAr();
		msgEn=msgEn.replace("{0}", "{"+this.getParam1()+"}");
		msgEn=msgEn.replace("{1}", "{"+this.getParam2()+"}");
		msgEn=msgEn.replace("{2}", "{"+this.getParam3()+"}");
		msgEn=msgEn.replace("{3}", "{"+this.getParam4()+"}");
		msgEn=msgEn.replace("{4}", "{"+this.getParam5()+"}");
		System.out.println("msgEn " +msgEn);
		return msgEn;
	}
}