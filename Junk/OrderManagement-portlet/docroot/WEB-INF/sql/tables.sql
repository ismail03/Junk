create table Category (
	categoryid LONG not null primary key,
	categoryname VARCHAR(75) null
);

create table Orders (
	orderid LONG not null primary key,
	orderdate DATE null,
	productname VARCHAR(75) null,
	productpackage VARCHAR(75) null,
	orderstatus INTEGER,
	Subscription BOOLEAN,
	documnetid LONG,
	statusByUserId LONG,
	statusDate DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG
);

create table Orders_Category (
	categoryid LONG not null,
	orderid LONG not null,
	primary key (categoryid, orderid)
);