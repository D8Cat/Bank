package com.bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {



    @Test
    void testFindAccount() {
        Customer testCustomer = new Customer("testCustomer");
        testCustomer.addAccount("0001");
        assertInstanceOf(Account.class, testCustomer.findAccount("0001"));
    }

    @Test
    void testAddAccount() {
        Customer testCustomer = new Customer("testCustomer");
        testCustomer.addAccount("0001");
        testCustomer.addAccount("9999", 100.15);

        ArrayList<Account> testAccountList = new ArrayList<>();
        testAccountList.add(new Account("0001", 0));
        testAccountList.add(new Account("9999", 100.15));

        assertEquals(testAccountList.get(0).getAccountNumber(), testCustomer.getAccounts().get(0).getAccountNumber());
        assertEquals(testAccountList.get(0).getBalance(), testCustomer.getAccounts().get(0).getBalance());
        assertEquals(testAccountList.get(1).getAccountNumber(), testCustomer.getAccounts().get(1).getAccountNumber());
        assertEquals(testAccountList.get(1).getBalance(), testCustomer.getAccounts().get(1).getBalance());
    }

    @Test
    void testDepositFunds() {
        Customer testCustomer = new Customer("testCustomer");
        testCustomer.addAccount("0001", 0);
        testCustomer.depositFunds("0001", 1000);
        assertEquals(1000, testCustomer.findAccount("0001").getBalance());
    }

    @Test
    void testWithdrawFunds() {
        Customer testCustomer = new Customer("testCustomer");
        testCustomer.addAccount("0001", 1000);
        testCustomer.withdrawFunds("0001", 499.9999);
        assertEquals(500.0001, testCustomer.findAccount("0001").getBalance());
    }


}