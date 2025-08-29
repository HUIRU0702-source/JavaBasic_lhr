public class DivisionDemoRefactor {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            int result = divide(m, n);
            System.out.println(m + "/" + n + "=" + result);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException | BelowZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int m, int n) {
        if (m < 0 || n < 0) {
            throw new BelowZeroException("数字不能为负数");
        }

        return m / n;
    }
}
