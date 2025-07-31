package com.athuiru.exer;

import java.util.Scanner;

/**
 * 案例：输出英文星期几
 * 用一个数组，保存星期一到星期天的7个英语单词，以键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入任一数字（1-7）：");
        int num = scanner.nextInt();

        if (num < 1 || num > 7) {
            System.out.println("您输入的数字有误！");
        } else {
            System.out.println(arr[num - 1]);
        }

        scanner.close();
    }
}
