/**
 * 获取一个四位数的个位，十位，百位，千位
 */
public class ArithmeticExer2 {
    public static void main(String[] args) {
        int num = 1234;

        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 10 /10 % 10;
        int qian = num / 10 /10 /10 % 10;

        System.out.println("个位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);
        System.out.println("千位：" + qian);
    }
}
