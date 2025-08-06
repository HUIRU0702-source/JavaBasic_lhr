package com.athuiru.exer.account;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int i) {
        id = i;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足，取款失败");
        } else {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("成功存入: " + amount);
    }
}
