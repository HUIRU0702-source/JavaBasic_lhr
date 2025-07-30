/**
 * 质数(不包括1)输出（1000以内的）:
 * 只能被1和本身整除
 * 暴力每个数从2开始除，一直到本身-1，如果被非1和本身的数相除了，就continue，下一个
 */
public class zhiNumExer {
    public static void main(String[] args) {
        // 获取初始时间
        long startTime = System.currentTimeMillis();

        boolean flag;

        for (int i = 1; i <= 100000; i++) {

            // 重置flag
            flag = true;

//            for (int j = 2; j < i; j++) {
            // 性能提升
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
            }
        }

        // 获取结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("花费的时间：" + (endTime - startTime) + "毫秒");
    }
}
