/**
 * 案例2：为抵抗洪水，连续作战89小时，编程计算共多少天零多少小时？
 */
public class ArithmeticExer3 {
    public static void main(String[] args) {
        int totalHours = 89;

        int days = totalHours / 24;
        int hours = totalHours % 24;

        System.out.println("89小时即" + days + "天" + hours + "小时");
    }
}
