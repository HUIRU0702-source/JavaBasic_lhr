package com.athuiru.exer;

/**
 * 数组反转
 */
public class ArrayExer04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // 方式一
        for (int i = 0; i < arr.length / 2; i++) {
            // 交换arr[i]与arr[arr.length-1-i]位置的元素
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        // 方式二
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
