package com.athuiru.exer.geometricobject;

import java.util.Objects;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
//        super();// 不用加super() 不加默认调
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
