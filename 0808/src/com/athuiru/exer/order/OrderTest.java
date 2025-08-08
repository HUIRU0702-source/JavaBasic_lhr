package com.athuiru.exer.order;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(11, "菜");
        Order o2 = new Order(22, "肉");
        Order o3 = new Order(22, "肉");

        System.out.println(o1.equals(o2));
        System.out.println(o2.equals(o3));

        System.out.println(o1.toString());
    }
}
