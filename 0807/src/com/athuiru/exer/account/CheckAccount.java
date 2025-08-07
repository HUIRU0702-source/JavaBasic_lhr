package com.athuiru.exer.account;

public class CheckAccount extends Account {
    private double overdraft;// 可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
            return;
        }

        double toOverdraft = amount - getBalance();
        if (toOverdraft <= overdraft) {
            super.withdraw(getBalance());
            overdraft -= toOverdraft;
        } else {
            System.out.println("超过可透支额度！");
        }
    }
}
