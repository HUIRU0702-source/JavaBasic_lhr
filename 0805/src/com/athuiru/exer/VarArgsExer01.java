package com.athuiru.exer;

/**
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，
 * 如果没有传入字符串，那么返回空字符串"
 */
public class VarArgsExer01 {
    public static void main(String[] args) {
        VarArgsExer01 exer01 = new VarArgsExer01();
        System.out.println(exer01.concat("/", "hello", "hr", "lala"));
        System.out.println(exer01.concat("/"));
    }

    public String concat(String operator, String... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                result += strs[i];
            } else {
                result += (operator + strs[i]);
            }
        }
        return result;
    }
}
