package com.athuiru.exer.abstract_exer;

public abstract class Account {
    private int accountNumber;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract double calculateInterest();

    public void displayBalance() {
        System.out.println(balance);
    }
}
