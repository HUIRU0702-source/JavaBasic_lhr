package com.athuiru.exer.enumtest;

public class EnumTest {
    public static void main(String[] args) {
        // 枚举类默认继承Enum类
        // 测试Enum方法toString()，默认返回对象名
        System.out.println(Season.SPRING.toString());

        // name() 返回对象常量的名称
        System.out.println(Season.SUMMER.name());

        // values()静态方法，返回全部常量
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            // 打印调toString方法
            System.out.println(values[i]);
        }

        // valueOf() 返回指定名称的对象，不存在，则抛出异常
        Season object = Season.valueOf("WINTER");
        System.out.println(object);
//        Season object2 = Season.valueOf("WINTER2");
    }
}

enum Season {
    // 1.先定义对象，对象间用逗号分隔
    SPRING("春天", "spring description"),
    SUMMER("夏天", "summer description"),
    AUTUMN("秋天", "autumn description"),
    WINTER("冬天", "winter description");

    private final String seasonName;

    private final String seasonDescription;

    private Season(String seasonName, String seasonDescription) {
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDescription='" + seasonDescription + '\'' +
                '}';
    }
}
