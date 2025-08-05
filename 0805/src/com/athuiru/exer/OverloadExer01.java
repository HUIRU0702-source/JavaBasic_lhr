package com.athuiru.exer;

/**
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息
 */
public class OverloadExer01 {
    public static void main(String[] args) {
        OverloadExer01 exer01 = new OverloadExer01();
        exer01.m0L(2);
        exer01.m0L(1, 2);
        exer01.m0L("3");

        System.out.println(exer01.max(1, 2));
        System.out.println(exer01.max(1.0, 2));
        System.out.println(exer01.max(1, 2, 3));

        char[] arr = new char[]{'a', 'c'};
        System.out.println(arr);
    }

    public void m0L(int a) {
        System.out.println(a * a);
    }

    public void m0L(int a, int b) {
        System.out.println(a * b);
    }

    public void m0L(String s) {
        System.out.println(s);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public double max(double a, double b) {
        return Math.max(a, b);
    }

    public double max(double a, double b, double c) {
        return max(max(a, b), c);
    }
}
