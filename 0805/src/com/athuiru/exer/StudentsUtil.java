package com.athuiru.exer;

public class StudentsUtil {
    /**
     * 根据score，使用冒泡排序对Student[]数组进行排序
     *
     * @param students 要排序的学生数组
     */
    public void sort(Student[] students) {
        for (int j = 0; j < students.length - 1; j++) {
            for (int i = 0; i < students.length - 1 - j; i++) {
                if (students[i].score > students[i + 1].score) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }
    }

    /**
     * 遍历显示Student[]数组信息
     *
     * @param students 要遍历显示Student[]数组
     */
    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.show());
        }
    }

    /**
     * 显示指定年级的学生成绩
     *
     * @param state 指定年级
     * @param students 学生数组
     */
    public void printStudentsWithState(int state, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state) {
                System.out.println(students[i].show());
            }
        }
    }
}
