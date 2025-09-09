package com.athuiru.exer.set;

import org.junit.Test;

import java.util.*;

public class SetTest {
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>(List.of(new Integer[]{1, 2, 2, 1, 3}));
        for (Integer i : duplicateList(list)) {
            System.out.println(i);
        }

    }

    /**
     * 去重
     *
     * @param list 整数列表
     * @return 去重后的列表
     */
    public static List<Integer> duplicateList(List<Integer> list) {
        // 放入HashSet中
        Set<Integer> set = new HashSet<>(list);

        // Set转列表
        return new ArrayList<>(set);
    }

    /**
     * 获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台
     */
    @Test
    public void test2() {
        HashSet<Integer> set = new HashSet<>();

        // 循环生成1-20的随机数，放入Set中，直至Set的大小为10，退出循环
        while (set.size() < 10) {
            int value = (int) (Math.random() * (20 - 1 + 1)) + 1;
            set.add(value);
        }

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
