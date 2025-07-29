import java.util.Scanner;

public class ScannerExer1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = scanner.next();

        System.out.print("请输入年龄：");
        int age = scanner.nextInt();

        System.out.print("请输入是否已婚（true/false）：");
        boolean isMarried = scanner.nextBoolean();

        System.out.print("请输入性别（男/女）：");
        char gender  = scanner.next().charAt(0);

        System.out.println("姓名：" + name + ", 年龄：" + age + ", 是否已婚：" + isMarried + ", 性别：" + gender);

        scanner.close();
    }
}