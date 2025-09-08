package com.athuiru.exer.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ListTest {
    @Test
    public void test1() {
        // 创建集合，集合存放随机生成的30个小写字母
        Collection list = new ArrayList();

        for (int i = 0; i < 30; i++) {
            // 0-25
//            char c = (char)('a' + (int)(Math.random() * (25 - 0 + 1)) + 0);
            char c = (char) ('a' + (int) (Math.random() * 26));
            System.out.println(c + "");
            list.add(c + "");
        }

        System.out.println(listTest(list, "a"));
        System.out.println(listTest(list, "b"));
        System.out.println(listTest(list, "d"));
        System.out.println(listTest(list, "x"));
    }

    /**
     * 统计集合中元素出现的个数
     *
     * @param list 集合
     * @param s    指定元素
     * @return 出现个数
     */
    public static int listTest(Collection list, String s) {
        int num = 0;

        for (Object obj : list) {
            if (s.equals((String) obj)) {
                num++;
            }
        }

        return num;
    }
    
    @Test
    public void test2() {
        String str1 = "123";
        Integer.parseInt(str1);// 方法名和JS中的一样
    }
}
