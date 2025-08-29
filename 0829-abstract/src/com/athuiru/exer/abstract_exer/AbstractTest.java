package com.athuiru.exer.abstract_exer;

import org.junit.Test;

public class AbstractTest {
    @Test
    public void test() {
        Account savingAccount = new SavingAccount(1122, 20000);
        System.out.println(savingAccount.calculateInterest());
        savingAccount.displayBalance();

        Account checkingAccount = new CheckingAccount(1123, 30000);
        System.out.println(checkingAccount.calculateInterest());
        checkingAccount.displayBalance();
    }
}
