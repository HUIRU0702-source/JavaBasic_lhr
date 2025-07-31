package com.athuiru.exer;

import java.util.Scanner;

/**
 * 案例：学生考试等级划分
 * 以键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10 等级为‘A'
 * 成绩>=最高分-20 等级为‘B
 * 成绩>=最高分-30 等级为'C"
 * 其余 等级为‘D'
 * 提示：先读学生人数，根据人数创建int数组，存放学生成绩。
 * 请输入学生人数 5
 * 请输入5个成绩
 * 56 74 89 41 89
 * 最高分是：89
 * student 0 score is 56 grade is D
 * student 1 score is 74 grade is B
 * student 2 score is 89 grade is A
 * student 3 score is 41 grade is D
 * student 4 score is 89 grade is A
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        // 获取学生人数
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生人数：");
        int count = scanner.nextInt();

        // 创建学生成绩数组，并获取最高分
        double[] grades = new double[count];

        double maxGrade = 0;
        System.out.println("请输入" + count + "个成绩(以换行分隔)：");
        for (int i = 0; i < count; i++) {
            grades[i] = scanner.nextDouble();
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
            }
        }
        System.out.println("最高分是：" + maxGrade);

        // 新建一个数组，依次判断学生等级
        for (int i = 0; i < count; i++) {
            System.out.println("student " + i + " score is " + grades[i] + " grade is " + getLevel(grades[i], maxGrade));
        }

        scanner.close();
    }

    public static char getLevel(double grade, double maxGrade) {
        if (grade >= maxGrade - 10) {
            return 'A';
        } else if (grade >= maxGrade - 20) {
            return 'B';
        } else if (grade >= maxGrade - 30) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
