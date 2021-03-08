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

    private CheckingAccount[] checkingAccounts;
    private SavingsAccount[] savingsAccounts;
    private CDAccount[] cdAccounts;

    // Default Constructor
    AccountHolder() {
    }

    // Parametarized Constructor
    AccountHolder(String firstName, String middleName, String lastName, String ssn) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.checkingAccounts = new CheckingAccount[0];
        this.savingsAccounts = new SavingsAccount[0];
        this.cdAccounts = new CDAccount[0];
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
        return this.checkingAccounts.length;
    }

    public double getCheckingBalance() {
        double result = 0.0;
        for (CheckingAccount account : this.checkingAccounts) {
            result += account.getBalance();
        }
        return result;
    }

    public int getNumberOfSavingsAccounts() {
        return this.savingsAccounts.length;
    }

    public double getSavingsBalance() {
        double result = 0.0;
        for (SavingsAccount account : this.savingsAccounts) {
            result += account.getBalance();
        }
        return result;
    }

    public int getNumberOfCDAccounts() {
        return this.cdAccounts.length;
    }

    public double getCDBalance() {
        double result = 0.0;
        for (CDAccount account : this.cdAccounts) {
            result += account.getBalance();
        }
        return result;
    }

    public double getCombinedBalance() {
        return getCheckingBalance() + getSavingsBalance() + this.getCDBalance();
    }

    CheckingAccount[] getCheckingAccounts() {
        return this.checkingAccounts;
    }

    SavingsAccount[] getSavingsAccounts() {
        return this.savingsAccounts;
    }

    CDAccount[] getCDAccounts() {
        return this.cdAccounts;
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
        if (this.getCheckingBalance() + this.getSavingsBalance() + openingBalance < MeritBank.balanceLimit) {
            // Instantiate a new Checking Account Array and add one to its size
            CheckingAccount[] temp = new CheckingAccount[this.checkingAccounts.length + 1];

            for (int i = 0; i < this.checkingAccounts.length; i++)
                temp[i] = this.checkingAccounts[i];

            temp[temp.length - 1] = new CheckingAccount(openingBalance);
            this.checkingAccounts = temp;

        }
        return null;
    }

    CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
        if (this.getCheckingBalance() + this.getSavingsBalance() + checkingAccount.getBalance() < 250000) {
            CheckingAccount[] temp = new CheckingAccount[this.checkingAccounts.length + 1];

            for (int i = 0; i < this.checkingAccounts.length; i++)
                temp[i] = this.checkingAccounts[i];

            temp[temp.length - 1] = checkingAccount;
            this.checkingAccounts = temp;

            return checkingAccount;
        }
        return null;
    }

    SavingsAccount addSavingsAccount(double openingBalance) {
        if (this.getCheckingBalance() + this.getSavingsBalance() + openingBalance < 250000) {
            SavingsAccount[] temp = new SavingsAccount[this.savingsAccounts.length + 1];

            for (int i = 0; i < this.savingsAccounts.length; i++)
                temp[i] = this.savingsAccounts[i];

            temp[temp.length - 1] = new SavingsAccount(openingBalance);
            this.savingsAccounts = temp;

            return this.savingsAccounts[this.savingsAccounts.length - 1];
        }
        return null;
    }

    SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
        if (this.getCheckingBalance() + this.getSavingsBalance() + savingsAccount.getBalance() < 250000) {
            SavingsAccount[] temp = new SavingsAccount[this.savingsAccounts.length + 1];

            for (int i = 0; i < this.savingsAccounts.length; i++)
                temp[i] = this.savingsAccounts[i];

            temp[temp.length - 1] = savingsAccount;
            this.savingsAccounts = temp;

            return this.savingsAccounts[this.savingsAccounts.length - 1];
        }
        return null;
    }

    CDAccount addCDAccount(CDOffering cdOffering, double openingBalance) {
        if (cdOffering == null) return null;
        return this.addCDAccount(new CDAccount(cdOffering, openingBalance));
    }

    CDAccount addCDAccount(CDAccount cdAccount) {
        if (cdAccount == null)
            return null;

        CDAccount[] temp = new CDAccount[this.cdAccounts.length + 1];

        for (int i = 0; i < this.cdAccounts.length; i++)
            temp[i] = this.cdAccounts[i];

        temp[temp.length - 1] = cdAccount;
        this.cdAccounts = temp;

        return this.cdAccounts[this.cdAccounts.length - 1];
    }
}