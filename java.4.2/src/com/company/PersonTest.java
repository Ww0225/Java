package com.company;

public class PersonTest {
    public static void main(String[] args) {
        method(new Student());
        Worker worker = new Worker();
        method1(new Worker());
        System.out.println();
        PersonTest1 p = new PersonTest1(){
            public void eat(){
                System.out.println("吃东西");
            }
            public void breath(){
                System.out.println("呼吸");
            }
        };
        method1(p);
    }

    public static void method1(PersonTest1 p)
    {
        p.eat();
        p.walk();
    }
    public static void method(Student s)
    {

    }
}
class Worker extends PersonTest1{
    public void eat(){

    }
    public void breath(){

    }
}