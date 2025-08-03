package com.athuiru.exer;

/**
 * 1编写程序，声明一个method1方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法
 * 2编写程序，声明一个method2方法，除打印一个10*8的*型矩形外，
 * 再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打即。
 * 3．编写程序，声明一个method3方法，在method3方法提供m和n两个参数，方法中打印一个m*n的*型矩形并计算该矩形的面积，将其作为方法返回值。
 * 在main方法中调用该方法，接收返回的面积值并打印。
 */
public class OopExer01 {
    public void method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method3(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }

    public static void main(String[] args) {
        OopExer01 oopExer01 = new OopExer01();
        oopExer01.method1();
        System.out.println("========================================");

        System.out.println(oopExer01.method2());
        System.out.println("========================================");

        System.out.println(oopExer01.method3(3, 2));
    }
}
