package com.athuiru.exer.extendsexer;

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();

        System.out.println(someKid.getSex());
        System.out.println(someKid.getSalary());

        someKid.manOrWoman();
        someKid.employed();
    }
}
