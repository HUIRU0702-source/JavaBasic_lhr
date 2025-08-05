package com.athuiru.exer;

/**
 * 练习一：
 * 已知一个数列: f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f（10)的值。
 * 练习二：
 * 已知有一个数列：f(0)=1,f(1)=4
 * f（n+2）=2*f（n+1）+f（n），其中n是大于0的整数，求f（10）的值。
 */
public class RecursionExer01 {
    public static void main(String[] args) {
        RecursionExer01 recursionExer01 = new RecursionExer01();
        System.out.println(recursionExer01.method(10));

        System.out.println(recursionExer01.method2(10));
    }

    public int method(int num) {
        if (num == 20) {
            return 1;
        } else if (num == 21) {
            return 4;
        } else {
            return method(num + 2) - 2 * method(num + 1);
        }
    }

    public int method2(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 4;
        } else {
            // 向终止条件靠近
            return 2 * method2(num - 1) + method2(num - 2);
        }
    }
}
