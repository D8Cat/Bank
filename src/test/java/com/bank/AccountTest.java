package com.bank;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AccountTest {
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");

    @Test
    void testWithdrawFunds() {
        Account testAccount = new Account("0001", 100.15);
        testAccount.withdrawFunds(110);
        assertEquals(100.15, testAccount.getBalance());

        testAccount.withdrawFunds(99.10);
        assertEquals("1,05", dfZero.format(testAccount.getBalance()));
    }



}