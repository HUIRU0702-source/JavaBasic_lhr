package com.athuiru.exer.abstract_exer;

public class SavingAccount extends Account{
    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return 1.4;
    }
}
