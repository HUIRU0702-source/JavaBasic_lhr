package com.athuiru.exer.person;

public class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age + "\nschool: " + school;
    }
}
