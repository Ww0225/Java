package com.company;
public class Demo1 {
    public static void main(String[] args) {
        Son son = new Son("张三",101,188.8f,18);
        System.out.println(son.getName()+","+son.getID()+","+son.getHeight()+","+son.getAge());
        son.sleep();
        Father father = new Father("张三之父",1001,188.8f,38);
        father.money();
        Grandfather grandfather = new Grandfather("张三之爷",10001,188.8f,58);
        grandfather.eat();
    }
}
