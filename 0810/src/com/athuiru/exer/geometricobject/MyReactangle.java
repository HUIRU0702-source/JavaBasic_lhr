package com.athuiru.exer.geometricobject;

public class MyReactangle extends GeometricObject {
    private double width;
    private double height;

    public MyReactangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea() {
        return weight * height;
    }
}
