package com.athuiru.exer;

import org.junit.Test;

public class KmpTest {
    @Test
    public void test1() {
        String s1 = "aaaaaaaaaab";
        String s2 = "aaab";

        System.out.println(search(s1, s2));

    }

    private int search(String s1, String s2) {
        // 暴力搜索
        for (int i = 0; i < s1.length(); i++) {
            int j = 0;
            for (; j < s2.length(); j++) {
                if (i + j < s1.length() && s2.charAt(j) == s1.charAt(i + j)) {
                    continue;
                }

                break;
            }

            if (j == s2.length()) {
                return i;
            }
        }

        return -1;
    }
}
