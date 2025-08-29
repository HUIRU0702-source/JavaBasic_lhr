package com.athuiru.exer;

import org.junit.Test;

public class TryCatchExer01 {
    @Test
    public void test1() {

        try {
            String str = "aaa";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.println("程序运行结束");
    }
}
