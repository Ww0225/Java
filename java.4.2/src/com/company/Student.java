package com.company;

class Student extends PersonTest1 {
    public Student(){

    }
    public Student(String name,int age)
    {
        super(name,age);
    }
    public void eat()
    {
        System.out.println("学生多吃有营养的食物");
    }

    public void breath() {
        System.out.println("学生应该呼吸新鲜空气");
    }
}
