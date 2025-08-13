package com.athuiru.exer.innerclass;

public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        Comparable comparable = outerClass.comparable();
        System.out.println(comparable.compareTo(""));
    }
}

class OuterClass {
    public Comparable comparable() {
        // 方式一：实现类的匿名对象
        class InnerClass implements Comparable {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        return new InnerClass();
    }

    public Comparable comparable2() {
        // 方式二：匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
