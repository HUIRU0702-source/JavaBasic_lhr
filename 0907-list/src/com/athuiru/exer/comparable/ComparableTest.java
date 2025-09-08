package com.athuiru.exer.comparable;

import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {
    @Test
    public void test1() {
        Item[] items = new Item[5];
        items[0] = new Item("Java基础", 5);
        items[1] = new Item("web开发", 3);
        items[2] = new Item("Redis项目", 4);
        items[3] = new Item("MQ", 4);
        items[4] = new Item("八股", 4);

        Arrays.sort(items);

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
