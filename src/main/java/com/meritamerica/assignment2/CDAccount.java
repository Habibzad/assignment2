package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {
	private int term;
	private double balance;
	private double interestRate;
	private long accountNumber;
	CDAccount(CDOffering offering, double balance){
		
	}
	
	/*
	 *===========
	 *Getters
	 *===========
	 */
	
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	int getTerm() {
		return term;
	}
	
	java.util.Date getStartDate(){
		return null;
		
	}
	
	long getAccountNumber() {
		return accountNumber;
	}
	
	double futureValue() {
		return 0;
	}
}
