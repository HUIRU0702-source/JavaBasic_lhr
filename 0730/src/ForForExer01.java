/**
 * 打印6行：
 * 第一行一个*
 * 第二行两个*
 * 第三行三个*
 * ...
 */
public class ForForExer01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
