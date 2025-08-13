package com.athuiru.exer.employee;

public class EmployeeTest {
    // 抑制编译器警告
    @SuppressWarnings("UnnecessaryToStringCall")
    public static void main(String[] args) {
        Employee employee = new Employee("看看", 21, Status.BUSY);
        System.out.println(employee.toString());
    }
}
