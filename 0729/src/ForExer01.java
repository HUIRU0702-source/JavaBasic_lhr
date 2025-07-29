/**
 * 遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
 */
public class ForExer01 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }

        System.out.println("1-100以内的偶数，个数:" + count + "， 和：" + sum);
    }
}
