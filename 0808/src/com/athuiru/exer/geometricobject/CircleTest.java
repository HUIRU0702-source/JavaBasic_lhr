package com.athuiru.exer.geometricobject;

import javax.sound.midi.Soundbank;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(c1.getColor().equals(c2.getColor()));
        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());
    }
}
