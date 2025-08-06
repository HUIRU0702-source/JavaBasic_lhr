package com.athuiru.exer.girlboy;

public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl) {
        System.out.println("我要娶" + girl.getName());
    }

    public void shout() {
        if (this.age > 22) {
            System.out.println("我终于可以结婚了！");
        } else {
            System.out.println("我还不能结婚");
        }
    }
}
