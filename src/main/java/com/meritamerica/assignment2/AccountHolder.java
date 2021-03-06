package com.meritamerica.assignment2;
import java.util.Arrays;

/**
 * This class contains the information pertaining to the account holder
 * @author Ahmad Habibzad
 */

public class AccountHolder {
	/*
	 *=================
	 *Instance variabls
	 *================= 
	 */
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	CheckingAccount[] checkingAccounts = new CheckingAccount[0];
	SavingsAccount[] savingsAccounts = new SavingsAccount[0];
	CDAccount[] cdAccounts = new CDAccount[0];
	private int numberOfCheckingAccounts = 0;
	private int numberOfSavingsAccounts = 0;
	private int numberOfCDAccounts = 0;

	//Default Constructor
	AccountHolder(){}
	
	//Parametarized Constructor
	AccountHolder(String firstName, String middleName, String lastName, String ssn)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn=ssn;
	}
	
	/*
	 *=======
	 *Getters
	 *======= 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public int getNumberOfCheckingAccounts() {
		return checkingAccounts.length;	
	}
	
	public double getCheckingBalance() {
		int counter = 0;
	    int checkingBalance = 0;
	    while(checkingAccounts[counter] != null) {
	    	checkingBalance += checkingAccounts[counter].getBalance();
	    	counter++;
	    }
	    return checkingBalance;
	}
	
	public int getNumberOfSavingsAccounts(){
		return savingsAccounts.length;
		
	}
	
	public double getSavingsBalance() {
		int count = 0;
	    double savingsBalance = 0;
	    while(savingsAccounts[count] != null) {
	    	savingsBalance += savingsAccounts[count].getBalance();
	    	count++;
	    }
	    return savingsBalance;
	}
	
	public int getNumberOfCDAccounts(){
		return cdAccounts.length;
	}
	
	public double getCDBalance() {
		 int counter = 0;
		    int totalCDBalance = 0;
		    while(cdAccounts[counter] != null) {
		    	totalCDBalance += cdAccounts[counter].getBalance();
		    	counter++;
		    }
		    return totalCDBalance;
	}
	
	public double getCombinedBalance() {
		return getCheckingBalance() + getSavingsBalance () + getCDBalance();
	}
	
	CheckingAccount[] getCheckingAccounts() {
		return checkingAccounts ;
	}
	
	SavingsAccount[] getSavingsAccounts() {
		return savingsAccounts;
	}
	
	CDAccount[] getCDAccounts() {
		return cdAccounts;
	}
	/*
	 *=======
	 *Setters
	 *======= 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	/*
	 *=======
	 *Add Account methods
	 *======= 
	 */
	
	CheckingAccount addCheckingAccount(double openingBalance) {
		CheckingAccount newAccount = new CheckingAccount(openingBalance);
		return newAccount;
	}
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if(getCombinedBalance() < 245000) {
			numberOfCheckingAccounts++;
			return this.checkingAccounts[numberOfCheckingAccounts] = checkingAccount;
		  }	else
		  return null;
	}
	
	SavingsAccount addSavingsAccount(double openingBalance) {
		return new SavingsAccount(openingBalance);
		
	}
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		 if(this.getCombinedBalance() < 245000) {
			 numberOfSavingsAccounts++;
			  return this.savingsAccounts[numberOfSavingsAccounts] = savingsAccount;
		  }	else
		  return null;
		
	}
	
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		return new CDAccount(offering, openingBalance);
		
	}
	
	CDAccount addCDAccount(CDAccount cdAccount) {
		numberOfCDAccounts++;
		return this.cdAccounts[numberOfCDAccounts] = cdAccount;
	}
	
	
}