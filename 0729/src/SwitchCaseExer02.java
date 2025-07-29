import java.util.Scanner;

/**
 * 从键盘上输入2023年的"month"和"day”，要求通过程序输出输入的日期为2023年的第几天。
 */
public class SwitchCaseExer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.print("请输入该月第几天：");
        int day = scanner.nextInt();

        int days = day;
        switch (month) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += (2023 % 4 == 0 && 2023 % 400 != 0) || 2023 % 100 == 0 ? 29 : 28;
            case 2:
                days += 31;
        }

        System.out.println("2023年的" + month + "月" + day + "天为2023年的第" + days + "天");

        scanner.close();
    }
}
