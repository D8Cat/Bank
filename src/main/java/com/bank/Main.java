package com.bank;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.addCustomer("Daniel");
        System.out.println(myBank.findCustomer("Daniel").getAccounts().get(0));



    }
}