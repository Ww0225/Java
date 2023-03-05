package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int num1 = 12;
        int num2 = 5;
        int result1 = num1/num2;
        System.out.println(result1);//2
        int result2 = num1 / num2 * num2;
        System.out.println(result2);//10
        double result3 = num1 /num2;
        System.out.println(result3);//2.0
        double result4 = num1 / num2 + 0.0;
        System.out.println(result4);//2.0
        double result5 = num1 / (num2 + 0.0);
        System.out.println(result5);//2.4
        double result6 = (double)num1 / num2;
        System.out.println(result6);//2.4
        int mod1 = 12;
        int n1 = 5;
        System.out.println("mod2 % n1 = "+ mod1 % n1);
        int mod2 = -12;
        int n2 = 5;
        System.out.println("mod2 % n2 = "+ mod2 % n2);
        int mod3 = 12;
        int n3 = -5;
        System.out.println("mod3 % n3 = "+ mod3 % n3);
        int mod4 = -12;
        int n4 = -5;
        System.out.println("mod4 % n4 = "+ mod4 % n4);
    }
}