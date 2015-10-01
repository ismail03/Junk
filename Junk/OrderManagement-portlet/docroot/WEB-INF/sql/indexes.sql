create index IX_E19909BD on Orders (companyId);
create index IX_A862DB7F on Orders (groupId);
create index IX_41DBFFD1 on Orders (groupId, orderstatus);
create index IX_1ED715FF on Orders (productname);

create index IX_5FEBCCAB on Orders_Category (categoryid);
create index IX_25FA34BB on Orders_Category (orderid);