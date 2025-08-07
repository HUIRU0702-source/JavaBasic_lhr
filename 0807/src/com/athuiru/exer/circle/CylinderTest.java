package com.athuiru.exer.circle;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(2.3);
        cylinder.setLength(1.4);

        System.out.println("圆柱的体积为：" + cylinder.findVolume());
        System.out.println("圆柱的表面积为：" + cylinder.findArea());
    }
}
