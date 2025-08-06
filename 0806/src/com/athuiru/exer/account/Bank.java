package com.athuiru.exer.account;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    public Customer getCustomers(int index) {
        if (index < 0 || index >= numberOfCustomer) {
            return null;
        }

        return customers[index];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);

        if (numberOfCustomer < customers.length) {
            customers[numberOfCustomer] = customer;
        } else {
            Customer[] newCustomers = new Customer[customers.length];
            for (int i = 0; i < customers.length; i++) {
                newCustomers[i] = customers[i];
            }
            newCustomers[-1] = customer;
        }

        numberOfCustomer++;
    }
}
