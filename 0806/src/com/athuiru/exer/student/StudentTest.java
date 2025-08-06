package com.athuiru.exer.student;

import javax.swing.plaf.synth.SynthTableUI;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("kankan", 10);
        System.out.println(student.getInfo());

        Student student2 = new Student("zaizai", 10, "一中");
        System.out.println(student2.getInfo());

        Student student3 = new Student("dengdeng", 10, "一中", "一年级");
        System.out.println(student3.getInfo());
    }
}
