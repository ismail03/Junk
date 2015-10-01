package com.stc.echannels.epayments.service.persistence;

public interface BankFinder {
    public java.util.List getBanksByBusinessServiceId(long serviceid);
}
