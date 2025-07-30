/**
 * 谷粒记账软件
 */
public class GuLiAccount {
    public static void main(String[] args) {

        boolean loopFlag = true;
        int balance = 10000;
        String info = "";

        while (loopFlag) {
            System.out.println("-----------------谷粒记账软件-----------------");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出");
            System.out.print("                   请选择(1-4)：");

            char selection = Utility.readMenuSelection();

            switch (selection) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t\t收支金额\t\t说    明");
                    System.out.println(info);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String desc = Utility.readString();

                    balance += money;
                    info += "收入\t" + balance + "\t\t" + money + "\t\t" + desc + "\n";

                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int pay = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String payDesc = Utility.readString();

                    balance -= pay;
                    info += "支出\t" + balance + "\t\t" + pay + "\t\t" + payDesc + "\n";

                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char confirmSelection = Utility.readConfirmSelection();

                    if ('Y' == confirmSelection) {
                        loopFlag = false;
                    }

                    break;
            }
        }
    }
}
