import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        // 接收命令行两个参数
        Scanner scanner = new Scanner(System.in);

        // 不能输入负数，异常处理
        try {
            System.out.print("请输入数字a（不能为负数）:");
            int a = scanner.nextInt();
            validateNumber(a);

            System.out.print("请输入数字b（不能为负数）:");
            int b = scanner.nextInt();
            validateNumber(b);

            double result = divide(a, b);
            System.out.println(a + "/" + b + "=" + result);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException | BelowZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }


        // 计算两数相除

    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void validateNumber(double number) {
        if (number < 0) {
            throw new BelowZeroException("不能输入负数");
        }
    }
}
