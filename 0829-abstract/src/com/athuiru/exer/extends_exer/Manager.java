package com.athuiru.exer.extends_exer;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("管理者管理....");
    }
}
