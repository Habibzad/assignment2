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
	
	//Default Constructor
	AccountHolder(){
			
	}
	
	//Parametarized Constructor
	AccountHolder(String firstName, String middleName, String lastName, String ssn){
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
	
	CheckingAccount[] getCheckingAccounts() {
		return null;
	}
	
	int getNumberOfCheckingAccounts() {
		return 0;
		
	}
	
	double getCheckingBalance() {
		return 0;
		
	}
	
	SavingsAccount[] getSavingsAccounts() {
		return null;
		
	}
	
	int getNumberOfSavingsAccounts(){
		return 0;
		
	}
	
	double getSavingsBalance() {
		return 0;
		
	}
	
	CDAccount[] getCDAccounts() {
		return null;
	}
	
	int getNumberOfCDAccounts(){
		return 0;
		
	}
	
	double getCDBalance() {
		return 0;
	}
	
	double getCombinedBalance() {
		return 0;
		
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
		return null;
	}
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		return null;
	}
	
	SavingsAccount addSavingsAccount(double openingBalance) {
		return null;
		
	}
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		return savingsAccount;
		
	}
	
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		return null;
		
	}
	
	CDAccount addCDAccount(CDAccount cdAccount) {
		return cdAccount;
		
	}
	
	
}