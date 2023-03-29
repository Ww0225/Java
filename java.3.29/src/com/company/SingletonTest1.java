package com.company;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstence();
        Bank bank2 = Bank.getInstence();
        System.out.println(bank1 == bank2);
    }
}
//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank()
    {

    }
    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instence = new Bank();
    //3.提供公共的静态方法，返回类的对象
    public static Bank getInstence()
    {
        return instence;
    }
}
