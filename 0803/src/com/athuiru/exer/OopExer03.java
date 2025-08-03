package com.athuiru.exer;

public class OopExer03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        MyArrays myArrays = new MyArrays();
        System.out.println("最大值" + myArrays.getMax(arr));
        System.out.println("最小值" + myArrays.getMin(arr));
        System.out.println("总和：" + myArrays.getSum(arr));
        System.out.println("平均数：" + myArrays.getAvg(arr));
        myArrays.print(arr);

        int[] newArr = myArrays.copy(arr);
        myArrays.print(newArr);

        myArrays.revert(arr);
        myArrays.print(arr);

        myArrays.sort(arr);
        myArrays.print(arr);

        System.out.println(myArrays.find(arr, 3));
    }
}
