package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	//Constructor
	CheckingAccount(double balance) {
		super(balance, 0.0001); //Interest Rate: 0.01%
	}
}