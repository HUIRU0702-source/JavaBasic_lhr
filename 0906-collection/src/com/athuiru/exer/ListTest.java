package com.athuiru.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListTest {
    @Test
    public void test() {
        List list = new ArrayList<>();
        list.add(123);
        list.add("哈哈");
        list.add(new Person("看看", 20));

        list.add(0, 111);
        list.remove(1);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    @Test
    public void test2() {
        List<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1：继续录入，0：结束录入");

        while (scanner.nextInt() == 1) {
            System.out.print("请输入姓名：");
            String name = scanner.next();
            System.out.print("请输入年龄：");
            int age = scanner.nextInt();
            list.add(new Student(name, age));
        }
        scanner.close();

        for (Student std : list) {
            System.out.println(std);
        }
    }

    @Test
    public void test3() {
        String str1 = "看看";
        String str2 = "看看";
        System.out.println(str1 == str2);
    }
}
