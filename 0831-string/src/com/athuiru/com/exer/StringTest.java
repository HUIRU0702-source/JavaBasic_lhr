package com.athuiru.com.exer;

import org.junit.Test;

public class StringTest {
    @Test
    public void test1() {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        // 验证码校验场景
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        String str3 = str2.toUpperCase();
        System.out.println(str3);
        System.out.println(str3.toLowerCase());

        String str4 = "  he   llo   ";
        System.out.println(str4.trim());

        char c = ' ';
        System.out.println(c);
        System.out.println(' ');

        str1.substring(1, 2);
    }
}
