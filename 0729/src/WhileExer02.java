/**
 * 案例4：折纸珠穆朗玛峰
 * 世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度？
 */
public class WhileExer02 {
    public static void main(String[] args) {
        double paper = 0.1;
        double goal = 8848.86 * 1000;

        int count = 0;
        while (paper < goal) {
            paper *= 2;
            count++;
        }

        System.out.println("折叠次数：" + count + "最后的折叠高度：" + paper / 1000 + "米");
    }
}
