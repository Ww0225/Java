package com.company;
import java.util.Scanner;
public class IfTest1 {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = scan.nextInt();
        if(num1>=num2)
        {
            if(num2>=num3)
            {
                System.out.println(num3 + ","+num2 + ","+ num1);
            }
            else if(num1<=num3)
            {
                System.out.println(num2 + ","+num1 + ","+ num3);
            }
            else
            {
                System.out.println(num2 + "," +num3 + "," +num1);
            }
        }
        else
        {
            if(num2<=num3)
            {
                System.out.println(num1 + ","+num2 + ","+ num3);
            }
            else if(num1<=num3)
            {
                System.out.println(num1 + ","+num3 + ","+ num2);
            }
            else
            {
                System.out.println(num3 + ","+num1 + ","+ num2);
            }
        }
    }
}