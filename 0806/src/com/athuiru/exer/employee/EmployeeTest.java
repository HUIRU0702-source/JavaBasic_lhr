package com.athuiru.exer.employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] arr = new Employee[2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("----------添加第" + (i + 1) + "个员工---------");
            Employee employee = new Employee();

            System.out.print("请输入姓名：");
            employee.setName(scanner.next());

            System.out.print("请输入性别：");
            employee.setGender(scanner.next().charAt(0));

            System.out.print("请输入年龄：");
            employee.setAge(scanner.nextInt());

            System.out.print("请输入电话：");
            employee.setTel(scanner.next());

            arr[i] = employee;
        }

        scanner.close();

        System.out.println("--------------员工列表-----------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "\t" + arr[i].getInfo());
        }
        System.out.println("--------------员工列表完成-----------");
    }
}
