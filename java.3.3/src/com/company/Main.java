package com.company;

public class Main
{
    public static void main(String[] args)
    {
	// write your code here
        byte b1 = 12;
        byte b2 = -128;
        short s1 = 128;
        int i1 = 1234;
        long l1 = 6666L;
        System.out.println(l1);
        double d1 = 123.4;
        float f1 = 12.3f;
        System.out.println(d1+2);
        System.out.println(f1);
        char c1 ='a';
        System.out.println(c1);
        char c2 = '\n';
        System.out.print("hi bit"+c2);
        boolean isMarried = true;
        if(isMarried)
        {
            System.out.println("你不能参加单身派对");
        }
        else
        {
            System.out.println("你可以参加单身派对");
        }
        System.out.println(b1 + i1);        System.out.println(b1 + i1);
        System.out.println(f1 + i1);
        int n = (int)d1;
        System.out.println(d1);
        //练习1：
        char c ='a';
        int num = 10;
        String str="hello";
        System.out.println(c+num+str);//107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(num+str));//a10hello
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c);//hello10a

        //练习2：
        //*     *
        System.out.println("*   *");
        System.out.println('*'+'\t'+'*');
        System.out.println('*'+"\t"+'*');
        System.out.println('*'+'\t'+"*");
        System.out.println('*'+('\t'+"*"));

        int num1=0b110;
        int num2=110;
        int num3=0127;
        int num4=0x110A;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num3 = "+num3);
        System.out.println("num4 = "+num4);
    }
}