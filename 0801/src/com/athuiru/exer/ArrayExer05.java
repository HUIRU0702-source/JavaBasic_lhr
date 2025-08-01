package com.athuiru.exer;

/**
 * 数组扩容
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // 左移1位相当于乘以2
        int[] new_arr = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }

        new_arr[arr.length] = 4;
        new_arr[arr.length + 1] = 5;
        new_arr[arr.length + 2] = 6;

        arr = new_arr;
        for (int value : arr) System.out.print(value + "\t");
    }
}
