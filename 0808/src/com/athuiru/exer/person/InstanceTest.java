package com.athuiru.exer.person;

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();

        Person p = new Person();
        test.method(p);

        System.out.println("========================");
        Student s = new Student();
        test.method(s);

        System.out.println("========================");
        Graduate g = new Graduate();
        test.method(g);
    }

    public void method(Person e) {
        System.out.println(e.getInfo());
        ;

        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }
        if (e instanceof Student) {
            System.out.println("a student");
        }

        if (e instanceof Person) {
            System.out.println("a person");
        }
    }
}
