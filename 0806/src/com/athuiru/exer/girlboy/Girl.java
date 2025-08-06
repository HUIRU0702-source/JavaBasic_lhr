package com.athuiru.exer.girlboy;

public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy) {
        System.out.println("我要嫁给" + boy.getName());

        boy.marry(this);
    }

    public void compare(Girl girl) {
        if (girl.age > this.age) {
            System.out.println(girl.name + "年龄大");
        } else {
            System.out.println(this.name + "年龄大");
        }
    }
}
