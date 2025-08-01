package com.athuiru.exer;

/**
 * 数组排序
 */
public class ArrayExer08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 90, 3, 5, 7, 3, 21, 22, 78, 43, 50, 1};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 冒泡排序
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
