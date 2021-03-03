package com.meritamerica.assignment2;

public class BankAccount {
	//Static variables
	private static final double INTEREST_RATE = 0.1;
	
	//Instance variables
	private long accountNumber;
	private double balance;
	private double interestRate;
	
	//Constructor
	BankAccount(double balance){
		this.balance = balance;
	}
	
	BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	/*
	 *===========
	 *Getters
	 *===========
	 */
	long getAccountNumber() {
		return accountNumber;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	boolean withdraw(double amount){
		if(amount>balance) {
			balance-=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean deposit (double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	double futureValue(int years) {
		return balance*Math.pow((1+INTEREST_RATE), years);
	}

}
