package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	private int term;
    private CDOffering offering;
    private double balance;
    private Date startDate;

    CDAccount(CDOffering offering, double balance) {
    	super(balance, offering.getInterestRate());
        this.offering = offering;
        this.balance = balance;
    }

    /*
     * =========== Getters ===========
     */

    double getBalance() {
        if (balance > 0) {
            return balance;
        } else
            return 0;
    }

    int getTerm() {
    	this.term = this.offering.getTerm();
		return this.term;
    }

    public Date getStartDate() {
		return startDate;
	}

    long getAccountNumber() {
        return (long) ((Math.ceil(Math.random() * 10) + 1000));
    }

    
    public void setBalance(double balance) {
		this.balance = balance;
	}
    
    double futureValue() {
        return balance * Math.pow(1 + offering.getInterestRate(), offering.getTerm());
    }
    
    public void setOffering(CDOffering offering) {
		this.offering = offering;
	}
    
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}