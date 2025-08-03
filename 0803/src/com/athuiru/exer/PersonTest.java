package com.athuiru.exer;

/**
 * 案例
 * (1)创建Person类的对象，设置该对象的name、age和gender属性
 * 调用study方法，输出字符串"studying"；
 * 调用showAge()方法，返回age值；
 * 调用addAge（int addAge）方法给对象的age属性值增加addAge岁。比如：2岁。
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "张三";
        person1.age = 18;
        person1.gender = '女';
        person1.study();
        System.out.println(person1.showAge());
        person1.addAge(2);
        System.out.println(person1.showAge());

        Person person2 = new Person();
        person2.name = "李四";
        person2.age = 10;
        person2.gender = '男';
        person2.study();
        System.out.println(person2.showAge());
        person2.addAge(10);
        System.out.println(person2.showAge());
    }
}
