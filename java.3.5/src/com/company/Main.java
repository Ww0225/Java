package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a4 = 10;
    int b = --a4;
    System.out.println("a4 = " + a4 +", b = " + b);
    int i1 = 10;
    int i2 =20;
    int i= i1++;
    System.out.println("i="+i);//10
    System.out.println("i1="+i1);//11
    i=++i1;
    System.out.println("i="+i);//12
    System.out.println("i1="+i1);//12
    i=i2--;
    System.out.println("i="+i);//20
    System.out.println("i2="+i2);//19
    i=--i2;
    System.out.println("i="+i);//18
    System.out.println("i2="+i2);//18
    //练习：随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值
    int n = 225;
    System.out.println("百位为:"+ n / 100+" "+"十位为:"+ n /10 % 10 + " "+ "个位为：" +n % 10);
    short s1 =10;
    //s1=s1+2;编译失败
    s1+=2;//不会改变变量本身的数据类型
    System.out.println(s1);
    int i3=1;
    i3*=0.1;
    System.out.println(i3);
    i3++;
    System.out.println(i3);
    int i4=10;
    int j4=20;
    System.out.println(i4==j4);
    System.out.println(i4=j4);

    //区分 & 与 &&
    //相同点1： & 与 && 的运算结果相同
    //相同点2： 当符号左边是true时，二者都会执行符号右边的运算
    //不同点: 当符号左边是false时，&继续执行符号右边的运算，&&不再执行符号右边的运算
    boolean b1 = true;
    b1 = false;
    int n1 = 10;
    if(b1 & (n1++>0))
    {
        System.out.println("我现在在北京");
    }
    else
    {
        System.out.println("我现在在南京");
    }
    System.out.println("n1 = "+n1);
        boolean b2 = true;
        b2 = false;
        int n2 = 10;
        if(b2 && (n2++>0))
        {
            System.out.println("我现在在北京");
        }
        else
        {
            System.out.println("我现在在南京");
        }
        System.out.println("n2 = "+n2);
    //区分 | 与 ||
    //相同点1：| 与 || 的运算结果相同
    //相同点2：当符号左边是false时，二者都会执行符号右边的运算
    //不同点：当符号左边是true时， | 继续执行符号右边的运算，而||不再执行符号右边的运算
    boolean b3 =false;
    int n3 =10;
    if(b3 | (n3++>0))
    {
        System.out.println("我现在在北京");
    }
    else
    {
        System.out.println("我现在在南京");
    }
    System.out.println("n3 = "+n3);
        boolean b4 =false;
        int n4 =10;
        if(b4 | (n3++>0))
        {
            System.out.println("我现在在北京");
        }
        else
        {
            System.out.println("我现在在南京");
        }
        System.out.println("n4 = "+n4);
        //练习：请写出每题的输出结果
        int x=1;
        int y=1;
        if(x++==2 & ++y==2)
        {
            x=7;
        }
        System.out.println("x="+x+",y="+y);
        //练习：交换两个数的值
        int x1=10;
        int x2=20;
        int tmp=0;
        tmp=x1;
        x1=x2;
        x2=tmp;
        System.out.println("x1= "+x1+" x2="+x2);
        x1=x1^x2;
        x2=x1^x2;
        x1=x1^x2;
        System.out.println("x1= "+x1+" x2="+x2);
        int max1=10;
        int max2=20;
        int max3=-20;
        int max=((max1 > max2)?max1:max2)>max3?((max2>max3?max2:max3)):max3;
        System.out.println(max);
        double d1 = 12.3;
        double d2 = 32.1;
        if((d1>10.0)&&(d2<20.0))
        {
            System.out.println(d1+d2);
        }
        else
        {
            System.out.println(d1*d2);
        }
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println("你是否相中我了呢？（true/false）");
        boolean isLove = scan.nextBoolean();
        //对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别：(男/女)");
        String gender = scan.next();
        char genderChar = gender.charAt(0);
    }
}