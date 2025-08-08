package com.athuiru.exer.person2;

public class Exer4 {
    public static void main(String[] args) {
        Man m = new Man();
        Woman w = new Woman();
        Exer4.meeting(m, w);
    }

    public static void meeting(Person... ps) {
        for (int i = 0; i < ps.length; i++) {
            Person p = ps[i];
            p.eat();
            p.toilet();

            if (p instanceof Man) {
                ((Man) p).rap();
            }

            if (p instanceof Woman) {
                ((Woman) p).makeup();
            }
        }
    }
}
