/**
 * 使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”
 */
public class SwitchCaseExer01 {
    public static void main(String[] args) {
        // 方式一
        int score = 70;

        char character = Integer.toString(score - 60).charAt(0);

        switch (character) {
            case '-':
                System.out.println("不合格");
                break;
            default:
                System.out.println("合格");
                break;
        }

        // 方式二：体会case穿透
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
            default:
                System.out.println("成绩输入有误！");
                break;
        }

        // 方式三
        switch (score / 60) {
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
            default:
                System.out.println("成绩输入有误！");
                break;
        }
    }
}
