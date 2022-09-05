package com.bank;

import java.util.ArrayList;

public class Bank {
    ArrayList<Customer> customers;

    int amountOfAccounts;

    public Bank() {
        this.customers = new ArrayList<>();
        this.amountOfAccounts = 0;
    }

    public void addCustomer(String name) {
        Customer customer = new Customer(name);
        customers.add(customer);
        customer.addAccount(String.format("[%010d]%n", customers.size() + 1));
        amountOfAccounts++;
        System.out.println(name + " has been added to our system.");
    }

    public Customer findCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        System.out.println("Customer not found");
        return null;
    }
}
