package com.athuiru.exer.array;

public class MyArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("最大值" + MyArrays.getMax(arr));
        System.out.println("最小值" + MyArrays.getMin(arr));
        System.out.println("总和：" + MyArrays.getSum(arr));
        System.out.println("平均数：" + MyArrays.getAvg(arr));
        MyArrays.print(arr);

        int[] newArr = MyArrays.copy(arr);
        MyArrays.print(newArr);

        MyArrays.revert(arr);
        MyArrays.print(arr);

        MyArrays.sort(arr);
        MyArrays.print(arr);

        System.out.println(MyArrays.find(arr, 3));
    }
}
