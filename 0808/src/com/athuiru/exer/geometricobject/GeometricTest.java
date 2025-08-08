package com.athuiru.exer.geometricobject;

public class GeometricTest {
    public static void main(String[] args) {
        Circle g1 = new Circle(1, "red", 1);
        MyReactangle g2 = new MyReactangle("green", 1, 1, 2);

        GeometricTest t = new GeometricTest();
        if (t.equalsArea(g1, g2)) {
            System.out.println("面积相等");
        } else {
            System.out.println("面积不相等");
        }

        t.displayGeometricObject(g1);

        t.displayGeometricObject(g2);
    }

    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g) {
        System.out.println("面积：" + g.findArea());
    }

}
