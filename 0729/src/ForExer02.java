/**
 * 题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等丁其本身
 * 例如：153 =1*1*1 + 3*3*3 + 5*5*5
 */
public class ForExer02 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 100;

            if (i == Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(qian, 3)) {
                System.out.println(i);
            }
        }
    }
}
