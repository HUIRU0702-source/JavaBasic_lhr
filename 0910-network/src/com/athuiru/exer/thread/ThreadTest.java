package com.athuiru.exer.thread;

import org.junit.Test;

public class ThreadTest {
    /*
    创建一个分线程1，用于遍历100以内的偶数
     */
    @Test
    public void test1() {
        SubThread subThread1 = new SubThread();
        subThread1.start();

        SubThread subThread2 = new SubThread();
        subThread2.start();
    }
}

class SubThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
//                System.out.println(Thread.currentThread().getName());
                System.out.println(i);
            }
        }
    }
}
