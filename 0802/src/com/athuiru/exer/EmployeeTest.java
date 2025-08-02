package com.athuiru.exer;

/**
 * 案例
 * 声明员工类Employee
 * 包含属性：编号id、姓名name、年龄age、薪资salary。
 * 声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.name = "张三";
        employee1.age = 20;
        employee1.salary = 35;

        employee1.birthday = new MyDate();
        employee1.birthday.year = 2005;
        employee1.birthday.month = 8;
        employee1.birthday.day = 2;

        System.out.println("员工1：" + "id = " + employee1.id + ", name = "
                + employee1.name + ", age = " + employee1.age + ", salary = " + employee1.salary
                + ", birthday = " + employee1.birthday.year + "-" + employee1.birthday.month
                + "-" + employee1.birthday.day);

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.name = "李四";
        employee2.age = 30;
        employee2.salary = 30;

        employee2.birthday = new MyDate();
        employee2.birthday.year = 1995;
        employee2.birthday.month = 8;
        employee2.birthday.day = 2;

        System.out.println("员工2：" + "id = " + employee2.id + ", name = "
                + employee2.name + ", age = " + employee2.age + ", salary = " + employee2.salary
                + ", birthday = " + employee2.birthday.year + "-" + employee2.birthday.month
                + "-" + employee2.birthday.day);

    }
}
