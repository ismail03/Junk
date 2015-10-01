create table BANK_CODES_MAP (
	TRANS_ID VARCHAR(75) not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	CLIENT_IP VARCHAR(75) null,
	SERVER_IP VARCHAR(75) null,
	USER_AGENT VARCHAR(200) null,
	OPERATION VARCHAR(75) null,
	BANK_ID LONG,
	SAMA_BANK_CODE VARCHAR(75) null,
	STC_BANK_CODE VARCHAR(75) null,
	BANK_NAME_EN VARCHAR(75) null,
	BANK_NAME_AR VARCHAR(75) null,
	COMMENTS VARCHAR(75) null
);

create table BRANCH_CODES_MAP (
	TRANS_ID VARCHAR(75) not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	CLIENT_IP VARCHAR(75) null,
	SERVER_IP VARCHAR(75) null,
	USER_AGENT VARCHAR(200) null,
	OPERATION VARCHAR(75) null,
	STC_BRANCH_CODE VARCHAR(75) null,
	BANK_ID LONG,
	PAYMENT_CHANNEL_ID LONG
);

create table IN_CARD_GROUPS (
	TRANS_ID VARCHAR(75) not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	CLIENT_IP VARCHAR(75) null,
	SERVER_IP VARCHAR(75) null,
	USER_AGENT VARCHAR(200) null,
	OPERATION VARCHAR(75) null,
	CARD_GROUP VARCHAR(75) null,
	CARD_VALUE LONG,
	PROMOTION_VALUE LONG,
	IN_PAYMENT_SYSTEM VARCHAR(75) null,
	SERVICE_ID LONG
);

create table NOTIF_CONFIG_MGR (
	TRANS_ID VARCHAR(75) not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	CLIENT_IP VARCHAR(75) null,
	SERVER_IP VARCHAR(75) null,
	USER_AGENT VARCHAR(200) null,
	OPERATION VARCHAR(75) null,
	SERVICE_ID LONG,
	ENABLED VARCHAR(75) null,
	NOTIF_ID LONG,
	NOTIF_NAME VARCHAR(75) null,
	NOTIF_MSG_EN VARCHAR(200) null,
	NOTIF_MSG_AR VARCHAR(200) null,
	DESCRIPTIVE_NAME_EN VARCHAR(75) null,
	DESCRIPTIVE_NAME_Ar VARCHAR(75) null,
	NOTIF_PARAM_1 LONG,
	NOTIF_PARAM_2 LONG,
	NOTIF_PARAM_3 LONG,
	NOTIF_PARAM_4 LONG,
	NOTIF_PARAM_5 LONG
);

create table NOTIF_PARAMS (
	NOTIF_PARAM_ID LONG not null primary key,
	NOTIF_NAME_AR VARCHAR(75) null,
	NOTIF_NAME_EN VARCHAR(75) null,
	NOTIF_PARAM_NAME VARCHAR(75) null
);

create table NOTIF_PARAMS_SERVICES (
	TRANS_ID VARCHAR(75) not null primary key,
	NOTIF_PARAM_ID LONG,
	SERVICE_ID LONG
);

create table PAYMENT_CHANNELS (
	TRANS_ID VARCHAR(75) not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	CLIENT_IP VARCHAR(75) null,
	SERVER_IP VARCHAR(75) null,
	USER_AGENT VARCHAR(200) null,
	OPERATION VARCHAR(75) null,
	channel_Id LONG,
	channel_type VARCHAR(75) null,
	descriptive_name_en VARCHAR(75) null,
	descriptive_name_ar VARCHAR(75) null
);

create table PAYMENT_METHODS (
	TRANS_ID VARCHAR(75) not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	CLIENT_IP VARCHAR(75) null,
	SERVER_IP VARCHAR(75) null,
	USER_AGENT VARCHAR(200) null,
	OPERATION VARCHAR(75) null,
	PMT_METHOD_Id LONG,
	DESCRIPTIVE_NAME VARCHAR(75) null,
	PMT_METHOD_TYPE VARCHAR(75) null
);

create table PAYMENT_SYSTEMS (
	IN_PAYMENT_SYSTEM LONG not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	system_name VARCHAR(75) null,
	date_format VARCHAR(75) null
);

create table SERVICES (
	service_Id LONG not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	service_name VARCHAR(75) null,
	service_type VARCHAR(75) null,
	descriptive_name_en VARCHAR(75) null,
	descriptive_name_ar VARCHAR(75) null
);

create table SYSTEM_CONFIG_MGR (
	TRANS_ID VARCHAR(75) not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active VARCHAR(75) null,
	effective_timestamp DATE null,
	CLIENT_IP VARCHAR(75) null,
	SERVER_IP VARCHAR(75) null,
	USER_AGENT VARCHAR(200) null,
	OPERATION VARCHAR(75) null,
	service_Id LONG,
	bank_Id LONG,
	config_code VARCHAR(200) null
);

create table TRANSACTION_STATUS (
	ID LONG not null primary key,
	NAME VARCHAR(75) null,
	DESCRIPTION VARCHAR(75) null,
	SERVICE_ID LONG
);

create table epayments_CardGroup (
	CARD_GROUP VARCHAR(75) not null,
	CARD_VALUE LONG not null,
	IN_PAYMENT_SYSTEM VARCHAR(75) not null,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active LONG,
	effective_timestamp DATE null,
	PROMOTION_VALUE LONG,
	SERVICE_ID VARCHAR(75) null,
	primary key (CARD_GROUP, CARD_VALUE, IN_PAYMENT_SYSTEM)
);

create table epayments_PaymentChannel (
	channel_Id LONG not null primary key,
	last_update_timsetamp DATE null,
	last_update_userid VARCHAR(75) null,
	last_update_username VARCHAR(75) null,
	active LONG,
	effective_timestamp DATE null,
	channel_type VARCHAR(75) null,
	descriptive_name_en VARCHAR(75) null,
	descriptive_name_ar VARCHAR(75) null
);