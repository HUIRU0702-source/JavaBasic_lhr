package com.athuiru.exer.innerclass;

public class InnerClassTest2 {
    public static void main(String[] args) {
        Object innerClass = new Object() {
            public void test() {
                System.out.println("InnerClass");
            }
        };

        // 不能通过innerClass调用，父类Object中没有声明test方法，以前的方式是强转成子类类型
//        innerClass.test();

        // 直接调用
        new Object() {
            public void test() {
                System.out.println("InnerClass");
            }
        }.test();

    }
}
