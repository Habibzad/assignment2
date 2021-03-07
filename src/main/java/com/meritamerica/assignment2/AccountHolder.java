package com.meritamerica.assignment2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class contains the information pertaining to the account holder
 * 
 * @author Ahmad Habibzad
 */

public class AccountHolder {
    /*
     * ================= Instance variabls =================
     */
    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;

    private ArrayList<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
    private ArrayList<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
    private ArrayList<CDAccount> cdAccounts = new ArrayList<CDAccount>();

    // Default Constructor
    AccountHolder() {
    }

    // Parametarized Constructor
    AccountHolder(String firstName, String middleName, String lastName, String ssn) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    /*
     * ======= Getters =======
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
        return this.checkingAccounts.size();
    }

    public double getCheckingBalance() {
        double totalBalance = 0;
        if (this.checkingAccounts != null) {
            for (CheckingAccount account : this.checkingAccounts) {
                totalBalance += account.getBalance();
            }
        }
        return totalBalance;
    }

    public int getNumberOfSavingsAccounts() {
        return this.savingsAccounts.size();
    }

    public double getSavingsBalance() {
        double totalBalance = 0;
        if (this.savingsAccounts != null) {
            for (SavingsAccount account : this.savingsAccounts) {
                totalBalance += account.getBalance();
            }
        }
        return totalBalance;
    }

    public int getNumberOfCDAccounts() {
        return this.cdAccounts.size();
    }

    public double getCDBalance() {
        double totalBalance = 0;
        if (this.cdAccounts != null) {
            for (CDAccount account : this.cdAccounts) {
                totalBalance += account.getBalance();
            }
        }
        return totalBalance;
    }

    public double getCombinedBalance() {
        return getCheckingBalance() + getSavingsBalance();
    }

    CheckingAccount[] getCheckingAccounts() {
        CheckingAccount[] accounts = this.checkingAccounts.toArray(new CheckingAccount[checkingAccounts.size()]);
        return accounts;
    }

    SavingsAccount[] getSavingsAccounts() {
        SavingsAccount[] accounts = this.savingsAccounts.toArray(new SavingsAccount[savingsAccounts.size()]);
        return accounts;
    }

    CDAccount[] getCDAccounts() {
        CDAccount[] accounts = this.cdAccounts.toArray(new CDAccount[this.cdAccounts.size()]);
        return accounts;
    }

    // To String Method
    public String toString() {
        return "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + " " + this.ssn;
    }

    /*
     * ======= Setters =======
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
     * ======= Add Account methods =======
     */

    CheckingAccount addCheckingAccount(double openingBalance) {
        double totalBalance = getCombinedBalance();
        if ((openingBalance + totalBalance) > MeritBank.accountLimit) {
            System.out.println(
                    "!!! An account holder has combined balances exceeding $250,000, system could not create new account !!!");
            return null;
        } else {
            long newAccountNumber = MeritBank.getNextAccountNumber();
            double interest = 0.0001;
            CheckingAccount account = new CheckingAccount(newAccountNumber, openingBalance, interest);
            try {
            	this.checkingAccounts.add(account);
            }catch (NullPointerException e) {
            	System.out.println("Exception occured:");
            }
            return account;
        }
    }

    CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
        double totalBalance = getCombinedBalance();
        if ((checkingAccount.getBalance() + totalBalance) > MeritBank.accountLimit) {

            System.out.println(
                    "!!! An account holder has combined balances exceeding $250,000, system could not create new account !!!");
            return null;
        }

        else {

            this.checkingAccounts.add(checkingAccount);
            return checkingAccount;
        }
    }

    SavingsAccount addSavingsAccount(double openingBalance) {
        double totalBalance = getCombinedBalance();
        
        /*
        if ((openingBalance + totalBalance) > MeritBank.accountLimit) {

            System.out.println(
                    "!!! An account holder has combined balances exceeding $250,000, system could not create new account !!!");
            return null;
        }

        else {

            
        }*/
        long newAccountNumber = MeritBank.getNextAccountNumber();

        double interest = 0.01;

        SavingsAccount account = new SavingsAccount(newAccountNumber, openingBalance, interest);
        this.savingsAccounts.add(account);
        return account;
    }

    SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
        double totalBalance = getCombinedBalance();
        if ((savingsAccount.getBalance() + totalBalance) > MeritBank.accountLimit) {

            System.out.println(
                    "!!! An account holder has combined balances exceeding $250,000, system could not create new account !!!");
            return null;
        }

        this.savingsAccounts.add(savingsAccount);
        return savingsAccount;
    }

    CDAccount addCDAccount(CDOffering offering, double openingBalance) {
        CDAccount account = new CDAccount(offering, openingBalance);
        return account;
    }

    CDAccount addCDAccount(CDAccount cdAccount) {
        this.cdAccounts.add(cdAccount);
        return cdAccount;
    }

}