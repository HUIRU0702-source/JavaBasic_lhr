package com.athuiru.exer.person;

public class Person {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("年龄输入不合法");
        }
    }

    public int getAge() {
        return age;
    }
}
