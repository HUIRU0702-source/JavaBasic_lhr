package com.athuiru.exer;

/**
 * 案例：评委打分
 * 分析以下需求，并用代码实现：
 * （1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3
 * （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};

        // 求最高分和最低分
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }

            sum += arr[i];
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);

        int sum_final = sum - max - min;
        System.out.println("除去最高分和最低分外其他分数之和:" + sum_final);

        // 取平均 arr.length - 2
        double average = sum_final * 1.0 / (arr.length - 2);
        System.out.println("选手最后得分：" + average);
    }
}
