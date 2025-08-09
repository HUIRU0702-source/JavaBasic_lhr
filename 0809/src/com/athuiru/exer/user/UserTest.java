package com.athuiru.exer.user;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.getInfo());

        User user2 = new User("在在", "8888888");
        System.out.println(user2.getInfo());
    }
}
