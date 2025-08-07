package com.athuiru.exer.account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println("余额利率为：" + account.getMonthlyInterest());

        System.out.println("==========================================================");

        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        System.out.println("您的余额为：" + checkAccount.getBalance());
        System.out.println("您当前的可透支金额为：" + checkAccount.getOverdraft());
    }
}
