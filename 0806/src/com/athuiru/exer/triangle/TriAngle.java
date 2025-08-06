package com.athuiru.exer.triangle;

public class TriAngle {
    private double base;
    private double height;

    public TriAngle() {
    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // 求面积的方法
    public double getArea() {
        return base * height / 2;
    }
}
