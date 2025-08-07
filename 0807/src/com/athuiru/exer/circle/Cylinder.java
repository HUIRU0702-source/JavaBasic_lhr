package com.athuiru.exer.circle;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return super.findArea() * length;
    }

    @Override
    public double findArea() {
        return 2 * super.findArea() + 2 * Math.PI * getRadius() * length;
    }
}
