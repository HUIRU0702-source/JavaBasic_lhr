import org.w3c.dom.ls.LSOutput;

/**
 * 案例：公安局身份登记
 * 要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等
 */
public class StringExercise {
    public static void main(String[] args) {
        String name = "hr";
        int age = 18;
        char gender = '男';
        double weight = 54.6;
        boolean isMarried = true;
        String tell = "88888888";

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("体重：" + weight + "kg");
        System.out.println("婚姻状况：" + isMarried);
        System.out.println("联系方式：" + tell);
    }
}
