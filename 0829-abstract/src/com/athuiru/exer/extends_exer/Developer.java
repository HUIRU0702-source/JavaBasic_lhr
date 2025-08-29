package com.athuiru.exer.extends_exer;

public class Developer extends Employee{
    public Developer() {
    }

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员写代码...");
    }
}
