package com.company;

abstract class PersonTest1 extends Creature{
    String name;
    int age;
    /*public void eat()
    {
        System.out.println("人吃饭");
    }*/
    public void walk()
    {
        System.out.println("人走路");
    }
    public PersonTest1()
    {

    }
    public PersonTest1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
}
