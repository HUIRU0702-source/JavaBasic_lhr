package com.athuiru.exer;

/**
 * 1）定文类Student，包含三个属性：学号number（int），年级state（int)，成绩score（int)
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 可题一：打印出3年级（state值为3）的学生信息。
 * 可题二：使用冒泡排序按学生成绩排序，并遍所有学生信息
 * 提示：
 * 1）生成随机数：Math.random()，返回值类型double;
 * 2）四舍五入取整：Math.round(doubled)，返回值类型long。
 * 年级[1,6] : (int)(Math.random() * 6 + 1)
 * 分数[0,100] : (int)(Math.random * 101)
 */
public class OopExer01 {
    public static void main(String[] args) {
        Student[] arr = new Student[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            arr[i].number = i + 1;
            arr[i].state = (int) (Math.random() * 6) + 1;
            arr[i].score = (int) (Math.random() * 101);
        }

        StudentsUtil studentsUtil = new StudentsUtil();
        studentsUtil.printStudentsWithState(3, arr);

        studentsUtil.sort(arr);

        System.out.println();
        studentsUtil.printStudents(arr);
    }
}
