package com.athuiru.exer;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    MyDate birthday;

    public void showEmployeeInfo() {
        System.out.println("员工：" + "id = " + id + ", name = "
                + name + ", age = " + age + ", salary = " + salary
                + ", birthday = " + birthday.year + "-" + birthday.month
                + "-" + birthday.day);
    }
}
