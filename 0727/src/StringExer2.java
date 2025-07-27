/**
 * 练习1：
 * string str1 = 4;//判断对错：
 * string str2= 3.5f + "";//判断str2对错：
 * System.out.println(str2);// 输出：
 * System.out.println(3+4+"Hello!");// 7Hello!
 * System.out.println("Hello!"+3+4);// Hello!34
 * System.out.println('a'+1+"Hello!");// 98Hello!
 * System.out.println("Hello"+'a'+1);// Helloa1
 * System.out.println("*    *"）;
 * System.out.println("*\t*");
 * System.out.println("*"+ "\t"+"+");
 * System.out.println('*'+ "\t"+"*");
 * System.out.println('*'+'\t' + "*");
 * System.out.println('*'+"\t" + '*');
 * System.out.println("*" + '\t' + '*');
 * System.out.println('*' + '\t'+ '*');
 */
public class StringExer2 {
    public static void main(String[] args) {
        String str1 = "4";
        System.out.println("str1 = " + str1);

        String str2 = 3.5f + "";
        System.out.println("str2 = " + str2);

        System.out.println(3 + 4 + "Hello!");// 7Hello!
        System.out.println("Hello!" + 3 + 4);// Hello!34
        System.out.println('a' + 1 + "Hello!");// 98Hello!
        System.out.println("Hello" + 'a' + 1);// Helloa1


        System.out.println("*   *");// *   *
        System.out.println("*\t*");// * *
        System.out.println("*" + "\t" + "*");// *   *
        System.out.println('*' + "\t" + "*");// *   *
        System.out.println('*' + '\t' + "*");// *和\t的ASCII码相加然后和*拼接
        System.out.println('*' + "\t" + '*');// *   *
        System.out.println("*" + '\t' + '*');// *   *
        System.out.println('*' + '\t' + '*');// *和\t和*的ASCII码值相加。char类型数据相加，转换成int
    }
}
