package com.athuiru.exer.account;

public class AccountTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("张三", new Account(2000), 10);
        Customer c2 = new Customer("张三", new Account(2000), 10);

        System.out.println(c1.equals(c2));
    }
}
