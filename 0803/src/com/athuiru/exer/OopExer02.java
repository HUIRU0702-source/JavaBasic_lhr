package com.athuiru.exer;

/**
 * 利用面向对象的编程方法，设计类Circle计算圆的面积
 */
public class OopExer02 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2;
        System.out.println(circle.getSize());
    }
}
