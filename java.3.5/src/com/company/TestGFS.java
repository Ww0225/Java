package com.company;
import java.util.Scanner;
public class TestGFS {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的身高：（cm）");
        int height = scan.nextInt();
        System.out.println("请输入你的财富：（千万）");
        double wealth = scan.nextDouble();
        System.out.println("请输入你是否帅：（true/false）");
        boolean isHandsome =scan.nextBoolean();
        if(height>=180 && wealth>1 && isHandsome)
        {
            System.out.println("我一定要嫁给他！！！");
        }
        else if(height>=180 || wealth>1 || isHandsome)
        {
            System.out.println("嫁吧，比上不足，比下有余");
        }
        else
        {
            System.out.println("不嫁！！！");
        }
    }
}
