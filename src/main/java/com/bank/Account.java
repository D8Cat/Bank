package com.bank;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void withdrawFunds(double withdrawAmount) {
        if (balance > withdrawAmount) {
            System.out.println("You've withdrawn " + withdrawAmount + " from your account");
            balance -= withdrawAmount;
            transactions.add(new Transaction(accountNumber, "Cash withdrawal", -withdrawAmount));
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("You've deposited " + depositAmount + " from your account");
        System.out.println("Your new account balance is " + balance);
        transactions.add(new Transaction("Cash deposit", accountNumber, depositAmount));
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
