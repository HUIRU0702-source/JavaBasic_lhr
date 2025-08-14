package com.athui.exer.wrapper;

import java.util.Scanner;
import java.util.Vector;

public class WrapperExer01Refactor {
    public static void main(String[] args) {
        // 1、创建Vector对象：Vector v = new Vector();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int num = scanner.nextInt();

        Vector vector = new Vector(num);

        // 2、从键盘循环读入学生成绩，判断输入为负数时，退出循环
        System.out.println("请输入" + num + "个成绩：");
        int maxScore = 0;
        while (true) {
            int score = scanner.nextInt();
            if (score < 0) {
                break;
            }

            vector.addElement(score);

            if (score > maxScore) {
                maxScore = score;
            }
        }

        // 3、获取最高分
        System.out.print("最高分：" + maxScore);
        System.out.println();

        // 4、判断学生等级，并输出
        for (int i = 0; i < vector.size(); i++) {
            Object obj = vector.elementAt(i);
            if (obj instanceof Integer) {
                int score = (Integer) obj;

                System.out.print("student " + i + " score is " + score + " grade is ");

                int diff = maxScore - score;
                if (diff >= 0 && diff <= 10) {
                    System.out.println("A");
                } else if (diff <= 20) {
                    System.out.println("B");
                } else if (diff <= 30) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            }
        }

        scanner.close();
    }
}
