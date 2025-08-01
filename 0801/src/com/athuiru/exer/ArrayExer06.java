package com.athuiru.exer;

/**
 * 数组缩容（两种方式）：去掉第3个元素（索引2）
 */
public class ArrayExer06 {
    public static void main(String[] args) {
        // 方式一：前移
        int[] arr = {1, 2, 3, 4, 5, 6};

//        for (int i = 2; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 方式二：新建数组
        int[] arr_new = new int[arr.length - 1];
        for (int i = 0; i < 2; i++) {
            arr_new[i] = arr[i];
        }

        for (int i = 2; i < arr.length - 1; i++) {
            arr_new[i] = arr[i + 1];
        }

        arr = arr_new;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
