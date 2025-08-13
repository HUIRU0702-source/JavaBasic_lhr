package com.athuiru.exer.color;

import com.athuiru.exer.annotation.MyAnnotation;

@MyAnnotation("class")
public class ColorTest {
    @MyAnnotation
    public static void main(String[] args) {
        Color green = Color.GREEN;
        System.out.println(green);
    }
}
