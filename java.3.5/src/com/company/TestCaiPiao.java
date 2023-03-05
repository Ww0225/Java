package com.company;
import java.util.Scanner;
public class TestCaiPiao {
    public static void main(String[] args)
    {
        //1.随机产生一个两位数
        int number = (int)(Math.random()*90+10);
        int numberGe=number%10;
        int numberShi=number/10;
        //2.用户输入一个两位数
        Scanner input= new Scanner(System.in);
        System.out.println("请输入一个两位数:");
        int guess = input.nextInt();
        int guessShi=guess/10;
        int guessGe=guess%10;
        if(number==guess)
        {
            System.out.println("奖金10元");
        }
        else if(numberGe==guessShi && numberShi==guessGe)
        {
            System.out.println("奖金5元");
        }
        else if(numberGe==guessGe || numberShi==guessShi)
        {
            System.out.println("奖金2元");
        }
        else if(numberGe==guessShi || numberShi==guessGe)
        {
            System.out.println("奖金1.5元");
        }
        else
        {
            System.out.println("很遗憾，你没有中奖");
        }
        System.out.println("中奖号码是："+number);
    }
}