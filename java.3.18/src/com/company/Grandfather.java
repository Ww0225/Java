package com.company;
public class Grandfather {
    private String name;
    private int ID;
    private float height;
    private int age;
    Grandfather(String name,int ID,float heihgt,int age) {
        this.name = name;
        this.ID = ID;
        this.height = height;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }
    public void eat()
    {
        System.out.println(getName()+"正在吃饭");
    }
    public void sleep()
    {
        System.out.println(getName()+"正在睡觉");
    }
}
