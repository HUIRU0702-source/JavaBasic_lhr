import java.util.Scanner;

/**
 * 案例3：ATM取款
 * 声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 * ====ATM====:
 * 1、存款
 * 2、取款
 * 3、显示余额
 * 4、退出
 * 请选择(1-4)：
 */
public class DoWhileExer01 {
    public static void main(String[] args) {
        double balance = 0;

        // 1. 获取用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("====ATM====:\n" +
                "1、存款\n" +
                "2、取款\n" +
                "3、显示余额\n" +
                "4、退出\n" +
                "请选择(1-4)：");
        int option = scanner.nextInt();

        // 2. 循环，直至用户输入 退出
        while (option != 4) {

            /* 方式一：使用if
            // 3. 如果存款，则获取存款金额，并累加
            if (option == 1) {
                System.out.println("请输入存款金额：");
                double addMoney = scanner.nextDouble();
                balance += addMoney;
            }

            // 4. 如果取款,则校验余额是否够，并减去取款金额
            if (option == 2) {
                double pullMoney = scanner.nextDouble();
                if (balance >= pullMoney) {
                    balance = balance - pullMoney;
                    System.out.println("金额已提取完成，余额为：" + balance);
                } else {
                    System.out.println("余额不足！提款金额：" + pullMoney + "余额：" + balance);
                }
            }

            // 5. 如果显示余额，则输出
            if (option == 3) {
                System.out.println("当前余额为：" + balance);
            }
             */

            // 方式二：使用switch-case
            switch (option) {
                case 1:
                    System.out.println("请输入存款金额：");
                    double addMoney = scanner.nextDouble();
                    if (addMoney > 0) {
                        balance += addMoney;
                    }
                    break;
                case 2:
                    System.out.println("请输入提取金额：");
                    double pullMoney = scanner.nextDouble();
                    if (pullMoney > 0 && balance >= pullMoney) {
                        balance = balance - pullMoney;
                        System.out.println("金额已提取完成，余额为：" + balance);
                    } else {
                        System.out.println("输入有误或者余额不足，提款金额：" + pullMoney + "余额：" + balance);
                    }
                    break;
                case 3:
                    System.out.println("当前余额为：" + balance);
                default:
                    System.out.println("输入有误！");
            }

            System.out.println("====ATM====:\n" +
                    "1、存款\n" +
                    "2、取款\n" +
                    "3、显示余额\n" +
                    "4、退出\n" +
                    "请选择(1-4)：");
            option = scanner.nextInt();
        }

        scanner.close();
    }
}
