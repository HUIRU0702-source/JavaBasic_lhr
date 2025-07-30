import java.util.Scanner;

/**
 * 案例：从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
 */
public class ForWhileExer01 {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个整数（输入为0时结束程序）：");
            int num = scanner.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                break;
            }
        }

        scanner.close();

        System.out.println("读入的整数个数：" + positiveCount + "， 负数个数：" + negativeCount);
    }
}
