package com.athuiru.exer.employee;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private String tel;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public String getInfo() {
        return name + "\t" + gender + "\t" + age + "\t" + tel;
    }
}
