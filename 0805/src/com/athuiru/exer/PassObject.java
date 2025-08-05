package com.athuiru.exer;

/**
 * 定义一个类Passobiect，在类中定义一个方法printAreas，
 * 该方法的定义如下： public void printAreas(Circle c,int time)。
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.printAreas(circle, 5);
        System.out.println("now radius is " + circle.radius);
    }

    public void printAreas(Circle c, int time) {
        System.out.println("radius\t\tarea");
        int i = 1;
        for (; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        c.radius = i;
    }
}
