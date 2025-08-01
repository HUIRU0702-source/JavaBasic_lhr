package com.athuiru.exer;

/**
 * 示例：使用二维数组打印一个10行杨辉三角。
 * 提示：
 * 1：第一行有1个元素，第n行有n个元素 2．每一行的第一个元素和最后一个元素都是1
 * 3从第三行开始，对于非第一个元素和最后一个元素的元素。即
 * yanghui[i][j] = yanghui[i-i][j-1] + yanghui[i-1][j];
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        arr[0] = new int[]{1};
        System.out.println(arr[0][0]);

        for (int i = 1; i < arr.length; i++) {
            int[] arr_row = new int[i + 1];
            arr[i] = arr_row;

            for (int j = 0; j < arr_row.length; j++) {
                int value_2 = (i - 1 >= 0 && j < i) ? arr[i - 1][j] : 0;
                int value_1 = (i - 1 >= 0 && j - 1 >= 0) ? arr[i - 1][j - 1] : 0;
                arr_row[j] = value_1 + value_2;
                System.out.print(arr_row[j] + "\t");
            }
            System.out.println();
        }
    }
}
