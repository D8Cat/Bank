package com.bank;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class Customer {
    private String name;

    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (accountNumber.equalsIgnoreCase(account.getAccountNumber())) {
                return account;
            }
        }
        return null;
    }

    public void addAccount(String accountNumber) {
        accounts.add(new Account(accountNumber, 0));
    }

    public void addAccount(String accountNumber, double balance) {
        accounts.add(new Account(accountNumber, balance));
    }


    public void withdrawFunds(String accountNumber, double withdrawAmount) {
        findAccount(accountNumber).withdrawFunds(withdrawAmount);
    }

    public void depositFunds(String accountNumber, double depositAmount) {
        findAccount(accountNumber).depositFunds(depositAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
