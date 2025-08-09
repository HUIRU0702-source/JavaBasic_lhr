package com.athuiru.exer.account;

public class Account {
    private int id;
    private String password;
    private double balance;
    private static double interestRate;
    private static double minBalance;

    private static int initId = 1;

    public Account() {
        id = initId;
        initId++;
    }

    public Account(String password, double balance, double interestRate, double minBalance) {
        this();
        this.password = password;
        this.balance = balance;
        Account.interestRate = interestRate;
        Account.minBalance = minBalance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", minBalance=" + minBalance +
                '}';
    }

    public static void main(String[] args) {
        Account a1 = new Account("eee", 20000, 0.0147, 0.014);
        System.out.println(a1.toString());

        Account a2 = new Account("eee", 20000, 0.0147, 0.014);
        System.out.println(a2.toString());

        Account a3 = new Account("eee", 20000, 0.0147, 0.014);
        System.out.println(a3.toString());

        Account.setInterestRate(0.015);
        Account.setMinBalance(1000);

        Account a4 = new Account();
        System.out.println(a4.toString());
    }
}
