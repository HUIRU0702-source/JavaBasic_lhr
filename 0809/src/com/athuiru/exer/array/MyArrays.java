package com.athuiru.exer.array;

/**
 * 根据上一章数组中的常用算法操作，自定文一个操作int[]的工具类。
 * 涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转
 * 数组排序（默认从小到大排序）、查找等
 */
public class MyArrays {
    /**
     * 获取int[]数组的最大值
     *
     * @param arr 要获取最大值的数组
     * @return 最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取int[]数组的最小值
     *
     * @param arr 要获取最小值的数组
     * @return 最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 计算int[]数组的总和
     *
     * @param arr 要计算总和的数组
     * @return 数组总和
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 计算int[]数组的平均值
     *
     * @param arr 要计算平均值的数组
     * @return 数组的平均值
     */
    public static double getAvg(int[] arr) {
        return getSum(arr) * 1.0 / arr.length;
    }

    /**
     * 遍历int[]数组，输出格式[1,2,3]
     *
     * @param arr 要遍历的数组
     */
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }

    /**
     * 赋值int[]数组
     *
     * @param arr 被赋值的数组
     * @return 赋值的数组
     */
    public static int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 对int[]类型的数组进行反转
     *
     * @param arr 要反转的数组
     * @return 反转后的数组
     */
    public static void revert(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tempt = arr[i];
            arr[i] = arr[j];
            arr[j] = tempt;
        }
    }

    /**
     * 对int[]类型数组进行排序, 从小到大排序
     *
     * @param arr 要排序的数组
     * @return 排序后的数组
     */
    public static void sort(int[] arr) {
        // 冒泡排序
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    /**
     * 对int[]类型数组进行排序, sortMethod是asc-升序，desc-降序
     *
     * @param arr        要排序的数组
     * @param sortMethod 排序方式
     * @return 排序后的数组
     */
    public static void sort(int[] arr, String sortMethod) {
        if ("asc".equals(sortMethod)) {
            // 冒泡排序
            for (int j = 0; j < arr.length - 1; j++) {
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                    }
                }
            }
        } else if ("desc".equals(sortMethod)) {
            // 冒泡排序
            for (int j = 0; j < arr.length - 1; j++) {
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if (arr[i] < arr[i + 1]) {
                        swap(arr, i, i + 1);
                    }
                }
            }
        } else {
            System.out.println("sortMethod输入有误！");
        }
    }

    /**
     * 交换数组两个位置元素的值
     *
     * @param arr 要交换元素的数组
     * @param i   元素1位置
     * @param j   元素2位置
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 查找int[]数组中目标元素的位置，如果没有则返回-1
     *
     * @param arr    要查找目标元素的数组
     * @param target 要查找的目标元素
     * @return 目标元素所在位置索引
     */
    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
