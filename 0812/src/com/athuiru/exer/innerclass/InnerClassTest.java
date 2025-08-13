package com.athuiru.exer.innerclass;

class InnerClassTest {
    public static void main(String[] args) {
        // 调用静态内部类
        Person.Dog dog = new Person.Dog();// 类加载时，已加载，创建Dog对象不需要创建Person对象
        dog.print();

        // 调用非静态内部类
        Person person = new Person();
        Person.Cat cat = person.new Cat();// 非静态类，创建对象时加载，需要加创建Person对象，后创建非静态类对象
        cat.print();
        cat.show("show.name");
    }
}

class Person {
    String name = "person.name";

    static class Dog {
        public void print() {
            System.out.println("执行Person的静态内部类Dog的print方法");
        }
    }

    class Cat {
        String name = "cat.name";

        public void print() {
            System.out.println("执行Person的非静态内部类Cat的print方法");
        }

        public void show(String name) {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);

            Person.this.print();
        }
    }

    public void print() {
        System.out.println("执行person.print");
    }

    public void eat() {
        class InnerClass1 {
        }
    }

    public Person() {
        class InnerClass1 {
        }
    }
}
