import java.util.Scanner;

/**
 * 案例3：猜数字游戏
 * 随机生成一个100以内的整数，猜这个随机数是多少？
 * 从键盘输入数，如果大了，提示大了，如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
 * 提示：生成一个[a,b］范围的随机数的方式：（int)（Math.random(）＊（b-a+1）+a)
 */
public class WhileExer01 {
    public static void main(String[] args) {
        int target = (int) (Math.random() * 101);

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.print("请猜这个数字是多少（100以内的整数）：");
            int value = scanner.nextInt();
            count++;

            if (value == target) {
                break;
            } else if (value < target) {
                System.out.println("小了");
            } else {
                System.out.println("大了");
            }
        }

        System.out.println("一共猜了" + count + "次");
        scanner.close();
    }
}
