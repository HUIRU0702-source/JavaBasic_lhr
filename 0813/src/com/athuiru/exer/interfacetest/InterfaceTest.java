package com.athuiru.exer.interfacetest;

public interface InterfaceTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();

        // 接口的多态性
        Flyable plane2 = new Plane();
        plane2.fly();
    }
}

interface Flyable {
    // 默认声明public static final 属性
    public static final double FLY_HEIGHT = 137.0;
    public static final String NAME = "";

    // 默认声明public 非静态 抽象方法
    public abstract void fly();
}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane.fly");
    }
}
