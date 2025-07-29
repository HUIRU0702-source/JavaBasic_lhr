import java.util.Scanner;

/**
 * 说明：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 * 12的约数：1 2 3 4 6 12
 * 20的约数：1 2 4 5 10 20
 * 12和20的公约数：1 2 4
 * 12的倍数：12 24 36 48...
 * 20的倍数：20 40 60 80...
 */
public class ForExer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入m：");
        int m = scanner.nextInt();
        System.out.print("请输入n：");
        int n = scanner.nextInt();
        scanner.close();

        // 获取最大公约数(循环到两数中较小值)
        int min = m < n ? m : n;

        // 方式一：
        int result1 = 1;
        for (int i = 1; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                result1 = i;
            }
        }
        System.out.println(m + "和" + n + "的最大公约数为" + result1);

        // 方式二 效率更高
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(m + "和" + n + "的最大公约数为" + i);
                break;
            }
        }

        // 最小公倍数
        int max = m > n ? m : n;
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(m + "和" + n + "的最小公倍数为" + i);
                break;
            }
        }
    }
}
