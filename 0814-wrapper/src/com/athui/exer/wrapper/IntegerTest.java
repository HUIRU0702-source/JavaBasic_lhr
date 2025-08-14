package com.athui.exer.wrapper;

public class IntegerTest {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(3);
        System.out.println(integer.getValue());
    }
}

class MyInteger {
    int value;

    public MyInteger() {
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}