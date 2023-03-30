package com.company;

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person p1 = new Person();
        Person p2 = new Person();
        Person.info();
    }
}
class Person{
    String name;
    int age;
    static String desc = "我是一个人";
    //代码块
    static {
        System.out.println("hello,static,block");
        desc = "我是一个爱学习的人";
        info();
        //eat();
        //name = "Tom";

    }

    {
        System.out.println("hello,block");
        info();
        eat();
        name = "Tom";
    }

    public Person()
    {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat()
    {
        System.out.println("人吃饭");
    }
    public static void info()
    {
        System.out.println("我是一个快乐的人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
