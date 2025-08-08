package com.athuiru.exer.person;

public class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age + "\nschool: " + school + "\nmajor" + major;
    }
}
