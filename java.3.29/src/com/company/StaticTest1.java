package com.company;

public class StaticTest1 {
    public static void main(String[] args) {

        Chinese.nation = "中国";

        Chinese c1 = new Chinese();
        c1.name = "张三";
        c1.age = 30;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "李四";
        c2.age = 40;
        c2.nation = "CHINA";

        System.out.println(c2.nation);

        //编译不通过
/*
        Chinese.name = "王五;
        Chinese.eat();
*/
        c1.eat();

        Chinese.show();

        c1.show();
    }
}
class Chinese{
    String name;
    int age;
    static String nation;
    public void eat()
    {
        System.out.println("中国人吃中餐");
        //调用非静态结构
        this.info();
        System.out.println(name);
        //调用非静态结构
        walk();
        System.out.println(nation);
    }
    public static void show()
    {
        System.out.println("我是一个中国人!");
        //报错:eat();
        //name = "Tom";
        System.out.println(nation);
        System.out.println(Chinese.nation);
        walk();
    }
    public static void walk()
    {
    }
    public void info()
    {}
}
