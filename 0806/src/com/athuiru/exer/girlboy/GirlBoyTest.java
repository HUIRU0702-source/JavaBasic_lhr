package com.athuiru.exer.girlboy;

public class GirlBoyTest {
    public static void main(String[] args) {
        Girl girl = new Girl("看看", 30);
        Boy boy = new Boy("见见", 22);

        girl.marry(boy);
        boy.shout();

        Girl girl2 = new Girl("云云", 18);
        girl.compare(girl2);
    }
}
