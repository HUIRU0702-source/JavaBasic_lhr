package com.athuiru.exer.person;

/**
 * 创建程序，在其中定义两个类：Person和PersonTest类。
 * 定义如下用setAge()设置人的合法年龄（0~130），用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge和getAge方法，体会Java的封装性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        System.out.println(b.getAge());

        b.setAge(10);
        System.out.println(b.getAge());

        b.setAge(150);
        System.out.println(b.getAge());
    }
}
