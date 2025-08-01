package com.athuiru.exer;

/**
 * 案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，总和，平均值并输出出来。
 * 要求：所有随机数都是两位数：［10，99]
 * 提示：求[a,b]范围内的随机数：（int)(Math.random）＊（b-a + 1)）+ a;
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("随机数组：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        int maxValue = arr[0];
        int minValue = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
            }

            sum += arr[i];
        }

        double average = sum * 1.0 / arr.length;

        System.out.println("最大值：" + maxValue);
        System.out.println("最小值：" + minValue);
        System.out.println("总和：" + sum);
        System.out.println("平均值：" + average);
    }
}
