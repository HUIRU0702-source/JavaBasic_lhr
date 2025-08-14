package com.athui.exer.wrapper;

import org.junit.Test;

public class WrapperTest {
    @Test
    public void test1() {
        Integer i1 = new Integer(10);
        System.out.println(i1);
        int i = i1.intValue();
        System.out.println(i);

        Integer i2 = Integer.valueOf(12);
        System.out.println(i2);
        int i3 = i2.intValue();
        System.out.println(i3);
    }

    @Test
    public void test2() {
        Integer i1 = 10;
        int i2 = i1;
        System.out.println(i1);
        System.out.println(i2);
    }

    @Test
    public void test3() {
        // 基本数据类型和包装类转换：自动装箱、拆箱
        Integer i1 = 10;
        int i2 = i1;

        // 基本数据类型和String相互转换
        String str1 = String.valueOf(i2);
        int i3 = Integer.parseInt(str1);

        boolean b1 = true;
        String str2 = String.valueOf(b1);

        // String转包装类
        String str3 = "10";
        Integer i4 = Integer.valueOf(str3);
        System.out.println(i4);

        // 包装类转String
        String str4 = String.valueOf(i4);
        System.out.println(str4);
    }
}
