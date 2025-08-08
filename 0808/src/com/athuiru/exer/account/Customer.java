package com.athuiru.exer.account;

import java.util.Objects;

public class Customer {
    private int age;
    private String name;
    private Account acc;

    public Customer() {
    }

    public Customer(String name, Account acc, int age) {
        this.name = name;
        this.acc = acc;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(acc, customer.acc);
    }
}
