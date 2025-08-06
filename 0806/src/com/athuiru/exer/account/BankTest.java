package com.athuiru.exer.account;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("见", "见");
        bank.addCustomer("看", "看");

        bank.getCustomers(0).setAccount(new Account(1, 100, 0.01));
        bank.getCustomers(1).setAccount(new Account(2, 30000, 0.02));

        System.out.println(bank.getCustomers(0).getAccount().getBalance());
    }
}
