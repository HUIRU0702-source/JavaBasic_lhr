public class Size {
    public static void main(String[] args) {
        double pi = Math.PI;

        double radius1 = 1.2;
        double radius2 = 2.5;
        int radius3 = 6;

        double size1 = pi * Math.pow(radius1, 2);
        double size2 = pi * Math.pow(radius2, 2);
        double size3 = pi * Math.pow(radius3, 2);

        System.out.println("圆1的半径为：" + radius1 + ", 面积为：" + size1);
        System.out.println("圆2的半径为：" + radius2 + ", 面积为：" + size2);
        System.out.println("圆3的半径为：" + radius3 + ", 面积为：" + size3);
    }
}
