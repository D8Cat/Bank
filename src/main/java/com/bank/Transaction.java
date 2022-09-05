package com.bank;

public class Transaction {
    private String originAccountNumber, targetAccountNumber;
    private double transferAmount;

    public Transaction(String originAccountNumber, String targetAccountNumber, double transferAmount) {
        this.originAccountNumber = originAccountNumber;
        this.targetAccountNumber = targetAccountNumber;
        this.transferAmount = transferAmount;
    }


    public String getOriginAccountNumber() {
        return originAccountNumber;
    }

    public void setOriginAccountNumber(String originAccountNumber) {
        this.originAccountNumber = originAccountNumber;
    }

    public String getTargetAccountNumber() {
        return targetAccountNumber;
    }

    public void setTargetAccountNumber(String targetAccountNumber) {
        this.targetAccountNumber = targetAccountNumber;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }
}
