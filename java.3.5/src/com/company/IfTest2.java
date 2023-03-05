package com.company;
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args)
    {
        Scanner dog = new Scanner(System.in);
        System.out.println("请输入你家狗的年龄：");
        int age = dog.nextInt();
        if(age<=2)
        {
            System.out.println("此时狗的年龄相当于人类的年龄："+age*10.5);
        }
        else if(age>2)
        {
            System.out.println("此时狗的年龄相当于人类的年龄："+((age-2)*4+(2*10.5)));
        }
        else
        {
            System.out.println("您输入的信息有误");
        }
    }
}