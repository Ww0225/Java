package com.company;
public class Person {
    private int age;
    private String name;

    public void setAge(int age) {
        if(age > 0 && age < 130)
        {
            this.age = age;
        }
        else
        {
            System.out.println("传入的数据非法");
        }
    }
    public Person(String n,int a)
    {
        setName(n);
        setAge(a);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Person()
    {
        age = 18;
    }
}
