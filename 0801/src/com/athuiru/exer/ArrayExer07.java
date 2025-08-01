package com.athuiru.exer;

/**
 * 二分查找
 */
public class ArrayExer07 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 10, 12, 21, 78};

        int target = 8;

        boolean flag = false;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                flag = true;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (!flag) {
            System.out.println("没有该值");
        }
    }
}
