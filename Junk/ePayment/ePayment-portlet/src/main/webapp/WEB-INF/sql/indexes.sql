create index IX_7C2E3627 on BANK_CODES_MAP (SAMA_BANK_CODE, active);
create index IX_D0C13837 on BANK_CODES_MAP (STC_BANK_CODE, active);
create index IX_A540A200 on BANK_CODES_MAP (active);
create index IX_F4943BAE on BANK_CODES_MAP (active, BANK_ID);

create index IX_16A7B5C2 on BRANCH_CODES_MAP (BANK_ID);
create index IX_7E036A20 on BRANCH_CODES_MAP (BANK_ID, PAYMENT_CHANNEL_ID, active);
create index IX_745C2CF9 on BRANCH_CODES_MAP (BANK_ID, STC_BRANCH_CODE, PAYMENT_CHANNEL_ID, active);
create index IX_14EF4CBC on BRANCH_CODES_MAP (BANK_ID, active);
create index IX_FDF8BDAB on BRANCH_CODES_MAP (STC_BRANCH_CODE, active);
create index IX_51BA0E66 on BRANCH_CODES_MAP (active);

create index IX_1EB889AD on IN_CARD_GROUPS (CARD_GROUP, active);
create index IX_151B9BE7 on IN_CARD_GROUPS (CARD_VALUE, IN_PAYMENT_SYSTEM, active);
create index IX_C12F0D49 on IN_CARD_GROUPS (active);

create index IX_189CD968 on NOTIF_CONFIG_MGR (NOTIF_ID, active);
create index IX_5ADC8183 on NOTIF_CONFIG_MGR (SERVICE_ID, active);
create index IX_A4CAA64A on NOTIF_CONFIG_MGR (active);

create index IX_DA6A4DEB on NOTIF_PARAMS (NOTIF_NAME_AR);
create index IX_DA6C1063 on NOTIF_PARAMS (NOTIF_NAME_EN);
create index IX_722B170B on NOTIF_PARAMS (NOTIF_PARAM_ID);

create index IX_B26F90C7 on NOTIF_PARAMS_SERVICES (SERVICE_ID);

create index IX_4168E989 on PAYMENT_CHANNELS (active);
create index IX_32E7EEB4 on PAYMENT_CHANNELS (channel_Id, active);
create index IX_6F34B2B3 on PAYMENT_CHANNELS (channel_type, active);

create index IX_1F88E2DC on PAYMENT_METHODS (PMT_METHOD_Id, active);
create index IX_188434DB on PAYMENT_METHODS (PMT_METHOD_TYPE, active);
create index IX_424199B9 on PAYMENT_METHODS (active);

create index IX_F64CBBAB on PAYMENT_SYSTEMS (active);

create index IX_DBD640BB on SDD_PAYMENTS (PAYMENT_CHANNEL);

create index IX_683FF99E on SERVICES (active);

create index IX_E40C908B on SYSTEM_CONFIG_MGR (active);
create index IX_FE5E1B4A on SYSTEM_CONFIG_MGR (service_Id);
create index IX_AACBAA44 on SYSTEM_CONFIG_MGR (service_Id, active);
create index IX_9607ABE on SYSTEM_CONFIG_MGR (service_Id, bank_Id, active);

create index IX_BF318498 on TRANSACTION_STATUS (NAME);
create index IX_2C2A1252 on TRANSACTION_STATUS (SERVICE_ID);